/**
 */
package careProcess_model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>process Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link careProcess_model.processGraph#getCareProcess <em>Care Process</em>}</li>
 *   <li>{@link careProcess_model.processGraph#getGraphData <em>Graph Data</em>}</li>
 *   <li>{@link careProcess_model.processGraph#getDataMap <em>Data Map</em>}</li>
 *   <li>{@link careProcess_model.processGraph#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see careProcess_model.CareProcess_modelPackage#getprocessGraph()
 * @model
 * @generated
 */
public interface processGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link careProcess_model.Step}.
	 * It is bidirectional and its opposite is '{@link careProcess_model.Step#getProcessGraph <em>Process Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see careProcess_model.CareProcess_modelPackage#getprocessGraph_Step()
	 * @see careProcess_model.Step#getProcessGraph
	 * @model opposite="processGraph" containment="true"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Care Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link careProcess_model.CareProcess#getProcessGraph <em>Process Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Process</em>' container reference.
	 * @see #setCareProcess(CareProcess)
	 * @see careProcess_model.CareProcess_modelPackage#getprocessGraph_CareProcess()
	 * @see careProcess_model.CareProcess#getProcessGraph
	 * @model opposite="processGraph" required="true" transient="false"
	 * @generated
	 */
	CareProcess getCareProcess();

	/**
	 * Sets the value of the '{@link careProcess_model.processGraph#getCareProcess <em>Care Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Process</em>' container reference.
	 * @see #getCareProcess()
	 * @generated
	 */
	void setCareProcess(CareProcess value);

	/**
	 * Returns the value of the '<em><b>Graph Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Data</em>' attribute.
	 * @see #setGraphData(String)
	 * @see careProcess_model.CareProcess_modelPackage#getprocessGraph_GraphData()
	 * @model
	 * @generated
	 */
	String getGraphData();

	/**
	 * Sets the value of the '{@link careProcess_model.processGraph#getGraphData <em>Graph Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Data</em>' attribute.
	 * @see #getGraphData()
	 * @generated
	 */
	void setGraphData(String value);

	/**
	 * Returns the value of the '<em><b>Data Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Map</em>' attribute.
	 * @see #isSetDataMap()
	 * @see #unsetDataMap()
	 * @see #setDataMap(String)
	 * @see careProcess_model.CareProcess_modelPackage#getprocessGraph_DataMap()
	 * @model unsettable="true" required="true" ordered="false"
	 * @generated
	 */
	String getDataMap();

	/**
	 * Sets the value of the '{@link careProcess_model.processGraph#getDataMap <em>Data Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Map</em>' attribute.
	 * @see #isSetDataMap()
	 * @see #unsetDataMap()
	 * @see #getDataMap()
	 * @generated
	 */
	void setDataMap(String value);

	/**
	 * Unsets the value of the '{@link careProcess_model.processGraph#getDataMap <em>Data Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataMap()
	 * @see #getDataMap()
	 * @see #setDataMap(String)
	 * @generated
	 */
	void unsetDataMap();

	/**
	 * Returns whether the value of the '{@link careProcess_model.processGraph#getDataMap <em>Data Map</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Map</em>' attribute is set.
	 * @see #unsetDataMap()
	 * @see #getDataMap()
	 * @see #setDataMap(String)
	 * @generated
	 */
	boolean isSetDataMap();

} // processGraph
