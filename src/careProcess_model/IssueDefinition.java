/**
 */
package careProcess_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.IssueDefinition#getIssueName <em>Issue Name</em>}</li>
 *   <li>{@link careProcess_model.IssueDefinition#getIssueDescription <em>Issue Description</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getIssueDefinition()
 * @model
 * @generated
 */
public interface IssueDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Issue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Name</em>' attribute.
	 * @see #setIssueName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getIssueDefinition_IssueName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getIssueName();

	/**
	 * Sets the value of the '{@link careProcess_model.IssueDefinition#getIssueName <em>Issue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Name</em>' attribute.
	 * @see #getIssueName()
	 * @generated
	 */
	void setIssueName(String value);

	/**
	 * Returns the value of the '<em><b>Issue Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Description</em>' attribute.
	 * @see #setIssueDescription(String)
	 * @see careProcess_model.CareProcess_modelPackage#getIssueDefinition_IssueDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getIssueDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.IssueDefinition#getIssueDescription <em>Issue Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Description</em>' attribute.
	 * @see #getIssueDescription()
	 * @generated
	 */
	void setIssueDescription(String value);

} // IssueDefinition
