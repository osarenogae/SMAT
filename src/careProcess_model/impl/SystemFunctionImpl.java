/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.HazardInstance;
import careProcess_model.Step;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>System
 * Function</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.SystemFunctionImpl#getHazardInstances <em>Hazard Instances</em>}</li>
 *   <li>{@link careProcess_model.impl.SystemFunctionImpl#getSystemDefinition <em>System Definition</em>}</li>
 *   <li>{@link careProcess_model.impl.SystemFunctionImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link careProcess_model.impl.SystemFunctionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.impl.SystemFunctionImpl#getAssociatedSteps <em>Associated Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemFunctionImpl extends MinimalEObjectImpl.Container implements SystemFunction {
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
	 * The default value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunctionName()
	 * @generated
	 * @ordered
	 */
	protected String functionName = FUNCTION_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getAssociatedSteps() <em>Associated Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> associatedSteps;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.SYSTEM_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardInstance> getHazardInstances() {
		if (hazardInstances == null) {
			hazardInstances = new EObjectWithInverseResolvingEList<HazardInstance>(HazardInstance.class, this, CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES, CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION);
		}
		return hazardInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDefinition getSystemDefinition() {
		if (eContainerFeatureID() != CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION) return null;
		return (SystemDefinition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemDefinition(SystemDefinition newSystemDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystemDefinition, CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemDefinition(SystemDefinition newSystemDefinition) {
		if (newSystemDefinition != eInternalContainer() || (eContainerFeatureID() != CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION && newSystemDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newSystemDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystemDefinition != null)
				msgs = ((InternalEObject)newSystemDefinition).eInverseAdd(this, CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_FUNCTIONS, SystemDefinition.class, msgs);
			msgs = basicSetSystemDefinition(newSystemDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION, newSystemDefinition, newSystemDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionName() {
		return functionName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionName(String newFunctionName) {
		String oldFunctionName = functionName;
		functionName = newFunctionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.SYSTEM_FUNCTION__FUNCTION_NAME, oldFunctionName, functionName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.SYSTEM_FUNCTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getAssociatedSteps() {
		if (associatedSteps == null) {
			associatedSteps = new EObjectWithInverseResolvingEList.ManyInverse<Step>(Step.class, this, CareProcess_modelPackage.SYSTEM_FUNCTION__ASSOCIATED_STEPS, CareProcess_modelPackage.STEP__ASSOCIATED_SYSTEM_FUNCTIONS);
		}
		return associatedSteps;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHazardInstances()).basicAdd(otherEnd, msgs);
			case CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystemDefinition((SystemDefinition)otherEnd, msgs);
			case CareProcess_modelPackage.SYSTEM_FUNCTION__ASSOCIATED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociatedSteps()).basicAdd(otherEnd, msgs);
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
			case CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES:
				return ((InternalEList<?>)getHazardInstances()).basicRemove(otherEnd, msgs);
			case CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION:
				return basicSetSystemDefinition(null, msgs);
			case CareProcess_modelPackage.SYSTEM_FUNCTION__ASSOCIATED_STEPS:
				return ((InternalEList<?>)getAssociatedSteps()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION:
				return eInternalContainer().eInverseRemove(this, CareProcess_modelPackage.SYSTEM_DEFINITION__SYSTEM_FUNCTIONS, SystemDefinition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES:
				return getHazardInstances();
			case CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION:
				return getSystemDefinition();
			case CareProcess_modelPackage.SYSTEM_FUNCTION__FUNCTION_NAME:
				return getFunctionName();
			case CareProcess_modelPackage.SYSTEM_FUNCTION__DESCRIPTION:
				return getDescription();
			case CareProcess_modelPackage.SYSTEM_FUNCTION__ASSOCIATED_STEPS:
				return getAssociatedSteps();
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
			case CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES:
				getHazardInstances().clear();
				getHazardInstances().addAll((Collection<? extends HazardInstance>)newValue);
				return;
			case CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION:
				setSystemDefinition((SystemDefinition)newValue);
				return;
			case CareProcess_modelPackage.SYSTEM_FUNCTION__FUNCTION_NAME:
				setFunctionName((String)newValue);
				return;
			case CareProcess_modelPackage.SYSTEM_FUNCTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CareProcess_modelPackage.SYSTEM_FUNCTION__ASSOCIATED_STEPS:
				getAssociatedSteps().clear();
				getAssociatedSteps().addAll((Collection<? extends Step>)newValue);
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
			case CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES:
				getHazardInstances().clear();
				return;
			case CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION:
				setSystemDefinition((SystemDefinition)null);
				return;
			case CareProcess_modelPackage.SYSTEM_FUNCTION__FUNCTION_NAME:
				setFunctionName(FUNCTION_NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.SYSTEM_FUNCTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CareProcess_modelPackage.SYSTEM_FUNCTION__ASSOCIATED_STEPS:
				getAssociatedSteps().clear();
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
			case CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES:
				return hazardInstances != null && !hazardInstances.isEmpty();
			case CareProcess_modelPackage.SYSTEM_FUNCTION__SYSTEM_DEFINITION:
				return getSystemDefinition() != null;
			case CareProcess_modelPackage.SYSTEM_FUNCTION__FUNCTION_NAME:
				return FUNCTION_NAME_EDEFAULT == null ? functionName != null : !FUNCTION_NAME_EDEFAULT.equals(functionName);
			case CareProcess_modelPackage.SYSTEM_FUNCTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CareProcess_modelPackage.SYSTEM_FUNCTION__ASSOCIATED_STEPS:
				return associatedSteps != null && !associatedSteps.isEmpty();
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
		result.append(" (functionName: ");
		result.append(functionName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
		}else{
			return functionName;
		}
	}

} // SystemFunctionImpl
