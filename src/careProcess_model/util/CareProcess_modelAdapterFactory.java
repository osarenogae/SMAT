/**
 */
package careProcess_model.util;

import careProcess_model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see careProcess_model.CareProcess_modelPackage
 * @generated
 */
public class CareProcess_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CareProcess_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CareProcess_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CareProcess_modelPackage.eINSTANCE;
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
	protected CareProcess_modelSwitch<Adapter> modelSwitch =
		new CareProcess_modelSwitch<Adapter>() {
			@Override
			public Adapter caseprocessGraph(processGraph object) {
				return createprocessGraphAdapter();
			}
			@Override
			public Adapter caseSystemFunction(SystemFunction object) {
				return createSystemFunctionAdapter();
			}
			@Override
			public Adapter caseCareProcess(CareProcess object) {
				return createCareProcessAdapter();
			}
			@Override
			public Adapter caseHazardInstance(HazardInstance object) {
				return createHazardInstanceAdapter();
			}
			@Override
			public Adapter caseHazardControl(HazardControl object) {
				return createHazardControlAdapter();
			}
			@Override
			public Adapter caseHazardCause(HazardCause object) {
				return createHazardCauseAdapter();
			}
			@Override
			public Adapter caseHazardEffect(HazardEffect object) {
				return createHazardEffectAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseStart(Start object) {
				return createStartAdapter();
			}
			@Override
			public Adapter caseStop(Stop object) {
				return createStopAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseHazardRepository(HazardRepository object) {
				return createHazardRepositoryAdapter();
			}
			@Override
			public Adapter caseHazardDefinition(HazardDefinition object) {
				return createHazardDefinitionAdapter();
			}
			@Override
			public Adapter caseLocationRepository(LocationRepository object) {
				return createLocationRepositoryAdapter();
			}
			@Override
			public Adapter caseLocationDefinition(LocationDefinition object) {
				return createLocationDefinitionAdapter();
			}
			@Override
			public Adapter caseSystemRepository(SystemRepository object) {
				return createSystemRepositoryAdapter();
			}
			@Override
			public Adapter caseSystemDefinition(SystemDefinition object) {
				return createSystemDefinitionAdapter();
			}
			@Override
			public Adapter caseDataStore(DataStore object) {
				return createDataStoreAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseHazardFactor(HazardFactor object) {
				return createHazardFactorAdapter();
			}
			@Override
			public Adapter caseReportData(ReportData object) {
				return createReportDataAdapter();
			}
			@Override
			public Adapter caseIssueDefinition(IssueDefinition object) {
				return createIssueDefinitionAdapter();
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
	 * Creates a new adapter for an object of class '{@link careProcess_model.processGraph <em>process Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.processGraph
	 * @generated
	 */
	public Adapter createprocessGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.SystemFunction <em>System Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.SystemFunction
	 * @generated
	 */
	public Adapter createSystemFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.CareProcess <em>Care Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.CareProcess
	 * @generated
	 */
	public Adapter createCareProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.HazardInstance <em>Hazard Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.HazardInstance
	 * @generated
	 */
	public Adapter createHazardInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.HazardControl <em>Hazard Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.HazardControl
	 * @generated
	 */
	public Adapter createHazardControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.HazardCause <em>Hazard Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.HazardCause
	 * @generated
	 */
	public Adapter createHazardCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.HazardEffect <em>Hazard Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.HazardEffect
	 * @generated
	 */
	public Adapter createHazardEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.Stop
	 * @generated
	 */
	public Adapter createStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.HazardRepository <em>Hazard Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.HazardRepository
	 * @generated
	 */
	public Adapter createHazardRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.HazardDefinition <em>Hazard Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.HazardDefinition
	 * @generated
	 */
	public Adapter createHazardDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.LocationRepository <em>Location Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.LocationRepository
	 * @generated
	 */
	public Adapter createLocationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.LocationDefinition <em>Location Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.LocationDefinition
	 * @generated
	 */
	public Adapter createLocationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.SystemRepository <em>System Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.SystemRepository
	 * @generated
	 */
	public Adapter createSystemRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.SystemDefinition <em>System Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.SystemDefinition
	 * @generated
	 */
	public Adapter createSystemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.DataStore
	 * @generated
	 */
	public Adapter createDataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.HazardFactor <em>Hazard Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.HazardFactor
	 * @generated
	 */
	public Adapter createHazardFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.ReportData <em>Report Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.ReportData
	 * @generated
	 */
	public Adapter createReportDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link careProcess_model.IssueDefinition <em>Issue Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see careProcess_model.IssueDefinition
	 * @generated
	 */
	public Adapter createIssueDefinitionAdapter() {
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

} //CareProcess_modelAdapterFactory
