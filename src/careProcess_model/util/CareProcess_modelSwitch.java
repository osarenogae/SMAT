/**
 */
package careProcess_model.util;

import careProcess_model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see careProcess_model.CareProcess_modelPackage
 * @generated
 */
public class CareProcess_modelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CareProcess_modelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareProcess_modelSwitch() {
		if (modelPackage == null) {
			modelPackage = CareProcess_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CareProcess_modelPackage.PROCESS_GRAPH: {
				processGraph processGraph = (processGraph)theEObject;
				T result = caseprocessGraph(processGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.SYSTEM_FUNCTION: {
				SystemFunction systemFunction = (SystemFunction)theEObject;
				T result = caseSystemFunction(systemFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.CARE_PROCESS: {
				CareProcess careProcess = (CareProcess)theEObject;
				T result = caseCareProcess(careProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.HAZARD_INSTANCE: {
				HazardInstance hazardInstance = (HazardInstance)theEObject;
				T result = caseHazardInstance(hazardInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.HAZARD_CONTROL: {
				HazardControl hazardControl = (HazardControl)theEObject;
				T result = caseHazardControl(hazardControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.HAZARD_CAUSE: {
				HazardCause hazardCause = (HazardCause)theEObject;
				T result = caseHazardCause(hazardCause);
				if (result == null) result = caseHazardFactor(hazardCause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.HAZARD_EFFECT: {
				HazardEffect hazardEffect = (HazardEffect)theEObject;
				T result = caseHazardEffect(hazardEffect);
				if (result == null) result = caseHazardFactor(hazardEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseStep(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseStep(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseStep(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.STOP: {
				Stop stop = (Stop)theEObject;
				T result = caseStop(stop);
				if (result == null) result = caseStep(stop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.HAZARD_REPOSITORY: {
				HazardRepository hazardRepository = (HazardRepository)theEObject;
				T result = caseHazardRepository(hazardRepository);
				if (result == null) result = caseRepository(hazardRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.HAZARD_DEFINITION: {
				HazardDefinition hazardDefinition = (HazardDefinition)theEObject;
				T result = caseHazardDefinition(hazardDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.LOCATION_REPOSITORY: {
				LocationRepository locationRepository = (LocationRepository)theEObject;
				T result = caseLocationRepository(locationRepository);
				if (result == null) result = caseRepository(locationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.LOCATION_DEFINITION: {
				LocationDefinition locationDefinition = (LocationDefinition)theEObject;
				T result = caseLocationDefinition(locationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.SYSTEM_REPOSITORY: {
				SystemRepository systemRepository = (SystemRepository)theEObject;
				T result = caseSystemRepository(systemRepository);
				if (result == null) result = caseRepository(systemRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.SYSTEM_DEFINITION: {
				SystemDefinition systemDefinition = (SystemDefinition)theEObject;
				T result = caseSystemDefinition(systemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.DATA_STORE: {
				DataStore dataStore = (DataStore)theEObject;
				T result = caseDataStore(dataStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.HAZARD_FACTOR: {
				HazardFactor hazardFactor = (HazardFactor)theEObject;
				T result = caseHazardFactor(hazardFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.REPORT_DATA: {
				ReportData reportData = (ReportData)theEObject;
				T result = caseReportData(reportData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CareProcess_modelPackage.ISSUE_DEFINITION: {
				IssueDefinition issueDefinition = (IssueDefinition)theEObject;
				T result = caseIssueDefinition(issueDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>process Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>process Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprocessGraph(processGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemFunction(SystemFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCareProcess(CareProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardInstance(HazardInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardControl(HazardControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardCause(HazardCause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardEffect(HazardEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardRepository(HazardRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardDefinition(HazardDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationRepository(LocationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationDefinition(LocationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRepository(SystemRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDefinition(SystemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStore(DataStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardFactor(HazardFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReportData(ReportData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueDefinition(IssueDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CareProcess_modelSwitch
