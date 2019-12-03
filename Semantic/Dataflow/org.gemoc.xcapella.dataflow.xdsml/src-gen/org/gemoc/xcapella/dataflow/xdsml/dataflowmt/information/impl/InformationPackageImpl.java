/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractCollectionValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractEventOperation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AbstractInstance;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AggregationKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Association;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.AssociationPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Collection;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.CollectionKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.CollectionValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.CollectionValueReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.DataPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.DomainElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ElementKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemInstance;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeMechanism;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.KeyPart;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.MultiplicityElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.OperationAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Parameter;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ParameterDirection;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Partition;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PartitionableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PassingMode;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Port;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PortAllocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.PortRealization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Service;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.SynchronismKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Union;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.UnionKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.UnionProperty;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Unit;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.impl.CommunicationPackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.DatatypePackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.impl.DatatypePackageImpl;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.impl.DatavaluePackageImpl;

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
public class InformationPackageImpl extends EPackageImpl implements InformationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCollectionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionValueReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeItemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeItemInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeItemRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEventOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum passingModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronismKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exchangeMechanismEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionKindEEnum = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InformationPackageImpl() {
		super(eNS_URI, InformationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InformationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InformationPackage init() {
		if (isInited) return (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);

		// Obtain or create and register package
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InformationPackageImpl());

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
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) : DatavaluePackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		theInformationPackage.createPackageContents();
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
		theCommunicationPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theDatavaluePackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		theInformationPackage.initializePackageContents();
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
		theCommunicationPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theDatavaluePackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInformationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InformationPackage.eNS_URI, theInformationPackage);
		return theInformationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInstance() {
		return abstractInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractInstance_RepresentingInstanceRoles() {
		return (EReference)abstractInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationPkg() {
		return associationPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociationPkg_Visibility() {
		return (EAttribute)associationPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationPkg_OwnedAssociations() {
		return (EReference)associationPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_OwnedMembers() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_NavigableMembers() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsPrimitive() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_KeyParts() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedStateMachines() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedDataValues() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedInformationRealizations() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_RealizedClasses() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_RealizingClasses() {
		return (EReference)classEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_IsPrimitive() {
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Visibility() {
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_Kind() {
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_AggregationKind() {
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Type() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_Index() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollection_ContainedOperations() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCollectionValue() {
		return abstractCollectionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionValue() {
		return collectionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionValue_OwnedElements() {
		return (EReference)collectionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionValue_OwnedDefaultElement() {
		return (EReference)collectionValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionValueReference() {
		return collectionValueReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionValueReference_ReferencedValue() {
		return (EReference)collectionValueReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionValueReference_ReferencedProperty() {
		return (EReference)collectionValueReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPkg() {
		return dataPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedDataPkgs() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedClasses() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedKeyParts() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedCollections() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedUnits() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedDataTypes() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedSignals() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedMessages() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedExceptions() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPkg_OwnedStateEvents() {
		return (EReference)dataPkgEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainElement() {
		return domainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyPart() {
		return keyPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyPart_Property() {
		return (EReference)keyPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Ordered() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Unique() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_MinInclusive() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_MaxInclusive() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_OwnedDefaultValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_OwnedMinValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_OwnedMaxValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_OwnedNullValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_OwnedMinCard() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_OwnedMinLength() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_OwnedMaxCard() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_OwnedMaxLength() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwnedParameters() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_AllocatingOperations() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_AllocatedOperations() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwnedOperationAllocation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwnedExchangeItemRealizations() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RealizedExchangeItems() {
		return (EReference)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationAllocation() {
		return operationAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationAllocation_AllocatedOperation() {
		return (EReference)operationAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationAllocation_AllocatingOperation() {
		return (EReference)operationAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_PassingMode() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_AggregationKind() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsReadOnly() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsPartOfKey() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Association() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_SynchronismKind() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ThrownExceptions() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Messages() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_MessageReferences() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnion() {
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnion_Kind() {
		return (EAttribute)unionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnion_Discriminant() {
		return (EReference)unionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnion_DefaultProperty() {
		return (EReference)unionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnion_ContainedUnionProperties() {
		return (EReference)unionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionProperty() {
		return unionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionProperty_Qualifier() {
		return (EReference)unionPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionableElement() {
		return partitionableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionableElement_OwnedPartitions() {
		return (EReference)partitionableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartitionableElement_RepresentingPartitions() {
		return (EReference)partitionableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartition() {
		return partitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_IncomingPortRealizations() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_OutgoingPortRealizations() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_OwnedProtocols() {
		return (EReference)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_IncomingPortAllocations() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_OutgoingPortAllocations() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_ProvidedInterfaces() {
		return (EReference)portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_RequiredInterfaces() {
		return (EReference)portEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_OwnedPortRealizations() {
		return (EReference)portEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_OwnedPortAllocations() {
		return (EReference)portEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortRealization() {
		return portRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortRealization_RealizedPort() {
		return (EReference)portRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortRealization_RealizingPort() {
		return (EReference)portRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortAllocation() {
		return portAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortAllocation_AllocatedPort() {
		return (EReference)portAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortAllocation_AllocatingPort() {
		return (EReference)portAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeItem() {
		return exchangeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeItem_ExchangeMechanism() {
		return (EAttribute)exchangeItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItem_OwnedElements() {
		return (EReference)exchangeItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItem_OwnedInformationRealizations() {
		return (EReference)exchangeItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItem_OwnedExchangeItemInstances() {
		return (EReference)exchangeItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItem_AllocatorInterfaces() {
		return (EReference)exchangeItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItem_RealizedExchangeItems() {
		return (EReference)exchangeItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItem_RealizingExchangeItems() {
		return (EReference)exchangeItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItem_RealizingOperations() {
		return (EReference)exchangeItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeItemElement() {
		return exchangeItemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeItemElement_Kind() {
		return (EAttribute)exchangeItemElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeItemElement_Direction() {
		return (EAttribute)exchangeItemElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeItemElement_Composite() {
		return (EAttribute)exchangeItemElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItemElement_ReferencedProperties() {
		return (EReference)exchangeItemElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeItemInstance() {
		return exchangeItemInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationRealization() {
		return informationRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeItemRealization() {
		return exchangeItemRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItemRealization_RealizedItem() {
		return (EReference)exchangeItemRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExchangeItemRealization_RealizingOperation() {
		return (EReference)exchangeItemRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEventOperation() {
		return abstractEventOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEventOperation_InvokingSequenceMessages() {
		return (EReference)abstractEventOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationKind() {
		return aggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirection() {
		return parameterDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPassingMode() {
		return passingModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSynchronismKind() {
		return synchronismKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnionKind() {
		return unionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExchangeMechanism() {
		return exchangeMechanismEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementKind() {
		return elementKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCollectionKind() {
		return collectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFactory getInformationFactory() {
		return (InformationFactory)getEFactoryInstance();
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
		abstractInstanceEClass = createEClass(ABSTRACT_INSTANCE);
		createEReference(abstractInstanceEClass, ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES);

		associationPkgEClass = createEClass(ASSOCIATION_PKG);
		createEAttribute(associationPkgEClass, ASSOCIATION_PKG__VISIBILITY);
		createEReference(associationPkgEClass, ASSOCIATION_PKG__OWNED_ASSOCIATIONS);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__OWNED_MEMBERS);
		createEReference(associationEClass, ASSOCIATION__NAVIGABLE_MEMBERS);

		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__IS_PRIMITIVE);
		createEReference(classEClass, CLASS__KEY_PARTS);
		createEReference(classEClass, CLASS__OWNED_STATE_MACHINES);
		createEReference(classEClass, CLASS__OWNED_DATA_VALUES);
		createEReference(classEClass, CLASS__OWNED_INFORMATION_REALIZATIONS);
		createEReference(classEClass, CLASS__REALIZED_CLASSES);
		createEReference(classEClass, CLASS__REALIZING_CLASSES);

		collectionEClass = createEClass(COLLECTION);
		createEAttribute(collectionEClass, COLLECTION__IS_PRIMITIVE);
		createEAttribute(collectionEClass, COLLECTION__VISIBILITY);
		createEAttribute(collectionEClass, COLLECTION__KIND);
		createEAttribute(collectionEClass, COLLECTION__AGGREGATION_KIND);
		createEReference(collectionEClass, COLLECTION__TYPE);
		createEReference(collectionEClass, COLLECTION__INDEX);
		createEReference(collectionEClass, COLLECTION__CONTAINED_OPERATIONS);

		abstractCollectionValueEClass = createEClass(ABSTRACT_COLLECTION_VALUE);

		collectionValueEClass = createEClass(COLLECTION_VALUE);
		createEReference(collectionValueEClass, COLLECTION_VALUE__OWNED_ELEMENTS);
		createEReference(collectionValueEClass, COLLECTION_VALUE__OWNED_DEFAULT_ELEMENT);

		collectionValueReferenceEClass = createEClass(COLLECTION_VALUE_REFERENCE);
		createEReference(collectionValueReferenceEClass, COLLECTION_VALUE_REFERENCE__REFERENCED_VALUE);
		createEReference(collectionValueReferenceEClass, COLLECTION_VALUE_REFERENCE__REFERENCED_PROPERTY);

		dataPkgEClass = createEClass(DATA_PKG);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_DATA_PKGS);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_CLASSES);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_KEY_PARTS);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_COLLECTIONS);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_UNITS);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_DATA_TYPES);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_SIGNALS);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_MESSAGES);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_EXCEPTIONS);
		createEReference(dataPkgEClass, DATA_PKG__OWNED_STATE_EVENTS);

		domainElementEClass = createEClass(DOMAIN_ELEMENT);

		keyPartEClass = createEClass(KEY_PART);
		createEReference(keyPartEClass, KEY_PART__PROPERTY);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__ORDERED);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UNIQUE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__MIN_INCLUSIVE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__MAX_INCLUSIVE);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__OWNED_MIN_CARD);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__OWNED_MAX_CARD);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__OWNED_PARAMETERS);
		createEReference(operationEClass, OPERATION__ALLOCATING_OPERATIONS);
		createEReference(operationEClass, OPERATION__ALLOCATED_OPERATIONS);
		createEReference(operationEClass, OPERATION__OWNED_OPERATION_ALLOCATION);
		createEReference(operationEClass, OPERATION__OWNED_EXCHANGE_ITEM_REALIZATIONS);
		createEReference(operationEClass, OPERATION__REALIZED_EXCHANGE_ITEMS);

		operationAllocationEClass = createEClass(OPERATION_ALLOCATION);
		createEReference(operationAllocationEClass, OPERATION_ALLOCATION__ALLOCATED_OPERATION);
		createEReference(operationAllocationEClass, OPERATION_ALLOCATION__ALLOCATING_OPERATION);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);
		createEAttribute(parameterEClass, PARAMETER__PASSING_MODE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__AGGREGATION_KIND);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEAttribute(propertyEClass, PROPERTY__IS_READ_ONLY);
		createEAttribute(propertyEClass, PROPERTY__IS_PART_OF_KEY);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__SYNCHRONISM_KIND);
		createEReference(serviceEClass, SERVICE__THROWN_EXCEPTIONS);
		createEReference(serviceEClass, SERVICE__MESSAGES);
		createEReference(serviceEClass, SERVICE__MESSAGE_REFERENCES);

		unionEClass = createEClass(UNION);
		createEAttribute(unionEClass, UNION__KIND);
		createEReference(unionEClass, UNION__DISCRIMINANT);
		createEReference(unionEClass, UNION__DEFAULT_PROPERTY);
		createEReference(unionEClass, UNION__CONTAINED_UNION_PROPERTIES);

		unionPropertyEClass = createEClass(UNION_PROPERTY);
		createEReference(unionPropertyEClass, UNION_PROPERTY__QUALIFIER);

		unitEClass = createEClass(UNIT);

		partitionableElementEClass = createEClass(PARTITIONABLE_ELEMENT);
		createEReference(partitionableElementEClass, PARTITIONABLE_ELEMENT__OWNED_PARTITIONS);
		createEReference(partitionableElementEClass, PARTITIONABLE_ELEMENT__REPRESENTING_PARTITIONS);

		partitionEClass = createEClass(PARTITION);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__INCOMING_PORT_REALIZATIONS);
		createEReference(portEClass, PORT__OUTGOING_PORT_REALIZATIONS);
		createEReference(portEClass, PORT__OWNED_PROTOCOLS);
		createEReference(portEClass, PORT__INCOMING_PORT_ALLOCATIONS);
		createEReference(portEClass, PORT__OUTGOING_PORT_ALLOCATIONS);
		createEReference(portEClass, PORT__PROVIDED_INTERFACES);
		createEReference(portEClass, PORT__REQUIRED_INTERFACES);
		createEReference(portEClass, PORT__OWNED_PORT_REALIZATIONS);
		createEReference(portEClass, PORT__OWNED_PORT_ALLOCATIONS);

		portRealizationEClass = createEClass(PORT_REALIZATION);
		createEReference(portRealizationEClass, PORT_REALIZATION__REALIZED_PORT);
		createEReference(portRealizationEClass, PORT_REALIZATION__REALIZING_PORT);

		portAllocationEClass = createEClass(PORT_ALLOCATION);
		createEReference(portAllocationEClass, PORT_ALLOCATION__ALLOCATED_PORT);
		createEReference(portAllocationEClass, PORT_ALLOCATION__ALLOCATING_PORT);

		exchangeItemEClass = createEClass(EXCHANGE_ITEM);
		createEAttribute(exchangeItemEClass, EXCHANGE_ITEM__EXCHANGE_MECHANISM);
		createEReference(exchangeItemEClass, EXCHANGE_ITEM__OWNED_ELEMENTS);
		createEReference(exchangeItemEClass, EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS);
		createEReference(exchangeItemEClass, EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES);
		createEReference(exchangeItemEClass, EXCHANGE_ITEM__ALLOCATOR_INTERFACES);
		createEReference(exchangeItemEClass, EXCHANGE_ITEM__REALIZED_EXCHANGE_ITEMS);
		createEReference(exchangeItemEClass, EXCHANGE_ITEM__REALIZING_EXCHANGE_ITEMS);
		createEReference(exchangeItemEClass, EXCHANGE_ITEM__REALIZING_OPERATIONS);

		exchangeItemElementEClass = createEClass(EXCHANGE_ITEM_ELEMENT);
		createEAttribute(exchangeItemElementEClass, EXCHANGE_ITEM_ELEMENT__KIND);
		createEAttribute(exchangeItemElementEClass, EXCHANGE_ITEM_ELEMENT__DIRECTION);
		createEAttribute(exchangeItemElementEClass, EXCHANGE_ITEM_ELEMENT__COMPOSITE);
		createEReference(exchangeItemElementEClass, EXCHANGE_ITEM_ELEMENT__REFERENCED_PROPERTIES);

		exchangeItemInstanceEClass = createEClass(EXCHANGE_ITEM_INSTANCE);

		informationRealizationEClass = createEClass(INFORMATION_REALIZATION);

		exchangeItemRealizationEClass = createEClass(EXCHANGE_ITEM_REALIZATION);
		createEReference(exchangeItemRealizationEClass, EXCHANGE_ITEM_REALIZATION__REALIZED_ITEM);
		createEReference(exchangeItemRealizationEClass, EXCHANGE_ITEM_REALIZATION__REALIZING_OPERATION);

		abstractEventOperationEClass = createEClass(ABSTRACT_EVENT_OPERATION);
		createEReference(abstractEventOperationEClass, ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES);

		// Create enums
		aggregationKindEEnum = createEEnum(AGGREGATION_KIND);
		parameterDirectionEEnum = createEEnum(PARAMETER_DIRECTION);
		passingModeEEnum = createEEnum(PASSING_MODE);
		synchronismKindEEnum = createEEnum(SYNCHRONISM_KIND);
		unionKindEEnum = createEEnum(UNION_KIND);
		exchangeMechanismEEnum = createEEnum(EXCHANGE_MECHANISM);
		elementKindEEnum = createEEnum(ELEMENT_KIND);
		collectionKindEEnum = createEEnum(COLLECTION_KIND);
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
		CommunicationPackage theCommunicationPackage = (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);
		DatatypePackage theDatatypePackage = (DatatypePackage)EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI);
		DatavaluePackage theDatavaluePackage = (DatavaluePackage)EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI);
		InteractionPackage theInteractionPackage = (InteractionPackage)EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI);
		CapellacorePackage theCapellacorePackage = (CapellacorePackage)EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI);
		CapellacommonPackage theCapellacommonPackage = (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);
		CsPackage theCsPackage = (CsPackage)EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCommunicationPackage);
		getESubpackages().add(theDatatypePackage);
		getESubpackages().add(theDatavaluePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractInstanceEClass.getESuperTypes().add(this.getProperty());
		associationPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		associationEClass.getESuperTypes().add(theCapellacorePackage.getNamedRelationship());
		classEClass.getESuperTypes().add(theCapellacorePackage.getGeneralClass());
		collectionEClass.getESuperTypes().add(theCapellacorePackage.getClassifier());
		collectionEClass.getESuperTypes().add(this.getMultiplicityElement());
		collectionEClass.getESuperTypes().add(theDatavaluePackage.getDataValueContainer());
		collectionEClass.getESuperTypes().add(theModellingcorePackage.getFinalizableElement());
		abstractCollectionValueEClass.getESuperTypes().add(theDatavaluePackage.getDataValue());
		collectionValueEClass.getESuperTypes().add(this.getAbstractCollectionValue());
		collectionValueReferenceEClass.getESuperTypes().add(this.getAbstractCollectionValue());
		dataPkgEClass.getESuperTypes().add(theCapellacorePackage.getAbstractDependenciesPkg());
		dataPkgEClass.getESuperTypes().add(theCapellacorePackage.getAbstractExchangeItemPkg());
		dataPkgEClass.getESuperTypes().add(this.getAssociationPkg());
		dataPkgEClass.getESuperTypes().add(theDatavaluePackage.getDataValueContainer());
		dataPkgEClass.getESuperTypes().add(theCommunicationPackage.getMessageReferencePkg());
		domainElementEClass.getESuperTypes().add(this.getClass_());
		keyPartEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		multiplicityElementEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		operationEClass.getESuperTypes().add(theCapellacorePackage.getFeature());
		operationEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		operationEClass.getESuperTypes().add(this.getAbstractEventOperation());
		operationAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		parameterEClass.getESuperTypes().add(theCapellacorePackage.getTypedElement());
		parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
		parameterEClass.getESuperTypes().add(theModellingcorePackage.getAbstractParameter());
		propertyEClass.getESuperTypes().add(theCapellacorePackage.getFeature());
		propertyEClass.getESuperTypes().add(theCapellacorePackage.getTypedElement());
		propertyEClass.getESuperTypes().add(this.getMultiplicityElement());
		propertyEClass.getESuperTypes().add(theModellingcorePackage.getFinalizableElement());
		serviceEClass.getESuperTypes().add(this.getOperation());
		unionEClass.getESuperTypes().add(this.getClass_());
		unionPropertyEClass.getESuperTypes().add(this.getProperty());
		unitEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		partitionableElementEClass.getESuperTypes().add(theCapellacorePackage.getClassifier());
		partitionEClass.getESuperTypes().add(this.getAbstractInstance());
		portEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		portRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		portAllocationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		exchangeItemEClass.getESuperTypes().add(theModellingcorePackage.getAbstractExchangeItem());
		exchangeItemEClass.getESuperTypes().add(theBehaviorPackage.getAbstractEvent());
		exchangeItemEClass.getESuperTypes().add(theBehaviorPackage.getAbstractSignal());
		exchangeItemEClass.getESuperTypes().add(theModellingcorePackage.getFinalizableElement());
		exchangeItemEClass.getESuperTypes().add(theCapellacorePackage.getGeneralizableElement());
		exchangeItemElementEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		exchangeItemElementEClass.getESuperTypes().add(this.getMultiplicityElement());
		exchangeItemElementEClass.getESuperTypes().add(theCapellacorePackage.getTypedElement());
		exchangeItemInstanceEClass.getESuperTypes().add(this.getAbstractInstance());
		informationRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		exchangeItemRealizationEClass.getESuperTypes().add(theCapellacorePackage.getAllocation());
		abstractEventOperationEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractInstanceEClass, AbstractInstance.class, "AbstractInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractInstance_RepresentingInstanceRoles(), theInteractionPackage.getInstanceRole(), null, "representingInstanceRoles", null, 0, -1, AbstractInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(associationPkgEClass, AssociationPkg.class, "AssociationPkg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociationPkg_Visibility(), theCapellacorePackage.getVisibilityKind(), "visibility", null, 0, 1, AssociationPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationPkg_OwnedAssociations(), this.getAssociation(), null, "ownedAssociations", null, 0, -1, AssociationPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_OwnedMembers(), this.getProperty(), null, "ownedMembers", null, 0, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_NavigableMembers(), this.getProperty(), null, "navigableMembers", null, 0, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_IsPrimitive(), ecorePackage.getEBoolean(), "isPrimitive", null, 0, 1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_KeyParts(), this.getKeyPart(), null, "keyParts", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_OwnedStateMachines(), theCapellacommonPackage.getStateMachine(), null, "ownedStateMachines", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_OwnedDataValues(), theDatavaluePackage.getDataValue(), null, "ownedDataValues", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_OwnedInformationRealizations(), this.getInformationRealization(), null, "ownedInformationRealizations", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_RealizedClasses(), this.getClass_(), this.getClass_RealizingClasses(), "realizedClasses", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClass_RealizingClasses(), this.getClass_(), this.getClass_RealizedClasses(), "realizingClasses", null, 0, -1, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Class.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollection_IsPrimitive(), ecorePackage.getEBoolean(), "isPrimitive", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollection_Visibility(), theCapellacorePackage.getVisibilityKind(), "visibility", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollection_Kind(), this.getCollectionKind(), "kind", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollection_AggregationKind(), this.getAggregationKind(), "aggregationKind", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollection_Type(), theCapellacorePackage.getType(), null, "type", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollection_Index(), theDatatypePackage.getDataType(), null, "index", null, 0, -1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollection_ContainedOperations(), this.getOperation(), null, "containedOperations", null, 0, -1, Collection.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractCollectionValueEClass, AbstractCollectionValue.class, "AbstractCollectionValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionValueEClass, CollectionValue.class, "CollectionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionValue_OwnedElements(), theDatavaluePackage.getDataValue(), null, "ownedElements", null, 0, -1, CollectionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionValue_OwnedDefaultElement(), theDatavaluePackage.getDataValue(), null, "ownedDefaultElement", null, 0, 1, CollectionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionValueReferenceEClass, CollectionValueReference.class, "CollectionValueReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionValueReference_ReferencedValue(), this.getAbstractCollectionValue(), null, "referencedValue", null, 0, 1, CollectionValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionValueReference_ReferencedProperty(), this.getProperty(), null, "referencedProperty", null, 0, 1, CollectionValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPkgEClass, DataPkg.class, "DataPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPkg_OwnedDataPkgs(), this.getDataPkg(), null, "ownedDataPkgs", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPkg_OwnedClasses(), this.getClass_(), null, "ownedClasses", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPkg_OwnedKeyParts(), this.getKeyPart(), null, "ownedKeyParts", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPkg_OwnedCollections(), this.getCollection(), null, "ownedCollections", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPkg_OwnedUnits(), this.getUnit(), null, "ownedUnits", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPkg_OwnedDataTypes(), theDatatypePackage.getDataType(), null, "ownedDataTypes", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPkg_OwnedSignals(), theCommunicationPackage.getSignal(), null, "ownedSignals", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPkg_OwnedMessages(), theCommunicationPackage.getMessage(), null, "ownedMessages", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPkg_OwnedExceptions(), theCommunicationPackage.getException(), null, "ownedExceptions", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPkg_OwnedStateEvents(), theCapellacommonPackage.getStateEvent(), null, "ownedStateEvents", null, 0, -1, DataPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainElementEClass, DomainElement.class, "DomainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyPartEClass, KeyPart.class, "KeyPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyPart_Property(), this.getProperty(), null, "property", null, 1, 1, KeyPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_Ordered(), ecorePackage.getEBoolean(), "ordered", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_Unique(), ecorePackage.getEBoolean(), "unique", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_MinInclusive(), ecorePackage.getEBoolean(), "minInclusive", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_MaxInclusive(), ecorePackage.getEBoolean(), "maxInclusive", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicityElement_OwnedDefaultValue(), theDatavaluePackage.getDataValue(), null, "ownedDefaultValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicityElement_OwnedMinValue(), theDatavaluePackage.getDataValue(), null, "ownedMinValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicityElement_OwnedMaxValue(), theDatavaluePackage.getDataValue(), null, "ownedMaxValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicityElement_OwnedNullValue(), theDatavaluePackage.getDataValue(), null, "ownedNullValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicityElement_OwnedMinCard(), theDatavaluePackage.getNumericValue(), null, "ownedMinCard", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicityElement_OwnedMinLength(), theDatavaluePackage.getNumericValue(), null, "ownedMinLength", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicityElement_OwnedMaxCard(), theDatavaluePackage.getNumericValue(), null, "ownedMaxCard", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiplicityElement_OwnedMaxLength(), theDatavaluePackage.getNumericValue(), null, "ownedMaxLength", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_OwnedParameters(), this.getParameter(), null, "ownedParameters", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_AllocatingOperations(), this.getOperation(), this.getOperation_AllocatedOperations(), "allocatingOperations", null, 0, -1, Operation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_AllocatedOperations(), this.getOperation(), this.getOperation_AllocatingOperations(), "allocatedOperations", null, 0, -1, Operation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwnedOperationAllocation(), this.getOperationAllocation(), null, "ownedOperationAllocation", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwnedExchangeItemRealizations(), this.getExchangeItemRealization(), null, "ownedExchangeItemRealizations", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_RealizedExchangeItems(), this.getExchangeItem(), this.getExchangeItem_RealizingOperations(), "realizedExchangeItems", null, 0, -1, Operation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(operationAllocationEClass, OperationAllocation.class, "OperationAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationAllocation_AllocatedOperation(), this.getOperation(), null, "allocatedOperation", null, 1, 1, OperationAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOperationAllocation_AllocatingOperation(), this.getOperation(), null, "allocatingOperation", null, 1, 1, OperationAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Direction(), this.getParameterDirection(), "direction", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_PassingMode(), this.getPassingMode(), "passingMode", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_AggregationKind(), this.getAggregationKind(), "aggregationKind", "UNSET", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsDerived(), ecorePackage.getEBoolean(), "isDerived", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsReadOnly(), ecorePackage.getEBoolean(), "isReadOnly", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsPartOfKey(), ecorePackage.getEBoolean(), "isPartOfKey", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Association(), this.getAssociation(), null, "association", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_SynchronismKind(), this.getSynchronismKind(), "synchronismKind", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ThrownExceptions(), theCommunicationPackage.getException(), null, "thrownExceptions", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Messages(), theCommunicationPackage.getMessage(), null, "messages", null, 0, -1, Service.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getService_MessageReferences(), theCommunicationPackage.getMessageReference(), null, "messageReferences", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionEClass, Union.class, "Union", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnion_Kind(), this.getUnionKind(), "kind", null, 0, 1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnion_Discriminant(), this.getUnionProperty(), null, "discriminant", null, 0, 1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnion_DefaultProperty(), this.getUnionProperty(), null, "defaultProperty", null, 0, 1, Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnion_ContainedUnionProperties(), this.getUnionProperty(), null, "containedUnionProperties", null, 0, -1, Union.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(unionPropertyEClass, UnionProperty.class, "UnionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnionProperty_Qualifier(), theDatavaluePackage.getDataValue(), null, "qualifier", null, 0, -1, UnionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partitionableElementEClass, PartitionableElement.class, "PartitionableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartitionableElement_OwnedPartitions(), this.getPartition(), null, "ownedPartitions", null, 0, -1, PartitionableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPartitionableElement_RepresentingPartitions(), this.getPartition(), null, "representingPartitions", null, 0, -1, PartitionableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(partitionableElementEClass, ecorePackage.getEBoolean(), "isDecomposed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partitionEClass, Partition.class, "Partition", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_IncomingPortRealizations(), this.getPortRealization(), this.getPortRealization_RealizedPort(), "incomingPortRealizations", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPort_OutgoingPortRealizations(), this.getPortRealization(), this.getPortRealization_RealizingPort(), "outgoingPortRealizations", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPort_OwnedProtocols(), theCapellacommonPackage.getStateMachine(), null, "ownedProtocols", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_IncomingPortAllocations(), this.getPortAllocation(), this.getPortAllocation_AllocatedPort(), "incomingPortAllocations", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPort_OutgoingPortAllocations(), this.getPortAllocation(), this.getPortAllocation_AllocatingPort(), "outgoingPortAllocations", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPort_ProvidedInterfaces(), theCsPackage.getInterface(), null, "providedInterfaces", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_RequiredInterfaces(), theCsPackage.getInterface(), null, "requiredInterfaces", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_OwnedPortRealizations(), this.getPortRealization(), null, "ownedPortRealizations", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_OwnedPortAllocations(), this.getPortAllocation(), null, "ownedPortAllocations", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portRealizationEClass, PortRealization.class, "PortRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortRealization_RealizedPort(), this.getPort(), this.getPort_IncomingPortRealizations(), "realizedPort", null, 1, 1, PortRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortRealization_RealizingPort(), this.getPort(), this.getPort_OutgoingPortRealizations(), "realizingPort", null, 1, 1, PortRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(portAllocationEClass, PortAllocation.class, "PortAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortAllocation_AllocatedPort(), this.getPort(), this.getPort_IncomingPortAllocations(), "allocatedPort", null, 0, 1, PortAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPortAllocation_AllocatingPort(), this.getPort(), this.getPort_OutgoingPortAllocations(), "allocatingPort", null, 0, 1, PortAllocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exchangeItemEClass, ExchangeItem.class, "ExchangeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExchangeItem_ExchangeMechanism(), this.getExchangeMechanism(), "exchangeMechanism", null, 1, 1, ExchangeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItem_OwnedElements(), this.getExchangeItemElement(), null, "ownedElements", null, 0, -1, ExchangeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItem_OwnedInformationRealizations(), this.getInformationRealization(), null, "ownedInformationRealizations", null, 0, -1, ExchangeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItem_OwnedExchangeItemInstances(), this.getExchangeItemInstance(), null, "ownedExchangeItemInstances", null, 0, -1, ExchangeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItem_AllocatorInterfaces(), theCsPackage.getInterface(), null, "allocatorInterfaces", null, 0, -1, ExchangeItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItem_RealizedExchangeItems(), this.getExchangeItem(), this.getExchangeItem_RealizingExchangeItems(), "realizedExchangeItems", null, 0, -1, ExchangeItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItem_RealizingExchangeItems(), this.getExchangeItem(), this.getExchangeItem_RealizedExchangeItems(), "realizingExchangeItems", null, 0, -1, ExchangeItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItem_RealizingOperations(), this.getOperation(), this.getOperation_RealizedExchangeItems(), "realizingOperations", null, 0, -1, ExchangeItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exchangeItemElementEClass, ExchangeItemElement.class, "ExchangeItemElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExchangeItemElement_Kind(), this.getElementKind(), "kind", null, 0, 1, ExchangeItemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeItemElement_Direction(), this.getParameterDirection(), "direction", null, 0, 1, ExchangeItemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExchangeItemElement_Composite(), ecorePackage.getEBoolean(), "composite", null, 0, 1, ExchangeItemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItemElement_ReferencedProperties(), this.getProperty(), null, "referencedProperties", null, 0, -1, ExchangeItemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exchangeItemInstanceEClass, ExchangeItemInstance.class, "ExchangeItemInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(informationRealizationEClass, InformationRealization.class, "InformationRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exchangeItemRealizationEClass, ExchangeItemRealization.class, "ExchangeItemRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchangeItemRealization_RealizedItem(), theModellingcorePackage.getAbstractExchangeItem(), null, "realizedItem", null, 0, 1, ExchangeItemRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExchangeItemRealization_RealizingOperation(), this.getOperation(), null, "realizingOperation", null, 0, 1, ExchangeItemRealization.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractEventOperationEClass, AbstractEventOperation.class, "AbstractEventOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractEventOperation_InvokingSequenceMessages(), theInteractionPackage.getSequenceMessage(), null, "invokingSequenceMessages", null, 0, -1, AbstractEventOperation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(aggregationKindEEnum, AggregationKind.class, "AggregationKind");
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.UNSET);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.ASSOCIATION);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.AGGREGATION);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.COMPOSITION);

		initEEnum(parameterDirectionEEnum, ParameterDirection.class, "ParameterDirection");
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.IN);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.OUT);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.INOUT);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.RETURN);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.EXCEPTION);
		addEEnumLiteral(parameterDirectionEEnum, ParameterDirection.UNSET);

		initEEnum(passingModeEEnum, PassingMode.class, "PassingMode");
		addEEnumLiteral(passingModeEEnum, PassingMode.UNSET);
		addEEnumLiteral(passingModeEEnum, PassingMode.BY_REF);
		addEEnumLiteral(passingModeEEnum, PassingMode.BY_VALUE);

		initEEnum(synchronismKindEEnum, SynchronismKind.class, "SynchronismKind");
		addEEnumLiteral(synchronismKindEEnum, SynchronismKind.UNSET);
		addEEnumLiteral(synchronismKindEEnum, SynchronismKind.SYNCHRONOUS);
		addEEnumLiteral(synchronismKindEEnum, SynchronismKind.ASYNCHRONOUS);

		initEEnum(unionKindEEnum, UnionKind.class, "UnionKind");
		addEEnumLiteral(unionKindEEnum, UnionKind.UNION);
		addEEnumLiteral(unionKindEEnum, UnionKind.VARIANT);

		initEEnum(exchangeMechanismEEnum, ExchangeMechanism.class, "ExchangeMechanism");
		addEEnumLiteral(exchangeMechanismEEnum, ExchangeMechanism.UNSET);
		addEEnumLiteral(exchangeMechanismEEnum, ExchangeMechanism.FLOW);
		addEEnumLiteral(exchangeMechanismEEnum, ExchangeMechanism.OPERATION);
		addEEnumLiteral(exchangeMechanismEEnum, ExchangeMechanism.EVENT);
		addEEnumLiteral(exchangeMechanismEEnum, ExchangeMechanism.SHARED_DATA);

		initEEnum(elementKindEEnum, ElementKind.class, "ElementKind");
		addEEnumLiteral(elementKindEEnum, ElementKind.TYPE);
		addEEnumLiteral(elementKindEEnum, ElementKind.MEMBER);

		initEEnum(collectionKindEEnum, CollectionKind.class, "CollectionKind");
		addEEnumLiteral(collectionKindEEnum, CollectionKind.ARRAY);
		addEEnumLiteral(collectionKindEEnum, CollectionKind.SEQUENCE);

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
		// http://www.polarsys.org/capella/derived
		createDerivedAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment
		createSegmentAnnotations();
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
			 "description", "Information aims at defining the data transmission language (named Information due to the namespacing strange effects if it would have been named Data). It includes the notion of data as well as the different data communication means.\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "none",
			 "constraints", "This package depends on the model CapellaCore.ecore",
			 "comment/notes", "none",
			 "reference documentation", "n/a"
		   });	
		addAnnotation
		  (abstractInstanceEClass, 
		   source, 
		   new String[] {
			 "description", "Base class used to derive specific types of instances of classifiers (e.g very high-level/generic class)\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (aggregationKindEEnum, 
		   source, 
		   new String[] {
			 "description", "defines the specific kind of a relationship, as per UML definitions\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when value is not defined by the user\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "An association specifies a semantic relationship that can occur between typed instances. It has at least two ends\r\nrepresented by properties, each of which is connected to the type of the end. More than one end of the association may\r\nhave the same type.\r\n[source: UML superstructure v2.2]\r\n\r\nIndicates that the property has no aggregation.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "An aggregation specifies a semantic relationship between a part and a whole. The part has a lifecycle of its own, and is potentially shared among several aggregators\r\n[source: Capella study]\r\n\r\nIndicates that the property has a shared aggregation.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "A composition specifies a semantic relationship between whole and its parts. The parts lifecycles are tied to that of the whole, and they are not shared with any other aggregator.\r\n[source: Capella study]\r\n\r\nIndicates that the property is aggregated compositely, i.e., the composite object has responsibility for the existence\r\nand storage of the composed objects.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (associationPkgEClass, 
		   source, 
		   new String[] {
			 "description", "A container for Association elements\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAssociationPkg_Visibility(), 
		   source, 
		   new String[] {
			 "description", "Determines where the NamedElement appears within different Namespaces within the overall model, and its\r\naccessibility.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "refer to VisibilityKind description",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAssociationPkg_OwnedAssociations(), 
		   source, 
		   new String[] {
			 "description", "the Associations elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "description", "An association specifies a semantic relationship that can occur between typed instances. It has at least two ends\r\nrepresented by properties, each of which is connected to the type of the end. More than one end of the association may\r\nhave the same type.\r\nAn end property of an association that is owned by an end class or that is a navigable owned end of the association\r\nindicates that the association is navigable from the opposite ends; otherwise, the association is not navigable from the\r\nopposite ends.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "- An association specializing another association has the same number of ends as the other association.\r\nself.parents()->forAll(p | p.memberEnd.size() = self.memberEnd.size())\r\n- When an association specializes another association, every end of the specific association corresponds to an end of the\r\ngeneral association, and the specific end reaches the same type or a subtype of the more general end.\r\n- endType is derived from the types of the member ends.\r\nself.endType = self.memberEnd->collect(e | e.type)\r\n- Only binary associations can be aggregations.\r\nself.memberEnd->exists(aggregation <> Aggregation::none) implies self.memberEnd->size() = 2\r\n- Association ends of associations with more than two ends must be owned by the association.\r\nif memberEnd->size() > 2 then ownedEnd->includesAll(memberEnd)\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAssociation_OwnedMembers(), 
		   source, 
		   new String[] {
			 "description", "Each end represents participation of instances of the classifier connected to the end in links of the association.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAssociation_NavigableMembers(), 
		   source, 
		   new String[] {
			 "description", "The navigable ends that are owned by the association itself\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "description", "A class describes a set of objects that share the same specifications of features, constraints, and semantics\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getClass_IsPrimitive(), 
		   source, 
		   new String[] {
			 "description", "indicates whether or not the class inherits from a parent class.\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "\"true\" means that there is no super class that this class inherits from.",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getClass_KeyParts(), 
		   source, 
		   new String[] {
			 "description", "The KeyPart elements owned by this class\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getClass_OwnedStateMachines(), 
		   source, 
		   new String[] {
			 "description", "the state machines associated to this class, supporting the characterization of its dynamic behavior\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getClass_OwnedDataValues(), 
		   source, 
		   new String[] {
			 "description", "the list of DataValue elements owned by this class\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getClass_RealizedClasses(), 
		   source, 
		   new String[] {
			 "description", "class(es) realized by this class",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getClass_RealizingClasses(), 
		   source, 
		   new String[] {
			 "description", "class(es) realizing this class",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (collectionEClass, 
		   source, 
		   new String[] {
			 "description", "A set of items of a given type.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCollection_IsPrimitive(), 
		   source, 
		   new String[] {
			 "description", "indicates whether this collection is a first level assembly using native types, or if it is using previously defined Collections \r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "true if the Collection is not assembling other Collections",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCollection_Visibility(), 
		   source, 
		   new String[] {
			 "description", "specifies the visibility status for this collection\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "Refer to VisibilityKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCollection_Kind(), 
		   source, 
		   new String[] {
			 "description", "specifies the kind status for this collection",
			 "constraints", "none",
			 "type", "Refer to CollectionKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCollection_AggregationKind(), 
		   source, 
		   new String[] {
			 "description", "Specifies the kind of aggregation that applies to the Collection",
			 "constraints", "none",
			 "type", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCollection_Type(), 
		   source, 
		   new String[] {
			 "description", "the type of the elements being collected\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCollection_Index(), 
		   source, 
		   new String[] {
			 "description", "index pointing to a specific part of this collection \r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCollection_ContainedOperations(), 
		   source, 
		   new String[] {
			 "description", "The operations associated to this collection\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractCollectionValueEClass, 
		   source, 
		   new String[] {
			 "description", "Base class for defining type-specific collection values\r\n[source: Capella light-light study]\r\n",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (collectionValueEClass, 
		   source, 
		   new String[] {
			 "description", "Caracterizes a value that represents a collection of elements\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCollectionValue_OwnedElements(), 
		   source, 
		   new String[] {
			 "description", "n/a",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCollectionValue_OwnedDefaultElement(), 
		   source, 
		   new String[] {
			 "description", "n/a",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (collectionValueReferenceEClass, 
		   source, 
		   new String[] {
			 "description", "A reference to a collection value, allowing the reuse of collection values across data value structures\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "description", "the collection value that this reference points to\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "description", "the property that is using this reference\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (dataPkgEClass, 
		   source, 
		   new String[] {
			 "description", "A container for data structures\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataPkgs(), 
		   source, 
		   new String[] {
			 "description", "Sub data packages contained in this data package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedClasses(), 
		   source, 
		   new String[] {
			 "description", "the class elements contained in the package",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
			 "description", "KeyPart elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedCollections(), 
		   source, 
		   new String[] {
			 "description", "Collection elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedUnits(), 
		   source, 
		   new String[] {
			 "description", "the Unit elements contained in the package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataTypes(), 
		   source, 
		   new String[] {
			 "description", "Data types contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedSignals(), 
		   source, 
		   new String[] {
			 "description", "the Signal elements contained in the package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedMessages(), 
		   source, 
		   new String[] {
			 "description", "the Messages contained in this Message package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedExceptions(), 
		   source, 
		   new String[] {
			 "description", "the Exception elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedStateEvents(), 
		   source, 
		   new String[] {
			 "description", "the StateEvent elements contained in the package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (domainElementEClass, 
		   source, 
		   new String[] {
			 "description", "A reinterpretable representation of information in a formalized manner suitable for communication, interpretation, or processing.\r\n[source: Open Archival Information System (OAIS), IEC]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (keyPartEClass, 
		   source, 
		   new String[] {
			 "description", "The relationship of a Part with something that it serves as a key for\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getKeyPart_Property(), 
		   source, 
		   new String[] {
			 "description", "the Part/Property being declared as the key to access some other element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (multiplicityElementEClass, 
		   source, 
		   new String[] {
			 "description", "A MultiplicityElement is an abstract metaclass that includes optional attributes for defining the bounds of a multiplicity.\r\nA MultiplicityElement also includes specifications of whether the values in an instantiation of this element must be\r\nunique or ordered.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "These constraints must handle situations where the upper bound may be specified by an expression not computable in the\r\nmodel.\r\n- A multiplicity must define at least one valid cardinality that is greater than zero.\r\nupperBound()->notEmpty() implies upperBound() > 0\r\n- The lower bound must be a non-negative integer literal.\r\nlowerBound()->notEmpty() implies lowerBound() >= 0\r\n- The upper bound must be greater than or equal to the lower bound.\r\n(upperBound()->notEmpty() and lowerBound()->notEmpty()) implies upperBound() >= lowerBound()\r\n- If a non-literal ValueSpecification is used for the lower or upper bound, then evaluating that specification must not have\r\nside effects.\r\nCannot be expressed in OCL.\r\n- If a non-literal ValueSpecification is used for the lower or upper bound, then that specification must be a constant\r\nexpression.\r\nCannot be expressed in OCL.\r\n- The derived lower attribute must equal the lowerBound.\r\nlower = lowerBound()\r\n- The derived upper attribute must equal the upperBound.\r\n[source: UML superstructure v2.2]\r\nupper = upperBound()",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_Ordered(), 
		   source, 
		   new String[] {
			 "description", "For a multivalued multiplicity, this attribute specifies whether the values in an instantiation of this element are\r\nsequentially ordered\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_Unique(), 
		   source, 
		   new String[] {
			 "description", "specifies whether or not this element is unique\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "true is element is unique",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_MinInclusive(), 
		   source, 
		   new String[] {
			 "description", "specifies whether the min value of the range is included or not\r\n[source: Capella light-light study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_MaxInclusive(), 
		   source, 
		   new String[] {
			 "description", "specifies whether the max value of the range is included or not\r\n[source: Capella light-light study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "description", "the value assigned by default to this multiplicity element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "description", "minimum specified value for this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "description", "specified max value for this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "description", "the reference to the null value among the set of values contained in this MultiplicityElement\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinCard(), 
		   source, 
		   new String[] {
			 "description", "Specifies the lower bound of the multiplicity interval, if it is expressed as an integer\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinLength(), 
		   source, 
		   new String[] {
			 "description", "Specified minimum length for this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxCard(), 
		   source, 
		   new String[] {
			 "description", "Specifies the upper bound of the multiplicity interval, if it is expressed as an unlimited natural\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxLength(), 
		   source, 
		   new String[] {
			 "description", "Specified max length for this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "description", "An operation is a behavioral feature of a classifier that specifies the name, type, parameters, and constraints for invoking\r\nan associated behavior\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "../img/usage_examples/operation_parameters.png",
			 "constraints", "- An operation can have at most one return parameter (i.e., an owned parameter with the direction set to \"return\").\r\nownedParameter->select(par | par.direction = #return)->size() <= 1\r\n- If this operation has a return parameter, isOrdered equals the value of isOrdered for that parameter; otherwise, isOrdered\r\nis false.\r\nisOrdered = if returnResult()->notEmpty() then returnResult()->any().isOrdered else false endif\r\n- If this operation has a return parameter, isUnique equals the value of isUnique for that parameter; otherwise, isUnique is\r\ntrue.\r\nisUnique = if returnResult()->notEmpty() then returnResult()->any().isUnique else true endif\r\n- If this operation has a return parameter, lower equals the value of lower for that parameter; otherwise, lower is not\r\ndefined.\r\nlower = if returnResult()->notEmpty() then returnResult()->any().lower else Set{} endif\r\n- If this operation has a return parameter, upper equals the value of upper for that parameter; otherwise, upper is not\r\ndefined.\r\nupper = if returnResult()->notEmpty() then returnResult()->any().upper else Set{} endif\r\n- If this operation has a return parameter, type equals the value of type for that parameter; otherwise, type is not defined.\r\ntype = if returnResult()->notEmpty() then returnResult()->any().type else Set{} endif\r\n- A bodyCondition can only be specified for a query operation.\r\nbodyCondition->notEmpty() implies isQuery\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOperation_OwnedParameters(), 
		   source, 
		   new String[] {
			 "description", "the parameters associated to this operation\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperation_AllocatingOperations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the operation allocation relationships that point to this Operation\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperation_AllocatedOperations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the operation allocation relationships that start from this Operation\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperation_OwnedOperationAllocation(), 
		   source, 
		   new String[] {
			 "description", "list of the allocations of this operation to/from other operations.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperation_OwnedExchangeItemRealizations(), 
		   source, 
		   new String[] {
			 "description", "list of the exchange items that the operation is realizing\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperation_RealizedExchangeItems(), 
		   source, 
		   new String[] {
			 "description", "class(es) realized by this class",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (operationAllocationEClass, 
		   source, 
		   new String[] {
			 "description", "Mediator class supporting the implementation of the allocation link between two Operations\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getOperationAllocation_AllocatedOperation(), 
		   source, 
		   new String[] {
			 "description", "contains the \"target\" of the allocation link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getOperationAllocation_AllocatingOperation(), 
		   source, 
		   new String[] {
			 "description", "contains the \"source\" of the allocation link\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "description", "A parameter is a specification of an argument used to pass information into or out of an invocation of a behavioral\r\nfeature.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "system,logical,physical,epbs",
			 "usage examples", "../img/usage_examples/operation_parameters.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getParameter_Direction(), 
		   source, 
		   new String[] {
			 "description", "specifies whether the parameter is an input, an output, or both.\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "see ParameterDirection definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getParameter_PassingMode(), 
		   source, 
		   new String[] {
			 "description", "specifies the way the parameter is passed along from the caller to the callee\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "see PassingMode enumeration definition for possible values",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum, 
		   source, 
		   new String[] {
			 "description", "specifies the direction in which data is passed along through a parameter \r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "could be renamed ParameterDirectionKind to match UML"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the parameter represents an input of the operation it is used in\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the parameter represents an output of the operation it is used in\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "used when the parameter represents both an input and on output of the operation it is used in\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "used when the parameter represents the return value of the operation it is used in\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "description", "the parameter is like an exception",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink protocol is not yet set",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (passingModeEEnum, 
		   source, 
		   new String[] {
			 "description", "specifies the data passing mechanism for parameters of an operation\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (passingModeEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the data passing mechanism is not precised\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (passingModeEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the data is being passed by reference to the operation\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (passingModeEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "used when the data is being passed by value to the operation\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "description", "A property is a structural feature.\r\nA property related to a classifier by ownedAttribute represents an attribute, and it may also represent an association end.\r\nIt relates an instance of the class to a value or collection of values of the type of the attribute.\r\nA property related to an Association by memberEnd or its specializations represents an end of the association. The type\r\nof property is the type of the end of the association.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "- If this property is owned by a class associated with a binary association, and the other end of the association is also owned by a class, then opposite gives the other end.\r\n- A multiplicity on an aggregate end of a composite aggregation must not have an upper bound greater than 1.\r\n- Subsetting may only occur when the context of the subsetting property conforms to the context of the subsetted property.\r\n- A redefined property must be inherited from a more general classifier containing the redefining property.\r\n- A subsetting property may strengthen the type of the subsetted property, and its upper bound may be less.\r\n- Only a navigable property can be marked as readOnly.\r\n- A derived union is derived.\r\n- A derived union is read only.\r\n- The value of isComposite is true only if aggregation is composite.\r\n-  A Property cannot be subset by a Property with the same name\r\n[source: UML superstructure v2.2]",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getProperty_AggregationKind(), 
		   source, 
		   new String[] {
			 "description", "Specifies the kind of aggregation that applies to the Property\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getProperty_IsDerived(), 
		   source, 
		   new String[] {
			 "description", "Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getProperty_IsReadOnly(), 
		   source, 
		   new String[] {
			 "description", "If true, the attribute may only be read, and not written\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getProperty_IsPartOfKey(), 
		   source, 
		   new String[] {
			 "description", "specifies whether this Property is involved as a key to a table of values\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "\"true\" if the Property is used as a key",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getProperty_Association(), 
		   source, 
		   new String[] {
			 "description", "an association relationship related to this Property\r\n[source: Capella study]\r\n\r\nReferences the association of which this property is a member, if any.\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (synchronismKindEEnum, 
		   source, 
		   new String[] {
			 "description", "specifies the synchronicity of an operation invocation\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (synchronismKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the synchronicity of the operation is not precised\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (synchronismKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used to specify that the invocation of the operation is synchronous, e.g. does not complete before the actions performed by the operation are complete\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (synchronismKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "used to specify that the invocation of the operation is asynchronous, i.e. it is potentially completed before the actions performed in the operation are completed\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "description", "Specification of an action to be performed by a class, to fulfill a predefined need.\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system,logical,physical,epbs",
			 "usage examples", "../img/usage_examples/operation_parameters.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getService_SynchronismKind(), 
		   source, 
		   new String[] {
			 "description", "specifies the synchronicity of the service call\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "see SynchronismKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getService_ThrownExceptions(), 
		   source, 
		   new String[] {
			 "description", "list of exceptions that can be raised by this service\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getService_Messages(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the Messages involving this Service\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getService_MessageReferences(), 
		   source, 
		   new String[] {
			 "description", "the reference objects to the Messages involving this Service\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unionEClass, 
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
		  (getUnion_Kind(), 
		   source, 
		   new String[] {
			 "description", "specifies the type of the union\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "see UnionKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getUnion_Discriminant(), 
		   source, 
		   new String[] {
			 "description", "Link to the discriminant union property",
			 "constraints", "n/a",
			 "comment/notes", "n/a"
		   });	
		addAnnotation
		  (getUnion_DefaultProperty(), 
		   source, 
		   new String[] {
			 "description", "Link to the default union property",
			 "constraints", "n/a",
			 "comment/notes", "n/a"
		   });	
		addAnnotation
		  (unionKindEEnum, 
		   source, 
		   new String[] {
			 "description", "defines the specific kind of a Union structure\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unionKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the structure represents a union \r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unionKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the structure represents possible variants of the same data\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unionPropertyEClass, 
		   source, 
		   new String[] {
			 "description", "(not used)",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "n/a",
			 "comment/notes", "not used/implemented as of Capella",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getUnionProperty_Qualifier(), 
		   source, 
		   new String[] {
			 "description", "(not used)",
			 "constraints", "n/a",
			 "comment/notes", "n/a"
		   });	
		addAnnotation
		  (unitEClass, 
		   source, 
		   new String[] {
			 "description", "A Unit is a quantity in terms of which the magnitudes of other quantities that have the same dimension can be stated. A\r\nunit often relies on precise and reproducible ways to measure the unit. For example, a unit of length such as meter may\r\nbe specified as a multiple of a particular wavelength of light. A unit may also specify less stable or precise ways to\r\nexpress some value, such as a cost expressed in some currency, or a severity rating measured by a numerical scale\r\n[source: SysML specification v1.1]\r\n",
			 "usage guideline", "a unit is typically associated to a physical dimension element",
			 "used in levels", "system/logical/physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (partitionableElementEClass, 
		   source, 
		   new String[] {
			 "description", "An element that can be structured into several partitions\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPartitionableElement_OwnedPartitions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of partitions contained in this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPartitionableElement_RepresentingPartitions(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the list of Partitions that are associated to this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (partitionEClass, 
		   source, 
		   new String[] {
			 "description", "A grouping of any set of model elements based on a set of criteria.\r\n1. activity diagram: A grouping of activity nodes and edges. Partitions divide the nodes and edges to constrain and show a view of the contained nodes. Partitions can share contents. They often correspond to organizational units in a business model. They may be used to allocate characteristics or resources among the nodes of an activity.\r\n2. architecture: A set of related classifiers or packages at the same level of abstraction or across layers in a layered architecture. A partition represents a vertical slice through an architecture, whereas a layer represents a horizontal slice.\r\n[source: SysML glossary for SysML v1.0]\r\n",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "description", "A port is an interaction point between a block or part and its environment that\r\nis connected with other ports via connectors\r\n[source: SysML specification v1.1]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "operational,system,logical,physical",
			 "arcardia_description", "The connection point of an exchange on an entity is called a port.",
			 "usage examples", "../img/usage_examples/ports_exchanges.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPort_IncomingPortRealizations(), 
		   source, 
		   new String[] {
			 "description", "contains the list of port realization link(s) pointing from other (typically lower level) port(s) to this port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPort_OutgoingPortRealizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of port realization links starting from this port, and pointing to other (typically higher-level) ports.\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPort_OwnedProtocols(), 
		   source, 
		   new String[] {
			 "description", "allows to associate state machines to this port, specifying the communication protocol of incoming data\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPort_IncomingPortAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of allocation links pointing from other model elements, to this port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPort_OutgoingPortAllocations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of allocations links, starting from this port towards other model elements to which this port needs to be allocated\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPort_ProvidedInterfaces(), 
		   source, 
		   new String[] {
			 "description", "lists the Interfaces that are provided through this port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPort_RequiredInterfaces(), 
		   source, 
		   new String[] {
			 "description", "lists the Interfaces that are required by this port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPort_OwnedPortRealizations(), 
		   source, 
		   new String[] {
			 "description", "the port realizations links that are owned/contained in this Port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPort_OwnedPortAllocations(), 
		   source, 
		   new String[] {
			 "description", "the port allocation links that are owned/contained in this Port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (portRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "a PortRealization is a specific kind of allocation link between two Ports (typically of different design levels, or of different nature)\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "../img/usage_examples/port_realization.png",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPortRealization_RealizedPort(), 
		   source, 
		   new String[] {
			 "description", "destiniation of the port realization : the port that is being realized\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPortRealization_RealizingPort(), 
		   source, 
		   new String[] {
			 "description", "the source of the Port realization : the port that is realizing another port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (portAllocationEClass, 
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
		  (getPortAllocation_AllocatedPort(), 
		   source, 
		   new String[] {
			 "description", "the \"destination\" of the allocation link : the port that is being allocated by another port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getPortAllocation_AllocatingPort(), 
		   source, 
		   new String[] {
			 "description", "the \"source\" of the allocation link : the port that is allocating the other port\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeItemEClass, 
		   source, 
		   new String[] {
			 "description", "Defined by functional characteristics that exist at a common boundary with co-functioning items and allow systems equipment to be compatible. \r\nAn exchange item describes a required or produced data.\r\nAn exchange item has an exchange mechanism\r\n[source:ARCADIA encyclopedia v0.8.0]",
			 "usage guideline", "an exchange item should be created whenever there is a need to group data type elements that are bound by an applicative meaning, and should be treated as a whole",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExchangeItem_ExchangeMechanism(), 
		   source, 
		   new String[] {
			 "description", "Communication principle associated to this exchange item\r\n[source:ARCADIA encyclopedia v0.8.0]",
			 "constraints", "none",
			 "type", "refer to ExchangeMechanism definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItem_OwnedElements(), 
		   source, 
		   new String[] {
			 "description", "Set of exchange item elements that form the structure of the structured exchange item\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItem_RealizedExchangeItems(), 
		   source, 
		   new String[] {
			 "description", "class(es) realized by this class",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItem_RealizingExchangeItems(), 
		   source, 
		   new String[] {
			 "description", "class(es) realizing this class",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItem_RealizingOperations(), 
		   source, 
		   new String[] {
			 "description", "class(es) realizing this class",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeItemElementEClass, 
		   source, 
		   new String[] {
			 "description", "a part of a structured exchange item\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExchangeItemElement_Kind(), 
		   source, 
		   new String[] {
			 "description", "refer to ElementKind description",
			 "constraints", "none",
			 "type", "refer to ElementKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItemElement_Direction(), 
		   source, 
		   new String[] {
			 "description", "specifies whether the parameter is an input, an output, or both.\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "see ParameterDirection definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItemElement_Composite(), 
		   source, 
		   new String[] {
			 "description", "n/a",
			 "constraints", "none",
			 "type", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItemElement_ReferencedProperties(), 
		   source, 
		   new String[] {
			 "description", "n/a",
			 "constraints", "none",
			 "type", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (informationRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "Realization link between two information items",
			 "usage guideline", "_todo_reviewed: To complete once documentation about extension process will be done",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum, 
		   source, 
		   new String[] {
			 "description", "Enumeration of the different exchange mechanisms\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "Exchange mechanism not defined",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "Continuous supply of a data\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "Sporadic supply of a data with a returned data\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "Asynchronous information that is taken into account rapidly\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "description", "Data taken into account (reading or writing) without taking care of producers or consumers\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (elementKindEEnum, 
		   source, 
		   new String[] {
			 "description", "enumeration listing the various possibilities regarding the visibility of a feature of a class\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (elementKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when ExchangeItemElement is described as a type for its ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (elementKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when ExchangeItemElement is described as a member for its ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (collectionKindEEnum, 
		   source, 
		   new String[] {
			 "description", "defines the specific kind of a Collection structure\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (collectionKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the collection is to be considered as an array of elements\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (collectionKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the collection is to be considered as a sequence (list) of elements\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exchangeItemRealizationEClass, 
		   source, 
		   new String[] {
			 "description", "Allocation link between exchange items and operation(s) of an interface that support them\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getExchangeItemRealization_RealizedItem(), 
		   source, 
		   new String[] {
			 "description", "the exchange item that is being realized by the operation\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getExchangeItemRealization_RealizingOperation(), 
		   source, 
		   new String[] {
			 "description", "the interface\'s operation that realizes the given exchange item\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractEventOperationEClass, 
		   source, 
		   new String[] {
			 "description", "the element triggered by the reception of the event",
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
		  (aggregationKindEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociationPkg_Visibility(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociationPkg_OwnedAssociations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociation_OwnedMembers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociation_NavigableMembers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_IsPrimitive(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_KeyParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_OwnedStateMachines(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_OwnedDataValues(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_RealizedClasses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_RealizingClasses(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (collectionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollection_IsPrimitive(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollection_Visibility(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollection_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollection_AggregationKind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollection_Type(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollection_Index(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollection_ContainedOperations(), 
		   source, 
		   new String[] {
			 "feature", "ownedFeatures"
		   });	
		addAnnotation
		  (collectionValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollectionValue_OwnedElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollectionValue_OwnedDefaultElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (collectionValueReferenceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (dataPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedClasses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedCollections(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedUnits(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataTypes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedSignals(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedMessages(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedExceptions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedStateEvents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (domainElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (keyPartEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getKeyPart_Property(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_Ordered(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_Unique(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_MinInclusive(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_MaxInclusive(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedDefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedNullValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinCard(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinLength(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxCard(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxLength(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_OwnedParameters(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_AllocatingOperations(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getOperation_AllocatedOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_RealizedExchangeItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getParameter_Direction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getParameter_PassingMode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (parameterDirectionEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (passingModeEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_AggregationKind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_IsDerived(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_IsReadOnly(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_IsPartOfKey(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (synchronismKindEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getService_SynchronismKind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getService_ThrownExceptions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (unionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnion_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnion_Discriminant(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnion_DefaultProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnion_ContainedUnionProperties(), 
		   source, 
		   new String[] {
			 "feature", "ownedFeatures"
		   });	
		addAnnotation
		  (unionKindEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (unionPropertyEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnionProperty_Qualifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (unitEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPartitionableElement_RepresentingPartitions(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getPort_OwnedProtocols(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPort_ProvidedInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPort_RequiredInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (exchangeItemEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItem_ExchangeMechanism(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItem_OwnedElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItem_OwnedExchangeItemInstances(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItem_AllocatorInterfaces(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getExchangeItem_RealizedExchangeItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItem_RealizingExchangeItems(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (getExchangeItem_RealizingOperations(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (exchangeItemElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemElement_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemElement_Direction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemElement_Composite(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemElement_ReferencedProperties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (exchangeItemInstanceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (exchangeMechanismEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (elementKindEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (collectionKindEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractEventOperation_InvokingSequenceMessages(), 
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
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/BusinessInformation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createBusinessInformationAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/BusinessInformation";	
		addAnnotation
		  (abstractInstanceEClass, 
		   source, 
		   new String[] {
			 "Label", "AbstractInstance"
		   });	
		addAnnotation
		  (aggregationKindEEnum, 
		   source, 
		   new String[] {
			 "Label", "AggregationKind"
		   });	
		addAnnotation
		  (associationPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "AssociationPkg"
		   });	
		addAnnotation
		  (getAssociationPkg_OwnedAssociations(), 
		   source, 
		   new String[] {
			 "Label", "ownedAssociations"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "Label", "Association"
		   });	
		addAnnotation
		  (getAssociation_OwnedMembers(), 
		   source, 
		   new String[] {
			 "Label", "members"
		   });	
		addAnnotation
		  (getAssociation_NavigableMembers(), 
		   source, 
		   new String[] {
			 "Label", "navigable"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "Label", "Class"
		   });	
		addAnnotation
		  (getClass_KeyParts(), 
		   source, 
		   new String[] {
			 "Label", "keyParts"
		   });	
		addAnnotation
		  (collectionEClass, 
		   source, 
		   new String[] {
			 "Label", "Collection"
		   });	
		addAnnotation
		  (getCollection_Type(), 
		   source, 
		   new String[] {
			 "Label", "type"
		   });	
		addAnnotation
		  (getCollection_ContainedOperations(), 
		   source, 
		   new String[] {
			 "Label", "operations"
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (dataPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "DataPkg"
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataPkgs(), 
		   source, 
		   new String[] {
			 "Label", "ownedDataPkgs"
		   });	
		addAnnotation
		  (getDataPkg_OwnedClasses(), 
		   source, 
		   new String[] {
			 "Label", "ownedClasses"
		   });	
		addAnnotation
		  (getDataPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
			 "Label", "ownedKeyParts"
		   });	
		addAnnotation
		  (getDataPkg_OwnedCollections(), 
		   source, 
		   new String[] {
			 "Label", "ownedCollections"
		   });	
		addAnnotation
		  (getDataPkg_OwnedUnits(), 
		   source, 
		   new String[] {
			 "Label", "ownedUnits"
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataTypes(), 
		   source, 
		   new String[] {
			 "Label", "ownedDataTypes"
		   });	
		addAnnotation
		  (getDataPkg_OwnedSignals(), 
		   source, 
		   new String[] {
			 "Label", "ownedSignals"
		   });	
		addAnnotation
		  (getDataPkg_OwnedMessages(), 
		   source, 
		   new String[] {
			 "Label", "ownedMessages"
		   });	
		addAnnotation
		  (getDataPkg_OwnedExceptions(), 
		   source, 
		   new String[] {
			 "Label", "ownedExceptions"
		   });	
		addAnnotation
		  (getDataPkg_OwnedStateEvents(), 
		   source, 
		   new String[] {
			 "Label", "ownedStateEvents"
		   });	
		addAnnotation
		  (domainElementEClass, 
		   source, 
		   new String[] {
			 "Label", "DomainElement"
		   });	
		addAnnotation
		  (keyPartEClass, 
		   source, 
		   new String[] {
			 "Label", "KeyPart"
		   });	
		addAnnotation
		  (getKeyPart_Property(), 
		   source, 
		   new String[] {
			 "Label", "property"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "Label", "Default Value"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "Label", "Min Value"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "Label", "Max Value"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "Label", "Null value"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinCard(), 
		   source, 
		   new String[] {
			 "Label", "Min Card"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinLength(), 
		   source, 
		   new String[] {
			 "Label", "Min Length"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxCard(), 
		   source, 
		   new String[] {
			 "Label", "Max Card"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxLength(), 
		   source, 
		   new String[] {
			 "Label", "Max Length"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "Label", "Operation"
		   });	
		addAnnotation
		  (getOperation_OwnedParameters(), 
		   source, 
		   new String[] {
			 "Label", "parameters"
		   });	
		addAnnotation
		  (operationAllocationEClass, 
		   source, 
		   new String[] {
			 "Label", "Operation Allocation"
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "Label", "Parameter"
		   });	
		addAnnotation
		  (parameterDirectionEEnum, 
		   source, 
		   new String[] {
			 "Label", "ParameterDirection"
		   });	
		addAnnotation
		  (passingModeEEnum, 
		   source, 
		   new String[] {
			 "Label", "PassingMode"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "Label", "Property"
		   });	
		addAnnotation
		  (getProperty_Association(), 
		   source, 
		   new String[] {
			 "Label", "association"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "Label", "Service"
		   });	
		addAnnotation
		  (getService_ThrownExceptions(), 
		   source, 
		   new String[] {
			 "Label", "thrownExceptions"
		   });	
		addAnnotation
		  (getService_Messages(), 
		   source, 
		   new String[] {
			 "Label", "messages"
		   });	
		addAnnotation
		  (getService_MessageReferences(), 
		   source, 
		   new String[] {
			 "Label", "messageReferences"
		   });	
		addAnnotation
		  (unionEClass, 
		   source, 
		   new String[] {
			 "Label", "Union"
		   });	
		addAnnotation
		  (getUnion_Discriminant(), 
		   source, 
		   new String[] {
			 "Label", "discriminant"
		   });	
		addAnnotation
		  (unionPropertyEClass, 
		   source, 
		   new String[] {
			 "Label", "UnionProperty"
		   });	
		addAnnotation
		  (getUnionProperty_Qualifier(), 
		   source, 
		   new String[] {
			 "Label", "qualifier"
		   });	
		addAnnotation
		  (unitEClass, 
		   source, 
		   new String[] {
			 "Label", "Unit"
		   });	
		addAnnotation
		  (partitionableElementEClass, 
		   source, 
		   new String[] {
			 "Label", "PartitionableElement"
		   });	
		addAnnotation
		  (getPartitionableElement_OwnedPartitions(), 
		   source, 
		   new String[] {
			 "Label", "ownedParts"
		   });	
		addAnnotation
		  (getPartitionableElement_RepresentingPartitions(), 
		   source, 
		   new String[] {
			 "Label", "parts"
		   });	
		addAnnotation
		  (partitionEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalPartition"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "Label", "Port"
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
		  (abstractInstanceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Property"
		   });	
		addAnnotation
		  (aggregationKindEEnum, 
		   source, 
		   new String[] {
			 "enum", "AggregationKind"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "enumLiteral", "NONE"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "enumLiteral", "SHARED"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "enumLiteral", "COMPOSITE"
		   });	
		addAnnotation
		  (associationPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package"
		   });	
		addAnnotation
		  (getAssociationPkg_OwnedAssociations(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Association",
			 "stereotype", "eng.Association"
		   });	
		addAnnotation
		  (getAssociation_OwnedMembers(), 
		   source, 
		   new String[] {
			 "featureName", "memberEnd",
			 "featureOwner", "Association"
		   });	
		addAnnotation
		  (getAssociation_NavigableMembers(), 
		   source, 
		   new String[] {
			 "featureName", "navigableOwnedEnd",
			 "featureOwner", "Association"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.Class"
		   });	
		addAnnotation
		  (getClass_IsPrimitive(), 
		   source, 
		   new String[] {
			 "featureName", "isPrimitive",
			 "featureOwner", "eng.Class",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getClass_KeyParts(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (collectionEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Component",
			 "stereotype", "eng.Collection"
		   });	
		addAnnotation
		  (getCollection_ContainedOperations(), 
		   source, 
		   new String[] {
			 "featureName", "ownedOperation",
			 "featureOwner", "Class"
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (dataPkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package",
			 "stereotype", "eng.DataPkg"
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getDataPkg_OwnedClasses(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getDataPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getDataPkg_OwnedCollections(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getDataPkg_OwnedUnits(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataTypes(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getDataPkg_OwnedSignals(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getDataPkg_OwnedMessages(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getDataPkg_OwnedExceptions(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (domainElementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.DomainElement"
		   });	
		addAnnotation
		  (keyPartEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.KeyPart"
		   });	
		addAnnotation
		  (getKeyPart_Property(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "featureName", "lowerValue",
			 "featureOwner", "MultiplicityElement"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "featureName", "upperValue",
			 "featureOwner", "MultiplicityElement"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinCard(), 
		   source, 
		   new String[] {
			 "featureName", "lowerValue",
			 "featureOwner", "MultiplicityElement"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinLength(), 
		   source, 
		   new String[] {
			 "featureName", "lowerValue",
			 "featureOwner", "MultiplicityElement"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxCard(), 
		   source, 
		   new String[] {
			 "featureName", "upperValue",
			 "featureOwner", "MultiplicityElement"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxLength(), 
		   source, 
		   new String[] {
			 "featureName", "upperValue",
			 "featureOwner", "MultiplicityElement"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Operation"
		   });	
		addAnnotation
		  (getOperation_OwnedParameters(), 
		   source, 
		   new String[] {
			 "featureName", "ownedParameter",
			 "featureOwner", "BehavioralFeature"
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Parameter",
			 "stereotype", "eng.Parameter"
		   });	
		addAnnotation
		  (getParameter_Direction(), 
		   source, 
		   new String[] {
			 "featureName", "direction",
			 "featureOwner", "Parameter"
		   });	
		addAnnotation
		  (getParameter_PassingMode(), 
		   source, 
		   new String[] {
			 "featureName", "passingMode",
			 "fromStereotype", "true",
			 "featureOwner", "eng.Parameter"
		   });	
		addAnnotation
		  (parameterDirectionEEnum, 
		   source, 
		   new String[] {
			 "enum", "ParameterDirectionKind"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "enumLiteral", "IN"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "enumLiteral", "OUT"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "enumLiteral", "INOUT"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "enumLiteral", "RETURN"
		   });	
		addAnnotation
		  (passingModeEEnum, 
		   source, 
		   new String[] {
			 "enum", "PassingMode"
		   });	
		addAnnotation
		  (passingModeEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "enumLiteral", "BY_REF"
		   });	
		addAnnotation
		  (passingModeEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "enumLiteral", "BY_VALUE"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Property",
			 "stereotype", "eng.Property"
		   });	
		addAnnotation
		  (getProperty_AggregationKind(), 
		   source, 
		   new String[] {
			 "featureName", "aggregation",
			 "featureOwner", "Property"
		   });	
		addAnnotation
		  (getProperty_IsReadOnly(), 
		   source, 
		   new String[] {
			 "featureName", "isReadOnly",
			 "featureOwner", "StructuralFeature"
		   });	
		addAnnotation
		  (getProperty_IsPartOfKey(), 
		   source, 
		   new String[] {
			 "featureName", "isPartOfKey",
			 "featureOwner", "eng.Property",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getProperty_Association(), 
		   source, 
		   new String[] {
			 "featureName", "association",
			 "featureOwner", "Property"
		   });	
		addAnnotation
		  (synchronismKindEEnum, 
		   source, 
		   new String[] {
			 "enum", "SynchronismKind"
		   });	
		addAnnotation
		  (synchronismKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "enumLiteral", "SYNCHRONOUS"
		   });	
		addAnnotation
		  (synchronismKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "enumLiteral", "ASYNCHRONOUS"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Operation",
			 "stereotype", "eng.Service"
		   });	
		addAnnotation
		  (getService_SynchronismKind(), 
		   source, 
		   new String[] {
			 "featureName", "synchronismKind",
			 "fromStereotype", "true",
			 "featureOwner", "eng.Service"
		   });	
		addAnnotation
		  (getService_ThrownExceptions(), 
		   source, 
		   new String[] {
			 "featureName", "raisedException",
			 "featureOwner", "BehavioralFeature"
		   });	
		addAnnotation
		  (getService_MessageReferences(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (unionEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.Union"
		   });	
		addAnnotation
		  (getUnion_Discriminant(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (unionPropertyEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Property",
			 "stereotype", "eng.UnionProperty"
		   });	
		addAnnotation
		  (getUnionProperty_Qualifier(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (unitEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.Unit"
		   });	
		addAnnotation
		  (partitionableElementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "StructuredClassifier"
		   });	
		addAnnotation
		  (getPartitionableElement_OwnedPartitions(), 
		   source, 
		   new String[] {
			 "featureName", "ownedAttribute",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (getPartitionableElement_RepresentingPartitions(), 
		   source, 
		   new String[] {
			 "featureName", "part",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (partitionEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Property"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Port"
		   });	
		addAnnotation
		  (getExchangeItemElement_Direction(), 
		   source, 
		   new String[] {
			 "featureName", "direction",
			 "featureOwner", "Parameter"
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
		  (abstractInstanceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Property",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractInstance_RepresentingInstanceRoles(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (aggregationKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::AggregationKind",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "This enumeration literal has no UML-SysML equivalence"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::AggregationKind::none",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::AggregationKind::shared",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (aggregationKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::AggregationKind::composite",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (associationPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAssociationPkg_Visibility(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::visibility",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAssociationPkg_OwnedAssociations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Association stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Association",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAssociation_OwnedMembers(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Association::ownedEnd, uml::Association::memberEnd",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [2..2]"
		   });	
		addAnnotation
		  (getAssociation_NavigableMembers(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Association::navigableOwnedEnd",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Class",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getClass_IsPrimitive(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getClass_KeyParts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency",
			 "explanation", "none",
			 "constraints", "uml::NamedElement::clientDependency elements on which KeyPart stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getClass_OwnedStateMachines(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Class::nestedClassifier",
			 "explanation", "none",
			 "constraints", "uml::Class::nestedClassifier elements on which StateMachine stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getClass_OwnedDataValues(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "uml::NamedElement::clientDependency elements on which DataValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getClass_OwnedInformationRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (collectionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::DataType",
			 "explanation", "DataType chosen because it has a containment reference to Operations, which is required to simplify the transformation of Collection::operations derived reference",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollection_IsPrimitive(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollection_Visibility(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::visibility",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollection_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollection_AggregationKind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollection_Type(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollection_Index(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollection_ContainedOperations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::DataType::ownedOperation",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractCollectionValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (collectionValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollectionValue_OwnedElements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollectionValue_OwnedDefaultElement(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (collectionValueReferenceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (dataPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which DataPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getDataPkg_OwnedClasses(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Class stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getDataPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which KeyPart stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getDataPkg_OwnedCollections(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Collectionstereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getDataPkg_OwnedUnits(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Unit stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataTypes(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which DataType stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getDataPkg_OwnedSignals(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Signal stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getDataPkg_OwnedMessages(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Message stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getDataPkg_OwnedExceptions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Excpetion stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getDataPkg_OwnedStateEvents(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (domainElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Class",
			 "constraints", "none"
		   });	
		addAnnotation
		  (keyPartEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getKeyPart_Property(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (multiplicityElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::MultiplicityElement",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_Ordered(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_Unique(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_MinInclusive(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_MaxInclusive(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which DataValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which DataValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinCard(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinLength(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which NumericValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxCard(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxLength(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which NumericValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Operation",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperation_OwnedParameters(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Operation::ownedParameter",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperation_AllocatingOperations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperation_AllocatedOperations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperation_OwnedOperationAllocation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which OperationAlllocation stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getOperation_OwnedExchangeItemRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which ExchangeItemRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (operationAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Allocations::Allocate",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationAllocation_AllocatedOperation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getOperationAllocation_AllocatingOperation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Parameter",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getParameter_Direction(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Parameter::direction",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getParameter_PassingMode(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ParameterDirectionKind",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ParameterDirectionKind::in",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ParameterDirectionKind::out",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ParameterDirectionKind::inout",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ParameterDirectionKind::return",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (parameterDirectionEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (passingModeEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (passingModeEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (passingModeEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (passingModeEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Property",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getProperty_AggregationKind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Property::aggregation",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getProperty_IsDerived(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Property::isDerived",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getProperty_IsReadOnly(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Property::isReadOnly",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getProperty_IsPartOfKey(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getProperty_Association(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Property::owningAssociation, uml::Property::association",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (synchronismKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "No equivalent enum on uml Operations. The two other candidates (CallOperationAction::isSynchronous or Message::messageSort) are not appropriate (different semantics)",
			 "constraints", "none"
		   });	
		addAnnotation
		  (synchronismKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (synchronismKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (synchronismKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Operation",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getService_SynchronismKind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "_todo_ Study the link with CallOperationAction::isSynchronous or Message::messageSort",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getService_ThrownExceptions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Operation::raisedException",
			 "explanation", "Exception should extend uml::Type",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getService_Messages(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getService_MessageReferences(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency",
			 "explanation", "none",
			 "constraints", "uml::NamedElement::clientDependency elements on which MessageReference stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (unionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Class",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getUnion_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getUnion_Discriminant(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getUnion_DefaultProperty(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getUnion_ContainedUnionProperties(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unionKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unionKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unionKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unionPropertyEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Property",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getUnionProperty_Qualifier(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (unitEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Blocks::Unit",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (partitionableElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::StructuredClassifier",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPartitionableElement_OwnedPartitions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::StructuredClassifier::ownedAttribute",
			 "explanation", "Even though this reference is derived and transient, it is mapped, to a non-derived reference to simplify the transformation since the containment and derived references are inversed between MA and UML",
			 "constraints", "uml::StructuredClassifier::owneddAttribute elements on which Partition stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getPartitionableElement_RepresentingPartitions(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (partitionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Property",
			 "constraints", "none"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Port",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPort_IncomingPortRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPort_OutgoingPortRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPort_OwnedProtocols(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPort_IncomingPortAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPort_OutgoingPortAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPort_ProvidedInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPort_RequiredInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPort_OwnedPortRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which PortRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getPort_OwnedPortAllocations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Some elements on which PortAllocation stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (portRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPortRealization_RealizedPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPortRealization_RealizingPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (portAllocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Allocations::Allocate",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPortAllocation_AllocatedPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPortAllocation_AllocatingPort(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeItemEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Operation",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItem_ExchangeMechanism(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItem_OwnedElements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Operation::ownedParameter",
			 "explanation", "none",
			 "constraints", "uml::Operation::ownedParameter elements on which ExchangeItemElement stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getExchangeItem_OwnedInformationRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItem_OwnedExchangeItemInstances(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItem_AllocatorInterfaces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeItemElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Parameter",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemElement_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemElement_Direction(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Parameter::direction",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemElement_Composite(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemElement_ReferencedProperties(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeItemInstanceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (informationRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Comment",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (exchangeMechanismEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (elementKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (elementKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (elementKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (collectionKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (collectionKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "This enumeration literal has no UML-SysML equivalence"
		   });	
		addAnnotation
		  (collectionKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "This enumeration literal has no UML-SysML equivalence"
		   });	
		addAnnotation
		  (exchangeItemRealizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Realization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemRealization_RealizedItem(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getExchangeItemRealization_RealizingOperation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractEventOperationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::ReceiveOperationEvent::operation\r\numl::SentOperationEvent::operation",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractEventOperation_InvokingSequenceMessages(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
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
		  (getAbstractInstance_RepresentingInstanceRoles(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_RealizedClasses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_RealizingClasses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollection_ContainedOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_AllocatingOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_AllocatedOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_RealizedExchangeItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationAllocation_AllocatedOperation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperationAllocation_AllocatingOperation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_Association(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getService_Messages(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnion_ContainedUnionProperties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPartitionableElement_OwnedPartitions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPartitionableElement_RepresentingPartitions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPort_IncomingPortRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPort_OutgoingPortRealizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPort_IncomingPortAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPort_OutgoingPortAllocations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPortRealization_RealizedPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPortRealization_RealizingPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPortAllocation_AllocatedPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPortAllocation_AllocatingPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItem_AllocatorInterfaces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItem_RealizedExchangeItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItem_RealizingExchangeItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItem_RealizingOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemRealization_RealizedItem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExchangeItemRealization_RealizingOperation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractEventOperation_InvokingSequenceMessages(), 
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
		  (getAssociationPkg_OwnedAssociations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociation_OwnedMembers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociation_NavigableMembers(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_KeyParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollection_ContainedOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollectionValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedClasses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedKeyParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedCollections(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedUnits(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedDataTypes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedSignals(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedMessages(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedExceptions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataPkg_OwnedStateEvents(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getKeyPart_Property(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedDefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedNullValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinCard(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMinLength(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxCard(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMultiplicityElement_OwnedMaxLength(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_OwnedParameters(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_Association(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getService_ThrownExceptions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getService_Messages(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getService_MessageReferences(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnion_Discriminant(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnionProperty_Qualifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPartitionableElement_OwnedPartitions(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPartitionableElement_RepresentingPartitions(), 
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
		  (associationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (keyPartEClass, 
		   source, 
		   new String[] {
		   });
	}

} //InformationPackageImpl
