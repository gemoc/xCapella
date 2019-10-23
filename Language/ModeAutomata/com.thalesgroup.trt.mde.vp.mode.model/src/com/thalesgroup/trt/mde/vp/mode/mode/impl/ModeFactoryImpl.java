package com.thalesgroup.trt.mde.vp.mode.mode.impl;

import com.thalesgroup.trt.mde.vp.mode.mode.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.polarsys.capella.common.lib.IdGenerator;

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
			ModeFactory theModeFactory = (ModeFactory) EPackage.Registry.INSTANCE.getEFactory(ModePackage.eNS_URI);
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
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeMachine createModeMachine() {
		ModeMachineImpl modeMachine = new ModeMachineImpl();
		//begin-capella-code

		modeMachine.setId(IdGenerator.createId());

		//end-capella-code
		return modeMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode_ createMode_() {
		Mode_Impl mode_ = new Mode_Impl();
		//begin-capella-code

		mode_.setId(IdGenerator.createId());

		//end-capella-code
		return mode_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initial createInitial() {
		InitialImpl initial = new InitialImpl();
		//begin-capella-code

		initial.setId(IdGenerator.createId());

		//end-capella-code
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final createFinal() {
		FinalImpl final_ = new FinalImpl();
		//begin-capella-code

		final_.setId(IdGenerator.createId());

		//end-capella-code
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionJunction createTransitionJunction() {
		TransitionJunctionImpl transitionJunction = new TransitionJunctionImpl();
		//begin-capella-code

		transitionJunction.setId(IdGenerator.createId());

		//end-capella-code
		return transitionJunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryNode createHistoryNode() {
		HistoryNodeImpl historyNode = new HistoryNodeImpl();
		//begin-capella-code

		historyNode.setId(IdGenerator.createId());

		//end-capella-code
		return historyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		//begin-capella-code

		transition.setId(IdGenerator.createId());

		//end-capella-code
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

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public ModeMachine createModeMachine(String name_p) {
		ModeMachine modeMachine = createModeMachine();
		modeMachine.setName(name_p);
		return modeMachine;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Mode_ createMode_(String name_p) {
		Mode_ mode_ = createMode_();
		mode_.setName(name_p);
		return mode_;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Initial createInitial(String name_p) {
		Initial initial = createInitial();
		initial.setName(name_p);
		return initial;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Final createFinal(String name_p) {
		Final final_ = createFinal();
		final_.setName(name_p);
		return final_;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public TransitionJunction createTransitionJunction(String name_p) {
		TransitionJunction transitionJunction = createTransitionJunction();
		transitionJunction.setName(name_p);
		return transitionJunction;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public HistoryNode createHistoryNode(String name_p) {
		HistoryNode historyNode = createHistoryNode();
		historyNode.setName(name_p);
		return historyNode;
	}

	/**
	 * Creates class and sets its name
	 * (This method comes from a customization of the standard EMF generator)
	 *
	 * @param name_p : default name of created element
	 * @generated
	 */
	public Transition createTransition(String name_p) {
		Transition transition = createTransition();
		transition.setName(name_p);
		return transition;
	}

} //ModeFactoryImpl
