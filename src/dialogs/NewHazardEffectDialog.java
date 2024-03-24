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

import careProcess_model.HazardCause;
import careProcess_model.HazardEffect;
import careProcess_model.HazardInstance;
import guiComponents.DocumentSymbolFilter;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

/**
 * The JDialog that holds all the components of the dialog responsible for
 * defining a new Hazard Effect (formerly 'hazard impact') and, together with
 * its corresponding 'Worker' class, defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class NewHazardEffectDialog extends ValidatorDialog {

	private final JPanel contentPanel = new JPanel();
	private static JButton okButton = new JButton("OK");

	private final Action action = new ConfirmHazardEffectButtonPressed();
	private final Action action_1 = new CancelHazardEffectButtonPressed();
	private static JTextArea effectDescriptionTextArea = new JTextArea();

	private NewHazardEffectDialog_Worker worker = new NewHazardEffectDialog_Worker();
	private FunctionalHazardDefinitionDialog_Worker instanceWorker;

	private HazardInstance hazardInstance;
	private HazardEffect existingHazardEffect;
	private static JTextField effectNameTextField = new JTextField();;

	/**
	 * Create the dialog.
	 */
	public NewHazardEffectDialog(HazardEffect hazardEffectIn, HazardInstance hazardInstanceIn,
			FunctionalHazardDefinitionDialog_Worker instanceWorkerIn) {

		super(new JTextComponent[] { effectNameTextField }, new JButton[] { okButton });

		this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

		existingHazardEffect = hazardEffectIn;

		hazardInstance = hazardInstanceIn;

		instanceWorker = instanceWorkerIn;

		String nameTxt = "";
		String descriptionTxt = "";
		if (existingHazardEffect != null) {
			nameTxt = existingHazardEffect.getEffectName();
			descriptionTxt = existingHazardEffect.getEffectDescription();
		}
		effectNameTextField.setText(nameTxt);
		effectDescriptionTextArea.setText(descriptionTxt);

		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JScrollPane scrollPane = new JScrollPane();

		JLabel lblEffectDescription = new JLabel("Effect Description");

		JLabel lblEffectName = new JLabel("Effect Name");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel
				.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
										.addComponent(lblEffectDescription).addComponent(effectNameTextField,
												GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
										.addComponent(lblEffectName))
								.addContainerGap()));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap().addComponent(lblEffectName)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(effectNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblEffectDescription)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE).addGap(9)));

		scrollPane.setViewportView(effectDescriptionTextArea);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton.setAction(action);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setAction(action_1);
				buttonPane.add(cancelButton);
			}
		}

		// ((AbstractDocument)
		// effectDescriptionTextArea.getDocument()).setDocumentFilter(new
		// DocumentSymbolFilter());
		// ((AbstractDocument)
		// effectNameTextField.getDocument()).setDocumentFilter(new
		// DocumentSymbolFilter());
	}

	private class ConfirmHazardEffectButtonPressed extends AbstractAction {
		public ConfirmHazardEffectButtonPressed() {
			putValue(NAME, "OK");
			putValue(SHORT_DESCRIPTION, "Save this hazard effect");
		}

		public void actionPerformed(ActionEvent e) {
			if (existingHazardEffect == null) {
				instanceWorker.populateEffectTree(hazardInstance, worker.createHazardEffect(hazardInstance,
						effectNameTextField.getText(), effectDescriptionTextArea.getText()));
			} else {
				existingHazardEffect.setEffectName(effectNameTextField.getText());
				existingHazardEffect.setEffectDescription(effectDescriptionTextArea.getText());
				instanceWorker.populateEffectTree(hazardInstance, existingHazardEffect);
			}
			dispose();
		}
	}

	private class CancelHazardEffectButtonPressed extends AbstractAction {
		public CancelHazardEffectButtonPressed() {
			putValue(NAME, "Cancel");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	public JTextField getEffectNameTextField() {
		return effectNameTextField;
	}
}
