/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.HazardCause#getHazardcauses <em>Hazardcauses</em>}</li>
 *   <li>{@link careProcess_model.HazardCause#getCauseName <em>Cause Name</em>}</li>
 *   <li>{@link careProcess_model.HazardCause#getCauseDescription <em>Cause Description</em>}</li>
 *   <li>{@link careProcess_model.HazardCause#getHazardcontrols <em>Hazardcontrols</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getHazardCause()
 * @model
 * @generated
 */
public interface HazardCause extends HazardFactor {
	/**
	 * Returns the value of the '<em><b>Hazardcauses</b></em>' reference list.
	 * The list contents are of type {@link careProcess_model.HazardCause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazardcauses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardcauses</em>' reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getHazardCause_Hazardcauses()
	 * @model
	 * @generated
	 */
	EList<HazardCause> getHazardcauses();

	/**
	 * Returns the value of the '<em><b>Hazardcontrols</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.HazardControl}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.HazardControl#getHazardcause <em>Hazardcause</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazardcontrols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardcontrols</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getHazardCause_Hazardcontrols()
	 * @see careProcess_model.HazardControl#getHazardcause
	 * @model opposite="hazardcause" containment="true"
	 * @generated
	 */
	EList<HazardControl> getHazardcontrols();

	/**
	 * Returns the value of the '<em><b>Cause Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause Name</em>' attribute.
	 * @see #setCauseName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardCause_CauseName()
	 * @model
	 * @generated
	 */
	String getCauseName();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardCause#getCauseName <em>Cause Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause Name</em>' attribute.
	 * @see #getCauseName()
	 * @generated
	 */
	void setCauseName(String value);

	/**
	 * Returns the value of the '<em><b>Cause Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause Description</em>' attribute.
	 * @see #setCauseDescription(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardCause_CauseDescription()
	 * @model
	 * @generated
	 */
	String getCauseDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardCause#getCauseDescription <em>Cause Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause Description</em>' attribute.
	 * @see #getCauseDescription()
	 * @generated
	 */
	void setCauseDescription(String value);

} // HazardCause
