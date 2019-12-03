/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunction;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalBlock;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalChainContainer;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunctionalStructure;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchange;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeAllocator;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeCategory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeEnd;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeFunctionalExchangeAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchangeRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentFunctionalAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentPort;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentPortAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentPortAllocationEnd;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentPortKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ExchangeCategory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ExchangeContainment;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ExchangeLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ExchangeSpecification;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ExchangeSpecificationRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionInputPort;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionOutputPort;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionPort;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionSpecification;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChain;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalExchange;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalExchangeRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalExchangeSpecification;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.OrientationPortKind;

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
public class FaPackageImpl extends EPackageImpl implements FaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionalArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionalStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionalBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalExchangeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionalChainContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionInputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionOutputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentFunctionalAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeSpecificationRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalExchangeRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeAllocatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeFunctionalExchangeAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentExchangeRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPortAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPortAllocationEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionalChainKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentExchangeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentPortKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationPortKindEEnum = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FaPackageImpl() {
		super(eNS_URI, FaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FaPackage init() {
		if (isInited) return (FaPackage)EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);

		// Obtain or create and register package
		FaPackageImpl theFaPackage = (FaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FaPackageImpl());

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
		theFaPackage.createPackageContents();
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
		theFaPackage.initializePackageContents();
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
		theFaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FaPackage.eNS_URI, theFaPackage);
		return theFaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionalArchitecture() {
		return abstractFunctionalArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalArchitecture_OwnedFunctionPkg() {
		return (EReference)abstractFunctionalArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalArchitecture_OwnedComponentExchanges() {
		return (EReference)abstractFunctionalArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalArchitecture_OwnedComponentExchangeCategories() {
		return (EReference)abstractFunctionalArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalArchitecture_OwnedFunctionalLinks() {
		return (EReference)abstractFunctionalArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalArchitecture_OwnedFunctionalAllocations() {
		return (EReference)abstractFunctionalArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalArchitecture_OwnedComponentExchangeRealizations() {
		return (EReference)abstractFunctionalArchitectureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionalStructure() {
		return abstractFunctionalStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalStructure_OwnedComponentExchanges() {
		return (EReference)abstractFunctionalStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalStructure_OwnedComponentExchangeCategories() {
		return (EReference)abstractFunctionalStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalStructure_OwnedFunctionalLinks() {
		return (EReference)abstractFunctionalStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalStructure_OwnedFunctionalAllocations() {
		return (EReference)abstractFunctionalStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalStructure_OwnedComponentExchangeRealizations() {
		return (EReference)abstractFunctionalStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionalBlock() {
		return abstractFunctionalBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalBlock_OwnedFunctionalAllocation() {
		return (EReference)abstractFunctionalBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalBlock_OwnedComponentExchanges() {
		return (EReference)abstractFunctionalBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalBlock_OwnedComponentExchangeCategories() {
		return (EReference)abstractFunctionalBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalBlock_FunctionalAllocations() {
		return (EReference)abstractFunctionalBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalBlock_AllocatedFunctions() {
		return (EReference)abstractFunctionalBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalBlock_InExchangeLinks() {
		return (EReference)abstractFunctionalBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalBlock_OutExchangeLinks() {
		return (EReference)abstractFunctionalBlockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPkg() {
		return functionPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPkg_OwnedFunctionalLinks() {
		return (EReference)functionPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPkg_OwnedExchanges() {
		return (EReference)functionPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPkg_OwnedExchangeSpecificationRealizations() {
		return (EReference)functionPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPkg_OwnedCategories() {
		return (EReference)functionPkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPkg_OwnedFunctionSpecifications() {
		return (EReference)functionPkgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionSpecification() {
		return functionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionSpecification_InExchangeLinks() {
		return (EReference)functionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionSpecification_OutExchangeLinks() {
		return (EReference)functionSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionSpecification_OwnedFunctionPorts() {
		return (EReference)functionSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionSpecification_SubFunctionSpecifications() {
		return (EReference)functionSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeCategory() {
		return exchangeCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeCategory_Exchanges() {
		return (EReference)exchangeCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeLink() {
		return exchangeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeLink_Exchanges() {
		return (EReference)exchangeLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeLink_ExchangeContainmentLinks() {
		return (EReference)exchangeLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeLink_OwnedExchangeContainments() {
		return (EReference)exchangeLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeLink_Sources() {
		return (EReference)exchangeLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeLink_Destinations() {
		return (EReference)exchangeLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeContainment() {
		return exchangeContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeContainment_Exchange() {
		return (EReference)exchangeContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeContainment_Link() {
		return (EReference)exchangeContainmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeSpecification() {
		return exchangeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeSpecification_ContainingLink() {
		return (EReference)exchangeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeSpecification_Link() {
		return (EReference)exchangeSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeSpecification_OutgoingExchangeSpecificationRealizations() {
		return (EReference)exchangeSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeSpecification_IncomingExchangeSpecificationRealizations() {
		return (EReference)exchangeSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalExchangeSpecification() {
		return functionalExchangeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchangeSpecification_FunctionalExchanges() {
		return (EReference)functionalExchangeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalChain() {
		return functionalChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalChain_Kind() {
		return (EAttribute)functionalChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_OwnedFunctionalChainInvolvements() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_OwnedFunctionalChainRealizations() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_InvolvedFunctionalChainInvolvements() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_InvolvedFunctions() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_InvolvedFunctionalExchanges() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_InvolvedElements() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_EnactedFunctions() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_EnactedFunctionalBlocks() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_AvailableInStates() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_FirstFunctionalChainInvolvements() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_InvolvingCapabilities() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_InvolvingCapabilityRealizations() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_RealizedFunctionalChains() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChain_RealizingFunctionalChains() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionalChainContainer() {
		return abstractFunctionalChainContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunctionalChainContainer_OwnedFunctionalChains() {
		return (EReference)abstractFunctionalChainContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalChainInvolvement() {
		return functionalChainInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChainInvolvement_NextFunctionalChainInvolvements() {
		return (EReference)functionalChainInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChainInvolvement_PreviousFunctionalChainInvolvements() {
		return (EReference)functionalChainInvolvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChainInvolvement_ExchangedItems() {
		return (EReference)functionalChainInvolvementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChainInvolvement_InvolvedElement() {
		return (EReference)functionalChainInvolvementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalChainReference() {
		return functionalChainReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalChainReference_ReferencedFunctionalChain() {
		return (EReference)functionalChainReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionInputPort() {
		return functionInputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInputPort_IncomingExchangeItems() {
		return (EReference)functionInputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionInputPort_IncomingFunctionalExchanges() {
		return (EReference)functionInputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionOutputPort() {
		return functionOutputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionOutputPort_OutgoingExchangeItems() {
		return (EReference)functionOutputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionOutputPort_OutgoingFunctionalExchanges() {
		return (EReference)functionOutputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunctionAllocation() {
		return abstractFunctionAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentFunctionalAllocation() {
		return componentFunctionalAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentFunctionalAllocation_Function() {
		return (EReference)componentFunctionalAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentFunctionalAllocation_Block() {
		return (EReference)componentFunctionalAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalChainRealization() {
		return functionalChainRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeSpecificationRealization() {
		return exchangeSpecificationRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeSpecificationRealization_RealizedExchangeSpecification() {
		return (EReference)exchangeSpecificationRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeSpecificationRealization_RealizingExchangeSpecification() {
		return (EReference)exchangeSpecificationRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalExchangeRealization() {
		return functionalExchangeRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchangeRealization_RealizedFunctionalExchange() {
		return (EReference)functionalExchangeRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchangeRealization_RealizingFunctionalExchange() {
		return (EReference)functionalExchangeRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionRealization() {
		return functionRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionRealization_AllocatedFunction() {
		return (EReference)functionRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionRealization_AllocatingFunction() {
		return (EReference)functionRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalExchange() {
		return functionalExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_ExchangeSpecifications() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_InvolvingFunctionalChains() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_ExchangedItems() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_AllocatingComponentExchanges() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_IncomingComponentExchangeFunctionalExchangeRealizations() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_IncomingFunctionalExchangeRealizations() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_OutgoingFunctionalExchangeRealizations() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_Categories() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_OwnedFunctionalExchangeRealizations() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_SourceFunctionOutputPort() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_TargetFunctionInputPort() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_RealizedFunctionalExchanges() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalExchange_RealizingFunctionalExchanges() {
		return (EReference)functionalExchangeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFunction() {
		return abstractFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFunction_Kind() {
		return (EAttribute)abstractFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFunction_Condition() {
		return (EAttribute)abstractFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_OwnedFunctions() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_OwnedFunctionRealizations() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_OwnedFunctionalExchanges() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_SubFunctions() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_OutFunctionRealizations() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_InFunctionRealizations() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_ComponentFunctionalAllocations() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_AllocationBlocks() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_AvailableInStates() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_InvolvingCapabilities() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_InvolvingCapabilityRealizations() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_InvolvingFunctionalChains() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_LinkedStateMachine() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractFunction_LinkedFunctionSpecification() {
		return (EReference)abstractFunctionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionPort() {
		return functionPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_RepresentedComponentPort() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_AllocatorComponentPorts() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_RealizedFunctionPorts() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionPort_RealizingFunctionPorts() {
		return (EReference)functionPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchange() {
		return componentExchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentExchange_Kind() {
		return (EAttribute)componentExchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentExchange_Oriented() {
		return (EAttribute)componentExchangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_AllocatedFunctionalExchanges() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_IncomingComponentExchangeRealizations() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_OutgoingComponentExchangeRealizations() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_OutgoingComponentExchangeFunctionalExchangeAllocations() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_OwnedComponentExchangeFunctionalExchangeAllocations() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_OwnedComponentExchangeRealizations() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_OwnedComponentExchangeEnds() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_SourcePort() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_SourcePart() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_TargetPort() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_TargetPart() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_Categories() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_AllocatorPhysicalLinks() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_RealizedComponentExchanges() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchange_RealizingComponentExchanges() {
		return (EReference)componentExchangeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchangeAllocation() {
		return componentExchangeAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeAllocation_ComponentExchangeAllocated() {
		return (EReference)componentExchangeAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeAllocation_ComponentExchangeAllocator() {
		return (EReference)componentExchangeAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchangeAllocator() {
		return componentExchangeAllocatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeAllocator_OwnedComponentExchangeAllocations() {
		return (EReference)componentExchangeAllocatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeAllocator_AllocatedComponentExchanges() {
		return (EReference)componentExchangeAllocatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchangeCategory() {
		return componentExchangeCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeCategory_Exchanges() {
		return (EReference)componentExchangeCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchangeEnd() {
		return componentExchangeEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeEnd_Port() {
		return (EReference)componentExchangeEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeEnd_Part() {
		return (EReference)componentExchangeEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchangeFunctionalExchangeAllocation() {
		return componentExchangeFunctionalExchangeAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeFunctionalExchangeAllocation_AllocatedFunctionalExchange() {
		return (EReference)componentExchangeFunctionalExchangeAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeFunctionalExchangeAllocation_AllocatingComponentExchange() {
		return (EReference)componentExchangeFunctionalExchangeAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentExchangeRealization() {
		return componentExchangeRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeRealization_AllocatedComponentExchange() {
		return (EReference)componentExchangeRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentExchangeRealization_AllocatingComponentExchange() {
		return (EReference)componentExchangeRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPort() {
		return componentPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentPort_Orientation() {
		return (EAttribute)componentPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentPort_Kind() {
		return (EAttribute)componentPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_ComponentExchanges() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_AllocatedFunctionPorts() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_DelegatedComponentPorts() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_DelegatingComponentPorts() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_AllocatingPhysicalPorts() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_RealizedComponentPorts() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPort_RealizingComponentPorts() {
		return (EReference)componentPortEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPortAllocation() {
		return componentPortAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPortAllocation_OwnedComponentPortAllocationEnds() {
		return (EReference)componentPortAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPortAllocation_AllocatedPort() {
		return (EReference)componentPortAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPortAllocation_AllocatingPort() {
		return (EReference)componentPortAllocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPortAllocationEnd() {
		return componentPortAllocationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPortAllocationEnd_Port() {
		return (EReference)componentPortAllocationEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPortAllocationEnd_Part() {
		return (EReference)componentPortAllocationEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPortAllocationEnd_OwningComponentPortAllocation() {
		return (EReference)componentPortAllocationEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctionalChainKind() {
		return functionalChainKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFunctionKind() {
		return functionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentExchangeKind() {
		return componentExchangeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentPortKind() {
		return componentPortKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientationPortKind() {
		return orientationPortKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaFactory getFaFactory() {
		return (FaFactory)getEFactoryInstance();
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
		abstractFunctionalArchitectureEClass = createEClass(ABSTRACT_FUNCTIONAL_ARCHITECTURE);
		createEReference(abstractFunctionalArchitectureEClass, ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTION_PKG);
		createEReference(abstractFunctionalArchitectureEClass, ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGES);
		createEReference(abstractFunctionalArchitectureEClass, ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES);
		createEReference(abstractFunctionalArchitectureEClass, ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_LINKS);
		createEReference(abstractFunctionalArchitectureEClass, ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_FUNCTIONAL_ALLOCATIONS);
		createEReference(abstractFunctionalArchitectureEClass, ABSTRACT_FUNCTIONAL_ARCHITECTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS);

		abstractFunctionalStructureEClass = createEClass(ABSTRACT_FUNCTIONAL_STRUCTURE);
		createEReference(abstractFunctionalStructureEClass, ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES);
		createEReference(abstractFunctionalStructureEClass, ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES);
		createEReference(abstractFunctionalStructureEClass, ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_FUNCTIONAL_LINKS);
		createEReference(abstractFunctionalStructureEClass, ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_FUNCTIONAL_ALLOCATIONS);
		createEReference(abstractFunctionalStructureEClass, ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS);

		abstractFunctionalBlockEClass = createEClass(ABSTRACT_FUNCTIONAL_BLOCK);
		createEReference(abstractFunctionalBlockEClass, ABSTRACT_FUNCTIONAL_BLOCK__OWNED_FUNCTIONAL_ALLOCATION);
		createEReference(abstractFunctionalBlockEClass, ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGES);
		createEReference(abstractFunctionalBlockEClass, ABSTRACT_FUNCTIONAL_BLOCK__OWNED_COMPONENT_EXCHANGE_CATEGORIES);
		createEReference(abstractFunctionalBlockEClass, ABSTRACT_FUNCTIONAL_BLOCK__FUNCTIONAL_ALLOCATIONS);
		createEReference(abstractFunctionalBlockEClass, ABSTRACT_FUNCTIONAL_BLOCK__ALLOCATED_FUNCTIONS);
		createEReference(abstractFunctionalBlockEClass, ABSTRACT_FUNCTIONAL_BLOCK__IN_EXCHANGE_LINKS);
		createEReference(abstractFunctionalBlockEClass, ABSTRACT_FUNCTIONAL_BLOCK__OUT_EXCHANGE_LINKS);

		functionPkgEClass = createEClass(FUNCTION_PKG);
		createEReference(functionPkgEClass, FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS);
		createEReference(functionPkgEClass, FUNCTION_PKG__OWNED_EXCHANGES);
		createEReference(functionPkgEClass, FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS);
		createEReference(functionPkgEClass, FUNCTION_PKG__OWNED_CATEGORIES);
		createEReference(functionPkgEClass, FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS);

		functionSpecificationEClass = createEClass(FUNCTION_SPECIFICATION);
		createEReference(functionSpecificationEClass, FUNCTION_SPECIFICATION__IN_EXCHANGE_LINKS);
		createEReference(functionSpecificationEClass, FUNCTION_SPECIFICATION__OUT_EXCHANGE_LINKS);
		createEReference(functionSpecificationEClass, FUNCTION_SPECIFICATION__OWNED_FUNCTION_PORTS);
		createEReference(functionSpecificationEClass, FUNCTION_SPECIFICATION__SUB_FUNCTION_SPECIFICATIONS);

		exchangeCategoryEClass = createEClass(EXCHANGE_CATEGORY);
		createEReference(exchangeCategoryEClass, EXCHANGE_CATEGORY__EXCHANGES);

		exchangeLinkEClass = createEClass(EXCHANGE_LINK);
		createEReference(exchangeLinkEClass, EXCHANGE_LINK__EXCHANGES);
		createEReference(exchangeLinkEClass, EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS);
		createEReference(exchangeLinkEClass, EXCHANGE_LINK__OWNED_EXCHANGE_CONTAINMENTS);
		createEReference(exchangeLinkEClass, EXCHANGE_LINK__SOURCES);
		createEReference(exchangeLinkEClass, EXCHANGE_LINK__DESTINATIONS);

		exchangeContainmentEClass = createEClass(EXCHANGE_CONTAINMENT);
		createEReference(exchangeContainmentEClass, EXCHANGE_CONTAINMENT__EXCHANGE);
		createEReference(exchangeContainmentEClass, EXCHANGE_CONTAINMENT__LINK);

		exchangeSpecificationEClass = createEClass(EXCHANGE_SPECIFICATION);
		createEReference(exchangeSpecificationEClass, EXCHANGE_SPECIFICATION__CONTAINING_LINK);
		createEReference(exchangeSpecificationEClass, EXCHANGE_SPECIFICATION__LINK);
		createEReference(exchangeSpecificationEClass, EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS);
		createEReference(exchangeSpecificationEClass, EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS);

		functionalExchangeSpecificationEClass = createEClass(FUNCTIONAL_EXCHANGE_SPECIFICATION);
		createEReference(functionalExchangeSpecificationEClass, FUNCTIONAL_EXCHANGE_SPECIFICATION__FUNCTIONAL_EXCHANGES);

		functionalChainEClass = createEClass(FUNCTIONAL_CHAIN);
		createEAttribute(functionalChainEClass, FUNCTIONAL_CHAIN__KIND);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONAL_EXCHANGES);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__INVOLVED_ELEMENTS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__ENACTED_FUNCTIONS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__ENACTED_FUNCTIONAL_BLOCKS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__AVAILABLE_IN_STATES);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__FIRST_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__INVOLVING_CAPABILITIES);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__INVOLVING_CAPABILITY_REALIZATIONS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__REALIZED_FUNCTIONAL_CHAINS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__REALIZING_FUNCTIONAL_CHAINS);

		abstractFunctionalChainContainerEClass = createEClass(ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER);
		createEReference(abstractFunctionalChainContainerEClass, ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_FUNCTIONAL_CHAINS);

		functionalChainInvolvementEClass = createEClass(FUNCTIONAL_CHAIN_INVOLVEMENT);
		createEReference(functionalChainInvolvementEClass, FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		createEReference(functionalChainInvolvementEClass, FUNCTIONAL_CHAIN_INVOLVEMENT__PREVIOUS_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		createEReference(functionalChainInvolvementEClass, FUNCTIONAL_CHAIN_INVOLVEMENT__EXCHANGED_ITEMS);
		createEReference(functionalChainInvolvementEClass, FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT);

		functionalChainReferenceEClass = createEClass(FUNCTIONAL_CHAIN_REFERENCE);
		createEReference(functionalChainReferenceEClass, FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN);

		functionInputPortEClass = createEClass(FUNCTION_INPUT_PORT);
		createEReference(functionInputPortEClass, FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS);
		createEReference(functionInputPortEClass, FUNCTION_INPUT_PORT__INCOMING_FUNCTIONAL_EXCHANGES);

		functionOutputPortEClass = createEClass(FUNCTION_OUTPUT_PORT);
		createEReference(functionOutputPortEClass, FUNCTION_OUTPUT_PORT__OUTGOING_EXCHANGE_ITEMS);
		createEReference(functionOutputPortEClass, FUNCTION_OUTPUT_PORT__OUTGOING_FUNCTIONAL_EXCHANGES);

		abstractFunctionAllocationEClass = createEClass(ABSTRACT_FUNCTION_ALLOCATION);

		componentFunctionalAllocationEClass = createEClass(COMPONENT_FUNCTIONAL_ALLOCATION);
		createEReference(componentFunctionalAllocationEClass, COMPONENT_FUNCTIONAL_ALLOCATION__FUNCTION);
		createEReference(componentFunctionalAllocationEClass, COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK);

		functionalChainRealizationEClass = createEClass(FUNCTIONAL_CHAIN_REALIZATION);

		exchangeSpecificationRealizationEClass = createEClass(EXCHANGE_SPECIFICATION_REALIZATION);
		createEReference(exchangeSpecificationRealizationEClass, EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION);
		createEReference(exchangeSpecificationRealizationEClass, EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION);

		functionalExchangeRealizationEClass = createEClass(FUNCTIONAL_EXCHANGE_REALIZATION);
		createEReference(functionalExchangeRealizationEClass, FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE);
		createEReference(functionalExchangeRealizationEClass, FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE);

		functionRealizationEClass = createEClass(FUNCTION_REALIZATION);
		createEReference(functionRealizationEClass, FUNCTION_REALIZATION__ALLOCATED_FUNCTION);
		createEReference(functionRealizationEClass, FUNCTION_REALIZATION__ALLOCATING_FUNCTION);

		functionalExchangeEClass = createEClass(FUNCTIONAL_EXCHANGE);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__CATEGORIES);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES);
		createEReference(functionalExchangeEClass, FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES);

		abstractFunctionEClass = createEClass(ABSTRACT_FUNCTION);
		createEAttribute(abstractFunctionEClass, ABSTRACT_FUNCTION__KIND);
		createEAttribute(abstractFunctionEClass, ABSTRACT_FUNCTION__CONDITION);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__OWNED_FUNCTIONS);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__OWNED_FUNCTION_REALIZATIONS);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__SUB_FUNCTIONS);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__OUT_FUNCTION_REALIZATIONS);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__IN_FUNCTION_REALIZATIONS);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__COMPONENT_FUNCTIONAL_ALLOCATIONS);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__ALLOCATION_BLOCKS);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__AVAILABLE_IN_STATES);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__INVOLVING_CAPABILITIES);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__INVOLVING_CAPABILITY_REALIZATIONS);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__INVOLVING_FUNCTIONAL_CHAINS);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__LINKED_STATE_MACHINE);
		createEReference(abstractFunctionEClass, ABSTRACT_FUNCTION__LINKED_FUNCTION_SPECIFICATION);

		functionPortEClass = createEClass(FUNCTION_PORT);
		createEReference(functionPortEClass, FUNCTION_PORT__REPRESENTED_COMPONENT_PORT);
		createEReference(functionPortEClass, FUNCTION_PORT__ALLOCATOR_COMPONENT_PORTS);
		createEReference(functionPortEClass, FUNCTION_PORT__REALIZED_FUNCTION_PORTS);
		createEReference(functionPortEClass, FUNCTION_PORT__REALIZING_FUNCTION_PORTS);

		componentExchangeEClass = createEClass(COMPONENT_EXCHANGE);
		createEAttribute(componentExchangeEClass, COMPONENT_EXCHANGE__KIND);
		createEAttribute(componentExchangeEClass, COMPONENT_EXCHANGE__ORIENTED);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__SOURCE_PORT);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__SOURCE_PART);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__TARGET_PORT);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__TARGET_PART);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__CATEGORIES);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES);
		createEReference(componentExchangeEClass, COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES);

		componentExchangeAllocationEClass = createEClass(COMPONENT_EXCHANGE_ALLOCATION);
		createEReference(componentExchangeAllocationEClass, COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATED);
		createEReference(componentExchangeAllocationEClass, COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATOR);

		componentExchangeAllocatorEClass = createEClass(COMPONENT_EXCHANGE_ALLOCATOR);
		createEReference(componentExchangeAllocatorEClass, COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS);
		createEReference(componentExchangeAllocatorEClass, COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES);

		componentExchangeCategoryEClass = createEClass(COMPONENT_EXCHANGE_CATEGORY);
		createEReference(componentExchangeCategoryEClass, COMPONENT_EXCHANGE_CATEGORY__EXCHANGES);

		componentExchangeEndEClass = createEClass(COMPONENT_EXCHANGE_END);
		createEReference(componentExchangeEndEClass, COMPONENT_EXCHANGE_END__PORT);
		createEReference(componentExchangeEndEClass, COMPONENT_EXCHANGE_END__PART);

		componentExchangeFunctionalExchangeAllocationEClass = createEClass(COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION);
		createEReference(componentExchangeFunctionalExchangeAllocationEClass, COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE);
		createEReference(componentExchangeFunctionalExchangeAllocationEClass, COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE);

		componentExchangeRealizationEClass = createEClass(COMPONENT_EXCHANGE_REALIZATION);
		createEReference(componentExchangeRealizationEClass, COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE);
		createEReference(componentExchangeRealizationEClass, COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE);

		componentPortEClass = createEClass(COMPONENT_PORT);
		createEAttribute(componentPortEClass, COMPONENT_PORT__ORIENTATION);
		createEAttribute(componentPortEClass, COMPONENT_PORT__KIND);
		createEReference(componentPortEClass, COMPONENT_PORT__COMPONENT_EXCHANGES);
		createEReference(componentPortEClass, COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS);
		createEReference(componentPortEClass, COMPONENT_PORT__DELEGATED_COMPONENT_PORTS);
		createEReference(componentPortEClass, COMPONENT_PORT__DELEGATING_COMPONENT_PORTS);
		createEReference(componentPortEClass, COMPONENT_PORT__ALLOCATING_PHYSICAL_PORTS);
		createEReference(componentPortEClass, COMPONENT_PORT__REALIZED_COMPONENT_PORTS);
		createEReference(componentPortEClass, COMPONENT_PORT__REALIZING_COMPONENT_PORTS);

		componentPortAllocationEClass = createEClass(COMPONENT_PORT_ALLOCATION);
		createEReference(componentPortAllocationEClass, COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS);
		createEReference(componentPortAllocationEClass, COMPONENT_PORT_ALLOCATION__ALLOCATED_PORT);
		createEReference(componentPortAllocationEClass, COMPONENT_PORT_ALLOCATION__ALLOCATING_PORT);

		componentPortAllocationEndEClass = createEClass(COMPONENT_PORT_ALLOCATION_END);
		createEReference(componentPortAllocationEndEClass, COMPONENT_PORT_ALLOCATION_END__PORT);
		createEReference(componentPortAllocationEndEClass, COMPONENT_PORT_ALLOCATION_END__PART);
		createEReference(componentPortAllocationEndEClass, COMPONENT_PORT_ALLOCATION_END__OWNING_COMPONENT_PORT_ALLOCATION);

		// Create enums
		functionalChainKindEEnum = createEEnum(FUNCTIONAL_CHAIN_KIND);
		functionKindEEnum = createEEnum(FUNCTION_KIND);
		componentExchangeKindEEnum = createEEnum(COMPONENT_EXCHANGE_KIND);
		componentPortKindEEnum = createEEnum(COMPONENT_PORT_KIND);
		orientationPortKindEEnum = createEEnum(ORIENTATION_PORT_KIND);
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
		ActivityPackage theActivityPackage = (ActivityPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI);
		CapellacommonPackage theCapellacommonPackage = (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);
		CtxPackage theCtxPackage = (CtxPackage)EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI);
		LaPackage theLaPackage = (LaPackage)EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		CsPackage theCsPackage = (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractFunctionalArchitectureEClass.getESuperTypes().add(theCapellacorePackage.getModellingArchitecture());
		abstractFunctionalStructureEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		abstractFunctionalBlockEClass.getESuperTypes().add(theCapellacorePackage.getModellingBlock());
		functionPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		functionSpecificationEClass.getESuperTypes().add(theCapellacorePackage.getNamespace());
		functionSpecificationEClass.getESuperTypes().add(theActivityPackage.getAbstractActivity());
		exchangeCategoryEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		exchangeLinkEClass.getESuperTypes().add(theCapellacorePackage.getNamedRelationship());
		exchangeContainmentEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		exchangeSpecificationEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		exchangeSpecificationEClass.getESuperTypes().add(theActivityPackage.getActivityExchange());
		functionalExchangeSpecificationEClass.getESuperTypes().add(this.getExchangeSpecification());
		functionalChainEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		functionalChainEClass.getESuperTypes().add(theCapellacorePackage.getInvolverElement());
		functionalChainEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		abstractFunctionalChainContainerEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		functionalChainInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvement());
		functionalChainReferenceEClass.getESuperTypes().add(this.getFunctionalChainInvolvement());
		functionInputPortEClass.getESuperTypes().add(this.getFunctionPort());
		functionInputPortEClass.getESuperTypes().add(theActivityPackage.getInputPin());
		functionOutputPortEClass.getESuperTypes().add(this.getFunctionPort());
		functionOutputPortEClass.getESuperTypes().add(theActivityPackage.getOutputPin());
		abstractFunctionAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		componentFunctionalAllocationEClass.getESuperTypes().add(this.getAbstractFunctionAllocation());
		functionalChainRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		exchangeSpecificationRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		functionalExchangeRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		functionRealizationEClass.getESuperTypes().add(this.getAbstractFunctionAllocation());
		functionalExchangeEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		functionalExchangeEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		functionalExchangeEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		functionalExchangeEClass.getESuperTypes().add(theActivityPackage.getObjectFlow());
		functionalExchangeEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		functionalExchangeEClass.getESuperTypes().add(theInformationPackage.getAbstractEventOperation());
		abstractFunctionEClass.getESuperTypes().add(theCapellacorePackage.getNamespace());
		abstractFunctionEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		abstractFunctionEClass.getESuperTypes().add(theInformationPackage.getAbstractInstance());
		abstractFunctionEClass.getESuperTypes().add(this.getAbstractFunctionalChainContainer());
		abstractFunctionEClass.getESuperTypes().add(theActivityPackage.getCallBehaviorAction());
		abstractFunctionEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		functionPortEClass.getESuperTypes().add(theInformationPackage.getPort());
		functionPortEClass.getESuperTypes().add(theCapellacorePackage.getTypedElement());
		functionPortEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		componentExchangeEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		componentExchangeEClass.getESuperTypes().add(theInformationPackage.getAbstractEventOperation());
		componentExchangeEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		componentExchangeEClass.getESuperTypes().add(this.getExchangeSpecification());
		componentExchangeAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		componentExchangeAllocatorEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		componentExchangeCategoryEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		componentExchangeEndEClass.getESuperTypes().add(theModellingcorePackage.getInformationsExchanger());
		componentExchangeEndEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		componentExchangeFunctionalExchangeAllocationEClass.getESuperTypes().add(this.getAbstractFunctionAllocation());
		componentExchangeRealizationEClass.getESuperTypes().add(this.getExchangeSpecificationRealization());
		componentPortEClass.getESuperTypes().add(theInformationPackage.getPort());
		componentPortEClass.getESuperTypes().add(theInformationPackage.getPartition());
		componentPortEClass.getESuperTypes().add(theModellingcorePackage.getInformationsExchanger());
		componentPortAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		componentPortAllocationEndEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractFunctionalArchitectureEClass, AbstractFunctionalArchitecture.class, "AbstractFunctionalArchitecture", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFunctionalArchitecture_OwnedFunctionPkg(), this.getFunctionPkg(), null, "ownedFunctionPkg", null, 0, 1, AbstractFunctionalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalArchitecture_OwnedComponentExchanges(), this.getComponentExchange(), null, "ownedComponentExchanges", null, 0, -1, AbstractFunctionalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalArchitecture_OwnedComponentExchangeCategories(), this.getComponentExchangeCategory(), null, "ownedComponentExchangeCategories", null, 0, -1, AbstractFunctionalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalArchitecture_OwnedFunctionalLinks(), this.getExchangeLink(), null, "ownedFunctionalLinks", null, 0, -1, AbstractFunctionalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalArchitecture_OwnedFunctionalAllocations(), this.getComponentFunctionalAllocation(), null, "ownedFunctionalAllocations", null, 0, -1, AbstractFunctionalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalArchitecture_OwnedComponentExchangeRealizations(), this.getComponentExchangeRealization(), null, "ownedComponentExchangeRealizations", null, 0, -1, AbstractFunctionalArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionalStructureEClass, AbstractFunctionalStructure.class, "AbstractFunctionalStructure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFunctionalStructure_OwnedComponentExchanges(), this.getComponentExchange(), null, "ownedComponentExchanges", null, 0, -1, AbstractFunctionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalStructure_OwnedComponentExchangeCategories(), this.getComponentExchangeCategory(), null, "ownedComponentExchangeCategories", null, 0, -1, AbstractFunctionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalStructure_OwnedFunctionalLinks(), this.getExchangeLink(), null, "ownedFunctionalLinks", null, 0, -1, AbstractFunctionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalStructure_OwnedFunctionalAllocations(), this.getComponentFunctionalAllocation(), null, "ownedFunctionalAllocations", null, 0, -1, AbstractFunctionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalStructure_OwnedComponentExchangeRealizations(), this.getComponentExchangeRealization(), null, "ownedComponentExchangeRealizations", null, 0, -1, AbstractFunctionalStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionalBlockEClass, AbstractFunctionalBlock.class, "AbstractFunctionalBlock", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFunctionalBlock_OwnedFunctionalAllocation(), this.getComponentFunctionalAllocation(), null, "ownedFunctionalAllocation", null, 0, -1, AbstractFunctionalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalBlock_OwnedComponentExchanges(), this.getComponentExchange(), null, "ownedComponentExchanges", null, 0, -1, AbstractFunctionalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalBlock_OwnedComponentExchangeCategories(), this.getComponentExchangeCategory(), null, "ownedComponentExchangeCategories", null, 0, -1, AbstractFunctionalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalBlock_FunctionalAllocations(), this.getComponentFunctionalAllocation(), this.getComponentFunctionalAllocation_Block(), "functionalAllocations", null, 0, -1, AbstractFunctionalBlock.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalBlock_AllocatedFunctions(), this.getAbstractFunction(), this.getAbstractFunction_AllocationBlocks(), "allocatedFunctions", null, 0, -1, AbstractFunctionalBlock.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalBlock_InExchangeLinks(), this.getExchangeLink(), null, "inExchangeLinks", null, 0, -1, AbstractFunctionalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunctionalBlock_OutExchangeLinks(), this.getExchangeLink(), null, "outExchangeLinks", null, 0, -1, AbstractFunctionalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionPkgEClass, FunctionPkg.class, "FunctionPkg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionPkg_OwnedFunctionalLinks(), this.getExchangeLink(), null, "ownedFunctionalLinks", null, 0, -1, FunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPkg_OwnedExchanges(), this.getFunctionalExchangeSpecification(), null, "ownedExchanges", null, 0, -1, FunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPkg_OwnedExchangeSpecificationRealizations(), this.getExchangeSpecificationRealization(), null, "ownedExchangeSpecificationRealizations", null, 0, -1, FunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPkg_OwnedCategories(), this.getExchangeCategory(), null, "ownedCategories", null, 0, -1, FunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPkg_OwnedFunctionSpecifications(), this.getFunctionSpecification(), null, "ownedFunctionSpecifications", null, 0, -1, FunctionPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionSpecificationEClass, FunctionSpecification.class, "FunctionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionSpecification_InExchangeLinks(), this.getExchangeLink(), null, "inExchangeLinks", null, 0, -1, FunctionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionSpecification_OutExchangeLinks(), this.getExchangeLink(), null, "outExchangeLinks", null, 0, -1, FunctionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionSpecification_OwnedFunctionPorts(), this.getFunctionPort(), null, "ownedFunctionPorts", null, 0, -1, FunctionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionSpecification_SubFunctionSpecifications(), this.getFunctionSpecification(), null, "subFunctionSpecifications", null, 0, -1, FunctionSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exchangeCategoryEClass, ExchangeCategory.class, "ExchangeCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchangeCategory_Exchanges(), this.getFunctionalExchange(), null, "exchanges", null, 0, -1, ExchangeCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeLinkEClass, ExchangeLink.class, "ExchangeLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchangeLink_Exchanges(), this.getExchangeSpecification(), null, "exchanges", null, 0, -1, ExchangeLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeLink_ExchangeContainmentLinks(), this.getExchangeContainment(), this.getExchangeContainment_Link(), "exchangeContainmentLinks", null, 0, -1, ExchangeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeLink_OwnedExchangeContainments(), this.getExchangeContainment(), null, "ownedExchangeContainments", null, 0, -1, ExchangeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeLink_Sources(), this.getFunctionSpecification(), null, "sources", null, 0, -1, ExchangeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeLink_Destinations(), this.getFunctionSpecification(), null, "destinations", null, 0, -1, ExchangeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeContainmentEClass, ExchangeContainment.class, "ExchangeContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchangeContainment_Exchange(), this.getExchangeSpecification(), this.getExchangeSpecification_Link(), "exchange", null, 1, 1, ExchangeContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeContainment_Link(), this.getExchangeLink(), this.getExchangeLink_ExchangeContainmentLinks(), "link", null, 1, 1, ExchangeContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeSpecificationEClass, ExchangeSpecification.class, "ExchangeSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchangeSpecification_ContainingLink(), this.getExchangeLink(), null, "containingLink", null, 0, 1, ExchangeSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeSpecification_Link(), this.getExchangeContainment(), this.getExchangeContainment_Exchange(), "link", null, 0, 1, ExchangeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeSpecification_OutgoingExchangeSpecificationRealizations(), this.getExchangeSpecificationRealization(), this.getExchangeSpecificationRealization_RealizingExchangeSpecification(), "outgoingExchangeSpecificationRealizations", null, 0, -1, ExchangeSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeSpecification_IncomingExchangeSpecificationRealizations(), this.getExchangeSpecificationRealization(), this.getExchangeSpecificationRealization_RealizedExchangeSpecification(), "incomingExchangeSpecificationRealizations", null, 0, -1, ExchangeSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionalExchangeSpecificationEClass, FunctionalExchangeSpecification.class, "FunctionalExchangeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalExchangeSpecification_FunctionalExchanges(), this.getFunctionalExchange(), null, "functionalExchanges", null, 0, -1, FunctionalExchangeSpecification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionalChainEClass, FunctionalChain.class, "FunctionalChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalChain_Kind(), this.getFunctionalChainKind(), "kind", null, 0, 1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_OwnedFunctionalChainInvolvements(), this.getFunctionalChainInvolvement(), null, "ownedFunctionalChainInvolvements", null, 0, -1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_OwnedFunctionalChainRealizations(), this.getFunctionalChainRealization(), null, "ownedFunctionalChainRealizations", null, 0, -1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_InvolvedFunctionalChainInvolvements(), this.getFunctionalChainInvolvement(), null, "involvedFunctionalChainInvolvements", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_InvolvedFunctions(), this.getAbstractFunction(), this.getAbstractFunction_InvolvingFunctionalChains(), "involvedFunctions", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_InvolvedFunctionalExchanges(), this.getFunctionalExchange(), this.getFunctionalExchange_InvolvingFunctionalChains(), "involvedFunctionalExchanges", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_InvolvedElements(), theCapellacorePackage.getInvolvedElement(), null, "involvedElements", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_EnactedFunctions(), this.getAbstractFunction(), null, "enactedFunctions", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_EnactedFunctionalBlocks(), this.getAbstractFunctionalBlock(), null, "enactedFunctionalBlocks", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_AvailableInStates(), theCapellacommonPackage.getState(), null, "availableInStates", null, 0, -1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_FirstFunctionalChainInvolvements(), this.getFunctionalChainInvolvement(), null, "firstFunctionalChainInvolvements", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_InvolvingCapabilities(), theCtxPackage.getCapability(), null, "involvingCapabilities", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_InvolvingCapabilityRealizations(), theLaPackage.getCapabilityRealization(), null, "involvingCapabilityRealizations", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_RealizedFunctionalChains(), this.getFunctionalChain(), null, "realizedFunctionalChains", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_RealizingFunctionalChains(), this.getFunctionalChain(), null, "realizingFunctionalChains", null, 0, -1, FunctionalChain.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionalChainContainerEClass, AbstractFunctionalChainContainer.class, "AbstractFunctionalChainContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFunctionalChainContainer_OwnedFunctionalChains(), this.getFunctionalChain(), null, "ownedFunctionalChains", null, 0, -1, AbstractFunctionalChainContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalChainInvolvementEClass, FunctionalChainInvolvement.class, "FunctionalChainInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalChainInvolvement_NextFunctionalChainInvolvements(), this.getFunctionalChainInvolvement(), null, "nextFunctionalChainInvolvements", null, 0, -1, FunctionalChainInvolvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChainInvolvement_PreviousFunctionalChainInvolvements(), this.getFunctionalChainInvolvement(), null, "previousFunctionalChainInvolvements", null, 0, -1, FunctionalChainInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChainInvolvement_ExchangedItems(), theInformationPackage.getExchangeItem(), null, "exchangedItems", null, 0, -1, FunctionalChainInvolvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChainInvolvement_InvolvedElement(), theCapellacorePackage.getInvolvedElement(), null, "involvedElement", null, 0, 1, FunctionalChainInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionalChainReferenceEClass, FunctionalChainReference.class, "FunctionalChainReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalChainReference_ReferencedFunctionalChain(), this.getFunctionalChain(), null, "referencedFunctionalChain", null, 0, 1, FunctionalChainReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionInputPortEClass, FunctionInputPort.class, "FunctionInputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionInputPort_IncomingExchangeItems(), theInformationPackage.getExchangeItem(), null, "incomingExchangeItems", null, 0, -1, FunctionInputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionInputPort_IncomingFunctionalExchanges(), this.getFunctionalExchange(), null, "incomingFunctionalExchanges", null, 0, -1, FunctionInputPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionOutputPortEClass, FunctionOutputPort.class, "FunctionOutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionOutputPort_OutgoingExchangeItems(), theInformationPackage.getExchangeItem(), null, "outgoingExchangeItems", null, 0, -1, FunctionOutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionOutputPort_OutgoingFunctionalExchanges(), this.getFunctionalExchange(), null, "outgoingFunctionalExchanges", null, 0, -1, FunctionOutputPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionAllocationEClass, AbstractFunctionAllocation.class, "AbstractFunctionAllocation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentFunctionalAllocationEClass, ComponentFunctionalAllocation.class, "ComponentFunctionalAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentFunctionalAllocation_Function(), this.getAbstractFunction(), this.getAbstractFunction_ComponentFunctionalAllocations(), "function", null, 1, 1, ComponentFunctionalAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentFunctionalAllocation_Block(), this.getAbstractFunctionalBlock(), this.getAbstractFunctionalBlock_FunctionalAllocations(), "block", null, 1, 1, ComponentFunctionalAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionalChainRealizationEClass, FunctionalChainRealization.class, "FunctionalChainRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exchangeSpecificationRealizationEClass, ExchangeSpecificationRealization.class, "ExchangeSpecificationRealization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchangeSpecificationRealization_RealizedExchangeSpecification(), this.getExchangeSpecification(), this.getExchangeSpecification_IncomingExchangeSpecificationRealizations(), "realizedExchangeSpecification", null, 1, 1, ExchangeSpecificationRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeSpecificationRealization_RealizingExchangeSpecification(), this.getExchangeSpecification(), this.getExchangeSpecification_OutgoingExchangeSpecificationRealizations(), "realizingExchangeSpecification", null, 1, 1, ExchangeSpecificationRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionalExchangeRealizationEClass, FunctionalExchangeRealization.class, "FunctionalExchangeRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalExchangeRealization_RealizedFunctionalExchange(), this.getFunctionalExchange(), this.getFunctionalExchange_IncomingFunctionalExchangeRealizations(), "realizedFunctionalExchange", null, 1, 1, FunctionalExchangeRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchangeRealization_RealizingFunctionalExchange(), this.getFunctionalExchange(), this.getFunctionalExchange_OutgoingFunctionalExchangeRealizations(), "realizingFunctionalExchange", null, 1, 1, FunctionalExchangeRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionRealizationEClass, FunctionRealization.class, "FunctionRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionRealization_AllocatedFunction(), this.getAbstractFunction(), this.getAbstractFunction_InFunctionRealizations(), "allocatedFunction", null, 1, 1, FunctionRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionRealization_AllocatingFunction(), this.getAbstractFunction(), this.getAbstractFunction_OutFunctionRealizations(), "allocatingFunction", null, 1, 1, FunctionRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionalExchangeEClass, FunctionalExchange.class, "FunctionalExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalExchange_ExchangeSpecifications(), this.getFunctionalExchangeSpecification(), null, "exchangeSpecifications", null, 0, -1, FunctionalExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_InvolvingFunctionalChains(), this.getFunctionalChain(), this.getFunctionalChain_InvolvedFunctionalExchanges(), "involvingFunctionalChains", null, 0, -1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_ExchangedItems(), theInformationPackage.getExchangeItem(), null, "exchangedItems", null, 0, -1, FunctionalExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_AllocatingComponentExchanges(), this.getComponentExchange(), this.getComponentExchange_AllocatedFunctionalExchanges(), "allocatingComponentExchanges", null, 0, -1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_IncomingComponentExchangeFunctionalExchangeRealizations(), this.getComponentExchangeFunctionalExchangeAllocation(), this.getComponentExchangeFunctionalExchangeAllocation_AllocatedFunctionalExchange(), "incomingComponentExchangeFunctionalExchangeRealizations", null, 0, -1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_IncomingFunctionalExchangeRealizations(), this.getFunctionalExchangeRealization(), this.getFunctionalExchangeRealization_RealizedFunctionalExchange(), "incomingFunctionalExchangeRealizations", null, 0, -1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_OutgoingFunctionalExchangeRealizations(), this.getFunctionalExchangeRealization(), this.getFunctionalExchangeRealization_RealizingFunctionalExchange(), "outgoingFunctionalExchangeRealizations", null, 0, -1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_Categories(), this.getExchangeCategory(), null, "categories", null, 0, -1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_OwnedFunctionalExchangeRealizations(), this.getFunctionalExchangeRealization(), null, "ownedFunctionalExchangeRealizations", null, 0, -1, FunctionalExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_SourceFunctionOutputPort(), this.getFunctionOutputPort(), null, "sourceFunctionOutputPort", null, 0, 1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_TargetFunctionInputPort(), this.getFunctionInputPort(), null, "targetFunctionInputPort", null, 0, 1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_RealizedFunctionalExchanges(), this.getFunctionalExchange(), this.getFunctionalExchange_RealizingFunctionalExchanges(), "realizedFunctionalExchanges", null, 0, -1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalExchange_RealizingFunctionalExchanges(), this.getFunctionalExchange(), this.getFunctionalExchange_RealizedFunctionalExchanges(), "realizingFunctionalExchanges", null, 0, -1, FunctionalExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractFunctionEClass, AbstractFunction.class, "AbstractFunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractFunction_Kind(), this.getFunctionKind(), "kind", null, 0, 1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFunction_Condition(), ecorePackage.getEString(), "condition", null, 0, 1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_OwnedFunctions(), this.getAbstractFunction(), null, "ownedFunctions", null, 0, -1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_OwnedFunctionRealizations(), this.getFunctionRealization(), null, "ownedFunctionRealizations", null, 0, -1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_OwnedFunctionalExchanges(), this.getFunctionalExchange(), null, "ownedFunctionalExchanges", null, 0, -1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_SubFunctions(), this.getAbstractFunction(), null, "subFunctions", null, 0, -1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_OutFunctionRealizations(), this.getFunctionRealization(), this.getFunctionRealization_AllocatingFunction(), "outFunctionRealizations", null, 0, -1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_InFunctionRealizations(), this.getFunctionRealization(), this.getFunctionRealization_AllocatedFunction(), "inFunctionRealizations", null, 0, -1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_ComponentFunctionalAllocations(), this.getComponentFunctionalAllocation(), this.getComponentFunctionalAllocation_Function(), "componentFunctionalAllocations", null, 0, -1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_AllocationBlocks(), this.getAbstractFunctionalBlock(), this.getAbstractFunctionalBlock_AllocatedFunctions(), "allocationBlocks", null, 0, -1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_AvailableInStates(), theCapellacommonPackage.getState(), null, "availableInStates", null, 0, -1, AbstractFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_InvolvingCapabilities(), theCtxPackage.getCapability(), null, "involvingCapabilities", null, 0, -1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_InvolvingCapabilityRealizations(), theLaPackage.getCapabilityRealization(), null, "involvingCapabilityRealizations", null, 0, -1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_InvolvingFunctionalChains(), this.getFunctionalChain(), this.getFunctionalChain_InvolvedFunctions(), "involvingFunctionalChains", null, 0, -1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_LinkedStateMachine(), theCapellacommonPackage.getStateMachine(), null, "linkedStateMachine", null, 0, 1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFunction_LinkedFunctionSpecification(), this.getFunctionSpecification(), null, "linkedFunctionSpecification", null, 0, 1, AbstractFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(functionPortEClass, FunctionPort.class, "FunctionPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionPort_RepresentedComponentPort(), this.getComponentPort(), null, "representedComponentPort", null, 0, 1, FunctionPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_AllocatorComponentPorts(), this.getComponentPort(), this.getComponentPort_AllocatedFunctionPorts(), "allocatorComponentPorts", null, 0, -1, FunctionPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_RealizedFunctionPorts(), this.getFunctionPort(), null, "realizedFunctionPorts", null, 0, -1, FunctionPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionPort_RealizingFunctionPorts(), this.getFunctionPort(), null, "realizingFunctionPorts", null, 0, -1, FunctionPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeEClass, ComponentExchange.class, "ComponentExchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentExchange_Kind(), this.getComponentExchangeKind(), "kind", null, 0, 1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentExchange_Oriented(), ecorePackage.getEBoolean(), "oriented", "false", 0, 1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_AllocatedFunctionalExchanges(), this.getFunctionalExchange(), this.getFunctionalExchange_AllocatingComponentExchanges(), "allocatedFunctionalExchanges", null, 0, -1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_IncomingComponentExchangeRealizations(), this.getComponentExchangeRealization(), this.getComponentExchangeRealization_AllocatedComponentExchange(), "incomingComponentExchangeRealizations", null, 0, -1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_OutgoingComponentExchangeRealizations(), this.getComponentExchangeRealization(), this.getComponentExchangeRealization_AllocatingComponentExchange(), "outgoingComponentExchangeRealizations", null, 0, -1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_OutgoingComponentExchangeFunctionalExchangeAllocations(), this.getComponentExchangeFunctionalExchangeAllocation(), this.getComponentExchangeFunctionalExchangeAllocation_AllocatingComponentExchange(), "outgoingComponentExchangeFunctionalExchangeAllocations", null, 0, -1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_OwnedComponentExchangeFunctionalExchangeAllocations(), this.getComponentExchangeFunctionalExchangeAllocation(), null, "ownedComponentExchangeFunctionalExchangeAllocations", null, 0, -1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_OwnedComponentExchangeRealizations(), this.getComponentExchangeRealization(), null, "ownedComponentExchangeRealizations", null, 0, -1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_OwnedComponentExchangeEnds(), this.getComponentExchangeEnd(), null, "ownedComponentExchangeEnds", null, 0, -1, ComponentExchange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_SourcePort(), theInformationPackage.getPort(), null, "sourcePort", null, 0, 1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_SourcePart(), theCsPackage.getPart(), null, "sourcePart", null, 0, 1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_TargetPort(), theInformationPackage.getPort(), null, "targetPort", null, 0, 1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_TargetPart(), theCsPackage.getPart(), null, "targetPart", null, 0, 1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_Categories(), this.getComponentExchangeCategory(), null, "categories", null, 0, -1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_AllocatorPhysicalLinks(), theCsPackage.getPhysicalLink(), null, "allocatorPhysicalLinks", null, 0, -1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_RealizedComponentExchanges(), this.getComponentExchange(), this.getComponentExchange_RealizingComponentExchanges(), "realizedComponentExchanges", null, 0, -1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchange_RealizingComponentExchanges(), this.getComponentExchange(), this.getComponentExchange_RealizedComponentExchanges(), "realizingComponentExchanges", null, 0, -1, ComponentExchange.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeAllocationEClass, ComponentExchangeAllocation.class, "ComponentExchangeAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentExchangeAllocation_ComponentExchangeAllocated(), this.getComponentExchange(), null, "componentExchangeAllocated", null, 1, 1, ComponentExchangeAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchangeAllocation_ComponentExchangeAllocator(), this.getComponentExchangeAllocator(), null, "componentExchangeAllocator", null, 1, 1, ComponentExchangeAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeAllocatorEClass, ComponentExchangeAllocator.class, "ComponentExchangeAllocator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentExchangeAllocator_OwnedComponentExchangeAllocations(), this.getComponentExchangeAllocation(), null, "ownedComponentExchangeAllocations", null, 0, -1, ComponentExchangeAllocator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchangeAllocator_AllocatedComponentExchanges(), this.getComponentExchange(), null, "allocatedComponentExchanges", null, 0, -1, ComponentExchangeAllocator.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeCategoryEClass, ComponentExchangeCategory.class, "ComponentExchangeCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentExchangeCategory_Exchanges(), this.getComponentExchange(), null, "exchanges", null, 0, -1, ComponentExchangeCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeEndEClass, ComponentExchangeEnd.class, "ComponentExchangeEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentExchangeEnd_Port(), theInformationPackage.getPort(), null, "port", null, 0, 1, ComponentExchangeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchangeEnd_Part(), theInformationPackage.getPartition(), null, "part", null, 0, 1, ComponentExchangeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeFunctionalExchangeAllocationEClass, ComponentExchangeFunctionalExchangeAllocation.class, "ComponentExchangeFunctionalExchangeAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentExchangeFunctionalExchangeAllocation_AllocatedFunctionalExchange(), this.getFunctionalExchange(), this.getFunctionalExchange_IncomingComponentExchangeFunctionalExchangeRealizations(), "allocatedFunctionalExchange", null, 1, 1, ComponentExchangeFunctionalExchangeAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchangeFunctionalExchangeAllocation_AllocatingComponentExchange(), this.getComponentExchange(), this.getComponentExchange_OutgoingComponentExchangeFunctionalExchangeAllocations(), "allocatingComponentExchange", null, 1, 1, ComponentExchangeFunctionalExchangeAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentExchangeRealizationEClass, ComponentExchangeRealization.class, "ComponentExchangeRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentExchangeRealization_AllocatedComponentExchange(), this.getComponentExchange(), this.getComponentExchange_IncomingComponentExchangeRealizations(), "allocatedComponentExchange", null, 1, 1, ComponentExchangeRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentExchangeRealization_AllocatingComponentExchange(), this.getComponentExchange(), this.getComponentExchange_OutgoingComponentExchangeRealizations(), "allocatingComponentExchange", null, 1, 1, ComponentExchangeRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentPortEClass, ComponentPort.class, "ComponentPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentPort_Orientation(), this.getOrientationPortKind(), "orientation", null, 0, 1, ComponentPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentPort_Kind(), this.getComponentPortKind(), "kind", null, 0, 1, ComponentPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_ComponentExchanges(), this.getComponentExchange(), null, "componentExchanges", null, 0, -1, ComponentPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_AllocatedFunctionPorts(), this.getFunctionPort(), this.getFunctionPort_AllocatorComponentPorts(), "allocatedFunctionPorts", null, 0, -1, ComponentPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_DelegatedComponentPorts(), this.getComponentPort(), this.getComponentPort_DelegatingComponentPorts(), "delegatedComponentPorts", null, 0, -1, ComponentPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_DelegatingComponentPorts(), this.getComponentPort(), this.getComponentPort_DelegatedComponentPorts(), "delegatingComponentPorts", null, 0, -1, ComponentPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_AllocatingPhysicalPorts(), theCsPackage.getPhysicalPort(), theCsPackage.getPhysicalPort_AllocatedComponentPorts(), "allocatingPhysicalPorts", null, 0, -1, ComponentPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_RealizedComponentPorts(), this.getComponentPort(), this.getComponentPort_RealizingComponentPorts(), "realizedComponentPorts", null, 0, -1, ComponentPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPort_RealizingComponentPorts(), this.getComponentPort(), this.getComponentPort_RealizedComponentPorts(), "realizingComponentPorts", null, 0, -1, ComponentPort.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentPortAllocationEClass, ComponentPortAllocation.class, "ComponentPortAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPortAllocation_OwnedComponentPortAllocationEnds(), this.getComponentPortAllocationEnd(), null, "ownedComponentPortAllocationEnds", null, 0, -1, ComponentPortAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPortAllocation_AllocatedPort(), theInformationPackage.getPort(), null, "allocatedPort", null, 0, 1, ComponentPortAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPortAllocation_AllocatingPort(), theInformationPackage.getPort(), null, "allocatingPort", null, 0, 1, ComponentPortAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(componentPortAllocationEndEClass, ComponentPortAllocationEnd.class, "ComponentPortAllocationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPortAllocationEnd_Port(), theInformationPackage.getPort(), null, "port", null, 0, 1, ComponentPortAllocationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPortAllocationEnd_Part(), theCsPackage.getPart(), null, "part", null, 0, 1, ComponentPortAllocationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPortAllocationEnd_OwningComponentPortAllocation(), this.getComponentPortAllocation(), null, "owningComponentPortAllocation", null, 0, 1, ComponentPortAllocationEnd.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(functionalChainKindEEnum, FunctionalChainKind.class, "FunctionalChainKind");
		addEEnumLiteral(functionalChainKindEEnum, FunctionalChainKind.SIMPLE);
		addEEnumLiteral(functionalChainKindEEnum, FunctionalChainKind.COMPOSITE);
		addEEnumLiteral(functionalChainKindEEnum, FunctionalChainKind.FRAGMENT);

		initEEnum(functionKindEEnum, FunctionKind.class, "FunctionKind");
		addEEnumLiteral(functionKindEEnum, FunctionKind.FUNCTION);
		addEEnumLiteral(functionKindEEnum, FunctionKind.DUPLICATE);
		addEEnumLiteral(functionKindEEnum, FunctionKind.GATHER);
		addEEnumLiteral(functionKindEEnum, FunctionKind.SELECT);
		addEEnumLiteral(functionKindEEnum, FunctionKind.SPLIT);
		addEEnumLiteral(functionKindEEnum, FunctionKind.ROUTE);

		initEEnum(componentExchangeKindEEnum, ComponentExchangeKind.class, "ComponentExchangeKind");
		addEEnumLiteral(componentExchangeKindEEnum, ComponentExchangeKind.UNSET);
		addEEnumLiteral(componentExchangeKindEEnum, ComponentExchangeKind.DELEGATION);
		addEEnumLiteral(componentExchangeKindEEnum, ComponentExchangeKind.ASSEMBLY);
		addEEnumLiteral(componentExchangeKindEEnum, ComponentExchangeKind.FLOW);

		initEEnum(componentPortKindEEnum, ComponentPortKind.class, "ComponentPortKind");
		addEEnumLiteral(componentPortKindEEnum, ComponentPortKind.STANDARD);
		addEEnumLiteral(componentPortKindEEnum, ComponentPortKind.FLOW);

		initEEnum(orientationPortKindEEnum, OrientationPortKind.class, "OrientationPortKind");
		addEEnumLiteral(orientationPortKindEEnum, OrientationPortKind.UNSET);
		addEEnumLiteral(orientationPortKindEEnum, OrientationPortKind.IN);
		addEEnumLiteral(orientationPortKindEEnum, OrientationPortKind.OUT);
		addEEnumLiteral(orientationPortKindEEnum, OrientationPortKind.INOUT);

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
		// http://www.polarsys.org/capella/2007/UML2Mapping
		createUML2MappingAnnotations();
		// http://www.polarsys.org/capella/2007/BusinessInformation
		createBusinessInformationAnnotations();
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
			 "description", "FunctionalAnalysis aims at defining the system engineering usual functional breakdown and functional data flow language (close to the UML Activity machine and SysML Activity as Block, partially).\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "none",
			 "constraints", "This package depends on the model CapellaCommon.ecore\r\nThis package depends on the model Information.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractFunctionalArchitectureEClass, 
		   source, 
		   new String[] {
			 "description", "a base class supporting the definition of architectures stating the functional interactions between entities\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedFunctionPkg(), 
		   source, 
		   new String[] {
			 "description", "the function packages contained in this functional architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
			 "description", "the component exchanges contained directly under this functional architecture, e.g. exchanges between top level components\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedComponentExchangeCategories(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "description", "the exchange links contained directly under this functional architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedFunctionalAllocations(), 
		   source, 
		   new String[] {
			 "description", "the list of component <=> functions allocation links contained directly under this functional architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "description", "the list of component exchange realizations contained directly under this functional architecture\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractFunctionalStructureEClass, 
		   source, 
		   new String[] {
			 "description", "a specialized structure containing links of a functional nature between components\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
			 "description", "the connections between components, contained in this structure\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedComponentExchangeCategories(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "description", "the (functional) exchange links defined in the context of this structure\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedFunctionalAllocations(), 
		   source, 
		   new String[] {
			 "description", "the list of component <=> function allocation links defined in this structure\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "description", "the list of realizations links between component exchanges, defined in this structure\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractFunctionalBlockEClass, 
		   source, 
		   new String[] {
			 "description", "a specialization of a generic modelling block, with added ability to hold allocation links to functions\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OwnedFunctionalAllocation(), 
		   source, 
		   new String[] {
			 "description", "allocation relationships between Functions and Blocks, that are owned by this Block\r\n[source: Capella study]\r\n",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
			 "description", "the connections associated with this block\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OwnedComponentExchangeCategories(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_FunctionalAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the allocation links between this block, and the functions that are allocated to it.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_AllocatedFunctions(), 
		   source, 
		   new String[] {
			 "description", "the list of functions allocated to this block\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_InExchangeLinks(), 
		   source, 
		   new String[] {
			 "description", "the (functional) exchanges that have this block as their target/destination\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OutExchangeLinks(), 
		   source, 
		   new String[] {
			 "description", "the (functional) exchanges that have this block as their source\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionPkgEClass, 
		   source, 
		   new String[] {
			 "description", "a base class for deriving packages aimed at containing functional entities (functions, exchanges between functions, ...)\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "description", "the (functional) exchange links contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedExchanges(), 
		   source, 
		   new String[] {
			 "description", "the exchanges specifications contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedExchangeSpecificationRealizations(), 
		   source, 
		   new String[] {
			 "description", "the exchange realization links contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedCategories(), 
		   source, 
		   new String[] {
			 "description", "the exchange categories (families) contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedFunctionSpecifications(), 
		   source, 
		   new String[] {
			 "description", "the functions (specifications) included in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionSpecificationEClass, 
		   source, 
		   new String[] {
			 "description", "a function specification is to a function what a classifier is to an instance : it characterizes the common properties that all function instances will share\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionSpecification_InExchangeLinks(), 
		   source, 
		   new String[] {
			 "description", "inbound exchange links\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionSpecification_OutExchangeLinks(), 
		   source, 
		   new String[] {
			 "description", "outbound exchange links\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionSpecification_OwnedFunctionPorts(), 
		   source, 
		   new String[] {
			 "description", "flow ports owned by functions instanciating this function specification\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionSpecification_SubFunctionSpecifications(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of sub-specifications of this function specification \r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeCategoryEClass, 
		   source, 
		   new String[] {
			 "description", "defines a family of exchanges, all associated to a common applicative criteria\r\n[source: Capella study]",
			 "usage guideline", "could for example be used to declare a grouping of all physical exchanges sharing the same communication medium\r\n[source: Capella study]",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExchangeCategory_Exchanges(), 
		   source, 
		   new String[] {
			 "description", "the list of functional exchanges that are part of this exchange category\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeLinkEClass, 
		   source, 
		   new String[] {
			 "description", "a grouping of functional exchanges, all participating in the same applicative link\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExchangeLink_Exchanges(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the exchanges involved in this exchange link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeLink_ExchangeContainmentLinks(), 
		   source, 
		   new String[] {
			 "description", "the exchange containments that are part of this exchange link \r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeLink_OwnedExchangeContainments(), 
		   source, 
		   new String[] {
			 "description", "the exchange containments that are owned by this exchange link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeLink_Sources(), 
		   source, 
		   new String[] {
			 "description", "the functions that are at the starting point(s) of this exchange link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeLink_Destinations(), 
		   source, 
		   new String[] {
			 "description", "the functions that are at the destination point(s) of this exchange link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeContainmentEClass, 
		   source, 
		   new String[] {
			 "description", "a mediator class allowing to implement a referencing between an Exchange and an ExchangeLink\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExchangeContainment_Exchange(), 
		   source, 
		   new String[] {
			 "description", "the exchange (specification) involved in this relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeContainment_Link(), 
		   source, 
		   new String[] {
			 "description", "the exchange link involved in this relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeSpecificationEClass, 
		   source, 
		   new String[] {
			 "description", "a high-level abstract class specifying a set of constraints that concrete exchanges might fulfill (e.g. implement this specification)\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExchangeSpecification_ContainingLink(), 
		   source, 
		   new String[] {
			 "description", "the exchange link associated with this exchange specification\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeSpecification_Link(), 
		   source, 
		   new String[] {
			 "description", "the exchange containment associated with this exchange specification\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeSpecification_OutgoingExchangeSpecificationRealizations(), 
		   source, 
		   new String[] {
			 "description", "the realization links between exchange specifications, for which this exchange specification is the origin of the link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeSpecification_IncomingExchangeSpecificationRealizations(), 
		   source, 
		   new String[] {
			 "description", "the realization links between exchange specifications, for which this exchange specification is the destination of the link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalExchangeSpecificationEClass, 
		   source, 
		   new String[] {
			 "description", "a specialized version of an exchange specification, dedicated to specify exchanges between two functions of the system\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionalExchangeSpecification_FunctionalExchanges(), 
		   source, 
		   new String[] {
			 "description", "the functional exchanges that fulfill this specification\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalChainEClass, 
		   source, 
		   new String[] {
			 "description", "A functional chain is a set of Functions, activated through an activation graph (or path) and carrying non functional properties such as latency, criticity level ... \r\nIt provides a high-level description of a contribution of the system, users or external entities to an operational capability.",
			 "usage guideline", "a functional chain is used highlight a specific path in the function flow, that is of particular interest in the context of the targeted application (performance constraint, safety path, ...)\r\n[source: Capella study]",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "../img/usage_examples/example_functional_chain.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_Kind(), 
		   source, 
		   new String[] {
			 "description", "Defines the kind of this FunctionalChain",
			 "constraints", "none",
			 "type", "refer to FunctionalChainKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_OwnedFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
			 "description", "the list of involvement relationships owned by this functional chain",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_OwnedFunctionalChainRealizations(), 
		   source, 
		   new String[] {
			 "description", "the list of realization relationships owned by this functional chain",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of involvement relationships included in this functional chain\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedFunctions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the functions involved in this functional chain\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the functional exchanges involved in this functional chain\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedElements(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of model elements involved in this functional chain\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_EnactedFunctions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the functions involved in this functional chain\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_EnactedFunctionalBlocks(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the functional blocks involved in this functional chain\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_AvailableInStates(), 
		   source, 
		   new String[] {
			 "description", "the list of (system) states in which this functional chain is actually available\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvingCapabilities(), 
		   source, 
		   new String[] {
			 "description", "",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvingCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "description", "",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalChainKindEEnum, 
		   source, 
		   new String[] {
			 "description", "Enumeration of the different functional chains\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalChainKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "simple functional chain",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalChainKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "composite functional chain",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalChainKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "fragment functional chain",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractFunctionalChainContainerEClass, 
		   source, 
		   new String[] {
			 "description", "Base class for possible containers of functional chains (may be both functional or use case containers)\r\n[source: MBSD unified approach]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalChainContainer_OwnedFunctionalChains(), 
		   source, 
		   new String[] {
			 "description", "the functional chains associated to this function, e.g. functional chains that involve only sub-functions of this function\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalChainInvolvementEClass, 
		   source, 
		   new String[] {
			 "description", "specifies the involvement of a model element in a functional chain\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_NextFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionInputPortEClass, 
		   source, 
		   new String[] {
			 "description", "an input interface of its owning function, to receive functional exchanges from other functions\r\n[source: Capella study]",
			 "usage guideline", "It is necessary to create a function input port on a function, to be able to set this function as the receiving end of a functional exchange. Note however that the Capella tool automatically creates a function input port on the destination function, when a functional exchange is created.\r\n[source: Capella study]",
			 "used in levels", "system,logical,physical",
			 "usage examples", "../img/usage_examples/ports_exchanges.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionInputPort_IncomingExchangeItems(), 
		   source, 
		   new String[] {
			 "description", "the exchange items that are declared as potential flowing into this port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionOutputPortEClass, 
		   source, 
		   new String[] {
			 "description", "an output interface of its owning function, to be the origin of functional exchanges towards other functions\r\n[source: Capella study]",
			 "usage guideline", "It is necessary to create a function output port on a function, to be able to set this function as the origin of a functional exchange. Note however that the Capella tool automatically creates a function output port on the origin function, when a functional exchange is created.\r\n[source: Capella study]",
			 "used in levels", "system,logical,physical",
			 "usage examples", "../img/usage_examples/ports_exchanges.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionOutputPort_OutgoingExchangeItems(), 
		   source, 
		   new String[] {
			 "description", "the exchange items that are declared as potentially flowing out of this port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractFunctionAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "a base class for deriving allocation relationships between a function, and some other model element\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (componentFunctionalAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "a allocation link between a function and a component\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentFunctionalAllocation_Function(), 
		   source, 
		   new String[] {
			 "description", "the function involved in this allocation link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentFunctionalAllocation_Block(), 
		   source, 
		   new String[] {
			 "description", "the block involved in this allocation link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalChainRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "an allocation link between two Functional Chains",
			 "usage guideline", "this link is typically generated by the Capella tool during automated transitions between design levels",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (exchangeSpecificationRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "Base class for deriving specific realization links between exchange specifications and the model elements that realize them.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExchangeSpecificationRealization_RealizedExchangeSpecification(), 
		   source, 
		   new String[] {
			 "description", "the exchange specification that is being realized by the other (typically lower level) exchange specification involved in this link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeSpecificationRealization_RealizingExchangeSpecification(), 
		   source, 
		   new String[] {
			 "description", "the exchange specification that performs the realization of the other exchange specification involved in this link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalExchangeRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "a realization link between a functional exchange, and the (typically higher level) functional exchange that it realizes\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionalExchangeRealization_RealizedFunctionalExchange(), 
		   source, 
		   new String[] {
			 "description", "the functional exchange that is being realized by the other functional exchange involved in this relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalExchangeRealization_RealizingFunctionalExchange(), 
		   source, 
		   new String[] {
			 "description", "the functional exchange that is realising the other functional exchange involved in this relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "an allocation link between a function, and the function that it realizes\r\n[source: Capella study]",
			 "usage guideline", "this link is typically generated by the Capella tool during automated transitions between design levels",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionRealization_AllocatedFunction(), 
		   source, 
		   new String[] {
			 "description", "the function that is being allocated by/from the other function\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionRealization_AllocatingFunction(), 
		   source, 
		   new String[] {
			 "description", "the function that allocates (to) the other function\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionalExchangeEClass, 
		   source, 
		   new String[] {
			 "description", "an exchange between two functions of the system\r\n[source: Capella study]",
			 "usage guideline", "a functional exchange is used between two functions whenever there is an interaction between these two functions, be it the providing of some data or just the transition of control from/to a function.",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "../img/usage_examples/ports_exchanges.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_ExchangeSpecifications(), 
		   source, 
		   new String[] {
			 "description", "the exchange specification(s) that this exchange complies to\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_InvolvingFunctionalChains(), 
		   source, 
		   new String[] {
			 "description", "the functional chains in which this exchange is involved\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_ExchangedItems(), 
		   source, 
		   new String[] {
			 "description", "the exchange items that are carried along this functional exchange\r\n[source: Capella study]\r\n\r\nSpecifies the information items that may circulate on this information flow.\r\n[source: UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_AllocatingComponentExchanges(), 
		   source, 
		   new String[] {
			 "description", "the component exchanges associated to this functional exchange, e.g. the exchanges between the components to which the source/destination of this functional exchange are allocated.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_IncomingComponentExchangeFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
			 "description", "the allocation links between component exchanges and functional exchanges, that have this functional exchange as their destination\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_IncomingFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the realization links between functional exchanges, that have this functional exchange as their destination\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_OutgoingFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
			 "description", "the realization links between functional exchanges, that have this functional exchange as their origin\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_Categories(), 
		   source, 
		   new String[] {
			 "description", "the exchange categories (families) to which this functional exchange belongs\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_OwnedFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
			 "description", "the realization links between functional exchanges, that are owned by this functional exchange\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractFunctionEClass, 
		   source, 
		   new String[] {
			 "description", "Specifies an operation or an action that is performed by an entity.\r\n\r\nA transformation of inputs to outputs that may include the creation, monitoring, modification or destruction of elements, or a null transformation.\r\n[source: SysML glossary for SysML v1.0]\r\n\r\nThis is an abstract base class for the derivation of specific function types at each design level\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "operational,system,logical,physical",
			 "arcadia_description", "A function is an action, an operation or a service fulfilled by the system or by an actor when interacting with the system. Example: tune radio frequency, display radio name...",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_OwnedFunctions(), 
		   source, 
		   new String[] {
			 "description", "the functions that are owned (in terms of model structure) by this function\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_OwnedFunctionRealizations(), 
		   source, 
		   new String[] {
			 "description", "the function realisation links that are associated to this function\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_OwnedFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "description", "the functional exchanges that are owned by this function, e.g. that have their source and destination on sub-functions of this function.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_SubFunctions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the children functions of this function\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_OutFunctionRealizations(), 
		   source, 
		   new String[] {
			 "description", "function realization links that have this function as their origin\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_InFunctionRealizations(), 
		   source, 
		   new String[] {
			 "description", "the function realisation links that have this function as their destination\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_ComponentFunctionalAllocations(), 
		   source, 
		   new String[] {
			 "description", "the mediator classes that implement the allocation of this function to/from components (blocks)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_AllocationBlocks(), 
		   source, 
		   new String[] {
			 "description", "the blocks to/from which this function is allocated\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_AvailableInStates(), 
		   source, 
		   new String[] {
			 "description", "the list of (system) states in which this function is actually available\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingCapabilities(), 
		   source, 
		   new String[] {
			 "description", "",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "description", "",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingFunctionalChains(), 
		   source, 
		   new String[] {
			 "description", "the functional chains that involve this function\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedStateMachine(), 
		   source, 
		   new String[] {
			 "description", "the state machine associated to this function\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedFunctionSpecification(), 
		   source, 
		   new String[] {
			 "description", "the function specification with which this function complies\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (functionPortEClass, 
		   source, 
		   new String[] {
			 "description", "A port is an interaction point between a block or part and its environment that is connected with other ports via connectors\r\n[source: SysML specification v1.1]\r\n\r\nBase abstract class for actual port implementations\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFunctionPort_RepresentedComponentPort(), 
		   source, 
		   new String[] {
			 "description", "the ComponentPort that this function port represents\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum, 
		   source, 
		   new String[] {
			 "description", "ConnectorKind is an enumeration of the following literal values:\r\n- assembly\r\nIndicates that the connector is an assembly connector.\r\n- delegation\r\nIndicates that the connector is a delegation connector.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "Communication kind is not set\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "Indicates that the connector is a delegation connector.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "Indicates that the connector is an assembly connector.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "Describes a flow communication",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentPortKindEEnum, 
		   source, 
		   new String[] {
			 "description", "ComponentPortKind is an enumeration of the following literal values:\r\nstandard:\r\nA port is an interaction point between a Block or sub-Block and its environment that supports Exchanges with other ports.\r\nflow:\r\nA FlowPorts is an interaction point through which input and/or output of items such as data, material, or energy may flow",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentPortKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "Describes a standard port : \r\nA port is an interaction point between a Block or sub-Block and its environment that supports Exchanges with other ports.\r\n[source: SysML glossary for SysML v1.0]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentPortKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "Describes a flow port : \r\nA FlowPorts is an interaction point through which input and/or output of items such as data, material, or energy may flow\r\n[source: SysML specification v1.1]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (orientationPortKindEEnum, 
		   source, 
		   new String[] {
			 "description", "ComponentPortKind is an enumeration of the following literal values:\r\nstandard:\r\nA port is an interaction point between a Block or sub-Block and its environment that supports Exchanges with other ports.\r\nflow:\r\nA FlowPorts is an interaction point through which input and/or output of items such as data, material, or energy may flow",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (orientationPortKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the port orientation is undefined",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (orientationPortKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the port represents an input of the component it is used in",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (orientationPortKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "used when the port represents an output of the component it is used in",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (orientationPortKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "used when the port represents both an input and on output of the component it is used in",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeEClass, 
		   source, 
		   new String[] {
			 "description", "a specialized version of an exchange specification, dedicated to characterize exchanges between components\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none",
			 "arcadia_description", "An Exchange is an interaction between some entities such as actors, the system, functions or components, which is likely to influence their behaviour. Example: tuning frequency, radio selection command..."
		   });	
		addAnnotation
		  (getComponentExchange_Kind(), 
		   source, 
		   new String[] {
			 "description", "Kind of the connection",
			 "constraints", "none",
			 "type", "refer to ConnectionKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchange_Oriented(), 
		   source, 
		   new String[] {
			 "description", "describes the orientation of the connection. The connection can be oriented or not",
			 "constraints", "none",
			 "type", "refer to OrientationConnectionKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchange_AllocatedFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "description", "the functional exchanges associated with this component exchange (e.g. the functional exchanges that happen between functions allocated to the two components involved in this component exchange)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchange_IncomingComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "description", "the component exchange realization links that have this component exchange as their destination\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchange_OutgoingComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the component exchange realization links that have this component exchange as their source\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchange_OutgoingComponentExchangeFunctionalExchangeAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the allocation links between functional exchanges and component exchanges, for which this component exchange is the source\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeFunctionalExchangeAllocations(), 
		   source, 
		   new String[] {
			 "description", "the allocation links between functional exchanges and component exchanges, owned by this component exchange\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "description", "the component exchange realization links that are owned by this component exchange\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeEnds(), 
		   source, 
		   new String[] {
			 "description", "the connection endpoints involved in this link (potentially, an arbitrary number of them can be present)\r\n[source: Capella study]\r\n\r\nA connector consists of at least two connector ends, each representing the participation of instances of the classifiers\r\ntyping the connectable elements attached to this end. The set of connector ends is ordered.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchange_Categories(), 
		   source, 
		   new String[] {
			 "description", "the exchange categories (families) to which this functional exchange belongs\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "Mediator class implementing an allocation relationship, between a component exchange, and the element that allocates it\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentExchangeAllocation_ComponentExchangeAllocated(), 
		   source, 
		   new String[] {
			 "description", "The connection being allocated\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchangeAllocation_ComponentExchangeAllocator(), 
		   source, 
		   new String[] {
			 "description", "The element that allocates the connection\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeAllocatorEClass, 
		   source, 
		   new String[] {
			 "description", "Base class for elements that are intended to allocate to/from connections\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentExchangeAllocator_OwnedComponentExchangeAllocations(), 
		   source, 
		   new String[] {
			 "description", "the component exchanges allocations contained in this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchangeAllocator_AllocatedComponentExchanges(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) direct references to the component exchanges being allocated by this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeCategoryEClass, 
		   source, 
		   new String[] {
			 "description", "defines a family of exchanges, all associated to a common applicative criteria\r\n[source: Capella study]",
			 "usage guideline", "could for example be used to declare a grouping of all physical exchanges sharing the same communication medium\r\n[source: Capella study]",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentExchangeCategory_Exchanges(), 
		   source, 
		   new String[] {
			 "description", "the list of functional exchanges that are part of this exchange category\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeEndEClass, 
		   source, 
		   new String[] {
			 "description", "an endpoint of a connection link\r\n\r\nA connector end is an endpoint of a connector, which attaches the connector to a connectable element. Each connector\r\nend is part of one connector.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Port(), 
		   source, 
		   new String[] {
			 "description", "the port to which this communication endpoint is attached\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Part(), 
		   source, 
		   new String[] {
			 "description", "the part to which this connect endpoint is attached\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeFunctionalExchangeAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "allocation link between a connection and a functional exchange\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentExchangeFunctionalExchangeAllocation_AllocatedFunctionalExchange(), 
		   source, 
		   new String[] {
			 "description", "the functional exchange involved in this allocation link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchangeFunctionalExchangeAllocation_AllocatingComponentExchange(), 
		   source, 
		   new String[] {
			 "description", "the connection involved in this allocation relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentExchangeRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "an allocation link between a connection, and another (typically lower level) connection that realizes it",
			 "usage guideline", "this kind of link is typically generated automatically by the Capella tool when performing a transition between design levels",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentExchangeRealization_AllocatedComponentExchange(), 
		   source, 
		   new String[] {
			 "description", "the connection that is being allocated by/from the other connection involved in this link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentExchangeRealization_AllocatingComponentExchange(), 
		   source, 
		   new String[] {
			 "description", "the connection that is allocating that other connection involved in this link \r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentPortEClass, 
		   source, 
		   new String[] {
			 "description", "A component port is the unification of the standard port and the flow port.",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentPort_Orientation(), 
		   source, 
		   new String[] {
			 "description", "the orientation of a component port. ",
			 "constraints", "should be set only when the component port is a flow port",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentPort_Kind(), 
		   source, 
		   new String[] {
			 "description", "A component port is the unification of the standard port and the flow port.\r\nsee the ComponentPortKind enumeration.\r\n",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentPortAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "specific kind of allocation link, between two Ports.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocation_OwnedComponentPortAllocationEnds(), 
		   source, 
		   new String[] {
			 "description", "the component port allocation endpoints involved in this link\r\n\r\nA connector consists of at least two connector ends, each representing the participation of instances of the classifiers\r\ntyping the connectable elements attached to this end. The set of connector ends is ordered.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocation_AllocatedPort(), 
		   source, 
		   new String[] {
			 "description", "the \"destination\" of the allocation link : the port that is being allocated by another port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocation_AllocatingPort(), 
		   source, 
		   new String[] {
			 "description", "the \"source\" of the allocation link : the port that is allocating the other port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (componentPortAllocationEndEClass, 
		   source, 
		   new String[] {
			 "description", "n/a",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Port(), 
		   source, 
		   new String[] {
			 "description", "the port to which this communication endpoint is attached\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Part(), 
		   source, 
		   new String[] {
			 "description", "the part to which this connect endpoint is attached\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_OwningComponentPortAllocation(), 
		   source, 
		   new String[] {
			 "description", "the ComponentPortAllocation link that contains this endpoint\r\n[source: Capella study]",
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
		  (getAbstractFunctionalArchitecture_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedComponentExchangeCategories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedComponentExchangeCategories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OwnedComponentExchangeCategories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedCategories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (exchangeCategoryEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeCategory_Exchanges(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (functionalChainEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_OwnedFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_AvailableInStates(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_FirstFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvingCapabilities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvingCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getFunctionalChain_RealizedFunctionalChains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_RealizingFunctionalChains(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getAbstractFunctionalChainContainer_OwnedFunctionalChains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionalChainInvolvementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_NextFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_PreviousFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_InvolvedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionalChainReferenceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChainReference_ReferencedFunctionalChain(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionInputPortEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionInputPort_IncomingExchangeItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionInputPort_IncomingFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (functionOutputPortEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionOutputPort_OutgoingExchangeItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionOutputPort_OutgoingFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (functionalExchangeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_InvolvingFunctionalChains(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getFunctionalExchange_ExchangedItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_AllocatingComponentExchanges(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getFunctionalExchange_Categories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_SourceFunctionOutputPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_TargetFunctionInputPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_RealizedFunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_RealizingFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getAbstractFunction_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_Condition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_OwnedFunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_AvailableInStates(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingCapabilities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingFunctionalChains(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedStateMachine(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionPort_AllocatorComponentPorts(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getFunctionPort_RealizedFunctionPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionPort_RealizingFunctionPorts(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (componentExchangeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_Oriented(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_AllocatedFunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeEnds(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_SourcePort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_SourcePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_TargetPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_TargetPart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_Categories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_AllocatorPhysicalLinks(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getComponentExchange_RealizedComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_RealizingComponentExchanges(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getComponentExchangeAllocator_AllocatedComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentExchangeCategoryEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeCategory_Exchanges(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (componentExchangeEndEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Port(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Part(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentPortEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_Orientation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_ComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_AllocatedFunctionPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_DelegatedComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_DelegatingComponentPorts(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getComponentPort_AllocatingPhysicalPorts(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getComponentPort_RealizedComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_RealizingComponentPorts(), 
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
		  (abstractFunctionalArchitectureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Package",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedFunctionPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "",
			 "constraints", "uml::Package::nestedPackage elements on which FunctionPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ComponentExchange stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ExchangeLink stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedFunctionalAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ComponentFunctionalAllocation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ComponentExchangeRealisation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (abstractFunctionalStructureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ComponentExchange stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ExchangeLink stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedFunctionalAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ComponentFunctionalAllocation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ComponentExchangeRealisation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (abstractFunctionalBlockEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OwnedFunctionalAllocation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "Some elements on which ComponentFunctionalAllocation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "In uml::Element::nearestPackage, exchanges between two elements contained by this block. Thoses exchanges are packaged elements on which ComponentExchange stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_FunctionalAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_AllocatedFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_InExchangeLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OutExchangeLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ExchangeLink stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which FunctionalExchangeSpecification stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedExchangeSpecificationRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ExchangeSpecificationRealisation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedCategories(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ExchangeCategory stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedFunctionSpecifications(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which FunctionSpecification stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (functionSpecificationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Activity",
			 "explanation", "cannot be mapped to uml::Component since it is not part of UML4SysML",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionSpecification_InExchangeLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionSpecification_OutExchangeLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionSpecification_OwnedFunctionPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::StructuredClassifier::ownedAttribute",
			 "explanation", "none",
			 "constraints", "uml::StructuredClassifier::ownedAttribute elements on which FlowPort stereotype or any stereotype that inherits from it is applied\r\nOrder will not be preserved"
		   });	
		addAnnotation
		  (getFunctionSpecification_SubFunctionSpecifications(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeCategoryEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeCategory_Exchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", ""
		   });	
		addAnnotation
		  (exchangeLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::InformationFlow",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeLink_Exchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeLink_ExchangeContainmentLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency",
			 "explanation", "none",
			 "constraints", "uml::NamedElement::clientDependency elements on which ExchangeContainment stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getExchangeLink_OwnedExchangeContainments(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which ExchangeContainment stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getExchangeLink_Sources(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::InformationFlow::informationSource",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getExchangeLink_Destinations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::InformationFlow::informationTarget",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (exchangeContainmentEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeContainment_Exchange(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (getExchangeContainment_Link(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (exchangeSpecificationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::InformationFlow",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeSpecification_ContainingLink(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeSpecification_Link(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Dependency::supplier",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeSpecification_OutgoingExchangeSpecificationRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeSpecification_IncomingExchangeSpecificationRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalExchangeSpecificationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::InformationFlow",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchangeSpecification_FunctionalExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalChainEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_OwnedFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency::keyword::specific",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "uml::NamedElement::clientDependency elements on which FunctionalChain stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getFunctionalChain_OwnedFunctionalChainRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency::keyword::specific",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "uml::NamedElement::clientDependency elements on which FunctionalChainInvolvement stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedElements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_EnactedFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_EnactedFunctionalBlocks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_AvailableInStates(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_FirstFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvingCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvingCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_RealizedFunctionalChains(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChain_RealizingFunctionalChains(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalChainKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalChainKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalChainKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalChainKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractFunctionalChainContainerEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunctionalChainContainer_OwnedFunctionalChains(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "uml::Class::nestedClassifier elements on which FunctionalChain stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (functionalChainInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_NextFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_PreviousFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_ExchangedItems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_InvolvedElement(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalChainReferenceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalChainReference_ReferencedFunctionalChain(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionInputPortEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::ActivityParameterNode",
			 "explanation", "use ActivityParameterNodes, delegation will add uml::InputPin on callBeahviorAction\r\n",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionInputPort_IncomingExchangeItems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionInputPort_IncomingFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionOutputPortEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::ActivityParameterNode",
			 "explanation", "use ActivityParameterNodes, delegation will add uml::OutputPin on call BehaviorAction",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionOutputPort_OutgoingExchangeItems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionOutputPort_OutgoingFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractFunctionAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentFunctionalAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Allocations::Allocate",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentFunctionalAllocation_Function(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentFunctionalAllocation_Block(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalChainRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeSpecificationRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeSpecificationRealization_RealizedExchangeSpecification(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeSpecificationRealization_RealizingExchangeSpecification(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalExchangeRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchangeRealization_RealizedFunctionalExchange(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchangeRealization_RealizingFunctionalExchange(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionRealization_AllocatedFunction(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionRealization_AllocatingFunction(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionalExchangeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::ObjectFlow",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_ExchangeSpecifications(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_InvolvingFunctionalChains(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_ExchangedItems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", ""
		   });	
		addAnnotation
		  (getFunctionalExchange_AllocatingComponentExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_IncomingComponentExchangeFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_IncomingFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_OutgoingFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_Categories(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_OwnedFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which FunctionalExchangeRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getFunctionalExchange_SourceFunctionOutputPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_TargetFunctionInputPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_RealizedFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionalExchange_RealizingFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractFunctionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Activity",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_Condition(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_OwnedFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "the nesting relation is not representing the hierarchy of functions, but helps storing the functions in a structured way",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_OwnedFunctionRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which FunctionRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getAbstractFunction_OwnedFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Activity::edge",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "uml::Activity::edge elements on which FunctionalExchange stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getAbstractFunction_SubFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_OutFunctionRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_InFunctionRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_ComponentFunctionalAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_AllocationBlocks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_AvailableInStates(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingCapabilityRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingFunctionalChains(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedStateMachine(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedFunctionSpecification(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (functionPortEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionPort_RepresentedComponentPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionPort_AllocatorComponentPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionPort_RealizedFunctionPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFunctionPort_RealizingFunctionPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ConnectorKind",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", "This value does not exist for uml::ConnectorKind"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ConnectorKind::delegation",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ConnectorKind::assembly",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", "This value does not exist for uml::ConnectorKind"
		   });	
		addAnnotation
		  (componentPortKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentPortKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", ""
		   });	
		addAnnotation
		  (componentPortKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", ""
		   });	
		addAnnotation
		  (orientationPortKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (orientationPortKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", ""
		   });	
		addAnnotation
		  (orientationPortKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", ""
		   });	
		addAnnotation
		  (orientationPortKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", ""
		   });	
		addAnnotation
		  (orientationPortKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", ""
		   });	
		addAnnotation
		  (componentExchangeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::InformationFlow",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_Oriented(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_AllocatedFunctionalExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_IncomingComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_OutgoingComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_OutgoingComponentExchangeFunctionalExchangeAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeFunctionalExchangeAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which ComponentFunctionalExchangeAllocation stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which ComponentExchangeRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeEnds(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Connector::end",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_SourcePort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_SourcePart(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_TargetPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_TargetPart(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_Categories(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_AllocatorPhysicalLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_RealizedComponentExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchange_RealizingComponentExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentExchangeAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Allocations::Allocate",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchangeAllocation_ComponentExchangeAllocated(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchangeAllocation_ComponentExchangeAllocator(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentExchangeAllocatorEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchangeAllocator_OwnedComponentExchangeAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "uml::NamedElement::clientDependency elements on which ConnectionAllocation stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getComponentExchangeAllocator_AllocatedComponentExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentExchangeCategoryEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchangeCategory_Exchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", ""
		   });	
		addAnnotation
		  (componentExchangeEndEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::ConnectorEnd",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Port(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ConnectorEnd::role",
			 "explanation", "none",
			 "constraints", "uml::ConnectorEnd::role elements on which StandardPort stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Part(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ConnectorEnd::partWithPort",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentExchangeFunctionalExchangeAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Allocations::Allocate",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchangeFunctionalExchangeAllocation_AllocatedFunctionalExchange(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchangeFunctionalExchangeAllocation_AllocatingComponentExchange(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentExchangeRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchangeRealization_AllocatedComponentExchange(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentExchangeRealization_AllocatingComponentExchange(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentPortEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPort_Orientation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPort_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPort_ComponentExchanges(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPort_AllocatedFunctionPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPort_DelegatedComponentPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPort_DelegatingComponentPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPort_AllocatingPhysicalPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPort_RealizedComponentPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPort_RealizingComponentPorts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentPortAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Allocations::Allocate",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocation_OwnedComponentPortAllocationEnds(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Connector::end",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocation_AllocatedPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocation_AllocatingPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (componentPortAllocationEndEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::ConnectorEnd",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Port(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ConnectorEnd::role",
			 "explanation", "none",
			 "constraints", "uml::ConnectorEnd::role elements on which PhysicalPort stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Part(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ConnectorEnd::partWithPort",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_OwningComponentPortAllocation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Connector::end",
			 "constraints", "none"
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
		  (getAbstractFunctionalArchitecture_OwnedFunctionPkg(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
			 "featureName", "ownedConnector",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "featureName", "ownedConnector",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
			 "featureName", "ownedConnector",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedComponentExchangeRealizations(), 
		   source, 
		   new String[] {
			 "featureName", "ownedConnector",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OwnedComponentExchanges(), 
		   source, 
		   new String[] {
			 "featureName", "ownedConnector",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (functionPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.sys.FunctionalAnalysis"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (functionSpecificationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component"
		   });	
		addAnnotation
		  (getFunctionSpecification_SubFunctionSpecifications(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
		   });	
		addAnnotation
		  (exchangeLinkEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component",
			 "stereotype", "eng.sys.FunctionalLink"
		   });	
		addAnnotation
		  (getExchangeLink_ExchangeContainmentLinks(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getExchangeLink_OwnedExchangeContainments(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Component"
		   });	
		addAnnotation
		  (getExchangeLink_Sources(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getExchangeLink_Destinations(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (exchangeContainmentEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.ExchangeContainment"
		   });	
		addAnnotation
		  (getExchangeContainment_Exchange(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getExchangeContainment_Link(), 
		   source, 
		   new String[] {
			 "featureName", "client",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getExchangeSpecification_Link(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (functionalExchangeSpecificationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Connector",
			 "stereotype", "eng.Exchange"
		   });	
		addAnnotation
		  (functionalChainEClass, 
		   source, 
		   new String[] {
			 "metaclass", "StructuredActivityNode",
			 "stereotype", "eng.FunctionalChain"
		   });	
		addAnnotation
		  (getAbstractFunctionalChainContainer_OwnedFunctionalChains(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (abstractFunctionAllocationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency"
		   });	
		addAnnotation
		  (componentFunctionalAllocationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.FunctionAllocationToLogicalComponent"
		   });	
		addAnnotation
		  (exchangeSpecificationRealizationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.FunctionAllocationToLogicalComponent"
		   });	
		addAnnotation
		  (functionalExchangeEClass, 
		   source, 
		   new String[] {
			 "metaclass", "ObjectFlow",
			 "stereotype", "eng.Transition"
		   });	
		addAnnotation
		  (abstractFunctionEClass, 
		   source, 
		   new String[] {
			 "metaclass", "OpaqueAction",
			 "stereotype", "eng.Action"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum, 
		   source, 
		   new String[] {
			 "enum", "ConnectorKind"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "enumLiteral", "DELEGATION"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "enumLiteral", "ASSEMBLY"
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeEnds(), 
		   source, 
		   new String[] {
			 "featureName", "end",
			 "featureOwner", "Connector"
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Port(), 
		   source, 
		   new String[] {
			 "featureName", "role",
			 "featureOwner", "ConnectorEnd"
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Part(), 
		   source, 
		   new String[] {
			 "featureName", "partWithPort",
			 "featureOwner", "ConnectorEnd"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Port(), 
		   source, 
		   new String[] {
			 "featureName", "role",
			 "featureOwner", "ConnectorEnd"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Part(), 
		   source, 
		   new String[] {
			 "featureName", "partWithPort",
			 "featureOwner", "ConnectorEnd"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_OwningComponentPortAllocation(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "end",
			 "umlOppositeReferenceOwner", "Connector"
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
		  (getAbstractFunctionalArchitecture_OwnedFunctionPkg(), 
		   source, 
		   new String[] {
			 "Label", "ownedFunctionPkg"
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "Label", "ownedFunctionalLinks"
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "Label", "ownedFunctionalLinks"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_InExchangeLinks(), 
		   source, 
		   new String[] {
			 "Label", "inFunctionalLinks"
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OutExchangeLinks(), 
		   source, 
		   new String[] {
			 "Label", "outFunctionalLinks"
		   });	
		addAnnotation
		  (functionPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "FunctionalAnalysis"
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
			 "Label", "ownedFunctionalLinks"
		   });	
		addAnnotation
		  (functionSpecificationEClass, 
		   source, 
		   new String[] {
			 "Label", "Function Specification"
		   });	
		addAnnotation
		  (getFunctionSpecification_InExchangeLinks(), 
		   source, 
		   new String[] {
			 "Label", "inFunctionalLinks"
		   });	
		addAnnotation
		  (getFunctionSpecification_OutExchangeLinks(), 
		   source, 
		   new String[] {
			 "Label", "outFunctionalLinks"
		   });	
		addAnnotation
		  (getFunctionSpecification_SubFunctionSpecifications(), 
		   source, 
		   new String[] {
			 "Label", "subFunctions"
		   });	
		addAnnotation
		  (exchangeLinkEClass, 
		   source, 
		   new String[] {
			 "Label", "FunctionalLink"
		   });	
		addAnnotation
		  (getExchangeLink_Exchanges(), 
		   source, 
		   new String[] {
			 "Label", "exchanges"
		   });	
		addAnnotation
		  (getExchangeLink_ExchangeContainmentLinks(), 
		   source, 
		   new String[] {
			 "Label", "exchangeContainmentLinks"
		   });	
		addAnnotation
		  (getExchangeLink_OwnedExchangeContainments(), 
		   source, 
		   new String[] {
			 "Label", "ownedExchangeContainments"
		   });	
		addAnnotation
		  (getExchangeLink_Sources(), 
		   source, 
		   new String[] {
			 "Label", "sources"
		   });	
		addAnnotation
		  (getExchangeLink_Destinations(), 
		   source, 
		   new String[] {
			 "Label", "destinations"
		   });	
		addAnnotation
		  (exchangeContainmentEClass, 
		   source, 
		   new String[] {
			 "Label", "ExchangeContainment"
		   });	
		addAnnotation
		  (getExchangeContainment_Exchange(), 
		   source, 
		   new String[] {
			 "Label", "exchange"
		   });	
		addAnnotation
		  (getExchangeContainment_Link(), 
		   source, 
		   new String[] {
			 "Label", "link"
		   });	
		addAnnotation
		  (getExchangeSpecification_ContainingLink(), 
		   source, 
		   new String[] {
			 "Label", "containingLink"
		   });	
		addAnnotation
		  (getExchangeSpecification_Link(), 
		   source, 
		   new String[] {
			 "Label", "link"
		   });	
		addAnnotation
		  (functionalExchangeSpecificationEClass, 
		   source, 
		   new String[] {
			 "Label", "Functional Exchange Specification"
		   });	
		addAnnotation
		  (functionalChainEClass, 
		   source, 
		   new String[] {
			 "Label", "FunctionalChain"
		   });	
		addAnnotation
		  (getAbstractFunctionalChainContainer_OwnedFunctionalChains(), 
		   source, 
		   new String[] {
			 "Label", "ownedFunctionalChains"
		   });	
		addAnnotation
		  (abstractFunctionAllocationEClass, 
		   source, 
		   new String[] {
			 "Label", "FunctionAllocation"
		   });	
		addAnnotation
		  (componentFunctionalAllocationEClass, 
		   source, 
		   new String[] {
			 "Label", "FunctionAllocationToLogicalComponent"
		   });	
		addAnnotation
		  (exchangeSpecificationRealizationEClass, 
		   source, 
		   new String[] {
			 "Label", "FunctionAllocationToLogicalComponent"
		   });	
		addAnnotation
		  (functionalExchangeRealizationEClass, 
		   source, 
		   new String[] {
			 "Label", "Functional Exchange Realization"
		   });	
		addAnnotation
		  (functionalExchangeEClass, 
		   source, 
		   new String[] {
			 "Label", "Transition"
		   });	
		addAnnotation
		  (getFunctionalExchange_ExchangeSpecifications(), 
		   source, 
		   new String[] {
			 "Label", "exchanges"
		   });	
		addAnnotation
		  (abstractFunctionEClass, 
		   source, 
		   new String[] {
			 "Label", "Action"
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedStateMachine(), 
		   source, 
		   new String[] {
			 "Label", "linkedFunction"
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedFunctionSpecification(), 
		   source, 
		   new String[] {
			 "Label", "linkedFunctionSpecification"
		   });	
		addAnnotation
		  (functionPortEClass, 
		   source, 
		   new String[] {
			 "Label", "Function Port"
		   });	
		addAnnotation
		  (componentExchangeKindEEnum, 
		   source, 
		   new String[] {
			 "Label", "ConnectionKind"
		   });	
		addAnnotation
		  (componentPortKindEEnum, 
		   source, 
		   new String[] {
			 "Label", "ComponentPortKind"
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeEnds(), 
		   source, 
		   new String[] {
			 "Label", "ownedConnectionEnds"
		   });	
		addAnnotation
		  (componentExchangeEndEClass, 
		   source, 
		   new String[] {
			 "Label", "ConnectionEnd"
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Port(), 
		   source, 
		   new String[] {
			 "Label", "port"
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Part(), 
		   source, 
		   new String[] {
			 "Label", "part"
		   });	
		addAnnotation
		  (componentExchangeFunctionalExchangeAllocationEClass, 
		   source, 
		   new String[] {
			 "Label", "Component Functional Exchange Allocation"
		   });	
		addAnnotation
		  (componentExchangeRealizationEClass, 
		   source, 
		   new String[] {
			 "Label", "Connection Realization"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Port(), 
		   source, 
		   new String[] {
			 "Label", "port"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Part(), 
		   source, 
		   new String[] {
			 "Label", "part"
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_OwningComponentPortAllocation(), 
		   source, 
		   new String[] {
			 "Label", "owningComponentPortAllocation"
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
		  (getAbstractFunctionalArchitecture_OwnedFunctionPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalArchitecture_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalStructure_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_InExchangeLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_OutExchangeLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionPkg_OwnedFunctionalLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionSpecification_InExchangeLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionSpecification_OutExchangeLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionSpecification_SubFunctionSpecifications(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeLink_Exchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeLink_ExchangeContainmentLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeLink_OwnedExchangeContainments(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeLink_Sources(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeLink_Destinations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeContainment_Exchange(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeContainment_Link(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeSpecification_ContainingLink(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeSpecification_Link(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalChainContainer_OwnedFunctionalChains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_ExchangeSpecifications(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedStateMachine(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedFunctionSpecification(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_OwnedComponentExchangeEnds(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Port(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeEnd_Part(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Port(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_Part(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_OwningComponentPortAllocation(), 
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
		  (getAbstractFunctionalBlock_FunctionalAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunctionalBlock_AllocatedFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionSpecification_SubFunctionSpecifications(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeLink_Exchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeSpecification_ContainingLink(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeSpecification_OutgoingExchangeSpecificationRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeSpecification_IncomingExchangeSpecificationRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchangeSpecification_FunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedFunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvedElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_EnactedFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_EnactedFunctionalBlocks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_FirstFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvingCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_InvolvingCapabilityRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_RealizedFunctionalChains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChain_RealizingFunctionalChains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_PreviousFunctionalChainInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChainInvolvement_InvolvedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalChainReference_ReferencedFunctionalChain(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionInputPort_IncomingFunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionOutputPort_OutgoingFunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentFunctionalAllocation_Function(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentFunctionalAllocation_Block(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeSpecificationRealization_RealizedExchangeSpecification(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeSpecificationRealization_RealizingExchangeSpecification(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchangeRealization_RealizedFunctionalExchange(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchangeRealization_RealizingFunctionalExchange(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionRealization_AllocatedFunction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionRealization_AllocatingFunction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_InvolvingFunctionalChains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_AllocatingComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_IncomingComponentExchangeFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_IncomingFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_OutgoingFunctionalExchangeRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_Categories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_SourceFunctionOutputPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_TargetFunctionInputPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_RealizedFunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionalExchange_RealizingFunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_SubFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_OutFunctionRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_InFunctionRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_ComponentFunctionalAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_AllocationBlocks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingCapabilityRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_InvolvingFunctionalChains(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedStateMachine(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractFunction_LinkedFunctionSpecification(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionPort_AllocatorComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionPort_RealizedFunctionPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFunctionPort_RealizingFunctionPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_AllocatedFunctionalExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_IncomingComponentExchangeRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_OutgoingComponentExchangeRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_OutgoingComponentExchangeFunctionalExchangeAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_SourcePort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_SourcePart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_TargetPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_TargetPart(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_Categories(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_AllocatorPhysicalLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_RealizedComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchange_RealizingComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeAllocation_ComponentExchangeAllocated(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeAllocation_ComponentExchangeAllocator(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeAllocator_AllocatedComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeFunctionalExchangeAllocation_AllocatedFunctionalExchange(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeFunctionalExchangeAllocation_AllocatingComponentExchange(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeRealization_AllocatedComponentExchange(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentExchangeRealization_AllocatingComponentExchange(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_ComponentExchanges(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_AllocatedFunctionPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_DelegatedComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_DelegatingComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_AllocatingPhysicalPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_RealizedComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPort_RealizingComponentPorts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPortAllocation_AllocatedPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPortAllocation_AllocatingPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentPortAllocationEnd_OwningComponentPortAllocation(), 
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
		  (exchangeLinkEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (exchangeContainmentEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionalExchangeSpecificationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (abstractFunctionAllocationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (componentFunctionalAllocationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (exchangeSpecificationRealizationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (functionalExchangeEClass, 
		   source, 
		   new String[] {
		   });
	}

} //FaPackageImpl
