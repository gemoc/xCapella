/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.BehaviorPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.impl.BehaviorPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.AbstractCapabilityPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.AbstractState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.AbstractStateRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapabilityRealizationInvolvedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapabilityRealizationInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapellacommonFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapellacommonPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.ChangeEvent;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.ChangeEventKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.ChoicePseudoState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.DeepHistoryPseudoState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.EntryPointPseudoState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.ExitPointPseudoState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.FinalState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.ForkPseudoState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.GenericTrace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.InitialPseudoState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.JoinPseudoState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.JustificationLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.Mode;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.Pseudostate;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.Region;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.ShallowHistoryPseudoState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.State;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.StateEvent;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.StateEventRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.StateMachine;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.StateTransition;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.StateTransitionRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.TerminatePseudoState;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.TimeEvent;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.TimeEventKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.TransfoLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.TransitionKind;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellacorePackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.impl.CapellacorePackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.CapellamodellerPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.impl.CapellamodellerPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.CsPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.impl.CsPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.impl.CtxPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.EmdePackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.EmdePackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.impl.EpbsPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.impl.FaPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.impl.CommunicationPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.DatatypePackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.impl.DatatypePackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.impl.DatavaluePackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.impl.InformationPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.impl.InteractionPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LaPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.impl.LaPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModellingcorePackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.impl.ModellingcorePackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.impl.OaPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.DeploymentPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.impl.DeploymentPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.impl.PaPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.requirement.RequirementPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.requirement.impl.RequirementPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.sharedmodel.SharedmodelPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.sharedmodel.impl.SharedmodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapellacommonPackageImpl extends EPackageImpl implements CapellacommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCapabilityPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transfoLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justificationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityRealizationInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityRealizationInvolvedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudostateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialPseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinPseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkPseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choicePseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminatePseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStateRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shallowHistoryPseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deepHistoryPseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointPseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exitPointPseudoStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEventRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeEventKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeEventKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapellacommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapellacommonPackageImpl() {
		super(eNS_URI, CapellacommonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CapellacommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CapellacommonPackage init() {
		if (isInited) return (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);

		// Obtain or create and register package
		CapellacommonPackageImpl theCapellacommonPackage = (CapellacommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CapellacommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CapellacommonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SharedmodelPackageImpl theSharedmodelPackage = (SharedmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) instanceof SharedmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) : SharedmodelPackage.eINSTANCE);
		EmdePackageImpl theEmdePackage = (EmdePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) instanceof EmdePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) : EmdePackage.eINSTANCE);
		OaPackageImpl theOaPackage = (OaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) instanceof OaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) : OaPackage.eINSTANCE);
		CapellacorePackageImpl theCapellacorePackage = (CapellacorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI) instanceof CapellacorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI) : CapellacorePackage.eINSTANCE);
		PaPackageImpl thePaPackage = (PaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI) instanceof PaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI) : PaPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		CapellamodellerPackageImpl theCapellamodellerPackage = (CapellamodellerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellamodellerPackage.eNS_URI) instanceof CapellamodellerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellamodellerPackage.eNS_URI) : CapellamodellerPackage.eINSTANCE);
		CsPackageImpl theCsPackage = (CsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI) instanceof CsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI) : CsPackage.eINSTANCE);
		ModellingcorePackageImpl theModellingcorePackage = (ModellingcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI) instanceof ModellingcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI) : ModellingcorePackage.eINSTANCE);
		CtxPackageImpl theCtxPackage = (CtxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI) instanceof CtxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI) : CtxPackage.eINSTANCE);
		FaPackageImpl theFaPackage = (FaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI) instanceof FaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI) : FaPackage.eINSTANCE);
		LaPackageImpl theLaPackage = (LaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI) instanceof LaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI) : LaPackage.eINSTANCE);
		EpbsPackageImpl theEpbsPackage = (EpbsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI) instanceof EpbsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI) : EpbsPackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) : DatavaluePackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		theCapellacommonPackage.createPackageContents();
		theSharedmodelPackage.createPackageContents();
		theEmdePackage.createPackageContents();
		theOaPackage.createPackageContents();
		theCapellacorePackage.createPackageContents();
		thePaPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theCapellamodellerPackage.createPackageContents();
		theCsPackage.createPackageContents();
		theModellingcorePackage.createPackageContents();
		theCtxPackage.createPackageContents();
		theFaPackage.createPackageContents();
		theLaPackage.createPackageContents();
		theEpbsPackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theDatavaluePackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		theCapellacommonPackage.initializePackageContents();
		theSharedmodelPackage.initializePackageContents();
		theEmdePackage.initializePackageContents();
		theOaPackage.initializePackageContents();
		theCapellacorePackage.initializePackageContents();
		thePaPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theCapellamodellerPackage.initializePackageContents();
		theCsPackage.initializePackageContents();
		theModellingcorePackage.initializePackageContents();
		theCtxPackage.initializePackageContents();
		theFaPackage.initializePackageContents();
		theLaPackage.initializePackageContents();
		theEpbsPackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theDatavaluePackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCapellacommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CapellacommonPackage.eNS_URI, theCapellacommonPackage);
		return theCapellacommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCapabilityPkg() {
		return abstractCapabilityPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericTrace() {
		return genericTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericTrace_KeyValuePairs() {
		return (EReference)genericTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericTrace_Source() {
		return (EReference)genericTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericTrace_Target() {
		return (EReference)genericTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransfoLink() {
		return transfoLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJustificationLink() {
		return justificationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityRealizationInvolvement() {
		return capabilityRealizationInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityRealizationInvolvement_InvolvedCapabilityRealizationInvolvedElement() {
		return (EReference)capabilityRealizationInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityRealizationInvolvedElement() {
		return capabilityRealizationInvolvedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityRealizationInvolvedElement_InvolvingCapabilityRealizationInvolvements() {
		return (EReference)capabilityRealizationInvolvedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_OwnedRegions() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_OwnedConnectionPoints() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_OwnedStates() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_OwnedTransitions() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_InvolvedStates() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OwnedRegions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_OwnedConnectionPoints() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_AvailableAbstractFunctions() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_AvailableFunctionalChains() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_AvailableAbstractCapabilities() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Entry() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DoActivity() {
		return (EReference)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Exit() {
		return (EReference)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StateInvariant() {
		return (EReference)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractState() {
		return abstractStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_OwnedAbstractStateRealizations() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_RealizedAbstractStates() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_RealizingAbstractStates() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_Outgoing() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_Incoming() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractState_InvolverRegions() {
		return (EReference)abstractStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateTransition() {
		return stateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateTransition_Kind() {
		return (EAttribute)stateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateTransition_TriggerDescription() {
		return (EAttribute)stateTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Guard() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Source() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Target() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Effect() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_Triggers() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_OwnedStateTransitionRealizations() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_RealizedStateTransitions() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_RealizingStateTransitions() {
		return (EReference)stateTransitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudostate() {
		return pseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialPseudoState() {
		return initialPseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinPseudoState() {
		return joinPseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkPseudoState() {
		return forkPseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoicePseudoState() {
		return choicePseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminatePseudoState() {
		return terminatePseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStateRealization() {
		return abstractStateRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStateRealization_RealizedAbstractState() {
		return (EReference)abstractStateRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStateRealization_RealizingAbstractState() {
		return (EReference)abstractStateRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateTransitionRealization() {
		return stateTransitionRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransitionRealization_RealizedStateTransition() {
		return (EReference)stateTransitionRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransitionRealization_RealizingStateTransition() {
		return (EReference)stateTransitionRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShallowHistoryPseudoState() {
		return shallowHistoryPseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeepHistoryPseudoState() {
		return deepHistoryPseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPointPseudoState() {
		return entryPointPseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExitPointPseudoState() {
		return exitPointPseudoStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateEventRealization() {
		return stateEventRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateEventRealization_RealizedEvent() {
		return (EReference)stateEventRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateEventRealization_RealizingEvent() {
		return (EReference)stateEventRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateEvent() {
		return stateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateEvent_Expression() {
		return (EReference)stateEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateEvent_OwnedStateEventRealizations() {
		return (EReference)stateEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeEvent() {
		return changeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeEvent_Kind() {
		return (EAttribute)changeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEvent() {
		return timeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEvent_Kind() {
		return (EAttribute)timeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionKind() {
		return transitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeEventKind() {
		return timeEventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeEventKind() {
		return changeEventKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellacommonFactory getCapellacommonFactory() {
		return (CapellacommonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractCapabilityPkgEClass = createEClass(ABSTRACT_CAPABILITY_PKG);

		genericTraceEClass = createEClass(GENERIC_TRACE);
		createEReference(genericTraceEClass, GENERIC_TRACE__KEY_VALUE_PAIRS);
		createEReference(genericTraceEClass, GENERIC_TRACE__SOURCE);
		createEReference(genericTraceEClass, GENERIC_TRACE__TARGET);

		transfoLinkEClass = createEClass(TRANSFO_LINK);

		justificationLinkEClass = createEClass(JUSTIFICATION_LINK);

		capabilityRealizationInvolvementEClass = createEClass(CAPABILITY_REALIZATION_INVOLVEMENT);
		createEReference(capabilityRealizationInvolvementEClass, CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED_CAPABILITY_REALIZATION_INVOLVED_ELEMENT);

		capabilityRealizationInvolvedElementEClass = createEClass(CAPABILITY_REALIZATION_INVOLVED_ELEMENT);
		createEReference(capabilityRealizationInvolvedElementEClass, CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__OWNED_REGIONS);
		createEReference(stateMachineEClass, STATE_MACHINE__OWNED_CONNECTION_POINTS);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__OWNED_STATES);
		createEReference(regionEClass, REGION__OWNED_TRANSITIONS);
		createEReference(regionEClass, REGION__INVOLVED_STATES);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__OWNED_REGIONS);
		createEReference(stateEClass, STATE__OWNED_CONNECTION_POINTS);
		createEReference(stateEClass, STATE__AVAILABLE_ABSTRACT_FUNCTIONS);
		createEReference(stateEClass, STATE__AVAILABLE_FUNCTIONAL_CHAINS);
		createEReference(stateEClass, STATE__AVAILABLE_ABSTRACT_CAPABILITIES);
		createEReference(stateEClass, STATE__ENTRY);
		createEReference(stateEClass, STATE__DO_ACTIVITY);
		createEReference(stateEClass, STATE__EXIT);
		createEReference(stateEClass, STATE__STATE_INVARIANT);

		modeEClass = createEClass(MODE);

		finalStateEClass = createEClass(FINAL_STATE);

		abstractStateEClass = createEClass(ABSTRACT_STATE);
		createEReference(abstractStateEClass, ABSTRACT_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS);
		createEReference(abstractStateEClass, ABSTRACT_STATE__REALIZED_ABSTRACT_STATES);
		createEReference(abstractStateEClass, ABSTRACT_STATE__REALIZING_ABSTRACT_STATES);
		createEReference(abstractStateEClass, ABSTRACT_STATE__OUTGOING);
		createEReference(abstractStateEClass, ABSTRACT_STATE__INCOMING);
		createEReference(abstractStateEClass, ABSTRACT_STATE__INVOLVER_REGIONS);

		stateTransitionEClass = createEClass(STATE_TRANSITION);
		createEAttribute(stateTransitionEClass, STATE_TRANSITION__KIND);
		createEAttribute(stateTransitionEClass, STATE_TRANSITION__TRIGGER_DESCRIPTION);
		createEReference(stateTransitionEClass, STATE_TRANSITION__GUARD);
		createEReference(stateTransitionEClass, STATE_TRANSITION__SOURCE);
		createEReference(stateTransitionEClass, STATE_TRANSITION__TARGET);
		createEReference(stateTransitionEClass, STATE_TRANSITION__EFFECT);
		createEReference(stateTransitionEClass, STATE_TRANSITION__TRIGGERS);
		createEReference(stateTransitionEClass, STATE_TRANSITION__OWNED_STATE_TRANSITION_REALIZATIONS);
		createEReference(stateTransitionEClass, STATE_TRANSITION__REALIZED_STATE_TRANSITIONS);
		createEReference(stateTransitionEClass, STATE_TRANSITION__REALIZING_STATE_TRANSITIONS);

		pseudostateEClass = createEClass(PSEUDOSTATE);

		initialPseudoStateEClass = createEClass(INITIAL_PSEUDO_STATE);

		joinPseudoStateEClass = createEClass(JOIN_PSEUDO_STATE);

		forkPseudoStateEClass = createEClass(FORK_PSEUDO_STATE);

		choicePseudoStateEClass = createEClass(CHOICE_PSEUDO_STATE);

		terminatePseudoStateEClass = createEClass(TERMINATE_PSEUDO_STATE);

		abstractStateRealizationEClass = createEClass(ABSTRACT_STATE_REALIZATION);
		createEReference(abstractStateRealizationEClass, ABSTRACT_STATE_REALIZATION__REALIZED_ABSTRACT_STATE);
		createEReference(abstractStateRealizationEClass, ABSTRACT_STATE_REALIZATION__REALIZING_ABSTRACT_STATE);

		stateTransitionRealizationEClass = createEClass(STATE_TRANSITION_REALIZATION);
		createEReference(stateTransitionRealizationEClass, STATE_TRANSITION_REALIZATION__REALIZED_STATE_TRANSITION);
		createEReference(stateTransitionRealizationEClass, STATE_TRANSITION_REALIZATION__REALIZING_STATE_TRANSITION);

		shallowHistoryPseudoStateEClass = createEClass(SHALLOW_HISTORY_PSEUDO_STATE);

		deepHistoryPseudoStateEClass = createEClass(DEEP_HISTORY_PSEUDO_STATE);

		entryPointPseudoStateEClass = createEClass(ENTRY_POINT_PSEUDO_STATE);

		exitPointPseudoStateEClass = createEClass(EXIT_POINT_PSEUDO_STATE);

		stateEventRealizationEClass = createEClass(STATE_EVENT_REALIZATION);
		createEReference(stateEventRealizationEClass, STATE_EVENT_REALIZATION__REALIZED_EVENT);
		createEReference(stateEventRealizationEClass, STATE_EVENT_REALIZATION__REALIZING_EVENT);

		stateEventEClass = createEClass(STATE_EVENT);
		createEReference(stateEventEClass, STATE_EVENT__EXPRESSION);
		createEReference(stateEventEClass, STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS);

		changeEventEClass = createEClass(CHANGE_EVENT);
		createEAttribute(changeEventEClass, CHANGE_EVENT__KIND);

		timeEventEClass = createEClass(TIME_EVENT);
		createEAttribute(timeEventEClass, TIME_EVENT__KIND);

		// Create enums
		transitionKindEEnum = createEEnum(TRANSITION_KIND);
		timeEventKindEEnum = createEEnum(TIME_EVENT_KIND);
		changeEventKindEEnum = createEEnum(CHANGE_EVENT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage)EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		FaPackage theFaPackage = (FaPackage)EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);
		InteractionPackage theInteractionPackage = (InteractionPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractCapabilityPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		genericTraceEClass.getESuperTypes().add(theCapellacorePackage.getTrace());
		transfoLinkEClass.getESuperTypes().add(this.getGenericTrace());
		justificationLinkEClass.getESuperTypes().add(this.getGenericTrace());
		capabilityRealizationInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvement());
		capabilityRealizationInvolvedElementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		stateMachineEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		stateMachineEClass.getESuperTypes().add(theBehaviorPackage.getAbstractBehavior());
		regionEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		stateEClass.getESuperTypes().add(this.getAbstractState());
		modeEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());
		abstractStateEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		abstractStateEClass.getESuperTypes().add(theModellingcorePackage.getIState());
		stateTransitionEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		stateTransitionEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		pseudostateEClass.getESuperTypes().add(this.getAbstractState());
		initialPseudoStateEClass.getESuperTypes().add(this.getPseudostate());
		joinPseudoStateEClass.getESuperTypes().add(this.getPseudostate());
		forkPseudoStateEClass.getESuperTypes().add(this.getPseudostate());
		choicePseudoStateEClass.getESuperTypes().add(this.getPseudostate());
		terminatePseudoStateEClass.getESuperTypes().add(this.getPseudostate());
		abstractStateRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		stateTransitionRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		shallowHistoryPseudoStateEClass.getESuperTypes().add(this.getPseudostate());
		deepHistoryPseudoStateEClass.getESuperTypes().add(this.getPseudostate());
		entryPointPseudoStateEClass.getESuperTypes().add(this.getPseudostate());
		exitPointPseudoStateEClass.getESuperTypes().add(this.getPseudostate());
		stateEventRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		stateEventEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		stateEventEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		changeEventEClass.getESuperTypes().add(this.getStateEvent());
		timeEventEClass.getESuperTypes().add(this.getStateEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractCapabilityPkgEClass, AbstractCapabilityPkg.class, "AbstractCapabilityPkg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genericTraceEClass, GenericTrace.class, "GenericTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericTrace_KeyValuePairs(), theCapellacorePackage.getKeyValue(), null, "keyValuePairs", null, 0, -1, GenericTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericTrace_Source(), theModellingcorePackage.getTraceableElement(), null, "source", null, 1, 1, GenericTrace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGenericTrace_Target(), theModellingcorePackage.getTraceableElement(), null, "target", null, 1, 1, GenericTrace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(transfoLinkEClass, TransfoLink.class, "TransfoLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(justificationLinkEClass, JustificationLink.class, "JustificationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityRealizationInvolvementEClass, CapabilityRealizationInvolvement.class, "CapabilityRealizationInvolvement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityRealizationInvolvement_InvolvedCapabilityRealizationInvolvedElement(), this.getCapabilityRealizationInvolvedElement(), null, "involvedCapabilityRealizationInvolvedElement", null, 1, 1, CapabilityRealizationInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(capabilityRealizationInvolvedElementEClass, CapabilityRealizationInvolvedElement.class, "CapabilityRealizationInvolvedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityRealizationInvolvedElement_InvolvingCapabilityRealizationInvolvements(), this.getCapabilityRealizationInvolvement(), null, "involvingCapabilityRealizationInvolvements", null, 0, -1, CapabilityRealizationInvolvedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_OwnedRegions(), this.getRegion(), null, "ownedRegions", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateMachine_OwnedConnectionPoints(), this.getPseudostate(), null, "ownedConnectionPoints", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_OwnedStates(), this.getAbstractState(), null, "ownedStates", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_OwnedTransitions(), this.getStateTransition(), null, "ownedTransitions", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegion_InvolvedStates(), this.getAbstractState(), null, "involvedStates", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_OwnedRegions(), this.getRegion(), null, "ownedRegions", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_OwnedConnectionPoints(), this.getPseudostate(), null, "ownedConnectionPoints", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_AvailableAbstractFunctions(), theFaPackage.getAbstractFunction(), null, "availableAbstractFunctions", null, 0, -1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_AvailableFunctionalChains(), theFaPackage.getFunctionalChain(), null, "availableFunctionalChains", null, 0, -1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_AvailableAbstractCapabilities(), theInteractionPackage.getAbstractCapability(), null, "availableAbstractCapabilities", null, 0, -1, State.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getState_Entry(), theBehaviorPackage.getAbstractEvent(), null, "entry", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_DoActivity(), theBehaviorPackage.getAbstractEvent(), null, "doActivity", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Exit(), theBehaviorPackage.getAbstractEvent(), null, "exit", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_StateInvariant(), theModellingcorePackage.getAbstractConstraint(), null, "stateInvariant", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractStateEClass, AbstractState.class, "AbstractState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractState_OwnedAbstractStateRealizations(), this.getAbstractStateRealization(), null, "ownedAbstractStateRealizations", null, 0, -1, AbstractState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractState_RealizedAbstractStates(), this.getAbstractState(), null, "realizedAbstractStates", null, 0, -1, AbstractState.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractState_RealizingAbstractStates(), this.getAbstractState(), null, "realizingAbstractStates", null, 0, -1, AbstractState.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractState_Outgoing(), this.getStateTransition(), null, "outgoing", null, 0, -1, AbstractState.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractState_Incoming(), this.getStateTransition(), null, "incoming", null, 0, -1, AbstractState.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractState_InvolverRegions(), this.getRegion(), null, "involverRegions", null, 0, -1, AbstractState.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateTransitionEClass, StateTransition.class, "StateTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateTransition_Kind(), this.getTransitionKind(), "kind", null, 0, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateTransition_TriggerDescription(), ecorePackage.getEString(), "triggerDescription", null, 0, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_Guard(), theCapellacorePackage.getConstraint(), null, "guard", null, 0, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_Source(), this.getAbstractState(), null, "source", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_Target(), this.getAbstractState(), null, "target", null, 1, 1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_Effect(), theBehaviorPackage.getAbstractEvent(), null, "effect", null, 0, -1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_Triggers(), theBehaviorPackage.getAbstractEvent(), null, "triggers", null, 0, -1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_OwnedStateTransitionRealizations(), this.getStateTransitionRealization(), null, "ownedStateTransitionRealizations", null, 0, -1, StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_RealizedStateTransitions(), this.getStateTransition(), null, "realizedStateTransitions", null, 0, -1, StateTransition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_RealizingStateTransitions(), this.getStateTransition(), null, "realizingStateTransitions", null, 0, -1, StateTransition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pseudostateEClass, Pseudostate.class, "Pseudostate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialPseudoStateEClass, InitialPseudoState.class, "InitialPseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinPseudoStateEClass, JoinPseudoState.class, "JoinPseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkPseudoStateEClass, ForkPseudoState.class, "ForkPseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(choicePseudoStateEClass, ChoicePseudoState.class, "ChoicePseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(terminatePseudoStateEClass, TerminatePseudoState.class, "TerminatePseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractStateRealizationEClass, AbstractStateRealization.class, "AbstractStateRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractStateRealization_RealizedAbstractState(), this.getAbstractState(), null, "realizedAbstractState", null, 1, 1, AbstractStateRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStateRealization_RealizingAbstractState(), this.getAbstractState(), null, "realizingAbstractState", null, 1, 1, AbstractStateRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateTransitionRealizationEClass, StateTransitionRealization.class, "StateTransitionRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateTransitionRealization_RealizedStateTransition(), this.getStateTransition(), null, "realizedStateTransition", null, 1, 1, StateTransitionRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransitionRealization_RealizingStateTransition(), this.getStateTransition(), null, "realizingStateTransition", null, 1, 1, StateTransitionRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(shallowHistoryPseudoStateEClass, ShallowHistoryPseudoState.class, "ShallowHistoryPseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deepHistoryPseudoStateEClass, DeepHistoryPseudoState.class, "DeepHistoryPseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entryPointPseudoStateEClass, EntryPointPseudoState.class, "EntryPointPseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exitPointPseudoStateEClass, ExitPointPseudoState.class, "ExitPointPseudoState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEventRealizationEClass, StateEventRealization.class, "StateEventRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateEventRealization_RealizedEvent(), this.getStateEvent(), null, "realizedEvent", null, 1, 1, StateEventRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStateEventRealization_RealizingEvent(), this.getStateEvent(), null, "realizingEvent", null, 1, 1, StateEventRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stateEventEClass, StateEvent.class, "StateEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateEvent_Expression(), theCapellacorePackage.getConstraint(), null, "expression", null, 0, 1, StateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateEvent_OwnedStateEventRealizations(), this.getStateEventRealization(), null, "ownedStateEventRealizations", null, 0, -1, StateEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeEventEClass, ChangeEvent.class, "ChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeEvent_Kind(), this.getChangeEventKind(), "kind", null, 0, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEventEClass, TimeEvent.class, "TimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeEvent_Kind(), this.getTimeEventKind(), "kind", null, 0, 1, TimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transitionKindEEnum, TransitionKind.class, "TransitionKind");
		addEEnumLiteral(transitionKindEEnum, TransitionKind.INTERNAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.LOCAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.EXTERNAL);

		initEEnum(timeEventKindEEnum, TimeEventKind.class, "TimeEventKind");
		addEEnumLiteral(timeEventKindEEnum, TimeEventKind.AT);
		addEEnumLiteral(timeEventKindEEnum, TimeEventKind.AFTER);

		initEEnum(changeEventKindEEnum, ChangeEventKind.class, "ChangeEventKind");
		addEEnumLiteral(changeEventKindEEnum, ChangeEventKind.WHEN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/capella/2007/UML2Mapping
		createUML2MappingAnnotations();
		// http://www.polarsys.org/kitalpha/dsl/2007/dslfactory
		createDslfactoryAnnotations();
		// http://www.polarsys.org/kitalpha/ecore/documentation
		createDocumentationAnnotations();
		// http://www.polarsys.org/capella/semantic
		createSemanticAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/extension
		createExtensionAnnotations();
		// http://www.polarsys.org/capella/2007/BusinessInformation
		createBusinessInformationAnnotations();
		// http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping
		createMappingAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore
		createIgnoreAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment
		createSegmentAnnotations();
		// http://www.polarsys.org/capella/derived
		createDerivedAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/UML2Mapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUML2MappingAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/UML2Mapping";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "profileName", "Capella"
		   });	
		addAnnotation
		  (abstractCapabilityPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "NamedElement"
		   });	
		addAnnotation
		  (genericTraceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.GenericTrace"
		   });	
		addAnnotation
		  (getGenericTrace_KeyValuePairs(), 
		   source, 
		   new String[] {
			 "featureName", "ownedComment",
			 "featureOwner", "Element"
		   });	
		addAnnotation
		  (transfoLinkEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.TransfoLink"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/dsl/2007/dslfactory</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDslfactoryAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/dsl/2007/dslfactory";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "trackResourceModification", "true",
			 "useUUIDs", "false",
			 "useIDAttributes", "true",
			 "extensibleProviderFactory", "true",
			 "childCreationExtenders", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/ecore/documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentationAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/ecore/documentation";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "CapellaCommon aims at defining other concepts (mainly used to solve the constraints arisen from the 4.2.1 rationale). It concretises the Activity and the State machines.\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "none",
			 "constraints", "This package depends on the model CapellaCore.ecore\r\nThis package depends on the model Activity.ecore\r\nThis package depends on the model StateMachine.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractCapabilityPkgEClass, 
		   source, 
		   new String[] {
			 "description", "an abstract base class for deriving packages containing Capability entities\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (genericTraceEClass, 
		   source, 
		   new String[] {
			 "description", "a Trace relationship (in the UML sense) to which can be associated a set of key/value pairs characterizing the trace.\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getGenericTrace_KeyValuePairs(), 
		   source, 
		   new String[] {
			 "description", "the list of key/value pairs that characterize this trace relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (transfoLinkEClass, 
		   source, 
		   new String[] {
			 "description", "specialized trace to keep track of relationships between source elements of a transformation, and destination elements.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (justificationLinkEClass, 
		   source, 
		   new String[] {
			 "description", "specialized trace to keep track of relationships between source elements of a transformation, and destination elements.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (capabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "description", "an involvement relationship of an entity in the capability that it realizes\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCapabilityRealizationInvolvement_InvolvedCapabilityRealizationInvolvedElement(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the involved element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (capabilityRealizationInvolvedElementEClass, 
		   source, 
		   new String[] {
			 "description", "a model element involved in the realization of a Capability\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCapabilityRealizationInvolvedElement_InvolvingCapabilityRealizationInvolvements(), 
		   source, 
		   new String[] {
			 "description", "the capability realization involvement relationships in which this element is referenced\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (stateMachineEClass, 
		   source, 
		   new String[] {
			 "description", "State machines can be used to express the behavior of part of a system. Behavior is modeled as a traversal of a graph of\r\nstate nodes interconnected by one or more joined transition arcs that are triggered by the dispatching of series of (event)\r\noccurrences. During this traversal, the state machine executes a series of activities associated with various elements of the\r\nstate machine.\r\n[source: UML superstructure v2.2]\r\n",
			 "usage guideline", "a state machine is created (usually through the creation of a state or mode diagram, declaring states, modes, and transitions between them) as a support to specify the dynamic behavior of an entity",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_statemachine.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getStateMachine_OwnedRegions(), 
		   source, 
		   new String[] {
			 "description", "The regions owned directly by the state machine.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateMachine_OwnedConnectionPoints(), 
		   source, 
		   new String[] {
			 "description", "The entry and exit Pseudostates of a composite State. These can only be entry or exit Pseudostates, and they must have different names. They can only be defined for composite States.\r\n[source:UML v2.5]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (regionEClass, 
		   source, 
		   new String[] {
			 "description", "A region is an orthogonal part of either a composite state or a state machine. It contains states and transitions.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "in Capella, a Region is automatically created when creating a state/mode diagram",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getRegion_OwnedStates(), 
		   source, 
		   new String[] {
			 "description", "The set of states owned by the region.\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRegion_OwnedTransitions(), 
		   source, 
		   new String[] {
			 "description", "The set of transitions owned by the region. Note that internal transitions are owned by a region, but applies to the\r\nsource state.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRegion_InvolvedStates(), 
		   source, 
		   new String[] {
			 "description", "the list of elements that are involved in this region",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "description", "A state models a situation during which some (usually implicit) invariant condition holds. \r\n[source: UML superstructure v2.2]\r\n\r\nA condition of a system or element, as defined by some of its properties, which can enable system behaviors and/or structure to occur. Note: The enabled behavior may include no actions, such as associated with a wait state. Also, the condition that defines the state may be dependent on one or more previous states\r\n[source: UML for SE RFP]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_statemachine.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getState_OwnedRegions(), 
		   source, 
		   new String[] {
			 "description", "The regions owned directly by the state.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getState_OwnedConnectionPoints(), 
		   source, 
		   new String[] {
			 "description", "The entry and exit Pseudostates of a composite State. These can only be entry or exit Pseudostates, and they must have different names. They can only be defined for composite States.\r\n[source:UML v2.5]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getState_Entry(), 
		   source, 
		   new String[] {
			 "description", "An optional behavior that is executed whenever this state is entered regardless of the transition taken to reach the state. If\r\ndefined, entry actions are always executed to completion prior to any internal behavior or transitions performed within the\r\nstate.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getState_DoActivity(), 
		   source, 
		   new String[] {
			 "description", "An optional behavior that is executed while being in the state. The execution starts when this state is entered, and stops\r\neither by itself or when the state is exited whichever comes first.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getState_Exit(), 
		   source, 
		   new String[] {
			 "description", "An optional behavior that is executed whenever this state is exited regardless of which transition was taken out of the\r\nstate. If defined, exit actions are always executed to completion only after all internal activities and transition actions have\r\ncompleted execution.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getState_StateInvariant(), 
		   source, 
		   new String[] {
			 "description", "Specifies conditions that are always true when this state is the current state. In protocol state machines, state invariants are\r\nadditional conditions to the preconditions of the outgoing transitions, and to the postcondition of the incoming transitions.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (modeEClass, 
		   source, 
		   new String[] {
			 "description", "A condition which characterizes an expected behaviour through the set of functions or elements available at a point in time.",
			 "usage guideline", "the main difference between a mode and a state, two close notions, is that the notion of mode is more intended to represent the availability level of the system (example : fully operational mode, degraded mode, maintenance mode, ...)",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_mode.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (finalStateEClass, 
		   source, 
		   new String[] {
			 "description", "A special kind of state signifying that the enclosing region is completed. If the enclosing region is directly contained in a\r\nstate machine and all other regions in the state machine also are completed, then it means that the entire state machine is\r\ncompleted.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_statemachine.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractStateEClass, 
		   source, 
		   new String[] {
			 "description", "an abstract base class to define various kinds of states (typically real states and pseudo states)\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractState_OwnedAbstractStateRealizations(), 
		   source, 
		   new String[] {
			 "description", "the realization links that are owned/contained in this AbstractState\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractState_Outgoing(), 
		   source, 
		   new String[] {
			 "description", "Specifies the transitions departing from this vertex.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractState_Incoming(), 
		   source, 
		   new String[] {
			 "description", "Specifies the transitions entering this vertex.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractState_InvolverRegions(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (stateTransitionEClass, 
		   source, 
		   new String[] {
			 "description", "A transition is a directed relationship between a source vertex and a target vertex. It may be part of a compound\r\ntransition, which takes the state machine from one state configuration to another, representing the complete response of\r\nthe state machine to an occurrence of an event of a particular type.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_statemachine.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getStateTransition_Kind(), 
		   source, 
		   new String[] {
			 "description", "specifies the type of the state transition (see TransitionKind)\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to TransitionKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateTransition_TriggerDescription(), 
		   source, 
		   new String[] {
			 "description", "describes the trigger associated to the transition\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateTransition_Guard(), 
		   source, 
		   new String[] {
			 "description", "specifies the guard of the state transition",
			 "constraints", "none",
			 "type", "",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateTransition_Source(), 
		   source, 
		   new String[] {
			 "description", "Designates the originating vertex (state or pseudostate) of the transition.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateTransition_Target(), 
		   source, 
		   new String[] {
			 "description", "Designates the target vertex that is reached when the transition is taken.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateTransition_Effect(), 
		   source, 
		   new String[] {
			 "description", "The event to be triggered",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateTransition_Triggers(), 
		   source, 
		   new String[] {
			 "description", "Specifies the triggers that may fire the transition.",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateTransition_OwnedStateTransitionRealizations(), 
		   source, 
		   new String[] {
			 "description", "the realization links that are owned/contained in this StateTransition\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (pseudostateEClass, 
		   source, 
		   new String[] {
			 "description", "A pseudostate is an abstraction that encompasses different types of transient vertices in the state machine graph.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (initialPseudoStateEClass, 
		   source, 
		   new String[] {
			 "description", "An initial pseudostate represents a default vertex that is the source for a single transition to the default state of a composite state. There can be at most one initial vertex in a region. The outgoing transition from the initial vertex may\r\nhave a behavior, but not a trigger or guard.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "this pseudo state should be used to declare the entry point of the state machine",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_statemachine.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (joinPseudoStateEClass, 
		   source, 
		   new String[] {
			 "description", "join vertices serve to merge several transitions emanating from source vertices in different orthogonal regions. The\r\ntransitions entering a join vertex cannot have guards or triggers\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_joinpseudostate.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (forkPseudoStateEClass, 
		   source, 
		   new String[] {
			 "description", "fork vertices serve to split an incoming transition into two or more transitions terminating on orthogonal target vertices\r\n(i.e., vertices in different regions of a composite state). The segments outgoing from a fork vertex must not have guards\r\nor triggers.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_forkpseudostate.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (choicePseudoStateEClass, 
		   source, 
		   new String[] {
			 "description", "choice vertices which, when reached, result in the dynamic evaluation of the guards of the triggers of its outgoing\r\ntransitions. This realizes a dynamic conditional branch. It allows splitting of transitions into multiple outgoing paths\r\nsuch that the decision on which path to take may be a function of the results of prior actions performed in the same runto-\r\ncompletion step\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_choicepseudostate.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (terminatePseudoStateEClass, 
		   source, 
		   new String[] {
			 "description", "Entering a terminate pseudostate implies that the execution of this state machine by means of its context object is\r\nterminated. The state machine does not exit any states nor does it perform any exit actions other than those associated\r\nwith the transition leading to the terminate pseudostate\r\n[source: UML superstructure v2.2]\r\n",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_terminatepseudostate.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractStateRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "an AbstractStateRealization is a specific kind of allocation link between two AbstractStates (typically of different design levels, or of different nature)\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "none",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractStateRealization_RealizedAbstractState(), 
		   source, 
		   new String[] {
			 "description", "destination of the realization link : the abstract state that is being realized\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractStateRealization_RealizingAbstractState(), 
		   source, 
		   new String[] {
			 "description", "the source of the realization link : the abstract state that is realizing another abstract state\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (stateTransitionRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "a StateTransitionRealization is a specific kind of allocation link between two StateTransitions (typically of different design levels, or of different nature)\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "none",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getStateTransitionRealization_RealizedStateTransition(), 
		   source, 
		   new String[] {
			 "description", "destination of the realization link : the state transition that is being realized\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateTransitionRealization_RealizingStateTransition(), 
		   source, 
		   new String[] {
			 "description", "the source of the realization link : the state transition that is realizing another state transition\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (transitionKindEEnum, 
		   source, 
		   new String[] {
			 "description", "TransitionKind is an enumeration type.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (transitionKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "kind=internal implies that the transition, if triggered, occurs without exiting or entering the source state. Thus, it does not\r\ncause a state change. This means that the entry or exit condition of the source state will not be invoked. An internal\r\ntransition can be taken even if the state machine is in one or more regions nested within this state.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (transitionKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "kind=local implies that the transition, if triggered, will not exit the composite (source) state, but it will apply to any state\r\nwithin the composite state, and these will be exited and entered.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (transitionKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "kind=external implies that the transition, if triggered, will exit the composite (source) state.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (shallowHistoryPseudoStateEClass, 
		   source, 
		   new String[] {
			 "description", "Shallow history represents the most recent active substate of its containing state (but not the substates of that substate).\r\nA composite state can have at most one shallow history vertex. A transition coming into the shallow history vertex is\r\nequivalent to a transition coming into the most recent active substate of a state. At most one transition may originate\r\nfrom the history connector to the default shallow history state. This transition is taken in case the composite state had\r\nnever been active before. The entry action of the state represented by the shallow history is performed.\r\n[source: UML superstructure v2.4]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (deepHistoryPseudoStateEClass, 
		   source, 
		   new String[] {
			 "description", "Deep history represents the most recent active configuration of the composite state that directly contains this\r\npseudostate (e.g., the state configuration that was active when the composite state was last exited). A composite state\r\ncan have at most one deep history vertex. At most one transition may originate from the history connector to the default\r\ndeep history state. This transition is taken in case the composite state had never been active before. Entry actions of\r\nstates entered on the implicit direct path from the deep history to the innermost state(s) represented by a deep history\r\nare performed. The entry action is preformed only once for each state in the active state configuration being restored.\r\n[source: UML superstructure v2.4]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (entryPointPseudoStateEClass, 
		   source, 
		   new String[] {
			 "description", "An entry point pseudostate is an entry point of a state machine or composite state. In each region of the state machine or\r\ncomposite state it has at most a single transition to a vertex within the same region.\r\n[source: UML superstructure v2.4]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (exitPointPseudoStateEClass, 
		   source, 
		   new String[] {
			 "description", "An exit point pseudostate is an exit point of a state machine or composite state. Entering an exit point within any region\r\nof the composite state or state machine referenced by a submachine state implies the exit of this composite state or\r\nsubmachine state and the triggering of the transition that has this exit point as source in the state machine enclosing the\r\nsubmachine or composite state.\r\n[source: UML superstructure v2.4]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (stateEventRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "a StateEventRealization is a specific kind of realization link between two StateEvent (typically of different design levels, or of different nature)\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "none",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getStateEventRealization_RealizedEvent(), 
		   source, 
		   new String[] {
			 "description", "destination of the realization link : the state event that is being realized\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStateEventRealization_RealizingEvent(), 
		   source, 
		   new String[] {
			 "description", "the source of the realization link : the state event that is realizing another abstract state\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (stateEventEClass, 
		   source, 
		   new String[] {
			 "description", "An event used in statemachine definition which occurs at a given condition. \r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "../img/usage_examples/example_statemachine.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getStateEvent_OwnedStateEventRealizations(), 
		   source, 
		   new String[] {
			 "description", "the realization links that are owned/contained in this StateEvent\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (changeEventEClass, 
		   source, 
		   new String[] {
			 "description", "A change event occurs when a Boolean-valued expression becomes true. For example, as a result of a change in the value\r\nheld in a slot corresponding to an attribute, or a change in the value referenced by a link corresponding to an association.\r\nA change event is raised implicitly and is not the result of an explicit action\r\n[source: UML superstructure v2.4]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getChangeEvent_Kind(), 
		   source, 
		   new String[] {
			 "description", "specifies the type of the state ChangeEvent (see ChangeEventKind)\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to ChangeEventKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (timeEventEClass, 
		   source, 
		   new String[] {
			 "description", "A time event specifies a point in time by an expression. The expression might be absolute or might be relative to some\r\nother point in time.\r\n[source: UML superstructure v2.4]\r\n",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getTimeEvent_Kind(), 
		   source, 
		   new String[] {
			 "description", "specifies the type of the state TimeEvent (see TimeEventKind)\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to TimeEventKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (timeEventKindEEnum, 
		   source, 
		   new String[] {
			 "description", "TimeEventKind is an enumeration type.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (timeEventKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "An absolute time trigger is specified with the keyword \u2018at\u2019 followed by an expression that\r\nevaluates to a time value, such as \u201cJan. 1, 2000, Noon.\"\r\n[source: UML superstructure v2.4]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (timeEventKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "A relative time trigger is specified with the keyword \u2018after\u2019 followed by an expression that evaluates to a time value, such\r\nas \u201cafter (5 seconds).\u201d \r\n[source: UML superstructure v2.4]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (changeEventKindEEnum, 
		   source, 
		   new String[] {
			 "description", "ChangeEventKind is an enumeration type.\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (changeEventKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "A change event occurs when a Boolean-valued expression becomes true.\r\n[source:UML Superstructure v2.4]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/semantic</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSemanticAnnotations() {
		String source = "http://www.polarsys.org/capella/semantic";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (genericTraceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGenericTrace_Source(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGenericTrace_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateMachineEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateMachine_OwnedRegions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateMachine_OwnedConnectionPoints(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (regionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRegion_OwnedStates(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRegion_OwnedTransitions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRegion_InvolvedStates(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_OwnedRegions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_OwnedConnectionPoints(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_AvailableAbstractFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_AvailableFunctionalChains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_AvailableAbstractCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_Entry(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_DoActivity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_Exit(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (modeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (finalStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractState_RealizedAbstractStates(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractState_RealizingAbstractStates(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getAbstractState_Outgoing(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getAbstractState_Incoming(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getAbstractState_InvolverRegions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (stateTransitionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_TriggerDescription(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_Guard(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_Source(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_Effect(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_Triggers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_RealizedStateTransitions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_RealizingStateTransitions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (pseudostateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (initialPseudoStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (joinPseudoStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (forkPseudoStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (choicePseudoStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (terminatePseudoStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (shallowHistoryPseudoStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (deepHistoryPseudoStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (entryPointPseudoStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (exitPointPseudoStateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateEventEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateEvent_Expression(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (changeEventEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getChangeEvent_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (timeEventEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTimeEvent_Kind(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/extension</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtensionAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/extension";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "trackResourceModification", "true",
			 "useUUIDs", "false",
			 "useIDAttributes", "true",
			 "extensibleProviderFactory", "true",
			 "childCreationExtenders", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/BusinessInformation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createBusinessInformationAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/BusinessInformation";	
		addAnnotation
		  (abstractCapabilityPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "Aspect"
		   });	
		addAnnotation
		  (genericTraceEClass, 
		   source, 
		   new String[] {
			 "Label", "GenericTrace"
		   });	
		addAnnotation
		  (getGenericTrace_KeyValuePairs(), 
		   source, 
		   new String[] {
			 "Label", "keyValuePairs"
		   });	
		addAnnotation
		  (transfoLinkEClass, 
		   source, 
		   new String[] {
			 "Label", "TransfoLink"
		   });	
		addAnnotation
		  (justificationLinkEClass, 
		   source, 
		   new String[] {
			 "Label", "JustificationLink"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMappingAnnotations() {
		String source = "http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping";	
		addAnnotation
		  (abstractCapabilityPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (genericTraceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "coud be uml::Dependency, but left empty so that this element is not actually available/transformed for the end user.\r\nThis is a feature of Capella that is not available in Capella/MAX anyway.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getGenericTrace_KeyValuePairs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Element::ownedComment",
			 "explanation", "none",
			 "constraints", "uml::Element::ownedComment elements on which KeyValue stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (transfoLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Dependency",
			 "constraints", "none"
		   });	
		addAnnotation
		  (justificationLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Dependency",
			 "constraints", "none"
		   });	
		addAnnotation
		  (capabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapabilityRealizationInvolvement_InvolvedCapabilityRealizationInvolvedElement(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (capabilityRealizationInvolvedElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapabilityRealizationInvolvedElement_InvolvingCapabilityRealizationInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (stateMachineEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::StateMachine",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateMachine_OwnedRegions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::StateMachine::region",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getStateMachine_OwnedConnectionPoints(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::StateMachine::connectionPoint",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (regionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Region",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRegion_OwnedStates(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Region::subvertex",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getRegion_OwnedTransitions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Region::transition",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getRegion_InvolvedStates(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::State",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getState_OwnedRegions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::State::region",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getState_OwnedConnectionPoints(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::State::connectionPoint",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getState_Entry(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::State::entry",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getState_DoActivity(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::State::doActivity",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getState_Exit(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::State::exit",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getState_StateInvariant(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::State::stateInvariant",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (modeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::State",
			 "constraints", "none"
		   });	
		addAnnotation
		  (finalStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::FinalState",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractState_OwnedAbstractStateRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which AbstractStateRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getAbstractState_Outgoing(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Transition::source",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getAbstractState_Incoming(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Transition::target",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getAbstractState_InvolverRegions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (stateTransitionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Transition",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransition_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Transition::kind",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransition_TriggerDescription(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransition_Guard(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransition_Source(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Transition::source",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransition_Target(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Transition::target",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransition_Effect(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransition_Triggers(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Transition::trigger",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransition_OwnedStateTransitionRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which StateTransitionRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (pseudostateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Pseudostate",
			 "constraints", "none"
		   });	
		addAnnotation
		  (initialPseudoStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Pseudostate",
			 "explanation", "none",
			 "constraints", "uml::Pseudostate elements for which kind is initial"
		   });	
		addAnnotation
		  (joinPseudoStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Pseudostate",
			 "explanation", "none",
			 "constraints", "uml::Pseudostate elements for which kind is join"
		   });	
		addAnnotation
		  (forkPseudoStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Pseudostate",
			 "explanation", "none",
			 "constraints", "uml::Pseudostate elements for which kind is fork"
		   });	
		addAnnotation
		  (choicePseudoStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Pseudostate",
			 "explanation", "none",
			 "constraints", "uml::Pseudostate elements for which kind is choice"
		   });	
		addAnnotation
		  (terminatePseudoStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Pseudostate",
			 "explanation", "none",
			 "constraints", "uml::Pseudostate elements for which kind is terminate"
		   });	
		addAnnotation
		  (abstractStateRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractStateRealization_RealizedAbstractState(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractStateRealization_RealizingAbstractState(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (stateTransitionRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransitionRealization_RealizedStateTransition(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateTransitionRealization_RealizingStateTransition(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (transitionKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TransitionKind",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (transitionKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TransitionKind::internal",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (transitionKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TransitionKind::local",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (transitionKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TransitionKind::external",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (shallowHistoryPseudoStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Pseudostate",
			 "explanation", "none",
			 "constraints", "uml::Pseudostate elements for which kind is shallowHistory"
		   });	
		addAnnotation
		  (deepHistoryPseudoStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Pseudostate",
			 "explanation", "none",
			 "constraints", "uml::Pseudostate elements for which kind is deepHistory"
		   });	
		addAnnotation
		  (entryPointPseudoStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Pseudostate",
			 "explanation", "none",
			 "constraints", "uml::Pseudostate elements for which kind is entry point"
		   });	
		addAnnotation
		  (exitPointPseudoStateEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Pseudostate",
			 "explanation", "none",
			 "constraints", "uml::Pseudostate elements for which kind is exit point"
		   });	
		addAnnotation
		  (stateEventRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateEventRealization_RealizedEvent(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateEventRealization_RealizingEvent(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (stateEventEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateEvent_Expression(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ChangeEvent::changeExpression if current element is a ChangeEvent\r\numl::TimeEvent::when if current element is a TimeEvent\r\n",
			 "base metaclass in UML/SysML profile ", "uml::ChangeEvent and uml::TimeEvent\r\n",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStateEvent_OwnedStateEventRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which StateEventRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (changeEventEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::ChangeEvent",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getChangeEvent_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (timeEventEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::TimeEvent",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getTimeEvent_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TimeEvent::isRelative",
			 "explanation", "A relative time trigger is specified with the keyword \u2018after\u2019 followed by an expression that evaluates to a time value, such\r\nas \u201cafter (5 seconds).\u201d An absolute time trigger is specified with the keyword \u2018at\u2019 followed by an expression that\r\nevaluates to a time value, such as \u201cJan. 1, 2000, Noon.\"",
			 "constraints", "none"
		   });	
		addAnnotation
		  (timeEventKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TransitionKind",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (timeEventKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TimeEvent::isRelative = false",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (timeEventKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TimeEvent::isRelative = true",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (changeEventKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TransitionKind",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (changeEventKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIgnoreAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore";	
		addAnnotation
		  (genericTraceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (transfoLinkEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (justificationLinkEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSegmentAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment";	
		addAnnotation
		  (getGenericTrace_KeyValuePairs(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/derived</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivedAnnotations() {
		String source = "http://www.polarsys.org/capella/derived";	
		addAnnotation
		  (getGenericTrace_Source(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGenericTrace_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapabilityRealizationInvolvement_InvolvedCapabilityRealizationInvolvedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapabilityRealizationInvolvedElement_InvolvingCapabilityRealizationInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_AvailableAbstractFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_AvailableFunctionalChains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getState_AvailableAbstractCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractState_RealizedAbstractStates(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractState_RealizingAbstractStates(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractState_Outgoing(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractState_Incoming(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractState_InvolverRegions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_RealizedStateTransitions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransition_RealizingStateTransitions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractStateRealization_RealizedAbstractState(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractStateRealization_RealizingAbstractState(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransitionRealization_RealizedStateTransition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateTransitionRealization_RealizingStateTransition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateEventRealization_RealizedEvent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStateEventRealization_RealizingEvent(), 
		   source, 
		   new String[] {
		   });
	}

} //CapellacommonPackageImpl
