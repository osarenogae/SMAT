/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.SystemRepository#getSystemDefinitions <em>System Definitions</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getSystemRepository()
 * @model
 * @generated
 */
public interface SystemRepository extends Repository {
	/**
	 * Returns the value of the '<em><b>System Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.SystemDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Definitions</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getSystemRepository_SystemDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemDefinition> getSystemDefinitions();

} // SystemRepository
