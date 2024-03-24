package dialogs;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
import main.Main;
import userInterface.DialogParentPanel;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.BoxLayout;

/**
 * The JDialog that holds all components of the dialog in which a user selects a
 * hazard definition and, together with its corresponding 'Worker' class,
 * defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class HazardTypeSelectionDialog extends JDialog implements DialogParentPanel {

	private final JPanel contentPanel = new JPanel();
	private final Action actionSelectButtonPressed = new SelectButtonPressedAction();
	private final Action NewTypeButtonPressedAction;
	private final Action action = new CancelButtonPressedAction();

	private HazardTypeSelectionDialog_Worker worker = new HazardTypeSelectionDialog_Worker();
	private JList hazardTypesList;
	private JButton selectButton;
	private HazardInstance hazardInstance;
	private DialogParentPanel parentPanel;
	private JButton btnNewHazardType;

	/**
	 * Create the dialog, passing in the hazard instance to which the hazard
	 * type will be associated, the DialogParentPAnel to refresh when the dialog
	 * is disposed and a boolean to indicate whether the dialog should allow
	 * creation of new hazard types or not.
	 * 
	 * @param hi
	 * @param dpp
	 * @param newTypeAllowed
	 */
	public HazardTypeSelectionDialog(HazardInstance hi, DialogParentPanel dpp, boolean newTypeAllowed) {

		NewTypeButtonPressedAction = new NewTypeButtonPressedAction(this);

		setTitle("Select hazard type...");
		hazardInstance = hi;
		parentPanel = dpp;

		this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane);
			{
				hazardTypesList = new JList();
				scrollPane.setViewportView(hazardTypesList);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
			{
				JPanel panel = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel.getLayout();
				flowLayout.setAlignment(FlowLayout.LEFT);
				buttonPane.add(panel);
				{
					if (newTypeAllowed) {
						btnNewHazardType = new JButton("New Hazard Type");
						btnNewHazardType.setAction(NewTypeButtonPressedAction);
						panel.add(btnNewHazardType);
					}
				}
			}
			{
				JPanel panel = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel.getLayout();
				flowLayout.setAlignment(FlowLayout.RIGHT);
				buttonPane.add(panel);
				{
					selectButton = new JButton("Select");
					panel.add(selectButton);
					selectButton.setAction(actionSelectButtonPressed);
					getRootPane().setDefaultButton(selectButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					panel.add(cancelButton);
					cancelButton.setAction(action);
					cancelButton.setActionCommand("Cancel");
				}
			}
		}

		// Fill in the list data
		hazardTypesList
				.setModel(worker.getHazardDefinitionListModel(Main.getProject().getDatastore().getHazardrepository()));
		hazardTypesList.addListSelectionListener(new TypeLsitSelectionListener());
	}

	private void updateButtons() {
		if (hazardTypesList.getSelectedValue() != null) {
			selectButton.setEnabled(true);
		} else {
			selectButton.setEnabled(false);
		}
	}

	private class TypeLsitSelectionListener implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			updateButtons();
		}

	}

	/**
	 * Action for opening the new hazard definition dialog.
	 *
	 */
	private class NewTypeButtonPressedAction extends AbstractAction {

		DialogParentPanel dialogParent;

		public NewTypeButtonPressedAction(DialogParentPanel dialogParentIn) {
			putValue(NAME, "New Hazard Type");
			putValue(SHORT_DESCRIPTION, "Create a new hazard type");
			dialogParent = dialogParentIn;
		}

		public void actionPerformed(ActionEvent e) {
			NewHazardTypeDialog d = new NewHazardTypeDialog(dialogParent);
			d.pack();
			d.setVisible(true);
		}
	}

	/**
	 * Action for confirming selection
	 *
	 */
	private class SelectButtonPressedAction extends AbstractAction {
		public SelectButtonPressedAction() {
			putValue(NAME, "Select");
			putValue(SHORT_DESCRIPTION, "Select this hazard type");
		}

		public void actionPerformed(ActionEvent e) {
			hazardInstance.setHazardDefinition((HazardDefinition) hazardTypesList.getSelectedValue());
			parentPanel.refresh();
			dispose();
		}
	}

	/**
	 * Action for cancelling the dialog
	 *
	 */
	private class CancelButtonPressedAction extends AbstractAction {
		public CancelButtonPressedAction() {
			putValue(NAME, "Cancel");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	public JButton getBtnNewHazardType() {
		return btnNewHazardType;
	}

	@Override
	public void refresh() {
		hazardTypesList
				.setModel(worker.getHazardDefinitionListModel(Main.getProject().getDatastore().getHazardrepository()));
		parentPanel.refresh();
	}
}
