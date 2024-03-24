/**
 */
package careProcess_model.impl;

import careProcess_model.Activity;
import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelFactory;
import careProcess_model.CareProcess_modelPackage;
import careProcess_model.ControlStateEnum;
import careProcess_model.ControlTypeEnum;
import careProcess_model.DataStore;
import careProcess_model.Decision;
import careProcess_model.HazardCause;
import careProcess_model.HazardControl;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardEffect;
import careProcess_model.HazardFactor;
import careProcess_model.HazardInstance;
import careProcess_model.HazardRepository;
import careProcess_model.IssueDefinition;
import careProcess_model.LocationDefinition;
import careProcess_model.LocationRepository;
import careProcess_model.Project;
import careProcess_model.ReportData;
import careProcess_model.Repository;
import careProcess_model.Start;
import careProcess_model.Step;
import careProcess_model.Stop;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import careProcess_model.SystemRepository;
import careProcess_model.processGraph;
import careProcess_model.stepType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CareProcess_modelPackageImpl extends EPackageImpl implements CareProcess_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass careProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardCauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlStateEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see careProcess_model.CareProcess_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CareProcess_modelPackageImpl() {
		super(eNS_URI, CareProcess_modelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CareProcess_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CareProcess_modelPackage init() {
		if (isInited) return (CareProcess_modelPackage)EPackage.Registry.INSTANCE.getEPackage(CareProcess_modelPackage.eNS_URI);

		// Obtain or create and register package
		CareProcess_modelPackageImpl theCareProcess_modelPackage = (CareProcess_modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CareProcess_modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CareProcess_modelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCareProcess_modelPackage.createPackageContents();

		// Initialize created meta-data
		theCareProcess_modelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCareProcess_modelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CareProcess_modelPackage.eNS_URI, theCareProcess_modelPackage);
		return theCareProcess_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getprocessGraph() {
		return processGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprocessGraph_Step() {
		return (EReference)processGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getprocessGraph_CareProcess() {
		return (EReference)processGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprocessGraph_GraphData() {
		return (EAttribute)processGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprocessGraph_DataMap() {
		return (EAttribute)processGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemFunction() {
		return systemFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_HazardInstances() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_SystemDefinition() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemFunction_FunctionName() {
		return (EAttribute)systemFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemFunction_Description() {
		return (EAttribute)systemFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_AssociatedSteps() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCareProcess() {
		return careProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCareProcess_Name() {
		return (EAttribute)careProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareProcess_ProcessGraph() {
		return (EReference)careProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCareProcess_Project() {
		return (EReference)careProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCareProcess_Description() {
		return (EAttribute)careProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardInstance() {
		return hazardInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_InitialLikelihood() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_InitialSeverity() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardInstance_Step() {
		return (EReference)hazardInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardInstance_HazardDefinition() {
		return (EReference)hazardInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_Status() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardInstance_SystemFunction() {
		return (EReference)hazardInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_ResidualLikelihood() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_ResidualSeverity() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_InitialRiskRating() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_ResidualRiskRating() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_Description() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_Owner() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_Summary() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardInstance_Hazardcauses() {
		return (EReference)hazardInstanceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardInstance_Hazardeffects() {
		return (EReference)hazardInstanceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_ClinicalJustification() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardInstance_Name() {
		return (EAttribute)hazardInstanceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardControl() {
		return hazardControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardControl_Description() {
		return (EAttribute)hazardControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardControl_Name() {
		return (EAttribute)hazardControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardControl_ControlState() {
		return (EAttribute)hazardControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardControl_ControlTypes() {
		return (EAttribute)hazardControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardControl_OtherText() {
		return (EAttribute)hazardControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardControl_Hazardcause() {
		return (EReference)hazardControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardControl_Hazardeffect() {
		return (EReference)hazardControlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardCause() {
		return hazardCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardCause_Hazardcauses() {
		return (EReference)hazardCauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardCause_Hazardcontrols() {
		return (EReference)hazardCauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardCause_CauseName() {
		return (EAttribute)hazardCauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardCause_CauseDescription() {
		return (EAttribute)hazardCauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardEffect() {
		return hazardEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardEffect_Hazardeffects() {
		return (EReference)hazardEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardEffect_Hazardcontrols() {
		return (EReference)hazardEffectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardEffect_EffectDescription() {
		return (EAttribute)hazardEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardEffect_EffectName() {
		return (EAttribute)hazardEffectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Successors() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_StepTypeValue() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Name() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Description() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_HazardInstances() {
		return (EReference)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Location() {
		return (EReference)stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_AssociatedSystemFunctions() {
		return (EReference)stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_UUID() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_ProcessGraph() {
		return (EReference)stepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Hidden() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_RepositoryName() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardRepository() {
		return hazardRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardRepository_HazardDefinitions() {
		return (EReference)hazardRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardRepository_HazardInstances() {
		return (EReference)hazardRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardDefinition() {
		return hazardDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardDefinition_HazardName() {
		return (EAttribute)hazardDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazardDefinition_Description() {
		return (EAttribute)hazardDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazardDefinition_HazardInstances() {
		return (EReference)hazardDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationRepository() {
		return locationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationRepository_LocationDefinitions() {
		return (EReference)locationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationDefinition() {
		return locationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationDefinition_LocationName() {
		return (EAttribute)locationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationDefinition_MnemonicName() {
		return (EAttribute)locationDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationDefinition_Steps() {
		return (EReference)locationDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationDefinition_Description() {
		return (EAttribute)locationDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRepository() {
		return systemRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemRepository_SystemDefinitions() {
		return (EReference)systemRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemDefinition() {
		return systemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemDefinition_SystemName() {
		return (EAttribute)systemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemDefinition_MnemonicName() {
		return (EAttribute)systemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemDefinition_SystemFunctions() {
		return (EReference)systemDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemDefinition_SystemVersion() {
		return (EAttribute)systemDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemDefinition_SystemDescription() {
		return (EAttribute)systemDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStore() {
		return dataStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStore_Locationrepository() {
		return (EReference)dataStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStore_Systemrepository() {
		return (EReference)dataStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStore_Hazardrepository() {
		return (EReference)dataStoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStore_ReportData() {
		return (EReference)dataStoreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Datastore() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_DateModified() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_AcceptableHazardDefinition() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_CreatedWithAppVersion() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_RiskMatrixData() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_CareProcesses() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazardFactor() {
		return hazardFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportData() {
		return reportDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportData_IssueDefinitions() {
		return (EReference)reportDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportData_ReportIntroductionText() {
		return (EAttribute)reportDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportData_CrmSystemText() {
		return (EAttribute)reportDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportData_SummarySafetyStatementText() {
		return (EAttribute)reportDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportData_QaAndDocApprovalText() {
		return (EAttribute)reportDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportData_ConfigurationControlText() {
		return (EAttribute)reportDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportData_ReportTitleText() {
		return (EAttribute)reportDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssueDefinition() {
		return issueDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueDefinition_IssueName() {
		return (EAttribute)issueDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueDefinition_IssueDescription() {
		return (EAttribute)issueDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getstepType() {
		return stepTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlTypeEnum() {
		return controlTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlStateEnum() {
		return controlStateEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareProcess_modelFactory getCareProcess_modelFactory() {
		return (CareProcess_modelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		processGraphEClass = createEClass(PROCESS_GRAPH);
		createEReference(processGraphEClass, PROCESS_GRAPH__CARE_PROCESS);
		createEAttribute(processGraphEClass, PROCESS_GRAPH__GRAPH_DATA);
		createEAttribute(processGraphEClass, PROCESS_GRAPH__DATA_MAP);
		createEReference(processGraphEClass, PROCESS_GRAPH__STEP);

		systemFunctionEClass = createEClass(SYSTEM_FUNCTION);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__HAZARD_INSTANCES);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__SYSTEM_DEFINITION);
		createEAttribute(systemFunctionEClass, SYSTEM_FUNCTION__FUNCTION_NAME);
		createEAttribute(systemFunctionEClass, SYSTEM_FUNCTION__DESCRIPTION);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__ASSOCIATED_STEPS);

		careProcessEClass = createEClass(CARE_PROCESS);
		createEAttribute(careProcessEClass, CARE_PROCESS__NAME);
		createEReference(careProcessEClass, CARE_PROCESS__PROCESS_GRAPH);
		createEReference(careProcessEClass, CARE_PROCESS__PROJECT);
		createEAttribute(careProcessEClass, CARE_PROCESS__DESCRIPTION);

		hazardInstanceEClass = createEClass(HAZARD_INSTANCE);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__INITIAL_LIKELIHOOD);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__INITIAL_SEVERITY);
		createEReference(hazardInstanceEClass, HAZARD_INSTANCE__STEP);
		createEReference(hazardInstanceEClass, HAZARD_INSTANCE__HAZARD_DEFINITION);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__STATUS);
		createEReference(hazardInstanceEClass, HAZARD_INSTANCE__SYSTEM_FUNCTION);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__RESIDUAL_LIKELIHOOD);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__RESIDUAL_SEVERITY);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__INITIAL_RISK_RATING);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__RESIDUAL_RISK_RATING);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__DESCRIPTION);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__OWNER);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__SUMMARY);
		createEReference(hazardInstanceEClass, HAZARD_INSTANCE__HAZARDCAUSES);
		createEReference(hazardInstanceEClass, HAZARD_INSTANCE__HAZARDEFFECTS);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__CLINICAL_JUSTIFICATION);
		createEAttribute(hazardInstanceEClass, HAZARD_INSTANCE__NAME);

		hazardControlEClass = createEClass(HAZARD_CONTROL);
		createEAttribute(hazardControlEClass, HAZARD_CONTROL__DESCRIPTION);
		createEAttribute(hazardControlEClass, HAZARD_CONTROL__NAME);
		createEAttribute(hazardControlEClass, HAZARD_CONTROL__CONTROL_STATE);
		createEAttribute(hazardControlEClass, HAZARD_CONTROL__CONTROL_TYPES);
		createEAttribute(hazardControlEClass, HAZARD_CONTROL__OTHER_TEXT);
		createEReference(hazardControlEClass, HAZARD_CONTROL__HAZARDCAUSE);
		createEReference(hazardControlEClass, HAZARD_CONTROL__HAZARDEFFECT);

		hazardCauseEClass = createEClass(HAZARD_CAUSE);
		createEReference(hazardCauseEClass, HAZARD_CAUSE__HAZARDCAUSES);
		createEAttribute(hazardCauseEClass, HAZARD_CAUSE__CAUSE_NAME);
		createEAttribute(hazardCauseEClass, HAZARD_CAUSE__CAUSE_DESCRIPTION);
		createEReference(hazardCauseEClass, HAZARD_CAUSE__HAZARDCONTROLS);

		hazardEffectEClass = createEClass(HAZARD_EFFECT);
		createEReference(hazardEffectEClass, HAZARD_EFFECT__HAZARDEFFECTS);
		createEAttribute(hazardEffectEClass, HAZARD_EFFECT__EFFECT_DESCRIPTION);
		createEAttribute(hazardEffectEClass, HAZARD_EFFECT__EFFECT_NAME);
		createEReference(hazardEffectEClass, HAZARD_EFFECT__HAZARDCONTROLS);

		activityEClass = createEClass(ACTIVITY);

		decisionEClass = createEClass(DECISION);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__SUCCESSORS);
		createEAttribute(stepEClass, STEP__STEP_TYPE_VALUE);
		createEAttribute(stepEClass, STEP__NAME);
		createEAttribute(stepEClass, STEP__DESCRIPTION);
		createEReference(stepEClass, STEP__HAZARD_INSTANCES);
		createEReference(stepEClass, STEP__LOCATION);
		createEReference(stepEClass, STEP__ASSOCIATED_SYSTEM_FUNCTIONS);
		createEAttribute(stepEClass, STEP__UUID);
		createEReference(stepEClass, STEP__PROCESS_GRAPH);
		createEAttribute(stepEClass, STEP__HIDDEN);

		startEClass = createEClass(START);

		stopEClass = createEClass(STOP);

		repositoryEClass = createEClass(REPOSITORY);
		createEAttribute(repositoryEClass, REPOSITORY__REPOSITORY_NAME);

		hazardRepositoryEClass = createEClass(HAZARD_REPOSITORY);
		createEReference(hazardRepositoryEClass, HAZARD_REPOSITORY__HAZARD_DEFINITIONS);
		createEReference(hazardRepositoryEClass, HAZARD_REPOSITORY__HAZARD_INSTANCES);

		hazardDefinitionEClass = createEClass(HAZARD_DEFINITION);
		createEAttribute(hazardDefinitionEClass, HAZARD_DEFINITION__HAZARD_NAME);
		createEAttribute(hazardDefinitionEClass, HAZARD_DEFINITION__DESCRIPTION);
		createEReference(hazardDefinitionEClass, HAZARD_DEFINITION__HAZARD_INSTANCES);

		locationRepositoryEClass = createEClass(LOCATION_REPOSITORY);
		createEReference(locationRepositoryEClass, LOCATION_REPOSITORY__LOCATION_DEFINITIONS);

		locationDefinitionEClass = createEClass(LOCATION_DEFINITION);
		createEAttribute(locationDefinitionEClass, LOCATION_DEFINITION__LOCATION_NAME);
		createEAttribute(locationDefinitionEClass, LOCATION_DEFINITION__MNEMONIC_NAME);
		createEReference(locationDefinitionEClass, LOCATION_DEFINITION__STEPS);
		createEAttribute(locationDefinitionEClass, LOCATION_DEFINITION__DESCRIPTION);

		systemRepositoryEClass = createEClass(SYSTEM_REPOSITORY);
		createEReference(systemRepositoryEClass, SYSTEM_REPOSITORY__SYSTEM_DEFINITIONS);

		systemDefinitionEClass = createEClass(SYSTEM_DEFINITION);
		createEAttribute(systemDefinitionEClass, SYSTEM_DEFINITION__SYSTEM_NAME);
		createEAttribute(systemDefinitionEClass, SYSTEM_DEFINITION__MNEMONIC_NAME);
		createEReference(systemDefinitionEClass, SYSTEM_DEFINITION__SYSTEM_FUNCTIONS);
		createEAttribute(systemDefinitionEClass, SYSTEM_DEFINITION__SYSTEM_VERSION);
		createEAttribute(systemDefinitionEClass, SYSTEM_DEFINITION__SYSTEM_DESCRIPTION);

		dataStoreEClass = createEClass(DATA_STORE);
		createEReference(dataStoreEClass, DATA_STORE__LOCATIONREPOSITORY);
		createEReference(dataStoreEClass, DATA_STORE__SYSTEMREPOSITORY);
		createEReference(dataStoreEClass, DATA_STORE__HAZARDREPOSITORY);
		createEReference(dataStoreEClass, DATA_STORE__REPORT_DATA);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__CARE_PROCESSES);
		createEReference(projectEClass, PROJECT__DATASTORE);
		createEAttribute(projectEClass, PROJECT__DATE_MODIFIED);
		createEAttribute(projectEClass, PROJECT__ACCEPTABLE_HAZARD_DEFINITION);
		createEAttribute(projectEClass, PROJECT__CREATED_WITH_APP_VERSION);
		createEAttribute(projectEClass, PROJECT__RISK_MATRIX_DATA);

		hazardFactorEClass = createEClass(HAZARD_FACTOR);

		reportDataEClass = createEClass(REPORT_DATA);
		createEReference(reportDataEClass, REPORT_DATA__ISSUE_DEFINITIONS);
		createEAttribute(reportDataEClass, REPORT_DATA__REPORT_INTRODUCTION_TEXT);
		createEAttribute(reportDataEClass, REPORT_DATA__CRM_SYSTEM_TEXT);
		createEAttribute(reportDataEClass, REPORT_DATA__SUMMARY_SAFETY_STATEMENT_TEXT);
		createEAttribute(reportDataEClass, REPORT_DATA__QA_AND_DOC_APPROVAL_TEXT);
		createEAttribute(reportDataEClass, REPORT_DATA__CONFIGURATION_CONTROL_TEXT);
		createEAttribute(reportDataEClass, REPORT_DATA__REPORT_TITLE_TEXT);

		issueDefinitionEClass = createEClass(ISSUE_DEFINITION);
		createEAttribute(issueDefinitionEClass, ISSUE_DEFINITION__ISSUE_NAME);
		createEAttribute(issueDefinitionEClass, ISSUE_DEFINITION__ISSUE_DESCRIPTION);

		// Create enums
		stepTypeEEnum = createEEnum(STEP_TYPE);
		controlTypeEnumEEnum = createEEnum(CONTROL_TYPE_ENUM);
		controlStateEnumEEnum = createEEnum(CONTROL_STATE_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hazardCauseEClass.getESuperTypes().add(this.getHazardFactor());
		hazardEffectEClass.getESuperTypes().add(this.getHazardFactor());
		activityEClass.getESuperTypes().add(this.getStep());
		decisionEClass.getESuperTypes().add(this.getStep());
		startEClass.getESuperTypes().add(this.getStep());
		stopEClass.getESuperTypes().add(this.getStep());
		hazardRepositoryEClass.getESuperTypes().add(this.getRepository());
		locationRepositoryEClass.getESuperTypes().add(this.getRepository());
		systemRepositoryEClass.getESuperTypes().add(this.getRepository());

		// Initialize classes, features, and operations; add parameters
		initEClass(processGraphEClass, processGraph.class, "processGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getprocessGraph_CareProcess(), this.getCareProcess(), this.getCareProcess_ProcessGraph(), "careProcess", null, 1, 1, processGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprocessGraph_GraphData(), ecorePackage.getEString(), "graphData", null, 0, 1, processGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprocessGraph_DataMap(), ecorePackage.getEString(), "dataMap", null, 1, 1, processGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getprocessGraph_Step(), this.getStep(), this.getStep_ProcessGraph(), "step", null, 0, -1, processGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemFunctionEClass, SystemFunction.class, "SystemFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemFunction_HazardInstances(), this.getHazardInstance(), this.getHazardInstance_SystemFunction(), "hazardInstances", null, 0, -1, SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_SystemDefinition(), this.getSystemDefinition(), this.getSystemDefinition_SystemFunctions(), "systemDefinition", null, 1, 1, SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemFunction_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemFunction_Description(), ecorePackage.getEString(), "description", null, 0, 1, SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_AssociatedSteps(), this.getStep(), this.getStep_AssociatedSystemFunctions(), "associatedSteps", null, 0, -1, SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(careProcessEClass, CareProcess.class, "CareProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCareProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, CareProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCareProcess_ProcessGraph(), this.getprocessGraph(), this.getprocessGraph_CareProcess(), "processGraph", null, 1, 1, CareProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCareProcess_Project(), this.getProject(), this.getProject_CareProcesses(), "project", null, 1, 1, CareProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCareProcess_Description(), ecorePackage.getEString(), "description", null, 0, 1, CareProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardInstanceEClass, HazardInstance.class, "HazardInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHazardInstance_InitialLikelihood(), theXMLTypePackage.getInt(), "initialLikelihood", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHazardInstance_InitialSeverity(), theXMLTypePackage.getInt(), "initialSeverity", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHazardInstance_Step(), this.getStep(), this.getStep_HazardInstances(), "step", null, 1, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardInstance_HazardDefinition(), this.getHazardDefinition(), this.getHazardDefinition_HazardInstances(), "hazardDefinition", null, 1, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_Status(), ecorePackage.getEString(), "status", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardInstance_SystemFunction(), this.getSystemFunction(), this.getSystemFunction_HazardInstances(), "systemFunction", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_ResidualLikelihood(), theXMLTypePackage.getInt(), "residualLikelihood", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_ResidualSeverity(), theXMLTypePackage.getInt(), "residualSeverity", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_InitialRiskRating(), theXMLTypePackage.getInt(), "initialRiskRating", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_ResidualRiskRating(), theXMLTypePackage.getInt(), "residualRiskRating", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_Description(), ecorePackage.getEString(), "description", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardInstance_Hazardcauses(), this.getHazardCause(), null, "hazardcauses", null, 0, -1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardInstance_Hazardeffects(), this.getHazardEffect(), null, "hazardeffects", null, 0, -1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_ClinicalJustification(), theXMLTypePackage.getString(), "clinicalJustification", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardInstance_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, HazardInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardControlEClass, HazardControl.class, "HazardControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHazardControl_Description(), ecorePackage.getEString(), "description", null, 0, 1, HazardControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardControl_Name(), ecorePackage.getEString(), "name", null, 0, 1, HazardControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardControl_ControlState(), this.getControlStateEnum(), "controlState", null, 0, 1, HazardControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardControl_ControlTypes(), this.getControlTypeEnum(), "controlTypes", null, 0, -1, HazardControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHazardControl_OtherText(), ecorePackage.getEString(), "otherText", null, 0, 1, HazardControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardControl_Hazardcause(), this.getHazardCause(), this.getHazardCause_Hazardcontrols(), "hazardcause", null, 0, 1, HazardControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardControl_Hazardeffect(), this.getHazardEffect(), this.getHazardEffect_Hazardcontrols(), "hazardeffect", null, 0, 1, HazardControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardCauseEClass, HazardCause.class, "HazardCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHazardCause_Hazardcauses(), this.getHazardCause(), null, "hazardcauses", null, 0, -1, HazardCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardCause_CauseName(), ecorePackage.getEString(), "causeName", null, 0, 1, HazardCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardCause_CauseDescription(), ecorePackage.getEString(), "causeDescription", null, 0, 1, HazardCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardCause_Hazardcontrols(), this.getHazardControl(), this.getHazardControl_Hazardcause(), "hazardcontrols", null, 0, -1, HazardCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardEffectEClass, HazardEffect.class, "HazardEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHazardEffect_Hazardeffects(), this.getHazardEffect(), null, "hazardeffects", null, 0, -1, HazardEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardEffect_EffectDescription(), ecorePackage.getEString(), "effectDescription", null, 0, 1, HazardEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardEffect_EffectName(), ecorePackage.getEString(), "effectName", null, 0, 1, HazardEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardEffect_Hazardcontrols(), this.getHazardControl(), this.getHazardControl_Hazardeffect(), "hazardcontrols", null, 0, -1, HazardEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Successors(), this.getStep(), null, "successors", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepTypeValue(), this.getstepType(), "stepTypeValue", "ACTIVITY", 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_HazardInstances(), this.getHazardInstance(), this.getHazardInstance_Step(), "hazardInstances", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Location(), this.getLocationDefinition(), this.getLocationDefinition_Steps(), "location", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_AssociatedSystemFunctions(), this.getSystemFunction(), this.getSystemFunction_AssociatedSteps(), "associatedSystemFunctions", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_UUID(), ecorePackage.getEString(), "UUID", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStep_ProcessGraph(), this.getprocessGraph(), this.getprocessGraph_Step(), "processGraph", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Hidden(), theXMLTypePackage.getBoolean(), "hidden", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryEClass, Repository.class, "Repository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepository_RepositoryName(), ecorePackage.getEString(), "repositoryName", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardRepositoryEClass, HazardRepository.class, "HazardRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHazardRepository_HazardDefinitions(), this.getHazardDefinition(), null, "hazardDefinitions", null, 0, -1, HazardRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardRepository_HazardInstances(), this.getHazardInstance(), null, "hazardInstances", null, 0, -1, HazardRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardDefinitionEClass, HazardDefinition.class, "HazardDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHazardDefinition_HazardName(), ecorePackage.getEString(), "hazardName", null, 0, 1, HazardDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHazardDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, HazardDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardDefinition_HazardInstances(), this.getHazardInstance(), this.getHazardInstance_HazardDefinition(), "hazardInstances", null, 0, -1, HazardDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationRepositoryEClass, LocationRepository.class, "LocationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocationRepository_LocationDefinitions(), this.getLocationDefinition(), null, "locationDefinitions", null, 0, -1, LocationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationDefinitionEClass, LocationDefinition.class, "LocationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationDefinition_LocationName(), ecorePackage.getEString(), "locationName", null, 0, 1, LocationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLocationDefinition_MnemonicName(), ecorePackage.getEString(), "mnemonicName", null, 0, 1, LocationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationDefinition_Steps(), this.getStep(), this.getStep_Location(), "steps", null, 0, -1, LocationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, LocationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemRepositoryEClass, SystemRepository.class, "SystemRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemRepository_SystemDefinitions(), this.getSystemDefinition(), null, "systemDefinitions", null, 0, -1, SystemRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemDefinitionEClass, SystemDefinition.class, "SystemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemDefinition_SystemName(), ecorePackage.getEString(), "systemName", null, 0, 1, SystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemDefinition_MnemonicName(), ecorePackage.getEString(), "mnemonicName", null, 0, 1, SystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDefinition_SystemFunctions(), this.getSystemFunction(), this.getSystemFunction_SystemDefinition(), "systemFunctions", null, 1, -1, SystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemDefinition_SystemVersion(), ecorePackage.getEString(), "systemVersion", null, 0, 1, SystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemDefinition_SystemDescription(), ecorePackage.getEString(), "systemDescription", null, 0, 1, SystemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStoreEClass, DataStore.class, "DataStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataStore_Locationrepository(), this.getLocationRepository(), null, "locationrepository", null, 1, 1, DataStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataStore_Systemrepository(), this.getSystemRepository(), null, "systemrepository", null, 1, 1, DataStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataStore_Hazardrepository(), this.getHazardRepository(), null, "hazardrepository", null, 1, 1, DataStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataStore_ReportData(), this.getReportData(), null, "reportData", null, 1, 1, DataStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_CareProcesses(), this.getCareProcess(), this.getCareProcess_Project(), "careProcesses", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Datastore(), this.getDataStore(), null, "datastore", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_DateModified(), theXMLTypePackage.getDateTime(), "dateModified", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AcceptableHazardDefinition(), theXMLTypePackage.getString(), "acceptableHazardDefinition", "Accepted: Clinical risk meeting acceptance criteria or outweighed by clinical benefits", 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CreatedWithAppVersion(), theXMLTypePackage.getString(), "createdWithAppVersion", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_RiskMatrixData(), theXMLTypePackage.getString(), "riskMatrixData", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardFactorEClass, HazardFactor.class, "HazardFactor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reportDataEClass, ReportData.class, "ReportData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReportData_IssueDefinitions(), this.getIssueDefinition(), null, "issueDefinitions", null, 0, -1, ReportData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportData_ReportIntroductionText(), theXMLTypePackage.getString(), "reportIntroductionText", null, 0, 1, ReportData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportData_CrmSystemText(), theXMLTypePackage.getString(), "crmSystemText", null, 0, 1, ReportData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportData_SummarySafetyStatementText(), theXMLTypePackage.getString(), "summarySafetyStatementText", null, 0, 1, ReportData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportData_QaAndDocApprovalText(), theXMLTypePackage.getString(), "qaAndDocApprovalText", null, 0, 1, ReportData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportData_ConfigurationControlText(), theXMLTypePackage.getString(), "configurationControlText", null, 0, 1, ReportData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReportData_ReportTitleText(), theXMLTypePackage.getString(), "reportTitleText", null, 0, 1, ReportData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueDefinitionEClass, IssueDefinition.class, "IssueDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssueDefinition_IssueName(), theXMLTypePackage.getString(), "issueName", null, 0, 1, IssueDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueDefinition_IssueDescription(), theXMLTypePackage.getString(), "issueDescription", null, 0, 1, IssueDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stepTypeEEnum, stepType.class, "stepType");
		addEEnumLiteral(stepTypeEEnum, stepType.DECISION);
		addEEnumLiteral(stepTypeEEnum, stepType.ACTIVITY);
		addEEnumLiteral(stepTypeEEnum, stepType.START);
		addEEnumLiteral(stepTypeEEnum, stepType.STOP);

		initEEnum(controlTypeEnumEEnum, ControlTypeEnum.class, "ControlTypeEnum");
		addEEnumLiteral(controlTypeEnumEEnum, ControlTypeEnum.DESIGN);
		addEEnumLiteral(controlTypeEnumEEnum, ControlTypeEnum.TEST);
		addEEnumLiteral(controlTypeEnumEEnum, ControlTypeEnum.TRAINING);
		addEEnumLiteral(controlTypeEnumEEnum, ControlTypeEnum.BUSINESS_PROCESS_CHANGE);

		initEEnum(controlStateEnumEEnum, ControlStateEnum.class, "ControlStateEnum");
		addEEnumLiteral(controlStateEnumEEnum, ControlStateEnum.EXISTING);
		addEEnumLiteral(controlStateEnumEEnum, ControlStateEnum.ADDITIONAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";	
		addAnnotation
		  (careProcessEClass, 
		   source, 
		   new String[] {
			 "archetype", "Role"
		   });	
		addAnnotation
		  (hazardInstanceEClass, 
		   source, 
		   new String[] {
			 "archetype", "Role"
		   });
	}

} //CareProcess_modelPackageImpl
