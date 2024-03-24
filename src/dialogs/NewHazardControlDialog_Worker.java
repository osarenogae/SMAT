package dialogs;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.ControlStateEnum;
import careProcess_model.ControlTypeEnum;
import careProcess_model.ControlTypeEum;
import careProcess_model.HazardCause;
import careProcess_model.HazardControl;
import careProcess_model.HazardEffect;
import careProcess_model.HazardInstance;

public class NewHazardControlDialog_Worker {

	public void addNewControl(HazardCause hazardCause, String controlName, String controlDescription,
			ControlStateEnum state, EList<ControlTypeEnum> controlType) {
		HazardControl newControl = CareProcess_modelFactory.eINSTANCE.createHazardControl();
		newControl.setControlState(state);
		newControl.setName(controlName);
		newControl.setDescription(controlDescription);
		Iterator<ControlTypeEnum> typeIterator = controlType.iterator();
		EList<ControlTypeEnum> newControlTypes = newControl.getControlTypes();
		while (typeIterator.hasNext()) {
			newControlTypes.add((ControlTypeEnum) typeIterator.next());
		}
		hazardCause.getHazardcontrols().add(newControl);
	}

	public void clearForm(NewHazardControlDialog d) {
		// Clear the name and description fields
		d.getControlNameTextField().setText(null);
		d.getControlDescriptionTextArea().setText(null);

		// Clear the control state (existing/additional) combo-box
		d.getControlTypeComboBox().setSelectedItem(null);

		// Clear the "other" control type text field
		d.getOtherTextField().setText(null);

		// Clear the control type check-boxes
		d.getChckbxBusinessProcessChange().setSelected(false);
		d.getChckbxDesign().setSelected(false);
		d.getChckbxTest().setSelected(false);
		d.getChckbxTraining().setSelected(false);
	}

	/**
	 * Fill the data-containing components in the NewHazardControlDialog
	 * <code>d</code> with the data stored in HazardControl <code>hc</code>
	 * 
	 * @param hc
	 *            the hazard control instance whose data will be used to fill
	 *            the form.
	 * @param d
	 *            the NewHazardControlDialog instance containing the form
	 *            components to be filled.
	 */
	public void populateForm(HazardControl hc, NewHazardControlDialog d) {
		clearForm(d);
		if (hc != null) {
			// Set the name and description fields
			d.getControlNameTextField().setText(hc.getName());
			d.getControlDescriptionTextArea().setText(hc.getDescription());

			// Set the control state (existing/additional) combo-box
			d.getControlTypeComboBox().setSelectedItem(hc.getControlState());

			// Set the "other" control type text field
			d.getOtherTextField().setText(hc.getOtherText());

			// Set the control type check-boxes
			d.getChckbxBusinessProcessChange().setSelected(false);
			d.getChckbxDesign().setSelected(false);
			d.getChckbxTest().setSelected(false);
			d.getChckbxTraining().setSelected(false);
			Iterator<ControlTypeEnum> controlTypesIterator = hc.getControlTypes().iterator();
			while (controlTypesIterator.hasNext()) {
				ControlTypeEnum type = controlTypesIterator.next();
				switch (type) {
				case BUSINESS_PROCESS_CHANGE:
					d.getChckbxBusinessProcessChange().setSelected(true);
					break;
				case DESIGN:
					d.getChckbxDesign().setSelected(true);
					break;
				case TEST:
					d.getChckbxTest().setSelected(true);
					break;
				case TRAINING:
					d.getChckbxTraining().setSelected(true);
					break;
				default:
					break;

				}
			}
		}
	}

	public void saveFormData(HazardControl existingHazardControl, NewHazardControlDialog d,
			FunctionalHazardDefinitionDialog_Worker instanceWorker) {
		// If we have an existing control object, update its data.
		if (existingHazardControl != null) {
			setControlData(d, existingHazardControl);
			if (d.getHazardFactor() instanceof HazardCause) {
				instanceWorker.populateCauseTree(d.getHazardInstance(), existingHazardControl);
			} else {
				instanceWorker.populateEffectTree(d.getHazardInstance(), existingHazardControl);
			}
		}
		// Otherwise, make a new control object and add the data to it.
		else {
			HazardControl newHazardControl = CareProcess_modelFactory.eINSTANCE.createHazardControl();
			setControlData(d, newHazardControl);
			if (d.getHazardFactor() instanceof HazardCause) {
				((HazardCause) d.getHazardFactor()).getHazardcontrols().add(newHazardControl);
				instanceWorker.populateCauseTree(d.getHazardInstance(), newHazardControl);
			}
			if (d.getHazardFactor() instanceof HazardEffect) {
				((HazardEffect) d.getHazardFactor()).getHazardcontrols().add(newHazardControl);
				instanceWorker.populateEffectTree(d.getHazardInstance(), newHazardControl);
			}
		}

	}

	private void setControlData(NewHazardControlDialog d, HazardControl hc) {
		hc.setName(d.getControlNameTextField().getText());
		hc.setDescription(d.getControlDescriptionTextArea().getText());
		hc.setControlState((ControlStateEnum) d.getControlTypeComboBox().getSelectedItem());

		EList<ControlTypeEnum> controlTypes = hc.getControlTypes();
		if (d.getChckbxBusinessProcessChange().isSelected()) {
			controlTypes.add(ControlTypeEnum.BUSINESS_PROCESS_CHANGE);
		} else {
			if (controlTypes.contains(ControlTypeEnum.BUSINESS_PROCESS_CHANGE)) {
				controlTypes.remove(ControlTypeEnum.BUSINESS_PROCESS_CHANGE);
			}
		}
		if (d.getChckbxDesign().isSelected()) {
			controlTypes.add(ControlTypeEnum.DESIGN);
		} else {
			if (controlTypes.contains(ControlTypeEnum.DESIGN)) {
				controlTypes.remove(ControlTypeEnum.DESIGN);
			}
		}
		if (d.getChckbxTest().isSelected()) {
			controlTypes.add(ControlTypeEnum.TEST);
		} else {
			if (controlTypes.contains(ControlTypeEnum.TEST)) {
				controlTypes.remove(ControlTypeEnum.TEST);
			}
		}
		if (d.getChckbxTraining().isSelected()) {
			controlTypes.add(ControlTypeEnum.TRAINING);
		} else {
			if (controlTypes.contains(ControlTypeEnum.TRAINING)) {
				controlTypes.remove(ControlTypeEnum.TRAINING);
			}
		}

		hc.setOtherText(d.getOtherTextField().getText());

	}
}
