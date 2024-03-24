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
 * Part of the issue log editor, contains the tree explorer for the issue definitions.
 * @author George
 *
 */
public class PanelIssueTreeExplorer extends JPanel {

	JTree issueExplorerTree;
	private JButton btnNewIssue;
	private JButton btnRemoveIssue;

	/**
	 * Create the panel.
	 */
	public PanelIssueTreeExplorer() {

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Issue Explorer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JScrollPane scrollPane = new JScrollPane();

		issueExplorerTree = new JTree();
		issueExplorerTree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Root") {
				{
				}
			}
		));
		issueExplorerTree.setRootVisible(false);
		scrollPane.setViewportView(issueExplorerTree);
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
						
								JPanel buttonPanel = new JPanel();
										
												btnNewIssue = new JButton("New Issue");
										
										btnRemoveIssue = new JButton("Remove Issue");
						GroupLayout gl_panel = new GroupLayout(panel);
						gl_panel.setHorizontalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
								.addComponent(buttonPanel, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
						);
						gl_panel.setVerticalGroup(
							gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
						);
						buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
						buttonPanel.add(btnNewIssue);
						buttonPanel.add(btnRemoveIssue);
						panel.setLayout(gl_panel);
						setLayout(groupLayout);
	}


	public JButton getBtnNewIssue() {
		return btnNewIssue;
	}

	public JTree getIssueExplorerTree() {
		return issueExplorerTree;
	}
	public JButton getBtnRemoveIssue() {
		return btnRemoveIssue;
	}
}
