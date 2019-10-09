/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationItem;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkExchanger;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationLinkProtocol;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Message;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.MessageReferencePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Signal;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.SignalInstance;

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
public class CommunicationPackageImpl extends EPackageImpl implements CommunicationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageReferencePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationLinkExchangerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationLinkKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationLinkProtocolEEnum = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationPackageImpl() {
		super(eNS_URI, CommunicationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommunicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationPackage init() {
		if (isInited) return (CommunicationPackage)EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI);

		// Obtain or create and register package
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommunicationPackageImpl());

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
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) : DatavaluePackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		theCommunicationPackage.createPackageContents();
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
		theDatatypePackage.createPackageContents();
		theDatavaluePackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationPackage.initializePackageContents();
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
		theDatatypePackage.initializePackageContents();
		theDatavaluePackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationPackage.eNS_URI, theCommunicationPackage);
		return theCommunicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationItem() {
		return communicationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationItem_Visibility() {
		return (EAttribute)communicationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationItem_OwnedStateMachines() {
		return (EReference)communicationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationItem_Properties() {
		return (EReference)communicationItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getException() {
		return exceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageReference() {
		return messageReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageReference_Message() {
		return (EReference)messageReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageReferencePkg() {
		return messageReferencePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageReferencePkg_OwnedMessageReferences() {
		return (EReference)messageReferencePkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_SignalInstances() {
		return (EReference)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalInstance() {
		return signalInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationLink() {
		return communicationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationLink_Kind() {
		return (EAttribute)communicationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationLink_Protocol() {
		return (EAttribute)communicationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLink_ExchangeItem() {
		return (EReference)communicationLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationLinkExchanger() {
		return communicationLinkExchangerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_OwnedCommunicationLinks() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Produce() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Consume() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Send() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Receive() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Call() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Execute() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Write() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Access() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Acquire() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationLinkExchanger_Transmit() {
		return (EReference)communicationLinkExchangerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationLinkKind() {
		return communicationLinkKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationLinkProtocol() {
		return communicationLinkProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationFactory getCommunicationFactory() {
		return (CommunicationFactory)getEFactoryInstance();
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
		communicationItemEClass = createEClass(COMMUNICATION_ITEM);
		createEAttribute(communicationItemEClass, COMMUNICATION_ITEM__VISIBILITY);
		createEReference(communicationItemEClass, COMMUNICATION_ITEM__OWNED_STATE_MACHINES);
		createEReference(communicationItemEClass, COMMUNICATION_ITEM__PROPERTIES);

		exceptionEClass = createEClass(EXCEPTION);

		messageEClass = createEClass(MESSAGE);

		messageReferenceEClass = createEClass(MESSAGE_REFERENCE);
		createEReference(messageReferenceEClass, MESSAGE_REFERENCE__MESSAGE);

		messageReferencePkgEClass = createEClass(MESSAGE_REFERENCE_PKG);
		createEReference(messageReferencePkgEClass, MESSAGE_REFERENCE_PKG__OWNED_MESSAGE_REFERENCES);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__SIGNAL_INSTANCES);

		signalInstanceEClass = createEClass(SIGNAL_INSTANCE);

		communicationLinkEClass = createEClass(COMMUNICATION_LINK);
		createEAttribute(communicationLinkEClass, COMMUNICATION_LINK__KIND);
		createEAttribute(communicationLinkEClass, COMMUNICATION_LINK__PROTOCOL);
		createEReference(communicationLinkEClass, COMMUNICATION_LINK__EXCHANGE_ITEM);

		communicationLinkExchangerEClass = createEClass(COMMUNICATION_LINK_EXCHANGER);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__PRODUCE);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__CONSUME);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__SEND);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__RECEIVE);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__CALL);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__EXECUTE);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__WRITE);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__ACCESS);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__ACQUIRE);
		createEReference(communicationLinkExchangerEClass, COMMUNICATION_LINK_EXCHANGER__TRANSMIT);

		// Create enums
		communicationLinkKindEEnum = createEEnum(COMMUNICATION_LINK_KIND);
		communicationLinkProtocolEEnum = createEEnum(COMMUNICATION_LINK_PROTOCOL);
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
		DatavaluePackage theDatavaluePackage = (DatavaluePackage)EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI);
		CapellacommonPackage theCapellacommonPackage = (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		communicationItemEClass.getESuperTypes().add(theCapellacorePackage.getClassifier());
		communicationItemEClass.getESuperTypes().add(theDatavaluePackage.getDataValueContainer());
		exceptionEClass.getESuperTypes().add(this.getCommunicationItem());
		messageEClass.getESuperTypes().add(this.getCommunicationItem());
		messageReferenceEClass.getESuperTypes().add(theCapellacorePackage.getRelationship());
		messageReferencePkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		signalEClass.getESuperTypes().add(this.getCommunicationItem());
		signalEClass.getESuperTypes().add(theBehaviorPackage.getAbstractSignal());
		signalInstanceEClass.getESuperTypes().add(theInformationPackage.getAbstractInstance());
		communicationLinkEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());

		// Initialize classes and features; add operations and parameters
		initEClass(communicationItemEClass, CommunicationItem.class, "CommunicationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationItem_Visibility(), theCapellacorePackage.getVisibilityKind(), "visibility", null, 0, 1, CommunicationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationItem_OwnedStateMachines(), theCapellacommonPackage.getStateMachine(), null, "ownedStateMachines", null, 0, -1, CommunicationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationItem_Properties(), theInformationPackage.getProperty(), null, "properties", null, 0, -1, CommunicationItem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exceptionEClass, org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageReferenceEClass, MessageReference.class, "MessageReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageReference_Message(), this.getMessage(), null, "message", null, 1, 1, MessageReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageReferencePkgEClass, MessageReferencePkg.class, "MessageReferencePkg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageReferencePkg_OwnedMessageReferences(), this.getMessageReference(), null, "ownedMessageReferences", null, 0, -1, MessageReferencePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_SignalInstances(), this.getSignalInstance(), null, "signalInstances", null, 0, -1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalInstanceEClass, SignalInstance.class, "SignalInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationLinkEClass, CommunicationLink.class, "CommunicationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationLink_Kind(), this.getCommunicationLinkKind(), "kind", null, 0, 1, CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationLink_Protocol(), this.getCommunicationLinkProtocol(), "protocol", null, 0, 1, CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLink_ExchangeItem(), theInformationPackage.getExchangeItem(), null, "exchangeItem", null, 0, 1, CommunicationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationLinkExchangerEClass, CommunicationLinkExchanger.class, "CommunicationLinkExchanger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationLinkExchanger_OwnedCommunicationLinks(), this.getCommunicationLink(), null, "ownedCommunicationLinks", null, 0, -1, CommunicationLinkExchanger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Produce(), this.getCommunicationLink(), null, "produce", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Consume(), this.getCommunicationLink(), null, "consume", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Send(), this.getCommunicationLink(), null, "send", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Receive(), this.getCommunicationLink(), null, "receive", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Call(), this.getCommunicationLink(), null, "call", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Execute(), this.getCommunicationLink(), null, "execute", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Write(), this.getCommunicationLink(), null, "write", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Access(), this.getCommunicationLink(), null, "access", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Acquire(), this.getCommunicationLink(), null, "acquire", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationLinkExchanger_Transmit(), this.getCommunicationLink(), null, "transmit", null, 0, -1, CommunicationLinkExchanger.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(communicationLinkKindEEnum, CommunicationLinkKind.class, "CommunicationLinkKind");
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.UNSET);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.PRODUCE);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.CONSUME);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.SEND);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.RECEIVE);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.CALL);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.EXECUTE);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.WRITE);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.ACCESS);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.ACQUIRE);
		addEEnumLiteral(communicationLinkKindEEnum, CommunicationLinkKind.TRANSMIT);

		initEEnum(communicationLinkProtocolEEnum, CommunicationLinkProtocol.class, "CommunicationLinkProtocol");
		addEEnumLiteral(communicationLinkProtocolEEnum, CommunicationLinkProtocol.UNSET);
		addEEnumLiteral(communicationLinkProtocolEEnum, CommunicationLinkProtocol.UNICAST);
		addEEnumLiteral(communicationLinkProtocolEEnum, CommunicationLinkProtocol.MULTICAST);
		addEEnumLiteral(communicationLinkProtocolEEnum, CommunicationLinkProtocol.BROADCAST);
		addEEnumLiteral(communicationLinkProtocolEEnum, CommunicationLinkProtocol.SYNCHRONOUS);
		addEEnumLiteral(communicationLinkProtocolEEnum, CommunicationLinkProtocol.ASYNCHRONOUS);
		addEEnumLiteral(communicationLinkProtocolEEnum, CommunicationLinkProtocol.READ);
		addEEnumLiteral(communicationLinkProtocolEEnum, CommunicationLinkProtocol.ACCEPT);

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
			 "description", "sub-package containing the elements invovled in communication between elements (messages, signals, ...)\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "system,logical,physical",
			 "usage examples", "none",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "n/a"
		   });	
		addAnnotation
		  (communicationItemEClass, 
		   source, 
		   new String[] {
			 "description", "Generic class serving as a common parent for dedicated communication artifacts\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getCommunicationItem_Visibility(), 
		   source, 
		   new String[] {
			 "description", "refer to VisibilityKind description\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to VisibilityKind definition\r\n[source: Capella study]",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationItem_OwnedStateMachines(), 
		   source, 
		   new String[] {
			 "description", "state machines associated to this communication item, as a mean to specify communication protocols\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationItem_Properties(), 
		   source, 
		   new String[] {
			 "description", "attributes of the communication item\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (exceptionEClass, 
		   source, 
		   new String[] {
			 "description", "A piece of  information raised (typically by an operation) to mention the occurence of an abnormal condition\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "not used/implemented as of Capella 1.0.3",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "description", "A piece of information flowing between two model elements\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (messageReferenceEClass, 
		   source, 
		   new String[] {
			 "description", "Implementation class supporting the referencing of a Message element\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getMessageReference_Message(), 
		   source, 
		   new String[] {
			 "description", "The message being referenced\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (messageReferencePkgEClass, 
		   source, 
		   new String[] {
			 "description", "a container for message references elements\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getMessageReferencePkg_OwnedMessageReferences(), 
		   source, 
		   new String[] {
			 "description", "the list of MessageReference elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (signalEClass, 
		   source, 
		   new String[] {
			 "description", "A signal is a specification of send request instances communicated between objects. The receiving object handles the\r\nreceived request instances as specified by its receptions. The data carried by a send request (which was passed to it by the\r\nsend invocation occurrence that caused that request) are represented as attributes of the signal. A signal is defined\r\nindependently of the classifiers handling the signal occurrence\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getSignal_SignalInstances(), 
		   source, 
		   new String[] {
			 "description", "list of signal instances associated with this Signal\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (signalInstanceEClass, 
		   source, 
		   new String[] {
			 "description", "instance of a Signal element\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum, 
		   source, 
		   new String[] {
			 "description", "enumeration listing the various possibilities of communication links\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink protocol is not yet set",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a production of ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a comsumption of ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a sending of ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a reception of ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a call of ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe an execution of ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a writing of ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe an access to the ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe an acquisition of ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a transmission of ExchangeItem",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum, 
		   source, 
		   new String[] {
			 "description", "enumeration listing the various possibilities for the protocol of the communication link",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink protocol is not yet set",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a sending of ExchangeItem using the unicast protocol",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a sending of ExchangeItem using the multicast protocol",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a sending of ExchangeItem using the broadcast protocol",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a call of ExchangeItem using the synchronous protocol",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a call of ExchangeItem using the asynchronous protocol",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a access to the ExchangeItem by reading it",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "description", "used when the CommunicationLink is used to describe a access to the ExchangeItem by accepting it",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkEClass, 
		   source, 
		   new String[] {
			 "description", "describes a link of communication using exchange items",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLink_Kind(), 
		   source, 
		   new String[] {
			 "description", "refer to CommunicationLinkKind description",
			 "constraints", "none",
			 "type", "refer to CommunicationLinkKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLink_Protocol(), 
		   source, 
		   new String[] {
			 "description", "refer to CommunicationLinkProtocol description",
			 "constraints", "none",
			 "type", "refer to CommunicationLinkProtocol definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLink_ExchangeItem(), 
		   source, 
		   new String[] {
			 "description", "describes the exchange item related to the link",
			 "constraints", "none",
			 "type", "refer to CommunicationLinkProtocol definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (communicationLinkExchangerEClass, 
		   source, 
		   new String[] {
			 "description", "describes an element which can communicate using ExchangeItems",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_OwnedCommunicationLinks(), 
		   source, 
		   new String[] {
			 "description", "list of all communication links owned by the communication exchanger",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Produce(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all production CommunicationLinks",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Consume(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all consumption CommunicationLinks",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Send(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all sending CommunicationLinks",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Receive(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all receiving CommunicationLinks",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Call(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all calling CommunicationLinks",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Execute(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all execution CommunicationLinks",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Write(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all writing CommunicationLinks",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Access(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all accessing CommunicationLinks",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Acquire(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all acquiring CommunicationLinks",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Transmit(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) list of all transmitting CommunicationLinks",
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
		  (getCommunicationItem_Visibility(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationItem_OwnedStateMachines(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (exceptionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (messageReferenceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMessageReference_Message(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMessageReferencePkg_OwnedMessageReferences(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (signalEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSignal_SignalInstances(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (signalInstanceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (communicationLinkKindEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (communicationLinkEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLink_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLink_Protocol(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLink_ExchangeItem(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_OwnedCommunicationLinks(), 
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
		  (communicationItemEClass, 
		   source, 
		   new String[] {
			 "Label", "CommunicationItem"
		   });	
		addAnnotation
		  (getCommunicationItem_Properties(), 
		   source, 
		   new String[] {
			 "Label", "properties"
		   });	
		addAnnotation
		  (exceptionEClass, 
		   source, 
		   new String[] {
			 "Label", "Exception"
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "Label", "Message"
		   });	
		addAnnotation
		  (messageReferenceEClass, 
		   source, 
		   new String[] {
			 "Label", "MessageReference"
		   });	
		addAnnotation
		  (getMessageReference_Message(), 
		   source, 
		   new String[] {
			 "Label", "message"
		   });	
		addAnnotation
		  (messageReferencePkgEClass, 
		   source, 
		   new String[] {
			 "Label", "MessageReferencePkg"
		   });	
		addAnnotation
		  (getMessageReferencePkg_OwnedMessageReferences(), 
		   source, 
		   new String[] {
			 "Label", "ownedMessageReferences"
		   });	
		addAnnotation
		  (signalEClass, 
		   source, 
		   new String[] {
			 "Label", "Signal"
		   });	
		addAnnotation
		  (getSignal_SignalInstances(), 
		   source, 
		   new String[] {
			 "Label", "signalInstances"
		   });	
		addAnnotation
		  (signalInstanceEClass, 
		   source, 
		   new String[] {
			 "Label", "SignalInstance"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_OwnedCommunicationLinks(), 
		   source, 
		   new String[] {
			 "Label", "ownedCommunicationLinks"
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
		  (communicationItemEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Classifier"
		   });	
		addAnnotation
		  (getCommunicationItem_Properties(), 
		   source, 
		   new String[] {
			 "featureName", "ownedAttribute",
			 "featureOwner", "StructuredClassifier"
		   });	
		addAnnotation
		  (exceptionEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.Exception"
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.Message"
		   });	
		addAnnotation
		  (messageReferenceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.MessageReference"
		   });	
		addAnnotation
		  (getMessageReference_Message(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (messageReferencePkgEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package"
		   });	
		addAnnotation
		  (getMessageReferencePkg_OwnedMessageReferences(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (signalEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Signal",
			 "stereotype", "eng.Signal"
		   });	
		addAnnotation
		  (getSignal_SignalInstances(), 
		   source, 
		   new String[] {
			 "featureName", "ownedAttribute",
			 "featureOwner", "Signal"
		   });	
		addAnnotation
		  (signalInstanceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Property",
			 "stereotype", "eng.SignalInstance"
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
		  (communicationItemEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationItem_Visibility(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::visibility",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationItem_OwnedStateMachines(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "Elements are contained in the nearest possible parent container.",
			 "constraints", "Elements on which StateMachine stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getCommunicationItem_Properties(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "no found equivalent since the three children (Exception, Signal, Message) have different hierarchies. The specific rule should  create a package, stored the Properties in this package, and finally create a packageImport under the NamedElement reference for the element",
			 "constraints", "elements inside the imported package on which a Property stereotype or any stereotype that inherits from it  is applied"
		   });	
		addAnnotation
		  (exceptionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Class",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Message",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (messageReferenceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMessageReference_Message(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (messageReferencePkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getMessageReferencePkg_OwnedMessageReferences(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which MessageReference stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (signalEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Signal",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getSignal_SignalInstances(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Signal::ownedAttribute",
			 "explanation", "none",
			 "constraints", "uml::Signal::ownedAttribute elements on which SignalInstance stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (signalInstanceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Property",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkKindEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkProtocolEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLink_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLink_Protocol(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLink_ExchangeItem(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (communicationLinkExchangerEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_OwnedCommunicationLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Produce(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Consume(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Send(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Receive(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Call(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Execute(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Write(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Access(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Acquire(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Transmit(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
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
		  (getCommunicationItem_Properties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMessageReference_Message(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getMessageReferencePkg_OwnedMessageReferences(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSignal_SignalInstances(), 
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
		  (getCommunicationItem_Properties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Produce(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Consume(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Send(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Receive(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Call(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Execute(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Write(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Access(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Acquire(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCommunicationLinkExchanger_Transmit(), 
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
		  (messageReferenceEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CommunicationPackageImpl
