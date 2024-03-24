/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.IssueDefinition;
import main.Main;
import main.Main.ExecutionModes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.IssueDefinitionImpl#getIssueName <em>Issue Name</em>}</li>
 *   <li>{@link careProcess_model.impl.IssueDefinitionImpl#getIssueDescription <em>Issue Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueDefinitionImpl extends MinimalEObjectImpl.Container implements IssueDefinition {
	/**
	 * The default value of the '{@link #getIssueName() <em>Issue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueName()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueName() <em>Issue Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueName()
	 * @generated
	 * @ordered
	 */
	protected String issueName = ISSUE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueDescription() <em>Issue Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDescription() <em>Issue Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDescription()
	 * @generated
	 * @ordered
	 */
	protected String issueDescription = ISSUE_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.ISSUE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssueName() {
		return issueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueName(String newIssueName) {
		String oldIssueName = issueName;
		issueName = newIssueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_NAME, oldIssueName, issueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssueDescription() {
		return issueDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDescription(String newIssueDescription) {
		String oldIssueDescription = issueDescription;
		issueDescription = newIssueDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_DESCRIPTION, oldIssueDescription, issueDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_NAME:
				return getIssueName();
			case CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_DESCRIPTION:
				return getIssueDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_NAME:
				setIssueName((String)newValue);
				return;
			case CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_DESCRIPTION:
				setIssueDescription((String)newValue);
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
			case CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_NAME:
				setIssueName(ISSUE_NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_DESCRIPTION:
				setIssueDescription(ISSUE_DESCRIPTION_EDEFAULT);
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
			case CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_NAME:
				return ISSUE_NAME_EDEFAULT == null ? issueName != null : !ISSUE_NAME_EDEFAULT.equals(issueName);
			case CareProcess_modelPackage.ISSUE_DEFINITION__ISSUE_DESCRIPTION:
				return ISSUE_DESCRIPTION_EDEFAULT == null ? issueDescription != null : !ISSUE_DESCRIPTION_EDEFAULT.equals(issueDescription);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		if(Main.getMode() == ExecutionModes.DEVELOPER){
			
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (issueName: ");
		result.append(issueName);
		result.append(", issueDescription: ");
		result.append(issueDescription);
		result.append(')');
		return result.toString();
		}
		return issueName;
	}

} //IssueDefinitionImpl
