package dialogs;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import careProcess_model.SystemRepository;

public class SystemFunctionSelectionDialog_Worker {

	public void populateSystemTree(SystemRepository sr, JTree systemTree) {
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		for (Object s : sr.getSystemDefinitions()) {
			DefaultMutableTreeNode systemNode = new DefaultMutableTreeNode((SystemDefinition) s);
			root.add(systemNode);
			for (Object f : ((SystemDefinition) s).getSystemFunctions()) {
				systemNode.add(new DefaultMutableTreeNode((SystemFunction) f));
			}
		}
		systemTree.setModel(new DefaultTreeModel(root));
	}

	public boolean isNodeSystemFunction(DefaultMutableTreeNode n) {
		if (n != null) {
			if (n.getUserObject() instanceof SystemFunction) {
				return true;
			}
		}
		return false;
	}

	public SystemFunction chooseSystemFunction(DefaultMutableTreeNode n) {
		return (SystemFunction) n.getUserObject();
	}

}
