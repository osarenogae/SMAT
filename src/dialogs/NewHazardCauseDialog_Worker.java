package dialogs;

import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardCause;
import careProcess_model.HazardInstance;

public class NewHazardCauseDialog_Worker {

	public HazardCause createHazardCause(HazardInstance hazardInstance, String name, String description) {
		HazardCause c = CareProcess_modelFactory.eINSTANCE.createHazardCause();
		c.setCauseName(name);
		hazardInstance.getHazardcauses().add(c);
		return c;
	}

}
