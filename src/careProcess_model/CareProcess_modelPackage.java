/**
 */
package careProcess_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see careProcess_model.CareProcess_modelFactory
 * @model kind="package"
 * @generated
 */
public interface CareProcess_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "careProcess_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uk.gov.hscic.CareProcessTool";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hscicCareProcessTool";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CareProcess_modelPackage eINSTANCE = careProcess_model.impl.CareProcess_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link careProcess_model.impl.processGraphImpl <em>process Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.processGraphImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getprocessGraph()
	 * @generated
	 */
	int PROCESS_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Care Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GRAPH__CARE_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Graph Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GRAPH__GRAPH_DATA = 1;

	/**
	 * The feature id for the '<em><b>Data Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GRAPH__DATA_MAP = 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GRAPH__STEP = 3;

	/**
	 * The number of structural features of the '<em>process Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GRAPH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>process Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.SystemFunctionImpl <em>System Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.SystemFunctionImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getSystemFunction()
	 * @generated
	 */
	int SYSTEM_FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Hazard Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__HAZARD_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>System Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__SYSTEM_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__FUNCTION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Associated Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION__ASSOCIATED_STEPS = 4;

	/**
	 * The number of structural features of the '<em>System Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.CareProcessImpl <em>Care Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.CareProcessImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getCareProcess()
	 * @generated
	 */
	int CARE_PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_PROCESS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Process Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_PROCESS__PROCESS_GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Project</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_PROCESS__PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_PROCESS__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Care Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_PROCESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Care Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.HazardInstanceImpl <em>Hazard Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.HazardInstanceImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardInstance()
	 * @generated
	 */
	int HAZARD_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Initial Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__INITIAL_LIKELIHOOD = 0;

	/**
	 * The feature id for the '<em><b>Initial Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__INITIAL_SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__STEP = 2;

	/**
	 * The feature id for the '<em><b>Hazard Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__HAZARD_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>System Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__SYSTEM_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Residual Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__RESIDUAL_LIKELIHOOD = 6;

	/**
	 * The feature id for the '<em><b>Residual Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__RESIDUAL_SEVERITY = 7;

	/**
	 * The feature id for the '<em><b>Initial Risk Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__INITIAL_RISK_RATING = 8;

	/**
	 * The feature id for the '<em><b>Residual Risk Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__RESIDUAL_RISK_RATING = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__OWNER = 11;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__SUMMARY = 12;

	/**
	 * The feature id for the '<em><b>Hazardcauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__HAZARDCAUSES = 13;

	/**
	 * The feature id for the '<em><b>Hazardeffects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__HAZARDEFFECTS = 14;

	/**
	 * The feature id for the '<em><b>Clinical Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__CLINICAL_JUSTIFICATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE__NAME = 16;

	/**
	 * The number of structural features of the '<em>Hazard Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Hazard Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.HazardControlImpl <em>Hazard Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.HazardControlImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardControl()
	 * @generated
	 */
	int HAZARD_CONTROL = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CONTROL__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CONTROL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Control State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CONTROL__CONTROL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Control Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CONTROL__CONTROL_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Other Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CONTROL__OTHER_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Hazardcause</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CONTROL__HAZARDCAUSE = 5;

	/**
	 * The feature id for the '<em><b>Hazardeffect</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CONTROL__HAZARDEFFECT = 6;

	/**
	 * The number of structural features of the '<em>Hazard Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CONTROL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Hazard Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.HazardFactorImpl <em>Hazard Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.HazardFactorImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardFactor()
	 * @generated
	 */
	int HAZARD_FACTOR = 21;

	/**
	 * The number of structural features of the '<em>Hazard Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FACTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Hazard Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.HazardCauseImpl <em>Hazard Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.HazardCauseImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardCause()
	 * @generated
	 */
	int HAZARD_CAUSE = 5;

	/**
	 * The feature id for the '<em><b>Hazardcauses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CAUSE__HAZARDCAUSES = HAZARD_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cause Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CAUSE__CAUSE_NAME = HAZARD_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cause Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CAUSE__CAUSE_DESCRIPTION = HAZARD_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hazardcontrols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CAUSE__HAZARDCONTROLS = HAZARD_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hazard Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CAUSE_FEATURE_COUNT = HAZARD_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hazard Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_CAUSE_OPERATION_COUNT = HAZARD_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.HazardEffectImpl <em>Hazard Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.HazardEffectImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardEffect()
	 * @generated
	 */
	int HAZARD_EFFECT = 6;

	/**
	 * The feature id for the '<em><b>Hazardeffects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_EFFECT__HAZARDEFFECTS = HAZARD_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effect Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_EFFECT__EFFECT_DESCRIPTION = HAZARD_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Effect Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_EFFECT__EFFECT_NAME = HAZARD_FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hazardcontrols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_EFFECT__HAZARDCONTROLS = HAZARD_FACTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hazard Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_EFFECT_FEATURE_COUNT = HAZARD_FACTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hazard Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_EFFECT_OPERATION_COUNT = HAZARD_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link careProcess_model.Step <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.Step
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 9;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SUCCESSORS = 0;

	/**
	 * The feature id for the '<em><b>Step Type Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP_TYPE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Hazard Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__HAZARD_INSTANCES = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LOCATION = 5;

	/**
	 * The feature id for the '<em><b>Associated System Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ASSOCIATED_SYSTEM_FUNCTIONS = 6;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__UUID = 7;

	/**
	 * The feature id for the '<em><b>Process Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PROCESS_GRAPH = 8;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__HIDDEN = 9;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.ActivityImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUCCESSORS = STEP__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Step Type Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STEP_TYPE_VALUE = STEP__STEP_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Hazard Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__HAZARD_INSTANCES = STEP__HAZARD_INSTANCES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Associated System Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ASSOCIATED_SYSTEM_FUNCTIONS = STEP__ASSOCIATED_SYSTEM_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__UUID = STEP__UUID;

	/**
	 * The feature id for the '<em><b>Process Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROCESS_GRAPH = STEP__PROCESS_GRAPH;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__HIDDEN = STEP__HIDDEN;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.DecisionImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 8;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__SUCCESSORS = STEP__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Step Type Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__STEP_TYPE_VALUE = STEP__STEP_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DESCRIPTION = STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Hazard Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__HAZARD_INSTANCES = STEP__HAZARD_INSTANCES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Associated System Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ASSOCIATED_SYSTEM_FUNCTIONS = STEP__ASSOCIATED_SYSTEM_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__UUID = STEP__UUID;

	/**
	 * The feature id for the '<em><b>Process Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__PROCESS_GRAPH = STEP__PROCESS_GRAPH;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__HIDDEN = STEP__HIDDEN;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.StartImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getStart()
	 * @generated
	 */
	int START = 10;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__SUCCESSORS = STEP__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Step Type Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__STEP_TYPE_VALUE = STEP__STEP_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__DESCRIPTION = STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Hazard Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__HAZARD_INSTANCES = STEP__HAZARD_INSTANCES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Associated System Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__ASSOCIATED_SYSTEM_FUNCTIONS = STEP__ASSOCIATED_SYSTEM_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__UUID = STEP__UUID;

	/**
	 * The feature id for the '<em><b>Process Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PROCESS_GRAPH = STEP__PROCESS_GRAPH;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__HIDDEN = STEP__HIDDEN;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.StopImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 11;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__SUCCESSORS = STEP__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Step Type Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__STEP_TYPE_VALUE = STEP__STEP_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__DESCRIPTION = STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Hazard Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__HAZARD_INSTANCES = STEP__HAZARD_INSTANCES;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__LOCATION = STEP__LOCATION;

	/**
	 * The feature id for the '<em><b>Associated System Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__ASSOCIATED_SYSTEM_FUNCTIONS = STEP__ASSOCIATED_SYSTEM_FUNCTIONS;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__UUID = STEP__UUID;

	/**
	 * The feature id for the '<em><b>Process Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__PROCESS_GRAPH = STEP__PROCESS_GRAPH;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__HIDDEN = STEP__HIDDEN;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.RepositoryImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 12;

	/**
	 * The feature id for the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__REPOSITORY_NAME = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.HazardRepositoryImpl <em>Hazard Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.HazardRepositoryImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardRepository()
	 * @generated
	 */
	int HAZARD_REPOSITORY = 13;

	/**
	 * The feature id for the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_REPOSITORY__REPOSITORY_NAME = REPOSITORY__REPOSITORY_NAME;

	/**
	 * The feature id for the '<em><b>Hazard Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_REPOSITORY__HAZARD_DEFINITIONS = REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hazard Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_REPOSITORY__HAZARD_INSTANCES = REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hazard Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_REPOSITORY_FEATURE_COUNT = REPOSITORY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hazard Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_REPOSITORY_OPERATION_COUNT = REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.HazardDefinitionImpl <em>Hazard Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.HazardDefinitionImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardDefinition()
	 * @generated
	 */
	int HAZARD_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Hazard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DEFINITION__HAZARD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DEFINITION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Hazard Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DEFINITION__HAZARD_INSTANCES = 2;

	/**
	 * The number of structural features of the '<em>Hazard Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hazard Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.LocationRepositoryImpl <em>Location Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.LocationRepositoryImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getLocationRepository()
	 * @generated
	 */
	int LOCATION_REPOSITORY = 15;

	/**
	 * The feature id for the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REPOSITORY__REPOSITORY_NAME = REPOSITORY__REPOSITORY_NAME;

	/**
	 * The feature id for the '<em><b>Location Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REPOSITORY__LOCATION_DEFINITIONS = REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REPOSITORY_FEATURE_COUNT = REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Location Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REPOSITORY_OPERATION_COUNT = REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.LocationDefinitionImpl <em>Location Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.LocationDefinitionImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getLocationDefinition()
	 * @generated
	 */
	int LOCATION_DEFINITION = 16;

	/**
	 * The feature id for the '<em><b>Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__LOCATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Mnemonic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__MNEMONIC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__STEPS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Location Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Location Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.SystemRepositoryImpl <em>System Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.SystemRepositoryImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getSystemRepository()
	 * @generated
	 */
	int SYSTEM_REPOSITORY = 17;

	/**
	 * The feature id for the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REPOSITORY__REPOSITORY_NAME = REPOSITORY__REPOSITORY_NAME;

	/**
	 * The feature id for the '<em><b>System Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REPOSITORY__SYSTEM_DEFINITIONS = REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REPOSITORY_FEATURE_COUNT = REPOSITORY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REPOSITORY_OPERATION_COUNT = REPOSITORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.SystemDefinitionImpl <em>System Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.SystemDefinitionImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getSystemDefinition()
	 * @generated
	 */
	int SYSTEM_DEFINITION = 18;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION__SYSTEM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Mnemonic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION__MNEMONIC_NAME = 1;

	/**
	 * The feature id for the '<em><b>System Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION__SYSTEM_FUNCTIONS = 2;

	/**
	 * The feature id for the '<em><b>System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION__SYSTEM_VERSION = 3;

	/**
	 * The feature id for the '<em><b>System Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION__SYSTEM_DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>System Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.DataStoreImpl <em>Data Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.DataStoreImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getDataStore()
	 * @generated
	 */
	int DATA_STORE = 19;

	/**
	 * The feature id for the '<em><b>Locationrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__LOCATIONREPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Systemrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__SYSTEMREPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Hazardrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__HAZARDREPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Report Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__REPORT_DATA = 3;

	/**
	 * The number of structural features of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.ProjectImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 20;

	/**
	 * The feature id for the '<em><b>Care Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CARE_PROCESSES = 0;

	/**
	 * The feature id for the '<em><b>Datastore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DATASTORE = 1;

	/**
	 * The feature id for the '<em><b>Date Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DATE_MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Acceptable Hazard Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ACCEPTABLE_HAZARD_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Created With App Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATED_WITH_APP_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Risk Matrix Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RISK_MATRIX_DATA = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.ReportDataImpl <em>Report Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.ReportDataImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getReportData()
	 * @generated
	 */
	int REPORT_DATA = 22;

	/**
	 * The feature id for the '<em><b>Issue Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA__ISSUE_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Report Introduction Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA__REPORT_INTRODUCTION_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Crm System Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA__CRM_SYSTEM_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Summary Safety Statement Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA__SUMMARY_SAFETY_STATEMENT_TEXT = 3;

	/**
	 * The feature id for the '<em><b>Qa And Doc Approval Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA__QA_AND_DOC_APPROVAL_TEXT = 4;

	/**
	 * The feature id for the '<em><b>Configuration Control Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA__CONFIGURATION_CONTROL_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Report Title Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA__REPORT_TITLE_TEXT = 6;

	/**
	 * The number of structural features of the '<em>Report Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Report Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.impl.IssueDefinitionImpl <em>Issue Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.impl.IssueDefinitionImpl
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getIssueDefinition()
	 * @generated
	 */
	int ISSUE_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Issue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_DEFINITION__ISSUE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Issue Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_DEFINITION__ISSUE_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Issue Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Issue Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link careProcess_model.stepType <em>step Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.stepType
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getstepType()
	 * @generated
	 */
	int STEP_TYPE = 24;

	/**
	 * The meta object id for the '{@link careProcess_model.ControlTypeEnum <em>Control Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.ControlTypeEnum
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getControlTypeEnum()
	 * @generated
	 */
	int CONTROL_TYPE_ENUM = 25;

	/**
	 * The meta object id for the '{@link careProcess_model.ControlStateEnum <em>Control State Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see careProcess_model.ControlStateEnum
	 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getControlStateEnum()
	 * @generated
	 */
	int CONTROL_STATE_ENUM = 26;

	/**
	 * Returns the meta object for class '{@link careProcess_model.processGraph <em>process Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>process Graph</em>'.
	 * @see careProcess_model.processGraph
	 * @generated
	 */
	EClass getprocessGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.processGraph#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see careProcess_model.processGraph#getStep()
	 * @see #getprocessGraph()
	 * @generated
	 */
	EReference getprocessGraph_Step();

	/**
	 * Returns the meta object for the container reference '{@link careProcess_model.processGraph#getCareProcess <em>Care Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Care Process</em>'.
	 * @see careProcess_model.processGraph#getCareProcess()
	 * @see #getprocessGraph()
	 * @generated
	 */
	EReference getprocessGraph_CareProcess();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.processGraph#getGraphData <em>Graph Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Data</em>'.
	 * @see careProcess_model.processGraph#getGraphData()
	 * @see #getprocessGraph()
	 * @generated
	 */
	EAttribute getprocessGraph_GraphData();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.processGraph#getDataMap <em>Data Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Map</em>'.
	 * @see careProcess_model.processGraph#getDataMap()
	 * @see #getprocessGraph()
	 * @generated
	 */
	EAttribute getprocessGraph_DataMap();

	/**
	 * Returns the meta object for class '{@link careProcess_model.SystemFunction <em>System Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Function</em>'.
	 * @see careProcess_model.SystemFunction
	 * @generated
	 */
	EClass getSystemFunction();

	/**
	 * Returns the meta object for the reference list '{@link careProcess_model.SystemFunction#getHazardInstances <em>Hazard Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazard Instances</em>'.
	 * @see careProcess_model.SystemFunction#getHazardInstances()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EReference getSystemFunction_HazardInstances();

	/**
	 * Returns the meta object for the container reference '{@link careProcess_model.SystemFunction#getSystemDefinition <em>System Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System Definition</em>'.
	 * @see careProcess_model.SystemFunction#getSystemDefinition()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EReference getSystemFunction_SystemDefinition();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.SystemFunction#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see careProcess_model.SystemFunction#getFunctionName()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EAttribute getSystemFunction_FunctionName();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.SystemFunction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see careProcess_model.SystemFunction#getDescription()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EAttribute getSystemFunction_Description();

	/**
	 * Returns the meta object for the reference list '{@link careProcess_model.SystemFunction#getAssociatedSteps <em>Associated Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated Steps</em>'.
	 * @see careProcess_model.SystemFunction#getAssociatedSteps()
	 * @see #getSystemFunction()
	 * @generated
	 */
	EReference getSystemFunction_AssociatedSteps();

	/**
	 * Returns the meta object for class '{@link careProcess_model.CareProcess <em>Care Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Care Process</em>'.
	 * @see careProcess_model.CareProcess
	 * @generated
	 */
	EClass getCareProcess();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.CareProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see careProcess_model.CareProcess#getName()
	 * @see #getCareProcess()
	 * @generated
	 */
	EAttribute getCareProcess_Name();

	/**
	 * Returns the meta object for the containment reference '{@link careProcess_model.CareProcess#getProcessGraph <em>Process Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Graph</em>'.
	 * @see careProcess_model.CareProcess#getProcessGraph()
	 * @see #getCareProcess()
	 * @generated
	 */
	EReference getCareProcess_ProcessGraph();

	/**
	 * Returns the meta object for the container reference '{@link careProcess_model.CareProcess#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Project</em>'.
	 * @see careProcess_model.CareProcess#getProject()
	 * @see #getCareProcess()
	 * @generated
	 */
	EReference getCareProcess_Project();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.CareProcess#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see careProcess_model.CareProcess#getDescription()
	 * @see #getCareProcess()
	 * @generated
	 */
	EAttribute getCareProcess_Description();

	/**
	 * Returns the meta object for class '{@link careProcess_model.HazardInstance <em>Hazard Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Instance</em>'.
	 * @see careProcess_model.HazardInstance
	 * @generated
	 */
	EClass getHazardInstance();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getInitialLikelihood <em>Initial Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Likelihood</em>'.
	 * @see careProcess_model.HazardInstance#getInitialLikelihood()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_InitialLikelihood();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getInitialSeverity <em>Initial Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Severity</em>'.
	 * @see careProcess_model.HazardInstance#getInitialSeverity()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_InitialSeverity();

	/**
	 * Returns the meta object for the reference '{@link careProcess_model.HazardInstance#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step</em>'.
	 * @see careProcess_model.HazardInstance#getStep()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EReference getHazardInstance_Step();

	/**
	 * Returns the meta object for the reference '{@link careProcess_model.HazardInstance#getHazardDefinition <em>Hazard Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hazard Definition</em>'.
	 * @see careProcess_model.HazardInstance#getHazardDefinition()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EReference getHazardInstance_HazardDefinition();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see careProcess_model.HazardInstance#getStatus()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_Status();

	/**
	 * Returns the meta object for the reference '{@link careProcess_model.HazardInstance#getSystemFunction <em>System Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Function</em>'.
	 * @see careProcess_model.HazardInstance#getSystemFunction()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EReference getHazardInstance_SystemFunction();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getResidualLikelihood <em>Residual Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residual Likelihood</em>'.
	 * @see careProcess_model.HazardInstance#getResidualLikelihood()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_ResidualLikelihood();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getResidualSeverity <em>Residual Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residual Severity</em>'.
	 * @see careProcess_model.HazardInstance#getResidualSeverity()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_ResidualSeverity();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getInitialRiskRating <em>Initial Risk Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Risk Rating</em>'.
	 * @see careProcess_model.HazardInstance#getInitialRiskRating()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_InitialRiskRating();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getResidualRiskRating <em>Residual Risk Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Residual Risk Rating</em>'.
	 * @see careProcess_model.HazardInstance#getResidualRiskRating()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_ResidualRiskRating();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see careProcess_model.HazardInstance#getDescription()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_Description();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see careProcess_model.HazardInstance#getOwner()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_Owner();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see careProcess_model.HazardInstance#getSummary()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_Summary();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.HazardInstance#getHazardcauses <em>Hazardcauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazardcauses</em>'.
	 * @see careProcess_model.HazardInstance#getHazardcauses()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EReference getHazardInstance_Hazardcauses();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.HazardInstance#getHazardeffects <em>Hazardeffects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazardeffects</em>'.
	 * @see careProcess_model.HazardInstance#getHazardeffects()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EReference getHazardInstance_Hazardeffects();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getClinicalJustification <em>Clinical Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinical Justification</em>'.
	 * @see careProcess_model.HazardInstance#getClinicalJustification()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_ClinicalJustification();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see careProcess_model.HazardInstance#getName()
	 * @see #getHazardInstance()
	 * @generated
	 */
	EAttribute getHazardInstance_Name();

	/**
	 * Returns the meta object for class '{@link careProcess_model.HazardControl <em>Hazard Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Control</em>'.
	 * @see careProcess_model.HazardControl
	 * @generated
	 */
	EClass getHazardControl();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardControl#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see careProcess_model.HazardControl#getDescription()
	 * @see #getHazardControl()
	 * @generated
	 */
	EAttribute getHazardControl_Description();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see careProcess_model.HazardControl#getName()
	 * @see #getHazardControl()
	 * @generated
	 */
	EAttribute getHazardControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardControl#getControlState <em>Control State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control State</em>'.
	 * @see careProcess_model.HazardControl#getControlState()
	 * @see #getHazardControl()
	 * @generated
	 */
	EAttribute getHazardControl_ControlState();

	/**
	 * Returns the meta object for the attribute list '{@link careProcess_model.HazardControl#getControlTypes <em>Control Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Control Types</em>'.
	 * @see careProcess_model.HazardControl#getControlTypes()
	 * @see #getHazardControl()
	 * @generated
	 */
	EAttribute getHazardControl_ControlTypes();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardControl#getOtherText <em>Other Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Text</em>'.
	 * @see careProcess_model.HazardControl#getOtherText()
	 * @see #getHazardControl()
	 * @generated
	 */
	EAttribute getHazardControl_OtherText();

	/**
	 * Returns the meta object for the container reference '{@link careProcess_model.HazardControl#getHazardcause <em>Hazardcause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hazardcause</em>'.
	 * @see careProcess_model.HazardControl#getHazardcause()
	 * @see #getHazardControl()
	 * @generated
	 */
	EReference getHazardControl_Hazardcause();

	/**
	 * Returns the meta object for the container reference '{@link careProcess_model.HazardControl#getHazardeffect <em>Hazardeffect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Hazardeffect</em>'.
	 * @see careProcess_model.HazardControl#getHazardeffect()
	 * @see #getHazardControl()
	 * @generated
	 */
	EReference getHazardControl_Hazardeffect();

	/**
	 * Returns the meta object for class '{@link careProcess_model.HazardCause <em>Hazard Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Cause</em>'.
	 * @see careProcess_model.HazardCause
	 * @generated
	 */
	EClass getHazardCause();

	/**
	 * Returns the meta object for the reference list '{@link careProcess_model.HazardCause#getHazardcauses <em>Hazardcauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazardcauses</em>'.
	 * @see careProcess_model.HazardCause#getHazardcauses()
	 * @see #getHazardCause()
	 * @generated
	 */
	EReference getHazardCause_Hazardcauses();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.HazardCause#getHazardcontrols <em>Hazardcontrols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazardcontrols</em>'.
	 * @see careProcess_model.HazardCause#getHazardcontrols()
	 * @see #getHazardCause()
	 * @generated
	 */
	EReference getHazardCause_Hazardcontrols();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardCause#getCauseName <em>Cause Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause Name</em>'.
	 * @see careProcess_model.HazardCause#getCauseName()
	 * @see #getHazardCause()
	 * @generated
	 */
	EAttribute getHazardCause_CauseName();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardCause#getCauseDescription <em>Cause Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause Description</em>'.
	 * @see careProcess_model.HazardCause#getCauseDescription()
	 * @see #getHazardCause()
	 * @generated
	 */
	EAttribute getHazardCause_CauseDescription();

	/**
	 * Returns the meta object for class '{@link careProcess_model.HazardEffect <em>Hazard Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Effect</em>'.
	 * @see careProcess_model.HazardEffect
	 * @generated
	 */
	EClass getHazardEffect();

	/**
	 * Returns the meta object for the reference list '{@link careProcess_model.HazardEffect#getHazardeffects <em>Hazardeffects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazardeffects</em>'.
	 * @see careProcess_model.HazardEffect#getHazardeffects()
	 * @see #getHazardEffect()
	 * @generated
	 */
	EReference getHazardEffect_Hazardeffects();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.HazardEffect#getHazardcontrols <em>Hazardcontrols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazardcontrols</em>'.
	 * @see careProcess_model.HazardEffect#getHazardcontrols()
	 * @see #getHazardEffect()
	 * @generated
	 */
	EReference getHazardEffect_Hazardcontrols();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardEffect#getEffectDescription <em>Effect Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect Description</em>'.
	 * @see careProcess_model.HazardEffect#getEffectDescription()
	 * @see #getHazardEffect()
	 * @generated
	 */
	EAttribute getHazardEffect_EffectDescription();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardEffect#getEffectName <em>Effect Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect Name</em>'.
	 * @see careProcess_model.HazardEffect#getEffectName()
	 * @see #getHazardEffect()
	 * @generated
	 */
	EAttribute getHazardEffect_EffectName();

	/**
	 * Returns the meta object for class '{@link careProcess_model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see careProcess_model.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for class '{@link careProcess_model.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see careProcess_model.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for class '{@link careProcess_model.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see careProcess_model.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference list '{@link careProcess_model.Step#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see careProcess_model.Step#getSuccessors()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Successors();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Step#getStepTypeValue <em>Step Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Type Value</em>'.
	 * @see careProcess_model.Step#getStepTypeValue()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_StepTypeValue();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see careProcess_model.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Step#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see careProcess_model.Step#getDescription()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Description();

	/**
	 * Returns the meta object for the reference list '{@link careProcess_model.Step#getHazardInstances <em>Hazard Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazard Instances</em>'.
	 * @see careProcess_model.Step#getHazardInstances()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_HazardInstances();

	/**
	 * Returns the meta object for the reference '{@link careProcess_model.Step#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see careProcess_model.Step#getLocation()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Location();

	/**
	 * Returns the meta object for the reference list '{@link careProcess_model.Step#getAssociatedSystemFunctions <em>Associated System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated System Functions</em>'.
	 * @see careProcess_model.Step#getAssociatedSystemFunctions()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_AssociatedSystemFunctions();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Step#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see careProcess_model.Step#getUUID()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_UUID();

	/**
	 * Returns the meta object for the container reference '{@link careProcess_model.Step#getProcessGraph <em>Process Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Process Graph</em>'.
	 * @see careProcess_model.Step#getProcessGraph()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ProcessGraph();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Step#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see careProcess_model.Step#isHidden()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Hidden();

	/**
	 * Returns the meta object for class '{@link careProcess_model.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see careProcess_model.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for class '{@link careProcess_model.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see careProcess_model.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link careProcess_model.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see careProcess_model.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Repository#getRepositoryName <em>Repository Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Name</em>'.
	 * @see careProcess_model.Repository#getRepositoryName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_RepositoryName();

	/**
	 * Returns the meta object for class '{@link careProcess_model.HazardRepository <em>Hazard Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Repository</em>'.
	 * @see careProcess_model.HazardRepository
	 * @generated
	 */
	EClass getHazardRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.HazardRepository#getHazardDefinitions <em>Hazard Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard Definitions</em>'.
	 * @see careProcess_model.HazardRepository#getHazardDefinitions()
	 * @see #getHazardRepository()
	 * @generated
	 */
	EReference getHazardRepository_HazardDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.HazardRepository#getHazardInstances <em>Hazard Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard Instances</em>'.
	 * @see careProcess_model.HazardRepository#getHazardInstances()
	 * @see #getHazardRepository()
	 * @generated
	 */
	EReference getHazardRepository_HazardInstances();

	/**
	 * Returns the meta object for class '{@link careProcess_model.HazardDefinition <em>Hazard Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Definition</em>'.
	 * @see careProcess_model.HazardDefinition
	 * @generated
	 */
	EClass getHazardDefinition();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardDefinition#getHazardName <em>Hazard Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hazard Name</em>'.
	 * @see careProcess_model.HazardDefinition#getHazardName()
	 * @see #getHazardDefinition()
	 * @generated
	 */
	EAttribute getHazardDefinition_HazardName();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.HazardDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see careProcess_model.HazardDefinition#getDescription()
	 * @see #getHazardDefinition()
	 * @generated
	 */
	EAttribute getHazardDefinition_Description();

	/**
	 * Returns the meta object for the reference list '{@link careProcess_model.HazardDefinition#getHazardInstances <em>Hazard Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazard Instances</em>'.
	 * @see careProcess_model.HazardDefinition#getHazardInstances()
	 * @see #getHazardDefinition()
	 * @generated
	 */
	EReference getHazardDefinition_HazardInstances();

	/**
	 * Returns the meta object for class '{@link careProcess_model.LocationRepository <em>Location Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Repository</em>'.
	 * @see careProcess_model.LocationRepository
	 * @generated
	 */
	EClass getLocationRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.LocationRepository#getLocationDefinitions <em>Location Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Definitions</em>'.
	 * @see careProcess_model.LocationRepository#getLocationDefinitions()
	 * @see #getLocationRepository()
	 * @generated
	 */
	EReference getLocationRepository_LocationDefinitions();

	/**
	 * Returns the meta object for class '{@link careProcess_model.LocationDefinition <em>Location Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Definition</em>'.
	 * @see careProcess_model.LocationDefinition
	 * @generated
	 */
	EClass getLocationDefinition();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.LocationDefinition#getLocationName <em>Location Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Name</em>'.
	 * @see careProcess_model.LocationDefinition#getLocationName()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EAttribute getLocationDefinition_LocationName();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.LocationDefinition#getMnemonicName <em>Mnemonic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mnemonic Name</em>'.
	 * @see careProcess_model.LocationDefinition#getMnemonicName()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EAttribute getLocationDefinition_MnemonicName();

	/**
	 * Returns the meta object for the reference list '{@link careProcess_model.LocationDefinition#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Steps</em>'.
	 * @see careProcess_model.LocationDefinition#getSteps()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EReference getLocationDefinition_Steps();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.LocationDefinition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see careProcess_model.LocationDefinition#getDescription()
	 * @see #getLocationDefinition()
	 * @generated
	 */
	EAttribute getLocationDefinition_Description();

	/**
	 * Returns the meta object for class '{@link careProcess_model.SystemRepository <em>System Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Repository</em>'.
	 * @see careProcess_model.SystemRepository
	 * @generated
	 */
	EClass getSystemRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.SystemRepository#getSystemDefinitions <em>System Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Definitions</em>'.
	 * @see careProcess_model.SystemRepository#getSystemDefinitions()
	 * @see #getSystemRepository()
	 * @generated
	 */
	EReference getSystemRepository_SystemDefinitions();

	/**
	 * Returns the meta object for class '{@link careProcess_model.SystemDefinition <em>System Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Definition</em>'.
	 * @see careProcess_model.SystemDefinition
	 * @generated
	 */
	EClass getSystemDefinition();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.SystemDefinition#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see careProcess_model.SystemDefinition#getSystemName()
	 * @see #getSystemDefinition()
	 * @generated
	 */
	EAttribute getSystemDefinition_SystemName();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.SystemDefinition#getMnemonicName <em>Mnemonic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mnemonic Name</em>'.
	 * @see careProcess_model.SystemDefinition#getMnemonicName()
	 * @see #getSystemDefinition()
	 * @generated
	 */
	EAttribute getSystemDefinition_MnemonicName();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.SystemDefinition#getSystemFunctions <em>System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Functions</em>'.
	 * @see careProcess_model.SystemDefinition#getSystemFunctions()
	 * @see #getSystemDefinition()
	 * @generated
	 */
	EReference getSystemDefinition_SystemFunctions();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.SystemDefinition#getSystemVersion <em>System Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Version</em>'.
	 * @see careProcess_model.SystemDefinition#getSystemVersion()
	 * @see #getSystemDefinition()
	 * @generated
	 */
	EAttribute getSystemDefinition_SystemVersion();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.SystemDefinition#getSystemDescription <em>System Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Description</em>'.
	 * @see careProcess_model.SystemDefinition#getSystemDescription()
	 * @see #getSystemDefinition()
	 * @generated
	 */
	EAttribute getSystemDefinition_SystemDescription();

	/**
	 * Returns the meta object for class '{@link careProcess_model.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store</em>'.
	 * @see careProcess_model.DataStore
	 * @generated
	 */
	EClass getDataStore();

	/**
	 * Returns the meta object for the containment reference '{@link careProcess_model.DataStore#getLocationrepository <em>Locationrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Locationrepository</em>'.
	 * @see careProcess_model.DataStore#getLocationrepository()
	 * @see #getDataStore()
	 * @generated
	 */
	EReference getDataStore_Locationrepository();

	/**
	 * Returns the meta object for the containment reference '{@link careProcess_model.DataStore#getSystemrepository <em>Systemrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Systemrepository</em>'.
	 * @see careProcess_model.DataStore#getSystemrepository()
	 * @see #getDataStore()
	 * @generated
	 */
	EReference getDataStore_Systemrepository();

	/**
	 * Returns the meta object for the containment reference '{@link careProcess_model.DataStore#getHazardrepository <em>Hazardrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hazardrepository</em>'.
	 * @see careProcess_model.DataStore#getHazardrepository()
	 * @see #getDataStore()
	 * @generated
	 */
	EReference getDataStore_Hazardrepository();

	/**
	 * Returns the meta object for the containment reference '{@link careProcess_model.DataStore#getReportData <em>Report Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report Data</em>'.
	 * @see careProcess_model.DataStore#getReportData()
	 * @see #getDataStore()
	 * @generated
	 */
	EReference getDataStore_ReportData();

	/**
	 * Returns the meta object for class '{@link careProcess_model.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see careProcess_model.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference '{@link careProcess_model.Project#getDatastore <em>Datastore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datastore</em>'.
	 * @see careProcess_model.Project#getDatastore()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Datastore();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Project#getDateModified <em>Date Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Modified</em>'.
	 * @see careProcess_model.Project#getDateModified()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_DateModified();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Project#getAcceptableHazardDefinition <em>Acceptable Hazard Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceptable Hazard Definition</em>'.
	 * @see careProcess_model.Project#getAcceptableHazardDefinition()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AcceptableHazardDefinition();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Project#getCreatedWithAppVersion <em>Created With App Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created With App Version</em>'.
	 * @see careProcess_model.Project#getCreatedWithAppVersion()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CreatedWithAppVersion();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.Project#getRiskMatrixData <em>Risk Matrix Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Matrix Data</em>'.
	 * @see careProcess_model.Project#getRiskMatrixData()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RiskMatrixData();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.Project#getCareProcesses <em>Care Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Care Processes</em>'.
	 * @see careProcess_model.Project#getCareProcesses()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_CareProcesses();

	/**
	 * Returns the meta object for class '{@link careProcess_model.HazardFactor <em>Hazard Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Factor</em>'.
	 * @see careProcess_model.HazardFactor
	 * @generated
	 */
	EClass getHazardFactor();

	/**
	 * Returns the meta object for class '{@link careProcess_model.ReportData <em>Report Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Data</em>'.
	 * @see careProcess_model.ReportData
	 * @generated
	 */
	EClass getReportData();

	/**
	 * Returns the meta object for the containment reference list '{@link careProcess_model.ReportData#getIssueDefinitions <em>Issue Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Definitions</em>'.
	 * @see careProcess_model.ReportData#getIssueDefinitions()
	 * @see #getReportData()
	 * @generated
	 */
	EReference getReportData_IssueDefinitions();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.ReportData#getReportIntroductionText <em>Report Introduction Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report Introduction Text</em>'.
	 * @see careProcess_model.ReportData#getReportIntroductionText()
	 * @see #getReportData()
	 * @generated
	 */
	EAttribute getReportData_ReportIntroductionText();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.ReportData#getCrmSystemText <em>Crm System Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crm System Text</em>'.
	 * @see careProcess_model.ReportData#getCrmSystemText()
	 * @see #getReportData()
	 * @generated
	 */
	EAttribute getReportData_CrmSystemText();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.ReportData#getSummarySafetyStatementText <em>Summary Safety Statement Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary Safety Statement Text</em>'.
	 * @see careProcess_model.ReportData#getSummarySafetyStatementText()
	 * @see #getReportData()
	 * @generated
	 */
	EAttribute getReportData_SummarySafetyStatementText();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.ReportData#getQaAndDocApprovalText <em>Qa And Doc Approval Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qa And Doc Approval Text</em>'.
	 * @see careProcess_model.ReportData#getQaAndDocApprovalText()
	 * @see #getReportData()
	 * @generated
	 */
	EAttribute getReportData_QaAndDocApprovalText();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.ReportData#getConfigurationControlText <em>Configuration Control Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Control Text</em>'.
	 * @see careProcess_model.ReportData#getConfigurationControlText()
	 * @see #getReportData()
	 * @generated
	 */
	EAttribute getReportData_ConfigurationControlText();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.ReportData#getReportTitleText <em>Report Title Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report Title Text</em>'.
	 * @see careProcess_model.ReportData#getReportTitleText()
	 * @see #getReportData()
	 * @generated
	 */
	EAttribute getReportData_ReportTitleText();

	/**
	 * Returns the meta object for class '{@link careProcess_model.IssueDefinition <em>Issue Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Definition</em>'.
	 * @see careProcess_model.IssueDefinition
	 * @generated
	 */
	EClass getIssueDefinition();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.IssueDefinition#getIssueName <em>Issue Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Name</em>'.
	 * @see careProcess_model.IssueDefinition#getIssueName()
	 * @see #getIssueDefinition()
	 * @generated
	 */
	EAttribute getIssueDefinition_IssueName();

	/**
	 * Returns the meta object for the attribute '{@link careProcess_model.IssueDefinition#getIssueDescription <em>Issue Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Description</em>'.
	 * @see careProcess_model.IssueDefinition#getIssueDescription()
	 * @see #getIssueDefinition()
	 * @generated
	 */
	EAttribute getIssueDefinition_IssueDescription();

	/**
	 * Returns the meta object for enum '{@link careProcess_model.stepType <em>step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>step Type</em>'.
	 * @see careProcess_model.stepType
	 * @generated
	 */
	EEnum getstepType();

	/**
	 * Returns the meta object for enum '{@link careProcess_model.ControlTypeEnum <em>Control Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Type Enum</em>'.
	 * @see careProcess_model.ControlTypeEnum
	 * @generated
	 */
	EEnum getControlTypeEnum();

	/**
	 * Returns the meta object for enum '{@link careProcess_model.ControlStateEnum <em>Control State Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control State Enum</em>'.
	 * @see careProcess_model.ControlStateEnum
	 * @generated
	 */
	EEnum getControlStateEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CareProcess_modelFactory getCareProcess_modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link careProcess_model.impl.processGraphImpl <em>process Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.processGraphImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getprocessGraph()
		 * @generated
		 */
		EClass PROCESS_GRAPH = eINSTANCE.getprocessGraph();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_GRAPH__STEP = eINSTANCE.getprocessGraph_Step();

		/**
		 * The meta object literal for the '<em><b>Care Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_GRAPH__CARE_PROCESS = eINSTANCE.getprocessGraph_CareProcess();

		/**
		 * The meta object literal for the '<em><b>Graph Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_GRAPH__GRAPH_DATA = eINSTANCE.getprocessGraph_GraphData();

		/**
		 * The meta object literal for the '<em><b>Data Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_GRAPH__DATA_MAP = eINSTANCE.getprocessGraph_DataMap();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.SystemFunctionImpl <em>System Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.SystemFunctionImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getSystemFunction()
		 * @generated
		 */
		EClass SYSTEM_FUNCTION = eINSTANCE.getSystemFunction();

		/**
		 * The meta object literal for the '<em><b>Hazard Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTION__HAZARD_INSTANCES = eINSTANCE.getSystemFunction_HazardInstances();

		/**
		 * The meta object literal for the '<em><b>System Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTION__SYSTEM_DEFINITION = eINSTANCE.getSystemFunction_SystemDefinition();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_FUNCTION__FUNCTION_NAME = eINSTANCE.getSystemFunction_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_FUNCTION__DESCRIPTION = eINSTANCE.getSystemFunction_Description();

		/**
		 * The meta object literal for the '<em><b>Associated Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTION__ASSOCIATED_STEPS = eINSTANCE.getSystemFunction_AssociatedSteps();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.CareProcessImpl <em>Care Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.CareProcessImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getCareProcess()
		 * @generated
		 */
		EClass CARE_PROCESS = eINSTANCE.getCareProcess();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARE_PROCESS__NAME = eINSTANCE.getCareProcess_Name();

		/**
		 * The meta object literal for the '<em><b>Process Graph</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARE_PROCESS__PROCESS_GRAPH = eINSTANCE.getCareProcess_ProcessGraph();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARE_PROCESS__PROJECT = eINSTANCE.getCareProcess_Project();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARE_PROCESS__DESCRIPTION = eINSTANCE.getCareProcess_Description();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.HazardInstanceImpl <em>Hazard Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.HazardInstanceImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardInstance()
		 * @generated
		 */
		EClass HAZARD_INSTANCE = eINSTANCE.getHazardInstance();

		/**
		 * The meta object literal for the '<em><b>Initial Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__INITIAL_LIKELIHOOD = eINSTANCE.getHazardInstance_InitialLikelihood();

		/**
		 * The meta object literal for the '<em><b>Initial Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__INITIAL_SEVERITY = eINSTANCE.getHazardInstance_InitialSeverity();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_INSTANCE__STEP = eINSTANCE.getHazardInstance_Step();

		/**
		 * The meta object literal for the '<em><b>Hazard Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_INSTANCE__HAZARD_DEFINITION = eINSTANCE.getHazardInstance_HazardDefinition();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__STATUS = eINSTANCE.getHazardInstance_Status();

		/**
		 * The meta object literal for the '<em><b>System Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_INSTANCE__SYSTEM_FUNCTION = eINSTANCE.getHazardInstance_SystemFunction();

		/**
		 * The meta object literal for the '<em><b>Residual Likelihood</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__RESIDUAL_LIKELIHOOD = eINSTANCE.getHazardInstance_ResidualLikelihood();

		/**
		 * The meta object literal for the '<em><b>Residual Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__RESIDUAL_SEVERITY = eINSTANCE.getHazardInstance_ResidualSeverity();

		/**
		 * The meta object literal for the '<em><b>Initial Risk Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__INITIAL_RISK_RATING = eINSTANCE.getHazardInstance_InitialRiskRating();

		/**
		 * The meta object literal for the '<em><b>Residual Risk Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__RESIDUAL_RISK_RATING = eINSTANCE.getHazardInstance_ResidualRiskRating();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__DESCRIPTION = eINSTANCE.getHazardInstance_Description();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__OWNER = eINSTANCE.getHazardInstance_Owner();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__SUMMARY = eINSTANCE.getHazardInstance_Summary();

		/**
		 * The meta object literal for the '<em><b>Hazardcauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_INSTANCE__HAZARDCAUSES = eINSTANCE.getHazardInstance_Hazardcauses();

		/**
		 * The meta object literal for the '<em><b>Hazardeffects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_INSTANCE__HAZARDEFFECTS = eINSTANCE.getHazardInstance_Hazardeffects();

		/**
		 * The meta object literal for the '<em><b>Clinical Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__CLINICAL_JUSTIFICATION = eINSTANCE.getHazardInstance_ClinicalJustification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_INSTANCE__NAME = eINSTANCE.getHazardInstance_Name();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.HazardControlImpl <em>Hazard Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.HazardControlImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardControl()
		 * @generated
		 */
		EClass HAZARD_CONTROL = eINSTANCE.getHazardControl();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CONTROL__DESCRIPTION = eINSTANCE.getHazardControl_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CONTROL__NAME = eINSTANCE.getHazardControl_Name();

		/**
		 * The meta object literal for the '<em><b>Control State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CONTROL__CONTROL_STATE = eINSTANCE.getHazardControl_ControlState();

		/**
		 * The meta object literal for the '<em><b>Control Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CONTROL__CONTROL_TYPES = eINSTANCE.getHazardControl_ControlTypes();

		/**
		 * The meta object literal for the '<em><b>Other Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CONTROL__OTHER_TEXT = eINSTANCE.getHazardControl_OtherText();

		/**
		 * The meta object literal for the '<em><b>Hazardcause</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_CONTROL__HAZARDCAUSE = eINSTANCE.getHazardControl_Hazardcause();

		/**
		 * The meta object literal for the '<em><b>Hazardeffect</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_CONTROL__HAZARDEFFECT = eINSTANCE.getHazardControl_Hazardeffect();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.HazardCauseImpl <em>Hazard Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.HazardCauseImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardCause()
		 * @generated
		 */
		EClass HAZARD_CAUSE = eINSTANCE.getHazardCause();

		/**
		 * The meta object literal for the '<em><b>Hazardcauses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_CAUSE__HAZARDCAUSES = eINSTANCE.getHazardCause_Hazardcauses();

		/**
		 * The meta object literal for the '<em><b>Hazardcontrols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_CAUSE__HAZARDCONTROLS = eINSTANCE.getHazardCause_Hazardcontrols();

		/**
		 * The meta object literal for the '<em><b>Cause Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CAUSE__CAUSE_NAME = eINSTANCE.getHazardCause_CauseName();

		/**
		 * The meta object literal for the '<em><b>Cause Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_CAUSE__CAUSE_DESCRIPTION = eINSTANCE.getHazardCause_CauseDescription();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.HazardEffectImpl <em>Hazard Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.HazardEffectImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardEffect()
		 * @generated
		 */
		EClass HAZARD_EFFECT = eINSTANCE.getHazardEffect();

		/**
		 * The meta object literal for the '<em><b>Hazardeffects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_EFFECT__HAZARDEFFECTS = eINSTANCE.getHazardEffect_Hazardeffects();

		/**
		 * The meta object literal for the '<em><b>Hazardcontrols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_EFFECT__HAZARDCONTROLS = eINSTANCE.getHazardEffect_Hazardcontrols();

		/**
		 * The meta object literal for the '<em><b>Effect Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_EFFECT__EFFECT_DESCRIPTION = eINSTANCE.getHazardEffect_EffectDescription();

		/**
		 * The meta object literal for the '<em><b>Effect Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_EFFECT__EFFECT_NAME = eINSTANCE.getHazardEffect_EffectName();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.ActivityImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.DecisionImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '{@link careProcess_model.Step <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.Step
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__SUCCESSORS = eINSTANCE.getStep_Successors();

		/**
		 * The meta object literal for the '<em><b>Step Type Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__STEP_TYPE_VALUE = eINSTANCE.getStep_StepTypeValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__DESCRIPTION = eINSTANCE.getStep_Description();

		/**
		 * The meta object literal for the '<em><b>Hazard Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__HAZARD_INSTANCES = eINSTANCE.getStep_HazardInstances();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__LOCATION = eINSTANCE.getStep_Location();

		/**
		 * The meta object literal for the '<em><b>Associated System Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ASSOCIATED_SYSTEM_FUNCTIONS = eINSTANCE.getStep_AssociatedSystemFunctions();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__UUID = eINSTANCE.getStep_UUID();

		/**
		 * The meta object literal for the '<em><b>Process Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PROCESS_GRAPH = eINSTANCE.getStep_ProcessGraph();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__HIDDEN = eINSTANCE.getStep_Hidden();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.StartImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.StopImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.RepositoryImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Repository Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__REPOSITORY_NAME = eINSTANCE.getRepository_RepositoryName();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.HazardRepositoryImpl <em>Hazard Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.HazardRepositoryImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardRepository()
		 * @generated
		 */
		EClass HAZARD_REPOSITORY = eINSTANCE.getHazardRepository();

		/**
		 * The meta object literal for the '<em><b>Hazard Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_REPOSITORY__HAZARD_DEFINITIONS = eINSTANCE.getHazardRepository_HazardDefinitions();

		/**
		 * The meta object literal for the '<em><b>Hazard Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_REPOSITORY__HAZARD_INSTANCES = eINSTANCE.getHazardRepository_HazardInstances();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.HazardDefinitionImpl <em>Hazard Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.HazardDefinitionImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardDefinition()
		 * @generated
		 */
		EClass HAZARD_DEFINITION = eINSTANCE.getHazardDefinition();

		/**
		 * The meta object literal for the '<em><b>Hazard Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_DEFINITION__HAZARD_NAME = eINSTANCE.getHazardDefinition_HazardName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_DEFINITION__DESCRIPTION = eINSTANCE.getHazardDefinition_Description();

		/**
		 * The meta object literal for the '<em><b>Hazard Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_DEFINITION__HAZARD_INSTANCES = eINSTANCE.getHazardDefinition_HazardInstances();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.LocationRepositoryImpl <em>Location Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.LocationRepositoryImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getLocationRepository()
		 * @generated
		 */
		EClass LOCATION_REPOSITORY = eINSTANCE.getLocationRepository();

		/**
		 * The meta object literal for the '<em><b>Location Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_REPOSITORY__LOCATION_DEFINITIONS = eINSTANCE.getLocationRepository_LocationDefinitions();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.LocationDefinitionImpl <em>Location Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.LocationDefinitionImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getLocationDefinition()
		 * @generated
		 */
		EClass LOCATION_DEFINITION = eINSTANCE.getLocationDefinition();

		/**
		 * The meta object literal for the '<em><b>Location Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_DEFINITION__LOCATION_NAME = eINSTANCE.getLocationDefinition_LocationName();

		/**
		 * The meta object literal for the '<em><b>Mnemonic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_DEFINITION__MNEMONIC_NAME = eINSTANCE.getLocationDefinition_MnemonicName();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_DEFINITION__STEPS = eINSTANCE.getLocationDefinition_Steps();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_DEFINITION__DESCRIPTION = eINSTANCE.getLocationDefinition_Description();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.SystemRepositoryImpl <em>System Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.SystemRepositoryImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getSystemRepository()
		 * @generated
		 */
		EClass SYSTEM_REPOSITORY = eINSTANCE.getSystemRepository();

		/**
		 * The meta object literal for the '<em><b>System Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_REPOSITORY__SYSTEM_DEFINITIONS = eINSTANCE.getSystemRepository_SystemDefinitions();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.SystemDefinitionImpl <em>System Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.SystemDefinitionImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getSystemDefinition()
		 * @generated
		 */
		EClass SYSTEM_DEFINITION = eINSTANCE.getSystemDefinition();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DEFINITION__SYSTEM_NAME = eINSTANCE.getSystemDefinition_SystemName();

		/**
		 * The meta object literal for the '<em><b>Mnemonic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DEFINITION__MNEMONIC_NAME = eINSTANCE.getSystemDefinition_MnemonicName();

		/**
		 * The meta object literal for the '<em><b>System Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DEFINITION__SYSTEM_FUNCTIONS = eINSTANCE.getSystemDefinition_SystemFunctions();

		/**
		 * The meta object literal for the '<em><b>System Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DEFINITION__SYSTEM_VERSION = eINSTANCE.getSystemDefinition_SystemVersion();

		/**
		 * The meta object literal for the '<em><b>System Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DEFINITION__SYSTEM_DESCRIPTION = eINSTANCE.getSystemDefinition_SystemDescription();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.DataStoreImpl <em>Data Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.DataStoreImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getDataStore()
		 * @generated
		 */
		EClass DATA_STORE = eINSTANCE.getDataStore();

		/**
		 * The meta object literal for the '<em><b>Locationrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STORE__LOCATIONREPOSITORY = eINSTANCE.getDataStore_Locationrepository();

		/**
		 * The meta object literal for the '<em><b>Systemrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STORE__SYSTEMREPOSITORY = eINSTANCE.getDataStore_Systemrepository();

		/**
		 * The meta object literal for the '<em><b>Hazardrepository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STORE__HAZARDREPOSITORY = eINSTANCE.getDataStore_Hazardrepository();

		/**
		 * The meta object literal for the '<em><b>Report Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_STORE__REPORT_DATA = eINSTANCE.getDataStore_ReportData();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.ProjectImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Datastore</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__DATASTORE = eINSTANCE.getProject_Datastore();

		/**
		 * The meta object literal for the '<em><b>Date Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DATE_MODIFIED = eINSTANCE.getProject_DateModified();

		/**
		 * The meta object literal for the '<em><b>Acceptable Hazard Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ACCEPTABLE_HAZARD_DEFINITION = eINSTANCE.getProject_AcceptableHazardDefinition();

		/**
		 * The meta object literal for the '<em><b>Created With App Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CREATED_WITH_APP_VERSION = eINSTANCE.getProject_CreatedWithAppVersion();

		/**
		 * The meta object literal for the '<em><b>Risk Matrix Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__RISK_MATRIX_DATA = eINSTANCE.getProject_RiskMatrixData();

		/**
		 * The meta object literal for the '<em><b>Care Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CARE_PROCESSES = eINSTANCE.getProject_CareProcesses();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.HazardFactorImpl <em>Hazard Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.HazardFactorImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getHazardFactor()
		 * @generated
		 */
		EClass HAZARD_FACTOR = eINSTANCE.getHazardFactor();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.ReportDataImpl <em>Report Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.ReportDataImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getReportData()
		 * @generated
		 */
		EClass REPORT_DATA = eINSTANCE.getReportData();

		/**
		 * The meta object literal for the '<em><b>Issue Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_DATA__ISSUE_DEFINITIONS = eINSTANCE.getReportData_IssueDefinitions();

		/**
		 * The meta object literal for the '<em><b>Report Introduction Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_DATA__REPORT_INTRODUCTION_TEXT = eINSTANCE.getReportData_ReportIntroductionText();

		/**
		 * The meta object literal for the '<em><b>Crm System Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_DATA__CRM_SYSTEM_TEXT = eINSTANCE.getReportData_CrmSystemText();

		/**
		 * The meta object literal for the '<em><b>Summary Safety Statement Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_DATA__SUMMARY_SAFETY_STATEMENT_TEXT = eINSTANCE.getReportData_SummarySafetyStatementText();

		/**
		 * The meta object literal for the '<em><b>Qa And Doc Approval Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_DATA__QA_AND_DOC_APPROVAL_TEXT = eINSTANCE.getReportData_QaAndDocApprovalText();

		/**
		 * The meta object literal for the '<em><b>Configuration Control Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_DATA__CONFIGURATION_CONTROL_TEXT = eINSTANCE.getReportData_ConfigurationControlText();

		/**
		 * The meta object literal for the '<em><b>Report Title Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_DATA__REPORT_TITLE_TEXT = eINSTANCE.getReportData_ReportTitleText();

		/**
		 * The meta object literal for the '{@link careProcess_model.impl.IssueDefinitionImpl <em>Issue Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.impl.IssueDefinitionImpl
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getIssueDefinition()
		 * @generated
		 */
		EClass ISSUE_DEFINITION = eINSTANCE.getIssueDefinition();

		/**
		 * The meta object literal for the '<em><b>Issue Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_DEFINITION__ISSUE_NAME = eINSTANCE.getIssueDefinition_IssueName();

		/**
		 * The meta object literal for the '<em><b>Issue Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_DEFINITION__ISSUE_DESCRIPTION = eINSTANCE.getIssueDefinition_IssueDescription();

		/**
		 * The meta object literal for the '{@link careProcess_model.stepType <em>step Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.stepType
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getstepType()
		 * @generated
		 */
		EEnum STEP_TYPE = eINSTANCE.getstepType();

		/**
		 * The meta object literal for the '{@link careProcess_model.ControlTypeEnum <em>Control Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.ControlTypeEnum
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getControlTypeEnum()
		 * @generated
		 */
		EEnum CONTROL_TYPE_ENUM = eINSTANCE.getControlTypeEnum();

		/**
		 * The meta object literal for the '{@link careProcess_model.ControlStateEnum <em>Control State Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see careProcess_model.ControlStateEnum
		 * @see careProcess_model.impl.CareProcess_modelPackageImpl#getControlStateEnum()
		 * @generated
		 */
		EEnum CONTROL_STATE_ENUM = eINSTANCE.getControlStateEnum();

	}

} //CareProcess_modelPackage
