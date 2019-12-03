/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractSignal;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralizableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Type;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.MultiplicityElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationItem;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkExchanger;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Message;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReferencePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Signal;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.SignalInstance;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValueContainer;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractNamedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractRelationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractType;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTypedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.FinalizableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModelElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.PublishableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.TraceableElement;

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
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage
 * @generated
 */
public class CommunicationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSwitch() {
		if (modelPackage == null) {
			modelPackage = CommunicationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommunicationPackage.COMMUNICATION_ITEM: {
				CommunicationItem communicationItem = (CommunicationItem)theEObject;
				T result = caseCommunicationItem(communicationItem);
				if (result == null) result = caseClassifier(communicationItem);
				if (result == null) result = caseDataValueContainer(communicationItem);
				if (result == null) result = caseGeneralizableElement(communicationItem);
				if (result == null) result = caseStructure(communicationItem);
				if (result == null) result = caseType(communicationItem);
				if (result == null) result = caseAbstractType(communicationItem);
				if (result == null) result = caseNamespace(communicationItem);
				if (result == null) result = caseNamedElement(communicationItem);
				if (result == null) result = caseAbstractNamedElement(communicationItem);
				if (result == null) result = caseCapellaElement(communicationItem);
				if (result == null) result = caseExtensibleElement(communicationItem);
				if (result == null) result = caseTraceableElement(communicationItem);
				if (result == null) result = casePublishableElement(communicationItem);
				if (result == null) result = caseModelElement(communicationItem);
				if (result == null) result = caseElement(communicationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.EXCEPTION: {
				org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Exception exception = (org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Exception)theEObject;
				T result = caseException(exception);
				if (result == null) result = caseCommunicationItem(exception);
				if (result == null) result = caseClassifier(exception);
				if (result == null) result = caseDataValueContainer(exception);
				if (result == null) result = caseGeneralizableElement(exception);
				if (result == null) result = caseStructure(exception);
				if (result == null) result = caseType(exception);
				if (result == null) result = caseAbstractType(exception);
				if (result == null) result = caseNamespace(exception);
				if (result == null) result = caseNamedElement(exception);
				if (result == null) result = caseAbstractNamedElement(exception);
				if (result == null) result = caseCapellaElement(exception);
				if (result == null) result = caseExtensibleElement(exception);
				if (result == null) result = caseTraceableElement(exception);
				if (result == null) result = casePublishableElement(exception);
				if (result == null) result = caseModelElement(exception);
				if (result == null) result = caseElement(exception);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseCommunicationItem(message);
				if (result == null) result = caseClassifier(message);
				if (result == null) result = caseDataValueContainer(message);
				if (result == null) result = caseGeneralizableElement(message);
				if (result == null) result = caseStructure(message);
				if (result == null) result = caseType(message);
				if (result == null) result = caseAbstractType(message);
				if (result == null) result = caseNamespace(message);
				if (result == null) result = caseNamedElement(message);
				if (result == null) result = caseAbstractNamedElement(message);
				if (result == null) result = caseCapellaElement(message);
				if (result == null) result = caseExtensibleElement(message);
				if (result == null) result = caseTraceableElement(message);
				if (result == null) result = casePublishableElement(message);
				if (result == null) result = caseModelElement(message);
				if (result == null) result = caseElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.MESSAGE_REFERENCE: {
				MessageReference messageReference = (MessageReference)theEObject;
				T result = caseMessageReference(messageReference);
				if (result == null) result = caseRelationship(messageReference);
				if (result == null) result = caseAbstractRelationship(messageReference);
				if (result == null) result = caseCapellaElement(messageReference);
				if (result == null) result = caseTraceableElement(messageReference);
				if (result == null) result = casePublishableElement(messageReference);
				if (result == null) result = caseModelElement(messageReference);
				if (result == null) result = caseExtensibleElement(messageReference);
				if (result == null) result = caseElement(messageReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.MESSAGE_REFERENCE_PKG: {
				MessageReferencePkg messageReferencePkg = (MessageReferencePkg)theEObject;
				T result = caseMessageReferencePkg(messageReferencePkg);
				if (result == null) result = caseStructure(messageReferencePkg);
				if (result == null) result = caseNamespace(messageReferencePkg);
				if (result == null) result = caseNamedElement(messageReferencePkg);
				if (result == null) result = caseAbstractNamedElement(messageReferencePkg);
				if (result == null) result = caseCapellaElement(messageReferencePkg);
				if (result == null) result = caseTraceableElement(messageReferencePkg);
				if (result == null) result = casePublishableElement(messageReferencePkg);
				if (result == null) result = caseModelElement(messageReferencePkg);
				if (result == null) result = caseExtensibleElement(messageReferencePkg);
				if (result == null) result = caseElement(messageReferencePkg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.SIGNAL: {
				Signal signal = (Signal)theEObject;
				T result = caseSignal(signal);
				if (result == null) result = caseCommunicationItem(signal);
				if (result == null) result = caseAbstractSignal(signal);
				if (result == null) result = caseClassifier(signal);
				if (result == null) result = caseDataValueContainer(signal);
				if (result == null) result = caseGeneralizableElement(signal);
				if (result == null) result = caseStructure(signal);
				if (result == null) result = caseType(signal);
				if (result == null) result = caseAbstractType(signal);
				if (result == null) result = caseNamespace(signal);
				if (result == null) result = caseNamedElement(signal);
				if (result == null) result = caseAbstractNamedElement(signal);
				if (result == null) result = caseCapellaElement(signal);
				if (result == null) result = caseExtensibleElement(signal);
				if (result == null) result = caseTraceableElement(signal);
				if (result == null) result = casePublishableElement(signal);
				if (result == null) result = caseModelElement(signal);
				if (result == null) result = caseElement(signal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.SIGNAL_INSTANCE: {
				SignalInstance signalInstance = (SignalInstance)theEObject;
				T result = caseSignalInstance(signalInstance);
				if (result == null) result = caseAbstractInstance(signalInstance);
				if (result == null) result = caseProperty(signalInstance);
				if (result == null) result = caseFeature(signalInstance);
				if (result == null) result = caseTypedElement(signalInstance);
				if (result == null) result = caseMultiplicityElement(signalInstance);
				if (result == null) result = caseFinalizableElement(signalInstance);
				if (result == null) result = caseNamedElement(signalInstance);
				if (result == null) result = caseAbstractTypedElement(signalInstance);
				if (result == null) result = caseAbstractNamedElement(signalInstance);
				if (result == null) result = caseCapellaElement(signalInstance);
				if (result == null) result = caseTraceableElement(signalInstance);
				if (result == null) result = casePublishableElement(signalInstance);
				if (result == null) result = caseModelElement(signalInstance);
				if (result == null) result = caseExtensibleElement(signalInstance);
				if (result == null) result = caseElement(signalInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.COMMUNICATION_LINK: {
				CommunicationLink communicationLink = (CommunicationLink)theEObject;
				T result = caseCommunicationLink(communicationLink);
				if (result == null) result = caseCapellaElement(communicationLink);
				if (result == null) result = caseTraceableElement(communicationLink);
				if (result == null) result = casePublishableElement(communicationLink);
				if (result == null) result = caseModelElement(communicationLink);
				if (result == null) result = caseExtensibleElement(communicationLink);
				if (result == null) result = caseElement(communicationLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER: {
				CommunicationLinkExchanger communicationLinkExchanger = (CommunicationLinkExchanger)theEObject;
				T result = caseCommunicationLinkExchanger(communicationLinkExchanger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationItem(CommunicationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseException(org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Exception object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageReference(MessageReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Reference Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Reference Pkg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageReferencePkg(MessageReferencePkg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignal(Signal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalInstance(SignalInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationLink(CommunicationLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Exchanger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Exchanger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationLinkExchanger(CommunicationLinkExchanger object) {
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
	public T caseElement(Element object) {
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
	public T caseExtensibleElement(ExtensibleElement object) {
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
	public T caseModelElement(ModelElement object) {
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
	public T caseAbstractNamedElement(AbstractNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractType(AbstractType object) {
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
	public T caseTraceableElement(TraceableElement object) {
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
	public T casePublishableElement(PublishableElement object) {
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
	public T caseCapellaElement(CapellaElement object) {
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
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalizable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizableElement(GeneralizableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructure(Structure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Value Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Value Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataValueContainer(DataValueContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRelationship(AbstractRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Signal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Signal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSignal(AbstractSignal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypedElement(AbstractTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finalizable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finalizable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalizableElement(FinalizableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInstance(AbstractInstance object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //CommunicationSwitch
