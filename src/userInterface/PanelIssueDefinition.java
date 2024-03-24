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
 * Part of the issue log editor, contains the name and description text fields.
 */
public class PanelIssueDefinition extends JPanel {
	private JTextField issueNameTextField;
	private JTextArea issueDescriptionTextArea;

	/**
	 * Create the panel.
	 */
	public PanelIssueDefinition() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel issueDefinitionPanel = new JPanel();
		add(issueDefinitionPanel);
		issueDefinitionPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Issue Properties", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JLabel lblIssueName = new JLabel("Issue Name");
		lblIssueName.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblIssueDescription = new JLabel("Description");
		lblIssueDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		
		issueNameTextField = new JTextField();
		//((AbstractDocument) hazardNameTextField.getDocument()).setDocumentFilter(new DocumentSymbolFilter());
		
		JScrollPane hazardDescriptionScrollPane = new JScrollPane();
		GroupLayout gl_issueDefinitionPanel = new GroupLayout(issueDefinitionPanel);
		gl_issueDefinitionPanel.setHorizontalGroup(
			gl_issueDefinitionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_issueDefinitionPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_issueDefinitionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIssueName, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIssueDescription, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_issueDefinitionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(hazardDescriptionScrollPane, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
						.addComponent(issueNameTextField, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_issueDefinitionPanel.setVerticalGroup(
			gl_issueDefinitionPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_issueDefinitionPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_issueDefinitionPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIssueName)
						.addComponent(issueNameTextField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_issueDefinitionPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblIssueDescription)
						.addComponent(hazardDescriptionScrollPane, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		issueDescriptionTextArea = new JTextArea();
		//((AbstractDocument) hazardDescriptionTextArea.getDocument()).setDocumentFilter(new DocumentSymbolFilter());
		hazardDescriptionScrollPane.setViewportView(issueDescriptionTextArea);
		issueDefinitionPanel.setLayout(gl_issueDefinitionPanel);

	}
	public JTextField getIssueNameTextField() {
		return issueNameTextField;
	}
	public JTextArea getIssueDescriptionTextArea() {
		return issueDescriptionTextArea;
	}
	
	@Override
	public void setEnabled(boolean b){
		super.setEnabled(b);
		issueNameTextField.setEnabled(b);
		issueDescriptionTextArea.setEditable(b);
	}
}
