/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.impl;

import org.eclipse.emf.ecore.EAttribute;
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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractActor;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPathInvolvedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPhysicalArtifact;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPhysicalLinkEnd;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractPhysicalPathLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ActorCapabilityRealizationInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ArchitectureAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Block;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.BlockArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.BlockArchitecturePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Component;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ComponentContext;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.CsFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.CsPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.DeployableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.DeploymentTarget;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ExchangeItemAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Interface;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceAllocator;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceImplementation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfacePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.InterfaceUse;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Part;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLinkCategory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLinkEnd;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalLinkRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPath;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPathInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPathRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPathReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPort;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.PhysicalPortRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ProvidedInterfaceLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.RequiredInterfaceLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.SystemComponent;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.SystemComponentCapabilityRealizationInvolvement;

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
public class CsPackageImpl extends EPackageImpl implements CsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockArchitecturePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfacePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedInterfaceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInterfaceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceAllocatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorCapabilityRealizationInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemComponentCapabilityRealizationInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeItemAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDeploymentLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPathInvolvedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPhysicalArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPhysicalLinkEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPhysicalPathLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalLinkCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalLinkEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalLinkRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPathInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPathReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPathRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalPortRealizationEClass = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.CsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CsPackageImpl() {
		super(eNS_URI, CsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CsPackage init() {
		if (isInited) return (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);

		// Obtain or create and register package
		CsPackageImpl theCsPackage = (CsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CsPackageImpl());

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
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		theCsPackage.createPackageContents();
		theSharedmodelPackage.createPackageContents();
		theEmdePackage.createPackageContents();
		theOaPackage.createPackageContents();
		theCapellacorePackage.createPackageContents();
		thePaPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theCapellamodellerPackage.createPackageContents();
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
		theActivityPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		theCsPackage.initializePackageContents();
		theSharedmodelPackage.initializePackageContents();
		theEmdePackage.initializePackageContents();
		theOaPackage.initializePackageContents();
		theCapellacorePackage.initializePackageContents();
		thePaPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theCapellamodellerPackage.initializePackageContents();
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
		theActivityPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CsPackage.eNS_URI, theCsPackage);
		return theCsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockArchitecturePkg() {
		return blockArchitecturePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockArchitecture() {
		return blockArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_OwnedRequirementPkgs() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_OwnedAbstractCapabilityPkg() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_OwnedInterfacePkg() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_OwnedDataPkg() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_ProvisionedArchitectureAllocations() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_ProvisioningArchitectureAllocations() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_AllocatedArchitectures() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockArchitecture_AllocatingArchitectures() {
		return (EReference)blockArchitectureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OwnedAbstractCapabilityPkg() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OwnedInterfacePkg() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OwnedDataPkg() {
		return (EReference)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_OwnedStateMachines() {
		return (EReference)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentArchitecture() {
		return componentArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OwnedInterfaceUses() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_UsedInterfaceLinks() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_UsedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OwnedInterfaceImplementations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ImplementedInterfaceLinks() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ImplementedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProvisionedComponentAllocations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProvisioningComponentAllocations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AllocatedComponents() {
		return (EReference)componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_AllocatingComponents() {
		return (EReference)componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ProvidedInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_RequiredInterfaces() {
		return (EReference)componentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ContainedComponentPorts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ContainedParts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_ContainedPhysicalPorts() {
		return (EReference)componentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OwnedPhysicalPath() {
		return (EReference)componentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OwnedPhysicalLinks() {
		return (EReference)componentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_OwnedPhysicalLinkCategories() {
		return (EReference)componentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractActor() {
		return abstractActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_ProvidedInterfaces() {
		return (EReference)partEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_RequiredInterfaces() {
		return (EReference)partEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_OwnedDeploymentLinks() {
		return (EReference)partEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_DeployedParts() {
		return (EReference)partEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_DeployingParts() {
		return (EReference)partEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPart_OwnedAbstractType() {
		return (EReference)partEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureAllocation() {
		return architectureAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureAllocation_AllocatedArchitecture() {
		return (EReference)architectureAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureAllocation_AllocatingArchitecture() {
		return (EReference)architectureAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentAllocation() {
		return componentAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentAllocation_AllocatedComponent() {
		return (EReference)componentAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentAllocation_AllocatingComponent() {
		return (EReference)componentAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemComponent() {
		return systemComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemComponent_DataComponent() {
		return (EAttribute)systemComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemComponent_DataType() {
		return (EReference)systemComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemComponent_ParticipationsInCapabilityRealizations() {
		return (EReference)systemComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfacePkg() {
		return interfacePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacePkg_OwnedInterfaces() {
		return (EReference)interfacePkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfacePkg_OwnedInterfacePkgs() {
		return (EReference)interfacePkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Mechanism() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Structural() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ImplementorComponents() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_UserComponents() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_InterfaceImplementations() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_InterfaceUses() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ProvisioningInterfaceAllocations() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_AllocatingInterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_AllocatingComponents() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ExchangeItems() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedExchangeItemAllocations() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RequiringComponents() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RequiringComponentPorts() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ProvidingComponents() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_ProvidingComponentPorts() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RealizingLogicalInterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RealizedContextInterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RealizingPhysicalInterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RealizedLogicalInterfaces() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceImplementation() {
		return interfaceImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceImplementation_InterfaceImplementor() {
		return (EReference)interfaceImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceImplementation_ImplementedInterface() {
		return (EReference)interfaceImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceUse() {
		return interfaceUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceUse_InterfaceUser() {
		return (EReference)interfaceUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceUse_UsedInterface() {
		return (EReference)interfaceUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvidedInterfaceLink() {
		return providedInterfaceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvidedInterfaceLink_Interface() {
		return (EReference)providedInterfaceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequiredInterfaceLink() {
		return requiredInterfaceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequiredInterfaceLink_Interface() {
		return (EReference)requiredInterfaceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceAllocation() {
		return interfaceAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAllocation_AllocatedInterface() {
		return (EReference)interfaceAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAllocation_AllocatingInterfaceAllocator() {
		return (EReference)interfaceAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceAllocator() {
		return interfaceAllocatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAllocator_OwnedInterfaceAllocations() {
		return (EReference)interfaceAllocatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAllocator_ProvisionedInterfaceAllocations() {
		return (EReference)interfaceAllocatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceAllocator_AllocatedInterfaces() {
		return (EReference)interfaceAllocatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorCapabilityRealizationInvolvement() {
		return actorCapabilityRealizationInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemComponentCapabilityRealizationInvolvement() {
		return systemComponentCapabilityRealizationInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentContext() {
		return componentContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeItemAllocation() {
		return exchangeItemAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeItemAllocation_SendProtocol() {
		return (EAttribute)exchangeItemAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeItemAllocation_ReceiveProtocol() {
		return (EAttribute)exchangeItemAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItemAllocation_AllocatedItem() {
		return (EReference)exchangeItemAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItemAllocation_AllocatingInterface() {
		return (EReference)exchangeItemAllocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployableElement() {
		return deployableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployableElement_DeployingLinks() {
		return (EReference)deployableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentTarget() {
		return deploymentTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTarget_DeploymentLinks() {
		return (EReference)deploymentTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDeploymentLink() {
		return abstractDeploymentLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDeploymentLink_DeployedElement() {
		return (EReference)abstractDeploymentLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractDeploymentLink_Location() {
		return (EReference)abstractDeploymentLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPathInvolvedElement() {
		return abstractPathInvolvedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPhysicalArtifact() {
		return abstractPhysicalArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPhysicalArtifact_AllocatorConfigurationItems() {
		return (EReference)abstractPhysicalArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPhysicalLinkEnd() {
		return abstractPhysicalLinkEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPhysicalLinkEnd_InvolvedLinks() {
		return (EReference)abstractPhysicalLinkEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPhysicalPathLink() {
		return abstractPhysicalPathLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalLink() {
		return physicalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_LinkEnds() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_OwnedComponentExchangeFunctionalExchangeAllocations() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_OwnedPhysicalLinkEnds() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_OwnedPhysicalLinkRealizations() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_Categories() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_SourcePhysicalPort() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_TargetPhysicalPort() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_RealizedPhysicalLinks() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLink_RealizingPhysicalLinks() {
		return (EReference)physicalLinkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalLinkCategory() {
		return physicalLinkCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLinkCategory_Links() {
		return (EReference)physicalLinkCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalLinkEnd() {
		return physicalLinkEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLinkEnd_Port() {
		return (EReference)physicalLinkEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalLinkEnd_Part() {
		return (EReference)physicalLinkEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalLinkRealization() {
		return physicalLinkRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPath() {
		return physicalPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPath_InvolvedLinks() {
		return (EReference)physicalPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPath_OwnedPhysicalPathInvolvements() {
		return (EReference)physicalPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPath_FirstPhysicalPathInvolvements() {
		return (EReference)physicalPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPath_OwnedPhysicalPathRealizations() {
		return (EReference)physicalPathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPath_RealizedPhysicalPaths() {
		return (EReference)physicalPathEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPath_RealizingPhysicalPaths() {
		return (EReference)physicalPathEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPathInvolvement() {
		return physicalPathInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPathInvolvement_NextInvolvements() {
		return (EReference)physicalPathInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPathInvolvement_PreviousInvolvements() {
		return (EReference)physicalPathInvolvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPathInvolvement_InvolvedElement() {
		return (EReference)physicalPathInvolvementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPathInvolvement_InvolvedComponent() {
		return (EReference)physicalPathInvolvementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPathReference() {
		return physicalPathReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPathReference_ReferencedPhysicalPath() {
		return (EReference)physicalPathReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPathRealization() {
		return physicalPathRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPort() {
		return physicalPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPort_OwnedComponentPortAllocations() {
		return (EReference)physicalPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPort_OwnedPhysicalPortRealizations() {
		return (EReference)physicalPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPort_AllocatedComponentPorts() {
		return (EReference)physicalPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPort_RealizedPhysicalPorts() {
		return (EReference)physicalPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalPort_RealizingPhysicalPorts() {
		return (EReference)physicalPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalPortRealization() {
		return physicalPortRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactory getCsFactory() {
		return (CsFactory)getEFactoryInstance();
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
		blockArchitecturePkgEClass = createEClass(BLOCK_ARCHITECTURE_PKG);

		blockArchitectureEClass = createEClass(BLOCK_ARCHITECTURE);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__OWNED_DATA_PKG);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__ALLOCATED_ARCHITECTURES);
		createEReference(blockArchitectureEClass, BLOCK_ARCHITECTURE__ALLOCATING_ARCHITECTURES);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__OWNED_ABSTRACT_CAPABILITY_PKG);
		createEReference(blockEClass, BLOCK__OWNED_INTERFACE_PKG);
		createEReference(blockEClass, BLOCK__OWNED_DATA_PKG);
		createEReference(blockEClass, BLOCK__OWNED_STATE_MACHINES);

		componentArchitectureEClass = createEClass(COMPONENT_ARCHITECTURE);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__OWNED_INTERFACE_USES);
		createEReference(componentEClass, COMPONENT__USED_INTERFACE_LINKS);
		createEReference(componentEClass, COMPONENT__USED_INTERFACES);
		createEReference(componentEClass, COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS);
		createEReference(componentEClass, COMPONENT__IMPLEMENTED_INTERFACE_LINKS);
		createEReference(componentEClass, COMPONENT__IMPLEMENTED_INTERFACES);
		createEReference(componentEClass, COMPONENT__PROVISIONED_COMPONENT_ALLOCATIONS);
		createEReference(componentEClass, COMPONENT__PROVISIONING_COMPONENT_ALLOCATIONS);
		createEReference(componentEClass, COMPONENT__ALLOCATED_COMPONENTS);
		createEReference(componentEClass, COMPONENT__ALLOCATING_COMPONENTS);
		createEReference(componentEClass, COMPONENT__PROVIDED_INTERFACES);
		createEReference(componentEClass, COMPONENT__REQUIRED_INTERFACES);
		createEReference(componentEClass, COMPONENT__CONTAINED_COMPONENT_PORTS);
		createEReference(componentEClass, COMPONENT__CONTAINED_PARTS);
		createEReference(componentEClass, COMPONENT__CONTAINED_PHYSICAL_PORTS);
		createEReference(componentEClass, COMPONENT__OWNED_PHYSICAL_PATH);
		createEReference(componentEClass, COMPONENT__OWNED_PHYSICAL_LINKS);
		createEReference(componentEClass, COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES);

		abstractActorEClass = createEClass(ABSTRACT_ACTOR);

		partEClass = createEClass(PART);
		createEReference(partEClass, PART__PROVIDED_INTERFACES);
		createEReference(partEClass, PART__REQUIRED_INTERFACES);
		createEReference(partEClass, PART__OWNED_DEPLOYMENT_LINKS);
		createEReference(partEClass, PART__DEPLOYED_PARTS);
		createEReference(partEClass, PART__DEPLOYING_PARTS);
		createEReference(partEClass, PART__OWNED_ABSTRACT_TYPE);

		architectureAllocationEClass = createEClass(ARCHITECTURE_ALLOCATION);
		createEReference(architectureAllocationEClass, ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE);
		createEReference(architectureAllocationEClass, ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE);

		componentAllocationEClass = createEClass(COMPONENT_ALLOCATION);
		createEReference(componentAllocationEClass, COMPONENT_ALLOCATION__ALLOCATED_COMPONENT);
		createEReference(componentAllocationEClass, COMPONENT_ALLOCATION__ALLOCATING_COMPONENT);

		systemComponentEClass = createEClass(SYSTEM_COMPONENT);
		createEAttribute(systemComponentEClass, SYSTEM_COMPONENT__DATA_COMPONENT);
		createEReference(systemComponentEClass, SYSTEM_COMPONENT__DATA_TYPE);
		createEReference(systemComponentEClass, SYSTEM_COMPONENT__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS);

		interfacePkgEClass = createEClass(INTERFACE_PKG);
		createEReference(interfacePkgEClass, INTERFACE_PKG__OWNED_INTERFACES);
		createEReference(interfacePkgEClass, INTERFACE_PKG__OWNED_INTERFACE_PKGS);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__MECHANISM);
		createEAttribute(interfaceEClass, INTERFACE__STRUCTURAL);
		createEReference(interfaceEClass, INTERFACE__IMPLEMENTOR_COMPONENTS);
		createEReference(interfaceEClass, INTERFACE__USER_COMPONENTS);
		createEReference(interfaceEClass, INTERFACE__INTERFACE_IMPLEMENTATIONS);
		createEReference(interfaceEClass, INTERFACE__INTERFACE_USES);
		createEReference(interfaceEClass, INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS);
		createEReference(interfaceEClass, INTERFACE__ALLOCATING_INTERFACES);
		createEReference(interfaceEClass, INTERFACE__ALLOCATING_COMPONENTS);
		createEReference(interfaceEClass, INTERFACE__EXCHANGE_ITEMS);
		createEReference(interfaceEClass, INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS);
		createEReference(interfaceEClass, INTERFACE__REQUIRING_COMPONENTS);
		createEReference(interfaceEClass, INTERFACE__REQUIRING_COMPONENT_PORTS);
		createEReference(interfaceEClass, INTERFACE__PROVIDING_COMPONENTS);
		createEReference(interfaceEClass, INTERFACE__PROVIDING_COMPONENT_PORTS);
		createEReference(interfaceEClass, INTERFACE__REALIZING_LOGICAL_INTERFACES);
		createEReference(interfaceEClass, INTERFACE__REALIZED_CONTEXT_INTERFACES);
		createEReference(interfaceEClass, INTERFACE__REALIZING_PHYSICAL_INTERFACES);
		createEReference(interfaceEClass, INTERFACE__REALIZED_LOGICAL_INTERFACES);

		interfaceImplementationEClass = createEClass(INTERFACE_IMPLEMENTATION);
		createEReference(interfaceImplementationEClass, INTERFACE_IMPLEMENTATION__INTERFACE_IMPLEMENTOR);
		createEReference(interfaceImplementationEClass, INTERFACE_IMPLEMENTATION__IMPLEMENTED_INTERFACE);

		interfaceUseEClass = createEClass(INTERFACE_USE);
		createEReference(interfaceUseEClass, INTERFACE_USE__INTERFACE_USER);
		createEReference(interfaceUseEClass, INTERFACE_USE__USED_INTERFACE);

		providedInterfaceLinkEClass = createEClass(PROVIDED_INTERFACE_LINK);
		createEReference(providedInterfaceLinkEClass, PROVIDED_INTERFACE_LINK__INTERFACE);

		requiredInterfaceLinkEClass = createEClass(REQUIRED_INTERFACE_LINK);
		createEReference(requiredInterfaceLinkEClass, REQUIRED_INTERFACE_LINK__INTERFACE);

		interfaceAllocationEClass = createEClass(INTERFACE_ALLOCATION);
		createEReference(interfaceAllocationEClass, INTERFACE_ALLOCATION__ALLOCATED_INTERFACE);
		createEReference(interfaceAllocationEClass, INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR);

		interfaceAllocatorEClass = createEClass(INTERFACE_ALLOCATOR);
		createEReference(interfaceAllocatorEClass, INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS);
		createEReference(interfaceAllocatorEClass, INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS);
		createEReference(interfaceAllocatorEClass, INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES);

		actorCapabilityRealizationInvolvementEClass = createEClass(ACTOR_CAPABILITY_REALIZATION_INVOLVEMENT);

		systemComponentCapabilityRealizationInvolvementEClass = createEClass(SYSTEM_COMPONENT_CAPABILITY_REALIZATION_INVOLVEMENT);

		componentContextEClass = createEClass(COMPONENT_CONTEXT);

		exchangeItemAllocationEClass = createEClass(EXCHANGE_ITEM_ALLOCATION);
		createEAttribute(exchangeItemAllocationEClass, EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL);
		createEAttribute(exchangeItemAllocationEClass, EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL);
		createEReference(exchangeItemAllocationEClass, EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM);
		createEReference(exchangeItemAllocationEClass, EXCHANGE_ITEM_ALLOCATION__ALLOCATING_INTERFACE);

		deployableElementEClass = createEClass(DEPLOYABLE_ELEMENT);
		createEReference(deployableElementEClass, DEPLOYABLE_ELEMENT__DEPLOYING_LINKS);

		deploymentTargetEClass = createEClass(DEPLOYMENT_TARGET);
		createEReference(deploymentTargetEClass, DEPLOYMENT_TARGET__DEPLOYMENT_LINKS);

		abstractDeploymentLinkEClass = createEClass(ABSTRACT_DEPLOYMENT_LINK);
		createEReference(abstractDeploymentLinkEClass, ABSTRACT_DEPLOYMENT_LINK__DEPLOYED_ELEMENT);
		createEReference(abstractDeploymentLinkEClass, ABSTRACT_DEPLOYMENT_LINK__LOCATION);

		abstractPathInvolvedElementEClass = createEClass(ABSTRACT_PATH_INVOLVED_ELEMENT);

		abstractPhysicalArtifactEClass = createEClass(ABSTRACT_PHYSICAL_ARTIFACT);
		createEReference(abstractPhysicalArtifactEClass, ABSTRACT_PHYSICAL_ARTIFACT__ALLOCATOR_CONFIGURATION_ITEMS);

		abstractPhysicalLinkEndEClass = createEClass(ABSTRACT_PHYSICAL_LINK_END);
		createEReference(abstractPhysicalLinkEndEClass, ABSTRACT_PHYSICAL_LINK_END__INVOLVED_LINKS);

		abstractPhysicalPathLinkEClass = createEClass(ABSTRACT_PHYSICAL_PATH_LINK);

		physicalLinkEClass = createEClass(PHYSICAL_LINK);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__LINK_ENDS);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__OWNED_PHYSICAL_LINK_ENDS);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__OWNED_PHYSICAL_LINK_REALIZATIONS);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__CATEGORIES);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__SOURCE_PHYSICAL_PORT);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__TARGET_PHYSICAL_PORT);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__REALIZED_PHYSICAL_LINKS);
		createEReference(physicalLinkEClass, PHYSICAL_LINK__REALIZING_PHYSICAL_LINKS);

		physicalLinkCategoryEClass = createEClass(PHYSICAL_LINK_CATEGORY);
		createEReference(physicalLinkCategoryEClass, PHYSICAL_LINK_CATEGORY__LINKS);

		physicalLinkEndEClass = createEClass(PHYSICAL_LINK_END);
		createEReference(physicalLinkEndEClass, PHYSICAL_LINK_END__PORT);
		createEReference(physicalLinkEndEClass, PHYSICAL_LINK_END__PART);

		physicalLinkRealizationEClass = createEClass(PHYSICAL_LINK_REALIZATION);

		physicalPathEClass = createEClass(PHYSICAL_PATH);
		createEReference(physicalPathEClass, PHYSICAL_PATH__INVOLVED_LINKS);
		createEReference(physicalPathEClass, PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS);
		createEReference(physicalPathEClass, PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS);
		createEReference(physicalPathEClass, PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS);
		createEReference(physicalPathEClass, PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS);
		createEReference(physicalPathEClass, PHYSICAL_PATH__REALIZING_PHYSICAL_PATHS);

		physicalPathInvolvementEClass = createEClass(PHYSICAL_PATH_INVOLVEMENT);
		createEReference(physicalPathInvolvementEClass, PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS);
		createEReference(physicalPathInvolvementEClass, PHYSICAL_PATH_INVOLVEMENT__PREVIOUS_INVOLVEMENTS);
		createEReference(physicalPathInvolvementEClass, PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT);
		createEReference(physicalPathInvolvementEClass, PHYSICAL_PATH_INVOLVEMENT__INVOLVED_COMPONENT);

		physicalPathReferenceEClass = createEClass(PHYSICAL_PATH_REFERENCE);
		createEReference(physicalPathReferenceEClass, PHYSICAL_PATH_REFERENCE__REFERENCED_PHYSICAL_PATH);

		physicalPathRealizationEClass = createEClass(PHYSICAL_PATH_REALIZATION);

		physicalPortEClass = createEClass(PHYSICAL_PORT);
		createEReference(physicalPortEClass, PHYSICAL_PORT__OWNED_COMPONENT_PORT_ALLOCATIONS);
		createEReference(physicalPortEClass, PHYSICAL_PORT__OWNED_PHYSICAL_PORT_REALIZATIONS);
		createEReference(physicalPortEClass, PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS);
		createEReference(physicalPortEClass, PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS);
		createEReference(physicalPortEClass, PHYSICAL_PORT__REALIZING_PHYSICAL_PORTS);

		physicalPortRealizationEClass = createEClass(PHYSICAL_PORT_REALIZATION);
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
		FaPackage theFaPackage = (FaPackage)EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);
		RequirementPackage theRequirementPackage = (RequirementPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);
		CapellacommonPackage theCapellacommonPackage = (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);
		EpbsPackage theEpbsPackage = (EpbsPackage)EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blockArchitecturePkgEClass.getESuperTypes().add(theCapellacorePackage.getModellingArchitecturePkg());
		blockArchitectureEClass.getESuperTypes().add(theFaPackage.getAbstractFunctionalArchitecture());
		blockEClass.getESuperTypes().add(theCapellacorePackage.getModellingBlock());
		blockEClass.getESuperTypes().add(theFaPackage.getAbstractFunctionalBlock());
		componentArchitectureEClass.getESuperTypes().add(this.getBlockArchitecture());
		componentEClass.getESuperTypes().add(this.getBlock());
		componentEClass.getESuperTypes().add(theInformationPackage.getPartitionableElement());
		componentEClass.getESuperTypes().add(this.getInterfaceAllocator());
		componentEClass.getESuperTypes().add(theCommunicationPackage.getCommunicationLinkExchanger());
		abstractActorEClass.getESuperTypes().add(this.getComponent());
		abstractActorEClass.getESuperTypes().add(theCapellacommonPackage.getCapabilityRealizationInvolvedElement());
		partEClass.getESuperTypes().add(theInformationPackage.getPartition());
		partEClass.getESuperTypes().add(theModellingcorePackage.getInformationsExchanger());
		partEClass.getESuperTypes().add(this.getDeployableElement());
		partEClass.getESuperTypes().add(this.getDeploymentTarget());
		partEClass.getESuperTypes().add(this.getAbstractPathInvolvedElement());
		architectureAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		componentAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		systemComponentEClass.getESuperTypes().add(this.getComponent());
		systemComponentEClass.getESuperTypes().add(theCapellacommonPackage.getCapabilityRealizationInvolvedElement());
		interfacePkgEClass.getESuperTypes().add(theCommunicationPackage.getMessageReferencePkg());
		interfacePkgEClass.getESuperTypes().add(theCapellacorePackage.getAbstractDependenciesPkg());
		interfacePkgEClass.getESuperTypes().add(theCapellacorePackage.getAbstractExchangeItemPkg());
		interfaceEClass.getESuperTypes().add(theCapellacorePackage.getGeneralClass());
		interfaceEClass.getESuperTypes().add(this.getInterfaceAllocator());
		interfaceImplementationEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		interfaceUseEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		providedInterfaceLinkEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		requiredInterfaceLinkEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		interfaceAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		interfaceAllocatorEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		actorCapabilityRealizationInvolvementEClass.getESuperTypes().add(theCapellacommonPackage.getCapabilityRealizationInvolvement());
		systemComponentCapabilityRealizationInvolvementEClass.getESuperTypes().add(theCapellacommonPackage.getCapabilityRealizationInvolvement());
		componentContextEClass.getESuperTypes().add(this.getComponent());
		exchangeItemAllocationEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		exchangeItemAllocationEClass.getESuperTypes().add(theInformationPackage.getAbstractEventOperation());
		exchangeItemAllocationEClass.getESuperTypes().add(theModellingcorePackage.getFinalizableElement());
		deployableElementEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		deploymentTargetEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		abstractDeploymentLinkEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		abstractPathInvolvedElementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		abstractPhysicalArtifactEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		abstractPhysicalLinkEndEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		abstractPhysicalPathLinkEClass.getESuperTypes().add(theFaPackage.getComponentExchangeAllocator());
		physicalLinkEClass.getESuperTypes().add(this.getAbstractPhysicalPathLink());
		physicalLinkEClass.getESuperTypes().add(this.getAbstractPhysicalArtifact());
		physicalLinkEClass.getESuperTypes().add(this.getAbstractPathInvolvedElement());
		physicalLinkCategoryEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		physicalLinkEndEClass.getESuperTypes().add(this.getAbstractPhysicalLinkEnd());
		physicalLinkRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		physicalPathEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		physicalPathEClass.getESuperTypes().add(theFaPackage.getComponentExchangeAllocator());
		physicalPathEClass.getESuperTypes().add(this.getAbstractPathInvolvedElement());
		physicalPathEClass.getESuperTypes().add(theCapellacorePackage.getInvolverElement());
		physicalPathInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvement());
		physicalPathReferenceEClass.getESuperTypes().add(this.getPhysicalPathInvolvement());
		physicalPathRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		physicalPortEClass.getESuperTypes().add(theInformationPackage.getPartition());
		physicalPortEClass.getESuperTypes().add(theInformationPackage.getPort());
		physicalPortEClass.getESuperTypes().add(this.getAbstractPhysicalArtifact());
		physicalPortEClass.getESuperTypes().add(theModellingcorePackage.getInformationsExchanger());
		physicalPortEClass.getESuperTypes().add(this.getAbstractPhysicalLinkEnd());
		physicalPortRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());

		// Initialize classes and features; add operations and parameters
		initEClass(blockArchitecturePkgEClass, BlockArchitecturePkg.class, "BlockArchitecturePkg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockArchitectureEClass, BlockArchitecture.class, "BlockArchitecture", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockArchitecture_OwnedRequirementPkgs(), theRequirementPackage.getRequirementsPkg(), null, "ownedRequirementPkgs", null, 0, -1, BlockArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockArchitecture_OwnedAbstractCapabilityPkg(), theCapellacommonPackage.getAbstractCapabilityPkg(), null, "ownedAbstractCapabilityPkg", null, 0, 1, BlockArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockArchitecture_OwnedInterfacePkg(), this.getInterfacePkg(), null, "ownedInterfacePkg", null, 0, 1, BlockArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockArchitecture_OwnedDataPkg(), theInformationPackage.getDataPkg(), null, "ownedDataPkg", null, 0, 1, BlockArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockArchitecture_ProvisionedArchitectureAllocations(), this.getArchitectureAllocation(), this.getArchitectureAllocation_AllocatingArchitecture(), "provisionedArchitectureAllocations", null, 0, -1, BlockArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlockArchitecture_ProvisioningArchitectureAllocations(), this.getArchitectureAllocation(), this.getArchitectureAllocation_AllocatedArchitecture(), "provisioningArchitectureAllocations", null, 0, -1, BlockArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlockArchitecture_AllocatedArchitectures(), this.getBlockArchitecture(), null, "allocatedArchitectures", null, 0, -1, BlockArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlockArchitecture_AllocatingArchitectures(), this.getBlockArchitecture(), null, "allocatingArchitectures", null, 0, -1, BlockArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_OwnedAbstractCapabilityPkg(), theCapellacommonPackage.getAbstractCapabilityPkg(), null, "ownedAbstractCapabilityPkg", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_OwnedInterfacePkg(), this.getInterfacePkg(), null, "ownedInterfacePkg", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_OwnedDataPkg(), theInformationPackage.getDataPkg(), null, "ownedDataPkg", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_OwnedStateMachines(), theCapellacommonPackage.getStateMachine(), null, "ownedStateMachines", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentArchitectureEClass, ComponentArchitecture.class, "ComponentArchitecture", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_OwnedInterfaceUses(), this.getInterfaceUse(), null, "ownedInterfaceUses", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_UsedInterfaceLinks(), this.getInterfaceUse(), this.getInterfaceUse_InterfaceUser(), "usedInterfaceLinks", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_UsedInterfaces(), this.getInterface(), this.getInterface_UserComponents(), "usedInterfaces", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OwnedInterfaceImplementations(), this.getInterfaceImplementation(), null, "ownedInterfaceImplementations", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ImplementedInterfaceLinks(), this.getInterfaceImplementation(), this.getInterfaceImplementation_InterfaceImplementor(), "implementedInterfaceLinks", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ImplementedInterfaces(), this.getInterface(), this.getInterface_ImplementorComponents(), "implementedInterfaces", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ProvisionedComponentAllocations(), this.getComponentAllocation(), this.getComponentAllocation_AllocatingComponent(), "provisionedComponentAllocations", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ProvisioningComponentAllocations(), this.getComponentAllocation(), this.getComponentAllocation_AllocatedComponent(), "provisioningComponentAllocations", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AllocatedComponents(), this.getComponent(), null, "allocatedComponents", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_AllocatingComponents(), this.getComponent(), null, "allocatingComponents", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ProvidedInterfaces(), this.getInterface(), null, "providedInterfaces", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_RequiredInterfaces(), this.getInterface(), null, "requiredInterfaces", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ContainedComponentPorts(), theFaPackage.getComponentPort(), null, "containedComponentPorts", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ContainedParts(), this.getPart(), null, "containedParts", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_ContainedPhysicalPorts(), this.getPhysicalPort(), null, "containedPhysicalPorts", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OwnedPhysicalPath(), this.getPhysicalPath(), null, "ownedPhysicalPath", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OwnedPhysicalLinks(), this.getPhysicalLink(), null, "ownedPhysicalLinks", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_OwnedPhysicalLinkCategories(), this.getPhysicalLinkCategory(), null, "ownedPhysicalLinkCategories", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractActorEClass, AbstractActor.class, "AbstractActor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partEClass, Part.class, "Part", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPart_ProvidedInterfaces(), this.getInterface(), null, "providedInterfaces", null, 0, -1, Part.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPart_RequiredInterfaces(), this.getInterface(), null, "requiredInterfaces", null, 0, -1, Part.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPart_OwnedDeploymentLinks(), this.getAbstractDeploymentLink(), null, "ownedDeploymentLinks", null, 0, -1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPart_DeployedParts(), this.getPart(), null, "deployedParts", null, 0, -1, Part.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPart_DeployingParts(), this.getPart(), null, "deployingParts", null, 0, -1, Part.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPart_OwnedAbstractType(), theModellingcorePackage.getAbstractType(), null, "ownedAbstractType", null, 0, 1, Part.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureAllocationEClass, ArchitectureAllocation.class, "ArchitectureAllocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArchitectureAllocation_AllocatedArchitecture(), this.getBlockArchitecture(), this.getBlockArchitecture_ProvisioningArchitectureAllocations(), "allocatedArchitecture", null, 1, 1, ArchitectureAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureAllocation_AllocatingArchitecture(), this.getBlockArchitecture(), this.getBlockArchitecture_ProvisionedArchitectureAllocations(), "allocatingArchitecture", null, 1, 1, ArchitectureAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentAllocationEClass, ComponentAllocation.class, "ComponentAllocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentAllocation_AllocatedComponent(), this.getComponent(), this.getComponent_ProvisioningComponentAllocations(), "allocatedComponent", null, 0, 1, ComponentAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentAllocation_AllocatingComponent(), this.getComponent(), this.getComponent_ProvisionedComponentAllocations(), "allocatingComponent", null, 0, 1, ComponentAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemComponentEClass, SystemComponent.class, "SystemComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemComponent_DataComponent(), ecorePackage.getEBoolean(), "dataComponent", null, 0, 1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemComponent_DataType(), theCapellacorePackage.getClassifier(), null, "dataType", null, 0, -1, SystemComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemComponent_ParticipationsInCapabilityRealizations(), this.getSystemComponentCapabilityRealizationInvolvement(), null, "participationsInCapabilityRealizations", null, 0, -1, SystemComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(interfacePkgEClass, InterfacePkg.class, "InterfacePkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfacePkg_OwnedInterfaces(), this.getInterface(), null, "ownedInterfaces", null, 0, -1, InterfacePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfacePkg_OwnedInterfacePkgs(), this.getInterfacePkg(), null, "ownedInterfacePkgs", null, 0, -1, InterfacePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Mechanism(), ecorePackage.getEString(), "mechanism", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_Structural(), ecorePackage.getEBoolean(), "structural", "true", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ImplementorComponents(), this.getComponent(), this.getComponent_ImplementedInterfaces(), "implementorComponents", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_UserComponents(), this.getComponent(), this.getComponent_UsedInterfaces(), "userComponents", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_InterfaceImplementations(), this.getInterfaceImplementation(), null, "interfaceImplementations", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_InterfaceUses(), this.getInterfaceUse(), null, "interfaceUses", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ProvisioningInterfaceAllocations(), this.getInterfaceAllocation(), this.getInterfaceAllocation_AllocatedInterface(), "provisioningInterfaceAllocations", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_AllocatingInterfaces(), this.getInterface(), null, "allocatingInterfaces", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_AllocatingComponents(), this.getComponent(), null, "allocatingComponents", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ExchangeItems(), theInformationPackage.getExchangeItem(), null, "exchangeItems", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_OwnedExchangeItemAllocations(), this.getExchangeItemAllocation(), null, "ownedExchangeItemAllocations", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RequiringComponents(), this.getComponent(), null, "requiringComponents", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RequiringComponentPorts(), theFaPackage.getComponentPort(), null, "requiringComponentPorts", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ProvidingComponents(), this.getComponent(), null, "providingComponents", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_ProvidingComponentPorts(), theFaPackage.getComponentPort(), null, "providingComponentPorts", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RealizingLogicalInterfaces(), this.getInterface(), null, "realizingLogicalInterfaces", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RealizedContextInterfaces(), this.getInterface(), null, "realizedContextInterfaces", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RealizingPhysicalInterfaces(), this.getInterface(), null, "realizingPhysicalInterfaces", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_RealizedLogicalInterfaces(), this.getInterface(), null, "realizedLogicalInterfaces", null, 0, -1, Interface.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(interfaceImplementationEClass, InterfaceImplementation.class, "InterfaceImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceImplementation_InterfaceImplementor(), this.getComponent(), this.getComponent_ImplementedInterfaceLinks(), "interfaceImplementor", null, 1, 1, InterfaceImplementation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceImplementation_ImplementedInterface(), this.getInterface(), null, "implementedInterface", null, 1, 1, InterfaceImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceUseEClass, InterfaceUse.class, "InterfaceUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceUse_InterfaceUser(), this.getComponent(), this.getComponent_UsedInterfaceLinks(), "interfaceUser", null, 1, 1, InterfaceUse.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceUse_UsedInterface(), this.getInterface(), null, "usedInterface", null, 1, 1, InterfaceUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedInterfaceLinkEClass, ProvidedInterfaceLink.class, "ProvidedInterfaceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedInterfaceLink_Interface(), this.getInterface(), null, "interface", null, 1, 1, ProvidedInterfaceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredInterfaceLinkEClass, RequiredInterfaceLink.class, "RequiredInterfaceLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredInterfaceLink_Interface(), this.getInterface(), null, "interface", null, 1, 1, RequiredInterfaceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceAllocationEClass, InterfaceAllocation.class, "InterfaceAllocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceAllocation_AllocatedInterface(), this.getInterface(), this.getInterface_ProvisioningInterfaceAllocations(), "allocatedInterface", null, 1, 1, InterfaceAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceAllocation_AllocatingInterfaceAllocator(), this.getInterfaceAllocator(), this.getInterfaceAllocator_ProvisionedInterfaceAllocations(), "allocatingInterfaceAllocator", null, 1, 1, InterfaceAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceAllocatorEClass, InterfaceAllocator.class, "InterfaceAllocator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceAllocator_OwnedInterfaceAllocations(), this.getInterfaceAllocation(), null, "ownedInterfaceAllocations", null, 0, -1, InterfaceAllocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceAllocator_ProvisionedInterfaceAllocations(), this.getInterfaceAllocation(), this.getInterfaceAllocation_AllocatingInterfaceAllocator(), "provisionedInterfaceAllocations", null, 0, -1, InterfaceAllocator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceAllocator_AllocatedInterfaces(), this.getInterface(), null, "allocatedInterfaces", null, 0, -1, InterfaceAllocator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(actorCapabilityRealizationInvolvementEClass, ActorCapabilityRealizationInvolvement.class, "ActorCapabilityRealizationInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemComponentCapabilityRealizationInvolvementEClass, SystemComponentCapabilityRealizationInvolvement.class, "SystemComponentCapabilityRealizationInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentContextEClass, ComponentContext.class, "ComponentContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exchangeItemAllocationEClass, ExchangeItemAllocation.class, "ExchangeItemAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExchangeItemAllocation_SendProtocol(), theCommunicationPackage.getCommunicationLinkProtocol(), "sendProtocol", null, 0, 1, ExchangeItemAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeItemAllocation_ReceiveProtocol(), theCommunicationPackage.getCommunicationLinkProtocol(), "receiveProtocol", null, 0, 1, ExchangeItemAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItemAllocation_AllocatedItem(), theInformationPackage.getExchangeItem(), null, "allocatedItem", null, 0, 1, ExchangeItemAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItemAllocation_AllocatingInterface(), this.getInterface(), null, "allocatingInterface", null, 0, 1, ExchangeItemAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(deployableElementEClass, DeployableElement.class, "DeployableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployableElement_DeployingLinks(), this.getAbstractDeploymentLink(), null, "deployingLinks", null, 0, -1, DeployableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(deploymentTargetEClass, DeploymentTarget.class, "DeploymentTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentTarget_DeploymentLinks(), this.getAbstractDeploymentLink(), null, "deploymentLinks", null, 0, -1, DeploymentTarget.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractDeploymentLinkEClass, AbstractDeploymentLink.class, "AbstractDeploymentLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractDeploymentLink_DeployedElement(), this.getDeployableElement(), null, "deployedElement", null, 1, 1, AbstractDeploymentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractDeploymentLink_Location(), this.getDeploymentTarget(), null, "location", null, 1, 1, AbstractDeploymentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPathInvolvedElementEClass, AbstractPathInvolvedElement.class, "AbstractPathInvolvedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractPhysicalArtifactEClass, AbstractPhysicalArtifact.class, "AbstractPhysicalArtifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractPhysicalArtifact_AllocatorConfigurationItems(), theEpbsPackage.getConfigurationItem(), theEpbsPackage.getConfigurationItem_AllocatedPhysicalArtifacts(), "allocatorConfigurationItems", null, 0, -1, AbstractPhysicalArtifact.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractPhysicalLinkEndEClass, AbstractPhysicalLinkEnd.class, "AbstractPhysicalLinkEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractPhysicalLinkEnd_InvolvedLinks(), this.getPhysicalLink(), null, "involvedLinks", null, 0, -1, AbstractPhysicalLinkEnd.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractPhysicalPathLinkEClass, AbstractPhysicalPathLink.class, "AbstractPhysicalPathLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalLinkEClass, PhysicalLink.class, "PhysicalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalLink_LinkEnds(), this.getAbstractPhysicalLinkEnd(), null, "linkEnds", null, 2, 2, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_OwnedComponentExchangeFunctionalExchangeAllocations(), theFaPackage.getComponentExchangeFunctionalExchangeAllocation(), null, "ownedComponentExchangeFunctionalExchangeAllocations", null, 0, -1, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_OwnedPhysicalLinkEnds(), this.getPhysicalLinkEnd(), null, "ownedPhysicalLinkEnds", null, 0, -1, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_OwnedPhysicalLinkRealizations(), this.getPhysicalLinkRealization(), null, "ownedPhysicalLinkRealizations", null, 0, -1, PhysicalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_Categories(), this.getPhysicalLinkCategory(), null, "categories", null, 0, -1, PhysicalLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_SourcePhysicalPort(), this.getPhysicalPort(), null, "sourcePhysicalPort", null, 0, 1, PhysicalLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_TargetPhysicalPort(), this.getPhysicalPort(), null, "targetPhysicalPort", null, 0, 1, PhysicalLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_RealizedPhysicalLinks(), this.getPhysicalLink(), null, "realizedPhysicalLinks", null, 0, -1, PhysicalLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLink_RealizingPhysicalLinks(), this.getPhysicalLink(), null, "realizingPhysicalLinks", null, 0, -1, PhysicalLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(physicalLinkCategoryEClass, PhysicalLinkCategory.class, "PhysicalLinkCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalLinkCategory_Links(), this.getPhysicalLink(), null, "links", null, 0, -1, PhysicalLinkCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalLinkEndEClass, PhysicalLinkEnd.class, "PhysicalLinkEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalLinkEnd_Port(), this.getPhysicalPort(), null, "port", null, 0, 1, PhysicalLinkEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalLinkEnd_Part(), this.getPart(), null, "part", null, 0, 1, PhysicalLinkEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalLinkRealizationEClass, PhysicalLinkRealization.class, "PhysicalLinkRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalPathEClass, PhysicalPath.class, "PhysicalPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalPath_InvolvedLinks(), this.getAbstractPhysicalPathLink(), null, "involvedLinks", null, 0, -1, PhysicalPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPath_OwnedPhysicalPathInvolvements(), this.getPhysicalPathInvolvement(), null, "ownedPhysicalPathInvolvements", null, 0, -1, PhysicalPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPath_FirstPhysicalPathInvolvements(), this.getPhysicalPathInvolvement(), null, "firstPhysicalPathInvolvements", null, 0, -1, PhysicalPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPath_OwnedPhysicalPathRealizations(), this.getPhysicalPathRealization(), null, "ownedPhysicalPathRealizations", null, 0, -1, PhysicalPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPath_RealizedPhysicalPaths(), this.getPhysicalPath(), null, "realizedPhysicalPaths", null, 0, -1, PhysicalPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPath_RealizingPhysicalPaths(), this.getPhysicalPath(), null, "realizingPhysicalPaths", null, 0, -1, PhysicalPath.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(physicalPathInvolvementEClass, PhysicalPathInvolvement.class, "PhysicalPathInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalPathInvolvement_NextInvolvements(), this.getPhysicalPathInvolvement(), null, "nextInvolvements", null, 0, -1, PhysicalPathInvolvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPathInvolvement_PreviousInvolvements(), this.getPhysicalPathInvolvement(), null, "previousInvolvements", null, 0, -1, PhysicalPathInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPathInvolvement_InvolvedElement(), this.getAbstractPathInvolvedElement(), null, "involvedElement", null, 0, 1, PhysicalPathInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPathInvolvement_InvolvedComponent(), this.getComponent(), null, "involvedComponent", null, 0, 1, PhysicalPathInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(physicalPathReferenceEClass, PhysicalPathReference.class, "PhysicalPathReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalPathReference_ReferencedPhysicalPath(), this.getPhysicalPath(), null, "referencedPhysicalPath", null, 0, 1, PhysicalPathReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(physicalPathRealizationEClass, PhysicalPathRealization.class, "PhysicalPathRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalPortEClass, PhysicalPort.class, "PhysicalPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalPort_OwnedComponentPortAllocations(), theFaPackage.getComponentPortAllocation(), null, "ownedComponentPortAllocations", null, 0, -1, PhysicalPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPort_OwnedPhysicalPortRealizations(), this.getPhysicalPortRealization(), null, "ownedPhysicalPortRealizations", null, 0, -1, PhysicalPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPort_AllocatedComponentPorts(), theFaPackage.getComponentPort(), theFaPackage.getComponentPort_AllocatingPhysicalPorts(), "allocatedComponentPorts", null, 0, -1, PhysicalPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPort_RealizedPhysicalPorts(), this.getPhysicalPort(), null, "realizedPhysicalPorts", null, 0, -1, PhysicalPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalPort_RealizingPhysicalPorts(), this.getPhysicalPort(), null, "realizingPhysicalPorts", null, 0, -1, PhysicalPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(physicalPortRealizationEClass, PhysicalPortRealization.class, "PhysicalPortRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		// http://www.polarsys.org/capella/2007/BusinessInformation
		createBusinessInformationAnnotations();
		// http://www.polarsys.org/capella/2007/UML2Mapping
		createUML2MappingAnnotations();
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
			 "description", "CompositeStructure aims at defining the common component approach composite structure pattern language (close to the UML Composite structure).\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "none",
			 "constraints", "This package depends on the model FunctionalAnalysis.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (blockArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "description", "Container package for BlockArchitecture elements\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (blockArchitectureEClass, 
		   source, 
		   new String[] {
			 "description", "Parent class for deriving specific architectures for each design phase\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
			 "description", "Link to packages that contain requirements\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
			 "description", "Link to packages that contain capabilities\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
			 "description", "Link to packages that contain interfaces\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedDataPkg(), 
		   source, 
		   new String[] {
			 "description", "Link to packages that contain data\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_ProvisionedArchitectureAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of allocation links to other architectures\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_ProvisioningArchitectureAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of allocation links from other architectures to this one\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_AllocatedArchitectures(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to the BlockArchitectures that are allocated from this one\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_AllocatingArchitectures(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to BlockArchitectures that allocate to this architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "description", "A modular unit that describes the structure of a system or element.\r\n[source: SysML specification v1.1]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "n/a (abstract)",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getBlock_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
			 "description", "Link to packages that contain capabilities\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlock_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
			 "description", "Link to packages that contain interfaces\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlock_OwnedDataPkg(), 
		   source, 
		   new String[] {
			 "description", "Link to packages that contain data\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBlock_OwnedStateMachines(), 
		   source, 
		   new String[] {
			 "description", "Link to related state machines\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentArchitectureEClass, 
		   source, 
		   new String[] {
			 "description", "A specialized kind of BlockArchitecture, serving as a parent class for the various architecture levels, from System analysis down to EPBS architecture\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "N/A (abstract)",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "description", "An entity, with discrete structure within the system, that interacts with other Components of the system, thereby contributing at its lowest level to the system properties and characteristics.\r\n[source: Sys EM , ISO/IEC CD 15288]",
			 "arcadia_description", "A component is a constituent part of the system, contributing to its behaviour, by interacting with other components and external actors, thereby contributing at its lowest level to the system properties and characteristics. Example: radio receiver, graphical user interface...\r\nDifferent kinds of components exist: see below (logical component, physical component...).",
			 "usage guideline", "none",
			 "used in levels", "n/a (abstract)",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponent_OwnedInterfaceUses(), 
		   source, 
		   new String[] {
			 "description", "InterfaceUse relationships that are stored/owned under this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_UsedInterfaceLinks(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) interfaceUse relationships that involve this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_UsedInterfaces(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to the Interfaces being used by this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_OwnedInterfaceImplementations(), 
		   source, 
		   new String[] {
			 "description", "Interface implementation relationships that are stored/owned under this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaceLinks(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of InterfaceImplementation links that involve this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaces(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to the Interfaces being implemented by this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_ProvisionedComponentAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of allocation links made from this component to other components\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_ProvisioningComponentAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of allocation links from other components, to this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_AllocatedComponents(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to the components being allocated from this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_AllocatingComponents(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to the components allocating this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_ProvidedInterfaces(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to the Interfaces being provided by this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_RequiredInterfaces(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to the Interfaces being required by this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_OwnedPhysicalPath(), 
		   source, 
		   new String[] {
			 "description", "the PhysicalPaths that are stored/owned by this physical component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_OwnedPhysicalLinks(), 
		   source, 
		   new String[] {
			 "description", "Physical links contained in / owned by this Physical component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponent_OwnedPhysicalLinkCategories(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractActorEClass, 
		   source, 
		   new String[] {
			 "description", "An Actor models a type of role played by an entity that interacts with the subject (e.g., by exchanging signals and data),\r\nbut which is external to the subject (i.e., in the sense that an instance of an actor is not a part of the instance of its corresponding subject). \r\n\r\nActors may represent roles played by human users, external hardware, or other subjects.\r\nNote that an actor does not necessarily represent a specific physical entity but merely a particular facet (i.e., \'role\') of some entity\r\nthat is relevant to the specification of its associated use cases. Thus, a single physical instance may play the role of\r\nseveral different actors and, conversely, a given actor may be played by multiple different instances.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "none",
			 "used in levels", "n/a (abstract)",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (partEClass, 
		   source, 
		   new String[] {
			 "description", "In SysML, a Part is an owned property of a Block\r\n[source: SysML glossary for SysML v1.0]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPart_ProvidedInterfaces(), 
		   source, 
		   new String[] {
			 "description", "(computed) the provided interfaces associated to the classifier that this part represents\r\n[source: Capella study]\r\n\r\nThe interfaces that the component exposes to its environment.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPart_RequiredInterfaces(), 
		   source, 
		   new String[] {
			 "description", "(computed) the required interfaces associated to the classifier that this part represents\r\n[source: Capella study]\r\n\r\nThe interfaces that the component requires from other components in its environment in order to be able to offer\r\nits full set of provided functionality\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPart_OwnedDeploymentLinks(), 
		   source, 
		   new String[] {
			 "description", "Deployment relationships that are stored/owned under this part",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (architectureAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "Mediator class between BlockArchitecture elements, to represent an allocation link\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getArchitectureAllocation_AllocatedArchitecture(), 
		   source, 
		   new String[] {
			 "description", "Specifies the allocated architecture\r\n[source: Capella study]\r\n\r\nSpecifies the targets of the DirectedRelationship.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getArchitectureAllocation_AllocatingArchitecture(), 
		   source, 
		   new String[] {
			 "description", "Specifies the allocating architecture\r\n[source: Capella study]\r\n\r\nSpecifies the sources of the DirectedRelationship.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "Mediator class between Component elements, representing the allocation link between these elements\r\n[source: Capella light-light study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentAllocation_AllocatedComponent(), 
		   source, 
		   new String[] {
			 "description", "Specifies the allocated component\r\n[source: Capella study]\r\n\r\nSpecifies the targets of the DirectedRelationship.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentAllocation_AllocatingComponent(), 
		   source, 
		   new String[] {
			 "description", "Specifies the allocating component\r\n[source: Capella study]\r\n\r\nSpecifies the targets of the DirectedRelationship.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (systemComponentEClass, 
		   source, 
		   new String[] {
			 "description", "An entity, with discrete structure within the system, that interacts with other Components of the system, thereby contributing at its lowest level to the system properties and characteristics.\r\n[source: Sys EM , ISO/IEC CD 15288]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a (abstract)",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystemComponent_DataComponent(), 
		   source, 
		   new String[] {
			 "description", "specifies whether or not this is a data component\r\n[source: Capella light-light study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemComponent_DataType(), 
		   source, 
		   new String[] {
			 "description", "data type(s) associated to this component\r\n[source: Capella light-light study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getSystemComponent_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the involvement relationships between this SystemComponent and CapabilityRealization elements\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (interfacePkgEClass, 
		   source, 
		   new String[] {
			 "description", "A container for Interface elements\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfaces(), 
		   source, 
		   new String[] {
			 "description", "Specifies the interfaces that are owned by this Package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfacePkgs(), 
		   source, 
		   new String[] {
			 "description", "Specifies the packages of interfaces that are owned by this Package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "description", "An interface is a kind of classifier that represents a declaration of a set of coherent public features and obligations. An\r\ninterface specifies a contract; any instance of a classifier that realizes the interface must fulfill that contract.\r\n[source: UML superstructure v2.2]\r\n\r\nInterfaces are defined by functional and physical characteristics that exist at a common boundary with co-functioning items and allow systems, equipment, software, and system data to be compatible.\r\n[source: not precised]\r\n\r\nThat design feature of one piece of equipment that affects a design feature of another piece of equipment. \r\nAn interface can extend beyond the physical boundary between two items. (For example, the weight and center of gravity of one item can affect the interfacing item; however, the center of gravity is rarely located at the physical boundary.\r\nAn electrical interface generally extends to the first isolating element rather than terminating at a series of connector pins.)",
			 "usage guideline", "In Capella, Interfaces are created to declare the nature of interactions between the System and external actors.",
			 "used in levels", "system/logical/physical",
			 "usage examples", "../img/usage_examples/external_interface_example.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInterface_Mechanism(), 
		   source, 
		   new String[] {
			 "description", "_todo_reviewed : cannot find the meaning of this attribute ? How to fill it ?",
			 "constraints", "none",
			 "type", "_todo_reviewed : to be precised",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_Structural(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_ImplementorComponents(), 
		   source, 
		   new String[] {
			 "description", "references to the components that implement this interface\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_UserComponents(), 
		   source, 
		   new String[] {
			 "description", "references to the components that use this interface\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_InterfaceImplementations(), 
		   source, 
		   new String[] {
			 "description", "references to the InterfaceImplementation elements, that act as mediators between this interface and its implementers\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_InterfaceUses(), 
		   source, 
		   new String[] {
			 "description", "references to the InterfaceUse elements, that act as mediator classes between this interface and its users\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_ProvisioningInterfaceAllocations(), 
		   source, 
		   new String[] {
			 "description", "References to the InterfaceAllocation elements, acting as mediator classes between the interface and the elements to which/from which it is allocated\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_AllocatingInterfaces(), 
		   source, 
		   new String[] {
			 "description", "References to the Interfaces that declare an allocation link to this Interface\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_AllocatingComponents(), 
		   source, 
		   new String[] {
			 "description", "References to the components that declare an allocation link to this Interface\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_ExchangeItems(), 
		   source, 
		   new String[] {
			 "description", "References to all exchange items allocated by the interface",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterface_OwnedExchangeItemAllocations(), 
		   source, 
		   new String[] {
			 "description", "References to allocations of exchange items",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (interfaceImplementationEClass, 
		   source, 
		   new String[] {
			 "description", "Mediator class between an Interface and its implementor (typically a Component)\r\n[source: Capella study]\r\n\r\nAn InterfaceRealization is a specialized Realization relationship between a Classifier and an Interface. This relationship\r\nsignifies that the realizing classifier conforms to the contract specified by the Interface.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInterfaceImplementation_InterfaceImplementor(), 
		   source, 
		   new String[] {
			 "description", "References the Component that owns this Interface implementation.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterfaceImplementation_ImplementedInterface(), 
		   source, 
		   new String[] {
			 "description", "References the Interface specifying the conformance contract\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (interfaceUseEClass, 
		   source, 
		   new String[] {
			 "description", "Mediator class between an interface and its user (typically a Component)\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInterfaceUse_InterfaceUser(), 
		   source, 
		   new String[] {
			 "description", "Component that uses the interface\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterfaceUse_UsedInterface(), 
		   source, 
		   new String[] {
			 "description", "Supplied interface\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (providedInterfaceLinkEClass, 
		   source, 
		   new String[] {
			 "description", "(not used)",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "n/a",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "n/a"
		   });	
		addAnnotation
		  (getProvidedInterfaceLink_Interface(), 
		   source, 
		   new String[] {
			 "description", "References the Interface specifying the conformance contract\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (requiredInterfaceLinkEClass, 
		   source, 
		   new String[] {
			 "description", "(not used)",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "n/a",
			 "comment/notes", "not used/implemented as of Capella",
			 "reference documentation", "n/a"
		   });	
		addAnnotation
		  (getRequiredInterfaceLink_Interface(), 
		   source, 
		   new String[] {
			 "description", "The element(s) independent of the client element(s), in the same respect and the same dependency relationship\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (interfaceAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "Mediator class between an Interface and an element that allocates to/from it.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInterfaceAllocation_AllocatedInterface(), 
		   source, 
		   new String[] {
			 "description", "Specifies the allocated interface\r\n[source: Capella study]\r\n\r\nSpecifies the targets of the DirectedRelationship.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterfaceAllocation_AllocatingInterfaceAllocator(), 
		   source, 
		   new String[] {
			 "description", "Specifies the allocating interface\r\n[source: Capella study]\r\n\r\nSpecifies the sources of the DirectedRelationship.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (interfaceAllocatorEClass, 
		   source, 
		   new String[] {
			 "description", "Base class for elements that need to be involved in an allocation link to/from an Interface\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInterfaceAllocator_OwnedInterfaceAllocations(), 
		   source, 
		   new String[] {
			 "description", "the interface allocation links that are stored/owned under this interface allocator\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterfaceAllocator_ProvisionedInterfaceAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the interface allocation links involving this interface allocator\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInterfaceAllocator_AllocatedInterfaces(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to the Interfaces being allocated by this interface allocator\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (actorCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "description", "support class to implement the link between an Actor and a CapabilityRealization\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system, logical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (systemComponentCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "description", "Support class for implementation of the link between a CapabilityRealization and a SystemComponent\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "logical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (componentContextEClass, 
		   source, 
		   new String[] {
			 "description", "Base class for specific SystemContext, LogicalContext, PhysicalContext\r\n[source: Capella study]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (exchangeItemAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "Allocation link between exchange items and interface that support them",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExchangeItemAllocation_SendProtocol(), 
		   source, 
		   new String[] {
			 "description", "describes the default protocol used by the sender of the exchange item. It could be overrided by the protocol used by the given communication exchanger",
			 "constraints", "none",
			 "type", "refer to CommunicationLinkProtocol definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItemAllocation_ReceiveProtocol(), 
		   source, 
		   new String[] {
			 "description", "describes the default protocol used by the receiver of the exchange item. It could be overrided by the protocol used by the given communication exchanger",
			 "constraints", "none",
			 "type", "refer to CommunicationLinkProtocol definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItemAllocation_AllocatedItem(), 
		   source, 
		   new String[] {
			 "description", "the exchange item that is being allocated by the interface",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItemAllocation_AllocatingInterface(), 
		   source, 
		   new String[] {
			 "description", "the interface that allocated the given exchange item",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (deployableElementEClass, 
		   source, 
		   new String[] {
			 "description", "characterizes a physical model element that is intended to be deployed on a given (physical) target\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getDeployableElement_DeployingLinks(), 
		   source, 
		   new String[] {
			 "description", "the list of deployment specifications associated to this element, e.g. associations between this element and a physical location to which it is to be deployed\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (deploymentTargetEClass, 
		   source, 
		   new String[] {
			 "description", "the physical target that will host a deployable element\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getDeploymentTarget_DeploymentLinks(), 
		   source, 
		   new String[] {
			 "description", "the list of deployment specifications involving this physical target as the destination of the deployment\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractDeploymentLinkEClass, 
		   source, 
		   new String[] {
			 "description", "the link between a physical element, and the physical target onto which it is deployed\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_DeployedElement(), 
		   source, 
		   new String[] {
			 "description", "the physical element involved in this relationship, that is to be deployed on the target\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_Location(), 
		   source, 
		   new String[] {
			 "description", "the host where the source element involved in this relationship will be deployed\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractPathInvolvedElementEClass, 
		   source, 
		   new String[] {
			 "description", "An involved element is a capella element that is, at least, involved in an involvement relationship with the role of the element that is involved\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractPhysicalArtifactEClass, 
		   source, 
		   new String[] {
			 "description", "A physical artifact is any physical element in the physical architecture (component, port, link,...).\r\nThese artifacts will be part allocated to configuration items in the EPBS.",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractPhysicalLinkEndEClass, 
		   source, 
		   new String[] {
			 "description", "End of a physical link",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalLinkEnd_InvolvedLinks(), 
		   source, 
		   new String[] {
			 "description", "Physical links that come in or out of this physical port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractPhysicalPathLinkEClass, 
		   source, 
		   new String[] {
			 "description", "the base element for building a physical path : a link between two physical interfaces\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (physicalLinkEClass, 
		   source, 
		   new String[] {
			 "description", "the representation of the physical medium connecting two physical interfaces\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_LinkEnds(), 
		   source, 
		   new String[] {
			 "description", "the source(s) and destination(s) of this physical link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_OwnedComponentExchangeFunctionalExchangeAllocations(), 
		   source, 
		   new String[] {
			 "description", "the allocations between component exchanges and functional exchanges, that are owned by this physical link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_OwnedPhysicalLinkEnds(), 
		   source, 
		   new String[] {
			 "description", "the physical link endpoints involved in this link\r\n\r\nA connector consists of at least two connector ends, each representing the participation of instances of the classifiers\r\ntyping the connectable elements attached to this end. The set of connector ends is ordered.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_OwnedPhysicalLinkRealizations(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_RealizedPhysicalLinks(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_RealizingPhysicalLinks(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalLinkEndEClass, 
		   source, 
		   new String[] {
			 "description", "an endpoint of a physical link\r\n\r\nA connector end is an endpoint of a connector, which attaches the connector to a connectable element. Each connector\r\nend is part of one connector.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Port(), 
		   source, 
		   new String[] {
			 "description", "the port to which this communication endpoint is attached\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Part(), 
		   source, 
		   new String[] {
			 "description", "the part to which this connect endpoint is attached\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalLinkRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "n/a",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (physicalPathEClass, 
		   source, 
		   new String[] {
			 "description", "the specification of a given path of informations flowing across physical links and interfaces.\r\n[source: Capella study]",
			 "usage guideline", "this is the equivalent for the physical architecture, of a functional chain defined at system level",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalPath_InvolvedLinks(), 
		   source, 
		   new String[] {
			 "description", "the list of steps of this physical path\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalPath_OwnedPhysicalPathRealizations(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalPath_RealizedPhysicalPaths(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalPath_RealizingPhysicalPaths(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalPathRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "n/a",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (physicalPortEClass, 
		   source, 
		   new String[] {
			 "description", "A port on a physical component\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalPort_OwnedPhysicalPortRealizations(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalPort_RealizedPhysicalPorts(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalPort_RealizingPhysicalPorts(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalPortRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "n/a",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
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
		  (getBlockArchitecture_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedDataPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlock_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlock_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlock_OwnedDataPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlock_OwnedStateMachines(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_UsedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_AllocatedComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_AllocatingComponents(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getComponent_ProvidedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_RequiredInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ContainedComponentPorts(), 
		   source, 
		   new String[] {
			 "feature", "ownedFeatures"
		   });	
		addAnnotation
		  (getComponent_ContainedParts(), 
		   source, 
		   new String[] {
			 "feature", "ownedFeatures"
		   });	
		addAnnotation
		  (getComponent_ContainedPhysicalPorts(), 
		   source, 
		   new String[] {
			 "feature", "ownedFeatures"
		   });	
		addAnnotation
		  (getComponent_OwnedPhysicalPath(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_OwnedPhysicalLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_OwnedPhysicalLinkCategories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (partEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPart_DeployedParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPart_DeployingParts(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getPart_OwnedAbstractType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemComponent_DataComponent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (interfacePkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfacePkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_Mechanism(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_ImplementorComponents(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getInterface_UserComponents(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getInterface_ExchangeItems(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getInterface_OwnedExchangeItemAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_RequiringComponents(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getInterface_RequiringComponentPorts(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getInterface_ProvidingComponents(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getInterface_ProvidingComponentPorts(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getInterface_RealizingLogicalInterfaces(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getInterface_RealizedContextInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_RealizingPhysicalInterfaces(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getInterface_RealizedLogicalInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (exchangeItemAllocationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemAllocation_SendProtocol(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemAllocation_ReceiveProtocol(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemAllocation_AllocatedItem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_DeployedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_Location(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractPhysicalArtifact_AllocatorConfigurationItems(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getAbstractPhysicalLinkEnd_InvolvedLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (physicalLinkEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_LinkEnds(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_OwnedPhysicalLinkEnds(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_Categories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_SourcePhysicalPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_TargetPhysicalPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_RealizedPhysicalLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_RealizingPhysicalLinks(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (physicalLinkCategoryEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLinkCategory_Links(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (physicalLinkEndEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Port(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Part(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (physicalPathEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPath_OwnedPhysicalPathInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPath_FirstPhysicalPathInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPath_RealizedPhysicalPaths(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPath_RealizingPhysicalPaths(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (physicalPathInvolvementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_NextInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_PreviousInvolvements(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_InvolvedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (physicalPathReferenceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPathReference_ReferencedPhysicalPath(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (physicalPortEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPort_AllocatedComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPort_RealizedPhysicalPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPort_RealizingPhysicalPorts(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
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
		  (blockArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (blockArchitectureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Package",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which RequirementsPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which AbstractCapabilityPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [1..1]"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which InterfacePkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedDataPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which DataPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getBlockArchitecture_ProvisionedArchitectureAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_ProvisioningArchitectureAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_AllocatedArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBlockArchitecture_AllocatingArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::BehavioredClassifier",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBlock_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Descendants are mapped to SysML::Blocks::Block, which cannot contain a Package.\r\nTherefore, store these AbstractCapabilityPackages in the nearest available package.",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getBlock_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which InterfacePkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getBlock_OwnedDataPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which DataPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getBlock_OwnedStateMachines(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::BehavioredClassifier::ownedBehavior",
			 "explanation", "none",
			 "constraints", "uml::BehavioredClassifier::ownedBehavior elements on which StateMachine stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (componentArchitectureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Class",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_OwnedInterfaceUses(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "uml::NamedElement::clientDependency elements on which InterfaceUse stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getComponent_UsedInterfaceLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_UsedInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_OwnedInterfaceImplementations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::BehavioredClassifier::interfaceRealization",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaceLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_ProvisionedComponentAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_ProvisioningComponentAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_AllocatedComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_AllocatingComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_ProvidedInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_RequiredInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_ContainedComponentPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_ContainedParts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_ContainedPhysicalPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_OwnedPhysicalPath(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "SysML::Blocks::Block cannot contain PhysicalPath\'s equivalent, hence we find the nearest available package to store them.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponent_OwnedPhysicalLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::StructuredClassifier::ownedConnector",
			 "explanation", "since PhysicalLink is mapped to uml::Connector",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractActorEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "SysML::Blocks::Block",
			 "constraints", "none"
		   });	
		addAnnotation
		  (partEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "should be mapped to uml::Property, but one of its concrete ancestors already is (Property), so avoid redefining it\r\nat this level to avoid profile generation issue",
			 "constraints", "information::Property must have as base metaclass uml::Property"
		   });	
		addAnnotation
		  (getPart_ProvidedInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPart_RequiredInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPart_OwnedDeploymentLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPart_DeployedParts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPart_DeployingParts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (architectureAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Realization",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getArchitectureAllocation_AllocatedArchitecture(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getArchitectureAllocation_AllocatingArchitecture(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ComponentRealization or uml::InterfaceRealization regarding the baseMetaClass of the realized element",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentAllocation_AllocatedComponent(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentAllocation_AllocatingComponent(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemComponentEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemComponent_DataComponent(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemComponent_DataType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemComponent_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (interfacePkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which Interface stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfacePkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which InterfacePkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Interface",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_Mechanism(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_ImplementorComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_UserComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_InterfaceImplementations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::InterfaceRealization::contract",
			 "constraints", "uml::Element::ownedElement elements on which InterfaceImplementation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getInterface_InterfaceUses(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Dependency::supplier",
			 "constraints", "uml::Element::ownedElement elements on which InterfaceUse stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getInterface_ProvisioningInterfaceAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_AllocatingInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_AllocatingComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_ExchangeItems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_OwnedExchangeItemAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_RequiringComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_RequiringComponentPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_ProvidingComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_ProvidingComponentPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_RealizingLogicalInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_RealizedContextInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_RealizingPhysicalInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterface_RealizedLogicalInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (interfaceImplementationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::InterfaceRealization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterfaceImplementation_InterfaceImplementor(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterfaceImplementation_ImplementedInterface(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::InterfaceRealization::contract",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (interfaceUseEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Usage",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterfaceUse_InterfaceUser(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterfaceUse_UsedInterface(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (providedInterfaceLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::InterfaceRealization",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getProvidedInterfaceLink_Interface(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::InterfaceRealization::contract",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (requiredInterfaceLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Usage",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequiredInterfaceLink_Interface(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "uml::Dependency::supplier elements on which Interface stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [1..1]"
		   });	
		addAnnotation
		  (interfaceAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterfaceAllocation_AllocatedInterface(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterfaceAllocation_AllocatingInterfaceAllocator(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (interfaceAllocatorEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Classifier",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterfaceAllocator_OwnedInterfaceAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "Some elements on which InterfaceAllocation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getInterfaceAllocator_ProvisionedInterfaceAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInterfaceAllocator_AllocatedInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (actorCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemComponentCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentContextEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeItemAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemAllocation_SendProtocol(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemAllocation_ReceiveProtocol(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemAllocation_AllocatedItem(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemAllocation_AllocatingInterface(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (deployableElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::NamedElement",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDeployableElement_DeployingLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Dependency::supplier",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (deploymentTargetEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::DeploymentTarget",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDeploymentTarget_DeploymentLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency",
			 "explanation", "none",
			 "constraints", "uml::DeploymentTarget::deployment elements on which AbstractDeployment stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (abstractDeploymentLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Dependency,could be mapped on uml::Deployment, but dependencies diagram allows to \"deploy\" more capella element types.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_DeployedElement(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_Location(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "none",
			 "constraints", "uml::Dependency::client elements on which DeploymentTarget stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (abstractPathInvolvedElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractPhysicalArtifactEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalArtifact_AllocatorConfigurationItems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractPhysicalLinkEndEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalLinkEnd_InvolvedLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractPhysicalPathLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Connector",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_LinkEnds(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "first need to create ConnectorEnds pointing to the Ports, and then reference them in uml::Connector::end",
			 "constraints", "cardinality must be [2..2]"
		   });	
		addAnnotation
		  (getPhysicalLink_OwnedComponentExchangeFunctionalExchangeAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "some elements on which ComponentFunctionalExchangeAllocation stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getPhysicalLink_OwnedPhysicalLinkEnds(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Connector::end",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_OwnedPhysicalLinkRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_SourcePhysicalPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalLink_TargetPhysicalPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalLinkEndEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::ConnectorEnd",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Port(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ConnectorEnd::role",
			 "explanation", "none",
			 "constraints", "uml::ConnectorEnd::role elements on which PhysicalPort stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Part(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ConnectorEnd::partWithPort",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalLinkRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalPathEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Class",
			 "explanation", "_todo_",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPath_InvolvedLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPath_OwnedPhysicalPathInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPath_FirstPhysicalPathInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPath_OwnedPhysicalPathRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalPathInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_NextInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_PreviousInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_InvolvedElement(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_InvolvedComponent(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalPathReferenceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPathReference_ReferencedPhysicalPath(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalPathRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalPortEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::PortAndFlows::FlowPort",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPort_OwnedPhysicalPortRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalPort_AllocatedComponentPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalPortRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "none",
			 "explanation", "none",
			 "constraints", "none"
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
		  (blockArchitectureEClass, 
		   source, 
		   new String[] {
			 "Label", "BlockArchitecture"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
			 "Label", "ownedRequirementPkgs"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedAspectPkg"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedInterfacePkg"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedDataPkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedDataPkg"
		   });	
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "Label", "Block"
		   });	
		addAnnotation
		  (getBlock_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
			 "Label", "aspectPkg"
		   });	
		addAnnotation
		  (getBlock_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedInterfacePkg"
		   });	
		addAnnotation
		  (getBlock_OwnedDataPkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedDataPkg"
		   });	
		addAnnotation
		  (componentArchitectureEClass, 
		   source, 
		   new String[] {
			 "Label", "ComponentArchitecture"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "Label", "Component"
		   });	
		addAnnotation
		  (getComponent_OwnedInterfaceUses(), 
		   source, 
		   new String[] {
			 "Label", "ownedInterfaceUses"
		   });	
		addAnnotation
		  (getComponent_UsedInterfaceLinks(), 
		   source, 
		   new String[] {
			 "Label", "usedInterfaceLinks"
		   });	
		addAnnotation
		  (getComponent_UsedInterfaces(), 
		   source, 
		   new String[] {
			 "Label", "usedInterfaces"
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaceLinks(), 
		   source, 
		   new String[] {
			 "Label", "realizedInterfaceLinks"
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaces(), 
		   source, 
		   new String[] {
			 "Label", "implementedInterfaces"
		   });	
		addAnnotation
		  (getComponent_ProvidedInterfaces(), 
		   source, 
		   new String[] {
			 "Label", "providedInterfaces"
		   });	
		addAnnotation
		  (getComponent_RequiredInterfaces(), 
		   source, 
		   new String[] {
			 "Label", "requiredInterfaces"
		   });	
		addAnnotation
		  (abstractActorEClass, 
		   source, 
		   new String[] {
			 "Label", "AbstractActor"
		   });	
		addAnnotation
		  (partEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalPart"
		   });	
		addAnnotation
		  (getPart_ProvidedInterfaces(), 
		   source, 
		   new String[] {
			 "Label", "providedInterfaces"
		   });	
		addAnnotation
		  (getPart_RequiredInterfaces(), 
		   source, 
		   new String[] {
			 "Label", "requiredInterfaces"
		   });	
		addAnnotation
		  (architectureAllocationEClass, 
		   source, 
		   new String[] {
			 "Label", "ArchitectureAllocation"
		   });	
		addAnnotation
		  (componentAllocationEClass, 
		   source, 
		   new String[] {
			 "Label", "ComponentAllocation"
		   });	
		addAnnotation
		  (systemComponentEClass, 
		   source, 
		   new String[] {
			 "Label", "SystemComponent"
		   });	
		addAnnotation
		  (getSystemComponent_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "Label", "participationsInCapabilityRealizations"
		   });	
		addAnnotation
		  (interfacePkgEClass, 
		   source, 
		   new String[] {
			 "Label", "InterfacePkg"
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfaces(), 
		   source, 
		   new String[] {
			 "Label", "ownedInterfaces"
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfacePkgs(), 
		   source, 
		   new String[] {
			 "Label", "subInterfacePkgs"
		   });	
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "Label", "Interface"
		   });	
		addAnnotation
		  (getInterface_ImplementorComponents(), 
		   source, 
		   new String[] {
			 "Label", "implementorComponents"
		   });	
		addAnnotation
		  (getInterface_UserComponents(), 
		   source, 
		   new String[] {
			 "Label", "userComponents"
		   });	
		addAnnotation
		  (getInterface_InterfaceImplementations(), 
		   source, 
		   new String[] {
			 "Label", "interfaceImplementations"
		   });	
		addAnnotation
		  (getInterface_InterfaceUses(), 
		   source, 
		   new String[] {
			 "Label", "interfaceUses"
		   });	
		addAnnotation
		  (interfaceImplementationEClass, 
		   source, 
		   new String[] {
			 "Label", "InterfaceImplementation"
		   });	
		addAnnotation
		  (getInterfaceImplementation_InterfaceImplementor(), 
		   source, 
		   new String[] {
			 "Label", "Interface Implementor"
		   });	
		addAnnotation
		  (getInterfaceImplementation_ImplementedInterface(), 
		   source, 
		   new String[] {
			 "Label", "realizedInterface"
		   });	
		addAnnotation
		  (interfaceUseEClass, 
		   source, 
		   new String[] {
			 "Label", "InterfaceUse"
		   });	
		addAnnotation
		  (getInterfaceUse_InterfaceUser(), 
		   source, 
		   new String[] {
			 "Label", "interfaceUser"
		   });	
		addAnnotation
		  (getInterfaceUse_UsedInterface(), 
		   source, 
		   new String[] {
			 "Label", "usedInterface"
		   });	
		addAnnotation
		  (providedInterfaceLinkEClass, 
		   source, 
		   new String[] {
			 "Label", "ProvidedInterfaceLink"
		   });	
		addAnnotation
		  (getProvidedInterfaceLink_Interface(), 
		   source, 
		   new String[] {
			 "Label", "interface"
		   });	
		addAnnotation
		  (requiredInterfaceLinkEClass, 
		   source, 
		   new String[] {
			 "Label", "RequiredInterfaceLink"
		   });	
		addAnnotation
		  (getRequiredInterfaceLink_Interface(), 
		   source, 
		   new String[] {
			 "Label", "interface"
		   });	
		addAnnotation
		  (interfaceAllocationEClass, 
		   source, 
		   new String[] {
			 "Label", "InterfaceRealization"
		   });	
		addAnnotation
		  (actorCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "Label", "ActorCapabilityRealizationInvolvement"
		   });	
		addAnnotation
		  (systemComponentCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "Label", "SystemComponentCapabilityRealizationInvolvement"
		   });	
		addAnnotation
		  (deployableElementEClass, 
		   source, 
		   new String[] {
			 "Label", "DeployableElement"
		   });	
		addAnnotation
		  (getDeployableElement_DeployingLinks(), 
		   source, 
		   new String[] {
			 "Label", "deployingLinks"
		   });	
		addAnnotation
		  (deploymentTargetEClass, 
		   source, 
		   new String[] {
			 "Label", "DeploymentTarget"
		   });	
		addAnnotation
		  (getDeploymentTarget_DeploymentLinks(), 
		   source, 
		   new String[] {
			 "Label", "deployments"
		   });	
		addAnnotation
		  (abstractDeploymentLinkEClass, 
		   source, 
		   new String[] {
			 "Label", "AbstractDeployement"
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_DeployedElement(), 
		   source, 
		   new String[] {
			 "Label", "deployedElement"
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_Location(), 
		   source, 
		   new String[] {
			 "Label", "location"
		   });	
		addAnnotation
		  (physicalLinkEndEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalLinkEnd"
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Port(), 
		   source, 
		   new String[] {
			 "Label", "port"
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Part(), 
		   source, 
		   new String[] {
			 "Label", "part"
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
		  (blockArchitectureEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedDataPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component"
		   });	
		addAnnotation
		  (getBlock_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
		   });	
		addAnnotation
		  (getBlock_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
		   });	
		addAnnotation
		  (getBlock_OwnedDataPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
		   });	
		addAnnotation
		  (componentArchitectureEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component"
		   });	
		addAnnotation
		  (getComponent_OwnedInterfaceUses(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
		   });	
		addAnnotation
		  (getComponent_UsedInterfaceLinks(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaceLinks(), 
		   source, 
		   new String[] {
			 "featureName", "interfaceRealization",
			 "featureOwner", "BehavioredClassifier"
		   });	
		addAnnotation
		  (abstractActorEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component"
		   });	
		addAnnotation
		  (partEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Property",
			 "stereotype", "eng.PhysicalPart"
		   });	
		addAnnotation
		  (architectureAllocationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency"
		   });	
		addAnnotation
		  (componentAllocationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency"
		   });	
		addAnnotation
		  (systemComponentEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component"
		   });	
		addAnnotation
		  (getSystemComponent_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (interfacePkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.InterfacePkg"
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfaces(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfacePkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (interfaceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Interface",
			 "stereotype", "eng.Interface"
		   });	
		addAnnotation
		  (getInterface_Mechanism(), 
		   source, 
		   new String[] {
			 "featureName", "mechanism",
			 "featureOwner", "eng.Interface",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getInterface_InterfaceImplementations(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "contract",
			 "umlOppositeReferenceOwner", "InterfaceRealization"
		   });	
		addAnnotation
		  (getInterface_InterfaceUses(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (interfaceImplementationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "InterfaceRealization",
			 "stereotype", "eng.InterfaceImplementation"
		   });	
		addAnnotation
		  (getInterfaceImplementation_InterfaceImplementor(), 
		   source, 
		   new String[] {
			 "featureName", "implementingClassifier",
			 "featureOwner", "InterfaceRealization"
		   });	
		addAnnotation
		  (getInterfaceImplementation_ImplementedInterface(), 
		   source, 
		   new String[] {
			 "featureName", "contract",
			 "featureOwner", "InterfaceRealization"
		   });	
		addAnnotation
		  (interfaceUseEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Usage",
			 "stereotype", "eng.InterfaceUse"
		   });	
		addAnnotation
		  (getInterfaceUse_InterfaceUser(), 
		   source, 
		   new String[] {
			 "featureName", "client",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getInterfaceUse_UsedInterface(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (providedInterfaceLinkEClass, 
		   source, 
		   new String[] {
			 "metaclass", "InterfaceRealization",
			 "stereotype", "eng.ProvidedInterfaceLink"
		   });	
		addAnnotation
		  (getProvidedInterfaceLink_Interface(), 
		   source, 
		   new String[] {
			 "featureName", "contract",
			 "featureOwner", "InterfaceRealization"
		   });	
		addAnnotation
		  (requiredInterfaceLinkEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Usage",
			 "stereotype", "eng.RequiredInterfaceLink"
		   });	
		addAnnotation
		  (getRequiredInterfaceLink_Interface(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (interfaceAllocationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.InterfaceRealization"
		   });	
		addAnnotation
		  (actorCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.ActorCapabilityRealizationInvolvement"
		   });	
		addAnnotation
		  (systemComponentCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.SystemComponentCapabilityRealizationInvolvement"
		   });	
		addAnnotation
		  (deployableElementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "NamedElement"
		   });	
		addAnnotation
		  (getDeployableElement_DeployingLinks(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (deploymentTargetEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Namespace"
		   });	
		addAnnotation
		  (getDeploymentTarget_DeploymentLinks(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (abstractDeploymentLinkEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency"
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_DeployedElement(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_Location(), 
		   source, 
		   new String[] {
			 "featureName", "client",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Port(), 
		   source, 
		   new String[] {
			 "featureName", "role",
			 "featureOwner", "ConnectorEnd"
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Part(), 
		   source, 
		   new String[] {
			 "featureName", "partWithPort",
			 "featureOwner", "ConnectorEnd"
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
		  (getBlockArchitecture_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlockArchitecture_OwnedDataPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlock_OwnedAbstractCapabilityPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlock_OwnedInterfacePkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlock_OwnedDataPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_OwnedInterfaceUses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_UsedInterfaceLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_UsedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaceLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ProvidedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_RequiredInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPart_ProvidedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPart_RequiredInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemComponent_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfacePkg_OwnedInterfacePkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_ImplementorComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_UserComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_InterfaceImplementations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_InterfaceUses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceImplementation_InterfaceImplementor(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceImplementation_ImplementedInterface(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceUse_InterfaceUser(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceUse_UsedInterface(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProvidedInterfaceLink_Interface(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequiredInterfaceLink_Interface(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDeployableElement_DeployingLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDeploymentTarget_DeploymentLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_DeployedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractDeploymentLink_Location(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Port(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLinkEnd_Part(), 
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
		  (getBlockArchitecture_ProvisionedArchitectureAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlockArchitecture_ProvisioningArchitectureAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlockArchitecture_AllocatedArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBlockArchitecture_AllocatingArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_UsedInterfaceLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_UsedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaceLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ImplementedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ProvisionedComponentAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ProvisioningComponentAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_AllocatedComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_AllocatingComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ProvidedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_RequiredInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ContainedComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ContainedParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_ContainedPhysicalPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPart_ProvidedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPart_RequiredInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPart_DeployedParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPart_DeployingParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getArchitectureAllocation_AllocatedArchitecture(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getArchitectureAllocation_AllocatingArchitecture(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentAllocation_AllocatedComponent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentAllocation_AllocatingComponent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemComponent_ParticipationsInCapabilityRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_ImplementorComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_UserComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_InterfaceImplementations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_InterfaceUses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_ProvisioningInterfaceAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_AllocatingInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_AllocatingComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_ExchangeItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_RequiringComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_RequiringComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_ProvidingComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_ProvidingComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_RealizingLogicalInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_RealizedContextInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_RealizingPhysicalInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterface_RealizedLogicalInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceImplementation_InterfaceImplementor(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceUse_InterfaceUser(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceAllocation_AllocatedInterface(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceAllocation_AllocatingInterfaceAllocator(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceAllocator_ProvisionedInterfaceAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInterfaceAllocator_AllocatedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemAllocation_AllocatingInterface(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDeployableElement_DeployingLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDeploymentTarget_DeploymentLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractPhysicalArtifact_AllocatorConfigurationItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractPhysicalLinkEnd_InvolvedLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_Categories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_SourcePhysicalPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_TargetPhysicalPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_RealizedPhysicalLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalLink_RealizingPhysicalLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPath_FirstPhysicalPathInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPath_RealizedPhysicalPaths(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPath_RealizingPhysicalPaths(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_PreviousInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_InvolvedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPathInvolvement_InvolvedComponent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPathReference_ReferencedPhysicalPath(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPort_AllocatedComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPort_RealizedPhysicalPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalPort_RealizingPhysicalPorts(), 
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
		  (architectureAllocationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentAllocationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (interfaceImplementationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (interfaceUseEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (providedInterfaceLinkEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (requiredInterfaceLinkEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (interfaceAllocationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (actorCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemComponentCapabilityRealizationInvolvementEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CsPackageImpl
