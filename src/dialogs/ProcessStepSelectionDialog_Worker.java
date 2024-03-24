package dialogs;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import careProcess_model.CareProcess;
import careProcess_model.Project;
import careProcess_model.Step;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import careProcess_model.SystemRepository;
import careProcess_model.stepType;

public class ProcessStepSelectionDialog_Worker {

	public void populateStepTree(Project p, JTree stepTree) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for (Object c : p.getCareProcesses()) {
			DefaultMutableTreeNode careProcessNode = new DefaultMutableTreeNode((CareProcess) c);
			root.add(careProcessNode);
			for (Object s : ((CareProcess) c).getProcessGraph().getStep()) {
				if (((Step) s).getStepTypeValue() != stepType.START && ((Step) s).getStepTypeValue() != stepType.STOP) {
					careProcessNode.add(new DefaultMutableTreeNode((Step) s));
				}
			}
		}
		stepTree.setModel(new DefaultTreeModel(root));
	}

	public boolean isNodeProcessStep(DefaultMutableTreeNode n) {
		if (n != null) {
			if (n.getUserObject() instanceof Step) {
				return true;
			}
		}
		return false;
	}

	public Step chooseStep(DefaultMutableTreeNode n) {
		return (Step) n.getUserObject();
	}

}
