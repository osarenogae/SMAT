/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.HazardCause;
import careProcess_model.HazardControl;
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
 * An implementation of the model object '<em><b>Hazard Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.HazardCauseImpl#getHazardcauses <em>Hazardcauses</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardCauseImpl#getCauseName <em>Cause Name</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardCauseImpl#getCauseDescription <em>Cause Description</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardCauseImpl#getHazardcontrols <em>Hazardcontrols</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardCauseImpl extends HazardFactorImpl implements HazardCause {
	/**
	 * The cached value of the '{@link #getHazardcauses() <em>Hazardcauses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardcauses()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardCause> hazardcauses;

	/**
	 * The default value of the '{@link #getCauseName() <em>Cause Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseName()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCauseName() <em>Cause Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseName()
	 * @generated
	 * @ordered
	 */
	protected String causeName = CAUSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCauseDescription() <em>Cause Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCauseDescription() <em>Cause Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseDescription()
	 * @generated
	 * @ordered
	 */
	protected String causeDescription = CAUSE_DESCRIPTION_EDEFAULT;

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
	protected HazardCauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.HAZARD_CAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardCause> getHazardcauses() {
		if (hazardcauses == null) {
			hazardcauses = new EObjectResolvingEList<HazardCause>(HazardCause.class, this, CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCAUSES);
		}
		return hazardcauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardControl> getHazardcontrols() {
		if (hazardcontrols == null) {
			hazardcontrols = new EObjectContainmentWithInverseEList<HazardControl>(HazardControl.class, this, CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCONTROLS, CareProcess_modelPackage.HAZARD_CONTROL__HAZARDCAUSE);
		}
		return hazardcontrols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCauseName() {
		return causeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCauseName(String newCauseName) {
		String oldCauseName = causeName;
		causeName = newCauseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_NAME, oldCauseName, causeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCauseDescription() {
		return causeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCauseDescription(String newCauseDescription) {
		String oldCauseDescription = causeDescription;
		causeDescription = newCauseDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_DESCRIPTION, oldCauseDescription, causeDescription));
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
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCONTROLS:
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
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCONTROLS:
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
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCAUSES:
				return getHazardcauses();
			case CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_NAME:
				return getCauseName();
			case CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_DESCRIPTION:
				return getCauseDescription();
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCONTROLS:
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
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCAUSES:
				getHazardcauses().clear();
				getHazardcauses().addAll((Collection<? extends HazardCause>)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_NAME:
				setCauseName((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_DESCRIPTION:
				setCauseDescription((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCONTROLS:
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
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCAUSES:
				getHazardcauses().clear();
				return;
			case CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_NAME:
				setCauseName(CAUSE_NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_DESCRIPTION:
				setCauseDescription(CAUSE_DESCRIPTION_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCONTROLS:
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
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCAUSES:
				return hazardcauses != null && !hazardcauses.isEmpty();
			case CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_NAME:
				return CAUSE_NAME_EDEFAULT == null ? causeName != null : !CAUSE_NAME_EDEFAULT.equals(causeName);
			case CareProcess_modelPackage.HAZARD_CAUSE__CAUSE_DESCRIPTION:
				return CAUSE_DESCRIPTION_EDEFAULT == null ? causeDescription != null : !CAUSE_DESCRIPTION_EDEFAULT.equals(causeDescription);
			case CareProcess_modelPackage.HAZARD_CAUSE__HAZARDCONTROLS:
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
		result.append(" (causeName: ");
		result.append(causeName);
		result.append(", causeDescription: ");
		result.append(causeDescription);
		result.append(')');
		return result.toString();
		}else{
			return causeName;
		}
	}

} //HazardCauseImpl
