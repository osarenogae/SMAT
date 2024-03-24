/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.Step#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link careProcess_model.Step#getStepTypeValue <em>Step Type Value</em>}</li>
 *   <li>{@link careProcess_model.Step#getName <em>Name</em>}</li>
 *   <li>{@link careProcess_model.Step#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.Step#getHazardInstances <em>Hazard Instances</em>}</li>
 *   <li>{@link careProcess_model.Step#getLocation <em>Location</em>}</li>
 *   <li>{@link careProcess_model.Step#getAssociatedSystemFunctions <em>Associated System Functions</em>}</li>
 *   <li>{@link careProcess_model.Step#getUUID <em>UUID</em>}</li>
 *   <li>{@link careProcess_model.Step#getProcessGraph <em>Process Graph</em>}</li>
 *   <li>{@link careProcess_model.Step#isHidden <em>Hidden</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getStep()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Step extends EObject{
	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link careProcess_model.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getStep_Successors()
	 * @model
	 * @generated
	 */
	EList<Step> getSuccessors();

	/**
	 * Returns the value of the '<em><b>Step Type Value</b></em>' attribute.
	 * The default value is <code>"ACTIVITY"</code>.
	 * The literals are from the enumeration {@link careProcess_model.stepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Type Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Type Value</em>' attribute.
	 * @see careProcess_model.stepType
	 * @see #setStepTypeValue(stepType)
	 * @see careProcess_model.CareProcess_modelPackage#getStep_StepTypeValue()
	 * @model default="ACTIVITY"
	 * @generated
	 */
	stepType getStepTypeValue();

	/**
	 * Sets the value of the '{@link careProcess_model.Step#getStepTypeValue <em>Step Type Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Type Value</em>' attribute.
	 * @see careProcess_model.stepType
	 * @see #getStepTypeValue()
	 * @generated
	 */
	void setStepTypeValue(stepType value);

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
	 * @see careProcess_model.CareProcess_modelPackage#getStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link careProcess_model.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see careProcess_model.CareProcess_modelPackage#getStep_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.Step#getDescription <em>Description</em>}' attribute.
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
	 * It is bidirectional and its opposite is '{@link careProcess_model.HazardInstance#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Instances</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Instances</em>' reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getStep_HazardInstances()
	 * @see careProcess_model.HazardInstance#getStep
	 * @model opposite="step"
	 * @generated
	 */
	EList<HazardInstance> getHazardInstances();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.LocationDefinition#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(LocationDefinition)
	 * @see careProcess_model.CareProcess_modelPackage#getStep_Location()
	 * @see careProcess_model.LocationDefinition#getSteps
	 * @model opposite="steps"
	 * @generated
	 */
	LocationDefinition getLocation();

	/**
	 * Sets the value of the '{@link careProcess_model.Step#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationDefinition value);

	/**
	 * Returns the value of the '<em><b>Associated System Functions</b></em>' reference list.
	 * The list contents are of type {@link careProcess_model.SystemFunction}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.SystemFunction#getAssociatedSteps <em>Associated Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated System Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated System Functions</em>' reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getStep_AssociatedSystemFunctions()
	 * @see careProcess_model.SystemFunction#getAssociatedSteps
	 * @model opposite="associatedSteps"
	 * @generated
	 */
	EList<SystemFunction> getAssociatedSystemFunctions();

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see careProcess_model.CareProcess_modelPackage#getStep_UUID()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link careProcess_model.Step#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

	/**
	 * Returns the value of the '<em><b>Process Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.processGraph#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Graph</em>' container reference.
	 * @see #setProcessGraph(processGraph)
	 * @see careProcess_model.CareProcess_modelPackage#getStep_ProcessGraph()
	 * @see careProcess_model.processGraph#getStep
	 * @model opposite="step" required="true" transient="false"
	 * @generated
	 */
	processGraph getProcessGraph();

	/**
	 * Sets the value of the '{@link careProcess_model.Step#getProcessGraph <em>Process Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Graph</em>' container reference.
	 * @see #getProcessGraph()
	 * @generated
	 */
	void setProcessGraph(processGraph value);

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(boolean)
	 * @see careProcess_model.CareProcess_modelPackage#getStep_Hidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link careProcess_model.Step#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

} // Step
