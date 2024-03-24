/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelPackage;
import careProcess_model.DataStore;
import careProcess_model.Project;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.ProjectImpl#getCareProcesses <em>Care Processes</em>}</li>
 *   <li>{@link careProcess_model.impl.ProjectImpl#getDatastore <em>Datastore</em>}</li>
 *   <li>{@link careProcess_model.impl.ProjectImpl#getDateModified <em>Date Modified</em>}</li>
 *   <li>{@link careProcess_model.impl.ProjectImpl#getAcceptableHazardDefinition <em>Acceptable Hazard Definition</em>}</li>
 *   <li>{@link careProcess_model.impl.ProjectImpl#getCreatedWithAppVersion <em>Created With App Version</em>}</li>
 *   <li>{@link careProcess_model.impl.ProjectImpl#getRiskMatrixData <em>Risk Matrix Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The cached value of the '{@link #getCareProcesses() <em>Care Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCareProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<CareProcess> careProcesses;

	/**
	 * The cached value of the '{@link #getDatastore() <em>Datastore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastore()
	 * @generated
	 * @ordered
	 */
	protected DataStore datastore;

	/**
	 * The default value of the '{@link #getDateModified() <em>Date Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModified()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateModified() <em>Date Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateModified()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateModified = DATE_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcceptableHazardDefinition() <em>Acceptable Hazard Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptableHazardDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCEPTABLE_HAZARD_DEFINITION_EDEFAULT = "Accepted: Clinical risk meeting acceptance criteria or outweighed by clinical benefits";

	/**
	 * The cached value of the '{@link #getAcceptableHazardDefinition() <em>Acceptable Hazard Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptableHazardDefinition()
	 * @generated
	 * @ordered
	 */
	protected String acceptableHazardDefinition = ACCEPTABLE_HAZARD_DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedWithAppVersion() <em>Created With App Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedWithAppVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_WITH_APP_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedWithAppVersion() <em>Created With App Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedWithAppVersion()
	 * @generated
	 * @ordered
	 */
	protected String createdWithAppVersion = CREATED_WITH_APP_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskMatrixData() <em>Risk Matrix Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskMatrixData()
	 * @generated
	 * @ordered
	 */
	protected static final String RISK_MATRIX_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRiskMatrixData() <em>Risk Matrix Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskMatrixData()
	 * @generated
	 * @ordered
	 */
	protected String riskMatrixData = RISK_MATRIX_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStore getDatastore() {
		return datastore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatastore(DataStore newDatastore, NotificationChain msgs) {
		DataStore oldDatastore = datastore;
		datastore = newDatastore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.PROJECT__DATASTORE, oldDatastore, newDatastore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatastore(DataStore newDatastore) {
		if (newDatastore != datastore) {
			NotificationChain msgs = null;
			if (datastore != null)
				msgs = ((InternalEObject)datastore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.PROJECT__DATASTORE, null, msgs);
			if (newDatastore != null)
				msgs = ((InternalEObject)newDatastore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.PROJECT__DATASTORE, null, msgs);
			msgs = basicSetDatastore(newDatastore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.PROJECT__DATASTORE, newDatastore, newDatastore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateModified() {
		return dateModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateModified(XMLGregorianCalendar newDateModified) {
		XMLGregorianCalendar oldDateModified = dateModified;
		dateModified = newDateModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.PROJECT__DATE_MODIFIED, oldDateModified, dateModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceptableHazardDefinition() {
		return acceptableHazardDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptableHazardDefinition(String newAcceptableHazardDefinition) {
		String oldAcceptableHazardDefinition = acceptableHazardDefinition;
		acceptableHazardDefinition = newAcceptableHazardDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.PROJECT__ACCEPTABLE_HAZARD_DEFINITION, oldAcceptableHazardDefinition, acceptableHazardDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedWithAppVersion() {
		return createdWithAppVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedWithAppVersion(String newCreatedWithAppVersion) {
		String oldCreatedWithAppVersion = createdWithAppVersion;
		createdWithAppVersion = newCreatedWithAppVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.PROJECT__CREATED_WITH_APP_VERSION, oldCreatedWithAppVersion, createdWithAppVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRiskMatrixData() {
		return riskMatrixData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskMatrixData(String newRiskMatrixData) {
		String oldRiskMatrixData = riskMatrixData;
		riskMatrixData = newRiskMatrixData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.PROJECT__RISK_MATRIX_DATA, oldRiskMatrixData, riskMatrixData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CareProcess> getCareProcesses() {
		if (careProcesses == null) {
			careProcesses = new EObjectContainmentWithInverseEList<CareProcess>(CareProcess.class, this, CareProcess_modelPackage.PROJECT__CARE_PROCESSES, CareProcess_modelPackage.CARE_PROCESS__PROJECT);
		}
		return careProcesses;
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
			case CareProcess_modelPackage.PROJECT__CARE_PROCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCareProcesses()).basicAdd(otherEnd, msgs);
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
			case CareProcess_modelPackage.PROJECT__CARE_PROCESSES:
				return ((InternalEList<?>)getCareProcesses()).basicRemove(otherEnd, msgs);
			case CareProcess_modelPackage.PROJECT__DATASTORE:
				return basicSetDatastore(null, msgs);
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
			case CareProcess_modelPackage.PROJECT__CARE_PROCESSES:
				return getCareProcesses();
			case CareProcess_modelPackage.PROJECT__DATASTORE:
				return getDatastore();
			case CareProcess_modelPackage.PROJECT__DATE_MODIFIED:
				return getDateModified();
			case CareProcess_modelPackage.PROJECT__ACCEPTABLE_HAZARD_DEFINITION:
				return getAcceptableHazardDefinition();
			case CareProcess_modelPackage.PROJECT__CREATED_WITH_APP_VERSION:
				return getCreatedWithAppVersion();
			case CareProcess_modelPackage.PROJECT__RISK_MATRIX_DATA:
				return getRiskMatrixData();
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
			case CareProcess_modelPackage.PROJECT__CARE_PROCESSES:
				getCareProcesses().clear();
				getCareProcesses().addAll((Collection<? extends CareProcess>)newValue);
				return;
			case CareProcess_modelPackage.PROJECT__DATASTORE:
				setDatastore((DataStore)newValue);
				return;
			case CareProcess_modelPackage.PROJECT__DATE_MODIFIED:
				setDateModified((XMLGregorianCalendar)newValue);
				return;
			case CareProcess_modelPackage.PROJECT__ACCEPTABLE_HAZARD_DEFINITION:
				setAcceptableHazardDefinition((String)newValue);
				return;
			case CareProcess_modelPackage.PROJECT__CREATED_WITH_APP_VERSION:
				setCreatedWithAppVersion((String)newValue);
				return;
			case CareProcess_modelPackage.PROJECT__RISK_MATRIX_DATA:
				setRiskMatrixData((String)newValue);
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
			case CareProcess_modelPackage.PROJECT__CARE_PROCESSES:
				getCareProcesses().clear();
				return;
			case CareProcess_modelPackage.PROJECT__DATASTORE:
				setDatastore((DataStore)null);
				return;
			case CareProcess_modelPackage.PROJECT__DATE_MODIFIED:
				setDateModified(DATE_MODIFIED_EDEFAULT);
				return;
			case CareProcess_modelPackage.PROJECT__ACCEPTABLE_HAZARD_DEFINITION:
				setAcceptableHazardDefinition(ACCEPTABLE_HAZARD_DEFINITION_EDEFAULT);
				return;
			case CareProcess_modelPackage.PROJECT__CREATED_WITH_APP_VERSION:
				setCreatedWithAppVersion(CREATED_WITH_APP_VERSION_EDEFAULT);
				return;
			case CareProcess_modelPackage.PROJECT__RISK_MATRIX_DATA:
				setRiskMatrixData(RISK_MATRIX_DATA_EDEFAULT);
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
			case CareProcess_modelPackage.PROJECT__CARE_PROCESSES:
				return careProcesses != null && !careProcesses.isEmpty();
			case CareProcess_modelPackage.PROJECT__DATASTORE:
				return datastore != null;
			case CareProcess_modelPackage.PROJECT__DATE_MODIFIED:
				return DATE_MODIFIED_EDEFAULT == null ? dateModified != null : !DATE_MODIFIED_EDEFAULT.equals(dateModified);
			case CareProcess_modelPackage.PROJECT__ACCEPTABLE_HAZARD_DEFINITION:
				return ACCEPTABLE_HAZARD_DEFINITION_EDEFAULT == null ? acceptableHazardDefinition != null : !ACCEPTABLE_HAZARD_DEFINITION_EDEFAULT.equals(acceptableHazardDefinition);
			case CareProcess_modelPackage.PROJECT__CREATED_WITH_APP_VERSION:
				return CREATED_WITH_APP_VERSION_EDEFAULT == null ? createdWithAppVersion != null : !CREATED_WITH_APP_VERSION_EDEFAULT.equals(createdWithAppVersion);
			case CareProcess_modelPackage.PROJECT__RISK_MATRIX_DATA:
				return RISK_MATRIX_DATA_EDEFAULT == null ? riskMatrixData != null : !RISK_MATRIX_DATA_EDEFAULT.equals(riskMatrixData);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dateModified: ");
		result.append(dateModified);
		result.append(", acceptableHazardDefinition: ");
		result.append(acceptableHazardDefinition);
		result.append(", createdWithAppVersion: ");
		result.append(createdWithAppVersion);
		result.append(", riskMatrixData: ");
		result.append(riskMatrixData);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
