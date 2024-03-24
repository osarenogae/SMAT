/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.LocationDefinition#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link careProcess_model.LocationDefinition#getMnemonicName <em>Mnemonic Name</em>}</li>
 *   <li>{@link careProcess_model.LocationDefinition#getSteps <em>Steps</em>}</li>
 *   <li>{@link careProcess_model.LocationDefinition#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getLocationDefinition()
 * @model
 * @generated
 */
public interface LocationDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Location Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Name</em>' attribute.
	 * @see #setLocationName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getLocationDefinition_LocationName()
	 * @model ordered="false"
	 * @generated
	 */
	String getLocationName();

	/**
	 * Sets the value of the '{@link careProcess_model.LocationDefinition#getLocationName <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Name</em>' attribute.
	 * @see #getLocationName()
	 * @generated
	 */
	void setLocationName(String value);

	/**
	 * Returns the value of the '<em><b>Mnemonic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mnemonic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mnemonic Name</em>' attribute.
	 * @see #setMnemonicName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getLocationDefinition_MnemonicName()
	 * @model
	 * @generated
	 */
	String getMnemonicName();

	/**
	 * Sets the value of the '{@link careProcess_model.LocationDefinition#getMnemonicName <em>Mnemonic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mnemonic Name</em>' attribute.
	 * @see #getMnemonicName()
	 * @generated
	 */
	void setMnemonicName(String value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' reference list.
	 * The list contents are of type {@link careProcess_model.Step}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.Step#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getLocationDefinition_Steps()
	 * @see careProcess_model.Step#getLocation
	 * @model opposite="location"
	 * @generated
	 */
	EList<Step> getSteps();

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
	 * @see careProcess_model.CareProcess_modelPackage#getLocationDefinition_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.LocationDefinition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // LocationDefinition
