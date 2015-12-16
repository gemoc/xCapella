package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData#isIsActive <em>Is Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage#getFunctionRuntimeData()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/fa/0.8.0#//AbstractFunction'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction'"
 * @generated
 */

public interface FunctionRuntimeData extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage#getFunctionRuntimeData_IsActive()
	 * @model transient="true"
	 * @generated
	 */

	boolean isIsActive();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData#isIsActive <em>Is Active</em>}' attribute.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */

	void setIsActive(boolean value);

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	String activate();

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	String deactivate();

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	String init();

} // FunctionRuntimeData
