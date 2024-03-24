/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.HazardEffect#getHazardeffects <em>Hazardeffects</em>}</li>
 *   <li>{@link careProcess_model.HazardEffect#getEffectDescription <em>Effect Description</em>}</li>
 *   <li>{@link careProcess_model.HazardEffect#getEffectName <em>Effect Name</em>}</li>
 *   <li>{@link careProcess_model.HazardEffect#getHazardcontrols <em>Hazardcontrols</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getHazardEffect()
 * @model
 * @generated
 */
public interface HazardEffect extends HazardFactor {
	/**
	 * Returns the value of the '<em><b>Hazardeffects</b></em>' reference list.
	 * The list contents are of type {@link careProcess_model.HazardEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazardeffects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardeffects</em>' reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getHazardEffect_Hazardeffects()
	 * @model
	 * @generated
	 */
	EList<HazardEffect> getHazardeffects();

	/**
	 * Returns the value of the '<em><b>Hazardcontrols</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.HazardControl}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.HazardControl#getHazardeffect <em>Hazardeffect</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazardcontrols</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardcontrols</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getHazardEffect_Hazardcontrols()
	 * @see careProcess_model.HazardControl#getHazardeffect
	 * @model opposite="hazardeffect" containment="true"
	 * @generated
	 */
	EList<HazardControl> getHazardcontrols();

	/**
	 * Returns the value of the '<em><b>Effect Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Description</em>' attribute.
	 * @see #setEffectDescription(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardEffect_EffectDescription()
	 * @model
	 * @generated
	 */
	String getEffectDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardEffect#getEffectDescription <em>Effect Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Description</em>' attribute.
	 * @see #getEffectDescription()
	 * @generated
	 */
	void setEffectDescription(String value);

	/**
	 * Returns the value of the '<em><b>Effect Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Name</em>' attribute.
	 * @see #setEffectName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardEffect_EffectName()
	 * @model
	 * @generated
	 */
	String getEffectName();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardEffect#getEffectName <em>Effect Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect Name</em>' attribute.
	 * @see #getEffectName()
	 * @generated
	 */
	void setEffectName(String value);

} // HazardEffect
