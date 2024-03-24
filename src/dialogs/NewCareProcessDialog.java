package dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.JTextComponent;

import careProcess_model.CareProcess;
import guiComponents.DocumentSymbolFilter;
import main.Main;
import userInterface.CardPanelCareProcessEditor;
import userInterface.DialogContent;
import userInterface.DialogParentPanel;
import userInterface.WorkerUtilities;
import utilities.DataHelper;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The JDialog that holds all the components of the dialog responsible for
 * defining a new Hazard Instance (formerly 'functional hazard') and defines
 * their behaviour.
 * <p>
 * Note: This class was simple enough to not bother separating some of its
 * functionality into a 'Worker' class. All functional code is included here.
 */
public class NewCareProcessDialog extends ValidatorDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblCareProcessName;
	private static JTextField processNameTextField = new JTextField();
	private JTextArea descriptionTextArea = new JTextArea();
	private static JButton okButton = new JButton("OK");
	private JButton cancelButton;

	private final Action okPressedAction = new OKAction();
	private final Action cancelPressedAction = new CancelAction();

	private CardPanelCareProcessEditor careProcessEditor;
	private CareProcess existingCareProcess;

	private NewCareProcessDialog thisDialog = this;

	private DialogParentPanel parentPanel;

	/**
	 * Create the dialog.
	 * 
	 * @param cardPanelCareProcessEditor
	 */
	public NewCareProcessDialog(DialogParentPanel parentPanelIn, CardPanelCareProcessEditor cardPanelCareProcessEditor,
			CareProcess existingCareProcessIn) {
		super(new JTextComponent[] { processNameTextField }, new JButton[] { okButton });

		parentPanel = parentPanelIn;
		careProcessEditor = cardPanelCareProcessEditor;
		existingCareProcess = existingCareProcessIn;

		setTitle("New Care Process...");
		setBounds(100, 100, 450, 175);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblCareProcessName = new JLabel("Care Process Name");
			lblCareProcessName.setHorizontalAlignment(SwingConstants.RIGHT);
		}

		JScrollPane scrollPane = new JScrollPane();

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblCareProcessName, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 293,
										Short.MAX_VALUE)
								.addComponent(processNameTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 293,
										Short.MAX_VALUE))
						.addContainerGap()));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblCareProcessName)
						.addComponent(processNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
						.addComponent(lblDescription))
				.addContainerGap()));

		scrollPane.setViewportView(descriptionTextArea);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton.setAction(okPressedAction);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setAction(cancelPressedAction);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}

		if (existingCareProcess != null) {
			processNameTextField.setText(existingCareProcess.getName());
			descriptionTextArea.setText(existingCareProcess.getDescription());
		} else {
			processNameTextField.setText("");
			descriptionTextArea.setText("");
		}

		// ((AbstractDocument)
		// processNameTextField.getDocument()).setDocumentFilter(new
		// DocumentSymbolFilter());
		// ((AbstractDocument)
		// descriptionTextArea.getDocument()).setDocumentFilter(new
		// DocumentSymbolFilter());
		super.validateTextFields();
	}

	public JButton getOkButton() {
		return okButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public JTextField getProcessNameTextField() {
		return processNameTextField;
	}

	private class OKAction extends AbstractAction {
		public OKAction() {
			putValue(NAME, "OK");
			putValue(SHORT_DESCRIPTION, "Create this care process");
		}

		public void actionPerformed(ActionEvent e) {
			String name = processNameTextField.getText();
			String description = descriptionTextArea.getText();
			if (existingCareProcess == null) {
				if (!DataHelper.checkForSameCareProcessName(Main.getProject(), name, null)) {
					careProcessEditor.addNewCareProcess(name, description);
					dispose();
				} else {
					WorkerUtilities.showWarningDialog(DialogContent.DUPLICATE_CAREPROCESS_SAVE_DIALOG_TITLE,
							DialogContent.DUPLICATE_CAREPROCESS_SAVE_DIALOG_MESSAGE, thisDialog);
				}
			} else {
				if (!DataHelper.checkForSameCareProcessName(Main.getProject(), name, existingCareProcess)) {
					existingCareProcess.setName(name);
					existingCareProcess.setDescription(description);
					dispose();
				} else {
					WorkerUtilities.showWarningDialog(DialogContent.DUPLICATE_CAREPROCESS_SAVE_DIALOG_TITLE,
							DialogContent.DUPLICATE_CAREPROCESS_SAVE_DIALOG_MESSAGE, thisDialog);
				}
			}

			parentPanel.refresh();

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
}
