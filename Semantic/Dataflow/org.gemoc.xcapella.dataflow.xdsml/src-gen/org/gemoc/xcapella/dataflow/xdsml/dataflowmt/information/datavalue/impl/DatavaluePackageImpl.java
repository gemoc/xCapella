/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.AbstractBooleanValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.AbstractComplexValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.AbstractEnumerationValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.AbstractExpressionValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.AbstractStringValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.BinaryExpression;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.BinaryOperator;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.BooleanReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.ComplexValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.ComplexValueReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValueContainer;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavalueFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.EnumerationLiteral;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.EnumerationReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.LiteralBooleanValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.LiteralNumericValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.LiteralStringValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.NumericReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.NumericValue;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.OpaqueExpression;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.StringReference;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.UnaryExpression;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.UnaryOperator;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.ValuePart;

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
public class DatavaluePackageImpl extends EPackageImpl implements DatavaluePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEnumerationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNumericValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComplexValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexValueReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractExpressionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorEEnum = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatavaluePackageImpl() {
		super(eNS_URI, DatavalueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatavaluePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatavaluePackage init() {
		if (isInited) return (DatavaluePackage)EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI);

		// Obtain or create and register package
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatavaluePackageImpl());

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
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		theDatavaluePackage.createPackageContents();
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
		theCommunicationPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		theDatavaluePackage.initializePackageContents();
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
		theCommunicationPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatavaluePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatavaluePackage.eNS_URI, theDatavaluePackage);
		return theDatavaluePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataValue_Abstract() {
		return (EAttribute)dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValue_Type() {
		return (EReference)dataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataValueContainer() {
		return dataValueContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataValueContainer_OwnedDataValues() {
		return (EReference)dataValueContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractBooleanValue() {
		return abstractBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractBooleanValue_BooleanType() {
		return (EReference)abstractBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBooleanValue() {
		return literalBooleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBooleanValue_Value() {
		return (EAttribute)literalBooleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanReference() {
		return booleanReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanReference_ReferencedValue() {
		return (EReference)booleanReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanReference_ReferencedProperty() {
		return (EReference)booleanReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEnumerationValue() {
		return abstractEnumerationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEnumerationValue_EnumerationType() {
		return (EReference)abstractEnumerationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteral_DomainValue() {
		return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationReference() {
		return enumerationReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationReference_ReferencedValue() {
		return (EReference)enumerationReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationReference_ReferencedProperty() {
		return (EReference)enumerationReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStringValue() {
		return abstractStringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStringValue_StringType() {
		return (EReference)abstractStringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralStringValue() {
		return literalStringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralStringValue_Value() {
		return (EAttribute)literalStringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringReference() {
		return stringReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringReference_ReferencedValue() {
		return (EReference)stringReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringReference_ReferencedProperty() {
		return (EReference)stringReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericValue() {
		return numericValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValue_Unit() {
		return (EReference)numericValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericValue_NumericType() {
		return (EReference)numericValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralNumericValue() {
		return literalNumericValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralNumericValue_Value() {
		return (EAttribute)literalNumericValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericReference() {
		return numericReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericReference_ReferencedValue() {
		return (EReference)numericReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericReference_ReferencedProperty() {
		return (EReference)numericReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComplexValue() {
		return abstractComplexValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComplexValue_ComplexType() {
		return (EReference)abstractComplexValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexValue() {
		return complexValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexValue_OwnedParts() {
		return (EReference)complexValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexValueReference() {
		return complexValueReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexValueReference_ReferencedValue() {
		return (EReference)complexValueReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexValueReference_ReferencedProperty() {
		return (EReference)complexValueReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePart() {
		return valuePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePart_ReferencedProperty() {
		return (EReference)valuePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePart_OwnedValue() {
		return (EReference)valuePartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractExpressionValue() {
		return abstractExpressionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractExpressionValue_Expression() {
		return (EAttribute)abstractExpressionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractExpressionValue_UnparsedExpression() {
		return (EAttribute)abstractExpressionValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractExpressionValue_ExpressionType() {
		return (EReference)abstractExpressionValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Operator() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_OwnedLeftOperand() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_OwnedRightOperand() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_OwnedOperand() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpression() {
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Bodies() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Languages() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOperator() {
		return unaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatavalueFactory getDatavalueFactory() {
		return (DatavalueFactory)getEFactoryInstance();
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
		dataValueEClass = createEClass(DATA_VALUE);
		createEAttribute(dataValueEClass, DATA_VALUE__ABSTRACT);
		createEReference(dataValueEClass, DATA_VALUE__TYPE);

		dataValueContainerEClass = createEClass(DATA_VALUE_CONTAINER);
		createEReference(dataValueContainerEClass, DATA_VALUE_CONTAINER__OWNED_DATA_VALUES);

		abstractBooleanValueEClass = createEClass(ABSTRACT_BOOLEAN_VALUE);
		createEReference(abstractBooleanValueEClass, ABSTRACT_BOOLEAN_VALUE__BOOLEAN_TYPE);

		literalBooleanValueEClass = createEClass(LITERAL_BOOLEAN_VALUE);
		createEAttribute(literalBooleanValueEClass, LITERAL_BOOLEAN_VALUE__VALUE);

		booleanReferenceEClass = createEClass(BOOLEAN_REFERENCE);
		createEReference(booleanReferenceEClass, BOOLEAN_REFERENCE__REFERENCED_VALUE);
		createEReference(booleanReferenceEClass, BOOLEAN_REFERENCE__REFERENCED_PROPERTY);

		abstractEnumerationValueEClass = createEClass(ABSTRACT_ENUMERATION_VALUE);
		createEReference(abstractEnumerationValueEClass, ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__DOMAIN_VALUE);

		enumerationReferenceEClass = createEClass(ENUMERATION_REFERENCE);
		createEReference(enumerationReferenceEClass, ENUMERATION_REFERENCE__REFERENCED_VALUE);
		createEReference(enumerationReferenceEClass, ENUMERATION_REFERENCE__REFERENCED_PROPERTY);

		abstractStringValueEClass = createEClass(ABSTRACT_STRING_VALUE);
		createEReference(abstractStringValueEClass, ABSTRACT_STRING_VALUE__STRING_TYPE);

		literalStringValueEClass = createEClass(LITERAL_STRING_VALUE);
		createEAttribute(literalStringValueEClass, LITERAL_STRING_VALUE__VALUE);

		stringReferenceEClass = createEClass(STRING_REFERENCE);
		createEReference(stringReferenceEClass, STRING_REFERENCE__REFERENCED_VALUE);
		createEReference(stringReferenceEClass, STRING_REFERENCE__REFERENCED_PROPERTY);

		numericValueEClass = createEClass(NUMERIC_VALUE);
		createEReference(numericValueEClass, NUMERIC_VALUE__UNIT);
		createEReference(numericValueEClass, NUMERIC_VALUE__NUMERIC_TYPE);

		literalNumericValueEClass = createEClass(LITERAL_NUMERIC_VALUE);
		createEAttribute(literalNumericValueEClass, LITERAL_NUMERIC_VALUE__VALUE);

		numericReferenceEClass = createEClass(NUMERIC_REFERENCE);
		createEReference(numericReferenceEClass, NUMERIC_REFERENCE__REFERENCED_VALUE);
		createEReference(numericReferenceEClass, NUMERIC_REFERENCE__REFERENCED_PROPERTY);

		abstractComplexValueEClass = createEClass(ABSTRACT_COMPLEX_VALUE);
		createEReference(abstractComplexValueEClass, ABSTRACT_COMPLEX_VALUE__COMPLEX_TYPE);

		complexValueEClass = createEClass(COMPLEX_VALUE);
		createEReference(complexValueEClass, COMPLEX_VALUE__OWNED_PARTS);

		complexValueReferenceEClass = createEClass(COMPLEX_VALUE_REFERENCE);
		createEReference(complexValueReferenceEClass, COMPLEX_VALUE_REFERENCE__REFERENCED_VALUE);
		createEReference(complexValueReferenceEClass, COMPLEX_VALUE_REFERENCE__REFERENCED_PROPERTY);

		valuePartEClass = createEClass(VALUE_PART);
		createEReference(valuePartEClass, VALUE_PART__REFERENCED_PROPERTY);
		createEReference(valuePartEClass, VALUE_PART__OWNED_VALUE);

		abstractExpressionValueEClass = createEClass(ABSTRACT_EXPRESSION_VALUE);
		createEAttribute(abstractExpressionValueEClass, ABSTRACT_EXPRESSION_VALUE__EXPRESSION);
		createEAttribute(abstractExpressionValueEClass, ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION);
		createEReference(abstractExpressionValueEClass, ABSTRACT_EXPRESSION_VALUE__EXPRESSION_TYPE);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__OWNED_LEFT_OPERAND);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__OWNED_RIGHT_OPERAND);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OWNED_OPERAND);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODIES);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGES);

		// Create enums
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
		unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
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
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);
		DatatypePackage theDatatypePackage = (DatatypePackage)EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataValueEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		dataValueEClass.getESuperTypes().add(theModellingcorePackage.getValueSpecification());
		dataValueContainerEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		abstractBooleanValueEClass.getESuperTypes().add(this.getDataValue());
		literalBooleanValueEClass.getESuperTypes().add(this.getAbstractBooleanValue());
		booleanReferenceEClass.getESuperTypes().add(this.getAbstractBooleanValue());
		abstractEnumerationValueEClass.getESuperTypes().add(this.getDataValue());
		enumerationLiteralEClass.getESuperTypes().add(this.getAbstractEnumerationValue());
		enumerationReferenceEClass.getESuperTypes().add(this.getAbstractEnumerationValue());
		abstractStringValueEClass.getESuperTypes().add(this.getDataValue());
		literalStringValueEClass.getESuperTypes().add(this.getAbstractStringValue());
		stringReferenceEClass.getESuperTypes().add(this.getAbstractStringValue());
		numericValueEClass.getESuperTypes().add(this.getDataValue());
		literalNumericValueEClass.getESuperTypes().add(this.getNumericValue());
		numericReferenceEClass.getESuperTypes().add(this.getNumericValue());
		abstractComplexValueEClass.getESuperTypes().add(this.getDataValue());
		complexValueEClass.getESuperTypes().add(this.getAbstractComplexValue());
		complexValueReferenceEClass.getESuperTypes().add(this.getAbstractComplexValue());
		valuePartEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		abstractExpressionValueEClass.getESuperTypes().add(this.getAbstractBooleanValue());
		abstractExpressionValueEClass.getESuperTypes().add(this.getAbstractComplexValue());
		abstractExpressionValueEClass.getESuperTypes().add(this.getAbstractEnumerationValue());
		abstractExpressionValueEClass.getESuperTypes().add(this.getNumericValue());
		abstractExpressionValueEClass.getESuperTypes().add(this.getAbstractStringValue());
		binaryExpressionEClass.getESuperTypes().add(this.getAbstractExpressionValue());
		unaryExpressionEClass.getESuperTypes().add(this.getAbstractExpressionValue());
		opaqueExpressionEClass.getESuperTypes().add(theCapellacorePackage.getCapellaElement());
		opaqueExpressionEClass.getESuperTypes().add(theModellingcorePackage.getValueSpecification());

		// Initialize classes and features; add operations and parameters
		initEClass(dataValueEClass, DataValue.class, "DataValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataValue_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, DataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataValue_Type(), theCapellacorePackage.getType(), null, "type", null, 0, 1, DataValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dataValueContainerEClass, DataValueContainer.class, "DataValueContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataValueContainer_OwnedDataValues(), this.getDataValue(), null, "ownedDataValues", null, 0, -1, DataValueContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractBooleanValueEClass, AbstractBooleanValue.class, "AbstractBooleanValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractBooleanValue_BooleanType(), theDatatypePackage.getBooleanType(), null, "booleanType", null, 0, 1, AbstractBooleanValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(literalBooleanValueEClass, LiteralBooleanValue.class, "LiteralBooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, LiteralBooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanReferenceEClass, BooleanReference.class, "BooleanReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanReference_ReferencedValue(), this.getAbstractBooleanValue(), null, "referencedValue", null, 0, 1, BooleanReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanReference_ReferencedProperty(), theInformationPackage.getProperty(), null, "referencedProperty", null, 0, 1, BooleanReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEnumerationValueEClass, AbstractEnumerationValue.class, "AbstractEnumerationValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractEnumerationValue_EnumerationType(), theDatatypePackage.getEnumeration(), null, "enumerationType", null, 0, 1, AbstractEnumerationValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_DomainValue(), this.getDataValue(), null, "domainValue", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationReferenceEClass, EnumerationReference.class, "EnumerationReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationReference_ReferencedValue(), this.getAbstractEnumerationValue(), null, "referencedValue", null, 0, 1, EnumerationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumerationReference_ReferencedProperty(), theInformationPackage.getProperty(), null, "referencedProperty", null, 0, 1, EnumerationReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStringValueEClass, AbstractStringValue.class, "AbstractStringValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractStringValue_StringType(), theDatatypePackage.getStringType(), null, "stringType", null, 0, 1, AbstractStringValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(literalStringValueEClass, LiteralStringValue.class, "LiteralStringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralStringValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralStringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringReferenceEClass, StringReference.class, "StringReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringReference_ReferencedValue(), this.getAbstractStringValue(), null, "referencedValue", null, 0, 1, StringReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringReference_ReferencedProperty(), theInformationPackage.getProperty(), null, "referencedProperty", null, 0, 1, StringReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericValueEClass, NumericValue.class, "NumericValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericValue_Unit(), theInformationPackage.getUnit(), null, "unit", null, 0, 1, NumericValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericValue_NumericType(), theDatatypePackage.getNumericType(), null, "numericType", null, 0, 1, NumericValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(literalNumericValueEClass, LiteralNumericValue.class, "LiteralNumericValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralNumericValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralNumericValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericReferenceEClass, NumericReference.class, "NumericReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumericReference_ReferencedValue(), this.getNumericValue(), null, "referencedValue", null, 0, 1, NumericReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericReference_ReferencedProperty(), theInformationPackage.getProperty(), null, "referencedProperty", null, 0, 1, NumericReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComplexValueEClass, AbstractComplexValue.class, "AbstractComplexValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractComplexValue_ComplexType(), theCapellacorePackage.getClassifier(), null, "complexType", null, 0, 1, AbstractComplexValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(complexValueEClass, ComplexValue.class, "ComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexValue_OwnedParts(), this.getValuePart(), null, "ownedParts", null, 0, -1, ComplexValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexValueReferenceEClass, ComplexValueReference.class, "ComplexValueReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexValueReference_ReferencedValue(), this.getAbstractComplexValue(), null, "referencedValue", null, 0, 1, ComplexValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexValueReference_ReferencedProperty(), theInformationPackage.getProperty(), null, "referencedProperty", null, 0, 1, ComplexValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuePartEClass, ValuePart.class, "ValuePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePart_ReferencedProperty(), theInformationPackage.getProperty(), null, "referencedProperty", null, 0, 1, ValuePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuePart_OwnedValue(), this.getDataValue(), null, "ownedValue", null, 0, 1, ValuePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractExpressionValueEClass, AbstractExpressionValue.class, "AbstractExpressionValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractExpressionValue_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, AbstractExpressionValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractExpressionValue_UnparsedExpression(), ecorePackage.getEString(), "unparsedExpression", null, 0, 1, AbstractExpressionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractExpressionValue_ExpressionType(), theDatatypePackage.getDataType(), null, "expressionType", null, 0, 1, AbstractExpressionValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryExpression_Operator(), this.getBinaryOperator(), "operator", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_OwnedLeftOperand(), this.getDataValue(), null, "ownedLeftOperand", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_OwnedRightOperand(), this.getDataValue(), null, "ownedRightOperand", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryExpression_Operator(), this.getUnaryOperator(), "operator", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpression_OwnedOperand(), this.getDataValue(), null, "ownedOperand", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueExpression_Bodies(), ecorePackage.getEString(), "bodies", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpaqueExpression_Languages(), ecorePackage.getEString(), "languages", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.UNSET);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.ADD);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MUL);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.SUB);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.DIV);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.POW);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MIN);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.MAX);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.EQU);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.IOR);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.XOR);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.AND);

		initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.UNSET);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NOT);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.POS);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.VAL);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.SUC);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.PRE);

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
			 "description", "sub-package containing the definition of all predefined kinds of data values\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "system,logical,physical",
			 "usage examples", "none",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "n/a"
		   });	
		addAnnotation
		  (dataValueEClass, 
		   source, 
		   new String[] {
			 "description", "Generic class for the specification of value for data of a given type\r\n[source: Capella study]",
			 "usage guideline", "n/a (Abstract)",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getDataValue_Abstract(), 
		   source, 
		   new String[] {
			 "description", "whether or not the value is abstract",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataValue_Type(), 
		   source, 
		   new String[] {
			 "description", "The type of the TypedElement\r\n[source:UML Superstructure v2.2]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (dataValueContainerEClass, 
		   source, 
		   new String[] {
			 "description", "container for DataValue elements\r\n[source: Capella study]",
			 "usage guideline", "Use DataValue packages to provide an appropriate structure to the data model",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getDataValueContainer_OwnedDataValues(), 
		   source, 
		   new String[] {
			 "description", "DataValue elements contained in this package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractBooleanValueEClass, 
		   source, 
		   new String[] {
			 "description", "Base class for defining type-specific boolean values\r\n[source: Capella light-light study]\r\n",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractBooleanValue_BooleanType(), 
		   source, 
		   new String[] {
			 "description", "the type of the data being valued\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (literalBooleanValueEClass, 
		   source, 
		   new String[] {
			 "description", "A literal Boolean is a specification of a Boolean value\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getLiteralBooleanValue_Value(), 
		   source, 
		   new String[] {
			 "description", "the value \"true\" or \"false\"\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (booleanReferenceEClass, 
		   source, 
		   new String[] {
			 "description", "A reference to a boolean value, allowing the reuse of boolean values across data value structures\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "description", "the boolean value that this reference points to\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "description", "the property that is using this reference\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractEnumerationValueEClass, 
		   source, 
		   new String[] {
			 "description", "Base class for defining type-specific enumeration values\r\n[source: Capella light-light study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractEnumerationValue_EnumerationType(), 
		   source, 
		   new String[] {
			 "description", "the type of the data being valued\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (enumerationLiteralEClass, 
		   source, 
		   new String[] {
			 "description", "A value specification composed of a finite list of predefined values\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getEnumerationLiteral_DomainValue(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (enumerationReferenceEClass, 
		   source, 
		   new String[] {
			 "description", "A reference to an abstract enumeration value, allowing the reuse of enumeration values across data value structures",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getEnumerationReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "description", "the abstract enumeration value that this reference points to",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEnumerationReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "description", "the property that is using this reference\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractStringValueEClass, 
		   source, 
		   new String[] {
			 "description", "A value defined by an ordered set of characters\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractStringValue_StringType(), 
		   source, 
		   new String[] {
			 "description", "the type of the data being valued\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (literalStringValueEClass, 
		   source, 
		   new String[] {
			 "description", "A literal string is a specification of a string value\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getLiteralStringValue_Value(), 
		   source, 
		   new String[] {
			 "description", "the specific string\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (stringReferenceEClass, 
		   source, 
		   new String[] {
			 "description", "A reference to a string value, allowing the reuse of string values across data value structures\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getStringReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "description", "the string value that this reference points to\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStringReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "description", "the property that uses this reference\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (numericValueEClass, 
		   source, 
		   new String[] {
			 "description", "A value expressed as a number\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getNumericValue_Unit(), 
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
		  (getNumericValue_NumericType(), 
		   source, 
		   new String[] {
			 "description", "the type of the data being valued\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (literalNumericValueEClass, 
		   source, 
		   new String[] {
			 "description", "A literal value expressed as a number (ordered set of digits)\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getLiteralNumericValue_Value(), 
		   source, 
		   new String[] {
			 "description", "the number defining this value, expressed as a string\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (numericReferenceEClass, 
		   source, 
		   new String[] {
			 "description", "a reference to a numeric value, allowing the reuse of numeric values across data value structures\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "none",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getNumericReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "description", "the numeric value being referenced\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getNumericReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "description", "the property that uses this reference\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (abstractComplexValueEClass, 
		   source, 
		   new String[] {
			 "description", "Base class for defining complex value type\r\n[source: Capella light-light study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractComplexValue_ComplexType(), 
		   source, 
		   new String[] {
			 "description", "the type of the data being valued\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (complexValueEClass, 
		   source, 
		   new String[] {
			 "description", "Data type characterizing a complex number\r\n[source: Capella light-light study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComplexValue_OwnedParts(), 
		   source, 
		   new String[] {
			 "description", "stores the different parts that make a complex value\r\n[source: Capella light-light study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (complexValueReferenceEClass, 
		   source, 
		   new String[] {
			 "description", "A reference to a complex value\r\n[source: Capella light-light study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getComplexValueReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "description", "the complex value being referenced",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getComplexValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "description", "the property that uses this reference\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (valuePartEClass, 
		   source, 
		   new String[] {
			 "description", "Used in the decomposition of complex values into smaller unitary elements\r\n[source: Capella light-light study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getValuePart_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getValuePart_OwnedValue(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (abstractExpressionValueEClass, 
		   source, 
		   new String[] {
			 "description", "Abstract class to support the implementation of Expression specifications\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractExpressionValue_Expression(), 
		   source, 
		   new String[] {
			 "description", "textual specification of the expression\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractExpressionValue_UnparsedExpression(), 
		   source, 
		   new String[] {
			 "description", "raw textual specification of the expression\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getAbstractExpressionValue_ExpressionType(), 
		   source, 
		   new String[] {
			 "description", "the type of the data being valued\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryExpressionEClass, 
		   source, 
		   new String[] {
			 "description", "Specification of a condition that can only evaluate to \"true\" or \"false\"\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getBinaryExpression_Operator(), 
		   source, 
		   new String[] {
			 "description", "the operator between the left and right operands\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedLeftOperand(), 
		   source, 
		   new String[] {
			 "description", "list of the operands being part of the boolean expression\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedRightOperand(), 
		   source, 
		   new String[] {
			 "description", "list of the operands being part of the boolean expression\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unaryExpressionEClass, 
		   source, 
		   new String[] {
			 "description", "Specification of a condition that can only evaluate to \"true\" or \"false\"\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "n/a",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getUnaryExpression_Operator(), 
		   source, 
		   new String[] {
			 "description", "the operator applying to the operand\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getUnaryExpression_OwnedOperand(), 
		   source, 
		   new String[] {
			 "description", "list of the operands being part of the boolean expression\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum, 
		   source, 
		   new String[] {
			 "description", "Specifies the kind of this binary operator",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator is not initialized",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to an addition",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to a multiplication",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to a substraction",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to a division",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to a power operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to a min operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to a max operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to an equal operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to a logical inclusive OR operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to a logical exclusive OR operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(11), 
		   source, 
		   new String[] {
			 "description", "Used when the binary operator refers to a logical AND operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum, 
		   source, 
		   new String[] {
			 "description", "Specifies the kind of this unary operator",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "Used when the unary operator is not initialized",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "Used when the unary operator refers to a NOT operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "description", "Used when the unary operator refers to a position operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "description", "Used when the unary operator refers to a value operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "description", "Used when the unary operator refers to a successor operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "description", "Used when the unary operator refers to a predecessor operation",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (opaqueExpressionEClass, 
		   source, 
		   new String[] {
			 "description", "An opaque expression contains language-specific text strings used to describe a value or values, and an optional specification of\r\nthe languages.\r\nOne predefined language for specifying expressions is OCL. Natural language or programming languages may also be\r\nused.",
			 "constraints", "If the language attribute is not empty, then the size of the body and language arrays must be the same."
		   });	
		addAnnotation
		  (getOpaqueExpression_Bodies(), 
		   source, 
		   new String[] {
			 "description", "The text of the expression, possibly in multiple languages."
		   });	
		addAnnotation
		  (getOpaqueExpression_Languages(), 
		   source, 
		   new String[] {
			 "description", "Specifies the languages in which the expression is stated. The interpretation of the expression body depends on the\r\nlanguages. If the languages are unspecified, they might be implicit from the expression body or the context.\r\nLanguages are matched to body strings by order."
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
		  (getDataValue_Abstract(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataValue_Type(), 
		   source, 
		   new String[] {
			 "feature", "abstractType"
		   });	
		addAnnotation
		  (getDataValueContainer_OwnedDataValues(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractBooleanValue_BooleanType(), 
		   source, 
		   new String[] {
			 "feature", "abstractType",
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (literalBooleanValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLiteralBooleanValue_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (booleanReferenceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractEnumerationValue_EnumerationType(), 
		   source, 
		   new String[] {
			 "feature", "abstractType",
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (enumerationLiteralEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumerationLiteral_DomainValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (enumerationReferenceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumerationReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumerationReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractStringValue_StringType(), 
		   source, 
		   new String[] {
			 "feature", "abstractType",
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (literalStringValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLiteralStringValue_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stringReferenceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericValue_Unit(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericValue_NumericType(), 
		   source, 
		   new String[] {
			 "feature", "abstractType",
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (literalNumericValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getLiteralNumericValue_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (numericReferenceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractComplexValue_ComplexType(), 
		   source, 
		   new String[] {
			 "feature", "abstractType",
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (complexValueEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComplexValue_OwnedParts(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (complexValueReferenceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComplexValueReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComplexValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (valuePartEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getValuePart_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getValuePart_OwnedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractExpressionValue_Expression(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractExpressionValue_UnparsedExpression(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractExpressionValue_ExpressionType(), 
		   source, 
		   new String[] {
			 "feature", "abstractType",
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (binaryExpressionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBinaryExpression_Operator(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedLeftOperand(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedRightOperand(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (unaryExpressionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnaryExpression_Operator(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnaryExpression_OwnedOperand(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (binaryOperatorEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (unaryOperatorEEnum, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (opaqueExpressionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOpaqueExpression_Bodies(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOpaqueExpression_Languages(), 
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
		  (dataValueEClass, 
		   source, 
		   new String[] {
			 "Label", "DataValue"
		   });	
		addAnnotation
		  (dataValueContainerEClass, 
		   source, 
		   new String[] {
			 "Label", "DataTypePkg"
		   });	
		addAnnotation
		  (getDataValueContainer_OwnedDataValues(), 
		   source, 
		   new String[] {
			 "Label", "ownedDataValues"
		   });	
		addAnnotation
		  (getAbstractBooleanValue_BooleanType(), 
		   source, 
		   new String[] {
			 "Label", "type"
		   });	
		addAnnotation
		  (literalBooleanValueEClass, 
		   source, 
		   new String[] {
			 "Label", "LiteralBooleanValue"
		   });	
		addAnnotation
		  (booleanReferenceEClass, 
		   source, 
		   new String[] {
			 "Label", "BooleanReference"
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (getAbstractEnumerationValue_EnumerationType(), 
		   source, 
		   new String[] {
			 "Label", "type"
		   });	
		addAnnotation
		  (enumerationLiteralEClass, 
		   source, 
		   new String[] {
			 "Label", "EnumerationLiteral"
		   });	
		addAnnotation
		  (getEnumerationReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (abstractStringValueEClass, 
		   source, 
		   new String[] {
			 "Label", "StringValue"
		   });	
		addAnnotation
		  (getAbstractStringValue_StringType(), 
		   source, 
		   new String[] {
			 "Label", "type"
		   });	
		addAnnotation
		  (literalStringValueEClass, 
		   source, 
		   new String[] {
			 "Label", "LiteralStringValue"
		   });	
		addAnnotation
		  (stringReferenceEClass, 
		   source, 
		   new String[] {
			 "Label", "StringReference"
		   });	
		addAnnotation
		  (getStringReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (getStringReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (numericValueEClass, 
		   source, 
		   new String[] {
			 "Label", "NumericValue"
		   });	
		addAnnotation
		  (getNumericValue_NumericType(), 
		   source, 
		   new String[] {
			 "Label", "type"
		   });	
		addAnnotation
		  (literalNumericValueEClass, 
		   source, 
		   new String[] {
			 "Label", "LiteralNumericValue"
		   });	
		addAnnotation
		  (numericReferenceEClass, 
		   source, 
		   new String[] {
			 "Label", "NumericReference"
		   });	
		addAnnotation
		  (getNumericReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (getNumericReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (getAbstractComplexValue_ComplexType(), 
		   source, 
		   new String[] {
			 "Label", "type"
		   });	
		addAnnotation
		  (getComplexValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "Label", "reference"
		   });	
		addAnnotation
		  (getAbstractExpressionValue_ExpressionType(), 
		   source, 
		   new String[] {
			 "Label", "type"
		   });	
		addAnnotation
		  (binaryExpressionEClass, 
		   source, 
		   new String[] {
			 "Label", "BinaryExpression"
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedLeftOperand(), 
		   source, 
		   new String[] {
			 "Label", "operands"
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedRightOperand(), 
		   source, 
		   new String[] {
			 "Label", "operands"
		   });	
		addAnnotation
		  (unaryExpressionEClass, 
		   source, 
		   new String[] {
			 "Label", "UnaryExpression"
		   });	
		addAnnotation
		  (getUnaryExpression_OwnedOperand(), 
		   source, 
		   new String[] {
			 "Label", "operands"
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
		  (dataValueEClass, 
		   source, 
		   new String[] {
			 "metaclass", "LiteralSpecification",
			 "stereotype", "eng.DataValue"
		   });	
		addAnnotation
		  (dataValueContainerEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Package"
		   });	
		addAnnotation
		  (getDataValueContainer_OwnedDataValues(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getAbstractBooleanValue_BooleanType(), 
		   source, 
		   new String[] {
			 "featureName", "type",
			 "featureOwner", "TypedElement"
		   });	
		addAnnotation
		  (literalBooleanValueEClass, 
		   source, 
		   new String[] {
			 "metaclass", "LiteralBoolean",
			 "stereotype", "eng.LiteralBooleanValue"
		   });	
		addAnnotation
		  (getLiteralBooleanValue_Value(), 
		   source, 
		   new String[] {
			 "featureName", "value",
			 "featureOwner", "LiteralBoolean"
		   });	
		addAnnotation
		  (booleanReferenceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Expression",
			 "stereotype", "eng.BooleanReference"
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getAbstractEnumerationValue_EnumerationType(), 
		   source, 
		   new String[] {
			 "featureName", "type",
			 "featureOwner", "TypedElement"
		   });	
		addAnnotation
		  (enumerationLiteralEClass, 
		   source, 
		   new String[] {
			 "metaclass", "EnumerationLiteral",
			 "stereotype", "eng.EnumerationLiteral"
		   });	
		addAnnotation
		  (getEnumerationReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (abstractStringValueEClass, 
		   source, 
		   new String[] {
			 "metaclass", "ValueSpecification"
		   });	
		addAnnotation
		  (getAbstractStringValue_StringType(), 
		   source, 
		   new String[] {
			 "featureName", "type",
			 "featureOwner", "TypedElement"
		   });	
		addAnnotation
		  (literalStringValueEClass, 
		   source, 
		   new String[] {
			 "metaclass", "LiteralString",
			 "stereotype", "eng.LiteralStringValue"
		   });	
		addAnnotation
		  (getLiteralStringValue_Value(), 
		   source, 
		   new String[] {
			 "featureName", "value",
			 "featureOwner", "LiteralString"
		   });	
		addAnnotation
		  (stringReferenceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Expression",
			 "stereotype", "eng.StringReference"
		   });	
		addAnnotation
		  (getStringReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getStringReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (numericValueEClass, 
		   source, 
		   new String[] {
			 "metaclass", "ValueSpecification"
		   });	
		addAnnotation
		  (getNumericValue_NumericType(), 
		   source, 
		   new String[] {
			 "featureName", "type",
			 "featureOwner", "TypedElement"
		   });	
		addAnnotation
		  (literalNumericValueEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Expression",
			 "stereotype", "eng.LiteralNumericValue"
		   });	
		addAnnotation
		  (getLiteralNumericValue_Value(), 
		   source, 
		   new String[] {
			 "featureName", "symbol",
			 "featureOwner", "Expression"
		   });	
		addAnnotation
		  (numericReferenceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Expression",
			 "stereotype", "eng.NumericReference"
		   });	
		addAnnotation
		  (getNumericReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getNumericReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getAbstractComplexValue_ComplexType(), 
		   source, 
		   new String[] {
			 "featureName", "type",
			 "featureOwner", "TypedElement"
		   });	
		addAnnotation
		  (getComplexValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getAbstractExpressionValue_ExpressionType(), 
		   source, 
		   new String[] {
			 "featureName", "type",
			 "featureOwner", "TypedElement"
		   });	
		addAnnotation
		  (binaryExpressionEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Expression",
			 "stereotype", "eng.BinaryExpression"
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedLeftOperand(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedRightOperand(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (unaryExpressionEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Expression",
			 "stereotype", "eng.UnaryExpression"
		   });	
		addAnnotation
		  (getUnaryExpression_OwnedOperand(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
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
		  (dataValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ValueSpecification",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataValue_Abstract(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataValue_Type(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (dataValueContainerEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::Package",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataValueContainer_OwnedDataValues(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which DataValue stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (abstractBooleanValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractBooleanValue_BooleanType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (literalBooleanValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::LiteralBoolean",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getLiteralBooleanValue_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::LiteralBoolean::value",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (booleanReferenceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractEnumerationValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractEnumerationValue_EnumerationType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (enumerationLiteralEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::EnumerationLiteral",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEnumerationLiteral_DomainValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (enumerationReferenceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEnumerationReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEnumerationReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractStringValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ValueSpecification",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractStringValue_StringType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (literalStringValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::LiteralString",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getLiteralStringValue_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::LiteralString::value",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (stringReferenceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStringReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStringReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (numericValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::LiteralSpecification",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNumericValue_Unit(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNumericValue_NumericType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (literalNumericValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getLiteralNumericValue_Value(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::LiteralString::value",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (numericReferenceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNumericReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNumericReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (abstractComplexValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::ValueSpecification",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractComplexValue_ComplexType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (complexValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "uml::LiteralSpecification",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComplexValue_OwnedParts(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "***** elements on which ValuePart stereotype or any stereotype that inherits from it is applied\r\n"
		   });	
		addAnnotation
		  (complexValueReferenceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "uml::LiteralSpecification",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComplexValueReference_ReferencedValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getComplexValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (valuePartEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getValuePart_ReferencedProperty(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", ""
		   });	
		addAnnotation
		  (getValuePart_OwnedValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "****** elements on which DataValue stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]"
		   });	
		addAnnotation
		  (abstractExpressionValueEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractExpressionValue_Expression(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractExpressionValue_UnparsedExpression(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getAbstractExpressionValue_ExpressionType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryExpressionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBinaryExpression_Operator(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedLeftOperand(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Expression::operand",
			 "explanation", "_todo_ Check that uml::Expression::operand contains BooleanValue",
			 "constraints", "uml::Expression::operand elements on which ValueSpecification stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedRightOperand(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Expression::operand",
			 "explanation", "_todo_ Check that uml::Expression::operand contains BooleanValue",
			 "constraints", "uml::Expression::operand elements on which ValueSpecification stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (unaryExpressionEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Expression",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getUnaryExpression_Operator(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getUnaryExpression_OwnedOperand(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Expression::operand",
			 "explanation", "_todo_ Check that uml::Expression::operand contains BooleanValue",
			 "constraints", "uml::Expression::operand elements on which ValueSpecification stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (binaryOperatorEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(6), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(7), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(8), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(9), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(10), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (binaryOperatorEEnum.getELiterals().get(11), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(4), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (unaryOperatorEEnum.getELiterals().get(5), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (opaqueExpressionEClass, 
		   source, 
		   new String[] {
			 "base metaclass in UML/SysML profile ", "uml::OpaqueExpression"
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
		  (getDataValue_Type(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractBooleanValue_BooleanType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractEnumerationValue_EnumerationType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractStringValue_StringType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericValue_NumericType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractComplexValue_ComplexType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractExpressionValue_Expression(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractExpressionValue_ExpressionType(), 
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
		  (getDataValueContainer_OwnedDataValues(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractBooleanValue_BooleanType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractEnumerationValue_EnumerationType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumerationReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractStringValue_StringType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericValue_NumericType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericReference_ReferencedValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractComplexValue_ComplexType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComplexValueReference_ReferencedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAbstractExpressionValue_ExpressionType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedLeftOperand(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBinaryExpression_OwnedRightOperand(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUnaryExpression_OwnedOperand(), 
		   source, 
		   new String[] {
		   });
	}

} //DatavaluePackageImpl
