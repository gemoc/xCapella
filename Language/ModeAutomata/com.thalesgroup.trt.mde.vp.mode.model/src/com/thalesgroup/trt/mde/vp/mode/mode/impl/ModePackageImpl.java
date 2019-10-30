package com.thalesgroup.trt.mde.vp.mode.mode.impl;

import com.thalesgroup.trt.mde.vp.al.al.AlPackage;

import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;

import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;
import com.thalesgroup.trt.mde.vp.mode.mode.ControlNode;
import com.thalesgroup.trt.mde.vp.mode.mode.Final;
import com.thalesgroup.trt.mde.vp.mode.mode.HistoryNode;
import com.thalesgroup.trt.mde.vp.mode.mode.Initial;
import com.thalesgroup.trt.mde.vp.mode.mode.ModeFactory;
import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.Mode_;
import com.thalesgroup.trt.mde.vp.mode.mode.Transition;
import com.thalesgroup.trt.mde.vp.mode.mode.TransitionJunction;

import com.thalesgroup.trt.mde.vp.time.time.TimePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.common.data.activity.ActivityPackage;
import org.polarsys.capella.common.data.behavior.BehaviorPackage;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.capella.core.data.capellamodeller.CapellamodellerPackage;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.ctx.CtxPackage;
import org.polarsys.capella.core.data.epbs.EpbsPackage;
import org.polarsys.capella.core.data.fa.FaPackage;

import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.information.communication.CommunicationPackage;

