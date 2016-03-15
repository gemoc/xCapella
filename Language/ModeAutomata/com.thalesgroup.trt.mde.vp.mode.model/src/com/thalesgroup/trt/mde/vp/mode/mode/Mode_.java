package com.thalesgroup.trt.mde.vp.mode.mode;

import com.thalesgroup.trt.mde.vp.al.al.Action;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.fa.FunctionalChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Mode_#getEnterActions <em>Enter Actions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Mode_#getDoActions <em>Do Actions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Mode_#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Mode_#getAvailableFunctionalChains <em>Available Functional Chains</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Mode_#getSubModeMachine <em>Sub Mode Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getMode_()
 * @model
 * @generated
 */

public interface Mode_ extends AbstractMode {

	/**
	 * Returns the value of the '<em><b>Enter Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.al.al.Action}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enter Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enter Actions</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getMode__EnterActions()
	 * @model containment="true"
	 * @generated
	 */

	EList<Action> getEnterActions();

	/**
	 * Returns the value of the '<em><b>Do Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.al.al.Action}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do Actions</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getMode__DoActions()
	 * @model containment="true"
	 * @generated
	 */

	EList<Action> getDoActions();

	/**
	 * Returns the value of the '<em><b>Exit Actions</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.al.al.Action}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Actions</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getMode__ExitActions()
	 * @model containment="true"
	 * @generated
	 */

	EList<Action> getExitActions();

	/**
	 * Returns the value of the '<em><b>Available Functional Chains</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.fa.FunctionalChain}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Functional Chains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Functional Chains</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getMode__AvailableFunctionalChains()
	 * @model
	 * @generated
	 */

	EList<FunctionalChain> getAvailableFunctionalChains();

	/**
	 * Returns the value of the '<em><b>Sub Mode Machine</b></em>' containment reference.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Mode Machine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Mode Machine</em>' containment reference.
	 * @see #setSubModeMachine(ModeMachine)
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getMode__SubModeMachine()
	 * @model containment="true"
	 * @generated
	 */

	ModeMachine getSubModeMachine();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.mode.mode.Mode_#getSubModeMachine <em>Sub Mode Machine</em>}' containment reference.

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Mode Machine</em>' containment reference.
	 * @see #getSubModeMachine()
	 * @generated
	 */

	void setSubModeMachine(ModeMachine value);

} // Mode_
