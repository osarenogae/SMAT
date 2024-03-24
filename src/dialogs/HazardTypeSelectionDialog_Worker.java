package dialogs;

import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;

import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
import careProcess_model.HazardRepository;
import careProcess_model.Step;

public class HazardTypeSelectionDialog_Worker {

	public DefaultListModel<HazardDefinition> getHazardDefinitionListModel(HazardRepository hr) {
		Iterator<HazardDefinition> HazardDefinition = hr.getHazardDefinitions().iterator();
		DefaultListModel<HazardDefinition> m = new DefaultListModel<HazardDefinition>();
		while (HazardDefinition.hasNext()) {
			m.addElement(HazardDefinition.next());
		}
		return m;
	}

}
