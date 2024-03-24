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
/**
 * Part of the hazard log editor. Contains the "explorer" section - a tree for browsing hazard definitions.
 * @author George
 *
 */
public class PanelHazardTreeExplorer extends JPanel {

	JTree hazardExplorerTree;
	private JButton btnNewHazard;
	private JButton btnRemoveHazard;

	/**
	 * Create the panel.
	 */
	public PanelHazardTreeExplorer() {

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Hazard Explorer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JScrollPane scrollPane = new JScrollPane();

		hazardExplorerTree = new JTree();
		hazardExplorerTree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Root") {
				{
				}
			}
		));
		hazardExplorerTree.setRootVisible(false);
		scrollPane.setViewportView(hazardExplorerTree);
						GroupLayout groupLayout = new GroupLayout(this);
						groupLayout.setHorizontalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(panel, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
									.addGap(5))
						);
						groupLayout.setVerticalGroup(
							groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
						);
						
								JPanel panel_1 = new JPanel();
										
												btnNewHazard = new JButton("New Hazard");
										
										btnRemoveHazard = new JButton("Remove Hazard");
										GroupLayout gl_panel_1 = new GroupLayout(panel_1);
										gl_panel_1.setHorizontalGroup(
											gl_panel_1.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_panel_1.createSequentialGroup()
													.addContainerGap(97, Short.MAX_VALUE)
													.addComponent(btnNewHazard)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(btnRemoveHazard, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
										);
										gl_panel_1.setVerticalGroup(
											gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
													.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
														.addComponent(btnRemoveHazard)
														.addComponent(btnNewHazard)))
										);
										panel_1.setLayout(gl_panel_1);
						GroupLayout gl_panel = new GroupLayout(panel);
						gl_panel.setHorizontalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
						);
						gl_panel.setVerticalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
						);
						panel.setLayout(gl_panel);
						setLayout(groupLayout);
	}


	public JButton getBtnNewHazard() {
		return btnNewHazard;
	}

	public JTree getHazardExplorerTree() {
		return hazardExplorerTree;
	}
	public JButton getBtnRemoveHazard() {
		return btnRemoveHazard;
	}
}
