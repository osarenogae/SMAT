package userInterface;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import careProcess_model.ReportData;
import main.Main;

import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.TextComponent;

/**
 * The JPanel that holds all the components of the report editor section and,
 * together with its corresponding 'Worker' class, defines their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class CardPanelReportGenerator extends JPanel implements EditorView {

	static PanelReportIntroduction panelReportIntroduction;
	static PanelClinicalRiskManagement panelClinicalRiskManagement;

	private static ReportData reportData;

	/**
	 * Create the panel.
	 */
	public CardPanelReportGenerator(ReportData rd) {
		reportData = rd;

		setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane);

		panelReportIntroduction = new PanelReportIntroduction();
		tabbedPane.addTab("Report Elements", null, panelReportIntroduction, null);

		panelClinicalRiskManagement = new PanelClinicalRiskManagement();
		tabbedPane.addTab("Clinical Risk Management", null, panelClinicalRiskManagement, null);

		ReportFieldEditListener editListener = new ReportFieldEditListener();

		// Fill the fields with any existing data.
		// Do this before the edit listeners are added, so that they won't
		// interfere.
		initialise();

		// Add listeners to save the data whenever it is edited.
		/*
		 * Note: In the other panels there is a save button to store the data.
		 * They could be re-implemented to use a document listener to
		 * automatically save the data, but doing so would be more complex than
		 * it was in this case.
		 */
		panelReportIntroduction.getIntroTextArea().getDocument().addDocumentListener(editListener);
		panelReportIntroduction.getTitleTextField().getDocument().addDocumentListener(editListener);
		panelClinicalRiskManagement.getCrmSystemTextArea().getDocument().addDocumentListener(editListener);
		panelClinicalRiskManagement.getSummarySafetyStatementTextArea().getDocument().addDocumentListener(editListener);
		panelClinicalRiskManagement.getQualityAssuranceTextArea().getDocument().addDocumentListener(editListener);
		panelClinicalRiskManagement.getConfigControlTextArea().getDocument().addDocumentListener(editListener);

	}

	/**
	 * Fill the text areas with any existing data
	 */
	private void initialise() {
		panelReportIntroduction.getTitleTextField().setText(reportData.getReportTitleText());
		panelReportIntroduction.getIntroTextArea().setText(reportData.getReportIntroductionText());
		panelClinicalRiskManagement.getCrmSystemTextArea().setText(reportData.getCrmSystemText());
		panelClinicalRiskManagement.getSummarySafetyStatementTextArea()
				.setText(reportData.getSummarySafetyStatementText());
		panelClinicalRiskManagement.getQualityAssuranceTextArea().setText(reportData.getQaAndDocApprovalText());
		panelClinicalRiskManagement.getConfigControlTextArea().setText(reportData.getConfigurationControlText());

	}

	/**
	 * Store the data from the text fields in the RiskData object
	 */
	private static void saveFields() {
		reportData.setReportTitleText(panelReportIntroduction.getTitleTextField().getText());
		reportData.setReportIntroductionText(panelReportIntroduction.getIntroTextArea().getText());

		reportData.setCrmSystemText(panelClinicalRiskManagement.getCrmSystemTextArea().getText());
		reportData.setSummarySafetyStatementText(
				panelClinicalRiskManagement.getSummarySafetyStatementTextArea().getText());
		reportData.setQaAndDocApprovalText(panelClinicalRiskManagement.getQualityAssuranceTextArea().getText());
		reportData.setConfigurationControlText(panelClinicalRiskManagement.getConfigControlTextArea().getText());
		System.out.println("Fields for report editor saved");
	}

	/**
	 * A Document listener which fires {@link #saveFields} whenever a change to
	 * the owner document occurs.
	 *
	 */
	private class ReportFieldEditListener implements DocumentListener {
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			saveFields();
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			saveFields();
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			saveFields();
		}
	}

	@Override
	public boolean tryCloseView() {
		// Needn't confirm close as save happens on edit in this panel.
		return true;
	}

	@Override
	public boolean saveAndClose() {
		// Needn't confirm close as save happens on edit in this panel.
		return true;
	}

	@Override
	public void save() {
		Main.saveProject();
	}

}
