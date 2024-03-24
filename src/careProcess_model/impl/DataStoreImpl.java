/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.DataStore;
import careProcess_model.HazardRepository;
import careProcess_model.LocationRepository;
import careProcess_model.ReportData;
import careProcess_model.SystemRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.DataStoreImpl#getLocationrepository <em>Locationrepository</em>}</li>
 *   <li>{@link careProcess_model.impl.DataStoreImpl#getSystemrepository <em>Systemrepository</em>}</li>
 *   <li>{@link careProcess_model.impl.DataStoreImpl#getHazardrepository <em>Hazardrepository</em>}</li>
 *   <li>{@link careProcess_model.impl.DataStoreImpl#getReportData <em>Report Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStoreImpl extends MinimalEObjectImpl.Container implements DataStore {
	/**
	 * The cached value of the '{@link #getLocationrepository() <em>Locationrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationrepository()
	 * @generated
	 * @ordered
	 */
	protected LocationRepository locationrepository;

	/**
	 * The cached value of the '{@link #getSystemrepository() <em>Systemrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemrepository()
	 * @generated
	 * @ordered
	 */
	protected SystemRepository systemrepository;

	/**
	 * The cached value of the '{@link #getHazardrepository() <em>Hazardrepository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardrepository()
	 * @generated
	 * @ordered
	 */
	protected HazardRepository hazardrepository;

	/**
	 * The cached value of the '{@link #getReportData() <em>Report Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportData()
	 * @generated
	 * @ordered
	 */
	protected ReportData reportData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.DATA_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationRepository getLocationrepository() {
		return locationrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocationrepository(LocationRepository newLocationrepository, NotificationChain msgs) {
		LocationRepository oldLocationrepository = locationrepository;
		locationrepository = newLocationrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DATA_STORE__LOCATIONREPOSITORY, oldLocationrepository, newLocationrepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationrepository(LocationRepository newLocationrepository) {
		if (newLocationrepository != locationrepository) {
			NotificationChain msgs = null;
			if (locationrepository != null)
				msgs = ((InternalEObject)locationrepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.DATA_STORE__LOCATIONREPOSITORY, null, msgs);
			if (newLocationrepository != null)
				msgs = ((InternalEObject)newLocationrepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.DATA_STORE__LOCATIONREPOSITORY, null, msgs);
			msgs = basicSetLocationrepository(newLocationrepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DATA_STORE__LOCATIONREPOSITORY, newLocationrepository, newLocationrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRepository getSystemrepository() {
		return systemrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemrepository(SystemRepository newSystemrepository, NotificationChain msgs) {
		SystemRepository oldSystemrepository = systemrepository;
		systemrepository = newSystemrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DATA_STORE__SYSTEMREPOSITORY, oldSystemrepository, newSystemrepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemrepository(SystemRepository newSystemrepository) {
		if (newSystemrepository != systemrepository) {
			NotificationChain msgs = null;
			if (systemrepository != null)
				msgs = ((InternalEObject)systemrepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.DATA_STORE__SYSTEMREPOSITORY, null, msgs);
			if (newSystemrepository != null)
				msgs = ((InternalEObject)newSystemrepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.DATA_STORE__SYSTEMREPOSITORY, null, msgs);
			msgs = basicSetSystemrepository(newSystemrepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DATA_STORE__SYSTEMREPOSITORY, newSystemrepository, newSystemrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardRepository getHazardrepository() {
		return hazardrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHazardrepository(HazardRepository newHazardrepository, NotificationChain msgs) {
		HazardRepository oldHazardrepository = hazardrepository;
		hazardrepository = newHazardrepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DATA_STORE__HAZARDREPOSITORY, oldHazardrepository, newHazardrepository);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardrepository(HazardRepository newHazardrepository) {
		if (newHazardrepository != hazardrepository) {
			NotificationChain msgs = null;
			if (hazardrepository != null)
				msgs = ((InternalEObject)hazardrepository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.DATA_STORE__HAZARDREPOSITORY, null, msgs);
			if (newHazardrepository != null)
				msgs = ((InternalEObject)newHazardrepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.DATA_STORE__HAZARDREPOSITORY, null, msgs);
			msgs = basicSetHazardrepository(newHazardrepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DATA_STORE__HAZARDREPOSITORY, newHazardrepository, newHazardrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportData getReportData() {
		return reportData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportData(ReportData newReportData, NotificationChain msgs) {
		ReportData oldReportData = reportData;
		reportData = newReportData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DATA_STORE__REPORT_DATA, oldReportData, newReportData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportData(ReportData newReportData) {
		if (newReportData != reportData) {
			NotificationChain msgs = null;
			if (reportData != null)
				msgs = ((InternalEObject)reportData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.DATA_STORE__REPORT_DATA, null, msgs);
			if (newReportData != null)
				msgs = ((InternalEObject)newReportData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.DATA_STORE__REPORT_DATA, null, msgs);
			msgs = basicSetReportData(newReportData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.DATA_STORE__REPORT_DATA, newReportData, newReportData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.DATA_STORE__LOCATIONREPOSITORY:
				return basicSetLocationrepository(null, msgs);
			case CareProcess_modelPackage.DATA_STORE__SYSTEMREPOSITORY:
				return basicSetSystemrepository(null, msgs);
			case CareProcess_modelPackage.DATA_STORE__HAZARDREPOSITORY:
				return basicSetHazardrepository(null, msgs);
			case CareProcess_modelPackage.DATA_STORE__REPORT_DATA:
				return basicSetReportData(null, msgs);
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
			case CareProcess_modelPackage.DATA_STORE__LOCATIONREPOSITORY:
				return getLocationrepository();
			case CareProcess_modelPackage.DATA_STORE__SYSTEMREPOSITORY:
				return getSystemrepository();
			case CareProcess_modelPackage.DATA_STORE__HAZARDREPOSITORY:
				return getHazardrepository();
			case CareProcess_modelPackage.DATA_STORE__REPORT_DATA:
				return getReportData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CareProcess_modelPackage.DATA_STORE__LOCATIONREPOSITORY:
				setLocationrepository((LocationRepository)newValue);
				return;
			case CareProcess_modelPackage.DATA_STORE__SYSTEMREPOSITORY:
				setSystemrepository((SystemRepository)newValue);
				return;
			case CareProcess_modelPackage.DATA_STORE__HAZARDREPOSITORY:
				setHazardrepository((HazardRepository)newValue);
				return;
			case CareProcess_modelPackage.DATA_STORE__REPORT_DATA:
				setReportData((ReportData)newValue);
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
			case CareProcess_modelPackage.DATA_STORE__LOCATIONREPOSITORY:
				setLocationrepository((LocationRepository)null);
				return;
			case CareProcess_modelPackage.DATA_STORE__SYSTEMREPOSITORY:
				setSystemrepository((SystemRepository)null);
				return;
			case CareProcess_modelPackage.DATA_STORE__HAZARDREPOSITORY:
				setHazardrepository((HazardRepository)null);
				return;
			case CareProcess_modelPackage.DATA_STORE__REPORT_DATA:
				setReportData((ReportData)null);
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
			case CareProcess_modelPackage.DATA_STORE__LOCATIONREPOSITORY:
				return locationrepository != null;
			case CareProcess_modelPackage.DATA_STORE__SYSTEMREPOSITORY:
				return systemrepository != null;
			case CareProcess_modelPackage.DATA_STORE__HAZARDREPOSITORY:
				return hazardrepository != null;
			case CareProcess_modelPackage.DATA_STORE__REPORT_DATA:
				return reportData != null;
		}
		return super.eIsSet(featureID);
	}

} //DataStoreImpl
