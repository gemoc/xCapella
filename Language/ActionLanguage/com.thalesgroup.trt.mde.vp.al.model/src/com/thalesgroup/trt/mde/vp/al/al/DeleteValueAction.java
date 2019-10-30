package com.thalesgroup.trt.mde.vp.al.al;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Value Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.DeleteValueAction#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getDeleteValueAction()
 * @model
 * @generated
 */

public interface DeleteValueAction extends Action {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.al.al.ActionValueInput}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getDeleteValueAction_Value()
	 * @model type="com.thalesgroup.trt.mde.vp.al.al.ActionValueInput" containment="true" required="true"
	 * @generated
	 */

	EList getValue();

} // DeleteValueAction
