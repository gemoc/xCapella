package com.thalesgroup.trt.mde.vp.al.al;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.common.data.behavior.AbstractBehavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Behavior Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.CallBehaviorAction#getArguments <em>Arguments</em>}</li>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.CallBehaviorAction#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getCallBehaviorAction()
 * @model
 * @generated
 */

public interface CallBehaviorAction extends Action {

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.trt.mde.vp.al.al.ActionInput}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getCallBehaviorAction_Arguments()
	 * @model type="com.thalesgroup.trt.mde.vp.al.al.ActionInput" containment="true"
	 * @generated
	 */

	EList getArguments();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(AbstractBehavior)
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getCallBehaviorAction_Behavior()
	 * @model required="true"
	 * @generated
	 */

	AbstractBehavior getBehavior();

	/**
	 * Sets the value of the '{@link com.thalesgroup.trt.mde.vp.al.al.CallBehaviorAction#getBehavior <em>Behavior</em>}' reference.
	
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */

	void setBehavior(AbstractBehavior value);

} // CallBehaviorAction
