/**
 */
package careProcess_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see careProcess_model.CareProcess_modelPackage
 * @generated
 */
public interface CareProcess_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CareProcess_modelFactory eINSTANCE = careProcess_model.impl.CareProcess_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>process Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>process Graph</em>'.
	 * @generated
	 */
	processGraph createprocessGraph();

	/**
	 * Returns a new object of class '<em>System Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Function</em>'.
	 * @generated
	 */
	SystemFunction createSystemFunction();

	/**
	 * Returns a new object of class '<em>Care Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Care Process</em>'.
	 * @generated
	 */
	CareProcess createCareProcess();

	/**
	 * Returns a new object of class '<em>Hazard Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Instance</em>'.
	 * @generated
	 */
	HazardInstance createHazardInstance();

	/**
	 * Returns a new object of class '<em>Hazard Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Control</em>'.
	 * @generated
	 */
	HazardControl createHazardControl();

	/**
	 * Returns a new object of class '<em>Hazard Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Cause</em>'.
	 * @generated
	 */
	HazardCause createHazardCause();

	/**
	 * Returns a new object of class '<em>Hazard Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Effect</em>'.
	 * @generated
	 */
	HazardEffect createHazardEffect();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision</em>'.
	 * @generated
	 */
	Decision createDecision();

	/**
	 * Returns a new object of class '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start</em>'.
	 * @generated
	 */
	Start createStart();

	/**
	 * Returns a new object of class '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop</em>'.
	 * @generated
	 */
	Stop createStop();

	/**
	 * Returns a new object of class '<em>Hazard Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Repository</em>'.
	 * @generated
	 */
	HazardRepository createHazardRepository();

	/**
	 * Returns a new object of class '<em>Hazard Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Definition</em>'.
	 * @generated
	 */
	HazardDefinition createHazardDefinition();

	/**
	 * Returns a new object of class '<em>Location Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Repository</em>'.
	 * @generated
	 */
	LocationRepository createLocationRepository();

	/**
	 * Returns a new object of class '<em>Location Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Definition</em>'.
	 * @generated
	 */
	LocationDefinition createLocationDefinition();

	/**
	 * Returns a new object of class '<em>System Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Repository</em>'.
	 * @generated
	 */
	SystemRepository createSystemRepository();

	/**
	 * Returns a new object of class '<em>System Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Definition</em>'.
	 * @generated
	 */
	SystemDefinition createSystemDefinition();

	/**
	 * Returns a new object of class '<em>Data Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Store</em>'.
	 * @generated
	 */
	DataStore createDataStore();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Report Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Data</em>'.
	 * @generated
	 */
	ReportData createReportData();

	/**
	 * Returns a new object of class '<em>Issue Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Definition</em>'.
	 * @generated
	 */
	IssueDefinition createIssueDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CareProcess_modelPackage getCareProcess_modelPackage();

} //CareProcess_modelFactory
