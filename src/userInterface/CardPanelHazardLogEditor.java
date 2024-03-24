package userInterface;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
import careProcess_model.HazardRepository;
import careProcess_model.LocationDefinition;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
import main.Main;
import utilities.DataHelper;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;

/**
 * The JPanel that holds all the components of the hazard log editor and,
 * together with its corresponding 'Worker' class, defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 * <p>
 * Note: The current implementation uses an older method of validation to ensure
 * that the data in its fields is acceptable. It could be refactored to extend
 * the ValidatorPanel class instead, which may simplify its code.
 *
 */
public class CardPanelHazardLogEditor extends JPanel implements DialogParentPanel, EditorView {

	private PanelHazardTreeExplorer panelHazardTreeExplorer;
	private PanelHazardDefinition panelHazardDefinition;

	CardPanelHazardLogEditor_Modes mode;

	HazardLogEditor_Worker worker;
	HazardDefinition currentHazard;

	private final Action actionAddFunctionalHazardButton = new AddHazardInstanceButtonAction();
	private final Action actionSaveDefinitionButtonAction = new SaveDefinitionButtonAction();
	private final Action actionAddHazardDefinition = new AddHazardDefinitionAction();
	private final Action actionEditHazardInstance = new EditHazardInstanceButtonAction();
	private final Action actionRemoveHazardInstance = new RemoveHazardInstanceButtonAction();
	private final Action actionRemoveHazardDefinition = new RemoveHazardDefinitionButtonAction();

	JButton addHazardDefinitionButton;

	JButton addFunctionalHazardButton;
	JButton removeFunctionalHazardButton;
	private JButton btnSave = new JButton("Save");;

	private CardPanelHazardLogEditor thisPanel;

	/**
	 * Create the panel.
	 */
	public CardPanelHazardLogEditor() {

		thisPanel = this;

		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.3);
		panel.add(splitPane);

		panelHazardTreeExplorer = new PanelHazardTreeExplorer();
		panelHazardTreeExplorer.getHazardExplorerTree().addTreeSelectionListener(new ExplorerTreeSelectionListener());
		splitPane.setLeftComponent(panelHazardTreeExplorer);

		panelHazardTreeExplorer.getBtnRemoveHazard().setAction(actionRemoveHazardDefinition);

		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		panelHazardDefinition = new PanelHazardDefinition();
		panelHazardDefinition.getBtnEdit().setAction(actionEditHazardInstance);
		panelHazardDefinition.getBtnRemove().setAction(actionRemoveHazardInstance);
		panelHazardDefinition.getHazardInstanceTable().getSelectionModel()
				.addListSelectionListener(new HazardInstanceListSelectionListener());
		panel_1.add(panelHazardDefinition);

		worker = new HazardLogEditor_Worker(this, panelHazardTreeExplorer, panelHazardDefinition);

		addHazardDefinitionButton = panelHazardTreeExplorer.getBtnNewHazard();
		addHazardDefinitionButton.setAction(actionAddHazardDefinition);

		addFunctionalHazardButton = panelHazardDefinition.getBtnAdd();
		addFunctionalHazardButton.setAction(actionAddFunctionalHazardButton);
		removeFunctionalHazardButton = panelHazardDefinition.getBtnRemove();

		JPanel buttonPanel = new JPanel();
		FlowLayout fl_buttonPanel = (FlowLayout) buttonPanel.getLayout();
		fl_buttonPanel.setAlignment(FlowLayout.RIGHT);
		panel_1.add(buttonPanel, BorderLayout.SOUTH);

		btnSave.setAction(actionSaveDefinitionButtonAction);
		buttonPanel.add(btnSave);

		setMode(CardPanelHazardLogEditor_Modes.START);

