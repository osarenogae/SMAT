package main;

import java.awt.EventQueue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import javax.xml.datatype.DatatypeFactory;

import javax.swing.JOptionPane;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.UnresolvedReferenceException;

import com.mxgraph.io.mxCodecRegistry;
import com.mxgraph.io.mxObjectCodec;

import RiskMatrixModel.RiskMatrix;
import RiskMatrixModel.RiskMatrixModelPackage;
import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelFactory;
import careProcess_model.CareProcess_modelPackage;
import careProcess_model.DataStore;
import careProcess_model.HazardInstance;
import careProcess_model.HazardRepository;
import careProcess_model.LocationRepository;
import careProcess_model.Project;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
import careProcess_model.SystemRepository;
import export.DocExporter;
import io.InputOutput;
import userInterface.DialogContent;
import userInterface.MainAppWindow;
import userInterface.startup.StartupMenu;

public class Main {
	// A unique build code, should be manually updated for each new build.
	// (Used 'YYYYMMDD-build number' date-based numbering here)
	public static final String APPLICATION_VERSION = "20170319-1";

	// DEVELOPER mode causes string labels for objects to be printed with all
	// the attributes of that object.
	// NORMAL mode prints the strings in the usual user-friendly short form.
	private static ExecutionModes EXECUTION_MODE = ExecutionModes.NORMAL;

	private static StartupMenu window;
	private static MainAppWindow appWindow;

	private static DataStore data;

	// The location of the default risk matrix, stored in a separate xml file.
	private static final String DEFAULT_RISK_MATRIX_FILENAME = "SCCI0160";
	public static final String DEFAULT_RISK_MATRIX_EXTENSION = "riskmatrixmodel";
	private static final String DEFAULT_RISK_MATRIX_PATH = "data/matrix/" + DEFAULT_RISK_MATRIX_FILENAME + "."
			+ DEFAULT_RISK_MATRIX_EXTENSION;

	// Default filename and filepath for the project
	public static final String ProjectExtension = "cpproject";
	public static String ProjectFilename = "untitled project";
	public static String ProjectPath = "data/project/" + ProjectFilename + "." + ProjectExtension;

	public static String ProjectCurrentName = ProjectFilename;
	public static String ProjectCurrentNameUNSAVED = ProjectCurrentName + "*";

	// The currently active project object, holds all the project data
	private static Project project;

	// The currently active risk matrix object, defines the possible hazard
	// severity/likelihood values
	private static RiskMatrix riskMatrix;

	// Flag to indicate whether the current version of the project has been
	// saved.
	private static boolean projectIsSaved = false;

