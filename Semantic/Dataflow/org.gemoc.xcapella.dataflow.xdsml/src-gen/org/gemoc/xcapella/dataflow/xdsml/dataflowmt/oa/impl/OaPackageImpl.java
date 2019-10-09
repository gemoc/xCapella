/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.AbstractConceptItem;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.ActivityAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CapabilityConfiguration;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CommunicationMean;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CommunityOfInterest;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CommunityOfInterestComposition;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Concept;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.ConceptCompliance;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.ConceptPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Entity;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.EntityOperationalCapabilityInvolvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.EntityPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.ItemInConcept;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Location;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivityPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActor;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapabilityPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalContext;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalProcess;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalScenario;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OrganisationalUnit;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OrganisationalUnitComposition;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Role;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.RoleAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.RoleAssemblyUsage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.RolePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Swimlane;

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
public class OaPackageImpl extends EPackageImpl implements OaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalActivityPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swimlaneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalCapabilityPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalCapabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleAssemblyUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptComplianceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemInConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConceptItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communityOfInterestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communityOfInterestCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationalUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationalUnitCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationMeanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityOperationalCapabilityInvolvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalContextEClass = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OaPackageImpl() {
		super(eNS_URI, OaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OaPackage init() {
		if (isInited) return (OaPackage)EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI);

		// Obtain or create and register package
		OaPackageImpl theOaPackage = (OaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SharedmodelPackageImpl theSharedmodelPackage = (SharedmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) instanceof SharedmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) : SharedmodelPackage.eINSTANCE);
		EmdePackageImpl theEmdePackage = (EmdePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) instanceof EmdePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) : EmdePackage.eINSTANCE);
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
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		theOaPackage.createPackageContents();
		theSharedmodelPackage.createPackageContents();
		theEmdePackage.createPackageContents();
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
		theActivityPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		theOaPackage.initializePackageContents();
		theSharedmodelPackage.initializePackageContents();
		theEmdePackage.initializePackageContents();
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
		theActivityPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OaPackage.eNS_URI, theOaPackage);
		return theOaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalAnalysis() {
		return operationalAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis_OwnedOperationalContext() {
		return (EReference)operationalAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis_OwnedRolePkg() {
		return (EReference)operationalAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis_OwnedEntityPkg() {
		return (EReference)operationalAnalysisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis_OwnedConceptPkg() {
		return (EReference)operationalAnalysisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis_ContainedOperationalCapabilityPkg() {
		return (EReference)operationalAnalysisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis_ContainedOperationalActivityPkg() {
		return (EReference)operationalAnalysisEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalAnalysis_AllocatingSystemAnalyses() {
		return (EReference)operationalAnalysisEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalScenario() {
		return operationalScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationalScenario_Context() {
		return (EAttribute)operationalScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationalScenario_Objective() {
		return (EAttribute)operationalScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalActivityPkg() {
		return operationalActivityPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivityPkg_OwnedOperationalActivities() {
		return (EReference)operationalActivityPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivityPkg_OwnedOperationalActivityPkgs() {
		return (EReference)operationalActivityPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalActivity() {
		return operationalActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivity_OwnedOperationalActivityPkgs() {
		return (EReference)operationalActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivity_ActivityAllocations() {
		return (EReference)operationalActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivity_OwnedSwimlanes() {
		return (EReference)operationalActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivity_OwnedProcess() {
		return (EReference)operationalActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivity_AllocatorEntities() {
		return (EReference)operationalActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivity_RealizingSystemFunctions() {
		return (EReference)operationalActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivity_AllocatingRoles() {
		return (EReference)operationalActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivity_ContainedOperationalActivities() {
		return (EReference)operationalActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActivity_ChildrenOperationalActivities() {
		return (EReference)operationalActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalProcess() {
		return operationalProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalProcess_InvolvingOperationalCapabilities() {
		return (EReference)operationalProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwimlane() {
		return swimlaneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwimlane_RepresentedEntity() {
		return (EReference)swimlaneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalCapabilityPkg() {
		return operationalCapabilityPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalCapabilityPkg_OwnedOperationalCapabilities() {
		return (EReference)operationalCapabilityPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalCapabilityPkg_OwnedOperationalCapabilityPkgs() {
		return (EReference)operationalCapabilityPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalCapabilityPkg_OwnedCapabilityConfigurations() {
		return (EReference)operationalCapabilityPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalCapabilityPkg_OwnedConceptCompliances() {
		return (EReference)operationalCapabilityPkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalCapability() {
		return operationalCapabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalCapability_Compliances() {
		return (EReference)operationalCapabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalCapability_Configurations() {
		return (EReference)operationalCapabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalCapability_OwnedEntityOperationalCapabilityInvolvements() {
		return (EReference)operationalCapabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalCapability_RealizingCapabilities() {
		return (EReference)operationalCapabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalCapability_InvolvedEntities() {
		return (EReference)operationalCapabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityAllocation() {
		return activityAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityAllocation_Role() {
		return (EReference)activityAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityAllocation_Activity() {
		return (EReference)activityAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolePkg() {
		return rolePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePkg_OwnedRolePkgs() {
		return (EReference)rolePkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePkg_OwnedRoles() {
		return (EReference)rolePkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_OwnedRoleAssemblyUsages() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_OwnedActivityAllocations() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_RoleAllocations() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_ActivityAllocations() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_AllocatingEntities() {
		return (EReference)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_AllocatedOperationalActivities() {
		return (EReference)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleAssemblyUsage() {
		return roleAssemblyUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleAssemblyUsage_Child() {
		return (EReference)roleAssemblyUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleAllocation() {
		return roleAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleAllocation_Role() {
		return (EReference)roleAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleAllocation_Entity() {
		return (EReference)roleAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityPkg() {
		return entityPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityPkg_OwnedEntityPkgs() {
		return (EReference)entityPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityPkg_OwnedEntities() {
		return (EReference)entityPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityPkg_OwnedLocations() {
		return (EReference)entityPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityPkg_OwnedCommunicationMeans() {
		return (EReference)entityPkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_RoleAllocations() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_OrganisationalUnitMemberships() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_ActualLocation() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_SubEntities() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_OwnedEntities() {
		return (EReference)entityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_OwnedCommunicationMeans() {
		return (EReference)entityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_OwnedRoleAllocations() {
		return (EReference)entityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_AllocatedOperationalActivities() {
		return (EReference)entityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_AllocatedRoles() {
		return (EReference)entityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_RealizingSystems() {
		return (EReference)entityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_RealizingActors() {
		return (EReference)entityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_InvolvingOperationalCapabilities() {
		return (EReference)entityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptPkg() {
		return conceptPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptPkg_OwnedConceptPkgs() {
		return (EReference)conceptPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptPkg_OwnedConcepts() {
		return (EReference)conceptPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Compliances() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_CompositeLinks() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptCompliance() {
		return conceptComplianceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptCompliance_ComplyWithConcept() {
		return (EReference)conceptComplianceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptCompliance_CompliantCapability() {
		return (EReference)conceptComplianceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemInConcept() {
		return itemInConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemInConcept_Concept() {
		return (EReference)itemInConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemInConcept_Item() {
		return (EReference)itemInConceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConceptItem() {
		return abstractConceptItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractConceptItem_ComposingLinks() {
		return (EReference)abstractConceptItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalActor() {
		return operationalActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationalActor_RealizingSystemActors() {
		return (EReference)operationalActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunityOfInterest() {
		return communityOfInterestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunityOfInterest_CommunityOfInterestCompositions() {
		return (EReference)communityOfInterestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunityOfInterestComposition() {
		return communityOfInterestCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunityOfInterestComposition_CommunityOfInterest() {
		return (EReference)communityOfInterestCompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunityOfInterestComposition_InterestedOrganisationUnit() {
		return (EReference)communityOfInterestCompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationalUnit() {
		return organisationalUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationalUnit_OrganisationalUnitCompositions() {
		return (EReference)organisationalUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationalUnit_CommunityOfInterestMemberships() {
		return (EReference)organisationalUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisationalUnitComposition() {
		return organisationalUnitCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationalUnitComposition_OrganisationalUnit() {
		return (EReference)organisationalUnitCompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisationalUnitComposition_ParticipatingEntity() {
		return (EReference)organisationalUnitCompositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_LocationDescription() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_LocatedEntities() {
		return (EReference)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityConfiguration() {
		return capabilityConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityConfiguration_ConfiguredCapability() {
		return (EReference)capabilityConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationMean() {
		return communicationMeanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMean_SourceEntity() {
		return (EReference)communicationMeanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationMean_TargetEntity() {
		return (EReference)communicationMeanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityOperationalCapabilityInvolvement() {
		return entityOperationalCapabilityInvolvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOperationalCapabilityInvolvement_Entity() {
		return (EReference)entityOperationalCapabilityInvolvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityOperationalCapabilityInvolvement_Capability() {
		return (EReference)entityOperationalCapabilityInvolvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalContext() {
		return operationalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaFactory getOaFactory() {
		return (OaFactory)getEFactoryInstance();
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
		operationalAnalysisEClass = createEClass(OPERATIONAL_ANALYSIS);
		createEReference(operationalAnalysisEClass, OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT);
		createEReference(operationalAnalysisEClass, OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG);
		createEReference(operationalAnalysisEClass, OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG);
		createEReference(operationalAnalysisEClass, OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG);
		createEReference(operationalAnalysisEClass, OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG);
		createEReference(operationalAnalysisEClass, OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG);
		createEReference(operationalAnalysisEClass, OPERATIONAL_ANALYSIS__ALLOCATING_SYSTEM_ANALYSES);

		operationalScenarioEClass = createEClass(OPERATIONAL_SCENARIO);
		createEAttribute(operationalScenarioEClass, OPERATIONAL_SCENARIO__CONTEXT);
		createEAttribute(operationalScenarioEClass, OPERATIONAL_SCENARIO__OBJECTIVE);

		operationalActivityPkgEClass = createEClass(OPERATIONAL_ACTIVITY_PKG);
		createEReference(operationalActivityPkgEClass, OPERATIONAL_ACTIVITY_PKG__OWNED_OPERATIONAL_ACTIVITIES);
		createEReference(operationalActivityPkgEClass, OPERATIONAL_ACTIVITY_PKG__OWNED_OPERATIONAL_ACTIVITY_PKGS);

		operationalActivityEClass = createEClass(OPERATIONAL_ACTIVITY);
		createEReference(operationalActivityEClass, OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS);
		createEReference(operationalActivityEClass, OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS);
		createEReference(operationalActivityEClass, OPERATIONAL_ACTIVITY__OWNED_SWIMLANES);
		createEReference(operationalActivityEClass, OPERATIONAL_ACTIVITY__OWNED_PROCESS);
		createEReference(operationalActivityEClass, OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES);
		createEReference(operationalActivityEClass, OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS);
		createEReference(operationalActivityEClass, OPERATIONAL_ACTIVITY__ALLOCATING_ROLES);
		createEReference(operationalActivityEClass, OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES);
		createEReference(operationalActivityEClass, OPERATIONAL_ACTIVITY__CHILDREN_OPERATIONAL_ACTIVITIES);

		operationalProcessEClass = createEClass(OPERATIONAL_PROCESS);
		createEReference(operationalProcessEClass, OPERATIONAL_PROCESS__INVOLVING_OPERATIONAL_CAPABILITIES);

		swimlaneEClass = createEClass(SWIMLANE);
		createEReference(swimlaneEClass, SWIMLANE__REPRESENTED_ENTITY);

		operationalCapabilityPkgEClass = createEClass(OPERATIONAL_CAPABILITY_PKG);
		createEReference(operationalCapabilityPkgEClass, OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES);
		createEReference(operationalCapabilityPkgEClass, OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS);
		createEReference(operationalCapabilityPkgEClass, OPERATIONAL_CAPABILITY_PKG__OWNED_CAPABILITY_CONFIGURATIONS);
		createEReference(operationalCapabilityPkgEClass, OPERATIONAL_CAPABILITY_PKG__OWNED_CONCEPT_COMPLIANCES);

		operationalCapabilityEClass = createEClass(OPERATIONAL_CAPABILITY);
		createEReference(operationalCapabilityEClass, OPERATIONAL_CAPABILITY__COMPLIANCES);
		createEReference(operationalCapabilityEClass, OPERATIONAL_CAPABILITY__CONFIGURATIONS);
		createEReference(operationalCapabilityEClass, OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS);
		createEReference(operationalCapabilityEClass, OPERATIONAL_CAPABILITY__REALIZING_CAPABILITIES);
		createEReference(operationalCapabilityEClass, OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES);

		activityAllocationEClass = createEClass(ACTIVITY_ALLOCATION);
		createEReference(activityAllocationEClass, ACTIVITY_ALLOCATION__ROLE);
		createEReference(activityAllocationEClass, ACTIVITY_ALLOCATION__ACTIVITY);

		rolePkgEClass = createEClass(ROLE_PKG);
		createEReference(rolePkgEClass, ROLE_PKG__OWNED_ROLE_PKGS);
		createEReference(rolePkgEClass, ROLE_PKG__OWNED_ROLES);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__OWNED_ROLE_ASSEMBLY_USAGES);
		createEReference(roleEClass, ROLE__OWNED_ACTIVITY_ALLOCATIONS);
		createEReference(roleEClass, ROLE__ROLE_ALLOCATIONS);
		createEReference(roleEClass, ROLE__ACTIVITY_ALLOCATIONS);
		createEReference(roleEClass, ROLE__ALLOCATING_ENTITIES);
		createEReference(roleEClass, ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES);

		roleAssemblyUsageEClass = createEClass(ROLE_ASSEMBLY_USAGE);
		createEReference(roleAssemblyUsageEClass, ROLE_ASSEMBLY_USAGE__CHILD);

		roleAllocationEClass = createEClass(ROLE_ALLOCATION);
		createEReference(roleAllocationEClass, ROLE_ALLOCATION__ROLE);
		createEReference(roleAllocationEClass, ROLE_ALLOCATION__ENTITY);

		entityPkgEClass = createEClass(ENTITY_PKG);
		createEReference(entityPkgEClass, ENTITY_PKG__OWNED_ENTITY_PKGS);
		createEReference(entityPkgEClass, ENTITY_PKG__OWNED_ENTITIES);
		createEReference(entityPkgEClass, ENTITY_PKG__OWNED_LOCATIONS);
		createEReference(entityPkgEClass, ENTITY_PKG__OWNED_COMMUNICATION_MEANS);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ROLE_ALLOCATIONS);
		createEReference(entityEClass, ENTITY__ORGANISATIONAL_UNIT_MEMBERSHIPS);
		createEReference(entityEClass, ENTITY__ACTUAL_LOCATION);
		createEReference(entityEClass, ENTITY__SUB_ENTITIES);
		createEReference(entityEClass, ENTITY__OWNED_ENTITIES);
		createEReference(entityEClass, ENTITY__OWNED_COMMUNICATION_MEANS);
		createEReference(entityEClass, ENTITY__OWNED_ROLE_ALLOCATIONS);
		createEReference(entityEClass, ENTITY__ALLOCATED_OPERATIONAL_ACTIVITIES);
		createEReference(entityEClass, ENTITY__ALLOCATED_ROLES);
		createEReference(entityEClass, ENTITY__REALIZING_SYSTEMS);
		createEReference(entityEClass, ENTITY__REALIZING_ACTORS);
		createEReference(entityEClass, ENTITY__INVOLVING_OPERATIONAL_CAPABILITIES);

		conceptPkgEClass = createEClass(CONCEPT_PKG);
		createEReference(conceptPkgEClass, CONCEPT_PKG__OWNED_CONCEPT_PKGS);
		createEReference(conceptPkgEClass, CONCEPT_PKG__OWNED_CONCEPTS);

		conceptEClass = createEClass(CONCEPT);
		createEReference(conceptEClass, CONCEPT__COMPLIANCES);
		createEReference(conceptEClass, CONCEPT__COMPOSITE_LINKS);

		conceptComplianceEClass = createEClass(CONCEPT_COMPLIANCE);
		createEReference(conceptComplianceEClass, CONCEPT_COMPLIANCE__COMPLY_WITH_CONCEPT);
		createEReference(conceptComplianceEClass, CONCEPT_COMPLIANCE__COMPLIANT_CAPABILITY);

		itemInConceptEClass = createEClass(ITEM_IN_CONCEPT);
		createEReference(itemInConceptEClass, ITEM_IN_CONCEPT__CONCEPT);
		createEReference(itemInConceptEClass, ITEM_IN_CONCEPT__ITEM);

		abstractConceptItemEClass = createEClass(ABSTRACT_CONCEPT_ITEM);
		createEReference(abstractConceptItemEClass, ABSTRACT_CONCEPT_ITEM__COMPOSING_LINKS);

		operationalActorEClass = createEClass(OPERATIONAL_ACTOR);
		createEReference(operationalActorEClass, OPERATIONAL_ACTOR__REALIZING_SYSTEM_ACTORS);

		communityOfInterestEClass = createEClass(COMMUNITY_OF_INTEREST);
		createEReference(communityOfInterestEClass, COMMUNITY_OF_INTEREST__COMMUNITY_OF_INTEREST_COMPOSITIONS);

		communityOfInterestCompositionEClass = createEClass(COMMUNITY_OF_INTEREST_COMPOSITION);
		createEReference(communityOfInterestCompositionEClass, COMMUNITY_OF_INTEREST_COMPOSITION__COMMUNITY_OF_INTEREST);
		createEReference(communityOfInterestCompositionEClass, COMMUNITY_OF_INTEREST_COMPOSITION__INTERESTED_ORGANISATION_UNIT);

		organisationalUnitEClass = createEClass(ORGANISATIONAL_UNIT);
		createEReference(organisationalUnitEClass, ORGANISATIONAL_UNIT__ORGANISATIONAL_UNIT_COMPOSITIONS);
		createEReference(organisationalUnitEClass, ORGANISATIONAL_UNIT__COMMUNITY_OF_INTEREST_MEMBERSHIPS);

		organisationalUnitCompositionEClass = createEClass(ORGANISATIONAL_UNIT_COMPOSITION);
		createEReference(organisationalUnitCompositionEClass, ORGANISATIONAL_UNIT_COMPOSITION__ORGANISATIONAL_UNIT);
		createEReference(organisationalUnitCompositionEClass, ORGANISATIONAL_UNIT_COMPOSITION__PARTICIPATING_ENTITY);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__LOCATION_DESCRIPTION);
		createEReference(locationEClass, LOCATION__LOCATED_ENTITIES);

		capabilityConfigurationEClass = createEClass(CAPABILITY_CONFIGURATION);
		createEReference(capabilityConfigurationEClass, CAPABILITY_CONFIGURATION__CONFIGURED_CAPABILITY);

		communicationMeanEClass = createEClass(COMMUNICATION_MEAN);
		createEReference(communicationMeanEClass, COMMUNICATION_MEAN__SOURCE_ENTITY);
		createEReference(communicationMeanEClass, COMMUNICATION_MEAN__TARGET_ENTITY);

		entityOperationalCapabilityInvolvementEClass = createEClass(ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENT);
		createEReference(entityOperationalCapabilityInvolvementEClass, ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENT__ENTITY);
		createEReference(entityOperationalCapabilityInvolvementEClass, ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENT__CAPABILITY);

		operationalContextEClass = createEClass(OPERATIONAL_CONTEXT);
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
		CtxPackage theCtxPackage = (CtxPackage)EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI);
		CapellacorePackage theCapellacorePackage = (CapellacorePackage)EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI);
		FaPackage theFaPackage = (FaPackage)EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);
		ActivityPackage theActivityPackage = (ActivityPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI);
		CapellacommonPackage theCapellacommonPackage = (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);
		InteractionPackage theInteractionPackage = (InteractionPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationalAnalysisEClass.getESuperTypes().add(theCsPackage.getBlockArchitecture());
		operationalScenarioEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		operationalActivityPkgEClass.getESuperTypes().add(theFaPackage.getFunctionPkg());
		operationalActivityEClass.getESuperTypes().add(theFaPackage.getAbstractFunction());
		operationalProcessEClass.getESuperTypes().add(theFaPackage.getFunctionalChain());
		swimlaneEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		swimlaneEClass.getESuperTypes().add(theActivityPackage.getActivityPartition());
		operationalCapabilityPkgEClass.getESuperTypes().add(theCapellacommonPackage.getAbstractCapabilityPkg());
		operationalCapabilityEClass.getESuperTypes().add(theInteractionPackage.getAbstractCapability());
		operationalCapabilityEClass.getESuperTypes().add(theCapellacorePackage.getNamespace());
		activityAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		rolePkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		roleEClass.getESuperTypes().add(theInformationPackage.getAbstractInstance());
		roleAssemblyUsageEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		roleAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		entityPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		entityPkgEClass.getESuperTypes().add(theFaPackage.getAbstractFunctionalStructure());
		entityEClass.getESuperTypes().add(this.getAbstractConceptItem());
		entityEClass.getESuperTypes().add(theModellingcorePackage.getInformationsExchanger());
		entityEClass.getESuperTypes().add(theCapellacorePackage.getInvolvedElement());
		conceptPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		conceptEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		conceptComplianceEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		itemInConceptEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		abstractConceptItemEClass.getESuperTypes().add(theCsPackage.getComponent());
		operationalActorEClass.getESuperTypes().add(this.getEntity());
		communityOfInterestEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		communityOfInterestCompositionEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		organisationalUnitEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		organisationalUnitCompositionEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		locationEClass.getESuperTypes().add(this.getAbstractConceptItem());
		capabilityConfigurationEClass.getESuperTypes().add(this.getAbstractConceptItem());
		communicationMeanEClass.getESuperTypes().add(theCapellacorePackage.getNamedRelationship());
		communicationMeanEClass.getESuperTypes().add(theFaPackage.getComponentExchange());
		entityOperationalCapabilityInvolvementEClass.getESuperTypes().add(theCapellacorePackage.getInvolvement());
		operationalContextEClass.getESuperTypes().add(theCsPackage.getComponentContext());

		// Initialize classes and features; add operations and parameters
		initEClass(operationalAnalysisEClass, OperationalAnalysis.class, "OperationalAnalysis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalAnalysis_OwnedOperationalContext(), this.getOperationalContext(), null, "ownedOperationalContext", null, 0, 1, OperationalAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis_OwnedRolePkg(), this.getRolePkg(), null, "ownedRolePkg", null, 0, 1, OperationalAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis_OwnedEntityPkg(), this.getEntityPkg(), null, "ownedEntityPkg", null, 0, 1, OperationalAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis_OwnedConceptPkg(), this.getConceptPkg(), null, "ownedConceptPkg", null, 0, 1, OperationalAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis_ContainedOperationalCapabilityPkg(), this.getOperationalCapabilityPkg(), null, "containedOperationalCapabilityPkg", null, 0, 1, OperationalAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis_ContainedOperationalActivityPkg(), this.getOperationalActivityPkg(), null, "containedOperationalActivityPkg", null, 0, 1, OperationalAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalAnalysis_AllocatingSystemAnalyses(), theCtxPackage.getSystemAnalysis(), theCtxPackage.getSystemAnalysis_AllocatedOperationalAnalyses(), "allocatingSystemAnalyses", null, 0, -1, OperationalAnalysis.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operationalScenarioEClass, OperationalScenario.class, "OperationalScenario", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationalScenario_Context(), ecorePackage.getEString(), "context", null, 1, 1, OperationalScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationalScenario_Objective(), ecorePackage.getEString(), "objective", null, 1, 1, OperationalScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalActivityPkgEClass, OperationalActivityPkg.class, "OperationalActivityPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalActivityPkg_OwnedOperationalActivities(), this.getOperationalActivity(), null, "ownedOperationalActivities", null, 0, -1, OperationalActivityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalActivityPkg_OwnedOperationalActivityPkgs(), this.getOperationalActivityPkg(), null, "ownedOperationalActivityPkgs", null, 0, -1, OperationalActivityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalActivityEClass, OperationalActivity.class, "OperationalActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalActivity_OwnedOperationalActivityPkgs(), this.getOperationalActivityPkg(), null, "ownedOperationalActivityPkgs", null, 0, -1, OperationalActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalActivity_ActivityAllocations(), this.getActivityAllocation(), this.getActivityAllocation_Activity(), "activityAllocations", null, 0, -1, OperationalActivity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalActivity_OwnedSwimlanes(), this.getSwimlane(), null, "ownedSwimlanes", null, 0, -1, OperationalActivity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalActivity_OwnedProcess(), this.getOperationalProcess(), null, "ownedProcess", null, 0, -1, OperationalActivity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalActivity_AllocatorEntities(), this.getEntity(), this.getEntity_AllocatedOperationalActivities(), "allocatorEntities", null, 0, -1, OperationalActivity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalActivity_RealizingSystemFunctions(), theCtxPackage.getSystemFunction(), theCtxPackage.getSystemFunction_RealizedOperationalActivities(), "realizingSystemFunctions", null, 0, -1, OperationalActivity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalActivity_AllocatingRoles(), this.getRole(), null, "allocatingRoles", null, 0, -1, OperationalActivity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalActivity_ContainedOperationalActivities(), this.getOperationalActivity(), null, "containedOperationalActivities", null, 0, -1, OperationalActivity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalActivity_ChildrenOperationalActivities(), this.getOperationalActivity(), null, "childrenOperationalActivities", null, 0, -1, OperationalActivity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operationalProcessEClass, OperationalProcess.class, "OperationalProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalProcess_InvolvingOperationalCapabilities(), this.getOperationalCapability(), null, "involvingOperationalCapabilities", null, 0, -1, OperationalProcess.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(swimlaneEClass, Swimlane.class, "Swimlane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwimlane_RepresentedEntity(), this.getEntity(), null, "representedEntity", null, 0, 1, Swimlane.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operationalCapabilityPkgEClass, OperationalCapabilityPkg.class, "OperationalCapabilityPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalCapabilityPkg_OwnedOperationalCapabilities(), this.getOperationalCapability(), null, "ownedOperationalCapabilities", null, 0, -1, OperationalCapabilityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalCapabilityPkg_OwnedOperationalCapabilityPkgs(), this.getOperationalCapabilityPkg(), null, "ownedOperationalCapabilityPkgs", null, 0, -1, OperationalCapabilityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalCapabilityPkg_OwnedCapabilityConfigurations(), this.getCapabilityConfiguration(), null, "ownedCapabilityConfigurations", null, 0, -1, OperationalCapabilityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalCapabilityPkg_OwnedConceptCompliances(), this.getConceptCompliance(), null, "ownedConceptCompliances", null, 0, -1, OperationalCapabilityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalCapabilityEClass, OperationalCapability.class, "OperationalCapability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalCapability_Compliances(), this.getConceptCompliance(), null, "compliances", null, 0, -1, OperationalCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalCapability_Configurations(), this.getCapabilityConfiguration(), null, "configurations", null, 0, -1, OperationalCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalCapability_OwnedEntityOperationalCapabilityInvolvements(), this.getEntityOperationalCapabilityInvolvement(), null, "ownedEntityOperationalCapabilityInvolvements", null, 0, -1, OperationalCapability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalCapability_RealizingCapabilities(), theCtxPackage.getCapability(), theCtxPackage.getCapability_RealizedOperationalCapabilities(), "realizingCapabilities", null, 0, -1, OperationalCapability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationalCapability_InvolvedEntities(), this.getEntity(), null, "involvedEntities", null, 0, -1, OperationalCapability.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(activityAllocationEClass, ActivityAllocation.class, "ActivityAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityAllocation_Role(), this.getRole(), this.getRole_ActivityAllocations(), "role", null, 1, 1, ActivityAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityAllocation_Activity(), this.getOperationalActivity(), this.getOperationalActivity_ActivityAllocations(), "activity", null, 1, 1, ActivityAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rolePkgEClass, RolePkg.class, "RolePkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRolePkg_OwnedRolePkgs(), this.getRolePkg(), null, "ownedRolePkgs", null, 0, -1, RolePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRolePkg_OwnedRoles(), this.getRole(), null, "ownedRoles", null, 0, -1, RolePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_OwnedRoleAssemblyUsages(), this.getRoleAssemblyUsage(), null, "ownedRoleAssemblyUsages", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_OwnedActivityAllocations(), this.getActivityAllocation(), null, "ownedActivityAllocations", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_RoleAllocations(), this.getRoleAllocation(), this.getRoleAllocation_Role(), "roleAllocations", null, 0, -1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRole_ActivityAllocations(), this.getActivityAllocation(), this.getActivityAllocation_Role(), "activityAllocations", null, 0, -1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRole_AllocatingEntities(), this.getEntity(), null, "allocatingEntities", null, 0, -1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRole_AllocatedOperationalActivities(), this.getOperationalActivity(), null, "allocatedOperationalActivities", null, 0, -1, Role.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roleAssemblyUsageEClass, RoleAssemblyUsage.class, "RoleAssemblyUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleAssemblyUsage_Child(), this.getRole(), null, "child", null, 0, 1, RoleAssemblyUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleAllocationEClass, RoleAllocation.class, "RoleAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleAllocation_Role(), this.getRole(), this.getRole_RoleAllocations(), "role", null, 1, 1, RoleAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRoleAllocation_Entity(), this.getEntity(), this.getEntity_RoleAllocations(), "entity", null, 1, 1, RoleAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(entityPkgEClass, EntityPkg.class, "EntityPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityPkg_OwnedEntityPkgs(), this.getEntityPkg(), null, "ownedEntityPkgs", null, 0, -1, EntityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityPkg_OwnedEntities(), this.getEntity(), null, "ownedEntities", null, 0, -1, EntityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityPkg_OwnedLocations(), this.getLocation(), null, "ownedLocations", null, 0, -1, EntityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityPkg_OwnedCommunicationMeans(), this.getCommunicationMean(), null, "ownedCommunicationMeans", null, 0, -1, EntityPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_RoleAllocations(), this.getRoleAllocation(), this.getRoleAllocation_Entity(), "roleAllocations", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_OrganisationalUnitMemberships(), this.getOrganisationalUnitComposition(), null, "organisationalUnitMemberships", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_ActualLocation(), this.getLocation(), null, "actualLocation", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_SubEntities(), this.getEntity(), null, "subEntities", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_OwnedEntities(), this.getEntity(), null, "ownedEntities", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_OwnedCommunicationMeans(), this.getCommunicationMean(), null, "ownedCommunicationMeans", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_OwnedRoleAllocations(), this.getRoleAllocation(), null, "ownedRoleAllocations", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_AllocatedOperationalActivities(), this.getOperationalActivity(), this.getOperationalActivity_AllocatorEntities(), "allocatedOperationalActivities", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_AllocatedRoles(), this.getRole(), null, "allocatedRoles", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_RealizingSystems(), theCtxPackage.getSystem(), null, "realizingSystems", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_RealizingActors(), theCtxPackage.getActor(), theCtxPackage.getActor_RealizedEntities(), "realizingActors", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_InvolvingOperationalCapabilities(), this.getOperationalCapability(), null, "involvingOperationalCapabilities", null, 0, -1, Entity.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(conceptPkgEClass, ConceptPkg.class, "ConceptPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptPkg_OwnedConceptPkgs(), this.getConceptPkg(), null, "ownedConceptPkgs", null, 0, -1, ConceptPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptPkg_OwnedConcepts(), this.getConcept(), null, "ownedConcepts", null, 0, -1, ConceptPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcept_Compliances(), this.getConceptCompliance(), null, "compliances", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcept_CompositeLinks(), this.getItemInConcept(), null, "compositeLinks", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptComplianceEClass, ConceptCompliance.class, "ConceptCompliance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConceptCompliance_ComplyWithConcept(), this.getConcept(), null, "complyWithConcept", null, 1, 1, ConceptCompliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConceptCompliance_CompliantCapability(), this.getOperationalCapability(), null, "compliantCapability", null, 1, 1, ConceptCompliance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemInConceptEClass, ItemInConcept.class, "ItemInConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemInConcept_Concept(), this.getConcept(), null, "concept", null, 1, 1, ItemInConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemInConcept_Item(), this.getAbstractConceptItem(), null, "item", null, 1, 1, ItemInConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConceptItemEClass, AbstractConceptItem.class, "AbstractConceptItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConceptItem_ComposingLinks(), this.getItemInConcept(), null, "composingLinks", null, 0, -1, AbstractConceptItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalActorEClass, OperationalActor.class, "OperationalActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationalActor_RealizingSystemActors(), theCtxPackage.getActor(), theCtxPackage.getActor_RealizedOperationalActors(), "realizingSystemActors", null, 0, -1, OperationalActor.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(communityOfInterestEClass, CommunityOfInterest.class, "CommunityOfInterest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunityOfInterest_CommunityOfInterestCompositions(), this.getCommunityOfInterestComposition(), null, "communityOfInterestCompositions", null, 0, -1, CommunityOfInterest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communityOfInterestCompositionEClass, CommunityOfInterestComposition.class, "CommunityOfInterestComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunityOfInterestComposition_CommunityOfInterest(), this.getCommunityOfInterest(), null, "communityOfInterest", null, 0, 1, CommunityOfInterestComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunityOfInterestComposition_InterestedOrganisationUnit(), this.getOrganisationalUnit(), null, "interestedOrganisationUnit", null, 0, 1, CommunityOfInterestComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationalUnitEClass, OrganisationalUnit.class, "OrganisationalUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganisationalUnit_OrganisationalUnitCompositions(), this.getOrganisationalUnitComposition(), null, "organisationalUnitCompositions", null, 0, -1, OrganisationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisationalUnit_CommunityOfInterestMemberships(), this.getCommunityOfInterestComposition(), null, "communityOfInterestMemberships", null, 0, -1, OrganisationalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationalUnitCompositionEClass, OrganisationalUnitComposition.class, "OrganisationalUnitComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganisationalUnitComposition_OrganisationalUnit(), this.getOrganisationalUnit(), null, "organisationalUnit", null, 0, 1, OrganisationalUnitComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisationalUnitComposition_ParticipatingEntity(), this.getEntity(), null, "participatingEntity", null, 0, 1, OrganisationalUnitComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_LocationDescription(), ecorePackage.getEString(), "locationDescription", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_LocatedEntities(), this.getEntity(), null, "locatedEntities", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityConfigurationEClass, CapabilityConfiguration.class, "CapabilityConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityConfiguration_ConfiguredCapability(), this.getOperationalCapability(), null, "configuredCapability", null, 0, 1, CapabilityConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationMeanEClass, CommunicationMean.class, "CommunicationMean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationMean_SourceEntity(), this.getEntity(), null, "sourceEntity", null, 0, 1, CommunicationMean.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationMean_TargetEntity(), this.getEntity(), null, "targetEntity", null, 0, 1, CommunicationMean.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(entityOperationalCapabilityInvolvementEClass, EntityOperationalCapabilityInvolvement.class, "EntityOperationalCapabilityInvolvement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityOperationalCapabilityInvolvement_Entity(), this.getEntity(), null, "entity", null, 1, 1, EntityOperationalCapabilityInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEntityOperationalCapabilityInvolvement_Capability(), this.getOperationalCapability(), null, "capability", null, 1, 1, EntityOperationalCapabilityInvolvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operationalContextEClass, OperationalContext.class, "OperationalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			 "description", "OperationalAnalysis aims at defining the system\'s ecosystem operational analysis modelling language (close to the OVs from NAF/MoDAF).\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "operational",
			 "usage examples", "none",
			 "constraints", "This package depends on the model CompositeStructure.ecore\r\nThis package depends on the model Interaction.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (operationalAnalysisEClass, 
		   source, 
		   new String[] {
			 "description", "Model describing operational need - organisations, actors, operational activities & related items - associated to (created during) a modelling phase",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedOperationalContext(), 
		   source, 
		   new String[] {
			 "description", "the \"context\" for this architecture, e.g. the parts that make the environnement of the entities (actors, ...) , plus the entities itself",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedRolePkg(), 
		   source, 
		   new String[] {
			 "description", "container for Role definitions of this operational analysis\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedEntityPkg(), 
		   source, 
		   new String[] {
			 "description", "container for the Entities defined for this operational analysis\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedConceptPkg(), 
		   source, 
		   new String[] {
			 "description", "container for the Concepts defined in this operational analysis\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (operationalScenarioEClass, 
		   source, 
		   new String[] {
			 "description", "Definition of a dynamic behaviour composed of the following information:\r\nContext, objective, pre-conditions, post-conditions, used capabilities, involved roles & actors, operational exchanges & interactions, processes and activities. Ability to be validated. Temporal & performance description.Criticity.\r\nScenarios can be gathered in a set of Use Cases.",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOperationalScenario_Context(), 
		   source, 
		   new String[] {
			 "description", "description of the context in which this operational scenario takes place\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalScenario_Objective(), 
		   source, 
		   new String[] {
			 "description", "description of the objective/output of this operational scenario\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (operationalActivityPkgEClass, 
		   source, 
		   new String[] {
			 "description", "container for operational activity elements\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOperationalActivityPkg_OwnedOperationalActivities(), 
		   source, 
		   new String[] {
			 "description", "the operational activities contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalActivityPkg_OwnedOperationalActivityPkgs(), 
		   source, 
		   new String[] {
			 "description", "sub-packages of operational activities, contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (operationalActivityEClass, 
		   source, 
		   new String[] {
			 "description", "Any process step or function performed, both mental and physical, toward achieving some objective. A task is a \"formal\" activity (see also task).\r\n[source: Sys EM, EIA/IS-731.1]",
			 "usage guideline", "In the first steps of the operational analysis, all activities related to the targeted domain should be identified, regardless of their future allocation to the targeted system or not (e.g. even activities of actors external to the future system being design, should be identified and modelled)\r\n",
			 "arcadia_description", "An operational Activity is a process step or function performed toward achieving some objective, by actors that could necessitate to use the system for this. Example: listen to radio, select a radio station...",
			 "used in levels", "operational",
			 "usage examples", "../img/usage_examples/example_operational_activities.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_OwnedOperationalActivityPkgs(), 
		   source, 
		   new String[] {
			 "description", "sub-packages of operational activities, contained in this operational activity",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_ActivityAllocations(), 
		   source, 
		   new String[] {
			 "description", "allocation of this operational activity to a given operational role\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_OwnedSwimlanes(), 
		   source, 
		   new String[] {
			 "description", "list of swimlanes used to partition this operational activity\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella"
		   });	
		addAnnotation
		  (getOperationalActivity_OwnedProcess(), 
		   source, 
		   new String[] {
			 "description", "list of Processes associated to this Operational Activity\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3"
		   });	
		addAnnotation
		  (getOperationalActivity_ChildrenOperationalActivities(), 
		   source, 
		   new String[] {
			 "description", "list of children operational activities\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (operationalProcessEClass, 
		   source, 
		   new String[] {
			 "description", "An Operational Process is a logical organization of activities to fulfill an operational capability.",
			 "usage guideline", "defining an Operational Process is similar to defining a functional chain at System Analysis level : it is composed of an ordered set of operational activities.\r\n[source: Capella study]",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOperationalProcess_InvolvingOperationalCapabilities(), 
		   source, 
		   new String[] {
			 "description", "",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (swimlaneEClass, 
		   source, 
		   new String[] {
			 "description", "a partition/subset of an activity\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSwimlane_RepresentedEntity(), 
		   source, 
		   new String[] {
			 "description", "the entity to which that elements in this swimlane are being allocated\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (operationalCapabilityPkgEClass, 
		   source, 
		   new String[] {
			 "description", "container for operational capabilities\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedOperationalCapabilities(), 
		   source, 
		   new String[] {
			 "description", "operational capabilities contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedOperationalCapabilityPkgs(), 
		   source, 
		   new String[] {
			 "description", "sub-packages of operational capabilities contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedCapabilityConfigurations(), 
		   source, 
		   new String[] {
			 "description", "Capability Configurations contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3"
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedConceptCompliances(), 
		   source, 
		   new String[] {
			 "description", "ConceptCompliance elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella"
		   });	
		addAnnotation
		  (operationalCapabilityEClass, 
		   source, 
		   new String[] {
			 "description", "Ability of an organisation, system or process to to provide a service that supports the achievement of high-level operational goals\r\n\r\nAt the organisation level: Ability of an organisation, system or process to realise a product that will fulfill the requirements for that product.\r\n[source: ISO 9000]\r\n\r\nAt the program level: An operational outcome or effect that users of equipment need to achieve. \r\n[source: Smart Procurement - Edition 3 - June 2000]\r\n\r\nAt the system level: Set of functions that characterise an Operational service provided by a system, it is required against one or several requirements: functional and not functional (performance, constraint, ...).\r\n[source: MIST]\r\n",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOperationalCapability_Compliances(), 
		   source, 
		   new String[] {
			 "description", "the list of concepts to which this Capability complies\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationalCapability_Configurations(), 
		   source, 
		   new String[] {
			 "description", "the list of various configurations of this Capability\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (activityAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "allocation relationship between an operational role and an operational activity\r\n[source: Capella study]",
			 "usage guideline", "In Capella, these allocations are created using the \"Operational Role Blank\" diagram",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getActivityAllocation_Role(), 
		   source, 
		   new String[] {
			 "description", "Operational role involved in this allocation relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getActivityAllocation_Activity(), 
		   source, 
		   new String[] {
			 "description", "Operational activity involved in this allocation relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (rolePkgEClass, 
		   source, 
		   new String[] {
			 "description", "container for operational roles\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getRolePkg_OwnedRolePkgs(), 
		   source, 
		   new String[] {
			 "description", "sub-(role)packages contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRolePkg_OwnedRoles(), 
		   source, 
		   new String[] {
			 "description", "the Role elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "description", "Role is a set of activities allocated to an actor or a system against another actor or system.",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getRole_OwnedRoleAssemblyUsages(), 
		   source, 
		   new String[] {
			 "description", "list of mediator elements establishing links between this role and parent/children roles\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3"
		   });	
		addAnnotation
		  (getRole_OwnedActivityAllocations(), 
		   source, 
		   new String[] {
			 "description", "list of allocations between roles and operational activities, that are stored/owned by this role\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRole_RoleAllocations(), 
		   source, 
		   new String[] {
			 "description", "list of allocations between this operational role, and operational entities\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRole_ActivityAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of allocations of this role to/from operation activities\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (roleAssemblyUsageEClass, 
		   source, 
		   new String[] {
			 "description", "mediator class supporting the relationship between two roles having a hierarchical dependence\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getRoleAssemblyUsage_Child(), 
		   source, 
		   new String[] {
			 "description", "child Role involved in this relationship mediator element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (roleAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "Allocation link between an operational role and an operational entity\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getRoleAllocation_Role(), 
		   source, 
		   new String[] {
			 "description", "the operational role involved in this allocation link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRoleAllocation_Entity(), 
		   source, 
		   new String[] {
			 "description", "the operational entity involved in this allocation link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (entityPkgEClass, 
		   source, 
		   new String[] {
			 "description", "Container for operational entities\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getEntityPkg_OwnedEntityPkgs(), 
		   source, 
		   new String[] {
			 "description", "sub-(Entity)packages contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEntityPkg_OwnedEntities(), 
		   source, 
		   new String[] {
			 "description", "the Entity elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEntityPkg_OwnedLocations(), 
		   source, 
		   new String[] {
			 "description", "the Location elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEntityPkg_OwnedCommunicationMeans(), 
		   source, 
		   new String[] {
			 "description", "the CommunicationMean elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "description", "An Operational Entity is a thing or entity that occurs in the real world of which information is required about fact that need to be known.\r\nAn Operational Entity can be for instance: A operational node, an actor, an equipment...",
			 "usage guideline", "n/a",
			 "arcadia_description", "An Operational Entity is a real world entity (other system, device, group or organisation...), interacting with the system (or software, equipment, hardware...) under study, or with its users.",
			 "used in levels", "operational",
			 "usage examples", "../img/usage_examples/example_operational_entities.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getEntity_RoleAllocations(), 
		   source, 
		   new String[] {
			 "description", "the allocation links between this operational entity and the operational roles\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEntity_OrganisationalUnitMemberships(), 
		   source, 
		   new String[] {
			 "description", "list of organisational units to which this Entity belongs\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEntity_ActualLocation(), 
		   source, 
		   new String[] {
			 "description", "Location where this Entity operates.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEntity_SubEntities(), 
		   source, 
		   new String[] {
			 "description", "sub-entities that have a derivation relationship from this entity\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEntity_OwnedEntities(), 
		   source, 
		   new String[] {
			 "description", "Entities owned by this Entity",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEntity_OwnedCommunicationMeans(), 
		   source, 
		   new String[] {
			 "description", "communication means associated to this Entity\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEntity_OwnedRoleAllocations(), 
		   source, 
		   new String[] {
			 "description", "role allocation links owned by this Entity\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (conceptPkgEClass, 
		   source, 
		   new String[] {
			 "description", "container for operational concepts\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getConceptPkg_OwnedConceptPkgs(), 
		   source, 
		   new String[] {
			 "description", "concept packages contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getConceptPkg_OwnedConcepts(), 
		   source, 
		   new String[] {
			 "description", "Operational concepts contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (conceptEClass, 
		   source, 
		   new String[] {
			 "description", "Describes how a range of (future and where necessary extant) capabilities is used in an operational context to solve a particular problem or achieve an operational goal according to applicable doctrines.",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getConcept_Compliances(), 
		   source, 
		   new String[] {
			 "description", "the list of Compliances that this operational concept follows\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getConcept_CompositeLinks(), 
		   source, 
		   new String[] {
			 "description", "relationships with concept items\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (conceptComplianceEClass, 
		   source, 
		   new String[] {
			 "description", "compliance relationship between an operational capability and an operational concept\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getConceptCompliance_ComplyWithConcept(), 
		   source, 
		   new String[] {
			 "description", "the Concept involved in this compliance relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getConceptCompliance_CompliantCapability(), 
		   source, 
		   new String[] {
			 "description", "the Capability involved in this compliance relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "n/a"
		   });	
		addAnnotation
		  (itemInConceptEClass, 
		   source, 
		   new String[] {
			 "description", "Mediator class for a relationship between an operational concept and a concept item\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getItemInConcept_Concept(), 
		   source, 
		   new String[] {
			 "description", "the operational concept involved in the relationship implemented by this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getItemInConcept_Item(), 
		   source, 
		   new String[] {
			 "description", "the concept item involved in the relationship implemented by this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractConceptItemEClass, 
		   source, 
		   new String[] {
			 "description", "Constitutive element of a Concept.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractConceptItem_ComposingLinks(), 
		   source, 
		   new String[] {
			 "description", "relationships between this item and the concept(s) that it is involved in\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (operationalActorEClass, 
		   source, 
		   new String[] {
			 "description", "A person or organization playing a role within an operational process.",
			 "usage guideline", "n/a",
			 "arcadia_description", "An actor is a [usually human] non-decomposable operational Entity. Example: User of a radio set; radio station...",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (communityOfInterestEClass, 
		   source, 
		   new String[] {
			 "description", "A Community of Interest consists of collaborative groups of stakeholders who must have a shared vocabulary to exchange information in pursuit of their shared goals, interests, missions, or business processes. This group may include end users, actors, program managers, application developers, subject matter experts, Combatant Command, Service and Agency representatives, and IT Portfolio representatives.\r\n\r\nA Community of Interest is a grouping of Actors that use the same information products/elements with the same QoI (e.g. timeliness, security and availability)\r\n[source: NAF]\r\n\r\nA Community of Interest consists of collaborative groups of users who must have a shared vocabulary to exchange information in pursuit of their shared goals, interests, missions, or business processes. This group includes end users, program managers, application developers, subject matter experts, Combatant Command, Service and Agency representatives, and IT Portfolio representatives.\r\n[source: DOD]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCommunityOfInterest_CommunityOfInterestCompositions(), 
		   source, 
		   new String[] {
			 "description", "mediator elements implementing the relationships between this community of interest and the organizational units.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communityOfInterestCompositionEClass, 
		   source, 
		   new String[] {
			 "description", "Relationship between a community of interest and the organisational units\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCommunityOfInterestComposition_CommunityOfInterest(), 
		   source, 
		   new String[] {
			 "description", "The community of interest involved in the relationship implemented by this mediator element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunityOfInterestComposition_InterestedOrganisationUnit(), 
		   source, 
		   new String[] {
			 "description", "The organisational unit involved in the relationship implemented by this mediator element.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (organisationalUnitEClass, 
		   source, 
		   new String[] {
			 "description", "Structured set of operational entities.\r\nDescribes the high-level organizational decomposition of the system/enterprise, into organizational units.",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOrganisationalUnit_OrganisationalUnitCompositions(), 
		   source, 
		   new String[] {
			 "description", "mediator elements implementing the relationships between this organisational unit and the entities that are part of it\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOrganisationalUnit_CommunityOfInterestMemberships(), 
		   source, 
		   new String[] {
			 "description", "the links between this organisational unit and the communities of interest to which it is associated\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (organisationalUnitCompositionEClass, 
		   source, 
		   new String[] {
			 "description", "mediator element to implement the relationship between an organisational unit and the entities it contains\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOrganisationalUnitComposition_OrganisationalUnit(), 
		   source, 
		   new String[] {
			 "description", "the organisational unit involved in the relationship implemented by this mediator element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOrganisationalUnitComposition_ParticipatingEntity(), 
		   source, 
		   new String[] {
			 "description", "the operational entity involved in the relationship implemented by this mediator element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
			 "description", "a physical place where specific entities can be located.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getLocation_LocationDescription(), 
		   source, 
		   new String[] {
			 "description", "a textual description of this location\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getLocation_LocatedEntities(), 
		   source, 
		   new String[] {
			 "description", "the operational entities assigned to this location\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (capabilityConfigurationEClass, 
		   source, 
		   new String[] {
			 "description", "one of the possible configurations of an operational capability\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCapabilityConfiguration_ConfiguredCapability(), 
		   source, 
		   new String[] {
			 "description", "the Capability to which this configuration is associated\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationMeanEClass, 
		   source, 
		   new String[] {
			 "description", "the mean by which two specific operational entities are able to exchange information\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (operationalContextEClass, 
		   source, 
		   new String[] {
			 "description", "the list of Parts that define the Entities and its environment, at this abstraction level.",
			 "usage guideline", "n/a",
			 "used in levels", "operational",
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
		  (operationalAnalysisEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedOperationalContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedRolePkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedEntityPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalAnalysis_ContainedOperationalCapabilityPkg(), 
		   source, 
		   new String[] {
			 "feature", "ownedAbstractCapabilityPkg"
		   });	
		addAnnotation
		  (getOperationalAnalysis_ContainedOperationalActivityPkg(), 
		   source, 
		   new String[] {
			 "feature", "ownedFunctionPkg"
		   });	
		addAnnotation
		  (getOperationalAnalysis_AllocatingSystemAnalyses(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getOperationalScenario_Context(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalScenario_Objective(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (operationalActivityPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivityPkg_OwnedOperationalActivities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivityPkg_OwnedOperationalActivityPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (operationalActivityEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_OwnedOperationalActivityPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_AllocatorEntities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getOperationalActivity_RealizingSystemFunctions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getOperationalActivity_AllocatingRoles(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getOperationalActivity_ContainedOperationalActivities(), 
		   source, 
		   new String[] {
			 "feature", "ownedFunctions"
		   });	
		addAnnotation
		  (getOperationalActivity_ChildrenOperationalActivities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (operationalProcessEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalProcess_InvolvingOperationalCapabilities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (operationalCapabilityPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedOperationalCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedOperationalCapabilityPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (operationalCapabilityEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalCapability_RealizingCapabilities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getOperationalCapability_InvolvedEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (rolePkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRolePkg_OwnedRolePkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRolePkg_OwnedRoles(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRole_AllocatingEntities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getRole_AllocatedOperationalActivities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (entityPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntityPkg_OwnedEntityPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntityPkg_OwnedEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_SubEntities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getEntity_OwnedEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_OwnedCommunicationMeans(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_AllocatedOperationalActivities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_AllocatedRoles(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_RealizingSystems(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getEntity_RealizingActors(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getEntity_InvolvingOperationalCapabilities(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (operationalActorEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActor_RealizingSystemActors(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getLocation_LocationDescription(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (communicationMeanEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationMean_SourceEntity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationMean_TargetEntity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (operationalContextEClass, 
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
		  (operationalAnalysisEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedOperationalContext(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::PackagedElement elements on which OperationalContext stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedRolePkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which RolePkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [1..1]"
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedEntityPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which EntityPkgstereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [1..1]"
		   });	
		addAnnotation
		  (getOperationalAnalysis_OwnedConceptPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which ConceptPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [1..1]"
		   });	
		addAnnotation
		  (getOperationalAnalysis_ContainedOperationalCapabilityPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalAnalysis_ContainedOperationalActivityPkg(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalAnalysis_AllocatingSystemAnalyses(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (operationalScenarioEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::UseCase",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalScenario_Context(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalScenario_Objective(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (operationalActivityPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActivityPkg_OwnedOperationalActivities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which OperationalActivity stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getOperationalActivityPkg_OwnedOperationalActivityPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which OperationalActivityPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (operationalActivityEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Activity",
			 "explanation", "All functions are mapped to (empty) activities",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_OwnedOperationalActivityPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which OperationalActivityPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getOperationalActivity_ActivityAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_OwnedSwimlanes(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_OwnedProcess(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_AllocatorEntities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_RealizingSystemFunctions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_AllocatingRoles(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_ContainedOperationalActivities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActivity_ChildrenOperationalActivities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (operationalProcessEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Activity",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalProcess_InvolvingOperationalCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (swimlaneEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::ActivityPartition",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSwimlane_RepresentedEntity(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (operationalCapabilityPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedOperationalCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which OperationalCapability stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedOperationalCapabilityPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which OperationalCapabilityPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedCapabilityConfigurations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which CapabilityConfiguration stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getOperationalCapabilityPkg_OwnedConceptCompliances(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ConceptCompliance stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (operationalCapabilityEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::UseCase",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalCapability_Compliances(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency",
			 "explanation", "none",
			 "constraints", "uml::NamedElement::clientDependency elements on which ConceptCompliance stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getOperationalCapability_Configurations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalCapability_OwnedEntityOperationalCapabilityInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalCapability_RealizingCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalCapability_InvolvedEntities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (activityAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Allocations::Allocate",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityAllocation_Role(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getActivityAllocation_Activity(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (rolePkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRolePkg_OwnedRolePkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which RolePkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getRolePkg_OwnedRoles(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Role stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (roleEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML ::Blocks ::Block",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRole_OwnedRoleAssemblyUsages(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Dependency::supplier",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getRole_OwnedActivityAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which ActivityAllocation stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getRole_RoleAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRole_ActivityAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRole_AllocatingEntities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRole_AllocatedOperationalActivities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (roleAssemblyUsageEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Usage",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRoleAssemblyUsage_Child(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (roleAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Allocations::Allocate",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRoleAllocation_Role(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRoleAllocation_Entity(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (entityPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntityPkg_OwnedEntityPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which EntityPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getEntityPkg_OwnedEntities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Entity stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getEntityPkg_OwnedLocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Location stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getEntityPkg_OwnedCommunicationMeans(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which CommunicationMean stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (entityEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML ::Blocks ::Block",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_RoleAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_OrganisationalUnitMemberships(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Dependency::supplier",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getEntity_ActualLocation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_SubEntities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_OwnedEntities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_OwnedCommunicationMeans(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "since CommunicationMean is mapped to uml::InformationFlow, and no containment reference on Block is available to receive this",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_OwnedRoleAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "some elements on which RoleAllocation stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getEntity_AllocatedOperationalActivities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_AllocatedRoles(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_RealizingSystems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_RealizingActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntity_InvolvingOperationalCapabilities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (conceptPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getConceptPkg_OwnedConceptPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which ConceptPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getConceptPkg_OwnedConcepts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Concept stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (conceptEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Class",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getConcept_Compliances(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Dependency::supplier",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getConcept_CompositeLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency, keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "uml::NamedElement::clientDependency elements on which ItemInConcept stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (conceptComplianceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getConceptCompliance_ComplyWithConcept(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (getConceptCompliance_CompliantCapability(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (itemInConceptEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getItemInConcept_Concept(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (getItemInConcept_Item(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (abstractConceptItemEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::NamedElement",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractConceptItem_ComposingLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Dependency::supplier",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (operationalActorEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "SysML ::Blocks ::Block",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationalActor_RealizingSystemActors(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communityOfInterestEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Actor",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunityOfInterest_CommunityOfInterestCompositions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency, keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "Some elements on which CommunityOfInterestComposition stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (communityOfInterestCompositionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunityOfInterestComposition_CommunityOfInterest(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getCommunityOfInterestComposition_InterestedOrganisationUnit(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (organisationalUnitEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Actor",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOrganisationalUnit_OrganisationalUnitCompositions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency, keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "some elements on which OrganisationalUnitComposition stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getOrganisationalUnit_CommunityOfInterestMemberships(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Dependency::supplier",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (organisationalUnitCompositionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOrganisationalUnitComposition_OrganisationalUnit(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getOrganisationalUnitComposition_ParticipatingEntity(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Class",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getLocation_LocationDescription(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getLocation_LocatedEntities(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (capabilityConfigurationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Class",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapabilityConfiguration_ConfiguredCapability(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationMeanEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "not explicitly mapped to uml::InformationFlow, since its parent (ComponentExchange) is concrete and already mapped to uml::InformationFlow\r\n",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationMean_SourceEntity(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationMean_TargetEntity(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (entityOperationalCapabilityInvolvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntityOperationalCapabilityInvolvement_Entity(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEntityOperationalCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (operationalContextEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Class",
			 "explanation", "none",
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
		  (getOperationalAnalysis_ContainedOperationalCapabilityPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalAnalysis_ContainedOperationalActivityPkg(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalAnalysis_AllocatingSystemAnalyses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_ActivityAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_OwnedSwimlanes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_OwnedProcess(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_AllocatorEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_RealizingSystemFunctions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_AllocatingRoles(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_ContainedOperationalActivities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActivity_ChildrenOperationalActivities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalProcess_InvolvingOperationalCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSwimlane_RepresentedEntity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalCapability_RealizingCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalCapability_InvolvedEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityAllocation_Role(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityAllocation_Activity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRole_RoleAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRole_ActivityAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRole_AllocatingEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRole_AllocatedOperationalActivities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRoleAllocation_Role(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRoleAllocation_Entity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_RoleAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_SubEntities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_AllocatedOperationalActivities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_AllocatedRoles(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_RealizingSystems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_RealizingActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntity_InvolvingOperationalCapabilities(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationalActor_RealizingSystemActors(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationMean_SourceEntity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationMean_TargetEntity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntityOperationalCapabilityInvolvement_Entity(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEntityOperationalCapabilityInvolvement_Capability(), 
		   source, 
		   new String[] {
		   });
	}

} //OaPackageImpl