package export;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

import org.apache.poi.POIXMLProperties;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.BreakClear;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.LineSpacingRule;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.VerticalAlign;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHeaderFooter;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTable.XWPFBorderType;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSectPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblBorders;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STBorder;

import RiskMatrixModel.RiskMatrix;
import careProcess_model.ControlTypeEnum;
import careProcess_model.HazardCause;
import careProcess_model.HazardControl;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardEffect;
import careProcess_model.HazardInstance;
import careProcess_model.IssueDefinition;
import careProcess_model.Project;
import careProcess_model.ReportData;
import careProcess_model.Step;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import main.Main;
import userInterface.DialogContent;
import utilities.DataHelper;

public class DocExporter {

	private static final String TEMPLATE_FILEPATH = "data/templates/report_template.docx";

	// Style ID strings corresponding to the style names defined in the template
	// file.
	private static final String TITLE_STYLE = "Title";
	private static final String HEADING_1_STYLE = "Heading1";
	private static final String HEADING_2_STYLE = "Heading2";
	private static final String HEADING_3_STYLE = "Heading3";
	private static final String HEADING_4_STYLE = "Heading4";
	private static final String NORMAL_STYLE = "Normal";
	private static final String SUBTITLE_STYLE = "Subtitle";

	// Titles for sections

	private static final String INTRO_SECTION_LABEL = "Introduction";
	private static final String SYSTEM_DEFINITION_SECTION_LABEL = "System Definition / Overview";
	private static final String CLINICAL_RISK_MANAGEMENT_SECTION_LABEL = "Clinical Risk Management System";
	private static final String RISK_ANALYSIS_LABEL = "Clinical Risk Analysis";
	private static final String RISK_EVALUATION_LABEL = "Clinical Risk Evaluation";
	private static final String RISK_CONTROL_LABEL = "Clinical Risk Control";
	private static final String HAZARD_LOG_LABEL = "Hazard Log";
	private static final String TEST_ISSUES_LABEL = "Test Issues";
	private static final String SUMMARY_SAFETY_STATEMENT_LABEL = "Summary Safety Statement";
	private static final String QA_OCUMENT_APPROVAL_LABEL = "Quality Assurance and Document Approval";
	private static final String CONFIG_CONTROL_LABEL = "Configuration Control and Management";

	private static final String SYSTEM_FUNCTIONS_LABEL = "System Functions";

