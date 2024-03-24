/**
 */
package RiskMatrixModel.impl;

import RiskMatrixModel.LikelihoodLevel;
import RiskMatrixModel.RiskMatrixModelPackage;
import RiskMatrixModel.RiskRatingInstance;
import RiskMatrixModel.SeverityLevel;
import main.Main;
import main.Main.ExecutionModes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Rating Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiskMatrixModel.impl.RiskRatingInstanceImpl#getRiskValue <em>Risk Value</em>}</li>
 *   <li>{@link RiskMatrixModel.impl.RiskRatingInstanceImpl#getLikelihoodlevel <em>Likelihoodlevel</em>}</li>
 *   <li>{@link RiskMatrixModel.impl.RiskRatingInstanceImpl#getSeveritylevel <em>Severitylevel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskRatingInstanceImpl extends MinimalEObjectImpl.Container implements RiskRatingInstance {
	/**
	 * The default value of the '{@link #getRiskValue() <em>Risk Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskValue()
	 * @generated
	 * @ordered
	 */
	protected static final int RISK_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRiskValue() <em>Risk Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskValue()
	 * @generated
	 * @ordered
	 */
	protected int riskValue = RISK_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLikelihoodlevel() <em>Likelihoodlevel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihoodlevel()
	 * @generated
	 * @ordered
	 */
	protected LikelihoodLevel likelihoodlevel;

	/**
	 * The cached value of the '{@link #getSeveritylevel() <em>Severitylevel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeveritylevel()
	 * @generated
	 * @ordered
	 */
	protected SeverityLevel severitylevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskRatingInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskMatrixModelPackage.Literals.RISK_RATING_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRiskValue() {
		return riskValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskValue(int newRiskValue) {
		int oldRiskValue = riskValue;
		riskValue = newRiskValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskMatrixModelPackage.RISK_RATING_INSTANCE__RISK_VALUE, oldRiskValue, riskValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LikelihoodLevel getLikelihoodlevel() {
		if (likelihoodlevel != null && likelihoodlevel.eIsProxy()) {
			InternalEObject oldLikelihoodlevel = (InternalEObject)likelihoodlevel;
			likelihoodlevel = (LikelihoodLevel)eResolveProxy(oldLikelihoodlevel);
			if (likelihoodlevel != oldLikelihoodlevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL, oldLikelihoodlevel, likelihoodlevel));
			}
		}
		return likelihoodlevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LikelihoodLevel basicGetLikelihoodlevel() {
		return likelihoodlevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLikelihoodlevel(LikelihoodLevel newLikelihoodlevel, NotificationChain msgs) {
		LikelihoodLevel oldLikelihoodlevel = likelihoodlevel;
		likelihoodlevel = newLikelihoodlevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL, oldLikelihoodlevel, newLikelihoodlevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLikelihoodlevel(LikelihoodLevel newLikelihoodlevel) {
		if (newLikelihoodlevel != likelihoodlevel) {
			NotificationChain msgs = null;
			if (likelihoodlevel != null)
				msgs = ((InternalEObject)likelihoodlevel).eInverseRemove(this, RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE, LikelihoodLevel.class, msgs);
			if (newLikelihoodlevel != null)
				msgs = ((InternalEObject)newLikelihoodlevel).eInverseAdd(this, RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE, LikelihoodLevel.class, msgs);
			msgs = basicSetLikelihoodlevel(newLikelihoodlevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL, newLikelihoodlevel, newLikelihoodlevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityLevel getSeveritylevel() {
		if (severitylevel != null && severitylevel.eIsProxy()) {
			InternalEObject oldSeveritylevel = (InternalEObject)severitylevel;
			severitylevel = (SeverityLevel)eResolveProxy(oldSeveritylevel);
			if (severitylevel != oldSeveritylevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RiskMatrixModelPackage.RISK_RATING_INSTANCE__SEVERITYLEVEL, oldSeveritylevel, severitylevel));
			}
		}
		return severitylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityLevel basicGetSeveritylevel() {
		return severitylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeveritylevel(SeverityLevel newSeveritylevel, NotificationChain msgs) {
		SeverityLevel oldSeveritylevel = severitylevel;
		severitylevel = newSeveritylevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RiskMatrixModelPackage.RISK_RATING_INSTANCE__SEVERITYLEVEL, oldSeveritylevel, newSeveritylevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeveritylevel(SeverityLevel newSeveritylevel) {
		if (newSeveritylevel != severitylevel) {
			NotificationChain msgs = null;
			if (severitylevel != null)
				msgs = ((InternalEObject)severitylevel).eInverseRemove(this, RiskMatrixModelPackage.SEVERITY_LEVEL__RISKRATINGINSTANCE, SeverityLevel.class, msgs);
			if (newSeveritylevel != null)
				msgs = ((InternalEObject)newSeveritylevel).eInverseAdd(this, RiskMatrixModelPackage.SEVERITY_LEVEL__RISKRATINGINSTANCE, SeverityLevel.class, msgs);
			msgs = basicSetSeveritylevel(newSeveritylevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskMatrixModelPackage.RISK_RATING_INSTANCE__SEVERITYLEVEL, newSeveritylevel, newSeveritylevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL:
				if (likelihoodlevel != null)
					msgs = ((InternalEObject)likelihoodlevel).eInverseRemove(this, RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE, LikelihoodLevel.class, msgs);
				return basicSetLikelihoodlevel((LikelihoodLevel)otherEnd, msgs);
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__SEVERITYLEVEL:
				if (severitylevel != null)
					msgs = ((InternalEObject)severitylevel).eInverseRemove(this, RiskMatrixModelPackage.SEVERITY_LEVEL__RISKRATINGINSTANCE, SeverityLevel.class, msgs);
				return basicSetSeveritylevel((SeverityLevel)otherEnd, msgs);
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
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL:
				return basicSetLikelihoodlevel(null, msgs);
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__SEVERITYLEVEL:
				return basicSetSeveritylevel(null, msgs);
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
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__RISK_VALUE:
				return getRiskValue();
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL:
				if (resolve) return getLikelihoodlevel();
				return basicGetLikelihoodlevel();
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__SEVERITYLEVEL:
				if (resolve) return getSeveritylevel();
				return basicGetSeveritylevel();
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
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__RISK_VALUE:
				setRiskValue((Integer)newValue);
				return;
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL:
				setLikelihoodlevel((LikelihoodLevel)newValue);
				return;
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__SEVERITYLEVEL:
				setSeveritylevel((SeverityLevel)newValue);
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
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__RISK_VALUE:
				setRiskValue(RISK_VALUE_EDEFAULT);
				return;
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL:
				setLikelihoodlevel((LikelihoodLevel)null);
				return;
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__SEVERITYLEVEL:
				setSeveritylevel((SeverityLevel)null);
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
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__RISK_VALUE:
				return riskValue != RISK_VALUE_EDEFAULT;
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL:
				return likelihoodlevel != null;
			case RiskMatrixModelPackage.RISK_RATING_INSTANCE__SEVERITYLEVEL:
				return severitylevel != null;
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
		result.append(" (riskValue: ");
		result.append(riskValue);
		result.append(')');
		return result.toString();
		}
		return Integer.toString(riskValue);
	}

} //RiskRatingInstanceImpl
