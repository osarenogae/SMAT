package userInterface;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardInstance;
import careProcess_model.Step;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import careProcess_model.SystemRepository;
import main.Main;
import utilities.DataHelper;

/**
 * The 'Worker' class responsible for the major functional aspects of the
 * {@link #CardPanelSystemEditor} class.
 * <p>
 * In order to separate the functional components of some classes defining
 * complex user interfaces from the implementation code of their GUIs, a
 * "controller / worker" structure was used. In general, the controller class
 * defines the GUI components and describes "when" certain actions should be
 * performed, often with reference to these components. The corresponding worker
 * class contains the methods which actually perform those tasks. Each
 * controller class triggers the required events through an instance of its
 * corresponding worker class.
 */
// TODO This class and the other workers share several methods in common.
// Perhaps these methods should be placed into a common superclass.
public class SystemEditor_Worker {

	// Constants for dialogs and default form contents
	public static final String DEFAULT_NEW_SYSTEM_NAME = "New System ";
	public static final String DIALOG_TITLE_EMPTY_SYSTEM_NAME = "New System...";
	public static final String DIALOG_TEXT_EMPTY_SYSTEM_NAME = "Please enter a system name.";
	public static final String DIALOG_TITLE_BAD_SYSTEM_NAME = "New System...";
	public static final String DIALOG_TEXT_BAD_SYSTEM_NAME = "'" + DEFAULT_NEW_SYSTEM_NAME + "'"
			+ " is not a valid system name. Please do not use the default new system name";

	// Counter for number of new systems
	private int newCounter = 0;

	// We can only create one new system at once.
	private boolean creatingNewSystem = false;
	private boolean creatingNewFunction = false;

	// Externally defined user interface panels
	private PanelSystemTreeExplorer expl;
	private PanelSystemProperties prop;

	public SystemEditor_Worker(PanelSystemTreeExplorer explorer, PanelSystemProperties properties) {
		expl = explorer;
		prop = properties;
	}

	/**
	 * Create a new TableModel that contains the system functions' data.
	 * <p>
	 * The first column is for the function names and the second for their
	 * corresponding descriptions.
	 * 
	 * @param selectedSystem
	 *            The system definition whose functions should fill the table.
	 *            hasNew A boolean indicating whether to include a new blank
	 *            line (true) at the end of the model or not (false).
	 * @return A TableModel instance representing the SystemFunction instances
	 *         associated with a particular system
	 */
	public TableModel getFunctionTableModel(SystemDefinition selectedSystem, boolean hasNew) {
		EList<SystemFunction> systemFunctions = selectedSystem.getSystemFunctions();

		int rows = systemFunctions.size();
		if (hasNew) {
			rows += 1;
		}
		Object[][] tableContent = new Object[rows][2];

		for (int i = 0; i < systemFunctions.size(); i++) {
			SystemFunction currentSystemFunction = systemFunctions.get(i);
			tableContent[i][0] = currentSystemFunction.getFunctionName();
			tableContent[i][1] = currentSystemFunction.getDescription();
		}

		if (hasNew) {
			tableContent[rows - 1][0] = "";
			tableContent[rows - 1][1] = "";
		}

		String[] labels = new String[] { "Function Name", "Description" };
		TableModel m = new DefaultTableModel(tableContent, labels);
		return m;
	}

	/*
	 * =============================================================
	 * 
	 * Component/Data Interaction
	 * 
	 * =============================================================
	 */

	/**
	 * Select a node in the tree by finding the node whose 'user object' is the
	 * given object. The objects in the tree are {@link #SystemDefinition}
	 * instances.
	 * <p>
	 * Warning: No type checks are performed. The method will not fail or notify
	 * when an object of the wrong type is passed as the argument.
	 * 
	 * @param o
	 *            The object (a SystemDefinition) to search for in the tree.
	 */
	public void selectNodeByObject(Object o) {
		DefaultMutableTreeNode root = (DefaultMutableTreeNode) expl.getSystemExplorerTree().getModel().getRoot();
		TreePath t = WorkerUtilities.getNodePathByObject(root, o);
		if (t != null) {
			expl.getSystemExplorerTree().setSelectionPath(t);
			expl.getSystemExplorerTree().scrollPathToVisible(t);
		}
	}

