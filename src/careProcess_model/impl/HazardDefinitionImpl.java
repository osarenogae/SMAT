/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Hazard
 * Definition</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.HazardDefinitionImpl#getHazardName <em>Hazard Name</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardDefinitionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardDefinitionImpl#getHazardInstances <em>Hazard Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardDefinitionImpl extends MinimalEObjectImpl.Container implements HazardDefinition {
	/**
	 * The default value of the '{@link #getHazardName() <em>Hazard Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHazardName()
	 * @generated
	 * @ordered
	 */
	protected static final String HAZARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHazardName() <em>Hazard Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHazardName()
	 * @generated
	 * @ordered
	 */
	protected String hazardName = HAZARD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHazardInstances() <em>Hazard Instances</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getHazardInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardInstance> hazardInstances;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.HAZARD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getHazardName() {
		return hazardName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardName(String newHazardName) {
		String oldHazardName = hazardName;
		hazardName = newHazardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_NAME, oldHazardName, hazardName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_DEFINITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardInstance> getHazardInstances() {
		if (hazardInstances == null) {
			hazardInstances = new EObjectWithInverseResolvingEList<HazardInstance>(HazardInstance.class, this, CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES, CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION);
		}
		return hazardInstances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHazardInstances()).basicAdd(otherEnd, msgs);
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
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES:
				return ((InternalEList<?>)getHazardInstances()).basicRemove(otherEnd, msgs);
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
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_NAME:
				return getHazardName();
			case CareProcess_modelPackage.HAZARD_DEFINITION__DESCRIPTION:
				return getDescription();
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES:
				return getHazardInstances();
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
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_NAME:
				setHazardName((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES:
				getHazardInstances().clear();
				getHazardInstances().addAll((Collection<? extends HazardInstance>)newValue);
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
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_NAME:
				setHazardName(HAZARD_NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES:
				getHazardInstances().clear();
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
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_NAME:
				return HAZARD_NAME_EDEFAULT == null ? hazardName != null : !HAZARD_NAME_EDEFAULT.equals(hazardName);
			case CareProcess_modelPackage.HAZARD_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES:
				return hazardInstances != null && !hazardInstances.isEmpty();
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
		result.append(" (hazardName: ");
		result.append(hazardName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
		}else{
			return hazardName;
		}
	}

} // HazardDefinitionImpl
