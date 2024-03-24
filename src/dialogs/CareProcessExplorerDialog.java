package dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

import careProcess_model.CareProcess;
import main.Main;
import userInterface.CardPanelCareProcessEditor;
import userInterface.DialogContent;
import userInterface.DialogParentPanel;

import javax.swing.BoxLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

/**
 * The JDialog that holds all the components of the dialog in which the user can
 * browse and select from a list of care processes to open in the editor (or
 * edit/delete them) and, together with its corresponding 'Worker' class,
 * defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class CareProcessExplorerDialog extends JDialog implements DialogParentPanel {

	private final JPanel contentPanel = new JPanel();
	private JList careProcessList = new JList();
	CareProcessExplorerDialog_Worker worker;

	private final Action cancelAction = new CancelAction();
	private final Action deleteAction = new DeleteAction();
	private final Action editAction = new EditAction();
	private final Action openAction = new OpenAction();

	private CareProcessExplorerDialog thisDialog;
	private CardPanelCareProcessEditor editor;

	/**
	 * Create the dialog.
	 */
	public CareProcessExplorerDialog(CardPanelCareProcessEditor editorIn) {

		this.setModalityType(ModalityType.APPLICATION_MODAL);
		editor = editorIn;
		worker = new CareProcessExplorerDialog_Worker(Main.getProject(), careProcessList);
		thisDialog = this;

		setTitle("Care Process Explorer");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.SOUTH);
			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			{
				JPanel removeButtonPane = new JPanel();
				panel.add(removeButtonPane);
				removeButtonPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
				{
					JButton btnDelete = new JButton("Delete");
					btnDelete.setAction(deleteAction);
					removeButtonPane.add(btnDelete);
				}
				{
					JButton btnEdit = new JButton("Edit");
					btnEdit.setAction(editAction);
					removeButtonPane.add(btnEdit);
				}
			}
			{
				JPanel buttonPane = new JPanel();
				panel.add(buttonPane);
				buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
				{
					JButton openButton = new JButton("Open");
					openButton.setAction(openAction);
					buttonPane.add(openButton);
					getRootPane().setDefaultButton(openButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setAction(cancelAction);
					buttonPane.add(cancelButton);
				}
			}
		}
		contentPanel.setBorder(
				new TitledBorder(null, "Care Processes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane, BorderLayout.CENTER);
			{

				scrollPane.setViewportView(careProcessList);
			}
		}

		// Only allow single selections in the list of care processes
		careProcessList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		worker.populateCareProcessList();
	}

	private void deleteCareProcess(CareProcess c) {
		if (c != null) {
			worker.deleteCareProcess(c);
			editor.removeTabForCareProcess(c);
		}
	}

	/**
	 * Show the dialog for editing the name and description of the given care
	 * process
	 * 
	 * @param c
	 */
	public void editCareProcessData(CareProcess c) {
		NewCareProcessDialog d = new NewCareProcessDialog(this, editor, c);
		d.pack();
		d.setVisible(true);
	}

	private class CancelAction extends AbstractAction {
		public CancelAction() {
			putValue(NAME, "Cancel");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	private class OpenAction extends AbstractAction {
		public OpenAction() {
			putValue(NAME, "Open");
			putValue(SHORT_DESCRIPTION, "Open the selected care process");
		}

		public void actionPerformed(ActionEvent e) {
			CareProcess cp = worker.getSelectedCareProcess();
			if (cp != null) {
				if (!editor.showTabForCareProcess(cp)) {
					editor.makeTabForCareProcess(cp);
				}
				dispose();
			}
		}
	}

	private class EditAction extends AbstractAction {
		public EditAction() {
			putValue(NAME, "Edit");
			putValue(SHORT_DESCRIPTION, "Edit the name and description of the selected care process");
		}

		public void actionPerformed(ActionEvent e) {
			CareProcess cp = worker.getSelectedCareProcess();
			if (cp != null) {
				editCareProcessData(worker.getSelectedCareProcess());
			}
		}
	}

	private class DeleteAction extends AbstractAction {
		public DeleteAction() {
			putValue(NAME, "Delete");
			putValue(SHORT_DESCRIPTION, "Delete the selected care process");
		}

		public void actionPerformed(ActionEvent e) {
			CareProcess c = worker.getSelectedCareProcess();
			if (c != null) {
				int confirmResult = worker.confirmDialog(DialogContent.CONFIRM_DELETE_CARE_PROCESS_MESSAGE,
						DialogContent.CONFIRM_DELETE_CARE_PROCESS_TITLE, thisDialog);
				if (confirmResult == JOptionPane.YES_OPTION) {
					deleteCareProcess(c);
				}
				worker.populateCareProcessList();
			}
		}
	}

	@Override
	public void refresh() {
		worker.populateCareProcessList();
		editor.refresh();
	}
}