	/**
	 * Fill the tree of system names with all the systems from the given
	 * repository.
	 * 
	 * @param sr
	 */
	public void populateSystemTree(SystemRepository sr) {

		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for (Object s : sr.getSystemDefinitions()) {
			root.add(new DefaultMutableTreeNode(s));
		}
		expl.getSystemExplorerTree().setModel(new DefaultTreeModel(root));

	}

	/**
	 * Update the currently selected system node variable, highlight the
	 * selected node in the tree, load the system data associated with the
	 * SystemDefinition instance identified by that node into the data panel and
	 * load the function table.
	 * 
	 * @param node
	 *            The node in the tree whose user object is the SystemDefinition
	 *            instance currently being viewed
	 */
	private void setSelectedElement(DefaultMutableTreeNode n) {
		selectNodeByObject(n.getUserObject());
	}

	/**
	 * Clear all the fields of the form
	 */
	private void clearForm() {

		// Clear the text fields
		prop.getSystemNameTextField().setText("");
		prop.getSystemVersionTextField().setText("");

		// Clear the functions table
		prop.getFunctionsTable().setModel(new DefaultTableModel());

	}

	/**
	 * Reset the creating new system/function flags to the default state.
	 */
	public void reset() {

		creatingNewSystem = false;
		creatingNewFunction = false;
	}

	/**
	 * Try to change the selected element of the tree. The current
	 * implementation always allows this to happen.
	 * 
	 * @param newNode
	 *            The node of the tree to be selected.
	 * @return true
	 */
	public boolean tryChangeEditing(DefaultMutableTreeNode newNode) {

		if (newNode != null) {
			setSelectedElement(newNode);
		}
		return true;
	}

	/**
	 * Try to create a new system definition. This will be allowed exactly when
	 * no new, uncommited system definition is being made.
	 * 
	 * @return true if creation of a new system definition was allowed. False
	 *         otherwise.
	 */
	public boolean tryAddNewSystem() {
		if (!creatingNewSystem) {
			// Blank the form contents
			clearForm();

			// Make a new SystemDefinition instance
			SystemDefinition s = CareProcess_modelFactory.eINSTANCE.createSystemDefinition();
			s.setSystemName(DEFAULT_NEW_SYSTEM_NAME + Integer.toString(newCounter));
			newCounter++;

			// Make a new tree node containing the SystemDefinition instance and
			// add it to the new tree model
			DefaultMutableTreeNode n = new DefaultMutableTreeNode(s);
			DefaultMutableTreeNode root = ((DefaultMutableTreeNode) expl.getSystemExplorerTree().getModel().getRoot());
			root.add(n);

			// Set the new model as the tree's model
			expl.getSystemExplorerTree().setModel(new DefaultTreeModel(root));

			// Select the new node in the tree
			selectNodeByObject(n.getUserObject());

			// Focus the input on the name text field and highlight its contents
			prop.getSystemNameTextField().grabFocus();
			prop.getSystemNameTextField().selectAll();

			creatingNewSystem = true;
			return true;
		}
		return false;
	}