	public static void exportProjectDocument(Component dialogParent, Project p, String filepath, String filename) {
		XWPFDocument doc = new XWPFDocument();
		CTStyles styles;

		// TODO These exceptions should be handled by notifying the user that
		// export may not work porperly.
		try {
			doc = new XWPFDocument(new FileInputStream(TEMPLATE_FILEPATH));

			styles = doc.getStyle();
			doc = new XWPFDocument();
			doc.createStyles();
			doc.getStyles().setStyles(styles);

			createFooter(doc);
		} catch (FileNotFoundException e1) {
			JOptionPane.showMessageDialog(dialogParent, DialogContent.TEMPLATE_NOT_FOUND_MESSAGE,
					DialogContent.TEMPLATE_NOT_FOUND_TITLE, JOptionPane.WARNING_MESSAGE);
			e1.printStackTrace();
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(dialogParent, DialogContent.GENERAL_REPORT_ERROR_MESSAGE,
					DialogContent.GENERAL_REPORT_ERROR_TITLE, JOptionPane.WARNING_MESSAGE);
			e1.printStackTrace();
		} catch (XmlException e) {
			JOptionPane.showMessageDialog(dialogParent, DialogContent.GENERAL_REPORT_ERROR_MESSAGE,
					DialogContent.GENERAL_REPORT_ERROR_TITLE, JOptionPane.WARNING_MESSAGE);
			e.printStackTrace();
		}

		ReportData rd = p.getDatastore().getReportData();
		createTitlePage(doc, rd.getReportTitleText());
		createIntroduction(doc, INTRO_SECTION_LABEL, rd.getReportIntroductionText());
		createSystemDefinitionSection(doc, p);
		createCRMSection(doc, p);
		createClinicalRiskAnalysisSection(doc, p);
		createTestIssuesSection(doc, p);
		createSummarySafetyStatementSection(doc, p);
		createQUDocApprovalSection(doc, p);
		createConfigControlSection(doc, p);

		/*
		 * XWPFParagraph p1 = doc.createParagraph();
		 * p1.setAlignment(ParagraphAlignment.CENTER);
		 * p1.setBorderBottom(Borders.DOUBLE); p1.setBorderTop(Borders.DOUBLE);
		 * 
		 * p1.setBorderRight(Borders.DOUBLE); p1.setBorderLeft(Borders.DOUBLE);
		 * p1.setBorderBetween(Borders.SINGLE);
		 * 
		 * p1.setVerticalAlignment(TextAlignment.TOP);
		 * 
		 * XWPFRun r1 = p1.createRun(); r1.setBold(true);
		 * r1.setText("The quick brown fox"); r1.setBold(true);
		 * r1.setFontFamily("Courier");
		 * r1.setUnderline(UnderlinePatterns.DOT_DOT_DASH);
		 * r1.setTextPosition(100);
		 * 
		 * XWPFParagraph p2 = doc.createParagraph();
		 * p2.setAlignment(ParagraphAlignment.RIGHT);
		 * 
		 * //BORDERS p2.setBorderBottom(Borders.DOUBLE);
		 * p2.setBorderTop(Borders.DOUBLE); p2.setBorderRight(Borders.DOUBLE);
		 * p2.setBorderLeft(Borders.DOUBLE);
		 * p2.setBorderBetween(Borders.SINGLE);
		 * 
		 * XWPFRun r2 = p2.createRun(); r2.setText("jumped over the lazy dog");
		 * r2.setStrike(true); r2.setFontSize(20);
		 * 
		 * XWPFRun r3 = p2.createRun(); r3.setText("and went away");
		 * r3.setStrike(true); r3.setFontSize(20);
		 * r3.setSubscript(VerticalAlign.SUPERSCRIPT);
		 * 
		 * 
		 * XWPFParagraph p3 = doc.createParagraph(); p3.setWordWrap(true);
		 * p3.setPageBreak(true);
		 * 
		 * //p3.setAlignment(ParagraphAlignment.DISTRIBUTE);
		 * p3.setAlignment(ParagraphAlignment.BOTH);
		 * p3.setSpacingLineRule(LineSpacingRule.EXACT);
		 * 
		 * p3.setIndentationFirstLine(600);
		 * 
		 * 
		 * XWPFRun r4 = p3.createRun(); r4.setTextPosition(20);
		 * r4.setText("To be, or not to be: that is the question: " +
		 * "Whether 'tis nobler in the mind to suffer " +
		 * "The slings and arrows of outrageous fortune, " +
		 * "Or to take arms against a sea of troubles, " +
		 * "And by opposing end them? To die: to sleep; ");
		 * r4.addBreak(BreakType.PAGE);
		 * r4.setText("No more; and by a sleep to say we end " +
		 * "The heart-ache and the thousand natural shocks " +
		 * "That flesh is heir to, 'tis a consummation " +
		 * "Devoutly to be wish'd. To die, to sleep; " +
		 * "To sleep: perchance to dream: ay, there's the rub; " + ".......");
		 * r4.setItalic(true); //This would imply that this break shall be
		 * treated as a simple line break, and break the line after that word:
		 * 
		 * XWPFRun r5 = p3.createRun(); r5.setTextPosition(-10);
		 * r5.setText("For in that sleep of death what dreams may come");
		 * r5.addCarriageReturn();
		 * r5.setText("When we have shuffled off this mortal coil," +
		 * "Must give us pause: there's the respect" +
		 * "That makes calamity of so long life;"); r5.addBreak();
		 * r5.setText("For who would bear the whips and scorns of time," +
		 * "The oppressor's wrong, the proud man's contumely,");
		 * 
		 * r5.addBreak(BreakClear.ALL);
		 * r5.setText("The pangs of despised love, the law's delay," +
		 * "The insolence of office and the spurns" + ".......");
		 */

		// Set the document metadata
		POIXMLProperties props = doc.getProperties();
		org.apache.poi.POIXMLProperties.ExtendedProperties properties = props.getExtendedProperties();

		org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.CTProperties ctProps = properties
				.getUnderlyingProperties();

		props.getCoreProperties().setCreator(System.getProperty("user.name"));
		props.getCoreProperties().setTitle(p.getDatastore().getReportData().getReportTitleText());
		doc.getProperties().getCustomProperties().addProperty("Program Name",
				ResourceBundle.getBundle("userInterface.messages").getString("global.application_title"));
		ctProps.setApplication(
				ResourceBundle.getBundle("userInterface.messages").getString("global.application_title"));

		// Output the file
		FileOutputStream out;
		try {
			out = new FileOutputStream(filepath + ".docx");
			doc.write(out);
			out.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(dialogParent, DialogContent.SAVE_REPORT_FAILED_MESSAGE,
					DialogContent.SAVE_REPORT_FAILED_TITLE, JOptionPane.WARNING_MESSAGE);
			e.printStackTrace();
		}
	}

