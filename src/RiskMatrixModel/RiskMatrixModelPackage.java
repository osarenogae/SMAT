/**
 */
package RiskMatrixModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see RiskMatrixModel.RiskMatrixModelFactory
 * @model kind="package"
 * @generated
 */
public interface RiskMatrixModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RiskMatrixModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uk.gov.hscic.CareProcessTool.RiskMatrixModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hscicCareProcessTool.RiskMatrix";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RiskMatrixModelPackage eINSTANCE = RiskMatrixModel.impl.RiskMatrixModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link RiskMatrixModel.impl.RiskMatrixImpl <em>Risk Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiskMatrixModel.impl.RiskMatrixImpl
	 * @see RiskMatrixModel.impl.RiskMatrixModelPackageImpl#getRiskMatrix()
	 * @generated
	 */
	int RISK_MATRIX = 0;

	/**
	 * The feature id for the '<em><b>Likelihoodlevel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX__LIKELIHOODLEVEL = 0;

	/**
	 * The feature id for the '<em><b>Riskratinginstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX__RISKRATINGINSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Severitylevel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX__SEVERITYLEVEL = 2;

	/**
	 * The feature id for the '<em><b>Min Unacceptable Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX__MIN_UNACCEPTABLE_RISK = 3;

	/**
	 * The number of structural features of the '<em>Risk Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Risk Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RiskMatrixModel.impl.LikelihoodLevelImpl <em>Likelihood Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiskMatrixModel.impl.LikelihoodLevelImpl
	 * @see RiskMatrixModel.impl.RiskMatrixModelPackageImpl#getLikelihoodLevel()
	 * @generated
	 */
	int LIKELIHOOD_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Level Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKELIHOOD_LEVEL__LEVEL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Level Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKELIHOOD_LEVEL__LEVEL_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Riskratinginstance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKELIHOOD_LEVEL__RISKRATINGINSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Likelihood Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKELIHOOD_LEVEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Likelihood Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIKELIHOOD_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RiskMatrixModel.impl.RiskRatingInstanceImpl <em>Risk Rating Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiskMatrixModel.impl.RiskRatingInstanceImpl
	 * @see RiskMatrixModel.impl.RiskMatrixModelPackageImpl#getRiskRatingInstance()
	 * @generated
	 */
	int RISK_RATING_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Risk Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_RATING_INSTANCE__RISK_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Likelihoodlevel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_RATING_INSTANCE__LIKELIHOODLEVEL = 1;

	/**
	 * The feature id for the '<em><b>Severitylevel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_RATING_INSTANCE__SEVERITYLEVEL = 2;

	/**
	 * The number of structural features of the '<em>Risk Rating Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_RATING_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Risk Rating Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_RATING_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RiskMatrixModel.impl.SeverityLevelImpl <em>Severity Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RiskMatrixModel.impl.SeverityLevelImpl
	 * @see RiskMatrixModel.impl.RiskMatrixModelPackageImpl#getSeverityLevel()
	 * @generated
	 */
	int SEVERITY_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Level Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_LEVEL__LEVEL_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Level Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_LEVEL__LEVEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Riskratinginstance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_LEVEL__RISKRATINGINSTANCE = 2;

	/**
	 * The number of structural features of the '<em>Severity Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_LEVEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Severity Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEVERITY_LEVEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link RiskMatrixModel.RiskMatrix <em>Risk Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Matrix</em>'.
	 * @see RiskMatrixModel.RiskMatrix
	 * @generated
	 */
	EClass getRiskMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link RiskMatrixModel.RiskMatrix#getLikelihoodlevel <em>Likelihoodlevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Likelihoodlevel</em>'.
	 * @see RiskMatrixModel.RiskMatrix#getLikelihoodlevel()
	 * @see #getRiskMatrix()
	 * @generated
	 */
	EReference getRiskMatrix_Likelihoodlevel();

	/**
	 * Returns the meta object for the containment reference list '{@link RiskMatrixModel.RiskMatrix#getRiskratinginstance <em>Riskratinginstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Riskratinginstance</em>'.
	 * @see RiskMatrixModel.RiskMatrix#getRiskratinginstance()
	 * @see #getRiskMatrix()
	 * @generated
	 */
	EReference getRiskMatrix_Riskratinginstance();

	/**
	 * Returns the meta object for the containment reference list '{@link RiskMatrixModel.RiskMatrix#getSeveritylevel <em>Severitylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Severitylevel</em>'.
	 * @see RiskMatrixModel.RiskMatrix#getSeveritylevel()
	 * @see #getRiskMatrix()
	 * @generated
	 */
	EReference getRiskMatrix_Severitylevel();

	/**
	 * Returns the meta object for the attribute '{@link RiskMatrixModel.RiskMatrix#getMinUnacceptableRisk <em>Min Unacceptable Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Unacceptable Risk</em>'.
	 * @see RiskMatrixModel.RiskMatrix#getMinUnacceptableRisk()
	 * @see #getRiskMatrix()
	 * @generated
	 */
	EAttribute getRiskMatrix_MinUnacceptableRisk();

	/**
	 * Returns the meta object for class '{@link RiskMatrixModel.LikelihoodLevel <em>Likelihood Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Likelihood Level</em>'.
	 * @see RiskMatrixModel.LikelihoodLevel
	 * @generated
	 */
	EClass getLikelihoodLevel();

	/**
	 * Returns the meta object for the attribute '{@link RiskMatrixModel.LikelihoodLevel#getLevelName <em>Level Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Name</em>'.
	 * @see RiskMatrixModel.LikelihoodLevel#getLevelName()
	 * @see #getLikelihoodLevel()
	 * @generated
	 */
	EAttribute getLikelihoodLevel_LevelName();

	/**
	 * Returns the meta object for the attribute '{@link RiskMatrixModel.LikelihoodLevel#getLevelIndex <em>Level Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Index</em>'.
	 * @see RiskMatrixModel.LikelihoodLevel#getLevelIndex()
	 * @see #getLikelihoodLevel()
	 * @generated
	 */
	EAttribute getLikelihoodLevel_LevelIndex();

	/**
	 * Returns the meta object for the reference list '{@link RiskMatrixModel.LikelihoodLevel#getRiskratinginstance <em>Riskratinginstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Riskratinginstance</em>'.
	 * @see RiskMatrixModel.LikelihoodLevel#getRiskratinginstance()
	 * @see #getLikelihoodLevel()
	 * @generated
	 */
	EReference getLikelihoodLevel_Riskratinginstance();

	/**
	 * Returns the meta object for class '{@link RiskMatrixModel.RiskRatingInstance <em>Risk Rating Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Rating Instance</em>'.
	 * @see RiskMatrixModel.RiskRatingInstance
	 * @generated
	 */
	EClass getRiskRatingInstance();

	/**
	 * Returns the meta object for the attribute '{@link RiskMatrixModel.RiskRatingInstance#getRiskValue <em>Risk Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Value</em>'.
	 * @see RiskMatrixModel.RiskRatingInstance#getRiskValue()
	 * @see #getRiskRatingInstance()
	 * @generated
	 */
	EAttribute getRiskRatingInstance_RiskValue();

	/**
	 * Returns the meta object for the reference '{@link RiskMatrixModel.RiskRatingInstance#getLikelihoodlevel <em>Likelihoodlevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Likelihoodlevel</em>'.
	 * @see RiskMatrixModel.RiskRatingInstance#getLikelihoodlevel()
	 * @see #getRiskRatingInstance()
	 * @generated
	 */
	EReference getRiskRatingInstance_Likelihoodlevel();

	/**
	 * Returns the meta object for the reference '{@link RiskMatrixModel.RiskRatingInstance#getSeveritylevel <em>Severitylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Severitylevel</em>'.
	 * @see RiskMatrixModel.RiskRatingInstance#getSeveritylevel()
	 * @see #getRiskRatingInstance()
	 * @generated
	 */
	EReference getRiskRatingInstance_Severitylevel();

	/**
	 * Returns the meta object for class '{@link RiskMatrixModel.SeverityLevel <em>Severity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Severity Level</em>'.
	 * @see RiskMatrixModel.SeverityLevel
	 * @generated
	 */
	EClass getSeverityLevel();

	/**
	 * Returns the meta object for the attribute '{@link RiskMatrixModel.SeverityLevel#getLevelIndex <em>Level Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Index</em>'.
	 * @see RiskMatrixModel.SeverityLevel#getLevelIndex()
	 * @see #getSeverityLevel()
	 * @generated
	 */
	EAttribute getSeverityLevel_LevelIndex();

	/**
	 * Returns the meta object for the attribute '{@link RiskMatrixModel.SeverityLevel#getLevelName <em>Level Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Name</em>'.
	 * @see RiskMatrixModel.SeverityLevel#getLevelName()
	 * @see #getSeverityLevel()
	 * @generated
	 */
	EAttribute getSeverityLevel_LevelName();

	/**
	 * Returns the meta object for the reference list '{@link RiskMatrixModel.SeverityLevel#getRiskratinginstance <em>Riskratinginstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Riskratinginstance</em>'.
	 * @see RiskMatrixModel.SeverityLevel#getRiskratinginstance()
	 * @see #getSeverityLevel()
	 * @generated
	 */
	EReference getSeverityLevel_Riskratinginstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RiskMatrixModelFactory getRiskMatrixModelFactory();

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
		 * The meta object literal for the '{@link RiskMatrixModel.impl.RiskMatrixImpl <em>Risk Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiskMatrixModel.impl.RiskMatrixImpl
		 * @see RiskMatrixModel.impl.RiskMatrixModelPackageImpl#getRiskMatrix()
		 * @generated
		 */
		EClass RISK_MATRIX = eINSTANCE.getRiskMatrix();

		/**
		 * The meta object literal for the '<em><b>Likelihoodlevel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_MATRIX__LIKELIHOODLEVEL = eINSTANCE.getRiskMatrix_Likelihoodlevel();

		/**
		 * The meta object literal for the '<em><b>Riskratinginstance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_MATRIX__RISKRATINGINSTANCE = eINSTANCE.getRiskMatrix_Riskratinginstance();

		/**
		 * The meta object literal for the '<em><b>Severitylevel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_MATRIX__SEVERITYLEVEL = eINSTANCE.getRiskMatrix_Severitylevel();

		/**
		 * The meta object literal for the '<em><b>Min Unacceptable Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_MATRIX__MIN_UNACCEPTABLE_RISK = eINSTANCE.getRiskMatrix_MinUnacceptableRisk();

		/**
		 * The meta object literal for the '{@link RiskMatrixModel.impl.LikelihoodLevelImpl <em>Likelihood Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiskMatrixModel.impl.LikelihoodLevelImpl
		 * @see RiskMatrixModel.impl.RiskMatrixModelPackageImpl#getLikelihoodLevel()
		 * @generated
		 */
		EClass LIKELIHOOD_LEVEL = eINSTANCE.getLikelihoodLevel();

		/**
		 * The meta object literal for the '<em><b>Level Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIKELIHOOD_LEVEL__LEVEL_NAME = eINSTANCE.getLikelihoodLevel_LevelName();

		/**
		 * The meta object literal for the '<em><b>Level Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIKELIHOOD_LEVEL__LEVEL_INDEX = eINSTANCE.getLikelihoodLevel_LevelIndex();

		/**
		 * The meta object literal for the '<em><b>Riskratinginstance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIKELIHOOD_LEVEL__RISKRATINGINSTANCE = eINSTANCE.getLikelihoodLevel_Riskratinginstance();

		/**
		 * The meta object literal for the '{@link RiskMatrixModel.impl.RiskRatingInstanceImpl <em>Risk Rating Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiskMatrixModel.impl.RiskRatingInstanceImpl
		 * @see RiskMatrixModel.impl.RiskMatrixModelPackageImpl#getRiskRatingInstance()
		 * @generated
		 */
		EClass RISK_RATING_INSTANCE = eINSTANCE.getRiskRatingInstance();

		/**
		 * The meta object literal for the '<em><b>Risk Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_RATING_INSTANCE__RISK_VALUE = eINSTANCE.getRiskRatingInstance_RiskValue();

		/**
		 * The meta object literal for the '<em><b>Likelihoodlevel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_RATING_INSTANCE__LIKELIHOODLEVEL = eINSTANCE.getRiskRatingInstance_Likelihoodlevel();

		/**
		 * The meta object literal for the '<em><b>Severitylevel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_RATING_INSTANCE__SEVERITYLEVEL = eINSTANCE.getRiskRatingInstance_Severitylevel();

		/**
		 * The meta object literal for the '{@link RiskMatrixModel.impl.SeverityLevelImpl <em>Severity Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RiskMatrixModel.impl.SeverityLevelImpl
		 * @see RiskMatrixModel.impl.RiskMatrixModelPackageImpl#getSeverityLevel()
		 * @generated
		 */
		EClass SEVERITY_LEVEL = eINSTANCE.getSeverityLevel();

		/**
		 * The meta object literal for the '<em><b>Level Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEVERITY_LEVEL__LEVEL_INDEX = eINSTANCE.getSeverityLevel_LevelIndex();

		/**
		 * The meta object literal for the '<em><b>Level Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEVERITY_LEVEL__LEVEL_NAME = eINSTANCE.getSeverityLevel_LevelName();

		/**
		 * The meta object literal for the '<em><b>Riskratinginstance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEVERITY_LEVEL__RISKRATINGINSTANCE = eINSTANCE.getSeverityLevel_Riskratinginstance();

	}

} //RiskMatrixModelPackage
