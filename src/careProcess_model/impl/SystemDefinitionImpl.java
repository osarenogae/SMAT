/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemFunction;
import main.Main;
import main.Main.ExecutionModes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>System
 * Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.SystemDefinitionImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link careProcess_model.impl.SystemDefinitionImpl#getMnemonicName <em>Mnemonic Name</em>}</li>
 *   <li>{@link careProcess_model.impl.SystemDefinitionImpl#getSystemFunctions <em>System Functions</em>}</li>
 *   <li>{@link careProcess_model.impl.SystemDefinitionImpl#getSystemVersion <em>System Version</em>}</li>
 *   <li>{@link careProcess_model.impl.SystemDefinitionImpl#getSystemDescription <em>System Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemDefinitionImpl extends MinimalEObjectImpl.Container implements SystemDefinition {
	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMnemonicName() <em>Mnemonic Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMnemonicName()
	 * @generated
	 * @ordered
	 */
	protected static final String MNEMONIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMnemonicName() <em>Mnemonic Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMnemonicName()
	 * @generated
	 * @ordered
	 */
	protected String mnemonicName = MNEMONIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystemFunctions() <em>System Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> systemFunctions;

	/**
	 * The default value of the '{@link #getSystemVersion() <em>System Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemVersion() <em>System Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected String systemVersion = SYSTEM_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemDescription() <em>System Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemDescription() <em>System Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDescription()
	 * @generated
	 * @ordered
	 */
	protected String systemDescription = SYSTEM_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.SYSTEM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getMnemonicName() {
		return mnemonicName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMnemonicName(String newMnemonicName) {
		String oldMnemonicName = mnemonicName;
		mnemonicName = newMnemonicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.SYSTEM_DEFINITION__MNEMONIC_NAME, oldMnemonicName, mnemonicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunction> getSystemFunctions() {
		if (systemFunctions == null) {
			systemFunctions = new EObjectContainmentWithInverseEList<SystemFunction>(SystemFunction.class, this, CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_FUNCTIONS, CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION);
		}
		return systemFunctions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemVersion() {
		return systemVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemVersion(String newSystemVersion) {
		String oldSystemVersion = systemVersion;
		systemVersion = newSystemVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_VERSION, oldSystemVersion, systemVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemDescription() {
		return systemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemDescription(String newSystemDescription) {
		String oldSystemDescription = systemDescription;
		systemDescription = newSystemDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_DESCRIPTION, oldSystemDescription, systemDescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSystemFunctions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_FUNCTIONS:
				return ((InternalEList<?>)getSystemFunctions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_NAME:
				return getSystemName();
			case CareProcess_modelPackage.SYSTEM_DEFINITION__MNEMONIC_NAME:
				return getMnemonicName();
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_FUNCTIONS:
				return getSystemFunctions();
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_VERSION:
				return getSystemVersion();
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_DESCRIPTION:
				return getSystemDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CareProcess_modelPackage.SYSTEM_DEFINITION__MNEMONIC_NAME:
				setMnemonicName((String)newValue);
				return;
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_FUNCTIONS:
				getSystemFunctions().clear();
				getSystemFunctions().addAll((Collection<? extends SystemFunction>)newValue);
				return;
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_VERSION:
				setSystemVersion((String)newValue);
				return;
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_DESCRIPTION:
				setSystemDescription((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.SYSTEM_DEFINITION__MNEMONIC_NAME:
				setMnemonicName(MNEMONIC_NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_FUNCTIONS:
				getSystemFunctions().clear();
				return;
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_VERSION:
				setSystemVersion(SYSTEM_VERSION_EDEFAULT);
				return;
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_DESCRIPTION:
				setSystemDescription(SYSTEM_DESCRIPTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CareProcess_modelPackage.SYSTEM_DEFINITION__MNEMONIC_NAME:
				return MNEMONIC_NAME_EDEFAULT == null ? mnemonicName != null : !MNEMONIC_NAME_EDEFAULT.equals(mnemonicName);
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_FUNCTIONS:
				return systemFunctions != null && !systemFunctions.isEmpty();
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_VERSION:
				return SYSTEM_VERSION_EDEFAULT == null ? systemVersion != null : !SYSTEM_VERSION_EDEFAULT.equals(systemVersion);
			case CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_DESCRIPTION:
				return SYSTEM_DESCRIPTION_EDEFAULT == null ? systemDescription != null : !SYSTEM_DESCRIPTION_EDEFAULT.equals(systemDescription);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		if(Main.getMode() == ExecutionModes.DEVELOPER){
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (systemName: ");
		result.append(systemName);
		result.append(", mnemonicName: ");
		result.append(mnemonicName);
		result.append(", systemVersion: ");
		result.append(systemVersion);
		result.append(')');
		return result.toString();
		}else{
			return systemName;
		}
	}

} // SystemDefinitionImpl
