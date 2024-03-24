package userInterface;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.mxgraph.model.mxCell;
import com.mxgraph.view.mxGraph;

import careProcess_model.CareProcess;
import graphEditor.CustomGraphComponent;
import graphEditor.GraphEditorPanel2;
import userInterface.CareProcessEditor_Worker.UpdateType;
import utilities.DataHelper;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

/**
 * The panel used in the care process editor to display and edit data for a care
 * process step.
 */
public class EditorDataPanel extends JPanel {
	private JTabbedPane tabbedPane;
	private PanelActivityProperties panelActivityProperties;
	private CardPanelCareProcessEditor editor;

	private mxCell previousCell;
	private PanelSystemAndSafetyProperties panelSystemAndSafetyProperties;

	private CareProcess careProcess;

	/**
	 * Create the panel.
	 */
	public EditorDataPanel(CardPanelCareProcessEditor careProcessEditor, CareProcess careProcesIn) {
		editor = careProcessEditor;
		careProcess = careProcesIn;

		setLayout(new BorderLayout(0, 0));

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane);

		panelActivityProperties = new PanelActivityProperties(careProcessEditor, careProcess);
		tabbedPane.addTab("Activity Properties", null, panelActivityProperties, null);

		panelSystemAndSafetyProperties = new PanelSystemAndSafetyProperties();
		panelSystemAndSafetyProperties.getBtnAddSystemFunction().setText("Select System Function");
		tabbedPane.addTab("System and Safety Properties", null, panelSystemAndSafetyProperties, null);

	}

	public PanelActivityProperties getPanelActivityProperties() {
		return panelActivityProperties;
	}

	/**
	 * Pass on the data from the editor panel to the worker method that will
	 * update the Step data object corresponding to the current cell.
	 */
	public void updateCellValue() {
		if (previousCell == null) {

			previousCell = (mxCell) editor.getWorkerByCareProcess(careProcess).getLastCell();
		}
		String name = panelActivityProperties.getActivityNameTextField().getText();
		String description = panelActivityProperties.getDescriptionEditorPane().getText().toString();
		if (DataHelper.isStringEmpty(name)) {
			name = null;
		}
		if (DataHelper.isStringEmpty(description)) {
			description = null;
		}
		Object[] data = new Object[] { name, panelActivityProperties.getLocationComboBox().getSelectedItem(),
				description };
		editor.getWorkerByCareProcess(careProcess).updateCellValue(UpdateType.ACTIVITY_PROPERTIES, data, previousCell);
	}

	public PanelSystemAndSafetyProperties getPanelSystemHazard() {
		return panelSystemAndSafetyProperties;
	}
}
