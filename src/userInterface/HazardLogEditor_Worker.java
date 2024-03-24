package userInterface;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.eclipse.emf.ecore.util.EcoreUtil;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
import careProcess_model.HazardRepository;
import careProcess_model.LocationDefinition;
import careProcess_model.LocationRepository;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
import dialogs.FunctionalHazardDefinitionDialog;
import dialogs.NewLocationDialog;
import guiComponents.HazardInstanceTableModel;
import utilities.DataHelper;

/**
 * The 'Worker' class responsible for the major functional aspects of the
 * {@link #CardPanelHazardLogEditor} class.
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
public class HazardLogEditor_Worker {

	// Constants for dialogs and default form contents
	public static final String DEFAULT_NEW_HAZARD_NAME = "New Hazard";

	private Boolean creatingNewHazard = false;
	private HazardDefinition currentHazard;
	private HazardInstance currentHazardInstance;

	CardPanelHazardLogEditor editor;
	PanelHazardTreeExplorer expl;
	PanelHazardDefinition defPanel;

	JTextField nameTextField;
	JTextArea descriptionTextArea;
	JTextField systemFunctionTextField;
	JButton systemFunctionButton;

	JButton addCauseButton;
	JButton removeCauseButton;

	JList causeList;
	JTextArea impactTextArea;
	JTable riskTable;
	JTextField statusTextField;

	public HazardLogEditor_Worker(CardPanelHazardLogEditor fullEditor, PanelHazardTreeExplorer explorer,
			PanelHazardDefinition hazardDefinitionPanel) {
		editor = fullEditor;
		expl = explorer;
		defPanel = hazardDefinitionPanel;

		nameTextField = defPanel.getHazardNameTextField();
		descriptionTextArea = defPanel.getHazardDescriptionTextArea();
	}

	/**
	 * Show the dialog for creating a new HazardInstance.
	 * 
	 * @param editMode
	 *            boolean to indicate whether the dialog should be in "edit
	 *            mode" to edit existing data or "new mode" to create a new
	 *            hazard instance.
	 * @param fixedHazardType
	 *            If this is non-null, the hazard type in the dialog will be
	 *            fixed at its value.
	 * @param fixedSystemFunction
	 *            If this is non-null, the system function in the dialog will be
	 *            fixed at its value.
	 * @param fixedStep
	 *            If this is non-null, the care process step in the dialog will
	 *            be fixed at its value.
	 * @param parentPanel
	 *            The parent component of the dialog
	 * @param inputHazardInstance
	 *            The instance of HazardInstance to be modified by the dialog.
	 */
	public void showAddFunctionalHazardDialog(Boolean editMode, HazardDefinition fixedHazardType,
			SystemFunction fixedSystemFunction, Step fixedStep, DialogParentPanel parentPanel,
			HazardInstance inputHazardInstance) {
		FunctionalHazardDefinitionDialog d = new FunctionalHazardDefinitionDialog(editMode, fixedHazardType,
				fixedSystemFunction, fixedStep, inputHazardInstance, parentPanel);
		d.pack();
		d.setVisible(true);
	}

	/**
	 * @return The currently selected HazardDefinition instance.
	 */
	public HazardDefinition getCurrentHazardDefinition() {
		return currentHazard;
	}

	/**
	 * 
	 * @return The currently selected HazardInstance instance.
	 */
	public HazardInstance getCurrentHazardInstance() {
		return currentHazardInstance;
	}

	/**
	 * Set the currently selected hazard instance to the given value. Note:
	 * internal variable only. Does not select the instance in the tree.
	 * 
	 * @param hi
	 */
	public void setCurrentHazardInstance(HazardInstance hi) {
		currentHazardInstance = hi;
	}

	/**
	 * Load any existing data from the given {@link #HazardDefinition} instance
	 * into the appropriate text components.
	 * 
	 * @param h
	 *            The HazardDefinition instance whose data should be used.
	 */
	public void loadHazardDefinition(HazardDefinition h) {
		nameTextField.setText(h.getHazardName());
		descriptionTextArea.setText(h.getDescription());
		defPanel.getHazardInstanceTable().setModel(getHazardInstanceTableModel(h));
	}

	/**
	 * Create and return the table model containing all the hazard instances
	 * associated with the given hazard definition. This can be used to populate
	 * the navigator table of hazard instances.
	 * 
	 * @param haz
	 *            The hazard definition whose hazard instances should be in the
	 *            list.
	 * @return The generated HazardInstanceTableModel
	 */
	private HazardInstanceTableModel getHazardInstanceTableModel(HazardDefinition haz) {
		Object[] labels = new Object[5];
		Object[][] data = new Object[haz.getHazardInstances().size()][5];
		Iterator<HazardInstance> hazardInstances = haz.getHazardInstances().iterator();

		labels[0] = "Name";
		labels[1] = "System Function";
		labels[2] = "Care Process Step";
		labels[3] = "Initial Risk Rating";
		labels[4] = "Residual Risk Rating";

		int row = 0;
		while (hazardInstances.hasNext()) {
			HazardInstance currentInstance = hazardInstances.next();
			data[row][0] = currentInstance.getName();
			if (currentInstance.getSystemFunction() != null) {
				data[row][1] = currentInstance.getSystemFunction().getFunctionName();
			}
			if (currentInstance.getStep() != null) {
				if (!currentInstance.getStep().isHidden()) {
					data[row][2] = currentInstance.getStep().getName();
				}
			}
			data[row][3] = currentInstance.getInitialRiskRating();
			data[row][4] = currentInstance.getResidualRiskRating();
			row++;
		}
		return new HazardInstanceTableModel(data, labels);
	}

	/**
	 * Select the given hazard definition in its explorer.
	 * 
	 * @param o
	 *            The hazard definition to be selected.
	 */
	public void selectHazardDefinitionNodeByObject(Object o) {
		DefaultMutableTreeNode root = (DefaultMutableTreeNode) expl.getHazardExplorerTree().getModel().getRoot();
		TreePath t = WorkerUtilities.getNodePathByObject(root, o);
		if (t != null) {
			expl.getHazardExplorerTree().setSelectionPath(t);
			expl.getHazardExplorerTree().scrollPathToVisible(t);
		}
	}

	/**
	 * Select the given hazard instance in the table
	 * 
	 * @param hi
	 */
	public void selectHazardInstanceByObject(HazardInstance hi) {
		JTable hazardInstanceTable = defPanel.getHazardInstanceTable();
		hazardInstanceTable.changeSelection(hi.getHazardDefinition().getHazardInstances().indexOf(hi), 0, false, false);
	}

	/**
	 * Reset the creating new hazard flag and clear the form of data.
	 */
	public void reset() {
		creatingNewHazard = false;
		clearForm();
	}

	/**
	 * Blank all the fields of the form.
	 */
	private void clearForm() {
		// Clear the text fields
		defPanel.getHazardNameTextField().setText("");
		defPanel.getHazardDescriptionTextArea().setText("");
		defPanel.getHazardInstanceTable().setModel(new HazardInstanceTableModel(null, null));

	}

	/**
	 * Attempt to add a new hazard definition. This is only allowed if a new
	 * definition is not currently being added.
	 * 
	 * @return true if allowed. False otherwise.
	 */
	public boolean tryAddNewHazard() {
		if (!creatingNewHazard) {
			// Blank the form contents
			clearForm();

			// Make a new HazardDefinition
			HazardDefinition haz = CareProcess_modelFactory.eINSTANCE.createHazardDefinition();
			haz.setHazardName(DEFAULT_NEW_HAZARD_NAME);

			// Make a new tree node containing the HazardDefinition
			// and add it to the new tree model
			DefaultMutableTreeNode n = new DefaultMutableTreeNode(haz);
			DefaultMutableTreeNode root = ((DefaultMutableTreeNode) expl.getHazardExplorerTree().getModel().getRoot());
			root.add(n);

			// Set the new model as the tree's model
			expl.getHazardExplorerTree().setModel(new DefaultTreeModel(root));

			// Select the new node in the tree
			selectHazardDefinitionNodeByObject(n.getUserObject());

			// Focus the input on the name text field and highlight its contents
			defPanel.getHazardNameTextField().grabFocus();
			defPanel.getHazardNameTextField().selectAll();

			creatingNewHazard = true;
			return true;
		}
		return false;
	}

	/**
	 * Attempt to save the given hazard definition to the repository. Only
	 * possible if the hazard has a unique name.
	 * 
	 * @param haz
	 *            The hazard definition to save.
	 * @param r
	 *            The hazard repository into which the hazard definition should
	 *            be saved.
	 * @return true if the save was possible. False otherwise.
	 */
	public boolean trySaveHazardDefinition(HazardDefinition haz, HazardRepository r) {
		if (haz != null) {
			if (haz.getHazardName().equals(defPanel.getHazardNameTextField().getText())
					&& !DataHelper.checkForSameHazardName(r, defPanel.getHazardNameTextField().getText(), haz)) {
				saveHazardDefinition(haz, r);
				return true;
			}
			if (!DataHelper.checkForSameHazardName(r, defPanel.getHazardNameTextField().getText(), haz)) {
				saveHazardDefinition(haz, r);
				return true;
			}
			return false;
		}
		return true;
	}

	/**
	 * Directly store the given hazard definition in the given hazard repository
	 * (without validation).
	 * 
	 * @param haz
	 * @param r
	 */
	private void saveHazardDefinition(HazardDefinition haz, HazardRepository r) {
		haz.setHazardName(defPanel.getHazardNameTextField().getText());
		haz.setDescription(defPanel.getHazardDescriptionTextArea().getText());
		r.getHazardDefinitions().add(haz);

		populateHazardTree(r);

		creatingNewHazard = false;

		selectHazardDefinitionNodeByObject(haz);
	}

	/**
	 * Update the currently selected location node variable, highlight the
	 * selected node in the tree, load the location data associated with the
	 * HazardDefinition instance identified by that node into the data panel.
	 * 
	 * @param node
	 *            The node in the tree whose user object is the HazardDefinition
	 *            instance currently being viewed
	 */
	private void setSelectedElement(DefaultMutableTreeNode n) {
		selectHazardDefinitionNodeByObject(n.getUserObject());
	}

	public boolean tryChangeEditing(DefaultMutableTreeNode newNode) {

		if (newNode != null) {
			setSelectedElement(newNode);
		}
		return true;
	}

	/**
	 * Fill the hazard definition tree with allt he hazards from the given
	 * repository.
	 * 
	 * @param hr
	 */
	public void populateHazardTree(HazardRepository hr) {

		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for (Object loc : hr.getHazardDefinitions()) {
			root.add(new DefaultMutableTreeNode(loc));
		}
		expl.getHazardExplorerTree().setModel(new DefaultTreeModel(root));
		reset();
	}

	
	/**
	 * Remove the hazard definition from the repository.
	 * 
	 * @param hd
	 * @param hr
	 */
	public static void removeHazardDefinition(HazardDefinition hd, HazardRepository hr) {
		ArrayList<HazardInstance> instanceRemovalList = new ArrayList<HazardInstance>();

		Iterator<HazardInstance> hazardInstanceIterator = hd.getHazardInstances().iterator();
		while (hazardInstanceIterator.hasNext()) {
			HazardInstance h = hazardInstanceIterator.next();
			instanceRemovalList.add(h);
		}

		for (HazardInstance h : instanceRemovalList) {
			WorkerUtilities.removeHazardInstance(hd, h, hr);
		}

		hr.getHazardDefinitions().remove(hd);
		EcoreUtil.delete(hd);
	}

	/**
	 * Set the current hazard instance to the one with the given index in the
	 * list of all hazard instances associated with the given hazard definition.
	 * 
	 * @param hd
	 * @param id
	 */
	public void setCurrentHazardInstanceByIndex(HazardDefinition hd, int id) {
		currentHazardInstance = hd.getHazardInstances().get(id);
	}

	/**
	 * 
	 * @return whether a new hazard is being created or not.
	 */
	public boolean isCreatingNewHazard() {
		return creatingNewHazard;
	}
}