	/**
	 * Remove references to the given SystemDefinition from all other data
	 * object that depend upon it. Also remove it from the SystemRepository, so
	 * it will no longer be saved.
	 * 
	 * @param sd
	 *            The system definition to be removed
	 * @param sr
	 *            The SystemRepository for the current project
	 */
	public void removeSystem(SystemDefinition sd, SystemRepository sr) {
		sr.getSystemDefinitions().remove(sd);

		ArrayList<HazardInstance> hazardInstanceRemovalList = new ArrayList<HazardInstance>();
		ArrayList<Object[]> stepRemovalList = new ArrayList<Object[]>();

		Iterator<SystemFunction> systemFunctionsIterator = sd.getSystemFunctions().iterator();
		while (systemFunctionsIterator.hasNext()) {
			SystemFunction sf = systemFunctionsIterator.next();
			// Remove each function from the appropriate hazard instances
			Iterator<HazardInstance> hazardInstancesIterator = sf.getHazardInstances().iterator();
			while (hazardInstancesIterator.hasNext()) {
				HazardInstance hi = hazardInstancesIterator.next();
				hazardInstanceRemovalList.add(hi);
			}
			// Remove each function from the appropriate steps
			Iterator<Step> stepsIterator = sf.getAssociatedSteps().iterator();
			while (stepsIterator.hasNext()) {
				Step s = stepsIterator.next();
				stepRemovalList.add(new Object[] { s, sf });
			}
		}

		// Remove the system functions from the relevant hazard instances.
		for (HazardInstance h : hazardInstanceRemovalList) {
			h.setSystemFunction(null);
		}
		// Remove the system functions from the relevant steps.
		for (Object[] o : stepRemovalList) {
			((Step) o[0]).getAssociatedSystemFunctions().remove((SystemFunction) o[1]);
		}

		EcoreUtil.delete(sd);
		clearForm();
		reset();
		populateSystemTree(sr);
	}

	/**
	 * Try to create a new system function. Only allowed when not already
	 * creating a new system function.
	 * 
	 * @param parentSystem
	 * @return true if creating a new function was allowed. False otherwise.
	 */
	public boolean tryAddNewSystemFunction(SystemDefinition parentSystem) {
		if (!creatingNewFunction) {
			creatingNewFunction = true;
			JTable table = prop.getFunctionsTable();
			table.setModel(getFunctionTableModel(parentSystem, true));
			table.changeSelection(table.getRowCount() - 1, 0, false, false);
		}
		return true;
	}

	/**
	 * Create or update the SystemFunction instance corresponding to the entry
	 * in the functions table at the given row index.
	 * 
	 * @param row
	 *            The row of the system function table whose corresponding
	 *            system function should be updated.
	 * @param parentSystem
	 *            The SystemDefinition instance that will be the parent of the
	 *            new system function, or that already is the parent of an
	 *            existing one.
	 */
	public void updateFunctionDefinition(int row, SystemDefinition parentSystem) {
		EList<SystemFunction> systemFunctions = parentSystem.getSystemFunctions();
		JTable table = prop.getFunctionsTable();
		if (row != -1) {
			String newName = (String) table.getModel().getValueAt(row, 0);
			String newDescription = (String) table.getModel().getValueAt(row, 1);
			if (!DataHelper.isStringEmpty(newName)) {
				SystemFunction f;
				if (!creatingNewFunction) {
					f = parentSystem.getSystemFunctions().get(row);
				} else {
					f = CareProcess_modelFactory.eINSTANCE.createSystemFunction();
				}
				f.setSystemDefinition(parentSystem);
				f.setFunctionName(newName);
				f.setDescription(newDescription);

				table.clearSelection();
			}
			table.setModel(getFunctionTableModel(parentSystem, false));
			creatingNewFunction = false;
		}
	}

	/**
	 * Check to see whether the user input matches certain rules about how the
	 * SystemDefinition parameters should be. Show an appropriate warning dialog
	 * and return false if not.
	 * 
	 * @return true if the input data is valid, false otherwise
	 */
	private boolean validateSystemDefinition(Component dialogParent, SystemRepository r,
			SystemDefinition currentSystem) {
		String name = prop.getSystemNameTextField().getText();
		if (name.equals(DEFAULT_NEW_SYSTEM_NAME)) {
			WorkerUtilities.showWarningDialog(DIALOG_TITLE_BAD_SYSTEM_NAME, DIALOG_TEXT_BAD_SYSTEM_NAME, dialogParent);
			return false;
		}
		if (DataHelper.isStringEmpty(name)) {
			WorkerUtilities.showWarningDialog(DIALOG_TITLE_EMPTY_SYSTEM_NAME, DIALOG_TEXT_EMPTY_SYSTEM_NAME,
					dialogParent);
			return false;
		}
		if (DataHelper.checkForSameSystemName(r, prop.getSystemNameTextField().getText(), currentSystem)) {
			WorkerUtilities.showWarningDialog(DialogContent.DUPLICATE_SYSTEM_SAVE_DIALOG_TITLE,
					DialogContent.DUPLICATE_SYSTEM_SAVE_DIALOG_MESSAGE, dialogParent);
			return false;
		}
		return true;
	}

