package userInterface;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The main panel for the Clinical Risk Management section of the report editor.
 *
 */
public class PanelClinicalRiskManagement extends JPanel {
	private JTextArea crmSystemTextArea;
	private JTextArea summarySafetyStatementTextArea;
	private JTextArea qualityAssuranceTextArea;
	private JTextArea configControlTextArea;

	/**
	 * Create the panel.
	 */
	public PanelClinicalRiskManagement() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel crmSystemPanel = new JPanel();
		crmSystemPanel.setBorder(new TitledBorder(null, "Clinical Risk Management System", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(crmSystemPanel);
		crmSystemPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		crmSystemPanel.add(scrollPane, BorderLayout.CENTER);
		
		crmSystemTextArea = new JTextArea();
		crmSystemTextArea.setWrapStyleWord(true);
		crmSystemTextArea.setLineWrap(true);
		scrollPane.setViewportView(crmSystemTextArea);
		
		JPanel summarySafetyStatementPanel = new JPanel();
		summarySafetyStatementPanel.setBorder(new TitledBorder(null, "Summary Safety Statement", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(summarySafetyStatementPanel);
		summarySafetyStatementPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		summarySafetyStatementPanel.add(scrollPane_1, BorderLayout.CENTER);
		
		summarySafetyStatementTextArea = new JTextArea();
		summarySafetyStatementTextArea.setWrapStyleWord(true);
		summarySafetyStatementTextArea.setLineWrap(true);
		scrollPane_1.setViewportView(summarySafetyStatementTextArea);
		
		JPanel qaPanel = new JPanel();
		qaPanel.setBorder(new TitledBorder(null, "Quality Assurance and Document Approval", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(qaPanel);
		qaPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_2 = new JScrollPane();
		qaPanel.add(scrollPane_2, BorderLayout.CENTER);
		
		qualityAssuranceTextArea = new JTextArea();
		qualityAssuranceTextArea.setWrapStyleWord(true);
		qualityAssuranceTextArea.setLineWrap(true);
		scrollPane_2.setViewportView(qualityAssuranceTextArea);
		
		JPanel configControlPanel = new JPanel();
		configControlPanel.setBorder(new TitledBorder(null, "Configuration Control and Management", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(configControlPanel);
		configControlPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_3 = new JScrollPane();
		configControlPanel.add(scrollPane_3, BorderLayout.CENTER);
		
		configControlTextArea = new JTextArea();
		configControlTextArea.setLineWrap(true);
		configControlTextArea.setWrapStyleWord(true);
		scrollPane_3.setViewportView(configControlTextArea);

	}

	public JTextArea getCrmSystemTextArea() {
		return crmSystemTextArea;
	}
	public JTextArea getSummarySafetyStatementTextArea() {
		return summarySafetyStatementTextArea;
	}
	public JTextArea getQualityAssuranceTextArea() {
		return qualityAssuranceTextArea;
	}
	public JTextArea getConfigControlTextArea() {
		return configControlTextArea;
	}
}