	private static void createTitlePage(XWPFDocument doc, String title) {
		XWPFParagraph paragraph = doc.createParagraph();
		paragraph.setStyle(TITLE_STYLE);
		paragraph.setAlignment(ParagraphAlignment.CENTER);
		paragraph.setVerticalAlignment(TextAlignment.CENTER);// Doesn't seem to
																// work.
		XWPFRun r1 = paragraph.createRun();
		r1.setText(title);
		paragraph.setPageBreak(true);
	}

	/**
	 * Create the introduction section.
	 * 
	 * @param doc
	 * @param heading
	 * @param content
	 */
	private static void createIntroduction(XWPFDocument doc, String heading, String content) {
		createHeading(doc, HEADING_1_STYLE, heading, true);
		createParagraph(doc, content, 0);
	}

	/**
	 * Create the section in whill all the systems are listed and described
	 * along with their functions.
	 * 
	 * @param doc
	 * @param p
	 */
	private static void createSystemDefinitionSection(XWPFDocument doc, Project p) {
		// Create the section header
		createHeading(doc, HEADING_1_STYLE, SYSTEM_DEFINITION_SECTION_LABEL, true);

		// Go through each system definition...
		Iterator<SystemDefinition> systemIterator = p.getDatastore().getSystemrepository().getSystemDefinitions()
				.iterator();
		while (systemIterator.hasNext()) {
			SystemDefinition currentSystem = systemIterator.next();

			// Create a subsection header for the system and add the version and
			// description as paragraphs
			createHeading(doc, HEADING_2_STYLE, currentSystem.getSystemName(), false);
			createParagraph(doc, "System Version: " + currentSystem.getSystemVersion(), 0);
			createParagraph(doc, currentSystem.getSystemDescription(), 0);

			Iterator<SystemFunction> functionIterator = currentSystem.getSystemFunctions().iterator();
			while (functionIterator.hasNext()) {
				SystemFunction currentFunction = functionIterator.next();

				String usedInCareProcessesLabel = "Used in care processes: ";
				String usedInCareSettingsLabel = "Used in care settings: ";
				

				// a step can be associated with a given function multiple
				// times. Keep track of the steps we've already counted so that
				// we don't list them repeatedly.
				ArrayList<Step> stepList = new ArrayList<Step>();

				// For each step associated to the current function, if that
				// step has a location associated to it, add it to the list of
				// steps.
				Iterator<Step> stepIterator = currentFunction.getAssociatedSteps().iterator();
				while (stepIterator.hasNext()) {
					Step currentStep = stepIterator.next();
					if (currentStep.getLocation() != null) {
						if (!stepList.contains(currentStep)) {
							stepList.add(currentStep);
						}
					}
				}

				// Make the "used in care settings: ..." label.
				int usedInCareSettingsCounter = 0;
				for (Step s : stepList) {
					usedInCareSettingsLabel += s.getLocation().getLocationName() + " (Step: " + s.getName()+")";
					if (usedInCareSettingsCounter < stepList.size() - 1) {
						usedInCareSettingsLabel += ", ";
					}
					usedInCareSettingsCounter++;
				}
				if (usedInCareSettingsCounter == 0) {
					usedInCareSettingsLabel = "This function is not associated with any care settings.";
				}

				// Create a subsection for each system function
				createHeading(doc, HEADING_3_STYLE, currentFunction.getFunctionName(), false);
				createParagraph(doc, currentFunction.getDescription(), 600);
				createParagraph(doc, usedInCareSettingsLabel, 600);

			}
		}
	}

	/**
	 * Create the clinical risk management section
	 * 
	 * @param doc
	 * @param p
	 */
	private static void createCRMSection(XWPFDocument doc, Project p) {
		createHeading(doc, HEADING_1_STYLE, CLINICAL_RISK_MANAGEMENT_SECTION_LABEL, true);
		createParagraph(doc, p.getDatastore().getReportData().getCrmSystemText(), 0);
	}

