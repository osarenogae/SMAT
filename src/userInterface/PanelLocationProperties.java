package userInterface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;

import org.eclipse.emf.common.util.EList;

import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import guiComponents.DocumentSymbolFilter;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 * Part of the care setting editor, contains the name and description text
 * components.
 *
 */
public class PanelLocationProperties extends JPanel {
	private JTextField locationNameTextField;
	private JTextArea textArea;
	private JButton btnSave;

	/**
	 * Create the panel.
	 */
	public PanelLocationProperties() {

		JPanel propertiesPanel = new JPanel();
		propertiesPanel
				.setBorder(new TitledBorder(null, "Properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblLocationName = new JLabel("Care Setting Name");
		lblLocationName.setHorizontalAlignment(SwingConstants.RIGHT);

		locationNameTextField = new JTextField();
		locationNameTextField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);

		btnSave = new JButton("Save");
		GroupLayout gl_propertiesPanel = new GroupLayout(propertiesPanel);
		gl_propertiesPanel.setHorizontalGroup(gl_propertiesPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_propertiesPanel.createSequentialGroup().addContainerGap().addGroup(gl_propertiesPanel
						.createParallelGroup(Alignment.LEADING).addGroup(
								gl_propertiesPanel
										.createSequentialGroup()
										.addGroup(
												gl_propertiesPanel.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, 97,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(Alignment.LEADING,
																gl_propertiesPanel.createSequentialGroup().addGap(7)
																		.addComponent(lblLocationName)))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_propertiesPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 311,
														Short.MAX_VALUE)
												.addComponent(locationNameTextField, GroupLayout.DEFAULT_SIZE, 311,
														Short.MAX_VALUE)))
						.addComponent(btnSave, Alignment.TRAILING)).addContainerGap()));
		gl_propertiesPanel.setVerticalGroup(gl_propertiesPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_propertiesPanel.createSequentialGroup()
						.addGroup(gl_propertiesPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(locationNameTextField, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblLocationName))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_propertiesPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_propertiesPanel.createSequentialGroup()
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnSave).addGap(6))
								.addGroup(gl_propertiesPanel.createSequentialGroup().addComponent(lblDescription)
										.addContainerGap()))));

		textArea = new JTextArea();
		// ((AbstractDocument) textArea.getDocument()).setDocumentFilter(new
		// DocumentSymbolFilter());
		scrollPane.setViewportView(textArea);
		propertiesPanel.setLayout(gl_propertiesPanel);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(propertiesPanel,
				Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE));
		groupLayout
				.setVerticalGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addComponent(propertiesPanel,
										GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGap(2)));
		setLayout(groupLayout);

		// ((AbstractDocument)
		// locationNameTextField.getDocument()).setDocumentFilter(new
		// DocumentSymbolFilter());
	}

	public JTextField getLocationNameTextField() {
		return locationNameTextField;
	}

	public JTextArea getDescriptionTextArea() {
		return textArea;
	}

	public JButton getBtnSave() {
		return btnSave;
	}
}
