package com.thalesgroup.trt.mde.vp.al.al;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Event Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.SendEventAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getSendEventAction()
 * @model
 * @generated
 */

public interface SendEventAction extends BroadcastEventAction {

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.capellacore.CapellaElement}.

	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getSendEventAction_Target()
	 * @model type="org.polarsys.capella.core.data.capellacore.CapellaElement" required="true"
	 * @generated
	 */

	EList getTarget();

} // SendEventAction