	/**
	 * Create the risk analysis section
	 * 
	 * @param doc
	 * @param p
	 */
	private static void createClinicalRiskAnalysisSection(XWPFDocument doc, Project p) {
		createHeading(doc, HEADING_1_STYLE, RISK_ANALYSIS_LABEL, true);
		Iterator<HazardDefinition> hazardDefinitionIterator = p.getDatastore().getHazardrepository()
				.getHazardDefinitions().iterator();
		while (hazardDefinitionIterator.hasNext()) {
			HazardDefinition currentDef = hazardDefinitionIterator.next();

			// Create a subsection for each hazard definition
			createHeading(doc, HEADING_2_STYLE, currentDef.getHazardName(), false);
			createParagraph(doc, currentDef.getDescription(), 0);
			Iterator<HazardInstance> hazardInstanceIterator = currentDef.getHazardInstances().iterator();
			while (hazardInstanceIterator.hasNext()) {
				HazardInstance currentInstance = hazardInstanceIterator.next();
				createHeading(doc, HEADING_3_STYLE, currentInstance.getName(), false);
				createHazardInstanceTable(doc, currentInstance);
			}
			createHazardImpactSection(doc, currentDef, Main.getRiskMatrix());
		}

	}

	/**
	 * Create the table of information for the given hazard instance
	 * 
	 * @param doc
	 * @param hi
	 */
	private static void createHazardInstanceTable(XWPFDocument doc, HazardInstance hi) {

		XWPFTable table = doc.createTable();

		// Make the table borderless
		CTTblPr tblpro = table.getCTTbl().getTblPr();

		CTTblBorders borders = tblpro.addNewTblBorders();
		borders.addNewBottom().setVal(STBorder.NONE);
		borders.addNewLeft().setVal(STBorder.NONE);
		borders.addNewRight().setVal(STBorder.NONE);
		borders.addNewTop().setVal(STBorder.NONE);
		table.setInsideVBorder(XWPFBorderType.NONE, 0, 0, "ffffff");
		table.setInsideHBorder(XWPFBorderType.NONE, 0, 0, "ffffff");

		XWPFTableRow tableRowOne = table.getRow(0);
		tableRowOne.getCell(0).setText("Description:");
		tableRowOne.addNewTableCell().setText(hi.getDescription());

		XWPFTableRow tableRowTwo = table.createRow();
		tableRowTwo.getCell(0).setText("Associated System Function:");
		tableRowTwo.getCell(1).setText(hi.getSystemFunction().getSystemDefinition().getSystemName() + " \u2192 "
				+ hi.getSystemFunction().getFunctionName());

		XWPFTableRow tableRowThree = table.createRow();
		tableRowThree.getCell(0).setText("Associated Care Process:");
		tableRowThree.getCell(1).setText(hi.getStep().getProcessGraph().getCareProcess().getName());

		XWPFTableRow tableRowFour = table.createRow();
		tableRowFour.getCell(0).setText("Potential Clinical Effects:");
		String effects = "";
		int count = 0;
		for (HazardEffect e : hi.getHazardeffects()) {
			if (count == 0) {
				tableRowFour.getCell(1).setText(e.getEffectName() + ": " + e.getEffectDescription());
			} else {
				XWPFTableRow newTableRow = table.createRow();
				newTableRow.getCell(1).setText(e.getEffectName() + ": " + e.getEffectDescription());
			}
			count++;
		}

	}

