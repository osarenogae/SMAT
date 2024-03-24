package dialogs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;

import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import RiskMatrixModel.LikelihoodLevel;
import RiskMatrixModel.RiskMatrix;
import RiskMatrixModel.RiskMatrixModelFactory;
import RiskMatrixModel.RiskRatingInstance;
import RiskMatrixModel.SeverityLevel;
import careProcess_model.ControlStateEnum;
import careProcess_model.HazardCause;
import careProcess_model.HazardControl;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardEffect;
import careProcess_model.HazardFactor;
import careProcess_model.HazardInstance;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
import main.Main;
import userInterface.DialogParentPanel;
import userInterface.PanelFunctionalHazardDefinition;
import userInterface.WorkerUtilities;
import utilities.DataHelper;

public class FunctionalHazardDefinitionDialog_Worker {

	private static final String EXISTING_CONTROLS_LABEL = "Existing Controls";
	private static final String ADDITIONAL_CONTROLS_LABEL = "Additional Controls";

	FunctionalHazardDefinitionDialog dialog;
	SystemFunction associatedFunction;
	Step associatedStep;

	private String initialName;
	private String initialDescription;
	private Collection<HazardCause> initialCauses;
	private Collection<HazardEffect> initialEffects;
	private int initialInitialLikelihood;
	private int initialResidualLikelihood;
	private int initialInitialSeverity;
	private int initialResidualSeverity;
	private int initialInitialRiskRating;
	private int initialResidualRiskRating;
	private HazardDefinition initialHazardType;
	private SystemFunction initialSystemFunction;
	private Step initialStep;

	public FunctionalHazardDefinitionDialog_Worker(FunctionalHazardDefinitionDialog fullDialog) {
		dialog = fullDialog;
	}

	public void storeInitialInstanceData(HazardInstance i) {
		initialName = i.getName();
		initialHazardType = i.getHazardDefinition();
		initialSystemFunction = i.getSystemFunction();
		initialStep = i.getStep();
		initialDescription = i.getDescription();
		initialCauses = EcoreUtil.copyAll(i.getHazardcauses());
		initialEffects = EcoreUtil.copyAll(i.getHazardeffects());
		initialInitialLikelihood = i.getInitialLikelihood();
		initialResidualLikelihood = i.getResidualLikelihood();
		initialInitialSeverity = i.getInitialSeverity();
		initialResidualSeverity = i.getResidualSeverity();
		initialInitialRiskRating = i.getInitialRiskRating();
		initialResidualRiskRating = i.getResidualRiskRating();
	}

	public void restoreInitialInstanceData(HazardInstance i) {
		i.setName(initialName);
		i.setHazardDefinition(initialHazardType);
		i.setSystemFunction(initialSystemFunction);
		i.setStep(initialStep);
		i.setDescription(initialDescription);
		i.getHazardcauses().clear();
		i.getHazardcauses().addAll(initialCauses);
		i.getHazardeffects().clear();
		i.getHazardeffects().addAll(initialEffects);
		i.setInitialLikelihood(initialInitialLikelihood);
		i.setResidualLikelihood(initialResidualLikelihood);
		i.setInitialSeverity(initialInitialSeverity);
		i.setResidualSeverity(initialResidualSeverity);
		i.setInitialRiskRating(initialInitialRiskRating);
		i.setResidualRiskRating(initialResidualRiskRating);
	}

	/**
	 * Populate all the fields with data from the given hazard instance and risk
	 * matrix
	 * 
	 * @param rm
	 * @param i
	 */
	public void loadHazardInstanceData(RiskMatrix rm, HazardInstance i) {
		PanelFunctionalHazardDefinition dataPanel = dialog.getPanelFunctionalHazardDefinition();
		associatedFunction = i.getSystemFunction();
		if (associatedFunction != null) {
			dataPanel.getAssociatedFunctionTextField().setText(associatedFunction.getSystemDefinition().getSystemName()
					+ " > " + associatedFunction.getFunctionName());
		}
		dataPanel.getCauseTree().setModel(getCauseTreeModel(i));
		dataPanel.getEffectTree().setModel(getEffectTreeModel(i));
		if (!i.getHazardeffects().isEmpty()) {
			dataPanel.getImpactTextArea().setText(i.getHazardeffects().get(0).getEffectDescription());
		}
		dataPanel.getSeverityLikelihoodRiskTable().setModel(getSeverityLikelihoodTableModel(i));
		setUpTable(rm, dataPanel.getSeverityLikelihoodRiskTable(), i);
		dataPanel.getNameTextField().setText(i.getName());
		dataPanel.getDescriptionTextArea().setText(i.getDescription());
		dataPanel.getClinicalJustificationTextArea().setText(i.getClinicalJustification());
		dataPanel.getImpactTextArea().setText(i.getSummary());
		dataPanel.getStatusTextField().setText(i.getStatus());
	}

