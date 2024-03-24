/**
 */
package careProcess_model;

import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.Project#getCareProcesses <em>Care Processes</em>}</li>
 *   <li>{@link careProcess_model.Project#getDatastore <em>Datastore</em>}</li>
 *   <li>{@link careProcess_model.Project#getDateModified <em>Date Modified</em>}</li>
 *   <li>{@link careProcess_model.Project#getAcceptableHazardDefinition <em>Acceptable Hazard Definition</em>}</li>
 *   <li>{@link careProcess_model.Project#getCreatedWithAppVersion <em>Created With App Version</em>}</li>
 *   <li>{@link careProcess_model.Project#getRiskMatrixData <em>Risk Matrix Data</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Datastore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datastore</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datastore</em>' containment reference.
	 * @see #setDatastore(DataStore)
	 * @see careProcess_model.CareProcess_modelPackage#getProject_Datastore()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataStore getDatastore();

	/**
	 * Sets the value of the '{@link careProcess_model.Project#getDatastore <em>Datastore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datastore</em>' containment reference.
	 * @see #getDatastore()
	 * @generated
	 */
	void setDatastore(DataStore value);

	/**
	 * Returns the value of the '<em><b>Date Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Modified</em>' attribute.
	 * @see #setDateModified(XMLGregorianCalendar)
	 * @see careProcess_model.CareProcess_modelPackage#getProject_DateModified()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getDateModified();

	/**
	 * Sets the value of the '{@link careProcess_model.Project#getDateModified <em>Date Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Modified</em>' attribute.
	 * @see #getDateModified()
	 * @generated
	 */
	void setDateModified(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Acceptable Hazard Definition</b></em>' attribute.
	 * The default value is <code>"Accepted: Clinical risk meeting acceptance criteria or outweighed by clinical benefits"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptable Hazard Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptable Hazard Definition</em>' attribute.
	 * @see #setAcceptableHazardDefinition(String)
	 * @see careProcess_model.CareProcess_modelPackage#getProject_AcceptableHazardDefinition()
	 * @model default="Accepted: Clinical risk meeting acceptance criteria or outweighed by clinical benefits" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getAcceptableHazardDefinition();

	/**
	 * Sets the value of the '{@link careProcess_model.Project#getAcceptableHazardDefinition <em>Acceptable Hazard Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptable Hazard Definition</em>' attribute.
	 * @see #getAcceptableHazardDefinition()
	 * @generated
	 */
	void setAcceptableHazardDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Created With App Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created With App Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created With App Version</em>' attribute.
	 * @see #setCreatedWithAppVersion(String)
	 * @see careProcess_model.CareProcess_modelPackage#getProject_CreatedWithAppVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getCreatedWithAppVersion();

	/**
	 * Sets the value of the '{@link careProcess_model.Project#getCreatedWithAppVersion <em>Created With App Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created With App Version</em>' attribute.
	 * @see #getCreatedWithAppVersion()
	 * @generated
	 */
	void setCreatedWithAppVersion(String value);

	/**
	 * Returns the value of the '<em><b>Risk Matrix Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Matrix Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Matrix Data</em>' attribute.
	 * @see #setRiskMatrixData(String)
	 * @see careProcess_model.CareProcess_modelPackage#getProject_RiskMatrixData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRiskMatrixData();

	/**
	 * Sets the value of the '{@link careProcess_model.Project#getRiskMatrixData <em>Risk Matrix Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Matrix Data</em>' attribute.
	 * @see #getRiskMatrixData()
	 * @generated
	 */
	void setRiskMatrixData(String value);

	/**
	 * Returns the value of the '<em><b>Care Processes</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.CareProcess}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.CareProcess#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Processes</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getProject_CareProcesses()
	 * @see careProcess_model.CareProcess#getProject
	 * @model opposite="project" containment="true"
	 * @generated
	 */
	EList<CareProcess> getCareProcesses();

} // Project
