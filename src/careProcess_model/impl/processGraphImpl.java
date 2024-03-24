/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelPackage;
import careProcess_model.Step;
import careProcess_model.processGraph;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>process Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.processGraphImpl#getCareProcess <em>Care Process</em>}</li>
 *   <li>{@link careProcess_model.impl.processGraphImpl#getGraphData <em>Graph Data</em>}</li>
 *   <li>{@link careProcess_model.impl.processGraphImpl#getDataMap <em>Data Map</em>}</li>
 *   <li>{@link careProcess_model.impl.processGraphImpl#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class processGraphImpl extends MinimalEObjectImpl.Container implements processGraph {
	/**
	 * The default value of the '{@link #getGraphData() <em>Graph Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphData()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAPH_DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getGraphData() <em>Graph Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphData()
	 * @generated
	 * @ordered
	 */
	protected String graphData = GRAPH_DATA_EDEFAULT;
	/**
	 * The default value of the '{@link #getDataMap() <em>Data Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMap()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_MAP_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDataMap() <em>Data Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataMap()
	 * @generated
	 * @ordered
	 */
	protected String dataMap = DATA_MAP_EDEFAULT;
	/**
	 * This is true if the Data Map attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataMapESet;
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected processGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.PROCESS_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentWithInverseEList<Step>(Step.class, this, CareProcess_modelPackage.PROCESS_GRAPH__STEP, CareProcess_modelPackage.STEP__PROCESS_GRAPH);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareProcess getCareProcess() {
		if (eContainerFeatureID() != CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS) return null;
		return (CareProcess)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCareProcess(CareProcess newCareProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCareProcess, CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCareProcess(CareProcess newCareProcess) {
		if (newCareProcess != eInternalContainer() || (eContainerFeatureID() != CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS && newCareProcess != null)) {
			if (EcoreUtil.isAncestor(this, newCareProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCareProcess != null)
				msgs = ((InternalEObject)newCareProcess).eInverseAdd(this, CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH, CareProcess.class, msgs);
			msgs = basicSetCareProcess(newCareProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS, newCareProcess, newCareProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGraphData() {
		return graphData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphData(String newGraphData) {
		String oldGraphData = graphData;
		graphData = newGraphData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.PROCESS_GRAPH__GRAPH_DATA, oldGraphData, graphData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataMap() {
		return dataMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataMap(String newDataMap) {
		String oldDataMap = dataMap;
		dataMap = newDataMap;
		boolean oldDataMapESet = dataMapESet;
		dataMapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.PROCESS_GRAPH__DATA_MAP, oldDataMap, dataMap, !oldDataMapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataMap() {
		String oldDataMap = dataMap;
		boolean oldDataMapESet = dataMapESet;
		dataMap = DATA_MAP_EDEFAULT;
		dataMapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CareProcess_modelPackage.PROCESS_GRAPH__DATA_MAP, oldDataMap, DATA_MAP_EDEFAULT, oldDataMapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataMap() {
		return dataMapESet;
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
			case CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCareProcess((CareProcess)otherEnd, msgs);
			case CareProcess_modelPackage.PROCESS_GRAPH__STEP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStep()).basicAdd(otherEnd, msgs);
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
			case CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS:
				return basicSetCareProcess(null, msgs);
			case CareProcess_modelPackage.PROCESS_GRAPH__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
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
			case CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS:
				return eInternalContainer().eInverseRemove(this, CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH, CareProcess.class, msgs);
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
			case CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS:
				return getCareProcess();
			case CareProcess_modelPackage.PROCESS_GRAPH__GRAPH_DATA:
				return getGraphData();
			case CareProcess_modelPackage.PROCESS_GRAPH__DATA_MAP:
				return getDataMap();
			case CareProcess_modelPackage.PROCESS_GRAPH__STEP:
				return getStep();
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
			case CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS:
				setCareProcess((CareProcess)newValue);
				return;
			case CareProcess_modelPackage.PROCESS_GRAPH__GRAPH_DATA:
				setGraphData((String)newValue);
				return;
			case CareProcess_modelPackage.PROCESS_GRAPH__DATA_MAP:
				setDataMap((String)newValue);
				return;
			case CareProcess_modelPackage.PROCESS_GRAPH__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
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
			case CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS:
				setCareProcess((CareProcess)null);
				return;
			case CareProcess_modelPackage.PROCESS_GRAPH__GRAPH_DATA:
				setGraphData(GRAPH_DATA_EDEFAULT);
				return;
			case CareProcess_modelPackage.PROCESS_GRAPH__DATA_MAP:
				unsetDataMap();
				return;
			case CareProcess_modelPackage.PROCESS_GRAPH__STEP:
				getStep().clear();
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
			case CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS:
				return getCareProcess() != null;
			case CareProcess_modelPackage.PROCESS_GRAPH__GRAPH_DATA:
				return GRAPH_DATA_EDEFAULT == null ? graphData != null : !GRAPH_DATA_EDEFAULT.equals(graphData);
			case CareProcess_modelPackage.PROCESS_GRAPH__DATA_MAP:
				return isSetDataMap();
			case CareProcess_modelPackage.PROCESS_GRAPH__STEP:
				return step != null && !step.isEmpty();
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
		result.append(" (graphData: ");
		result.append(graphData);
		result.append(", dataMap: ");
		if (dataMapESet) result.append(dataMap); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //processGraphImpl
