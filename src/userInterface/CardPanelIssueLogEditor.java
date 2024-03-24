package userInterface;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.JTextComponent;
import javax.swing.tree.DefaultMutableTreeNode;

import careProcess_model.HazardDefinition;
import careProcess_model.IssueDefinition;
import main.Main;
import userInterface.CardPanelHazardLogEditor.CardPanelHazardLogEditor_Modes;

import java.awt.BorderLayout;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

/**
/**
 * The JPanel that holds all the components of the issues log editor and,
 * together with its corresponding 'Worker' class, defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 * <p>
 * Note: The current implementation uses the ValidatorPanel class to validate
 * the contents of its fields.
 *
 */
public class CardPanelIssueLogEditor extends ValidatorPanel implements EditorView {

	IssueLogEditor_Worker worker;

	static JButton btnSave = new JButton("Save");

	PanelIssueTreeExplorer panelIssueTreeExplorer;
	static PanelIssueDefinition panelIssueDefinition = new PanelIssueDefinition();

	IssueDefinition currentIssue;
	CardPanelIssueLogEditor_Modes mode;

	Action removeIssueDefinitionButtonAction = new RemoveIssueDefinitionButtonAction();
	Action addIssueDefinitionAction = new AddIssueDefinitionAction();
	Action saveDefinitionButtonAction = new SaveDefinitionButtonAction();

	/**
	 * Create the panel.
	 */
	public CardPanelIssueLogEditor() {
		super(new JTextComponent[] { panelIssueDefinition.getIssueNameTextField() }, new JButton[] { btnSave });

		setLayout(new BorderLayout(0, 0));

		JSplitPane splitPane = new JSplitPane();
		add(splitPane);

		panelIssueTreeExplorer = new PanelIssueTreeExplorer();
		splitPane.setLeftComponent(panelIssueTreeExplorer);

		JPanel editorPanel = new JPanel();
		splitPane.setRightComponent(editorPanel);
		editorPanel.setLayout(new BorderLayout(0, 0));

		editorPanel.add(panelIssueDefinition);

		JPanel buttonPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) buttonPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		editorPanel.add(buttonPanel, BorderLayout.SOUTH);

		buttonPanel.add(btnSave);

		panelIssueTreeExplorer.getIssueExplorerTree().addTreeSelectionListener(new ExplorerTreeSelectionListener());
		panelIssueTreeExplorer.getBtnNewIssue().setAction(addIssueDefinitionAction);
		panelIssueTreeExplorer.getBtnRemoveIssue().setAction(removeIssueDefinitionButtonAction);
		btnSave.setAction(saveDefinitionButtonAction);

		worker = new IssueLogEditor_Worker(this, panelIssueTreeExplorer, panelIssueDefinition);
		setMode(CardPanelIssueLogEditor_Modes.START);
		initialise();
	}

	private void initialise() {
		worker.populateIssueTree(Main.getProject().getDatastore().getReportData());
	}

	/**
	 * Save the data associated with the selected issue.
	 */
	private void saveDefinition() {
		worker.saveIssueDefinition(currentIssue, Main.getProject().getDatastore().getReportData());
	}

	/**
	 * Update the GUI components and change the GUI mode.
	 */
	private void updateComponents() {

		DefaultMutableTreeNode newNode = (DefaultMutableTreeNode) panelIssueTreeExplorer.getIssueExplorerTree()
				.getLastSelectedPathComponent();

		if (newNode != null) {
			if (worker.isCreatingNewIssue()) {
				worker.populateIssueTree(Main.getProject().getDatastore().getReportData());
			}
			currentIssue = (IssueDefinition) newNode.getUserObject();
			if (worker.tryChangeEditing(newNode)) {
				worker.loadIssueDefinition(currentIssue);
			}
			setMode(CardPanelIssueLogEditor_Modes.EXISTING_ISSUE);
		} else {
			setMode(CardPanelIssueLogEditor_Modes.START);
		}
	}

	/**
	 * Set the GUI mode and change the activation of components accordingly.
	 */
	public void setMode(CardPanelIssueLogEditor_Modes m) {
		mode = m;
		switch (m) {
		case START:
			panelIssueDefinition.setEnabled(false);
			btnSave.setEnabled(false);
			panelIssueTreeExplorer.getBtnNewIssue().setEnabled(true);
			panelIssueTreeExplorer.getBtnRemoveIssue().setEnabled(false);
			break;
		case NEW_ISSUE:
			panelIssueDefinition.setEnabled(true);
			btnSave.setEnabled(true);
			panelIssueTreeExplorer.getBtnNewIssue().setEnabled(false);
			panelIssueTreeExplorer.getBtnRemoveIssue().setEnabled(true);
			break;
		case EXISTING_ISSUE:
			panelIssueDefinition.setEnabled(true);
			btnSave.setEnabled(true);
			panelIssueTreeExplorer.getBtnNewIssue().setEnabled(true);
			panelIssueTreeExplorer.getBtnRemoveIssue().setEnabled(true);
			break;
		}
	}

	/**
	 * Provides a listener which fires whenever the selected value in the tree
	 * is changed.
	 * <p>
	 * If a new issue is bing created, changing selection deletes the unsaved
	 * new issue. Otherwise, if the node represents a issue, that node is
	 * selected and the data panel is updated to show its values.
	 *
	 */
	private class ExplorerTreeSelectionListener implements TreeSelectionListener {
		@Override
		public void valueChanged(TreeSelectionEvent e) {
			updateComponents();
		}
	}

	/**
	 * Action to create a new Issue Definition
	 *
	 */
	private class AddIssueDefinitionAction extends AbstractAction {
		public AddIssueDefinitionAction() {
			putValue(NAME, "Add Issue");
			putValue(SHORT_DESCRIPTION, "Define a new issue");
		}

		public void actionPerformed(ActionEvent e) {
			if (worker.tryAddNewIssue()) {
				setMode(CardPanelIssueLogEditor_Modes.NEW_ISSUE);
			}
		}
	}

	/**
	 * Action to remove an issue definition
	 *
	 */
	private class RemoveIssueDefinitionButtonAction extends AbstractAction {
		public RemoveIssueDefinitionButtonAction() {
			putValue(NAME, "Remove Issue");
			putValue(SHORT_DESCRIPTION, "Remove the selected issue");
		}

		public void actionPerformed(ActionEvent e) {
			worker.removeIssueDefinition(currentIssue, Main.getProject().getDatastore().getReportData());
			worker.populateIssueTree(Main.getProject().getDatastore().getReportData());
			setMode(CardPanelIssueLogEditor_Modes.START);
		}
	}

	/**
	 *Action to save the data associated with the selected issue.
	 */
	private class SaveDefinitionButtonAction extends AbstractAction {
		public SaveDefinitionButtonAction() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "Save the current issue data");
		}

		public void actionPerformed(ActionEvent e) {
			saveDefinition();
		}
	}

	public enum CardPanelIssueLogEditor_Modes {
		START, NEW_ISSUE, EXISTING_ISSUE;
	}

	@Override
	public boolean tryCloseView() {
		return true;
	}

	@Override
	public boolean saveAndClose() {
		return true;
	}

	@Override
	public void save() {
		saveDefinition();
		Main.saveProject();
	}
}
