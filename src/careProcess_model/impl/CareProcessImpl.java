/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelPackage;
import careProcess_model.Project;
import careProcess_model.processGraph;
import main.Main;
import main.Main.ExecutionModes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Care Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.CareProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link careProcess_model.impl.CareProcessImpl#getProcessGraph <em>Process Graph</em>}</li>
 *   <li>{@link careProcess_model.impl.CareProcessImpl#getProject <em>Project</em>}</li>
 *   <li>{@link careProcess_model.impl.CareProcessImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CareProcessImpl extends MinimalEObjectImpl.Container implements CareProcess {
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
	 * The cached value of the '{@link #getProcessGraph() <em>Process Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessGraph()
	 * @generated
	 * @ordered
	 */
	protected processGraph processGraph;

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
	protected CareProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.CARE_PROCESS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.CARE_PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processGraph getProcessGraph() {
		return processGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessGraph(processGraph newProcessGraph, NotificationChain msgs) {
		processGraph oldProcessGraph = processGraph;
		processGraph = newProcessGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH, oldProcessGraph, newProcessGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessGraph(processGraph newProcessGraph) {
		if (newProcessGraph != processGraph) {
			NotificationChain msgs = null;
			if (processGraph != null)
				msgs = ((InternalEObject)processGraph).eInverseRemove(this, CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS, processGraph.class, msgs);
			if (newProcessGraph != null)
				msgs = ((InternalEObject)newProcessGraph).eInverseAdd(this, CareProcess_modelPackage.PROCESS_GRAPH__CARE_PROCESS, processGraph.class, msgs);
			msgs = basicSetProcessGraph(newProcessGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH, newProcessGraph, newProcessGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		if (eContainerFeatureID() != CareProcess_modelPackage.CARE_PROCESS__PROJECT) return null;
		return (Project)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProject, CareProcess_modelPackage.CARE_PROCESS__PROJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != eInternalContainer() || (eContainerFeatureID() != CareProcess_modelPackage.CARE_PROCESS__PROJECT && newProject != null)) {
			if (EcoreUtil.isAncestor(this, newProject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, CareProcess_modelPackage.PROJECT__CARE_PROCESSES, Project.class, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.CARE_PROCESS__PROJECT, newProject, newProject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.CARE_PROCESS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH:
				if (processGraph != null)
					msgs = ((InternalEObject)processGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH, null, msgs);
				return basicSetProcessGraph((processGraph)otherEnd, msgs);
			case CareProcess_modelPackage.CARE_PROCESS__PROJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProject((Project)otherEnd, msgs);
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
			case CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH:
				return basicSetProcessGraph(null, msgs);
			case CareProcess_modelPackage.CARE_PROCESS__PROJECT:
				return basicSetProject(null, msgs);
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
			case CareProcess_modelPackage.CARE_PROCESS__PROJECT:
				return eInternalContainer().eInverseRemove(this, CareProcess_modelPackage.PROJECT__CARE_PROCESSES, Project.class, msgs);
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
			case CareProcess_modelPackage.CARE_PROCESS__NAME:
				return getName();
			case CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH:
				return getProcessGraph();
			case CareProcess_modelPackage.CARE_PROCESS__PROJECT:
				return getProject();
			case CareProcess_modelPackage.CARE_PROCESS__DESCRIPTION:
				return getDescription();
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
			case CareProcess_modelPackage.CARE_PROCESS__NAME:
				setName((String)newValue);
				return;
			case CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH:
				setProcessGraph((processGraph)newValue);
				return;
			case CareProcess_modelPackage.CARE_PROCESS__PROJECT:
				setProject((Project)newValue);
				return;
			case CareProcess_modelPackage.CARE_PROCESS__DESCRIPTION:
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
			case CareProcess_modelPackage.CARE_PROCESS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH:
				setProcessGraph((processGraph)null);
				return;
			case CareProcess_modelPackage.CARE_PROCESS__PROJECT:
				setProject((Project)null);
				return;
			case CareProcess_modelPackage.CARE_PROCESS__DESCRIPTION:
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
			case CareProcess_modelPackage.CARE_PROCESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CareProcess_modelPackage.CARE_PROCESS__PROCESS_GRAPH:
				return processGraph != null;
			case CareProcess_modelPackage.CARE_PROCESS__PROJECT:
				return getProject() != null;
			case CareProcess_modelPackage.CARE_PROCESS__DESCRIPTION:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
		}else{
			return name;
		}
	}

} //CareProcessImpl
