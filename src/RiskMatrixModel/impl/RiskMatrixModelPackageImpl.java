/**
 */
package RiskMatrixModel.impl;

import RiskMatrixModel.LikelihoodLevel;
import RiskMatrixModel.RiskMatrix;
import RiskMatrixModel.RiskMatrixModelFactory;
import RiskMatrixModel.RiskMatrixModelPackage;
import RiskMatrixModel.RiskRatingInstance;
import RiskMatrixModel.SeverityLevel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class RiskMatrixModelPackageImpl extends EPackageImpl implements RiskMatrixModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass likelihoodLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskRatingInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass severityLevelEClass = null;

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
	 * @see RiskMatrixModel.RiskMatrixModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RiskMatrixModelPackageImpl() {
		super(eNS_URI, RiskMatrixModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RiskMatrixModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RiskMatrixModelPackage init() {
		if (isInited) return (RiskMatrixModelPackage)EPackage.Registry.INSTANCE.getEPackage(RiskMatrixModelPackage.eNS_URI);

		// Obtain or create and register package
		RiskMatrixModelPackageImpl theRiskMatrixModelPackage = (RiskMatrixModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RiskMatrixModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RiskMatrixModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRiskMatrixModelPackage.createPackageContents();

		// Initialize created meta-data
		theRiskMatrixModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRiskMatrixModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RiskMatrixModelPackage.eNS_URI, theRiskMatrixModelPackage);
		return theRiskMatrixModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskMatrix() {
		return riskMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskMatrix_Likelihoodlevel() {
		return (EReference)riskMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskMatrix_Riskratinginstance() {
		return (EReference)riskMatrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskMatrix_Severitylevel() {
		return (EReference)riskMatrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskMatrix_MinUnacceptableRisk() {
		return (EAttribute)riskMatrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLikelihoodLevel() {
		return likelihoodLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLikelihoodLevel_LevelName() {
		return (EAttribute)likelihoodLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLikelihoodLevel_LevelIndex() {
		return (EAttribute)likelihoodLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLikelihoodLevel_Riskratinginstance() {
		return (EReference)likelihoodLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskRatingInstance() {
		return riskRatingInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRiskRatingInstance_RiskValue() {
		return (EAttribute)riskRatingInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskRatingInstance_Likelihoodlevel() {
		return (EReference)riskRatingInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskRatingInstance_Severitylevel() {
		return (EReference)riskRatingInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeverityLevel() {
		return severityLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeverityLevel_LevelIndex() {
		return (EAttribute)severityLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeverityLevel_LevelName() {
		return (EAttribute)severityLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeverityLevel_Riskratinginstance() {
		return (EReference)severityLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskMatrixModelFactory getRiskMatrixModelFactory() {
		return (RiskMatrixModelFactory)getEFactoryInstance();
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
		riskMatrixEClass = createEClass(RISK_MATRIX);
		createEReference(riskMatrixEClass, RISK_MATRIX__LIKELIHOODLEVEL);
		createEReference(riskMatrixEClass, RISK_MATRIX__RISKRATINGINSTANCE);
		createEReference(riskMatrixEClass, RISK_MATRIX__SEVERITYLEVEL);
		createEAttribute(riskMatrixEClass, RISK_MATRIX__MIN_UNACCEPTABLE_RISK);

		likelihoodLevelEClass = createEClass(LIKELIHOOD_LEVEL);
		createEAttribute(likelihoodLevelEClass, LIKELIHOOD_LEVEL__LEVEL_NAME);
		createEAttribute(likelihoodLevelEClass, LIKELIHOOD_LEVEL__LEVEL_INDEX);
		createEReference(likelihoodLevelEClass, LIKELIHOOD_LEVEL__RISKRATINGINSTANCE);

		riskRatingInstanceEClass = createEClass(RISK_RATING_INSTANCE);
		createEAttribute(riskRatingInstanceEClass, RISK_RATING_INSTANCE__RISK_VALUE);
		createEReference(riskRatingInstanceEClass, RISK_RATING_INSTANCE__LIKELIHOODLEVEL);
		createEReference(riskRatingInstanceEClass, RISK_RATING_INSTANCE__SEVERITYLEVEL);

		severityLevelEClass = createEClass(SEVERITY_LEVEL);
		createEAttribute(severityLevelEClass, SEVERITY_LEVEL__LEVEL_INDEX);
		createEAttribute(severityLevelEClass, SEVERITY_LEVEL__LEVEL_NAME);
		createEReference(severityLevelEClass, SEVERITY_LEVEL__RISKRATINGINSTANCE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(riskMatrixEClass, RiskMatrix.class, "RiskMatrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRiskMatrix_Likelihoodlevel(), this.getLikelihoodLevel(), null, "likelihoodlevel", null, 0, -1, RiskMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskMatrix_Riskratinginstance(), this.getRiskRatingInstance(), null, "riskratinginstance", null, 0, -1, RiskMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskMatrix_Severitylevel(), this.getSeverityLevel(), null, "severitylevel", null, 0, -1, RiskMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskMatrix_MinUnacceptableRisk(), theXMLTypePackage.getInt(), "minUnacceptableRisk", null, 0, 1, RiskMatrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(likelihoodLevelEClass, LikelihoodLevel.class, "LikelihoodLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLikelihoodLevel_LevelName(), theXMLTypePackage.getString(), "levelName", null, 0, 1, LikelihoodLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLikelihoodLevel_LevelIndex(), theXMLTypePackage.getInt(), "levelIndex", null, 0, 1, LikelihoodLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLikelihoodLevel_Riskratinginstance(), this.getRiskRatingInstance(), this.getRiskRatingInstance_Likelihoodlevel(), "riskratinginstance", null, 1, -1, LikelihoodLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskRatingInstanceEClass, RiskRatingInstance.class, "RiskRatingInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskRatingInstance_RiskValue(), theXMLTypePackage.getInt(), "riskValue", null, 0, 1, RiskRatingInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskRatingInstance_Likelihoodlevel(), this.getLikelihoodLevel(), this.getLikelihoodLevel_Riskratinginstance(), "likelihoodlevel", null, 1, 1, RiskRatingInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskRatingInstance_Severitylevel(), this.getSeverityLevel(), this.getSeverityLevel_Riskratinginstance(), "severitylevel", null, 1, 1, RiskRatingInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(severityLevelEClass, SeverityLevel.class, "SeverityLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeverityLevel_LevelIndex(), theXMLTypePackage.getInt(), "levelIndex", null, 0, 1, SeverityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeverityLevel_LevelName(), theXMLTypePackage.getString(), "levelName", null, 0, 1, SeverityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSeverityLevel_Riskratinginstance(), this.getRiskRatingInstance(), this.getRiskRatingInstance_Severitylevel(), "riskratinginstance", null, 1, -1, SeverityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RiskMatrixModelPackageImpl
