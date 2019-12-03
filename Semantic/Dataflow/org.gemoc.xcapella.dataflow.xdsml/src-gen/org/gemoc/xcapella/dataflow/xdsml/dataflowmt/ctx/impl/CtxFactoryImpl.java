/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityExploitation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.MissionPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalActorRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalAnalysisRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalEntityRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemAnalysis;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCapabilityInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunication;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunicationHook;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemContext;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunctionPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemMissionInvolvement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtxFactoryImpl extends EFactoryImpl implements CtxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CtxFactory init() {
		try {
			CtxFactory theCtxFactory = (CtxFactory)EPackage.Registry.INSTANCE.getEFactory(CtxPackage.eNS_URI);
			if (theCtxFactory != null) {
				return theCtxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CtxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxFactoryImpl() {
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
			case CtxPackage.SYSTEM_ANALYSIS: return createSystemAnalysis();
			case CtxPackage.SYSTEM: return createSystem();
			case CtxPackage.SYSTEM_FUNCTION: return createSystemFunction();
			case CtxPackage.SYSTEM_FUNCTION_PKG: return createSystemFunctionPkg();
			case CtxPackage.SYSTEM_COMMUNICATION_HOOK: return createSystemCommunicationHook();
			case CtxPackage.SYSTEM_COMMUNICATION: return createSystemCommunication();
			case CtxPackage.ACTOR: return createActor();
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT: return createActorCapabilityInvolvement();
			case CtxPackage.ACTOR_MISSION_INVOLVEMENT: return createActorMissionInvolvement();
			case CtxPackage.ACTOR_PKG: return createActorPkg();
			case CtxPackage.MISSION: return createMission();
			case CtxPackage.MISSION_PKG: return createMissionPkg();
			case CtxPackage.SYSTEM_MISSION_INVOLVEMENT: return createSystemMissionInvolvement();
			case CtxPackage.CAPABILITY: return createCapability();
			case CtxPackage.CAPABILITY_EXPLOITATION: return createCapabilityExploitation();
			case CtxPackage.CAPABILITY_PKG: return createCapabilityPkg();
			case CtxPackage.SYSTEM_CAPABILITY_INVOLVEMENT: return createSystemCapabilityInvolvement();
			case CtxPackage.OPERATIONAL_ACTOR_REALIZATION: return createOperationalActorRealization();
			case CtxPackage.OPERATIONAL_ANALYSIS_REALIZATION: return createOperationalAnalysisRealization();
			case CtxPackage.OPERATIONAL_ENTITY_REALIZATION: return createOperationalEntityRealization();
			case CtxPackage.SYSTEM_CONTEXT: return createSystemContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis createSystemAnalysis() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System createSystem() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunction createSystemFunction() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionPkg createSystemFunctionPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCommunicationHook createSystemCommunicationHook() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCommunication createSystemCommunication() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorCapabilityInvolvement createActorCapabilityInvolvement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorMissionInvolvement createActorMissionInvolvement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorPkg createActorPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionPkg createMissionPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMissionInvolvement createSystemMissionInvolvement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityExploitation createCapabilityExploitation() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPkg createCapabilityPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCapabilityInvolvement createSystemCapabilityInvolvement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActorRealization createOperationalActorRealization() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysisRealization createOperationalAnalysisRealization() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalEntityRealization createOperationalEntityRealization() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemContext createSystemContext() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxPackage getCtxPackage() {
		return (CtxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CtxPackage getPackage() {
		return CtxPackage.eINSTANCE;
	}

} //CtxFactoryImpl
