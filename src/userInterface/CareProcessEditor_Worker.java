package userInterface;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.AbstractAction;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Document;

import com.mxgraph.io.mxCodec;
import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxUtils;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;

import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
import careProcess_model.LocationDefinition;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
import careProcess_model.stepType;
import dialogs.FunctionalHazardDefinitionDialog;
import dialogs.SystemFunctionSelectionDialog;
import graphEditor.CellStepConnector;
import graphEditor.CustomGraphComponent;
import graphEditor.GraphEditorPanel2;
import guiComponents.HazardInstanceTableModel;
import io.InputOutput;
import main.Main;
import main.Main.ExecutionModes;
import userInterface.CardPanelHazardLogEditor.CardPanelHazardLogEditor_Modes;

/**
 * The 'Worker' class responsible for the major functional aspects of the
 * {@link #CardPaneCareProcessEditor} class.
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
public class CareProcessEditor_Worker {

	private mxCell lastCell;
	private SystemFunction lastSelectedFunction;

	CareProcess careProcess;
	EditorDataPanel dataPanel;
	GraphEditorPanel2 editorPanel;
	CardPanelCareProcessEditor parentCardPanel;

	public CareProcessEditor_Worker(CareProcess cp, CardPanelCareProcessEditor careProcessPanel, EditorDataPanel edp,
			GraphEditorPanel2 gep) {
		parentCardPanel = careProcessPanel;
		dataPanel = edp;
		editorPanel = gep;

		careProcess = cp;
		initialise();
	}

	/**
	 * Perform the initial setup for the worker, installing listeners for text
	 * components and setting actions for buttons.
	 */
	private void initialise() {

		// Set the actions for the buttons in the input instance of the data
		// panel.
		dataPanel.getPanelSystemHazard().getBtnAddHazardInstance().setAction(new AddHazardInstanceButtonAction());
		dataPanel.getPanelSystemHazard().getBtnAddSystemFunction().setAction(new AddSystemFunctionButtonAction());
		dataPanel.getPanelSystemHazard().getBtnEditHazardInstance().setAction(new EditHazardInstanceButtonAction());
		dataPanel.getPanelSystemHazard().getBtnRemoveHazardInstance().setAction(new RemoveHazardInstanceButtonAction());
		dataPanel.getPanelSystemHazard().getBtnRemoveSystemFunction().setAction(new RemoveSystemFunctionButtonAction());

		dataPanel.getPanelSystemHazard().getSystemFunctionsTree()
				.addTreeSelectionListener(new systemFunctionTreeSelectionListener());

		dataPanel.getPanelActivityProperties().getLocationComboBox().addItemListener(new ItemChangeListener());

		/*
		 * Add the listener responsible for checking when the property panels
		 * are changed.
		 */
		PropertyEditListener p = new PropertyEditListener(dataPanel.getPanelActivityProperties());
		dataPanel.getPanelActivityProperties().getActivityNameTextField().getDocument().addDocumentListener(p);
		dataPanel.getPanelActivityProperties().getDescriptionEditorPane().getDocument().addDocumentListener(p);

		// Listener for changes to hazard instances table selection
		dataPanel.getPanelSystemHazard().getHazardInstanceTable().getSelectionModel()
				.addListSelectionListener(new HazardInstanceListSelectionListener());

		// Initially, the buttons should be inactive
		PanelSystemAndSafetyProperties hazardPanel = dataPanel.getPanelSystemHazard();
		hazardPanel.getBtnAddSystemFunction().setEnabled(false);
		hazardPanel.getHazardInstanceTable().setEnabled(false);
		hazardPanel.getBtnAddHazardInstance().setEnabled(false);
		hazardPanel.getBtnEditHazardInstance().setEnabled(false);
		hazardPanel.getBtnRemoveSystemFunction().setEnabled(false);
		hazardPanel.getBtnRemoveHazardInstance().setEnabled(false);
	}

	/**
	 * Set the steps whose cells have been deleted to have their attribute
	 * hidden be true. Set the steps which have visible cells to not be hidden.
	 * <p>
	 * When a cell is deleted, we cannot remove its corresponding care process
	 * step from the model data, as this would compromise undo/redo
	 * functionality. Instead we mark steps as "hidden" when their corresponding
	 * cell is deleted, and "unhide" them if it is restored. Hidden cells can be
	 * deleted later, when we know they will not be needed for an undo. In the
	 * current (questionable) implementation, we delete hidden cells from the
	 * project when the project file is loaded.
	 * 
	 * @param cp
	 * @param g
	 */
	public void updateHideSteps() {
		CellStepConnector csc = new CellStepConnector();
		Iterator<Step> stepIterator = editorPanel.getCareProcess().getProcessGraph().getStep().iterator();
		// First, hide all steps.
		while (stepIterator.hasNext()) {
			Step s = stepIterator.next();
			s.setHidden(true);
		}
		// Then unhide those for which there is still an active cell in the
		// graph.
		int counter = 0;
		mxGraphComponent graphComponent = editorPanel.getGraphComponent();
		System.out.println(graphComponent.getGraph().isCellsDeletable());
		for (Object cell : graphComponent.getCells(graphComponent.getBounds())) {
			Step s = csc.getStepByAssociatedCellID(((mxCell) cell).getId());
			if (s != null) {
				s.setHidden(false);
				System.out.println("UNHIDING " + s.getName());
				counter++;
			}
		}

		if (Main.getMode() == ExecutionModes.DEVELOPER) {
			System.out.println("-----------------");
			Iterator<Step> stepIterator2 = editorPanel.getCareProcess().getProcessGraph().getStep().iterator();
			// First, hide all steps.
			while (stepIterator2.hasNext()) {
				Step s = stepIterator2.next();
				System.out.println(s);
			}
			System.out.println(Integer.toString(counter) + " out of "
					+ Integer.toString(editorPanel.getCareProcess().getProcessGraph().getStep().size())
					+ " cells are unhidden.");
		}

	}

	/**
	 * Put the serialised string form of the graph data into the processGraph
	 * instance in the data model.
	 * <p>
	 * This allows the standard EMF save utilities to persist the graph's data
	 * as well as the careProcess_model data model
	 */
	public void storeGraphData() {
		mxCodec codec = new mxCodec();
		String xml = mxXmlUtils.getXml(codec.encode(editorPanel.getGraphComponent().getGraph().getModel()));
		careProcess.getProcessGraph().setGraphData(xml);
		careProcess.getProcessGraph().setDataMap(editorPanel.getCellStepConnector().getSerialisedDataMapTable());
		Main.saveProject();
	}

	/**
	 * load the graph data from the XML string into the given mxGraph.
	 * 
	 * @param xmlData
	 * @param graph
	 */
	public void readGraphData(String xmlData, mxGraph graph) {
		try {
			Document document = mxXmlUtils.parseXml(xmlData);
			mxCodec codec = new mxCodec(document);
			codec.decode(document.getDocumentElement(), graph.getModel());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Delete leftover Step instances which have no node in the current graph.
	 * These are sometimes left behind as a result of undo functionality.
	 * 
	 * @param careProcess2
	 */
	public void cleanGraphData(CareProcess careProcess, mxGraph graph, CellStepConnector csc) {
		// TODO Auto-generated method stub
		System.out.println("Called");

		ArrayList<Step> stepRemovalList = new ArrayList<Step>();

		for (Step s : careProcess.getProcessGraph().getStep()) {
			String stepID = s.getUUID();

			boolean cellForThisStepFound = false;

			Object[] cells = graph.getChildCells(graph.getDefaultParent());

			for (Object c : cells) {
				Step associatedStep = csc.getStepByAssociatedCellID(((mxCell) c).getId());
				if (associatedStep != null) {
					if ((associatedStep).getUUID().equals(stepID)) {
						cellForThisStepFound = true;
						break;
					}
				}
			}
			if (cellForThisStepFound == false) {
				stepRemovalList.add(s);
			}
		}

		processRemovalsList(stepRemovalList);
	}

	private void processRemovalsList(ArrayList<Step> stepRemovalList) {
		for (Step s2 : stepRemovalList) {
			System.out.println("REMOVING STEP: " + s2.getName());
			if (s2.getProcessGraph() != null) {
				s2.getProcessGraph().getStep().remove(s2);
			}
			if (s2.getLocation() != null) {
				s2.getLocation().getSteps().remove(s2);
			}
			ArrayList<SystemFunction> removeFromFunctions = new ArrayList<SystemFunction>();
			ArrayList<HazardInstance> removeFromHazardInstances = new ArrayList<HazardInstance>();

			for (SystemFunction f : s2.getAssociatedSystemFunctions()) {
				removeFromFunctions.add(f);
			}
			for (HazardInstance hi : s2.getHazardInstances()) {
				removeFromHazardInstances.add(hi);
			}

			for (SystemFunction sf : removeFromFunctions) {
				sf.getAssociatedSteps().remove(s2);
			}

			for (HazardInstance hi : removeFromHazardInstances) {
				hi.setStep(null);
			}

			EcoreUtil.delete(s2);
		}
	}

	/**
	 * Update the selected part of the data panel using the contents of an
	 * ordered ArrayList of data.
	 * <p>
	 * Each index in <code>content</code> refers to a specific piece of data:
	 * For t = ACTIVITY_PROPERTIES, 0 = (String) activity name, 1 = (Object) for
	 * t = COMBO_BOX, the array is the list of objects to fill the combox box.
	 * location, 2 = (String) description;
	 * 
	 * ACTIVATE and DEACTIVATE are special modes which cause the panels to
	 * become editable or uneditable respectively.
	 * 
	 * @param t
	 * @param content
	 */
	public void updateDataPanel(UpdateType t, Object[] content) {
		PanelActivityProperties panelActivityProperties = dataPanel.getPanelActivityProperties();
		switch (t) {
		case LOCATION_COMBO_BOX:
			Object[] elements = Main.getProject().getDatastore().getLocationrepository().getLocationDefinitions()
					.toArray();
			panelActivityProperties.getLocationComboBox().setModel(new DefaultComboBoxModel(elements));
			if (elements.length > 0) {
				panelActivityProperties.getLocationComboBox().setSelectedItem(null);
			}
			break;
		case ACTIVITY_PROPERTIES:
			panelActivityProperties.changeActivation(true);
			panelActivityProperties.getActivityNameTextField().grabFocus();
			panelActivityProperties.getActivityNameTextField().selectAll();
			panelActivityProperties.getActivityNameTextField().setText((String) content[0]);
			panelActivityProperties.getLocationComboBox().setSelectedItem((Object) content[1]);
			panelActivityProperties.getDescriptionEditorPane().setText((String) content[2]);
			break;
		case DEACTIVATE:
			panelActivityProperties.changeActivation(false);
			break;
		default:
			break;

		}
	}

	/**
	 * Update the label of the given cell and update the Step instance that is
	 * linked to it.
	 * 
	 * <p>
	 * An mxCell is a visible node of the graph, while a Step is an object of
	 * the data model which stores certain properties. Activity, Decision and
	 * Start/Stop instance implement 'Step'.
	 * 
	 * @param t
	 *            ACTIVITY_PROPERTIES. Should be removed in a later version. Not
	 *            needed anymore.
	 * @param content
	 *            An 3 object array defining the data to be places in the Step.
	 *            content[0] is the name string of the Step. content[1] is the
	 *            associated LocationDefinition object. content[2] is the
	 *            description string of the Step.
	 * @param cell
	 */
	public void updateCellValue(UpdateType t, Object[] content, mxCell cell) {

		CustomGraphComponent graphComponent = (CustomGraphComponent) editorPanel.getGraphComponent();
		mxGraph graph = graphComponent.getGraph();
		if (cell == null) {
			cell = (mxCell) graph.getSelectionCell();
		}
		switch (t) {
		case ACTIVITY_PROPERTIES:
			if (cell != null) {
				if (editorPanel.getCellStepConnector().getStepByAssociatedCellID(cell.getId()) instanceof Step) {
					if (content == null) {
						content = new Object[3];
						content[0] = dataPanel.getPanelActivityProperties().getActivityNameTextField().getText();
						content[1] = dataPanel.getPanelActivityProperties().getLocationComboBox().getSelectedItem();
						content[2] = dataPanel.getPanelActivityProperties().getDescriptionEditorPane().getText()
								.toString();
					}
					Step step = editorPanel.getCellStepConnector().getStepByAssociatedCellID(cell.getId());
					// We could label the boxes with any attribute of the
					// current step, or indeed any string here.

					// Sets the label for the cell
					cell.setValue((String) content[0]);

					// Updates the data in the corresponding Step instance.
					step.setName((String) content[0]);
					step.setLocation((LocationDefinition) content[1]);
					step.setDescription((String) content[2]);
				}
			}
			break;
		default:
			break;
		}
		// Refresh the graph so that the new label is shown;
		graph.refresh();

	}

	/**
	 * Update the activation of the Hazard Properties panel and its elements.
	 */
	public void updatePanelActivation() {
		PanelSystemAndSafetyProperties hazardPanel = dataPanel.getPanelSystemHazard();
		mxCell c = (mxCell) editorPanel.getGraphComponent().getGraph().getSelectionCell();
		if (c != null) {
			if (editorPanel.getCellStepConnector().getStepByAssociatedCellID(c.getId()) instanceof Step) {
				stepType typeOfStep = ((Step) editorPanel.getCellStepConnector().getStepByAssociatedCellID(c.getId()))
						.getStepTypeValue();

				if (typeOfStep.equals(stepType.ACTIVITY) || typeOfStep.equals(stepType.DECISION)) {

					hazardPanel.getSystemFunctionsTree().setEnabled(true);
					hazardPanel.getBtnAddSystemFunction().setEnabled(true);
					if ((DefaultMutableTreeNode) hazardPanel.getSystemFunctionsTree()
							.getLastSelectedPathComponent() != null) {
						hazardPanel.getHazardInstanceTable().setEnabled(true);
						hazardPanel.getBtnAddHazardInstance().setEnabled(true);
						hazardPanel.getBtnRemoveSystemFunction().setEnabled(true);
						System.out.println(dataPanel.getPanelSystemHazard().getHazardInstanceTable().getSelectedRow());
						if (dataPanel.getPanelSystemHazard().getHazardInstanceTable().getSelectedRow() != -1) {
							hazardPanel.getBtnRemoveHazardInstance().setEnabled(true);
							hazardPanel.getBtnEditHazardInstance().setEnabled(true);
						} else {
							hazardPanel.getBtnRemoveHazardInstance().setEnabled(false);
							hazardPanel.getBtnEditHazardInstance().setEnabled(false);
						}
					} else {
						hazardPanel.getHazardInstanceTable().setEnabled(false);
						hazardPanel.getBtnAddHazardInstance().setEnabled(false);
						hazardPanel.getBtnEditHazardInstance().setEnabled(false);
						hazardPanel.getBtnRemoveSystemFunction().setEnabled(false);
						hazardPanel.getBtnRemoveHazardInstance().setEnabled(false);
					}
				} else {
					hazardPanel.getSystemFunctionsTree().setEnabled(false);
					hazardPanel.getBtnAddSystemFunction().setEnabled(false);
					hazardPanel.getHazardInstanceTable().setEnabled(false);
					hazardPanel.getBtnAddHazardInstance().setEnabled(false);
					hazardPanel.getBtnEditHazardInstance().setEnabled(false);
					hazardPanel.getBtnRemoveSystemFunction().setEnabled(false);
					hazardPanel.getBtnRemoveHazardInstance().setEnabled(false);
				}
			}

		} else {

			hazardPanel.getSystemFunctionsTree().setEnabled(false);
			hazardPanel.getBtnAddSystemFunction().setEnabled(false);
			hazardPanel.getHazardInstanceTable().setEnabled(false);
			hazardPanel.getBtnAddHazardInstance().setEnabled(false);
			hazardPanel.getBtnEditHazardInstance().setEnabled(false);
			hazardPanel.getBtnRemoveSystemFunction().setEnabled(false);
			hazardPanel.getBtnRemoveHazardInstance().setEnabled(false);
		}
	}

	/**
	 * Fire {@link #updateCellValue(UpdateType, Object[], mxCell)} to update the
	 * data for the currently selected step.
	 */
	private void updateCurrentStepData() {
		mxCell c = (mxCell) editorPanel.getGraphComponent().getGraph().getSelectionCell();
		if (c != null && c.isVertex()) {

			updateCellValue(UpdateType.ACTIVITY_PROPERTIES, null, c);
		}
	}

	/**
	 * Populate the list of hazard instances associated with a given step and
	 * system function.
	 * 
	 * @param s
	 * @param f
	 */
	public void populateHazardInstancesList(Step s, SystemFunction f) {
		if (f != null) {
			HazardInstanceTableModel model = getHazardInstanceTableModel(s, f);
			dataPanel.getPanelSystemHazard().getHazardInstanceTable().setModel(model);
		}
	}

	/**
	 * Clear the list of hazard instances
	 */
	private void clearHazardInstancesList() {
		dataPanel.getPanelSystemHazard().getHazardInstanceTable().setModel(new HazardInstanceTableModel(null, null));
	}

	/**
	 * Populate the tree of system functions associated with a given step.
	 * 
	 * @param step
	 * @param systemTree
	 */
	public void populateSystemFunctionsTree(Step step) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for (Object s : step.getAssociatedSystemFunctions()) {
			DefaultMutableTreeNode systemFunctionNode = new DefaultMutableTreeNode((SystemFunction) s);
			root.add(systemFunctionNode);
		}
		dataPanel.getPanelSystemHazard().getSystemFunctionsTree().setModel(new DefaultTreeModel(root));
	}

	/**
	 * Select the given system function in its explorer.
	 * 
	 * @param o
	 *            The system function to be selected.
	 */
	public void selectSystemFunctionNodeByObject(Object o) {
		DefaultMutableTreeNode root = (DefaultMutableTreeNode) dataPanel.getPanelSystemHazard().getSystemFunctionsTree()
				.getModel().getRoot();
		TreePath t = WorkerUtilities.getNodePathByObject(root, o);
		if (t != null) {
			dataPanel.getPanelSystemHazard().getSystemFunctionsTree().setSelectionPath(t);
			dataPanel.getPanelSystemHazard().getSystemFunctionsTree().scrollPathToVisible(t);
		}
	}

	/**
	 * Create and return the table model containing all the hazard instances
	 * associated with the given hazard definition. This can be used to populate
	 * the navigator table of hazard instances.
	 * 
	 * @param f
	 *            The system function whose associated hazard instances should
	 *            be in the list.
	 * @return The generated HazardInstanceTableModel
	 */
	private HazardInstanceTableModel getHazardInstanceTableModel(Step s, SystemFunction f) {

		Iterator<HazardInstance> hazardInstances = f.getHazardInstances().iterator();
		ArrayList<HazardInstance> associatedInstances = new ArrayList<HazardInstance>();
		// We only want the hazard instances whose step and function are the
		// specified ones.
		while (hazardInstances.hasNext()) {
			HazardInstance currentInstance = hazardInstances.next();
			if (currentInstance.getStep() != null) {
				if (currentInstance.getStep().equals(s)) {
					associatedInstances.add(currentInstance);
				}
			}
		}

		Object[] labels = new Object[4];
		Object[][] data = new Object[associatedInstances.size()][4];

		labels[0] = "Name";
		labels[1] = "Hazard Type";
		labels[2] = "Initial Risk Rating";
		labels[3] = "Residual Risk Rating";

		int row = 0;
		for (HazardInstance currentInstance : associatedInstances) {
			data[row][0] = currentInstance.getName();
			data[row][1] = currentInstance.getHazardDefinition().getHazardName();
			data[row][2] = currentInstance.getInitialRiskRating();
			data[row][3] = currentInstance.getResidualRiskRating();
			row++;
		}
		return new HazardInstanceTableModel(data, labels);
	}

	/**
	 * Listener for selecting system functions in the system function tree.
	 *
	 */
	private class systemFunctionTreeSelectionListener implements TreeSelectionListener {
		@Override
		public void valueChanged(TreeSelectionEvent e) {
			updatePanelActivation();
			System.out.println("Selection Change");
			DefaultMutableTreeNode newNode = (DefaultMutableTreeNode) ((JTree) e.getSource())
					.getLastSelectedPathComponent();
			if (newNode != null) {
				mxCell c = (mxCell) editorPanel.getGraphComponent().getGraph().getSelectionCell();
				if (c != null && c.isVertex()) {
					if (editorPanel.getCellStepConnector().getStepByAssociatedCellID(c.getId()) instanceof Step) {
						lastSelectedFunction = (SystemFunction) newNode.getUserObject();
						populateHazardInstancesList(
								(Step) editorPanel.getCellStepConnector().getStepByAssociatedCellID(c.getId()),
								(SystemFunction) newNode.getUserObject());

					}
				}
			} else {
				clearHazardInstancesList();
			}

			System.out.println(lastSelectedFunction);
		}
	}

	/**
	 * Listener for the care setting combo-box, fires careSettingUpdated() when
	 * changed.
	 */
	private class ItemChangeListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				updateCurrentStepData();
			}

		}
	}

	/*
	 * Listener for changes in selection of hazard instance table
	 */
	private class HazardInstanceListSelectionListener implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			updatePanelActivation();
		}

	}

	/**
	 * Listener for change of text fields in the data panel
	 */
	public class PropertyEditListener implements DocumentListener {

		PanelActivityProperties panel;

		public PropertyEditListener(PanelActivityProperties panelIn) {
			panel = panelIn;
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			modified();
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			modified();
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			modified();
		}

		public void modified() {
			updateCurrentStepData();
		}

	}

	private HazardInstance getSelectedHazardInstance(SystemFunction f) {
		int selectedRow = dataPanel.getPanelSystemHazard().getHazardInstanceTable().getSelectedRow();
		if (selectedRow != -1) {
			return f.getHazardInstances().get(selectedRow);
		}
		return null;
	}

	/**
	 * Add a new hazard instance to the selected cell's Step instance.
	 *
	 */
	private class AddHazardInstanceButtonAction extends AbstractAction {
		public AddHazardInstanceButtonAction() {
			putValue(NAME, "Add Hazard Instance");
			putValue(SHORT_DESCRIPTION, "Associate a new hazard instance with the selected system function");
		}

		public void actionPerformed(ActionEvent e) {
			mxCell c = (mxCell) editorPanel.getGraphComponent().getGraph().getSelectionCell();
			if (c != null) {
				if (editorPanel.getCellStepConnector().getStepByAssociatedCellID(c.getId()) instanceof Step) {
					DefaultMutableTreeNode systemSelected = (DefaultMutableTreeNode) dataPanel.getPanelSystemHazard()
							.getSystemFunctionsTree().getLastSelectedPathComponent();
					if (systemSelected != null) {
						Step associatedStep = ((Step) editorPanel.getCellStepConnector()
								.getStepByAssociatedCellID(c.getId()));
						HazardInstance newHazardInstance = CareProcess_modelFactory.eINSTANCE.createHazardInstance();
						FunctionalHazardDefinitionDialog d = new FunctionalHazardDefinitionDialog(false, null,
								(SystemFunction) systemSelected.getUserObject(), associatedStep, newHazardInstance,
								editorPanel);
						d.pack();
						d.setVisible(true);
					}
				}
			}
		}
	}

	private class EditHazardInstanceButtonAction extends AbstractAction {
		public EditHazardInstanceButtonAction() {
			putValue(NAME, "Edit Hazard Instance");
			putValue(SHORT_DESCRIPTION, "Edit the selected hazard instance");
		}

		public void actionPerformed(ActionEvent e) {
			if (lastSelectedFunction != null) {
				HazardInstance selectedHazardInstance = getSelectedHazardInstance(lastSelectedFunction);
				if (selectedHazardInstance != null) {
					FunctionalHazardDefinitionDialog d = new FunctionalHazardDefinitionDialog(true, null,
							lastSelectedFunction, selectedHazardInstance.getStep(), selectedHazardInstance,
							editorPanel);
					d.pack();
					d.setVisible(true);
				}
			}
		}
	}

	/**
	 * Open the dialog to associate a system function with the currently
	 * selected step.
	 *
	 */
	private class AddSystemFunctionButtonAction extends AbstractAction {
		public AddSystemFunctionButtonAction() {
			putValue(NAME, "Select System Function");
			putValue(SHORT_DESCRIPTION, "Associate a system function with the selected step");
		}

		public void actionPerformed(ActionEvent e) {
			mxCell c = (mxCell) editorPanel.getGraphComponent().getGraph().getSelectionCell();
			if (c != null) {
				if (editorPanel.getCellStepConnector().getStepByAssociatedCellID(c.getId()) instanceof Step) {
					Step associatedStep = ((Step) editorPanel.getCellStepConnector()
							.getStepByAssociatedCellID(c.getId()));
					SystemFunctionSelectionDialog d = new SystemFunctionSelectionDialog(null, associatedStep,
							(DialogParentPanel) editorPanel);
					d.pack();
					d.setVisible(true);
				}
			}
		}
	}

	private class RemoveHazardInstanceButtonAction extends AbstractAction {
		public RemoveHazardInstanceButtonAction() {
			putValue(NAME, "Remove Hazard Instance");
			putValue(SHORT_DESCRIPTION, "Remove the selected hazard instance");
		}

		public void actionPerformed(ActionEvent e) {
			if (lastSelectedFunction != null) {
				HazardInstance selectedHazardInstance = getSelectedHazardInstance(lastSelectedFunction);
				if (selectedHazardInstance != null) {
					lastSelectedFunction.getHazardInstances().remove(selectedHazardInstance);
					editorPanel.refresh();
				}
			}
		}
	}

	private class RemoveSystemFunctionButtonAction extends AbstractAction {
		public RemoveSystemFunctionButtonAction() {
			putValue(NAME, "Remove System Function");
			putValue(SHORT_DESCRIPTION, "Remove the selected system function");
		}

		public void actionPerformed(ActionEvent e) {
			mxCell c = (mxCell) editorPanel.getGraphComponent().getGraph().getSelectionCell();
			if (c != null) {
				if (lastSelectedFunction != null) {
					Step associatedStep = ((Step) editorPanel.getCellStepConnector()
							.getStepByAssociatedCellID(c.getId()));
					associatedStep.getAssociatedSystemFunctions().remove(lastSelectedFunction);
					editorPanel.refresh();
				}
			}

		}
	}

	// TODO Last cell methods may no longer be needed. Check and
	// refactor/delete.
	public mxCell getLastCell() {
		return lastCell;
	}

	public void updateLastCell() {
		if ((mxCell) editorPanel.getGraphComponent().getGraph().getSelectionCell() != null) {
			lastCell = (mxCell) editorPanel.getGraphComponent().getGraph().getSelectionCell();
		}
	}

	public CareProcess getCareProcess() {
		return careProcess;
	}

	public SystemFunction getLastSelectedFunction() {
		return lastSelectedFunction;
	}

	public enum UpdateType {
		DEACTIVATE, LOCATION_COMBO_BOX, ACTIVITY_PROPERTIES;
	}

}
