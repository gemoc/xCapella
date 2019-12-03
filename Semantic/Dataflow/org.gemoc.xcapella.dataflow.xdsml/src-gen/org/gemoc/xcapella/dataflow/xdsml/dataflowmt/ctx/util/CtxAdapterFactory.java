/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallAction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallBehaviorAction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExecutableNode;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InvocationAction;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractEvent;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.AbstractCapabilityPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapabilityRealizationInvolvedElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Allocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralizableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolvedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Involvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolverElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingBlock;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Type;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractActor;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ArchitectureAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Block;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.BlockArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Component;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentContext;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceAllocator;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityExploitation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityPkg;
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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalBlock;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalChainContainer;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionPkg;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.MultiplicityElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PartitionableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkExchanger;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractCapability;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractNamedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractRelationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTrace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractType;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTypedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.FinalizableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModelElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.PublishableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage
 * @generated
 */
public class CtxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CtxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CtxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtxSwitch<Adapter> modelSwitch =
		new CtxSwitch<Adapter>() {
			@Override
			public Adapter caseSystemAnalysis(SystemAnalysis object) {
				return createSystemAnalysisAdapter();
			}
			@Override
			public Adapter caseSystem(org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseSystemFunction(SystemFunction object) {
				return createSystemFunctionAdapter();
			}
			@Override
			public Adapter caseSystemFunctionPkg(SystemFunctionPkg object) {
				return createSystemFunctionPkgAdapter();
			}
			@Override
			public Adapter caseSystemCommunicationHook(SystemCommunicationHook object) {
				return createSystemCommunicationHookAdapter();
			}
			@Override
			public Adapter caseSystemCommunication(SystemCommunication object) {
				return createSystemCommunicationAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseActorCapabilityInvolvement(ActorCapabilityInvolvement object) {
				return createActorCapabilityInvolvementAdapter();
			}
			@Override
			public Adapter caseActorMissionInvolvement(ActorMissionInvolvement object) {
				return createActorMissionInvolvementAdapter();
			}
			@Override
			public Adapter caseActorPkg(ActorPkg object) {
				return createActorPkgAdapter();
			}
			@Override
			public Adapter caseMission(Mission object) {
				return createMissionAdapter();
			}
			@Override
			public Adapter caseMissionPkg(MissionPkg object) {
				return createMissionPkgAdapter();
			}
			@Override
			public Adapter caseSystemMissionInvolvement(SystemMissionInvolvement object) {
				return createSystemMissionInvolvementAdapter();
			}
			@Override
			public Adapter caseCapability(Capability object) {
				return createCapabilityAdapter();
			}
			@Override
			public Adapter caseCapabilityExploitation(CapabilityExploitation object) {
				return createCapabilityExploitationAdapter();
			}
			@Override
			public Adapter caseCapabilityPkg(CapabilityPkg object) {
				return createCapabilityPkgAdapter();
			}
			@Override
			public Adapter caseSystemCapabilityInvolvement(SystemCapabilityInvolvement object) {
				return createSystemCapabilityInvolvementAdapter();
			}
			@Override
			public Adapter caseOperationalActorRealization(OperationalActorRealization object) {
				return createOperationalActorRealizationAdapter();
			}
			@Override
			public Adapter caseOperationalAnalysisRealization(OperationalAnalysisRealization object) {
				return createOperationalAnalysisRealizationAdapter();
			}
			@Override
			public Adapter caseOperationalEntityRealization(OperationalEntityRealization object) {
				return createOperationalEntityRealizationAdapter();
			}
			@Override
			public Adapter caseSystemContext(SystemContext object) {
				return createSystemContextAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseAbstractNamedElement(AbstractNamedElement object) {
				return createAbstractNamedElementAdapter();
			}
			@Override
			public Adapter caseTraceableElement(TraceableElement object) {
				return createTraceableElementAdapter();
			}
			@Override
			public Adapter casePublishableElement(PublishableElement object) {
				return createPublishableElementAdapter();
			}
			@Override
			public Adapter caseCapellaElement(CapellaElement object) {
				return createCapellaElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseModellingArchitecture(ModellingArchitecture object) {
				return createModellingArchitectureAdapter();
			}
			@Override
			public Adapter caseAbstractFunctionalArchitecture(AbstractFunctionalArchitecture object) {
				return createAbstractFunctionalArchitectureAdapter();
			}
			@Override
			public Adapter caseBlockArchitecture(BlockArchitecture object) {
				return createBlockArchitectureAdapter();
			}
			@Override
			public Adapter caseComponentArchitecture(ComponentArchitecture object) {
				return createComponentArchitectureAdapter();
			}
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseModellingBlock(ModellingBlock object) {
				return createModellingBlockAdapter();
			}
			@Override
			public Adapter caseAbstractFunctionalBlock(AbstractFunctionalBlock object) {
				return createAbstractFunctionalBlockAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseGeneralizableElement(GeneralizableElement object) {
				return createGeneralizableElementAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter casePartitionableElement(PartitionableElement object) {
				return createPartitionableElementAdapter();
			}
			@Override
			public Adapter caseInterfaceAllocator(InterfaceAllocator object) {
				return createInterfaceAllocatorAdapter();
			}
			@Override
			public Adapter caseCommunicationLinkExchanger(CommunicationLinkExchanger object) {
				return createCommunicationLinkExchangerAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseInvolvedElement(InvolvedElement object) {
				return createInvolvedElementAdapter();
			}
			@Override
			public Adapter caseCapabilityRealizationInvolvedElement(CapabilityRealizationInvolvedElement object) {
				return createCapabilityRealizationInvolvedElementAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseAbstractTypedElement(AbstractTypedElement object) {
				return createAbstractTypedElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseFinalizableElement(FinalizableElement object) {
				return createFinalizableElementAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseAbstractInstance(AbstractInstance object) {
				return createAbstractInstanceAdapter();
			}
			@Override
			public Adapter caseAbstractFunctionalChainContainer(AbstractFunctionalChainContainer object) {
				return createAbstractFunctionalChainContainerAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object) {
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseAbstractAction(AbstractAction object) {
				return createAbstractActionAdapter();
			}
			@Override
			public Adapter caseInvocationAction(InvocationAction object) {
				return createInvocationActionAdapter();
			}
			@Override
			public Adapter caseCallAction(CallAction object) {
				return createCallActionAdapter();
			}
			@Override
			public Adapter caseCallBehaviorAction(CallBehaviorAction object) {
				return createCallBehaviorActionAdapter();
			}
			@Override
			public Adapter caseAbstractEvent(AbstractEvent object) {
				return createAbstractEventAdapter();
			}
			@Override
			public Adapter caseAbstractFunction(AbstractFunction object) {
				return createAbstractFunctionAdapter();
			}
			@Override
			public Adapter caseFunctionPkg(FunctionPkg object) {
				return createFunctionPkgAdapter();
			}
			@Override
			public Adapter caseAbstractRelationship(AbstractRelationship object) {
				return createAbstractRelationshipAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseAbstractActor(AbstractActor object) {
				return createAbstractActorAdapter();
			}
			@Override
			public Adapter caseInvolvement(Involvement object) {
				return createInvolvementAdapter();
			}
			@Override
			public Adapter caseInvolverElement(InvolverElement object) {
				return createInvolverElementAdapter();
			}
			@Override
			public Adapter caseAbstractCapability(AbstractCapability object) {
				return createAbstractCapabilityAdapter();
			}
			@Override
			public Adapter caseAbstractCapabilityPkg(AbstractCapabilityPkg object) {
				return createAbstractCapabilityPkgAdapter();
			}
			@Override
			public Adapter caseAbstractTrace(AbstractTrace object) {
				return createAbstractTraceAdapter();
			}
			@Override
			public Adapter caseAllocation(Allocation object) {
				return createAllocationAdapter();
			}
			@Override
			public Adapter caseComponentAllocation(ComponentAllocation object) {
				return createComponentAllocationAdapter();
			}
			@Override
			public Adapter caseArchitectureAllocation(ArchitectureAllocation object) {
				return createArchitectureAllocationAdapter();
			}
			@Override
			public Adapter caseComponentContext(ComponentContext object) {
				return createComponentContextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemAnalysis <em>System Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemAnalysis
	 * @generated
	 */
	public Adapter createSystemAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction <em>System Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction
	 * @generated
	 */
	public Adapter createSystemFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunctionPkg <em>System Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunctionPkg
	 * @generated
	 */
	public Adapter createSystemFunctionPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunicationHook <em>System Communication Hook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunicationHook
	 * @generated
	 */
	public Adapter createSystemCommunicationHookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunication <em>System Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunication
	 * @generated
	 */
	public Adapter createSystemCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement <em>Actor Capability Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement
	 * @generated
	 */
	public Adapter createActorCapabilityInvolvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement <em>Actor Mission Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement
	 * @generated
	 */
	public Adapter createActorMissionInvolvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorPkg <em>Actor Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorPkg
	 * @generated
	 */
	public Adapter createActorPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.MissionPkg <em>Mission Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.MissionPkg
	 * @generated
	 */
	public Adapter createMissionPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemMissionInvolvement <em>System Mission Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemMissionInvolvement
	 * @generated
	 */
	public Adapter createSystemMissionInvolvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability
	 * @generated
	 */
	public Adapter createCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityExploitation <em>Capability Exploitation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityExploitation
	 * @generated
	 */
	public Adapter createCapabilityExploitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityPkg <em>Capability Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityPkg
	 * @generated
	 */
	public Adapter createCapabilityPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCapabilityInvolvement <em>System Capability Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCapabilityInvolvement
	 * @generated
	 */
	public Adapter createSystemCapabilityInvolvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalActorRealization <em>Operational Actor Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalActorRealization
	 * @generated
	 */
	public Adapter createOperationalActorRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalAnalysisRealization <em>Operational Analysis Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalAnalysisRealization
	 * @generated
	 */
	public Adapter createOperationalAnalysisRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalEntityRealization <em>Operational Entity Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalEntityRealization
	 * @generated
	 */
	public Adapter createOperationalEntityRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemContext
	 * @generated
	 */
	public Adapter createSystemContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractNamedElement
	 * @generated
	 */
	public Adapter createAbstractNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.TraceableElement
	 * @generated
	 */
	public Adapter createTraceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.PublishableElement <em>Publishable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.PublishableElement
	 * @generated
	 */
	public Adapter createPublishableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement <em>Capella Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement
	 * @generated
	 */
	public Adapter createCapellaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingArchitecture <em>Modelling Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingArchitecture
	 * @generated
	 */
	public Adapter createModellingArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalArchitecture <em>Abstract Functional Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalArchitecture
	 * @generated
	 */
	public Adapter createAbstractFunctionalArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.BlockArchitecture <em>Block Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.BlockArchitecture
	 * @generated
	 */
	public Adapter createBlockArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentArchitecture <em>Component Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentArchitecture
	 * @generated
	 */
	public Adapter createComponentArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractType
	 * @generated
	 */
	public Adapter createAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingBlock <em>Modelling Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingBlock
	 * @generated
	 */
	public Adapter createModellingBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalBlock <em>Abstract Functional Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalBlock
	 * @generated
	 */
	public Adapter createAbstractFunctionalBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralizableElement <em>Generalizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralizableElement
	 * @generated
	 */
	public Adapter createGeneralizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PartitionableElement <em>Partitionable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PartitionableElement
	 * @generated
	 */
	public Adapter createPartitionableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceAllocator <em>Interface Allocator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceAllocator
	 * @generated
	 */
	public Adapter createInterfaceAllocatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkExchanger <em>Link Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkExchanger
	 * @generated
	 */
	public Adapter createCommunicationLinkExchangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolvedElement <em>Involved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolvedElement
	 * @generated
	 */
	public Adapter createInvolvedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapabilityRealizationInvolvedElement <em>Capability Realization Involved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapabilityRealizationInvolvedElement
	 * @generated
	 */
	public Adapter createCapabilityRealizationInvolvedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTypedElement <em>Abstract Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTypedElement
	 * @generated
	 */
	public Adapter createAbstractTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.FinalizableElement <em>Finalizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.FinalizableElement
	 * @generated
	 */
	public Adapter createFinalizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance <em>Abstract Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance
	 * @generated
	 */
	public Adapter createAbstractInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalChainContainer <em>Abstract Functional Chain Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalChainContainer
	 * @generated
	 */
	public Adapter createAbstractFunctionalChainContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction <em>Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction
	 * @generated
	 */
	public Adapter createAbstractActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InvocationAction <em>Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InvocationAction
	 * @generated
	 */
	public Adapter createInvocationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallAction
	 * @generated
	 */
	public Adapter createCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallBehaviorAction
	 * @generated
	 */
	public Adapter createCallBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractEvent <em>Abstract Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractEvent
	 * @generated
	 */
	public Adapter createAbstractEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunction <em>Abstract Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunction
	 * @generated
	 */
	public Adapter createAbstractFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionPkg <em>Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionPkg
	 * @generated
	 */
	public Adapter createFunctionPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractRelationship <em>Abstract Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractRelationship
	 * @generated
	 */
	public Adapter createAbstractRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractActor <em>Abstract Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractActor
	 * @generated
	 */
	public Adapter createAbstractActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Involvement <em>Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Involvement
	 * @generated
	 */
	public Adapter createInvolvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolverElement <em>Involver Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolverElement
	 * @generated
	 */
	public Adapter createInvolverElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractCapability <em>Abstract Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractCapability
	 * @generated
	 */
	public Adapter createAbstractCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.AbstractCapabilityPkg <em>Abstract Capability Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.AbstractCapabilityPkg
	 * @generated
	 */
	public Adapter createAbstractCapabilityPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTrace <em>Abstract Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTrace
	 * @generated
	 */
	public Adapter createAbstractTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Allocation
	 * @generated
	 */
	public Adapter createAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentAllocation <em>Component Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentAllocation
	 * @generated
	 */
	public Adapter createComponentAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ArchitectureAllocation <em>Architecture Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ArchitectureAllocation
	 * @generated
	 */
	public Adapter createArchitectureAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentContext <em>Component Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentContext
	 * @generated
	 */
	public Adapter createComponentContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CtxAdapterFactory