		initialise();

	}

	/**
	 * Select the given hazard instance in the GUI, if it exists.
	 * 
	 * @param hazardInstance
	 */
	public void selectHazardInstance(HazardInstance hazardInstance) {
		setMode(CardPanelHazardLogEditor_Modes.START);
		worker.selectHazardDefinitionNodeByObject(hazardInstance.getHazardDefinition());
		worker.selectHazardInstanceByObject(hazardInstance);

	}

	/**
	 * Initialise the components and load their data.
	 */
	private void initialise() {
		worker.populateHazardTree(Main.getProject().getDatastore().getHazardrepository());
	}

	/**
	 * Repopulate the GUI components and change the GUI mode as required.
	 */
	private void updateComponents() {

		DefaultMutableTreeNode newNode = (DefaultMutableTreeNode) panelHazardTreeExplorer.getHazardExplorerTree()
				.getLastSelectedPathComponent();

		if (newNode != null) {
			if (worker.isCreatingNewHazard()) {
				worker.populateHazardTree(Main.getProject().getDatastore().getHazardrepository());
			}
			currentHazard = (HazardDefinition) newNode.getUserObject();
			if (worker.tryChangeEditing(newNode)) {
				worker.loadHazardDefinition(currentHazard);
			}
			setMode(CardPanelHazardLogEditor_Modes.EXISTING_HAZARD_NO_INSTANCE);
		} else {
			setMode(CardPanelHazardLogEditor_Modes.START);
		}
	}

	/**
	 * A listener which fires whenever the value of its owner list/table is
	 * changed. Here we set the currently selected hazard instance whenever the
	 * selection is changed.
	 *
	 */
	private class HazardInstanceListSelectionListener implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			if (((DefaultListSelectionModel) e.getSource()).getMinSelectionIndex() != -1) {
				setMode(CardPanelHazardLogEditor_Modes.EXISTING_HAZARD_WITH_INSTANCE);
				worker.setCurrentHazardInstanceByIndex(currentHazard,
						((DefaultListSelectionModel) e.getSource()).getMinSelectionIndex());
			} else {
				setMode(CardPanelHazardLogEditor_Modes.EXISTING_HAZARD_NO_INSTANCE);
				worker.setCurrentHazardInstance(null);
			}

		}

	}

	/**
	 * Provides a listener which fires whenever the selected value in the tree
	 * is changed.
	 * <p>
	 * If a new hazard is bing created, changing selection deletes the unsaved
	 * new hazard. Otherwise, if the node represents a hazard, that node is
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
	 * Action for creating a new hazard definition.
	 *
	 */
	private class AddHazardDefinitionAction extends AbstractAction {
		public AddHazardDefinitionAction() {
			putValue(NAME, "Add");
			putValue(SHORT_DESCRIPTION, "Define a new hazard type");
		}

		public void actionPerformed(ActionEvent e) {
			if (worker.tryAddNewHazard()) {
				setMode(CardPanelHazardLogEditor_Modes.NEW_HAZARD);
			}
		}
	}

	/**
	 * Action for creating a new hazard instance
	 *
	 */
	private class AddHazardInstanceButtonAction extends AbstractAction {
		public AddHazardInstanceButtonAction() {
			putValue(NAME, "Add");
			putValue(SHORT_DESCRIPTION, "Define a new instance of this hazard type");
		}

		public void actionPerformed(ActionEvent e) {
			HazardInstance newHazardInstance = CareProcess_modelFactory.eINSTANCE.createHazardInstance();
			if (currentHazard != null) {
				ArrayList<Step> steps = DataHelper.getAllStepsArrayList(Main.getProject());
				ArrayList<SystemFunction> functions = DataHelper.getAllSystemFunctionsArrayList(Main.getProject());
				if (functions.isEmpty()) {
					String message = DialogContent.HAZARD_INSTANCE_INSUFFICIENT_DATA_DIALOG_MESSAGE;

					message += "\n" + DialogContent.HAZARD_INSTANCE_NO_FUNCTIONS_DIALOG_MESSAGE;

					if (steps.isEmpty()) {
						message += "\n" + DialogContent.HAZARD_INSTANCE_NO_STEPS_DIALOG_MESSAGE;
					}

					DialogContent.showWarningDialog(panelHazardTreeExplorer.getParent(),
							DialogContent.HAZARD_INSTANCE_INSUFFICIENT_DATA_DIALOG_TITLE, message);
					return;

				} else if (steps.isEmpty()) {
					String message = DialogContent.HAZARD_INSTANCE_INSUFFICIENT_DATA_DIALOG_MESSAGE;

					message += "\n" + DialogContent.HAZARD_INSTANCE_NO_STEPS_DIALOG_MESSAGE;

					DialogContent.showWarningDialog(panelHazardTreeExplorer.getParent(),
							DialogContent.HAZARD_INSTANCE_INSUFFICIENT_DATA_DIALOG_TITLE, message);
					return;
				}

				worker.setCurrentHazardInstance(newHazardInstance);
				worker.showAddFunctionalHazardDialog(false, currentHazard, null, null, thisPanel, newHazardInstance);
			}
		}
	}

	/**
	 * Action for editing the currently selected hazard instance
	 *
	 */
	private class EditHazardInstanceButtonAction extends AbstractAction {
		public EditHazardInstanceButtonAction() {
			putValue(NAME, "Edit");
			putValue(SHORT_DESCRIPTION, "Edit the selected hazard instance");
		}

		public void actionPerformed(ActionEvent e) {
			worker.showAddFunctionalHazardDialog(true, currentHazard, null, null, thisPanel,
					worker.getCurrentHazardInstance());
		}
	}

	/**
	 * Action for removing the selected hazard instance.
	 *
	 */
	private class RemoveHazardInstanceButtonAction extends AbstractAction {
		public RemoveHazardInstanceButtonAction() {
			putValue(NAME, "Remove");
			putValue(SHORT_DESCRIPTION, "Remove the selected hazard instance");
		}

		public void actionPerformed(ActionEvent e) {
			HazardDefinition previouslySelectedHazard = currentHazard;
			WorkerUtilities.removeHazardInstance(currentHazard, worker.getCurrentHazardInstance(),
					Main.getProject().getDatastore().getHazardrepository());
			worker.populateHazardTree(Main.getProject().getDatastore().getHazardrepository());
			worker.selectHazardDefinitionNodeByObject(previouslySelectedHazard);
			setMode(CardPanelHazardLogEditor_Modes.START);
		}
	}

	/**
	 * Action for removing the selected hazard definition.
	 *
	 */
	private class RemoveHazardDefinitionButtonAction extends AbstractAction {
		public RemoveHazardDefinitionButtonAction() {
			putValue(NAME, "Remove Hazard");
			putValue(SHORT_DESCRIPTION, "Remove the selected hazard definition");
		}

		public void actionPerformed(ActionEvent e) {
			worker.removeHazardDefinition(currentHazard, Main.getProject().getDatastore().getHazardrepository());
			worker.populateHazardTree(Main.getProject().getDatastore().getHazardrepository());
			setMode(CardPanelHazardLogEditor_Modes.START);
		}
	}

	/**
	 * Action for saving the current hazard data.
	 */
	private class SaveDefinitionButtonAction extends AbstractAction {
		public SaveDefinitionButtonAction() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "Save the current hazard data");
		}

		public void actionPerformed(ActionEvent e) {
			saveDefinition();
		}
	}

	/**
	 * Save the hazard definition or show a warning dialog if validation fails.
	 */
	private void saveDefinition() {
		if (worker.trySaveHazardDefinition(currentHazard, Main.getProject().getDatastore().getHazardrepository())) {

		} else {
			DialogContent.showWarningDialog(panelHazardTreeExplorer.getParent(),
					DialogContent.DUPLICATE_HAZARD_SAVE_DIALOG_TITLE,
					DialogContent.DUPLICATE_HAZARD_SAVE_DIALOG_MESSAGE);
		}
	}

	/**
	 * Change the GUI mode for the editor and update activation of components accordingly.
	 */
	public void setMode(CardPanelHazardLogEditor_Modes m) {
		mode = m;
		switch (m) {
		case EXISTING_HAZARD_NO_INSTANCE:
			btnSave.setEnabled(true);

			panelHazardTreeExplorer.getBtnNewHazard().setEnabled(true);
			panelHazardTreeExplorer.getBtnRemoveHazard().setEnabled(true);

			panelHazardDefinition.getHazardNameTextField().setEnabled(true);
			panelHazardDefinition.getHazardDescriptionTextArea().setEnabled(true);
			panelHazardDefinition.getBtnAdd().setEnabled(true);
			panelHazardDefinition.getBtnEdit().setEnabled(false);
			panelHazardDefinition.getBtnRemove().setEnabled(false);
			break;
		case EXISTING_HAZARD_WITH_INSTANCE:
			btnSave.setEnabled(true);

			panelHazardTreeExplorer.getBtnNewHazard().setEnabled(true);
			panelHazardTreeExplorer.getBtnRemoveHazard().setEnabled(true);

			panelHazardDefinition.getHazardNameTextField().setEnabled(true);
			panelHazardDefinition.getHazardDescriptionTextArea().setEnabled(true);
			panelHazardDefinition.getBtnAdd().setEnabled(true);
			panelHazardDefinition.getBtnEdit().setEnabled(true);
			panelHazardDefinition.getBtnRemove().setEnabled(true);
			break;
		case NEW_HAZARD:
			btnSave.setEnabled(true);

			panelHazardTreeExplorer.getBtnNewHazard().setEnabled(true);
			panelHazardTreeExplorer.getBtnRemoveHazard().setEnabled(true);

			panelHazardDefinition.getHazardNameTextField().setEnabled(true);
			panelHazardDefinition.getHazardDescriptionTextArea().setEnabled(true);
			panelHazardDefinition.getBtnAdd().setEnabled(false);
			panelHazardDefinition.getBtnEdit().setEnabled(false);
			panelHazardDefinition.getBtnRemove().setEnabled(false);
			break;
		case START:
			btnSave.setEnabled(false);

			panelHazardTreeExplorer.getBtnNewHazard().setEnabled(true);
			panelHazardTreeExplorer.getBtnRemoveHazard().setEnabled(false);

			panelHazardDefinition.getHazardNameTextField().setEnabled(false);
			panelHazardDefinition.getHazardDescriptionTextArea().setEnabled(false);
			panelHazardDefinition.getBtnAdd().setEnabled(false);
			panelHazardDefinition.getBtnEdit().setEnabled(false);
			panelHazardDefinition.getBtnRemove().setEnabled(false);
			break;
		default:
			break;

		}
	}

	public PanelHazardDefinition getPanelHazardDefinition() {
		return panelHazardDefinition;
	}

	@Override
	public void refresh() {
		initialise();
		updateComponents();
	}

	@Override
	public boolean tryCloseView() {
		return true;// !worker.isCreatingNewHazard();
	}

	@Override
	public boolean saveAndClose() {
		/*
		 * if (worker.trySaveHazardDefinition(currentHazard,
		 * Main.getProject().getDatastore().getHazardrepository())) {
		 * 
		 * } else {
		 * DialogContent.showWarningDialog(panelHazardTreeExplorer.getParent(),
		 * DialogContent.DUPLICATE_HAZARD_SAVE_DIALOG_TITLE,
		 * DialogContent.DUPLICATE_HAZARD_SAVE_DIALOG_MESSAGE); return false; }
		 */
		return true;
	}

	public enum CardPanelHazardLogEditor_Modes {
		START, NEW_HAZARD, EXISTING_HAZARD_NO_INSTANCE, EXISTING_HAZARD_WITH_INSTANCE;
	}

	@Override
	public void save() {
		saveDefinition();
		Main.saveProject();

	}

}
