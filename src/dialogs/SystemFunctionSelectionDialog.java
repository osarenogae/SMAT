package dialogs;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

import careProcess_model.HazardInstance;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
import main.Main;
import userInterface.DialogParentPanel;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

/**
 * The JDialog that holds all the components of the dialog in which the user can
 * select from a tree of available system functions and, together with its
 * corresponding 'Worker' class, defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class SystemFunctionSelectionDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton selectButton;
	private JButton cancelButton;
	private JTree systemTreeExplorer;

	private SystemFunctionSelectionDialog_Worker worker = new SystemFunctionSelectionDialog_Worker();
	private HazardInstance knownHazardInstance;
	private Step knownStep;
	private DialogParentPanel parentPanel;

	private final Action action = new SelectButtonPressed();
	private JScrollPane scrollPane;

	private final Action action_1 = new CancelButtonPressed();

	/**
	 * Create the dialog.
	 * 
	 * @param hazardInstance
	 */
	public SystemFunctionSelectionDialog(HazardInstance knownHazardInstanceIn, Step knownStepIn,
			DialogParentPanel parentPanelIn) {
		knownHazardInstance = knownHazardInstanceIn;
		knownStep = knownStepIn;
		parentPanel = parentPanelIn;

		this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

		setTitle("Select a system function...");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			scrollPane = new JScrollPane();
			{
				systemTreeExplorer = new JTree();
				systemTreeExplorer.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("JTree") {
					{
					}
				}));
				systemTreeExplorer.setRootVisible(false);
				scrollPane.setViewportView(systemTreeExplorer);
				systemTreeExplorer.addTreeSelectionListener(new SystemTreeSelectionListener());
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				selectButton = new JButton("Select");
				selectButton.setAction(action);
				selectButton.setActionCommand("selectPressed");
				selectButton.setEnabled(false);
				buttonPane.add(selectButton);
				getRootPane().setDefaultButton(selectButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setAction(action_1);
				cancelButton.setActionCommand("cancelPressed");
				buttonPane.add(cancelButton);
			}
		}

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE));
		contentPanel.setLayout(gl_contentPanel);

		worker.populateSystemTree(Main.getProject().getDatastore().getSystemrepository(), systemTreeExplorer);

	}

	public JButton getSelectButton() {
		return selectButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public JTree getSystemTreeExplorer() {
		return systemTreeExplorer;
	}

	private class SelectButtonPressed extends AbstractAction {
		public SelectButtonPressed() {
			putValue(NAME, "Select");
			putValue(SHORT_DESCRIPTION, "Select this system function");
		}

		public void actionPerformed(ActionEvent e) {

			DefaultMutableTreeNode n = (DefaultMutableTreeNode) systemTreeExplorer.getLastSelectedPathComponent();
			if (worker.isNodeSystemFunction(n)) {
				SystemFunction associatedFunction = worker.chooseSystemFunction(n);
				if (knownHazardInstance != null) {
					knownHazardInstance.setSystemFunction(associatedFunction);
				}
				if (knownStep != null) {
					knownStep.getAssociatedSystemFunctions().add(associatedFunction);
				}
				parentPanel.refresh();
				dispose();
			}
		}
	}

	private class CancelButtonPressed extends AbstractAction {
		public CancelButtonPressed() {
			putValue(NAME, "Cancel");
		}

		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	private class SystemTreeSelectionListener implements TreeSelectionListener {
		@Override
		public void valueChanged(TreeSelectionEvent e) {
			DefaultMutableTreeNode n = (DefaultMutableTreeNode) systemTreeExplorer.getLastSelectedPathComponent();
			if (worker.isNodeSystemFunction(n)) {
				selectButton.setEnabled(true);
			} else {
				selectButton.setEnabled(false);
			}
		}
	}
}
