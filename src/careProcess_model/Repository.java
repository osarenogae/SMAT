/**
 */
package careProcess_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.Repository#getRepositoryName <em>Repository Name</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getRepository()
 * @model abstract="true"
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Name</em>' attribute.
	 * @see #setRepositoryName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getRepository_RepositoryName()
	 * @model
	 * @generated
	 */
	String getRepositoryName();

	/**
	 * Sets the value of the '{@link careProcess_model.Repository#getRepositoryName <em>Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Name</em>' attribute.
	 * @see #getRepositoryName()
	 * @generated
	 */
	void setRepositoryName(String value);

} // Repository
