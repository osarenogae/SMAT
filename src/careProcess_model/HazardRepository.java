/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.HazardRepository#getHazardDefinitions <em>Hazard Definitions</em>}</li>
 *   <li>{@link careProcess_model.HazardRepository#getHazardInstances <em>Hazard Instances</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getHazardRepository()
 * @model
 * @generated
 */
public interface HazardRepository extends Repository {
	/**
	 * Returns the value of the '<em><b>Hazard Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.HazardDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Definitions</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getHazardRepository_HazardDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<HazardDefinition> getHazardDefinitions();

	/**
	 * Returns the value of the '<em><b>Hazard Instances</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.HazardInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Instances</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getHazardRepository_HazardInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<HazardInstance> getHazardInstances();

} // HazardRepository
