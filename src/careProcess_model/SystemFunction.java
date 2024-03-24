/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.SystemFunction#getHazardInstances <em>Hazard Instances</em>}</li>
 *   <li>{@link careProcess_model.SystemFunction#getSystemDefinition <em>System Definition</em>}</li>
 *   <li>{@link careProcess_model.SystemFunction#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link careProcess_model.SystemFunction#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.SystemFunction#getAssociatedSteps <em>Associated Steps</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getSystemFunction()
 * @model
 * @generated
 */
public interface SystemFunction extends EObject {
	/**
	 * Returns the value of the '<em><b>Hazard Instances</b></em>' reference list.
	 * The list contents are of type {@link careProcess_model.HazardInstance}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.HazardInstance#getSystemFunction <em>System Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Instances</em>' reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getSystemFunction_HazardInstances()
	 * @see careProcess_model.HazardInstance#getSystemFunction
	 * @model opposite="systemFunction"
	 * @generated
	 */
	EList<HazardInstance> getHazardInstances();

	/**
	 * Returns the value of the '<em><b>System Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.SystemDefinition#getSystemFunctions <em>System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Definition</em>' container reference.
	 * @see #setSystemDefinition(SystemDefinition)
	 * @see careProcess_model.CareProcess_modelPackage#getSystemFunction_SystemDefinition()
	 * @see careProcess_model.SystemDefinition#getSystemFunctions
	 * @model opposite="systemFunctions" required="true" transient="false"
	 * @generated
	 */
	SystemDefinition getSystemDefinition();

	/**
	 * Sets the value of the '{@link careProcess_model.SystemFunction#getSystemDefinition <em>System Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Definition</em>' container reference.
	 * @see #getSystemDefinition()
	 * @generated
	 */
	void setSystemDefinition(SystemDefinition value);

	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see careProcess_model.CareProcess_modelPackage#getSystemFunction_FunctionName()
	 * @model
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link careProcess_model.SystemFunction#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

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
	 * @see careProcess_model.CareProcess_modelPackage#getSystemFunction_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.SystemFunction#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Associated Steps</b></em>' reference list.
	 * The list contents are of type {@link careProcess_model.Step}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.Step#getAssociatedSystemFunctions <em>Associated System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Steps</em>' reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getSystemFunction_AssociatedSteps()
	 * @see careProcess_model.Step#getAssociatedSystemFunctions
	 * @model opposite="associatedSystemFunctions"
	 * @generated
	 */
	EList<Step> getAssociatedSteps();

} // SystemFunction
