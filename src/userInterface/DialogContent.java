package userInterface;

import java.awt.Component;

import javax.swing.JOptionPane;

/**
 * Strings for use in the various message/warning dialogs.
 *
 */
public class DialogContent {
	public static final String DUPLICATE_LOCATION_SAVE_DIALOG_TITLE = "Duplicate Care Setting Name";
	public static final String DUPLICATE_LOCATION_SAVE_DIALOG_MESSAGE = "Please enter a unique name for this care setting.";

	public static final String DUPLICATE_HAZARD_SAVE_DIALOG_TITLE = "Duplicate Hazard Name";
	public static final String DUPLICATE_HAZARD_SAVE_DIALOG_MESSAGE = "Please enter a unique name for this hazard type.";
	
	public static final String DUPLICATE_SYSTEM_SAVE_DIALOG_TITLE = "Duplicate System Name";
	public static final String DUPLICATE_SYSTEM_SAVE_DIALOG_MESSAGE = "Please enter a unique name for this system.";
	
	public static final String DUPLICATE_CAREPROCESS_SAVE_DIALOG_TITLE = "Duplicate Care Process";
	public static final String DUPLICATE_CAREPROCESS_SAVE_DIALOG_MESSAGE = "Please enter a unique name for this care process.";

	public static final String HAZARD_INSTANCE_INSUFFICIENT_DATA_DIALOG_TITLE = "Insufficient data";
	public static final String HAZARD_INSTANCE_INSUFFICIENT_DATA_DIALOG_MESSAGE = "Instances of a particular hazard type must be associated with a system function and a step in a care process.";
	public static final String HAZARD_INSTANCE_NO_FUNCTIONS_DIALOG_MESSAGE = "Please define at least one system function in the system editor.";
	public static final String HAZARD_INSTANCE_NO_STEPS_DIALOG_MESSAGE = "Please define at least one step in a care process using the care process editor.";

	public static final String UNSAVED_DATA_DIALOG_TITLE = "Unsaved data...";
	public static final String UNSAVED_DATA_DIALOG_MESSAGE = "The current view contains unsaved data. Would you like to save it now?";
	
	public static final String SAVE_FAILURE_MESSAGE = "The file could not be saved. Please ensure it is not open in other programs and try again.";
	public static final String SAVE_FAILURE_TITLE = "Save Error";
	public static final String LOAD_FAILURE_MESSAGE = "The file could not be loaded";
	public static final String LOAD_FAILURE_TITLE = "Load Error";
	
	public static final String RISK_MATRIX_LOAD_FAILURE_MESSAGE = "The risk matrix for this project could not be loaded. The default will be used.";
	public static final String RISK_MATRIX_LOAD_FAILURE_TITLE = "Load Error";
	
	public static final String STEP_DATA_FAILURE_MESSAGE = "The data for this entity could not be found. Please re-enter the data.";
	public static final String STEP_DATA_FAILURE_TITLE = "Missing Data - Prototypes will be prototypes...";
	
	public static final String CONFIRM_DELETE_CARE_PROCESS_TITLE = "Confirm Deletion";
	public static final String CONFIRM_DELETE_CARE_PROCESS_MESSAGE = String.format("Are you sure you want to delete the selected care process?%nThis action cannot be undone");

	
	public static final String TEMPLATE_NOT_FOUND_TITLE = "Template Not Found";
	public static final String TEMPLATE_NOT_FOUND_MESSAGE = "Could not load the report template. Report generation may not function properly.";

	
	public static final String GENERAL_REPORT_ERROR_TITLE = "Error with Report";
	public static final String GENERAL_REPORT_ERROR_MESSAGE = "An error occurred while preparing the report. Please try again.";
	
	public static final String SAVE_REPORT_FAILED_TITLE = "Export Failed";
	public static final String SAVE_REPORT_FAILED_MESSAGE = "The report could not be saved. Please ensure that the target file is not in use and try again.";

	protected static final String UNSAVED_DATA_EXIT_DIALOG_TITLE = "Confirm Close";
	protected static final String UNSAVED_DATA_EXIT_DIALOG_MESSAGE = "Save changes to the current project?";

	


	
	
	/**
	 * Show a warning dialog with the given title and message.
	 * 
	 * @param title
	 * @param message
	 */
	public static void showWarningDialog(Component c, String title, String message) {
		JOptionPane.showMessageDialog(c, message, title, JOptionPane.WARNING_MESSAGE);
	}

}