	/**
	 * Auto-fill the risk rating cells based on the values in the severity and
	 * likelihood cells.
	 * 
	 * @param rm
	 */
	public void updateRiskRatings(RiskMatrix rm) {

		PanelFunctionalHazardDefinition dataPanel = dialog.getPanelFunctionalHazardDefinition();
		JTable table = dataPanel.getSeverityLikelihoodRiskTable();
		int initialRating = DataHelper.getRiskRatingByLikelihoodSeverity(rm,
				(LikelihoodLevel) table.getModel().getValueAt(0, 1),
				((SeverityLevel) table.getModel().getValueAt(0, 0)));
		int residualRating = DataHelper.getRiskRatingByLikelihoodSeverity(rm,
				(LikelihoodLevel) table.getModel().getValueAt(1, 1),
				((SeverityLevel) table.getModel().getValueAt(1, 0)));

		Object initial = table.getModel().getValueAt(0, 2);
		Object residual = table.getModel().getValueAt(1, 2);
		if (!(initial instanceof Integer)) {
			table.getModel().setValueAt(initialRating, 0, 2);
		}

		if (!(residual instanceof Integer)) {
			table.getModel().setValueAt(residualRating, 1, 2);
		}

		if ((int) table.getModel().getValueAt(0, 2) != initialRating) {
			table.getModel().setValueAt(initialRating, 0, 2);
		}
		if ((int) table.getModel().getValueAt(1, 2) != residualRating) {
			table.getModel().setValueAt(residualRating, 1, 2);
		}
	}

	/**
	 * Set up the table with the required dropdown boxes whose possible values
	 * come from the given RiskMatrix and whose selected values come from the
	 * given hazard instance.
	 * 
	 * @param rm
	 * @param table
	 * @param i
	 */
	private void setUpTable(RiskMatrix rm, JTable table, HazardInstance i) {
		TableColumn likelihoodColumn = table.getColumnModel().getColumn(1);
		JComboBox<LikelihoodLevel> likelihoodComboBox = new JComboBox<LikelihoodLevel>();
		likelihoodComboBox.addItem(null);
		for (LikelihoodLevel sl : Main.getRiskMatrix().getLikelihoodlevel()) {
			likelihoodComboBox.addItem(sl);
		}
		likelihoodColumn.setCellEditor(new DefaultCellEditor(likelihoodComboBox));
		table.getModel().setValueAt(DataHelper.getLikelihoodByIndex(rm, i.getInitialLikelihood()), 0, 1);
		table.getModel().setValueAt(DataHelper.getLikelihoodByIndex(rm, i.getResidualLikelihood()), 1, 1);

		TableColumn severityColumn = table.getColumnModel().getColumn(0);
		JComboBox<SeverityLevel> severityComboBox = new JComboBox<SeverityLevel>();
		severityComboBox.addItem(null);
		for (SeverityLevel sl : Main.getRiskMatrix().getSeveritylevel()) {
			severityComboBox.addItem(sl);
		}
		severityColumn.setCellEditor(new DefaultCellEditor(severityComboBox));
		table.getModel().setValueAt(DataHelper.getSeverityByIndex(rm, i.getInitialSeverity()), 0, 0);
		table.getModel().setValueAt(DataHelper.getSeverityByIndex(rm, i.getResidualSeverity()), 1, 0);

		int initialRating = DataHelper.getRiskRatingByLikelihoodSeverity(rm,
				(LikelihoodLevel) table.getModel().getValueAt(0, 1),
				((SeverityLevel) table.getModel().getValueAt(0, 0)));
		int residualRating = DataHelper.getRiskRatingByLikelihoodSeverity(rm,
				(LikelihoodLevel) table.getModel().getValueAt(1, 1),
				((SeverityLevel) table.getModel().getValueAt(1, 0)));

		table.getModel().setValueAt(initialRating, 0, 2);
		table.getModel().setValueAt(residualRating, 1, 2);
	}

	/**
	 * Create the table model for the likelihood/severity table. Note: The data
	 * it is filled with is overwritten in
	 * {@link #setUpTable(RiskMatrix, JTable, HazardInstance)}.
	 * 
	 * @param i
	 * @return a new table model for the severity/likelihood table
	 */
	private DefaultTableModel getSeverityLikelihoodTableModel(HazardInstance i) {
		DefaultTableModel m = new DefaultTableModel(
				new Object[][] { { i.getInitialSeverity(), i.getInitialLikelihood(), i.getInitialRiskRating() },
						{ i.getResidualSeverity(), i.getResidualLikelihood(), i.getResidualRiskRating() }, },
				new String[] { "Severity", "Likelihood", "Risk Rating" });

		return m;
	}

