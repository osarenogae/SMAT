/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
import careProcess_model.HazardRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.HazardRepositoryImpl#getHazardDefinitions <em>Hazard Definitions</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardRepositoryImpl#getHazardInstances <em>Hazard Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardRepositoryImpl extends RepositoryImpl implements HazardRepository {
	/**
	 * The cached value of the '{@link #getHazardDefinitions() <em>Hazard Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardDefinition> hazardDefinitions;

	/**
	 * The cached value of the '{@link #getHazardInstances() <em>Hazard Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardInstance> hazardInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.HAZARD_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardDefinition> getHazardDefinitions() {
		if (hazardDefinitions == null) {
			hazardDefinitions = new EObjectContainmentEList<HazardDefinition>(HazardDefinition.class, this, CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_DEFINITIONS);
		}
		return hazardDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardInstance> getHazardInstances() {
		if (hazardInstances == null) {
			hazardInstances = new EObjectContainmentEList<HazardInstance>(HazardInstance.class, this, CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_INSTANCES);
		}
		return hazardInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_DEFINITIONS:
				return ((InternalEList<?>)getHazardDefinitions()).basicRemove(otherEnd, msgs);
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_INSTANCES:
				return ((InternalEList<?>)getHazardInstances()).basicRemove(otherEnd, msgs);
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
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_DEFINITIONS:
				return getHazardDefinitions();
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_INSTANCES:
				return getHazardInstances();
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
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_DEFINITIONS:
				getHazardDefinitions().clear();
				getHazardDefinitions().addAll((Collection<? extends HazardDefinition>)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_INSTANCES:
				getHazardInstances().clear();
				getHazardInstances().addAll((Collection<? extends HazardInstance>)newValue);
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
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_DEFINITIONS:
				getHazardDefinitions().clear();
				return;
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_INSTANCES:
				getHazardInstances().clear();
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
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_DEFINITIONS:
				return hazardDefinitions != null && !hazardDefinitions.isEmpty();
			case CareProcess_modelPackage.HAZARD_REPOSITORY__HAZARD_INSTANCES:
				return hazardInstances != null && !hazardInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HazardRepositoryImpl