	/**
	 * Create the subsections of the risk analiysis section.
	 * 
	 * @param doc
	 * @param hd
	 * @param rm
	 */
	private static void createHazardImpactSection(XWPFDocument doc, HazardDefinition hd, RiskMatrix rm) {

		createHeading(doc, HEADING_3_STYLE, "Possible Causes", false);
		for (HazardInstance hi : hd.getHazardInstances()) {
			for (HazardCause hc : hi.getHazardcauses()) {
				createHeading(doc, HEADING_4_STYLE, hc.getCauseName(), false);
				createParagraph(doc, hc.getCauseDescription(), 0);
			}
		}

		createHeading(doc, HEADING_3_STYLE, "Possible Effects", false);
		for (HazardInstance hi : hd.getHazardInstances()) {
			for (HazardEffect he : hi.getHazardeffects()) {
				createHeading(doc, HEADING_4_STYLE, he.getEffectName(), false);
				createParagraph(doc, he.getEffectDescription(), 0);
			}
		}

		createHeading(doc, HEADING_3_STYLE, "Risk Assessment", false);
		Object[] maxData = DataHelper.getMaximumHazardData(hd, rm);
		if (DataHelper.getSeverityByIndex(rm, (int) maxData[0]) != null) {
			createParagraph(doc,
					"Maximum Initial Severity: " + DataHelper.getSeverityByIndex(rm, (int) maxData[0]).getLevelName(),
					0);
		}
		if (DataHelper.getLikelihoodByIndex(rm, (int) maxData[1]) != null) {
			createParagraph(doc, "Maximum Initial Likelihood: "
					+ DataHelper.getLikelihoodByIndex(rm, (int) maxData[1]).getLevelName(), 0);
		}
		if (maxData[2] != null) {
			createParagraph(doc, "Maximum Initial Risk Rating: " + Integer.toString((int) maxData[2]), 0);
		}
		if (maxData[6] != null) {
			createParagraph(doc, "- Responsible Hazard Instance: " + ((HazardInstance) maxData[6]).getName(), 600);
		}
		createParagraph(doc, "", 0);

		if (DataHelper.getSeverityByIndex(rm, (int) maxData[3]) != null) {
			createParagraph(doc,
					"Maximum Residual Severity: " + DataHelper.getSeverityByIndex(rm, (int) maxData[3]).getLevelName(),
					0);
		}
		if (DataHelper.getLikelihoodByIndex(rm, (int) maxData[4]) != null) {
			createParagraph(doc, "Maximum Residual Likelihood: "
					+ DataHelper.getLikelihoodByIndex(rm, (int) maxData[4]).getLevelName(), 0);
		}
		if (Integer.toString((int) maxData[5]) != null) {
			createParagraph(doc, "Maximum Residual Risk Rating: " + Integer.toString((int) maxData[5]), 0);
		}
		if (((HazardInstance) maxData[7]) != null) {
			createParagraph(doc, "- Responsible Hazard Instance: " + ((HazardInstance) maxData[7]).getName(), 600);
		}

		createHeading(doc, HEADING_3_STYLE, "Existing Controls", false);
		for (HazardInstance hi : hd.getHazardInstances()) {
			for (HazardCause hc : hi.getHazardcauses()) {
				for (HazardControl control : hc.getHazardcontrols()) {
					if (control.getControlState().equals(careProcess_model.ControlStateEnum.EXISTING)) {
						createControlSection(doc, control);
					}
				}
			}
			for (HazardEffect he : hi.getHazardeffects()) {
				for (HazardControl control : he.getHazardcontrols()) {
					if (control.getControlState().equals(careProcess_model.ControlStateEnum.EXISTING)) {
						createControlSection(doc, control);
					}
				}
			}
		}

		createHeading(doc, HEADING_3_STYLE, "Additional Controls", false);
		for (HazardInstance hi : hd.getHazardInstances()) {
			for (HazardCause hc : hi.getHazardcauses()) {
				for (HazardControl control : hc.getHazardcontrols()) {
					if (control.getControlState().equals(careProcess_model.ControlStateEnum.ADDITIONAL)) {
						createControlSection(doc, control);
					}
				}
			}
			for (HazardEffect he : hi.getHazardeffects()) {
				for (HazardControl control : he.getHazardcontrols()) {
					if (control.getControlState().equals(careProcess_model.ControlStateEnum.ADDITIONAL)) {
						createControlSection(doc, control);
					}
				}
			}
		}

	}

	/**
	 * Create the subsection listing a given hazard control and its types.
	 * 
	 * @param doc
	 * @param control
	 */
	private static void createControlSection(XWPFDocument doc, HazardControl control) {
		createHeading(doc, HEADING_4_STYLE, control.getName(), false);
		String controlType = "";
		int counter = 0;
		for (ControlTypeEnum t : control.getControlTypes()) {
			controlType += " " + t.getLiteral();
			counter++;
			if (counter < control.getControlTypes().size()) {
				controlType += ",";
			}
		}
		if (!control.getOtherText().isEmpty()) {
			if (counter == 0) {
				controlType += control.getOtherText();
			} else {
				controlType += ", " + control.getOtherText();
			}
		}
		createItalicParagraph(doc, controlType, 0);
		createParagraph(doc, control.getDescription(), 0);

	}