	/**
	 * Fill the causes tree structure with data
	 * 
	 * @param i
	 * @param selectedObject
	 */
	public void populateCauseTree(HazardInstance i, Object selectedObject) {
		// TODO These populate methods are very similar. Refactor to combine
		// them.
		PanelFunctionalHazardDefinition dataPanel = dialog.getPanelFunctionalHazardDefinition();
		dataPanel.getCauseTree().setModel(getCauseTreeModel(i));
		if (selectedObject != null) {
			TreePath p = WorkerUtilities.getNodePathByObject(
					(DefaultMutableTreeNode) dataPanel.getCauseTree().getModel().getRoot(), selectedObject);
			dataPanel.getCauseTree().scrollPathToVisible(p);
			dataPanel.getCauseTree().setSelectionPath(p);
		}
	}

	/**
	 * Fill the effects tree structure with data
	 * 
	 * @param i
	 * @param selectedObject
	 */
	public void populateEffectTree(HazardInstance i, Object selectedObject) {
		// TODO These populate methods are very similar. Refactor to combine
		// them.
		PanelFunctionalHazardDefinition dataPanel = dialog.getPanelFunctionalHazardDefinition();
		dataPanel.getEffectTree().setModel(getEffectTreeModel(i));
		if (selectedObject != null) {
			TreePath p = WorkerUtilities.getNodePathByObject(
					(DefaultMutableTreeNode) dataPanel.getEffectTree().getModel().getRoot(), selectedObject);
			dataPanel.getEffectTree().scrollPathToVisible(p);
			dataPanel.getEffectTree().setSelectionPath(p);
		}

	}

	/**
	 * get a new model for the cause tree
	 * 
	 * @param i
	 * @return
	 */
	private DefaultTreeModel getCauseTreeModel(HazardInstance i) {
		Iterator<HazardCause> causeIterator = i.getHazardcauses().iterator();

		DefaultMutableTreeNode root = new DefaultMutableTreeNode();

		DefaultMutableTreeNode causesParentNode = new DefaultMutableTreeNode("Cause");
		root.add(causesParentNode);

		while (causeIterator.hasNext()) {
			HazardCause cause = causeIterator.next();
			Iterator<HazardControl> controlIterator = cause.getHazardcontrols().iterator();

			DefaultMutableTreeNode causeNode = new DefaultMutableTreeNode(cause);

			DefaultMutableTreeNode existingControlsNode = new DefaultMutableTreeNode(EXISTING_CONTROLS_LABEL);
			DefaultMutableTreeNode additionalControlsNode = new DefaultMutableTreeNode(ADDITIONAL_CONTROLS_LABEL);

			int existingCounter = 0;
			int additionalCounter = 0;
			while (controlIterator.hasNext()) {
				HazardControl control = controlIterator.next();
				if (control.getControlState().equals(ControlStateEnum.EXISTING)) {
					existingCounter++;
					existingControlsNode.add(new DefaultMutableTreeNode(control));
				} else {
					additionalCounter++;
					additionalControlsNode.add(new DefaultMutableTreeNode(control));
				}
			}

			String existingControlsName = EXISTING_CONTROLS_LABEL + " (" + Integer.toString(existingCounter) + ")";
			String additionalControlsName = ADDITIONAL_CONTROLS_LABEL + " (" + Integer.toString(additionalCounter)
					+ ")";
			existingControlsNode.setUserObject(existingControlsName);
			additionalControlsNode.setUserObject(additionalControlsName);

			causeNode.add(existingControlsNode);
			causeNode.add(additionalControlsNode);

			causesParentNode.add(causeNode);
		}

		return new DefaultTreeModel(root);
	}

