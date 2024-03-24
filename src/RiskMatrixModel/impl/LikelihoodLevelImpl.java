/**
 */
package RiskMatrixModel.impl;

import RiskMatrixModel.LikelihoodLevel;
import RiskMatrixModel.RiskMatrixModelPackage;
import RiskMatrixModel.RiskRatingInstance;
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
 * An implementation of the model object '<em><b>Likelihood Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiskMatrixModel.impl.LikelihoodLevelImpl#getLevelName <em>Level Name</em>}</li>
 *   <li>{@link RiskMatrixModel.impl.LikelihoodLevelImpl#getLevelIndex <em>Level Index</em>}</li>
 *   <li>{@link RiskMatrixModel.impl.LikelihoodLevelImpl#getRiskratinginstance <em>Riskratinginstance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LikelihoodLevelImpl extends MinimalEObjectImpl.Container implements LikelihoodLevel {
	/**
	 * The default value of the '{@link #getLevelName() <em>Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelName()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelName() <em>Level Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelName()
	 * @generated
	 * @ordered
	 */
	protected String levelName = LEVEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelIndex() <em>Level Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevelIndex() <em>Level Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelIndex()
	 * @generated
	 * @ordered
	 */
	protected int levelIndex = LEVEL_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRiskratinginstance() <em>Riskratinginstance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskratinginstance()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskRatingInstance> riskratinginstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LikelihoodLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskMatrixModelPackage.Literals.LIKELIHOOD_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevelName() {
		return levelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelName(String newLevelName) {
		String oldLevelName = levelName;
		levelName = newLevelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_NAME, oldLevelName, levelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevelIndex() {
		return levelIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelIndex(int newLevelIndex) {
		int oldLevelIndex = levelIndex;
		levelIndex = newLevelIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_INDEX, oldLevelIndex, levelIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RiskRatingInstance> getRiskratinginstance() {
		if (riskratinginstance == null) {
			riskratinginstance = new EObjectWithInverseResolvingEList<RiskRatingInstance>(RiskRatingInstance.class, this, RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE, RiskMatrixModelPackage.RISK_RATING_INSTANCE__LIKELIHOODLEVEL);
		}
		return riskratinginstance;
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
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRiskratinginstance()).basicAdd(otherEnd, msgs);
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
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE:
				return ((InternalEList<?>)getRiskratinginstance()).basicRemove(otherEnd, msgs);
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
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_NAME:
				return getLevelName();
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_INDEX:
				return getLevelIndex();
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE:
				return getRiskratinginstance();
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
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_NAME:
				setLevelName((String)newValue);
				return;
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_INDEX:
				setLevelIndex((Integer)newValue);
				return;
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE:
				getRiskratinginstance().clear();
				getRiskratinginstance().addAll((Collection<? extends RiskRatingInstance>)newValue);
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
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_NAME:
				setLevelName(LEVEL_NAME_EDEFAULT);
				return;
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_INDEX:
				setLevelIndex(LEVEL_INDEX_EDEFAULT);
				return;
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE:
				getRiskratinginstance().clear();
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
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_NAME:
				return LEVEL_NAME_EDEFAULT == null ? levelName != null : !LEVEL_NAME_EDEFAULT.equals(levelName);
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__LEVEL_INDEX:
				return levelIndex != LEVEL_INDEX_EDEFAULT;
			case RiskMatrixModelPackage.LIKELIHOOD_LEVEL__RISKRATINGINSTANCE:
				return riskratinginstance != null && !riskratinginstance.isEmpty();
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
		result.append(" (levelName: ");
		result.append(levelName);
		result.append(", levelIndex: ");
		result.append(levelIndex);
		result.append(')');
		return result.toString();
		}
		return levelName;
	}

} //LikelihoodLevelImpl
