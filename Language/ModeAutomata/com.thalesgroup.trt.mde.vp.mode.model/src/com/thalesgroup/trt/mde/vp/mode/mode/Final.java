package com.thalesgroup.trt.mde.vp.mode.mode;

import com.thalesgroup.trt.mde.vp.al.al.Action;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.mode.mode.Final#getEnterActions <em>Enter Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getFinal()
 * @model
 * @generated
 */

public interface Final extends ControlNode {

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
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#getFinal_EnterActions()
	 * @model containment="true"
	 * @generated
	 */

	EList<Action> getEnterActions();

} // Final
