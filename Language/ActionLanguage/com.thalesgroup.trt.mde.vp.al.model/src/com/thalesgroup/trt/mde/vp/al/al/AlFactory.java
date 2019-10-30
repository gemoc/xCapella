package com.thalesgroup.trt.mde.vp.al.al;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage
 * @generated
 */
public interface AlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlFactory eINSTANCE = com.thalesgroup.trt.mde.vp.al.al.impl.AlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Action Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Input</em>'.
	 * @generated
	 */
	ActionInput createActionInput();

	/**
	 * Returns a new object of class '<em>Action Value Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Value Input</em>'.
	 * @generated
	 */
	ActionValueInput createActionValueInput();

	/**
	 * Returns a new object of class '<em>Action Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Output</em>'.
	 * @generated
	 */
	ActionOutput createActionOutput();

	/**
	 * Returns a new object of class '<em>Action Value Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Value Output</em>'.
	 * @generated
	 */
	ActionValueOutput createActionValueOutput();

	/**
	 * Returns a new object of class '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Behavior Action</em>'.
	 * @generated
	 */
	CallBehaviorAction createCallBehaviorAction();

	/**
	 * Returns a new object of class '<em>Send Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Event Action</em>'.
	 * @generated
	 */
	SendEventAction createSendEventAction();

	/**
	 * Returns a new object of class '<em>Broadcast Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broadcast Event Action</em>'.
	 * @generated
	 */
	BroadcastEventAction createBroadcastEventAction();

	/**
	 * Returns a new object of class '<em>Send Communication Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Communication Action</em>'.
	 * @generated
	 */
	SendCommunicationAction createSendCommunicationAction();

	/**
	 * Returns a new object of class '<em>Broadcast Communication Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broadcast Communication Action</em>'.
	 * @generated
	 */
	BroadcastCommunicationAction createBroadcastCommunicationAction();

	/**
	 * Returns a new object of class '<em>Create Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Value Action</em>'.
	 * @generated
	 */
	CreateValueAction createCreateValueAction();

	/**
	 * Returns a new object of class '<em>Read Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Value Action</em>'.
	 * @generated
	 */
	ReadValueAction createReadValueAction();

	/**
	 * Returns a new object of class '<em>Update Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Value Action</em>'.
	 * @generated
	 */
	UpdateValueAction createUpdateValueAction();

	/**
	 * Returns a new object of class '<em>Delete Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Value Action</em>'.
	 * @generated
	 */
	DeleteValueAction createDeleteValueAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AlPackage getAlPackage();

} //AlFactory
