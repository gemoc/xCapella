package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation;

import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData#getCurrent <em>Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage#getMachineRuntimeData()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.thalesgroup.com/trt/mode/1.0.0#//ModeMachine'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/resource/com.thalesgroup.trt.mde.vp.mode/models/mode.ecore#//ModeMachine'"
 * @generated
 */

public interface MachineRuntimeData extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(AbstractMode)
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage#getMachineRuntimeData_Current()
	 * @model transient="true"
	 * @generated
	 */

	AbstractMode getCurrent();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData#getCurrent <em>Current</em>}' reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */

	void setCurrent(AbstractMode value);

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	String init();

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newStateRequired="true"
	 * @generated
	 */

	void changeCurrentState(AbstractMode newState);

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	String launchWhileActions();

} // MachineRuntimeData
