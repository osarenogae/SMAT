/**
 */
package careProcess_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.CareProcess#getName <em>Name</em>}</li>
 *   <li>{@link careProcess_model.CareProcess#getProcessGraph <em>Process Graph</em>}</li>
 *   <li>{@link careProcess_model.CareProcess#getProject <em>Project</em>}</li>
 *   <li>{@link careProcess_model.CareProcess#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getCareProcess()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Role'"
 * @generated
 */
public interface CareProcess extends EObject {
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
	 * @see careProcess_model.CareProcess_modelPackage#getCareProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link careProcess_model.CareProcess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Process Graph</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.processGraph#getCareProcess <em>Care Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Graph</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Graph</em>' containment reference.
	 * @see #setProcessGraph(processGraph)
	 * @see careProcess_model.CareProcess_modelPackage#getCareProcess_ProcessGraph()
	 * @see careProcess_model.processGraph#getCareProcess
	 * @model opposite="careProcess" containment="true" required="true"
	 * @generated
	 */
	processGraph getProcessGraph();

	/**
	 * Sets the value of the '{@link careProcess_model.CareProcess#getProcessGraph <em>Process Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Graph</em>' containment reference.
	 * @see #getProcessGraph()
	 * @generated
	 */
	void setProcessGraph(processGraph value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.Project#getCareProcesses <em>Care Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' container reference.
	 * @see #setProject(Project)
	 * @see careProcess_model.CareProcess_modelPackage#getCareProcess_Project()
	 * @see careProcess_model.Project#getCareProcesses
	 * @model opposite="careProcesses" required="true" transient="false"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link careProcess_model.CareProcess#getProject <em>Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' container reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

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
	 * @see careProcess_model.CareProcess_modelPackage#getCareProcess_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link careProcess_model.CareProcess#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // CareProcess