	/**
	 * get a new model for the effect tree
	 * 
	 * @param i
	 * @return
	 */
	private DefaultTreeModel getEffectTreeModel(HazardInstance i) {
		Iterator<HazardEffect> effectIterator = i.getHazardeffects().iterator();

		DefaultMutableTreeNode root = new DefaultMutableTreeNode();

		DefaultMutableTreeNode effectsParentNode = new DefaultMutableTreeNode("Effect");
		root.add(effectsParentNode);

		while (effectIterator.hasNext()) {
			HazardEffect effect = effectIterator.next();
			Iterator<HazardControl> controlIterator = effect.getHazardcontrols().iterator();

			DefaultMutableTreeNode effectNode = new DefaultMutableTreeNode(effect);

			DefaultMutableTreeNode existingControlsNode = new DefaultMutableTreeNode(EXISTING_CONTROLS_LABEL);
			DefaultMutableTreeNode additionalControlsNode = new DefaultMutableTreeNode(ADDITIONAL_CONTROLS_LABEL);

			int existingCounter = 0;
			int additionalCounter = 0;
			while (controlIterator.hasNext()) {
				HazardControl control = controlIterator.next();
				if (control.getControlState().equals(ControlStateEnum.EXISTING)) {
					existingCounter++;
					existingControlsNode.add(new DefaultMutableTreeNode(control));
				} else {
					additionalCounter++;
					additionalControlsNode.add(new DefaultMutableTreeNode(control));
				}
			}

			String existingControlsName = EXISTING_CONTROLS_LABEL + " (" + Integer.toString(existingCounter) + ")";
			String additionalControlsName = ADDITIONAL_CONTROLS_LABEL + " (" + Integer.toString(additionalCounter)
					+ ")";
			existingControlsNode.setUserObject(existingControlsName);
			additionalControlsNode.setUserObject(additionalControlsName);

			effectNode.add(existingControlsNode);
			effectNode.add(additionalControlsNode);

			effectsParentNode.add(effectNode);
		}

		return new DefaultTreeModel(root);
	}

	/**
	 * Attempt to store the data associated with the input hazard instance by
	 * updating the values of the associated data objects. This method does not
	 * save anything to a file, it just updates the data model.
	 * 
	 * @param i
	 *            The hazard instance whose data will be modified
	 */
	public void trySaveHazardInstanceData(HazardInstance i, RiskMatrix rm) {
		PanelFunctionalHazardDefinition dataPanel = dialog.getPanelFunctionalHazardDefinition();

		// Save the risk data from the table.
		SeverityLevel initialSeverity = ((SeverityLevel) dataPanel.getSeverityLikelihoodRiskTable().getModel()
				.getValueAt(0, 0));
		SeverityLevel residualSeverity = ((SeverityLevel) dataPanel.getSeverityLikelihoodRiskTable().getModel()
				.getValueAt(1, 0));

		LikelihoodLevel initialLikelihood = ((LikelihoodLevel) dataPanel.getSeverityLikelihoodRiskTable().getModel()
				.getValueAt(0, 1));

		LikelihoodLevel residualLikelihood = ((LikelihoodLevel) dataPanel.getSeverityLikelihoodRiskTable().getModel()
				.getValueAt(1, 1));

		if (initialSeverity != null) {
			i.setInitialSeverity((int) initialSeverity.getLevelIndex());
		} else {
			i.setInitialSeverity(-1);
		}
		if (residualSeverity != null) {
			i.setResidualSeverity((int) residualSeverity.getLevelIndex());
		} else {
			i.setResidualSeverity(-1);
		}
		if (initialLikelihood != null) {
			i.setInitialLikelihood((int) initialLikelihood.getLevelIndex());
		} else {
			i.setInitialLikelihood(-1);
		}
		if (residualLikelihood != null) {
			i.setResidualLikelihood((int) residualLikelihood.getLevelIndex());
		} else {
			i.setResidualLikelihood(-1);
		}

		// If the user has edited the risk rating cells, reset them to the
		// auto-filled value.
		if (!(dataPanel.getSeverityLikelihoodRiskTable().getModel().getValueAt(0, 2) instanceof Integer)
				|| !(dataPanel.getSeverityLikelihoodRiskTable().getModel().getValueAt(1, 2) instanceof Integer)) {
			updateRiskRatings(rm);
		}
		i.setInitialRiskRating((int) dataPanel.getSeverityLikelihoodRiskTable().getModel().getValueAt(0, 2));
		i.setResidualRiskRating((int) dataPanel.getSeverityLikelihoodRiskTable().getModel().getValueAt(1, 2));

		i.setName(dataPanel.getNameTextField().getText());
		i.setDescription(dataPanel.getDescriptionTextArea().getText());
		i.setSummary(dataPanel.getImpactTextArea().getText());
		i.setClinicalJustification(dataPanel.getClinicalJustificationTextArea().getText());
		i.setStatus(dataPanel.getStatusTextField().getText());

	}

	public void showSystemFunctionSelectionDialog(HazardInstance hazardInstance, DialogParentPanel parentPanel) {
		SystemFunctionSelectionDialog d = new SystemFunctionSelectionDialog(hazardInstance, null, parentPanel);
		d.pack();
		d.setVisible(true);
	}

