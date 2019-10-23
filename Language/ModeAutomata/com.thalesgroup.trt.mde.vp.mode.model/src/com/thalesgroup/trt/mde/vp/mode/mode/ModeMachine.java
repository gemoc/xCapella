package com.thalesgroup.trt.mde.vp.mode.mode;

import com.thalesgroup.trt.mde.vp.expression.expression.Variable;

import com.thalesgroup.trt.mde.vp.time.time.Clock;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.common.data.behavior.AbstractEvent;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.capella.core.data.information.communication.Signal;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getOwnedModes <em>Owned Modes</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getInputEvents <em>Input Events</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getInputSignals <em>Input Signals</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getOutputEvents <em>Output Events</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getOutputSignals <em>Output Signals</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getLocalClocks <em>Local Clocks</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.polarsys.org/capella/core/cs/1.3.0#//Component'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Component'"
 * @generated
 */

public interface ModeMachine extends NamedElement, ElementExtension {

	/**
	 * Returns the value of the '<em><b>Owned Modes</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Modes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Modes</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine_OwnedModes()
	 * @model containment="true"
	 * @generated
	 */

	EList<AbstractMode> getOwnedModes();

	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.mode.mode.Transition}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine_OwnedTransitions()
	 * @model containment="true"
	 * @generated
	 */

	EList<Transition> getOwnedTransitions();

	/**
	 * Returns the value of the '<em><b>Input Events</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.common.data.behavior.AbstractEvent}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Events</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine_InputEvents()
	 * @model
	 * @generated
	 */

	EList<AbstractEvent> getInputEvents();

	/**
	 * Returns the value of the '<em><b>Input Signals</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.information.communication.Signal}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Signals</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine_InputSignals()
	 * @model
	 * @generated
	 */

	EList<Signal> getInputSignals();

	/**
	 * Returns the value of the '<em><b>Output Events</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.common.data.behavior.AbstractEvent}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Events</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine_OutputEvents()
	 * @model
	 * @generated
	 */

	EList<AbstractEvent> getOutputEvents();

	/**
	 * Returns the value of the '<em><b>Output Signals</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.information.communication.Signal}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Signals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Signals</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine_OutputSignals()
	 * @model
	 * @generated
	 */

	EList<Signal> getOutputSignals();

	/**
	 * Returns the value of the '<em><b>Local Clocks</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.time.time.Clock}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Clocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Clocks</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine_LocalClocks()
	 * @model containment="true"
	 * @generated
	 */

	EList<Clock> getLocalClocks();

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.expression.expression.Variable}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine_LocalVariables()
	 * @model containment="true"
	 * @generated
	 */

	EList<Variable> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(Initial)
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getModeMachine_Initial()
	 * @model required="true"
	 * @generated
	 */

	Initial getInitial();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine#getInitial <em>Initial</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */

	void setInitial(Initial value);

} // ModeMachine