import org.polarsys.capella.core.data.interaction.InteractionPackage;
import org.polarsys.capella.core.data.la.LaPackage;
import org.polarsys.capella.core.data.oa.OaPackage;
import org.polarsys.capella.core.data.pa.PaPackage;
import org.polarsys.capella.core.data.requirement.RequirementPackage;
import org.polarsys.capella.core.data.sharedmodel.SharedmodelPackage;
import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModePackageImpl extends EPackageImpl implements ModePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mode_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionJunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

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
	 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModePackageImpl() {
		super(eNS_URI, ModeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModePackage init() {
		if (isInited)
			return (ModePackage) EPackage.Registry.INSTANCE.getEPackage(ModePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModePackageImpl theModePackage = registeredModePackage instanceof ModePackageImpl
				? (ModePackageImpl) registeredModePackage
				: new ModePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EmdePackage.eINSTANCE.eClass();
		ActivityPackage.eINSTANCE.eClass();
		CapellamodellerPackage.eINSTANCE.eClass();
		CapellacorePackage.eINSTANCE.eClass();
		OaPackage.eINSTANCE.eClass();
		CtxPackage.eINSTANCE.eClass();
		LaPackage.eINSTANCE.eClass();
		PaPackage.eINSTANCE.eClass();
		EpbsPackage.eINSTANCE.eClass();
		SharedmodelPackage.eINSTANCE.eClass();
		RequirementPackage.eINSTANCE.eClass();
		CapellacommonPackage.eINSTANCE.eClass();
		InformationPackage.eINSTANCE.eClass();
		CsPackage.eINSTANCE.eClass();
		FaPackage.eINSTANCE.eClass();
		InteractionPackage.eINSTANCE.eClass();
		TimePackage.eINSTANCE.eClass();
		ModellingcorePackage.eINSTANCE.eClass();
		AlPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();
		ExpressionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModePackage.createPackageContents();

		// Initialize created meta-data
		theModePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModePackage.eNS_URI, theModePackage);
		return theModePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeMachine() {
		return modeMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachine_OwnedModes() {
		return (EReference) modeMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachine_OwnedTransitions() {
		return (EReference) modeMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachine_InputEvents() {
		return (EReference) modeMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachine_InputSignals() {
		return (EReference) modeMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachine_OutputEvents() {
		return (EReference) modeMachineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachine_OutputSignals() {
		return (EReference) modeMachineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachine_LocalClocks() {
		return (EReference) modeMachineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachine_LocalVariables() {
		return (EReference) modeMachineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeMachine_Initial() {
		return (EReference) modeMachineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMode() {
		return abstractModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMode_OutgoingTransitions() {
		return (EReference) abstractModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMode_IncomingTransitions() {
		return (EReference) abstractModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode_() {
		return mode_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode__EnterActions() {
		return (EReference) mode_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode__DoActions() {
		return (EReference) mode_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode__ExitActions() {
		return (EReference) mode_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode__AvailableFunctionalChains() {
		return (EReference) mode_EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode__SubModeMachine() {
		return (EReference) mode_EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitial() {
		return initialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinal() {
		return finalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinal_EnterActions() {
		return (EReference) finalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionJunction() {
		return transitionJunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryNode() {
		return historyNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Actions() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_TimeBudget() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_GeneratedEvents() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Priority() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeFactory getModeFactory() {
		return (ModeFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modeMachineEClass = createEClass(MODE_MACHINE);
		createEReference(modeMachineEClass, MODE_MACHINE__OWNED_MODES);
		createEReference(modeMachineEClass, MODE_MACHINE__OWNED_TRANSITIONS);
		createEReference(modeMachineEClass, MODE_MACHINE__INPUT_EVENTS);
		createEReference(modeMachineEClass, MODE_MACHINE__INPUT_SIGNALS);
		createEReference(modeMachineEClass, MODE_MACHINE__OUTPUT_EVENTS);
		createEReference(modeMachineEClass, MODE_MACHINE__OUTPUT_SIGNALS);
		createEReference(modeMachineEClass, MODE_MACHINE__LOCAL_CLOCKS);
		createEReference(modeMachineEClass, MODE_MACHINE__LOCAL_VARIABLES);
		createEReference(modeMachineEClass, MODE_MACHINE__INITIAL);

		abstractModeEClass = createEClass(ABSTRACT_MODE);
		createEReference(abstractModeEClass, ABSTRACT_MODE__OUTGOING_TRANSITIONS);
		createEReference(abstractModeEClass, ABSTRACT_MODE__INCOMING_TRANSITIONS);

		mode_EClass = createEClass(MODE_);
		createEReference(mode_EClass, MODE___ENTER_ACTIONS);
		createEReference(mode_EClass, MODE___DO_ACTIONS);
		createEReference(mode_EClass, MODE___EXIT_ACTIONS);
		createEReference(mode_EClass, MODE___AVAILABLE_FUNCTIONAL_CHAINS);
		createEReference(mode_EClass, MODE___SUB_MODE_MACHINE);

		controlNodeEClass = createEClass(CONTROL_NODE);

		initialEClass = createEClass(INITIAL);

		finalEClass = createEClass(FINAL);
		createEReference(finalEClass, FINAL__ENTER_ACTIONS);

		transitionJunctionEClass = createEClass(TRANSITION_JUNCTION);

		historyNodeEClass = createEClass(HISTORY_NODE);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__TRIGGER);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEReference(transitionEClass, TRANSITION__ACTIONS);
		createEReference(transitionEClass, TRANSITION__TIME_BUDGET);
		createEReference(transitionEClass, TRANSITION__GENERATED_EVENTS);
		createEAttribute(transitionEClass, TRANSITION__PRIORITY);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage) EPackage.Registry.INSTANCE
				.getEPackage(CapellacorePackage.eNS_URI);
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);
		CommunicationPackage theCommunicationPackage = (CommunicationPackage) EPackage.Registry.INSTANCE
				.getEPackage(CommunicationPackage.eNS_URI);
		TimePackage theTimePackage = (TimePackage) EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExpressionPackage.eNS_URI);
		AlPackage theAlPackage = (AlPackage) EPackage.Registry.INSTANCE.getEPackage(AlPackage.eNS_URI);
		FaPackage theFaPackage = (FaPackage) EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modeMachineEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		modeMachineEClass.getESuperTypes().add(theEmdePackage.getElementExtension());
		abstractModeEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		mode_EClass.getESuperTypes().add(this.getAbstractMode());
		controlNodeEClass.getESuperTypes().add(this.getAbstractMode());
		initialEClass.getESuperTypes().add(this.getControlNode());
		finalEClass.getESuperTypes().add(this.getControlNode());
		transitionJunctionEClass.getESuperTypes().add(this.getControlNode());
		historyNodeEClass.getESuperTypes().add(this.getControlNode());
		transitionEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(modeMachineEClass, ModeMachine.class, "ModeMachine", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeMachine_OwnedModes(), this.getAbstractMode(), null, "ownedModes", null, 0, -1, //$NON-NLS-1$
				ModeMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeMachine_OwnedTransitions(), this.getTransition(), null, "ownedTransitions", null, 0, -1, //$NON-NLS-1$
				ModeMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeMachine_InputEvents(), theBehaviorPackage.getAbstractEvent(), null, "inputEvents", null, //$NON-NLS-1$
				0, -1, ModeMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeMachine_InputSignals(), theCommunicationPackage.getSignal(), null, "inputSignals", null, //$NON-NLS-1$
				0, -1, ModeMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeMachine_OutputEvents(), theBehaviorPackage.getAbstractEvent(), null, "outputEvents", null, //$NON-NLS-1$
				0, -1, ModeMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeMachine_OutputSignals(), theCommunicationPackage.getSignal(), null, "outputSignals", null, //$NON-NLS-1$
				0, -1, ModeMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeMachine_LocalClocks(), theTimePackage.getClock(), null, "localClocks", null, 0, -1, //$NON-NLS-1$
				ModeMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeMachine_LocalVariables(), theExpressionPackage.getVariable(), null, "localVariables", //$NON-NLS-1$
				null, 0, -1, ModeMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeMachine_Initial(), this.getInitial(), null, "initial", null, 1, 1, ModeMachine.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractModeEClass, AbstractMode.class, "AbstractMode", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMode_OutgoingTransitions(), this.getTransition(), null, "outgoingTransitions", null, //$NON-NLS-1$
				0, -1, AbstractMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMode_IncomingTransitions(), this.getTransition(), null, "incomingTransitions", null, //$NON-NLS-1$
				0, -1, AbstractMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mode_EClass, Mode_.class, "Mode_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getMode__EnterActions(), theAlPackage.getAction(), null, "enterActions", null, 0, -1, //$NON-NLS-1$
				Mode_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode__DoActions(), theAlPackage.getAction(), null, "doActions", null, 0, -1, Mode_.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode__ExitActions(), theAlPackage.getAction(), null, "exitActions", null, 0, -1, Mode_.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode__AvailableFunctionalChains(), theFaPackage.getFunctionalChain(), null,
				"availableFunctionalChains", null, 0, -1, Mode_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, //$NON-NLS-1$
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode__SubModeMachine(), this.getModeMachine(), null, "subModeMachine", null, 0, 1, //$NON-NLS-1$
				Mode_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(initialEClass, Initial.class, "Initial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFinal_EnterActions(), theAlPackage.getAction(), null, "enterActions", null, 0, -1, //$NON-NLS-1$
				Final.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionJunctionEClass, TransitionJunction.class, "TransitionJunction", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historyNodeEClass, HistoryNode.class, "HistoryNode", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getAbstractMode(), null, "source", null, 1, 1, Transition.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getAbstractMode(), null, "target", null, 1, 1, Transition.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Trigger(), theExpressionPackage.getEventExpression(), null, "trigger", null, 0, 1, //$NON-NLS-1$
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Guard(), theExpressionPackage.getAbstractGuard(), null, "guard", null, 0, 1, //$NON-NLS-1$
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Actions(), theAlPackage.getAction(), null, "actions", null, 0, -1, //$NON-NLS-1$
				Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_TimeBudget(), theExpressionPackage.getDurationExpression(), null, "timeBudget", //$NON-NLS-1$
				null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_GeneratedEvents(), theBehaviorPackage.getAbstractEvent(), null, "generatedEvents", //$NON-NLS-1$
				null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Transition.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraint
		createConstraintAnnotations();
		// http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping
		createConstraintMappingAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$
		addAnnotation(modeMachineEClass, source,
				new String[] { "ExtendedElement", " http://www.polarsys.org/capella/core/cs/1.3.0#//Component" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintMappingAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping"; //$NON-NLS-1$
		addAnnotation(modeMachineEClass, source, new String[] { "Mapping", //$NON-NLS-1$
				" platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Component" //$NON-NLS-1$
		});
	}

} //ModePackageImpl
