package dialogs;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.JTextComponent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import careProcess_model.HazardCause;
import careProcess_model.HazardInstance;
import guiComponents.DocumentSymbolFilter;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 * The JDialog that holds all the components of the dialog responsible for
 * defining a new Hazard Cause and, together with its corresponding 'Worker'
 * class, defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class NewHazardCauseDialog extends ValidatorDialog {

	private final JPanel contentPanel = new JPanel();
	private static JTextField causeNameTextField = new JTextField();
	private static JTextArea causeDescriptionTextArea = new JTextArea();

	static JButton okButton = new JButton();

	private NewHazardCauseDialog_Worker worker;
	private FunctionalHazardDefinitionDialog_Worker instanceWorker;

	private final Action actionConfirmHazardCauseButtonPressed = new ConfirmHazardCauseButtonPressed();
	private final Action actionCancelHazardCauseButtonPressed = new CancelHazardCauseButtonPressed();

	private HazardInstance hazardInstance;
	private HazardCause existingHazardCause;

	/**
	 * Create the dialog.
	 */
	public NewHazardCauseDialog(HazardCause hazardCauseIn, HazardInstance hazardInstanceIn,
			FunctionalHazardDefinitionDialog_Worker instanceWorkerIn) {
		// Set up the validation methods
		super(new JTextComponent[] { causeNameTextField }, new JButton[] { okButton });
		setTitle("Hazard Cause...");

		this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

		// Represents the existing data to load, or equals null if there is
		// none.
		existingHazardCause = hazardCauseIn;

		// The HazardInstance to which a new cause will be associated.
		hazardInstance = hazardInstanceIn;

		worker = new NewHazardCauseDialog_Worker();
		instanceWorker = instanceWorkerIn;

		setBounds(100, 100, 450, 279);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);

			String nameTxt = "";
			String descriptionTxt = "";
			if (existingHazardCause != null) {
				nameTxt = existingHazardCause.getCauseName();
				descriptionTxt = existingHazardCause.getCauseDescription();
			}
			causeNameTextField.setText(nameTxt);
			causeDescriptionTextArea.setText(descriptionTxt);
			// ((AbstractDocument)
			// causeNameTextField.getDocument()).setDocumentFilter(new
			// DocumentSymbolFilter());
			// ((AbstractDocument)
			// causeDescriptionTextArea.getDocument()).setDocumentFilter(new
			// DocumentSymbolFilter());

			JLabel lblCauseName = new JLabel("Cause Name");
			lblCauseName.setHorizontalAlignment(SwingConstants.RIGHT);

			JLabel lblCauseDescription = new JLabel("Description");
			lblCauseDescription.setHorizontalAlignment(SwingConstants.RIGHT);

			JScrollPane scrollPane = new JScrollPane();
			GroupLayout gl_panel = new GroupLayout(panel);
			gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel.createSequentialGroup().addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblCauseDescription, GroupLayout.DEFAULT_SIZE,
											GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblCauseName, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 300,
											Short.MAX_VALUE)
									.addComponent(causeNameTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 300,
											Short.MAX_VALUE))
							.addGap(22)));
			gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
					.createSequentialGroup().addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblCauseName).addComponent(
							causeNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
							GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblCauseDescription)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
					.addGap(59)));

			scrollPane.setViewportView(causeDescriptionTextArea);
			panel.setLayout(gl_panel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{

				okButton.setAction(actionConfirmHazardCauseButtonPressed);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton();
				cancelButton.setAction(actionCancelHazardCauseButtonPressed);
				buttonPane.add(cancelButton);
			}
		}
		super.validateTextFields();
	}

	private class ConfirmHazardCauseButtonPressed extends AbstractAction {
		public ConfirmHazardCauseButtonPressed() {
			putValue(NAME, "OK");
			putValue(SHORT_DESCRIPTION, "Create this cause");
		}

		public void actionPerformed(ActionEvent e) {
			if (existingHazardCause == null) {
				instanceWorker.populateCauseTree(hazardInstance, worker.createHazardCause(hazardInstance,
						causeNameTextField.getText(), causeDescriptionTextArea.getText()));

			} else {
				existingHazardCause.setCauseName(causeNameTextField.getText());
				existingHazardCause.setCauseDescription(causeDescriptionTextArea.getText());
				instanceWorker.populateCauseTree(hazardInstance, existingHazardCause);
			}
			dispose();
		}
	}

	private class CancelHazardCauseButtonPressed extends AbstractAction {
		public CancelHazardCauseButtonPressed() {
			putValue(NAME, "Cancel");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

}
