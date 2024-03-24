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

import org.eclipse.emf.common.util.EList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardCause;
import careProcess_model.HazardControl;
import careProcess_model.HazardEffect;
import careProcess_model.HazardFactor;
import careProcess_model.HazardInstance;
import guiComponents.DocumentSymbolFilter;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import careProcess_model.ControlTypeEnum;
import javax.swing.JCheckBox;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.UIManager;
import java.awt.Color;
import careProcess_model.ControlStateEnum;

/**
 * The JDialog that holds all the components of the dialog responsible for
 * defining a new Hazard Control and, together with its corresponding 'Worker'
 * class, defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class NewHazardControlDialog extends ValidatorDialog {

	private final JPanel contentPanel = new JPanel();
	private static JTextField controlNameTextField = new JTextField();
	private static JTextArea controlDescrptionTextArea = new JTextArea();
	private JComboBox controlTypeComboBox = new JComboBox();

	private final Action actionConfirmHazardControlButtonPressed = new ConfirmHazardControlButtonPressed(this);
	private final Action action = new CancelHazardControlButtonPressed();

	private HazardFactor hazardFactor;
	private HazardInstance hazardInstance;

	private NewHazardControlDialog_Worker worker;
	private FunctionalHazardDefinitionDialog_Worker instanceWorker;
	private HazardControl existingHazardControl;

	static JButton okButton = new JButton("OK");
	private JTextField otherTextField;
	private JPanel panel_5;
	private JCheckBox chckbxDesign;
	private JCheckBox chckbxTest;
	private JCheckBox chckbxTraining;
	private JCheckBox chckbxBusinessProcessChange;

	/**
	 * Create the dialog.
	 */
	public NewHazardControlDialog(HazardControl hazardControlIn, HazardInstance hazardInstanceIn,
			HazardFactor hazardFactorIn, FunctionalHazardDefinitionDialog_Worker instanceWorkerIn) {
		// Set up the validation methods
		super(new JTextComponent[] { controlNameTextField }, new JButton[] { okButton });
		setTitle("Hazard Control...");

		this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

		// The cause or effect
		hazardFactor = hazardFactorIn;
		existingHazardControl = hazardControlIn;

		// The HazardInstance to which a new cause will be associated.
		hazardInstance = hazardInstanceIn;

		instanceWorker = instanceWorkerIn;
		worker = new NewHazardControlDialog_Worker();

		/*
		 * User interface definition (Generated)
		 */
		setBounds(100, 100, 450, 450);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			panel_5 = new JPanel();
			panel_5.setBorder(new TitledBorder(null, "Properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));

			JLabel lblControlName = new JLabel("Control Name");
			lblControlName.setHorizontalAlignment(SwingConstants.RIGHT);

			JLabel lblControlDescription = new JLabel("Control Description");
			lblControlDescription.setHorizontalAlignment(SwingConstants.RIGHT);

			JScrollPane scrollPane = new JScrollPane();
			GroupLayout gl_panel_5 = new GroupLayout(panel_5);
			gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_5.createSequentialGroup().addContainerGap()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblControlName, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
									.addComponent(lblControlDescription, GroupLayout.DEFAULT_SIZE,
											GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(10)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
									.addComponent(controlNameTextField, GroupLayout.DEFAULT_SIZE, 295,
											Short.MAX_VALUE)
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
							.addContainerGap()));
			gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panel_5.createSequentialGroup().addContainerGap()
							.addGroup(gl_panel_5.createParallelGroup(Alignment.BASELINE).addComponent(lblControlName)
									.addComponent(controlNameTextField, GroupLayout.PREFERRED_SIZE,
											GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_5.createSequentialGroup().addComponent(lblControlDescription)
											.addGap(38))
									.addGroup(gl_panel_5.createSequentialGroup()
											.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
											.addContainerGap()))));

			// ((AbstractDocument)
			// controlNameTextField.getDocument()).setDocumentFilter(new
			// DocumentSymbolFilter());
			// ((AbstractDocument)
			// controlDescrptionTextArea.getDocument()).setDocumentFilter(new
			// DocumentSymbolFilter());

			scrollPane.setViewportView(controlDescrptionTextArea);
			panel_5.setLayout(gl_panel_5);
		}

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "State", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JPanel panel_4 = new JPanel();

		JLabel lblControlType = new JLabel("Control State");
		lblControlType.setHorizontalAlignment(SwingConstants.RIGHT);

		controlTypeComboBox.setModel(new DefaultComboBoxModel(ControlStateEnum.values()));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup().addGap(16)
						.addComponent(lblControlType, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(controlTypeComboBox, 0, 283, Short.MAX_VALUE).addContainerGap()));
		gl_panel_4.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup().addGap(12)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(controlTypeComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblControlType))
						.addContainerGap(26, Short.MAX_VALUE)));
		panel_4.setLayout(gl_panel_4);
		panel.add(panel_4);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Type", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));

		JPanel panel_1 = new JPanel();
		panel_3.add(panel_1);

		chckbxDesign = new JCheckBox("Design");
		panel_1.add(chckbxDesign);

		chckbxTest = new JCheckBox("Test");
		panel_1.add(chckbxTest);

		chckbxTraining = new JCheckBox("Training");
		panel_1.add(chckbxTraining);

		chckbxBusinessProcessChange = new JCheckBox("Business Process Change");
		panel_1.add(chckbxBusinessProcessChange);

		JPanel panel_2 = new JPanel();
		panel_3.add(panel_2);

		JLabel lblPleaseSpecify = new JLabel("Other");
		lblPleaseSpecify.setHorizontalAlignment(SwingConstants.TRAILING);

		otherTextField = new JTextField();
		otherTextField.setColumns(10);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_2.add(lblPleaseSpecify);
		panel_2.add(otherTextField);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE).addGap(1)));
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{

				okButton.setAction(actionConfirmHazardControlButtonPressed);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setAction(action);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}

		/*
		 * Initialising the form contents
		 */
		worker.populateForm(hazardControlIn, this);

	}

	public HazardInstance getHazardInstance() {
		return hazardInstance;
	}

	public HazardFactor getHazardFactor() {
		return hazardFactor;
	}

	public JTextField getControlNameTextField() {
		return controlNameTextField;
	}

	public JComboBox getControlTypeComboBox() {
		return controlTypeComboBox;
	}

	private class ConfirmHazardControlButtonPressed extends AbstractAction {
		NewHazardControlDialog dialog;

		public ConfirmHazardControlButtonPressed(NewHazardControlDialog d) {
			putValue(NAME, "OK");
			dialog = d;
		}

		public void actionPerformed(ActionEvent e) {
			worker.saveFormData(existingHazardControl, dialog, instanceWorker);

			dispose();
		}
	}

	private class CancelHazardControlButtonPressed extends AbstractAction {
		public CancelHazardControlButtonPressed() {
			putValue(NAME, "Cancel");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	public JTextArea getControlDescriptionTextArea() {
		return controlDescrptionTextArea;
	}

	public JCheckBox getChckbxDesign() {
		return chckbxDesign;
	}

	public JCheckBox getChckbxTest() {
		return chckbxTest;
	}

	public JCheckBox getChckbxTraining() {
		return chckbxTraining;
	}

	public JCheckBox getChckbxBusinessProcessChange() {
		return chckbxBusinessProcessChange;
	}

	public JTextField getOtherTextField() {
		return otherTextField;
	}
}
