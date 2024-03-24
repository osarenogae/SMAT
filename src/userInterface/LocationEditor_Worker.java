package userInterface;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.eclipse.emf.ecore.util.EcoreUtil;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.LocationDefinition;
import careProcess_model.LocationRepository;
import careProcess_model.Step;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemRepository;
import utilities.DataHelper;

/**
 * The 'Worker' class responsible for the major functional aspects of the
 * {@link #CardPanelLocationEditor} class.
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
public class LocationEditor_Worker {

	// Constants for dialogs and default form contents
	public static final String DEFAULT_NEW_LOCATION_NAME = "New Care Setting";

	private Boolean creatingNewLocation = false;

	CardPanelCareSettingEditor editor;
	PanelLocationTreeExplorer expl;
	PanelLocationProperties prop;

	public LocationEditor_Worker(CardPanelCareSettingEditor fullEditor, PanelLocationTreeExplorer explorer,
			PanelLocationProperties properties) {
		editor = fullEditor;
		expl = explorer;
		prop = properties;
	}


	/**
	 * Load any existing data from the given {@link #LocationDefinition}
	 * instance into the appropriate text components.
	 * 
	 * @param loc
	 *            The LocationDefinition instance whose data should be used.
	 */
	public void loadLocationDefinition(LocationDefinition loc) {
		prop.getLocationNameTextField().setText(loc.getLocationName());
		prop.getDescriptionTextArea().setText(loc.getDescription());
	}

	/**
	 * Select a node in the tree by finding the node whose 'user object' is the
	 * given object. The objects in the tree are {@link #LocationDefinition}
	 * instances.
	 * <p>
	 * Warning: No type checks are performed. The method will not fail or notify
	 * when an object of the wrong type is passed as the argument.
	 * 
	 * @param o
	 *            The object (a LocationDefinition) to search for in the tree.
	 */
	public void selectNodeByObject(Object o) {
		DefaultMutableTreeNode root = (DefaultMutableTreeNode) expl.getLocationExplorerTree().getModel().getRoot();
		TreePath t = WorkerUtilities.getNodePathByObject(root, o);
		if (t != null) {
			expl.getLocationExplorerTree().setSelectionPath(t);
			expl.getLocationExplorerTree().scrollPathToVisible(t);
		}
	}

	/**
	 * Reset the creating new location flags to the default state and clear the
	 * form contents.
	 */
	public void reset() {

		creatingNewLocation = false;
		clearForm();
	}

	/**
	 * Clear the form contents.
	 */
	private void clearForm() {

		// Clear the text fields
		prop.getLocationNameTextField().setText("");
		prop.getDescriptionTextArea().setText("");

	}

	/**
	 * Try to create a new location definition. This will be allowed exactly
	 * when no new, uncommited location definition is being made.
	 * 
	 * @return true if creation of a new location definition was allowed. False
	 *         otherwise.
	 */
	public boolean tryAddNewLocation() {
		if (!creatingNewLocation) {
			// Blank the form contents
			clearForm();

			// Make a new LocationDefinition instance
			LocationDefinition loc = CareProcess_modelFactory.eINSTANCE.createLocationDefinition();
			loc.setLocationName(DEFAULT_NEW_LOCATION_NAME);

			// Make a new tree node containing the LocationDefinition instance
			// and
			// add it to the new tree model
			DefaultMutableTreeNode n = new DefaultMutableTreeNode(loc);
			DefaultMutableTreeNode root = ((DefaultMutableTreeNode) expl.getLocationExplorerTree().getModel()
					.getRoot());
			root.add(n);

			// Set the new model as the tree's model
			expl.getLocationExplorerTree().setModel(new DefaultTreeModel(root));

			// Select the new node in the tree
			selectNodeByObject(n.getUserObject());

			// Focus the input on the name text field and highlight its contents
			prop.getLocationNameTextField().grabFocus();
			prop.getLocationNameTextField().selectAll();

			creatingNewLocation = true;
			return true;
		}
		return false;
	}

	/**
	 * Remove references to the given LocationDefinition from all other data
	 * objects that depend upon it. Also remove it from the LocationRepository,
	 * so it will no longer be saved.
	 * 
	 * @param ld
	 *            The location definition to be removed
	 * @param lr
	 *            The LocationRepository for the current project
	 */
	public void removeLocationDefinition(LocationDefinition ld, LocationRepository lr) {
		lr.getLocationDefinitions().remove(ld);

		ArrayList<Step> stepRemovalList = new ArrayList<Step>();

		Iterator<Step> stepsIterator = ld.getSteps().iterator();
		while (stepsIterator.hasNext()) {
			Step s = stepsIterator.next();
			stepRemovalList.add(s);
		}

		for (Step step : stepRemovalList) {
			step.setLocation(null);
		}

		EcoreUtil.delete(ld);
		reset();
		populateLocationTree(lr);
	}

	/**
	 * Attempt to store the data from the GUI components in the given
	 * LocationDefinition instance and add it to the collection of all
	 * LocationDefinitions.
	 * 
	 * @param loc
	 *            The location definition in which to store the data.
	 * @param r
	 *            The repositiory of all location definitions. Part of the
	 *            datastore of the project.
	 * @return
	 */
	public boolean trySaveLocationDefinition(LocationDefinition loc, LocationRepository r) {
		if (loc != null) {
			if (!DataHelper.checkForSameLocationName(r, prop.getLocationNameTextField().getText(), loc)) {
				loc.setLocationName(prop.getLocationNameTextField().getText());
				loc.setDescription(prop.getDescriptionTextArea().getText());
				r.getLocationDefinitions().add(loc);

				populateLocationTree(r);

				creatingNewLocation = false;

				selectNodeByObject(loc);

				return true;
			}
			return false;
		}
		return true;

	}

	/**
	 * Fill the location tree with all the locations from the given location
	 * repository.
	 * 
	 * @param lr
	 */
	public void populateLocationTree(LocationRepository lr) {

		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for (Object loc : lr.getLocationDefinitions()) {
			root.add(new DefaultMutableTreeNode(loc));
		}
		expl.getLocationExplorerTree().setModel(new DefaultTreeModel(root));
		reset();
	}

	/**
	 * Update the currently selected location node variable, highlight the
	 * selected node in the tree, load the location data associated with the
	 * LocationDefinition instance identified by that node into the data panel.
	 * 
	 * @param node
	 *            The node in the tree whose user object is the
	 *            LocationDefinition instance currently being viewed
	 */
	private void setSelectedElement(DefaultMutableTreeNode n) {
		selectNodeByObject(n.getUserObject());
	}

	public boolean tryChangeEditing(DefaultMutableTreeNode newNode) {

		if (newNode != null) {
			setSelectedElement(newNode);
		}
		return true;
	}

	/**
	 * Show a warning dialog with the given title and message.
	 * 
	 * @param title
	 * @param message
	 */
	public void showWarningDialog(String title, String message) {
		JOptionPane.showMessageDialog(editor, message, title, JOptionPane.WARNING_MESSAGE);
	}

	public boolean isCreatingNewLocation() {
		return creatingNewLocation;
	}

}
