/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.ReportData#getIssueDefinitions <em>Issue Definitions</em>}</li>
 *   <li>{@link careProcess_model.ReportData#getReportIntroductionText <em>Report Introduction Text</em>}</li>
 *   <li>{@link careProcess_model.ReportData#getCrmSystemText <em>Crm System Text</em>}</li>
 *   <li>{@link careProcess_model.ReportData#getSummarySafetyStatementText <em>Summary Safety Statement Text</em>}</li>
 *   <li>{@link careProcess_model.ReportData#getQaAndDocApprovalText <em>Qa And Doc Approval Text</em>}</li>
 *   <li>{@link careProcess_model.ReportData#getConfigurationControlText <em>Configuration Control Text</em>}</li>
 *   <li>{@link careProcess_model.ReportData#getReportTitleText <em>Report Title Text</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getReportData()
 * @model
 * @generated
 */
public interface ReportData extends EObject {
	/**
	 * Returns the value of the '<em><b>Issue Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.IssueDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Definitions</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getReportData_IssueDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueDefinition> getIssueDefinitions();

	/**
	 * Returns the value of the '<em><b>Report Introduction Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Introduction Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Introduction Text</em>' attribute.
	 * @see #setReportIntroductionText(String)
	 * @see careProcess_model.CareProcess_modelPackage#getReportData_ReportIntroductionText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getReportIntroductionText();

	/**
	 * Sets the value of the '{@link careProcess_model.ReportData#getReportIntroductionText <em>Report Introduction Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Introduction Text</em>' attribute.
	 * @see #getReportIntroductionText()
	 * @generated
	 */
	void setReportIntroductionText(String value);

	/**
	 * Returns the value of the '<em><b>Crm System Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crm System Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crm System Text</em>' attribute.
	 * @see #setCrmSystemText(String)
	 * @see careProcess_model.CareProcess_modelPackage#getReportData_CrmSystemText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCrmSystemText();

	/**
	 * Sets the value of the '{@link careProcess_model.ReportData#getCrmSystemText <em>Crm System Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crm System Text</em>' attribute.
	 * @see #getCrmSystemText()
	 * @generated
	 */
	void setCrmSystemText(String value);

	/**
	 * Returns the value of the '<em><b>Summary Safety Statement Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary Safety Statement Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary Safety Statement Text</em>' attribute.
	 * @see #setSummarySafetyStatementText(String)
	 * @see careProcess_model.CareProcess_modelPackage#getReportData_SummarySafetyStatementText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSummarySafetyStatementText();

	/**
	 * Sets the value of the '{@link careProcess_model.ReportData#getSummarySafetyStatementText <em>Summary Safety Statement Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary Safety Statement Text</em>' attribute.
	 * @see #getSummarySafetyStatementText()
	 * @generated
	 */
	void setSummarySafetyStatementText(String value);

	/**
	 * Returns the value of the '<em><b>Qa And Doc Approval Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qa And Doc Approval Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qa And Doc Approval Text</em>' attribute.
	 * @see #setQaAndDocApprovalText(String)
	 * @see careProcess_model.CareProcess_modelPackage#getReportData_QaAndDocApprovalText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getQaAndDocApprovalText();

	/**
	 * Sets the value of the '{@link careProcess_model.ReportData#getQaAndDocApprovalText <em>Qa And Doc Approval Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qa And Doc Approval Text</em>' attribute.
	 * @see #getQaAndDocApprovalText()
	 * @generated
	 */
	void setQaAndDocApprovalText(String value);

	/**
	 * Returns the value of the '<em><b>Configuration Control Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Control Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Control Text</em>' attribute.
	 * @see #setConfigurationControlText(String)
	 * @see careProcess_model.CareProcess_modelPackage#getReportData_ConfigurationControlText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getConfigurationControlText();

	/**
	 * Sets the value of the '{@link careProcess_model.ReportData#getConfigurationControlText <em>Configuration Control Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration Control Text</em>' attribute.
	 * @see #getConfigurationControlText()
	 * @generated
	 */
	void setConfigurationControlText(String value);

	/**
	 * Returns the value of the '<em><b>Report Title Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Title Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Title Text</em>' attribute.
	 * @see #setReportTitleText(String)
	 * @see careProcess_model.CareProcess_modelPackage#getReportData_ReportTitleText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getReportTitleText();

	/**
	 * Sets the value of the '{@link careProcess_model.ReportData#getReportTitleText <em>Report Title Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Title Text</em>' attribute.
	 * @see #getReportTitleText()
	 * @generated
	 */
	void setReportTitleText(String value);

} // ReportData