	/**
	 * Remove the system function at the given index in the given
	 * SystemDefinition's list of system functions. The removal ensures that the
	 * instance is removed from all other elements of the data model instance
	 * that may refer to it.
	 * 
	 * @param sd
	 * @param index
	 */
	public void removeSystemFunctionByIndex(SystemDefinition sd, int index) {
		if (index != -1 && index < sd.getSystemFunctions().size()) {
			SystemFunction sf = sd.getSystemFunctions().get(index);
			WorkerUtilities.removeSystemFunction(sf);
			
		}
	}
	
	
	/*
	 * =============================================================
	 * 
	 * Conditions
	 * 
	 * =============================================================
	 */

	/**
	 * Checks whether the user has input data which has not yet been saved. This
	 * method could be used for prompting the user to save on exit.
	 * 
	 * @return true if there is unsaved user data in the form, false otherwise.
	 */
	private boolean isDataChanged(DefaultMutableTreeNode node) {

		SystemDefinition s = (SystemDefinition) node.getUserObject();

		if (!prop.getSystemNameTextField().getText().equals(s.getSystemName())) {
			return true;
		}
		if (!prop.getSystemVersionTextField().getText().equals(s.getSystemVersion())) {
			return true;
		}
		return false;
	}

	public boolean isCreatingNewItem() {
		if (creatingNewSystem || creatingNewFunction) {
			return true;
		}
		return false;
	}

	/*
	 * =============================================================
	 * 
	 * Saving and Loading Data
	 * 
	 * =============================================================
	 */

	/**
	 * Load any existing data from the given {@link #SystemDefinition} instance
	 * into the appropriate text components.
	 * 
	 * @param s
	 *            The SystemDefinition instance whose data should be used.
	 */
	public void loadSystemDefinition(SystemDefinition s) {
		prop.getSystemNameTextField().setText(s.getSystemName());
		prop.getSystemVersionTextField().setText(s.getSystemVersion());
		prop.getDescriptionTextArea().setText(s.getSystemDescription());
	}

	/**
	 * Fill the table of system functions with the functions associated with the
	 * given {@link #SystemDefinition} instance.
	 * 
	 * @param s
	 *            The SystemDefinition instance whose functions should be used.
	 */
	public void loadFunctions(SystemDefinition s) {
		prop.getFunctionsTable().setModel(getFunctionTableModel(s, false));
	}

	/**
	 * Attempt to store the data from the GUI components in the given
	 * SystemDefinition instance and add it to the collection of all
	 * SystemDefinitions.
	 * 
	 * @param s
	 *            The system definition in which to store the data.
	 * @param r
	 *            The repositiory of all system definitions. Part of the
	 *            datastore of the project.
	 * @param dialogParent
	 *            If the system definition is not valid, a dialog will be shown.
	 *            This parameter is the component that will be the parent of
	 *            that dialog.
	 * @return
	 */
	public boolean trySaveSystemDefinition(SystemDefinition s, SystemRepository r, Component dialogParent) {
		if (s != null) {
			s.setSystemName(prop.getSystemNameTextField().getText());
			s.setSystemVersion(prop.getSystemVersionTextField().getText());
			s.setSystemDescription(prop.getDescriptionTextArea().getText());
			r.getSystemDefinitions().add(s);

			populateSystemTree(r);

			creatingNewSystem = false;

			selectNodeByObject(s);

			return validateSystemDefinition(dialogParent, r, s);
		}
		return true;
	}

}