	public void populateAssociatedFunctionBox(HazardInstance h) {
		String label = "Select a system function...";
		JTextField functionText = dialog.getPanelFunctionalHazardDefinition().getAssociatedFunctionTextField();
		if (h != null && h.getSystemFunction() != null) {

			String systemName = h.getSystemFunction().getSystemDefinition().getSystemName();
			String functionName = h.getSystemFunction().getFunctionName();
			label = systemName + " \u2192 " + functionName;

		}
		functionText.setText(label);
	}

	public void populateAssociatedProcessStepBox(HazardInstance h) {
		String label = "Select a care process step...";
		JTextField stepText = dialog.getPanelFunctionalHazardDefinition().getAssociatedStepTextField();
		if (h != null && h.getStep() != null) {
			String processName = h.getStep().getProcessGraph().getCareProcess().getName();
			String stepName = h.getStep().toString();
			label = processName + " \u2192 " + stepName;
		}
		stepText.setText(label);
	}

	public void populateAssociatedHazardTypeBox(HazardInstance h) {
		String label = "Select a hazard type...";
		JTextField typeText = dialog.getPanelFunctionalHazardDefinition().getAssociatedHazardTypeTextField();
		if (h != null && h.getHazardDefinition() != null) {
			label = h.getHazardDefinition().getHazardName();
		}
		typeText.setText(label);
	}

	public boolean isNodeHazardControl(DefaultMutableTreeNode n) {
		if (n != null) {
			if (n.getUserObject() instanceof HazardControl) {
				return true;
			}
		}
		return false;
	}

	public boolean isNodeHazardCause(DefaultMutableTreeNode n) {
		if (n != null) {
			if (n.getUserObject() instanceof HazardCause) {
				return true;
			}
		}
		return false;
	}

	public boolean isNodeHazardEffect(DefaultMutableTreeNode n) {
		if (n != null) {
			if (n.getUserObject() instanceof HazardEffect) {
				return true;
			}
		}
		return false;
	}

	public HazardControl chooseHazardControl(DefaultMutableTreeNode n) {
		return (HazardControl) n.getUserObject();
	}

	public void showNewHazardCauseDialog(HazardCause existingCause, HazardInstance hazardInstance) {
		NewHazardCauseDialog d = new NewHazardCauseDialog(existingCause, hazardInstance, this);
		d.pack();
		d.setVisible(true);
	}

	public void showNewHazardEffectDialog(HazardEffect existingEffect, HazardInstance hazardInstance) {
		NewHazardEffectDialog d = new NewHazardEffectDialog(existingEffect, hazardInstance, this);
		d.pack();
		d.setVisible(true);
	}

	public void showNewHazardControlDialog(HazardControl existingControl, HazardFactor hazardFactor,
			HazardInstance hazardInstance) {
		NewHazardControlDialog d = new NewHazardControlDialog(existingControl, hazardInstance, hazardFactor, this);
		d.pack();
		d.setVisible(true);
	}

	public void showProcessStepSelectionDialog(HazardInstance hazardInstance, DialogParentPanel dialogParentPanel) {
		ProcessStepSelectionDialog d = new ProcessStepSelectionDialog(hazardInstance, dialogParentPanel);
		d.pack();
		d.setVisible(true);
	}

	public void showHazardTypeSelectionDialog(HazardInstance hazardInstance, DialogParentPanel dialogParentPanel,
			boolean newTypeAllowed) {
		HazardTypeSelectionDialog d = new HazardTypeSelectionDialog(hazardInstance, dialogParentPanel, newTypeAllowed);
		d.pack();
		d.setVisible(true);
	}

	public void removeHazardCause(HazardCause hcause, HazardInstance hi) {
		hi.getHazardcauses().remove(hcause);
		EcoreUtil.remove(hcause);
	}

	public void removeHazardControl(HazardControl hcontrol, HazardInstance hi) {
		Iterator<HazardCause> causeIterator = hi.getHazardcauses().iterator();
		Iterator<HazardEffect> effectIterator = hi.getHazardeffects().iterator();
		while (causeIterator.hasNext()) {
			HazardCause c = causeIterator.next();
			c.getHazardcontrols().remove(hcontrol);
		}
		while (effectIterator.hasNext()) {
			HazardEffect e = effectIterator.next();
			e.getHazardcontrols().remove(hcontrol);
		}

		EcoreUtil.delete(hcontrol);

	}

	public void removeHazardEffect(HazardEffect heffect, HazardInstance hi) {
		hi.getHazardeffects().remove(heffect);
		EcoreUtil.remove(heffect);
	}

}
