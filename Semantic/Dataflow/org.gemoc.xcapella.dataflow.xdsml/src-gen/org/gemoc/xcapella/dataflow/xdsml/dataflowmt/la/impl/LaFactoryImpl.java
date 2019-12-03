/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaFactoryImpl extends EFactoryImpl implements LaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LaFactory init() {
		try {
			LaFactory theLaFactory = (LaFactory)EPackage.Registry.INSTANCE.getEFactory(LaPackage.eNS_URI);
			if (theLaFactory != null) {
				return theLaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaFactoryImpl() {
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
			case LaPackage.LOGICAL_ARCHITECTURE_PKG: return createLogicalArchitecturePkg();
			case LaPackage.LOGICAL_ARCHITECTURE: return createLogicalArchitecture();
			case LaPackage.LOGICAL_FUNCTION: return createLogicalFunction();
			case LaPackage.LOGICAL_FUNCTION_PKG: return createLogicalFunctionPkg();
			case LaPackage.LOGICAL_COMPONENT: return createLogicalComponent();
			case LaPackage.LOGICAL_COMPONENT_PKG: return createLogicalComponentPkg();
			case LaPackage.CAPABILITY_REALIZATION: return createCapabilityRealization();
			case LaPackage.CAPABILITY_REALIZATION_PKG: return createCapabilityRealizationPkg();
			case LaPackage.SYSTEM_ANALYSIS_REALIZATION: return createSystemAnalysisRealization();
			case LaPackage.SYSTEM_REALIZATION: return createSystemRealization();
			case LaPackage.CONTEXT_INTERFACE_REALIZATION: return createContextInterfaceRealization();
			case LaPackage.LOGICAL_ACTOR_PKG: return createLogicalActorPkg();
			case LaPackage.LOGICAL_ACTOR: return createLogicalActor();
			case LaPackage.SYSTEM_ACTOR_REALIZATION: return createSystemActorRealization();
			case LaPackage.LOGICAL_CONTEXT: return createLogicalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalArchitecturePkg createLogicalArchitecturePkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalArchitecture createLogicalArchitecture() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFunction createLogicalFunction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFunctionPkg createLogicalFunctionPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponent createLogicalComponent() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponentPkg createLogicalComponentPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealization createCapabilityRealization() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationPkg createCapabilityRealizationPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysisRealization createSystemAnalysisRealization() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemRealization createSystemRealization() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextInterfaceRealization createContextInterfaceRealization() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalActorPkg createLogicalActorPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalActor createLogicalActor() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemActorRealization createSystemActorRealization() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalContext createLogicalContext() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaPackage getLaPackage() {
		return (LaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LaPackage getPackage() {
		return LaPackage.eINSTANCE;
	}

} //LaFactoryImpl
