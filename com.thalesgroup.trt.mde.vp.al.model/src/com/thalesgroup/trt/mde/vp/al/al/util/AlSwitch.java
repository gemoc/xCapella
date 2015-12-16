

package com.thalesgroup.trt.mde.vp.al.al.util;

import com.thalesgroup.trt.mde.vp.al.al.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage
 * @generated
 */
public class AlSwitch extends Switch
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = AlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected Object doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case AlPackage.ACTION_INPUT:
			{
				ActionInput actionInput = (ActionInput)theEObject;
				Object result = caseActionInput(actionInput);
				if (result == null) result = caseNamedElement(actionInput);
				if (result == null) result = caseAbstractNamedElement(actionInput);
				if (result == null) result = caseCapellaElement(actionInput);
				if (result == null) result = caseTraceableElement(actionInput);
				if (result == null) result = casePublishableElement(actionInput);
				if (result == null) result = caseModelElement(actionInput);
				if (result == null) result = caseExtensibleElement(actionInput);
				if (result == null) result = caseElement(actionInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.ACTION_VALUE_INPUT:
			{
				ActionValueInput actionValueInput = (ActionValueInput)theEObject;
				Object result = caseActionValueInput(actionValueInput);
				if (result == null) result = caseActionInput(actionValueInput);
				if (result == null) result = caseNamedElement(actionValueInput);
				if (result == null) result = caseAbstractNamedElement(actionValueInput);
				if (result == null) result = caseCapellaElement(actionValueInput);
				if (result == null) result = caseTraceableElement(actionValueInput);
				if (result == null) result = casePublishableElement(actionValueInput);
				if (result == null) result = caseModelElement(actionValueInput);
				if (result == null) result = caseExtensibleElement(actionValueInput);
				if (result == null) result = caseElement(actionValueInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.ACTION_OUTPUT:
			{
				ActionOutput actionOutput = (ActionOutput)theEObject;
				Object result = caseActionOutput(actionOutput);
				if (result == null) result = caseNamedElement(actionOutput);
				if (result == null) result = caseAbstractNamedElement(actionOutput);
				if (result == null) result = caseCapellaElement(actionOutput);
				if (result == null) result = caseTraceableElement(actionOutput);
				if (result == null) result = casePublishableElement(actionOutput);
				if (result == null) result = caseModelElement(actionOutput);
				if (result == null) result = caseExtensibleElement(actionOutput);
				if (result == null) result = caseElement(actionOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.ACTION_VALUE_OUTPUT:
			{
				ActionValueOutput actionValueOutput = (ActionValueOutput)theEObject;
				Object result = caseActionValueOutput(actionValueOutput);
				if (result == null) result = caseActionOutput(actionValueOutput);
				if (result == null) result = caseNamedElement(actionValueOutput);
				if (result == null) result = caseAbstractNamedElement(actionValueOutput);
				if (result == null) result = caseCapellaElement(actionValueOutput);
				if (result == null) result = caseTraceableElement(actionValueOutput);
				if (result == null) result = casePublishableElement(actionValueOutput);
				if (result == null) result = caseModelElement(actionValueOutput);
				if (result == null) result = caseExtensibleElement(actionValueOutput);
				if (result == null) result = caseElement(actionValueOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.ACTION:
			{
				Action action = (Action)theEObject;
				Object result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = caseAbstractNamedElement(action);
				if (result == null) result = caseCapellaElement(action);
				if (result == null) result = caseTraceableElement(action);
				if (result == null) result = casePublishableElement(action);
				if (result == null) result = caseModelElement(action);
				if (result == null) result = caseExtensibleElement(action);
				if (result == null) result = caseElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.CALL_BEHAVIOR_ACTION:
			{
				CallBehaviorAction callBehaviorAction = (CallBehaviorAction)theEObject;
				Object result = caseCallBehaviorAction(callBehaviorAction);
				if (result == null) result = caseAction(callBehaviorAction);
				if (result == null) result = caseNamedElement(callBehaviorAction);
				if (result == null) result = caseAbstractNamedElement(callBehaviorAction);
				if (result == null) result = caseCapellaElement(callBehaviorAction);
				if (result == null) result = caseTraceableElement(callBehaviorAction);
				if (result == null) result = casePublishableElement(callBehaviorAction);
				if (result == null) result = caseModelElement(callBehaviorAction);
				if (result == null) result = caseExtensibleElement(callBehaviorAction);
				if (result == null) result = caseElement(callBehaviorAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.SEND_EVENT_ACTION:
			{
				SendEventAction sendEventAction = (SendEventAction)theEObject;
				Object result = caseSendEventAction(sendEventAction);
				if (result == null) result = caseBroadcastEventAction(sendEventAction);
				if (result == null) result = caseAction(sendEventAction);
				if (result == null) result = caseNamedElement(sendEventAction);
				if (result == null) result = caseAbstractNamedElement(sendEventAction);
				if (result == null) result = caseCapellaElement(sendEventAction);
				if (result == null) result = caseTraceableElement(sendEventAction);
				if (result == null) result = casePublishableElement(sendEventAction);
				if (result == null) result = caseModelElement(sendEventAction);
				if (result == null) result = caseExtensibleElement(sendEventAction);
				if (result == null) result = caseElement(sendEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.BROADCAST_EVENT_ACTION:
			{
				BroadcastEventAction broadcastEventAction = (BroadcastEventAction)theEObject;
				Object result = caseBroadcastEventAction(broadcastEventAction);
				if (result == null) result = caseAction(broadcastEventAction);
				if (result == null) result = caseNamedElement(broadcastEventAction);
				if (result == null) result = caseAbstractNamedElement(broadcastEventAction);
				if (result == null) result = caseCapellaElement(broadcastEventAction);
				if (result == null) result = caseTraceableElement(broadcastEventAction);
				if (result == null) result = casePublishableElement(broadcastEventAction);
				if (result == null) result = caseModelElement(broadcastEventAction);
				if (result == null) result = caseExtensibleElement(broadcastEventAction);
				if (result == null) result = caseElement(broadcastEventAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.SEND_COMMUNICATION_ACTION:
			{
				SendCommunicationAction sendCommunicationAction = (SendCommunicationAction)theEObject;
				Object result = caseSendCommunicationAction(sendCommunicationAction);
				if (result == null) result = caseBroadcastCommunicationAction(sendCommunicationAction);
				if (result == null) result = caseAction(sendCommunicationAction);
				if (result == null) result = caseNamedElement(sendCommunicationAction);
				if (result == null) result = caseAbstractNamedElement(sendCommunicationAction);
				if (result == null) result = caseCapellaElement(sendCommunicationAction);
				if (result == null) result = caseTraceableElement(sendCommunicationAction);
				if (result == null) result = casePublishableElement(sendCommunicationAction);
				if (result == null) result = caseModelElement(sendCommunicationAction);
				if (result == null) result = caseExtensibleElement(sendCommunicationAction);
				if (result == null) result = caseElement(sendCommunicationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.BROADCAST_COMMUNICATION_ACTION:
			{
				BroadcastCommunicationAction broadcastCommunicationAction = (BroadcastCommunicationAction)theEObject;
				Object result = caseBroadcastCommunicationAction(broadcastCommunicationAction);
				if (result == null) result = caseAction(broadcastCommunicationAction);
				if (result == null) result = caseNamedElement(broadcastCommunicationAction);
				if (result == null) result = caseAbstractNamedElement(broadcastCommunicationAction);
				if (result == null) result = caseCapellaElement(broadcastCommunicationAction);
				if (result == null) result = caseTraceableElement(broadcastCommunicationAction);
				if (result == null) result = casePublishableElement(broadcastCommunicationAction);
				if (result == null) result = caseModelElement(broadcastCommunicationAction);
				if (result == null) result = caseExtensibleElement(broadcastCommunicationAction);
				if (result == null) result = caseElement(broadcastCommunicationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.CREATE_VALUE_ACTION:
			{
				CreateValueAction createValueAction = (CreateValueAction)theEObject;
				Object result = caseCreateValueAction(createValueAction);
				if (result == null) result = caseAction(createValueAction);
				if (result == null) result = caseNamedElement(createValueAction);
				if (result == null) result = caseAbstractNamedElement(createValueAction);
				if (result == null) result = caseCapellaElement(createValueAction);
				if (result == null) result = caseTraceableElement(createValueAction);
				if (result == null) result = casePublishableElement(createValueAction);
				if (result == null) result = caseModelElement(createValueAction);
				if (result == null) result = caseExtensibleElement(createValueAction);
				if (result == null) result = caseElement(createValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.READ_VALUE_ACTION:
			{
				ReadValueAction readValueAction = (ReadValueAction)theEObject;
				Object result = caseReadValueAction(readValueAction);
				if (result == null) result = caseAction(readValueAction);
				if (result == null) result = caseNamedElement(readValueAction);
				if (result == null) result = caseAbstractNamedElement(readValueAction);
				if (result == null) result = caseCapellaElement(readValueAction);
				if (result == null) result = caseTraceableElement(readValueAction);
				if (result == null) result = casePublishableElement(readValueAction);
				if (result == null) result = caseModelElement(readValueAction);
				if (result == null) result = caseExtensibleElement(readValueAction);
				if (result == null) result = caseElement(readValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.UPDATE_VALUE_ACTION:
			{
				UpdateValueAction updateValueAction = (UpdateValueAction)theEObject;
				Object result = caseUpdateValueAction(updateValueAction);
				if (result == null) result = caseAction(updateValueAction);
				if (result == null) result = caseNamedElement(updateValueAction);
				if (result == null) result = caseAbstractNamedElement(updateValueAction);
				if (result == null) result = caseCapellaElement(updateValueAction);
				if (result == null) result = caseTraceableElement(updateValueAction);
				if (result == null) result = casePublishableElement(updateValueAction);
				if (result == null) result = caseModelElement(updateValueAction);
				if (result == null) result = caseExtensibleElement(updateValueAction);
				if (result == null) result = caseElement(updateValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AlPackage.DELETE_VALUE_ACTION:
			{
				DeleteValueAction deleteValueAction = (DeleteValueAction)theEObject;
				Object result = caseDeleteValueAction(deleteValueAction);
				if (result == null) result = caseAction(deleteValueAction);
				if (result == null) result = caseNamedElement(deleteValueAction);
				if (result == null) result = caseAbstractNamedElement(deleteValueAction);
				if (result == null) result = caseCapellaElement(deleteValueAction);
				if (result == null) result = caseTraceableElement(deleteValueAction);
				if (result == null) result = casePublishableElement(deleteValueAction);
				if (result == null) result = caseModelElement(deleteValueAction);
				if (result == null) result = caseExtensibleElement(deleteValueAction);
				if (result == null) result = caseElement(deleteValueAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionInput(ActionInput object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Value Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Value Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionValueInput(ActionValueInput object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionOutput(ActionOutput object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Value Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Value Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionValueOutput(ActionValueOutput object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAction(Action object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Behavior Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCallBehaviorAction(CallBehaviorAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSendEventAction(SendEventAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Event Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Event Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBroadcastEventAction(BroadcastEventAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Communication Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Communication Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSendCommunicationAction(SendCommunicationAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broadcast Communication Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broadcast Communication Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBroadcastCommunicationAction(BroadcastCommunicationAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCreateValueAction(CreateValueAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReadValueAction(ReadValueAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUpdateValueAction(UpdateValueAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Value Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Value Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDeleteValueAction(DeleteValueAction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExtensibleElement(ExtensibleElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelElement(ModelElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractNamedElement(AbstractNamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTraceableElement(TraceableElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePublishableElement(PublishableElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capella Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCapellaElement(CapellaElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public Object defaultCase(EObject object)
	{
		return null;
	}

} //AlSwitch
