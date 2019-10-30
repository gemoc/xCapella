package com.thalesgroup.trt.mde.vp.al.al;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.BroadcastEventAction#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getBroadcastEventAction()
 * @model
 * @generated
 */

public interface BroadcastEventAction extends Action {

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.common.data.behavior.AbstractEvent}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getBroadcastEventAction_Event()
	 * @model type="org.polarsys.capella.common.data.behavior.AbstractEvent" required="true"
	 * @generated
	 */

	EList getEvent();

} // BroadcastEventAction
