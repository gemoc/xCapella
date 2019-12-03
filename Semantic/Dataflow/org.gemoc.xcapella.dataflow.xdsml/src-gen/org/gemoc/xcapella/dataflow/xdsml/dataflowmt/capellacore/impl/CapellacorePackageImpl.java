/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractAnnotation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractDependenciesPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractExchangeItemPkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractModellingStructure;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractPropertyValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Allocation;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.BooleanPropertyValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellacoreFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellacorePackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Constraint;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.EnumerationPropertyLiteral;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.EnumerationPropertyType;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.EnumerationPropertyValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.FloatPropertyValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralClass;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.GeneralizableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Generalization;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.IntegerPropertyValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolvedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Involvement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolverElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.KeyValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingArchitecture;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingArchitecturePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ModellingBlock;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedRelationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamingRule;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.PropertyValueGroup;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.PropertyValuePkg;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ReuseLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ReuseableStructure;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.ReuserStructure;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.StringPropertyValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Structure;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Trace;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Type;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.TypedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.VisibilityKind;

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
public class CapellacorePackageImpl extends EPackageImpl implements CapellacorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capellaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractModellingStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modellingBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modellingArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modellingArchitecturePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reuseLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reuseableStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reuserStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractExchangeItemPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass involvementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass involverElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass involvedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationPropertyLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValueGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyValuePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDependenciesPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellacorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CapellacorePackageImpl() {
		super(eNS_URI, CapellacoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CapellacorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CapellacorePackage init() {
		if (isInited) return (CapellacorePackage)EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI);

		// Obtain or create and register package
		CapellacorePackageImpl theCapellacorePackage = (CapellacorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CapellacorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CapellacorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SharedmodelPackageImpl theSharedmodelPackage = (SharedmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) instanceof SharedmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) : SharedmodelPackage.eINSTANCE);
		EmdePackageImpl theEmdePackage = (EmdePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) instanceof EmdePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) : EmdePackage.eINSTANCE);
		OaPackageImpl theOaPackage = (OaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) instanceof OaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) : OaPackage.eINSTANCE);
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
		theCapellacorePackage.createPackageContents();
		theSharedmodelPackage.createPackageContents();
		theEmdePackage.createPackageContents();
		theOaPackage.createPackageContents();
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
		theCapellacorePackage.initializePackageContents();
		theSharedmodelPackage.initializePackageContents();
		theEmdePackage.initializePackageContents();
		theOaPackage.initializePackageContents();
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
		theCapellacorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CapellacorePackage.eNS_URI, theCapellacorePackage);
		return theCapellacorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapellaElement() {
		return capellaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapellaElement_Summary() {
		return (EAttribute)capellaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapellaElement_Description() {
		return (EAttribute)capellaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapellaElement_Review() {
		return (EAttribute)capellaElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapellaElement_OwnedPropertyValues() {
		return (EReference)capellaElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapellaElement_OwnedEnumerationPropertyTypes() {
		return (EReference)capellaElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapellaElement_AppliedPropertyValues() {
		return (EReference)capellaElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapellaElement_OwnedPropertyValueGroups() {
		return (EReference)capellaElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapellaElement_AppliedPropertyValueGroups() {
		return (EReference)capellaElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapellaElement_Status() {
		return (EReference)capellaElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapellaElement_Features() {
		return (EReference)capellaElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapellaElement_AppliedRequirements() {
		return (EReference)capellaElementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedTraces() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ContainedGenericTraces() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ContainedRequirementsTraces() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_NamingRules() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedRelationship() {
		return namedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedRelationship_NamingRules() {
		return (EReference)namedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_OwnedPropertyValuePkgs() {
		return (EReference)structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractModellingStructure() {
		return abstractModellingStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModellingStructure_OwnedArchitectures() {
		return (EReference)abstractModellingStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModellingStructure_OwnedArchitecturePkgs() {
		return (EReference)abstractModellingStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModellingBlock() {
		return modellingBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModellingArchitecture() {
		return modellingArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModellingArchitecturePkg() {
		return modellingArchitecturePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_TypedElements() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAnnotation() {
		return abstractAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractAnnotation_Content() {
		return (EAttribute)abstractAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingRule() {
		return namingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamingRule_TargetType() {
		return (EAttribute)namingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValue() {
		return keyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValue_Key() {
		return (EAttribute)keyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValue_Value() {
		return (EAttribute)keyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReuseLink() {
		return reuseLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReuseLink_Reused() {
		return (EReference)reuseLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReuseLink_Reuser() {
		return (EReference)reuseLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReuseableStructure() {
		return reuseableStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReuseableStructure_ReuseLinks() {
		return (EReference)reuseableStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReuserStructure() {
		return reuserStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReuserStructure_ReuseLinks() {
		return (EReference)reuserStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReuserStructure_OwnedReuseLinks() {
		return (EReference)reuserStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizableElement() {
		return generalizableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizableElement_Abstract() {
		return (EAttribute)generalizableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizableElement_OwnedGeneralizations() {
		return (EReference)generalizableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizableElement_SuperGeneralizations() {
		return (EReference)generalizableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizableElement_SubGeneralizations() {
		return (EReference)generalizableElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizableElement_Super() {
		return (EReference)generalizableElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizableElement_Sub() {
		return (EReference)generalizableElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_OwnedFeatures() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_ContainedProperties() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralClass() {
		return generalClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralClass_Visibility() {
		return (EAttribute)generalClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralClass_ContainedOperations() {
		return (EReference)generalClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralClass_NestedGeneralClasses() {
		return (EReference)generalClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Super() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Sub() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsAbstract() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsStatic() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Visibility() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractExchangeItemPkg() {
		return abstractExchangeItemPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractExchangeItemPkg_OwnedExchangeItems() {
		return (EReference)abstractExchangeItemPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvolvement() {
		return involvementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvolvement_Involver() {
		return (EReference)involvementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvolvement_Involved() {
		return (EReference)involvementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvolverElement() {
		return involverElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvolverElement_InvolvedInvolvements() {
		return (EReference)involverElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvolvedElement() {
		return involvedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvolvedElement_InvolvingInvolvements() {
		return (EReference)involvedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPropertyValue() {
		return abstractPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPropertyValue_InvolvedElements() {
		return (EReference)abstractPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractPropertyValue_ValuedElements() {
		return (EReference)abstractPropertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringPropertyValue() {
		return stringPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringPropertyValue_Value() {
		return (EAttribute)stringPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerPropertyValue() {
		return integerPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerPropertyValue_Value() {
		return (EAttribute)integerPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanPropertyValue() {
		return booleanPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanPropertyValue_Value() {
		return (EAttribute)booleanPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatPropertyValue() {
		return floatPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatPropertyValue_Value() {
		return (EAttribute)floatPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationPropertyValue() {
		return enumerationPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationPropertyValue_Type() {
		return (EReference)enumerationPropertyValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationPropertyValue_Value() {
		return (EReference)enumerationPropertyValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationPropertyType() {
		return enumerationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationPropertyType_OwnedLiterals() {
		return (EReference)enumerationPropertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationPropertyLiteral() {
		return enumerationPropertyLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValueGroup() {
		return propertyValueGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyValueGroup_ValuedElements() {
		return (EReference)propertyValueGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyValuePkg() {
		return propertyValuePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDependenciesPkg() {
		return abstractDependenciesPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellacoreFactory getCapellacoreFactory() {
		return (CapellacoreFactory)getEFactoryInstance();
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
		capellaElementEClass = createEClass(CAPELLA_ELEMENT);
		createEAttribute(capellaElementEClass, CAPELLA_ELEMENT__SUMMARY);
		createEAttribute(capellaElementEClass, CAPELLA_ELEMENT__DESCRIPTION);
		createEAttribute(capellaElementEClass, CAPELLA_ELEMENT__REVIEW);
		createEReference(capellaElementEClass, CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES);
		createEReference(capellaElementEClass, CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES);
		createEReference(capellaElementEClass, CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES);
		createEReference(capellaElementEClass, CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS);
		createEReference(capellaElementEClass, CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS);
		createEReference(capellaElementEClass, CAPELLA_ELEMENT__STATUS);
		createEReference(capellaElementEClass, CAPELLA_ELEMENT__FEATURES);
		createEReference(capellaElementEClass, CAPELLA_ELEMENT__APPLIED_REQUIREMENTS);

		namedElementEClass = createEClass(NAMED_ELEMENT);

		relationshipEClass = createEClass(RELATIONSHIP);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__OWNED_TRACES);
		createEReference(namespaceEClass, NAMESPACE__CONTAINED_GENERIC_TRACES);
		createEReference(namespaceEClass, NAMESPACE__CONTAINED_REQUIREMENTS_TRACES);
		createEReference(namespaceEClass, NAMESPACE__NAMING_RULES);

		namedRelationshipEClass = createEClass(NAMED_RELATIONSHIP);
		createEReference(namedRelationshipEClass, NAMED_RELATIONSHIP__NAMING_RULES);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__OWNED_PROPERTY_VALUE_PKGS);

		abstractModellingStructureEClass = createEClass(ABSTRACT_MODELLING_STRUCTURE);
		createEReference(abstractModellingStructureEClass, ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURES);
		createEReference(abstractModellingStructureEClass, ABSTRACT_MODELLING_STRUCTURE__OWNED_ARCHITECTURE_PKGS);

		modellingBlockEClass = createEClass(MODELLING_BLOCK);

		modellingArchitectureEClass = createEClass(MODELLING_ARCHITECTURE);

		modellingArchitecturePkgEClass = createEClass(MODELLING_ARCHITECTURE_PKG);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__TYPED_ELEMENTS);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		traceEClass = createEClass(TRACE);

		abstractAnnotationEClass = createEClass(ABSTRACT_ANNOTATION);
		createEAttribute(abstractAnnotationEClass, ABSTRACT_ANNOTATION__CONTENT);

		namingRuleEClass = createEClass(NAMING_RULE);
		createEAttribute(namingRuleEClass, NAMING_RULE__TARGET_TYPE);

		constraintEClass = createEClass(CONSTRAINT);

		keyValueEClass = createEClass(KEY_VALUE);
		createEAttribute(keyValueEClass, KEY_VALUE__KEY);
		createEAttribute(keyValueEClass, KEY_VALUE__VALUE);

		reuseLinkEClass = createEClass(REUSE_LINK);
		createEReference(reuseLinkEClass, REUSE_LINK__REUSED);
		createEReference(reuseLinkEClass, REUSE_LINK__REUSER);

		reuseableStructureEClass = createEClass(REUSEABLE_STRUCTURE);
		createEReference(reuseableStructureEClass, REUSEABLE_STRUCTURE__REUSE_LINKS);

		reuserStructureEClass = createEClass(REUSER_STRUCTURE);
		createEReference(reuserStructureEClass, REUSER_STRUCTURE__REUSE_LINKS);
		createEReference(reuserStructureEClass, REUSER_STRUCTURE__OWNED_REUSE_LINKS);

		generalizableElementEClass = createEClass(GENERALIZABLE_ELEMENT);
		createEAttribute(generalizableElementEClass, GENERALIZABLE_ELEMENT__ABSTRACT);
		createEReference(generalizableElementEClass, GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS);
		createEReference(generalizableElementEClass, GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS);
		createEReference(generalizableElementEClass, GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS);
		createEReference(generalizableElementEClass, GENERALIZABLE_ELEMENT__SUPER);
		createEReference(generalizableElementEClass, GENERALIZABLE_ELEMENT__SUB);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__OWNED_FEATURES);
		createEReference(classifierEClass, CLASSIFIER__CONTAINED_PROPERTIES);

		generalClassEClass = createEClass(GENERAL_CLASS);
		createEAttribute(generalClassEClass, GENERAL_CLASS__VISIBILITY);
		createEReference(generalClassEClass, GENERAL_CLASS__CONTAINED_OPERATIONS);
		createEReference(generalClassEClass, GENERAL_CLASS__NESTED_GENERAL_CLASSES);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__SUPER);
		createEReference(generalizationEClass, GENERALIZATION__SUB);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__IS_ABSTRACT);
		createEAttribute(featureEClass, FEATURE__IS_STATIC);
		createEAttribute(featureEClass, FEATURE__VISIBILITY);

		abstractExchangeItemPkgEClass = createEClass(ABSTRACT_EXCHANGE_ITEM_PKG);
		createEReference(abstractExchangeItemPkgEClass, ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS);

		allocationEClass = createEClass(ALLOCATION);

		involvementEClass = createEClass(INVOLVEMENT);
		createEReference(involvementEClass, INVOLVEMENT__INVOLVER);
		createEReference(involvementEClass, INVOLVEMENT__INVOLVED);

		involverElementEClass = createEClass(INVOLVER_ELEMENT);
		createEReference(involverElementEClass, INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS);

		involvedElementEClass = createEClass(INVOLVED_ELEMENT);
		createEReference(involvedElementEClass, INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS);

		abstractPropertyValueEClass = createEClass(ABSTRACT_PROPERTY_VALUE);
		createEReference(abstractPropertyValueEClass, ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS);
		createEReference(abstractPropertyValueEClass, ABSTRACT_PROPERTY_VALUE__VALUED_ELEMENTS);

		stringPropertyValueEClass = createEClass(STRING_PROPERTY_VALUE);
		createEAttribute(stringPropertyValueEClass, STRING_PROPERTY_VALUE__VALUE);

		integerPropertyValueEClass = createEClass(INTEGER_PROPERTY_VALUE);
		createEAttribute(integerPropertyValueEClass, INTEGER_PROPERTY_VALUE__VALUE);

		booleanPropertyValueEClass = createEClass(BOOLEAN_PROPERTY_VALUE);
		createEAttribute(booleanPropertyValueEClass, BOOLEAN_PROPERTY_VALUE__VALUE);

		floatPropertyValueEClass = createEClass(FLOAT_PROPERTY_VALUE);
		createEAttribute(floatPropertyValueEClass, FLOAT_PROPERTY_VALUE__VALUE);

		enumerationPropertyValueEClass = createEClass(ENUMERATION_PROPERTY_VALUE);
		createEReference(enumerationPropertyValueEClass, ENUMERATION_PROPERTY_VALUE__TYPE);
		createEReference(enumerationPropertyValueEClass, ENUMERATION_PROPERTY_VALUE__VALUE);

		enumerationPropertyTypeEClass = createEClass(ENUMERATION_PROPERTY_TYPE);
		createEReference(enumerationPropertyTypeEClass, ENUMERATION_PROPERTY_TYPE__OWNED_LITERALS);

		enumerationPropertyLiteralEClass = createEClass(ENUMERATION_PROPERTY_LITERAL);

		propertyValueGroupEClass = createEClass(PROPERTY_VALUE_GROUP);
		createEReference(propertyValueGroupEClass, PROPERTY_VALUE_GROUP__VALUED_ELEMENTS);

		propertyValuePkgEClass = createEClass(PROPERTY_VALUE_PKG);

		abstractDependenciesPkgEClass = createEClass(ABSTRACT_DEPENDENCIES_PKG);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
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
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);
		RequirementPackage theRequirementPackage = (RequirementPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);
		CapellacommonPackage theCapellacommonPackage = (CapellacommonPackage)EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		capellaElementEClass.getESuperTypes().add(theModellingcorePackage.getTraceableElement());
		capellaElementEClass.getESuperTypes().add(theModellingcorePackage.getPublishableElement());
		namedElementEClass.getESuperTypes().add(theModellingcorePackage.getAbstractNamedElement());
		namedElementEClass.getESuperTypes().add(this.getCapellaElement());
		relationshipEClass.getESuperTypes().add(theModellingcorePackage.getAbstractRelationship());
		relationshipEClass.getESuperTypes().add(this.getCapellaElement());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());
		namedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		namedRelationshipEClass.getESuperTypes().add(this.getNamedElement());
		structureEClass.getESuperTypes().add(this.getNamespace());
		abstractModellingStructureEClass.getESuperTypes().add(this.getReuserStructure());
		modellingBlockEClass.getESuperTypes().add(this.getType());
		modellingArchitectureEClass.getESuperTypes().add(this.getStructure());
		modellingArchitecturePkgEClass.getESuperTypes().add(this.getStructure());
		typeEClass.getESuperTypes().add(theModellingcorePackage.getAbstractType());
		typeEClass.getESuperTypes().add(this.getNamespace());
		typedElementEClass.getESuperTypes().add(theModellingcorePackage.getAbstractTypedElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		traceEClass.getESuperTypes().add(this.getRelationship());
		traceEClass.getESuperTypes().add(theModellingcorePackage.getAbstractTrace());
		abstractAnnotationEClass.getESuperTypes().add(this.getCapellaElement());
		namingRuleEClass.getESuperTypes().add(this.getAbstractAnnotation());
		constraintEClass.getESuperTypes().add(this.getNamedElement());
		constraintEClass.getESuperTypes().add(theModellingcorePackage.getAbstractConstraint());
		keyValueEClass.getESuperTypes().add(this.getCapellaElement());
		reuseLinkEClass.getESuperTypes().add(this.getRelationship());
		reuseableStructureEClass.getESuperTypes().add(this.getStructure());
		reuserStructureEClass.getESuperTypes().add(this.getStructure());
		generalizableElementEClass.getESuperTypes().add(this.getType());
		classifierEClass.getESuperTypes().add(this.getGeneralizableElement());
		generalClassEClass.getESuperTypes().add(this.getClassifier());
		generalClassEClass.getESuperTypes().add(theModellingcorePackage.getFinalizableElement());
		generalizationEClass.getESuperTypes().add(this.getRelationship());
		featureEClass.getESuperTypes().add(this.getNamedElement());
		abstractExchangeItemPkgEClass.getESuperTypes().add(this.getStructure());
		allocationEClass.getESuperTypes().add(this.getRelationship());
		allocationEClass.getESuperTypes().add(theModellingcorePackage.getAbstractTrace());
		involvementEClass.getESuperTypes().add(this.getRelationship());
		involverElementEClass.getESuperTypes().add(this.getCapellaElement());
		involvedElementEClass.getESuperTypes().add(this.getCapellaElement());
		abstractPropertyValueEClass.getESuperTypes().add(this.getNamedElement());
		stringPropertyValueEClass.getESuperTypes().add(this.getAbstractPropertyValue());
		integerPropertyValueEClass.getESuperTypes().add(this.getAbstractPropertyValue());
		booleanPropertyValueEClass.getESuperTypes().add(this.getAbstractPropertyValue());
		floatPropertyValueEClass.getESuperTypes().add(this.getAbstractPropertyValue());
		enumerationPropertyValueEClass.getESuperTypes().add(this.getAbstractPropertyValue());
		enumerationPropertyTypeEClass.getESuperTypes().add(this.getNamedElement());
		enumerationPropertyLiteralEClass.getESuperTypes().add(this.getNamedElement());
		propertyValueGroupEClass.getESuperTypes().add(this.getNamespace());
		propertyValuePkgEClass.getESuperTypes().add(this.getStructure());
		abstractDependenciesPkgEClass.getESuperTypes().add(this.getStructure());

		// Initialize classes and features; add operations and parameters
		initEClass(capellaElementEClass, CapellaElement.class, "CapellaElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapellaElement_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapellaElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapellaElement_Review(), ecorePackage.getEString(), "review", null, 0, 1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapellaElement_OwnedPropertyValues(), this.getAbstractPropertyValue(), null, "ownedPropertyValues", null, 0, -1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapellaElement_OwnedEnumerationPropertyTypes(), this.getEnumerationPropertyType(), null, "ownedEnumerationPropertyTypes", null, 0, -1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapellaElement_AppliedPropertyValues(), this.getAbstractPropertyValue(), null, "appliedPropertyValues", null, 0, -1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapellaElement_OwnedPropertyValueGroups(), this.getPropertyValueGroup(), null, "ownedPropertyValueGroups", null, 0, -1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapellaElement_AppliedPropertyValueGroups(), this.getPropertyValueGroup(), null, "appliedPropertyValueGroups", null, 0, -1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapellaElement_Status(), this.getEnumerationPropertyLiteral(), null, "status", null, 0, 1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapellaElement_Features(), this.getEnumerationPropertyLiteral(), null, "features", null, 0, -1, CapellaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapellaElement_AppliedRequirements(), theRequirementPackage.getRequirement(), null, "appliedRequirements", null, 0, -1, CapellaElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_OwnedTraces(), this.getTrace(), null, "ownedTraces", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_ContainedGenericTraces(), theCapellacommonPackage.getGenericTrace(), null, "containedGenericTraces", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_ContainedRequirementsTraces(), theRequirementPackage.getRequirementsTrace(), null, "containedRequirementsTraces", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_NamingRules(), this.getNamingRule(), null, "namingRules", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedRelationshipEClass, NamedRelationship.class, "NamedRelationship", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedRelationship_NamingRules(), this.getNamingRule(), null, "namingRules", null, 0, -1, NamedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_OwnedPropertyValuePkgs(), this.getPropertyValuePkg(), null, "ownedPropertyValuePkgs", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractModellingStructureEClass, AbstractModellingStructure.class, "AbstractModellingStructure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractModellingStructure_OwnedArchitectures(), this.getModellingArchitecture(), null, "ownedArchitectures", null, 0, -1, AbstractModellingStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractModellingStructure_OwnedArchitecturePkgs(), this.getModellingArchitecturePkg(), null, "ownedArchitecturePkgs", null, 0, -1, AbstractModellingStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modellingBlockEClass, ModellingBlock.class, "ModellingBlock", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modellingArchitectureEClass, ModellingArchitecture.class, "ModellingArchitecture", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modellingArchitecturePkgEClass, ModellingArchitecturePkg.class, "ModellingArchitecturePkg", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_TypedElements(), this.getTypedElement(), null, "typedElements", null, 0, -1, Type.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractAnnotationEClass, AbstractAnnotation.class, "AbstractAnnotation", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractAnnotation_Content(), ecorePackage.getEString(), "content", null, 0, 1, AbstractAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namingRuleEClass, NamingRule.class, "NamingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamingRule_TargetType(), ecorePackage.getEString(), "targetType", null, 0, 1, NamingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyValueEClass, KeyValue.class, "KeyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValue_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, KeyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reuseLinkEClass, ReuseLink.class, "ReuseLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReuseLink_Reused(), this.getReuseableStructure(), null, "reused", null, 1, 1, ReuseLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReuseLink_Reuser(), this.getReuserStructure(), null, "reuser", null, 1, 1, ReuseLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reuseableStructureEClass, ReuseableStructure.class, "ReuseableStructure", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReuseableStructure_ReuseLinks(), this.getReuseLink(), null, "reuseLinks", null, 0, -1, ReuseableStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reuserStructureEClass, ReuserStructure.class, "ReuserStructure", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReuserStructure_ReuseLinks(), this.getReuseLink(), null, "reuseLinks", null, 0, -1, ReuserStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReuserStructure_OwnedReuseLinks(), this.getReuseLink(), null, "ownedReuseLinks", null, 0, -1, ReuserStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizableElementEClass, GeneralizableElement.class, "GeneralizableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizableElement_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, GeneralizableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizableElement_OwnedGeneralizations(), this.getGeneralization(), null, "ownedGeneralizations", null, 0, -1, GeneralizableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizableElement_SuperGeneralizations(), this.getGeneralization(), null, "superGeneralizations", null, 0, -1, GeneralizableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizableElement_SubGeneralizations(), this.getGeneralization(), null, "subGeneralizations", null, 0, -1, GeneralizableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizableElement_Super(), this.getGeneralizableElement(), this.getGeneralizableElement_Sub(), "super", null, 0, -1, GeneralizableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralizableElement_Sub(), this.getGeneralizableElement(), this.getGeneralizableElement_Super(), "sub", null, 0, -1, GeneralizableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_OwnedFeatures(), this.getFeature(), null, "ownedFeatures", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_ContainedProperties(), theInformationPackage.getProperty(), null, "containedProperties", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(generalClassEClass, GeneralClass.class, "GeneralClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralClass_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, GeneralClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralClass_ContainedOperations(), theInformationPackage.getOperation(), null, "containedOperations", null, 0, -1, GeneralClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralClass_NestedGeneralClasses(), this.getGeneralClass(), null, "nestedGeneralClasses", null, 0, -1, GeneralClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_Super(), this.getGeneralizableElement(), null, "super", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_Sub(), this.getGeneralizableElement(), null, "sub", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractExchangeItemPkgEClass, AbstractExchangeItemPkg.class, "AbstractExchangeItemPkg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractExchangeItemPkg_OwnedExchangeItems(), theInformationPackage.getExchangeItem(), null, "ownedExchangeItems", null, 0, -1, AbstractExchangeItemPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationEClass, Allocation.class, "Allocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(involvementEClass, Involvement.class, "Involvement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvolvement_Involver(), this.getInvolverElement(), null, "involver", null, 1, 1, Involvement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInvolvement_Involved(), this.getInvolvedElement(), null, "involved", null, 1, 1, Involvement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(involverElementEClass, InvolverElement.class, "InvolverElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvolverElement_InvolvedInvolvements(), this.getInvolvement(), null, "involvedInvolvements", null, 0, -1, InvolverElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(involvedElementEClass, InvolvedElement.class, "InvolvedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvolvedElement_InvolvingInvolvements(), this.getInvolvement(), null, "involvingInvolvements", null, 0, -1, InvolvedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractPropertyValueEClass, AbstractPropertyValue.class, "AbstractPropertyValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractPropertyValue_InvolvedElements(), this.getCapellaElement(), null, "involvedElements", null, 0, -1, AbstractPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractPropertyValue_ValuedElements(), this.getCapellaElement(), null, "valuedElements", null, 0, -1, AbstractPropertyValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stringPropertyValueEClass, StringPropertyValue.class, "StringPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringPropertyValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerPropertyValueEClass, IntegerPropertyValue.class, "IntegerPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerPropertyValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanPropertyValueEClass, BooleanPropertyValue.class, "BooleanPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanPropertyValue_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatPropertyValueEClass, FloatPropertyValue.class, "FloatPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatPropertyValue_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, FloatPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationPropertyValueEClass, EnumerationPropertyValue.class, "EnumerationPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationPropertyValue_Type(), this.getEnumerationPropertyType(), null, "type", null, 0, 1, EnumerationPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationPropertyValue_Value(), this.getEnumerationPropertyLiteral(), null, "value", null, 0, 1, EnumerationPropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationPropertyTypeEClass, EnumerationPropertyType.class, "EnumerationPropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationPropertyType_OwnedLiterals(), this.getEnumerationPropertyLiteral(), null, "ownedLiterals", null, 0, -1, EnumerationPropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationPropertyLiteralEClass, EnumerationPropertyLiteral.class, "EnumerationPropertyLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyValueGroupEClass, PropertyValueGroup.class, "PropertyValueGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyValueGroup_ValuedElements(), this.getCapellaElement(), null, "valuedElements", null, 0, -1, PropertyValueGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(propertyValuePkgEClass, PropertyValuePkg.class, "PropertyValuePkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractDependenciesPkgEClass, AbstractDependenciesPkg.class, "AbstractDependenciesPkg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.UNSET);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE);

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
		// http://www.polarsys.org/capella/2007/BusinessInformation
		createBusinessInformationAnnotations();
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
		  (capellaElementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Element",
			 "stereotype", "eng.CapellaElement"
		   });	
		addAnnotation
		  (namespaceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Namespace"
		   });	
		addAnnotation
		  (getNamespace_OwnedTraces(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getNamespace_NamingRules(), 
		   source, 
		   new String[] {
			 "featureName", "ownedComment",
			 "featureOwner", "Element"
		   });	
		addAnnotation
		  (namedRelationshipEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Relationship"
		   });	
		addAnnotation
		  (getNamedRelationship_NamingRules(), 
		   source, 
		   new String[] {
			 "featureName", "ownedComment",
			 "featureOwner", "Element"
		   });	
		addAnnotation
		  (structureEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Element",
			 "stereotype", "eng.CapellaElement"
		   });	
		addAnnotation
		  (typeEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Type"
		   });	
		addAnnotation
		  (traceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency"
		   });	
		addAnnotation
		  (getAbstractAnnotation_Content(), 
		   source, 
		   new String[] {
			 "featureName", "body",
			 "featureOwner", "Comment"
		   });	
		addAnnotation
		  (namingRuleEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Comment",
			 "stereotype", "eng.NamingRule"
		   });	
		addAnnotation
		  (getNamingRule_TargetType(), 
		   source, 
		   new String[] {
			 "featureName", "targetType",
			 "featureOwner", "eng.NamingRule",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (keyValueEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Comment",
			 "stereotype", "eng.KeyValue"
		   });	
		addAnnotation
		  (getKeyValue_Key(), 
		   source, 
		   new String[] {
			 "featureName", "key",
			 "featureOwner", "eng.KeyValue",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getKeyValue_Value(), 
		   source, 
		   new String[] {
			 "featureName", "body",
			 "featureOwner", "Comment"
		   });	
		addAnnotation
		  (reuseLinkEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.ReuseLink"
		   });	
		addAnnotation
		  (getReuseLink_Reused(), 
		   source, 
		   new String[] {
			 "featureName", "supplier",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getReuseLink_Reuser(), 
		   source, 
		   new String[] {
			 "featureName", "client",
			 "featureOwner", "Dependency"
		   });	
		addAnnotation
		  (getReuseableStructure_ReuseLinks(), 
		   source, 
		   new String[] {
			 "umlOppositeReference", "supplier",
			 "umlOppositeReferenceOwner", "Dependency"
		   });	
		addAnnotation
		  (getReuserStructure_ReuseLinks(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getReuserStructure_OwnedReuseLinks(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getGeneralizableElement_Abstract(), 
		   source, 
		   new String[] {
			 "featureName", "isAbstract",
			 "featureOwner", "Classifier"
		   });	
		addAnnotation
		  (getGeneralizableElement_OwnedGeneralizations(), 
		   source, 
		   new String[] {
			 "featureName", "generalization",
			 "featureOwner", "Classifier"
		   });	
		addAnnotation
		  (getGeneralizableElement_SuperGeneralizations(), 
		   source, 
		   new String[] {
			 "featureName", "generalization",
			 "featureOwner", "Classifier"
		   });	
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Classifier"
		   });	
		addAnnotation
		  (generalClassEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Classifier"
		   });	
		addAnnotation
		  (getGeneralClass_ContainedOperations(), 
		   source, 
		   new String[] {
			 "featureName", "ownedOperation",
			 "featureOwner", "GeneralClass"
		   });	
		addAnnotation
		  (getGeneralClass_NestedGeneralClasses(), 
		   source, 
		   new String[] {
			 "featureName", "nestedClassifier",
			 "featureOwner", "Class"
		   });	
		addAnnotation
		  (generalizationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Generalization",
			 "stereotype", "eng.Generalization"
		   });	
		addAnnotation
		  (getGeneralization_Super(), 
		   source, 
		   new String[] {
			 "featureName", "general",
			 "featureOwner", "Generalization"
		   });	
		addAnnotation
		  (allocationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency"
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
			 "description", "CapellaCore aims at defining the core concepts of the other languages.\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "none",
			 "constraints", "This package depends on the model ModellingCore.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (capellaElementEClass, 
		   source, 
		   new String[] {
			 "description", "A Capella element is a model element that is lockable, has a version and has incoming and outgoing traces, it has a summary and a description.\r\n[source:Capella study]\r\n\r\nA capella element can be compared to an UML element : An element is a constituent of a model.\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "n/a"
		   });	
		addAnnotation
		  (getCapellaElement_Summary(), 
		   source, 
		   new String[] {
			 "description", "Summary of the element\r\n[Capella study]",
			 "constraints", "None",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapellaElement_Description(), 
		   source, 
		   new String[] {
			 "description", "Description of the Capella element\r\n[Capella study]",
			 "constraints", "None",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapellaElement_Review(), 
		   source, 
		   new String[] {
			 "description", "Review description on the Capella element",
			 "constraints", "None",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapellaElement_OwnedPropertyValues(), 
		   source, 
		   new String[] {
			 "description", "the property values that are contained in this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapellaElement_OwnedEnumerationPropertyTypes(), 
		   source, 
		   new String[] {
			 "description", "the enumeration property types that are contained in this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapellaElement_AppliedPropertyValues(), 
		   source, 
		   new String[] {
			 "description", "the property values that are applied on this element (whether they are actually stored under this element or not)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapellaElement_OwnedPropertyValueGroups(), 
		   source, 
		   new String[] {
			 "description", "the property value groups that are stored/contained in this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapellaElement_AppliedPropertyValueGroups(), 
		   source, 
		   new String[] {
			 "description", "the property value groups that apply to this element (whether or not they are actually stored under this element)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getCapellaElement_Status(), 
		   source, 
		   new String[] {
			 "description", "the enumeration property literal that applies to this element",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "description", "A named element is a Capella element that has a name\r\n[source:Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (relationshipEClass, 
		   source, 
		   new String[] {
			 "description", "Relationship is an abstract concept that specifies some kind of relationship between elements.\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (namespaceEClass, 
		   source, 
		   new String[] {
			 "description", "A namespace is an element in a model that contains a set of named elements that can be identified by name.\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getNamespace_OwnedTraces(), 
		   source, 
		   new String[] {
			 "description", "the trace link contained/stored in this element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getNamespace_ContainedGenericTraces(), 
		   source, 
		   new String[] {
			 "description", "Link to the set of typed elements which eAttribute type value is the owner type.\r\n[source:Capella study]",
			 "constraints", "None",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getNamespace_ContainedRequirementsTraces(), 
		   source, 
		   new String[] {
			 "description", "Link to the set of typed elements which eAttribute type value is the owner type.\r\n[source:Capella study]",
			 "constraints", "None",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getNamespace_NamingRules(), 
		   source, 
		   new String[] {
			 "description", "specifications of constraints on the naming of the element\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (namedRelationshipEClass, 
		   source, 
		   new String[] {
			 "description", "A named relationship is a relationship that has a name\r\n[source:Capella study]\r\n\r\nA named relationship can be compared to an UML Association :\r\nAn association specifies a semantic relationship that can occur between typed instances. It has at least two ends\r\nrepresented by properties, each of which is connected to the type of the end. More than one end of the association may\r\nhave the same type.\r\nAn end property of an association that is owned by an end class or that is a navigable owned end of the association\r\nindicates that the association is navigable from the opposite ends; otherwise, the association is not navigable from the\r\nopposite ends.\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getNamedRelationship_NamingRules(), 
		   source, 
		   new String[] {
			 "description", "specifications of constraints applying to the naming of the relationship\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (structureEClass, 
		   source, 
		   new String[] {
			 "description", "The relationships between the components that contribute to the properties of the whole, and enable them to interact (inter-relate).\r\n[source: SysML glossary for SysML v1.0]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getStructure_OwnedPropertyValuePkgs(), 
		   source, 
		   new String[] {
			 "description", "Link to packages that contain light extensions property values\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractModellingStructureEClass, 
		   source, 
		   new String[] {
			 "description", "An abstract modelling structure is a base structure for a model.\r\nFor example, a system engineering is an abstract modelling structure.\r\n[source:Capella study]",
			 "usage guideline", "System enginering is an abstract modelling structure\r\n[source:Capella study]",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "",
			 "constraints", "None",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractModellingStructure_OwnedArchitectures(), 
		   source, 
		   new String[] {
			 "description", "the modeling architectures contained in this structure\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractModellingStructure_OwnedArchitecturePkgs(), 
		   source, 
		   new String[] {
			 "description", "the architecture packages contained in this structure\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (modellingBlockEClass, 
		   source, 
		   new String[] {
			 "description", "A modular unit that describes the structure of a system or element.\r\nA class (or block) that cannot be directly instantiated. Contrast: concrete class.\r\n[source:SysML v1.1]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (modellingArchitectureEClass, 
		   source, 
		   new String[] {
			 "description", "the base class supporting the definition of the structure of the model at a given design level.\r\n[source: Capella study]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (modellingArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "description", "a container for modelling architectures\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (typeEClass, 
		   source, 
		   new String[] {
			 "description", "A type represents a set of values. A typed element that has this type is constrained to represent values within this set.\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getType_TypedElements(), 
		   source, 
		   new String[] {
			 "description", "Link to the set of typed elements which eAttribute type value is the owner type.\r\n[source:Capella study]",
			 "constraints", "None",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (typedElementEClass, 
		   source, 
		   new String[] {
			 "description", "A typed element is an element that has a type that serves as a constraint on the range of values the element can represent.\r\nTyped element is an abstract metaclass.\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getTypedElement_Type(), 
		   source, 
		   new String[] {
			 "description", "The type of the TypedElement\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (traceEClass, 
		   source, 
		   new String[] {
			 "description", "A dependency that indicates a historical or process relationship between two elements that represent the same concept without specific rules for deriving one from the other. Trace dependencies are used to track requirements and changes across models.\r\n[source: SysML glossary for SysML v1.0]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractAnnotationEClass, 
		   source, 
		   new String[] {
			 "description", "An abstract Annotation can be compared to an UML comment : A comment gives the ability to attach various remarks to elements. A comment carries no semantic force, but may contain information that is useful to a modeler.\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractAnnotation_Content(), 
		   source, 
		   new String[] {
			 "description", "The textual content of the annotation (free format)\r\n[source:Capella study]",
			 "constraints", "None",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (namingRuleEClass, 
		   source, 
		   new String[] {
			 "description", "Naming rule to apply to instances which type is equal to targetType",
			 "usage guideline", "this is used whenever there is a need to constraint the naming of a given type of element",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getNamingRule_TargetType(), 
		   source, 
		   new String[] {
			 "description", "Type to which instances the naming rule has to be applied",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "description", "A constraint is a condition or restriction expressed in natural language text or in a machine readable language for the purpose of declaring some of the semantics of an element\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (keyValueEClass, 
		   source, 
		   new String[] {
			 "description", "a generic key/value pair used to index data\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getKeyValue_Key(), 
		   source, 
		   new String[] {
			 "description", "(textual) content representing the key\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getKeyValue_Value(), 
		   source, 
		   new String[] {
			 "description", "textual content representing the value associated to the key\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (reuseLinkEClass, 
		   source, 
		   new String[] {
			 "description", "Link of reusability between a reuser and a reused structure\r\n[Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getReuseLink_Reused(), 
		   source, 
		   new String[] {
			 "description", "Link to the structure that is reused\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getReuseLink_Reuser(), 
		   source, 
		   new String[] {
			 "constraints", "none",
			 "description", "Link to the structure that reuses\r\n[Capella study]",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (reuseableStructureEClass, 
		   source, 
		   new String[] {
			 "description", "specialization of a structure, to add the semantic of a package that is intended to be reused across various architectures\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getReuseableStructure_ReuseLinks(), 
		   source, 
		   new String[] {
			 "description", "Link to the set of reused links of this structure\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (reuserStructureEClass, 
		   source, 
		   new String[] {
			 "description", "a structure that is capable of leveraging existing other structures to build upon them, i.e. reuse them.\r\n[source: Capella study]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getReuserStructure_ReuseLinks(), 
		   source, 
		   new String[] {
			 "description", "the reuse links that involve this structure\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getReuserStructure_OwnedReuseLinks(), 
		   source, 
		   new String[] {
			 "description", "the reuse links that are stored in this structure (may or may not involve it)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (generalizableElementEClass, 
		   source, 
		   new String[] {
			 "description", "A generalizable element is an abstract metaclass.\r\nA generalizable element is a type and can own generalizations, thereby making it possible to define generalization relationships to\r\nother generalizable elements.\r\nA generalizable element can specify a generalization hierarchy by referencing its general classifiers.\r\nA generalizable element is a redefinable element, meaning that it is possible to redefine nested classifiers.\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getGeneralizableElement_Abstract(), 
		   source, 
		   new String[] {
			 "description", "specifies whether this classifier is abstract or concrete\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getGeneralizableElement_OwnedGeneralizations(), 
		   source, 
		   new String[] {
			 "description", "the links to this classifier\'s parent(s)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getGeneralizableElement_SuperGeneralizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the links to this classifier\'s parent(s)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getGeneralizableElement_SubGeneralizations(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) the links to this classifier\'s child(ren)\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getGeneralizableElement_Super(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) parent classifiers\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getGeneralizableElement_Sub(), 
		   source, 
		   new String[] {
			 "description", "(automatically computed) children classifiers\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
			 "description", "A classifier is a namespace whose members can include features.\r\nA classifier is an abstract metaclass.\r\nA classifier is a type.\r\nA classifier is a redefinable element, meaning that it is possible to redefine nested classifiers.\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getClassifier_OwnedFeatures(), 
		   source, 
		   new String[] {
			 "description", "the features contained in this classifier\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (generalClassEClass, 
		   source, 
		   new String[] {
			 "description", "an abstract concept allowing the nesting of classes in classes\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getGeneralClass_Visibility(), 
		   source, 
		   new String[] {
			 "description", "the visibility of this class (refer to VisibilityKind definition)\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to VisibilityKind",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getGeneralClass_ContainedOperations(), 
		   source, 
		   new String[] {
			 "description", "The operations owned by the general class. The association is ordered\r\n[source: UML superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getGeneralClass_NestedGeneralClasses(), 
		   source, 
		   new String[] {
			 "description", "the classes contained/nested into this class\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (generalizationEClass, 
		   source, 
		   new String[] {
			 "description", "A generalization is a taxonomic relationship between a more general classifier and a more specific classifier. Each instance of the specific classifier is also an indirect instance of the general classifier. Thus, the specific classifier inherits the features of the more general classifier.\r\n[source:Capella study]",
			 "usage guideline", "used to declare a parent/child relationship between two classes",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getGeneralization_Super(), 
		   source, 
		   new String[] {
			 "description", "Same as UML Generalization general association : References the general classifier in the Generalization relationship.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getGeneralization_Sub(), 
		   source, 
		   new String[] {
			 "description", "Same as UML Generalization specific association : References the specializing classifier in the Generalization relationship.\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "description", "A feature declares a behavioral or structural characteristic of instances of classifiers.\r\n[source:UML Superstructure v2.2]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFeature_IsAbstract(), 
		   source, 
		   new String[] {
			 "description", "specifies whether the Feature is abstract or concrete\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "true is Feature is abstract",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFeature_IsStatic(), 
		   source, 
		   new String[] {
			 "description", "Specifies whether the Feature is static\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "true if Feature is static",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getFeature_Visibility(), 
		   source, 
		   new String[] {
			 "description", "the type of visibility of this feature\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to VisibilityKind",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractExchangeItemPkgEClass, 
		   source, 
		   new String[] {
			 "description", "a container for exchange items\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractExchangeItemPkg_OwnedExchangeItems(), 
		   source, 
		   new String[] {
			 "description", "the exchange items contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (allocationEClass, 
		   source, 
		   new String[] {
			 "description", "Allocation is similar to SysML Allocate concept : It is a mechanism for associating elements of different types, or in\r\ndifferent hierarchies, at an abstract level. Allocate is used for assessing user model consistency and directing future design\r\nactivity. It is expected that an \"allocate\" relationship between model elements is a precursor to a more concrete\r\nrelationship between the elements, their properties, operations, attributes, or sub-classes.\r\n[source:SysML v1.1]",
			 "usage guideline", "Allocation is an abstract concept and cannot be used directly.",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "Allocation is an abstract concept",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (involvementEClass, 
		   source, 
		   new String[] {
			 "description", "Link that denotes some involvement relationship of an element that is involved in another one\r\n[Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInvolvement_Involver(), 
		   source, 
		   new String[] {
			 "description", "Link to the element that involves\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getInvolvement_Involved(), 
		   source, 
		   new String[] {
			 "description", "Link to the element that is involved\r\n[Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (involverElementEClass, 
		   source, 
		   new String[] {
			 "description", "An involver element is a capella element that is, at least, involved in an involvement relationship with the role of the element that involves the other one\r\n[source:Meleody light-like study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInvolverElement_InvolvedInvolvements(), 
		   source, 
		   new String[] {
			 "description", "Link to the set of involvement relationships for which the element is involved with the role of the element which is involved\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (involvedElementEClass, 
		   source, 
		   new String[] {
			 "description", "An involved element is a capella element that is, at least, involved in an involvement relationship with the role of the element that is involved\r\n[source:Meleody light-like study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getInvolvedElement_InvolvingInvolvements(), 
		   source, 
		   new String[] {
			 "description", "Link to the set of involvement relationships for which the element is involved with the role of the element which involves another one\r\n[source:Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractPropertyValueEClass, 
		   source, 
		   new String[] {
			 "description", "It is a way to define extension properties for any capella elements\r\nA property value is a named element that has a value. This value has no specific format, it is described as a string.\r\n[Capella study]\r\n",
			 "usage guideline", "none",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractPropertyValue_InvolvedElements(), 
		   source, 
		   new String[] {
			 "description", "the model elements involved by this property value\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getAbstractPropertyValue_ValuedElements(), 
		   source, 
		   new String[] {
			 "description", "the model elements to which this property value is applied\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (stringPropertyValueEClass, 
		   source, 
		   new String[] {
			 "description", "It is a way to define extension properties for any capella elements\r\nA property value is a named element that has a value. This value has no specific format, it is described as a string.\r\n[Capella study]\r\n",
			 "usage guideline", "none",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getStringPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "description", "Value of this property, described in string format\r\n[source:Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (integerPropertyValueEClass, 
		   source, 
		   new String[] {
			 "description", "It is a way to define extension properties for any capella elements\r\nA property value is a named element that has a value. This value has no specific format, it is described as a string.\r\n[Capella study]\r\n",
			 "usage guideline", "none",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getIntegerPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "description", "Value of this property, described in string format\r\n[source:Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (booleanPropertyValueEClass, 
		   source, 
		   new String[] {
			 "description", "It is a way to define extension properties for any capella elements\r\nA property value is a named element that has a value. This value has no specific format, it is described as a string.\r\n[Capella study]\r\n",
			 "usage guideline", "none",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getBooleanPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "description", "Value of this property, described in string format\r\n[source:Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (floatPropertyValueEClass, 
		   source, 
		   new String[] {
			 "description", "It is a way to define extension properties for any capella elements\r\nA property value is a named element that has a value. This value has no specific format, it is described as a string.\r\n[Capella study]\r\n",
			 "usage guideline", "none",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getFloatPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "description", "Value of this property, described in string format\r\n[source:Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (enumerationPropertyValueEClass, 
		   source, 
		   new String[] {
			 "description", "It is a way to define extension properties for any capella elements\r\nA property value is a named element that has a value. This value has no specific format, it is described as a string.\r\n[Capella study]\r\n",
			 "usage guideline", "none",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getEnumerationPropertyValue_Type(), 
		   source, 
		   new String[] {
			 "description", "Type of this property\r\n[source:Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEnumerationPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "description", "Value of this property, described in string format\r\n[source:Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (enumerationPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "description", "It is a way to define extension properties for any capella elements\r\nA property value is a named element that has a value. This value has no specific format, it is described as a string.\r\n[Capella study]\r\n",
			 "usage guideline", "none",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getEnumerationPropertyType_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "description", "The literal values that are part of this enumeration\r\n[source:Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (enumerationPropertyLiteralEClass, 
		   source, 
		   new String[] {
			 "description", "A literal value, used in an EnumerationPropertyType\r\n[Capella study]\r\n",
			 "usage guideline", "none",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (propertyValueGroupEClass, 
		   source, 
		   new String[] {
			 "description", "Package that contain property values\r\n[Capella study]",
			 "usage guideline", "none",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPropertyValueGroup_ValuedElements(), 
		   source, 
		   new String[] {
			 "description", "the model elements to which this property group is applied\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (propertyValuePkgEClass, 
		   source, 
		   new String[] {
			 "description", "A container for PropertyValues/PropertyValueGroups.\r\n[source: Capella study]",
			 "usage guideline", "Whereas PropertyValueGroups are used to group semantically linked PropertyValues, this container structure can be used more arbitrarily to structure the properties hierarchy in the model",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractDependenciesPkgEClass, 
		   source, 
		   new String[] {
			 "description", "a base class for structures that need to contain dependency links\r\n[source: Capella study]",
			 "usage guideline", "n/a (abstract)",
			 "used in levels", "operational, system, logical, physical, epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum, 
		   source, 
		   new String[] {
			 "description", "enumeration listing the various possibilities regarding the visibility of a feature of a class\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "used when visibility is not precised\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "used when the feature offers public access\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "used when the feature offers restricted visibility, only to children of the class\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "used when the feature is only visible/accessible from the class itself\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "description", "used when the feature is accessible from any element stored within the same package\r\n[source: Capella study]",
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
		  (getCapellaElement_Summary(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_Description(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_Review(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_OwnedPropertyValues(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_OwnedEnumerationPropertyTypes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_AppliedPropertyValues(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_OwnedPropertyValueGroups(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_AppliedPropertyValueGroups(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_Status(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_Features(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCapellaElement_AppliedRequirements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_ContainedGenericTraces(), 
		   source, 
		   new String[] {
			 "feature", "ownedTraces"
		   });	
		addAnnotation
		  (getNamespace_ContainedRequirementsTraces(), 
		   source, 
		   new String[] {
			 "feature", "ownedTraces"
		   });	
		addAnnotation
		  (getStructure_OwnedPropertyValuePkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTypedElement_Type(), 
		   source, 
		   new String[] {
			 "feature", "abstractType"
		   });	
		addAnnotation
		  (getAbstractAnnotation_Content(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamingRule_TargetType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (keyValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getKeyValue_Key(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getKeyValue_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralizableElement_Abstract(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralizableElement_Super(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralizableElement_Sub(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_ContainedProperties(), 
		   source, 
		   new String[] {
			 "feature", "ownedFeatures"
		   });	
		addAnnotation
		  (getGeneralClass_Visibility(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralClass_ContainedOperations(), 
		   source, 
		   new String[] {
			 "feature", "ownedFeatures"
		   });	
		addAnnotation
		  (getGeneralClass_NestedGeneralClasses(), 
		   source, 
		   new String[] {
			 "feature", "ownedFeatures"
		   });	
		addAnnotation
		  (getFeature_IsAbstract(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFeature_IsStatic(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFeature_Visibility(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractExchangeItemPkg_OwnedExchangeItems(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractPropertyValue_ValuedElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stringPropertyValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringPropertyValue_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (integerPropertyValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getIntegerPropertyValue_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanPropertyValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanPropertyValue_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (floatPropertyValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFloatPropertyValue_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (enumerationPropertyValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumerationPropertyValue_Type(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumerationPropertyValue_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (enumerationPropertyTypeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumerationPropertyType_OwnedLiterals(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (enumerationPropertyLiteralEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (propertyValueGroupEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPropertyValueGroup_ValuedElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (propertyValuePkgEClass, 
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
		  (capellaElementEClass, 
		   source, 
		   new String[] {
			 "Label", "CapellaElement"
		   });	
		addAnnotation
		  (namespaceEClass, 
		   source, 
		   new String[] {
			 "Label", "Namespace"
		   });	
		addAnnotation
		  (getNamespace_OwnedTraces(), 
		   source, 
		   new String[] {
			 "Label", "ownedTraces"
		   });	
		addAnnotation
		  (getNamespace_NamingRules(), 
		   source, 
		   new String[] {
			 "Label", "namingRules"
		   });	
		addAnnotation
		  (namedRelationshipEClass, 
		   source, 
		   new String[] {
			 "Label", "NamedRelationship"
		   });	
		addAnnotation
		  (getNamedRelationship_NamingRules(), 
		   source, 
		   new String[] {
			 "Label", "namingRules"
		   });	
		addAnnotation
		  (structureEClass, 
		   source, 
		   new String[] {
			 "Label", "Structure"
		   });	
		addAnnotation
		  (typeEClass, 
		   source, 
		   new String[] {
			 "Label", "Type"
		   });	
		addAnnotation
		  (traceEClass, 
		   source, 
		   new String[] {
			 "Label", "Trace"
		   });	
		addAnnotation
		  (abstractAnnotationEClass, 
		   source, 
		   new String[] {
			 "Label", "AbstractAnnotation"
		   });	
		addAnnotation
		  (namingRuleEClass, 
		   source, 
		   new String[] {
			 "Label", "NamingRule"
		   });	
		addAnnotation
		  (keyValueEClass, 
		   source, 
		   new String[] {
			 "Label", "KeyValue"
		   });	
		addAnnotation
		  (reuseLinkEClass, 
		   source, 
		   new String[] {
			 "Label", "ReuseLink"
		   });	
		addAnnotation
		  (getReuseLink_Reused(), 
		   source, 
		   new String[] {
			 "Label", "sharedPkg"
		   });	
		addAnnotation
		  (getReuseLink_Reuser(), 
		   source, 
		   new String[] {
			 "Label", "systemEngineering"
		   });	
		addAnnotation
		  (getReuseableStructure_ReuseLinks(), 
		   source, 
		   new String[] {
			 "Label", "reuseLinks"
		   });	
		addAnnotation
		  (getReuserStructure_ReuseLinks(), 
		   source, 
		   new String[] {
			 "Label", "reuseLinks"
		   });	
		addAnnotation
		  (getReuserStructure_OwnedReuseLinks(), 
		   source, 
		   new String[] {
			 "Label", "ownedReuseLinks"
		   });	
		addAnnotation
		  (getGeneralizableElement_OwnedGeneralizations(), 
		   source, 
		   new String[] {
			 "Label", "superGeneralization"
		   });	
		addAnnotation
		  (getGeneralizableElement_SuperGeneralizations(), 
		   source, 
		   new String[] {
			 "Label", "superGeneralization"
		   });	
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
			 "Label", "Classifier"
		   });	
		addAnnotation
		  (generalClassEClass, 
		   source, 
		   new String[] {
			 "Label", "GeneralClass"
		   });	
		addAnnotation
		  (getGeneralClass_ContainedOperations(), 
		   source, 
		   new String[] {
			 "Label", "operations"
		   });	
		addAnnotation
		  (getGeneralClass_NestedGeneralClasses(), 
		   source, 
		   new String[] {
			 "Label", "nestedGeneralClasses"
		   });	
		addAnnotation
		  (generalizationEClass, 
		   source, 
		   new String[] {
			 "Label", "Generalization"
		   });	
		addAnnotation
		  (getGeneralization_Super(), 
		   source, 
		   new String[] {
			 "Label", "super"
		   });	
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "Label", "Feature"
		   });	
		addAnnotation
		  (allocationEClass, 
		   source, 
		   new String[] {
			 "Label", "Allocation"
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
		  (capellaElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Element",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapellaElement_Summary(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapellaElement_Description(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapellaElement_Review(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapellaElement_OwnedPropertyValues(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Element::ownedComment",
			 "explanation", "none",
			 "constraints", "uml::Element::ownedComment elements on which AbstractPropertyValue stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getCapellaElement_OwnedEnumerationPropertyTypes(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "elements on which EnumerationPropertyType stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getCapellaElement_AppliedPropertyValues(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapellaElement_OwnedPropertyValueGroups(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Element::ownedComment",
			 "explanation", "none",
			 "constraints", "uml::Element::ownedComment elements on which PropertyValueGroup stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getCapellaElement_AppliedPropertyValueGroups(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapellaElement_Status(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapellaElement_Features(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getCapellaElement_AppliedRequirements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::NamedElement",
			 "constraints", "none"
		   });	
		addAnnotation
		  (relationshipEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (namespaceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Namespace",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNamespace_OwnedTraces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::nearestpackage",
			 "explanation", "none",
			 "constraints", "Some packaged elements of the nearest package on which Trace stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getNamespace_ContainedGenericTraces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNamespace_ContainedRequirementsTraces(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNamespace_NamingRules(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Element::ownedComment",
			 "explanation", "none",
			 "constraints", "uml::Element::ownedComment elements on which NamingRule stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (namedRelationshipEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Relationship",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNamedRelationship_NamingRules(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Element::ownedComment",
			 "explanation", "none",
			 "constraints", "uml::Element::ownedComment elements on which NamingRule stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (structureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStructure_OwnedPropertyValuePkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which PropertyValuePkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (abstractModellingStructureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractModellingStructure_OwnedArchitectures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which ModellingArchitecture stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractModellingStructure_OwnedArchitecturePkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which ModellingArchitecturePkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (modellingBlockEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (modellingArchitectureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (modellingArchitecturePkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (typeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getType_TypedElements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (typedElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getTypedElement_Type(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (traceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractAnnotationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Comment",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractAnnotation_Content(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "uml::Comment::body or creation of an Expression as specification of a uml::Constraint",
			 "constraints", "none"
		   });	
		addAnnotation
		  (namingRuleEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Comment",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNamingRule_TargetType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Constraint",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (keyValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Comment",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getKeyValue_Key(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getKeyValue_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Comment::body",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (reuseLinkEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getReuseLink_Reused(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (getReuseLink_Reuser(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [1..1]"
		   });	
		addAnnotation
		  (reuseableStructureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getReuseableStructure_ReuseLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Dependency::supplier",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (reuserStructureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getReuserStructure_ReuseLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::clientDependency",
			 "explanation", "none",
			 "constraints", "uml::NamedElement::clientDependency elements on which ReuseLink stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getReuserStructure_OwnedReuseLinks(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which ReuseLink stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (generalizableElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::RedefinableElement",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getGeneralizableElement_Abstract(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Classifier::isAbstract",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getGeneralizableElement_OwnedGeneralizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Classifier::generalization",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getGeneralizableElement_SuperGeneralizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Classifier::generalization",
			 "explanation", "none",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getGeneralizableElement_SubGeneralizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Opposite reference of uml::Generalization::general",
			 "constraints", "Order must be computed"
		   });	
		addAnnotation
		  (getGeneralizableElement_Super(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getGeneralizableElement_Sub(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Classifier",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getClassifier_OwnedFeatures(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Classifier::feature#keyword::none",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getClassifier_ContainedProperties(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (generalClassEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Class",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getGeneralClass_Visibility(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::visibility",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getGeneralClass_ContainedOperations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Class:ownedOperation",
			 "explanation", "Derived and transient but mapped to ease the transformation : pick the corresponding containment reference that stores Operations, in uml::Class",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getGeneralClass_NestedGeneralClasses(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "uml::Class::nestedClassifier || uml::Interface::nestedClassifier",
			 "constraints", "none"
		   });	
		addAnnotation
		  (generalizationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Generalization",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getGeneralization_Super(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Generalization::general",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getGeneralization_Sub(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Generalization::specific",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Feature",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFeature_IsAbstract(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::BehavioralFeature::isAbstract",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFeature_IsStatic(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Feature::isStatic",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFeature_Visibility(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement::visibility",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractExchangeItemPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractExchangeItemPkg_OwnedExchangeItems(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which AbstractExchangeItem stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (allocationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "SysML::Allocations::Allocate",
			 "constraints", "none"
		   });	
		addAnnotation
		  (involvementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Dependency",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInvolvement_Involver(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::client",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (getInvolvement_Involved(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Dependency::supplier",
			 "explanation", "none",
			 "constraints", "Multiplicity must be [0..1]"
		   });	
		addAnnotation
		  (involverElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInvolverElement_InvolvedInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and Transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (involvedElementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getInvolvedElement_InvolvingInvolvements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and Transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractPropertyValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Comment",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractPropertyValue_InvolvedElements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Comment:annotatedElement",
			 "explanation", "none",
			 "constraints", "uml::Comment::annotatedElement elements on which CapellaElement stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getAbstractPropertyValue_ValuedElements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (stringPropertyValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Comment",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStringPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "value will be stored as a stereotype-specific property, of type String",
			 "constraints", "none"
		   });	
		addAnnotation
		  (integerPropertyValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Comment",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getIntegerPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "value will be stored as a stereotype-specific property, of type Int",
			 "constraints", "none"
		   });	
		addAnnotation
		  (booleanPropertyValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Comment",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBooleanPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "value will be stored as a stereotype-specific property, of type Boolean",
			 "constraints", "none"
		   });	
		addAnnotation
		  (floatPropertyValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Comment",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getFloatPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "value will be stored as a stereotype-specific property, of type Float",
			 "constraints", "none"
		   });	
		addAnnotation
		  (enumerationPropertyValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Comment",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEnumerationPropertyValue_Type(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEnumerationPropertyValue_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "value will be stored as a stereotype-specific property, as a reference to an EnumerationPropertyLiteral",
			 "constraints", "none"
		   });	
		addAnnotation
		  (enumerationPropertyTypeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Enumeration",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEnumerationPropertyType_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Enumeration::ownedLiteral",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (enumerationPropertyLiteralEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::EnumerationLiteral",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (propertyValueGroupEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Comment",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPropertyValueGroup_ValuedElements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (propertyValuePkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractDependenciesPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Package",
			 "constraints", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::VisibilityKind",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::VisibilityKind::public",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::VisibilityKind::protected",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::VisibilityKind::private",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (visibilityKindEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::VisibilityKind::private",
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
		  (getCapellaElement_AppliedRequirements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_ContainedGenericTraces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_ContainedRequirementsTraces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getType_TypedElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTypedElement_Type(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralizableElement_SuperGeneralizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralizableElement_SubGeneralizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralizableElement_Super(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralizableElement_Sub(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_ContainedProperties(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralClass_ContainedOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInvolvement_Involver(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInvolverElement_InvolvedInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInvolvedElement_InvolvingInvolvements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractPropertyValue_ValuedElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPropertyValueGroup_ValuedElements(), 
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
		  (getNamespace_OwnedTraces(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReuseLink_Reused(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReuseLink_Reuser(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReuseableStructure_ReuseLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReuserStructure_ReuseLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getReuserStructure_OwnedReuseLinks(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralizableElement_OwnedGeneralizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralizableElement_SuperGeneralizations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralClass_ContainedOperations(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralClass_NestedGeneralClasses(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralization_Super(), 
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
		  (traceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (reuseLinkEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (generalizationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (allocationEClass, 
		   source, 
		   new String[] {
		   });
	}

} //CapellacorePackageImpl
