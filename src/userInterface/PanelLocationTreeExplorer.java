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

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.util.Enumeration;

import javax.swing.Action;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.FlowLayout;

/**
 * Part of the care setting editor, contains the tree explorer for location definitions.
 */
public class PanelLocationTreeExplorer extends JPanel {

	JTree locationExplorerTree;
	private JButton btnNewSubLocation;
	private JButton btnRemoveLocation;

	/**
	 * Create the panel.
	 */
	public PanelLocationTreeExplorer() {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Care Setting Explorer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(panel);

		JScrollPane scrollPane = new JScrollPane();
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(scrollPane);

		locationExplorerTree = new JTree();
		locationExplorerTree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Root") {
				{
				}
			}
		));
		locationExplorerTree.setRootVisible(false);
		scrollPane.setViewportView(locationExplorerTree);
		
				JPanel panel_1 = new JPanel();
				scrollPane.setColumnHeaderView(panel_1);
						panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
				
						btnNewSubLocation = new JButton("Add Care Setting");
						panel_1.add(btnNewSubLocation);
						
						btnRemoveLocation = new JButton("Remove Care Setting");
						panel_1.add(btnRemoveLocation);
	}
	

	public JButton getBtnNewLocation() {
		return btnNewSubLocation;
	}

	public JTree getLocationExplorerTree() {
		return locationExplorerTree;
	}
	public JButton getBtnRemoveLocation() {
		return btnRemoveLocation;
	}
}