	// An adapter to detect when a change occurs in the data.
	private static EContentAdapter eContentAdapter = new EContentAdapter() {
		@Override
		public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
			super.notifyChanged(notification);
			setProjectSaved(false);
		};

	};

	public static void main(String[] args) {

		// Register the codecs for saving the graphs
		registerJGraphxCodecs();
		// Initialise the models
		CareProcess_modelPackage.eINSTANCE.eClass();
		RiskMatrixModelPackage.eINSTANCE.eClass();
		// Load the main GUI window
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				window = new StartupMenu();
				window.setVisible(true);
			}
		});

	}

	private static void registerJGraphxCodecs() {
		// TODO It is unclear whether we need to register these things in order
		// to save the graph data. It is worthwhile trying to find out.
		mxCodecRegistry.addPackage("careProcess_model.impl.StartImpl");
		mxCodecRegistry.register(new mxObjectCodec(new careProcess_model.impl.StartImpl()));
		mxCodecRegistry.addPackage("careProcess_model.impl.ActivityImpl");
		mxCodecRegistry.register(new mxObjectCodec(new careProcess_model.impl.ActivityImpl()));
	}

	private static Project loadProjectData() {
		Project p = null;
		try {
			p = (Project) InputOutput.loadProject(ProjectPath, ProjectExtension);
		} catch (org.eclipse.emf.common.util.WrappedException e) {
			// This error is handled in the caller when null is returned.
			// TODO we could do this a more standard way by throwing the error
			// up the call stack and handling it in the caller.
			System.out.println("General File Open Error: Not handled");
			e.printStackTrace();
		}
		return p;
	}

	public static ExecutionModes getMode() {
		return EXECUTION_MODE;
	}

	public static Project getProject() {
		return project;
	}

	public static RiskMatrix getRiskMatrix() {
		return riskMatrix;
	}

	public static void setRiskMatrix(RiskMatrix rm) {
		riskMatrix = rm;
	}

	public enum ExecutionModes {
		DEVELOPER, NORMAL;
	}

	public static void setProjectFilepath(String projectName, String projectPath) {
		ProjectFilename = projectName;
		ProjectCurrentName = ProjectFilename;
		ProjectCurrentNameUNSAVED = ProjectCurrentName + "*";
		ProjectPath = projectPath;
	}

	public static void newProject() {
		try {
			// Make a new project
			project = CareProcess_modelFactory.eINSTANCE.createProject();

			// Load the default risk matrix
			riskMatrix = InputOutput.loadRiskMatrix(DEFAULT_RISK_MATRIX_PATH, DEFAULT_RISK_MATRIX_EXTENSION);
			project.setRiskMatrixData(InputOutput.getRiskMatrixString(riskMatrix));

			// Set the timestamp for the project
			GregorianCalendar gregorianCalendar = new GregorianCalendar();
			DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
			XMLGregorianCalendar calendar = datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
			project.setDateModified(calendar);

			// Set the app version metadata
			project.setCreatedWithAppVersion(APPLICATION_VERSION);

			// Create the datastore and repositories where data objects will be
			// stored
			data = CareProcess_modelFactory.eINSTANCE.createDataStore();
			data.setReportData(CareProcess_modelFactory.eINSTANCE.createReportData());
			data.setHazardrepository(CareProcess_modelFactory.eINSTANCE.createHazardRepository());
			data.setLocationrepository(CareProcess_modelFactory.eINSTANCE.createLocationRepository());
			data.setSystemrepository(CareProcess_modelFactory.eINSTANCE.createSystemRepository());
			project.setDatastore(data);

			// Create a default CareProcess.
			// CareProcess cp =
			// CareProcess_modelFactory.eINSTANCE.createCareProcess();
			// cp.setProcessGraph(CareProcess_modelFactory.eINSTANCE.createprocessGraph());
			// cp.setName("Test Care Process");
			// project.getCareProcesses().add(cp);

			appWindow = new MainAppWindow(riskMatrix);
			appWindow.getMainWindow().setVisible(true);
			appWindow.setTitle(projectIsSaved);

			project.eAdapters().add(eContentAdapter);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(window, DialogContent.LOAD_FAILURE_MESSAGE, DialogContent.LOAD_FAILURE_TITLE,
					JOptionPane.WARNING_MESSAGE);
			e.printStackTrace();
		}
	}

	/**
	 * Attempt to load the data from a project file
	 */
	public static void loadProject() {
		project = loadProjectData();
		if (project != null) {
			removeUnneededStepsFromProject(project);
			try {
				riskMatrix = InputOutput.loadRiskMatrixFromString(project.getRiskMatrixData(),
						DEFAULT_RISK_MATRIX_EXTENSION);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(window, DialogContent.RISK_MATRIX_LOAD_FAILURE_MESSAGE,
						DialogContent.RISK_MATRIX_LOAD_FAILURE_TITLE, JOptionPane.WARNING_MESSAGE);
				e.printStackTrace();
			} finally {
				// Load the default risk matrix
				riskMatrix = InputOutput.loadRiskMatrix(DEFAULT_RISK_MATRIX_PATH, DEFAULT_RISK_MATRIX_EXTENSION);
				try {
					project.setRiskMatrixData(InputOutput.getRiskMatrixString(riskMatrix));
				} catch (IOException e) {
					JOptionPane.showMessageDialog(window, DialogContent.LOAD_FAILURE_MESSAGE,
							DialogContent.LOAD_FAILURE_TITLE, JOptionPane.WARNING_MESSAGE);
					e.printStackTrace();
				}
			}

			appWindow = new MainAppWindow(riskMatrix);
			appWindow.getMainWindow().setVisible(true);
			appWindow.setTitle(projectIsSaved);

			project.eAdapters().add(eContentAdapter);

		} else {
			JOptionPane.showMessageDialog(window, DialogContent.LOAD_FAILURE_MESSAGE, DialogContent.LOAD_FAILURE_TITLE,
					JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * Remove any hidden steps from the project file. They are not needed
	 * anymore. This relates to undo functionality. See
	 * {@link #CareProcessEditorWorker.updateHideSteps()}.
	 * 
	 * @param p
	 */
	private static void removeUnneededStepsFromProject(Project p) {
		/*
		 * Iterator<CareProcess> CareProcessIterator =
		 * p.getCareProcesses().iterator(); while
		 * (CareProcessIterator.hasNext()) { CareProcess currentCareProcess =
		 * CareProcessIterator.next(); ArrayList<Step> stepRemovalList = new
		 * ArrayList<Step>(); for (Step s :
		 * currentCareProcess.getProcessGraph().getStep()) { if (s.isHidden()) {
		 * 
		 * stepRemovalList.add(s); } } for (Step s2 : stepRemovalList) {
		 * System.out.println("REMOVING STEP: " + s2.getName()); if
		 * (s2.getProcessGraph() != null) {
		 * s2.getProcessGraph().getStep().remove(s2); } if (s2.getLocation() !=
		 * null) { s2.getLocation().getSteps().remove(s2); }
		 * ArrayList<SystemFunction> removeFromFunctions = new
		 * ArrayList<SystemFunction>(); ArrayList<HazardInstance>
		 * removeFromHazardInstances = new ArrayList<HazardInstance>();
		 * 
		 * for (SystemFunction f : s2.getAssociatedSystemFunctions()) {
		 * removeFromFunctions.add(f); } for (HazardInstance hi :
		 * s2.getHazardInstances()) { removeFromHazardInstances.add(hi); }
		 * 
		 * for (SystemFunction sf : removeFromFunctions) {
		 * sf.getAssociatedSteps().remove(s2); }
		 * 
		 * for (HazardInstance hi : removeFromHazardInstances) {
		 * hi.setStep(null); }
		 * 
		 * EcoreUtil.delete(s2); } }
		 */
	}

	/**
	 * Save the project as an xml/xmi file in the location given by ProjectPath.
	 */
	public static boolean saveProject() {
		System.out.println("Attempting to save project...");
		try {
			InputOutput.saveProject(Main.getProject(), Main.ProjectPath, Main.ProjectExtension);
			System.out.println("Save complete.");
			setProjectSaved(true);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(window, DialogContent.SAVE_FAILURE_MESSAGE, DialogContent.SAVE_FAILURE_TITLE,
					JOptionPane.WARNING_MESSAGE);
			return false;
		}
	}

	/**
	 * Change whether the current version of the project is marked as saved or
	 * not. We mark it as saved in {@link #saveProject()}. We mark it as unsaved
	 * in {@link #CareProcess_modelFactoryImpl.create(EClass eClass)} and an
	 * event listener defined in {@link #GraphEditorPanel2.initialise()}.
	 * 
	 * @param value
	 */
	public static void setProjectSaved(boolean value) {
		if (value == true) {
			projectIsSaved = true;
			appWindow.setTitle(true);
		} else {
			projectIsSaved = false;
			appWindow.setTitle(false);
		}

	}

	public static boolean isSaved() {
		return projectIsSaved;
	}
}
