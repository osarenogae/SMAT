package userInterface;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ResourceBundle;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

import org.eclipse.emf.common.util.EList;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelFactory;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
import dialogs.NewCareProcessDialog;
import graphEditor.CellStepConnector;
import graphEditor.EditorActions;
import graphEditor.GraphEditorPanel2;
import guiComponents.CustomTabbedPane;
import main.Main;

/**
 * The JPanel that holds all the components of the care process editor and,
 * together with its corresponding 'Worker' class, defines their behaviour.
 * <p>
 * Each tab has its own GraphEditorPanel and EditorDataPanel and corresponding
 * CareProcessEditor_Worker. A Care process instance is associated to each of
 * these components and used to identify them.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class CardPanelCareProcessEditor extends JPanel implements DialogParentPanel, EditorView {

	ArrayList<GraphEditorPanel2> graphEditorPanels = new ArrayList<GraphEditorPanel2>();
	ArrayList<EditorDataPanel> editorDataPanels = new ArrayList<EditorDataPanel>();
	Hashtable<CareProcess, CareProcessEditor_Worker> processWorkerTable = new Hashtable<CareProcess, CareProcessEditor_Worker>();

	private CustomTabbedPane tabbedPane;

	public CardPanelCareProcessEditor(EList<CareProcess> careProcessesIn) {
		setLayout(new BorderLayout(0, 0));

		JPanel CareProcessEditorPanel = new JPanel();
		add(CareProcessEditorPanel);
		tabbedPane = new CustomTabbedPane(JTabbedPane.TOP);

		CareProcessEditorPanel.setLayout(new BorderLayout(0, 0));
		CareProcessEditorPanel.add(tabbedPane);

		Iterator<CareProcess> careProcessIterator = careProcessesIn.iterator();
		int counter = 0;
		while (careProcessIterator.hasNext()) {
			CareProcess careProcess = careProcessIterator.next();

			EditorDataPanel editorDataPanel = new EditorDataPanel(this, careProcess);
			editorDataPanels.add(editorDataPanel);

			GraphEditorPanel2 graphEditorPanel2 = new GraphEditorPanel2(careProcess, this);
			graphEditorPanels.add(graphEditorPanel2);

			tabbedPane.addTab(careProcess.getName(), null, editorDataPanel, graphEditorPanel2, null);
			
			CareProcessEditor_Worker worker = new CareProcessEditor_Worker(careProcess, this, editorDataPanel,
					graphEditorPanel2);
			
			processWorkerTable.put(careProcess, worker);
			
			// Add the cross button to the tab
			initialiseTabComponent(tabbedPane.getTabCount() - 1);

			// Load the existing graph, if there is one
			if (careProcess.getProcessGraph().getGraphData() != null) {
				worker.readGraphData(careProcess.getProcessGraph().getGraphData(),
						graphEditorPanel2.getGraphComponent().getGraph());
			}
			

			worker.cleanGraphData(careProcess, graphEditorPanel2.getGraphComponent().getGraph(),graphEditorPanel2.getCellStepConnector());

			
			
			counter++;
		}

	}

	/**
	 * Show the dialog for creating a new care process
	 */
	public void createNewCareProcess() {
		NewCareProcessDialog d = new NewCareProcessDialog(this, this, null);
		d.pack();
		d.setVisible(true);
	}

	/**
	 * Add a new care process with the given name and description and go to its
	 * tab.
	 * 
	 * @param name
	 * @param description
	 */
	public void addNewCareProcess(String name, String description) {
		CareProcess careProcess = CareProcess_modelFactory.eINSTANCE.createCareProcess();
		careProcess.setName(name);
		careProcess.setDescription(description);
		careProcess.setProcessGraph(CareProcess_modelFactory.eINSTANCE.createprocessGraph());
		Main.getProject().getCareProcesses().add(careProcess);

		makeTabForCareProcess(careProcess);
	}

	/**
	 * Delete the tab representing the given care process, if it exists. Names
	 * are used as identifiers, so they must be unique.
	 * 
	 * @param c
	 */
	public void removeTabForCareProcess(CareProcess c) {
		for (int i = 0; i < tabbedPane.getTabCount(); i++) {
			if (tabbedPane.getCareProcessAtTabIndex(i).equals(c)) {
				tabbedPane.remove(i);
			}
		}
	}

	/**
	 * Make and show a new tab for the given care process
	 * 
	 * @param careProcess
	 */
	public void makeTabForCareProcess(CareProcess careProcess) {
		EditorDataPanel editorDataPanel = new EditorDataPanel(this, careProcess);
		editorDataPanels.add(editorDataPanel);

		GraphEditorPanel2 graphEditorPanel2 = new GraphEditorPanel2(careProcess, this);
		graphEditorPanels.add(graphEditorPanel2);

		tabbedPane.addTab(careProcess.getName(), null, editorDataPanel, graphEditorPanel2, null);

		CareProcessEditor_Worker worker = new CareProcessEditor_Worker(careProcess, this, editorDataPanel,
				graphEditorPanel2);
		processWorkerTable.put(careProcess, worker);

		// Select the tab for the new care process
		tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);

		// Add the cross button to the tab
		initialiseTabComponent(tabbedPane.getTabCount() - 1);

		// Load the existing graph, if there is one
		System.out.println("Reading graph data");
		if (careProcess.getProcessGraph().getGraphData() != null) {
			worker.readGraphData(careProcess.getProcessGraph().getGraphData(),
					graphEditorPanel2.getGraphComponent().getGraph());			
			worker.cleanGraphData(careProcess, graphEditorPanel2.getGraphComponent().getGraph(),graphEditorPanel2.getCellStepConnector());
		}
	}

	/**
	 * Attempt to switch to the tab showing the given care process, returning
	 * true if this is possible (i.e. that care process is already open).
	 * 
	 * @param c
	 * @return true if the given care process is already open in a tab, false
	 *         otherwise.
	 */
	public boolean showTabForCareProcess(CareProcess c) {
		for (int i = 0; i < tabbedPane.getTabCount(); i++) {
			if (c != null) {
				if (tabbedPane.getCareProcessAtTabIndex(i).equals(c)) {
					tabbedPane.setSelectedIndex(i);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Refresh the tab names to ensure they are consistent with the names of
	 * their respective care process instances
	 */
	public void refreshTabNames() {
		for (int i = 0; i < tabbedPane.getTabCount(); i++) {
			tabbedPane.setTitleAt(i, tabbedPane.getCareProcessAtTabIndex(i).getName());
		}
	}

	/**
	 * Add the cross button to the tab at index i
	 * 
	 * @param i
	 */
	private void initialiseTabComponent(int i) {
		tabbedPane.setTabComponentAt(i, new ButtonTabComponent(tabbedPane));
	}

	/**
	 * Find the worker corresponding to the given CareProcess instance.
	 * 
	 * @param careProcess
	 * @return
	 */
	public CareProcessEditor_Worker getWorkerByCareProcess(CareProcess careProcess) {
		return processWorkerTable.get(careProcess);
	}

	@Override
	public void refresh() {
		for (GraphEditorPanel2 g : graphEditorPanels) {
			g.refresh();
		}
		refreshTabNames();
	}

	@Override
	public boolean tryCloseView() {
		Enumeration<CareProcess> careProcesses = processWorkerTable.keys();
		while (careProcesses.hasMoreElements()) {
			CareProcessEditor_Worker editorWorker = processWorkerTable.get(careProcesses.nextElement());
			editorWorker.updateHideSteps();
		}
		return true;
	}

	@Override
	public boolean saveAndClose() {
		return true;
	}

	@Override
	public void save() {
		// TODO Saves all the unsaved graphs automatically. Should prompt user
		// to check this is ok.
		Enumeration<CareProcess> careProcesses = processWorkerTable.keys();
		while (careProcesses.hasMoreElements()) {
			CareProcessEditor_Worker editorWorker = processWorkerTable.get(careProcesses.nextElement());
			editorWorker.updateHideSteps();
			editorWorker.storeGraphData();
		}
		EditorActions.saveGraph(this, tabbedPane.getCareProcessAtTabIndex(tabbedPane.getSelectedIndex()));
	}
}
