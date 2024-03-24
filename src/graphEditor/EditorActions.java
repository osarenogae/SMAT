package graphEditor;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JDialog;
import javax.swing.JTextField;

import com.mxgraph.model.mxCell;
import com.mxgraph.view.mxGraph;

import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelFactory;
import careProcess_model.LocationDefinition;
import careProcess_model.LocationRepository;
import dialogs.NewLocationDialog;
import graphEditor.CustomGraphComponent.EditMode;
import main.Main;
import userInterface.DialogContent;
import userInterface.CardPanelCareProcessEditor;
import userInterface.CareProcessEditor_Worker;
import userInterface.CareProcessEditor_Worker.UpdateType;
import userInterface.WorkerUtilities;
import utilities.DataHelper;

public class EditorActions {

	/**
	 * Returns the <code>GraphEditorPanel2</code> instance from which the given
	 * action event originated
	 * 
	 * @param e
	 *            The action event whose source is to be found
	 * @return the <code>GraphEditorPanel2</code> instance for the given action
	 *         event.
	 */
	public static final GraphEditorPanel2 getEditor(ActionEvent e) {
		if (e.getSource() instanceof Component) {
			Component component = (Component) e.getSource();

			while (component != null && !(component instanceof GraphEditorPanel2)) {
				component = component.getParent();
			}

			return (GraphEditorPanel2) component;
		}

		return null;
	}

	public static void saveGraph(CardPanelCareProcessEditor editor, CareProcess careProcess) {
		editor.getWorkerByCareProcess(careProcess).storeGraphData();
	}

	public static class SaveAction extends AbstractAction {

		CardPanelCareProcessEditor editor;
		CareProcess careProcess;

		public SaveAction(CardPanelCareProcessEditor careProcessEditorPanelIn, CareProcess cp) {
			editor = careProcessEditorPanelIn;
			careProcess = cp;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			saveGraph(editor, careProcess);
		}
	}

	/**
	 * The action to be used for changing the editor mode.
	 *
	 */
	public static class ModeChangeAction extends AbstractAction {
		private GraphEditorPanel2 editorPanel;
		private EditMode mode;

		public ModeChangeAction(GraphEditorPanel2 editor, EditMode m) {
			editorPanel = editor;
			mode = m;
		}

		public void actionPerformed(ActionEvent e) {
			editorPanel.setEditMode(mode);
			editorPanel.modeChanged();
		}
	}

	/**
	 * The action to be used for undoing and redoing graph edit events.
	 *
	 */
	public static class HistoryAction extends AbstractAction {

		protected boolean undo;

		public HistoryAction(boolean undo) {
			this.undo = undo;
		}

		public void actionPerformed(ActionEvent e) {
			GraphEditorPanel2 editor = getEditor(e);
			if (editor != null) {
				if (undo) {
					editor.getUndoManager().undo();
				} else {
					editor.getUndoManager().redo();
				}
				// Make sure the undo/redo buttons are active or inactive as
				// appropriate based on undo/redo possibility.
				editor.updateUndoButtons();
			}
		}
	}

	public static class DeleteAction extends AbstractAction {
		public void actionPerformed(ActionEvent e) {
			System.out.println("TRIED TO DELETE");
			GraphEditorPanel2 editor = getEditor(e);
			mxGraph graph = editor.getGraphComponent().getGraph();
			ArrayList<Object> cellsToRemove = new ArrayList<Object>();
			for (Object c : graph.getSelectionCells()) {
				// If the selected cell is the start cell, we cannot delete it.
				if (!((mxCell) c).getId().equals(GraphEditorPanel2.START_SYMBOL_ID)) {
					cellsToRemove.add(c);
				}
			}
			editor.getGraphComponent().getGraph().removeCells(cellsToRemove.toArray());
		}
	}

	public static class AddLocationDialogAction extends AbstractAction {
		CardPanelCareProcessEditor careProcessEditor;
		CareProcess careProcess;

		public AddLocationDialogAction(CardPanelCareProcessEditor careProcessEditorIn, CareProcess careProcessIn) {
			careProcessEditor = careProcessEditorIn;
			careProcess = careProcessIn;
		}

		public void actionPerformed(ActionEvent e) {
			System.out.println("Add location pressed");
			NewLocationDialog d = new NewLocationDialog(careProcessEditor, careProcess);
			d.pack();
			d.setVisible(true);
		}
	}

	public static class InsertNewLocationAction extends AbstractAction {
		LocationRepository locRepo;
		JTextField nameField;
		String description;
		JDialog dialog;
		CardPanelCareProcessEditor careProcessEditor;
		CareProcess careProcess;

		public InsertNewLocationAction(LocationRepository locRepoIn, CardPanelCareProcessEditor careProcessEditorIn,
				JTextField nameFieldIn, JDialog dialogIn, CareProcess careProcessIn) {
			locRepo = locRepoIn;
			nameField = nameFieldIn;
			dialog = dialogIn;
			careProcessEditor = careProcessEditorIn;
			careProcess= careProcessIn;
		}

		public void actionPerformed(ActionEvent e) {
			System.out.println(locRepo);
			if (!DataHelper.checkForSameLocationName(locRepo, nameField.getText(), null)) {
				LocationDefinition loc = CareProcess_modelFactory.eINSTANCE.createLocationDefinition();
				loc.setLocationName(nameField.getText());
				locRepo.getLocationDefinitions().add(loc);
				careProcessEditor.getWorkerByCareProcess(careProcess).updateDataPanel(UpdateType.LOCATION_COMBO_BOX,
						Main.getProject().getDatastore().getLocationrepository().getLocationDefinitions().toArray());
				dialog.dispose();
			} else {
				WorkerUtilities.showWarningDialog(DialogContent.DUPLICATE_LOCATION_SAVE_DIALOG_TITLE,
						DialogContent.DUPLICATE_LOCATION_SAVE_DIALOG_MESSAGE, dialog);
			}
		}
	}

}
