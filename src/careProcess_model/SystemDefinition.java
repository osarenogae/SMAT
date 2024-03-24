/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.SystemDefinition#getSystemName <em>System Name</em>}</li>
 *   <li>{@link careProcess_model.SystemDefinition#getMnemonicName <em>Mnemonic Name</em>}</li>
 *   <li>{@link careProcess_model.SystemDefinition#getSystemFunctions <em>System Functions</em>}</li>
 *   <li>{@link careProcess_model.SystemDefinition#getSystemVersion <em>System Version</em>}</li>
 *   <li>{@link careProcess_model.SystemDefinition#getSystemDescription <em>System Description</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getSystemDefinition()
 * @model
 * @generated
 */
public interface SystemDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getSystemDefinition_SystemName()
	 * @model ordered="false"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link careProcess_model.SystemDefinition#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

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
	 * @see careProcess_model.CareProcess_modelPackage#getSystemDefinition_MnemonicName()
	 * @model
	 * @generated
	 */
	String getMnemonicName();

	/**
	 * Sets the value of the '{@link careProcess_model.SystemDefinition#getMnemonicName <em>Mnemonic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mnemonic Name</em>' attribute.
	 * @see #getMnemonicName()
	 * @generated
	 */
	void setMnemonicName(String value);

	/**
	 * Returns the value of the '<em><b>System Functions</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.SystemFunction}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.SystemFunction#getSystemDefinition <em>System Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Functions</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getSystemDefinition_SystemFunctions()
	 * @see careProcess_model.SystemFunction#getSystemDefinition
	 * @model opposite="systemDefinition" containment="true" required="true"
	 * @generated
	 */
	EList<SystemFunction> getSystemFunctions();

	/**
	 * Returns the value of the '<em><b>System Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Version</em>' attribute.
	 * @see #setSystemVersion(String)
	 * @see careProcess_model.CareProcess_modelPackage#getSystemDefinition_SystemVersion()
	 * @model
	 * @generated
	 */
	String getSystemVersion();

	/**
	 * Sets the value of the '{@link careProcess_model.SystemDefinition#getSystemVersion <em>System Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Version</em>' attribute.
	 * @see #getSystemVersion()
	 * @generated
	 */
	void setSystemVersion(String value);

	/**
	 * Returns the value of the '<em><b>System Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Description</em>' attribute.
	 * @see #setSystemDescription(String)
	 * @see careProcess_model.CareProcess_modelPackage#getSystemDefinition_SystemDescription()
	 * @model
	 * @generated
	 */
	String getSystemDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.SystemDefinition#getSystemDescription <em>System Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Description</em>' attribute.
	 * @see #getSystemDescription()
	 * @generated
	 */
	void setSystemDescription(String value);

} // SystemDefinition
