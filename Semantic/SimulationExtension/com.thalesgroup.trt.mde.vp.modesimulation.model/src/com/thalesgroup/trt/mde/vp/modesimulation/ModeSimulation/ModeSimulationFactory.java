package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage
 * @generated
 */
public interface ModeSimulationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeSimulationFactory eINSTANCE = com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Transition Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Runtime Data</em>'.
	 * @generated
	 */
	TransitionRuntimeData createTransitionRuntimeData();

	/**
	 * Returns a new object of class '<em>Mode Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Runtime Data</em>'.
	 * @generated
	 */
	ModeRuntimeData createModeRuntimeData();

	/**
	 * Returns a new object of class '<em>Guard Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard Runtime Data</em>'.
	 * @generated
	 */
	GuardRuntimeData createGuardRuntimeData();

	/**
	 * Returns a new object of class '<em>Machine Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Runtime Data</em>'.
	 * @generated
	 */
	MachineRuntimeData createMachineRuntimeData();

	/**
	 * Returns a new object of class '<em>Component Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Runtime Data</em>'.
	 * @generated
	 */
	ComponentRuntimeData createComponentRuntimeData();

	/**
	 * Returns a new object of class '<em>Function Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Runtime Data</em>'.
	 * @generated
	 */
	FunctionRuntimeData createFunctionRuntimeData();

	/**
	 * Returns a new object of class '<em>Functional Chain Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Chain Runtime Data</em>'.
	 * @generated
	 */
	FunctionalChainRuntimeData createFunctionalChainRuntimeData();

	/**
	 * Returns a new object of class '<em>Expression Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Runtime Data</em>'.
	 * @generated
	 */
	ExpressionRuntimeData createExpressionRuntimeData();

	/**
	 * Returns a new object of class '<em>Clock Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Runtime Data</em>'.
	 * @generated
	 */
	ClockRuntimeData createClockRuntimeData();

	/**
	 * Returns a new object of class '<em>Event Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Runtime Data</em>'.
	 * @generated
	 */
	EventRuntimeData createEventRuntimeData();

	/**
	 * Returns a new object of class '<em>Action Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Runtime Data</em>'.
	 * @generated
	 */
	ActionRuntimeData createActionRuntimeData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModeSimulationPackage getModeSimulationPackage();

} //ModeSimulationFactory
