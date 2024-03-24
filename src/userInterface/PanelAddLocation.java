package userInterface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.AbstractDocument;

import guiComponents.DocumentSymbolFilter;

import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;

/**
 * The main GUI component for the {@link #NewLocationDialog};
 *
 */
public class PanelAddLocation extends JPanel {
	private JTextField nameTextField;
	private JTextPane descriptionTextPane;
	private JButton btnCancel;
	private JButton btnAddLocation;

	/**
	 * Create the panel.
	 */
	public PanelAddLocation() {
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Description", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		btnCancel = new JButton("Cancel");
		
		btnAddLocation = new JButton("Add Care Setting");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnCancel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnAddLocation))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddLocation)
						.addComponent(btnCancel))
					.addContainerGap())
		);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		descriptionTextPane = new JTextPane();
		//((AbstractDocument) descriptionTextPane.getDocument()).setDocumentFilter(new DocumentSymbolFilter());
		scrollPane.setViewportView(descriptionTextPane);
		panel.setLayout(new BorderLayout(0, 0));
		
		nameTextField = new JTextField();
		//((AbstractDocument) nameTextField.getDocument()).setDocumentFilter(new DocumentSymbolFilter());
		panel.add(nameTextField);
		nameTextField.setColumns(50);
		setLayout(groupLayout);

	}
	public JTextField getNameTextField() {
		return nameTextField;
	}
	public JTextPane getDescriptionTextPane() {
		return descriptionTextPane;
	}
	public JButton getBtnCancel() {
		return btnCancel;
	}
	public JButton getBtnAddLocation() {
		return btnAddLocation;
	}
}
