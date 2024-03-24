package userInterface;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import careProcess_model.SystemDefinition;
import careProcess_model.SystemRepository;
import guiComponents.CustomTree;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.util.Enumeration;

import javax.swing.Action;
import java.awt.FlowLayout;

/**
 * Part of the system editor section, contains the tree explorer for system definitions.
 * @author George
 *
 */
public class PanelSystemTreeExplorer extends JPanel {

	CustomTree systemExplorerTree;
	private JButton btnNewSystem;
	private JButton btnRemoveSystem;

	/**
	 * Create the panel.
	 */
	public PanelSystemTreeExplorer() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "System Explorer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel);

		JScrollPane scrollPane = new JScrollPane();
		panel.setLayout(new BorderLayout(0, 0));
		
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.NORTH);
				panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
				
						btnNewSystem = new JButton("Add System");
						panel_1.add(btnNewSystem);
						
						btnRemoveSystem = new JButton("Remove System");
						panel_1.add(btnRemoveSystem);
		panel.add(scrollPane);

		systemExplorerTree = new CustomTree();
		systemExplorerTree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Root") {
				{
				}
			}
		));
		systemExplorerTree.setRootVisible(false);
		scrollPane.setViewportView(systemExplorerTree);
	}

	

	public JButton getBtnNewSystem() {
		return btnNewSystem;
	}

	public CustomTree getSystemExplorerTree() {
		return systemExplorerTree;
	}
	public JButton getBtnRemoveSystem() {
		return btnRemoveSystem;
	}
}
