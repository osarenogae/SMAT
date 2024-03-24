package graphEditor;

import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.mxgraph.io.mxCodec;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.handler.mxGraphHandler;
import com.mxgraph.swing.handler.mxRubberband;
import com.mxgraph.util.mxEvent;
import com.mxgraph.util.mxEventObject;
import com.mxgraph.util.mxResources;
import com.mxgraph.util.mxUndoManager;
import com.mxgraph.util.mxUndoableEdit;
import com.mxgraph.util.mxEventSource.mxIEventListener;
import com.mxgraph.util.mxUndoableEdit.mxUndoableChange;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxMultiplicity;

import careProcess_model.Activity;
import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelFactory;
import careProcess_model.Decision;
import careProcess_model.HazardInstance;
import careProcess_model.Step;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import careProcess_model.SystemRepository;
import careProcess_model.stepType;
import dialogs.FunctionalHazardDefinitionDialog;
import dialogs.SystemFunctionSelectionDialog;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import graphEditor.CustomGraphComponent.EditMode;
import main.Main;
import graphEditor.EditorActions;
import userInterface.CardPanelCareProcessEditor;
import userInterface.CareProcessEditor_Worker;
import userInterface.DialogContent;
import userInterface.DialogParentPanel;
import userInterface.EditorDataPanel;
import userInterface.PanelActivityProperties;
import userInterface.PanelSystemAndSafetyProperties;
import userInterface.CareProcessEditor_Worker.UpdateType;

public class GraphEditorPanel2 extends JPanel implements DialogParentPanel {

	private static final int topMargin = 100;
	private static final int sideMargin = 50;

	public static final int startBlockSize = 20;

	public static final int activityBlockWidth = 80;
	public static final int activityBlockHeight = 60;

	public static final String START_SYMBOL_ID = "_SYMBOL.START";
	public static final String END_SYMBOL_ID = "_SYMBOL.END";

	public static final String ACTION_ID_UNDO = "action.undo";
	public static final String ACTION_ID_REDO = "action.redo";
	public static final String ACTION_ID_DELETE = "action.delete";
	public static final String ACTION_ID_SAVE = "action.save";

	private EditMode mode = EditMode.ACTIVITY;
	private Object currentNewCell = null;

	CellStepConnector cellStepConnector;

	private mxRubberband marquee;
	private KeyboardHandler editorKeyboardHandler;
	protected mxUndoManager undoManager;
	protected mxIEventListener undoHandler = new mxIEventListener() {
		public void invoke(Object source, mxEventObject evt) {
			undoManager.undoableEditHappened((mxUndoableEdit) evt.getProperty("edit"));
		}
	};

	private CareProcess careProcess;

	protected CustomGraphComponent graphComponent;
	private mxGraph graph;
	private JToolBar editorToolBar;
	private JPanel editorButtonPanel;
	private JPanel undoButtonPanel;
	private JPanel saveButtonPanel;
	private JToggleButton btnSelect;
	private JToggleButton btnNewActivity;
	private JToggleButton btnNewDecision;
	private JToggleButton btnNewStop;
	private JButton btnUndo;
	private JButton btnRedo;

	private GraphEditorPanel2 thisPanel;
	private CardPanelCareProcessEditor editor;

	private int index;
	private JPanel deleteButtonPanel;
	private JButton btnDelete;

