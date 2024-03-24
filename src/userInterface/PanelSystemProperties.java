package userInterface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;

import org.eclipse.emf.common.util.EList;

import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import guiComponents.DocumentSymbolFilter;
import guiComponents.EditorTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 * Part of the system editor panel, contains the name, version and description text fields and the function table.
 * @author George
 *
 */
public class PanelSystemProperties extends JPanel {
	private JTextField systemNameTextField;
	private EditorTable functionsTable;
	private JButton btnAddFunction;
	private JButton btnRemoveFunction;
	private JTextField systemVersionTextField;
	private JTextArea descriptionTextArea;
	
	/**
	 * Create the panel.
	 */
	public PanelSystemProperties() {
		
		JPanel propertiesPanel = new JPanel();
		propertiesPanel.setBorder(new TitledBorder(null, "Properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblSystemName = new JLabel("Name");
		lblSystemName.setHorizontalAlignment(SwingConstants.RIGHT);
		
		systemNameTextField = new JTextField();
		systemNameTextField.setColumns(10);
		
		JLabel lblSystemVersion = new JLabel("Version");
		lblSystemVersion.setHorizontalAlignment(SwingConstants.RIGHT);
		
		systemVersionTextField = new JTextField();
		systemVersionTextField.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("Description");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout gl_propertiesPanel = new GroupLayout(propertiesPanel);
		gl_propertiesPanel.setHorizontalGroup(
			gl_propertiesPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_propertiesPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_propertiesPanel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblSystemVersion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblSystemName, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_propertiesPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
						.addComponent(systemVersionTextField, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
						.addComponent(systemNameTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_propertiesPanel.setVerticalGroup(
			gl_propertiesPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_propertiesPanel.createSequentialGroup()
					.addGroup(gl_propertiesPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(systemNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSystemName))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_propertiesPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSystemVersion)
						.addComponent(systemVersionTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_propertiesPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_propertiesPanel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(32))
						.addGroup(gl_propertiesPanel.createSequentialGroup()
							.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
							.addContainerGap())))
		);
		
		descriptionTextArea = new JTextArea();
		scrollPane_1.setViewportView(descriptionTextArea);
		propertiesPanel.setLayout(gl_propertiesPanel);
		
		JPanel functionsPanel = new JPanel();
		functionsPanel.setBorder(new TitledBorder(null, "Functions", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JScrollPane scrollPane = new JScrollPane();
		
		btnAddFunction = new JButton("Add Function");
		
		btnRemoveFunction = new JButton("Remove Function");
		GroupLayout gl_functionsPanel = new GroupLayout(functionsPanel);
		gl_functionsPanel.setHorizontalGroup(
			gl_functionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_functionsPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_functionsPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_functionsPanel.createSequentialGroup()
							.addComponent(btnAddFunction)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnRemoveFunction)))
					.addContainerGap())
		);
		gl_functionsPanel.setVerticalGroup(
			gl_functionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_functionsPanel.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_functionsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddFunction)
						.addComponent(btnRemoveFunction)))
		);
		
		functionsTable = new EditorTable();
		functionsTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		scrollPane.setViewportView(functionsTable);
		functionsPanel.setLayout(gl_functionsPanel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(propertiesPanel, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
						.addComponent(functionsPanel, GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(propertiesPanel, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(functionsPanel, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
					.addGap(3))
		);
		setLayout(groupLayout);

		functionsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//((AbstractDocument) systemNameTextField.getDocument()).setDocumentFilter(new DocumentSymbolFilter());
		//((AbstractDocument) systemVersionTextField.getDocument()).setDocumentFilter(new DocumentSymbolFilter());
	}
	
	
	

	
	
	public JButton getBtnAddFunction() {
		return btnAddFunction;
	}
	public JButton getBtnRemoveFunction() {
		return btnRemoveFunction;
	}
	public EditorTable getFunctionsTable() {
		return functionsTable;
	}
	public JTextField getSystemNameTextField() {
		return systemNameTextField;
	}
	public JTextField getSystemVersionTextField() {
		return systemVersionTextField;
	}
	public JTextArea getDescriptionTextArea() {
		return descriptionTextArea;
	}
}
