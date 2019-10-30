package com.thalesgroup.trt.mde.vp.al.al.impl;

import com.thalesgroup.trt.mde.vp.al.al.Action;
import com.thalesgroup.trt.mde.vp.al.al.ActionInput;
import com.thalesgroup.trt.mde.vp.al.al.ActionOutput;
import com.thalesgroup.trt.mde.vp.al.al.ActionValueInput;
import com.thalesgroup.trt.mde.vp.al.al.ActionValueOutput;
import com.thalesgroup.trt.mde.vp.al.al.AlFactory;
import com.thalesgroup.trt.mde.vp.al.al.AlPackage;
import com.thalesgroup.trt.mde.vp.al.al.BroadcastCommunicationAction;
import com.thalesgroup.trt.mde.vp.al.al.BroadcastEventAction;
import com.thalesgroup.trt.mde.vp.al.al.CallBehaviorAction;
import com.thalesgroup.trt.mde.vp.al.al.CreateValueAction;
import com.thalesgroup.trt.mde.vp.al.al.DeleteValueAction;
import com.thalesgroup.trt.mde.vp.al.al.ReadValueAction;
import com.thalesgroup.trt.mde.vp.al.al.SendCommunicationAction;
import com.thalesgroup.trt.mde.vp.al.al.SendEventAction;
import com.thalesgroup.trt.mde.vp.al.al.UpdateValueAction;

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
public class AlPackageImpl extends EPackageImpl implements AlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionValueInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionValueOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendCommunicationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastCommunicationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteValueActionEClass = null;

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
	 * @see com.thalesgroup.trt.mde.vp.al.al.AlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlPackageImpl() {
		super(eNS_URI, AlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlPackage init() {
		if (isInited)
			return (AlPackage) EPackage.Registry.INSTANCE.getEPackage(AlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlPackageImpl theAlPackage = registeredAlPackage instanceof AlPackageImpl ? (AlPackageImpl) registeredAlPackage
				: new AlPackageImpl();

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
		ModellingcorePackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAlPackage.createPackageContents();

		// Initialize created meta-data
		theAlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlPackage.eNS_URI, theAlPackage);
		return theAlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionInput() {
		return actionInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionInput_InputCheckingAction() {
		return (EReference) actionInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionValueInput() {
		return actionValueInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionValueInput_Value() {
		return (EReference) actionValueInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionOutput() {
		return actionOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionOutput_OutputCheckingAction() {
		return (EReference) actionOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionValueOutput() {
		return actionValueOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionValueOutput_Value() {
		return (EReference) actionValueOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_ExecutionSuccess() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBehaviorAction() {
		return callBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallBehaviorAction_Arguments() {
		return (EReference) callBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallBehaviorAction_Behavior() {
		return (EReference) callBehaviorActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendEventAction() {
		return sendEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendEventAction_Target() {
		return (EReference) sendEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastEventAction() {
		return broadcastEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastEventAction_Event() {
		return (EReference) broadcastEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendCommunicationAction() {
		return sendCommunicationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendCommunicationAction_Target() {
		return (EReference) sendCommunicationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastCommunicationAction() {
		return broadcastCommunicationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastCommunicationAction_Communication() {
		return (EReference) broadcastCommunicationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateValueAction() {
		return createValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateValueAction_Object() {
		return (EReference) createValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateValueAction_Value() {
		return (EReference) createValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadValueAction() {
		return readValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadValueAction_Value() {
		return (EReference) readValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadValueAction_Result() {
		return (EAttribute) readValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateValueAction() {
		return updateValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateValueAction_UpdateableValue() {
		return (EReference) updateValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateValueAction_NewValue() {
		return (EReference) updateValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteValueAction() {
		return deleteValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteValueAction_Value() {
		return (EReference) deleteValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlFactory getAlFactory() {
		return (AlFactory) getEFactoryInstance();
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
		actionInputEClass = createEClass(ACTION_INPUT);
		createEReference(actionInputEClass, ACTION_INPUT__INPUT_CHECKING_ACTION);

		actionValueInputEClass = createEClass(ACTION_VALUE_INPUT);
		createEReference(actionValueInputEClass, ACTION_VALUE_INPUT__VALUE);

		actionOutputEClass = createEClass(ACTION_OUTPUT);
		createEReference(actionOutputEClass, ACTION_OUTPUT__OUTPUT_CHECKING_ACTION);

		actionValueOutputEClass = createEClass(ACTION_VALUE_OUTPUT);
		createEReference(actionValueOutputEClass, ACTION_VALUE_OUTPUT__VALUE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__EXECUTION_SUCCESS);

		callBehaviorActionEClass = createEClass(CALL_BEHAVIOR_ACTION);
		createEReference(callBehaviorActionEClass, CALL_BEHAVIOR_ACTION__ARGUMENTS);
		createEReference(callBehaviorActionEClass, CALL_BEHAVIOR_ACTION__BEHAVIOR);

		sendEventActionEClass = createEClass(SEND_EVENT_ACTION);
		createEReference(sendEventActionEClass, SEND_EVENT_ACTION__TARGET);

		broadcastEventActionEClass = createEClass(BROADCAST_EVENT_ACTION);
		createEReference(broadcastEventActionEClass, BROADCAST_EVENT_ACTION__EVENT);

		sendCommunicationActionEClass = createEClass(SEND_COMMUNICATION_ACTION);
		createEReference(sendCommunicationActionEClass, SEND_COMMUNICATION_ACTION__TARGET);

		broadcastCommunicationActionEClass = createEClass(BROADCAST_COMMUNICATION_ACTION);
		createEReference(broadcastCommunicationActionEClass, BROADCAST_COMMUNICATION_ACTION__COMMUNICATION);

		createValueActionEClass = createEClass(CREATE_VALUE_ACTION);
		createEReference(createValueActionEClass, CREATE_VALUE_ACTION__OBJECT);
		createEReference(createValueActionEClass, CREATE_VALUE_ACTION__VALUE);

		readValueActionEClass = createEClass(READ_VALUE_ACTION);
		createEReference(readValueActionEClass, READ_VALUE_ACTION__VALUE);
		createEAttribute(readValueActionEClass, READ_VALUE_ACTION__RESULT);

		updateValueActionEClass = createEClass(UPDATE_VALUE_ACTION);
		createEReference(updateValueActionEClass, UPDATE_VALUE_ACTION__UPDATEABLE_VALUE);
		createEReference(updateValueActionEClass, UPDATE_VALUE_ACTION__NEW_VALUE);

		deleteValueActionEClass = createEClass(DELETE_VALUE_ACTION);
		createEReference(deleteValueActionEClass, DELETE_VALUE_ACTION__VALUE);
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
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ModellingcorePackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);
		CommunicationPackage theCommunicationPackage = (CommunicationPackage) EPackage.Registry.INSTANCE
				.getEPackage(CommunicationPackage.eNS_URI);

		// Add supertypes to classes
		actionInputEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		actionValueInputEClass.getESuperTypes().add(this.getActionInput());
		actionOutputEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		actionValueOutputEClass.getESuperTypes().add(this.getActionOutput());
		actionEClass.getESuperTypes().add(theCapellacorePackage.getNamedElement());
		callBehaviorActionEClass.getESuperTypes().add(this.getAction());
		sendEventActionEClass.getESuperTypes().add(this.getBroadcastEventAction());
		broadcastEventActionEClass.getESuperTypes().add(this.getAction());
		sendCommunicationActionEClass.getESuperTypes().add(this.getBroadcastCommunicationAction());
		broadcastCommunicationActionEClass.getESuperTypes().add(this.getAction());
		createValueActionEClass.getESuperTypes().add(this.getAction());
		readValueActionEClass.getESuperTypes().add(this.getAction());
		updateValueActionEClass.getESuperTypes().add(this.getAction());
		deleteValueActionEClass.getESuperTypes().add(this.getAction());

		// Initialize classes and features; add operations and parameters
		initEClass(actionInputEClass, ActionInput.class, "ActionInput", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionInput_InputCheckingAction(), this.getAction(), null, "inputCheckingAction", null, 0, -1, //$NON-NLS-1$
				ActionInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionValueInputEClass, ActionValueInput.class, "ActionValueInput", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionValueInput_Value(), theModellingcorePackage.getValueSpecification(), null, "value", //$NON-NLS-1$
				null, 1, 1, ActionValueInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionOutputEClass, ActionOutput.class, "ActionOutput", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionOutput_OutputCheckingAction(), this.getAction(), null, "outputCheckingAction", null, 0, //$NON-NLS-1$
				-1, ActionOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionValueOutputEClass, ActionValueOutput.class, "ActionValueOutput", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionValueOutput_Value(), theModellingcorePackage.getValueSpecification(), null, "value", //$NON-NLS-1$
				null, 1, 1, ActionValueOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAction_ExecutionSuccess(), this.getActionValueOutput(), null, "executionSuccess", null, 0, 1, //$NON-NLS-1$
				Action.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callBehaviorActionEClass, CallBehaviorAction.class, "CallBehaviorAction", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallBehaviorAction_Arguments(), this.getActionInput(), null, "arguments", null, 0, -1, //$NON-NLS-1$
				CallBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCallBehaviorAction_Behavior(), theBehaviorPackage.getAbstractBehavior(), null, "behavior", //$NON-NLS-1$
				null, 1, 1, CallBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendEventActionEClass, SendEventAction.class, "SendEventAction", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendEventAction_Target(), theCapellacorePackage.getCapellaElement(), null, "target", null, 1, //$NON-NLS-1$
				-1, SendEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(broadcastEventActionEClass, BroadcastEventAction.class, "BroadcastEventAction", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBroadcastEventAction_Event(), theBehaviorPackage.getAbstractEvent(), null, "event", null, 1, //$NON-NLS-1$
				-1, BroadcastEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendCommunicationActionEClass, SendCommunicationAction.class, "SendCommunicationAction", //$NON-NLS-1$
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendCommunicationAction_Target(), theCapellacorePackage.getCapellaElement(), null, "target", //$NON-NLS-1$
				null, 1, -1, SendCommunicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(broadcastCommunicationActionEClass, BroadcastCommunicationAction.class,
				"BroadcastCommunicationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getBroadcastCommunicationAction_Communication(), theCommunicationPackage.getCommunicationItem(),
				null, "communication", null, 1, -1, BroadcastCommunicationAction.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createValueActionEClass, CreateValueAction.class, "CreateValueAction", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateValueAction_Object(), theCapellacorePackage.getCapellaElement(), null, "object", null, //$NON-NLS-1$
				1, -1, CreateValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCreateValueAction_Value(), this.getActionValueInput(), null, "value", null, 1, -1, //$NON-NLS-1$
				CreateValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readValueActionEClass, ReadValueAction.class, "ReadValueAction", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadValueAction_Value(), this.getActionValueInput(), null, "value", null, 1, 1, //$NON-NLS-1$
				ReadValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadValueAction_Result(), ecorePackage.getEString(), "result", null, 0, 1, //$NON-NLS-1$
				ReadValueAction.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(updateValueActionEClass, UpdateValueAction.class, "UpdateValueAction", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateValueAction_UpdateableValue(), this.getActionValueInput(), null, "updateableValue", //$NON-NLS-1$
				null, 1, 1, UpdateValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateValueAction_NewValue(), this.getActionValueInput(), null, "newValue", null, 1, 1, //$NON-NLS-1$
				UpdateValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteValueActionEClass, DeleteValueAction.class, "DeleteValueAction", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeleteValueAction_Value(), this.getActionValueInput(), null, "value", null, 1, -1, //$NON-NLS-1$
				DeleteValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AlPackageImpl