	/**
	 * Create the panel.
	 */
	public GraphEditorPanel2(CareProcess process, CardPanelCareProcessEditor careProcessEditor) {
		// Used in references to this GEP instance in child classes.
		thisPanel = this;

		editor = careProcessEditor;
		careProcess = process;

		// The object that will handle associations between Steps and Cells.
		cellStepConnector = new CellStepConnector();

		graphComponent = new CustomGraphComponent(new CustomGraph(), careProcess, cellStepConnector);
		graph = graphComponent.getGraph();

		editorToolBar = new JToolBar();
		editorToolBar.setFloatable(false);
		setLayout(new BorderLayout(0, 0));
		add(editorToolBar, BorderLayout.NORTH);

		editorButtonPanel = new JPanel();
		editorToolBar.add(editorButtonPanel);

		btnNewActivity = new JToggleButton("New Activity");
		btnNewActivity.setAction(
				bind(mxResources.get("newActivity"), new EditorActions.ModeChangeAction(this, EditMode.ACTIVITY)));
		btnNewActivity.setText("Activity");
		editorButtonPanel.add(btnNewActivity);

		btnNewDecision = new JToggleButton("New Decision");
		btnNewDecision.setAction(
				bind(mxResources.get("newDecision"), new EditorActions.ModeChangeAction(this, EditMode.DECISION)));
		btnNewDecision.setText("Decision");
		editorButtonPanel.add(btnNewDecision);

		btnNewStop = new JToggleButton("New Stop");
		btnNewStop.setAction(bind(mxResources.get("newStop"), new EditorActions.ModeChangeAction(this, EditMode.STOP)));
		btnNewStop.setText("Stop");
		editorButtonPanel.add(btnNewStop);

		deleteButtonPanel = new JPanel();
		editorToolBar.add(deleteButtonPanel);
		btnDelete = new JButton("Delete");
		btnDelete.setAction(bind(mxResources.get(ACTION_ID_DELETE), new EditorActions.DeleteAction()));
		btnDelete.setText("Delete");
		deleteButtonPanel.add(btnDelete);

		undoButtonPanel = new JPanel();
		editorToolBar.add(undoButtonPanel);

		btnUndo = new JButton("Undo");
		btnUndo.setAction(bind(mxResources.get(ACTION_ID_UNDO), new EditorActions.HistoryAction(true)));
		btnUndo.setText("Undo");
		undoButtonPanel.add(btnUndo);

		btnRedo = new JButton("Redo");
		btnRedo.setAction(bind(mxResources.get(ACTION_ID_REDO), new EditorActions.HistoryAction(false)));
		btnRedo.setText("Redo");
		undoButtonPanel.add(btnRedo);

		saveButtonPanel = new JPanel();
		editorToolBar.add(saveButtonPanel);

		JButton btnSave = new JButton("Save");
		saveButtonPanel.add(btnSave);
		btnSave.setAction(
				bind(mxResources.get(ACTION_ID_SAVE), new EditorActions.SaveAction(careProcessEditor, process)));
		btnSave.setText("Save");

		add(graphComponent, BorderLayout.CENTER);

		initialise();
	}

	public mxGraphComponent getGraphComponent() {
		return graphComponent;
	}

	/**
	 * Initialise all settings
	 */
	private void initialise() {

		/*
		 * Set up the object that controls action history for the graph panel.
		 */
		undoManager = createUndoManager();
		graph.getModel().addListener(mxEvent.UNDO, undoHandler);
		graph.getView().addListener(mxEvent.UNDO, undoHandler);

		/*
		 * Define the listener that keeps track of changes in the graph for the
		 * undo facility.
		 */
		mxIEventListener undoHandler = new mxIEventListener() {
			public void invoke(Object source, mxEventObject evt) {
				List<mxUndoableChange> changes = ((mxUndoableEdit) evt.getProperty("edit")).getChanges();
				graph.setSelectionCells(graph.getSelectionCellsForChanges(changes));
			}
		};
		undoManager.addListener(mxEvent.UNDO, undoHandler);
		undoManager.addListener(mxEvent.REDO, undoHandler);

		/*
		 * Define an event listener to update the properties panel and register
		 * it to invoke when the graph is changed.
		 */
		mxIEventListener editListener = new mxIEventListener() {
			@Override
			public void invoke(Object sender, mxEventObject evt) {
				updateUndoButtons();
				updateDataPanel();
			}
		};
		graph.getSelectionModel().addListener(mxEvent.CHANGE, editListener);

		// Set up support for "rubber band" (marquee) selection of multiple
		// cells
		marquee = new mxRubberband(graphComponent);

		// Set the keyboard handler, to respond to keyboard events.
		editorKeyboardHandler = new KeyboardHandler(graphComponent);

		// Add the mouse listener, for selecting cells.
		setMouseListener(getGraphComponent());

		// Add the start cell to a blank graph.
		initialiseBlankGraph();

		// So that adding the start cell cannot be undone.
		this.getUndoManager().clear();

		// Update the editor mode.
		modeChanged();

		// Update undo/redo buttons.
		updateUndoButtons();

		refresh();
	}

