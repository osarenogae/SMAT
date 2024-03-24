package dialogs;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.JTextComponent;

import careProcess_model.Project;
import guiComponents.DocumentSymbolFilter;
import userInterface.DialogParentPanel;
import userInterface.MainAppWindow;
import userInterface.PanelGSNOverview;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

/**
 * The JDialog in which the user can edit the text of the "Acceptable
 * Definition" attribute of the project file. This was used in an earlier
 * version to allow the user to edit the definition. It will still function
 * properly, and need only be created, passed the required parameters and shown
 * like a normal dialog box.
 *
 */
public class AcceptableDefinitionDialog extends ValidatorDialog {

	private final JPanel contentPanel = new JPanel();
	private static JTextComponent definitionTextPane = new JTextPane();
	private Project project;

	private final Action okAction = new OKButtonAction();
	private final Action cancelAction = new CancelButtonAction();

	private static JButton okButton = new JButton("OK");
	private DialogParentPanel parentPanel;

	public AcceptableDefinitionDialog(DialogParentPanel parentPanelIn, Project projectIn) {
		super(new JTextComponent[] { definitionTextPane }, new JButton[] { okButton });

		project = projectIn;
		parentPanel = parentPanelIn;

		setTitle("'Acceptable Hazard' definition...");
		setBounds(100, 100, 450, 300);
		setPreferredSize(new Dimension(300, 200));
		getContentPane().setLayout(new BorderLayout());
		contentPanel
				.setBorder(new TitledBorder(null, "Definition", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane);
			{
				scrollPane.setViewportView(definitionTextPane);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{

				okButton.setAction(okAction);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setAction(cancelAction);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}

		String existingDef = project.getAcceptableHazardDefinition();
		if (existingDef != null) {
			definitionTextPane.setText(existingDef);
		}

		// ((AbstractDocument)
		// definitionTextPane.getDocument()).setDocumentFilter(new
		// DocumentSymbolFilter());

		// Need to revalidate here as the buttons are not added to the view
		// hierarchy
		// by the time the superconstructor is called, so they wouldn't be
		// disabled by
		// default, as they should be by ValidatorDialog's constructor.
		super.validateTextFields();

		// Make sure the dialog is centred in the screen
		this.setLocationRelativeTo(null);
	}

	public JTextPane getDefinitionTextPane() {
		return (JTextPane) definitionTextPane;
	}

	private class OKButtonAction extends AbstractAction {
		public OKButtonAction() {
			putValue(NAME, "OK");
			putValue(SHORT_DESCRIPTION, "Accept this definition");
		}

		public void actionPerformed(ActionEvent e) {
			project.setAcceptableHazardDefinition(definitionTextPane.getText());
			parentPanel.refresh();
			dispose();
		}
	}

	private class CancelButtonAction extends AbstractAction {
		public CancelButtonAction() {
			putValue(NAME, "Cancel");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}
