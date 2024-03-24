/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.LocationDefinition;
import careProcess_model.Step;
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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.LocationDefinitionImpl#getLocationName <em>Location Name</em>}</li>
 *   <li>{@link careProcess_model.impl.LocationDefinitionImpl#getMnemonicName <em>Mnemonic Name</em>}</li>
 *   <li>{@link careProcess_model.impl.LocationDefinitionImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link careProcess_model.impl.LocationDefinitionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationDefinitionImpl extends MinimalEObjectImpl.Container implements LocationDefinition{
	/**
	 * The default value of the '{@link #getLocationName() <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationName() <em>Location Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationName()
	 * @generated
	 * @ordered
	 */
	protected String locationName = LOCATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMnemonicName() <em>Mnemonic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonicName()
	 * @generated
	 * @ordered
	 */
	protected static final String MNEMONIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMnemonicName() <em>Mnemonic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonicName()
	 * @generated
	 * @ordered
	 */
	protected String mnemonicName = MNEMONIC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.LOCATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationName(String newLocationName) {
		String oldLocationName = locationName;
		locationName = newLocationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.LOCATION_DEFINITION__LOCATION_NAME, oldLocationName, locationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMnemonicName() {
		return mnemonicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMnemonicName(String newMnemonicName) {
		String oldMnemonicName = mnemonicName;
		mnemonicName = newMnemonicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.LOCATION_DEFINITION__MNEMONIC_NAME, oldMnemonicName, mnemonicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectWithInverseResolvingEList<Step>(Step.class, this, CareProcess_modelPackage.LOCATION_DEFINITION__STEPS, CareProcess_modelPackage.STEP__LOCATION);
		}
		return steps;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.LOCATION_DEFINITION__DESCRIPTION, oldDescription, description));
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
			case CareProcess_modelPackage.LOCATION_DEFINITION__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
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
			case CareProcess_modelPackage.LOCATION_DEFINITION__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case CareProcess_modelPackage.LOCATION_DEFINITION__LOCATION_NAME:
				return getLocationName();
			case CareProcess_modelPackage.LOCATION_DEFINITION__MNEMONIC_NAME:
				return getMnemonicName();
			case CareProcess_modelPackage.LOCATION_DEFINITION__STEPS:
				return getSteps();
			case CareProcess_modelPackage.LOCATION_DEFINITION__DESCRIPTION:
				return getDescription();
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
			case CareProcess_modelPackage.LOCATION_DEFINITION__LOCATION_NAME:
				setLocationName((String)newValue);
				return;
			case CareProcess_modelPackage.LOCATION_DEFINITION__MNEMONIC_NAME:
				setMnemonicName((String)newValue);
				return;
			case CareProcess_modelPackage.LOCATION_DEFINITION__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case CareProcess_modelPackage.LOCATION_DEFINITION__DESCRIPTION:
				setDescription((String)newValue);
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
			case CareProcess_modelPackage.LOCATION_DEFINITION__LOCATION_NAME:
				setLocationName(LOCATION_NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.LOCATION_DEFINITION__MNEMONIC_NAME:
				setMnemonicName(MNEMONIC_NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.LOCATION_DEFINITION__STEPS:
				getSteps().clear();
				return;
			case CareProcess_modelPackage.LOCATION_DEFINITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case CareProcess_modelPackage.LOCATION_DEFINITION__LOCATION_NAME:
				return LOCATION_NAME_EDEFAULT == null ? locationName != null : !LOCATION_NAME_EDEFAULT.equals(locationName);
			case CareProcess_modelPackage.LOCATION_DEFINITION__MNEMONIC_NAME:
				return MNEMONIC_NAME_EDEFAULT == null ? mnemonicName != null : !MNEMONIC_NAME_EDEFAULT.equals(mnemonicName);
			case CareProcess_modelPackage.LOCATION_DEFINITION__STEPS:
				return steps != null && !steps.isEmpty();
			case CareProcess_modelPackage.LOCATION_DEFINITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (locationName: ");
		result.append(locationName);
		result.append(", mnemonicName: ");
		result.append(mnemonicName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
		}
		else{
			return locationName;
		}
	}

} //LocationDefinitionImpl
