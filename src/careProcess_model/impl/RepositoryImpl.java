/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.Repository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.RepositoryImpl#getRepositoryName <em>Repository Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The default value of the '{@link #getRepositoryName() <em>Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryName() <em>Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryName()
	 * @generated
	 * @ordered
	 */
	protected String repositoryName = REPOSITORY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryName() {
		return repositoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryName(String newRepositoryName) {
		String oldRepositoryName = repositoryName;
		repositoryName = newRepositoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.REPOSITORY__REPOSITORY_NAME, oldRepositoryName, repositoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CareProcess_modelPackage.REPOSITORY__REPOSITORY_NAME:
				return getRepositoryName();
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
			case CareProcess_modelPackage.REPOSITORY__REPOSITORY_NAME:
				setRepositoryName((String)newValue);
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
			case CareProcess_modelPackage.REPOSITORY__REPOSITORY_NAME:
				setRepositoryName(REPOSITORY_NAME_EDEFAULT);
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
			case CareProcess_modelPackage.REPOSITORY__REPOSITORY_NAME:
				return REPOSITORY_NAME_EDEFAULT == null ? repositoryName != null : !REPOSITORY_NAME_EDEFAULT.equals(repositoryName);
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
		result.append(" (repositoryName: ");
		result.append(repositoryName);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