	/**
	 * Fill the data panel with the appropriate data for the currently selected
	 * cell
	 */
	private void updateDataPanel() {
		editor.getWorkerByCareProcess(careProcess).updatePanelActivation();
		mxCell c = (mxCell) graph.getSelectionCell();
		if (c != null && c.isVertex()) {
			Step value = ((Step) cellStepConnector.getStepByAssociatedCellID(c.getId()));

			if (value == null) {
				if (c.getStyle() != CustomGraphComponent.STYLE_STOP) {
					JOptionPane.showMessageDialog(editor, DialogContent.STEP_DATA_FAILURE_MESSAGE,
							DialogContent.STEP_DATA_FAILURE_TITLE, JOptionPane.WARNING_MESSAGE);
					switch (c.getStyle()) {
					case CustomGraphComponent.STYLE_ACTIVITY:
						Activity activity = CareProcess_modelFactory.eINSTANCE.createActivity();
						activity.setProcessGraph(((CutsomConnectionHandler) graphComponent.getConnectionHandler())
								.getCareProcess().getProcessGraph());
						graphComponent.getCellStepConnector().putNodeObjectMap(c, activity);
						value = activity;
						break;
					case CustomGraphComponent.STYLE_DECISION:
						Decision decision = CareProcess_modelFactory.eINSTANCE.createDecision();
						decision.setProcessGraph(((CutsomConnectionHandler) graphComponent.getConnectionHandler())
								.getCareProcess().getProcessGraph());
						graphComponent.getCellStepConnector().putNodeObjectMap(c, decision);
						value = decision;
						break;
					}
				}

			}

			if (value.getStepTypeValue().equals(stepType.ACTIVITY)
					|| value.getStepTypeValue().equals(stepType.DECISION)) {

				refresh();
				if (careProcess != null) {
					editor.getWorkerByCareProcess(careProcess).updateDataPanel(UpdateType.LOCATION_COMBO_BOX, Main
							.getProject().getDatastore().getLocationrepository().getLocationDefinitions().toArray());
				}
				Object[] data = new Object[] { value.getName(), value.getLocation(), value.getDescription() };
				editor.getWorkerByCareProcess(careProcess).updateDataPanel(UpdateType.ACTIVITY_PROPERTIES, data);

			} else {
				editor.getWorkerByCareProcess(careProcess).updateDataPanel(UpdateType.DEACTIVATE, null);
			}
		} else {
			editor.getWorkerByCareProcess(careProcess).updateDataPanel(UpdateType.DEACTIVATE, null);
		}
		editor.getWorkerByCareProcess(careProcess).updateLastCell();

		
		
	}

	/**
	 * Update the activation of the undo/redo buttons
	 */
	public void updateUndoButtons() {
		if (!this.getUndoManager().canUndo()) {
			btnUndo.setEnabled(false);
		} else {
			btnUndo.setEnabled(true);
		}
		if (!this.getUndoManager().canRedo()) {
			btnRedo.setEnabled(false);
		} else {
			btnRedo.setEnabled(true);
		}
	}

	/**
	 * Update the toggle buttons to represent the current edit mode.
	 */
	public void modeChanged() {
		switch (getEditMode()) {
		case ACTIVITY:
			btnNewActivity.setSelected(true);
			btnNewDecision.setSelected(false);
			btnNewStop.setSelected(false);
			graphComponent.getConnectionHandler().setCreateTarget(true);
			break;
		case DECISION:
			btnNewActivity.setSelected(false);
			btnNewDecision.setSelected(true);
			btnNewStop.setSelected(false);
			graphComponent.getConnectionHandler().setCreateTarget(true);
			break;
		case STOP:
			btnNewActivity.setSelected(false);
			btnNewDecision.setSelected(false);
			btnNewStop.setSelected(true);
			graphComponent.getConnectionHandler().setCreateTarget(true);
			break;
		default:
			break;
		}
	}

	public EditMode getEditMode() {
		return graphComponent.getEditMode();
	}

	public void setEditMode(EditMode m) {
		graphComponent.setEditMode(m);
		modeChanged();
	}

