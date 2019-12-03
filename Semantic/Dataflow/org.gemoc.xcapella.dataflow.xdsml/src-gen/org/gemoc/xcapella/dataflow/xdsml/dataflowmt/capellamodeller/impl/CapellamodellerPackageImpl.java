/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.CapellamodellerFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.CapellamodellerPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.Folder;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.FunctionRuntimeDataAspect;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.FunctionalChainRuntimeDataAspect;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.Library;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.ModelRoot;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.Project;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.SystemEngineering;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.SystemEngineeringPkg;

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
public class CapellamodellerPackageImpl extends EPackageImpl implements CapellamodellerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEngineeringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEngineeringPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionRuntimeDataAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainRuntimeDataAspectEClass = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellamodeller.CapellamodellerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapellamodellerPackageImpl() {
		super(eNS_URI, CapellamodellerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CapellamodellerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CapellamodellerPackage init() {
		if (isInited) return (CapellamodellerPackage)EPackage.Registry.INSTANCE.getEPackage(CapellamodellerPackage.eNS_URI);

		// Obtain or create and register package
		CapellamodellerPackageImpl theCapellamodellerPackage = (CapellamodellerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CapellamodellerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CapellamodellerPackageImpl());

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
		theCapellamodellerPackage.createPackageContents();
		theSharedmodelPackage.createPackageContents();
		theEmdePackage.createPackageContents();
		theOaPackage.createPackageContents();
		theCapellacorePackage.createPackageContents();
		thePaPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
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
		theCapellamodellerPackage.initializePackageContents();
		theSharedmodelPackage.initializePackageContents();
		theEmdePackage.initializePackageContents();
		theOaPackage.initializePackageContents();
		theCapellacorePackage.initializePackageContents();
		thePaPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
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
		theCapellamodellerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CapellamodellerPackage.eNS_URI, theCapellamodellerPackage);
		return theCapellamodellerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_KeyValuePairs() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_OwnedFolders() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_OwnedModelRoots() {
		return (EReference)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_OwnedFolders() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolder_OwnedModelRoots() {
		return (EReference)folderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRoot() {
		return modelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemEngineering() {
		return systemEngineeringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEngineering_ContainedOperationalAnalysis() {
		return (EReference)systemEngineeringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEngineering_ContainedSystemAnalysis() {
		return (EReference)systemEngineeringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEngineering_ContainedLogicalArchitectures() {
		return (EReference)systemEngineeringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEngineering_ContainedPhysicalArchitectures() {
		return (EReference)systemEngineeringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEngineering_ContainedEPBSArchitectures() {
		return (EReference)systemEngineeringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEngineering_ContainedSharedPkgs() {
		return (EReference)systemEngineeringEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemEngineeringPkg() {
		return systemEngineeringPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemEngineeringPkg_OwnedSystemEngineerings() {
		return (EReference)systemEngineeringPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionRuntimeDataAspect() {
		return functionRuntimeDataAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalChainRuntimeDataAspect() {
		return functionalChainRuntimeDataAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellamodellerFactory getCapellamodellerFactory() {
		return (CapellamodellerFactory)getEFactoryInstance();
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
		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__KEY_VALUE_PAIRS);
		createEReference(projectEClass, PROJECT__OWNED_FOLDERS);
		createEReference(projectEClass, PROJECT__OWNED_MODEL_ROOTS);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__OWNED_FOLDERS);
		createEReference(folderEClass, FOLDER__OWNED_MODEL_ROOTS);

		modelRootEClass = createEClass(MODEL_ROOT);

		systemEngineeringEClass = createEClass(SYSTEM_ENGINEERING);
		createEReference(systemEngineeringEClass, SYSTEM_ENGINEERING__CONTAINED_OPERATIONAL_ANALYSIS);
		createEReference(systemEngineeringEClass, SYSTEM_ENGINEERING__CONTAINED_SYSTEM_ANALYSIS);
		createEReference(systemEngineeringEClass, SYSTEM_ENGINEERING__CONTAINED_LOGICAL_ARCHITECTURES);
		createEReference(systemEngineeringEClass, SYSTEM_ENGINEERING__CONTAINED_PHYSICAL_ARCHITECTURES);
		createEReference(systemEngineeringEClass, SYSTEM_ENGINEERING__CONTAINED_EPBS_ARCHITECTURES);
		createEReference(systemEngineeringEClass, SYSTEM_ENGINEERING__CONTAINED_SHARED_PKGS);

		systemEngineeringPkgEClass = createEClass(SYSTEM_ENGINEERING_PKG);
		createEReference(systemEngineeringPkgEClass, SYSTEM_ENGINEERING_PKG__OWNED_SYSTEM_ENGINEERINGS);

		libraryEClass = createEClass(LIBRARY);

		functionRuntimeDataAspectEClass = createEClass(FUNCTION_RUNTIME_DATA_ASPECT);

		functionalChainRuntimeDataAspectEClass = createEClass(FUNCTIONAL_CHAIN_RUNTIME_DATA_ASPECT);
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
		OaPackage theOaPackage = (OaPackage)EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI);
		CtxPackage theCtxPackage = (CtxPackage)EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI);
		LaPackage theLaPackage = (LaPackage)EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI);
		PaPackage thePaPackage = (PaPackage)EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI);
		EpbsPackage theEpbsPackage = (EpbsPackage)EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI);
		SharedmodelPackage theSharedmodelPackage = (SharedmodelPackage)EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		folderEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		modelRootEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		systemEngineeringEClass.getESuperTypes().add(theCapellacorePackage.getAbstractModellingStructure());
		systemEngineeringEClass.getESuperTypes().add(this.getModelRoot());
		systemEngineeringPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		systemEngineeringPkgEClass.getESuperTypes().add(this.getModelRoot());
		libraryEClass.getESuperTypes().add(this.getProject());

		// Initialize classes and features; add operations and parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_KeyValuePairs(), theCapellacorePackage.getKeyValue(), null, "keyValuePairs", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_OwnedFolders(), this.getFolder(), null, "ownedFolders", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_OwnedModelRoots(), this.getModelRoot(), null, "ownedModelRoots", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolder_OwnedFolders(), this.getFolder(), null, "ownedFolders", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolder_OwnedModelRoots(), this.getModelRoot(), null, "ownedModelRoots", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelRootEClass, ModelRoot.class, "ModelRoot", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEngineeringEClass, SystemEngineering.class, "SystemEngineering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemEngineering_ContainedOperationalAnalysis(), theOaPackage.getOperationalAnalysis(), null, "containedOperationalAnalysis", null, 0, -1, SystemEngineering.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemEngineering_ContainedSystemAnalysis(), theCtxPackage.getSystemAnalysis(), null, "containedSystemAnalysis", null, 0, -1, SystemEngineering.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemEngineering_ContainedLogicalArchitectures(), theLaPackage.getLogicalArchitecture(), null, "containedLogicalArchitectures", null, 0, -1, SystemEngineering.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemEngineering_ContainedPhysicalArchitectures(), thePaPackage.getPhysicalArchitecture(), null, "containedPhysicalArchitectures", null, 0, -1, SystemEngineering.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemEngineering_ContainedEPBSArchitectures(), theEpbsPackage.getEPBSArchitecture(), null, "containedEPBSArchitectures", null, 0, -1, SystemEngineering.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSystemEngineering_ContainedSharedPkgs(), theSharedmodelPackage.getSharedPkg(), null, "containedSharedPkgs", null, 0, -1, SystemEngineering.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemEngineeringPkgEClass, SystemEngineeringPkg.class, "SystemEngineeringPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemEngineeringPkg_OwnedSystemEngineerings(), this.getSystemEngineering(), null, "ownedSystemEngineerings", null, 0, -1, SystemEngineeringPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionRuntimeDataAspectEClass, FunctionRuntimeDataAspect.class, "FunctionRuntimeDataAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(functionRuntimeDataAspectEClass, ecorePackage.getEString(), "activate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(functionRuntimeDataAspectEClass, ecorePackage.getEString(), "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(functionRuntimeDataAspectEClass, ecorePackage.getEString(), "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(functionRuntimeDataAspectEClass, ecorePackage.getEString(), "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(functionRuntimeDataAspectEClass, ecorePackage.getEString(), "deactivate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(functionalChainRuntimeDataAspectEClass, FunctionalChainRuntimeDataAspect.class, "FunctionalChainRuntimeDataAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(functionalChainRuntimeDataAspectEClass, ecorePackage.getEString(), "activate", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(functionalChainRuntimeDataAspectEClass, ecorePackage.getEString(), "deactivate", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		// http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping
		createMappingAnnotations();
		// http://www.polarsys.org/capella/2007/BusinessInformation
		createBusinessInformationAnnotations();
		// http://www.polarsys.org/capella/derived
		createDerivedAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment
		createSegmentAnnotations();
		// aspect
		createAspectAnnotations();
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
		  (projectEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Model",
			 "stereotype", "core.Project"
		   });	
		addAnnotation
		  (getProject_KeyValuePairs(), 
		   source, 
		   new String[] {
			 "featureName", "ownedComment",
			 "featureOwner", "Element"
		   });	
		addAnnotation
		  (getProject_OwnedFolders(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getProject_OwnedModelRoots(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (folderEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "core.Folder"
		   });	
		addAnnotation
		  (getFolder_OwnedFolders(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getFolder_OwnedModelRoots(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (modelRootEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Element"
		   });	
		addAnnotation
		  (systemEngineeringEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.SystemEngineering"
		   });	
		addAnnotation
		  (systemEngineeringPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.SystemEngineeringPkg"
		   });	
		addAnnotation
		  (getSystemEngineeringPkg_OwnedSystemEngineerings(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
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
			 "extensibleProviderFactory", "true"
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
			 "description", "CapellaModeller aims at defining project level concepts.\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "none",
			 "constraints", "This package depends on the model CapellaCore.ecore",
			 "comment/notes", "none",
			 "reference documentation", "n/a"
		   });	
		addAnnotation
		  (projectEClass, 
		   source, 
		   new String[] {
			 "description", "Project is the model root of a Capella model\r\n[source:Capella study]",
			 "usage guideline", "A Project is the model root of a Capella model",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "None",
			 "constraints", "None",
			 "comment/notes", "None",
			 "reference documentation", "None"
		   });	
		addAnnotation
		  (getProject_KeyValuePairs(), 
		   source, 
		   new String[] {
			 "description", "a list of key/value pairs applying to this Project\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getProject_OwnedFolders(), 
		   source, 
		   new String[] {
			 "description", "Set of folders owned by the project\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getProject_OwnedModelRoots(), 
		   source, 
		   new String[] {
			 "description", "Set of system engineering elements\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (folderEClass, 
		   source, 
		   new String[] {
			 "description", "a container for structuring the storage of models\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFolder_OwnedFolders(), 
		   source, 
		   new String[] {
			 "description", "Sub folders of this folder\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFolder_OwnedModelRoots(), 
		   source, 
		   new String[] {
			 "description", "Set of system engineering elements\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (modelRootEClass, 
		   source, 
		   new String[] {
			 "description", "A model root may be a system engineering element or a package of system engineering elements\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (systemEngineeringEClass, 
		   source, 
		   new String[] {
			 "description", "System engineering is an interdisciplinary approach encompassing the entire technical effort to evolve and verify an integrated and life-cycle balanced set of system people, product, and process solutions that satisfy customer needs.\r\nSystems engineering encompasses:\r\n- the technical efforts related to the development, manufacturing, verification, deployment, operations,\r\nsupport, disposal of, and user training for, systems products and processes;\r\n- the definition and management of the system configuration;\r\n- the translation of the system definition into work breakdown structures;\r\n- and development of information for management decision making\r\n[source:MIL-STD 499B standard]\r\n",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (systemEngineeringPkgEClass, 
		   source, 
		   new String[] {
			 "description", "Package that contains system engineering elements\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSystemEngineeringPkg_OwnedSystemEngineerings(), 
		   source, 
		   new String[] {
			 "description", "Set of system engineering elements\r\n[source:Capella study]",
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
		  (projectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProject_KeyValuePairs(), 
		   source, 
		   new String[] {
			 "feature", "ownedArchitectures"
		   });	
		addAnnotation
		  (getProject_OwnedModelRoots(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemEngineeringEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedOperationalAnalysis(), 
		   source, 
		   new String[] {
			 "feature", "ownedArchitectures"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedSystemAnalysis(), 
		   source, 
		   new String[] {
			 "feature", "ownedArchitectures"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedLogicalArchitectures(), 
		   source, 
		   new String[] {
			 "feature", "ownedArchitectures"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedPhysicalArchitectures(), 
		   source, 
		   new String[] {
			 "feature", "ownedArchitectures"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedEPBSArchitectures(), 
		   source, 
		   new String[] {
			 "feature", "ownedArchitectures"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedSharedPkgs(), 
		   source, 
		   new String[] {
			 "feature", "ownedArchitectures"
		   });	
		addAnnotation
		  (libraryEClass, 
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
			 "extensibleProviderFactory", "true"
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
		  (projectEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getProject_KeyValuePairs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Element::ownedComment",
			 "explanation", "none",
			 "constraints", "uml::Element::ownedComment elements on which KeyValue stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getProject_OwnedFolders(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which Folder stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getProject_OwnedModelRoots(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ModelRoot stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (folderEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFolder_OwnedFolders(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getFolder_OwnedModelRoots(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ModelRoot stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (modelRootEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemEngineeringEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedOperationalAnalysis(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedSystemAnalysis(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedLogicalArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedPhysicalArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedEPBSArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedSharedPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemEngineeringPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSystemEngineeringPkg_OwnedSystemEngineerings(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "Order must be computed"
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
		  (systemEngineeringEClass, 
		   source, 
		   new String[] {
			 "Label", "System Engineering"
		   });	
		addAnnotation
		  (systemEngineeringPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "SystemEngineeringPkg"
		   });	
		addAnnotation
		  (getSystemEngineeringPkg_OwnedSystemEngineerings(), 
		   source, 
		   new String[] {
			 "Label", "ownedSystemEngineerings"
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
		  (getSystemEngineering_ContainedOperationalAnalysis(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedSystemAnalysis(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedLogicalArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedPhysicalArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedEPBSArchitectures(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSystemEngineering_ContainedSharedPkgs(), 
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
		  (getSystemEngineeringPkg_OwnedSystemEngineerings(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (functionRuntimeDataAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionRuntimeDataAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionRuntimeDataAspectEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionRuntimeDataAspectEClass.getEOperations().get(2), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionRuntimeDataAspectEClass.getEOperations().get(3), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionRuntimeDataAspectEClass.getEOperations().get(4), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionalChainRuntimeDataAspectEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionalChainRuntimeDataAspectEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionalChainRuntimeDataAspectEClass.getEOperations().get(1), 
		   source, 
		   new String[] {
		   });
	}

} //CapellamodellerPackageImpl
