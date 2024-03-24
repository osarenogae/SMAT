package userInterface;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import careProcess_model.LocationDefinition;
import careProcess_model.SystemDefinition;
import main.Main;
import userInterface.CardPanelIssueLogEditor.CardPanelIssueLogEditor_Modes;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.KeyboardFocusManager;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Action;
import javax.swing.JSplitPane;

/**
 * The JPanel that holds all the components of the care setting editor (formerly
 * 'Location Editor') and, together with its corresponding 'Worker' class,
 * defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class CardPanelCareSettingEditor extends JPanel implements EditorView, DialogParentPanel {

	private final JSplitPane splitPane = new JSplitPane();
	private final PanelLocationTreeExplorer panelLocationTreeExplorer = new PanelLocationTreeExplorer();
	private final PanelLocationProperties panelLocationProperties = new PanelLocationProperties();

	private final Action actionAddSublocationButton = new AddSublocationButtonAction();
	private final Action actionSaveLocationButton = new SaveLocationButtonAction();
	private final Action action = new RemoveLocationButtonAction();

	private LocationDefinition currentLocation;
	private LocationEditor_Worker worker;

	/**
	 * The GUI activation mode. Should only be changed using {@link #setMode(CardPanelCareSettingEditor_Modes)}
	 */
	private CardPanelCareSettingEditor_Modes mode = null;

	/**
	 * Create the panel.
	 */
	public CardPanelCareSettingEditor() {

		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		splitPane.setResizeWeight(0.4);

		add(splitPane);

		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));

		panelLocationProperties.getBtnSave().setAction(actionSaveLocationButton);

		panel.add(panelLocationProperties, BorderLayout.NORTH);

		panelLocationTreeExplorer.getBtnNewLocation().setAction(actionAddSublocationButton);

		panelLocationTreeExplorer.getLocationExplorerTree()
				.addTreeSelectionListener(new ExplorerTreeSelectionListener());

		worker = new LocationEditor_Worker(this, panelLocationTreeExplorer, panelLocationProperties);
		panelLocationTreeExplorer.getBtnRemoveLocation().setAction(action);
		splitPane.setLeftComponent(panelLocationTreeExplorer);

		setMode(CardPanelCareSettingEditor_Modes.START);
		initialise();
	}

	/**
	 * Initialise the components and load their data.
	 */
	private void initialise() {
		worker.populateLocationTree(Main.getProject().getDatastore().getLocationrepository());
	}

	/**
	 * Provides a listener which fires whenever the selected value in the tree
	 * is changed.
	 * <p>
	 * If a new location is bing created, changing selection deletes the unsaved
	 * new location. Otherwise, if the node represents a location, that node is
	 * selected and the data panel is updated to show its values.
	 *
	 */
	private class ExplorerTreeSelectionListener implements TreeSelectionListener {
		@Override
		public void valueChanged(TreeSelectionEvent e) {
			DefaultMutableTreeNode newNode = (DefaultMutableTreeNode) ((JTree) e.getSource())
					.getLastSelectedPathComponent();

			if (newNode != null) {

				if (worker.isCreatingNewLocation()) {
					setMode(CardPanelCareSettingEditor_Modes.NEW_SETTING);
					worker.populateLocationTree(Main.getProject().getDatastore().getLocationrepository());
				} else {
					setMode(CardPanelCareSettingEditor_Modes.EXISTING_SETTING);
				}
				currentLocation = (LocationDefinition) newNode.getUserObject();
				if (worker.tryChangeEditing(newNode)) {

					// Load the system definition data into the panel
					worker.loadLocationDefinition(currentLocation);

				}

			} else {
				setMode(CardPanelCareSettingEditor_Modes.START);
			}

		}
	}

	/**
	 * Select the specified care setting (LocationDefinition) in the list.
	 * 
	 * @param l
	 */
	public void selectLocation(LocationDefinition l) {
		worker.selectNodeByObject(l);

	}

	/**
	 * Action for adding a new care setting from within the care process editor.
	 */
	private class AddSublocationButtonAction extends AbstractAction {
		public AddSublocationButtonAction() {
			putValue(NAME, "Add Care Setting");
			putValue(SHORT_DESCRIPTION, "Add a new care setting");
		}

		public void actionPerformed(ActionEvent e) {
			if (worker.tryAddNewLocation()) {
				setMode(CardPanelCareSettingEditor_Modes.NEW_SETTING);
			}
		}
	}

	/**
	 * Action for saving the currently selected care setting (drop-down list
	 * element) to the selected step.
	 * <p>
	 * All the other data associated with a step is automatically saved when it
	 * is edited (text fields), but the location is not automatically saved. A
	 * new listener could be implemented to replace manual saving and
	 * automatically save the selection when it is changed.
	 *
	 */
	private class SaveLocationButtonAction extends AbstractAction {
		public SaveLocationButtonAction() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "Save current care setting data");
		}

		public void actionPerformed(ActionEvent e) {
			saveLocation();
		}
	}

	/**
	 * Store the currently selected location in the relevant data objects.
	 */
	private void saveLocation() {
		if (worker.trySaveLocationDefinition(currentLocation,
				Main.getProject().getDatastore().getLocationrepository())) {
			panelLocationTreeExplorer.getBtnNewLocation().setEnabled(true);
		} else {
			worker.showWarningDialog(DialogContent.DUPLICATE_LOCATION_SAVE_DIALOG_TITLE,
					DialogContent.DUPLICATE_LOCATION_SAVE_DIALOG_MESSAGE);
		}

	}

	// TODO validation on close of view results in saving a new element after
	// deletion. This shouldn't happen.
	@Override
	public boolean tryCloseView() {
		return true;// !worker.isCreatingNewLocation();
	}

	@Override
	public boolean saveAndClose() {
		/*
		 * if (worker.trySaveLocationDefinition(currentLocation,
		 * Main.getProject().getDatastore().getLocationrepository())) {
		 * panelLocationTreeExplorer.getBtnNewLocation().setEnabled(true); }
		 * else { worker.showWarningDialog(DialogContent.
		 * DUPLICATE_LOCATION_SAVE_DIALOG_TITLE,
		 * DialogContent.DUPLICATE_LOCATION_SAVE_DIALOG_MESSAGE); return false;
		 * }
		 */
		return true;
	}

	@Override
	public void refresh() {
		worker.populateLocationTree(Main.getProject().getDatastore().getLocationrepository());
	}

	private class RemoveLocationButtonAction extends AbstractAction {
		public RemoveLocationButtonAction() {
			putValue(NAME, "Remove Care Setting");
			putValue(SHORT_DESCRIPTION, "Remove the selected care setting");
		}

		public void actionPerformed(ActionEvent e) {
			if (currentLocation != null) {
				worker.removeLocationDefinition(currentLocation,
						Main.getProject().getDatastore().getLocationrepository());
			}
		}
	}

	/**
	 * Change the mode of the editor and update the activation of the various
	 * GUI components accordingly.
	 * 
	 * @param m
	 */
	public void setMode(CardPanelCareSettingEditor_Modes m) {
		mode = m;
		switch (m) {
		case EXISTING_SETTING:
			panelLocationProperties.getLocationNameTextField().setEnabled(true);
			panelLocationProperties.getDescriptionTextArea().setEnabled(true);
			panelLocationProperties.getBtnSave().setEnabled(true);
			panelLocationTreeExplorer.getBtnNewLocation().setEnabled(true);
			panelLocationTreeExplorer.getBtnRemoveLocation().setEnabled(true);
			break;
		case NEW_SETTING:
			panelLocationProperties.getLocationNameTextField().setEnabled(true);
			panelLocationProperties.getDescriptionTextArea().setEnabled(true);
			panelLocationProperties.getBtnSave().setEnabled(true);
			panelLocationTreeExplorer.getBtnNewLocation().setEnabled(false);
			panelLocationTreeExplorer.getBtnRemoveLocation().setEnabled(true);
			break;
		case START:
			panelLocationProperties.getLocationNameTextField().setEnabled(false);
			panelLocationProperties.getDescriptionTextArea().setEnabled(false);
			panelLocationProperties.getBtnSave().setEnabled(false);
			panelLocationTreeExplorer.getBtnNewLocation().setEnabled(true);
			panelLocationTreeExplorer.getBtnRemoveLocation().setEnabled(false);
			break;
		default:
			break;
		}
	}

	public enum CardPanelCareSettingEditor_Modes {
		START, NEW_SETTING, EXISTING_SETTING;
	}

	@Override
	public void save() {
		saveLocation();
		Main.saveProject();
	}

}
