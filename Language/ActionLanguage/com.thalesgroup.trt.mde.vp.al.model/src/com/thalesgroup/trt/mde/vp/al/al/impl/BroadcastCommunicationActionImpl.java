package com.thalesgroup.trt.mde.vp.al.al.impl;

import com.thalesgroup.trt.mde.vp.al.al.AlPackage;
import com.thalesgroup.trt.mde.vp.al.al.BroadcastCommunicationAction;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.polarsys.capella.core.data.information.communication.CommunicationItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Broadcast Communication Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.thalesgroup.trt.mde.vp.al.al.impl.BroadcastCommunicationActionImpl#getCommunication <em>Communication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BroadcastCommunicationActionImpl extends ActionImpl implements
		BroadcastCommunicationAction {

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList communication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BroadcastCommunicationActionImpl() {

		super();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AlPackage.Literals.BROADCAST_COMMUNICATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCommunication() {

		if (communication == null) {
			communication = new EObjectResolvingEList(CommunicationItem.class,
					this,
					AlPackage.BROADCAST_COMMUNICATION_ACTION__COMMUNICATION);
		}
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AlPackage.BROADCAST_COMMUNICATION_ACTION__COMMUNICATION:
			return getCommunication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AlPackage.BROADCAST_COMMUNICATION_ACTION__COMMUNICATION:
			getCommunication().clear();
			getCommunication().addAll((Collection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case AlPackage.BROADCAST_COMMUNICATION_ACTION__COMMUNICATION:
			getCommunication().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AlPackage.BROADCAST_COMMUNICATION_ACTION__COMMUNICATION:
			return communication != null && !communication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BroadcastCommunicationActionImpl