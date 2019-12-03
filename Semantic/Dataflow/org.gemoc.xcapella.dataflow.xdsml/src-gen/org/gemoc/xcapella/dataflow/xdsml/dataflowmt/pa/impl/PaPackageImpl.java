/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.AbstractPhysicalComponent;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.LogicalActorRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.LogicalArchitectureRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.LogicalComponentRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.LogicalInterfaceRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalActor;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalActorPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalArchitecturePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponent;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentNature;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalContext;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalFunction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalFunctionPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalNode;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.DeploymentPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.impl.DeploymentPackageImpl;

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
public class PaPackageImpl extends EPackageImpl implements PaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalArchitecturePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalFunctionPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPhysicalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalActorPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalComponentPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalActorRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalArchitectureRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalComponentRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalInterfaceRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum physicalComponentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum physicalComponentNatureEEnum = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaPackageImpl() {
		super(eNS_URI, PaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PaPackage init() {
		if (isInited) return (PaPackage)EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI);

		// Obtain or create and register package
		PaPackageImpl thePaPackage = (PaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SharedmodelPackageImpl theSharedmodelPackage = (SharedmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) instanceof SharedmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) : SharedmodelPackage.eINSTANCE);
		EmdePackageImpl theEmdePackage = (EmdePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) instanceof EmdePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) : EmdePackage.eINSTANCE);
		OaPackageImpl theOaPackage = (OaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) instanceof OaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) : OaPackage.eINSTANCE);
		CapellacorePackageImpl theCapellacorePackage = (CapellacorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI) instanceof CapellacorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI) : CapellacorePackage.eINSTANCE);
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
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		thePaPackage.createPackageContents();
		theSharedmodelPackage.createPackageContents();
		theEmdePackage.createPackageContents();
		theOaPackage.createPackageContents();
		theCapellacorePackage.createPackageContents();
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
		theActivityPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		thePaPackage.initializePackageContents();
		theSharedmodelPackage.initializePackageContents();
		theEmdePackage.initializePackageContents();
		theOaPackage.initializePackageContents();
		theCapellacorePackage.initializePackageContents();
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
		theActivityPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaPackage.eNS_URI, thePaPackage);
		return thePaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalArchitecturePkg() {
		return physicalArchitecturePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecturePkg_OwnedPhysicalArchitecturePkgs() {
		return (EReference)physicalArchitecturePkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecturePkg_OwnedPhysicalArchitectures() {
		return (EReference)physicalArchitecturePkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalArchitecture() {
		return physicalArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedPhysicalContext() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedPhysicalComponent() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedPhysicalComponentPkg() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedPhysicalActorPkg() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_ContainedCapabilityRealizationPkg() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_ContainedPhysicalFunctionPkg() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedDeployments() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_OwnedLogicalArchitectureRealizations() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_AllocatedLogicalArchitectureRealizations() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_AllocatedLogicalArchitectures() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalArchitecture_AllocatingEpbsArchitectures() {
		return (EReference)physicalArchitectureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalFunction() {
		return physicalFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunction_OwnedPhysicalFunctionPkgs() {
		return (EReference)physicalFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunction_AllocatorPhysicalActors() {
		return (EReference)physicalFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunction_AllocatorPhysicalComponents() {
		return (EReference)physicalFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunction_RealizedLogicalFunctions() {
		return (EReference)physicalFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunction_ContainedPhysicalFunctions() {
		return (EReference)physicalFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunction_ChildrenPhysicalFunctions() {
		return (EReference)physicalFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalFunctionPkg() {
		return physicalFunctionPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunctionPkg_OwnedPhysicalFunctions() {
		return (EReference)physicalFunctionPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalFunctionPkg_OwnedPhysicalFunctionPkgs() {
		return (EReference)physicalFunctionPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPhysicalComponent() {
		return abstractPhysicalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPhysicalComponent_Kind() {
		return (EAttribute)abstractPhysicalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPhysicalComponent_Nature() {
		return (EAttribute)abstractPhysicalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPhysicalComponent_OwnedDeploymentLinks() {
		return (EReference)abstractPhysicalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPhysicalComponent_OwnedDeploymentAspect() {
		return (EReference)abstractPhysicalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalComponent() {
		return physicalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_OwnedPhysicalComponents() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_OwnedPhysicalComponentPkgs() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_OwnedLogicalComponentRealizations() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_LogicalComponentRealizations() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_LogicalInterfaceRealizations() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_SubPhysicalComponents() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_RealizedLogicalComponents() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_AllocatedPhysicalFunctions() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_DeployedPhysicalComponents() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_DeployingPhysicalComponents() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponent_DeployingPhysicalActors() {
		return (EReference)physicalComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalActorPkg() {
		return physicalActorPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActorPkg_OwnedPhysicalActorPkgs() {
		return (EReference)physicalActorPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActorPkg_OwnedPhysicalActors() {
		return (EReference)physicalActorPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalComponentPkg() {
		return physicalComponentPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponentPkg_OwnedComponents() {
		return (EReference)physicalComponentPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponentPkg_OwnedPhysicalComponentPkgs() {
		return (EReference)physicalComponentPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponentPkg_OwnedKeyParts() {
		return (EReference)physicalComponentPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalComponentPkg_OwnedDeployments() {
		return (EReference)physicalComponentPkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalActor() {
		return physicalActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActor_OwnedLogicalActorRealizations() {
		return (EReference)physicalActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActor_LogicalActorRealizations() {
		return (EReference)physicalActorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActor_AllocatedPhysicalFunctions() {
		return (EReference)physicalActorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActor_RealizedLogicalActors() {
		return (EReference)physicalActorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalActor_DeployedPhysicalComponents() {
		return (EReference)physicalActorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalActorRealization() {
		return logicalActorRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalNode() {
		return physicalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalNode_SubPhysicalNodes() {
		return (EReference)physicalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalArchitectureRealization() {
		return logicalArchitectureRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalComponentRealization() {
		return logicalComponentRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalInterfaceRealization() {
		return logicalInterfaceRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalContext() {
		return physicalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhysicalComponentKind() {
		return physicalComponentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhysicalComponentNature() {
		return physicalComponentNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaFactory getPaFactory() {
		return (PaFactory)getEFactoryInstance();
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
		physicalArchitecturePkgEClass = createEClass(PHYSICAL_ARCHITECTURE_PKG);
		createEReference(physicalArchitecturePkgEClass, PHYSICAL_ARCHITECTURE_PKG__OWNED_PHYSICAL_ARCHITECTURE_PKGS);
		createEReference(physicalArchitecturePkgEClass, PHYSICAL_ARCHITECTURE_PKG__OWNED_PHYSICAL_ARCHITECTURES);

		physicalArchitectureEClass = createEClass(PHYSICAL_ARCHITECTURE);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURE_REALIZATIONS);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES);
		createEReference(physicalArchitectureEClass, PHYSICAL_ARCHITECTURE__ALLOCATING_EPBS_ARCHITECTURES);

		physicalFunctionEClass = createEClass(PHYSICAL_FUNCTION);
		createEReference(physicalFunctionEClass, PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS);
		createEReference(physicalFunctionEClass, PHYSICAL_FUNCTION__ALLOCATOR_PHYSICAL_ACTORS);
		createEReference(physicalFunctionEClass, PHYSICAL_FUNCTION__ALLOCATOR_PHYSICAL_COMPONENTS);
		createEReference(physicalFunctionEClass, PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS);
		createEReference(physicalFunctionEClass, PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS);
		createEReference(physicalFunctionEClass, PHYSICAL_FUNCTION__CHILDREN_PHYSICAL_FUNCTIONS);

		physicalFunctionPkgEClass = createEClass(PHYSICAL_FUNCTION_PKG);
		createEReference(physicalFunctionPkgEClass, PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS);
		createEReference(physicalFunctionPkgEClass, PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS);

		abstractPhysicalComponentEClass = createEClass(ABSTRACT_PHYSICAL_COMPONENT);
		createEAttribute(abstractPhysicalComponentEClass, ABSTRACT_PHYSICAL_COMPONENT__KIND);
		createEAttribute(abstractPhysicalComponentEClass, ABSTRACT_PHYSICAL_COMPONENT__NATURE);
		createEReference(abstractPhysicalComponentEClass, ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_LINKS);
		createEReference(abstractPhysicalComponentEClass, ABSTRACT_PHYSICAL_COMPONENT__OWNED_DEPLOYMENT_ASPECT);

		physicalComponentEClass = createEClass(PHYSICAL_COMPONENT);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_REALIZATIONS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__LOGICAL_COMPONENT_REALIZATIONS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__LOGICAL_INTERFACE_REALIZATIONS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__SUB_PHYSICAL_COMPONENTS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__DEPLOYING_PHYSICAL_COMPONENTS);
		createEReference(physicalComponentEClass, PHYSICAL_COMPONENT__DEPLOYING_PHYSICAL_ACTORS);

		physicalActorPkgEClass = createEClass(PHYSICAL_ACTOR_PKG);
		createEReference(physicalActorPkgEClass, PHYSICAL_ACTOR_PKG__OWNED_PHYSICAL_ACTOR_PKGS);
		createEReference(physicalActorPkgEClass, PHYSICAL_ACTOR_PKG__OWNED_PHYSICAL_ACTORS);

		physicalComponentPkgEClass = createEClass(PHYSICAL_COMPONENT_PKG);
		createEReference(physicalComponentPkgEClass, PHYSICAL_COMPONENT_PKG__OWNED_COMPONENTS);
		createEReference(physicalComponentPkgEClass, PHYSICAL_COMPONENT_PKG__OWNED_PHYSICAL_COMPONENT_PKGS);
		createEReference(physicalComponentPkgEClass, PHYSICAL_COMPONENT_PKG__OWNED_KEY_PARTS);
		createEReference(physicalComponentPkgEClass, PHYSICAL_COMPONENT_PKG__OWNED_DEPLOYMENTS);

		physicalActorEClass = createEClass(PHYSICAL_ACTOR);
		createEReference(physicalActorEClass, PHYSICAL_ACTOR__OWNED_LOGICAL_ACTOR_REALIZATIONS);
		createEReference(physicalActorEClass, PHYSICAL_ACTOR__LOGICAL_ACTOR_REALIZATIONS);
		createEReference(physicalActorEClass, PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS);
		createEReference(physicalActorEClass, PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS);
		createEReference(physicalActorEClass, PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS);

		logicalActorRealizationEClass = createEClass(LOGICAL_ACTOR_REALIZATION);

		physicalNodeEClass = createEClass(PHYSICAL_NODE);
		createEReference(physicalNodeEClass, PHYSICAL_NODE__SUB_PHYSICAL_NODES);

		logicalArchitectureRealizationEClass = createEClass(LOGICAL_ARCHITECTURE_REALIZATION);

		logicalComponentRealizationEClass = createEClass(LOGICAL_COMPONENT_REALIZATION);

		logicalInterfaceRealizationEClass = createEClass(LOGICAL_INTERFACE_REALIZATION);

		physicalContextEClass = createEClass(PHYSICAL_CONTEXT);

		// Create enums
		physicalComponentKindEEnum = createEEnum(PHYSICAL_COMPONENT_KIND);
		physicalComponentNatureEEnum = createEEnum(PHYSICAL_COMPONENT_NATURE);
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
		DeploymentPackage theDeploymentPackage = (DeploymentPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);
		CsPackage theCsPackage = (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);
		LaPackage theLaPackage = (LaPackage)EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI);
		EpbsPackage theEpbsPackage = (EpbsPackage)EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI);
		FaPackage theFaPackage = (FaPackage)EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDeploymentPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		physicalArchitecturePkgEClass.getESuperTypes().add(theCsPackage.getBlockArchitecturePkg());
		physicalArchitectureEClass.getESuperTypes().add(theCsPackage.getComponentArchitecture());
		physicalFunctionEClass.getESuperTypes().add(theFaPackage.getAbstractFunction());
		physicalFunctionPkgEClass.getESuperTypes().add(theFaPackage.getFunctionPkg());
		abstractPhysicalComponentEClass.getESuperTypes().add(theCsPackage.getSystemComponent());
		abstractPhysicalComponentEClass.getESuperTypes().add(theCsPackage.getDeployableElement());
		abstractPhysicalComponentEClass.getESuperTypes().add(theCsPackage.getDeploymentTarget());
		physicalComponentEClass.getESuperTypes().add(this.getAbstractPhysicalComponent());
		physicalComponentEClass.getESuperTypes().add(theCsPackage.getAbstractPhysicalArtifact());
		physicalActorPkgEClass.getESuperTypes().add(theFaPackage.getAbstractFunctionalStructure());
		physicalComponentPkgEClass.getESuperTypes().add(theFaPackage.getAbstractFunctionalStructure());
		physicalComponentPkgEClass.getESuperTypes().add(theInformationPackage.getAssociationPkg());
		physicalActorEClass.getESuperTypes().add(this.getAbstractPhysicalComponent());
		physicalActorEClass.getESuperTypes().add(theCsPackage.getAbstractActor());
		logicalActorRealizationEClass.getESuperTypes().add(theCsPackage.getComponentAllocation());
		physicalNodeEClass.getESuperTypes().add(this.getPhysicalComponent());
		logicalArchitectureRealizationEClass.getESuperTypes().add(theCsPackage.getArchitectureAllocation());
		logicalComponentRealizationEClass.getESuperTypes().add(theCsPackage.getComponentAllocation());
		logicalInterfaceRealizationEClass.getESuperTypes().add(theCsPackage.getInterfaceAllocation());
		physicalContextEClass.getESuperTypes().add(theCsPackage.getComponentContext());

		// Initialize classes and features; add operations and parameters
		initEClass(physicalArchitecturePkgEClass, PhysicalArchitecturePkg.class, "PhysicalArchitecturePkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalArchitecturePkg_OwnedPhysicalArchitecturePkgs(), this.getPhysicalArchitecturePkg(), null, "ownedPhysicalArchitecturePkgs", null, 0, -1, PhysicalArchitecturePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecturePkg_OwnedPhysicalArchitectures(), this.getPhysicalArchitecture(), null, "ownedPhysicalArchitectures", null, 0, -1, PhysicalArchitecturePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalArchitectureEClass, PhysicalArchitecture.class, "PhysicalArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalArchitecture_OwnedPhysicalContext(), this.getPhysicalContext(), null, "ownedPhysicalContext", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_OwnedPhysicalComponent(), this.getPhysicalComponent(), null, "ownedPhysicalComponent", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_OwnedPhysicalComponentPkg(), this.getPhysicalComponentPkg(), null, "ownedPhysicalComponentPkg", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_OwnedPhysicalActorPkg(), this.getPhysicalActorPkg(), null, "ownedPhysicalActorPkg", null, 0, 1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_ContainedCapabilityRealizationPkg(), theLaPackage.getCapabilityRealizationPkg(), null, "containedCapabilityRealizationPkg", null, 0, 1, PhysicalArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_ContainedPhysicalFunctionPkg(), this.getPhysicalFunctionPkg(), null, "containedPhysicalFunctionPkg", null, 0, 1, PhysicalArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_OwnedDeployments(), theCsPackage.getAbstractDeploymentLink(), null, "ownedDeployments", null, 0, -1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_OwnedLogicalArchitectureRealizations(), this.getLogicalArchitectureRealization(), null, "ownedLogicalArchitectureRealizations", null, 0, -1, PhysicalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_AllocatedLogicalArchitectureRealizations(), this.getLogicalArchitectureRealization(), null, "allocatedLogicalArchitectureRealizations", null, 0, -1, PhysicalArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_AllocatedLogicalArchitectures(), theLaPackage.getLogicalArchitecture(), theLaPackage.getLogicalArchitecture_AllocatingPhysicalArchitectures(), "allocatedLogicalArchitectures", null, 0, -1, PhysicalArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalArchitecture_AllocatingEpbsArchitectures(), theEpbsPackage.getEPBSArchitecture(), theEpbsPackage.getEPBSArchitecture_AllocatedPhysicalArchitectures(), "allocatingEpbsArchitectures", null, 0, -1, PhysicalArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(physicalFunctionEClass, PhysicalFunction.class, "PhysicalFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalFunction_OwnedPhysicalFunctionPkgs(), this.getPhysicalFunctionPkg(), null, "ownedPhysicalFunctionPkgs", null, 0, -1, PhysicalFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFunction_AllocatorPhysicalActors(), this.getPhysicalActor(), this.getPhysicalActor_AllocatedPhysicalFunctions(), "allocatorPhysicalActors", null, 0, -1, PhysicalFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFunction_AllocatorPhysicalComponents(), this.getPhysicalComponent(), this.getPhysicalComponent_AllocatedPhysicalFunctions(), "allocatorPhysicalComponents", null, 0, -1, PhysicalFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFunction_RealizedLogicalFunctions(), theLaPackage.getLogicalFunction(), theLaPackage.getLogicalFunction_RealizingPhysicalFunctions(), "realizedLogicalFunctions", null, 0, -1, PhysicalFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFunction_ContainedPhysicalFunctions(), this.getPhysicalFunction(), null, "containedPhysicalFunctions", null, 0, -1, PhysicalFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFunction_ChildrenPhysicalFunctions(), this.getPhysicalFunction(), null, "childrenPhysicalFunctions", null, 0, -1, PhysicalFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(physicalFunctionPkgEClass, PhysicalFunctionPkg.class, "PhysicalFunctionPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalFunctionPkg_OwnedPhysicalFunctions(), this.getPhysicalFunction(), null, "ownedPhysicalFunctions", null, 0, -1, PhysicalFunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalFunctionPkg_OwnedPhysicalFunctionPkgs(), this.getPhysicalFunctionPkg(), null, "ownedPhysicalFunctionPkgs", null, 0, -1, PhysicalFunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPhysicalComponentEClass, AbstractPhysicalComponent.class, "AbstractPhysicalComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPhysicalComponent_Kind(), this.getPhysicalComponentKind(), "kind", null, 0, 1, AbstractPhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPhysicalComponent_Nature(), this.getPhysicalComponentNature(), "nature", null, 0, 1, AbstractPhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPhysicalComponent_OwnedDeploymentLinks(), theCsPackage.getAbstractDeploymentLink(), null, "ownedDeploymentLinks", null, 0, -1, AbstractPhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPhysicalComponent_OwnedDeploymentAspect(), theDeploymentPackage.getDeploymentAspect(), null, "ownedDeploymentAspect", null, 0, 1, AbstractPhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalComponentEClass, PhysicalComponent.class, "PhysicalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalComponent_OwnedPhysicalComponents(), this.getPhysicalComponent(), null, "ownedPhysicalComponents", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_OwnedPhysicalComponentPkgs(), this.getPhysicalComponentPkg(), null, "ownedPhysicalComponentPkgs", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_OwnedLogicalComponentRealizations(), this.getLogicalComponentRealization(), null, "ownedLogicalComponentRealizations", null, 0, -1, PhysicalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_LogicalComponentRealizations(), this.getLogicalComponentRealization(), null, "logicalComponentRealizations", null, 0, -1, PhysicalComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_LogicalInterfaceRealizations(), this.getLogicalInterfaceRealization(), null, "logicalInterfaceRealizations", null, 0, -1, PhysicalComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_SubPhysicalComponents(), this.getPhysicalComponent(), null, "subPhysicalComponents", null, 0, -1, PhysicalComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_RealizedLogicalComponents(), theLaPackage.getLogicalComponent(), theLaPackage.getLogicalComponent_RealizingPhysicalComponents(), "realizedLogicalComponents", null, 0, -1, PhysicalComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysicalComponent_AllocatedPhysicalFunctions(), this.getPhysicalFunction(), this.getPhysicalFunction_AllocatorPhysicalComponents(), "allocatedPhysicalFunctions", null, 0, -1, PhysicalComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_DeployedPhysicalComponents(), this.getPhysicalComponent(), null, "deployedPhysicalComponents", null, 0, -1, PhysicalComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_DeployingPhysicalComponents(), this.getPhysicalComponent(), null, "deployingPhysicalComponents", null, 0, -1, PhysicalComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponent_DeployingPhysicalActors(), this.getPhysicalActor(), null, "deployingPhysicalActors", null, 0, -1, PhysicalComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(physicalActorPkgEClass, PhysicalActorPkg.class, "PhysicalActorPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalActorPkg_OwnedPhysicalActorPkgs(), this.getPhysicalActorPkg(), null, "ownedPhysicalActorPkgs", null, 0, -1, PhysicalActorPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalActorPkg_OwnedPhysicalActors(), this.getPhysicalActor(), null, "ownedPhysicalActors", null, 0, -1, PhysicalActorPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalComponentPkgEClass, PhysicalComponentPkg.class, "PhysicalComponentPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalComponentPkg_OwnedComponents(), this.getPhysicalComponent(), null, "ownedComponents", null, 0, -1, PhysicalComponentPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponentPkg_OwnedPhysicalComponentPkgs(), this.getPhysicalComponentPkg(), null, "ownedPhysicalComponentPkgs", null, 0, -1, PhysicalComponentPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponentPkg_OwnedKeyParts(), theInformationPackage.getKeyPart(), null, "ownedKeyParts", null, 0, -1, PhysicalComponentPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalComponentPkg_OwnedDeployments(), theCsPackage.getAbstractDeploymentLink(), null, "ownedDeployments", null, 0, -1, PhysicalComponentPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalActorEClass, PhysicalActor.class, "PhysicalActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalActor_OwnedLogicalActorRealizations(), this.getLogicalActorRealization(), null, "ownedLogicalActorRealizations", null, 0, -1, PhysicalActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalActor_LogicalActorRealizations(), this.getLogicalActorRealization(), null, "logicalActorRealizations", null, 0, -1, PhysicalActor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalActor_AllocatedPhysicalFunctions(), this.getPhysicalFunction(), this.getPhysicalFunction_AllocatorPhysicalActors(), "allocatedPhysicalFunctions", null, 0, -1, PhysicalActor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalActor_RealizedLogicalActors(), theLaPackage.getLogicalActor(), theLaPackage.getLogicalActor_RealizingPhysicalActors(), "realizedLogicalActors", null, 0, -1, PhysicalActor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalActor_DeployedPhysicalComponents(), this.getPhysicalComponent(), null, "deployedPhysicalComponents", null, 0, -1, PhysicalActor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(logicalActorRealizationEClass, LogicalActorRealization.class, "LogicalActorRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalNodeEClass, PhysicalNode.class, "PhysicalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalNode_SubPhysicalNodes(), this.getPhysicalNode(), null, "subPhysicalNodes", null, 0, -1, PhysicalNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(logicalArchitectureRealizationEClass, LogicalArchitectureRealization.class, "LogicalArchitectureRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalComponentRealizationEClass, LogicalComponentRealization.class, "LogicalComponentRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalInterfaceRealizationEClass, LogicalInterfaceRealization.class, "LogicalInterfaceRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalContextEClass, PhysicalContext.class, "PhysicalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(physicalComponentKindEEnum, PhysicalComponentKind.class, "PhysicalComponentKind");
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.UNSET);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.HARDWARE);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.HARDWARE_COMPUTER);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SOFTWARE);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SOFTWARE_DEPLOYMENT_UNIT);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SOFTWARE_EXECUTION_UNIT);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SOFTWARE_APPLICATION);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.FIRMWARE);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.PERSON);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.FACILITIES);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.DATA);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.MATERIALS);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.SERVICES);
		addEEnumLiteral(physicalComponentKindEEnum, PhysicalComponentKind.PROCESSES);

		initEEnum(physicalComponentNatureEEnum, PhysicalComponentNature.class, "PhysicalComponentNature");
		addEEnumLiteral(physicalComponentNatureEEnum, PhysicalComponentNature.UNSET);
		addEEnumLiteral(physicalComponentNatureEEnum, PhysicalComponentNature.BEHAVIOR);
		addEEnumLiteral(physicalComponentNatureEEnum, PhysicalComponentNature.NODE);

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
			 "description", "PhysicalArchitecture aims at defining the system\'s software, middleware and hardware architecture modelling language (close to the OMG\'s Platform Independent Model (PIM) in addition to OMG\'s Platform Model (PM)) using notions close to OMG\'s MARTE Resource concept. It adds the Deployment concern.\r\nThis concern aggregates a lot of concepts regarding the others. A re-engineering of this concern should make sense.\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "physical",
			 "usage examples", "none",
			 "constraints", "This package depends on the model CompositeStructure.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (physicalArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "description", "container for physical architecture elements\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitecturePkgs(), 
		   source, 
		   new String[] {
			 "description", "sub-(physical architecture) packages contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitectures(), 
		   source, 
		   new String[] {
			 "description", "the physical architecture elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalArchitectureEClass, 
		   source, 
		   new String[] {
			 "description", "Model describing physical architecture part - hardware components & related items -  associated to (created during) a modelling phase",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalContext(), 
		   source, 
		   new String[] {
			 "description", "the context is the set of (physical) parts that make the \"world\" at this abstraction level (the system part(s) and the external actor part(s))\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponent(), 
		   source, 
		   new String[] {
			 "description", "the physical component that represents the System\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponentPkg(), 
		   source, 
		   new String[] {
			 "description", "a package containing the physical components involved in this physical architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalActorPkg(), 
		   source, 
		   new String[] {
			 "description", "a package containing the physical actors involved in this physical architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedDeployments(), 
		   source, 
		   new String[] {
			 "description", "the various deployments associated with this physical architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedLogicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "description", "the list of a relationships between physical architectures and the logical architectures that they realize, stored/owned by this architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatedLogicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "description", "the list of relationships between this physical architecture and the logical architectures to which it is allocated\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalFunctionEClass, 
		   source, 
		   new String[] {
			 "description", "Function applied at physical level\r\n[source: Capella study]",
			 "usage guideline", "this element is used in the \"functional approach\" usage, as the result of the flow down/refinement of the functions at the logical architecture level\r\n[source: Capella study]",
			 "used in levels", "physical",
			 "usage examples", "../img/usage_examples/example_physical_functions.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalFunction_OwnedPhysicalFunctionPkgs(), 
		   source, 
		   new String[] {
			 "description", "the sub-(physical function) packages contained in this physical function",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalFunction_ChildrenPhysicalFunctions(), 
		   source, 
		   new String[] {
			 "description", "list of children physical functions\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalFunctionPkgEClass, 
		   source, 
		   new String[] {
			 "description", "container for physical functions\r\n[source: Capella study]",
			 "usage guideline", "Used to structure the storage of physical function elements inside a physical architecture\r\n",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalFunctionPkg_OwnedPhysicalFunctions(), 
		   source, 
		   new String[] {
			 "description", "the physical functions contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalFunctionPkg_OwnedPhysicalFunctionPkgs(), 
		   source, 
		   new String[] {
			 "description", "the sub-(physical function) packages contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractPhysicalComponentEClass, 
		   source, 
		   new String[] {
			 "description", "Base abstract class for the implementation of actual physical components\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_Kind(), 
		   source, 
		   new String[] {
			 "description", "specifies the type of physical component (refer to PhysicalComponentKind for detailed description)\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to PhysicalComponentKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_Nature(), 
		   source, 
		   new String[] {
			 "description", "specifies the nature of this physical component, typically whether it is an actual execution node, or a behavioral component like a SW part\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to PhysicalComponentNature definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_OwnedDeploymentLinks(), 
		   source, 
		   new String[] {
			 "description", "the various deployments of this physical component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentEClass, 
		   source, 
		   new String[] {
			 "description", "Physical Components are the artifacts enabling to describe architectural solutions to satisfy the logical architecture identified at the upper abstraction level. Physical components are identified according to physical rationals (i.e. components reuse, available COTS, non functional constraints...)\r\nExamples: Software component, executable, hardware component (mechanical devices, electronical boards, equipments)",
			 "usage guideline", "refer to description",
			 "arcadia_description", "Physical Components are the artefacts enabling to describe the final physical decomposition of the system. Physical components are identified according to physical and development constraints.\r\nTwo kinds of physical components exist: behavioural and implementation components.\r\nTwo kinds of physical components are identified:\r\n- A behavioural component is a physical component in charge of implementing / realising part of the functions allocated to the system\r\nExample: software component, VHDL program (for a programmable device), hardware selector...\r\n- An implementation component  is a material physical component, resource embedding some behavioural components, and necessary to their expected behaviour.\r\nExample: Hardware computing board, computer, FPGA (programmable device), ...\r\n",
			 "usage examples", "../img/usage_examples/example_physical_components.png",
			 "used in levels", "physical",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_OwnedPhysicalComponents(), 
		   source, 
		   new String[] {
			 "description", "the physical components stored under this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_OwnedPhysicalComponentPkgs(), 
		   source, 
		   new String[] {
			 "description", "the sub-(physical component) packages owned by this component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_OwnedLogicalComponentRealizations(), 
		   source, 
		   new String[] {
			 "description", "the logical component realization relationships that are stored/owned by this physical component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_LogicalComponentRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the logical component realization links that involve this physical component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_LogicalInterfaceRealizations(), 
		   source, 
		   new String[] {
			 "description", "the list of logical interfaces that this physical component reallizes\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_SubPhysicalComponents(), 
		   source, 
		   new String[] {
			 "description", "the children components of this physical component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_RealizedLogicalComponents(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of realizations links coming from logical components, and in which this physical component is involved\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalActorPkgEClass, 
		   source, 
		   new String[] {
			 "description", "a container for physical actors entities\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActorPkgs(), 
		   source, 
		   new String[] {
			 "description", "the sub-(physical actor) packages contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActors(), 
		   source, 
		   new String[] {
			 "description", "the physical actor entities contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentPkgEClass, 
		   source, 
		   new String[] {
			 "description", "a container for physical component entities\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedComponents(), 
		   source, 
		   new String[] {
			 "description", "the physical components stored in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedPhysicalComponentPkgs(), 
		   source, 
		   new String[] {
			 "description", "the sub-(physical component) packages contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
			 "description", "the key parts contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedDeployments(), 
		   source, 
		   new String[] {
			 "description", "the physical deployment definitions stored in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalActorEClass, 
		   source, 
		   new String[] {
			 "description", "External actor interacting with the system via physical interfaces",
			 "usage guideline", "Used whenever there is a need to model an interaction between the outside of the physical system perimeter, and the inside, using one of the physical interfaces.\r\nPhysical actors are typically derived/refined from logical actors definition.",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalActor_OwnedLogicalActorRealizations(), 
		   source, 
		   new String[] {
			 "description", "the allocation links between physical actors and the logical actor(s) that they realize, stored/owned under this physical actor\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPhysicalActor_LogicalActorRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the relationship links between this physical actor and the logical actor(s) that it realizes\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (logicalActorRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "mediator class to support the implementation of the relationship between a physical actor and the logical actor(s) that it realizes\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "none",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (physicalNodeEClass, 
		   source, 
		   new String[] {
			 "description", "a physical resource hosting behavioral components, and required for their execution or expected behavior\r\n[source: Arcadia encyclopedia]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalNode_SubPhysicalNodes(), 
		   source, 
		   new String[] {
			 "description", "all derived children of this physical node\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum, 
		   source, 
		   new String[] {
			 "description", "allows to categorize a physical component, with respect to real life physical entities\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the physical component kind is not precised\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the physical component is a hardware resource\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "used when the physical component is a computing resource\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "used when the physical component is a software entity\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "description", "used when the physical component is a software deployment unit\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "description", "used when the physical component is a software execution unit\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "description", "used when the physical component is a software application\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "description", "used when the physical component is a firmware part\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "description", "used when the physical component is a person\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "description", "used when the physical component refers to Facilities\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "description", "used when the physical component represents a set of data\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(11), 
		   source, 
		   new String[] {
			 "description", "used when the physical component represents a bunch of materials\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(12), 
		   source, 
		   new String[] {
			 "description", "used when the physical components represents a set of services\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(13), 
		   source, 
		   new String[] {
			 "description", "used when the physical component represents a set of processes\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (logicalArchitectureRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "mediator class supporting the implementation of the allocation link between a physical architecture, and the logical architecture(s) that it realizes\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (logicalComponentRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "mediator class supporting the implementation of the allocation link between a physical component, and the logical component(s) that it realizes\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (logicalInterfaceRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "mediator class supporting the implementation of the allocation link between a physical interface, and the logical interface(s) that it realizes\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (physicalComponentNatureEEnum, 
		   source, 
		   new String[] {
			 "description", "characterizes a physical component, with respect to its property of being a host of behavioral components, or a behavioral component\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentNatureEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the physical component nature is not precised\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentNatureEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the physical component nature is behavioral (typically, a piece of software)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalComponentNatureEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "used when the physical component is a host for behavioral components (typically, a computing resource)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalContextEClass, 
		   source, 
		   new String[] {
			 "description", "specialization of a component context for the physical level. Refer to component context description.\r\n[source: Capella study]",
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
		  (physicalArchitectureEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponentPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalActorPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_ContainedCapabilityRealizationPkg(), 
		   source, 
		   new String[] {
			 "feature", "ownedAbstractCapabilityPkg"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_ContainedPhysicalFunctionPkg(), 
		   source, 
		   new String[] {
			 "feature", "ownedFunctionPkg"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedDeployments(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatedLogicalArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatingEpbsArchitectures(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (physicalFunctionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunction_OwnedPhysicalFunctionPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunction_AllocatorPhysicalActors(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getPhysicalFunction_AllocatorPhysicalComponents(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getPhysicalFunction_RealizedLogicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunction_ContainedPhysicalFunctions(), 
		   source, 
		   new String[] {
			 "feature", "ownedFunctions"
		   });	
		addAnnotation
		  (getPhysicalFunction_ChildrenPhysicalFunctions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (physicalFunctionPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunctionPkg_OwnedPhysicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunctionPkg_OwnedPhysicalFunctionPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_Nature(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_OwnedDeploymentLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_OwnedDeploymentAspect(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (physicalComponentEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_OwnedPhysicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_OwnedPhysicalComponentPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_SubPhysicalComponents(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getPhysicalComponent_RealizedLogicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_AllocatedPhysicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_DeployedPhysicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_DeployingPhysicalComponents(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getPhysicalComponent_DeployingPhysicalActors(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (physicalActorPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActorPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (physicalComponentPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedPhysicalComponentPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (physicalActorEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActor_AllocatedPhysicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActor_RealizedLogicalActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActor_DeployedPhysicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (physicalNodeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalNode_SubPhysicalNodes(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (physicalContextEClass, 
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
		  (physicalArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalArchitecturePkg"
		   });	
		addAnnotation
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitecturePkgs(), 
		   source, 
		   new String[] {
			 "Label", "subPhysicalArchitecturePkgs"
		   });	
		addAnnotation
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitectures(), 
		   source, 
		   new String[] {
			 "Label", "ownedPhysicalArchitectures"
		   });	
		addAnnotation
		  (physicalArchitectureEClass, 
		   source, 
		   new String[] {
			 "Label", "Physical Architecture"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponent(), 
		   source, 
		   new String[] {
			 "Label", "ownedComponents"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponentPkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedComponentPkgs"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalActorPkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedActorPkg"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedDeployments(), 
		   source, 
		   new String[] {
			 "Label", "ownedDeployments"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatedLogicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "Label", "allocatedLogicalArchitectureImplementations"
		   });	
		addAnnotation
		  (abstractPhysicalComponentEClass, 
		   source, 
		   new String[] {
			 "Label", "AbstractPhysicalComponent"
		   });	
		addAnnotation
		  (physicalComponentEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalComponent"
		   });	
		addAnnotation
		  (getPhysicalComponent_SubPhysicalComponents(), 
		   source, 
		   new String[] {
			 "Label", "subActors"
		   });	
		addAnnotation
		  (physicalActorPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalActorPkg"
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActorPkgs(), 
		   source, 
		   new String[] {
			 "Label", "ownedActorPkgs"
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActors(), 
		   source, 
		   new String[] {
			 "Label", "ownedActors"
		   });	
		addAnnotation
		  (physicalComponentPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalComponentPkg"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedComponents(), 
		   source, 
		   new String[] {
			 "Label", "ownedComponents"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedPhysicalComponentPkgs(), 
		   source, 
		   new String[] {
			 "Label", "subPhysicalComponentPkgs"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
			 "Label", "ownedKeyParts"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedDeployments(), 
		   source, 
		   new String[] {
			 "Label", "ownedDeployments"
		   });	
		addAnnotation
		  (physicalActorEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalActor"
		   });	
		addAnnotation
		  (physicalNodeEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalNode"
		   });	
		addAnnotation
		  (getPhysicalNode_SubPhysicalNodes(), 
		   source, 
		   new String[] {
			 "Label", "subActors"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum, 
		   source, 
		   new String[] {
			 "Label", "PhysicalComponentType"
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
		  (physicalArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.PhysicalArchitecturePkg"
		   });	
		addAnnotation
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitecturePkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitectures(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (physicalArchitectureEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.PhysicalArchitecture"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponent(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponentPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalActorPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedDeployments(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatedLogicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (abstractPhysicalComponentEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component",
			 "Stereotype", "eng.AbstractPhysicalComponent"
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_Kind(), 
		   source, 
		   new String[] {
			 "featureName", "type",
			 "fromStereotype", "true",
			 "featureOwner", "eng.AbstractPhysicalComponent"
		   });	
		addAnnotation
		  (physicalComponentEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component",
			 "stereotype", "eng.PhysicalComponent"
		   });	
		addAnnotation
		  (physicalActorPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.PhysicalActorPkg"
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActorPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActors(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (physicalComponentPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.PhysicalComponentPkg"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedComponents(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedPhysicalComponentPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedDeployments(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (physicalActorEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component",
			 "stereotype", "eng.PhysicalActor"
		   });	
		addAnnotation
		  (physicalNodeEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component",
			 "stereotype", "eng.PhysicalNode"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum, 
		   source, 
		   new String[] {
			 "enum", "PhysicalComponentType"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "enumLiteral", "HARDWARE"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "enumLiteral", "HARDWARE_COMPUTER"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "enumLiteral", "SOFTWARE"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "enumLiteral", "SOFTWARE_DEPLOYMENT_UNIT"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "enumLiteral", "SOFTWARE_EXECUTION_UNIT"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "enumLiteral", "SOFTWARE_APPLICATION"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "enumLiteral", "FIRMWARE"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "enumLiteral", "PERSON"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "enumLiteral", "FACILITIES"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "enumLiteral", "DATA"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(11), 
		   source, 
		   new String[] {
			 "enumLiteral", "MATERIALS"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(12), 
		   source, 
		   new String[] {
			 "enumLiteral", "SERVICES"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(13), 
		   source, 
		   new String[] {
			 "enumLiteral", "PROCESSES"
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
		  (physicalArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitecturePkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which PhysicalArchitecturePkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which PhysicalArchitecture stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (physicalArchitectureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalContext(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which PhysicalContext stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponent(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which PhysicalComponent stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponentPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which PhysicalComponentPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalActorPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which PhysicalActorPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_ContainedCapabilityRealizationPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_ContainedPhysicalFunctionPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedDeployments(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which AbstractDeployment stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedLogicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which LogicalArchitectureRealisation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatedLogicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatedLogicalArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatingEpbsArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalFunctionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Activity",
			 "explanation", "All functions are mapped to (empty) activities",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalFunction_OwnedPhysicalFunctionPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which PhysicalFunctionPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalFunction_AllocatorPhysicalActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalFunction_AllocatorPhysicalComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalFunction_RealizedLogicalFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalFunction_ContainedPhysicalFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalFunction_ChildrenPhysicalFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalFunctionPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalFunctionPkg_OwnedPhysicalFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which PhysicalFunction stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalFunctionPkg_OwnedPhysicalFunctionPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which PhysicalFunctionPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (abstractPhysicalComponentEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_Nature(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_OwnedDeploymentLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "SysML::Blocks::Block cannot contain AbstractDeployment\'s equivalent, hence we find the nearest available package to store them.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractPhysicalComponent_OwnedDeploymentAspect(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Blocks::Block",
			 "explanation", "cannot map to uml::Component, which is not part of UML4SysML",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_OwnedPhysicalComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Class::nestedClassifier",
			 "explanation", "the nesting relation is just convenient to store sub-components under a component in the three, even though the hierachical relationship between componenets is not\r\nderived from this nesting : instead, it relies on the Parts present in the component, that are typed by the sub-components types.",
			 "constraints", "uml::Class::nestedClassifier elements on which PhysicalComponent stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalComponent_OwnedPhysicalComponentPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "SysML::Blocks::Block cannot contain packages, hence we find the nearest available package to store them.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_OwnedLogicalComponentRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "SysML::Blocks::Block cannot contain packages, hence we find the nearest available package to store them.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_LogicalComponentRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_LogicalInterfaceRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_SubPhysicalComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_RealizedLogicalComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_AllocatedPhysicalFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_DeployedPhysicalComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_DeployingPhysicalComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponent_DeployingPhysicalActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalActorPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActorPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which PhysicalActorPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which PhysicalActor stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (physicalComponentPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which PhysicalComponent stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedPhysicalComponentPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which PhysicalComponentPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which KeyPart stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedDeployments(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which AbstractDeployment stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (physicalActorEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Blocks::Block",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalActor_OwnedLogicalActorRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::BehavioredClassifier::interfaceRealization",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "uml::BehavioredClassifier::interfaceRealization elements on which LogicalActorRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getPhysicalActor_LogicalActorRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalActor_AllocatedPhysicalFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalActor_RealizedLogicalActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalActor_DeployedPhysicalComponents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (logicalActorRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::InterfaceRealization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalNodeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Node",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalNode_SubPhysicalNodes(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(11), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(12), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentKindEEnum.getELiterals().get(13), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (logicalArchitectureRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (logicalComponentRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (logicalInterfaceRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::InterfaceRealization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentNatureEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentNatureEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentNatureEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalComponentNatureEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalContextEClass, 
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
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitecturePkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecturePkg_OwnedPhysicalArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponent(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalComponentPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedPhysicalActorPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_OwnedDeployments(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatedLogicalArchitectureRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_SubPhysicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActorPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActorPkg_OwnedPhysicalActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedPhysicalComponentPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponentPkg_OwnedDeployments(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalNode_SubPhysicalNodes(), 
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
		  (getPhysicalArchitecture_ContainedCapabilityRealizationPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_ContainedPhysicalFunctionPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatedLogicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "derive", "self.ownedPartitions.representedElement.oclIsKindOf(PhysicalComponent) -> oclAsType(PhysicalComponent)"
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatedLogicalArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalArchitecture_AllocatingEpbsArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunction_AllocatorPhysicalActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunction_AllocatorPhysicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunction_RealizedLogicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunction_ContainedPhysicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalFunction_ChildrenPhysicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_LogicalComponentRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_LogicalInterfaceRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_SubPhysicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_RealizedLogicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_AllocatedPhysicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_DeployedPhysicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_DeployingPhysicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalComponent_DeployingPhysicalActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActor_LogicalActorRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActor_AllocatedPhysicalFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActor_RealizedLogicalActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalActor_DeployedPhysicalComponents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalNode_SubPhysicalNodes(), 
		   source, 
		   new String[] {
		   });
	}

} //PaPackageImpl
