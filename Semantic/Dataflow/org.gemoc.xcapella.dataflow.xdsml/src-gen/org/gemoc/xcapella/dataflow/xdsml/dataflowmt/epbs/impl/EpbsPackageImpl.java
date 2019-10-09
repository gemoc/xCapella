/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.ConfigurationItem;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.ConfigurationItemKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.ConfigurationItemPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSArchitecturePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EPBSContext;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.PhysicalArchitectureRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.PhysicalArtifactRealization;

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
public class EpbsPackageImpl extends EPackageImpl implements EpbsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epbsArchitecturePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epbsArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epbsContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationItemPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalArchitectureRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalArtifactRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum configurationItemKindEEnum = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.epbs.EpbsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EpbsPackageImpl() {
		super(eNS_URI, EpbsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EpbsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EpbsPackage init() {
		if (isInited) return (EpbsPackage)EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI);

		// Obtain or create and register package
		EpbsPackageImpl theEpbsPackage = (EpbsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EpbsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EpbsPackageImpl());

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
		theEpbsPackage.createPackageContents();
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
		theEpbsPackage.initializePackageContents();
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
		theEpbsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EpbsPackage.eNS_URI, theEpbsPackage);
		return theEpbsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPBSArchitecturePkg() {
		return epbsArchitecturePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPBSArchitecturePkg_OwnedEPBSArchitectures() {
		return (EReference)epbsArchitecturePkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPBSArchitecture() {
		return epbsArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPBSArchitecture_OwnedEPBSContext() {
		return (EReference)epbsArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPBSArchitecture_OwnedConfigurationItem() {
		return (EReference)epbsArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPBSArchitecture_OwnedConfigurationItemPkg() {
		return (EReference)epbsArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPBSArchitecture_ContainedCapabilityRealizationPkg() {
		return (EReference)epbsArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPBSArchitecture_OwnedPhysicalArchitectureRealizations() {
		return (EReference)epbsArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPBSArchitecture_AllocatedPhysicalArchitectureRealizations() {
		return (EReference)epbsArchitectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPBSArchitecture_AllocatedPhysicalArchitectures() {
		return (EReference)epbsArchitectureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPBSContext() {
		return epbsContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationItemPkg() {
		return configurationItemPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationItemPkg_OwnedConfigurationItems() {
		return (EReference)configurationItemPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationItemPkg_OwnedConfigurationItemPkgs() {
		return (EReference)configurationItemPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationItem() {
		return configurationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationItem_ItemIdentifier() {
		return (EAttribute)configurationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationItem_Kind() {
		return (EAttribute)configurationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationItem_OwnedConfigurationItems() {
		return (EReference)configurationItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationItem_OwnedConfigurationItemPkgs() {
		return (EReference)configurationItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationItem_OwnedPhysicalArtifactRealizations() {
		return (EReference)configurationItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationItem_AllocatedPhysicalArtifacts() {
		return (EReference)configurationItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalArchitectureRealization() {
		return physicalArchitectureRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalArtifactRealization() {
		return physicalArtifactRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConfigurationItemKind() {
		return configurationItemKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpbsFactory getEpbsFactory() {
		return (EpbsFactory)getEFactoryInstance();
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
		epbsArchitecturePkgEClass = createEClass(EPBS_ARCHITECTURE_PKG);
		createEReference(epbsArchitecturePkgEClass, EPBS_ARCHITECTURE_PKG__OWNED_EPBS_ARCHITECTURES);

		epbsArchitectureEClass = createEClass(EPBS_ARCHITECTURE);
		createEReference(epbsArchitectureEClass, EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT);
		createEReference(epbsArchitectureEClass, EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM);
		createEReference(epbsArchitectureEClass, EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG);
		createEReference(epbsArchitectureEClass, EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG);
		createEReference(epbsArchitectureEClass, EPBS_ARCHITECTURE__OWNED_PHYSICAL_ARCHITECTURE_REALIZATIONS);
		createEReference(epbsArchitectureEClass, EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURE_REALIZATIONS);
		createEReference(epbsArchitectureEClass, EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES);

		epbsContextEClass = createEClass(EPBS_CONTEXT);

		configurationItemPkgEClass = createEClass(CONFIGURATION_ITEM_PKG);
		createEReference(configurationItemPkgEClass, CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEMS);
		createEReference(configurationItemPkgEClass, CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEM_PKGS);

		configurationItemEClass = createEClass(CONFIGURATION_ITEM);
		createEAttribute(configurationItemEClass, CONFIGURATION_ITEM__ITEM_IDENTIFIER);
		createEAttribute(configurationItemEClass, CONFIGURATION_ITEM__KIND);
		createEReference(configurationItemEClass, CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS);
		createEReference(configurationItemEClass, CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS);
		createEReference(configurationItemEClass, CONFIGURATION_ITEM__OWNED_PHYSICAL_ARTIFACT_REALIZATIONS);
		createEReference(configurationItemEClass, CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS);

		physicalArchitectureRealizationEClass = createEClass(PHYSICAL_ARCHITECTURE_REALIZATION);

		physicalArtifactRealizationEClass = createEClass(PHYSICAL_ARTIFACT_REALIZATION);

		// Create enums
		configurationItemKindEEnum = createEEnum(CONFIGURATION_ITEM_KIND);
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
		LaPackage theLaPackage = (LaPackage)EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI);
		PaPackage thePaPackage = (PaPackage)EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI);
		CapellacorePackage theCapellacorePackage = (CapellacorePackage)EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		epbsArchitecturePkgEClass.getESuperTypes().add(theCsPackage.getBlockArchitecturePkg());
		epbsArchitectureEClass.getESuperTypes().add(theCsPackage.getComponentArchitecture());
		epbsContextEClass.getESuperTypes().add(theCsPackage.getComponentContext());
		configurationItemPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		configurationItemEClass.getESuperTypes().add(theCsPackage.getSystemComponent());
		physicalArchitectureRealizationEClass.getESuperTypes().add(theCsPackage.getArchitectureAllocation());
		physicalArtifactRealizationEClass.getESuperTypes().add(theCsPackage.getComponentAllocation());

		// Initialize classes and features; add operations and parameters
		initEClass(epbsArchitecturePkgEClass, EPBSArchitecturePkg.class, "EPBSArchitecturePkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEPBSArchitecturePkg_OwnedEPBSArchitectures(), this.getEPBSArchitecture(), null, "ownedEPBSArchitectures", null, 0, -1, EPBSArchitecturePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(epbsArchitectureEClass, EPBSArchitecture.class, "EPBSArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEPBSArchitecture_OwnedEPBSContext(), this.getEPBSContext(), null, "ownedEPBSContext", null, 0, 1, EPBSArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPBSArchitecture_OwnedConfigurationItem(), this.getConfigurationItem(), null, "ownedConfigurationItem", null, 0, 1, EPBSArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPBSArchitecture_OwnedConfigurationItemPkg(), this.getConfigurationItemPkg(), null, "ownedConfigurationItemPkg", null, 0, 1, EPBSArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPBSArchitecture_ContainedCapabilityRealizationPkg(), theLaPackage.getCapabilityRealizationPkg(), null, "containedCapabilityRealizationPkg", null, 0, 1, EPBSArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEPBSArchitecture_OwnedPhysicalArchitectureRealizations(), this.getPhysicalArchitectureRealization(), null, "ownedPhysicalArchitectureRealizations", null, 0, -1, EPBSArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPBSArchitecture_AllocatedPhysicalArchitectureRealizations(), this.getPhysicalArchitectureRealization(), null, "allocatedPhysicalArchitectureRealizations", null, 0, -1, EPBSArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEPBSArchitecture_AllocatedPhysicalArchitectures(), thePaPackage.getPhysicalArchitecture(), thePaPackage.getPhysicalArchitecture_AllocatingEpbsArchitectures(), "allocatedPhysicalArchitectures", null, 0, -1, EPBSArchitecture.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(epbsContextEClass, EPBSContext.class, "EPBSContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationItemPkgEClass, ConfigurationItemPkg.class, "ConfigurationItemPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationItemPkg_OwnedConfigurationItems(), this.getConfigurationItem(), null, "ownedConfigurationItems", null, 0, -1, ConfigurationItemPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationItemPkg_OwnedConfigurationItemPkgs(), this.getConfigurationItemPkg(), null, "ownedConfigurationItemPkgs", null, 0, -1, ConfigurationItemPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationItemEClass, ConfigurationItem.class, "ConfigurationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationItem_ItemIdentifier(), ecorePackage.getEString(), "itemIdentifier", null, 0, 1, ConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationItem_Kind(), this.getConfigurationItemKind(), "kind", "Unset", 0, 1, ConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationItem_OwnedConfigurationItems(), this.getConfigurationItem(), null, "ownedConfigurationItems", null, 0, -1, ConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationItem_OwnedConfigurationItemPkgs(), this.getConfigurationItemPkg(), null, "ownedConfigurationItemPkgs", null, 0, -1, ConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationItem_OwnedPhysicalArtifactRealizations(), this.getPhysicalArtifactRealization(), null, "ownedPhysicalArtifactRealizations", null, 0, -1, ConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfigurationItem_AllocatedPhysicalArtifacts(), theCsPackage.getAbstractPhysicalArtifact(), theCsPackage.getAbstractPhysicalArtifact_AllocatorConfigurationItems(), "allocatedPhysicalArtifacts", null, 0, -1, ConfigurationItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(physicalArchitectureRealizationEClass, PhysicalArchitectureRealization.class, "PhysicalArchitectureRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalArtifactRealizationEClass, PhysicalArtifactRealization.class, "PhysicalArtifactRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(configurationItemKindEEnum, ConfigurationItemKind.class, "ConfigurationItemKind");
		addEEnumLiteral(configurationItemKindEEnum, ConfigurationItemKind.UNSET);
		addEEnumLiteral(configurationItemKindEEnum, ConfigurationItemKind.COTSCI);
		addEEnumLiteral(configurationItemKindEEnum, ConfigurationItemKind.CSCI);
		addEEnumLiteral(configurationItemKindEEnum, ConfigurationItemKind.HWCI);
		addEEnumLiteral(configurationItemKindEEnum, ConfigurationItemKind.INTERFACE_CI);
		addEEnumLiteral(configurationItemKindEEnum, ConfigurationItemKind.NDICI);
		addEEnumLiteral(configurationItemKindEEnum, ConfigurationItemKind.PRIME_ITEM_CI);
		addEEnumLiteral(configurationItemKindEEnum, ConfigurationItemKind.SYSTEM_CI);

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
			 "description", "(E)PBS (for (End-)Product Breakdown Structure) aims at defining the system\'s work product breakdown (close to Clearcase/UCM\'s components concept).\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "epbs",
			 "usage examples", "none",
			 "constraints", "This package depends on the model CompositeStructure.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (epbsArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "description", "Package that contains end product breakdown structure architectures\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getEPBSArchitecturePkg_OwnedEPBSArchitectures(), 
		   source, 
		   new String[] {
			 "description", "End product breakdown structure architectures set\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (epbsArchitectureEClass, 
		   source, 
		   new String[] {
			 "description", "End Product Breakdown Structure. Definition of the Physical Components grouping for development subcontracting or purchase. ",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedEPBSContext(), 
		   source, 
		   new String[] {
			 "description", "the context is the set of (epbs) parts that make the \"world\" at this abstraction level (the system part(s) and the external actor part(s))",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItem(), 
		   source, 
		   new String[] {
			 "description", "the Configuration items contained in this EPBS architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "Even though configuration items are normally stored in a configurationItemPkg, there is this possibility to store them directly under the EPBS architecture element, the purpose being to avoid too many levels of nesting/hierarchy, to ease the navigation of the user in the model"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItemPkg(), 
		   source, 
		   new String[] {
			 "description", "Set of packages that contain configuration items, owned by this EPBS architecture\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedPhysicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "description", "Set of physical architecture realization links owned by this EPBS architecture\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEPBSArchitecture_AllocatedPhysicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the physical architecture realization links involving this EPBS architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (epbsContextEClass, 
		   source, 
		   new String[] {
			 "description", "specialization of a component context for the epbs level. Refer to component context description.",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (configurationItemPkgEClass, 
		   source, 
		   new String[] {
			 "description", "Package that contains configuration item elements\r\n[source:Capella study]",
			 "usage guideline", "this element is provided as a utility to better structure configuration items, if needed",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
			 "description", "Set of configuration items that are stored in the package\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
			 "description", "Set of owned packages containing configuration items\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (configurationItemEClass, 
		   source, 
		   new String[] {
			 "description", "Aggregation of hardware, software, processed materials, services, or any of their discrete portions designated for configuration management and treated as a single entity in the configuration management process.",
			 "usage guideline", "A configuration item is an abstract concept. Concrete concepts are : COTCI, CSCI, HWCI, InterfaceCI, NDICI, PrimeItemCI and SystemCI",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none",
			 "arcadia_description", "A configuration item (CI) is a part of the system, to be \r\n- Designed and produced, or purchased\r\n- Duplicated as much as it is used in the system\r\n- assembled with others \r\nin order to build each copy of the system. \r\nExamples of configuration items are cabinets, racks, electronic boards, wiring & plugs, software components...\r\nCI are usually qualified as Hardware (HWCI), Computer Software (CSCI), Commercial off the Shelf (COTS, purchased item), Prime Item...\r\n"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
			 "description", "the children of this ConfigurationItem \r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
			 "description", "the sub-(configuration item) packages owned by this component",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedPhysicalArtifactRealizations(), 
		   source, 
		   new String[] {
			 "description", "Set of physical component realization links owned by this configuration item\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getConfigurationItem_AllocatedPhysicalArtifacts(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of realizations links coming from physical artifacts, and in which this ConfigurationItem is involved\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (configurationItemKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "Commercial Off The Shelves Configuration Item",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (configurationItemKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "Computer Software Configuration Item",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (configurationItemKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "Hardware Configuration Item",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (configurationItemKindEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "description", "Interface Configuration Item",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (configurationItemKindEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "description", "Non Developmental Configuration Item",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (configurationItemKindEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "description", "Prime Item Configuration Item",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (configurationItemKindEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "description", "System Configuration Item",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (physicalArchitectureRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "Realization link betwen an EPBS architecture and a physical architecture\r\n[source:Capella study]\r\n\r\nRealization is a specialized abstraction relationship between two sets of model elements, one representing a specification\r\n(the supplier) and the other represents an implementation of the latter (the client). Realization can be used to model\r\nstepwise refinement, optimizations, transformations, templates, model synthesis, framework composition, etc.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (physicalArtifactRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "Realization link between a configuration item and a physical artifact (physical component, physical link or physical port)\r\n[source:Capella study]\r\n\r\nRealization is a specialized abstraction relationship between two sets of model elements, one representing a specification\r\n(the supplier) and the other represents an implementation of the latter (the client). Realization can be used to model\r\nstepwise refinement, optimizations, transformations, templates, model synthesis, framework composition, etc.\r\n[source:UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "epbs",
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
		  (epbsArchitectureEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedEPBSContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItemPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEPBSArchitecture_ContainedCapabilityRealizationPkg(), 
		   source, 
		   new String[] {
			 "feature", "ownedAbstractCapabilityPkg"
		   });	
		addAnnotation
		  (getEPBSArchitecture_AllocatedPhysicalArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (epbsContextEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (configurationItemPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (configurationItemEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItem_ItemIdentifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItem_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItem_AllocatedPhysicalArtifacts(), 
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
		  (epbsArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "Label", "EPBSArchitecturePkg"
		   });	
		addAnnotation
		  (getEPBSArchitecturePkg_OwnedEPBSArchitectures(), 
		   source, 
		   new String[] {
			 "Label", "ownedEPBSArchitectures"
		   });	
		addAnnotation
		  (epbsArchitectureEClass, 
		   source, 
		   new String[] {
			 "Label", "EPBSArchitecture"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItem(), 
		   source, 
		   new String[] {
			 "Label", "ownedConfigurationItems"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItemPkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedConfigurationItemPkgs"
		   });	
		addAnnotation
		  (configurationItemPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "ConfigurationItemPkg"
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
			 "Label", "ownedConfigurationItems"
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
			 "Label", "ownedConfigurationItemPkgs"
		   });	
		addAnnotation
		  (configurationItemEClass, 
		   source, 
		   new String[] {
			 "Label", "ConfigurationItem"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
			 "Label", "ownedConfigurationItems"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
			 "Label", "ownedConfigurationItemPkgs"
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
		  (epbsArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.sys.EPBSArchitecturePkg"
		   });	
		addAnnotation
		  (getEPBSArchitecturePkg_OwnedEPBSArchitectures(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (epbsArchitectureEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.sys.EPBSArchitecture"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItem(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItemPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (configurationItemPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.sys.ConfigurationItemPkg"
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (configurationItemEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
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
		  (epbsArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEPBSArchitecturePkg_OwnedEPBSArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which EPBSArchitecture stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (epbsArchitectureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedEPBSContext(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which EPBSContext stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItem(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ConfigurationItem stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItemPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which ConfigurationItemPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getEPBSArchitecture_ContainedCapabilityRealizationPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedPhysicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which PhysicalArchitectureRealisation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getEPBSArchitecture_AllocatedPhysicalArchitectureRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEPBSArchitecture_AllocatedPhysicalArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (epbsContextEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Class",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (configurationItemPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ConfigurationItem stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which ConfigurationItemPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (configurationItemEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Blocks::Block",
			 "explanation", "Could have been mapped to Package (to be closer to the semantic of a \"group of\" physical components, \r\nbut it is not possible since there are Parts associated to CI\'s, and packages do not inherit from Type, hence cannot be used to type a Part.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Class::nestedClassifier",
			 "explanation", "none",
			 "constraints", "uml::Class::nestedClassifier elements on which ConfigurationItem stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "store them in the nearest possible package, since a Block cannot contain packages"
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedPhysicalArtifactRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "store them in the nearest possible package, since a Block cannot contain packages"
		   });	
		addAnnotation
		  (getConfigurationItem_AllocatedPhysicalArtifacts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalArchitectureRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (physicalArtifactRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
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
		  (getEPBSArchitecturePkg_OwnedEPBSArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEPBSArchitecture_OwnedConfigurationItemPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItemPkg_OwnedConfigurationItemPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItem_OwnedConfigurationItemPkgs(), 
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
		  (getEPBSArchitecture_ContainedCapabilityRealizationPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEPBSArchitecture_AllocatedPhysicalArchitectureRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEPBSArchitecture_AllocatedPhysicalArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConfigurationItem_AllocatedPhysicalArtifacts(), 
		   source, 
		   new String[] {
		   });
	}

} //EpbsPackageImpl
