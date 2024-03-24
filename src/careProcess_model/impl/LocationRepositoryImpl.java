/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.LocationDefinition;
import careProcess_model.LocationRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.LocationRepositoryImpl#getLocationDefinitions <em>Location Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationRepositoryImpl extends RepositoryImpl implements LocationRepository {
	/**
	 * The cached value of the '{@link #getLocationDefinitions() <em>Location Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationDefinition> locationDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.LOCATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationDefinition> getLocationDefinitions() {
		if (locationDefinitions == null) {
			locationDefinitions = new EObjectContainmentEList<LocationDefinition>(LocationDefinition.class, this, CareProcess_modelPackage.LOCATION_REPOSITORY__LOCATION_DEFINITIONS);
		}
		return locationDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.LOCATION_REPOSITORY__LOCATION_DEFINITIONS:
				return ((InternalEList<?>)getLocationDefinitions()).basicRemove(otherEnd, msgs);
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
			case CareProcess_modelPackage.LOCATION_REPOSITORY__LOCATION_DEFINITIONS:
				return getLocationDefinitions();
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
			case CareProcess_modelPackage.LOCATION_REPOSITORY__LOCATION_DEFINITIONS:
				getLocationDefinitions().clear();
				getLocationDefinitions().addAll((Collection<? extends LocationDefinition>)newValue);
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
			case CareProcess_modelPackage.LOCATION_REPOSITORY__LOCATION_DEFINITIONS:
				getLocationDefinitions().clear();
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
			case CareProcess_modelPackage.LOCATION_REPOSITORY__LOCATION_DEFINITIONS:
				return locationDefinitions != null && !locationDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocationRepositoryImpl
