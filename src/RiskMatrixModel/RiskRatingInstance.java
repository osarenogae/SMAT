/**
 */
package RiskMatrixModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Rating Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiskMatrixModel.RiskRatingInstance#getRiskValue <em>Risk Value</em>}</li>
 *   <li>{@link RiskMatrixModel.RiskRatingInstance#getLikelihoodlevel <em>Likelihoodlevel</em>}</li>
 *   <li>{@link RiskMatrixModel.RiskRatingInstance#getSeveritylevel <em>Severitylevel</em>}</li>
 * </ul>
 *
 * @see RiskMatrixModel.RiskMatrixModelPackage#getRiskRatingInstance()
 * @model
 * @generated
 */
public interface RiskRatingInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Risk Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Value</em>' attribute.
	 * @see #setRiskValue(int)
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getRiskRatingInstance_RiskValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getRiskValue();

	/**
	 * Sets the value of the '{@link RiskMatrixModel.RiskRatingInstance#getRiskValue <em>Risk Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Value</em>' attribute.
	 * @see #getRiskValue()
	 * @generated
	 */
	void setRiskValue(int value);

	/**
	 * Returns the value of the '<em><b>Likelihoodlevel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link RiskMatrixModel.LikelihoodLevel#getRiskratinginstance <em>Riskratinginstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Likelihoodlevel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Likelihoodlevel</em>' reference.
	 * @see #setLikelihoodlevel(LikelihoodLevel)
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getRiskRatingInstance_Likelihoodlevel()
	 * @see RiskMatrixModel.LikelihoodLevel#getRiskratinginstance
	 * @model opposite="riskratinginstance" required="true"
	 * @generated
	 */
	LikelihoodLevel getLikelihoodlevel();

	/**
	 * Sets the value of the '{@link RiskMatrixModel.RiskRatingInstance#getLikelihoodlevel <em>Likelihoodlevel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihoodlevel</em>' reference.
	 * @see #getLikelihoodlevel()
	 * @generated
	 */
	void setLikelihoodlevel(LikelihoodLevel value);

	/**
	 * Returns the value of the '<em><b>Severitylevel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link RiskMatrixModel.SeverityLevel#getRiskratinginstance <em>Riskratinginstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severitylevel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severitylevel</em>' reference.
	 * @see #setSeveritylevel(SeverityLevel)
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getRiskRatingInstance_Severitylevel()
	 * @see RiskMatrixModel.SeverityLevel#getRiskratinginstance
	 * @model opposite="riskratinginstance" required="true"
	 * @generated
	 */
	SeverityLevel getSeveritylevel();

	/**
	 * Sets the value of the '{@link RiskMatrixModel.RiskRatingInstance#getSeveritylevel <em>Severitylevel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severitylevel</em>' reference.
	 * @see #getSeveritylevel()
	 * @generated
	 */
	void setSeveritylevel(SeverityLevel value);

} // RiskRatingInstance
