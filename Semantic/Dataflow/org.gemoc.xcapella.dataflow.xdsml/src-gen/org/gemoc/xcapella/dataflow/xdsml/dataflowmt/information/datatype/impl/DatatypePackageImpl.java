/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.impl;

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

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.BooleanType;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.DataType;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.DatatypeFactory;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.DatatypePackage;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.Enumeration;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.NumericType;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.NumericTypeKind;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.PhysicalQuantity;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.StringType;

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
public class DatatypePackageImpl extends EPackageImpl implements DatatypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numericTypeKindEEnum = null;

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
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.DatatypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypePackageImpl() {
		super(eNS_URI, DatatypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypePackage init() {
		if (isInited) return (DatatypePackage)EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI);

		// Obtain or create and register package
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypePackageImpl());

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
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) : DatavaluePackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI) : RequirementPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypePackage.createPackageContents();
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
		theDatavaluePackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theRequirementPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theInteractionPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypePackage.initializePackageContents();
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
		theDatavaluePackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theRequirementPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypePackage.eNS_URI, theDatatypePackage);
		return theDatatypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Discrete() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_MinInclusive() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_MaxInclusive() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Pattern() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Visibility() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_DefaultValue() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_NullValue() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedInformationRealizations() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_RealizedDataTypes() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_RealizingDataTypes() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanType_OwnedLiterals() {
		return (EReference)booleanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanType_OwnedDefaultValue() {
		return (EReference)booleanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedLiterals() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedDefaultValue() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedNullValue() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedMinValue() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedMaxValue() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_DomainType() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringType_OwnedDefaultValue() {
		return (EReference)stringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringType_OwnedNullValue() {
		return (EReference)stringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringType_OwnedMinLength() {
		return (EReference)stringTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringType_OwnedMaxLength() {
		return (EReference)stringTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericType() {
		return numericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericType_Kind() {
		return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericType_OwnedDefaultValue() {
		return (EReference)numericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericType_OwnedNullValue() {
		return (EReference)numericTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericType_OwnedMinValue() {
		return (EReference)numericTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumericType_OwnedMaxValue() {
		return (EReference)numericTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalQuantity() {
		return physicalQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalQuantity_Unit() {
		return (EReference)physicalQuantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumericTypeKind() {
		return numericTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeFactory getDatatypeFactory() {
		return (DatatypeFactory)getEFactoryInstance();
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
		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__DISCRETE);
		createEAttribute(dataTypeEClass, DATA_TYPE__MIN_INCLUSIVE);
		createEAttribute(dataTypeEClass, DATA_TYPE__MAX_INCLUSIVE);
		createEAttribute(dataTypeEClass, DATA_TYPE__PATTERN);
		createEAttribute(dataTypeEClass, DATA_TYPE__VISIBILITY);
		createEReference(dataTypeEClass, DATA_TYPE__DEFAULT_VALUE);
		createEReference(dataTypeEClass, DATA_TYPE__NULL_VALUE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_INFORMATION_REALIZATIONS);
		createEReference(dataTypeEClass, DATA_TYPE__REALIZED_DATA_TYPES);
		createEReference(dataTypeEClass, DATA_TYPE__REALIZING_DATA_TYPES);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);
		createEReference(booleanTypeEClass, BOOLEAN_TYPE__OWNED_LITERALS);
		createEReference(booleanTypeEClass, BOOLEAN_TYPE__OWNED_DEFAULT_VALUE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERALS);
		createEReference(enumerationEClass, ENUMERATION__OWNED_DEFAULT_VALUE);
		createEReference(enumerationEClass, ENUMERATION__OWNED_NULL_VALUE);
		createEReference(enumerationEClass, ENUMERATION__OWNED_MIN_VALUE);
		createEReference(enumerationEClass, ENUMERATION__OWNED_MAX_VALUE);
		createEReference(enumerationEClass, ENUMERATION__DOMAIN_TYPE);

		stringTypeEClass = createEClass(STRING_TYPE);
		createEReference(stringTypeEClass, STRING_TYPE__OWNED_DEFAULT_VALUE);
		createEReference(stringTypeEClass, STRING_TYPE__OWNED_NULL_VALUE);
		createEReference(stringTypeEClass, STRING_TYPE__OWNED_MIN_LENGTH);
		createEReference(stringTypeEClass, STRING_TYPE__OWNED_MAX_LENGTH);

		numericTypeEClass = createEClass(NUMERIC_TYPE);
		createEAttribute(numericTypeEClass, NUMERIC_TYPE__KIND);
		createEReference(numericTypeEClass, NUMERIC_TYPE__OWNED_DEFAULT_VALUE);
		createEReference(numericTypeEClass, NUMERIC_TYPE__OWNED_NULL_VALUE);
		createEReference(numericTypeEClass, NUMERIC_TYPE__OWNED_MIN_VALUE);
		createEReference(numericTypeEClass, NUMERIC_TYPE__OWNED_MAX_VALUE);

		physicalQuantityEClass = createEClass(PHYSICAL_QUANTITY);
		createEReference(physicalQuantityEClass, PHYSICAL_QUANTITY__UNIT);

		// Create enums
		numericTypeKindEEnum = createEEnum(NUMERIC_TYPE_KIND);
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
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);
		InformationPackage theInformationPackage = (InformationPackage)EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataTypeEClass.getESuperTypes().add(theCapellacorePackage.getGeneralizableElement());
		dataTypeEClass.getESuperTypes().add(theDatavaluePackage.getDataValueContainer());
		dataTypeEClass.getESuperTypes().add(theModellingcorePackage.getFinalizableElement());
		booleanTypeEClass.getESuperTypes().add(this.getDataType());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		stringTypeEClass.getESuperTypes().add(this.getDataType());
		numericTypeEClass.getESuperTypes().add(this.getDataType());
		physicalQuantityEClass.getESuperTypes().add(this.getNumericType());

		// Initialize classes and features; add operations and parameters
		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Discrete(), ecorePackage.getEBoolean(), "discrete", "true", 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_MinInclusive(), ecorePackage.getEBoolean(), "minInclusive", "true", 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_MaxInclusive(), ecorePackage.getEBoolean(), "maxInclusive", "true", 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Visibility(), theCapellacorePackage.getVisibilityKind(), "visibility", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_DefaultValue(), theDatavaluePackage.getDataValue(), null, "defaultValue", null, 0, 1, DataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_NullValue(), theDatavaluePackage.getDataValue(), null, "nullValue", null, 0, 1, DataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_OwnedInformationRealizations(), theInformationPackage.getInformationRealization(), null, "ownedInformationRealizations", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_RealizedDataTypes(), this.getDataType(), this.getDataType_RealizingDataTypes(), "realizedDataTypes", null, 0, -1, DataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_RealizingDataTypes(), this.getDataType(), this.getDataType_RealizedDataTypes(), "realizingDataTypes", null, 0, -1, DataType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanType_OwnedLiterals(), theDatavaluePackage.getLiteralBooleanValue(), null, "ownedLiterals", null, 0, 2, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanType_OwnedDefaultValue(), theDatavaluePackage.getAbstractBooleanValue(), null, "ownedDefaultValue", null, 0, 1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_OwnedLiterals(), theDatavaluePackage.getEnumerationLiteral(), null, "ownedLiterals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_OwnedDefaultValue(), theDatavaluePackage.getAbstractEnumerationValue(), null, "ownedDefaultValue", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_OwnedNullValue(), theDatavaluePackage.getAbstractEnumerationValue(), null, "ownedNullValue", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_OwnedMinValue(), theDatavaluePackage.getAbstractEnumerationValue(), null, "ownedMinValue", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_OwnedMaxValue(), theDatavaluePackage.getAbstractEnumerationValue(), null, "ownedMaxValue", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_DomainType(), this.getDataType(), null, "domainType", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringType_OwnedDefaultValue(), theDatavaluePackage.getAbstractStringValue(), null, "ownedDefaultValue", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringType_OwnedNullValue(), theDatavaluePackage.getAbstractStringValue(), null, "ownedNullValue", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringType_OwnedMinLength(), theDatavaluePackage.getNumericValue(), null, "ownedMinLength", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringType_OwnedMaxLength(), theDatavaluePackage.getNumericValue(), null, "ownedMaxLength", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericTypeEClass, NumericType.class, "NumericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericType_Kind(), this.getNumericTypeKind(), "kind", "INTEGER", 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericType_OwnedDefaultValue(), theDatavaluePackage.getNumericValue(), null, "ownedDefaultValue", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericType_OwnedNullValue(), theDatavaluePackage.getNumericValue(), null, "ownedNullValue", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericType_OwnedMinValue(), theDatavaluePackage.getNumericValue(), null, "ownedMinValue", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumericType_OwnedMaxValue(), theDatavaluePackage.getNumericValue(), null, "ownedMaxValue", null, 0, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalQuantityEClass, PhysicalQuantity.class, "PhysicalQuantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalQuantity_Unit(), theInformationPackage.getUnit(), null, "unit", null, 0, 1, PhysicalQuantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(numericTypeKindEEnum, NumericTypeKind.class, "NumericTypeKind");
		addEEnumLiteral(numericTypeKindEEnum, NumericTypeKind.INTEGER);
		addEEnumLiteral(numericTypeKindEEnum, NumericTypeKind.FLOAT);

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
			 "description", "sub-package containing the definition of the predefined data types\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "system,logical,physical",
			 "usage examples", "none",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "n/a"
		   });	
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "description", "A data type is a type whose instances are identified only by their value. A DataType may contain attributes to support the\r\nmodeling of structured data types\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "DataTypes should be created for every grouping of data in the system that makes sense from an application standpoint.\r\nIt is especially valuable to avoid redondancy of data structure definitions, and to breakdown the complexity of data structures into manageable bits.",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getDataType_Discrete(), 
		   source, 
		   new String[] {
			 "description", "specifies whether or not this data type characterizes a discrete value (versus continuous value)\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataType_MinInclusive(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataType_MaxInclusive(), 
		   source, 
		   new String[] {
			 "description", "none",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataType_Pattern(), 
		   source, 
		   new String[] {
			 "description", "textual specification of a constraint associated to this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataType_Visibility(), 
		   source, 
		   new String[] {
			 "description", "refer to VisibilityKind description\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to VisibilityKind definition",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataType_DefaultValue(), 
		   source, 
		   new String[] {
			 "description", "allows to specify a default value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataType_NullValue(), 
		   source, 
		   new String[] {
			 "description", "allows to specify the nature/value of the \"null\" value for this type of data\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataType_RealizedDataTypes(), 
		   source, 
		   new String[] {
			 "description", "class(es) realized by this class",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getDataType_RealizingDataTypes(), 
		   source, 
		   new String[] {
			 "description", "class(es) realizing this class",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
			 "description", "A boolean is an instance of PrimitiveType. In the metamodel, Boolean defines an enumeration that denotes a logical\r\ncondition. Its enumeration literals are:\r\n- true - The Boolean condition is satisfied.\r\n- false - The Boolean condition is not satisfied\r\n[source: UML superstructure v2.2]\r\n",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getBooleanType_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "description", "the literals that are contained in this enumeration\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getBooleanType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "description", "default value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "description", "An enumeration is a kind of data type, whose instances may be any of a number of user-defined enumeration literals\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "an enumeration should be created/used whenever all possible values for a parameter are predefined (and the number of values is reasonably limited...)",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getEnumeration_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "description", "the literals that are contained in this enumeration\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEnumeration_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "description", "default value among this enumeration\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEnumeration_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "description", "Null value among this enumeration\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEnumeration_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "description", "specification of the minimum value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEnumeration_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "description", "specification of the maximum value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getEnumeration_DomainType(), 
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
		  (stringTypeEClass, 
		   source, 
		   new String[] {
			 "description", "A string is a sequence of characters in some suitable character set used to display information about the model\r\n[source: UML superstructure v2.2]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getStringType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "description", "the default value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStringType_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "description", "the neutral value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStringType_OwnedMinLength(), 
		   source, 
		   new String[] {
			 "description", "specification of the minimum length of the string\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getStringType_OwnedMaxLength(), 
		   source, 
		   new String[] {
			 "description", "specification of the maximum length of the string\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (numericTypeEClass, 
		   source, 
		   new String[] {
			 "description", "Characterizes a value that can be expressed by a sequence of numbers\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getNumericType_Kind(), 
		   source, 
		   new String[] {
			 "description", "specifies the kind of this numeric type\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "refer to NumericTypeKind",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getNumericType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "description", "the default value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getNumericType_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "description", "the neutral value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getNumericType_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "description", "specification of the minimum value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getNumericType_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "description", "specification of the maximum value for this data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (physicalQuantityEClass, 
		   source, 
		   new String[] {
			 "description", "A Physical Quantity is a measurable value of a physical property of a thing or a movement. It referes to a Unit.\r\n\r\nA Dimension (SysML notion of Physical Quantity) is a kind of quantity that may be stated by means of defined units. For example, the dimension of length may be measured by units of meters, kilometers, or feet\r\n[source: SysML specification v1.1]",
			 "usage guideline", "n/a",
			 "used in levels", "system/logical/physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getPhysicalQuantity_Unit(), 
		   source, 
		   new String[] {
			 "description", "the unit of this physical dimension\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (numericTypeKindEEnum, 
		   source, 
		   new String[] {
			 "description", "Specifies the kind of this numeric data type\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (numericTypeKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "description", "Used when the numeric type refers to an integer value\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (numericTypeKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "description", "Used when the numeric type refers to a float value\r\n[source: Capella study]",
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
		  (getDataType_Discrete(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_MinInclusive(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_MaxInclusive(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_Pattern(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_Visibility(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_DefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_NullValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_RealizedDataTypes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_RealizingDataTypes(), 
		   source, 
		   new String[] {
			 "excludefrom", "xmlpivot"
		   });	
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanType_OwnedLiterals(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_OwnedLiterals(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_OwnedDefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_OwnedNullValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_OwnedMinValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_OwnedMaxValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_DomainType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stringTypeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringType_OwnedNullValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringType_OwnedMinLength(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringType_OwnedMaxLength(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (numericTypeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericType_Kind(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericType_OwnedNullValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericType_OwnedMinValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericType_OwnedMaxValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (physicalQuantityEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalQuantity_Unit(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (numericTypeKindEEnum, 
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
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "Label", "DataType"
		   });	
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
			 "Label", "BooleanType"
		   });	
		addAnnotation
		  (getBooleanType_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "Label", "literals"
		   });	
		addAnnotation
		  (getBooleanType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "Label", "defaultValue"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "Label", "Enumeration"
		   });	
		addAnnotation
		  (getEnumeration_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "Label", "literals"
		   });	
		addAnnotation
		  (getEnumeration_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "Label", "minValue"
		   });	
		addAnnotation
		  (getEnumeration_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "Label", "maxValue"
		   });	
		addAnnotation
		  (stringTypeEClass, 
		   source, 
		   new String[] {
			 "Label", "StringType"
		   });	
		addAnnotation
		  (getStringType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "Label", "defaultValue"
		   });	
		addAnnotation
		  (getStringType_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "Label", "nullValue"
		   });	
		addAnnotation
		  (getStringType_OwnedMinLength(), 
		   source, 
		   new String[] {
			 "Label", "minLength"
		   });	
		addAnnotation
		  (getStringType_OwnedMaxLength(), 
		   source, 
		   new String[] {
			 "Label", "maxLength"
		   });	
		addAnnotation
		  (numericTypeEClass, 
		   source, 
		   new String[] {
			 "Label", "NumericType"
		   });	
		addAnnotation
		  (getNumericType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "Label", "defaultValue"
		   });	
		addAnnotation
		  (getNumericType_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "Label", "nullValue"
		   });	
		addAnnotation
		  (getNumericType_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "Label", "minValue"
		   });	
		addAnnotation
		  (getNumericType_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "Label", "maxValue"
		   });	
		addAnnotation
		  (physicalQuantityEClass, 
		   source, 
		   new String[] {
			 "Label", "PhysicalDimension"
		   });	
		addAnnotation
		  (getPhysicalQuantity_Unit(), 
		   source, 
		   new String[] {
			 "Label", "unit"
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
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "metaclass", "DataType",
			 "stereotype", "eng.DataType"
		   });	
		addAnnotation
		  (getDataType_Discrete(), 
		   source, 
		   new String[] {
			 "featureName", "isDiscreet",
			 "featureOwner", "eng.DataType",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getDataType_Pattern(), 
		   source, 
		   new String[] {
			 "featureName", "constraint",
			 "featureOwner", "eng.DataType",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
			 "metaclass", "DataType",
			 "stereotype", "eng.BooleanType"
		   });	
		addAnnotation
		  (getBooleanType_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "featureName", "ownedLiteral",
			 "featureOwner", "Enumeration"
		   });	
		addAnnotation
		  (getBooleanType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Enumeration",
			 "stereotype", "eng.Enumeration"
		   });	
		addAnnotation
		  (getEnumeration_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "featureName", "ownedLiteral",
			 "featureOwner", "Enumeration"
		   });	
		addAnnotation
		  (getEnumeration_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getEnumeration_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (stringTypeEClass, 
		   source, 
		   new String[] {
			 "metaclass", "DataType",
			 "stereotype", "eng.StringType"
		   });	
		addAnnotation
		  (getStringType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getStringType_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getStringType_OwnedMinLength(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getStringType_OwnedMaxLength(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (numericTypeEClass, 
		   source, 
		   new String[] {
			 "metaclass", "DataType",
			 "stereotype", "eng.NumericType"
		   });	
		addAnnotation
		  (getNumericType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getNumericType_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getNumericType_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (getNumericType_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "featureName", "clientDependency",
			 "featureOwner", "NamedElement"
		   });	
		addAnnotation
		  (physicalQuantityEClass, 
		   source, 
		   new String[] {
			 "metaclass", "DataType",
			 "stereotype", "eng.PhysicalDimension"
		   });	
		addAnnotation
		  (getPhysicalQuantity_Unit(), 
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
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "uml::DataType",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataType_Discrete(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataType_MinInclusive(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataType_MaxInclusive(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataType_Pattern(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataType_Visibility(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::NamedElement:visibility",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataType_DefaultValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataType_NullValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getDataType_OwnedInformationRealizations(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", ""
		   });	
		addAnnotation
		  (booleanTypeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::PrimitiveType",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBooleanType_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getBooleanType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which BooleanValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Enumeration",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEnumeration_OwnedLiterals(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Enumeration::ownedLiteral",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getEnumeration_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which EnumerationValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getEnumeration_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which EnumerationValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getEnumeration_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "constraints", "uml::NamedElement::clientDependency elements on which NumericType stereotype or any stereotype that inherits from it is applied",
			 "explanation", "_todo_ Treat difference between default, null, min and max values\r\n"
		   });	
		addAnnotation
		  (getEnumeration_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "constraints", "uml::NamedElement::clientDependency elements on which NumericType stereotype or any stereotype that inherits from it is applied",
			 "explanation", "_todo_ Treat difference between default, null, min and max values\r\n"
		   });	
		addAnnotation
		  (getEnumeration_DomainType(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (stringTypeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::DataType",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getStringType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which StringValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getStringType_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which StringValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getStringType_OwnedMinLength(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which FunctionRealization stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getStringType_OwnedMaxLength(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which UnlimitedNaturalValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (numericTypeEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::DataType",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNumericType_Kind(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getNumericType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which NumericValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getNumericType_OwnedNullValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which NumericValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getNumericType_OwnedMinValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which NumericValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (getNumericType_OwnedMaxValue(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::specific",
			 "explanation", "none",
			 "constraints", "Elements on which NumericValue stereotype or any stereotype that inherits from it is applied"
		   });	
		addAnnotation
		  (physicalQuantityEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "should be SysML::Blocks::ValueType, but its parent is concrete and already mapped (to uml::DataType), \r\nso do not map this one too to prevent Papyrus errors.",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getPhysicalQuantity_Unit(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (numericTypeKindEEnum, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (numericTypeKindEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (numericTypeKindEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
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
		  (getDataType_DefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_NullValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_RealizedDataTypes(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDataType_RealizingDataTypes(), 
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
		  (getBooleanType_OwnedLiterals(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBooleanType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_OwnedLiterals(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_OwnedMinValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEnumeration_OwnedMaxValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringType_OwnedNullValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringType_OwnedMinLength(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringType_OwnedMaxLength(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericType_OwnedDefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericType_OwnedNullValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericType_OwnedMinValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNumericType_OwnedMaxValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPhysicalQuantity_Unit(), 
		   source, 
		   new String[] {
		   });
	}

} //DatatypePackageImpl
