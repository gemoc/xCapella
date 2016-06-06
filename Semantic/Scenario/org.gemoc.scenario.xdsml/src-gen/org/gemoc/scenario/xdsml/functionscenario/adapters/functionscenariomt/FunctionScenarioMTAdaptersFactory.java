package org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.capella.common.data.activity.AbstractAction;
import org.polarsys.capella.common.data.activity.AbstractActivity;
import org.polarsys.capella.common.data.activity.AcceptEventAction;
import org.polarsys.capella.common.data.activity.ActivityEdge;
import org.polarsys.capella.common.data.activity.ActivityExchange;
import org.polarsys.capella.common.data.activity.ActivityGroup;
import org.polarsys.capella.common.data.activity.ActivityNode;
import org.polarsys.capella.common.data.activity.ActivityPartition;
import org.polarsys.capella.common.data.activity.CallAction;
import org.polarsys.capella.common.data.activity.CallBehaviorAction;
import org.polarsys.capella.common.data.activity.ControlFlow;
import org.polarsys.capella.common.data.activity.ExceptionHandler;
import org.polarsys.capella.common.data.activity.ExecutableNode;
import org.polarsys.capella.common.data.activity.InputPin;
import org.polarsys.capella.common.data.activity.InterruptibleActivityRegion;
import org.polarsys.capella.common.data.activity.InvocationAction;
import org.polarsys.capella.common.data.activity.ObjectFlow;
import org.polarsys.capella.common.data.activity.ObjectNode;
import org.polarsys.capella.common.data.activity.OutputPin;
import org.polarsys.capella.common.data.activity.Pin;
import org.polarsys.capella.common.data.activity.SendSignalAction;
import org.polarsys.capella.common.data.activity.StructuredActivityNode;
import org.polarsys.capella.common.data.activity.ValuePin;
import org.polarsys.capella.common.data.behavior.AbstractBehavior;
import org.polarsys.capella.common.data.behavior.AbstractEvent;
import org.polarsys.capella.common.data.behavior.AbstractMessageEvent;
import org.polarsys.capella.common.data.behavior.AbstractSignal;
import org.polarsys.capella.common.data.behavior.AbstractSignalEvent;
import org.polarsys.capella.common.data.behavior.AbstractTimeEvent;
import org.polarsys.capella.common.data.behavior.TimeExpression;
import org.polarsys.capella.common.data.modellingcore.AbstractConstraint;
import org.polarsys.capella.common.data.modellingcore.AbstractExchangeItem;
import org.polarsys.capella.common.data.modellingcore.AbstractInformationFlow;
import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.data.modellingcore.AbstractParameter;
import org.polarsys.capella.common.data.modellingcore.AbstractParameterSet;
import org.polarsys.capella.common.data.modellingcore.AbstractRelationship;
import org.polarsys.capella.common.data.modellingcore.AbstractTrace;
import org.polarsys.capella.common.data.modellingcore.AbstractType;
import org.polarsys.capella.common.data.modellingcore.AbstractTypedElement;
import org.polarsys.capella.common.data.modellingcore.FinalizableElement;
import org.polarsys.capella.common.data.modellingcore.IState;
import org.polarsys.capella.common.data.modellingcore.InformationsExchanger;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.data.modellingcore.PublishableElement;
import org.polarsys.capella.common.data.modellingcore.TraceableElement;
import org.polarsys.capella.common.data.modellingcore.ValueSpecification;
import org.polarsys.capella.core.data.capellacommon.AbstractCapabilityPkg;
import org.polarsys.capella.core.data.capellacommon.AbstractState;
import org.polarsys.capella.core.data.capellacommon.AbstractStateRealization;
import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvedElement;
import org.polarsys.capella.core.data.capellacommon.CapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.capellacommon.ChangeEvent;
import org.polarsys.capella.core.data.capellacommon.ChoicePseudoState;
import org.polarsys.capella.core.data.capellacommon.DeepHistoryPseudoState;
import org.polarsys.capella.core.data.capellacommon.EntryPointPseudoState;
import org.polarsys.capella.core.data.capellacommon.ExitPointPseudoState;
import org.polarsys.capella.core.data.capellacommon.FinalState;
import org.polarsys.capella.core.data.capellacommon.ForkPseudoState;
import org.polarsys.capella.core.data.capellacommon.GenericTrace;
import org.polarsys.capella.core.data.capellacommon.InitialPseudoState;
import org.polarsys.capella.core.data.capellacommon.JoinPseudoState;
import org.polarsys.capella.core.data.capellacommon.JustificationLink;
import org.polarsys.capella.core.data.capellacommon.Mode;
import org.polarsys.capella.core.data.capellacommon.Pseudostate;
import org.polarsys.capella.core.data.capellacommon.Region;
import org.polarsys.capella.core.data.capellacommon.ShallowHistoryPseudoState;
import org.polarsys.capella.core.data.capellacommon.State;
import org.polarsys.capella.core.data.capellacommon.StateEvent;
import org.polarsys.capella.core.data.capellacommon.StateEventRealization;
import org.polarsys.capella.core.data.capellacommon.StateMachine;
import org.polarsys.capella.core.data.capellacommon.StateTransition;
import org.polarsys.capella.core.data.capellacommon.StateTransitionRealization;
import org.polarsys.capella.core.data.capellacommon.TerminatePseudoState;
import org.polarsys.capella.core.data.capellacommon.TimeEvent;
import org.polarsys.capella.core.data.capellacommon.TransfoLink;
import org.polarsys.capella.core.data.capellacore.AbstractAnnotation;
import org.polarsys.capella.core.data.capellacore.AbstractDependenciesPkg;
import org.polarsys.capella.core.data.capellacore.AbstractExchangeItemPkg;
import org.polarsys.capella.core.data.capellacore.AbstractModellingStructure;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.Allocation;
import org.polarsys.capella.core.data.capellacore.BooleanPropertyValue;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue;
import org.polarsys.capella.core.data.capellacore.Feature;
import org.polarsys.capella.core.data.capellacore.FloatPropertyValue;
import org.polarsys.capella.core.data.capellacore.GeneralClass;
import org.polarsys.capella.core.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.data.capellacore.Generalization;
import org.polarsys.capella.core.data.capellacore.IntegerPropertyValue;
import org.polarsys.capella.core.data.capellacore.InvolvedElement;
import org.polarsys.capella.core.data.capellacore.Involvement;
import org.polarsys.capella.core.data.capellacore.InvolverElement;
import org.polarsys.capella.core.data.capellacore.KeyValue;
import org.polarsys.capella.core.data.capellacore.ModellingArchitecture;
import org.polarsys.capella.core.data.capellacore.ModellingArchitecturePkg;
import org.polarsys.capella.core.data.capellacore.ModellingBlock;
import org.polarsys.capella.core.data.capellacore.NamedElement;
import org.polarsys.capella.core.data.capellacore.NamedRelationship;
import org.polarsys.capella.core.data.capellacore.Namespace;
import org.polarsys.capella.core.data.capellacore.NamingRule;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.Relationship;
import org.polarsys.capella.core.data.capellacore.ReuseLink;
import org.polarsys.capella.core.data.capellacore.ReuseableStructure;
import org.polarsys.capella.core.data.capellacore.ReuserStructure;
import org.polarsys.capella.core.data.capellacore.StringPropertyValue;
import org.polarsys.capella.core.data.capellacore.Structure;
import org.polarsys.capella.core.data.capellacore.Trace;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.capellacore.TypedElement;
import org.polarsys.capella.core.data.capellamodeller.Folder;
import org.polarsys.capella.core.data.capellamodeller.Library;
import org.polarsys.capella.core.data.capellamodeller.ModelRoot;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineeringPkg;
import org.polarsys.capella.core.data.cs.AbstractActor;
import org.polarsys.capella.core.data.cs.AbstractDeploymentLink;
import org.polarsys.capella.core.data.cs.AbstractPathInvolvedElement;
import org.polarsys.capella.core.data.cs.AbstractPhysicalArtifact;
import org.polarsys.capella.core.data.cs.AbstractPhysicalLinkEnd;
import org.polarsys.capella.core.data.cs.AbstractPhysicalPathLink;
import org.polarsys.capella.core.data.cs.ActorCapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.cs.ArchitectureAllocation;
import org.polarsys.capella.core.data.cs.Block;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.BlockArchitecturePkg;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.ComponentAllocation;
import org.polarsys.capella.core.data.cs.ComponentArchitecture;
import org.polarsys.capella.core.data.cs.ComponentContext;
import org.polarsys.capella.core.data.cs.DeployableElement;
import org.polarsys.capella.core.data.cs.DeploymentTarget;
import org.polarsys.capella.core.data.cs.ExchangeItemAllocation;
import org.polarsys.capella.core.data.cs.Interface;
import org.polarsys.capella.core.data.cs.InterfaceAllocation;
import org.polarsys.capella.core.data.cs.InterfaceAllocator;
import org.polarsys.capella.core.data.cs.InterfaceImplementation;
import org.polarsys.capella.core.data.cs.InterfacePkg;
import org.polarsys.capella.core.data.cs.InterfaceUse;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.cs.PhysicalLink;
import org.polarsys.capella.core.data.cs.PhysicalLinkCategory;
import org.polarsys.capella.core.data.cs.PhysicalLinkEnd;
import org.polarsys.capella.core.data.cs.PhysicalLinkRealization;
import org.polarsys.capella.core.data.cs.PhysicalPath;
import org.polarsys.capella.core.data.cs.PhysicalPathInvolvement;
import org.polarsys.capella.core.data.cs.PhysicalPathRealization;
import org.polarsys.capella.core.data.cs.PhysicalPathReference;
import org.polarsys.capella.core.data.cs.PhysicalPort;
import org.polarsys.capella.core.data.cs.PhysicalPortRealization;
import org.polarsys.capella.core.data.cs.ProvidedInterfaceLink;
import org.polarsys.capella.core.data.cs.RequiredInterfaceLink;
import org.polarsys.capella.core.data.cs.SystemComponent;
import org.polarsys.capella.core.data.cs.SystemComponentCapabilityRealizationInvolvement;
import org.polarsys.capella.core.data.ctx.Actor;
import org.polarsys.capella.core.data.ctx.ActorCapabilityInvolvement;
import org.polarsys.capella.core.data.ctx.ActorMissionInvolvement;
import org.polarsys.capella.core.data.ctx.ActorPkg;
import org.polarsys.capella.core.data.ctx.Capability;
import org.polarsys.capella.core.data.ctx.CapabilityExploitation;
import org.polarsys.capella.core.data.ctx.CapabilityPkg;
import org.polarsys.capella.core.data.ctx.Mission;
import org.polarsys.capella.core.data.ctx.MissionPkg;
import org.polarsys.capella.core.data.ctx.OperationalActorRealization;
import org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization;
import org.polarsys.capella.core.data.ctx.OperationalEntityRealization;
import org.polarsys.capella.core.data.ctx.SystemAnalysis;
import org.polarsys.capella.core.data.ctx.SystemCapabilityInvolvement;
import org.polarsys.capella.core.data.ctx.SystemCommunication;
import org.polarsys.capella.core.data.ctx.SystemCommunicationHook;
import org.polarsys.capella.core.data.ctx.SystemContext;
import org.polarsys.capella.core.data.ctx.SystemFunction;
import org.polarsys.capella.core.data.ctx.SystemFunctionPkg;
import org.polarsys.capella.core.data.ctx.SystemMissionInvolvement;
import org.polarsys.capella.core.data.epbs.ConfigurationItem;
import org.polarsys.capella.core.data.epbs.ConfigurationItemPkg;
import org.polarsys.capella.core.data.epbs.EPBSArchitecture;
import org.polarsys.capella.core.data.epbs.EPBSArchitecturePkg;
import org.polarsys.capella.core.data.epbs.EPBSContext;
import org.polarsys.capella.core.data.epbs.PhysicalArchitectureRealization;
import org.polarsys.capella.core.data.epbs.PhysicalArtifactRealization;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.AbstractFunctionAllocation;
import org.polarsys.capella.core.data.fa.AbstractFunctionalArchitecture;
import org.polarsys.capella.core.data.fa.AbstractFunctionalBlock;
import org.polarsys.capella.core.data.fa.AbstractFunctionalChainContainer;
import org.polarsys.capella.core.data.fa.AbstractFunctionalStructure;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentExchangeAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchangeAllocator;
import org.polarsys.capella.core.data.fa.ComponentExchangeCategory;
import org.polarsys.capella.core.data.fa.ComponentExchangeEnd;
import org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation;
import org.polarsys.capella.core.data.fa.ComponentExchangeRealization;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ComponentPortAllocation;
import org.polarsys.capella.core.data.fa.ComponentPortAllocationEnd;
import org.polarsys.capella.core.data.fa.ExchangeCategory;
import org.polarsys.capella.core.data.fa.ExchangeContainment;
import org.polarsys.capella.core.data.fa.ExchangeLink;
import org.polarsys.capella.core.data.fa.ExchangeSpecification;
import org.polarsys.capella.core.data.fa.ExchangeSpecificationRealization;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionPkg;
import org.polarsys.capella.core.data.fa.FunctionPort;
import org.polarsys.capella.core.data.fa.FunctionRealization;
import org.polarsys.capella.core.data.fa.FunctionSpecification;
import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalChainInvolvement;
import org.polarsys.capella.core.data.fa.FunctionalChainRealization;
import org.polarsys.capella.core.data.fa.FunctionalChainReference;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.fa.FunctionalExchangeRealization;
import org.polarsys.capella.core.data.fa.FunctionalExchangeSpecification;
import org.polarsys.capella.core.data.information.AbstractCollectionValue;
import org.polarsys.capella.core.data.information.AbstractEventOperation;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.information.Association;
import org.polarsys.capella.core.data.information.AssociationPkg;
import org.polarsys.capella.core.data.information.Collection;
import org.polarsys.capella.core.data.information.CollectionValue;
import org.polarsys.capella.core.data.information.CollectionValueReference;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.DomainElement;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.ExchangeItemInstance;
import org.polarsys.capella.core.data.information.ExchangeItemRealization;
import org.polarsys.capella.core.data.information.InformationRealization;
import org.polarsys.capella.core.data.information.KeyPart;
import org.polarsys.capella.core.data.information.MultiplicityElement;
import org.polarsys.capella.core.data.information.Operation;
import org.polarsys.capella.core.data.information.OperationAllocation;
import org.polarsys.capella.core.data.information.Parameter;
import org.polarsys.capella.core.data.information.Partition;
import org.polarsys.capella.core.data.information.PartitionableElement;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.data.information.PortAllocation;
import org.polarsys.capella.core.data.information.PortRealization;
import org.polarsys.capella.core.data.information.Property;
import org.polarsys.capella.core.data.information.Service;
import org.polarsys.capella.core.data.information.Union;
import org.polarsys.capella.core.data.information.UnionProperty;
import org.polarsys.capella.core.data.information.Unit;
import org.polarsys.capella.core.data.information.communication.CommunicationItem;
import org.polarsys.capella.core.data.information.communication.CommunicationLink;
import org.polarsys.capella.core.data.information.communication.CommunicationLinkAllocation;
import org.polarsys.capella.core.data.information.communication.CommunicationLinkExchanger;
import org.polarsys.capella.core.data.information.communication.Message;
import org.polarsys.capella.core.data.information.communication.MessageReference;
import org.polarsys.capella.core.data.information.communication.MessageReferencePkg;
import org.polarsys.capella.core.data.information.communication.Signal;
import org.polarsys.capella.core.data.information.communication.SignalInstance;
import org.polarsys.capella.core.data.information.datatype.BooleanType;
import org.polarsys.capella.core.data.information.datatype.DataType;
import org.polarsys.capella.core.data.information.datatype.Enumeration;
import org.polarsys.capella.core.data.information.datatype.NumericType;
import org.polarsys.capella.core.data.information.datatype.PhysicalQuantity;
import org.polarsys.capella.core.data.information.datatype.StringType;
import org.polarsys.capella.core.data.information.datavalue.AbstractBooleanValue;
import org.polarsys.capella.core.data.information.datavalue.AbstractComplexValue;
import org.polarsys.capella.core.data.information.datavalue.AbstractEnumerationValue;
import org.polarsys.capella.core.data.information.datavalue.AbstractExpressionValue;
import org.polarsys.capella.core.data.information.datavalue.AbstractStringValue;
import org.polarsys.capella.core.data.information.datavalue.BinaryExpression;
import org.polarsys.capella.core.data.information.datavalue.BooleanReference;
import org.polarsys.capella.core.data.information.datavalue.ComplexValue;
import org.polarsys.capella.core.data.information.datavalue.ComplexValueReference;
import org.polarsys.capella.core.data.information.datavalue.DataValue;
import org.polarsys.capella.core.data.information.datavalue.DataValueContainer;
import org.polarsys.capella.core.data.information.datavalue.EnumerationLiteral;
import org.polarsys.capella.core.data.information.datavalue.EnumerationReference;
import org.polarsys.capella.core.data.information.datavalue.LiteralBooleanValue;
import org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue;
import org.polarsys.capella.core.data.information.datavalue.LiteralStringValue;
import org.polarsys.capella.core.data.information.datavalue.NumericReference;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;
import org.polarsys.capella.core.data.information.datavalue.OpaqueExpression;
import org.polarsys.capella.core.data.information.datavalue.StringReference;
import org.polarsys.capella.core.data.information.datavalue.UnaryExpression;
import org.polarsys.capella.core.data.information.datavalue.ValuePart;
import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityExtensionPoint;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude;
import org.polarsys.capella.core.data.interaction.AbstractCapabilityRealization;
import org.polarsys.capella.core.data.interaction.AbstractEnd;
import org.polarsys.capella.core.data.interaction.AbstractFragment;
import org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.interaction.ArmTimerEvent;
import org.polarsys.capella.core.data.interaction.CancelTimerEvent;
import org.polarsys.capella.core.data.interaction.CombinedFragment;
import org.polarsys.capella.core.data.interaction.ConstraintDuration;
import org.polarsys.capella.core.data.interaction.CreationEvent;
import org.polarsys.capella.core.data.interaction.DestructionEvent;
import org.polarsys.capella.core.data.interaction.Event;
import org.polarsys.capella.core.data.interaction.EventReceiptOperation;
import org.polarsys.capella.core.data.interaction.EventSentOperation;
import org.polarsys.capella.core.data.interaction.Execution;
import org.polarsys.capella.core.data.interaction.ExecutionEnd;
import org.polarsys.capella.core.data.interaction.ExecutionEvent;
import org.polarsys.capella.core.data.interaction.FragmentEnd;
import org.polarsys.capella.core.data.interaction.FunctionalChainAbstractCapabilityInvolvement;
import org.polarsys.capella.core.data.interaction.Gate;
import org.polarsys.capella.core.data.interaction.InstanceRole;
import org.polarsys.capella.core.data.interaction.InteractionFragment;
import org.polarsys.capella.core.data.interaction.InteractionOperand;
import org.polarsys.capella.core.data.interaction.InteractionState;
import org.polarsys.capella.core.data.interaction.InteractionUse;
import org.polarsys.capella.core.data.interaction.MergeLink;
import org.polarsys.capella.core.data.interaction.MessageEnd;
import org.polarsys.capella.core.data.interaction.RefinementLink;
import org.polarsys.capella.core.data.interaction.Scenario;
import org.polarsys.capella.core.data.interaction.ScenarioRealization;
import org.polarsys.capella.core.data.interaction.SequenceMessage;
import org.polarsys.capella.core.data.interaction.SequenceMessageValuation;
import org.polarsys.capella.core.data.interaction.StateFragment;
import org.polarsys.capella.core.data.interaction.TimeLapse;
import org.polarsys.capella.core.data.la.CapabilityRealization;
import org.polarsys.capella.core.data.la.CapabilityRealizationPkg;
import org.polarsys.capella.core.data.la.ContextInterfaceRealization;
import org.polarsys.capella.core.data.la.LogicalActor;
import org.polarsys.capella.core.data.la.LogicalActorPkg;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalArchitecturePkg;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.la.LogicalContext;
import org.polarsys.capella.core.data.la.LogicalFunction;
import org.polarsys.capella.core.data.la.LogicalFunctionPkg;
import org.polarsys.capella.core.data.la.SystemActorRealization;
import org.polarsys.capella.core.data.la.SystemAnalysisRealization;
import org.polarsys.capella.core.data.la.SystemRealization;
import org.polarsys.capella.core.data.oa.AbstractConceptItem;
import org.polarsys.capella.core.data.oa.ActivityAllocation;
import org.polarsys.capella.core.data.oa.CapabilityConfiguration;
import org.polarsys.capella.core.data.oa.CommunicationMean;
import org.polarsys.capella.core.data.oa.CommunityOfInterest;
import org.polarsys.capella.core.data.oa.CommunityOfInterestComposition;
import org.polarsys.capella.core.data.oa.Concept;
import org.polarsys.capella.core.data.oa.ConceptCompliance;
import org.polarsys.capella.core.data.oa.ConceptPkg;
import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement;
import org.polarsys.capella.core.data.oa.EntityPkg;
import org.polarsys.capella.core.data.oa.ItemInConcept;
import org.polarsys.capella.core.data.oa.Location;
import org.polarsys.capella.core.data.oa.OperationalActivity;
import org.polarsys.capella.core.data.oa.OperationalActivityPkg;
import org.polarsys.capella.core.data.oa.OperationalActor;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.oa.OperationalCapability;
import org.polarsys.capella.core.data.oa.OperationalCapabilityPkg;
import org.polarsys.capella.core.data.oa.OperationalContext;
import org.polarsys.capella.core.data.oa.OperationalProcess;
import org.polarsys.capella.core.data.oa.OperationalScenario;
import org.polarsys.capella.core.data.oa.OrganisationalUnit;
import org.polarsys.capella.core.data.oa.OrganisationalUnitComposition;
import org.polarsys.capella.core.data.oa.Role;
import org.polarsys.capella.core.data.oa.RoleAllocation;
import org.polarsys.capella.core.data.oa.RoleAssemblyUsage;
import org.polarsys.capella.core.data.oa.RolePkg;
import org.polarsys.capella.core.data.oa.Swimlane;
import org.polarsys.capella.core.data.pa.AbstractPhysicalComponent;
import org.polarsys.capella.core.data.pa.LogicalActorRealization;
import org.polarsys.capella.core.data.pa.LogicalArchitectureRealization;
import org.polarsys.capella.core.data.pa.LogicalComponentRealization;
import org.polarsys.capella.core.data.pa.LogicalInterfaceRealization;
import org.polarsys.capella.core.data.pa.PhysicalActor;
import org.polarsys.capella.core.data.pa.PhysicalActorPkg;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalArchitecturePkg;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.core.data.pa.PhysicalContext;
import org.polarsys.capella.core.data.pa.PhysicalFunction;
import org.polarsys.capella.core.data.pa.PhysicalFunctionPkg;
import org.polarsys.capella.core.data.pa.PhysicalNode;
import org.polarsys.capella.core.data.pa.deployment.AbstractPhysicalInstance;
import org.polarsys.capella.core.data.pa.deployment.ComponentInstance;
import org.polarsys.capella.core.data.pa.deployment.ConnectionInstance;
import org.polarsys.capella.core.data.pa.deployment.DeploymentAspect;
import org.polarsys.capella.core.data.pa.deployment.DeploymentConfiguration;
import org.polarsys.capella.core.data.pa.deployment.InstanceDeploymentLink;
import org.polarsys.capella.core.data.pa.deployment.PartDeploymentLink;
import org.polarsys.capella.core.data.pa.deployment.PortInstance;
import org.polarsys.capella.core.data.pa.deployment.TypeDeploymentLink;
import org.polarsys.capella.core.data.requirement.Requirement;
import org.polarsys.capella.core.data.requirement.RequirementsPkg;
import org.polarsys.capella.core.data.requirement.RequirementsTrace;
import org.polarsys.capella.core.data.requirement.SystemFunctionalInterfaceRequirement;
import org.polarsys.capella.core.data.requirement.SystemFunctionalRequirement;
import org.polarsys.capella.core.data.requirement.SystemNonFunctionalInterfaceRequirement;
import org.polarsys.capella.core.data.requirement.SystemNonFunctionalRequirement;
import org.polarsys.capella.core.data.requirement.SystemUserRequirement;
import org.polarsys.capella.core.data.sharedmodel.GenericPkg;
import org.polarsys.capella.core.data.sharedmodel.SharedPkg;
import org.polarsys.kitalpha.emde.model.Element;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;

