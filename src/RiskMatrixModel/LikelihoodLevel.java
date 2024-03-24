/**
 */
package RiskMatrixModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Likelihood Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RiskMatrixModel.LikelihoodLevel#getLevelName <em>Level Name</em>}</li>
 *   <li>{@link RiskMatrixModel.LikelihoodLevel#getLevelIndex <em>Level Index</em>}</li>
 *   <li>{@link RiskMatrixModel.LikelihoodLevel#getRiskratinginstance <em>Riskratinginstance</em>}</li>
 * </ul>
 *
 * @see RiskMatrixModel.RiskMatrixModelPackage#getLikelihoodLevel()
 * @model
 * @generated
 */
public interface LikelihoodLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Level Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Name</em>' attribute.
	 * @see #setLevelName(String)
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getLikelihoodLevel_LevelName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLevelName();

	/**
	 * Sets the value of the '{@link RiskMatrixModel.LikelihoodLevel#getLevelName <em>Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Name</em>' attribute.
	 * @see #getLevelName()
	 * @generated
	 */
	void setLevelName(String value);

	/**
	 * Returns the value of the '<em><b>Level Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Index</em>' attribute.
	 * @see #setLevelIndex(int)
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getLikelihoodLevel_LevelIndex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getLevelIndex();

	/**
	 * Sets the value of the '{@link RiskMatrixModel.LikelihoodLevel#getLevelIndex <em>Level Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Index</em>' attribute.
	 * @see #getLevelIndex()
	 * @generated
	 */
	void setLevelIndex(int value);

	/**
	 * Returns the value of the '<em><b>Riskratinginstance</b></em>' reference list.
	 * The list contents are of type {@link RiskMatrixModel.RiskRatingInstance}.
	 * It is bidirectional and its opposite is '{@link RiskMatrixModel.RiskRatingInstance#getLikelihoodlevel <em>Likelihoodlevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Riskratinginstance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Riskratinginstance</em>' reference list.
	 * @see RiskMatrixModel.RiskMatrixModelPackage#getLikelihoodLevel_Riskratinginstance()
	 * @see RiskMatrixModel.RiskRatingInstance#getLikelihoodlevel
	 * @model opposite="likelihoodlevel" required="true"
	 * @generated
	 */
	EList<RiskRatingInstance> getRiskratinginstance();

} // LikelihoodLevel
