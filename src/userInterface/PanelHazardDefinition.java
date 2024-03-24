package userInterface;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import guiComponents.DocumentSymbolFilter;

import javax.swing.text.AbstractDocument;
import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JSplitPane;

/**
 * One of the Hazard Log Editor panels. Contains the name and description fields
 * and the hazard instances table.
 *
 */
public class PanelHazardDefinition extends JPanel {
	private JTextField hazardNameTextField;
	private JTextArea hazardDescriptionTextArea;
	private JButton btnAdd;
	private JButton btnRemove;
	private JButton btnEdit;
	private JTable hazardInstanceTable;

	/**
	 * Create the panel.
	 */
	public PanelHazardDefinition() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane);

		JPanel hazardDefinitionPanel = new JPanel();
		splitPane.setLeftComponent(hazardDefinitionPanel);
		hazardDefinitionPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Hazard Type Properties", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JLabel lblHazardName = new JLabel("Hazard Name");
		lblHazardName.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblHazardDescription = new JLabel("Description");
		lblHazardDescription.setHorizontalAlignment(SwingConstants.RIGHT);

		hazardNameTextField = new JTextField();
		// ((AbstractDocument)
		// hazardNameTextField.getDocument()).setDocumentFilter(new
		// DocumentSymbolFilter());

		JScrollPane hazardDescriptionScrollPane = new JScrollPane();
		GroupLayout gl_hazardDefinitionPanel = new GroupLayout(hazardDefinitionPanel);
		gl_hazardDefinitionPanel
				.setHorizontalGroup(gl_hazardDefinitionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_hazardDefinitionPanel.createSequentialGroup().addContainerGap()
								.addGroup(gl_hazardDefinitionPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblHazardName, GroupLayout.PREFERRED_SIZE,
												82, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblHazardDescription, GroupLayout.PREFERRED_SIZE, 82,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_hazardDefinitionPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(hazardDescriptionScrollPane, GroupLayout.DEFAULT_SIZE, 321,
												Short.MAX_VALUE)
										.addComponent(hazardNameTextField, GroupLayout.DEFAULT_SIZE, 321,
												Short.MAX_VALUE))
								.addContainerGap()));
		gl_hazardDefinitionPanel.setVerticalGroup(gl_hazardDefinitionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_hazardDefinitionPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_hazardDefinitionPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblHazardName).addComponent(hazardNameTextField,
										GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_hazardDefinitionPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblHazardDescription).addComponent(hazardDescriptionScrollPane,
										GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
						.addContainerGap()));

		hazardDescriptionTextArea = new JTextArea();
		// ((AbstractDocument)
		// hazardDescriptionTextArea.getDocument()).setDocumentFilter(new
		// DocumentSymbolFilter());
		hazardDescriptionScrollPane.setViewportView(hazardDescriptionTextArea);
		hazardDefinitionPanel.setLayout(gl_hazardDefinitionPanel);

		JPanel hazardInstancesPanel = new JPanel();
		hazardInstancesPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Hazard Type Instances", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		splitPane.setRightComponent(hazardInstancesPanel);
		hazardInstancesPanel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		hazardInstancesPanel.add(panel_1, BorderLayout.NORTH);
		panel_1.setAlignmentX(Component.RIGHT_ALIGNMENT);

		btnAdd = new JButton("Add");

		btnRemove = new JButton("Remove");

		btnEdit = new JButton("Edit");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap(313, Short.MAX_VALUE).addComponent(btnAdd)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnRemove)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnEdit).addContainerGap()));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(btnRemove)
						.addComponent(btnAdd).addComponent(btnEdit)));
		panel_1.setLayout(gl_panel_1);

		JPanel panel = new JPanel();
		hazardInstancesPanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);

		hazardInstanceTable = new JTable();
		scrollPane.setViewportView(hazardInstanceTable);

	}

	public JTextField getHazardNameTextField() {
		return hazardNameTextField;
	}

	public JTextArea getHazardDescriptionTextArea() {
		return hazardDescriptionTextArea;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnRemove() {
		return btnRemove;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public JTable getHazardInstanceTable() {
		return hazardInstanceTable;
	}
}
