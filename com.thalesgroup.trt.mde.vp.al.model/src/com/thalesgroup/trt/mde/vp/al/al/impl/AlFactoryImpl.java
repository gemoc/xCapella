package com.thalesgroup.trt.mde.vp.al.al.impl;

import com.thalesgroup.trt.mde.vp.al.al.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlFactoryImpl extends EFactoryImpl implements AlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AlFactory init() {
		try {
			AlFactory theAlFactory = (AlFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.thalesgroup.com/trt/al/1.0.0"); //$NON-NLS-1$ 
			if (theAlFactory != null) {
				return theAlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AlPackage.ACTION_INPUT:
			return createActionInput();
		case AlPackage.ACTION_VALUE_INPUT:
			return createActionValueInput();
		case AlPackage.ACTION_OUTPUT:
			return createActionOutput();
		case AlPackage.ACTION_VALUE_OUTPUT:
			return createActionValueOutput();
		case AlPackage.CALL_BEHAVIOR_ACTION:
			return createCallBehaviorAction();
		case AlPackage.SEND_EVENT_ACTION:
			return createSendEventAction();
		case AlPackage.BROADCAST_EVENT_ACTION:
			return createBroadcastEventAction();
		case AlPackage.SEND_COMMUNICATION_ACTION:
			return createSendCommunicationAction();
		case AlPackage.BROADCAST_COMMUNICATION_ACTION:
			return createBroadcastCommunicationAction();
		case AlPackage.CREATE_VALUE_ACTION:
			return createCreateValueAction();
		case AlPackage.READ_VALUE_ACTION:
			return createReadValueAction();
		case AlPackage.UPDATE_VALUE_ACTION:
			return createUpdateValueAction();
		case AlPackage.DELETE_VALUE_ACTION:
			return createDeleteValueAction();
		default:
			throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInput createActionInput() {
		ActionInputImpl actionInput = new ActionInputImpl();
		return actionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionValueInput createActionValueInput() {
		ActionValueInputImpl actionValueInput = new ActionValueInputImpl();
		return actionValueInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionOutput createActionOutput() {
		ActionOutputImpl actionOutput = new ActionOutputImpl();
		return actionOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionValueOutput createActionValueOutput() {
		ActionValueOutputImpl actionValueOutput = new ActionValueOutputImpl();
		return actionValueOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorAction createCallBehaviorAction() {
		CallBehaviorActionImpl callBehaviorAction = new CallBehaviorActionImpl();
		return callBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendEventAction createSendEventAction() {
		SendEventActionImpl sendEventAction = new SendEventActionImpl();
		return sendEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastEventAction createBroadcastEventAction() {
		BroadcastEventActionImpl broadcastEventAction = new BroadcastEventActionImpl();
		return broadcastEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendCommunicationAction createSendCommunicationAction() {
		SendCommunicationActionImpl sendCommunicationAction = new SendCommunicationActionImpl();
		return sendCommunicationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastCommunicationAction createBroadcastCommunicationAction() {
		BroadcastCommunicationActionImpl broadcastCommunicationAction = new BroadcastCommunicationActionImpl();
		return broadcastCommunicationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateValueAction createCreateValueAction() {
		CreateValueActionImpl createValueAction = new CreateValueActionImpl();
		return createValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadValueAction createReadValueAction() {
		ReadValueActionImpl readValueAction = new ReadValueActionImpl();
		return readValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateValueAction createUpdateValueAction() {
		UpdateValueActionImpl updateValueAction = new UpdateValueActionImpl();
		return updateValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteValueAction createDeleteValueAction() {
		DeleteValueActionImpl deleteValueAction = new DeleteValueActionImpl();
		return deleteValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlPackage getAlPackage() {
		return (AlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static AlPackage getPackage() {
		return AlPackage.eINSTANCE;
	}

} //AlFactoryImpl
