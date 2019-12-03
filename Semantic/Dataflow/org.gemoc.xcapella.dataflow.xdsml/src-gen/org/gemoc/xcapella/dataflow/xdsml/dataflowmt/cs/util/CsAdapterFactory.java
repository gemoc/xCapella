/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapabilityRealizationInvolvedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapabilityRealizationInvolvement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractDependenciesPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractExchangeItemPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Allocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralClass;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralizableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolvedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Involvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolverElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingArchitecturePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingBlock;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Type;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.*;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalBlock;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeAllocator;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractEventOperation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.MultiplicityElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Partition;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PartitionableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Port;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkExchanger;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReferencePkg;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractNamedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractRelationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTrace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractType;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.AbstractTypedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.FinalizableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.InformationsExchanger;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModelElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.PublishableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.CsPackage
 * @generated
 */
public class CsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CsPackage.eINSTANCE;
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
	protected CsSwitch<Adapter> modelSwitch =
		new CsSwitch<Adapter>() {
			@Override
			public Adapter caseBlockArchitecturePkg(BlockArchitecturePkg object) {
				return createBlockArchitecturePkgAdapter();
			}
			@Override
			public Adapter caseBlockArchitecture(BlockArchitecture object) {
				return createBlockArchitectureAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseComponentArchitecture(ComponentArchitecture object) {
				return createComponentArchitectureAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseAbstractActor(AbstractActor object) {
				return createAbstractActorAdapter();
			}
			@Override
			public Adapter casePart(Part object) {
				return createPartAdapter();
			}
			@Override
			public Adapter caseArchitectureAllocation(ArchitectureAllocation object) {
				return createArchitectureAllocationAdapter();
			}
			@Override
			public Adapter caseComponentAllocation(ComponentAllocation object) {
				return createComponentAllocationAdapter();
			}
			@Override
			public Adapter caseSystemComponent(SystemComponent object) {
				return createSystemComponentAdapter();
			}
			@Override
			public Adapter caseInterfacePkg(InterfacePkg object) {
				return createInterfacePkgAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseInterfaceImplementation(InterfaceImplementation object) {
				return createInterfaceImplementationAdapter();
			}
			@Override
			public Adapter caseInterfaceUse(InterfaceUse object) {
				return createInterfaceUseAdapter();
			}
			@Override
			public Adapter caseProvidedInterfaceLink(ProvidedInterfaceLink object) {
				return createProvidedInterfaceLinkAdapter();
			}
			@Override
			public Adapter caseRequiredInterfaceLink(RequiredInterfaceLink object) {
				return createRequiredInterfaceLinkAdapter();
			}
			@Override
			public Adapter caseInterfaceAllocation(InterfaceAllocation object) {
				return createInterfaceAllocationAdapter();
			}
			@Override
			public Adapter caseInterfaceAllocator(InterfaceAllocator object) {
				return createInterfaceAllocatorAdapter();
			}
			@Override
			public Adapter caseActorCapabilityRealizationInvolvement(ActorCapabilityRealizationInvolvement object) {
				return createActorCapabilityRealizationInvolvementAdapter();
			}
			@Override
			public Adapter caseSystemComponentCapabilityRealizationInvolvement(SystemComponentCapabilityRealizationInvolvement object) {
				return createSystemComponentCapabilityRealizationInvolvementAdapter();
			}
			@Override
			public Adapter caseComponentContext(ComponentContext object) {
				return createComponentContextAdapter();
			}
			@Override
			public Adapter caseExchangeItemAllocation(ExchangeItemAllocation object) {
				return createExchangeItemAllocationAdapter();
			}
			@Override
			public Adapter caseDeployableElement(DeployableElement object) {
				return createDeployableElementAdapter();
			}
			@Override
			public Adapter caseDeploymentTarget(DeploymentTarget object) {
				return createDeploymentTargetAdapter();
			}
			@Override
			public Adapter caseAbstractDeploymentLink(AbstractDeploymentLink object) {
				return createAbstractDeploymentLinkAdapter();
			}
			@Override
			public Adapter caseAbstractPathInvolvedElement(AbstractPathInvolvedElement object) {
				return createAbstractPathInvolvedElementAdapter();
			}
			@Override
			public Adapter caseAbstractPhysicalArtifact(AbstractPhysicalArtifact object) {
				return createAbstractPhysicalArtifactAdapter();
			}
			@Override
			public Adapter caseAbstractPhysicalLinkEnd(AbstractPhysicalLinkEnd object) {
				return createAbstractPhysicalLinkEndAdapter();
			}
			@Override
			public Adapter caseAbstractPhysicalPathLink(AbstractPhysicalPathLink object) {
				return createAbstractPhysicalPathLinkAdapter();
			}
			@Override
			public Adapter casePhysicalLink(PhysicalLink object) {
				return createPhysicalLinkAdapter();
			}
			@Override
			public Adapter casePhysicalLinkCategory(PhysicalLinkCategory object) {
				return createPhysicalLinkCategoryAdapter();
			}
			@Override
			public Adapter casePhysicalLinkEnd(PhysicalLinkEnd object) {
				return createPhysicalLinkEndAdapter();
			}
			@Override
			public Adapter casePhysicalLinkRealization(PhysicalLinkRealization object) {
				return createPhysicalLinkRealizationAdapter();
			}
			@Override
			public Adapter casePhysicalPath(PhysicalPath object) {
				return createPhysicalPathAdapter();
			}
			@Override
			public Adapter casePhysicalPathInvolvement(PhysicalPathInvolvement object) {
				return createPhysicalPathInvolvementAdapter();
			}
			@Override
			public Adapter casePhysicalPathReference(PhysicalPathReference object) {
				return createPhysicalPathReferenceAdapter();
			}
			@Override
			public Adapter casePhysicalPathRealization(PhysicalPathRealization object) {
				return createPhysicalPathRealizationAdapter();
			}
			@Override
			public Adapter casePhysicalPort(PhysicalPort object) {
				return createPhysicalPortAdapter();
			}
			@Override
			public Adapter casePhysicalPortRealization(PhysicalPortRealization object) {
				return createPhysicalPortRealizationAdapter();
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
			public Adapter caseModellingArchitecturePkg(ModellingArchitecturePkg object) {
				return createModellingArchitecturePkgAdapter();
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
			public Adapter caseCommunicationLinkExchanger(CommunicationLinkExchanger object) {
				return createCommunicationLinkExchangerAdapter();
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
			public Adapter casePartition(Partition object) {
				return createPartitionAdapter();
			}
			@Override
			public Adapter caseInformationsExchanger(InformationsExchanger object) {
				return createInformationsExchangerAdapter();
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
			public Adapter caseAbstractTrace(AbstractTrace object) {
				return createAbstractTraceAdapter();
			}
			@Override
			public Adapter caseAllocation(Allocation object) {
				return createAllocationAdapter();
			}
			@Override
			public Adapter caseMessageReferencePkg(MessageReferencePkg object) {
				return createMessageReferencePkgAdapter();
			}
			@Override
			public Adapter caseAbstractDependenciesPkg(AbstractDependenciesPkg object) {
				return createAbstractDependenciesPkgAdapter();
			}
			@Override
			public Adapter caseAbstractExchangeItemPkg(AbstractExchangeItemPkg object) {
				return createAbstractExchangeItemPkgAdapter();
			}
			@Override
			public Adapter caseGeneralClass(GeneralClass object) {
				return createGeneralClassAdapter();
			}
			@Override
			public Adapter caseInvolvement(Involvement object) {
				return createInvolvementAdapter();
			}
			@Override
			public Adapter caseCapabilityRealizationInvolvement(CapabilityRealizationInvolvement object) {
				return createCapabilityRealizationInvolvementAdapter();
			}
			@Override
			public Adapter caseAbstractEventOperation(AbstractEventOperation object) {
				return createAbstractEventOperationAdapter();
			}
			@Override
			public Adapter caseComponentExchangeAllocator(ComponentExchangeAllocator object) {
				return createComponentExchangeAllocatorAdapter();
			}
			@Override
			public Adapter caseInvolverElement(InvolverElement object) {
				return createInvolverElementAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.BlockArchitecturePkg <em>Block Architecture Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.BlockArchitecturePkg
	 * @generated
	 */
	public Adapter createBlockArchitecturePkgAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.SystemComponent
	 * @generated
	 */
	public Adapter createSystemComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfacePkg <em>Interface Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfacePkg
	 * @generated
	 */
	public Adapter createInterfacePkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceImplementation <em>Interface Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceImplementation
	 * @generated
	 */
	public Adapter createInterfaceImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceUse <em>Interface Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceUse
	 * @generated
	 */
	public Adapter createInterfaceUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ProvidedInterfaceLink <em>Provided Interface Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ProvidedInterfaceLink
	 * @generated
	 */
	public Adapter createProvidedInterfaceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.RequiredInterfaceLink <em>Required Interface Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.RequiredInterfaceLink
	 * @generated
	 */
	public Adapter createRequiredInterfaceLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceAllocation <em>Interface Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceAllocation
	 * @generated
	 */
	public Adapter createInterfaceAllocationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ActorCapabilityRealizationInvolvement <em>Actor Capability Realization Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ActorCapabilityRealizationInvolvement
	 * @generated
	 */
	public Adapter createActorCapabilityRealizationInvolvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.SystemComponentCapabilityRealizationInvolvement <em>System Component Capability Realization Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.SystemComponentCapabilityRealizationInvolvement
	 * @generated
	 */
	public Adapter createSystemComponentCapabilityRealizationInvolvementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ExchangeItemAllocation <em>Exchange Item Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ExchangeItemAllocation
	 * @generated
	 */
	public Adapter createExchangeItemAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.DeployableElement <em>Deployable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.DeployableElement
	 * @generated
	 */
	public Adapter createDeployableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.DeploymentTarget <em>Deployment Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.DeploymentTarget
	 * @generated
	 */
	public Adapter createDeploymentTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink <em>Abstract Deployment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink
	 * @generated
	 */
	public Adapter createAbstractDeploymentLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPathInvolvedElement <em>Abstract Path Involved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPathInvolvedElement
	 * @generated
	 */
	public Adapter createAbstractPathInvolvedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPhysicalArtifact <em>Abstract Physical Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPhysicalArtifact
	 * @generated
	 */
	public Adapter createAbstractPhysicalArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPhysicalLinkEnd <em>Abstract Physical Link End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPhysicalLinkEnd
	 * @generated
	 */
	public Adapter createAbstractPhysicalLinkEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPhysicalPathLink <em>Abstract Physical Path Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPhysicalPathLink
	 * @generated
	 */
	public Adapter createAbstractPhysicalPathLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLink <em>Physical Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLink
	 * @generated
	 */
	public Adapter createPhysicalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLinkCategory <em>Physical Link Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLinkCategory
	 * @generated
	 */
	public Adapter createPhysicalLinkCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLinkEnd <em>Physical Link End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLinkEnd
	 * @generated
	 */
	public Adapter createPhysicalLinkEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLinkRealization <em>Physical Link Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLinkRealization
	 * @generated
	 */
	public Adapter createPhysicalLinkRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPath <em>Physical Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPath
	 * @generated
	 */
	public Adapter createPhysicalPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPathInvolvement <em>Physical Path Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPathInvolvement
	 * @generated
	 */
	public Adapter createPhysicalPathInvolvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPathReference <em>Physical Path Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPathReference
	 * @generated
	 */
	public Adapter createPhysicalPathReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPathRealization <em>Physical Path Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPathRealization
	 * @generated
	 */
	public Adapter createPhysicalPathRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPort <em>Physical Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPort
	 * @generated
	 */
	public Adapter createPhysicalPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPortRealization <em>Physical Port Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPortRealization
	 * @generated
	 */
	public Adapter createPhysicalPortRealizationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingArchitecturePkg <em>Modelling Architecture Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingArchitecturePkg
	 * @generated
	 */
	public Adapter createModellingArchitecturePkgAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.InformationsExchanger <em>Informations Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.InformationsExchanger
	 * @generated
	 */
	public Adapter createInformationsExchangerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReferencePkg <em>Message Reference Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReferencePkg
	 * @generated
	 */
	public Adapter createMessageReferencePkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractDependenciesPkg <em>Abstract Dependencies Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractDependenciesPkg
	 * @generated
	 */
	public Adapter createAbstractDependenciesPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractExchangeItemPkg <em>Abstract Exchange Item Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractExchangeItemPkg
	 * @generated
	 */
	public Adapter createAbstractExchangeItemPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralClass <em>General Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralClass
	 * @generated
	 */
	public Adapter createGeneralClassAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapabilityRealizationInvolvement <em>Capability Realization Involvement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapabilityRealizationInvolvement
	 * @generated
	 */
	public Adapter createCapabilityRealizationInvolvementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractEventOperation <em>Abstract Event Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractEventOperation
	 * @generated
	 */
	public Adapter createAbstractEventOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeAllocator <em>Component Exchange Allocator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeAllocator
	 * @generated
	 */
	public Adapter createComponentExchangeAllocatorAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
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

} //CsAdapterFactory
