package com.thalesgroup.trt.mde.vp.mode.mode.impl;

import com.thalesgroup.trt.mde.vp.mode.mode.*;

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
public class ModeFactoryImpl extends EFactoryImpl implements ModeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeFactory init() {
		try {
			ModeFactory theModeFactory = (ModeFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.thalesgroup.com/trt/mode/1.0.0"); //$NON-NLS-1$ 
			if (theModeFactory != null) {
				return theModeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeFactoryImpl() {
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
		case ModePackage.MODE_MACHINE:
			return createModeMachine();
		case ModePackage.MODE_:
			return createMode_();
		case ModePackage.INITIAL:
			return createInitial();
		case ModePackage.FINAL:
			return createFinal();
		case ModePackage.TRANSITION_JUNCTION:
			return createTransitionJunction();
		case ModePackage.HISTORY_NODE:
			return createHistoryNode();
		case ModePackage.TRANSITION:
			return createTransition();
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
	public ModeMachine createModeMachine() {
		ModeMachineImpl modeMachine = new ModeMachineImpl();
		return modeMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode_ createMode_() {
		Mode_Impl mode_ = new Mode_Impl();
		return mode_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initial createInitial() {
		InitialImpl initial = new InitialImpl();
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final createFinal() {
		FinalImpl final_ = new FinalImpl();
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionJunction createTransitionJunction() {
		TransitionJunctionImpl transitionJunction = new TransitionJunctionImpl();
		return transitionJunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryNode createHistoryNode() {
		HistoryNodeImpl historyNode = new HistoryNodeImpl();
		return historyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModePackage getModePackage() {
		return (ModePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModePackage getPackage() {
		return ModePackage.eINSTANCE;
	}

} //ModeFactoryImpl
