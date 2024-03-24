/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.Decision;
import careProcess_model.HazardInstance;
import careProcess_model.LocationDefinition;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
import careProcess_model.processGraph;
import careProcess_model.stepType;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.DecisionImpl#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link careProcess_model.impl.DecisionImpl#getStepTypeValue <em>Step Type Value</em>}</li>
 *   <li>{@link careProcess_model.impl.DecisionImpl#getName <em>Name</em>}</li>
 *   <li>{@link careProcess_model.impl.DecisionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.impl.DecisionImpl#getHazardInstances <em>Hazard Instances</em>}</li>
 *   <li>{@link careProcess_model.impl.DecisionImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link careProcess_model.impl.DecisionImpl#getAssociatedSystemFunctions <em>Associated System Functions</em>}</li>
 *   <li>{@link careProcess_model.impl.DecisionImpl#getUUID <em>UUID</em>}</li>
 *   <li>{@link careProcess_model.impl.DecisionImpl#getProcessGraph <em>Process Graph</em>}</li>
 *   <li>{@link careProcess_model.impl.DecisionImpl#isHidden <em>Hidden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionImpl extends MinimalEObjectImpl.Container implements Decision {
	/**
	 * The cached value of the '{@link #getSuccessors() <em>Successors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> successors;

	/**
	 * The default value of the '{@link #getStepTypeValue() <em>Step Type Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepTypeValue()
	 * @generated
	 * @ordered
	 */
	protected static final stepType STEP_TYPE_VALUE_EDEFAULT = stepType.ACTIVITY;

	/**
	 * The cached value of the '{@link #getStepTypeValue() <em>Step Type Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepTypeValue()
	 * @generated
	 * @ordered
	 */
	protected stepType stepTypeValue = STEP_TYPE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHazardInstances() <em>Hazard Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardInstance> hazardInstances;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationDefinition location;

	/**
	 * The cached value of the '{@link #getAssociatedSystemFunctions() <em>Associated System Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> associatedSystemFunctions;

	/**
	 * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DecisionImpl() {
		super();
		setUUID(EcoreUtil.generateUUID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSuccessors() {
		if (successors == null) {
			successors = new EObjectResolvingEList<Step>(Step.class, this, CareProcess_modelPackage.DECISION__SUCCESSORS);
		}
		return successors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stepType getStepTypeValue() {
		return stepTypeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepTypeValue(stepType newStepTypeValue) {
		stepType oldStepTypeValue = stepTypeValue;
		stepTypeValue = newStepTypeValue == null ? STEP_TYPE_VALUE_EDEFAULT : newStepTypeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DECISION__STEP_TYPE_VALUE, oldStepTypeValue, stepTypeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DECISION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DECISION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardInstance> getHazardInstances() {
		if (hazardInstances == null) {
			hazardInstances = new EObjectWithInverseResolvingEList<HazardInstance>(HazardInstance.class, this, CareProcess_modelPackage.DECISION__HAZARD_INSTANCES, CareProcess_modelPackage.HAZARD_INSTANCE__STEP);
		}
		return hazardInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDefinition getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (LocationDefinition)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CareProcess_modelPackage.DECISION__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationDefinition basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationDefinition newLocation, NotificationChain msgs) {
		LocationDefinition oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DECISION__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationDefinition newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, CareProcess_modelPackage.LOCATION_DEFINITION__STEPS, LocationDefinition.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, CareProcess_modelPackage.LOCATION_DEFINITION__STEPS, LocationDefinition.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DECISION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunction> getAssociatedSystemFunctions() {
		if (associatedSystemFunctions == null) {
			associatedSystemFunctions = new EObjectWithInverseResolvingEList.ManyInverse<SystemFunction>(SystemFunction.class, this, CareProcess_modelPackage.DECISION__ASSOCIATED_SYSTEM_FUNCTIONS, CareProcess_modelPackage.SYSTEM_FUNCTION__ASSOCIATED_STEPS);
		}
		return associatedSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUUID() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUUID(String newUUID) {
		String oldUUID = uuid;
		uuid = newUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DECISION__UUID, oldUUID, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processGraph getProcessGraph() {
		if (eContainerFeatureID() != CareProcess_modelPackage.DECISION__PROCESS_GRAPH) return null;
		return (processGraph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessGraph(processGraph newProcessGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcessGraph, CareProcess_modelPackage.DECISION__PROCESS_GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessGraph(processGraph newProcessGraph) {
		if (newProcessGraph != eInternalContainer() || (eContainerFeatureID() != CareProcess_modelPackage.DECISION__PROCESS_GRAPH && newProcessGraph != null)) {
			if (EcoreUtil.isAncestor(this, newProcessGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcessGraph != null)
				msgs = ((InternalEObject)newProcessGraph).eInverseAdd(this, CareProcess_modelPackage.PROCESS_GRAPH__STEP, processGraph.class, msgs);
			msgs = basicSetProcessGraph(newProcessGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DECISION__PROCESS_GRAPH, newProcessGraph, newProcessGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DECISION__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.DECISION__HAZARD_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHazardInstances()).basicAdd(otherEnd, msgs);
			case CareProcess_modelPackage.DECISION__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, CareProcess_modelPackage.LOCATION_DEFINITION__STEPS, LocationDefinition.class, msgs);
				return basicSetLocation((LocationDefinition)otherEnd, msgs);
			case CareProcess_modelPackage.DECISION__ASSOCIATED_SYSTEM_FUNCTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociatedSystemFunctions()).basicAdd(otherEnd, msgs);
			case CareProcess_modelPackage.DECISION__PROCESS_GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcessGraph((processGraph)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.DECISION__HAZARD_INSTANCES:
				return ((InternalEList<?>)getHazardInstances()).basicRemove(otherEnd, msgs);
			case CareProcess_modelPackage.DECISION__LOCATION:
				return basicSetLocation(null, msgs);
			case CareProcess_modelPackage.DECISION__ASSOCIATED_SYSTEM_FUNCTIONS:
				return ((InternalEList<?>)getAssociatedSystemFunctions()).basicRemove(otherEnd, msgs);
			case CareProcess_modelPackage.DECISION__PROCESS_GRAPH:
				return basicSetProcessGraph(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CareProcess_modelPackage.DECISION__PROCESS_GRAPH:
				return eInternalContainer().eInverseRemove(this, CareProcess_modelPackage.PROCESS_GRAPH__STEP, processGraph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CareProcess_modelPackage.DECISION__SUCCESSORS:
				return getSuccessors();
			case CareProcess_modelPackage.DECISION__STEP_TYPE_VALUE:
				return getStepTypeValue();
			case CareProcess_modelPackage.DECISION__NAME:
				return getName();
			case CareProcess_modelPackage.DECISION__DESCRIPTION:
				return getDescription();
			case CareProcess_modelPackage.DECISION__HAZARD_INSTANCES:
				return getHazardInstances();
			case CareProcess_modelPackage.DECISION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case CareProcess_modelPackage.DECISION__ASSOCIATED_SYSTEM_FUNCTIONS:
				return getAssociatedSystemFunctions();
			case CareProcess_modelPackage.DECISION__UUID:
				return getUUID();
			case CareProcess_modelPackage.DECISION__PROCESS_GRAPH:
				return getProcessGraph();
			case CareProcess_modelPackage.DECISION__HIDDEN:
				return isHidden();
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
			case CareProcess_modelPackage.DECISION__SUCCESSORS:
				getSuccessors().clear();
				getSuccessors().addAll((Collection<? extends Step>)newValue);
				return;
			case CareProcess_modelPackage.DECISION__STEP_TYPE_VALUE:
				setStepTypeValue((stepType)newValue);
				return;
			case CareProcess_modelPackage.DECISION__NAME:
				setName((String)newValue);
				return;
			case CareProcess_modelPackage.DECISION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CareProcess_modelPackage.DECISION__HAZARD_INSTANCES:
				getHazardInstances().clear();
				getHazardInstances().addAll((Collection<? extends HazardInstance>)newValue);
				return;
			case CareProcess_modelPackage.DECISION__LOCATION:
				setLocation((LocationDefinition)newValue);
				return;
			case CareProcess_modelPackage.DECISION__ASSOCIATED_SYSTEM_FUNCTIONS:
				getAssociatedSystemFunctions().clear();
				getAssociatedSystemFunctions().addAll((Collection<? extends SystemFunction>)newValue);
				return;
			case CareProcess_modelPackage.DECISION__UUID:
				setUUID((String)newValue);
				return;
			case CareProcess_modelPackage.DECISION__PROCESS_GRAPH:
				setProcessGraph((processGraph)newValue);
				return;
			case CareProcess_modelPackage.DECISION__HIDDEN:
				setHidden((Boolean)newValue);
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
			case CareProcess_modelPackage.DECISION__SUCCESSORS:
				getSuccessors().clear();
				return;
			case CareProcess_modelPackage.DECISION__STEP_TYPE_VALUE:
				setStepTypeValue(STEP_TYPE_VALUE_EDEFAULT);
				return;
			case CareProcess_modelPackage.DECISION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.DECISION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CareProcess_modelPackage.DECISION__HAZARD_INSTANCES:
				getHazardInstances().clear();
				return;
			case CareProcess_modelPackage.DECISION__LOCATION:
				setLocation((LocationDefinition)null);
				return;
			case CareProcess_modelPackage.DECISION__ASSOCIATED_SYSTEM_FUNCTIONS:
				getAssociatedSystemFunctions().clear();
				return;
			case CareProcess_modelPackage.DECISION__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case CareProcess_modelPackage.DECISION__PROCESS_GRAPH:
				setProcessGraph((processGraph)null);
				return;
			case CareProcess_modelPackage.DECISION__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
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
			case CareProcess_modelPackage.DECISION__SUCCESSORS:
				return successors != null && !successors.isEmpty();
			case CareProcess_modelPackage.DECISION__STEP_TYPE_VALUE:
				return stepTypeValue != STEP_TYPE_VALUE_EDEFAULT;
			case CareProcess_modelPackage.DECISION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CareProcess_modelPackage.DECISION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CareProcess_modelPackage.DECISION__HAZARD_INSTANCES:
				return hazardInstances != null && !hazardInstances.isEmpty();
			case CareProcess_modelPackage.DECISION__LOCATION:
				return location != null;
			case CareProcess_modelPackage.DECISION__ASSOCIATED_SYSTEM_FUNCTIONS:
				return associatedSystemFunctions != null && !associatedSystemFunctions.isEmpty();
			case CareProcess_modelPackage.DECISION__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case CareProcess_modelPackage.DECISION__PROCESS_GRAPH:
				return getProcessGraph() != null;
			case CareProcess_modelPackage.DECISION__HIDDEN:
				return hidden != HIDDEN_EDEFAULT;
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
		result.append(" (stepTypeValue: ");
		result.append(stepTypeValue);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", UUID: ");
		result.append(uuid);
		result.append(", hidden: ");
		result.append(hidden);
		result.append(')');
		return result.toString();
		}else{
			if(name!=null){			
				return name;			
			}else{
				return "(unnamed)";
			}
		}
	}

} //DecisionImpl
