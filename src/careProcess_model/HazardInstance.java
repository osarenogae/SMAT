/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A functional hazard is a hazard definition associated with the clinical context in which it occurs. The instances of FunctionalHazard must be associated with one HazardDefinition instance and one instance of a class implementing the Step abstract type. By association with a HazardDefinition instance, the FunctionalHazard instance is indirectly associated with one or more system functions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.HazardInstance#getInitialLikelihood <em>Initial Likelihood</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getInitialSeverity <em>Initial Severity</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getStep <em>Step</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getHazardDefinition <em>Hazard Definition</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getStatus <em>Status</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getSystemFunction <em>System Function</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getResidualLikelihood <em>Residual Likelihood</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getResidualSeverity <em>Residual Severity</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getInitialRiskRating <em>Initial Risk Rating</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getResidualRiskRating <em>Residual Risk Rating</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getOwner <em>Owner</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getSummary <em>Summary</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getHazardcauses <em>Hazardcauses</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getHazardeffects <em>Hazardeffects</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getClinicalJustification <em>Clinical Justification</em>}</li>
 *   <li>{@link careProcess_model.HazardInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Role'"
 * @generated
 */
public interface HazardInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Initial Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Likelihood</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Likelihood</em>' attribute.
	 * @see #setInitialLikelihood(int)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_InitialLikelihood()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" ordered="false"
	 * @generated
	 */
	int getInitialLikelihood();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getInitialLikelihood <em>Initial Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Likelihood</em>' attribute.
	 * @see #getInitialLikelihood()
	 * @generated
	 */
	void setInitialLikelihood(int value);

	/**
	 * Returns the value of the '<em><b>Initial Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Severity</em>' attribute.
	 * @see #setInitialSeverity(int)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_InitialSeverity()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Int" ordered="false"
	 * @generated
	 */
	int getInitialSeverity();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getInitialSeverity <em>Initial Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Severity</em>' attribute.
	 * @see #getInitialSeverity()
	 * @generated
	 */
	void setInitialSeverity(int value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.Step#getHazardInstances <em>Hazard Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(Step)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_Step()
	 * @see careProcess_model.Step#getHazardInstances
	 * @model opposite="hazardInstances" required="true"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

	/**
	 * Returns the value of the '<em><b>Hazard Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.HazardDefinition#getHazardInstances <em>Hazard Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Definition</em>' reference.
	 * @see #setHazardDefinition(HazardDefinition)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_HazardDefinition()
	 * @see careProcess_model.HazardDefinition#getHazardInstances
	 * @model opposite="hazardInstances" required="true"
	 * @generated
	 */
	HazardDefinition getHazardDefinition();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getHazardDefinition <em>Hazard Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Definition</em>' reference.
	 * @see #getHazardDefinition()
	 * @generated
	 */
	void setHazardDefinition(HazardDefinition value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>System Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.SystemFunction#getHazardInstances <em>Hazard Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Function</em>' reference.
	 * @see #setSystemFunction(SystemFunction)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_SystemFunction()
	 * @see careProcess_model.SystemFunction#getHazardInstances
	 * @model opposite="hazardInstances"
	 * @generated
	 */
	SystemFunction getSystemFunction();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getSystemFunction <em>System Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Function</em>' reference.
	 * @see #getSystemFunction()
	 * @generated
	 */
	void setSystemFunction(SystemFunction value);

	/**
	 * Returns the value of the '<em><b>Residual Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residual Likelihood</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residual Likelihood</em>' attribute.
	 * @see #setResidualLikelihood(int)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_ResidualLikelihood()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getResidualLikelihood();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getResidualLikelihood <em>Residual Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residual Likelihood</em>' attribute.
	 * @see #getResidualLikelihood()
	 * @generated
	 */
	void setResidualLikelihood(int value);

	/**
	 * Returns the value of the '<em><b>Residual Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residual Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residual Severity</em>' attribute.
	 * @see #setResidualSeverity(int)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_ResidualSeverity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getResidualSeverity();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getResidualSeverity <em>Residual Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residual Severity</em>' attribute.
	 * @see #getResidualSeverity()
	 * @generated
	 */
	void setResidualSeverity(int value);

	/**
	 * Returns the value of the '<em><b>Initial Risk Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Risk Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Risk Rating</em>' attribute.
	 * @see #setInitialRiskRating(int)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_InitialRiskRating()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getInitialRiskRating();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getInitialRiskRating <em>Initial Risk Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Risk Rating</em>' attribute.
	 * @see #getInitialRiskRating()
	 * @generated
	 */
	void setInitialRiskRating(int value);

	/**
	 * Returns the value of the '<em><b>Residual Risk Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residual Risk Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residual Risk Rating</em>' attribute.
	 * @see #setResidualRiskRating(int)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_ResidualRiskRating()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getResidualRiskRating();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getResidualRiskRating <em>Residual Risk Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Residual Risk Rating</em>' attribute.
	 * @see #getResidualRiskRating()
	 * @generated
	 */
	void setResidualRiskRating(int value);

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
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Hazardcauses</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.HazardCause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazardcauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardcauses</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_Hazardcauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<HazardCause> getHazardcauses();

	/**
	 * Returns the value of the '<em><b>Hazardeffects</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.HazardEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazardeffects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardeffects</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_Hazardeffects()
	 * @model containment="true"
	 * @generated
	 */
	EList<HazardEffect> getHazardeffects();

	/**
	 * Returns the value of the '<em><b>Clinical Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Justification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Justification</em>' attribute.
	 * @see #setClinicalJustification(String)
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_ClinicalJustification()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getClinicalJustification();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getClinicalJustification <em>Clinical Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Justification</em>' attribute.
	 * @see #getClinicalJustification()
	 * @generated
	 */
	void setClinicalJustification(String value);

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
	 * @see careProcess_model.CareProcess_modelPackage#getHazardInstance_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link careProcess_model.HazardInstance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // HazardInstance
