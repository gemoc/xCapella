/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkProtocol;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Message;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Signal;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.SignalInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationFactoryImpl extends EFactoryImpl implements CommunicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationFactory init() {
		try {
			CommunicationFactory theCommunicationFactory = (CommunicationFactory)EPackage.Registry.INSTANCE.getEFactory(CommunicationPackage.eNS_URI);
			if (theCommunicationFactory != null) {
				return theCommunicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommunicationPackage.EXCEPTION: return createException();
			case CommunicationPackage.MESSAGE: return createMessage();
			case CommunicationPackage.MESSAGE_REFERENCE: return createMessageReference();
			case CommunicationPackage.SIGNAL: return createSignal();
			case CommunicationPackage.SIGNAL_INSTANCE: return createSignalInstance();
			case CommunicationPackage.COMMUNICATION_LINK: return createCommunicationLink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CommunicationPackage.COMMUNICATION_LINK_KIND:
				return createCommunicationLinkKindFromString(eDataType, initialValue);
			case CommunicationPackage.COMMUNICATION_LINK_PROTOCOL:
				return createCommunicationLinkProtocolFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CommunicationPackage.COMMUNICATION_LINK_KIND:
				return convertCommunicationLinkKindToString(eDataType, instanceValue);
			case CommunicationPackage.COMMUNICATION_LINK_PROTOCOL:
				return convertCommunicationLinkProtocolToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Exception createException() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageReference createMessageReference() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalInstance createSignalInstance() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLink createCommunicationLink() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkKind createCommunicationLinkKindFromString(EDataType eDataType, String initialValue) {
		CommunicationLinkKind result = CommunicationLinkKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationLinkKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkProtocol createCommunicationLinkProtocolFromString(EDataType eDataType, String initialValue) {
		CommunicationLinkProtocol result = CommunicationLinkProtocol.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationLinkProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPackage getCommunicationPackage() {
		return (CommunicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationPackage getPackage() {
		return CommunicationPackage.eINSTANCE;
	}

} //CommunicationFactoryImpl
