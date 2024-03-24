/**
 */
package RiskMatrixModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiskMatrixModel.RiskMatrix#getLikelihoodlevel <em>Likelihoodlevel</em>}</li>
 *   <li>{@link RiskMatrixModel.RiskMatrix#getRiskratinginstance <em>Riskratinginstance</em>}</li>
 *   <li>{@link RiskMatrixModel.RiskMatrix#getSeveritylevel <em>Severitylevel</em>}</li>
 *   <li>{@link RiskMatrixModel.RiskMatrix#getMinUnacceptableRisk <em>Min Unacceptable Risk</em>}</li>
 * </ul>
 *
 * @see RiskMatrixModel.RiskMatrixModelPackage#getRiskMatrix()
 * @model
 * @generated
 */
public interface RiskMatrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Likelihoodlevel</b></em>' containment reference list.
	 * The list contents are of type {@link RiskMatrixModel.LikelihoodLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Likelihoodlevel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihoodlevel</em>' containment reference list.
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getRiskMatrix_Likelihoodlevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<LikelihoodLevel> getLikelihoodlevel();

	/**
	 * Returns the value of the '<em><b>Riskratinginstance</b></em>' containment reference list.
	 * The list contents are of type {@link RiskMatrixModel.RiskRatingInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Riskratinginstance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riskratinginstance</em>' containment reference list.
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getRiskMatrix_Riskratinginstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskRatingInstance> getRiskratinginstance();

	/**
	 * Returns the value of the '<em><b>Severitylevel</b></em>' containment reference list.
	 * The list contents are of type {@link RiskMatrixModel.SeverityLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severitylevel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severitylevel</em>' containment reference list.
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getRiskMatrix_Severitylevel()
	 * @model containment="true"
	 * @generated
	 */
	EList<SeverityLevel> getSeveritylevel();

	/**
	 * Returns the value of the '<em><b>Min Unacceptable Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Unacceptable Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Unacceptable Risk</em>' attribute.
	 * @see #setMinUnacceptableRisk(int)
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getRiskMatrix_MinUnacceptableRisk()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMinUnacceptableRisk();

	/**
	 * Sets the value of the '{@link RiskMatrixModel.RiskMatrix#getMinUnacceptableRisk <em>Min Unacceptable Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Unacceptable Risk</em>' attribute.
	 * @see #getMinUnacceptableRisk()
	 * @generated
	 */
	void setMinUnacceptableRisk(int value);

} // RiskMatrix
