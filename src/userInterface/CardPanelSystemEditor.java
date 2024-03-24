package userInterface;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.eclipse.emf.common.util.EList;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import careProcess_model.SystemRepository;
import main.Main;
import userInterface.CardPanelCareSettingEditor.CardPanelCareSettingEditor_Modes;
import utilities.DataHelper;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTree;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Action;

/**
 * The JPanel that holds all the components of the system editor and,
 * together with its corresponding 'Worker' class, defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class CardPanelSystemEditor extends JPanel implements EditorView {

	private JButton btnSaveChanges;
	private PanelSystemProperties panelSystemProperties;
	private PanelSystemTreeExplorer panelSystemTreeExplorer;
	private final Action actionAddSystemButton = new AddSystemButtonAction();
	private final Action actionRemoveSystemButton = new RemoveSystemButtonAction();
	private final Action actionSaveChangesButton = new SaveChangesButtonAction();
	private final Action actionAddSystemFunctionButton = new AddSystemFunctionButtonAction();
	private final Action actionRemoveSystemFunctionButton = new RemoveSystemFunctionButtonAction();

	private SystemDefinition currentSystem = null;
	private DefaultMutableTreeNode currentlySelectedSystemNode = null;

	private boolean creatingNewSystem = false;
	private boolean creatingNewFunction = false;

	private SystemEditor_Worker worker;

	private Component parentPanel;

	private int lastSelectedFunctionRow = -1;
	private int secondLastSelectedFunctionRow = -1;
	
	private CardPanelSystemEditor_Modes mode = null;


	/**
	 * Create the panel.
	 */
	public CardPanelSystemEditor() {
		parentPanel = this;

		setLayout(new BorderLayout(0, 0));

		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		add(splitPane);

		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel rightButtonPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) rightButtonPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel.add(rightButtonPanel, BorderLayout.SOUTH);

		panelSystemProperties = new PanelSystemProperties();
		panel.add(panelSystemProperties, BorderLayout.CENTER);

		panelSystemTreeExplorer = new PanelSystemTreeExplorer();
		splitPane.setLeftComponent(panelSystemTreeExplorer);

		btnSaveChanges = new JButton();
		btnSaveChanges.setAction(actionSaveChangesButton);
		// btnSaveChanges.setAction(new
		// InterfaceActions.SaveSystemAction(panelSystemTreeExplorer));
		btnSaveChanges.setHorizontalAlignment(SwingConstants.RIGHT);
		rightButtonPanel.add(btnSaveChanges);

		panelSystemProperties.getBtnRemoveFunction().setAction(actionRemoveSystemFunctionButton);
		panelSystemProperties.getBtnAddFunction().setAction(actionAddSystemFunctionButton);

		panelSystemTreeExplorer.getBtnNewSystem().setAction(actionAddSystemButton);
		panelSystemTreeExplorer.getBtnRemoveSystem().setAction(actionRemoveSystemButton);

		panelSystemTreeExplorer.getSystemExplorerTree().addTreeSelectionListener(new ExplorerTreeSelectionListener());

		panelSystemProperties.getFunctionsTable().getDefaultEditor(String.class)
				.addCellEditorListener(new FunctionTableCellEditListener());

		panelSystemProperties.getFunctionsTable().putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);

		worker = new SystemEditor_Worker(panelSystemTreeExplorer, panelSystemProperties);

		setMode(CardPanelSystemEditor_Modes.START);
		initialise();
	}

	/**
	 * Initialise the components and load their data.
	 */
	private void initialise() {
		worker.populateSystemTree(Main.getProject().getDatastore().getSystemrepository());
	}

	/**
	 * Clear the contents of the data panel.
	 */
	private void clearBoxes() {
		panelSystemProperties.getSystemNameTextField().setText(null);
		panelSystemProperties.getSystemVersionTextField().setText(null);

	}

	/**
	 * Select the specified system object in the list
	 */
	public void selectSystem(SystemDefinition s) {
		worker.selectNodeByObject(s);

	}

	
	/**
	 * Provides a listener which fires whenever the selected value in the tree
	 * is changed.
	 * <p>
	 * If a new system is bing created, changing selection deletes the unsaved
	 * new system. Otherwise, if the node represents a system, that node is
	 * selected and the data panel is updated to show its values.
	 *
	 */
	private class ExplorerTreeSelectionListener implements TreeSelectionListener {
		@Override
		public void valueChanged(TreeSelectionEvent e) {
			DefaultMutableTreeNode newNode = (DefaultMutableTreeNode) ((JTree) e.getSource())
					.getLastSelectedPathComponent();

			if (newNode != null) {
				currentSystem = (SystemDefinition) newNode.getUserObject();
				if (worker.tryChangeEditing(newNode)) {
					
					setMode(CardPanelSystemEditor_Modes.EXISTING_SYSTEM);

					worker.reset();

					// Load the system definition data into the panel
					worker.loadSystemDefinition(currentSystem);

					// Load the function data into the table
					worker.loadFunctions(currentSystem);

				}

			} else {
				setMode(CardPanelSystemEditor_Modes.START);
			}
		}
	}

	/**
	 * A listener which fires whenever the value of a table cell on the owning table is edited.
	 * Used here to save data about system functions.
	 *
	 */
	private class FunctionTableCellEditListener implements CellEditorListener {

		@Override
		public void editingCanceled(ChangeEvent e) {
			worker.updateFunctionDefinition(panelSystemProperties.getFunctionsTable().getSelectedRow(), currentSystem);

		}

		@Override
		public void editingStopped(ChangeEvent e) {
			worker.updateFunctionDefinition(panelSystemProperties.getFunctionsTable().getSelectedRow(), currentSystem);
		}

	}

	/**
	 * Action to add a new system definition.
	 *
	 */
	private class AddSystemButtonAction extends AbstractAction {
		public AddSystemButtonAction() {
			putValue(NAME, "New System");
			putValue(SHORT_DESCRIPTION, "Add a new system definition");
		}

		public void actionPerformed(ActionEvent e) {
			if (worker.tryAddNewSystem()) {
				setMode(CardPanelSystemEditor_Modes.NEW_SYSTEM);
			}
		}
	}

	/**
	 * Action to remove the selected system
	 *
	 */
	private class RemoveSystemButtonAction extends AbstractAction {
		public RemoveSystemButtonAction() {
			putValue(NAME, "Remove System");
			putValue(SHORT_DESCRIPTION, "Remove the selected system");
		}

		public void actionPerformed(ActionEvent e) {
			if (currentSystem != null) {
				worker.removeSystem(currentSystem, Main.getProject().getDatastore().getSystemrepository());
				setMode(CardPanelSystemEditor_Modes.START);
			}
		}
	}

	/**
	 * Action to save the current system
	 *
	 */
	private class SaveChangesButtonAction extends AbstractAction {
		public SaveChangesButtonAction() {
			putValue(NAME, "Save");
			putValue(SHORT_DESCRIPTION, "Save the changes to this system definition");
		}

		public void actionPerformed(ActionEvent e) {
			saveChanges();
		}
	}

	/**
	 * Save the current system.
	 */
	private void saveChanges() {
		if (worker.trySaveSystemDefinition(currentSystem, Main.getProject().getDatastore().getSystemrepository(),
				parentPanel)) {
			setMode(CardPanelSystemEditor_Modes.EXISTING_SYSTEM);
		}
	}

	/**
	 * Action to add a new system function (in the table)
	 *
	 */
	private class AddSystemFunctionButtonAction extends AbstractAction {
		public AddSystemFunctionButtonAction() {
			putValue(NAME, "Add Function");
			putValue(SHORT_DESCRIPTION, "Add a new function to this system");
		}

		public void actionPerformed(ActionEvent e) {
			worker.tryAddNewSystemFunction(currentSystem);

		}

	}

	/**
	 * Action to remove a system function.
	 *
	 */
	private class RemoveSystemFunctionButtonAction extends AbstractAction {
		public RemoveSystemFunctionButtonAction() {
			putValue(NAME, "Remove Function");
			putValue(SHORT_DESCRIPTION, "Remove the selected system function");
		}

		public void actionPerformed(ActionEvent e) {
			worker.removeSystemFunctionByIndex(currentSystem,
					panelSystemProperties.getFunctionsTable().getPreviousRow());
			worker.loadFunctions(currentSystem);
		}

	}

	
	public PanelSystemTreeExplorer getPanelSystemTreeExplorer() {
		return panelSystemTreeExplorer;
	}

	// TODO validation on close of view results in saving a new element after
	// deletion. This shouldn't happen.
	@Override
	public boolean tryCloseView() {
		return true;// !worker.isCreatingNewItem();
	}

	@Override
	public boolean saveAndClose() {
		/*
		 * if (worker.trySaveSystemDefinition(currentSystem,
		 * Main.getProject().getDatastore().getSystemrepository(), parentPanel))
		 * { panelSystemTreeExplorer.getBtnNewSystem().setEnabled(true); return
		 * true; } return false;
		 */
		return true;
	}

	/**
	 * Change the GUI mode of the editor and update component activation accordingly.
	 * @param m
	 */
	public void setMode(CardPanelSystemEditor_Modes m) {
		mode = m;
		switch (m) {
		case EXISTING_SYSTEM:
			btnSaveChanges.setEnabled(true);
			panelSystemProperties.getBtnAddFunction().setEnabled(true);
			panelSystemProperties.getBtnRemoveFunction().setEnabled(true);
			panelSystemProperties.getSystemNameTextField().setEnabled(true);
			panelSystemProperties.getSystemVersionTextField().setEnabled(true);
			panelSystemProperties.getDescriptionTextArea().setEnabled(true);
			panelSystemTreeExplorer.getBtnNewSystem().setEnabled(true);
			panelSystemTreeExplorer.getBtnRemoveSystem().setEnabled(true);
			break;
		case NEW_SYSTEM:
			btnSaveChanges.setEnabled(true);
			panelSystemProperties.getBtnAddFunction().setEnabled(true);
			panelSystemProperties.getBtnRemoveFunction().setEnabled(true);
			panelSystemProperties.getSystemNameTextField().setEnabled(true);
			panelSystemProperties.getSystemVersionTextField().setEnabled(true);
			panelSystemProperties.getDescriptionTextArea().setEnabled(true);
			panelSystemTreeExplorer.getBtnNewSystem().setEnabled(false);
			panelSystemTreeExplorer.getBtnRemoveSystem().setEnabled(true);
			break;
		case START:
			btnSaveChanges.setEnabled(false);
			panelSystemProperties.getBtnAddFunction().setEnabled(false);
			panelSystemProperties.getBtnRemoveFunction().setEnabled(false);
			panelSystemProperties.getSystemNameTextField().setEnabled(false);
			panelSystemProperties.getSystemVersionTextField().setEnabled(false);
			panelSystemProperties.getDescriptionTextArea().setEnabled(false);
			panelSystemTreeExplorer.getBtnNewSystem().setEnabled(true);
			panelSystemTreeExplorer.getBtnRemoveSystem().setEnabled(false);
			break;
		default:
			break;
		}
	}

	public enum CardPanelSystemEditor_Modes {
		START, NEW_SYSTEM, EXISTING_SYSTEM;
	}

	@Override
	public void save() {
		saveChanges();
		Main.saveProject();
	}

}
