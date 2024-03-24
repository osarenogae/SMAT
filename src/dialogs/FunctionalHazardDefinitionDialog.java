package dialogs;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.tree.DefaultMutableTreeNode;

import org.eclipse.core.internal.jobs.Worker;
import org.eclipse.emf.ecore.util.EcoreUtil;

import careProcess_model.HazardCause;
import careProcess_model.HazardControl;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardEffect;
import careProcess_model.HazardFactor;
import careProcess_model.HazardInstance;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
import main.Main;
import userInterface.CardPanelHazardLogEditor;
import userInterface.DialogParentPanel;
import userInterface.HazardLogEditor_Worker;
import userInterface.PanelFunctionalHazardDefinition;
import utilities.DataHelper;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

/**
 * The JDialog that holds all the components of the dialog responsible for
 * defining a new Hazard Instance (formerly 'functional hazard') and, together
 * with its corresponding 'Worker' class, defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class FunctionalHazardDefinitionDialog extends JDialog implements DialogParentPanel {

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JButton cancelButton;
	private final Action actionOKButtonPressed = new OKButtonAction();
	private HazardDefinition hazardDefinition;
	private Step currentStep;
	private SystemFunction currentSystemFunction;
	private HazardInstance hazardInstance;
	private HazardLogEditor_Worker editorWorker;
	private FunctionalHazardDefinitionDialog_Worker instanceDialogWorker;

	private PanelFunctionalHazardDefinition panelFunctionalHazardDefinition;

	private final Action actionCancelButtonPressed = new CancelButtonAction();
	private final Action actionSystemSelectionButonPressed = new SystemFunctionSelectionButtonAction();
	private final Action actionProcessStepSelectionButtonPressed = new ProcessStepSelectionButtonAction();
	private final Action actionHazardTypeSelectionButtonPressed = new HazardTypeSelectionButtonAction();
	private final Action actionAddCauseItemPressed = new AddCauseItemPressed();
	private final Action actionCauseEditButtonPressed = new CauseEditButtonAction();
	private final Action actionEffectEditButtonPressed = new EffectEditButtonAction();
	private final Action actionAddCauseControlItemPressed = new AddCauseControlItemPressed();
	private final Action actionAddEffectControlItemPressed = new AddEffectControlItemPressed();
	private final Action actionAddEffectItemPressed = new AddEffectItemPressed();
	private final Action actionRemoveEffectItemPressed = new RemoveEffectItemPressed();

	private final Action actionRemoveCauseItemPressed = new RemoveCauseItemPressed();

	private boolean editMode;
	private DialogParentPanel parentPanel;
	private FunctionalHazardDefinitionDialog thisPanel;

	/**
	 * Create the dialog.
	 */
	public FunctionalHazardDefinitionDialog(Boolean editing, HazardDefinition fixedHazardType,
			SystemFunction fixedSystemFunction, Step fixedStep, HazardInstance currentHazardInstance,
			DialogParentPanel dpp) {

		//Centre the dialog
		setLocationRelativeTo(null);
		
		// Set the close button to do nothing. We will handle its behaviour with
		// a listener.
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);

		editMode = editing;
		parentPanel = dpp;
		thisPanel = this;
		this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

		hazardDefinition = fixedHazardType;
		currentSystemFunction = fixedSystemFunction;
		currentStep = fixedStep;
		hazardInstance = currentHazardInstance;
		if (hazardInstance.getHazardDefinition() != null) {
			hazardDefinition = hazardInstance.getHazardDefinition();
		}
		if (hazardInstance.getSystemFunction() != null) {
			currentSystemFunction = hazardInstance.getSystemFunction();
		}
		if (hazardInstance.getStep() != null) {
			currentStep = hazardInstance.getStep();
		}

		instanceDialogWorker = new FunctionalHazardDefinitionDialog_Worker(this);

		setTitle("Add Hazard Instance...");
		setBounds(100, 100, 700, 650);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			panelFunctionalHazardDefinition = new PanelFunctionalHazardDefinition();
			panelFunctionalHazardDefinition.getBtnSelectSystemFunction().setAction(actionSystemSelectionButonPressed);
			panelFunctionalHazardDefinition.getBtnSelectCareProcessStep()
					.setAction(actionProcessStepSelectionButtonPressed);
			panelFunctionalHazardDefinition.getBtnSelectHazardType().setAction(actionHazardTypeSelectionButtonPressed);
			contentPanel.add(panelFunctionalHazardDefinition);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setAction(actionOKButtonPressed);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setAction(actionCancelButtonPressed);
				buttonPane.add(cancelButton);
			}
		}

		panelFunctionalHazardDefinition.getEffectMntmNewEffect().setAction(actionAddEffectItemPressed);
		panelFunctionalHazardDefinition.getCauseMntmNewCause().setAction(actionAddCauseItemPressed);

		panelFunctionalHazardDefinition.getCauseMntmNewControl().setAction(actionAddCauseControlItemPressed);
		panelFunctionalHazardDefinition.getEffectMntmNewControl().setAction(actionAddEffectControlItemPressed);

		panelFunctionalHazardDefinition.getCauseTreeBtnRemove().setAction(actionRemoveCauseItemPressed);
		panelFunctionalHazardDefinition.getEffectTreeBtnRemove().setAction(actionRemoveEffectItemPressed);
		panelFunctionalHazardDefinition.getCauseTreeBtnEdit().setAction(actionCauseEditButtonPressed);
		panelFunctionalHazardDefinition.getEffectTreeBtnEdit().setAction(actionEffectEditButtonPressed);

		// Load the data into the dialog form and disable the edit buttons for
		// fixed attributes.
		if (fixedHazardType != null) {
			hazardInstance.setHazardDefinition(fixedHazardType);
			panelFunctionalHazardDefinition.getBtnSelectHazardType().setEnabled(false);
		}
		if (fixedSystemFunction != null) {
			hazardInstance.setSystemFunction(fixedSystemFunction);
			panelFunctionalHazardDefinition.getBtnSelectSystemFunction().setEnabled(false);
		}
		if (fixedStep != null) {
			hazardInstance.setStep(fixedStep);
			panelFunctionalHazardDefinition.getBtnSelectCareProcessStep().setEnabled(false);
		}

		// Add a listener for the close button to properly cancel the dialog.
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				cancelDialog();
			}
		});

		instanceDialogWorker.storeInitialInstanceData(hazardInstance);
		instanceDialogWorker.loadHazardInstanceData(Main.getRiskMatrix(), hazardInstance);
		instanceDialogWorker.populateAssociatedHazardTypeBox(hazardInstance);
		instanceDialogWorker.populateAssociatedFunctionBox(hazardInstance);
		instanceDialogWorker.populateAssociatedProcessStepBox(hazardInstance);

		panelFunctionalHazardDefinition.getSeverityLikelihoodRiskTable().getModel()
				.addTableModelListener(new TableModelListener() {
					public void tableChanged(TableModelEvent e) {
						instanceDialogWorker.trySaveHazardInstanceData(hazardInstance, Main.getRiskMatrix());
						instanceDialogWorker.updateRiskRatings(Main.getRiskMatrix());
					}
				});

		updateButtons();
	}

	private void updateButtons() {
		if (hazardDefinition != null && currentStep != null && currentSystemFunction != null) {
			okButton.setEnabled(true);
		} else {
			okButton.setEnabled(false);
		}
	}

	private void cancelDialog() {
		if (!editMode) {
			if (hazardInstance.getHazardDefinition() != null) {
				hazardInstance.getHazardDefinition().getHazardInstances().remove(hazardInstance);
			}
			if (hazardInstance.getStep() != null) {
				hazardInstance.getStep().getHazardInstances().remove(hazardInstance);
			}
			if (hazardInstance.getSystemFunction() != null) {
				hazardInstance.getSystemFunction().getHazardInstances().remove(hazardInstance);
			}
			EcoreUtil.delete(hazardInstance);
		} else {
			instanceDialogWorker.restoreInitialInstanceData(hazardInstance);
		}
		dispose();
	}

	private class AddCauseItemPressed extends AbstractAction {
		public AddCauseItemPressed() {
			putValue(NAME, "New Cause");
		}

		public void actionPerformed(ActionEvent e) {
			instanceDialogWorker.showNewHazardCauseDialog(null, hazardInstance);
		}
	}

	private class AddEffectItemPressed extends AbstractAction {
		public AddEffectItemPressed() {
			putValue(NAME, "New Effect");
		}

		public void actionPerformed(ActionEvent e) {
			instanceDialogWorker.showNewHazardEffectDialog(null, hazardInstance);
		}
	}

	private class RemoveCauseItemPressed extends AbstractAction {
		public RemoveCauseItemPressed() {
			putValue(NAME, "Remove");
		}

		public void actionPerformed(ActionEvent e) {
			DefaultMutableTreeNode n = (DefaultMutableTreeNode) panelFunctionalHazardDefinition.getCauseTree()
					.getLastSelectedPathComponent();
			if (instanceDialogWorker.isNodeHazardCause(n)) {
				instanceDialogWorker.removeHazardCause((HazardCause) n.getUserObject(), hazardInstance);
			} else if (instanceDialogWorker.isNodeHazardControl(n)) {
				instanceDialogWorker.removeHazardControl((HazardControl) n.getUserObject(), hazardInstance);
			}
			refresh();
		}
	}

	private class RemoveEffectItemPressed extends AbstractAction {
		public RemoveEffectItemPressed() {
			putValue(NAME, "Remove");
		}

		public void actionPerformed(ActionEvent e) {
			DefaultMutableTreeNode n = (DefaultMutableTreeNode) panelFunctionalHazardDefinition.getEffectTree()
					.getLastSelectedPathComponent();
			if (instanceDialogWorker.isNodeHazardEffect(n)) {
				instanceDialogWorker.removeHazardEffect((HazardEffect) n.getUserObject(), hazardInstance);
			} else if (instanceDialogWorker.isNodeHazardControl(n)) {
				instanceDialogWorker.removeHazardControl((HazardControl) n.getUserObject(), hazardInstance);
			}
			refresh();
		}
	}

	private class AddCauseControlItemPressed extends AbstractAction {
		public AddCauseControlItemPressed() {
			putValue(NAME, "New Control");
		}

		public void actionPerformed(ActionEvent e) {
			DefaultMutableTreeNode n = (DefaultMutableTreeNode) panelFunctionalHazardDefinition.getCauseTree()
					.getLastSelectedPathComponent();
			if (instanceDialogWorker.isNodeHazardCause(n)) {
				instanceDialogWorker.showNewHazardControlDialog(null, (HazardFactor) n.getUserObject(), hazardInstance);
			}
		}
	}

	private class AddEffectControlItemPressed extends AbstractAction {
		public AddEffectControlItemPressed() {
			putValue(NAME, "New Control");
		}

		public void actionPerformed(ActionEvent e) {
			DefaultMutableTreeNode n = (DefaultMutableTreeNode) panelFunctionalHazardDefinition.getEffectTree()
					.getLastSelectedPathComponent();
			if (instanceDialogWorker.isNodeHazardEffect(n)) {
				instanceDialogWorker.showNewHazardControlDialog(null, (HazardFactor) n.getUserObject(), hazardInstance);
			}
		}
	}

	private class CauseEditButtonAction extends AbstractAction {
		public CauseEditButtonAction() {
			putValue(NAME, "Edit");
			putValue(SHORT_DESCRIPTION, "Edit this hazard cause");
		}

		public void actionPerformed(ActionEvent e) {
			DefaultMutableTreeNode n = (DefaultMutableTreeNode) panelFunctionalHazardDefinition.getCauseTree()
					.getLastSelectedPathComponent();
			if (n != null) {
				if (n.getUserObject() instanceof HazardCause) {
					instanceDialogWorker.showNewHazardCauseDialog((HazardCause) n.getUserObject(), hazardInstance);
				} else if (n.getUserObject() instanceof HazardControl) {
					instanceDialogWorker.showNewHazardControlDialog((HazardControl) n.getUserObject(),
							((HazardControl) n.getUserObject()).getHazardcause(), hazardInstance);
				} else {
					DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) ((DefaultMutableTreeNode) panelFunctionalHazardDefinition
							.getCauseTree().getLastSelectedPathComponent()).getParent();
					if (parentNode.getUserObject() instanceof HazardCause) {
						instanceDialogWorker.showNewHazardCauseDialog((HazardCause) parentNode.getUserObject(),
								hazardInstance);
					}
				}
			}
		}
	}

	private class EffectEditButtonAction extends AbstractAction {
		public EffectEditButtonAction() {
			putValue(NAME, "Edit");
			putValue(SHORT_DESCRIPTION, "Edit this hazard effect");
		}

		public void actionPerformed(ActionEvent e) {
			DefaultMutableTreeNode n = (DefaultMutableTreeNode) panelFunctionalHazardDefinition.getEffectTree()
					.getLastSelectedPathComponent();
			if (n != null) {
				if (n.getUserObject() instanceof HazardEffect) {
					instanceDialogWorker.showNewHazardEffectDialog((HazardEffect) n.getUserObject(), hazardInstance);
				} else if (n.getUserObject() instanceof HazardControl) {
					instanceDialogWorker.showNewHazardControlDialog((HazardControl) n.getUserObject(),
							((HazardControl) n.getUserObject()).getHazardcause(), hazardInstance);
				} else {
					DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) ((DefaultMutableTreeNode) panelFunctionalHazardDefinition
							.getCauseTree().getLastSelectedPathComponent()).getParent();
					if (parentNode.getUserObject() instanceof HazardEffect) {
						instanceDialogWorker.showNewHazardEffectDialog((HazardEffect) parentNode.getUserObject(),
								hazardInstance);
					}
				}
			}
		}
	}

	private class OKButtonAction extends AbstractAction {
		public OKButtonAction() {
			putValue(NAME, "OK");
			putValue(SHORT_DESCRIPTION, "Create this hazard instance");
		}

		public void actionPerformed(ActionEvent e) {
			// Add the hazard instance to the datastore so it can be saved
			Main.getProject().getDatastore().getHazardrepository().getHazardInstances().add(hazardInstance);
			// Associate the instance with the relevant hazard definition and
			// step
			hazardDefinition.getHazardInstances().add(hazardInstance);
			currentStep.getAssociatedSystemFunctions().add(hazardInstance.getSystemFunction());
			instanceDialogWorker.trySaveHazardInstanceData(hazardInstance, Main.getRiskMatrix());
			parentPanel.refresh();
			if(parentPanel instanceof CardPanelHazardLogEditor){
				((CardPanelHazardLogEditor) parentPanel).selectHazardInstance(hazardInstance);
			}
			dispose();
		}
	}

	private class CancelButtonAction extends AbstractAction {
		public CancelButtonAction() {
			putValue(NAME, "Cancel");
		}

		public void actionPerformed(ActionEvent e) {
			cancelDialog();
		}
	}

	public PanelFunctionalHazardDefinition getPanelFunctionalHazardDefinition() {
		return panelFunctionalHazardDefinition;
	}

	private class SystemFunctionSelectionButtonAction extends AbstractAction {
		public SystemFunctionSelectionButtonAction() {
			putValue(NAME, "...");
			putValue(SHORT_DESCRIPTION, "Select the associated system function");
		}

		public void actionPerformed(ActionEvent e) {
			instanceDialogWorker.showSystemFunctionSelectionDialog(hazardInstance, (DialogParentPanel) thisPanel);
		}
	}

	private class ProcessStepSelectionButtonAction extends AbstractAction {
		public ProcessStepSelectionButtonAction() {
			putValue(NAME, "...");
			putValue(SHORT_DESCRIPTION, "Select the associated care process step");
		}

		public void actionPerformed(ActionEvent e) {
			instanceDialogWorker.showProcessStepSelectionDialog(hazardInstance, thisPanel);
		}
	}

	private class HazardTypeSelectionButtonAction extends AbstractAction {
		public HazardTypeSelectionButtonAction() {
			putValue(NAME, "...");
			putValue(SHORT_DESCRIPTION, "Select the associated hazard type");
		}

		public void actionPerformed(ActionEvent e) {
			instanceDialogWorker.showHazardTypeSelectionDialog(hazardInstance, thisPanel, true);
		}
	}

	@Override
	public void refresh() {
		hazardDefinition = hazardInstance.getHazardDefinition();
		currentSystemFunction = hazardInstance.getSystemFunction();
		currentStep = hazardInstance.getStep();
		updateButtons();
		instanceDialogWorker.populateCauseTree(hazardInstance, null);
		instanceDialogWorker.populateEffectTree(hazardInstance, null);
		instanceDialogWorker.populateAssociatedFunctionBox(hazardInstance);
		instanceDialogWorker.populateAssociatedHazardTypeBox(hazardInstance);
		instanceDialogWorker.populateAssociatedProcessStepBox(hazardInstance);

	}
}