@SuppressWarnings("all")
public class FunctionScenarioMTAdaptersFactory implements AdaptersFactory {
  private static FunctionScenarioMTAdaptersFactory instance;
  
  public static FunctionScenarioMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.FunctionScenarioMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FunctionScenarioMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.polarsys.capella.core.data.capellacommon.TransfoLink){
    	return createTransfoLinkAdapter((org.polarsys.capella.core.data.capellacommon.TransfoLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.JustificationLink){
    	return createJustificationLinkAdapter((org.polarsys.capella.core.data.capellacommon.JustificationLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.GenericTrace){
    	return createGenericTraceAdapter((org.polarsys.capella.core.data.capellacommon.GenericTrace) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.StateMachine){
    	return createStateMachineAdapter((org.polarsys.capella.core.data.capellacommon.StateMachine) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.Region){
    	return createRegionAdapter((org.polarsys.capella.core.data.capellacommon.Region) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.Mode){
    	return createModeAdapter((org.polarsys.capella.core.data.capellacommon.Mode) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.FinalState){
    	return createFinalStateAdapter((org.polarsys.capella.core.data.capellacommon.FinalState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.State){
    	return createStateAdapter((org.polarsys.capella.core.data.capellacommon.State) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.StateTransition){
    	return createStateTransitionAdapter((org.polarsys.capella.core.data.capellacommon.StateTransition) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.InitialPseudoState){
    	return createInitialPseudoStateAdapter((org.polarsys.capella.core.data.capellacommon.InitialPseudoState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.JoinPseudoState){
    	return createJoinPseudoStateAdapter((org.polarsys.capella.core.data.capellacommon.JoinPseudoState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.ForkPseudoState){
    	return createForkPseudoStateAdapter((org.polarsys.capella.core.data.capellacommon.ForkPseudoState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.ChoicePseudoState){
    	return createChoicePseudoStateAdapter((org.polarsys.capella.core.data.capellacommon.ChoicePseudoState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.TerminatePseudoState){
    	return createTerminatePseudoStateAdapter((org.polarsys.capella.core.data.capellacommon.TerminatePseudoState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.AbstractStateRealization){
    	return createAbstractStateRealizationAdapter((org.polarsys.capella.core.data.capellacommon.AbstractStateRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.StateTransitionRealization){
    	return createStateTransitionRealizationAdapter((org.polarsys.capella.core.data.capellacommon.StateTransitionRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.ShallowHistoryPseudoState){
    	return createShallowHistoryPseudoStateAdapter((org.polarsys.capella.core.data.capellacommon.ShallowHistoryPseudoState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.DeepHistoryPseudoState){
    	return createDeepHistoryPseudoStateAdapter((org.polarsys.capella.core.data.capellacommon.DeepHistoryPseudoState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.EntryPointPseudoState){
    	return createEntryPointPseudoStateAdapter((org.polarsys.capella.core.data.capellacommon.EntryPointPseudoState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.ExitPointPseudoState){
    	return createExitPointPseudoStateAdapter((org.polarsys.capella.core.data.capellacommon.ExitPointPseudoState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.StateEventRealization){
    	return createStateEventRealizationAdapter((org.polarsys.capella.core.data.capellacommon.StateEventRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.ChangeEvent){
    	return createChangeEventAdapter((org.polarsys.capella.core.data.capellacommon.ChangeEvent) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacommon.TimeEvent){
    	return createTimeEventAdapter((org.polarsys.capella.core.data.capellacommon.TimeEvent) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.epbs.EPBSArchitecturePkg){
    	return createEPBSArchitecturePkgAdapter((org.polarsys.capella.core.data.epbs.EPBSArchitecturePkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.epbs.EPBSArchitecture){
    	return createEPBSArchitectureAdapter((org.polarsys.capella.core.data.epbs.EPBSArchitecture) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.epbs.EPBSContext){
    	return createEPBSContextAdapter((org.polarsys.capella.core.data.epbs.EPBSContext) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.epbs.ConfigurationItemPkg){
    	return createConfigurationItemPkgAdapter((org.polarsys.capella.core.data.epbs.ConfigurationItemPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.epbs.ConfigurationItem){
    	return createConfigurationItemAdapter((org.polarsys.capella.core.data.epbs.ConfigurationItem) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.epbs.PhysicalArchitectureRealization){
    	return createPhysicalArchitectureRealizationAdapter((org.polarsys.capella.core.data.epbs.PhysicalArchitectureRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.epbs.PhysicalArtifactRealization){
    	return createPhysicalArtifactRealizationAdapter((org.polarsys.capella.core.data.epbs.PhysicalArtifactRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.deployment.ComponentInstance){
    	return createComponentInstanceAdapter((org.polarsys.capella.core.data.pa.deployment.ComponentInstance) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.deployment.ConnectionInstance){
    	return createConnectionInstanceAdapter((org.polarsys.capella.core.data.pa.deployment.ConnectionInstance) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.deployment.DeploymentAspect){
    	return createDeploymentAspectAdapter((org.polarsys.capella.core.data.pa.deployment.DeploymentAspect) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.deployment.DeploymentConfiguration){
    	return createDeploymentConfigurationAdapter((org.polarsys.capella.core.data.pa.deployment.DeploymentConfiguration) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.deployment.InstanceDeploymentLink){
    	return createInstanceDeploymentLinkAdapter((org.polarsys.capella.core.data.pa.deployment.InstanceDeploymentLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.deployment.PartDeploymentLink){
    	return createPartDeploymentLinkAdapter((org.polarsys.capella.core.data.pa.deployment.PartDeploymentLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.deployment.PortInstance){
    	return createPortInstanceAdapter((org.polarsys.capella.core.data.pa.deployment.PortInstance) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.deployment.TypeDeploymentLink){
    	return createTypeDeploymentLinkAdapter((org.polarsys.capella.core.data.pa.deployment.TypeDeploymentLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalArchitecturePkg){
    	return createPhysicalArchitecturePkgAdapter((org.polarsys.capella.core.data.pa.PhysicalArchitecturePkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalArchitecture){
    	return createPhysicalArchitectureAdapter((org.polarsys.capella.core.data.pa.PhysicalArchitecture) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalFunction){
    	return createPhysicalFunctionAdapter((org.polarsys.capella.core.data.pa.PhysicalFunction) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalFunctionPkg){
    	return createPhysicalFunctionPkgAdapter((org.polarsys.capella.core.data.pa.PhysicalFunctionPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalComponent){
    	return createPhysicalComponentAdapter((org.polarsys.capella.core.data.pa.PhysicalComponent) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalActorPkg){
    	return createPhysicalActorPkgAdapter((org.polarsys.capella.core.data.pa.PhysicalActorPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalComponentPkg){
    	return createPhysicalComponentPkgAdapter((org.polarsys.capella.core.data.pa.PhysicalComponentPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalActor){
    	return createPhysicalActorAdapter((org.polarsys.capella.core.data.pa.PhysicalActor) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.LogicalActorRealization){
    	return createLogicalActorRealizationAdapter((org.polarsys.capella.core.data.pa.LogicalActorRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalNode){
    	return createPhysicalNodeAdapter((org.polarsys.capella.core.data.pa.PhysicalNode) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.LogicalArchitectureRealization){
    	return createLogicalArchitectureRealizationAdapter((org.polarsys.capella.core.data.pa.LogicalArchitectureRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.LogicalComponentRealization){
    	return createLogicalComponentRealizationAdapter((org.polarsys.capella.core.data.pa.LogicalComponentRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.LogicalInterfaceRealization){
    	return createLogicalInterfaceRealizationAdapter((org.polarsys.capella.core.data.pa.LogicalInterfaceRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.pa.PhysicalContext){
    	return createPhysicalContextAdapter((org.polarsys.capella.core.data.pa.PhysicalContext) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.sharedmodel.SharedPkg){
    	return createSharedPkgAdapter((org.polarsys.capella.core.data.sharedmodel.SharedPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.sharedmodel.GenericPkg){
    	return createGenericPkgAdapter((org.polarsys.capella.core.data.sharedmodel.GenericPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OperationalAnalysis){
    	return createOperationalAnalysisAdapter((org.polarsys.capella.core.data.oa.OperationalAnalysis) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OperationalActivityPkg){
    	return createOperationalActivityPkgAdapter((org.polarsys.capella.core.data.oa.OperationalActivityPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OperationalActivity){
    	return createOperationalActivityAdapter((org.polarsys.capella.core.data.oa.OperationalActivity) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OperationalProcess){
    	return createOperationalProcessAdapter((org.polarsys.capella.core.data.oa.OperationalProcess) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.Swimlane){
    	return createSwimlaneAdapter((org.polarsys.capella.core.data.oa.Swimlane) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OperationalCapabilityPkg){
    	return createOperationalCapabilityPkgAdapter((org.polarsys.capella.core.data.oa.OperationalCapabilityPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OperationalCapability){
    	return createOperationalCapabilityAdapter((org.polarsys.capella.core.data.oa.OperationalCapability) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.ActivityAllocation){
    	return createActivityAllocationAdapter((org.polarsys.capella.core.data.oa.ActivityAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.RolePkg){
    	return createRolePkgAdapter((org.polarsys.capella.core.data.oa.RolePkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.Role){
    	return createRoleAdapter((org.polarsys.capella.core.data.oa.Role) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.RoleAssemblyUsage){
    	return createRoleAssemblyUsageAdapter((org.polarsys.capella.core.data.oa.RoleAssemblyUsage) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.RoleAllocation){
    	return createRoleAllocationAdapter((org.polarsys.capella.core.data.oa.RoleAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.EntityPkg){
    	return createEntityPkgAdapter((org.polarsys.capella.core.data.oa.EntityPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.Entity){
    	return createEntityAdapter((org.polarsys.capella.core.data.oa.Entity) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.ConceptPkg){
    	return createConceptPkgAdapter((org.polarsys.capella.core.data.oa.ConceptPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.Concept){
    	return createConceptAdapter((org.polarsys.capella.core.data.oa.Concept) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.ConceptCompliance){
    	return createConceptComplianceAdapter((org.polarsys.capella.core.data.oa.ConceptCompliance) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.ItemInConcept){
    	return createItemInConceptAdapter((org.polarsys.capella.core.data.oa.ItemInConcept) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OperationalActor){
    	return createOperationalActorAdapter((org.polarsys.capella.core.data.oa.OperationalActor) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.CommunityOfInterest){
    	return createCommunityOfInterestAdapter((org.polarsys.capella.core.data.oa.CommunityOfInterest) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.CommunityOfInterestComposition){
    	return createCommunityOfInterestCompositionAdapter((org.polarsys.capella.core.data.oa.CommunityOfInterestComposition) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OrganisationalUnit){
    	return createOrganisationalUnitAdapter((org.polarsys.capella.core.data.oa.OrganisationalUnit) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OrganisationalUnitComposition){
    	return createOrganisationalUnitCompositionAdapter((org.polarsys.capella.core.data.oa.OrganisationalUnitComposition) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.Location){
    	return createLocationAdapter((org.polarsys.capella.core.data.oa.Location) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.CapabilityConfiguration){
    	return createCapabilityConfigurationAdapter((org.polarsys.capella.core.data.oa.CapabilityConfiguration) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.CommunicationMean){
    	return createCommunicationMeanAdapter((org.polarsys.capella.core.data.oa.CommunicationMean) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement){
    	return createEntityOperationalCapabilityInvolvementAdapter((org.polarsys.capella.core.data.oa.EntityOperationalCapabilityInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.oa.OperationalContext){
    	return createOperationalContextAdapter((org.polarsys.capella.core.data.oa.OperationalContext) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.SequenceMessage){
    	return createSequenceMessageAdapter((org.polarsys.capella.core.data.interaction.SequenceMessage) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.Scenario){
    	return createScenarioAdapter((org.polarsys.capella.core.data.interaction.Scenario) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.MessageEnd){
    	return createMessageEndAdapter((org.polarsys.capella.core.data.interaction.MessageEnd) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.Execution){
    	return createExecutionAdapter((org.polarsys.capella.core.data.interaction.Execution) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.ExecutionEnd){
    	return createExecutionEndAdapter((org.polarsys.capella.core.data.interaction.ExecutionEnd) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.CreationEvent){
    	return createCreationEventAdapter((org.polarsys.capella.core.data.interaction.CreationEvent) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.DestructionEvent){
    	return createDestructionEventAdapter((org.polarsys.capella.core.data.interaction.DestructionEvent) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.ExecutionEvent){
    	return createExecutionEventAdapter((org.polarsys.capella.core.data.interaction.ExecutionEvent) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.InstanceRole){
    	return createInstanceRoleAdapter((org.polarsys.capella.core.data.interaction.InstanceRole) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.EventReceiptOperation){
    	return createEventReceiptOperationAdapter((org.polarsys.capella.core.data.interaction.EventReceiptOperation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.EventSentOperation){
    	return createEventSentOperationAdapter((org.polarsys.capella.core.data.interaction.EventSentOperation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.MergeLink){
    	return createMergeLinkAdapter((org.polarsys.capella.core.data.interaction.MergeLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.RefinementLink){
    	return createRefinementLinkAdapter((org.polarsys.capella.core.data.interaction.RefinementLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.AbstractCapabilityRealization){
    	return createAbstractCapabilityRealizationAdapter((org.polarsys.capella.core.data.interaction.AbstractCapabilityRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend){
    	return createAbstractCapabilityExtendAdapter((org.polarsys.capella.core.data.interaction.AbstractCapabilityExtend) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.AbstractCapabilityExtensionPoint){
    	return createAbstractCapabilityExtensionPointAdapter((org.polarsys.capella.core.data.interaction.AbstractCapabilityExtensionPoint) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization){
    	return createAbstractCapabilityGeneralizationAdapter((org.polarsys.capella.core.data.interaction.AbstractCapabilityGeneralization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude){
    	return createAbstractCapabilityIncludeAdapter((org.polarsys.capella.core.data.interaction.AbstractCapabilityInclude) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.InteractionState){
    	return createInteractionStateAdapter((org.polarsys.capella.core.data.interaction.InteractionState) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.InteractionUse){
    	return createInteractionUseAdapter((org.polarsys.capella.core.data.interaction.InteractionUse) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.CombinedFragment){
    	return createCombinedFragmentAdapter((org.polarsys.capella.core.data.interaction.CombinedFragment) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.Gate){
    	return createGateAdapter((org.polarsys.capella.core.data.interaction.Gate) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.InteractionOperand){
    	return createInteractionOperandAdapter((org.polarsys.capella.core.data.interaction.InteractionOperand) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.FragmentEnd){
    	return createFragmentEndAdapter((org.polarsys.capella.core.data.interaction.FragmentEnd) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.FunctionalChainAbstractCapabilityInvolvement){
    	return createFunctionalChainAbstractCapabilityInvolvementAdapter((org.polarsys.capella.core.data.interaction.FunctionalChainAbstractCapabilityInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement){
    	return createAbstractFunctionAbstractCapabilityInvolvementAdapter((org.polarsys.capella.core.data.interaction.AbstractFunctionAbstractCapabilityInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.ScenarioRealization){
    	return createScenarioRealizationAdapter((org.polarsys.capella.core.data.interaction.ScenarioRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.StateFragment){
    	return createStateFragmentAdapter((org.polarsys.capella.core.data.interaction.StateFragment) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.ArmTimerEvent){
    	return createArmTimerEventAdapter((org.polarsys.capella.core.data.interaction.ArmTimerEvent) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.CancelTimerEvent){
    	return createCancelTimerEventAdapter((org.polarsys.capella.core.data.interaction.CancelTimerEvent) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.ConstraintDuration){
    	return createConstraintDurationAdapter((org.polarsys.capella.core.data.interaction.ConstraintDuration) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.interaction.SequenceMessageValuation){
    	return createSequenceMessageValuationAdapter((org.polarsys.capella.core.data.interaction.SequenceMessageValuation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.NamingRule){
    	return createNamingRuleAdapter((org.polarsys.capella.core.data.capellacore.NamingRule) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.Constraint){
    	return createConstraintAdapter((org.polarsys.capella.core.data.capellacore.Constraint) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.KeyValue){
    	return createKeyValueAdapter((org.polarsys.capella.core.data.capellacore.KeyValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.ReuseLink){
    	return createReuseLinkAdapter((org.polarsys.capella.core.data.capellacore.ReuseLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.Generalization){
    	return createGeneralizationAdapter((org.polarsys.capella.core.data.capellacore.Generalization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.StringPropertyValue){
    	return createStringPropertyValueAdapter((org.polarsys.capella.core.data.capellacore.StringPropertyValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.IntegerPropertyValue){
    	return createIntegerPropertyValueAdapter((org.polarsys.capella.core.data.capellacore.IntegerPropertyValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.BooleanPropertyValue){
    	return createBooleanPropertyValueAdapter((org.polarsys.capella.core.data.capellacore.BooleanPropertyValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.FloatPropertyValue){
    	return createFloatPropertyValueAdapter((org.polarsys.capella.core.data.capellacore.FloatPropertyValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue){
    	return createEnumerationPropertyValueAdapter((org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.EnumerationPropertyType){
    	return createEnumerationPropertyTypeAdapter((org.polarsys.capella.core.data.capellacore.EnumerationPropertyType) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral){
    	return createEnumerationPropertyLiteralAdapter((org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.PropertyValueGroup){
    	return createPropertyValueGroupAdapter((org.polarsys.capella.core.data.capellacore.PropertyValueGroup) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellacore.PropertyValuePkg){
    	return createPropertyValuePkgAdapter((org.polarsys.capella.core.data.capellacore.PropertyValuePkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.communication.Exception){
    	return createExceptionAdapter((org.polarsys.capella.core.data.information.communication.Exception) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.communication.Message){
    	return createMessageAdapter((org.polarsys.capella.core.data.information.communication.Message) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.communication.MessageReference){
    	return createMessageReferenceAdapter((org.polarsys.capella.core.data.information.communication.MessageReference) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.communication.Signal){
    	return createSignalAdapter((org.polarsys.capella.core.data.information.communication.Signal) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.communication.SignalInstance){
    	return createSignalInstanceAdapter((org.polarsys.capella.core.data.information.communication.SignalInstance) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.communication.CommunicationLink){
    	return createCommunicationLinkAdapter((org.polarsys.capella.core.data.information.communication.CommunicationLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.communication.CommunicationLinkAllocation){
    	return createCommunicationLinkAllocationAdapter((org.polarsys.capella.core.data.information.communication.CommunicationLinkAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.LogicalArchitecturePkg){
    	return createLogicalArchitecturePkgAdapter((org.polarsys.capella.core.data.la.LogicalArchitecturePkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.LogicalArchitecture){
    	return createLogicalArchitectureAdapter((org.polarsys.capella.core.data.la.LogicalArchitecture) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.LogicalFunction){
    	return createLogicalFunctionAdapter((org.polarsys.capella.core.data.la.LogicalFunction) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.LogicalFunctionPkg){
    	return createLogicalFunctionPkgAdapter((org.polarsys.capella.core.data.la.LogicalFunctionPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.LogicalComponent){
    	return createLogicalComponentAdapter((org.polarsys.capella.core.data.la.LogicalComponent) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.LogicalComponentPkg){
    	return createLogicalComponentPkgAdapter((org.polarsys.capella.core.data.la.LogicalComponentPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.CapabilityRealization){
    	return createCapabilityRealizationAdapter((org.polarsys.capella.core.data.la.CapabilityRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.CapabilityRealizationPkg){
    	return createCapabilityRealizationPkgAdapter((org.polarsys.capella.core.data.la.CapabilityRealizationPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.SystemAnalysisRealization){
    	return createSystemAnalysisRealizationAdapter((org.polarsys.capella.core.data.la.SystemAnalysisRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.SystemRealization){
    	return createSystemRealizationAdapter((org.polarsys.capella.core.data.la.SystemRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.ContextInterfaceRealization){
    	return createContextInterfaceRealizationAdapter((org.polarsys.capella.core.data.la.ContextInterfaceRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.LogicalActorPkg){
    	return createLogicalActorPkgAdapter((org.polarsys.capella.core.data.la.LogicalActorPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.LogicalActor){
    	return createLogicalActorAdapter((org.polarsys.capella.core.data.la.LogicalActor) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.SystemActorRealization){
    	return createSystemActorRealizationAdapter((org.polarsys.capella.core.data.la.SystemActorRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.la.LogicalContext){
    	return createLogicalContextAdapter((org.polarsys.capella.core.data.la.LogicalContext) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellamodeller.Project){
    	return createProjectAdapter((org.polarsys.capella.core.data.capellamodeller.Project) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellamodeller.Folder){
    	return createFolderAdapter((org.polarsys.capella.core.data.capellamodeller.Folder) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellamodeller.SystemEngineering){
    	return createSystemEngineeringAdapter((org.polarsys.capella.core.data.capellamodeller.SystemEngineering) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellamodeller.SystemEngineeringPkg){
    	return createSystemEngineeringPkgAdapter((org.polarsys.capella.core.data.capellamodeller.SystemEngineeringPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.capellamodeller.Library){
    	return createLibraryAdapter((org.polarsys.capella.core.data.capellamodeller.Library) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.Association){
    	return createAssociationAdapter((org.polarsys.capella.core.data.information.Association) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.Class){
    	return createClassAdapter((org.polarsys.capella.core.data.information.Class) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.Collection){
    	return createCollectionAdapter((org.polarsys.capella.core.data.information.Collection) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.CollectionValue){
    	return createCollectionValueAdapter((org.polarsys.capella.core.data.information.CollectionValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.CollectionValueReference){
    	return createCollectionValueReferenceAdapter((org.polarsys.capella.core.data.information.CollectionValueReference) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.DataPkg){
    	return createDataPkgAdapter((org.polarsys.capella.core.data.information.DataPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.DomainElement){
    	return createDomainElementAdapter((org.polarsys.capella.core.data.information.DomainElement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.KeyPart){
    	return createKeyPartAdapter((org.polarsys.capella.core.data.information.KeyPart) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.OperationAllocation){
    	return createOperationAllocationAdapter((org.polarsys.capella.core.data.information.OperationAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.Parameter){
    	return createParameterAdapter((org.polarsys.capella.core.data.information.Parameter) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.Property){
    	return createPropertyAdapter((org.polarsys.capella.core.data.information.Property) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.Service){
    	return createServiceAdapter((org.polarsys.capella.core.data.information.Service) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.Union){
    	return createUnionAdapter((org.polarsys.capella.core.data.information.Union) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.UnionProperty){
    	return createUnionPropertyAdapter((org.polarsys.capella.core.data.information.UnionProperty) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.Unit){
    	return createUnitAdapter((org.polarsys.capella.core.data.information.Unit) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.PortRealization){
    	return createPortRealizationAdapter((org.polarsys.capella.core.data.information.PortRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.PortAllocation){
    	return createPortAllocationAdapter((org.polarsys.capella.core.data.information.PortAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.ExchangeItem){
    	return createExchangeItemAdapter((org.polarsys.capella.core.data.information.ExchangeItem) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.ExchangeItemElement){
    	return createExchangeItemElementAdapter((org.polarsys.capella.core.data.information.ExchangeItemElement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.ExchangeItemInstance){
    	return createExchangeItemInstanceAdapter((org.polarsys.capella.core.data.information.ExchangeItemInstance) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.InformationRealization){
    	return createInformationRealizationAdapter((org.polarsys.capella.core.data.information.InformationRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.ExchangeItemRealization){
    	return createExchangeItemRealizationAdapter((org.polarsys.capella.core.data.information.ExchangeItemRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datatype.BooleanType){
    	return createBooleanTypeAdapter((org.polarsys.capella.core.data.information.datatype.BooleanType) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datatype.Enumeration){
    	return createEnumerationAdapter((org.polarsys.capella.core.data.information.datatype.Enumeration) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datatype.StringType){
    	return createStringTypeAdapter((org.polarsys.capella.core.data.information.datatype.StringType) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datatype.PhysicalQuantity){
    	return createPhysicalQuantityAdapter((org.polarsys.capella.core.data.information.datatype.PhysicalQuantity) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datatype.NumericType){
    	return createNumericTypeAdapter((org.polarsys.capella.core.data.information.datatype.NumericType) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.LiteralBooleanValue){
    	return createLiteralBooleanValueAdapter((org.polarsys.capella.core.data.information.datavalue.LiteralBooleanValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.BooleanReference){
    	return createBooleanReferenceAdapter((org.polarsys.capella.core.data.information.datavalue.BooleanReference) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.EnumerationLiteral){
    	return createEnumerationLiteralAdapter((org.polarsys.capella.core.data.information.datavalue.EnumerationLiteral) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.EnumerationReference){
    	return createEnumerationReferenceAdapter((org.polarsys.capella.core.data.information.datavalue.EnumerationReference) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.LiteralStringValue){
    	return createLiteralStringValueAdapter((org.polarsys.capella.core.data.information.datavalue.LiteralStringValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.StringReference){
    	return createStringReferenceAdapter((org.polarsys.capella.core.data.information.datavalue.StringReference) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue){
    	return createLiteralNumericValueAdapter((org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.NumericReference){
    	return createNumericReferenceAdapter((org.polarsys.capella.core.data.information.datavalue.NumericReference) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.ComplexValue){
    	return createComplexValueAdapter((org.polarsys.capella.core.data.information.datavalue.ComplexValue) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.ComplexValueReference){
    	return createComplexValueReferenceAdapter((org.polarsys.capella.core.data.information.datavalue.ComplexValueReference) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.ValuePart){
    	return createValuePartAdapter((org.polarsys.capella.core.data.information.datavalue.ValuePart) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.BinaryExpression){
    	return createBinaryExpressionAdapter((org.polarsys.capella.core.data.information.datavalue.BinaryExpression) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.UnaryExpression){
    	return createUnaryExpressionAdapter((org.polarsys.capella.core.data.information.datavalue.UnaryExpression) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.information.datavalue.OpaqueExpression){
    	return createOpaqueExpressionAdapter((org.polarsys.capella.core.data.information.datavalue.OpaqueExpression) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.Part){
    	return createPartAdapter((org.polarsys.capella.core.data.cs.Part) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.InterfacePkg){
    	return createInterfacePkgAdapter((org.polarsys.capella.core.data.cs.InterfacePkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.Interface){
    	return createInterfaceAdapter((org.polarsys.capella.core.data.cs.Interface) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.InterfaceImplementation){
    	return createInterfaceImplementationAdapter((org.polarsys.capella.core.data.cs.InterfaceImplementation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.InterfaceUse){
    	return createInterfaceUseAdapter((org.polarsys.capella.core.data.cs.InterfaceUse) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.ActorCapabilityRealizationInvolvement){
    	return createActorCapabilityRealizationInvolvementAdapter((org.polarsys.capella.core.data.cs.ActorCapabilityRealizationInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.SystemComponentCapabilityRealizationInvolvement){
    	return createSystemComponentCapabilityRealizationInvolvementAdapter((org.polarsys.capella.core.data.cs.SystemComponentCapabilityRealizationInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.ExchangeItemAllocation){
    	return createExchangeItemAllocationAdapter((org.polarsys.capella.core.data.cs.ExchangeItemAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalLink){
    	return createPhysicalLinkAdapter((org.polarsys.capella.core.data.cs.PhysicalLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalLinkCategory){
    	return createPhysicalLinkCategoryAdapter((org.polarsys.capella.core.data.cs.PhysicalLinkCategory) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalLinkEnd){
    	return createPhysicalLinkEndAdapter((org.polarsys.capella.core.data.cs.PhysicalLinkEnd) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalLinkRealization){
    	return createPhysicalLinkRealizationAdapter((org.polarsys.capella.core.data.cs.PhysicalLinkRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalPath){
    	return createPhysicalPathAdapter((org.polarsys.capella.core.data.cs.PhysicalPath) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalPathReference){
    	return createPhysicalPathReferenceAdapter((org.polarsys.capella.core.data.cs.PhysicalPathReference) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalPathInvolvement){
    	return createPhysicalPathInvolvementAdapter((org.polarsys.capella.core.data.cs.PhysicalPathInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalPathRealization){
    	return createPhysicalPathRealizationAdapter((org.polarsys.capella.core.data.cs.PhysicalPathRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalPort){
    	return createPhysicalPortAdapter((org.polarsys.capella.core.data.cs.PhysicalPort) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.cs.PhysicalPortRealization){
    	return createPhysicalPortRealizationAdapter((org.polarsys.capella.core.data.cs.PhysicalPortRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.SystemAnalysis){
    	return createSystemAnalysisAdapter((org.polarsys.capella.core.data.ctx.SystemAnalysis) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.System){
    	return createSystemAdapter((org.polarsys.capella.core.data.ctx.System) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.SystemFunction){
    	return createSystemFunctionAdapter((org.polarsys.capella.core.data.ctx.SystemFunction) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.SystemFunctionPkg){
    	return createSystemFunctionPkgAdapter((org.polarsys.capella.core.data.ctx.SystemFunctionPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.SystemCommunicationHook){
    	return createSystemCommunicationHookAdapter((org.polarsys.capella.core.data.ctx.SystemCommunicationHook) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.SystemCommunication){
    	return createSystemCommunicationAdapter((org.polarsys.capella.core.data.ctx.SystemCommunication) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.Actor){
    	return createActorAdapter((org.polarsys.capella.core.data.ctx.Actor) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.ActorCapabilityInvolvement){
    	return createActorCapabilityInvolvementAdapter((org.polarsys.capella.core.data.ctx.ActorCapabilityInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.ActorMissionInvolvement){
    	return createActorMissionInvolvementAdapter((org.polarsys.capella.core.data.ctx.ActorMissionInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.ActorPkg){
    	return createActorPkgAdapter((org.polarsys.capella.core.data.ctx.ActorPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.Mission){
    	return createMissionAdapter((org.polarsys.capella.core.data.ctx.Mission) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.MissionPkg){
    	return createMissionPkgAdapter((org.polarsys.capella.core.data.ctx.MissionPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.SystemMissionInvolvement){
    	return createSystemMissionInvolvementAdapter((org.polarsys.capella.core.data.ctx.SystemMissionInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.Capability){
    	return createCapabilityAdapter((org.polarsys.capella.core.data.ctx.Capability) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.CapabilityExploitation){
    	return createCapabilityExploitationAdapter((org.polarsys.capella.core.data.ctx.CapabilityExploitation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.CapabilityPkg){
    	return createCapabilityPkgAdapter((org.polarsys.capella.core.data.ctx.CapabilityPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.SystemCapabilityInvolvement){
    	return createSystemCapabilityInvolvementAdapter((org.polarsys.capella.core.data.ctx.SystemCapabilityInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.OperationalActorRealization){
    	return createOperationalActorRealizationAdapter((org.polarsys.capella.core.data.ctx.OperationalActorRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization){
    	return createOperationalAnalysisRealizationAdapter((org.polarsys.capella.core.data.ctx.OperationalAnalysisRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.OperationalEntityRealization){
    	return createOperationalEntityRealizationAdapter((org.polarsys.capella.core.data.ctx.OperationalEntityRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.ctx.SystemContext){
    	return createSystemContextAdapter((org.polarsys.capella.core.data.ctx.SystemContext) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.requirement.RequirementsPkg){
    	return createRequirementsPkgAdapter((org.polarsys.capella.core.data.requirement.RequirementsPkg) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.requirement.RequirementsTrace){
    	return createRequirementsTraceAdapter((org.polarsys.capella.core.data.requirement.RequirementsTrace) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.requirement.SystemFunctionalInterfaceRequirement){
    	return createSystemFunctionalInterfaceRequirementAdapter((org.polarsys.capella.core.data.requirement.SystemFunctionalInterfaceRequirement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.requirement.SystemFunctionalRequirement){
    	return createSystemFunctionalRequirementAdapter((org.polarsys.capella.core.data.requirement.SystemFunctionalRequirement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.requirement.SystemNonFunctionalInterfaceRequirement){
    	return createSystemNonFunctionalInterfaceRequirementAdapter((org.polarsys.capella.core.data.requirement.SystemNonFunctionalInterfaceRequirement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.requirement.SystemNonFunctionalRequirement){
    	return createSystemNonFunctionalRequirementAdapter((org.polarsys.capella.core.data.requirement.SystemNonFunctionalRequirement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.requirement.SystemUserRequirement){
    	return createSystemUserRequirementAdapter((org.polarsys.capella.core.data.requirement.SystemUserRequirement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionSpecification){
    	return createFunctionSpecificationAdapter((org.polarsys.capella.core.data.fa.FunctionSpecification) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ExchangeCategory){
    	return createExchangeCategoryAdapter((org.polarsys.capella.core.data.fa.ExchangeCategory) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ExchangeLink){
    	return createExchangeLinkAdapter((org.polarsys.capella.core.data.fa.ExchangeLink) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ExchangeContainment){
    	return createExchangeContainmentAdapter((org.polarsys.capella.core.data.fa.ExchangeContainment) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionalExchangeSpecification){
    	return createFunctionalExchangeSpecificationAdapter((org.polarsys.capella.core.data.fa.FunctionalExchangeSpecification) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionalChain){
    	return createFunctionalChainAdapter((org.polarsys.capella.core.data.fa.FunctionalChain) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionalChainReference){
    	return createFunctionalChainReferenceAdapter((org.polarsys.capella.core.data.fa.FunctionalChainReference) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionalChainInvolvement){
    	return createFunctionalChainInvolvementAdapter((org.polarsys.capella.core.data.fa.FunctionalChainInvolvement) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionInputPort){
    	return createFunctionInputPortAdapter((org.polarsys.capella.core.data.fa.FunctionInputPort) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionOutputPort){
    	return createFunctionOutputPortAdapter((org.polarsys.capella.core.data.fa.FunctionOutputPort) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation){
    	return createComponentFunctionalAllocationAdapter((org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionalChainRealization){
    	return createFunctionalChainRealizationAdapter((org.polarsys.capella.core.data.fa.FunctionalChainRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionalExchangeRealization){
    	return createFunctionalExchangeRealizationAdapter((org.polarsys.capella.core.data.fa.FunctionalExchangeRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionRealization){
    	return createFunctionRealizationAdapter((org.polarsys.capella.core.data.fa.FunctionRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.FunctionalExchange){
    	return createFunctionalExchangeAdapter((org.polarsys.capella.core.data.fa.FunctionalExchange) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentExchange){
    	return createComponentExchangeAdapter((org.polarsys.capella.core.data.fa.ComponentExchange) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentExchangeAllocation){
    	return createComponentExchangeAllocationAdapter((org.polarsys.capella.core.data.fa.ComponentExchangeAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentExchangeCategory){
    	return createComponentExchangeCategoryAdapter((org.polarsys.capella.core.data.fa.ComponentExchangeCategory) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentExchangeEnd){
    	return createComponentExchangeEndAdapter((org.polarsys.capella.core.data.fa.ComponentExchangeEnd) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation){
    	return createComponentExchangeFunctionalExchangeAllocationAdapter((org.polarsys.capella.core.data.fa.ComponentExchangeFunctionalExchangeAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentExchangeRealization){
    	return createComponentExchangeRealizationAdapter((org.polarsys.capella.core.data.fa.ComponentExchangeRealization) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentPort){
    	return createComponentPortAdapter((org.polarsys.capella.core.data.fa.ComponentPort) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentPortAllocation){
    	return createComponentPortAllocationAdapter((org.polarsys.capella.core.data.fa.ComponentPortAllocation) o, res);
    }
    if (o instanceof org.polarsys.capella.core.data.fa.ComponentPortAllocationEnd){
    	return createComponentPortAllocationEndAdapter((org.polarsys.capella.core.data.fa.ComponentPortAllocationEnd) o, res);
    }
    
    return null;
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractCapabilityPkgAdapter createAbstractCapabilityPkgAdapter(final AbstractCapabilityPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractCapabilityPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractCapabilityPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractCapabilityPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.GenericTraceAdapter createGenericTraceAdapter(final GenericTrace adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.GenericTraceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.GenericTraceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.GenericTraceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TransfoLinkAdapter createTransfoLinkAdapter(final TransfoLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TransfoLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TransfoLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TransfoLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.JustificationLinkAdapter createJustificationLinkAdapter(final JustificationLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.JustificationLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.JustificationLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.JustificationLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.CapabilityRealizationInvolvementAdapter createCapabilityRealizationInvolvementAdapter(final CapabilityRealizationInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.CapabilityRealizationInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.CapabilityRealizationInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.CapabilityRealizationInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.CapabilityRealizationInvolvedElementAdapter createCapabilityRealizationInvolvedElementAdapter(final CapabilityRealizationInvolvedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.CapabilityRealizationInvolvedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.CapabilityRealizationInvolvedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.CapabilityRealizationInvolvedElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateMachineAdapter createStateMachineAdapter(final StateMachine adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateMachineAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateMachineAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateMachineAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.RegionAdapter createRegionAdapter(final Region adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.RegionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.RegionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.RegionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ModeAdapter createModeAdapter(final Mode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ModeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ModeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ModeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.FinalStateAdapter createFinalStateAdapter(final FinalState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.FinalStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.FinalStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.FinalStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateAdapter createAbstractStateAdapter(final AbstractState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateTransitionAdapter createStateTransitionAdapter(final StateTransition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateTransitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateTransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateTransitionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.PseudostateAdapter createPseudostateAdapter(final Pseudostate adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.PseudostateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.PseudostateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.PseudostateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.InitialPseudoStateAdapter createInitialPseudoStateAdapter(final InitialPseudoState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.InitialPseudoStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.InitialPseudoStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.InitialPseudoStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.JoinPseudoStateAdapter createJoinPseudoStateAdapter(final JoinPseudoState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.JoinPseudoStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.JoinPseudoStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.JoinPseudoStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ForkPseudoStateAdapter createForkPseudoStateAdapter(final ForkPseudoState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ForkPseudoStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ForkPseudoStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ForkPseudoStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ChoicePseudoStateAdapter createChoicePseudoStateAdapter(final ChoicePseudoState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ChoicePseudoStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ChoicePseudoStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ChoicePseudoStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TerminatePseudoStateAdapter createTerminatePseudoStateAdapter(final TerminatePseudoState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TerminatePseudoStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TerminatePseudoStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TerminatePseudoStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateRealizationAdapter createAbstractStateRealizationAdapter(final AbstractStateRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.AbstractStateRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateTransitionRealizationAdapter createStateTransitionRealizationAdapter(final StateTransitionRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateTransitionRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateTransitionRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateTransitionRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ShallowHistoryPseudoStateAdapter createShallowHistoryPseudoStateAdapter(final ShallowHistoryPseudoState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ShallowHistoryPseudoStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ShallowHistoryPseudoStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ShallowHistoryPseudoStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.DeepHistoryPseudoStateAdapter createDeepHistoryPseudoStateAdapter(final DeepHistoryPseudoState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.DeepHistoryPseudoStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.DeepHistoryPseudoStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.DeepHistoryPseudoStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.EntryPointPseudoStateAdapter createEntryPointPseudoStateAdapter(final EntryPointPseudoState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.EntryPointPseudoStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.EntryPointPseudoStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.EntryPointPseudoStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ExitPointPseudoStateAdapter createExitPointPseudoStateAdapter(final ExitPointPseudoState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ExitPointPseudoStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ExitPointPseudoStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ExitPointPseudoStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateEventRealizationAdapter createStateEventRealizationAdapter(final StateEventRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateEventRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateEventRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateEventRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateEventAdapter createStateEventAdapter(final StateEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.StateEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ChangeEventAdapter createChangeEventAdapter(final ChangeEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ChangeEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ChangeEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.ChangeEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TimeEventAdapter createTimeEventAdapter(final TimeEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TimeEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TimeEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacommon.TimeEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AbstractActivityAdapter createAbstractActivityAdapter(final AbstractActivity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AbstractActivityAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AbstractActivityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AbstractActivityAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExceptionHandlerAdapter createExceptionHandlerAdapter(final ExceptionHandler adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExceptionHandlerAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExceptionHandlerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExceptionHandlerAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityGroupAdapter createActivityGroupAdapter(final ActivityGroup adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityGroupAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityGroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityGroupAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InterruptibleActivityRegionAdapter createInterruptibleActivityRegionAdapter(final InterruptibleActivityRegion adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InterruptibleActivityRegionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InterruptibleActivityRegionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InterruptibleActivityRegionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityEdgeAdapter createActivityEdgeAdapter(final ActivityEdge adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityEdgeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityEdgeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityEdgeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ControlFlowAdapter createControlFlowAdapter(final ControlFlow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ControlFlowAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ControlFlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ControlFlowAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ObjectFlowAdapter createObjectFlowAdapter(final ObjectFlow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ObjectFlowAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ObjectFlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ObjectFlowAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityPartitionAdapter createActivityPartitionAdapter(final ActivityPartition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityPartitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityPartitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityPartitionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityExchangeAdapter createActivityExchangeAdapter(final ActivityExchange adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityExchangeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityExchangeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityExchangeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityNodeAdapter createActivityNodeAdapter(final ActivityNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ActivityNodeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExecutableNodeAdapter createExecutableNodeAdapter(final ExecutableNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExecutableNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExecutableNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ExecutableNodeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.StructuredActivityNodeAdapter createStructuredActivityNodeAdapter(final StructuredActivityNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.StructuredActivityNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.StructuredActivityNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.StructuredActivityNodeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AbstractActionAdapter createAbstractActionAdapter(final AbstractAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AbstractActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AbstractActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AbstractActionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AcceptEventActionAdapter createAcceptEventActionAdapter(final AcceptEventAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AcceptEventActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AcceptEventActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.AcceptEventActionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InvocationActionAdapter createInvocationActionAdapter(final InvocationAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InvocationActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InvocationActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InvocationActionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.SendSignalActionAdapter createSendSignalActionAdapter(final SendSignalAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.SendSignalActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.SendSignalActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.SendSignalActionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.CallActionAdapter createCallActionAdapter(final CallAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.CallActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.CallActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.CallActionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.CallBehaviorActionAdapter createCallBehaviorActionAdapter(final CallBehaviorAction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.CallBehaviorActionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.CallBehaviorActionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.CallBehaviorActionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ObjectNodeAdapter createObjectNodeAdapter(final ObjectNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ObjectNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ObjectNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ObjectNodeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.PinAdapter createPinAdapter(final Pin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.PinAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.PinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.PinAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InputPinAdapter createInputPinAdapter(final InputPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InputPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InputPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.InputPinAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ValuePinAdapter createValuePinAdapter(final ValuePin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ValuePinAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ValuePinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.ValuePinAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.OutputPinAdapter createOutputPinAdapter(final OutputPin adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.OutputPinAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.OutputPinAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.activity.OutputPinAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSArchitecturePkgAdapter createEPBSArchitecturePkgAdapter(final EPBSArchitecturePkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSArchitecturePkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSArchitecturePkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSArchitecturePkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSArchitectureAdapter createEPBSArchitectureAdapter(final EPBSArchitecture adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSArchitectureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSArchitectureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSArchitectureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSContextAdapter createEPBSContextAdapter(final EPBSContext adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSContextAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.EPBSContextAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.ConfigurationItemPkgAdapter createConfigurationItemPkgAdapter(final ConfigurationItemPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.ConfigurationItemPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.ConfigurationItemPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.ConfigurationItemPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.ConfigurationItemAdapter createConfigurationItemAdapter(final ConfigurationItem adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.ConfigurationItemAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.ConfigurationItemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.ConfigurationItemAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.PhysicalArchitectureRealizationAdapter createPhysicalArchitectureRealizationAdapter(final PhysicalArchitectureRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.PhysicalArchitectureRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.PhysicalArchitectureRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.PhysicalArchitectureRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.PhysicalArtifactRealizationAdapter createPhysicalArtifactRealizationAdapter(final PhysicalArtifactRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.PhysicalArtifactRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.PhysicalArtifactRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.epbs.PhysicalArtifactRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.ComponentInstanceAdapter createComponentInstanceAdapter(final ComponentInstance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.ComponentInstanceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.ComponentInstanceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.ComponentInstanceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.ConnectionInstanceAdapter createConnectionInstanceAdapter(final ConnectionInstance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.ConnectionInstanceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.ConnectionInstanceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.ConnectionInstanceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentAspectAdapter createDeploymentAspectAdapter(final DeploymentAspect adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentAspectAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentAspectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentAspectAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentConfigurationAdapter createDeploymentConfigurationAdapter(final DeploymentConfiguration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentConfigurationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentConfigurationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.DeploymentConfigurationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.InstanceDeploymentLinkAdapter createInstanceDeploymentLinkAdapter(final InstanceDeploymentLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.InstanceDeploymentLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.InstanceDeploymentLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.InstanceDeploymentLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.PartDeploymentLinkAdapter createPartDeploymentLinkAdapter(final PartDeploymentLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.PartDeploymentLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.PartDeploymentLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.PartDeploymentLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.AbstractPhysicalInstanceAdapter createAbstractPhysicalInstanceAdapter(final AbstractPhysicalInstance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.AbstractPhysicalInstanceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.AbstractPhysicalInstanceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.AbstractPhysicalInstanceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.PortInstanceAdapter createPortInstanceAdapter(final PortInstance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.PortInstanceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.PortInstanceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.PortInstanceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.TypeDeploymentLinkAdapter createTypeDeploymentLinkAdapter(final TypeDeploymentLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.TypeDeploymentLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.TypeDeploymentLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.deployment.TypeDeploymentLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalArchitecturePkgAdapter createPhysicalArchitecturePkgAdapter(final PhysicalArchitecturePkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalArchitecturePkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalArchitecturePkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalArchitecturePkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalArchitectureAdapter createPhysicalArchitectureAdapter(final PhysicalArchitecture adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalArchitectureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalArchitectureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalArchitectureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalFunctionAdapter createPhysicalFunctionAdapter(final PhysicalFunction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalFunctionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalFunctionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalFunctionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalFunctionPkgAdapter createPhysicalFunctionPkgAdapter(final PhysicalFunctionPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalFunctionPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalFunctionPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalFunctionPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.AbstractPhysicalComponentAdapter createAbstractPhysicalComponentAdapter(final AbstractPhysicalComponent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.AbstractPhysicalComponentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.AbstractPhysicalComponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.AbstractPhysicalComponentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalComponentAdapter createPhysicalComponentAdapter(final PhysicalComponent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalComponentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalComponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalComponentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalActorPkgAdapter createPhysicalActorPkgAdapter(final PhysicalActorPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalActorPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalActorPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalActorPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalComponentPkgAdapter createPhysicalComponentPkgAdapter(final PhysicalComponentPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalComponentPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalComponentPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalComponentPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalActorAdapter createPhysicalActorAdapter(final PhysicalActor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalActorAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalActorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalActorAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalActorRealizationAdapter createLogicalActorRealizationAdapter(final LogicalActorRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalActorRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalActorRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalActorRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalNodeAdapter createPhysicalNodeAdapter(final PhysicalNode adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalNodeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalNodeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalNodeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalArchitectureRealizationAdapter createLogicalArchitectureRealizationAdapter(final LogicalArchitectureRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalArchitectureRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalArchitectureRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalArchitectureRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalComponentRealizationAdapter createLogicalComponentRealizationAdapter(final LogicalComponentRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalComponentRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalComponentRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalComponentRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalInterfaceRealizationAdapter createLogicalInterfaceRealizationAdapter(final LogicalInterfaceRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalInterfaceRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalInterfaceRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.LogicalInterfaceRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalContextAdapter createPhysicalContextAdapter(final PhysicalContext adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalContextAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.pa.PhysicalContextAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractBehaviorAdapter createAbstractBehaviorAdapter(final AbstractBehavior adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractBehaviorAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractBehaviorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractBehaviorAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractSignalAdapter createAbstractSignalAdapter(final AbstractSignal adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractSignalAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractSignalAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractSignalAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractEventAdapter createAbstractEventAdapter(final AbstractEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractTimeEventAdapter createAbstractTimeEventAdapter(final AbstractTimeEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractTimeEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractTimeEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractTimeEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractMessageEventAdapter createAbstractMessageEventAdapter(final AbstractMessageEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractMessageEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractMessageEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractMessageEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractSignalEventAdapter createAbstractSignalEventAdapter(final AbstractSignalEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractSignalEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractSignalEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.AbstractSignalEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.TimeExpressionAdapter createTimeExpressionAdapter(final TimeExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.TimeExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.TimeExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.behavior.TimeExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel.SharedPkgAdapter createSharedPkgAdapter(final SharedPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel.SharedPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel.SharedPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel.SharedPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel.GenericPkgAdapter createGenericPkgAdapter(final GenericPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel.GenericPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel.GenericPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.sharedmodel.GenericPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalAnalysisAdapter createOperationalAnalysisAdapter(final OperationalAnalysis adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalAnalysisAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalAnalysisAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalAnalysisAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalScenarioAdapter createOperationalScenarioAdapter(final OperationalScenario adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalScenarioAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalScenarioAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalScenarioAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActivityPkgAdapter createOperationalActivityPkgAdapter(final OperationalActivityPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActivityPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActivityPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActivityPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActivityAdapter createOperationalActivityAdapter(final OperationalActivity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActivityAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActivityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActivityAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalProcessAdapter createOperationalProcessAdapter(final OperationalProcess adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalProcessAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalProcessAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalProcessAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.SwimlaneAdapter createSwimlaneAdapter(final Swimlane adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.SwimlaneAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.SwimlaneAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.SwimlaneAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalCapabilityPkgAdapter createOperationalCapabilityPkgAdapter(final OperationalCapabilityPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalCapabilityPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalCapabilityPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalCapabilityPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalCapabilityAdapter createOperationalCapabilityAdapter(final OperationalCapability adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalCapabilityAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalCapabilityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalCapabilityAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ActivityAllocationAdapter createActivityAllocationAdapter(final ActivityAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ActivityAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ActivityAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ActivityAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RolePkgAdapter createRolePkgAdapter(final RolePkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RolePkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RolePkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RolePkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAdapter createRoleAdapter(final Role adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAssemblyUsageAdapter createRoleAssemblyUsageAdapter(final RoleAssemblyUsage adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAssemblyUsageAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAssemblyUsageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAssemblyUsageAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAllocationAdapter createRoleAllocationAdapter(final RoleAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.RoleAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityPkgAdapter createEntityPkgAdapter(final EntityPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityAdapter createEntityAdapter(final Entity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptPkgAdapter createConceptPkgAdapter(final ConceptPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptAdapter createConceptAdapter(final Concept adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptComplianceAdapter createConceptComplianceAdapter(final ConceptCompliance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptComplianceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptComplianceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ConceptComplianceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ItemInConceptAdapter createItemInConceptAdapter(final ItemInConcept adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ItemInConceptAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ItemInConceptAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.ItemInConceptAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.AbstractConceptItemAdapter createAbstractConceptItemAdapter(final AbstractConceptItem adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.AbstractConceptItemAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.AbstractConceptItemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.AbstractConceptItemAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActorAdapter createOperationalActorAdapter(final OperationalActor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActorAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalActorAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunityOfInterestAdapter createCommunityOfInterestAdapter(final CommunityOfInterest adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunityOfInterestAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunityOfInterestAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunityOfInterestAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunityOfInterestCompositionAdapter createCommunityOfInterestCompositionAdapter(final CommunityOfInterestComposition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunityOfInterestCompositionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunityOfInterestCompositionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunityOfInterestCompositionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OrganisationalUnitAdapter createOrganisationalUnitAdapter(final OrganisationalUnit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OrganisationalUnitAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OrganisationalUnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OrganisationalUnitAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OrganisationalUnitCompositionAdapter createOrganisationalUnitCompositionAdapter(final OrganisationalUnitComposition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OrganisationalUnitCompositionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OrganisationalUnitCompositionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OrganisationalUnitCompositionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.LocationAdapter createLocationAdapter(final Location adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.LocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.LocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.LocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CapabilityConfigurationAdapter createCapabilityConfigurationAdapter(final CapabilityConfiguration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CapabilityConfigurationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CapabilityConfigurationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CapabilityConfigurationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunicationMeanAdapter createCommunicationMeanAdapter(final CommunicationMean adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunicationMeanAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunicationMeanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.CommunicationMeanAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityOperationalCapabilityInvolvementAdapter createEntityOperationalCapabilityInvolvementAdapter(final EntityOperationalCapabilityInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityOperationalCapabilityInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityOperationalCapabilityInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.EntityOperationalCapabilityInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalContextAdapter createOperationalContextAdapter(final OperationalContext adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalContextAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.oa.OperationalContextAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.SequenceMessageAdapter createSequenceMessageAdapter(final SequenceMessage adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.SequenceMessageAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.SequenceMessageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.SequenceMessageAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ScenarioAdapter createScenarioAdapter(final Scenario adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ScenarioAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ScenarioAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ScenarioAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.MessageEndAdapter createMessageEndAdapter(final MessageEnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.MessageEndAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.MessageEndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.MessageEndAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionAdapter createExecutionAdapter(final Execution adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionEndAdapter createExecutionEndAdapter(final ExecutionEnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionEndAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionEndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionEndAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CreationEventAdapter createCreationEventAdapter(final CreationEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CreationEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CreationEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CreationEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.DestructionEventAdapter createDestructionEventAdapter(final DestructionEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.DestructionEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.DestructionEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.DestructionEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionEventAdapter createExecutionEventAdapter(final ExecutionEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ExecutionEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InstanceRoleAdapter createInstanceRoleAdapter(final InstanceRole adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InstanceRoleAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InstanceRoleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InstanceRoleAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractEndAdapter createAbstractEndAdapter(final AbstractEnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractEndAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractEndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractEndAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventAdapter createEventAdapter(final Event adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventReceiptOperationAdapter createEventReceiptOperationAdapter(final EventReceiptOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventReceiptOperationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventReceiptOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventReceiptOperationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventSentOperationAdapter createEventSentOperationAdapter(final EventSentOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventSentOperationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventSentOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.EventSentOperationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.MergeLinkAdapter createMergeLinkAdapter(final MergeLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.MergeLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.MergeLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.MergeLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.RefinementLinkAdapter createRefinementLinkAdapter(final RefinementLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.RefinementLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.RefinementLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.RefinementLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityRealizationAdapter createAbstractCapabilityRealizationAdapter(final AbstractCapabilityRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityAdapter createAbstractCapabilityAdapter(final AbstractCapability adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityExtendAdapter createAbstractCapabilityExtendAdapter(final AbstractCapabilityExtend adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityExtendAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityExtendAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityExtendAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityExtensionPointAdapter createAbstractCapabilityExtensionPointAdapter(final AbstractCapabilityExtensionPoint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityExtensionPointAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityExtensionPointAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityExtensionPointAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityGeneralizationAdapter createAbstractCapabilityGeneralizationAdapter(final AbstractCapabilityGeneralization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityGeneralizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityGeneralizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityGeneralizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityIncludeAdapter createAbstractCapabilityIncludeAdapter(final AbstractCapabilityInclude adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityIncludeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityIncludeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractCapabilityIncludeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionFragmentAdapter createInteractionFragmentAdapter(final InteractionFragment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionFragmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionFragmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionFragmentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionStateAdapter createInteractionStateAdapter(final InteractionState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionUseAdapter createInteractionUseAdapter(final InteractionUse adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionUseAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionUseAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionUseAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CombinedFragmentAdapter createCombinedFragmentAdapter(final CombinedFragment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CombinedFragmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CombinedFragmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CombinedFragmentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.GateAdapter createGateAdapter(final Gate adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.GateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.GateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.GateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionOperandAdapter createInteractionOperandAdapter(final InteractionOperand adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionOperandAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionOperandAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.InteractionOperandAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.TimeLapseAdapter createTimeLapseAdapter(final TimeLapse adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.TimeLapseAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.TimeLapseAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.TimeLapseAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractFragmentAdapter createAbstractFragmentAdapter(final AbstractFragment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractFragmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractFragmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractFragmentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.FragmentEndAdapter createFragmentEndAdapter(final FragmentEnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.FragmentEndAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.FragmentEndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.FragmentEndAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.FunctionalChainAbstractCapabilityInvolvementAdapter createFunctionalChainAbstractCapabilityInvolvementAdapter(final FunctionalChainAbstractCapabilityInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.FunctionalChainAbstractCapabilityInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.FunctionalChainAbstractCapabilityInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.FunctionalChainAbstractCapabilityInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractFunctionAbstractCapabilityInvolvementAdapter createAbstractFunctionAbstractCapabilityInvolvementAdapter(final AbstractFunctionAbstractCapabilityInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractFunctionAbstractCapabilityInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractFunctionAbstractCapabilityInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.AbstractFunctionAbstractCapabilityInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ScenarioRealizationAdapter createScenarioRealizationAdapter(final ScenarioRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ScenarioRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ScenarioRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ScenarioRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.StateFragmentAdapter createStateFragmentAdapter(final StateFragment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.StateFragmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.StateFragmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.StateFragmentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ArmTimerEventAdapter createArmTimerEventAdapter(final ArmTimerEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ArmTimerEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ArmTimerEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ArmTimerEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CancelTimerEventAdapter createCancelTimerEventAdapter(final CancelTimerEvent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CancelTimerEventAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CancelTimerEventAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.CancelTimerEventAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ConstraintDurationAdapter createConstraintDurationAdapter(final ConstraintDuration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ConstraintDurationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ConstraintDurationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.ConstraintDurationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.SequenceMessageValuationAdapter createSequenceMessageValuationAdapter(final SequenceMessageValuation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.SequenceMessageValuationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.SequenceMessageValuationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.interaction.SequenceMessageValuationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.CapellaElementAdapter createCapellaElementAdapter(final CapellaElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.CapellaElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.CapellaElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.CapellaElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamedElementAdapter createNamedElementAdapter(final NamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamedElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.RelationshipAdapter createRelationshipAdapter(final Relationship adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.RelationshipAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.RelationshipAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.RelationshipAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamespaceAdapter createNamespaceAdapter(final Namespace adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamespaceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamespaceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamespaceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamedRelationshipAdapter createNamedRelationshipAdapter(final NamedRelationship adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamedRelationshipAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamedRelationshipAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamedRelationshipAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.StructureAdapter createStructureAdapter(final Structure adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.StructureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.StructureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.StructureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractModellingStructureAdapter createAbstractModellingStructureAdapter(final AbstractModellingStructure adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractModellingStructureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractModellingStructureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractModellingStructureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingBlockAdapter createModellingBlockAdapter(final ModellingBlock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingBlockAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingBlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingBlockAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingArchitectureAdapter createModellingArchitectureAdapter(final ModellingArchitecture adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingArchitectureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingArchitectureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingArchitectureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingArchitecturePkgAdapter createModellingArchitecturePkgAdapter(final ModellingArchitecturePkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingArchitecturePkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingArchitecturePkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ModellingArchitecturePkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TypeAdapter createTypeAdapter(final Type adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TypeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TypedElementAdapter createTypedElementAdapter(final TypedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TypedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TypedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TypedElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TraceAdapter createTraceAdapter(final Trace adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TraceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TraceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.TraceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractAnnotationAdapter createAbstractAnnotationAdapter(final AbstractAnnotation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractAnnotationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractAnnotationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractAnnotationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamingRuleAdapter createNamingRuleAdapter(final NamingRule adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamingRuleAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamingRuleAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.NamingRuleAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ConstraintAdapter createConstraintAdapter(final Constraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ConstraintAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ConstraintAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.KeyValueAdapter createKeyValueAdapter(final KeyValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.KeyValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.KeyValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.KeyValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuseLinkAdapter createReuseLinkAdapter(final ReuseLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuseLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuseLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuseLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuseableStructureAdapter createReuseableStructureAdapter(final ReuseableStructure adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuseableStructureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuseableStructureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuseableStructureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuserStructureAdapter createReuserStructureAdapter(final ReuserStructure adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuserStructureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuserStructureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ReuserStructureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralizableElementAdapter createGeneralizableElementAdapter(final GeneralizableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralizableElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralizableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralizableElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ClassifierAdapter createClassifierAdapter(final Classifier adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ClassifierAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ClassifierAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.ClassifierAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralClassAdapter createGeneralClassAdapter(final GeneralClass adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralClassAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralClassAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralClassAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralizationAdapter createGeneralizationAdapter(final Generalization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.GeneralizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.FeatureAdapter createFeatureAdapter(final Feature adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.FeatureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.FeatureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.FeatureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractExchangeItemPkgAdapter createAbstractExchangeItemPkgAdapter(final AbstractExchangeItemPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractExchangeItemPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractExchangeItemPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractExchangeItemPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AllocationAdapter createAllocationAdapter(final Allocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolvementAdapter createInvolvementAdapter(final Involvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolverElementAdapter createInvolverElementAdapter(final InvolverElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolverElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolverElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolverElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolvedElementAdapter createInvolvedElementAdapter(final InvolvedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolvedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolvedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.InvolvedElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractPropertyValueAdapter createAbstractPropertyValueAdapter(final AbstractPropertyValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractPropertyValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractPropertyValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractPropertyValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.StringPropertyValueAdapter createStringPropertyValueAdapter(final StringPropertyValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.StringPropertyValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.StringPropertyValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.StringPropertyValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.IntegerPropertyValueAdapter createIntegerPropertyValueAdapter(final IntegerPropertyValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.IntegerPropertyValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.IntegerPropertyValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.IntegerPropertyValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.BooleanPropertyValueAdapter createBooleanPropertyValueAdapter(final BooleanPropertyValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.BooleanPropertyValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.BooleanPropertyValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.BooleanPropertyValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.FloatPropertyValueAdapter createFloatPropertyValueAdapter(final FloatPropertyValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.FloatPropertyValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.FloatPropertyValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.FloatPropertyValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyValueAdapter createEnumerationPropertyValueAdapter(final EnumerationPropertyValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyTypeAdapter createEnumerationPropertyTypeAdapter(final EnumerationPropertyType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyTypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyTypeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyLiteralAdapter createEnumerationPropertyLiteralAdapter(final EnumerationPropertyLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyLiteralAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.EnumerationPropertyLiteralAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.PropertyValueGroupAdapter createPropertyValueGroupAdapter(final PropertyValueGroup adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.PropertyValueGroupAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.PropertyValueGroupAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.PropertyValueGroupAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.PropertyValuePkgAdapter createPropertyValuePkgAdapter(final PropertyValuePkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.PropertyValuePkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.PropertyValuePkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.PropertyValuePkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractDependenciesPkgAdapter createAbstractDependenciesPkgAdapter(final AbstractDependenciesPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractDependenciesPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractDependenciesPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellacore.AbstractDependenciesPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationItemAdapter createCommunicationItemAdapter(final CommunicationItem adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationItemAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationItemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationItemAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.ExceptionAdapter createExceptionAdapter(final org.polarsys.capella.core.data.information.communication.Exception adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.ExceptionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.ExceptionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.ExceptionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageAdapter createMessageAdapter(final Message adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageReferenceAdapter createMessageReferenceAdapter(final MessageReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageReferencePkgAdapter createMessageReferencePkgAdapter(final MessageReferencePkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageReferencePkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageReferencePkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.MessageReferencePkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.SignalAdapter createSignalAdapter(final Signal adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.SignalAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.SignalAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.SignalAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.SignalInstanceAdapter createSignalInstanceAdapter(final SignalInstance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.SignalInstanceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.SignalInstanceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.SignalInstanceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkAdapter createCommunicationLinkAdapter(final CommunicationLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkExchangerAdapter createCommunicationLinkExchangerAdapter(final CommunicationLinkExchanger adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkExchangerAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkExchangerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkExchangerAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkAllocationAdapter createCommunicationLinkAllocationAdapter(final CommunicationLinkAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.communication.CommunicationLinkAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalArchitecturePkgAdapter createLogicalArchitecturePkgAdapter(final LogicalArchitecturePkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalArchitecturePkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalArchitecturePkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalArchitecturePkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalArchitectureAdapter createLogicalArchitectureAdapter(final LogicalArchitecture adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalArchitectureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalArchitectureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalArchitectureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalFunctionAdapter createLogicalFunctionAdapter(final LogicalFunction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalFunctionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalFunctionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalFunctionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalFunctionPkgAdapter createLogicalFunctionPkgAdapter(final LogicalFunctionPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalFunctionPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalFunctionPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalFunctionPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentAdapter createLogicalComponentAdapter(final LogicalComponent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentPkgAdapter createLogicalComponentPkgAdapter(final LogicalComponentPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalComponentPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.CapabilityRealizationAdapter createCapabilityRealizationAdapter(final CapabilityRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.CapabilityRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.CapabilityRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.CapabilityRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.CapabilityRealizationPkgAdapter createCapabilityRealizationPkgAdapter(final CapabilityRealizationPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.CapabilityRealizationPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.CapabilityRealizationPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.CapabilityRealizationPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemAnalysisRealizationAdapter createSystemAnalysisRealizationAdapter(final SystemAnalysisRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemAnalysisRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemAnalysisRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemAnalysisRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemRealizationAdapter createSystemRealizationAdapter(final SystemRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.ContextInterfaceRealizationAdapter createContextInterfaceRealizationAdapter(final ContextInterfaceRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.ContextInterfaceRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.ContextInterfaceRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.ContextInterfaceRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalActorPkgAdapter createLogicalActorPkgAdapter(final LogicalActorPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalActorPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalActorPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalActorPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalActorAdapter createLogicalActorAdapter(final LogicalActor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalActorAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalActorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalActorAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemActorRealizationAdapter createSystemActorRealizationAdapter(final SystemActorRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemActorRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemActorRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.SystemActorRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalContextAdapter createLogicalContextAdapter(final LogicalContext adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalContextAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.la.LogicalContextAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.ProjectAdapter createProjectAdapter(final Project adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.ProjectAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.ProjectAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.ProjectAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.FolderAdapter createFolderAdapter(final Folder adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.FolderAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.FolderAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.FolderAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.ModelRootAdapter createModelRootAdapter(final ModelRoot adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.ModelRootAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.ModelRootAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.ModelRootAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.SystemEngineeringAdapter createSystemEngineeringAdapter(final SystemEngineering adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.SystemEngineeringAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.SystemEngineeringAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.SystemEngineeringAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.SystemEngineeringPkgAdapter createSystemEngineeringPkgAdapter(final SystemEngineeringPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.SystemEngineeringPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.SystemEngineeringPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.SystemEngineeringPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.LibraryAdapter createLibraryAdapter(final Library adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.LibraryAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.LibraryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.capellamodeller.LibraryAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractInstanceAdapter createAbstractInstanceAdapter(final AbstractInstance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractInstanceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractInstanceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractInstanceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AssociationPkgAdapter createAssociationPkgAdapter(final AssociationPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AssociationPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AssociationPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AssociationPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AssociationAdapter createAssociationAdapter(final Association adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AssociationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AssociationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AssociationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ClassAdapter createClassAdapter(final org.polarsys.capella.core.data.information.Class adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ClassAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ClassAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ClassAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionAdapter createCollectionAdapter(final Collection adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractCollectionValueAdapter createAbstractCollectionValueAdapter(final AbstractCollectionValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractCollectionValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractCollectionValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractCollectionValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionValueAdapter createCollectionValueAdapter(final CollectionValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionValueReferenceAdapter createCollectionValueReferenceAdapter(final CollectionValueReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionValueReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionValueReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.CollectionValueReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.DataPkgAdapter createDataPkgAdapter(final DataPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.DataPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.DataPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.DataPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.DomainElementAdapter createDomainElementAdapter(final DomainElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.DomainElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.DomainElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.DomainElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.KeyPartAdapter createKeyPartAdapter(final KeyPart adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.KeyPartAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.KeyPartAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.KeyPartAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.MultiplicityElementAdapter createMultiplicityElementAdapter(final MultiplicityElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.MultiplicityElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.MultiplicityElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.MultiplicityElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.OperationAdapter createOperationAdapter(final Operation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.OperationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.OperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.OperationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.OperationAllocationAdapter createOperationAllocationAdapter(final OperationAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.OperationAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.OperationAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.OperationAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ParameterAdapter createParameterAdapter(final Parameter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ParameterAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ParameterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ParameterAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PropertyAdapter createPropertyAdapter(final Property adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PropertyAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PropertyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PropertyAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ServiceAdapter createServiceAdapter(final Service adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ServiceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ServiceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ServiceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnionAdapter createUnionAdapter(final Union adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnionPropertyAdapter createUnionPropertyAdapter(final UnionProperty adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnionPropertyAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnionPropertyAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnionPropertyAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnitAdapter createUnitAdapter(final Unit adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnitAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnitAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.UnitAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PartitionableElementAdapter createPartitionableElementAdapter(final PartitionableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PartitionableElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PartitionableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PartitionableElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PartitionAdapter createPartitionAdapter(final Partition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PartitionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PartitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PartitionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortAdapter createPortAdapter(final Port adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortRealizationAdapter createPortRealizationAdapter(final PortRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortAllocationAdapter createPortAllocationAdapter(final PortAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.PortAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemAdapter createExchangeItemAdapter(final ExchangeItem adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemElementAdapter createExchangeItemElementAdapter(final ExchangeItemElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemInstanceAdapter createExchangeItemInstanceAdapter(final ExchangeItemInstance adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemInstanceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemInstanceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemInstanceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.InformationRealizationAdapter createInformationRealizationAdapter(final InformationRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.InformationRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.InformationRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.InformationRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemRealizationAdapter createExchangeItemRealizationAdapter(final ExchangeItemRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.ExchangeItemRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractEventOperationAdapter createAbstractEventOperationAdapter(final AbstractEventOperation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractEventOperationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractEventOperationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.AbstractEventOperationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.DataTypeAdapter createDataTypeAdapter(final DataType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.DataTypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.DataTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.DataTypeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.BooleanTypeAdapter createBooleanTypeAdapter(final BooleanType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.BooleanTypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.BooleanTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.BooleanTypeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.EnumerationAdapter createEnumerationAdapter(final Enumeration adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.EnumerationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.EnumerationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.EnumerationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.StringTypeAdapter createStringTypeAdapter(final StringType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.StringTypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.StringTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.StringTypeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.NumericTypeAdapter createNumericTypeAdapter(final NumericType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.NumericTypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.NumericTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.NumericTypeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.PhysicalQuantityAdapter createPhysicalQuantityAdapter(final PhysicalQuantity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.PhysicalQuantityAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.PhysicalQuantityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datatype.PhysicalQuantityAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter createDataValueAdapter(final DataValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueContainerAdapter createDataValueContainerAdapter(final DataValueContainer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueContainerAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueContainerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.DataValueContainerAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractBooleanValueAdapter createAbstractBooleanValueAdapter(final AbstractBooleanValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractBooleanValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractBooleanValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractBooleanValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralBooleanValueAdapter createLiteralBooleanValueAdapter(final LiteralBooleanValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralBooleanValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralBooleanValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralBooleanValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.BooleanReferenceAdapter createBooleanReferenceAdapter(final BooleanReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.BooleanReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.BooleanReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.BooleanReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractEnumerationValueAdapter createAbstractEnumerationValueAdapter(final AbstractEnumerationValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractEnumerationValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractEnumerationValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractEnumerationValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.EnumerationLiteralAdapter createEnumerationLiteralAdapter(final EnumerationLiteral adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.EnumerationLiteralAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.EnumerationLiteralAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.EnumerationLiteralAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.EnumerationReferenceAdapter createEnumerationReferenceAdapter(final EnumerationReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.EnumerationReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.EnumerationReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.EnumerationReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractStringValueAdapter createAbstractStringValueAdapter(final AbstractStringValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractStringValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractStringValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractStringValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralStringValueAdapter createLiteralStringValueAdapter(final LiteralStringValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralStringValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralStringValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralStringValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.StringReferenceAdapter createStringReferenceAdapter(final StringReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.StringReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.StringReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.StringReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter createNumericValueAdapter(final NumericValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralNumericValueAdapter createLiteralNumericValueAdapter(final LiteralNumericValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralNumericValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralNumericValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.LiteralNumericValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericReferenceAdapter createNumericReferenceAdapter(final NumericReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.NumericReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractComplexValueAdapter createAbstractComplexValueAdapter(final AbstractComplexValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractComplexValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractComplexValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractComplexValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ComplexValueAdapter createComplexValueAdapter(final ComplexValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ComplexValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ComplexValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ComplexValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ComplexValueReferenceAdapter createComplexValueReferenceAdapter(final ComplexValueReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ComplexValueReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ComplexValueReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ComplexValueReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ValuePartAdapter createValuePartAdapter(final ValuePart adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ValuePartAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ValuePartAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.ValuePartAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractExpressionValueAdapter createAbstractExpressionValueAdapter(final AbstractExpressionValue adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractExpressionValueAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractExpressionValueAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.AbstractExpressionValueAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.BinaryExpressionAdapter createBinaryExpressionAdapter(final BinaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.BinaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.BinaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.BinaryExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.UnaryExpressionAdapter createUnaryExpressionAdapter(final UnaryExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.UnaryExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.UnaryExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.UnaryExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.OpaqueExpressionAdapter createOpaqueExpressionAdapter(final OpaqueExpression adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.OpaqueExpressionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.OpaqueExpressionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.information.datavalue.OpaqueExpressionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockArchitecturePkgAdapter createBlockArchitecturePkgAdapter(final BlockArchitecturePkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockArchitecturePkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockArchitecturePkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockArchitecturePkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockArchitectureAdapter createBlockArchitectureAdapter(final BlockArchitecture adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockArchitectureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockArchitectureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockArchitectureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockAdapter createBlockAdapter(final Block adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.BlockAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentArchitectureAdapter createComponentArchitectureAdapter(final ComponentArchitecture adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentArchitectureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentArchitectureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentArchitectureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentAdapter createComponentAdapter(final Component adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractActorAdapter createAbstractActorAdapter(final AbstractActor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractActorAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractActorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractActorAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PartAdapter createPartAdapter(final Part adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PartAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PartAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PartAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ArchitectureAllocationAdapter createArchitectureAllocationAdapter(final ArchitectureAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ArchitectureAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ArchitectureAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ArchitectureAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentAllocationAdapter createComponentAllocationAdapter(final ComponentAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.SystemComponentAdapter createSystemComponentAdapter(final SystemComponent adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.SystemComponentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.SystemComponentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.SystemComponentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfacePkgAdapter createInterfacePkgAdapter(final InterfacePkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfacePkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfacePkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfacePkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAdapter createInterfaceAdapter(final Interface adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceImplementationAdapter createInterfaceImplementationAdapter(final InterfaceImplementation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceImplementationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceImplementationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceImplementationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceUseAdapter createInterfaceUseAdapter(final InterfaceUse adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceUseAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceUseAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceUseAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ProvidedInterfaceLinkAdapter createProvidedInterfaceLinkAdapter(final ProvidedInterfaceLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ProvidedInterfaceLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ProvidedInterfaceLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ProvidedInterfaceLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.RequiredInterfaceLinkAdapter createRequiredInterfaceLinkAdapter(final RequiredInterfaceLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.RequiredInterfaceLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.RequiredInterfaceLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.RequiredInterfaceLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAllocationAdapter createInterfaceAllocationAdapter(final InterfaceAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAllocatorAdapter createInterfaceAllocatorAdapter(final InterfaceAllocator adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAllocatorAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAllocatorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.InterfaceAllocatorAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ActorCapabilityRealizationInvolvementAdapter createActorCapabilityRealizationInvolvementAdapter(final ActorCapabilityRealizationInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ActorCapabilityRealizationInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ActorCapabilityRealizationInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ActorCapabilityRealizationInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvementAdapter createSystemComponentCapabilityRealizationInvolvementAdapter(final SystemComponentCapabilityRealizationInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.SystemComponentCapabilityRealizationInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentContextAdapter createComponentContextAdapter(final ComponentContext adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentContextAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ComponentContextAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ExchangeItemAllocationAdapter createExchangeItemAllocationAdapter(final ExchangeItemAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ExchangeItemAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ExchangeItemAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.ExchangeItemAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.DeployableElementAdapter createDeployableElementAdapter(final DeployableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.DeployableElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.DeployableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.DeployableElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.DeploymentTargetAdapter createDeploymentTargetAdapter(final DeploymentTarget adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.DeploymentTargetAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.DeploymentTargetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.DeploymentTargetAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractDeploymentLinkAdapter createAbstractDeploymentLinkAdapter(final AbstractDeploymentLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractDeploymentLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractDeploymentLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractDeploymentLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPathInvolvedElementAdapter createAbstractPathInvolvedElementAdapter(final AbstractPathInvolvedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPathInvolvedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPathInvolvedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPathInvolvedElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalArtifactAdapter createAbstractPhysicalArtifactAdapter(final AbstractPhysicalArtifact adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalArtifactAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalArtifactAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalArtifactAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalLinkEndAdapter createAbstractPhysicalLinkEndAdapter(final AbstractPhysicalLinkEnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalLinkEndAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalLinkEndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalLinkEndAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalPathLinkAdapter createAbstractPhysicalPathLinkAdapter(final AbstractPhysicalPathLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalPathLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalPathLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.AbstractPhysicalPathLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkAdapter createPhysicalLinkAdapter(final PhysicalLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkCategoryAdapter createPhysicalLinkCategoryAdapter(final PhysicalLinkCategory adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkCategoryAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkCategoryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkCategoryAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkEndAdapter createPhysicalLinkEndAdapter(final PhysicalLinkEnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkEndAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkEndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkEndAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkRealizationAdapter createPhysicalLinkRealizationAdapter(final PhysicalLinkRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalLinkRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathAdapter createPhysicalPathAdapter(final PhysicalPath adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathInvolvementAdapter createPhysicalPathInvolvementAdapter(final PhysicalPathInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathReferenceAdapter createPhysicalPathReferenceAdapter(final PhysicalPathReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathRealizationAdapter createPhysicalPathRealizationAdapter(final PhysicalPathRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPathRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPortAdapter createPhysicalPortAdapter(final PhysicalPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPortAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPortRealizationAdapter createPhysicalPortRealizationAdapter(final PhysicalPortRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPortRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPortRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.cs.PhysicalPortRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ModelElementAdapter createModelElementAdapter(final ModelElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ModelElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ModelElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ModelElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractRelationshipAdapter createAbstractRelationshipAdapter(final AbstractRelationship adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractRelationshipAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractRelationshipAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractRelationshipAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractNamedElementAdapter createAbstractNamedElementAdapter(final AbstractNamedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractNamedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractNamedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractNamedElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.InformationsExchangerAdapter createInformationsExchangerAdapter(final InformationsExchanger adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.InformationsExchangerAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.InformationsExchangerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.InformationsExchangerAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.TraceableElementAdapter createTraceableElementAdapter(final TraceableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.TraceableElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.TraceableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.TraceableElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.FinalizableElementAdapter createFinalizableElementAdapter(final FinalizableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.FinalizableElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.FinalizableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.FinalizableElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.PublishableElementAdapter createPublishableElementAdapter(final PublishableElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.PublishableElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.PublishableElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.PublishableElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypeAdapter createAbstractTypeAdapter(final AbstractType adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypedElementAdapter createAbstractTypedElementAdapter(final AbstractTypedElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypedElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypedElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTypedElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTraceAdapter createAbstractTraceAdapter(final AbstractTrace adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTraceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTraceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractTraceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractConstraintAdapter createAbstractConstraintAdapter(final AbstractConstraint adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractConstraintAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractConstraintAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractConstraintAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter createValueSpecificationAdapter(final ValueSpecification adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.ValueSpecificationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractParameterAdapter createAbstractParameterAdapter(final AbstractParameter adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractParameterAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractParameterAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractParameterAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractParameterSetAdapter createAbstractParameterSetAdapter(final AbstractParameterSet adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractParameterSetAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractParameterSetAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractParameterSetAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractInformationFlowAdapter createAbstractInformationFlowAdapter(final AbstractInformationFlow adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractInformationFlowAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractInformationFlowAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractInformationFlowAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractExchangeItemAdapter createAbstractExchangeItemAdapter(final AbstractExchangeItem adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractExchangeItemAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractExchangeItemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.AbstractExchangeItemAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.IStateAdapter createIStateAdapter(final IState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.IStateAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.IStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.modellingcore.IStateAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemAnalysisAdapter createSystemAnalysisAdapter(final SystemAnalysis adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemAnalysisAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemAnalysisAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemAnalysisAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemAdapter createSystemAdapter(final org.polarsys.capella.core.data.ctx.System adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemFunctionAdapter createSystemFunctionAdapter(final SystemFunction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemFunctionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemFunctionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemFunctionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemFunctionPkgAdapter createSystemFunctionPkgAdapter(final SystemFunctionPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemFunctionPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemFunctionPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemFunctionPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCommunicationHookAdapter createSystemCommunicationHookAdapter(final SystemCommunicationHook adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCommunicationHookAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCommunicationHookAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCommunicationHookAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCommunicationAdapter createSystemCommunicationAdapter(final SystemCommunication adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCommunicationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCommunicationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCommunicationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorAdapter createActorAdapter(final Actor adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorCapabilityInvolvementAdapter createActorCapabilityInvolvementAdapter(final ActorCapabilityInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorCapabilityInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorCapabilityInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorCapabilityInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorMissionInvolvementAdapter createActorMissionInvolvementAdapter(final ActorMissionInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorMissionInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorMissionInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorMissionInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorPkgAdapter createActorPkgAdapter(final ActorPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.ActorPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.MissionAdapter createMissionAdapter(final Mission adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.MissionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.MissionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.MissionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.MissionPkgAdapter createMissionPkgAdapter(final MissionPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.MissionPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.MissionPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.MissionPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemMissionInvolvementAdapter createSystemMissionInvolvementAdapter(final SystemMissionInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemMissionInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemMissionInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemMissionInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityAdapter createCapabilityAdapter(final Capability adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityExploitationAdapter createCapabilityExploitationAdapter(final CapabilityExploitation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityExploitationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityExploitationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityExploitationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityPkgAdapter createCapabilityPkgAdapter(final CapabilityPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.CapabilityPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCapabilityInvolvementAdapter createSystemCapabilityInvolvementAdapter(final SystemCapabilityInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCapabilityInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCapabilityInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemCapabilityInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalActorRealizationAdapter createOperationalActorRealizationAdapter(final OperationalActorRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalActorRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalActorRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalActorRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalAnalysisRealizationAdapter createOperationalAnalysisRealizationAdapter(final OperationalAnalysisRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalAnalysisRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalAnalysisRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalAnalysisRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalEntityRealizationAdapter createOperationalEntityRealizationAdapter(final OperationalEntityRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalEntityRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalEntityRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.OperationalEntityRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemContextAdapter createSystemContextAdapter(final SystemContext adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemContextAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemContextAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.ctx.SystemContextAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementsPkgAdapter createRequirementsPkgAdapter(final RequirementsPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementsPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementsPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementsPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementsTraceAdapter createRequirementsTraceAdapter(final RequirementsTrace adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementsTraceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementsTraceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementsTraceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementAdapter createRequirementAdapter(final Requirement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.RequirementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemFunctionalInterfaceRequirementAdapter createSystemFunctionalInterfaceRequirementAdapter(final SystemFunctionalInterfaceRequirement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemFunctionalInterfaceRequirementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemFunctionalInterfaceRequirementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemFunctionalInterfaceRequirementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemFunctionalRequirementAdapter createSystemFunctionalRequirementAdapter(final SystemFunctionalRequirement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemFunctionalRequirementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemFunctionalRequirementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemFunctionalRequirementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemNonFunctionalInterfaceRequirementAdapter createSystemNonFunctionalInterfaceRequirementAdapter(final SystemNonFunctionalInterfaceRequirement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemNonFunctionalInterfaceRequirementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemNonFunctionalInterfaceRequirementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemNonFunctionalInterfaceRequirementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemNonFunctionalRequirementAdapter createSystemNonFunctionalRequirementAdapter(final SystemNonFunctionalRequirement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemNonFunctionalRequirementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemNonFunctionalRequirementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemNonFunctionalRequirementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemUserRequirementAdapter createSystemUserRequirementAdapter(final SystemUserRequirement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemUserRequirementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemUserRequirementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.requirement.SystemUserRequirementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalArchitectureAdapter createAbstractFunctionalArchitectureAdapter(final AbstractFunctionalArchitecture adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalArchitectureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalArchitectureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalArchitectureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalStructureAdapter createAbstractFunctionalStructureAdapter(final AbstractFunctionalStructure adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalStructureAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalStructureAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalStructureAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalBlockAdapter createAbstractFunctionalBlockAdapter(final AbstractFunctionalBlock adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalBlockAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalBlockAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalBlockAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionPkgAdapter createFunctionPkgAdapter(final FunctionPkg adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionPkgAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionPkgAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionPkgAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionSpecificationAdapter createFunctionSpecificationAdapter(final FunctionSpecification adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionSpecificationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionSpecificationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionSpecificationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeCategoryAdapter createExchangeCategoryAdapter(final ExchangeCategory adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeCategoryAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeCategoryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeCategoryAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeLinkAdapter createExchangeLinkAdapter(final ExchangeLink adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeLinkAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeLinkAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeLinkAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeContainmentAdapter createExchangeContainmentAdapter(final ExchangeContainment adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeContainmentAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeContainmentAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeContainmentAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeSpecificationAdapter createExchangeSpecificationAdapter(final ExchangeSpecification adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeSpecificationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeSpecificationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeSpecificationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeSpecificationAdapter createFunctionalExchangeSpecificationAdapter(final FunctionalExchangeSpecification adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeSpecificationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeSpecificationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeSpecificationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainAdapter createFunctionalChainAdapter(final FunctionalChain adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalChainContainerAdapter createAbstractFunctionalChainContainerAdapter(final AbstractFunctionalChainContainer adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalChainContainerAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalChainContainerAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionalChainContainerAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainInvolvementAdapter createFunctionalChainInvolvementAdapter(final FunctionalChainInvolvement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainInvolvementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainInvolvementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainInvolvementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainReferenceAdapter createFunctionalChainReferenceAdapter(final FunctionalChainReference adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainReferenceAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainReferenceAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainReferenceAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionInputPortAdapter createFunctionInputPortAdapter(final FunctionInputPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionInputPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionInputPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionInputPortAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionOutputPortAdapter createFunctionOutputPortAdapter(final FunctionOutputPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionOutputPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionOutputPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionOutputPortAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionAllocationAdapter createAbstractFunctionAllocationAdapter(final AbstractFunctionAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentFunctionalAllocationAdapter createComponentFunctionalAllocationAdapter(final ComponentFunctionalAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentFunctionalAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentFunctionalAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentFunctionalAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainRealizationAdapter createFunctionalChainRealizationAdapter(final FunctionalChainRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalChainRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeSpecificationRealizationAdapter createExchangeSpecificationRealizationAdapter(final ExchangeSpecificationRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeSpecificationRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeSpecificationRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ExchangeSpecificationRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeRealizationAdapter createFunctionalExchangeRealizationAdapter(final FunctionalExchangeRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionRealizationAdapter createFunctionRealizationAdapter(final FunctionRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeAdapter createFunctionalExchangeAdapter(final FunctionalExchange adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionalExchangeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionAdapter createAbstractFunctionAdapter(final AbstractFunction adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.AbstractFunctionAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionPortAdapter createFunctionPortAdapter(final FunctionPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.FunctionPortAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAdapter createComponentExchangeAdapter(final ComponentExchange adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAllocationAdapter createComponentExchangeAllocationAdapter(final ComponentExchangeAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAllocatorAdapter createComponentExchangeAllocatorAdapter(final ComponentExchangeAllocator adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAllocatorAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAllocatorAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeAllocatorAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeCategoryAdapter createComponentExchangeCategoryAdapter(final ComponentExchangeCategory adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeCategoryAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeCategoryAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeCategoryAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeEndAdapter createComponentExchangeEndAdapter(final ComponentExchangeEnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeEndAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeEndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeEndAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocationAdapter createComponentExchangeFunctionalExchangeAllocationAdapter(final ComponentExchangeFunctionalExchangeAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeFunctionalExchangeAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeRealizationAdapter createComponentExchangeRealizationAdapter(final ComponentExchangeRealization adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeRealizationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeRealizationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentExchangeRealizationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAdapter createComponentPortAdapter(final ComponentPort adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAllocationAdapter createComponentPortAllocationAdapter(final ComponentPortAllocation adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAllocationAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAllocationAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAllocationAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAllocationEndAdapter createComponentPortAllocationEndAdapter(final ComponentPortAllocationEnd adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAllocationEndAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAllocationEndAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.fa.ComponentPortAllocationEndAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ElementAdapter createElementAdapter(final Element adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ExtensibleElementAdapter createExtensibleElementAdapter(final ExtensibleElement adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ExtensibleElementAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ExtensibleElementAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ExtensibleElementAdapter) adapter;
    }
  }
  
  public org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ElementExtensionAdapter createElementExtensionAdapter(final ElementExtension adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ElementExtensionAdapter) adapter;
    else {
    	adapter = new org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ElementExtensionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.gemoc.scenario.xdsml.functionscenario.adapters.functionscenariomt.emde.ElementExtensionAdapter) adapter;
    }
  }
}
