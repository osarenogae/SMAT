package userInterface;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTree;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import java.awt.Color;

/**
 * Part of the editor data panel, contains the function selection list and
 * hazard instance selection/edit table.
 */
public class PanelSystemAndSafetyProperties extends JPanel {
	private JButton btnAddHazardInstance;
	private JTree systemFunctionsTree;
	private JButton btnAddSystemFunction;
	private JButton btnEditHazardInstance;
	private JTable hazardInstanceTable;
	private JButton btnRemoveSystemFunction;
	private JButton btnRemoveHazardInstance;

	/**
	 * Create the panel.
	 */
	public PanelSystemAndSafetyProperties() {
		setLayout(new BorderLayout(0, 0));

		JPanel outerPanel = new JPanel();
		add(outerPanel, BorderLayout.CENTER);
		outerPanel.setLayout(new BoxLayout(outerPanel, BoxLayout.X_AXIS));

		JPanel systemFunctionsContainerPanel = new JPanel();
		systemFunctionsContainerPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Associated System Functions", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		outerPanel.add(systemFunctionsContainerPanel);
		systemFunctionsContainerPanel.setLayout(new BorderLayout(0, 0));

		JPanel sfButtonPanel = new JPanel();
		FlowLayout fl_sfButtonPanel = (FlowLayout) sfButtonPanel.getLayout();
		fl_sfButtonPanel.setAlignment(FlowLayout.RIGHT);
		systemFunctionsContainerPanel.add(sfButtonPanel, BorderLayout.SOUTH);

		btnAddSystemFunction = new JButton("Add System Function");
		sfButtonPanel.add(btnAddSystemFunction);
		
		btnRemoveSystemFunction = new JButton("Remove System Function");
		sfButtonPanel.add(btnRemoveSystemFunction);

		JPanel systemFunctionTreeContainerPanel = new JPanel();
		systemFunctionsContainerPanel.add(systemFunctionTreeContainerPanel, BorderLayout.CENTER);
		systemFunctionTreeContainerPanel.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane_1 = new JScrollPane();
		systemFunctionTreeContainerPanel.add(scrollPane_1);

		systemFunctionsTree = new JTree();
		systemFunctionsTree.setRootVisible(false);
		systemFunctionsTree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Root") {
			{
			}
		}));
		systemFunctionsTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		scrollPane_1.setViewportView(systemFunctionsTree);

		JPanel listPanel = new JPanel();
		outerPanel.add(listPanel);
		listPanel.setBorder(new TitledBorder(null, "Associated Hazard Instances", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		listPanel.setLayout(new BorderLayout(0, 0));

		JPanel hazardInstancesListContainerPanel = new JPanel();
		listPanel.add(hazardInstancesListContainerPanel, BorderLayout.CENTER);
		hazardInstancesListContainerPanel.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		hazardInstancesListContainerPanel.add(scrollPane);

		hazardInstanceTable = new JTable();
		scrollPane.setViewportView(hazardInstanceTable);

		JPanel hiButtonPanel = new JPanel();
		listPanel.add(hiButtonPanel, BorderLayout.SOUTH);
		FlowLayout fl_hiButtonPanel = (FlowLayout) hiButtonPanel.getLayout();
		fl_hiButtonPanel.setAlignment(FlowLayout.RIGHT);

		btnAddHazardInstance = new JButton("Add Hazard Instance");
		hiButtonPanel.add(btnAddHazardInstance);
		
		btnRemoveHazardInstance = new JButton("Remove Hazard Instance");
		hiButtonPanel.add(btnRemoveHazardInstance);

		btnEditHazardInstance = new JButton("Edit Hazard Instance");
		hiButtonPanel.add(btnEditHazardInstance);

	}

	public JButton getBtnAddHazardInstance() {
		return btnAddHazardInstance;
	}

	public JTree getSystemFunctionsTree() {
		return systemFunctionsTree;
	}

	public JButton getBtnAddSystemFunction() {
		return btnAddSystemFunction;
	}

	public JButton getBtnEditHazardInstance() {
		return btnEditHazardInstance;
	}

	public JTable getHazardInstanceTable() {
		return hazardInstanceTable;
	}
	public JButton getBtnRemoveSystemFunction() {
		return btnRemoveSystemFunction;
	}
	public JButton getBtnRemoveHazardInstance() {
		return btnRemoveHazardInstance;
	}
}
