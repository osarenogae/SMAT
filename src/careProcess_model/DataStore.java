/**
 */
package careProcess_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.DataStore#getLocationrepository <em>Locationrepository</em>}</li>
 *   <li>{@link careProcess_model.DataStore#getSystemrepository <em>Systemrepository</em>}</li>
 *   <li>{@link careProcess_model.DataStore#getHazardrepository <em>Hazardrepository</em>}</li>
 *   <li>{@link careProcess_model.DataStore#getReportData <em>Report Data</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getDataStore()
 * @model
 * @generated
 */
public interface DataStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Locationrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locationrepository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locationrepository</em>' containment reference.
	 * @see #setLocationrepository(LocationRepository)
	 * @see careProcess_model.CareProcess_modelPackage#getDataStore_Locationrepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LocationRepository getLocationrepository();

	/**
	 * Sets the value of the '{@link careProcess_model.DataStore#getLocationrepository <em>Locationrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locationrepository</em>' containment reference.
	 * @see #getLocationrepository()
	 * @generated
	 */
	void setLocationrepository(LocationRepository value);

	/**
	 * Returns the value of the '<em><b>Systemrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemrepository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemrepository</em>' containment reference.
	 * @see #setSystemrepository(SystemRepository)
	 * @see careProcess_model.CareProcess_modelPackage#getDataStore_Systemrepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SystemRepository getSystemrepository();

	/**
	 * Sets the value of the '{@link careProcess_model.DataStore#getSystemrepository <em>Systemrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemrepository</em>' containment reference.
	 * @see #getSystemrepository()
	 * @generated
	 */
	void setSystemrepository(SystemRepository value);

	/**
	 * Returns the value of the '<em><b>Hazardrepository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazardrepository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardrepository</em>' containment reference.
	 * @see #setHazardrepository(HazardRepository)
	 * @see careProcess_model.CareProcess_modelPackage#getDataStore_Hazardrepository()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HazardRepository getHazardrepository();

	/**
	 * Sets the value of the '{@link careProcess_model.DataStore#getHazardrepository <em>Hazardrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazardrepository</em>' containment reference.
	 * @see #getHazardrepository()
	 * @generated
	 */
	void setHazardrepository(HazardRepository value);

	/**
	 * Returns the value of the '<em><b>Report Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Data</em>' containment reference.
	 * @see #setReportData(ReportData)
	 * @see careProcess_model.CareProcess_modelPackage#getDataStore_ReportData()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReportData getReportData();

	/**
	 * Sets the value of the '{@link careProcess_model.DataStore#getReportData <em>Report Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Data</em>' containment reference.
	 * @see #getReportData()
	 * @generated
	 */
	void setReportData(ReportData value);

} // DataStore
