package dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardDefinition;
import main.Main;
import userInterface.DialogParentPanel;
import userInterface.PanelNewHazardTypeDialog;
import javax.swing.BoxLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

/**
 * This dialog allows the user to create a new hazard definition. It is simple enough not to have a separate worker class.
 *
 */
public class NewHazardTypeDialog extends ValidatorDialog {

	private final JPanel contentPanel = new JPanel();
	private final Action actionOK = new OKAction();
	private final Action actionCancel = new Cancel();
	
	static PanelNewHazardTypeDialog panelNewHazardTypeDialog = new PanelNewHazardTypeDialog();
	static JButton okButton = new JButton("OK");
	
	private DialogParentPanel parentPanel;
	
	private boolean hazardCreated = false;


	/**
	 * Create the dialog.
	 */
	public NewHazardTypeDialog(DialogParentPanel parentPanelIn) {
		super(new JTextComponent[] { panelNewHazardTypeDialog.getHazardNameTextField() }, new JButton[] { okButton });
		
		//Centre the dialog
		this.setLocationRelativeTo(null);
		
		parentPanel = parentPanelIn;
		
		setTitle("New Hazard...");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.X_AXIS));
		{
			
			contentPanel.add(panelNewHazardTypeDialog);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				
				okButton.setAction(actionOK);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setAction(actionCancel);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private class OKAction extends AbstractAction {
		public OKAction() {
			putValue(NAME, "OK");
			putValue(SHORT_DESCRIPTION, "Create the new hazard type");
		}
		public void actionPerformed(ActionEvent e) {
			if(!hazardCreated){
				hazardCreated = true;
				HazardDefinition newHazard = CareProcess_modelFactory.eINSTANCE.createHazardDefinition();
				newHazard.setHazardName(panelNewHazardTypeDialog.getHazardNameTextField().getText());
				newHazard.setDescription(panelNewHazardTypeDialog.getHazardDescriptionTextPane().getText());
				Main.getProject().getDatastore().getHazardrepository().getHazardDefinitions().add(newHazard);
				parentPanel.refresh();
				dispose();
			}
		}
	}
	private class Cancel extends AbstractAction {
		public Cancel() {
			putValue(NAME, "Cancel");
		}
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}
