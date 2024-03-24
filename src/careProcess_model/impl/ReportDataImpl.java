/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.IssueDefinition;
import careProcess_model.ReportData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.ReportDataImpl#getIssueDefinitions <em>Issue Definitions</em>}</li>
 *   <li>{@link careProcess_model.impl.ReportDataImpl#getReportIntroductionText <em>Report Introduction Text</em>}</li>
 *   <li>{@link careProcess_model.impl.ReportDataImpl#getCrmSystemText <em>Crm System Text</em>}</li>
 *   <li>{@link careProcess_model.impl.ReportDataImpl#getSummarySafetyStatementText <em>Summary Safety Statement Text</em>}</li>
 *   <li>{@link careProcess_model.impl.ReportDataImpl#getQaAndDocApprovalText <em>Qa And Doc Approval Text</em>}</li>
 *   <li>{@link careProcess_model.impl.ReportDataImpl#getConfigurationControlText <em>Configuration Control Text</em>}</li>
 *   <li>{@link careProcess_model.impl.ReportDataImpl#getReportTitleText <em>Report Title Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportDataImpl extends MinimalEObjectImpl.Container implements ReportData {
	/**
	 * The cached value of the '{@link #getIssueDefinitions() <em>Issue Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueDefinition> issueDefinitions;

	/**
	 * The default value of the '{@link #getReportIntroductionText() <em>Report Introduction Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportIntroductionText()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORT_INTRODUCTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportIntroductionText() <em>Report Introduction Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportIntroductionText()
	 * @generated
	 * @ordered
	 */
	protected String reportIntroductionText = REPORT_INTRODUCTION_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrmSystemText() <em>Crm System Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrmSystemText()
	 * @generated
	 * @ordered
	 */
	protected static final String CRM_SYSTEM_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrmSystemText() <em>Crm System Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrmSystemText()
	 * @generated
	 * @ordered
	 */
	protected String crmSystemText = CRM_SYSTEM_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummarySafetyStatementText() <em>Summary Safety Statement Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummarySafetyStatementText()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_SAFETY_STATEMENT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummarySafetyStatementText() <em>Summary Safety Statement Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummarySafetyStatementText()
	 * @generated
	 * @ordered
	 */
	protected String summarySafetyStatementText = SUMMARY_SAFETY_STATEMENT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQaAndDocApprovalText() <em>Qa And Doc Approval Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQaAndDocApprovalText()
	 * @generated
	 * @ordered
	 */
	protected static final String QA_AND_DOC_APPROVAL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQaAndDocApprovalText() <em>Qa And Doc Approval Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQaAndDocApprovalText()
	 * @generated
	 * @ordered
	 */
	protected String qaAndDocApprovalText = QA_AND_DOC_APPROVAL_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationControlText() <em>Configuration Control Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationControlText()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_CONTROL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationControlText() <em>Configuration Control Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationControlText()
	 * @generated
	 * @ordered
	 */
	protected String configurationControlText = CONFIGURATION_CONTROL_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReportTitleText() <em>Report Title Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportTitleText()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORT_TITLE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportTitleText() <em>Report Title Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportTitleText()
	 * @generated
	 * @ordered
	 */
	protected String reportTitleText = REPORT_TITLE_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.REPORT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssueDefinition> getIssueDefinitions() {
		if (issueDefinitions == null) {
			issueDefinitions = new EObjectContainmentEList<IssueDefinition>(IssueDefinition.class, this, CareProcess_modelPackage.REPORT_DATA__ISSUE_DEFINITIONS);
		}
		return issueDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReportIntroductionText() {
		return reportIntroductionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportIntroductionText(String newReportIntroductionText) {
		String oldReportIntroductionText = reportIntroductionText;
		reportIntroductionText = newReportIntroductionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.REPORT_DATA__REPORT_INTRODUCTION_TEXT, oldReportIntroductionText, reportIntroductionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrmSystemText() {
		return crmSystemText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrmSystemText(String newCrmSystemText) {
		String oldCrmSystemText = crmSystemText;
		crmSystemText = newCrmSystemText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.REPORT_DATA__CRM_SYSTEM_TEXT, oldCrmSystemText, crmSystemText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummarySafetyStatementText() {
		return summarySafetyStatementText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummarySafetyStatementText(String newSummarySafetyStatementText) {
		String oldSummarySafetyStatementText = summarySafetyStatementText;
		summarySafetyStatementText = newSummarySafetyStatementText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.REPORT_DATA__SUMMARY_SAFETY_STATEMENT_TEXT, oldSummarySafetyStatementText, summarySafetyStatementText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQaAndDocApprovalText() {
		return qaAndDocApprovalText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQaAndDocApprovalText(String newQaAndDocApprovalText) {
		String oldQaAndDocApprovalText = qaAndDocApprovalText;
		qaAndDocApprovalText = newQaAndDocApprovalText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.REPORT_DATA__QA_AND_DOC_APPROVAL_TEXT, oldQaAndDocApprovalText, qaAndDocApprovalText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationControlText() {
		return configurationControlText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationControlText(String newConfigurationControlText) {
		String oldConfigurationControlText = configurationControlText;
		configurationControlText = newConfigurationControlText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.REPORT_DATA__CONFIGURATION_CONTROL_TEXT, oldConfigurationControlText, configurationControlText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReportTitleText() {
		return reportTitleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportTitleText(String newReportTitleText) {
		String oldReportTitleText = reportTitleText;
		reportTitleText = newReportTitleText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.REPORT_DATA__REPORT_TITLE_TEXT, oldReportTitleText, reportTitleText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.REPORT_DATA__ISSUE_DEFINITIONS:
				return ((InternalEList<?>)getIssueDefinitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CareProcess_modelPackage.REPORT_DATA__ISSUE_DEFINITIONS:
				return getIssueDefinitions();
			case CareProcess_modelPackage.REPORT_DATA__REPORT_INTRODUCTION_TEXT:
				return getReportIntroductionText();
			case CareProcess_modelPackage.REPORT_DATA__CRM_SYSTEM_TEXT:
				return getCrmSystemText();
			case CareProcess_modelPackage.REPORT_DATA__SUMMARY_SAFETY_STATEMENT_TEXT:
				return getSummarySafetyStatementText();
			case CareProcess_modelPackage.REPORT_DATA__QA_AND_DOC_APPROVAL_TEXT:
				return getQaAndDocApprovalText();
			case CareProcess_modelPackage.REPORT_DATA__CONFIGURATION_CONTROL_TEXT:
				return getConfigurationControlText();
			case CareProcess_modelPackage.REPORT_DATA__REPORT_TITLE_TEXT:
				return getReportTitleText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CareProcess_modelPackage.REPORT_DATA__ISSUE_DEFINITIONS:
				getIssueDefinitions().clear();
				getIssueDefinitions().addAll((Collection<? extends IssueDefinition>)newValue);
				return;
			case CareProcess_modelPackage.REPORT_DATA__REPORT_INTRODUCTION_TEXT:
				setReportIntroductionText((String)newValue);
				return;
			case CareProcess_modelPackage.REPORT_DATA__CRM_SYSTEM_TEXT:
				setCrmSystemText((String)newValue);
				return;
			case CareProcess_modelPackage.REPORT_DATA__SUMMARY_SAFETY_STATEMENT_TEXT:
				setSummarySafetyStatementText((String)newValue);
				return;
			case CareProcess_modelPackage.REPORT_DATA__QA_AND_DOC_APPROVAL_TEXT:
				setQaAndDocApprovalText((String)newValue);
				return;
			case CareProcess_modelPackage.REPORT_DATA__CONFIGURATION_CONTROL_TEXT:
				setConfigurationControlText((String)newValue);
				return;
			case CareProcess_modelPackage.REPORT_DATA__REPORT_TITLE_TEXT:
				setReportTitleText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CareProcess_modelPackage.REPORT_DATA__ISSUE_DEFINITIONS:
				getIssueDefinitions().clear();
				return;
			case CareProcess_modelPackage.REPORT_DATA__REPORT_INTRODUCTION_TEXT:
				setReportIntroductionText(REPORT_INTRODUCTION_TEXT_EDEFAULT);
				return;
			case CareProcess_modelPackage.REPORT_DATA__CRM_SYSTEM_TEXT:
				setCrmSystemText(CRM_SYSTEM_TEXT_EDEFAULT);
				return;
			case CareProcess_modelPackage.REPORT_DATA__SUMMARY_SAFETY_STATEMENT_TEXT:
				setSummarySafetyStatementText(SUMMARY_SAFETY_STATEMENT_TEXT_EDEFAULT);
				return;
			case CareProcess_modelPackage.REPORT_DATA__QA_AND_DOC_APPROVAL_TEXT:
				setQaAndDocApprovalText(QA_AND_DOC_APPROVAL_TEXT_EDEFAULT);
				return;
			case CareProcess_modelPackage.REPORT_DATA__CONFIGURATION_CONTROL_TEXT:
				setConfigurationControlText(CONFIGURATION_CONTROL_TEXT_EDEFAULT);
				return;
			case CareProcess_modelPackage.REPORT_DATA__REPORT_TITLE_TEXT:
				setReportTitleText(REPORT_TITLE_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CareProcess_modelPackage.REPORT_DATA__ISSUE_DEFINITIONS:
				return issueDefinitions != null && !issueDefinitions.isEmpty();
			case CareProcess_modelPackage.REPORT_DATA__REPORT_INTRODUCTION_TEXT:
				return REPORT_INTRODUCTION_TEXT_EDEFAULT == null ? reportIntroductionText != null : !REPORT_INTRODUCTION_TEXT_EDEFAULT.equals(reportIntroductionText);
			case CareProcess_modelPackage.REPORT_DATA__CRM_SYSTEM_TEXT:
				return CRM_SYSTEM_TEXT_EDEFAULT == null ? crmSystemText != null : !CRM_SYSTEM_TEXT_EDEFAULT.equals(crmSystemText);
			case CareProcess_modelPackage.REPORT_DATA__SUMMARY_SAFETY_STATEMENT_TEXT:
				return SUMMARY_SAFETY_STATEMENT_TEXT_EDEFAULT == null ? summarySafetyStatementText != null : !SUMMARY_SAFETY_STATEMENT_TEXT_EDEFAULT.equals(summarySafetyStatementText);
			case CareProcess_modelPackage.REPORT_DATA__QA_AND_DOC_APPROVAL_TEXT:
				return QA_AND_DOC_APPROVAL_TEXT_EDEFAULT == null ? qaAndDocApprovalText != null : !QA_AND_DOC_APPROVAL_TEXT_EDEFAULT.equals(qaAndDocApprovalText);
			case CareProcess_modelPackage.REPORT_DATA__CONFIGURATION_CONTROL_TEXT:
				return CONFIGURATION_CONTROL_TEXT_EDEFAULT == null ? configurationControlText != null : !CONFIGURATION_CONTROL_TEXT_EDEFAULT.equals(configurationControlText);
			case CareProcess_modelPackage.REPORT_DATA__REPORT_TITLE_TEXT:
				return REPORT_TITLE_TEXT_EDEFAULT == null ? reportTitleText != null : !REPORT_TITLE_TEXT_EDEFAULT.equals(reportTitleText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (reportIntroductionText: ");
		result.append(reportIntroductionText);
		result.append(", crmSystemText: ");
		result.append(crmSystemText);
		result.append(", summarySafetyStatementText: ");
		result.append(summarySafetyStatementText);
		result.append(", qaAndDocApprovalText: ");
		result.append(qaAndDocApprovalText);
		result.append(", configurationControlText: ");
		result.append(configurationControlText);
		result.append(", reportTitleText: ");
		result.append(reportTitleText);
		result.append(')');
		return result.toString();
	}

} //ReportDataImpl
