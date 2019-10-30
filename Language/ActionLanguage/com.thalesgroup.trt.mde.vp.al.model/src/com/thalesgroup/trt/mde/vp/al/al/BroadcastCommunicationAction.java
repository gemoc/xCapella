package com.thalesgroup.trt.mde.vp.al.al;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broadcast Communication Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.BroadcastCommunicationAction#getCommunication <em>Communication</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getBroadcastCommunicationAction()
 * @model
 * @generated
 */

public interface BroadcastCommunicationAction extends Action {

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' reference list.
	 * The list contents are of type {@link org.polarsys.capella.core.data.information.communication.CommunicationItem}.
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' reference list.
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#getBroadcastCommunicationAction_Communication()
	 * @model type="org.polarsys.capella.core.data.information.communication.CommunicationItem" required="true"
	 * @generated
	 */

	EList getCommunication();

} // BroadcastCommunicationAction
