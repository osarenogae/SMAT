package dialogs;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import careProcess_model.CareProcess;
import careProcess_model.LocationRepository;
import graphEditor.EditorActions;
import main.Main;
import userInterface.CardPanelCareProcessEditor;
import userInterface.CareProcessEditor_Worker;
import userInterface.PanelAddLocation;
import utilities.DataHelper;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class NewLocationDialog extends JDialog {
	LocationRepository locRepo;

	PanelAddLocation panelAddLocation;

	private final Action action = new CancelAction();

	/**
	 * Initialise the NewLocation dialog, ensuring that it always stays on top
	 * of the main window.
	 */
	public NewLocationDialog(CardPanelCareProcessEditor careProcessEditorIn, CareProcess careProcessIn) {

		this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		setTitle("Add a new care setting...");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			panelAddLocation = new PanelAddLocation();
			panelAddLocation.getBtnCancel().setAction(action);

			getContentPane().add(panelAddLocation, BorderLayout.CENTER);
		}

		this.panelAddLocation.getBtnAddLocation().setAction(new EditorActions.InsertNewLocationAction(
				Main.getProject().getDatastore().getLocationrepository(), careProcessEditorIn, this.panelAddLocation.getNameTextField(), this, careProcessIn));
		this.panelAddLocation.getBtnAddLocation().setText("Add Care Setting");
		this.panelAddLocation.getNameTextField().getDocument().addDocumentListener(new UpdateNameListener());
		updateAddButtonActivation();
	}

	/**
	 * Activates the "add care setting" button only when the name text field is not
	 * empty; Deactivates it otherwise.
	 */
	private void updateAddButtonActivation() {
		if (DataHelper.isStringEmpty(this.panelAddLocation.getNameTextField().getText())) {
			panelAddLocation.getBtnAddLocation().setEnabled(false);
		} else {
			panelAddLocation.getBtnAddLocation().setEnabled(true);
		}
	}

	private class CancelAction extends AbstractAction {
		public CancelAction() {
			putValue(NAME, "Cancel");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	private class UpdateNameListener implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent e) {
			updateAddButtonActivation();
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			updateAddButtonActivation();
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			updateAddButtonActivation();
		}

	}
}
