/**
 */
package careProcess_model.impl;

import careProcess_model.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CareProcess_modelFactoryImpl extends EFactoryImpl implements CareProcess_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CareProcess_modelFactory init() {
		try {
			CareProcess_modelFactory theCareProcess_modelFactory = (CareProcess_modelFactory)EPackage.Registry.INSTANCE.getEFactory(CareProcess_modelPackage.eNS_URI);
			if (theCareProcess_modelFactory != null) {
				return theCareProcess_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CareProcess_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareProcess_modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CareProcess_modelPackage.PROCESS_GRAPH: return createprocessGraph();
			case CareProcess_modelPackage.SYSTEM_FUNCTION: return createSystemFunction();
			case CareProcess_modelPackage.CARE_PROCESS: return createCareProcess();
			case CareProcess_modelPackage.HAZARD_INSTANCE: return createHazardInstance();
			case CareProcess_modelPackage.HAZARD_CONTROL: return createHazardControl();
			case CareProcess_modelPackage.HAZARD_CAUSE: return createHazardCause();
			case CareProcess_modelPackage.HAZARD_EFFECT: return createHazardEffect();
			case CareProcess_modelPackage.ACTIVITY: return createActivity();
			case CareProcess_modelPackage.DECISION: return createDecision();
			case CareProcess_modelPackage.START: return createStart();
			case CareProcess_modelPackage.STOP: return createStop();
			case CareProcess_modelPackage.HAZARD_REPOSITORY: return createHazardRepository();
			case CareProcess_modelPackage.HAZARD_DEFINITION: return createHazardDefinition();
			case CareProcess_modelPackage.LOCATION_REPOSITORY: return createLocationRepository();
			case CareProcess_modelPackage.LOCATION_DEFINITION: return createLocationDefinition();
			case CareProcess_modelPackage.SYSTEM_REPOSITORY: return createSystemRepository();
			case CareProcess_modelPackage.SYSTEM_DEFINITION: return createSystemDefinition();
			case CareProcess_modelPackage.DATA_STORE: return createDataStore();
			case CareProcess_modelPackage.PROJECT: return createProject();
			case CareProcess_modelPackage.REPORT_DATA: return createReportData();
			case CareProcess_modelPackage.ISSUE_DEFINITION: return createIssueDefinition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CareProcess_modelPackage.STEP_TYPE:
				return createstepTypeFromString(eDataType, initialValue);
			case CareProcess_modelPackage.CONTROL_TYPE_ENUM:
				return createControlTypeEnumFromString(eDataType, initialValue);
			case CareProcess_modelPackage.CONTROL_STATE_ENUM:
				return createControlStateEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CareProcess_modelPackage.STEP_TYPE:
				return convertstepTypeToString(eDataType, instanceValue);
			case CareProcess_modelPackage.CONTROL_TYPE_ENUM:
				return convertControlTypeEnumToString(eDataType, instanceValue);
			case CareProcess_modelPackage.CONTROL_STATE_ENUM:
				return convertControlStateEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processGraph createprocessGraph() {
		processGraphImpl processGraph = new processGraphImpl();
		return processGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunction createSystemFunction() {
		SystemFunctionImpl systemFunction = new SystemFunctionImpl();
		return systemFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareProcess createCareProcess() {
		CareProcessImpl careProcess = new CareProcessImpl();
		return careProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardInstance createHazardInstance() {
		HazardInstanceImpl hazardInstance = new HazardInstanceImpl();
		return hazardInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardControl createHazardControl() {
		HazardControlImpl hazardControl = new HazardControlImpl();
		return hazardControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardCause createHazardCause() {
		HazardCauseImpl hazardCause = new HazardCauseImpl();
		return hazardCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardEffect createHazardEffect() {
		HazardEffectImpl hazardEffect = new HazardEffectImpl();
		return hazardEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardRepository createHazardRepository() {
		HazardRepositoryImpl hazardRepository = new HazardRepositoryImpl();
		return hazardRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardDefinition createHazardDefinition() {
		HazardDefinitionImpl hazardDefinition = new HazardDefinitionImpl();
		return hazardDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationRepository createLocationRepository() {
		LocationRepositoryImpl locationRepository = new LocationRepositoryImpl();
		return locationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDefinition createLocationDefinition() {
		LocationDefinitionImpl locationDefinition = new LocationDefinitionImpl();
		return locationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRepository createSystemRepository() {
		SystemRepositoryImpl systemRepository = new SystemRepositoryImpl();
		return systemRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDefinition createSystemDefinition() {
		SystemDefinitionImpl systemDefinition = new SystemDefinitionImpl();
		return systemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStore createDataStore() {
		DataStoreImpl dataStore = new DataStoreImpl();
		return dataStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportData createReportData() {
		ReportDataImpl reportData = new ReportDataImpl();
		return reportData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueDefinition createIssueDefinition() {
		IssueDefinitionImpl issueDefinition = new IssueDefinitionImpl();
		return issueDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stepType createstepTypeFromString(EDataType eDataType, String initialValue) {
		stepType result = stepType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertstepTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlTypeEnum createControlTypeEnumFromString(EDataType eDataType, String initialValue) {
		ControlTypeEnum result = ControlTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlStateEnum createControlStateEnumFromString(EDataType eDataType, String initialValue) {
		ControlStateEnum result = ControlStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareProcess_modelPackage getCareProcess_modelPackage() {
		return (CareProcess_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CareProcess_modelPackage getPackage() {
		return CareProcess_modelPackage.eINSTANCE;
	}

} //CareProcess_modelFactoryImpl
