/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AcceptEventAction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityExchange;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallAction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallBehaviorAction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ControlFlow;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExecutableNode;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InterruptibleActivityRegion;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InvocationAction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeOrderingKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.OutputPin;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.Pin;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.SendSignalAction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.StructuredActivityNode;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ValuePin;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.BehaviorPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.impl.BehaviorPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapellacommonPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.impl.CapellacommonPackageImpl;

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
public class ActivityPackageImpl extends EPackageImpl implements ActivityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptibleActivityRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredActivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectNodeOrderingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectNodeKindEEnum = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivityPackageImpl() {
		super(eNS_URI, ActivityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivityPackage init() {
		if (isInited) return (ActivityPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI);

		// Obtain or create and register package
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivityPackageImpl());

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
		CapellacommonPackageImpl theCapellacommonPackage = (CapellacommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI) instanceof CapellacommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI) : CapellacommonPackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) : DatavaluePackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		theActivityPackage.createPackageContents();
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
		theCapellacommonPackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theDatavaluePackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		theActivityPackage.initializePackageContents();
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
		theCapellacommonPackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theDatavaluePackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivityPackage.eNS_URI, theActivityPackage);
		return theActivityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractActivity() {
		return abstractActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActivity_IsReadOnly() {
		return (EAttribute)abstractActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractActivity_IsSingleExecution() {
		return (EAttribute)abstractActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractActivity_OwnedNodes() {
		return (EReference)abstractActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractActivity_OwnedEdges() {
		return (EReference)abstractActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractActivity_OwnedGroups() {
		return (EReference)abstractActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractActivity_OwnedStructuredNodes() {
		return (EReference)abstractActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandler() {
		return exceptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ProtectedNode() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_HandlerBody() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionInput() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionTypes() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityGroup() {
		return activityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_SuperGroup() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_SubGroups() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_OwnedNodes() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_OwnedEdges() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptibleActivityRegion() {
		return interruptibleActivityRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptibleActivityRegion_InterruptingEdges() {
		return (EReference)interruptibleActivityRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityEdge_KindOfRate() {
		return (EAttribute)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InActivityPartition() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InInterruptibleRegion() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InStructuredNode() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Rate() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Probability() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Guard() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Weight() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Interrupts() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectFlow() {
		return objectFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMulticast() {
		return (EAttribute)objectFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMultireceive() {
		return (EAttribute)objectFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Transformation() {
		return (EReference)objectFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Selection() {
		return (EReference)objectFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPartition() {
		return activityPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsDimension() {
		return (EAttribute)activityPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsExternal() {
		return (EAttribute)activityPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_RepresentedElement() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_SuperPartition() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_SubPartitions() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityExchange() {
		return activityExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityExchange_RealizingActivityFlows() {
		return (EReference)activityExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InActivityPartition() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InInterruptibleRegion() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InStructuredNode() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableNode_OwnedHandlers() {
		return (EReference)executableNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredActivityNode() {
		return structuredActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAction() {
		return abstractActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAction_LocalPrecondition() {
		return (EReference)abstractActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAction_LocalPostcondition() {
		return (EReference)abstractActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAction_Context() {
		return (EReference)abstractActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAction_Inputs() {
		return (EReference)abstractActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractAction_Outputs() {
		return (EReference)abstractActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventAction() {
		return acceptEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptEventAction_IsUnmarshall() {
		return (EAttribute)acceptEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Result() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationAction() {
		return invocationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_Arguments() {
		return (EReference)invocationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalAction() {
		return sendSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Target() {
		return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Signal() {
		return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallAction() {
		return callActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallAction_Results() {
		return (EReference)callActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBehaviorAction() {
		return callBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallBehaviorAction_Behavior() {
		return (EReference)callBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNode() {
		return objectNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_IsControlType() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_KindOfNode() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectNode_Ordering() {
		return (EAttribute)objectNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_UpperBound() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_InState() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNode_Selection() {
		return (EReference)objectNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_IsControl() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPin_InputEvaluationAction() {
		return (EReference)inputPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePin() {
		return valuePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePin_Value() {
		return (EReference)valuePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPin() {
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectNodeOrderingKind() {
		return objectNodeOrderingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjectNodeKind() {
		return objectNodeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFactory getActivityFactory() {
		return (ActivityFactory)getEFactoryInstance();
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
		abstractActivityEClass = createEClass(ABSTRACT_ACTIVITY);
		createEAttribute(abstractActivityEClass, ABSTRACT_ACTIVITY__IS_READ_ONLY);
		createEAttribute(abstractActivityEClass, ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION);
		createEReference(abstractActivityEClass, ABSTRACT_ACTIVITY__OWNED_NODES);
		createEReference(abstractActivityEClass, ABSTRACT_ACTIVITY__OWNED_EDGES);
		createEReference(abstractActivityEClass, ABSTRACT_ACTIVITY__OWNED_GROUPS);
		createEReference(abstractActivityEClass, ABSTRACT_ACTIVITY__OWNED_STRUCTURED_NODES);

		exceptionHandlerEClass = createEClass(EXCEPTION_HANDLER);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__PROTECTED_NODE);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__HANDLER_BODY);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION_INPUT);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION_TYPES);

		activityGroupEClass = createEClass(ACTIVITY_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__SUPER_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__SUB_GROUPS);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__OWNED_NODES);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__OWNED_EDGES);

		interruptibleActivityRegionEClass = createEClass(INTERRUPTIBLE_ACTIVITY_REGION);
		createEReference(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEAttribute(activityEdgeEClass, ACTIVITY_EDGE__KIND_OF_RATE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_ACTIVITY_PARTITION);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__RATE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__PROBABILITY);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__GUARD);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__WEIGHT);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__INTERRUPTS);

		controlFlowEClass = createEClass(CONTROL_FLOW);

		objectFlowEClass = createEClass(OBJECT_FLOW);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTICAST);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTIRECEIVE);
		createEReference(objectFlowEClass, OBJECT_FLOW__TRANSFORMATION);
		createEReference(objectFlowEClass, OBJECT_FLOW__SELECTION);

		activityPartitionEClass = createEClass(ACTIVITY_PARTITION);
		createEAttribute(activityPartitionEClass, ACTIVITY_PARTITION__IS_DIMENSION);
		createEAttribute(activityPartitionEClass, ACTIVITY_PARTITION__IS_EXTERNAL);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__REPRESENTED_ELEMENT);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__SUPER_PARTITION);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__SUB_PARTITIONS);

		activityExchangeEClass = createEClass(ACTIVITY_EXCHANGE);
		createEReference(activityExchangeEClass, ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_ACTIVITY_PARTITION);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_STRUCTURED_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);
		createEReference(executableNodeEClass, EXECUTABLE_NODE__OWNED_HANDLERS);

		structuredActivityNodeEClass = createEClass(STRUCTURED_ACTIVITY_NODE);

		abstractActionEClass = createEClass(ABSTRACT_ACTION);
		createEReference(abstractActionEClass, ABSTRACT_ACTION__LOCAL_PRECONDITION);
		createEReference(abstractActionEClass, ABSTRACT_ACTION__LOCAL_POSTCONDITION);
		createEReference(abstractActionEClass, ABSTRACT_ACTION__CONTEXT);
		createEReference(abstractActionEClass, ABSTRACT_ACTION__INPUTS);
		createEReference(abstractActionEClass, ABSTRACT_ACTION__OUTPUTS);

		acceptEventActionEClass = createEClass(ACCEPT_EVENT_ACTION);
		createEAttribute(acceptEventActionEClass, ACCEPT_EVENT_ACTION__IS_UNMARSHALL);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__RESULT);

		invocationActionEClass = createEClass(INVOCATION_ACTION);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ARGUMENTS);

		sendSignalActionEClass = createEClass(SEND_SIGNAL_ACTION);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__TARGET);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__SIGNAL);

		callActionEClass = createEClass(CALL_ACTION);
		createEReference(callActionEClass, CALL_ACTION__RESULTS);

		callBehaviorActionEClass = createEClass(CALL_BEHAVIOR_ACTION);
		createEReference(callBehaviorActionEClass, CALL_BEHAVIOR_ACTION__BEHAVIOR);

		objectNodeEClass = createEClass(OBJECT_NODE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__IS_CONTROL_TYPE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__KIND_OF_NODE);
		createEAttribute(objectNodeEClass, OBJECT_NODE__ORDERING);
		createEReference(objectNodeEClass, OBJECT_NODE__UPPER_BOUND);
		createEReference(objectNodeEClass, OBJECT_NODE__IN_STATE);
		createEReference(objectNodeEClass, OBJECT_NODE__SELECTION);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__IS_CONTROL);

		inputPinEClass = createEClass(INPUT_PIN);
		createEReference(inputPinEClass, INPUT_PIN__INPUT_EVALUATION_ACTION);

		valuePinEClass = createEClass(VALUE_PIN);
		createEReference(valuePinEClass, VALUE_PIN__VALUE);

		outputPinEClass = createEClass(OUTPUT_PIN);

		// Create enums
		objectNodeOrderingKindEEnum = createEEnum(OBJECT_NODE_ORDERING_KIND);
		objectNodeKindEEnum = createEEnum(OBJECT_NODE_KIND);
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
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractActivityEClass.getESuperTypes().add(theBehaviorPackage.getAbstractBehavior());
		abstractActivityEClass.getESuperTypes().add(theModellingcorePackage.getTraceableElement());
		exceptionHandlerEClass.getESuperTypes().add(theModellingcorePackage.getModelElement());
		activityGroupEClass.getESuperTypes().add(theModellingcorePackage.getModelElement());
		interruptibleActivityRegionEClass.getESuperTypes().add(this.getActivityGroup());
		activityEdgeEClass.getESuperTypes().add(theModellingcorePackage.getAbstractRelationship());
		controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
		objectFlowEClass.getESuperTypes().add(this.getActivityEdge());
		activityPartitionEClass.getESuperTypes().add(this.getActivityGroup());
		activityPartitionEClass.getESuperTypes().add(theModellingcorePackage.getAbstractNamedElement());
		activityExchangeEClass.getESuperTypes().add(theModellingcorePackage.getAbstractInformationFlow());
		activityNodeEClass.getESuperTypes().add(theModellingcorePackage.getAbstractNamedElement());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		structuredActivityNodeEClass.getESuperTypes().add(this.getActivityGroup());
		structuredActivityNodeEClass.getESuperTypes().add(this.getAbstractAction());
		abstractActionEClass.getESuperTypes().add(this.getExecutableNode());
		abstractActionEClass.getESuperTypes().add(theModellingcorePackage.getAbstractNamedElement());
		acceptEventActionEClass.getESuperTypes().add(this.getAbstractAction());
		invocationActionEClass.getESuperTypes().add(this.getAbstractAction());
		sendSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
		callActionEClass.getESuperTypes().add(this.getInvocationAction());
		callBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
		objectNodeEClass.getESuperTypes().add(this.getActivityNode());
		objectNodeEClass.getESuperTypes().add(theModellingcorePackage.getAbstractTypedElement());
		pinEClass.getESuperTypes().add(this.getObjectNode());
		inputPinEClass.getESuperTypes().add(this.getPin());
		valuePinEClass.getESuperTypes().add(this.getInputPin());
		outputPinEClass.getESuperTypes().add(this.getPin());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractActivityEClass, AbstractActivity.class, "AbstractActivity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractActivity_IsReadOnly(), ecorePackage.getEBoolean(), "isReadOnly", null, 0, 1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractActivity_IsSingleExecution(), ecorePackage.getEBoolean(), "isSingleExecution", null, 0, 1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractActivity_OwnedNodes(), this.getActivityNode(), null, "ownedNodes", null, 0, -1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractActivity_OwnedEdges(), this.getActivityEdge(), null, "ownedEdges", null, 0, -1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractActivity_OwnedGroups(), this.getActivityGroup(), null, "ownedGroups", null, 0, -1, AbstractActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractActivity_OwnedStructuredNodes(), this.getStructuredActivityNode(), null, "ownedStructuredNodes", null, 0, -1, AbstractActivity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exceptionHandlerEClass, ExceptionHandler.class, "ExceptionHandler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionHandler_ProtectedNode(), this.getExecutableNode(), this.getExecutableNode_OwnedHandlers(), "protectedNode", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionHandler_HandlerBody(), this.getExecutableNode(), null, "handlerBody", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionHandler_ExceptionInput(), this.getObjectNode(), null, "exceptionInput", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionHandler_ExceptionTypes(), theModellingcorePackage.getAbstractType(), null, "exceptionTypes", null, 1, -1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityGroupEClass, ActivityGroup.class, "ActivityGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityGroup_SuperGroup(), this.getActivityGroup(), this.getActivityGroup_SubGroups(), "superGroup", null, 0, 1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGroup_SubGroups(), this.getActivityGroup(), this.getActivityGroup_SuperGroup(), "subGroups", null, 0, -1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGroup_OwnedNodes(), this.getActivityNode(), null, "ownedNodes", null, 0, -1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityGroup_OwnedEdges(), this.getActivityEdge(), null, "ownedEdges", null, 0, -1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptibleActivityRegionEClass, InterruptibleActivityRegion.class, "InterruptibleActivityRegion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterruptibleActivityRegion_InterruptingEdges(), this.getActivityEdge(), this.getActivityEdge_Interrupts(), "interruptingEdges", null, 0, -1, InterruptibleActivityRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityEdge_KindOfRate(), theModellingcorePackage.getRateKind(), "kindOfRate", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_InActivityPartition(), this.getActivityPartition(), null, "inActivityPartition", null, 0, 1, ActivityEdge.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_InInterruptibleRegion(), this.getInterruptibleActivityRegion(), null, "inInterruptibleRegion", null, 0, 1, ActivityEdge.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_InStructuredNode(), this.getStructuredActivityNode(), null, "inStructuredNode", null, 0, 1, ActivityEdge.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Rate(), theModellingcorePackage.getValueSpecification(), null, "rate", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Probability(), theModellingcorePackage.getValueSpecification(), null, "probability", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), null, "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), null, "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Guard(), theModellingcorePackage.getValueSpecification(), null, "guard", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Weight(), theModellingcorePackage.getValueSpecification(), null, "weight", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Interrupts(), this.getInterruptibleActivityRegion(), this.getInterruptibleActivityRegion_InterruptingEdges(), "interrupts", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectFlowEClass, ObjectFlow.class, "ObjectFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectFlow_IsMulticast(), ecorePackage.getEBoolean(), "isMulticast", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectFlow_IsMultireceive(), ecorePackage.getEBoolean(), "isMultireceive", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectFlow_Transformation(), theBehaviorPackage.getAbstractBehavior(), null, "transformation", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectFlow_Selection(), theBehaviorPackage.getAbstractBehavior(), null, "selection", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityPartitionEClass, ActivityPartition.class, "ActivityPartition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityPartition_IsDimension(), ecorePackage.getEBoolean(), "isDimension", null, 0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityPartition_IsExternal(), ecorePackage.getEBoolean(), "isExternal", null, 0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPartition_RepresentedElement(), theModellingcorePackage.getAbstractType(), null, "representedElement", null, 0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPartition_SuperPartition(), this.getActivityPartition(), null, "superPartition", null, 0, 1, ActivityPartition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityPartition_SubPartitions(), this.getActivityPartition(), null, "subPartitions", null, 0, -1, ActivityPartition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(activityExchangeEClass, ActivityExchange.class, "ActivityExchange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityExchange_RealizingActivityFlows(), this.getActivityEdge(), null, "realizingActivityFlows", null, 0, -1, ActivityExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_InActivityPartition(), this.getActivityPartition(), null, "inActivityPartition", null, 0, 1, ActivityNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_InInterruptibleRegion(), this.getInterruptibleActivityRegion(), null, "inInterruptibleRegion", null, 0, 1, ActivityNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_InStructuredNode(), this.getInterruptibleActivityRegion(), null, "inStructuredNode", null, 0, 1, ActivityNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), null, "outgoing", null, 0, -1, ActivityNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), null, "incoming", null, 0, -1, ActivityNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutableNode_OwnedHandlers(), this.getExceptionHandler(), this.getExceptionHandler_ProtectedNode(), "ownedHandlers", null, 0, -1, ExecutableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredActivityNodeEClass, StructuredActivityNode.class, "StructuredActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractActionEClass, AbstractAction.class, "AbstractAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractAction_LocalPrecondition(), theModellingcorePackage.getAbstractConstraint(), null, "localPrecondition", null, 0, 1, AbstractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractAction_LocalPostcondition(), theModellingcorePackage.getAbstractConstraint(), null, "localPostcondition", null, 0, 1, AbstractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractAction_Context(), theModellingcorePackage.getAbstractType(), null, "context", null, 0, 1, AbstractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractAction_Inputs(), this.getInputPin(), null, "inputs", null, 0, -1, AbstractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractAction_Outputs(), this.getOutputPin(), null, "outputs", null, 0, -1, AbstractAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptEventActionEClass, AcceptEventAction.class, "AcceptEventAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptEventAction_IsUnmarshall(), ecorePackage.getEBoolean(), "isUnmarshall", null, 0, 1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAcceptEventAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invocationActionEClass, InvocationAction.class, "InvocationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationAction_Arguments(), this.getInputPin(), null, "arguments", null, 0, -1, InvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendSignalActionEClass, SendSignalAction.class, "SendSignalAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendSignalAction_Target(), this.getInputPin(), null, "target", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendSignalAction_Signal(), theBehaviorPackage.getAbstractSignal(), null, "signal", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callActionEClass, CallAction.class, "CallAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallAction_Results(), this.getOutputPin(), null, "results", null, 0, -1, CallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callBehaviorActionEClass, CallBehaviorAction.class, "CallBehaviorAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallBehaviorAction_Behavior(), theBehaviorPackage.getAbstractBehavior(), null, "behavior", null, 0, 1, CallBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectNodeEClass, ObjectNode.class, "ObjectNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectNode_IsControlType(), ecorePackage.getEBoolean(), "isControlType", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectNode_KindOfNode(), this.getObjectNodeKind(), "kindOfNode", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectNode_Ordering(), this.getObjectNodeOrderingKind(), "ordering", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectNode_UpperBound(), theModellingcorePackage.getValueSpecification(), null, "upperBound", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectNode_InState(), theModellingcorePackage.getIState(), null, "inState", null, 0, -1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectNode_Selection(), theBehaviorPackage.getAbstractBehavior(), null, "selection", null, 0, 1, ObjectNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_IsControl(), ecorePackage.getEBoolean(), "isControl", null, 0, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPinEClass, InputPin.class, "InputPin", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPin_InputEvaluationAction(), this.getAbstractAction(), null, "inputEvaluationAction", null, 0, 1, InputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePinEClass, ValuePin.class, "ValuePin", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePin_Value(), theModellingcorePackage.getValueSpecification(), null, "value", null, 1, 1, ValuePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.class, "ObjectNodeOrderingKind");
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.FIFO);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.LIFO);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.ORDERED);
		addEEnumLiteral(objectNodeOrderingKindEEnum, ObjectNodeOrderingKind.UNORDERED);

		initEEnum(objectNodeKindEEnum, ObjectNodeKind.class, "ObjectNodeKind");
		addEEnumLiteral(objectNodeKindEEnum, ObjectNodeKind.UNSPECIFIED);
		addEEnumLiteral(objectNodeKindEEnum, ObjectNodeKind.NO_BUFFER);
		addEEnumLiteral(objectNodeKindEEnum, ObjectNodeKind.OVERWRITE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/dsl/2007/dslfactory
		createDslfactoryAnnotations();
		// http://www.polarsys.org/kitalpha/ecore/documentation
		createDocumentationAnnotations();
		// http://www.polarsys.org/capella/semantic
		createSemanticAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/extension
		createExtensionAnnotations();
		// http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping
		createMappingAnnotations();
		// http://www.polarsys.org/capella/derived
		createDerivedAnnotations();
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
			 "description", "Activity aims at completing the implementation of the UML Activity provided by the FunctionalArchitecture in order to make it fully supportable anytime.\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "none",
			 "constraints", "This package depends on the model Behavior.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractActivityEClass, 
		   source, 
		   new String[] {
			 "description", "An activity specifies the coordination of executions of subordinate behaviors, using a control and data flow model\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractActivity_IsReadOnly(), 
		   source, 
		   new String[] {
			 "description", "If true, this activity must not make any changes to variables outside the activity or to objects. (This is an assertion, not\r\nan executable property. It may be used by an execution engine to optimize model execution. If the assertion is\r\nviolated by the action, then the model is ill formed.)\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractActivity_IsSingleExecution(), 
		   source, 
		   new String[] {
			 "description", "If true, all invocations of the activity are handled by the same execution\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractActivity_OwnedNodes(), 
		   source, 
		   new String[] {
			 "description", "Nodes coordinated by the activity.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractActivity_OwnedEdges(), 
		   source, 
		   new String[] {
			 "description", "Edges expressing flow between nodes of the activity.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractActivity_OwnedGroups(), 
		   source, 
		   new String[] {
			 "description", "Top-level groups in the activity\r\n[source: UML superstructure v2.2]",
			 "constraints", "The groups of an activity have no supergroups\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractActivity_OwnedStructuredNodes(), 
		   source, 
		   new String[] {
			 "description", "Nodes coordinated by the activity\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exceptionHandlerEClass, 
		   source, 
		   new String[] {
			 "description", "An exception handler is an element that specifies a body to execute in case the specified exception occurs during the\r\nexecution of the protected node\r\n[source: UML superstructure specification v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "Not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExceptionHandler_ProtectedNode(), 
		   source, 
		   new String[] {
			 "description", "The node protected by the handler. The handler is examined if an exception propagates to the outside of the node\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExceptionHandler_HandlerBody(), 
		   source, 
		   new String[] {
			 "description", "A node that is executed if the handler satisfies an uncaught exception\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExceptionHandler_ExceptionInput(), 
		   source, 
		   new String[] {
			 "description", "An object node within the handler body. When the handler catches an exception, the exception token is placed in this\r\nnode, causing the body to execute\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExceptionHandler_ExceptionTypes(), 
		   source, 
		   new String[] {
			 "description", "The kind of instances that the handler catches. If an exception occurs whose type is any of the classifiers in the set,\r\nthe handler catches the exception and executes its body\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (activityGroupEClass, 
		   source, 
		   new String[] {
			 "description", "Activity groups are a generic grouping construct for nodes and edges. Nodes and edges can belong to more than one\r\ngroup. They have no inherent semantics and can be used for various purposes. Subclasses of ActivityGroup may add\r\nsemantics.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActivityGroup_SuperGroup(), 
		   source, 
		   new String[] {
			 "description", "Group immediately containing the group\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "_todo_ If it is corresponding to UML, this attribute should be derived"
		   });	
		addAnnotation
		  (getActivityGroup_SubGroups(), 
		   source, 
		   new String[] {
			 "description", "Groups immediately contained in the group\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "_todo_ If it is corresponding to UML, this attribute should be derived"
		   });	
		addAnnotation
		  (getActivityGroup_OwnedNodes(), 
		   source, 
		   new String[] {
			 "description", "Nodes immediately contained in the group. This is a derived union\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "_todo_ If it is corresponding to UML, this attribute should be derived"
		   });	
		addAnnotation
		  (getActivityGroup_OwnedEdges(), 
		   source, 
		   new String[] {
			 "description", "Edges immediately contained in the group. This is a derived union\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "_todo_ If it is corresponding to UML, this attribute should be derived"
		   });	
		addAnnotation
		  (interruptibleActivityRegionEClass, 
		   source, 
		   new String[] {
			 "description", "An interruptible region contains activity nodes. When a token leaves an interruptible region via edges designated by the\r\nregion as interrupting edges, all tokens and behaviors in the region are terminated\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented in Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInterruptibleActivityRegion_InterruptingEdges(), 
		   source, 
		   new String[] {
			 "description", "The edges leaving the region that will abort other tokens flowing in the region\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum, 
		   source, 
		   new String[] {
			 "description", "ObjectNodeOrderingKind is an enumeration indicating queuing order within a node\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "First In First Out ordering",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "Last In First Out ordering",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "Indicates that object node tokens are ordered.",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "Indicates that object node tokens are unordered.",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeKindEEnum, 
		   source, 
		   new String[] {
			 "description", "specifies the type of behavior of the object node with respect to incoming data\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "Used when incoming object node management policy is not precised",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "When the \"nobuffer\" stereotype is applied to object nodes, tokens arriving at the node are discarded if they are refused by\r\noutgoing edges, or refused by actions for object nodes that are input pins\r\n[source: SysML specification v1.1]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "When the \"overwrite\" stereotype is applied to object nodes, a token arriving at a full object node replaces the ones\r\nalready there (a full object node has as many tokens as allowed by its upper bound)\r\n[source: SysML specification v1.1]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (activityEdgeEClass, 
		   source, 
		   new String[] {
			 "description", "ActivityEdge is an abstract class for the connections along which tokens flow between activity nodes. It covers control\r\nand data flow edges. Activity edges can control token flow\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActivityEdge_KindOfRate(), 
		   source, 
		   new String[] {
			 "description", "characterizes the rate : typically, discrete versus continuous.\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "typically, \"discrete\" or \"continuous\"",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_InActivityPartition(), 
		   source, 
		   new String[] {
			 "description", "Partitions containing the edge\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_InInterruptibleRegion(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) Region containing this edge\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_InStructuredNode(), 
		   source, 
		   new String[] {
			 "description", "Structured activity node containing the edge\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Rate(), 
		   source, 
		   new String[] {
			 "description", "It specifies the expected value of the number of objects and\r\nvalues that traverse the edge per time interval, that is, the expected value rate at which they leave the source node and\r\narrive at the target node. It does not refer to the rate at which a value changes over time\r\n[source: SysML specification v1.1]",
			 "constraints", "The rate of a parameter must be less than or equal to rates on edges that come into or go out from pins and parameters nodes corresponding to the parameter.\r\n[source: SysML specification v1.1]",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Probability(), 
		   source, 
		   new String[] {
			 "description", "Likelihood that a value leaving the decision node or object node will traverse the edge.\r\n[source: SysML specification v1.1]",
			 "constraints", "Shall be between 0 and 1",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Target(), 
		   source, 
		   new String[] {
			 "description", "Node to which tokens are put when they traverse the edge\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Source(), 
		   source, 
		   new String[] {
			 "description", "Node from which tokens are taken when they traverse the edge\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Guard(), 
		   source, 
		   new String[] {
			 "description", "Specification evaluated at runtime to determine if the edge can be traversed\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Weight(), 
		   source, 
		   new String[] {
			 "description", "The minimum number of tokens that must traverse the edge at the same time\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Interrupts(), 
		   source, 
		   new String[] {
			 "description", "Region that the edge can interrupt\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (controlFlowEClass, 
		   source, 
		   new String[] {
			 "description", "A control flow is an edge that starts an activity node after the previous one is finished\r\n[Source : UML superstructure specification v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (objectFlowEClass, 
		   source, 
		   new String[] {
			 "description", "An object flow models the flow of values to or from object nodes\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a (guideline)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getObjectFlow_IsMulticast(), 
		   source, 
		   new String[] {
			 "description", "Tells whether the objects in the flow are passed by multicasting\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getObjectFlow_IsMultireceive(), 
		   source, 
		   new String[] {
			 "description", "Tells whether the objects in the flow are gathered from respondents to multicasting\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getObjectFlow_Transformation(), 
		   source, 
		   new String[] {
			 "description", "Changes or replaces data tokens flowing along edge\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getObjectFlow_Selection(), 
		   source, 
		   new String[] {
			 "description", "Selects tokens from a source object node\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (activityPartitionEClass, 
		   source, 
		   new String[] {
			 "description", "An activity partition is a kind of activity group for identifying actions that have some characteristic in common.\r\n[source: UML superstructure v2.2]\r\n",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActivityPartition_IsDimension(), 
		   source, 
		   new String[] {
			 "description", "Tells whether the partition groups other partitions along a dimension\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityPartition_IsExternal(), 
		   source, 
		   new String[] {
			 "description", "Tells whether the partition represents an entity to which the partitioning structure does not apply\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityPartition_RepresentedElement(), 
		   source, 
		   new String[] {
			 "description", "An element constraining behaviors invoked by nodes in the partition\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityPartition_SuperPartition(), 
		   source, 
		   new String[] {
			 "description", "Partition immediately containing the partition.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityPartition_SubPartitions(), 
		   source, 
		   new String[] {
			 "description", "Partitions immediately contained in the partition.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (activityExchangeEClass, 
		   source, 
		   new String[] {
			 "description", "Interactions between Ports to support Functions, (e.g. Exchanges can be composed of system data, events, analogic signals...).\r\nExchanges are a refinement of the interfaces requirements identified through behavioral modeling, and expressed through Functions.\r\nHence any Function may identify a series of  Exchanges to fully transfer the required element ",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActivityExchange_RealizingActivityFlows(), 
		   source, 
		   new String[] {
			 "description", "Determines which ActivityEdges will realize the specified flow.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (activityNodeEClass, 
		   source, 
		   new String[] {
			 "description", "An activity node is an abstract class for the steps of an activity. It covers executable nodes, control nodes, and object\r\nnodes.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "Activity nodes can only be owned by activities or groups.\r\nActivity nodes may be owned by at most one structured node.\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActivityNode_InActivityPartition(), 
		   source, 
		   new String[] {
			 "description", "Partitions containing the node\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityNode_InInterruptibleRegion(), 
		   source, 
		   new String[] {
			 "description", "Interruptible regions containing the node\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityNode_InStructuredNode(), 
		   source, 
		   new String[] {
			 "description", "Structured activity node containing the node\r\n[source: UML superstructure v2.2]",
			 "constraints", "node",
			 "comment/notes", "node"
		   });	
		addAnnotation
		  (getActivityNode_Outgoing(), 
		   source, 
		   new String[] {
			 "description", "Edges that have the node as source\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityNode_Incoming(), 
		   source, 
		   new String[] {
			 "description", "Edges that have the node as target.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (executableNodeEClass, 
		   source, 
		   new String[] {
			 "description", "An executable node is an abstract class for activity nodes that may be executed. It is used as an attachment point for\r\nexception handlers.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExecutableNode_OwnedHandlers(), 
		   source, 
		   new String[] {
			 "description", "A set of exception handlers that are examined if an uncaught exception propagates to the outer level of the executable\r\nnode.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (structuredActivityNodeEClass, 
		   source, 
		   new String[] {
			 "description", "A structured activity node represents a structured portion of the activity that is not shared with any other structured node,\r\nexcept for nesting\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "The edges owned by a structured node must have source and target nodes in the structured node, and vice versa\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "not used/implemented as of Capella",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractActionEClass, 
		   source, 
		   new String[] {
			 "description", "An Action is a named element that is the fundamental unit of executable functionality. The execution of an action\r\nrepresents some transformation or processing in the modeled system, be it a computer system or otherwise\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractAction_LocalPrecondition(), 
		   source, 
		   new String[] {
			 "description", "The preconditions for an action define conditions that must be true when the action is invoked.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractAction_LocalPostcondition(), 
		   source, 
		   new String[] {
			 "description", "The postconditions for an action define conditions that will be true when the invocation of the action completes\r\nsuccessfully, assuming the preconditions were satisfied\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractAction_Context(), 
		   source, 
		   new String[] {
			 "description", "The classifier that owns the behavior of which this action is a part.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractAction_Inputs(), 
		   source, 
		   new String[] {
			 "description", "The ordered set of input pins connected to the Action. These are among the total set of inputs\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractAction_Outputs(), 
		   source, 
		   new String[] {
			 "description", "The ordered set of output pins connected to the Action. The action places its results onto pins in this set\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (acceptEventActionEClass, 
		   source, 
		   new String[] {
			 "description", "AcceptEventAction is an action that waits for the occurrence of an event meeting specified condition\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "- AcceptEventActions may have no input pins.\r\n- There are no output pins if the trigger events are only ChangeEvents, or if they are only CallEvents when this action is an\r\ninstance of AcceptEventAction and not an instance of a descendant of AcceptEventAction (such as AcceptCallAction).\r\n- If the trigger events are all TimeEvents, there is exactly one output pin.\r\nUML superstructure Specification, v2.2 235\r\n- If isUnmarshalled is true, there must be exactly one trigger for events of type SignalEvent. The number of result output\r\npins must be the same as the number of attributes of the signal. The type and ordering of each result output pin must be the\r\nsame as the corresponding attribute of the signal. The multiplicity of each result output pin must be compatible with the\r\nmultiplicity of the corresponding attribute\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "not used/implemented as of Capella",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAcceptEventAction_IsUnmarshall(), 
		   source, 
		   new String[] {
			 "description", "Indicates whether there is a single output pin for the event, or multiple output pins for attributes of the event\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAcceptEventAction_Result(), 
		   source, 
		   new String[] {
			 "description", "Pins holding the received event objects or their attributes. Event objects may be copied in transmission, so identity\r\nmight not be preserved\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (invocationActionEClass, 
		   source, 
		   new String[] {
			 "description", "In addition to targeting an object, invocation actions can also invoke behavioral features on ports from where the\r\ninvocation requests are routed onwards on links deriving from attached connectors. Invocation actions may also be sent to\r\na target via a given port, either on the sending object or on another object.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInvocationAction_Arguments(), 
		   source, 
		   new String[] {
			 "description", "port(s) of the receiver object on which the behavioral feature is invoked\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (sendSignalActionEClass, 
		   source, 
		   new String[] {
			 "description", "SendSignalAction is an action that creates a signal instance from its inputs, and transmits it to the target object, where it\r\nmay cause the firing of a state machine transition or the execution of an activity. The argument values are available to the\r\nexecution of associated behaviors. The requestor continues execution immediately. Any reply message is ignored and is\r\nnot transmitted to the requestor. If the input is already a signal instance, use SendObjectAction\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "- The number and order of argument pins must be the same as the number and order of attributes in the signal.\r\n- The type, ordering, and multiplicity of an argument pin must be the same as the corresponding attribute of the signal.\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "not used/implemented as of Capella",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSendSignalAction_Target(), 
		   source, 
		   new String[] {
			 "description", "The target object to which the signal is sent.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSendSignalAction_Signal(), 
		   source, 
		   new String[] {
			 "description", "The type of signal transmitted to the target object.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (callActionEClass, 
		   source, 
		   new String[] {
			 "description", "CallAction is an abstract class for actions that invoke behavior and receive return values\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "- Only synchronous call actions can have result pins.\r\n- The number and order of argument pins must be the same as the number and order of parameters of the invoked behavior\r\nor behavioral feature. Pins are matched to parameters by order.\r\n- The type, ordering, and multiplicity of an argument pin must be the same as the corresponding parameter of the behavior\r\nor behavioral feature.\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCallAction_Results(), 
		   source, 
		   new String[] {
			 "description", "A list of output pins where the results of performing the invocation are placed\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (callBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "description", "CallBehaviorAction is a call action that invokes a behavior directly rather than invoking a behavioral feature that, in turn,\r\nresults in the invocation of that behavior. The argument values of the action are available to the execution of the invoked\r\nbehavior. For synchronous calls the execution of the call behavior action waits until the execution of the invoked behavior\r\ncompletes and a result is returned on its output pin. The action completes immediately without a result, if the call is\r\nasynchronous.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "- The number of argument pins and the number of parameters of the behavior of type in and in-out must be equal.\r\n- The number of result pins and the number of parameters of the behavior of type return, out, and in-out must be equal.\r\n- The type, ordering, and multiplicity of an argument or result pin is derived from the corresponding parameter of thebehavior.\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCallBehaviorAction_Behavior(), 
		   source, 
		   new String[] {
			 "description", "The invoked behavior. It must be capable of accepting and returning control\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (objectNodeEClass, 
		   source, 
		   new String[] {
			 "description", "An object node is an activity node that indicates an instance of a particular classifier, possibly in a particular state, may\r\nbe available at a particular point in the activity\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "- All edges coming into or going out of object nodes must be object flow edges.\r\n- Object nodes are not unique typed elements.\r\nisUnique = false\r\n- If an object node has a selection behavior, then the ordering of the object node is ordered and vice versa.\r\n- A selection behavior has one input parameter and one output parameter. The input parameter must be a bag of elements of\r\nthe same type as the object node or a supertype of the type of object node. The output parameter must be the same or a\r\nsubtype of the type of object node. The behavior cannot have side effects.\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "for the SysML profile, it will make sense to use the SysML stereotypes \"no buffer\" and \"overwrite\" over a UML ObjectNode (p99 and 100 of SysML spec)",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getObjectNode_IsControlType(), 
		   source, 
		   new String[] {
			 "description", "Tells whether the type of the object node is to be treated as control\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getObjectNode_KindOfNode(), 
		   source, 
		   new String[] {
			 "description", "characterizes the node",
			 "constraints", "none",
			 "type", "refer to ObjectNodeKind enumeration",
			 "comment/notes", "this field does not exist in UML but the related notion exists in SysML"
		   });	
		addAnnotation
		  (getObjectNode_Ordering(), 
		   source, 
		   new String[] {
			 "description", "Tells whether and how the tokens in the object node are ordered for selection to traverse edges outgoing from the\r\nobject node\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "Refer to ObjectNodeOrderingKind enumeration",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getObjectNode_UpperBound(), 
		   source, 
		   new String[] {
			 "description", "The maximum number of tokens allowed in the node. Objects cannot flow into the node if the upper bound is\r\nreached.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getObjectNode_InState(), 
		   source, 
		   new String[] {
			 "description", "The required states of the object available at this point in the activity\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getObjectNode_Selection(), 
		   source, 
		   new String[] {
			 "description", "Selects tokens for outgoing edges.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (pinEClass, 
		   source, 
		   new String[] {
			 "description", "A pin is a typed element and multiplicity element that provides values to actions and accepts result values from them\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "If the action is an invocation action, the number and types of pins must be the same as the number of parameters and\r\ntypes of the invoked behavior or behavioral feature. Pins are matched to parameters by order\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPin_IsControl(), 
		   source, 
		   new String[] {
			 "description", "Tells whether the pins provide data to the actions, or just controls when it executes it.\r\n[source: UML superstructure v2.2]\r\n",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (inputPinEClass, 
		   source, 
		   new String[] {
			 "description", "An input pin is a pin that holds input values to be consumed by an action\r\n[source: UML superstructure v2.2]\r\n\r\nAn action input pin is a kind of pin that executes an action to determine the values to input to another.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInputPin_InputEvaluationAction(), 
		   source, 
		   new String[] {
			 "description", "The action used to provide values\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (valuePinEClass, 
		   source, 
		   new String[] {
			 "description", "A value pin is an input pin that provides a value by evaluating a value specification\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented, as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getValuePin_Value(), 
		   source, 
		   new String[] {
			 "description", "Value that the pin will provide\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (outputPinEClass, 
		   source, 
		   new String[] {
			 "description", "An output pin is a pin that holds output values produced by an action\r\n[source: UML superstructure v2.2]\r\n\r\nAn action input pin is a kind of pin that executes an action to determine the values to input to another.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
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
		  (getAbstractActivity_IsReadOnly(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractActivity_IsSingleExecution(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_KindOfRate(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Rate(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Probability(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Source(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Guard(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_Weight(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getObjectFlow_IsMulticast(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getObjectFlow_IsMultireceive(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityPartition_IsDimension(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityPartition_IsExternal(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_Outgoing(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_Incoming(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractAction_Inputs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractAction_Outputs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAcceptEventAction_IsUnmarshall(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getObjectNode_IsControlType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getObjectNode_KindOfNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getObjectNode_Ordering(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getObjectNode_UpperBound(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getObjectNode_InState(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getObjectNode_Selection(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPin_IsControl(), 
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
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMappingAnnotations() {
		String source = "http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping";	
		addAnnotation
		  (abstractActivityEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Activity",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractActivity_IsReadOnly(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Activity::isReadOnly",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractActivity_IsSingleExecution(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Activity::isSingleExecution",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractActivity_OwnedNodes(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Activity::node",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getAbstractActivity_OwnedEdges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Activity::edge",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getAbstractActivity_OwnedGroups(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Activity::group",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getAbstractActivity_OwnedStructuredNodes(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exceptionHandlerEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ExceptionHandler",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExceptionHandler_ProtectedNode(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ExceptionHandler::protectedNode",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExceptionHandler_HandlerBody(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ExceptionHandler::handlerBody",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExceptionHandler_ExceptionInput(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ExceptionHandler::exceptionInput",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExceptionHandler_ExceptionTypes(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ExceptionHandler::exceptionType",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (activityGroupEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ActivityGroup",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityGroup_SuperGroup(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityGroup::superGroup#keyword::none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityGroup_SubGroups(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityGroup::subgroup#keyword::none",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getActivityGroup_OwnedNodes(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityGroup::containedNode#keyword::none",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getActivityGroup_OwnedEdges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityGroup::containedEdge#keyword::none",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (interruptibleActivityRegionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::InterruptibleActivityRegion",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterruptibleActivityRegion_InterruptingEdges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::InterruptibleActivityRegion::interruptingEdge",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNodeOrderingKind",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNodeOrderingKind::FIFO",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNodeOrderingKind::LIFO",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNodeOrderingKind::ordered",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (objectNodeOrderingKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNodeOrderingKind::unordered",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (objectNodeKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", ""
		   });	
		addAnnotation
		  (objectNodeKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (objectNodeKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (objectNodeKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (activityEdgeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ActivityEdge",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_KindOfRate(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "Application of stereotypes that inherits from the SysML::Activities::Rate stereotype.\r\nIt can be either SysML::Activities::Continuous or SysML::Activities::Discrete.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_InActivityPartition(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_InInterruptibleRegion(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_InStructuredNode(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Rate(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "Application of the SysML::Activities::Rate stereotype.\r\nSysML::Activities::Rate::rate",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Probability(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "Application of the SysML::Activities::Probability stereotype.\r\nSysML::Activities::Probability::probability",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Target(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityEdge::target",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Source(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityEdge::source",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Guard(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityEdge::guard",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Weight(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityEdge::weight",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityEdge_Interrupts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityEdge::interrupts",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (controlFlowEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ControlFlow",
			 "constraints", "none"
		   });	
		addAnnotation
		  (objectFlowEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ObjectFlow",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getObjectFlow_IsMulticast(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectFlow:isMulticast",
			 "explanation", "",
			 "constraints", "The cardinality of uml::ObjectFlow::isMulticast is [1..1]."
		   });	
		addAnnotation
		  (getObjectFlow_IsMultireceive(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectFlow::isMultireceive",
			 "explanation", "none",
			 "constraints", "Cardinality of uml::ObjectFlow::isMultiReceive is [1..1]"
		   });	
		addAnnotation
		  (getObjectFlow_Transformation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectFlow::transformation",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getObjectFlow_Selection(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectFlow::selection",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (activityPartitionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ActivityPartition",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityPartition_IsDimension(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityPartition::isDimension",
			 "explanation", "none",
			 "constraints", "Cardinality of uml::ActivityPartition::isDimension is [1..1]"
		   });	
		addAnnotation
		  (getActivityPartition_IsExternal(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityPartition::isExternal",
			 "explanation", "none",
			 "constraints", "Cardinality of uml::ActivityPartition::isExternal is [1..1]"
		   });	
		addAnnotation
		  (getActivityPartition_RepresentedElement(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityPartition::represents",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityPartition_SuperPartition(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityPartition_SubPartitions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ActivityPartition::subpartition",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (activityExchangeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityExchange_RealizingActivityFlows(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (activityNodeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ActivityNode",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityNode_InActivityPartition(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityNode_InInterruptibleRegion(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityNode_InStructuredNode(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityNode_Outgoing(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityNode_Incoming(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (executableNodeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "should be on uml::ExecutableNode, but Activity",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExecutableNode_OwnedHandlers(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ExecutableNode::handler",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (structuredActivityNodeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::StructuredActivityNode",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractActionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Activity",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractAction_LocalPrecondition(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Behavior::precondition",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractAction_LocalPostcondition(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Behavior::postcondition",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractAction_Context(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Behavior::context#keyword::none",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractAction_Inputs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Activity::node",
			 "explanation", "mapped to either InputPin or ActivityParameterNode, depending on whether the associated function is an Activity, or a callBehaviorAction to an Activity",
			 "constraints", "uml::Activity::node elements on which activity::InputPin stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getAbstractAction_Outputs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Activity::node",
			 "explanation", "mapped to either OutputPin or ActivityParameterNode, depending on whether the associated function is an Activity, or a callBehaviorAction to an Activity",
			 "constraints", "uml::Activity::node elements on which activity::OutputPin stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (acceptEventActionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::AcceptEventAction",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAcceptEventAction_IsUnmarshall(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::AcceptEventAction::isUnmarshall",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAcceptEventAction_Result(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::AcceptEventAction::result",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (invocationActionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::InvocationAction",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInvocationAction_Arguments(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::InvocationAction::argument",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (sendSignalActionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::SendSignalAction",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSendSignalAction_Target(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::SendSignalAction::target",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSendSignalAction_Signal(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::SendSignalAction::signal",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (callActionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::CallAction",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCallAction_Results(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::CallAction::result",
			 "explanation", "",
			 "constraints", ""
		   });	
		addAnnotation
		  (callBehaviorActionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::CallBehaviorAction",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCallBehaviorAction_Behavior(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "cannot map to uml::CallBehaviorAction::behavior since it just does not match (refers to different things)",
			 "constraints", "none"
		   });	
		addAnnotation
		  (objectNodeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ObjectNode",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getObjectNode_IsControlType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNode::isControlType",
			 "explanation", "none",
			 "constraints", "Cardinality of uml::ObjectNode::isControlType is [1..1]"
		   });	
		addAnnotation
		  (getObjectNode_KindOfNode(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getObjectNode_Ordering(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNode::ordering",
			 "explanation", "none",
			 "constraints", "Cardinality of uml::ObjectNode::ordering is [1..1]"
		   });	
		addAnnotation
		  (getObjectNode_UpperBound(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNode::upperBound",
			 "explanation", "none",
			 "constraints", "Cardinality of uml::ObjectNode::upperBound is [1..1]"
		   });	
		addAnnotation
		  (getObjectNode_InState(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNode::inState",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getObjectNode_Selection(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ObjectNode::selection",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (pinEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Pin",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPin_IsControl(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "Cardinality of uml::Pin::isControl is [1..1]"
		   });	
		addAnnotation
		  (inputPinEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::InputPin",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInputPin_InputEvaluationAction(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "This association can be filled only if extended metaclass is ActionInputPin"
		   });	
		addAnnotation
		  (valuePinEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ValuePin",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getValuePin_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ValuePin::value",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (outputPinEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::OutputPin",
			 "constraints", "none"
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
		  (getAbstractActivity_OwnedStructuredNodes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_InActivityPartition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_InInterruptibleRegion(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_InStructuredNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityPartition_SuperPartition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityPartition_SubPartitions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityExchange_RealizingActivityFlows(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_InActivityPartition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_InInterruptibleRegion(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_InStructuredNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_Outgoing(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_Incoming(), 
		   source, 
		   new String[] {
		   });
	}

} //ActivityPackageImpl
