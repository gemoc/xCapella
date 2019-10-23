package com.thalesgroup.trt.mde.vp.mode.mode;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.trt.mde.vp.mode.mode.ModePackage
 * @generated
 */
public interface ModeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeFactory eINSTANCE = com.thalesgroup.trt.mde.vp.mode.mode.impl.ModeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	ModeMachine createModeMachine();

	/**
	 * Returns a new object of class '<em>Mode </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode </em>'.
	 * @generated
	 */
	Mode_ createMode_();

	/**
	 * Returns a new object of class '<em>Initial</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial</em>'.
	 * @generated
	 */
	Initial createInitial();

	/**
	 * Returns a new object of class '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Final</em>'.
	 * @generated
	 */
	Final createFinal();

	/**
	 * Returns a new object of class '<em>Transition Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition Junction</em>'.
	 * @generated
	 */
	TransitionJunction createTransitionJunction();

	/**
	 * Returns a new object of class '<em>History Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Node</em>'.
	 * @generated
	 */
	HistoryNode createHistoryNode();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModePackage getModePackage();

} //ModeFactory