	/**
	 * Create the section listing all the test issues defined in the issues log.
	 * 
	 * @param doc
	 * @param p
	 */
	private static void createTestIssuesSection(XWPFDocument doc, Project p) {
		createHeading(doc, HEADING_1_STYLE, TEST_ISSUES_LABEL, true);
		for (IssueDefinition i : p.getDatastore().getReportData().getIssueDefinitions()) {
			createHeading(doc, HEADING_2_STYLE, i.getIssueName(), false);
			createParagraph(doc, i.getIssueDescription(), 0);
		}
	}

	/**
	 * Create the summary safety statement section
	 * 
	 * @param doc
	 * @param p
	 */
	private static void createSummarySafetyStatementSection(XWPFDocument doc, Project p) {
		createHeading(doc, HEADING_1_STYLE, SUMMARY_SAFETY_STATEMENT_LABEL, true);
		createParagraph(doc, p.getDatastore().getReportData().getSummarySafetyStatementText(), 0);

	}

	/**
	 * Create the summary safety statement section
	 * 
	 * @param doc
	 * @param p
	 */
	private static void createQUDocApprovalSection(XWPFDocument doc, Project p) {
		createHeading(doc, HEADING_1_STYLE, QA_OCUMENT_APPROVAL_LABEL, true);
		createParagraph(doc, p.getDatastore().getReportData().getQaAndDocApprovalText(), 0);

	}

	/**
	 * Create the summary safety statement section
	 * 
	 * @param doc
	 * @param p
	 */
	private static void createConfigControlSection(XWPFDocument doc, Project p) {
		createHeading(doc, HEADING_1_STYLE, CONFIG_CONTROL_LABEL, true);
		createParagraph(doc, p.getDatastore().getReportData().getConfigurationControlText(), 0);

	}

	/**
	 * Create the numbered footer for the document
	 * 
	 * @param doc
	 * @throws IOException
	 */
	private static void createFooter(XWPFDocument doc) throws IOException {
		CTSectPr sectPr = doc.getDocument().getBody().addNewSectPr();
		XWPFHeaderFooterPolicy policy = new XWPFHeaderFooterPolicy(doc, sectPr);

		// write page number footer content using xml elements
		CTP ctpFooter = CTP.Factory.newInstance();
		ctpFooter.addNewR().addNewPgNum();
		XWPFParagraph footerParagraph = new XWPFParagraph(ctpFooter, doc);
		XWPFParagraph[] parsFooter = new XWPFParagraph[1];
		parsFooter[0] = footerParagraph;

		XWPFParagraph[] parsFooter2 = new XWPFParagraph[1];
		parsFooter2[0] = new XWPFParagraph(CTP.Factory.newInstance(), doc);

		// Attempted to make the number not visible on the first page, but it
		// didn't seem to work.
		policy.createFooter(XWPFHeaderFooterPolicy.FIRST, parsFooter2);
		policy.createFooter(XWPFHeaderFooterPolicy.DEFAULT, parsFooter);

	}

	/**
	 * Create a new heading. If firstInSection is true, the heading is created
	 * on a new page.
	 * 
	 * @param doc
	 * @param heading
	 * @param firstInSection
	 */
	private static void createHeading(XWPFDocument doc, String headingStyle, String heading, boolean firstInSection) {
		XWPFParagraph paragraph = doc.createParagraph();
		paragraph.setStyle(headingStyle);
		XWPFRun r1 = paragraph.createRun();
		r1.setText(heading);
		paragraph.setPageBreak(firstInSection);
	}

	/**
	 * Create a new paragraph with the given text.
	 * 
	 * @param doc
	 * @param text
	 * @param indentFirstLine
	 */
	private static void createParagraph(XWPFDocument doc, String text, int indentFirstLine) {
		XWPFParagraph paragraph = doc.createParagraph();
		paragraph.setStyle(NORMAL_STYLE);
		paragraph.setIndentationFirstLine(indentFirstLine);
		XWPFRun r1 = paragraph.createRun();
		r1.setText(text);
	}

	/**
	 * Create a new paragraph with the given text in an italic style;
	 * 
	 * @param doc
	 * @param text
	 * @param indentFirstLine
	 */
	private static void createItalicParagraph(XWPFDocument doc, String text, int indentFirstLine) {
		XWPFParagraph paragraph = doc.createParagraph();
		paragraph.setStyle(NORMAL_STYLE);
		paragraph.setIndentationFirstLine(indentFirstLine);
		XWPFRun r1 = paragraph.createRun();
		r1.setItalic(true);
		r1.setText(text);
	}
}
