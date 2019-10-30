package com.thalesgroup.trt.mde.vp.al.al.impl;

import com.thalesgroup.trt.mde.vp.al.al.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.capella.common.lib.IdGenerator;

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
			AlFactory theAlFactory = (AlFactory) EPackage.Registry.INSTANCE.getEFactory(AlPackage.eNS_URI);
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
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionInput createActionInput() {
		ActionInputImpl actionInput = new ActionInputImpl();
		//begin-capella-code

		actionInput.setId(IdGenerator.createId());

		//end-capella-code
		return actionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionValueInput createActionValueInput() {
		ActionValueInputImpl actionValueInput = new ActionValueInputImpl();
		//begin-capella-code

		actionValueInput.setId(IdGenerator.createId());

		//end-capella-code
		return actionValueInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionOutput createActionOutput() {
		ActionOutputImpl actionOutput = new ActionOutputImpl();
		//begin-capella-code

		actionOutput.setId(IdGenerator.createId());

		//end-capella-code
		return actionOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionValueOutput createActionValueOutput() {
		ActionValueOutputImpl actionValueOutput = new ActionValueOutputImpl();
		//begin-capella-code

		actionValueOutput.setId(IdGenerator.createId());

		//end-capella-code
		return actionValueOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallBehaviorAction createCallBehaviorAction() {
		CallBehaviorActionImpl callBehaviorAction = new CallBehaviorActionImpl();
		//begin-capella-code

		callBehaviorAction.setId(IdGenerator.createId());

		//end-capella-code
		return callBehaviorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendEventAction createSendEventAction() {
		SendEventActionImpl sendEventAction = new SendEventActionImpl();
		//begin-capella-code

		sendEventAction.setId(IdGenerator.createId());

		//end-capella-code
		return sendEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastEventAction createBroadcastEventAction() {
		BroadcastEventActionImpl broadcastEventAction = new BroadcastEventActionImpl();
		//begin-capella-code

		broadcastEventAction.setId(IdGenerator.createId());

		//end-capella-code
		return broadcastEventAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendCommunicationAction createSendCommunicationAction() {
		SendCommunicationActionImpl sendCommunicationAction = new SendCommunicationActionImpl();
		//begin-capella-code

		sendCommunicationAction.setId(IdGenerator.createId());

		//end-capella-code
		return sendCommunicationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BroadcastCommunicationAction createBroadcastCommunicationAction() {
		BroadcastCommunicationActionImpl broadcastCommunicationAction = new BroadcastCommunicationActionImpl();
		//begin-capella-code

		broadcastCommunicationAction.setId(IdGenerator.createId());

		//end-capella-code
		return broadcastCommunicationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateValueAction createCreateValueAction() {
		CreateValueActionImpl createValueAction = new CreateValueActionImpl();
		//begin-capella-code

		createValueAction.setId(IdGenerator.createId());

		//end-capella-code
		return createValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadValueAction createReadValueAction() {
		ReadValueActionImpl readValueAction = new ReadValueActionImpl();
		//begin-capella-code

		readValueAction.setId(IdGenerator.createId());

		//end-capella-code
		return readValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateValueAction createUpdateValueAction() {
		UpdateValueActionImpl updateValueAction = new UpdateValueActionImpl();
		//begin-capella-code

		updateValueAction.setId(IdGenerator.createId());

		//end-capella-code
		return updateValueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteValueAction createDeleteValueAction() {
		DeleteValueActionImpl deleteValueAction = new DeleteValueActionImpl();
		//begin-capella-code

		deleteValueAction.setId(IdGenerator.createId());

		//end-capella-code
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

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ActionInput createActionInput(String name_p) {
		ActionInput actionInput = createActionInput();
		actionInput.setName(name_p);
		return actionInput;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ActionValueInput createActionValueInput(String name_p) {
		ActionValueInput actionValueInput = createActionValueInput();
		actionValueInput.setName(name_p);
		return actionValueInput;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ActionOutput createActionOutput(String name_p) {
		ActionOutput actionOutput = createActionOutput();
		actionOutput.setName(name_p);
		return actionOutput;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ActionValueOutput createActionValueOutput(String name_p) {
		ActionValueOutput actionValueOutput = createActionValueOutput();
		actionValueOutput.setName(name_p);
		return actionValueOutput;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public CallBehaviorAction createCallBehaviorAction(String name_p) {
		CallBehaviorAction callBehaviorAction = createCallBehaviorAction();
		callBehaviorAction.setName(name_p);
		return callBehaviorAction;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public SendEventAction createSendEventAction(String name_p) {
		SendEventAction sendEventAction = createSendEventAction();
		sendEventAction.setName(name_p);
		return sendEventAction;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public BroadcastEventAction createBroadcastEventAction(String name_p) {
		BroadcastEventAction broadcastEventAction = createBroadcastEventAction();
		broadcastEventAction.setName(name_p);
		return broadcastEventAction;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public SendCommunicationAction createSendCommunicationAction(String name_p) {
		SendCommunicationAction sendCommunicationAction = createSendCommunicationAction();
		sendCommunicationAction.setName(name_p);
		return sendCommunicationAction;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public BroadcastCommunicationAction createBroadcastCommunicationAction(String name_p) {
		BroadcastCommunicationAction broadcastCommunicationAction = createBroadcastCommunicationAction();
		broadcastCommunicationAction.setName(name_p);
		return broadcastCommunicationAction;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public CreateValueAction createCreateValueAction(String name_p) {
		CreateValueAction createValueAction = createCreateValueAction();
		createValueAction.setName(name_p);
		return createValueAction;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ReadValueAction createReadValueAction(String name_p) {
		ReadValueAction readValueAction = createReadValueAction();
		readValueAction.setName(name_p);
		return readValueAction;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public UpdateValueAction createUpdateValueAction(String name_p) {
		UpdateValueAction updateValueAction = createUpdateValueAction();
		updateValueAction.setName(name_p);
		return updateValueAction;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public DeleteValueAction createDeleteValueAction(String name_p) {
		DeleteValueAction deleteValueAction = createDeleteValueAction();
		deleteValueAction.setName(name_p);
		return deleteValueAction;
	}

} //AlFactoryImpl
