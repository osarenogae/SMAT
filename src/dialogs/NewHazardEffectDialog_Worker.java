package dialogs;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardEffect;
import careProcess_model.HazardInstance;

public class NewHazardEffectDialog_Worker {

	public HazardEffect createHazardEffect(HazardInstance hazardInstance, String name, String description) {
		HazardEffect e = CareProcess_modelFactory.eINSTANCE.createHazardEffect();
		e.setEffectName(name);
		e.setEffectDescription(description);
		hazardInstance.getHazardeffects().add(e);
		return e;
	}

}