	// select the most recently created cell after it is created
	private void setMouseListener(mxGraphComponent graphComponent) {
		graphComponent.getGraphControl().addMouseListener(new MouseAdapter() {

			public void mouseReleased(MouseEvent e) {
				Object cell = null;
				cell = graphComponent.getCellAt(e.getX(), e.getY());
				if (cell != null) {
					graph.clearSelection();
					graph.addSelectionCell(cell);

					updateDataPanel();
				}
			}

		});
	}

	/**
	 * Set up a blank graph component with a single "start" element.
	 */
	private void initialiseBlankGraph() {
		Object parent = graph.getDefaultParent();
		graph.getModel().beginUpdate();
		try {
			Step startStep = CareProcess_modelFactory.eINSTANCE.createStart();

			// We must ensure that each Step is associated to the ProcessGraph
			// object to which it will belong.
			startStep.setProcessGraph(careProcess.getProcessGraph());

			// Create the cell in the graph
			Object start = graph.insertVertex(parent, START_SYMBOL_ID, null, sideMargin, topMargin, startBlockSize,
					startBlockSize, CustomGraphComponent.STYLE_START);

			// Form an association between the graph cell and the Step object
			cellStepConnector.putNodeObjectMap((mxCell) start, startStep);

		} finally {
			graph.getModel().endUpdate();
		}

		// TODO find a way to make the jgraphx validation work
		/*
		 * mxMultiplicity[] multiplicities = new mxMultiplicity[1];
		 * 
		 * // End cells cannot have outgoing edges multiplicities[0] = new
		 * mxMultiplicity(true,
		 * careProcess_model.impl.StopImpl.class.toString(), null, null, 0, "0",
		 * Arrays.asList(new String[0]),
		 * "End cannot have outgoing connentions.", null, true);
		 * 
		 * 
		 * graph.setMultiplicities(multiplicities);
		 */

	}

	/**
	 * Create the JGraphx undo manager for graph edit events.
	 */
	protected mxUndoManager createUndoManager() {
		return new mxUndoManager();
	}

	public mxUndoManager getUndoManager() {
		return undoManager;
	}

	/**
	 * 
	 * @param name
	 * @param action
	 * @return a new Action bound to the specified string name
	 */
	public Action bind(String name, final Action action) {
		return bind(name, action, null);
	}

	/**
	 * 
	 * @param name
	 * @param action
	 * @return a new Action bound to the specified string name and icon
	 */
	@SuppressWarnings("serial")
	public Action bind(String name, final Action action, String iconUrl) {
		AbstractAction newAction = new AbstractAction(name,
				(iconUrl != null) ? new ImageIcon(GraphEditorPanel2.class.getResource(iconUrl)) : null) {
			public void actionPerformed(ActionEvent e) {
				action.actionPerformed(new ActionEvent(getGraphComponent(), e.getID(), e.getActionCommand()));
			}
		};

		newAction.putValue(Action.SHORT_DESCRIPTION, action.getValue(Action.SHORT_DESCRIPTION));

		return newAction;
	}

	public CellStepConnector getCellStepConnector() {
		return cellStepConnector;
	}

	public CareProcess getCareProcess() {
		return careProcess;
	}

	/*
	 * 
	 * DialogParentPanel METHOD IMPLEMENTATION
	 * 
	 */
	@Override
	public void refresh() {
		mxCell c = (mxCell) graph.getSelectionCell();
		if (c != null && c.isVertex()) {
			if (cellStepConnector.getStepByAssociatedCellID(c.getId()) instanceof Step) {
				SystemFunction lastSelectedFunction = editor.getWorkerByCareProcess(careProcess)
						.getLastSelectedFunction();
				Step value = ((Step) cellStepConnector.getStepByAssociatedCellID(c.getId()));
				editor.getWorkerByCareProcess(careProcess).populateHazardInstancesList(value, null);
				editor.getWorkerByCareProcess(careProcess).populateSystemFunctionsTree(value);
				if (lastSelectedFunction != null) {
					editor.getWorkerByCareProcess(careProcess).selectSystemFunctionNodeByObject(lastSelectedFunction);
				}
			}
		}
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}
}
