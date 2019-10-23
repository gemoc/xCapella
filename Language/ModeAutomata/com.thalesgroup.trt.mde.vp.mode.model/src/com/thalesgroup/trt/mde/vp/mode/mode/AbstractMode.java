package com.thalesgroup.trt.mde.vp.mode.mode;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getAbstractMode()
 * @model abstract="true"
 * @generated
 */

public interface AbstractMode extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.mode.mode.Transition}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getAbstractMode_OutgoingTransitions()
	 * @model
	 * @generated
	 */

	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.mode.mode.Transition}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getAbstractMode_IncomingTransitions()
	 * @model
	 * @generated
	 */

	EList<Transition> getIncomingTransitions();

} // AbstractMode
