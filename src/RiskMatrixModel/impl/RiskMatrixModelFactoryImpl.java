/**
 */
package RiskMatrixModel.impl;

import RiskMatrixModel.*;

import org.eclipse.emf.ecore.EClass;
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
public class RiskMatrixModelFactoryImpl extends EFactoryImpl implements RiskMatrixModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RiskMatrixModelFactory init() {
		try {
			RiskMatrixModelFactory theRiskMatrixModelFactory = (RiskMatrixModelFactory)EPackage.Registry.INSTANCE.getEFactory(RiskMatrixModelPackage.eNS_URI);
			if (theRiskMatrixModelFactory != null) {
				return theRiskMatrixModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RiskMatrixModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskMatrixModelFactoryImpl() {
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
			case RiskMatrixModelPackage.RISK_MATRIX: return createRiskMatrix();
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL: return createLikelihoodLevel();
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE: return createRiskRatingInstance();
			case RiskMatrixModelPackage.SEVERITY_LEVEL: return createSeverityLevel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskMatrix createRiskMatrix() {
		RiskMatrixImpl riskMatrix = new RiskMatrixImpl();
		return riskMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LikelihoodLevel createLikelihoodLevel() {
		LikelihoodLevelImpl likelihoodLevel = new LikelihoodLevelImpl();
		return likelihoodLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskRatingInstance createRiskRatingInstance() {
		RiskRatingInstanceImpl riskRatingInstance = new RiskRatingInstanceImpl();
		return riskRatingInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityLevel createSeverityLevel() {
		SeverityLevelImpl severityLevel = new SeverityLevelImpl();
		return severityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskMatrixModelPackage getRiskMatrixModelPackage() {
		return (RiskMatrixModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RiskMatrixModelPackage getPackage() {
		return RiskMatrixModelPackage.eINSTANCE;
	}

} //RiskMatrixModelFactoryImpl
