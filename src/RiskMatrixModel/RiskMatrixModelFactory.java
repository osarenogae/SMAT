/**
 */
package RiskMatrixModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RiskMatrixModel.RiskMatrixModelPackage
 * @generated
 */
public interface RiskMatrixModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RiskMatrixModelFactory eINSTANCE = RiskMatrixModel.impl.RiskMatrixModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Risk Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Matrix</em>'.
	 * @generated
	 */
	RiskMatrix createRiskMatrix();

	/**
	 * Returns a new object of class '<em>Likelihood Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Likelihood Level</em>'.
	 * @generated
	 */
	LikelihoodLevel createLikelihoodLevel();

	/**
	 * Returns a new object of class '<em>Risk Rating Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Rating Instance</em>'.
	 * @generated
	 */
	RiskRatingInstance createRiskRatingInstance();

	/**
	 * Returns a new object of class '<em>Severity Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Severity Level</em>'.
	 * @generated
	 */
	SeverityLevel createSeverityLevel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RiskMatrixModelPackage getRiskMatrixModelPackage();

} //RiskMatrixModelFactory
