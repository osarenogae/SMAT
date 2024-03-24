/**
 */
package RiskMatrixModel.util;

import RiskMatrixModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see RiskMatrixModel.RiskMatrixModelPackage
 * @generated
 */
public class RiskMatrixModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RiskMatrixModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskMatrixModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RiskMatrixModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskMatrixModelSwitch<Adapter> modelSwitch =
		new RiskMatrixModelSwitch<Adapter>() {
			@Override
			public Adapter caseRiskMatrix(RiskMatrix object) {
				return createRiskMatrixAdapter();
			}
			@Override
			public Adapter caseLikelihoodLevel(LikelihoodLevel object) {
				return createLikelihoodLevelAdapter();
			}
			@Override
			public Adapter caseRiskRatingInstance(RiskRatingInstance object) {
				return createRiskRatingInstanceAdapter();
			}
			@Override
			public Adapter caseSeverityLevel(SeverityLevel object) {
				return createSeverityLevelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link RiskMatrixModel.RiskMatrix <em>Risk Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiskMatrixModel.RiskMatrix
	 * @generated
	 */
	public Adapter createRiskMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiskMatrixModel.LikelihoodLevel <em>Likelihood Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiskMatrixModel.LikelihoodLevel
	 * @generated
	 */
	public Adapter createLikelihoodLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiskMatrixModel.RiskRatingInstance <em>Risk Rating Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiskMatrixModel.RiskRatingInstance
	 * @generated
	 */
	public Adapter createRiskRatingInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RiskMatrixModel.SeverityLevel <em>Severity Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RiskMatrixModel.SeverityLevel
	 * @generated
	 */
	public Adapter createSeverityLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RiskMatrixModelAdapterFactory
