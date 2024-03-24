package userInterface;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import careProcess_model.CareProcess;
import careProcess_model.HazardInstance;
import careProcess_model.LocationDefinition;
import careProcess_model.SystemDefinition;
import dialogs.AcceptableDefinitionDialog;
import dialogs.CareProcessExplorerDialog;
import dialogs.RiskMatrixDialog;
import export.DocExporter;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;
import javax.swing.AbstractAction;
import javax.swing.Action;
import graphEditor.GraphEditorPanel2;
import io.InputOutput;
import main.Main;
import userInterface.startup.StartupMenu;

import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import RiskMatrixModel.RiskMatrix;

/**
 * The main window for the application. Contains, as elements of a CardLayout,
 * all the "CardPanel..." classes which are responsible for the user interactive
 * features of the program.
 */
public class MainAppWindow {

	// The filechooser for choosing where to export the generated report.
	private final JFileChooser fc;

	private JFrame mainWindow;
	private JButton pv_home_button;

	private CardPanelCareProcessEditor cardPanelCareProcessEditor;

	static final String homeViewName = "VIEWS.HOME_VIEW";
	static final String sequenceEditorViewName = "VIEWS.SEQUENCE_EDITOR_VIEW";

	static final String PANEL_REPORT_GENERATOR = "PANEL_REPORT_GENERATOR.CARD";
	static final String PANEL_ISSUE_LOG_EDITOR = "PANEL_ISSUE_LOG_EDITOR.CARD";
	static final String PANEL_HAZARD_LOG_EDITOR = "PANEL_HAZARD_LOG_EDITOR.CARD";
	static final String PANEL_LOCATION_EDITOR = "PANEL_LOCATION_EDITOR.CARD";
	static final String PANEL_SYSTEM_EDITOR = "PANEL_SYSTEM_EDITOR.CARD";
	static final String PANEL_CARE_PROCESS_EDITOR = "PANEL_SEQUENCE_EDITOR.CARD";
	static final String PANEL_PROCESS_MODE_EDITORS = "PANEL_PROCESS_MODE_EDITORS.CARD";
	static final String PANEL_PROCESS_MODE_HOME = "PANEL_PROCESS_MODE_HOME.CARD";

	private CardPanelIssueLogEditor cardPanelIssueLogEditor;
	private CardPanelProcessSectionHome panelProcessEditorHome;
	private CardPanelSystemEditor cardPanelSystemBrowser;
	private CardPanelCareSettingEditor cardPanelLocationEditor;
	private CardPanelHazardLogEditor cardPanelHazardLogEditor;
	private CardPanelReportGenerator cardPanelReportGenerator;
	private JPanel panelEditorCards;
	private JPanel panelEditors;

	private final Action openRiskMatrixDialogAction = new OpenRiskMatrixDialog();
	private final Action openHazardLogEditorAction = new OpenHazardLogEditor();
	private final Action openLocationEditorAction = new OpenLocationEditor();
	private final Action openSystemEditorAction = new OpenSystemEditor();
	private final Action openHomeAction = new OpenHome();
	private final Action openProcessEditorAction = new OpenProcessEditor();
	private final Action openIssueLogAction = new OpenIssueLogEditor();
	private final Action openReportGenerator = new OpenReportGenerator();

	private final Action exportReport = new ExportReport();
	private final Action createNewCareProcess = new CreateNewCareProcess();
	private final Action openCareProcessExplorer = new OpenCareProcessExplorer();
	private final Action openProjectChooser = new OpenProjectChooser();

	private final Action saveAction = new SaveCurrentEditor();

	private EditorView currentView = (EditorView) panelProcessEditorHome;
	private JButton btnBrowse;
	private JButton btnSave;
	private JButton btnNew;
	private JButton btnGenerateReport;

	/**
	 * Create the application window.
	 */
	public MainAppWindow(RiskMatrix rm) {
		fc = new JFileChooser();
		initialize(rm);
	}

