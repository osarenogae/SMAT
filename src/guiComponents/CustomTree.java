package guiComponents;

import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import careProcess_model.SystemDefinition;

public class CustomTree extends JTree {
	
	

	DefaultMutableTreeNode[] twoNodeHistory = new DefaultMutableTreeNode[2];

	public CustomTree() {
		this.addTreeSelectionListener(new HistoryTreeSelectionListener());
	}

	private class HistoryTreeSelectionListener implements TreeSelectionListener {
		@Override
		public void valueChanged(TreeSelectionEvent e) {
			DefaultMutableTreeNode newNode = (DefaultMutableTreeNode) ((JTree) e.getSource())
					.getLastSelectedPathComponent();
			twoNodeHistory[1] = twoNodeHistory[0];
			twoNodeHistory[0] = newNode;
		}
	}

	public DefaultMutableTreeNode getCurrentNode() {
		return twoNodeHistory[0];
	}

	public DefaultMutableTreeNode getPreviousNode() {
		return twoNodeHistory[1];
	}
	
}
