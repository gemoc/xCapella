package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl;

import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;

import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ActionRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ComponentRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ExpressionRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.GuardRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeRuntimeData;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationFactory;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.TransitionRuntimeData;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

import org.polarsys.kitalpha.emde.model.EmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeSimulationPackageImpl extends EPackageImpl implements
		ModeSimulationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventRuntimeDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionRuntimeDataEClass = null;

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
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModeSimulationPackageImpl() {
		super(eNS_URI, ModeSimulationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModeSimulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModeSimulationPackage init() {
		if (isInited)
			return (ModeSimulationPackage) EPackage.Registry.INSTANCE
					.getEPackage(ModeSimulationPackage.eNS_URI);

		// Obtain or create and register package
		ModeSimulationPackageImpl theModeSimulationPackage = (ModeSimulationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ModeSimulationPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ModeSimulationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModeSimulationPackage.createPackageContents();

		// Initialize created meta-data
		theModeSimulationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModeSimulationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModeSimulationPackage.eNS_URI,
				theModeSimulationPackage);
		return theModeSimulationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionRuntimeData() {
		return transitionRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeRuntimeData() {
		return modeRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuardRuntimeData() {
		return guardRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachineRuntimeData() {
		return machineRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachineRuntimeData_Current() {
		return (EReference) machineRuntimeDataEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRuntimeData() {
		return componentRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionRuntimeData() {
		return functionRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionRuntimeData_IsActive() {
		return (EAttribute) functionRuntimeDataEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionRuntimeData_IsStarted() {
		return (EAttribute) functionRuntimeDataEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionRuntimeData_IsRunning() {
		return (EAttribute) functionRuntimeDataEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalChainRuntimeData() {
		return functionalChainRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalChainRuntimeData_IsActive() {
		return (EAttribute) functionalChainRuntimeDataEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionRuntimeData() {
		return expressionRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockRuntimeData() {
		return clockRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockRuntimeData_NumberOfTicks() {
		return (EAttribute) clockRuntimeDataEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventRuntimeData() {
		return eventRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventRuntimeData_SollicitingTransitions() {
		return (EReference) eventRuntimeDataEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionRuntimeData() {
		return actionRuntimeDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSimulationFactory getModeSimulationFactory() {
		return (ModeSimulationFactory) getEFactoryInstance();
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
		transitionRuntimeDataEClass = createEClass(TRANSITION_RUNTIME_DATA);

		modeRuntimeDataEClass = createEClass(MODE_RUNTIME_DATA);

		guardRuntimeDataEClass = createEClass(GUARD_RUNTIME_DATA);

		machineRuntimeDataEClass = createEClass(MACHINE_RUNTIME_DATA);
		createEReference(machineRuntimeDataEClass,
				MACHINE_RUNTIME_DATA__CURRENT);

		componentRuntimeDataEClass = createEClass(COMPONENT_RUNTIME_DATA);

		functionRuntimeDataEClass = createEClass(FUNCTION_RUNTIME_DATA);
		createEAttribute(functionRuntimeDataEClass,
				FUNCTION_RUNTIME_DATA__IS_ACTIVE);
		createEAttribute(functionRuntimeDataEClass,
				FUNCTION_RUNTIME_DATA__IS_STARTED);
		createEAttribute(functionRuntimeDataEClass,
				FUNCTION_RUNTIME_DATA__IS_RUNNING);

		functionalChainRuntimeDataEClass = createEClass(FUNCTIONAL_CHAIN_RUNTIME_DATA);
		createEAttribute(functionalChainRuntimeDataEClass,
				FUNCTIONAL_CHAIN_RUNTIME_DATA__IS_ACTIVE);

		expressionRuntimeDataEClass = createEClass(EXPRESSION_RUNTIME_DATA);

		clockRuntimeDataEClass = createEClass(CLOCK_RUNTIME_DATA);
		createEAttribute(clockRuntimeDataEClass,
				CLOCK_RUNTIME_DATA__NUMBER_OF_TICKS);

		eventRuntimeDataEClass = createEClass(EVENT_RUNTIME_DATA);
		createEReference(eventRuntimeDataEClass,
				EVENT_RUNTIME_DATA__SOLLICITING_TRANSITIONS);

		actionRuntimeDataEClass = createEClass(ACTION_RUNTIME_DATA);
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
		EmdePackage theEmdePackage = (EmdePackage) EPackage.Registry.INSTANCE
				.getEPackage(EmdePackage.eNS_URI);
		ModePackage theModePackage = (ModePackage) EPackage.Registry.INSTANCE
				.getEPackage(ModePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transitionRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		transitionRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		modeRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		modeRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		guardRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		guardRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		machineRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		machineRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		componentRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		componentRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		functionRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		functionRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		functionalChainRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		functionalChainRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		expressionRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		expressionRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		clockRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		clockRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		eventRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		eventRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());
		actionRuntimeDataEClass.getESuperTypes().add(
				theCapellacorePackage.getNamedElement());
		actionRuntimeDataEClass.getESuperTypes().add(
				theEmdePackage.getElementExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(
				transitionRuntimeDataEClass,
				TransitionRuntimeData.class,
				"TransitionRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(transitionRuntimeDataEClass, ecorePackage.getEString(),
				"fire", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(transitionRuntimeDataEClass, ecorePackage.getEBoolean(),
				"evaluate", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(transitionRuntimeDataEClass, ecorePackage.getEString(),
				"reset", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				modeRuntimeDataEClass,
				ModeRuntimeData.class,
				"ModeRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(modeRuntimeDataEClass, ecorePackage.getEString(),
				"onEnter", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(modeRuntimeDataEClass, ecorePackage.getEString(),
				"onLeave", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				guardRuntimeDataEClass,
				GuardRuntimeData.class,
				"GuardRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(guardRuntimeDataEClass, ecorePackage.getEBoolean(),
				"evaluate", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				machineRuntimeDataEClass,
				MachineRuntimeData.class,
				"MachineRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getMachineRuntimeData_Current(),
				theModePackage.getAbstractMode(),
				null,
				"current", null, 0, 1, MachineRuntimeData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(machineRuntimeDataEClass, ecorePackage.getEString(),
				"init", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(machineRuntimeDataEClass, null,
				"changeCurrentState", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theModePackage.getAbstractMode(),
				"newState", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(machineRuntimeDataEClass, ecorePackage.getEString(),
				"launchWhileActions", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				componentRuntimeDataEClass,
				ComponentRuntimeData.class,
				"ComponentRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(componentRuntimeDataEClass, ecorePackage.getEString(),
				"init", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				functionRuntimeDataEClass,
				FunctionRuntimeData.class,
				"FunctionRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getFunctionRuntimeData_IsActive(),
				ecorePackage.getEBoolean(),
				"isActive", null, 0, 1, FunctionRuntimeData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getFunctionRuntimeData_IsStarted(),
				ecorePackage.getEBoolean(),
				"isStarted", null, 0, 1, FunctionRuntimeData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getFunctionRuntimeData_IsRunning(),
				ecorePackage.getEBoolean(),
				"isRunning", null, 0, 1, FunctionRuntimeData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(functionRuntimeDataEClass, ecorePackage.getEString(),
				"activate", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(functionRuntimeDataEClass, ecorePackage.getEString(),
				"start", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(functionRuntimeDataEClass, ecorePackage.getEString(),
				"run", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(functionRuntimeDataEClass, ecorePackage.getEString(),
				"stop", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(functionRuntimeDataEClass, ecorePackage.getEString(),
				"deactivate", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				functionalChainRuntimeDataEClass,
				FunctionalChainRuntimeData.class,
				"FunctionalChainRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getFunctionalChainRuntimeData_IsActive(),
				ecorePackage.getEBoolean(),
				"isActive", null, 0, 1, FunctionalChainRuntimeData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(functionalChainRuntimeDataEClass,
				ecorePackage.getEString(),
				"activate", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(functionalChainRuntimeDataEClass,
				ecorePackage.getEString(),
				"deactivate", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(functionalChainRuntimeDataEClass,
				ecorePackage.getEString(), "init", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				expressionRuntimeDataEClass,
				ExpressionRuntimeData.class,
				"ExpressionRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(expressionRuntimeDataEClass, ecorePackage.getEBoolean(),
				"evaluate", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				clockRuntimeDataEClass,
				ClockRuntimeData.class,
				"ClockRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getClockRuntimeData_NumberOfTicks(),
				ecorePackage.getEInt(),
				"numberOfTicks", null, 0, 1, ClockRuntimeData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(clockRuntimeDataEClass, ecorePackage.getEString(),
				"ticks", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				eventRuntimeDataEClass,
				EventRuntimeData.class,
				"EventRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getEventRuntimeData_SollicitingTransitions(),
				theModePackage.getTransition(),
				null,
				"sollicitingTransitions", null, 0, -1, EventRuntimeData.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(eventRuntimeDataEClass, ecorePackage.getEString(),
				"occurs", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				actionRuntimeDataEClass,
				ActionRuntimeData.class,
				"ActionRuntimeData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(actionRuntimeDataEClass, ecorePackage.getEString(),
				"execute", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

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
		addAnnotation(
				transitionRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.thalesgroup.com/trt/mode/1.0.0#//Transition" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				modeRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.thalesgroup.com/trt/mode/1.0.0#//AbstractMode" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				guardRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.thalesgroup.com/trt/expression/1.0.0#//AbstractGuard" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				machineRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.thalesgroup.com/trt/mode/1.0.0#//ModeMachine" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				componentRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.polarsys.org/capella/core/cs/0.8.0#//Component" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				functionRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.polarsys.org/capella/core/fa/0.8.0#//AbstractFunction" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				functionalChainRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.polarsys.org/capella/core/fa/0.8.0#//FunctionalChain" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				expressionRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.thalesgroup.com/trt/expression/1.0.0#//Expression http://www.thalesgroup.com/trt/expression/1.0.0#//EventExpression" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				clockRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.thalesgroup.com/trt/time/1.0.0#//Clock" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				eventRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.polarsys.org/capella/common/behavior/0.8.0#//AbstractEvent" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				actionRuntimeDataEClass,
				source,
				new String[] {
						"ExtendedElement", " http://www.thalesgroup.com/trt/al/1.0.0#//Action" //$NON-NLS-1$ //$NON-NLS-2$
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
		addAnnotation(
				transitionRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/resource/com.thalesgroup.trt.mde.vp.mode/models/mode.ecore#//Transition" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				modeRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/resource/com.thalesgroup.trt.mde.vp.mode/models/mode.ecore#//AbstractMode" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				guardRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/resource/com.thalesgroup.trt.mde.vp.expression/models/expression.ecore#//AbstractGuard" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				machineRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/resource/com.thalesgroup.trt.mde.vp.mode/models/mode.ecore#//ModeMachine" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				componentRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/plugin/org.polarsys.capella.core.data.gen/model/CompositeStructure.ecore#//Component" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				functionRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//AbstractFunction" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				functionalChainRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/plugin/org.polarsys.capella.core.data.gen/model/FunctionalAnalysis.ecore#//FunctionalChain" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				expressionRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/resource/com.thalesgroup.trt.mde.vp.expression/models/expression.ecore#//Expression platform:/resource/com.thalesgroup.trt.mde.vp.expression/models/expression.ecore#//EventExpression" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				clockRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/resource/com.thalesgroup.trt.mde.vp.time/models/time.ecore#//Clock" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				eventRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/plugin/org.polarsys.capella.common.data.behavior.gen/model/Behavior.ecore#//AbstractEvent" //$NON-NLS-1$ //$NON-NLS-2$
				});
		addAnnotation(
				actionRuntimeDataEClass,
				source,
				new String[] {
						"Mapping", " platform:/resource/com.thalesgroup.trt.mde.vp.al/models/al.ecore#//Action" //$NON-NLS-1$ //$NON-NLS-2$
				});
	}

} //ModeSimulationPackageImpl