	/**
	 * Initialise the contents of the frame, including all the card panels.
	 */
	private void initialize(RiskMatrix rm) {
		mainWindow = new JFrame();

		// When the window is closed, if the project is not saved, prompt the
		// user to save or quit.
		mainWindow.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				if (!Main.isSaved()) {
					showConfirmExitApplicationDialog(mainWindow, true);
				} else {
					System.exit(0);
				}
			}
		});

		mainWindow.setTitle(ResourceBundle.getBundle("userInterface.messages").getString("global.application_title") //$NON-NLS-1$ //$NON-NLS-2$
				+ " - " + Main.ProjectCurrentName);
		mainWindow.setBounds(10, 10, 1200, 675);
		mainWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		mainWindow.getContentPane().setLayout(new CardLayout(0, 0));

		panelProcessEditorHome = new CardPanelProcessSectionHome(this, rm);

		// Set up the actions for the home screen buttons
		panelProcessEditorHome.getCareProcessEditor_icoButton().setAction(openProcessEditorAction);
		panelProcessEditorHome.getSystemEditor_icoButton().setAction(openSystemEditorAction);
		panelProcessEditorHome.getLocationEditor_icoButton().setAction(openLocationEditorAction);
		panelProcessEditorHome.getRiskMatrix_icoButton().setAction(openRiskMatrixDialogAction);
		panelProcessEditorHome.getHazardLog_icoButton().setAction(openHazardLogEditorAction);
		panelProcessEditorHome.getIssueLog_icoButton().setAction(openIssueLogAction);
		panelProcessEditorHome.getReport_icoButton().setAction(openReportGenerator);
		panelProcessEditorHome.getBtnChangeProject().setAction(openProjectChooser);

		// Set up the GUI
		mainWindow.getContentPane().add(panelProcessEditorHome, PANEL_PROCESS_MODE_HOME);

		panelEditors = new JPanel();
		mainWindow.getContentPane().add(panelEditors, PANEL_PROCESS_MODE_EDITORS);
		panelEditors.setLayout(new BorderLayout(0, 0));
		JToolBar toolBar = new JToolBar();
		panelEditors.add(toolBar, BorderLayout.NORTH);
		toolBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		toolBar.setEnabled(false);
		toolBar.setFloatable(false);

		pv_home_button = new JButton("");
		pv_home_button.setAction(openHomeAction);
		toolBar.add(pv_home_button);
		pv_home_button.setIcon(null);

		// Separator between home and save project
		toolBar.addSeparator();

		btnSave = new JButton(
				ResourceBundle.getBundle("userInterface.messages").getString("MainAppWindow.btnSave.text")); //$NON-NLS-1$ //$NON-NLS-2$
		btnSave.setAction(saveAction);
		toolBar.add(btnSave);

		btnGenerateReport = new JButton(
				ResourceBundle.getBundle("userInterface.messages").getString("MainAppWindow.btnNewButton.text_1")); //$NON-NLS-1$ //$NON-NLS-2$
		btnGenerateReport.setAction(exportReport);
		toolBar.add(btnGenerateReport);

		// Separator between generate report and new care process
		toolBar.addSeparator();

		btnNew = new JButton(ResourceBundle.getBundle("userInterface.messages").getString("MainAppWindow.btnNew.text")); //$NON-NLS-1$ //$NON-NLS-2$
		btnNew.setAction(createNewCareProcess);
		toolBar.add(btnNew);

		btnBrowse = new JButton(
				ResourceBundle.getBundle("userInterface.messages").getString("MainAppWindow.btnOpen.text")); //$NON-NLS-1$ //$NON-NLS-2$
		toolBar.add(btnBrowse);
		btnBrowse.setAction(openCareProcessExplorer);

		panelEditorCards = new JPanel();
		panelEditors.add(panelEditorCards);
		panelEditorCards.setLayout(new CardLayout(0, 0));

		// Place the card panels in the CardLayout
		cardPanelCareProcessEditor = new CardPanelCareProcessEditor(Main.getProject().getCareProcesses());
		panelEditorCards.add(cardPanelCareProcessEditor, PANEL_CARE_PROCESS_EDITOR);

		cardPanelLocationEditor = new CardPanelCareSettingEditor();
		panelEditorCards.add(cardPanelLocationEditor, PANEL_LOCATION_EDITOR);

		cardPanelSystemBrowser = new CardPanelSystemEditor();
		panelEditorCards.add(cardPanelSystemBrowser, PANEL_SYSTEM_EDITOR);

		cardPanelHazardLogEditor = new CardPanelHazardLogEditor();
		panelEditorCards.add(cardPanelHazardLogEditor, PANEL_HAZARD_LOG_EDITOR);

		cardPanelIssueLogEditor = new CardPanelIssueLogEditor();
		panelEditorCards.add(cardPanelIssueLogEditor, PANEL_ISSUE_LOG_EDITOR);

		cardPanelReportGenerator = new CardPanelReportGenerator(Main.getProject().getDatastore().getReportData());
		panelEditorCards.add(cardPanelReportGenerator, PANEL_REPORT_GENERATOR);
	}

	public void showHomeCard() {
		setToolbarMode(ToolbarModes.GENERAL);
		currentView = panelProcessEditorHome;
		panelProcessEditorHome.refresh();
		((CardLayout) mainWindow.getContentPane().getLayout()).show(mainWindow.getContentPane(),
				PANEL_PROCESS_MODE_HOME);

	}

	public void showHazardLogEditor() {
		setToolbarMode(ToolbarModes.GENERAL);
		currentView = (EditorView) cardPanelHazardLogEditor;
		cardPanelHazardLogEditor.refresh();
		((CardLayout) mainWindow.getContentPane().getLayout()).show(mainWindow.getContentPane(),
				PANEL_PROCESS_MODE_EDITORS);
		((CardLayout) panelEditorCards.getLayout()).show(panelEditorCards, PANEL_HAZARD_LOG_EDITOR);
	}

	public void showLocationEditor() {
		setToolbarMode(ToolbarModes.GENERAL);
		currentView = cardPanelLocationEditor;
		cardPanelLocationEditor.refresh();
		((CardLayout) mainWindow.getContentPane().getLayout()).show(mainWindow.getContentPane(),
				PANEL_PROCESS_MODE_EDITORS);
		((CardLayout) panelEditorCards.getLayout()).show(panelEditorCards, PANEL_LOCATION_EDITOR);
	}

	public void showSystemEditor() {
		setToolbarMode(ToolbarModes.GENERAL);
		currentView = cardPanelSystemBrowser;
		((CardLayout) mainWindow.getContentPane().getLayout()).show(mainWindow.getContentPane(),
				PANEL_PROCESS_MODE_EDITORS);
		((CardLayout) panelEditorCards.getLayout()).show(panelEditorCards, PANEL_SYSTEM_EDITOR);
	}

	public void showProcessEditor() {
		setToolbarMode(ToolbarModes.CARE_PROCESS_EDITOR);
		currentView = (EditorView) cardPanelCareProcessEditor;
		cardPanelCareProcessEditor.refresh();
		((CardLayout) mainWindow.getContentPane().getLayout()).show(mainWindow.getContentPane(),
				PANEL_PROCESS_MODE_EDITORS);
		((CardLayout) panelEditorCards.getLayout()).show(panelEditorCards, PANEL_CARE_PROCESS_EDITOR);
	}

	public void showIssueLogEditor() {
		setToolbarMode(ToolbarModes.GENERAL);
		currentView = (EditorView) cardPanelIssueLogEditor;
		((CardLayout) mainWindow.getContentPane().getLayout()).show(mainWindow.getContentPane(),
				PANEL_PROCESS_MODE_EDITORS);
		((CardLayout) panelEditorCards.getLayout()).show(panelEditorCards, PANEL_ISSUE_LOG_EDITOR);
	}

	public void showReportGenerator() {
		setToolbarMode(ToolbarModes.REPORT);
		currentView = (EditorView) cardPanelReportGenerator;
		((CardLayout) mainWindow.getContentPane().getLayout()).show(mainWindow.getContentPane(),
				PANEL_PROCESS_MODE_EDITORS);
		((CardLayout) panelEditorCards.getLayout()).show(panelEditorCards, PANEL_REPORT_GENERATOR);
	}

	/**
	 * Show the dialog containing the definition of "acceptable risk" for this
	 * project. Allows the user to edit the definition. Note: Not currently
	 * used.
	 */
	public void showAcceptableRiskDialog() {
		AcceptableDefinitionDialog d = new AcceptableDefinitionDialog(panelProcessEditorHome, Main.getProject());
		d.pack();
		d.setVisible(true);
	}

	/**
	 * Show the dialog containing the risk matrix
	 */
	public void showRiskMatrixDialog() {
		RiskMatrixDialog d = new RiskMatrixDialog();
		d.pack();
		d.setVisible(true);
	}

	/**
	 * Show the legend dialog for the GSN panel
	 */
	public void showGSNLegend() {
		GSNOverviewLegend legend = new GSNOverviewLegend();
		legend.setLocationRelativeTo(mainWindow);
		legend.pack();
		legend.repositionDiagram();
		legend.setVisible(true);
	}

	/**
	 * Let the user choose where to save the report template and export it to
	 * that location.
	 */
	private void exportReportTemplate() {
		int returnVal = fc.showSaveDialog(mainWindow);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			DocExporter.exportProjectDocument(mainWindow, Main.getProject(), file.getPath(), file.getName());
		}
	}

	public JFrame getMainWindow() {
		return mainWindow;
	}

	/**
	 * The action for opening the new project/ load project window.
	 *
	 */
	private class OpenProjectChooser extends AbstractAction {
		public OpenProjectChooser() {
			putValue(NAME, "Change Project");
			putValue(SHORT_DESCRIPTION, "Open a different project or start a new one");
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (!Main.isSaved()) {
				if (showConfirmExitApplicationDialog(mainWindow, false)) {
					mainWindow.dispose();
					StartupMenu chooser = new StartupMenu();
					chooser.setVisible(true);
				}
			} else {
				mainWindow.dispose();
				StartupMenu chooser = new StartupMenu();
				chooser.setVisible(true);
			}
		}

	}

	/**
	 * Action to open the home screen
	 *
	 */
	private class OpenHome extends AbstractAction {
		public OpenHome() {
			putValue(NAME, "Home");
			putValue(SHORT_DESCRIPTION, "Return to the home menu");
		}

		public void actionPerformed(ActionEvent e) {
			if (currentView.tryCloseView()) {
				if (currentView.saveAndClose()) {
					showHomeCard();
				}
			} else {
				showHomeCard();
			}
		}
	}

	/**
	 * Action to open the system editor
	 *
	 */
	private class OpenSystemEditor extends AbstractAction {
		public OpenSystemEditor() {
			putValue(NAME, "System Editor");
			putValue(SHORT_DESCRIPTION, "View and edit system definitions");
		}

		public void actionPerformed(ActionEvent e) {
			showSystemEditor();
		}
	}

	/**
	 * Action to open the care process editor
	 *
	 */
	private class OpenProcessEditor extends AbstractAction {
		public OpenProcessEditor() {
			putValue(NAME, "Care Process Editor");
			putValue(SHORT_DESCRIPTION, "View and edit care process diagrams");
		}

		public void actionPerformed(ActionEvent e) {
			showProcessEditor();
		}
	}

	/**
	 * Action to open the location editor
	 *
	 */
	private class OpenLocationEditor extends AbstractAction {
		public OpenLocationEditor() {
		}

		public void actionPerformed(ActionEvent e) {
			showLocationEditor();
		}
	}

	/**
	 * Action to open the risk matrix dialog
	 *
	 */
	private class OpenRiskMatrixDialog extends AbstractAction {
		public OpenRiskMatrixDialog() {
			putValue(NAME, "Risk Matrix");
			putValue(SHORT_DESCRIPTION, "View or import the risk matrix for this project");
		}

		public void actionPerformed(ActionEvent e) {
			showRiskMatrixDialog();
		}
	}

	/**
	 * Action to open the hazard log editor
	 */
	private class OpenHazardLogEditor extends AbstractAction {
		public OpenHazardLogEditor() {
		}

		public void actionPerformed(ActionEvent e) {
			showHazardLogEditor();
		}
	}

	/**
	 * Action to open the issue log editor
	 *
	 */
	private class OpenIssueLogEditor extends AbstractAction {
		public void actionPerformed(ActionEvent e) {
			showIssueLogEditor();
		}
	}

	/**
	 * Action to open the report editor section
	 */
	private class OpenReportGenerator extends AbstractAction {
		public void actionPerformed(ActionEvent e) {
			showReportGenerator();
		}
	}

	/**
	 * Action to open the care process editor
	 *
	 */
	private class OpenCareProcessExplorer extends AbstractAction {
		public OpenCareProcessExplorer() {
			putValue(NAME, "Browse");
			putValue(SHORT_DESCRIPTION, "Browse, open and remove care processes");
		}

		public void actionPerformed(ActionEvent e) {
			CareProcessExplorerDialog d = new CareProcessExplorerDialog(cardPanelCareProcessEditor);
			d.pack();
			d.setVisible(true);
		}
	}

	/**
	 * Action to save the project.
	 */
	private class SaveCurrentEditor extends AbstractAction {
		public SaveCurrentEditor() {
			putValue(NAME, "Save Project");
			putValue(SHORT_DESCRIPTION, "Save the project");
		}

		public void actionPerformed(ActionEvent e) {
			currentView.save();
		}
	}

	/**
	 * Action to create a new care process
	 *
	 */
	private class CreateNewCareProcess extends AbstractAction {
		public CreateNewCareProcess() {
			putValue(NAME, "New");
			putValue(SHORT_DESCRIPTION, "Create a new care process");
		}

		public void actionPerformed(ActionEvent e) {
			cardPanelCareProcessEditor.createNewCareProcess();
		}
	}

	/**
	 * Action to export the .docx version of the report.
	 *
	 */
	private class ExportReport extends AbstractAction {
		public ExportReport() {
			putValue(NAME, "Generate Report");
			putValue(SHORT_DESCRIPTION, "Generate the report template for the current project");
		}

		public void actionPerformed(ActionEvent e) {
			exportReportTemplate();
		}
	}

	/**
	 * Set the mode of the toolbar (which is visible in all editors), changing
	 * the visibility of certain buttons appropriately.
	 * 
	 * @param mode
	 */
	private void setToolbarMode(ToolbarModes mode) {
		switch (mode) {
		case CARE_PROCESS_EDITOR:
			btnBrowse.setVisible(true);
			btnSave.setVisible(true);
			btnNew.setVisible(true);
			btnGenerateReport.setVisible(false);
			break;
		case GENERAL:
			btnBrowse.setVisible(false);
			btnSave.setVisible(true);
			btnNew.setVisible(false);
			btnGenerateReport.setVisible(false);
			break;
		case REPORT:
			btnBrowse.setVisible(false);
			btnSave.setVisible(true);
			btnNew.setVisible(false);
			btnGenerateReport.setVisible(true);
			break;
		default:
			break;
		}
	}

	/**
	 * Open the system editor with the given location selected.
	 * 
	 * @param s
	 */
	public void openSystemEditorWithSelection(SystemDefinition s) {
		showSystemEditor();
		cardPanelSystemBrowser.selectSystem(s);
	}

	/**
	 * Open the location editor with the given location selected.
	 * 
	 * @param l
	 */
	public void openLocationEditorWithSelection(LocationDefinition l) {
		showLocationEditor();
		cardPanelLocationEditor.selectLocation(l);
	}

	/**
	 * Open the hazard log editor with the given hazard instance selected
	 * 
	 * @param hazardInstance
	 */
	public void openHazardLogEditorWithSelectedInstance(HazardInstance hazardInstance) {
		showHazardLogEditor();
		cardPanelHazardLogEditor.selectHazardInstance(hazardInstance);

	}

	/**
	 * Show the dialog asking the user whether they want to save the data in the
	 * current editor, discard any changes or cancel and go back.
	 * 
	 * @param dialogParent
	 */
	private void showConfirmCloseDialog(Component dialogParent) {

		pv_home_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Object[] options = { "Yes", "No", "Cancel" };
				int n = JOptionPane.showOptionDialog(dialogParent, DialogContent.UNSAVED_DATA_DIALOG_MESSAGE,
						DialogContent.UNSAVED_DATA_DIALOG_TITLE, JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
				if (n == JOptionPane.YES_OPTION) {
					if (currentView.saveAndClose()) {
						showHomeCard();
						return;
					}
				}
				if (n == JOptionPane.NO_OPTION) {
					showHomeCard();
					return;
				} else if (n == JOptionPane.CANCEL_OPTION) {
					return;
				}
			}
		});

	}

	/**
	 * Show the dialog for choosing to save or discard unsaved data on close.
	 * Note that this is different from
	 * {@link #showConfirmCloseDialog(Component)}, as it exits the whole
	 * application, not just returns to the home screen.
	 * 
	 * @param dialogParent
	 * @param exit
	 *            true - the application should exit on "yes" or "no" pressed.
	 *            false - the window should dispose, expecting another to take
	 *            its place.
	 * @return true if "yes" or "no" is pressed (confirm save or discard). false
	 *         if "cancel" is pressed.
	 */
	private boolean showConfirmExitApplicationDialog(Component dialogParent, boolean exit) {
		Object[] options = { "Yes", "No", "Cancel" };
		int n = JOptionPane.showOptionDialog(dialogParent, DialogContent.UNSAVED_DATA_EXIT_DIALOG_MESSAGE,
				DialogContent.UNSAVED_DATA_EXIT_DIALOG_TITLE, JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		if (n == JOptionPane.YES_OPTION) {
			if (Main.saveProject()) {
				// Close only if the project saved successfully.
				if (exit) {
					System.exit(0);
				} else {
					mainWindow.dispose();
				}
				return true;
			}
		}
		if (n == JOptionPane.NO_OPTION) {
			// Close the window.
			if (exit) {
				System.exit(0);
			} else {
				mainWindow.dispose();
			}
			return true;
		} else if (n == JOptionPane.CANCEL_OPTION) {
			return false;
		}
		return false;
	}

	private enum ToolbarModes {
		GENERAL, REPORT, CARE_PROCESS_EDITOR;
	}

	/**
	 * Set the title of the window depending on whether the project is currently
	 * saved or not
	 * 
	 * @param b
	 */
	public void setTitle(boolean b) {
		if (b == false) {
			mainWindow.setTitle(ResourceBundle.getBundle("userInterface.messages").getString("global.application_title") //$NON-NLS-1$ //$NON-NLS-2$
					+ " - " + Main.ProjectCurrentNameUNSAVED);
		} else {
			mainWindow.setTitle(ResourceBundle.getBundle("userInterface.messages").getString("global.application_title") //$NON-NLS-1$ //$NON-NLS-2$
					+ " - " + Main.ProjectCurrentName);
		}

	}
}
