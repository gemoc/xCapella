package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl;

import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeSimulationFactoryImpl extends EFactoryImpl implements
		ModeSimulationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeSimulationFactory init() {
		try {
			ModeSimulationFactory theModeSimulationFactory = (ModeSimulationFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.thalesgroup.com/trt/modesimulation/1.0.0"); //$NON-NLS-1$ 
			if (theModeSimulationFactory != null) {
				return theModeSimulationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeSimulationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSimulationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModeSimulationPackage.TRANSITION_RUNTIME_DATA:
			return createTransitionRuntimeData();
		case ModeSimulationPackage.MODE_RUNTIME_DATA:
			return createModeRuntimeData();
		case ModeSimulationPackage.GUARD_RUNTIME_DATA:
			return createGuardRuntimeData();
		case ModeSimulationPackage.MACHINE_RUNTIME_DATA:
			return createMachineRuntimeData();
		case ModeSimulationPackage.COMPONENT_RUNTIME_DATA:
			return createComponentRuntimeData();
		case ModeSimulationPackage.FUNCTION_RUNTIME_DATA:
			return createFunctionRuntimeData();
		case ModeSimulationPackage.FUNCTIONAL_CHAIN_RUNTIME_DATA:
			return createFunctionalChainRuntimeData();
		case ModeSimulationPackage.EXPRESSION_RUNTIME_DATA:
			return createExpressionRuntimeData();
		case ModeSimulationPackage.CLOCK_RUNTIME_DATA:
			return createClockRuntimeData();
		case ModeSimulationPackage.EVENT_RUNTIME_DATA:
			return createEventRuntimeData();
		case ModeSimulationPackage.ACTION_RUNTIME_DATA:
			return createActionRuntimeData();
		default:
			throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionRuntimeData createTransitionRuntimeData() {
		TransitionRuntimeDataImpl transitionRuntimeData = new TransitionRuntimeDataImpl();
		return transitionRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeRuntimeData createModeRuntimeData() {
		ModeRuntimeDataImpl modeRuntimeData = new ModeRuntimeDataImpl();
		return modeRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardRuntimeData createGuardRuntimeData() {
		GuardRuntimeDataImpl guardRuntimeData = new GuardRuntimeDataImpl();
		return guardRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineRuntimeData createMachineRuntimeData() {
		MachineRuntimeDataImpl machineRuntimeData = new MachineRuntimeDataImpl();
		return machineRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentRuntimeData createComponentRuntimeData() {
		ComponentRuntimeDataImpl componentRuntimeData = new ComponentRuntimeDataImpl();
		return componentRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionRuntimeData createFunctionRuntimeData() {
		FunctionRuntimeDataImpl functionRuntimeData = new FunctionRuntimeDataImpl();
		return functionRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChainRuntimeData createFunctionalChainRuntimeData() {
		FunctionalChainRuntimeDataImpl functionalChainRuntimeData = new FunctionalChainRuntimeDataImpl();
		return functionalChainRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionRuntimeData createExpressionRuntimeData() {
		ExpressionRuntimeDataImpl expressionRuntimeData = new ExpressionRuntimeDataImpl();
		return expressionRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockRuntimeData createClockRuntimeData() {
		ClockRuntimeDataImpl clockRuntimeData = new ClockRuntimeDataImpl();
		return clockRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRuntimeData createEventRuntimeData() {
		EventRuntimeDataImpl eventRuntimeData = new EventRuntimeDataImpl();
		return eventRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionRuntimeData createActionRuntimeData() {
		ActionRuntimeDataImpl actionRuntimeData = new ActionRuntimeDataImpl();
		return actionRuntimeData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeSimulationPackage getModeSimulationPackage() {
		return (ModeSimulationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModeSimulationPackage getPackage() {
		return ModeSimulationPackage.eINSTANCE;
	}

} //ModeSimulationFactoryImpl
