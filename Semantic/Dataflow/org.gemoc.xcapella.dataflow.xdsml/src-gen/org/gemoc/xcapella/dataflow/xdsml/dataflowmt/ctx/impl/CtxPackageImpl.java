/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl;

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
public class CtxPackageImpl extends EPackageImpl implements CtxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFunctionPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemCommunicationHookEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorCapabilityInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorMissionInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemMissionInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityExploitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemCapabilityInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalActorRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalAnalysisRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalEntityRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemContextEClass = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CtxPackageImpl() {
		super(eNS_URI, CtxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CtxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CtxPackage init() {
		if (isInited) return (CtxPackage)EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI);

		// Obtain or create and register package
		CtxPackageImpl theCtxPackage = (CtxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CtxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CtxPackageImpl());

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
		FaPackageImpl theFaPackage = (FaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI) instanceof FaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI) : FaPackage.eINSTANCE);
		LaPackageImpl theLaPackage = (LaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI) instanceof LaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI) : LaPackage.eINSTANCE);
		EpbsPackageImpl theEpbsPackage = (EpbsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI) instanceof EpbsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI) : EpbsPackage.eINSTANCE);
		CapellacommonPackageImpl theCapellacommonPackage = (CapellacommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI) instanceof CapellacommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI) : CapellacommonPackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) : DatavaluePackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		theCtxPackage.createPackageContents();
		theSharedmodelPackage.createPackageContents();
		theEmdePackage.createPackageContents();
		theOaPackage.createPackageContents();
		theCapellacorePackage.createPackageContents();
		thePaPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theCapellamodellerPackage.createPackageContents();
		theCsPackage.createPackageContents();
		theModellingcorePackage.createPackageContents();
		theFaPackage.createPackageContents();
		theLaPackage.createPackageContents();
		theEpbsPackage.createPackageContents();
		theCapellacommonPackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theDatavaluePackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		theCtxPackage.initializePackageContents();
		theSharedmodelPackage.initializePackageContents();
		theEmdePackage.initializePackageContents();
		theOaPackage.initializePackageContents();
		theCapellacorePackage.initializePackageContents();
		thePaPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theCapellamodellerPackage.initializePackageContents();
		theCsPackage.initializePackageContents();
		theModellingcorePackage.initializePackageContents();
		theFaPackage.initializePackageContents();
		theLaPackage.initializePackageContents();
		theEpbsPackage.initializePackageContents();
		theCapellacommonPackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theDatavaluePackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCtxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CtxPackage.eNS_URI, theCtxPackage);
		return theCtxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemAnalysis() {
		return systemAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_OwnedSystemContext() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_OwnedSystem() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_OwnedActorPkg() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_OwnedMissionPkg() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_ContainedCapabilityPkg() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_ContainedSystemFunctionPkg() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_OwnedOperationalAnalysisRealizations() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_AllocatedOperationalAnalysisRealizations() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_AllocatedOperationalAnalyses() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemAnalysis_AllocatingLogicalArchitectures() {
		return (EReference)systemAnalysisEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ContributedCapabilities() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ParticipationsInCapabilities() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ContributedMissions() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ParticipationsInMissions() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ExternalCommunication() {
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_OwnedEntityRealizations() {
		return (EReference)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_AllocatedEntityRealizations() {
		return (EReference)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_AllocatedSystemFunctions() {
		return (EReference)systemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_RealizedEntities() {
		return (EReference)systemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_RealizingLogicalComponents() {
		return (EReference)systemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemFunction() {
		return systemFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_OwnedSystemFunctionPkgs() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_AllocatorActors() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_AllocatorSystems() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_RealizedOperationalActivities() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_RealizingLogicalFunctions() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_ContainedSystemFunctions() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunction_ChildrenSystemFunctions() {
		return (EReference)systemFunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemFunctionPkg() {
		return systemFunctionPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunctionPkg_OwnedSystemFunctions() {
		return (EReference)systemFunctionPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunctionPkg_OwnedSystemFunctionPkgs() {
		return (EReference)systemFunctionPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemCommunicationHook() {
		return systemCommunicationHookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemCommunicationHook_Communication() {
		return (EReference)systemCommunicationHookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemCommunicationHook_Type() {
		return (EReference)systemCommunicationHookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemCommunication() {
		return systemCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemCommunication_Ends() {
		return (EReference)systemCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ParticipationsInMissions() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ParticipationsInCapabilities() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ParticipationsInCapabilityRealizations() {
		return (EReference)actorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ContributedMissions() {
		return (EReference)actorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_ContributedCapabilities() {
		return (EReference)actorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_SystemCommunication() {
		return (EReference)actorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_OwnedOperationalActorRealizations() {
		return (EReference)actorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_OwnedOperationalEntityRealizations() {
		return (EReference)actorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_AllocatedSystemFunctions() {
		return (EReference)actorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_RealizedEntities() {
		return (EReference)actorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_RealizedOperationalActors() {
		return (EReference)actorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_RealizingLogicalActors() {
		return (EReference)actorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorCapabilityInvolvement() {
		return actorCapabilityInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorCapabilityInvolvement_Actor() {
		return (EReference)actorCapabilityInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorCapabilityInvolvement_Capability() {
		return (EReference)actorCapabilityInvolvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorMissionInvolvement() {
		return actorMissionInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorMissionInvolvement_Actor() {
		return (EReference)actorMissionInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorMissionInvolvement_Mission() {
		return (EReference)actorMissionInvolvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorPkg() {
		return actorPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorPkg_OwnedActors() {
		return (EReference)actorPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorPkg_OwnedActorPkgs() {
		return (EReference)actorPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorPkg_OwnedSystemCommunication() {
		return (EReference)actorPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_OwnedActorMissionInvolvements() {
		return (EReference)missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_OwnedSystemMissionInvolvement() {
		return (EReference)missionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_OwnedCapabilityExploitations() {
		return (EReference)missionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_ParticipatingActors() {
		return (EReference)missionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_ParticipatingSystem() {
		return (EReference)missionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_InvolvedActors() {
		return (EReference)missionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_InvolvedSystem() {
		return (EReference)missionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMission_ExploitedCapabilities() {
		return (EReference)missionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissionPkg() {
		return missionPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissionPkg_OwnedMissionPkgs() {
		return (EReference)missionPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissionPkg_OwnedMissions() {
		return (EReference)missionPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemMissionInvolvement() {
		return systemMissionInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemMissionInvolvement_Mission() {
		return (EReference)systemMissionInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemMissionInvolvement_System() {
		return (EReference)systemMissionInvolvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_OwnedActorCapabilityInvolvements() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_OwnedSystemCapabilityInvolvement() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_InvolvedActors() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_InvolvedSystem() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_ParticipatingActors() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_ParticipatingSystem() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_Purposes() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_PurposeMissions() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_RealizedOperationalCapabilities() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapability_RealizingCapabilityRealizations() {
		return (EReference)capabilityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityExploitation() {
		return capabilityExploitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityExploitation_Mission() {
		return (EReference)capabilityExploitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityExploitation_Capability() {
		return (EReference)capabilityExploitationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityPkg() {
		return capabilityPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityPkg_OwnedCapabilities() {
		return (EReference)capabilityPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityPkg_OwnedCapabilityPkgs() {
		return (EReference)capabilityPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemCapabilityInvolvement() {
		return systemCapabilityInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemCapabilityInvolvement_Capability() {
		return (EReference)systemCapabilityInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemCapabilityInvolvement_System() {
		return (EReference)systemCapabilityInvolvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalActorRealization() {
		return operationalActorRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalAnalysisRealization() {
		return operationalAnalysisRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalEntityRealization() {
		return operationalEntityRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemContext() {
		return systemContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxFactory getCtxFactory() {
		return (CtxFactory)getEFactoryInstance();
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
		systemAnalysisEClass = createEClass(SYSTEM_ANALYSIS);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__OWNED_SYSTEM);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__OWNED_ACTOR_PKG);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__OWNED_MISSION_PKG);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSIS_REALIZATIONS);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES);
		createEReference(systemAnalysisEClass, SYSTEM_ANALYSIS__ALLOCATING_LOGICAL_ARCHITECTURES);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__CONTRIBUTED_CAPABILITIES);
		createEReference(systemEClass, SYSTEM__PARTICIPATIONS_IN_CAPABILITIES);
		createEReference(systemEClass, SYSTEM__CONTRIBUTED_MISSIONS);
		createEReference(systemEClass, SYSTEM__PARTICIPATIONS_IN_MISSIONS);
		createEReference(systemEClass, SYSTEM__EXTERNAL_COMMUNICATION);
		createEReference(systemEClass, SYSTEM__OWNED_ENTITY_REALIZATIONS);
		createEReference(systemEClass, SYSTEM__ALLOCATED_ENTITY_REALIZATIONS);
		createEReference(systemEClass, SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS);
		createEReference(systemEClass, SYSTEM__REALIZED_ENTITIES);
		createEReference(systemEClass, SYSTEM__REALIZING_LOGICAL_COMPONENTS);

		systemFunctionEClass = createEClass(SYSTEM_FUNCTION);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__ALLOCATOR_ACTORS);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__ALLOCATOR_SYSTEMS);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS);
		createEReference(systemFunctionEClass, SYSTEM_FUNCTION__CHILDREN_SYSTEM_FUNCTIONS);

		systemFunctionPkgEClass = createEClass(SYSTEM_FUNCTION_PKG);
		createEReference(systemFunctionPkgEClass, SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTIONS);
		createEReference(systemFunctionPkgEClass, SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTION_PKGS);

		systemCommunicationHookEClass = createEClass(SYSTEM_COMMUNICATION_HOOK);
		createEReference(systemCommunicationHookEClass, SYSTEM_COMMUNICATION_HOOK__COMMUNICATION);
		createEReference(systemCommunicationHookEClass, SYSTEM_COMMUNICATION_HOOK__TYPE);

		systemCommunicationEClass = createEClass(SYSTEM_COMMUNICATION);
		createEReference(systemCommunicationEClass, SYSTEM_COMMUNICATION__ENDS);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__PARTICIPATIONS_IN_MISSIONS);
		createEReference(actorEClass, ACTOR__PARTICIPATIONS_IN_CAPABILITIES);
		createEReference(actorEClass, ACTOR__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS);
		createEReference(actorEClass, ACTOR__CONTRIBUTED_MISSIONS);
		createEReference(actorEClass, ACTOR__CONTRIBUTED_CAPABILITIES);
		createEReference(actorEClass, ACTOR__SYSTEM_COMMUNICATION);
		createEReference(actorEClass, ACTOR__OWNED_OPERATIONAL_ACTOR_REALIZATIONS);
		createEReference(actorEClass, ACTOR__OWNED_OPERATIONAL_ENTITY_REALIZATIONS);
		createEReference(actorEClass, ACTOR__ALLOCATED_SYSTEM_FUNCTIONS);
		createEReference(actorEClass, ACTOR__REALIZED_ENTITIES);
		createEReference(actorEClass, ACTOR__REALIZED_OPERATIONAL_ACTORS);
		createEReference(actorEClass, ACTOR__REALIZING_LOGICAL_ACTORS);

		actorCapabilityInvolvementEClass = createEClass(ACTOR_CAPABILITY_INVOLVEMENT);
		createEReference(actorCapabilityInvolvementEClass, ACTOR_CAPABILITY_INVOLVEMENT__ACTOR);
		createEReference(actorCapabilityInvolvementEClass, ACTOR_CAPABILITY_INVOLVEMENT__CAPABILITY);

		actorMissionInvolvementEClass = createEClass(ACTOR_MISSION_INVOLVEMENT);
		createEReference(actorMissionInvolvementEClass, ACTOR_MISSION_INVOLVEMENT__ACTOR);
		createEReference(actorMissionInvolvementEClass, ACTOR_MISSION_INVOLVEMENT__MISSION);

		actorPkgEClass = createEClass(ACTOR_PKG);
		createEReference(actorPkgEClass, ACTOR_PKG__OWNED_ACTORS);
		createEReference(actorPkgEClass, ACTOR_PKG__OWNED_ACTOR_PKGS);
		createEReference(actorPkgEClass, ACTOR_PKG__OWNED_SYSTEM_COMMUNICATION);

		missionEClass = createEClass(MISSION);
		createEReference(missionEClass, MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS);
		createEReference(missionEClass, MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT);
		createEReference(missionEClass, MISSION__OWNED_CAPABILITY_EXPLOITATIONS);
		createEReference(missionEClass, MISSION__PARTICIPATING_ACTORS);
		createEReference(missionEClass, MISSION__PARTICIPATING_SYSTEM);
		createEReference(missionEClass, MISSION__INVOLVED_ACTORS);
		createEReference(missionEClass, MISSION__INVOLVED_SYSTEM);
		createEReference(missionEClass, MISSION__EXPLOITED_CAPABILITIES);

		missionPkgEClass = createEClass(MISSION_PKG);
		createEReference(missionPkgEClass, MISSION_PKG__OWNED_MISSION_PKGS);
		createEReference(missionPkgEClass, MISSION_PKG__OWNED_MISSIONS);

		systemMissionInvolvementEClass = createEClass(SYSTEM_MISSION_INVOLVEMENT);
		createEReference(systemMissionInvolvementEClass, SYSTEM_MISSION_INVOLVEMENT__MISSION);
		createEReference(systemMissionInvolvementEClass, SYSTEM_MISSION_INVOLVEMENT__SYSTEM);

		capabilityEClass = createEClass(CAPABILITY);
		createEReference(capabilityEClass, CAPABILITY__OWNED_ACTOR_CAPABILITY_INVOLVEMENTS);
		createEReference(capabilityEClass, CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT);
		createEReference(capabilityEClass, CAPABILITY__INVOLVED_ACTORS);
		createEReference(capabilityEClass, CAPABILITY__INVOLVED_SYSTEM);
		createEReference(capabilityEClass, CAPABILITY__PARTICIPATING_ACTORS);
		createEReference(capabilityEClass, CAPABILITY__PARTICIPATING_SYSTEM);
		createEReference(capabilityEClass, CAPABILITY__PURPOSES);
		createEReference(capabilityEClass, CAPABILITY__PURPOSE_MISSIONS);
		createEReference(capabilityEClass, CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES);
		createEReference(capabilityEClass, CAPABILITY__REALIZING_CAPABILITY_REALIZATIONS);

		capabilityExploitationEClass = createEClass(CAPABILITY_EXPLOITATION);
		createEReference(capabilityExploitationEClass, CAPABILITY_EXPLOITATION__MISSION);
		createEReference(capabilityExploitationEClass, CAPABILITY_EXPLOITATION__CAPABILITY);

		capabilityPkgEClass = createEClass(CAPABILITY_PKG);
		createEReference(capabilityPkgEClass, CAPABILITY_PKG__OWNED_CAPABILITIES);
		createEReference(capabilityPkgEClass, CAPABILITY_PKG__OWNED_CAPABILITY_PKGS);

		systemCapabilityInvolvementEClass = createEClass(SYSTEM_CAPABILITY_INVOLVEMENT);
		createEReference(systemCapabilityInvolvementEClass, SYSTEM_CAPABILITY_INVOLVEMENT__CAPABILITY);
		createEReference(systemCapabilityInvolvementEClass, SYSTEM_CAPABILITY_INVOLVEMENT__SYSTEM);

		operationalActorRealizationEClass = createEClass(OPERATIONAL_ACTOR_REALIZATION);

		operationalAnalysisRealizationEClass = createEClass(OPERATIONAL_ANALYSIS_REALIZATION);

		operationalEntityRealizationEClass = createEClass(OPERATIONAL_ENTITY_REALIZATION);

		systemContextEClass = createEClass(SYSTEM_CONTEXT);
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
		CsPackage theCsPackage = (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);
		OaPackage theOaPackage = (OaPackage)EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI);
		LaPackage theLaPackage = (LaPackage)EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI);
		CapellacommonPackage theCapellacommonPackage = (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);
		FaPackage theFaPackage = (FaPackage)EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);
		CapellacorePackage theCapellacorePackage = (CapellacorePackage)EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI);
		InteractionPackage theInteractionPackage = (InteractionPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemAnalysisEClass.getESuperTypes().add(theCsPackage.getComponentArchitecture());
		systemEClass.getESuperTypes().add(theCsPackage.getComponent());
		systemEClass.getESuperTypes().add(theCapellacommonPackage.getCapabilityRealizationInvolvedElement());
		systemFunctionEClass.getESuperTypes().add(theFaPackage.getAbstractFunction());
		systemFunctionPkgEClass.getESuperTypes().add(theFaPackage.getFunctionPkg());
		systemCommunicationHookEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		systemCommunicationEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		actorEClass.getESuperTypes().add(theCsPackage.getAbstractActor());
		actorCapabilityInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvement());
		actorMissionInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvement());
		actorPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		missionEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		missionEClass.getESuperTypes().add(theCapellacorePackage.getInvolverElement());
		missionPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		systemMissionInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvement());
		capabilityEClass.getESuperTypes().add(theInteractionPackage.getAbstractCapability());
		capabilityExploitationEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		capabilityPkgEClass.getESuperTypes().add(theCapellacommonPackage.getAbstractCapabilityPkg());
		systemCapabilityInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvement());
		operationalActorRealizationEClass.getESuperTypes().add(theCsPackage.getComponentAllocation());
		operationalAnalysisRealizationEClass.getESuperTypes().add(theCsPackage.getArchitectureAllocation());
		operationalEntityRealizationEClass.getESuperTypes().add(theCsPackage.getComponentAllocation());
		systemContextEClass.getESuperTypes().add(theCsPackage.getComponentContext());

		// Initialize classes and features; add operations and parameters
		initEClass(systemAnalysisEClass, SystemAnalysis.class, "SystemAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemAnalysis_OwnedSystemContext(), this.getSystemContext(), null, "ownedSystemContext", null, 0, 1, SystemAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAnalysis_OwnedSystem(), this.getSystem(), null, "ownedSystem", null, 1, 1, SystemAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAnalysis_OwnedActorPkg(), this.getActorPkg(), null, "ownedActorPkg", null, 0, 1, SystemAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAnalysis_OwnedMissionPkg(), this.getMissionPkg(), null, "ownedMissionPkg", null, 0, 1, SystemAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAnalysis_ContainedCapabilityPkg(), this.getCapabilityPkg(), null, "containedCapabilityPkg", null, 0, 1, SystemAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAnalysis_ContainedSystemFunctionPkg(), this.getSystemFunctionPkg(), null, "containedSystemFunctionPkg", null, 0, 1, SystemAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAnalysis_OwnedOperationalAnalysisRealizations(), this.getOperationalAnalysisRealization(), null, "ownedOperationalAnalysisRealizations", null, 0, -1, SystemAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAnalysis_AllocatedOperationalAnalysisRealizations(), this.getOperationalAnalysisRealization(), null, "allocatedOperationalAnalysisRealizations", null, 0, -1, SystemAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAnalysis_AllocatedOperationalAnalyses(), theOaPackage.getOperationalAnalysis(), theOaPackage.getOperationalAnalysis_AllocatingSystemAnalyses(), "allocatedOperationalAnalyses", null, 0, -1, SystemAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAnalysis_AllocatingLogicalArchitectures(), theLaPackage.getLogicalArchitecture(), theLaPackage.getLogicalArchitecture_AllocatedSystemAnalyses(), "allocatingLogicalArchitectures", null, 0, -1, SystemAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_ContributedCapabilities(), this.getCapability(), this.getCapability_ParticipatingSystem(), "contributedCapabilities", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ParticipationsInCapabilities(), this.getSystemCapabilityInvolvement(), this.getSystemCapabilityInvolvement_System(), "participationsInCapabilities", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ContributedMissions(), this.getMission(), this.getMission_ParticipatingSystem(), "contributedMissions", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ParticipationsInMissions(), this.getSystemMissionInvolvement(), this.getSystemMissionInvolvement_System(), "participationsInMissions", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ExternalCommunication(), this.getSystemCommunicationHook(), null, "externalCommunication", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_OwnedEntityRealizations(), this.getOperationalEntityRealization(), null, "ownedEntityRealizations", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_AllocatedEntityRealizations(), this.getOperationalEntityRealization(), null, "allocatedEntityRealizations", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_AllocatedSystemFunctions(), this.getSystemFunction(), this.getSystemFunction_AllocatorSystems(), "allocatedSystemFunctions", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_RealizedEntities(), theOaPackage.getEntity(), null, "realizedEntities", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_RealizingLogicalComponents(), theLaPackage.getLogicalComponent(), theLaPackage.getLogicalComponent_RealizedSystems(), "realizingLogicalComponents", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemFunctionEClass, SystemFunction.class, "SystemFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemFunction_OwnedSystemFunctionPkgs(), this.getSystemFunctionPkg(), null, "ownedSystemFunctionPkgs", null, 0, -1, SystemFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_AllocatorActors(), this.getActor(), this.getActor_AllocatedSystemFunctions(), "allocatorActors", null, 0, -1, SystemFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_AllocatorSystems(), this.getSystem(), this.getSystem_AllocatedSystemFunctions(), "allocatorSystems", null, 0, -1, SystemFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_RealizedOperationalActivities(), theOaPackage.getOperationalActivity(), theOaPackage.getOperationalActivity_RealizingSystemFunctions(), "realizedOperationalActivities", null, 0, -1, SystemFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_RealizingLogicalFunctions(), theLaPackage.getLogicalFunction(), theLaPackage.getLogicalFunction_RealizedSystemFunctions(), "realizingLogicalFunctions", null, 0, -1, SystemFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_ContainedSystemFunctions(), this.getSystemFunction(), null, "containedSystemFunctions", null, 0, -1, SystemFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunction_ChildrenSystemFunctions(), this.getSystemFunction(), null, "childrenSystemFunctions", null, 0, -1, SystemFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemFunctionPkgEClass, SystemFunctionPkg.class, "SystemFunctionPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemFunctionPkg_OwnedSystemFunctions(), this.getSystemFunction(), null, "ownedSystemFunctions", null, 0, -1, SystemFunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemFunctionPkg_OwnedSystemFunctionPkgs(), this.getSystemFunctionPkg(), null, "ownedSystemFunctionPkgs", null, 0, -1, SystemFunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemCommunicationHookEClass, SystemCommunicationHook.class, "SystemCommunicationHook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemCommunicationHook_Communication(), this.getSystemCommunication(), null, "communication", null, 0, 1, SystemCommunicationHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemCommunicationHook_Type(), theCsPackage.getComponent(), null, "type", null, 0, 1, SystemCommunicationHook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemCommunicationEClass, SystemCommunication.class, "SystemCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemCommunication_Ends(), this.getSystemCommunicationHook(), null, "ends", null, 2, 2, SystemCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_ParticipationsInMissions(), this.getActorMissionInvolvement(), this.getActorMissionInvolvement_Actor(), "participationsInMissions", null, 0, -1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ParticipationsInCapabilities(), this.getActorCapabilityInvolvement(), this.getActorCapabilityInvolvement_Actor(), "participationsInCapabilities", null, 0, -1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ParticipationsInCapabilityRealizations(), theCsPackage.getActorCapabilityRealizationInvolvement(), null, "participationsInCapabilityRealizations", null, 0, -1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ContributedMissions(), this.getMission(), this.getMission_ParticipatingActors(), "contributedMissions", null, 0, -1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActor_ContributedCapabilities(), this.getCapability(), this.getCapability_ParticipatingActors(), "contributedCapabilities", null, 0, -1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActor_SystemCommunication(), this.getSystemCommunicationHook(), null, "systemCommunication", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_OwnedOperationalActorRealizations(), this.getOperationalActorRealization(), null, "ownedOperationalActorRealizations", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_OwnedOperationalEntityRealizations(), this.getOperationalEntityRealization(), null, "ownedOperationalEntityRealizations", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_AllocatedSystemFunctions(), this.getSystemFunction(), this.getSystemFunction_AllocatorActors(), "allocatedSystemFunctions", null, 0, -1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActor_RealizedEntities(), theOaPackage.getEntity(), theOaPackage.getEntity_RealizingActors(), "realizedEntities", null, 0, -1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActor_RealizedOperationalActors(), theOaPackage.getOperationalActor(), theOaPackage.getOperationalActor_RealizingSystemActors(), "realizedOperationalActors", null, 0, -1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActor_RealizingLogicalActors(), theLaPackage.getLogicalActor(), theLaPackage.getLogicalActor_RealizedSystemActors(), "realizingLogicalActors", null, 0, -1, Actor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(actorCapabilityInvolvementEClass, ActorCapabilityInvolvement.class, "ActorCapabilityInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorCapabilityInvolvement_Actor(), this.getActor(), this.getActor_ParticipationsInCapabilities(), "actor", null, 1, 1, ActorCapabilityInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActorCapabilityInvolvement_Capability(), this.getCapability(), this.getCapability_InvolvedActors(), "capability", null, 1, 1, ActorCapabilityInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(actorMissionInvolvementEClass, ActorMissionInvolvement.class, "ActorMissionInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorMissionInvolvement_Actor(), this.getActor(), this.getActor_ParticipationsInMissions(), "actor", null, 1, 1, ActorMissionInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActorMissionInvolvement_Mission(), this.getMission(), this.getMission_InvolvedActors(), "mission", null, 1, 1, ActorMissionInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(actorPkgEClass, ActorPkg.class, "ActorPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorPkg_OwnedActors(), this.getActor(), null, "ownedActors", null, 0, -1, ActorPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorPkg_OwnedActorPkgs(), this.getActorPkg(), null, "ownedActorPkgs", null, 0, -1, ActorPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorPkg_OwnedSystemCommunication(), this.getSystemCommunication(), null, "ownedSystemCommunication", null, 0, -1, ActorPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMission_OwnedActorMissionInvolvements(), this.getActorMissionInvolvement(), null, "ownedActorMissionInvolvements", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_OwnedSystemMissionInvolvement(), this.getSystemMissionInvolvement(), null, "ownedSystemMissionInvolvement", null, 0, 1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_OwnedCapabilityExploitations(), this.getCapabilityExploitation(), null, "ownedCapabilityExploitations", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_ParticipatingActors(), this.getActor(), this.getActor_ContributedMissions(), "participatingActors", null, 0, -1, Mission.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMission_ParticipatingSystem(), this.getSystem(), this.getSystem_ContributedMissions(), "participatingSystem", null, 0, 1, Mission.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMission_InvolvedActors(), this.getActorMissionInvolvement(), this.getActorMissionInvolvement_Mission(), "involvedActors", null, 0, -1, Mission.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMission_InvolvedSystem(), this.getSystemMissionInvolvement(), this.getSystemMissionInvolvement_Mission(), "involvedSystem", null, 0, 1, Mission.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMission_ExploitedCapabilities(), this.getCapability(), this.getCapability_PurposeMissions(), "exploitedCapabilities", null, 0, -1, Mission.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(missionPkgEClass, MissionPkg.class, "MissionPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMissionPkg_OwnedMissionPkgs(), this.getMissionPkg(), null, "ownedMissionPkgs", null, 0, -1, MissionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMissionPkg_OwnedMissions(), this.getMission(), null, "ownedMissions", null, 0, -1, MissionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemMissionInvolvementEClass, SystemMissionInvolvement.class, "SystemMissionInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemMissionInvolvement_Mission(), this.getMission(), this.getMission_InvolvedSystem(), "mission", null, 1, 1, SystemMissionInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemMissionInvolvement_System(), this.getSystem(), this.getSystem_ParticipationsInMissions(), "system", null, 1, 1, SystemMissionInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapability_OwnedActorCapabilityInvolvements(), this.getActorCapabilityInvolvement(), null, "ownedActorCapabilityInvolvements", null, 0, -1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_OwnedSystemCapabilityInvolvement(), this.getSystemCapabilityInvolvement(), null, "ownedSystemCapabilityInvolvement", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_InvolvedActors(), this.getActorCapabilityInvolvement(), this.getActorCapabilityInvolvement_Capability(), "involvedActors", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_InvolvedSystem(), this.getSystemCapabilityInvolvement(), this.getSystemCapabilityInvolvement_Capability(), "involvedSystem", null, 0, 1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_ParticipatingActors(), this.getActor(), this.getActor_ContributedCapabilities(), "participatingActors", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_ParticipatingSystem(), this.getSystem(), this.getSystem_ContributedCapabilities(), "participatingSystem", null, 0, 1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_Purposes(), this.getCapabilityExploitation(), null, "purposes", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_PurposeMissions(), this.getMission(), this.getMission_ExploitedCapabilities(), "purposeMissions", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_RealizedOperationalCapabilities(), theOaPackage.getOperationalCapability(), theOaPackage.getOperationalCapability_RealizingCapabilities(), "realizedOperationalCapabilities", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapability_RealizingCapabilityRealizations(), theLaPackage.getCapabilityRealization(), theLaPackage.getCapabilityRealization_RealizedCapabilities(), "realizingCapabilityRealizations", null, 0, -1, Capability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(capabilityExploitationEClass, CapabilityExploitation.class, "CapabilityExploitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityExploitation_Mission(), this.getMission(), null, "mission", null, 1, 1, CapabilityExploitation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityExploitation_Capability(), this.getCapability(), null, "capability", null, 1, 1, CapabilityExploitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityPkgEClass, CapabilityPkg.class, "CapabilityPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityPkg_OwnedCapabilities(), this.getCapability(), null, "ownedCapabilities", null, 0, -1, CapabilityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityPkg_OwnedCapabilityPkgs(), this.getCapabilityPkg(), null, "ownedCapabilityPkgs", null, 0, -1, CapabilityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemCapabilityInvolvementEClass, SystemCapabilityInvolvement.class, "SystemCapabilityInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemCapabilityInvolvement_Capability(), this.getCapability(), this.getCapability_InvolvedSystem(), "capability", null, 1, 1, SystemCapabilityInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemCapabilityInvolvement_System(), this.getSystem(), this.getSystem_ParticipationsInCapabilities(), "system", null, 1, 1, SystemCapabilityInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operationalActorRealizationEClass, OperationalActorRealization.class, "OperationalActorRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationalAnalysisRealizationEClass, OperationalAnalysisRealization.class, "OperationalAnalysisRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationalEntityRealizationEClass, OperationalEntityRealization.class, "OperationalEntityRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemContextEClass, SystemContext.class, "SystemContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		// http://www.polarsys.org/capella/2007/BusinessInformation
		createBusinessInformationAnnotations();
		// http://www.polarsys.org/capella/2007/UML2Mapping
		createUML2MappingAnnotations();
		// http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping
		createMappingAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment
		createSegmentAnnotations();
		// http://www.polarsys.org/capella/derived
		createDerivedAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore
		createIgnoreAnnotations();
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
			 "description", "SystemAnalysis aims at defining the system context analysis modelling language. It is named ContextArchitecture due to MDSysE naming inheritance.\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "system",
			 "usage examples", "none",
			 "constraints", "This package depends on the model CompositeStructure.ecore\r\nThis package depends on the model Interaction.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (systemAnalysisEClass, 
		   source, 
		   new String[] {
			 "description", "Model describing functional and non-functional issues - functions & related items - associated to (created during) a modelling phase",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedSystemContext(), 
		   source, 
		   new String[] {
			 "description", "the \"context\" for this architecture, e.g. the parts that make the environnement of the system (actors, ...) , plus the system itself\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedSystem(), 
		   source, 
		   new String[] {
			 "description", "Reference to the system component\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedActorPkg(), 
		   source, 
		   new String[] {
			 "description", "Link to a package that contains system analysis actors\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedMissionPkg(), 
		   source, 
		   new String[] {
			 "description", "Link to the package that contains system analysis missions\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedOperationalAnalysisRealizations(), 
		   source, 
		   new String[] {
			 "description", "the realization links between Operational analysis and System analysis that are owned by this System analysis element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_AllocatedOperationalAnalysisRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) reference to operational analysis elements that this system analysis is realizing\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (systemEClass, 
		   source, 
		   new String[] {
			 "description", "An organized set of elements functioning as a unit.\r\n[source:SysML Glossary for SysML v1.0]\r\n\r\nAn element, with structure, that exhibits observable properties and behaviors.\r\n[source:UML for System Engineering RFP]\r\n\r\nSee UML-SysML block, part, component, item\r\n[source:Capella study]\r\n",
			 "usage guideline", "none",
			 "used in levels", "system",
			 "usage examples", "none",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystem_ContributedCapabilities(), 
		   source, 
		   new String[] {
			 "description", "the Capabilities to which this System contributes\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystem_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the links to Capabilities to which this System contributes\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystem_ContributedMissions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the Missions to which this System contributes\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystem_ParticipationsInMissions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the links to the Missions to which this System contributes\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystem_ExternalCommunication(), 
		   source, 
		   new String[] {
			 "description", "the list of communication links endpoints that are attached to this System\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystem_OwnedEntityRealizations(), 
		   source, 
		   new String[] {
			 "description", "the realization links from Operational entities to System entities, being owned by this System\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystem_AllocatedEntityRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the links from operational entities being realized by this System\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (systemFunctionEClass, 
		   source, 
		   new String[] {
			 "description", "Function at System level\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "../img/usage_examples/example_systemfunction.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystemFunction_OwnedSystemFunctionPkgs(), 
		   source, 
		   new String[] {
			 "description", "sub (function) package under this function",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemFunction_ChildrenSystemFunctions(), 
		   source, 
		   new String[] {
			 "description", "list of children system functions\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (systemFunctionPkgEClass, 
		   source, 
		   new String[] {
			 "description", "a container for System Functions\r\n[source: Capella study]",
			 "usage guideline", "this can be used to structure/organize system functions in the model",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystemFunctionPkg_OwnedSystemFunctions(), 
		   source, 
		   new String[] {
			 "description", "system functions contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemFunctionPkg_OwnedSystemFunctionPkgs(), 
		   source, 
		   new String[] {
			 "description", "sub (function) package under this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (systemCommunicationHookEClass, 
		   source, 
		   new String[] {
			 "description", "an endpoint of a relationship between the System and external actors\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Communication(), 
		   source, 
		   new String[] {
			 "description", "the relationship link to which this endpoint is attached\r\n[source: Capella study]\r\n\r\nReferences the association of which this property is a member, if any.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Type(), 
		   source, 
		   new String[] {
			 "description", "the type of the entity to which this endpoint is attached\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (systemCommunicationEClass, 
		   source, 
		   new String[] {
			 "description", "a communication relationship between the System (seen as a black box) and some external entities (typically Actors)\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystemCommunication_Ends(), 
		   source, 
		   new String[] {
			 "description", "the endpoints of this relationship link (there can be an arbitrary number of them for a given link)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "description", "Specifies the role played by a user or any other system that interacts with the subject\r\n[source: SysML glossary for SysML v1.0]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "../img/usage_examples/example_actors_interfaces.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActor_ParticipationsInMissions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of links between this actor and the Missions in which it is involved\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of links between this actor and the Capabilities in which it is involved\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of links between this actor and the CapabilityRealization in which it is involved\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActor_ContributedMissions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of Missions in which this actor is involved\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActor_ContributedCapabilities(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of Capabilities in which this actor is involved\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActor_SystemCommunication(), 
		   source, 
		   new String[] {
			 "description", "the communication link endpoint that is attached to this Actor\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActor_OwnedOperationalActorRealizations(), 
		   source, 
		   new String[] {
			 "description", "the list of realisation links to/from operational-level actor(s) that this system actor hosts/contains",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActor_OwnedOperationalEntityRealizations(), 
		   source, 
		   new String[] {
			 "description", "the list of realisation links to/from operational-level entity(ies) that this system actor hosts/contains",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (actorCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
			 "description", "Link between a system actor and a system capability that means the actor is involved in the capability\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "../img/usage_examples/example_actor_capability.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Actor(), 
		   source, 
		   new String[] {
			 "description", "Link to a system actor that is involved in the system capability.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
			 "description", "Link to the system capability involving the actor\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (actorMissionInvolvementEClass, 
		   source, 
		   new String[] {
			 "description", "Link between a system actor and a system mission that means the actor is involved in the mission\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Actor(), 
		   source, 
		   new String[] {
			 "description", "Link to a system actor that is involved in the system mission\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
			 "description", "Link to the system mission related to the actor\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (actorPkgEClass, 
		   source, 
		   new String[] {
			 "description", "Package that contains system actors\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActorPkg_OwnedActors(), 
		   source, 
		   new String[] {
			 "description", "Set of system actors that are defined at that level of package\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActorPkg_OwnedActorPkgs(), 
		   source, 
		   new String[] {
			 "description", "Sub pakages that contain system actors\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActorPkg_OwnedSystemCommunication(), 
		   source, 
		   new String[] {
			 "description", "the SystemCommunication links contained in this Actor package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (missionEClass, 
		   source, 
		   new String[] {
			 "description", "Operational goal. It must be satisfied by usage of System capabilities.\r\n\r\nA mission can be compared to a UML UseCase : A use case is the specification of a set of actions performed by a system, which yields an observable result that is,\r\ntypically, of value for one or more actors or other stakeholders of the system.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "../img/usage_examples/example_mission.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getMission_OwnedActorMissionInvolvements(), 
		   source, 
		   new String[] {
			 "description", "the links between Actors and Missions that are owned by this Mission\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMission_OwnedSystemMissionInvolvement(), 
		   source, 
		   new String[] {
			 "description", "the links between Missions and the System that are owned by this Mission\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMission_OwnedCapabilityExploitations(), 
		   source, 
		   new String[] {
			 "description", "the capability exploitation links that are assigned to this Mission\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMission_ParticipatingActors(), 
		   source, 
		   new String[] {
			 "description", "(computed automatically) the Actors involved in this Mission\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMission_ParticipatingSystem(), 
		   source, 
		   new String[] {
			 "description", "the System involved in this Mission\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMission_InvolvedActors(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the links to Actors that are involved in this Mission\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMission_InvolvedSystem(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the link to the System involved in this mission\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMission_ExploitedCapabilities(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of Capabilities that this Mission exploits\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (missionPkgEClass, 
		   source, 
		   new String[] {
			 "description", "Package that contains system missions\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissionPkgs(), 
		   source, 
		   new String[] {
			 "description", "Sub packages that contain system missions\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissions(), 
		   source, 
		   new String[] {
			 "description", "Set of system missions that are defined at that level of package\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (systemMissionInvolvementEClass, 
		   source, 
		   new String[] {
			 "description", "Link between a system and a mission meaning that the system is involved in the mission\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
			 "description", "Link to a Mission that the System is involved in\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_System(), 
		   source, 
		   new String[] {
			 "description", "Link to a system that is involved in the system mission\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (capabilityEClass, 
		   source, 
		   new String[] {
			 "description", "Ability of an organisation, system or process to provide a service that supports the achievement of high-level operational goals",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "../img/usage_examples/example_actor_capability.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCapability_OwnedActorCapabilityInvolvements(), 
		   source, 
		   new String[] {
			 "description", "the links between Actors and Capabilities that are owned by this Capability\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapability_OwnedSystemCapabilityInvolvement(), 
		   source, 
		   new String[] {
			 "description", "the links between the System and Capabilities, that are owned by this Capability\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapability_InvolvedActors(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the links between Actors and this Capability\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapability_InvolvedSystem(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the link to the System being involved in this Capability\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapability_ParticipatingActors(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the Actors involved with this Capability\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapability_ParticipatingSystem(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the System involved in this Capability\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapability_Purposes(), 
		   source, 
		   new String[] {
			 "description", "the links to the Mission(s) that this Capability supports\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapability_PurposeMissions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the Mission(s) that this Capability supports\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (capabilityExploitationEClass, 
		   source, 
		   new String[] {
			 "description", "a relationship between a mission and a capability that it exploits\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCapabilityExploitation_Mission(), 
		   source, 
		   new String[] {
			 "description", "the Mission involved in this relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapabilityExploitation_Capability(), 
		   source, 
		   new String[] {
			 "description", "the Capability involved in this relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (capabilityPkgEClass, 
		   source, 
		   new String[] {
			 "description", "Package that contains system capabilities\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilities(), 
		   source, 
		   new String[] {
			 "description", "Set of system capabilities that are defined at that level of package\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilityPkgs(), 
		   source, 
		   new String[] {
			 "description", "Sub pakages that contain system capabilities\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (systemCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
			 "description", "Link between a system and a system capability that means the system is involved in the capability\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
			 "description", "the Capability involved in this relationship\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_System(), 
		   source, 
		   new String[] {
			 "description", "The System involved in this relationship\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (operationalActorRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "Realization link between a system actor and an operational actor\r\n\r\nRealization is a specialized abstraction relationship between two sets of model elements, one representing a specification\r\n(the supplier) and the other represents an implementation of the latter (the client). Realization can be used to model\r\nstepwise refinement, optimizations, transformations, templates, model synthesis, framework composition, etc.\r\n[source:UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (operationalAnalysisRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "Realization link betwen a system analysis and an operational analysis\r\n[source:Capella study]\r\n\r\nRealization is a specialized abstraction relationship between two sets of model elements, one representing a specification\r\n(the supplier) and the other represents an implementation of the latter (the client). Realization can be used to model\r\nstepwise refinement, optimizations, transformations, templates, model synthesis, framework composition, etc.\r\n[source:UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (operationalEntityRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "Realization link between a system and an operational entity\r\n[source:Capella study]\r\n\r\nRealization is a specialized abstraction relationship between two sets of model elements, one representing a specification\r\n(the supplier) and the other represents an implementation of the latter (the client). Realization can be used to model\r\nstepwise refinement, optimizations, transformations, templates, model synthesis, framework composition, etc.\r\n[source:UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (systemContextEClass, 
		   source, 
		   new String[] {
			 "description", "the list of Parts that define the System and its environment, at this abstraction level.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system",
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
		  (systemAnalysisEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedSystemContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedActorPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedMissionPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_ContainedCapabilityPkg(), 
		   source, 
		   new String[] {
			 "feature", "ownedAbstractCapabilityPkg"
		   });	
		addAnnotation
		  (getSystemAnalysis_ContainedSystemFunctionPkg(), 
		   source, 
		   new String[] {
			 "feature", "ownedFunctionPkg"
		   });	
		addAnnotation
		  (getSystemAnalysis_AllocatedOperationalAnalyses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_AllocatingLogicalArchitectures(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (systemEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ContributedCapabilities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getSystem_ContributedMissions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getSystem_AllocatedSystemFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_RealizedEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_RealizingLogicalComponents(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (systemFunctionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunction_OwnedSystemFunctionPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunction_AllocatorActors(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getSystemFunction_AllocatorSystems(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getSystemFunction_RealizedOperationalActivities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunction_RealizingLogicalFunctions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getSystemFunction_ContainedSystemFunctions(), 
		   source, 
		   new String[] {
			 "feature", "ownedFunctions"
		   });	
		addAnnotation
		  (getSystemFunction_ChildrenSystemFunctions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (systemFunctionPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunctionPkg_OwnedSystemFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunctionPkg_OwnedSystemFunctionPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ContributedMissions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getActor_ContributedCapabilities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getActor_AllocatedSystemFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_RealizedEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_RealizedOperationalActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_RealizingLogicalActors(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (actorPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorPkg_OwnedActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorPkg_OwnedActorPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (missionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_ParticipatingActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_ParticipatingSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_ExploitedCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (missionPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissionPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (capabilityEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_ParticipatingActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_ParticipatingSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_PurposeMissions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getCapability_RealizedOperationalCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_RealizingCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (capabilityPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilityPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemContextEClass, 
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
		  (systemAnalysisEClass, 
		   source, 
		   new String[] {
			 "Label", "System Analysis"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedSystem(), 
		   source, 
		   new String[] {
			 "Label", "ownedSystem"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedActorPkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedActorPkg"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedMissionPkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedMissionPkg"
		   });	
		addAnnotation
		  (systemEClass, 
		   source, 
		   new String[] {
			 "Label", "System"
		   });	
		addAnnotation
		  (getSystem_ContributedCapabilities(), 
		   source, 
		   new String[] {
			 "Label", "contributedCapabilitySpecificationUseCases"
		   });	
		addAnnotation
		  (getSystem_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
			 "Label", "participationsInCapabilities"
		   });	
		addAnnotation
		  (getSystem_ContributedMissions(), 
		   source, 
		   new String[] {
			 "Label", "contributedMissions"
		   });	
		addAnnotation
		  (getSystem_ParticipationsInMissions(), 
		   source, 
		   new String[] {
			 "Label", "participationsInMissions"
		   });	
		addAnnotation
		  (getSystem_ExternalCommunication(), 
		   source, 
		   new String[] {
			 "Label", "externalCommunications"
		   });	
		addAnnotation
		  (systemCommunicationHookEClass, 
		   source, 
		   new String[] {
			 "Label", "Property"
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Communication(), 
		   source, 
		   new String[] {
			 "Label", "communication"
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Type(), 
		   source, 
		   new String[] {
			 "Label", "type"
		   });	
		addAnnotation
		  (systemCommunicationEClass, 
		   source, 
		   new String[] {
			 "Label", "SystemCommunication"
		   });	
		addAnnotation
		  (getSystemCommunication_Ends(), 
		   source, 
		   new String[] {
			 "Label", "system"
		   });	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "Label", "Actor"
		   });	
		addAnnotation
		  (getActor_ParticipationsInMissions(), 
		   source, 
		   new String[] {
			 "Label", "participationsInMissions"
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
			 "Label", "participationsInCapabilities"
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "Label", "participationsInCapabilityRealizations"
		   });	
		addAnnotation
		  (getActor_ContributedMissions(), 
		   source, 
		   new String[] {
			 "Label", "contributedMissions"
		   });	
		addAnnotation
		  (getActor_ContributedCapabilities(), 
		   source, 
		   new String[] {
			 "Label", "contributedCapabilitySpecificationUseCases"
		   });	
		addAnnotation
		  (getActor_SystemCommunication(), 
		   source, 
		   new String[] {
			 "Label", "systemCommunication"
		   });	
		addAnnotation
		  (actorCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
			 "Label", "ActorCapabilityInvolvement"
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Actor(), 
		   source, 
		   new String[] {
			 "Label", "actor"
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
			 "Label", "capability"
		   });	
		addAnnotation
		  (actorMissionInvolvementEClass, 
		   source, 
		   new String[] {
			 "Label", "ActorMissionInvolvement"
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Actor(), 
		   source, 
		   new String[] {
			 "Label", "actor"
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
			 "Label", "mission"
		   });	
		addAnnotation
		  (actorPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "ActorPkg"
		   });	
		addAnnotation
		  (getActorPkg_OwnedActors(), 
		   source, 
		   new String[] {
			 "Label", "ownedActors"
		   });	
		addAnnotation
		  (getActorPkg_OwnedActorPkgs(), 
		   source, 
		   new String[] {
			 "Label", "subActorPkgs"
		   });	
		addAnnotation
		  (getActorPkg_OwnedSystemCommunication(), 
		   source, 
		   new String[] {
			 "Label", "ownedSystemCommunication"
		   });	
		addAnnotation
		  (missionEClass, 
		   source, 
		   new String[] {
			 "Label", "Mission"
		   });	
		addAnnotation
		  (getMission_OwnedActorMissionInvolvements(), 
		   source, 
		   new String[] {
			 "Label", "ownedActorMissionInvolvements"
		   });	
		addAnnotation
		  (getMission_OwnedSystemMissionInvolvement(), 
		   source, 
		   new String[] {
			 "Label", "ownedMissionSupplierLinks"
		   });	
		addAnnotation
		  (getMission_OwnedCapabilityExploitations(), 
		   source, 
		   new String[] {
			 "Label", "capabilityExploitations"
		   });	
		addAnnotation
		  (getMission_ParticipatingActors(), 
		   source, 
		   new String[] {
			 "Label", "participatingActors"
		   });	
		addAnnotation
		  (getMission_ParticipatingSystem(), 
		   source, 
		   new String[] {
			 "Label", "participatingSystems"
		   });	
		addAnnotation
		  (getMission_InvolvedActors(), 
		   source, 
		   new String[] {
			 "Label", "invovledActors"
		   });	
		addAnnotation
		  (getMission_InvolvedSystem(), 
		   source, 
		   new String[] {
			 "Label", "missionSupplierLinks"
		   });	
		addAnnotation
		  (getMission_ExploitedCapabilities(), 
		   source, 
		   new String[] {
			 "Label", "exploitedCapabilityUseCases"
		   });	
		addAnnotation
		  (missionPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "MissionPkg"
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissionPkgs(), 
		   source, 
		   new String[] {
			 "Label", "subMissionPkgs"
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissions(), 
		   source, 
		   new String[] {
			 "Label", "ownedMissions"
		   });	
		addAnnotation
		  (systemMissionInvolvementEClass, 
		   source, 
		   new String[] {
			 "Label", "MissionSupplierLink"
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
			 "Label", "mission"
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_System(), 
		   source, 
		   new String[] {
			 "Label", "system"
		   });	
		addAnnotation
		  (capabilityEClass, 
		   source, 
		   new String[] {
			 "Label", "Capability"
		   });	
		addAnnotation
		  (getCapability_OwnedActorCapabilityInvolvements(), 
		   source, 
		   new String[] {
			 "Label", "ownedActorCapabilityInvolvements"
		   });	
		addAnnotation
		  (getCapability_OwnedSystemCapabilityInvolvement(), 
		   source, 
		   new String[] {
			 "Label", "ownedCapabilitySupplierLinks"
		   });	
		addAnnotation
		  (getCapability_InvolvedActors(), 
		   source, 
		   new String[] {
			 "Label", "involvedActors"
		   });	
		addAnnotation
		  (getCapability_InvolvedSystem(), 
		   source, 
		   new String[] {
			 "Label", "capabilitySupplierLinks"
		   });	
		addAnnotation
		  (getCapability_ParticipatingActors(), 
		   source, 
		   new String[] {
			 "Label", "participatingActors"
		   });	
		addAnnotation
		  (getCapability_ParticipatingSystem(), 
		   source, 
		   new String[] {
			 "Label", "participatingSystems"
		   });	
		addAnnotation
		  (getCapability_Purposes(), 
		   source, 
		   new String[] {
			 "Label", "purposes"
		   });	
		addAnnotation
		  (getCapability_PurposeMissions(), 
		   source, 
		   new String[] {
			 "Label", "purposeMissions"
		   });	
		addAnnotation
		  (capabilityExploitationEClass, 
		   source, 
		   new String[] {
			 "Label", "CapabilityExploitation"
		   });	
		addAnnotation
		  (getCapabilityExploitation_Mission(), 
		   source, 
		   new String[] {
			 "Label", "mission"
		   });	
		addAnnotation
		  (getCapabilityExploitation_Capability(), 
		   source, 
		   new String[] {
			 "Label", "capability"
		   });	
		addAnnotation
		  (capabilityPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "CapabilityPkg"
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilities(), 
		   source, 
		   new String[] {
			 "Label", "capabilities"
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilityPkgs(), 
		   source, 
		   new String[] {
			 "Label", "subCapabilityPkgs"
		   });	
		addAnnotation
		  (systemCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
			 "Label", "CapabilitySupplierLink"
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
			 "Label", "capability"
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_System(), 
		   source, 
		   new String[] {
			 "Label", "system"
		   });
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
		  (systemAnalysisEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.ContextArchitecture"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedSystem(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedActorPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedMissionPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (systemEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component",
			 "stereotype", "eng.System"
		   });	
		addAnnotation
		  (getSystem_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (getSystem_ParticipationsInMissions(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (getSystem_ExternalCommunication(), 
		   source, 
		   new String[] {
			 "featureName", "ownedAttribute",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (systemCommunicationHookEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Property",
			 "stereotype", "eng.SystemCommunicationHook"
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Communication(), 
		   source, 
		   new String[] {
			 "featureName", "association",
			 "featureOwner", "Property"
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Type(), 
		   source, 
		   new String[] {
			 "featureName", "type",
			 "featureOwner", "TypedElement"
		   });	
		addAnnotation
		  (systemCommunicationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Association",
			 "stereotype", "eng.SystemCommunication"
		   });	
		addAnnotation
		  (getSystemCommunication_Ends(), 
		   source, 
		   new String[] {
			 "featureName", "navigableOwnedEnd",
			 "featureOwner", "Association"
		   });	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component",
			 "stereotype", "eng.Actor"
		   });	
		addAnnotation
		  (getActor_ParticipationsInMissions(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (getActor_SystemCommunication(), 
		   source, 
		   new String[] {
			 "featureName", "ownedAttribute",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (actorCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.ActorCapabilityInvolvement"
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Actor(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
			 "featureName", "client",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (actorMissionInvolvementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.ActorMissionInvolvement"
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Actor(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
			 "featureName", "client",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (actorPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.ActorPkg"
		   });	
		addAnnotation
		  (getActorPkg_OwnedActors(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getActorPkg_OwnedActorPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getActorPkg_OwnedSystemCommunication(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (missionEClass, 
		   source, 
		   new String[] {
			 "metaclass", "UseCase",
			 "stereotype", "eng.Mission"
		   });	
		addAnnotation
		  (getMission_OwnedActorMissionInvolvements(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getMission_OwnedSystemMissionInvolvement(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getMission_OwnedCapabilityExploitations(), 
		   source, 
		   new String[] {
			 "featureName", "include",
			 "featureOwner", "UseCase"
		   });	
		addAnnotation
		  (getMission_InvolvedActors(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getMission_InvolvedSystem(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (missionPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.MissionPkg"
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissionPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissions(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (systemMissionInvolvementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.MissionSupplierLink"
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
			 "featureName", "client",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_System(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (capabilityEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.Capability"
		   });	
		addAnnotation
		  (getCapability_OwnedActorCapabilityInvolvements(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getCapability_OwnedSystemCapabilityInvolvement(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getCapability_InvolvedActors(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getCapability_InvolvedSystem(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getCapability_Purposes(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "addition",
			 "umlOppositeReferenceOwner", "Include"
		   });	
		addAnnotation
		  (capabilityExploitationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Include",
			 "stereotype", "eng.CapabilityExploitation"
		   });	
		addAnnotation
		  (getCapabilityExploitation_Mission(), 
		   source, 
		   new String[] {
			 "featureName", "includingCase",
			 "featureOwner", "Include"
		   });	
		addAnnotation
		  (getCapabilityExploitation_Capability(), 
		   source, 
		   new String[] {
			 "featureName", "addition",
			 "featureOwner", "Include"
		   });	
		addAnnotation
		  (capabilityPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.CapabilityPkg"
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilities(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilityPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (systemCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.CapabilitySupplierLink"
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
			 "featureName", "client",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_System(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
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
		  (systemAnalysisEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedSystemContext(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::PackagedElement elements on which SystemContext stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedSystem(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElements elements on which System stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedActorPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which ActorPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedMissionPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which MissionPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getSystemAnalysis_ContainedCapabilityPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_ContainedSystemFunctionPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedOperationalAnalysisRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which OperationalAnalysisRealisation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getSystemAnalysis_AllocatedOperationalAnalysisRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_AllocatedOperationalAnalyses(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemAnalysis_AllocatingLogicalArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Blocks::Block",
			 "explanation", "uml::Component is not part of UML4SysML, and should therefore not be used \r\nfor implementing a SysML profile",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystem_ContributedCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystem_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystem_ContributedMissions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystem_ParticipationsInMissions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystem_ExternalCommunication(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystem_OwnedEntityRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Blocks cannot contain Realizations : store them in the nearest available package",
			 "constraints", "Order is not preserved in the UML model."
		   });	
		addAnnotation
		  (getSystem_AllocatedEntityRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystem_AllocatedSystemFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystem_RealizedEntities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystem_RealizingLogicalComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemFunctionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Activity",
			 "explanation", "All functions are mapped to Activities. Parent activities refer to children activities via CallBehaviorActions",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemFunction_OwnedSystemFunctionPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "",
			 "constraints", "uml::Package::nestedPackage elements on which SystemFunctionPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getSystemFunction_AllocatorActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemFunction_AllocatorSystems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemFunction_RealizedOperationalActivities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemFunction_RealizingLogicalFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemFunction_ContainedSystemFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemFunction_ChildrenSystemFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemFunctionPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemFunctionPkg_OwnedSystemFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getSystemFunctionPkg_OwnedSystemFunctionPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "",
			 "constraints", "uml::Package::nestedPackage elements on which SystemFunctionPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (systemCommunicationHookEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Property",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Communication(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Property::association",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Type(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::TypedElement::type",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemCommunicationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Association",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemCommunication_Ends(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Association::ownedEnd",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Blocks::Block",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_ParticipationsInMissions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_ContributedMissions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_ContributedCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_SystemCommunication(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_OwnedOperationalActorRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which OperationalActorRealizations stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getActor_OwnedOperationalEntityRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which OperationalActorRealizations stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getActor_AllocatedSystemFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_RealizedEntities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_RealizedOperationalActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActor_RealizingLogicalActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (actorCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Actor(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (actorMissionInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Actor(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (actorPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActorPkg_OwnedActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Actor stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getActorPkg_OwnedActorPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which ActorPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getActorPkg_OwnedSystemCommunication(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (missionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::UseCase",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMission_OwnedActorMissionInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "Some elements on which ActorMissionInvolvement stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getMission_OwnedSystemMissionInvolvement(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "Some elements on which SystemMissionInvolvement stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getMission_OwnedCapabilityExploitations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::UseCase::include",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getMission_ParticipatingActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMission_ParticipatingSystem(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMission_InvolvedActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMission_InvolvedSystem(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMission_ExploitedCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (missionPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissionPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which MissionPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Mission stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (systemMissionInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_System(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (capabilityEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::UseCase",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapability_OwnedActorCapabilityInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ActorCapabilityInvolvement stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getCapability_OwnedSystemCapabilityInvolvement(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which SystemCapabilityInvolvement stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getCapability_InvolvedActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapability_InvolvedSystem(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapability_ParticipatingActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapability_ParticipatingSystem(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapability_Purposes(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Include::addition",
			 "constraints", "uml::NamedElement::clientDependency elements on which CapabilityExploitation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getCapability_PurposeMissions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapability_RealizedOperationalCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapability_RealizingCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (capabilityExploitationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Include",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapabilityExploitation_Mission(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Include::includingCase",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapabilityExploitation_Capability(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Include::addition",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (capabilityPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilityPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (systemCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_System(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (operationalActorRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (operationalAnalysisRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (operationalEntityRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemContextEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Class",
			 "explanation", "none",
			 "constraints", "none"
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
		  (getSystemAnalysis_OwnedSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedActorPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_OwnedMissionPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ContributedCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ContributedMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ParticipationsInMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ExternalCommunication(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Communication(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemCommunicationHook_Type(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemCommunication_Ends(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ParticipationsInMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ContributedMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ContributedCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_SystemCommunication(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Actor(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Actor(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorPkg_OwnedActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorPkg_OwnedActorPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorPkg_OwnedSystemCommunication(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_OwnedActorMissionInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_OwnedSystemMissionInvolvement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_OwnedCapabilityExploitations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_ParticipatingActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_ParticipatingSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_InvolvedActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_InvolvedSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_ExploitedCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissionPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMissionPkg_OwnedMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_System(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_OwnedActorCapabilityInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_OwnedSystemCapabilityInvolvement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_InvolvedActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_InvolvedSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_ParticipatingActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_ParticipatingSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_Purposes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_PurposeMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapabilityExploitation_Mission(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapabilityExploitation_Capability(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapabilityPkg_OwnedCapabilityPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_System(), 
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
		  (getSystemAnalysis_ContainedCapabilityPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_ContainedSystemFunctionPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_AllocatedOperationalAnalysisRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_AllocatedOperationalAnalyses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemAnalysis_AllocatingLogicalArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ContributedCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ContributedMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_ParticipationsInMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_AllocatedEntityRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_AllocatedSystemFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_RealizedEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystem_RealizingLogicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunction_AllocatorActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunction_AllocatorSystems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunction_RealizedOperationalActivities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunction_RealizingLogicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunction_ContainedSystemFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemFunction_ChildrenSystemFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ParticipationsInMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ContributedMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_ContributedCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_AllocatedSystemFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_RealizedEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_RealizedOperationalActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActor_RealizingLogicalActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Actor(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Actor(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActorMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_ParticipatingActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_ParticipatingSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_InvolvedActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_InvolvedSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMission_ExploitedCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_Mission(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemMissionInvolvement_System(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_InvolvedActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_InvolvedSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_ParticipatingActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_ParticipatingSystem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_Purposes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_PurposeMissions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_RealizedOperationalCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapability_RealizingCapabilityRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapabilityExploitation_Mission(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemCapabilityInvolvement_System(), 
		   source, 
		   new String[] {
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
		  (actorCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (actorMissionInvolvementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemMissionInvolvementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (capabilityExploitationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CtxPackageImpl
