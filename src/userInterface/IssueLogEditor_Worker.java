package userInterface;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.eclipse.emf.ecore.util.EcoreUtil;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
import careProcess_model.HazardRepository;
import careProcess_model.IssueDefinition;
import careProcess_model.ReportData;
import utilities.DataHelper;

public class IssueLogEditor_Worker {
	
	public static final String DEFAULT_NEW_ISSUE_NAME = "New Issue";

	private Boolean creatingNewIssue = false;
	
	CardPanelIssueLogEditor editor;
	PanelIssueTreeExplorer expl;
	PanelIssueDefinition defPanel;
	
	JTextField nameTextField;
	JTextArea descriptionTextArea;
	
	public IssueLogEditor_Worker(CardPanelIssueLogEditor fullEditor, PanelIssueTreeExplorer explorer,
			PanelIssueDefinition issueDefinitionPanel) {
		editor = fullEditor;
		expl = explorer;
		defPanel = issueDefinitionPanel;

		nameTextField = defPanel.getIssueNameTextField();
		descriptionTextArea = defPanel.getIssueDescriptionTextArea();
	}
	
	/*
	 * =============================================================
	 * 
	 * Loading Data into the Components
	 * 
	 * =============================================================
	 */
	
	/**
	 * Put the data from the given issue definition into the editor fields
	 * @param i
	 */
	public void loadIssueDefinition(IssueDefinition i) {
		nameTextField.setText(i.getIssueName());
		descriptionTextArea.setText(i.getIssueDescription());
	}

/**
 * Fill the issue definition tree with values
 * @param rd
 */
	public void populateIssueTree(ReportData rd) {

		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for (Object issue : rd.getIssueDefinitions()) {
			root.add(new DefaultMutableTreeNode(issue));
		}
		expl.getIssueExplorerTree().setModel(new DefaultTreeModel(root));
		reset();
	}
	
	/**
	 *Select the given issue definition in the tree.
	 * @param o
	 */
	public void selectIssueDefinitionNodeByObject(Object o) {
		DefaultMutableTreeNode root = (DefaultMutableTreeNode) expl.getIssueExplorerTree().getModel().getRoot();
		TreePath t = WorkerUtilities.getNodePathByObject(root, o);
		if (t != null) {
			expl.getIssueExplorerTree().setSelectionPath(t);
			expl.getIssueExplorerTree().scrollPathToVisible(t);
		}
	}
	
	/**
	 * Delete the given issue definition from the report data instance.
	 * @param i
	 * @param rd
	 */
	public void removeIssueDefinition(IssueDefinition i, ReportData rd) {
		rd.getIssueDefinitions().remove(i);
		EcoreUtil.delete(i);
	}
	
	
	public boolean tryAddNewIssue() {
		if (!creatingNewIssue) {
			// Blank the form contents
			clearForm();

			// Make a new HazardDefinition
			IssueDefinition issue = CareProcess_modelFactory.eINSTANCE.createIssueDefinition();
			issue.setIssueName(DEFAULT_NEW_ISSUE_NAME);

			// Make a new tree node containing the HazardDefinition
			// and add it to the new tree model
			DefaultMutableTreeNode n = new DefaultMutableTreeNode(issue);
			DefaultMutableTreeNode root = ((DefaultMutableTreeNode) expl.getIssueExplorerTree().getModel().getRoot());
			root.add(n);

			// Set the new model as the tree's model
			expl.getIssueExplorerTree().setModel(new DefaultTreeModel(root));

			// Select the new node in the tree
			selectIssueDefinitionNodeByObject(n.getUserObject());

			// Focus the input on the name text field and highlight its contents
			defPanel.getIssueNameTextField().grabFocus();
			defPanel.getIssueNameTextField().selectAll();

			creatingNewIssue = true;
			return true;
		}
		return false;
	}

	public void saveIssueDefinition(IssueDefinition issue, ReportData rd){
		issue.setIssueName(defPanel.getIssueNameTextField().getText());
		issue.setIssueDescription(defPanel.getIssueDescriptionTextArea().getText());
		rd.getIssueDefinitions().add(issue);

		populateIssueTree(rd);

		creatingNewIssue = false;

		selectIssueDefinitionNodeByObject(issue);
	}
	
	
	/**
	 * Update the currently selected location node variable, highlight the
	 * selected node in the tree, load the location data associated with the
	 * IssueDefinition instance identified by that node into the data panel.
	 * 
	 * @param node
	 *            The node in the tree whose user object is the
	 *            IssueDefinition instance currently being viewed
	 */
	private void setSelectedElement(DefaultMutableTreeNode n) {
		selectIssueDefinitionNodeByObject(n.getUserObject());
	}
	public boolean tryChangeEditing(DefaultMutableTreeNode newNode) {

		if (newNode != null) {
			setSelectedElement(newNode);
		}
		return true;
	}
	
	public void reset() {
		creatingNewIssue = false;
		clearForm();
	}

	private void clearForm() {
		// Clear the text fields
		nameTextField.setText("");
		descriptionTextArea.setText("");
	}

	public boolean isCreatingNewIssue() {
		return creatingNewIssue;
	}

}
