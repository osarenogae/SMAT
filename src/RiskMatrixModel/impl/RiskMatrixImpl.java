/**
 */
package RiskMatrixModel.impl;

import RiskMatrixModel.LikelihoodLevel;
import RiskMatrixModel.RiskMatrix;
import RiskMatrixModel.RiskMatrixModelPackage;
import RiskMatrixModel.RiskRatingInstance;
import RiskMatrixModel.SeverityLevel;

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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RiskMatrixModel.impl.RiskMatrixImpl#getLikelihoodlevel <em>Likelihoodlevel</em>}</li>
 *   <li>{@link RiskMatrixModel.impl.RiskMatrixImpl#getRiskratinginstance <em>Riskratinginstance</em>}</li>
 *   <li>{@link RiskMatrixModel.impl.RiskMatrixImpl#getSeveritylevel <em>Severitylevel</em>}</li>
 *   <li>{@link RiskMatrixModel.impl.RiskMatrixImpl#getMinUnacceptableRisk <em>Min Unacceptable Risk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskMatrixImpl extends MinimalEObjectImpl.Container implements RiskMatrix {
	/**
	 * The cached value of the '{@link #getLikelihoodlevel() <em>Likelihoodlevel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihoodlevel()
	 * @generated
	 * @ordered
	 */
	protected EList<LikelihoodLevel> likelihoodlevel;

	/**
	 * The cached value of the '{@link #getRiskratinginstance() <em>Riskratinginstance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskratinginstance()
	 * @generated
	 * @ordered
	 */
	protected EList<RiskRatingInstance> riskratinginstance;

	/**
	 * The cached value of the '{@link #getSeveritylevel() <em>Severitylevel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeveritylevel()
	 * @generated
	 * @ordered
	 */
	protected EList<SeverityLevel> severitylevel;

	/**
	 * The default value of the '{@link #getMinUnacceptableRisk() <em>Min Unacceptable Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinUnacceptableRisk()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_UNACCEPTABLE_RISK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinUnacceptableRisk() <em>Min Unacceptable Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinUnacceptableRisk()
	 * @generated
	 * @ordered
	 */
	protected int minUnacceptableRisk = MIN_UNACCEPTABLE_RISK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RiskMatrixModelPackage.Literals.RISK_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LikelihoodLevel> getLikelihoodlevel() {
		if (likelihoodlevel == null) {
			likelihoodlevel = new EObjectContainmentEList<LikelihoodLevel>(LikelihoodLevel.class, this, RiskMatrixModelPackage.RISK_MATRIX__LIKELIHOODLEVEL);
		}
		return likelihoodlevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RiskRatingInstance> getRiskratinginstance() {
		if (riskratinginstance == null) {
			riskratinginstance = new EObjectContainmentEList<RiskRatingInstance>(RiskRatingInstance.class, this, RiskMatrixModelPackage.RISK_MATRIX__RISKRATINGINSTANCE);
		}
		return riskratinginstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SeverityLevel> getSeveritylevel() {
		if (severitylevel == null) {
			severitylevel = new EObjectContainmentEList<SeverityLevel>(SeverityLevel.class, this, RiskMatrixModelPackage.RISK_MATRIX__SEVERITYLEVEL);
		}
		return severitylevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinUnacceptableRisk() {
		return minUnacceptableRisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinUnacceptableRisk(int newMinUnacceptableRisk) {
		int oldMinUnacceptableRisk = minUnacceptableRisk;
		minUnacceptableRisk = newMinUnacceptableRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RiskMatrixModelPackage.RISK_MATRIX__MIN_UNACCEPTABLE_RISK, oldMinUnacceptableRisk, minUnacceptableRisk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RiskMatrixModelPackage.RISK_MATRIX__LIKELIHOODLEVEL:
				return ((InternalEList<?>)getLikelihoodlevel()).basicRemove(otherEnd, msgs);
			case RiskMatrixModelPackage.RISK_MATRIX__RISKRATINGINSTANCE:
				return ((InternalEList<?>)getRiskratinginstance()).basicRemove(otherEnd, msgs);
			case RiskMatrixModelPackage.RISK_MATRIX__SEVERITYLEVEL:
				return ((InternalEList<?>)getSeveritylevel()).basicRemove(otherEnd, msgs);
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
			case RiskMatrixModelPackage.RISK_MATRIX__LIKELIHOODLEVEL:
				return getLikelihoodlevel();
			case RiskMatrixModelPackage.RISK_MATRIX__RISKRATINGINSTANCE:
				return getRiskratinginstance();
			case RiskMatrixModelPackage.RISK_MATRIX__SEVERITYLEVEL:
				return getSeveritylevel();
			case RiskMatrixModelPackage.RISK_MATRIX__MIN_UNACCEPTABLE_RISK:
				return getMinUnacceptableRisk();
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
			case RiskMatrixModelPackage.RISK_MATRIX__LIKELIHOODLEVEL:
				getLikelihoodlevel().clear();
				getLikelihoodlevel().addAll((Collection<? extends LikelihoodLevel>)newValue);
				return;
			case RiskMatrixModelPackage.RISK_MATRIX__RISKRATINGINSTANCE:
				getRiskratinginstance().clear();
				getRiskratinginstance().addAll((Collection<? extends RiskRatingInstance>)newValue);
				return;
			case RiskMatrixModelPackage.RISK_MATRIX__SEVERITYLEVEL:
				getSeveritylevel().clear();
				getSeveritylevel().addAll((Collection<? extends SeverityLevel>)newValue);
				return;
			case RiskMatrixModelPackage.RISK_MATRIX__MIN_UNACCEPTABLE_RISK:
				setMinUnacceptableRisk((Integer)newValue);
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
			case RiskMatrixModelPackage.RISK_MATRIX__LIKELIHOODLEVEL:
				getLikelihoodlevel().clear();
				return;
			case RiskMatrixModelPackage.RISK_MATRIX__RISKRATINGINSTANCE:
				getRiskratinginstance().clear();
				return;
			case RiskMatrixModelPackage.RISK_MATRIX__SEVERITYLEVEL:
				getSeveritylevel().clear();
				return;
			case RiskMatrixModelPackage.RISK_MATRIX__MIN_UNACCEPTABLE_RISK:
				setMinUnacceptableRisk(MIN_UNACCEPTABLE_RISK_EDEFAULT);
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
			case RiskMatrixModelPackage.RISK_MATRIX__LIKELIHOODLEVEL:
				return likelihoodlevel != null && !likelihoodlevel.isEmpty();
			case RiskMatrixModelPackage.RISK_MATRIX__RISKRATINGINSTANCE:
				return riskratinginstance != null && !riskratinginstance.isEmpty();
			case RiskMatrixModelPackage.RISK_MATRIX__SEVERITYLEVEL:
				return severitylevel != null && !severitylevel.isEmpty();
			case RiskMatrixModelPackage.RISK_MATRIX__MIN_UNACCEPTABLE_RISK:
				return minUnacceptableRisk != MIN_UNACCEPTABLE_RISK_EDEFAULT;
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
		result.append(" (minUnacceptableRisk: ");
		result.append(minUnacceptableRisk);
		result.append(')');
		return result.toString();
	}

} //RiskMatrixImpl
