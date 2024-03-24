/**
 */
package careProcess_model.impl;

import careProcess_model.CareProcess_modelPackage;
import careProcess_model.HazardCause;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardEffect;
import careProcess_model.HazardInstance;
import careProcess_model.Step;
import careProcess_model.SystemFunction;
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Hazard
 * Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getInitialLikelihood <em>Initial Likelihood</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getInitialSeverity <em>Initial Severity</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getStep <em>Step</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getHazardDefinition <em>Hazard Definition</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getSystemFunction <em>System Function</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getResidualLikelihood <em>Residual Likelihood</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getResidualSeverity <em>Residual Severity</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getInitialRiskRating <em>Initial Risk Rating</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getResidualRiskRating <em>Residual Risk Rating</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getHazardcauses <em>Hazardcauses</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getHazardeffects <em>Hazardeffects</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getClinicalJustification <em>Clinical Justification</em>}</li>
 *   <li>{@link careProcess_model.impl.HazardInstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardInstanceImpl extends MinimalEObjectImpl.Container implements HazardInstance {
	/**
	 * The default value of the '{@link #getInitialLikelihood() <em>Initial
	 * Likelihood</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getInitialLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_LIKELIHOOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialLikelihood() <em>Initial
	 * Likelihood</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getInitialLikelihood()
	 * @generated
	 * @ordered
	 */
	protected int initialLikelihood = INITIAL_LIKELIHOOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialSeverity() <em>Initial Severity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInitialSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_SEVERITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialSeverity() <em>Initial Severity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInitialSeverity()
	 * @generated
	 * @ordered
	 */
	protected int initialSeverity = INITIAL_SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected Step step;

	/**
	 * The cached value of the '{@link #getHazardDefinition() <em>Hazard
	 * Definition</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getHazardDefinition()
	 * @generated
	 * @ordered
	 */
	protected HazardDefinition hazardDefinition;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSystemFunction() <em>System Function</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSystemFunction()
	 * @generated
	 * @ordered
	 */
	protected SystemFunction systemFunction;

	/**
	 * The default value of the '{@link #getResidualLikelihood() <em>Residual
	 * Likelihood</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getResidualLikelihood()
	 * @generated
	 * @ordered
	 */
	protected static final int RESIDUAL_LIKELIHOOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResidualLikelihood() <em>Residual
	 * Likelihood</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getResidualLikelihood()
	 * @generated
	 * @ordered
	 */
	protected int residualLikelihood = RESIDUAL_LIKELIHOOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidualSeverity() <em>Residual Severity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResidualSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final int RESIDUAL_SEVERITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResidualSeverity() <em>Residual Severity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResidualSeverity()
	 * @generated
	 * @ordered
	 */
	protected int residualSeverity = RESIDUAL_SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialRiskRating() <em>Initial Risk Rating</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInitialRiskRating()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_RISK_RATING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialRiskRating() <em>Initial Risk Rating</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInitialRiskRating()
	 * @generated
	 * @ordered
	 */
	protected int initialRiskRating = INITIAL_RISK_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getResidualRiskRating() <em>Residual
	 * Risk Rating</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getResidualRiskRating()
	 * @generated
	 * @ordered
	 */
	protected static final int RESIDUAL_RISK_RATING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResidualRiskRating() <em>Residual
	 * Risk Rating</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getResidualRiskRating()
	 * @generated
	 * @ordered
	 */
	protected int residualRiskRating = RESIDUAL_RISK_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHazardcauses() <em>Hazardcauses</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHazardcauses()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardCause> hazardcauses;

	/**
	 * The cached value of the '{@link #getHazardeffects() <em>Hazardeffects</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getHazardeffects()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardEffect> hazardeffects;

	/**
	 * The default value of the '{@link #getClinicalJustification() <em>Clinical Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String CLINICAL_JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClinicalJustification() <em>Clinical Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalJustification()
	 * @generated
	 * @ordered
	 */
	protected String clinicalJustification = CLINICAL_JUSTIFICATION_EDEFAULT;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CareProcess_modelPackage.Literals.HAZARD_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialLikelihood() {
		return initialLikelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialLikelihood(int newInitialLikelihood) {
		int oldInitialLikelihood = initialLikelihood;
		initialLikelihood = newInitialLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_LIKELIHOOD, oldInitialLikelihood, initialLikelihood));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialSeverity() {
		return initialSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialSeverity(int newInitialSeverity) {
		int oldInitialSeverity = initialSeverity;
		initialSeverity = newInitialSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_SEVERITY, oldInitialSeverity, initialSeverity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Step getStep() {
		if (step != null && step.eIsProxy()) {
			InternalEObject oldStep = (InternalEObject)step;
			step = (Step)eResolveProxy(oldStep);
			if (step != oldStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CareProcess_modelPackage.HAZARD_INSTANCE__STEP, oldStep, step));
			}
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStep(Step newStep, NotificationChain msgs) {
		Step oldStep = step;
		step = newStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__STEP, oldStep, newStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(Step newStep) {
		if (newStep != step) {
			NotificationChain msgs = null;
			if (step != null)
				msgs = ((InternalEObject)step).eInverseRemove(this, CareProcess_modelPackage.STEP__HAZARD_INSTANCES, Step.class, msgs);
			if (newStep != null)
				msgs = ((InternalEObject)newStep).eInverseAdd(this, CareProcess_modelPackage.STEP__HAZARD_INSTANCES, Step.class, msgs);
			msgs = basicSetStep(newStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__STEP, newStep, newStep));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HazardDefinition getHazardDefinition() {
		if (hazardDefinition != null && hazardDefinition.eIsProxy()) {
			InternalEObject oldHazardDefinition = (InternalEObject)hazardDefinition;
			hazardDefinition = (HazardDefinition)eResolveProxy(oldHazardDefinition);
			if (hazardDefinition != oldHazardDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION, oldHazardDefinition, hazardDefinition));
			}
		}
		return hazardDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public HazardDefinition basicGetHazardDefinition() {
		return hazardDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHazardDefinition(HazardDefinition newHazardDefinition, NotificationChain msgs) {
		HazardDefinition oldHazardDefinition = hazardDefinition;
		hazardDefinition = newHazardDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION, oldHazardDefinition, newHazardDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardDefinition(HazardDefinition newHazardDefinition) {
		if (newHazardDefinition != hazardDefinition) {
			NotificationChain msgs = null;
			if (hazardDefinition != null)
				msgs = ((InternalEObject)hazardDefinition).eInverseRemove(this, CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES, HazardDefinition.class, msgs);
			if (newHazardDefinition != null)
				msgs = ((InternalEObject)newHazardDefinition).eInverseAdd(this, CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES, HazardDefinition.class, msgs);
			msgs = basicSetHazardDefinition(newHazardDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION, newHazardDefinition, newHazardDefinition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunction getSystemFunction() {
		if (systemFunction != null && systemFunction.eIsProxy()) {
			InternalEObject oldSystemFunction = (InternalEObject)systemFunction;
			systemFunction = (SystemFunction)eResolveProxy(oldSystemFunction);
			if (systemFunction != oldSystemFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION, oldSystemFunction, systemFunction));
			}
		}
		return systemFunction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunction basicGetSystemFunction() {
		return systemFunction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemFunction(SystemFunction newSystemFunction, NotificationChain msgs) {
		SystemFunction oldSystemFunction = systemFunction;
		systemFunction = newSystemFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION, oldSystemFunction, newSystemFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemFunction(SystemFunction newSystemFunction) {
		if (newSystemFunction != systemFunction) {
			NotificationChain msgs = null;
			if (systemFunction != null)
				msgs = ((InternalEObject)systemFunction).eInverseRemove(this, CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES, SystemFunction.class, msgs);
			if (newSystemFunction != null)
				msgs = ((InternalEObject)newSystemFunction).eInverseAdd(this, CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES, SystemFunction.class, msgs);
			msgs = basicSetSystemFunction(newSystemFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION, newSystemFunction, newSystemFunction));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getResidualLikelihood() {
		return residualLikelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidualLikelihood(int newResidualLikelihood) {
		int oldResidualLikelihood = residualLikelihood;
		residualLikelihood = newResidualLikelihood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_LIKELIHOOD, oldResidualLikelihood, residualLikelihood));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getResidualSeverity() {
		return residualSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidualSeverity(int newResidualSeverity) {
		int oldResidualSeverity = residualSeverity;
		residualSeverity = newResidualSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_SEVERITY, oldResidualSeverity, residualSeverity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialRiskRating() {
		return initialRiskRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialRiskRating(int newInitialRiskRating) {
		int oldInitialRiskRating = initialRiskRating;
		initialRiskRating = newInitialRiskRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_RISK_RATING, oldInitialRiskRating, initialRiskRating));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getResidualRiskRating() {
		return residualRiskRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResidualRiskRating(int newResidualRiskRating) {
		int oldResidualRiskRating = residualRiskRating;
		residualRiskRating = newResidualRiskRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_RISK_RATING, oldResidualRiskRating, residualRiskRating));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardCause> getHazardcauses() {
		if (hazardcauses == null) {
			hazardcauses = new EObjectContainmentEList<HazardCause>(HazardCause.class, this, CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDCAUSES);
		}
		return hazardcauses;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HazardEffect> getHazardeffects() {
		if (hazardeffects == null) {
			hazardeffects = new EObjectContainmentEList<HazardEffect>(HazardEffect.class, this, CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDEFFECTS);
		}
		return hazardeffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClinicalJustification() {
		return clinicalJustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalJustification(String newClinicalJustification) {
		String oldClinicalJustification = clinicalJustification;
		clinicalJustification = newClinicalJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__CLINICAL_JUSTIFICATION, oldClinicalJustification, clinicalJustification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CareProcess_modelPackage.HAZARD_INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.HAZARD_INSTANCE__STEP:
				if (step != null)
					msgs = ((InternalEObject)step).eInverseRemove(this, CareProcess_modelPackage.STEP__HAZARD_INSTANCES, Step.class, msgs);
				return basicSetStep((Step)otherEnd, msgs);
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION:
				if (hazardDefinition != null)
					msgs = ((InternalEObject)hazardDefinition).eInverseRemove(this, CareProcess_modelPackage.HAZARD_DEFINITION__HAZARD_INSTANCES, HazardDefinition.class, msgs);
				return basicSetHazardDefinition((HazardDefinition)otherEnd, msgs);
			case CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION:
				if (systemFunction != null)
					msgs = ((InternalEObject)systemFunction).eInverseRemove(this, CareProcess_modelPackage.SYSTEM_FUNCTION__HAZARD_INSTANCES, SystemFunction.class, msgs);
				return basicSetSystemFunction((SystemFunction)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CareProcess_modelPackage.HAZARD_INSTANCE__STEP:
				return basicSetStep(null, msgs);
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION:
				return basicSetHazardDefinition(null, msgs);
			case CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION:
				return basicSetSystemFunction(null, msgs);
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDCAUSES:
				return ((InternalEList<?>)getHazardcauses()).basicRemove(otherEnd, msgs);
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDEFFECTS:
				return ((InternalEList<?>)getHazardeffects()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_LIKELIHOOD:
				return getInitialLikelihood();
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_SEVERITY:
				return getInitialSeverity();
			case CareProcess_modelPackage.HAZARD_INSTANCE__STEP:
				if (resolve) return getStep();
				return basicGetStep();
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION:
				if (resolve) return getHazardDefinition();
				return basicGetHazardDefinition();
			case CareProcess_modelPackage.HAZARD_INSTANCE__STATUS:
				return getStatus();
			case CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION:
				if (resolve) return getSystemFunction();
				return basicGetSystemFunction();
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_LIKELIHOOD:
				return getResidualLikelihood();
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_SEVERITY:
				return getResidualSeverity();
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_RISK_RATING:
				return getInitialRiskRating();
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_RISK_RATING:
				return getResidualRiskRating();
			case CareProcess_modelPackage.HAZARD_INSTANCE__DESCRIPTION:
				return getDescription();
			case CareProcess_modelPackage.HAZARD_INSTANCE__OWNER:
				return getOwner();
			case CareProcess_modelPackage.HAZARD_INSTANCE__SUMMARY:
				return getSummary();
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDCAUSES:
				return getHazardcauses();
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDEFFECTS:
				return getHazardeffects();
			case CareProcess_modelPackage.HAZARD_INSTANCE__CLINICAL_JUSTIFICATION:
				return getClinicalJustification();
			case CareProcess_modelPackage.HAZARD_INSTANCE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_LIKELIHOOD:
				setInitialLikelihood((Integer)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_SEVERITY:
				setInitialSeverity((Integer)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__STEP:
				setStep((Step)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION:
				setHazardDefinition((HazardDefinition)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__STATUS:
				setStatus((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION:
				setSystemFunction((SystemFunction)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_LIKELIHOOD:
				setResidualLikelihood((Integer)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_SEVERITY:
				setResidualSeverity((Integer)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_RISK_RATING:
				setInitialRiskRating((Integer)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_RISK_RATING:
				setResidualRiskRating((Integer)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__OWNER:
				setOwner((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__SUMMARY:
				setSummary((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDCAUSES:
				getHazardcauses().clear();
				getHazardcauses().addAll((Collection<? extends HazardCause>)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDEFFECTS:
				getHazardeffects().clear();
				getHazardeffects().addAll((Collection<? extends HazardEffect>)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__CLINICAL_JUSTIFICATION:
				setClinicalJustification((String)newValue);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_LIKELIHOOD:
				setInitialLikelihood(INITIAL_LIKELIHOOD_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_SEVERITY:
				setInitialSeverity(INITIAL_SEVERITY_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__STEP:
				setStep((Step)null);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION:
				setHazardDefinition((HazardDefinition)null);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION:
				setSystemFunction((SystemFunction)null);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_LIKELIHOOD:
				setResidualLikelihood(RESIDUAL_LIKELIHOOD_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_SEVERITY:
				setResidualSeverity(RESIDUAL_SEVERITY_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_RISK_RATING:
				setInitialRiskRating(INITIAL_RISK_RATING_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_RISK_RATING:
				setResidualRiskRating(RESIDUAL_RISK_RATING_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDCAUSES:
				getHazardcauses().clear();
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDEFFECTS:
				getHazardeffects().clear();
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__CLINICAL_JUSTIFICATION:
				setClinicalJustification(CLINICAL_JUSTIFICATION_EDEFAULT);
				return;
			case CareProcess_modelPackage.HAZARD_INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_LIKELIHOOD:
				return initialLikelihood != INITIAL_LIKELIHOOD_EDEFAULT;
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_SEVERITY:
				return initialSeverity != INITIAL_SEVERITY_EDEFAULT;
			case CareProcess_modelPackage.HAZARD_INSTANCE__STEP:
				return step != null;
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARD_DEFINITION:
				return hazardDefinition != null;
			case CareProcess_modelPackage.HAZARD_INSTANCE__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case CareProcess_modelPackage.HAZARD_INSTANCE__SYSTEM_FUNCTION:
				return systemFunction != null;
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_LIKELIHOOD:
				return residualLikelihood != RESIDUAL_LIKELIHOOD_EDEFAULT;
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_SEVERITY:
				return residualSeverity != RESIDUAL_SEVERITY_EDEFAULT;
			case CareProcess_modelPackage.HAZARD_INSTANCE__INITIAL_RISK_RATING:
				return initialRiskRating != INITIAL_RISK_RATING_EDEFAULT;
			case CareProcess_modelPackage.HAZARD_INSTANCE__RESIDUAL_RISK_RATING:
				return residualRiskRating != RESIDUAL_RISK_RATING_EDEFAULT;
			case CareProcess_modelPackage.HAZARD_INSTANCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CareProcess_modelPackage.HAZARD_INSTANCE__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case CareProcess_modelPackage.HAZARD_INSTANCE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDCAUSES:
				return hazardcauses != null && !hazardcauses.isEmpty();
			case CareProcess_modelPackage.HAZARD_INSTANCE__HAZARDEFFECTS:
				return hazardeffects != null && !hazardeffects.isEmpty();
			case CareProcess_modelPackage.HAZARD_INSTANCE__CLINICAL_JUSTIFICATION:
				return CLINICAL_JUSTIFICATION_EDEFAULT == null ? clinicalJustification != null : !CLINICAL_JUSTIFICATION_EDEFAULT.equals(clinicalJustification);
			case CareProcess_modelPackage.HAZARD_INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {

		if (eIsProxy()) return super.toString();
		if(Main.getMode() == ExecutionModes.DEVELOPER){
		
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialLikelihood: ");
		result.append(initialLikelihood);
		result.append(", initialSeverity: ");
		result.append(initialSeverity);
		result.append(", status: ");
		result.append(status);
		result.append(", residualLikelihood: ");
		result.append(residualLikelihood);
		result.append(", residualSeverity: ");
		result.append(residualSeverity);
		result.append(", initialRiskRating: ");
		result.append(initialRiskRating);
		result.append(", residualRiskRating: ");
		result.append(residualRiskRating);
		result.append(", description: ");
		result.append(description);
		result.append(", owner: ");
		result.append(owner);
		result.append(", summary: ");
		result.append(summary);
		result.append(')');
		return result.toString();
		
		}else {
			
			String result2 = "Instance with ";
			if(this.getSystemFunction()!=null){
				result2 += "system function '" + this.getSystemFunction().getFunctionName() + "'";
			}else{
				result2 += "unspecified system function";
			}
			
			if(this.getStep()!=null){
				result2 += ", step '"+ this.getStep().getName()+"'";
			}else{
				result2 += ", unspecified care process step";
			}
				result2 += " - Risk Rating: " + residualRiskRating;
			if(summary!=null){
				result2 += String.format(" - %n"+summary);
			}
			return result2;
		}
	}

} // HazardInstanceImpl
