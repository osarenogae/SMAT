/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.HazardDefinition#getHazardName <em>Hazard Name</em>}</li>
 *   <li>{@link careProcess_model.HazardDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.HazardDefinition#getHazardInstances <em>Hazard Instances</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getHazardDefinition()
 * @model
 * @generated
 */
public interface HazardDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Hazard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Name</em>' attribute.
	 * @see #setHazardName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardDefinition_HazardName()
	 * @model ordered="false"
	 * @generated
	 */
	String getHazardName();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardDefinition#getHazardName <em>Hazard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Name</em>' attribute.
	 * @see #getHazardName()
	 * @generated
	 */
	void setHazardName(String value);

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
	 * @see careProcess_model.CareProcess_modelPackage#getHazardDefinition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Hazard Instances</b></em>' reference list.
	 * The list contents are of type {@link careProcess_model.HazardInstance}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.HazardInstance#getHazardDefinition <em>Hazard Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Instances</em>' reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getHazardDefinition_HazardInstances()
	 * @see careProcess_model.HazardInstance#getHazardDefinition
	 * @model opposite="hazardDefinition"
	 * @generated
	 */
	EList<HazardInstance> getHazardInstances();

} // HazardDefinition
