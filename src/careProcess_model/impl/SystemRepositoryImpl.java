/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.SystemDefinition;
import careProcess_model.SystemRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.SystemRepositoryImpl#getSystemDefinitions <em>System Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemRepositoryImpl extends RepositoryImpl implements SystemRepository {
	/**
	 * The cached value of the '{@link #getSystemDefinitions() <em>System Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemDefinition> systemDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.SYSTEM_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemDefinition> getSystemDefinitions() {
		if (systemDefinitions == null) {
			systemDefinitions = new EObjectContainmentEList<SystemDefinition>(SystemDefinition.class, this, CareProcess_modelPackage.SYSTEM_REPOSITORY__SYSTEM_DEFINITIONS);
		}
		return systemDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.SYSTEM_REPOSITORY__SYSTEM_DEFINITIONS:
				return ((InternalEList<?>)getSystemDefinitions()).basicRemove(otherEnd, msgs);
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
			case CareProcess_modelPackage.SYSTEM_REPOSITORY__SYSTEM_DEFINITIONS:
				return getSystemDefinitions();
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
			case CareProcess_modelPackage.SYSTEM_REPOSITORY__SYSTEM_DEFINITIONS:
				getSystemDefinitions().clear();
				getSystemDefinitions().addAll((Collection<? extends SystemDefinition>)newValue);
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
			case CareProcess_modelPackage.SYSTEM_REPOSITORY__SYSTEM_DEFINITIONS:
				getSystemDefinitions().clear();
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
			case CareProcess_modelPackage.SYSTEM_REPOSITORY__SYSTEM_DEFINITIONS:
				return systemDefinitions != null && !systemDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemRepositoryImpl
