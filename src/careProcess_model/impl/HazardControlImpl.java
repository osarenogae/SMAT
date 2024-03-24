/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.ControlStateEnum;
import careProcess_model.ControlTypeEnum;
import careProcess_model.HazardCause;
import careProcess_model.HazardControl;

import careProcess_model.HazardEffect;
import java.util.Collection;
import main.Main;
import main.Main.ExecutionModes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.HazardControlImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardControlImpl#getControlState <em>Control State</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardControlImpl#getControlTypes <em>Control Types</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardControlImpl#getOtherText <em>Other Text</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardControlImpl#getHazardcause <em>Hazardcause</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardControlImpl#getHazardeffect <em>Hazardeffect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardControlImpl extends MinimalEObjectImpl.Container implements HazardControl {
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
	 * The default value of the '{@link #getControlState() <em>Control State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlState()
	 * @generated
	 * @ordered
	 */
	protected static final ControlStateEnum CONTROL_STATE_EDEFAULT = ControlStateEnum.EXISTING;

	/**
	 * The cached value of the '{@link #getControlState() <em>Control State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlState()
	 * @generated
	 * @ordered
	 */
	protected ControlStateEnum controlState = CONTROL_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlTypes() <em>Control Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlTypeEnum> controlTypes;

	/**
	 * The default value of the '{@link #getOtherText() <em>Other Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherText()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherText() <em>Other Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherText()
	 * @generated
	 * @ordered
	 */
	protected String otherText = OTHER_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.HAZARD_CONTROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_CONTROL__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlStateEnum getControlState() {
		return controlState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlState(ControlStateEnum newControlState) {
		ControlStateEnum oldControlState = controlState;
		controlState = newControlState == null ? CONTROL_STATE_EDEFAULT : newControlState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_STATE, oldControlState, controlState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlTypeEnum> getControlTypes() {
		if (controlTypes == null) {
			controlTypes = new EDataTypeUniqueEList<ControlTypeEnum>(ControlTypeEnum.class, this, CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_TYPES);
		}
		return controlTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherText() {
		return otherText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherText(String newOtherText) {
		String oldOtherText = otherText;
		otherText = newOtherText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_CONTROL__OTHER_TEXT, oldOtherText, otherText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardCause getHazardcause() {
		if (eContainerFeatureID() != CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE) return null;
		return (HazardCause)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHazardcause(HazardCause newHazardcause, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHazardcause, CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardcause(HazardCause newHazardcause) {
		if (newHazardcause != eInternalContainer() || (eContainerFeatureID() != CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE && newHazardcause != null)) {
			if (EcoreUtil.isAncestor(this, newHazardcause))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHazardcause != null)
				msgs = ((InternalEObject)newHazardcause).eInverseAdd(this, CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCONTROLS, HazardCause.class, msgs);
			msgs = basicSetHazardcause(newHazardcause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE, newHazardcause, newHazardcause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardEffect getHazardeffect() {
		if (eContainerFeatureID() != CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT) return null;
		return (HazardEffect)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHazardeffect(HazardEffect newHazardeffect, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHazardeffect, CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardeffect(HazardEffect newHazardeffect) {
		if (newHazardeffect != eInternalContainer() || (eContainerFeatureID() != CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT && newHazardeffect != null)) {
			if (EcoreUtil.isAncestor(this, newHazardeffect))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHazardeffect != null)
				msgs = ((InternalEObject)newHazardeffect).eInverseAdd(this, CareProcess_modelPackage.HAZARD_EFFECT__HAZARDCONTROLS, HazardEffect.class, msgs);
			msgs = basicSetHazardeffect(newHazardeffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT, newHazardeffect, newHazardeffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHazardcause((HazardCause)otherEnd, msgs);
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHazardeffect((HazardEffect)otherEnd, msgs);
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
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE:
				return basicSetHazardcause(null, msgs);
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT:
				return basicSetHazardeffect(null, msgs);
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
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE:
				return eInternalContainer().eInverseRemove(this, CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCONTROLS, HazardCause.class, msgs);
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT:
				return eInternalContainer().eInverseRemove(this, CareProcess_modelPackage.HAZARD_EFFECT__HAZARDCONTROLS, HazardEffect.class, msgs);
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
			case CareProcess_modelPackage.HAZARD_CONTROL__DESCRIPTION:
				return getDescription();
			case CareProcess_modelPackage.HAZARD_CONTROL__NAME:
				return getName();
			case CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_STATE:
				return getControlState();
			case CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_TYPES:
				return getControlTypes();
			case CareProcess_modelPackage.HAZARD_CONTROL__OTHER_TEXT:
				return getOtherText();
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE:
				return getHazardcause();
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT:
				return getHazardeffect();
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
			case CareProcess_modelPackage.HAZARD_CONTROL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__NAME:
				setName((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_STATE:
				setControlState((ControlStateEnum)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_TYPES:
				getControlTypes().clear();
				getControlTypes().addAll((Collection<? extends ControlTypeEnum>)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__OTHER_TEXT:
				setOtherText((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE:
				setHazardcause((HazardCause)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT:
				setHazardeffect((HazardEffect)newValue);
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
			case CareProcess_modelPackage.HAZARD_CONTROL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_STATE:
				setControlState(CONTROL_STATE_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_TYPES:
				getControlTypes().clear();
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__OTHER_TEXT:
				setOtherText(OTHER_TEXT_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE:
				setHazardcause((HazardCause)null);
				return;
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT:
				setHazardeffect((HazardEffect)null);
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
			case CareProcess_modelPackage.HAZARD_CONTROL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CareProcess_modelPackage.HAZARD_CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_STATE:
				return controlState != CONTROL_STATE_EDEFAULT;
			case CareProcess_modelPackage.HAZARD_CONTROL__CONTROL_TYPES:
				return controlTypes != null && !controlTypes.isEmpty();
			case CareProcess_modelPackage.HAZARD_CONTROL__OTHER_TEXT:
				return OTHER_TEXT_EDEFAULT == null ? otherText != null : !OTHER_TEXT_EDEFAULT.equals(otherText);
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE:
				return getHazardcause() != null;
			case CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT:
				return getHazardeffect() != null;
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
		result.append(" (controlNature: ");
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
		}else{
			return name;
		}
	}

} //HazardControlImpl
