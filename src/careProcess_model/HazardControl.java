/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.HazardControl#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.HazardControl#getName <em>Name</em>}</li>
 *   <li>{@link careProcess_model.HazardControl#getControlState <em>Control State</em>}</li>
 *   <li>{@link careProcess_model.HazardControl#getControlTypes <em>Control Types</em>}</li>
 *   <li>{@link careProcess_model.HazardControl#getOtherText <em>Other Text</em>}</li>
 *   <li>{@link careProcess_model.HazardControl#getHazardcause <em>Hazardcause</em>}</li>
 *   <li>{@link careProcess_model.HazardControl#getHazardeffect <em>Hazardeffect</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getHazardControl()
 * @model
 * @generated
 */
public interface HazardControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardControl_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardControl#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardControl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardControl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Control State</b></em>' attribute.
	 * The literals are from the enumeration {@link careProcess_model.ControlStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control State</em>' attribute.
	 * @see careProcess_model.ControlStateEnum
	 * @see #setControlState(ControlStateEnum)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardControl_ControlState()
	 * @model
	 * @generated
	 */
	ControlStateEnum getControlState();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardControl#getControlState <em>Control State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control State</em>' attribute.
	 * @see careProcess_model.ControlStateEnum
	 * @see #getControlState()
	 * @generated
	 */
	void setControlState(ControlStateEnum value);

	/**
	 * Returns the value of the '<em><b>Control Types</b></em>' attribute list.
	 * The list contents are of type {@link careProcess_model.ControlTypeEnum}.
	 * The literals are from the enumeration {@link careProcess_model.ControlTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Types</em>' attribute list.
	 * @see careProcess_model.ControlTypeEnum
	 * @see careProcess_model.CareProcess_modelPackage#getHazardControl_ControlTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ControlTypeEnum> getControlTypes();

	/**
	 * Returns the value of the '<em><b>Other Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Text</em>' attribute.
	 * @see #setOtherText(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardControl_OtherText()
	 * @model
	 * @generated
	 */
	String getOtherText();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardControl#getOtherText <em>Other Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Text</em>' attribute.
	 * @see #getOtherText()
	 * @generated
	 */
	void setOtherText(String value);

	/**
	 * Returns the value of the '<em><b>Hazardcause</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.HazardCause#getHazardcontrols <em>Hazardcontrols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazardcause</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardcause</em>' container reference.
	 * @see #setHazardcause(HazardCause)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardControl_Hazardcause()
	 * @see careProcess_model.HazardCause#getHazardcontrols
	 * @model opposite="hazardcontrols" transient="false"
	 * @generated
	 */
	HazardCause getHazardcause();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardControl#getHazardcause <em>Hazardcause</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardcause</em>' container reference.
	 * @see #getHazardcause()
	 * @generated
	 */
	void setHazardcause(HazardCause value);

	/**
	 * Returns the value of the '<em><b>Hazardeffect</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.HazardEffect#getHazardcontrols <em>Hazardcontrols</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazardeffect</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardeffect</em>' container reference.
	 * @see #setHazardeffect(HazardEffect)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardControl_Hazardeffect()
	 * @see careProcess_model.HazardEffect#getHazardcontrols
	 * @model opposite="hazardcontrols" transient="false"
	 * @generated
	 */
	HazardEffect getHazardeffect();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardControl#getHazardeffect <em>Hazardeffect</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardeffect</em>' container reference.
	 * @see #getHazardeffect()
	 * @generated
	 */
	void setHazardeffect(HazardEffect value);

} // HazardControl
