package utilities;

import java.util.ArrayList;
import java.util.Iterator;

import RiskMatrixModel.LikelihoodLevel;
import RiskMatrixModel.RiskMatrix;
import RiskMatrixModel.RiskRatingInstance;
import RiskMatrixModel.SeverityLevel;
import careProcess_model.CareProcess;
import careProcess_model.HazardCause;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
import careProcess_model.HazardRepository;
import careProcess_model.LocationDefinition;
import careProcess_model.LocationRepository;
import careProcess_model.Project;
import careProcess_model.Step;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import careProcess_model.SystemRepository;
import careProcess_model.stepType;

/**
 * Provides various utility methods to check and validate application data.
 */
public class DataHelper {

	/**
	 * Check to see whether the input system repository already has a system
	 * definition with the given name.
	 * 
	 * @param s
	 *            the input SystemRepository
	 * @param name
	 *            the name to search for
	 * @param currentName
	 *            a SystemDefinition ignore in the search - so we don't identify
	 *            name of the current system as a duplicate of itself.
	 * @return true if the repository already contains a system definition with
	 *         the given name, false otherwise.
	 */
	public static boolean checkForSameSystemName(SystemRepository s, String name, SystemDefinition currentSystem) {
		for (SystemDefinition sd : s.getSystemDefinitions()) {
			if (sd.getSystemName().toLowerCase().equals(name.toLowerCase())) {
				if (currentSystem != sd) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Check to see whether the input location repository already has a location
	 * definition with the given name.
	 * 
	 * @param l
	 * @param name
	 * @param currentLocation
	 *            A LocationDefinition to ignore in the search, so that the
	 *            current location definition's name is not identified as a
	 *            duplicate of itself.
	 * @return true if the repository already contains a location definition
	 *         with the given name, false otherwise.
	 */
	public static boolean checkForSameLocationName(LocationRepository l, String name,
			LocationDefinition currentLocation) {
		for (LocationDefinition ld : l.getLocationDefinitions()) {
			if (ld.getLocationName().toLowerCase().equals(name.toLowerCase())) {
				if (currentLocation != ld) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Check to see whether the given HazardInstance already has a HazardCause
	 * with the given name.
	 * 
	 * @param h
	 * @param name
	 * @return true if the HazardInstance already has a HazardCause with the
	 *         given name, false otherwise.
	 */
	public static boolean checkForSameHazardCauseName(HazardInstance h, String name) {
		for (HazardCause c : h.getHazardcauses()) {
			if (c.getCauseName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Check to see whether there is an existing care process instance with the
	 * given name in the given project. Skips the given care process in the
	 * check.
	 * 
	 * @param p
	 * @param name
	 * @return true if there is an existing care process with the given name.
	 *         False otherwise.
	 */
	public static boolean checkForSameCareProcessName(Project p, String name, CareProcess currentCareProcess) {
		for (CareProcess c : p.getCareProcesses()) {
			if (c.getName().equalsIgnoreCase(name)) {
				if (currentCareProcess == null) {
					return true;
				}
				if (!currentCareProcess.equals(c)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Get the most extreme likelihood, severity and risk rating data associated
	 * with any hazard instance that is a child of the given hazard definition,
	 * and return the hazard instances with the most extreme initial and
	 * residual ratings.
	 * <p>
	 * Note: The method returns the index of most extreme value of each
	 * parameter in the RiskMatrix, so a lower likelihood index is a higher
	 * likelihood, but a higher severity index is a higher severity.
	 * 
	 * @param hd
	 *            The hazard definition whose child instances should be searched
	 * @param rm
	 *            The risk matrix that defines severity, likelihood and risk
	 *            rating.
	 * @return An int array with maxInitSeverity, maxInitLikelihood,
	 *         maxInitRating, maxResidSeverity, maxResidLikelihood,
	 *         maxResidRating, the instance with the highest initial risk rating
	 *         and the instance with the highest residual risk rating at each
	 *         respective index.
	 */
	public static Object[] getMaximumHazardData(HazardDefinition hd, RiskMatrix rm) {
		int maxInitSeverity = 0;
		int maxInitLikelihood = rm.getLikelihoodlevel().size() - 1;
		int maxInitRating = 0;
		HazardInstance maxInitial = null;

		int maxResidSeverity = 0;
		int maxResidLikelihood = rm.getLikelihoodlevel().size() - 1;
		int maxResidRating = 0;
		HazardInstance maxResidual = null;

		for (HazardInstance hi : hd.getHazardInstances()) {
			if (hi.getInitialSeverity() > maxInitSeverity) {
				maxInitSeverity = hi.getInitialSeverity();
			}
			if (hi.getResidualSeverity() > maxResidSeverity) {
				maxResidSeverity = hi.getResidualSeverity();
			}
			if (hi.getInitialLikelihood() < maxInitLikelihood) {
				maxInitLikelihood = hi.getInitialLikelihood();
			}
			if (hi.getResidualLikelihood() < maxResidLikelihood) {
				maxResidLikelihood = hi.getResidualLikelihood();
			}
			if (hi.getInitialRiskRating() > maxInitRating) {
				maxInitRating = hi.getInitialRiskRating();
				maxInitial = hi;
			}
			if (hi.getResidualRiskRating() > maxResidRating) {
				maxResidRating = hi.getResidualRiskRating();
				maxResidual = hi;
			}
		}

		return new Object[] { maxInitSeverity, maxInitLikelihood, maxInitRating, maxResidSeverity, maxResidLikelihood,
				maxResidRating, maxInitial, maxResidual };

	}

	/**
	 * Find the risk rating corresponding to the given likelihood and severity.
	 * If there is no such value, return 0.
	 * 
	 * @param rm
	 * @param likelihoodLevel
	 * @param severityLevel
	 * @return risk rating corresponding to the given likelihood and severity or
	 *         0 if there is no such value
	 */
	public static int getRiskRatingByLikelihoodSeverity(RiskMatrix rm, LikelihoodLevel likelihoodLevel,
			SeverityLevel severityLevel) {
		// TODO This could be done in linear time (linear in the sum of the
		// number of
		// likelihood and severity levels). Refactor to achieve this.
		for (RiskRatingInstance r : rm.getRiskratinginstance()) {
			if (r.getLikelihoodlevel().equals(likelihoodLevel) && r.getSeveritylevel().equals(severityLevel)) {
				return r.getRiskValue();
			}
		}
		return 0;
	}

	/**
	 * Get the likelihood level object from the given RiskMatrix at the
	 * specified index.
	 * 
	 * @param rm
	 * @param index
	 * @return
	 */
	public static LikelihoodLevel getLikelihoodByIndex(RiskMatrix rm, int index) {
		for (LikelihoodLevel l : rm.getLikelihoodlevel()) {
			if (l.getLevelIndex() == index) {
				return l;
			}
		}
		return null;
	}

	/**
	 * Get the severity level object from the given RiskMatrix at the specified
	 * index.
	 * 
	 * @param rm
	 * @param index
	 * @return
	 */
	public static SeverityLevel getSeverityByIndex(RiskMatrix rm, int index) {
		for (SeverityLevel s : rm.getSeveritylevel()) {
			if (s.getLevelIndex() == index) {
				return s;
			}
		}
		return null;
	}

	/**
	 * Check to see whether the input string contains any non-blank (i.e. not
	 * space, tab, etc.) characters.
	 * 
	 * @param s
	 *            the string to be checked
	 * @return true if there are non-blank characters in the string, false
	 *         otherwise.
	 */
	public static boolean isStringEmpty(String s) {
		if (s.replaceAll("\\s+", "").length() > 0) {
			return false;
		}
		return true;
	}

	/**
	 * Check to see if the given hazard name occurs in any hazard definition
	 * other than the one given.
	 * 
	 * @param h
	 * @param name
	 * @param currentHazard
	 * @return
	 */
	public static boolean checkForSameHazardName(HazardRepository h, String name, HazardDefinition currentHazard) {
		for (HazardDefinition hd : h.getHazardDefinitions()) {
			if (hd.getHazardName().toLowerCase().equals(name.toLowerCase())) {
				if (!currentHazard.equals(hd)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Get a list of all the steps associated with any care process in the given
	 * project.
	 * 
	 * @param p
	 * @return
	 */
	public static ArrayList<Step> getAllStepsArrayList(Project p) {
		ArrayList<Step> steps = new ArrayList<Step>();
		Iterator<CareProcess> careProcessIterator = p.getCareProcesses().iterator();
		while (careProcessIterator.hasNext()) {
			CareProcess c = careProcessIterator.next();
			Iterator<Step> stepIterator = c.getProcessGraph().getStep().iterator();
			while (stepIterator.hasNext()) {
				Step s = stepIterator.next();
				if (s.getStepTypeValue().equals(stepType.ACTIVITY) || s.getStepTypeValue().equals(stepType.DECISION)) {
					steps.add(s);
				}
			}
		}
		return steps;
	}

	/**
	 * Get a list of all the functions associated with any system in the given
	 * project
	 * 
	 * @param p
	 * @return
	 */
	public static ArrayList<SystemFunction> getAllSystemFunctionsArrayList(Project p) {
		ArrayList<SystemFunction> systemFunctions = new ArrayList<SystemFunction>();
		Iterator<SystemDefinition> systemDefinitionIterator = p.getDatastore().getSystemrepository()
				.getSystemDefinitions().iterator();
		while (systemDefinitionIterator.hasNext()) {
			SystemDefinition s = systemDefinitionIterator.next();
			if (!s.getSystemFunctions().isEmpty()) {
				Iterator<SystemFunction> functionIterator = s.getSystemFunctions().iterator();
				while (functionIterator.hasNext()) {
					systemFunctions.add(functionIterator.next());
				}
			}
		}
		return systemFunctions;
	}

	/**
	 * get a truncated version of the input string with the specified number of
	 * characters (plus "..." at the end)
	 * 
	 * @param in
	 *            the string to be truncated
	 * @param chars
	 *            the number of string characters to use
	 * @return the truncated string, or null if the input string is null
	 */
	public static String truncateString(String in, int chars) {
		String suffix = "...";
		if (in != null) {
			if (in.length() <= chars) {
				return in + suffix;
			} else {
				return in.substring(0, chars - 1) + suffix;
			}
		}
		return null;
	}

}
