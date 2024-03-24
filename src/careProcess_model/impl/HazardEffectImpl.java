/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.HazardControl;
import careProcess_model.HazardEffect;
import main.Main;
import main.Main.ExecutionModes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.HazardEffectImpl#getHazardeffects <em>Hazardeffects</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardEffectImpl#getEffectDescription <em>Effect Description</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardEffectImpl#getEffectName <em>Effect Name</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardEffectImpl#getHazardcontrols <em>Hazardcontrols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardEffectImpl extends HazardFactorImpl implements HazardEffect {
	/**
	 * The cached value of the '{@link #getHazardeffects() <em>Hazardeffects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardeffects()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardEffect> hazardeffects;

	/**
	 * The default value of the '{@link #getEffectDescription() <em>Effect Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectDescription() <em>Effect Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectDescription()
	 * @generated
	 * @ordered
	 */
	protected String effectDescription = EFFECT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffectName() <em>Effect Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectName()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectName() <em>Effect Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectName()
	 * @generated
	 * @ordered
	 */
	protected String effectName = EFFECT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHazardcontrols() <em>Hazardcontrols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardcontrols()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardControl> hazardcontrols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardEffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.HAZARD_EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardEffect> getHazardeffects() {
		if (hazardeffects == null) {
			hazardeffects = new EObjectResolvingEList<HazardEffect>(HazardEffect.class, this, CareProcess_modelPackage.HAZARD_EFFECT__HAZARDEFFECTS);
		}
		return hazardeffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardControl> getHazardcontrols() {
		if (hazardcontrols == null) {
			hazardcontrols = new EObjectContainmentWithInverseEList<HazardControl>(HazardControl.class, this, CareProcess_modelPackage.HAZARD_EFFECT__HAZARDCONTROLS, CareProcess_modelPackage.HAZARD_CONTROL__HAZARDEFFECT);
		}
		return hazardcontrols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectDescription() {
		return effectDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectDescription(String newEffectDescription) {
		String oldEffectDescription = effectDescription;
		effectDescription = newEffectDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_DESCRIPTION, oldEffectDescription, effectDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectName() {
		return effectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectName(String newEffectName) {
		String oldEffectName = effectName;
		effectName = newEffectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_NAME, oldEffectName, effectName));
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
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDCONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHazardcontrols()).basicAdd(otherEnd, msgs);
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
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDCONTROLS:
				return ((InternalEList<?>)getHazardcontrols()).basicRemove(otherEnd, msgs);
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
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDEFFECTS:
				return getHazardeffects();
			case CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_DESCRIPTION:
				return getEffectDescription();
			case CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_NAME:
				return getEffectName();
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDCONTROLS:
				return getHazardcontrols();
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
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDEFFECTS:
				getHazardeffects().clear();
				getHazardeffects().addAll((Collection<? extends HazardEffect>)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_DESCRIPTION:
				setEffectDescription((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_NAME:
				setEffectName((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDCONTROLS:
				getHazardcontrols().clear();
				getHazardcontrols().addAll((Collection<? extends HazardControl>)newValue);
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
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDEFFECTS:
				getHazardeffects().clear();
				return;
			case CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_DESCRIPTION:
				setEffectDescription(EFFECT_DESCRIPTION_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_NAME:
				setEffectName(EFFECT_NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDCONTROLS:
				getHazardcontrols().clear();
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
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDEFFECTS:
				return hazardeffects != null && !hazardeffects.isEmpty();
			case CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_DESCRIPTION:
				return EFFECT_DESCRIPTION_EDEFAULT == null ? effectDescription != null : !EFFECT_DESCRIPTION_EDEFAULT.equals(effectDescription);
			case CareProcess_modelPackage.HAZARD_EFFECT__EFFECT_NAME:
				return EFFECT_NAME_EDEFAULT == null ? effectName != null : !EFFECT_NAME_EDEFAULT.equals(effectName);
			case CareProcess_modelPackage.HAZARD_EFFECT__HAZARDCONTROLS:
				return hazardcontrols != null && !hazardcontrols.isEmpty();
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
		result.append(" (effectDescription: ");
		result.append(effectDescription);
		result.append(", effectName: ");
		result.append(effectName);
		result.append(')');
		return result.toString();
		}else{
			return effectName;
		}
	}

} //HazardEffectImpl
