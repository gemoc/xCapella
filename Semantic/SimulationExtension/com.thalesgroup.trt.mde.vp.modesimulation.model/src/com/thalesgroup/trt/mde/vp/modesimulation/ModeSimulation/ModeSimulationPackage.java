package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.core.data.capellacore.CapellacorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationFactory
 * @model kind="package"
 * @generated
 */
public interface ModeSimulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModeSimulation"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.thalesgroup.com/trt/modesimulation/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ModeSimulation"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeSimulationPackage eINSTANCE = com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.TransitionRuntimeDataImpl <em>Transition Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.TransitionRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getTransitionRuntimeData()
	 * @generated
	 */
	int TRANSITION_RUNTIME_DATA = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Transition Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeRuntimeDataImpl <em>Mode Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getModeRuntimeData()
	 * @generated
	 */
	int MODE_RUNTIME_DATA = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Mode Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.GuardRuntimeDataImpl <em>Guard Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.GuardRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getGuardRuntimeData()
	 * @generated
	 */
	int GUARD_RUNTIME_DATA = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Guard Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.MachineRuntimeDataImpl <em>Machine Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.MachineRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getMachineRuntimeData()
	 * @generated
	 */
	int MACHINE_RUNTIME_DATA = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA__CURRENT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Machine Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ComponentRuntimeDataImpl <em>Component Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ComponentRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getComponentRuntimeData()
	 * @generated
	 */
	int COMPONENT_RUNTIME_DATA = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Component Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionRuntimeDataImpl <em>Function Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getFunctionRuntimeData()
	 * @generated
	 */
	int FUNCTION_RUNTIME_DATA = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__IS_ACTIVE = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__IS_STARTED = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA__IS_RUNNING = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionalChainRuntimeDataImpl <em>Functional Chain Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionalChainRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getFunctionalChainRuntimeData()
	 * @generated
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA__IS_ACTIVE = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Chain Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ExpressionRuntimeDataImpl <em>Expression Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ExpressionRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getExpressionRuntimeData()
	 * @generated
	 */
	int EXPRESSION_RUNTIME_DATA = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Expression Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ClockRuntimeDataImpl <em>Clock Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ClockRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getClockRuntimeData()
	 * @generated
	 */
	int CLOCK_RUNTIME_DATA = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Number Of Ticks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA__NUMBER_OF_TICKS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.EventRuntimeDataImpl <em>Event Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.EventRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getEventRuntimeData()
	 * @generated
	 */
	int EVENT_RUNTIME_DATA = 9;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Solliciting Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA__SOLLICITING_TRANSITIONS = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ActionRuntimeDataImpl <em>Action Runtime Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ActionRuntimeDataImpl
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getActionRuntimeData()
	 * @generated
	 */
	int ACTION_RUNTIME_DATA = 10;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The number of structural features of the '<em>Action Runtime Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RUNTIME_DATA_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.TransitionRuntimeData <em>Transition Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.TransitionRuntimeData
	 * @generated
	 */
	EClass getTransitionRuntimeData();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeRuntimeData <em>Mode Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeRuntimeData
	 * @generated
	 */
	EClass getModeRuntimeData();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.GuardRuntimeData <em>Guard Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.GuardRuntimeData
	 * @generated
	 */
	EClass getGuardRuntimeData();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData <em>Machine Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData
	 * @generated
	 */
	EClass getMachineRuntimeData();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.MachineRuntimeData#getCurrent()
	 * @see #getMachineRuntimeData()
	 * @generated
	 */
	EReference getMachineRuntimeData_Current();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ComponentRuntimeData <em>Component Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ComponentRuntimeData
	 * @generated
	 */
	EClass getComponentRuntimeData();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData <em>Function Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData
	 * @generated
	 */
	EClass getFunctionRuntimeData();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData#isIsActive()
	 * @see #getFunctionRuntimeData()
	 * @generated
	 */
	EAttribute getFunctionRuntimeData_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData#isIsStarted <em>Is Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Started</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData#isIsStarted()
	 * @see #getFunctionRuntimeData()
	 * @generated
	 */
	EAttribute getFunctionRuntimeData_IsStarted();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData#isIsRunning <em>Is Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Running</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionRuntimeData#isIsRunning()
	 * @see #getFunctionRuntimeData()
	 * @generated
	 */
	EAttribute getFunctionRuntimeData_IsRunning();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData <em>Functional Chain Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Chain Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData
	 * @generated
	 */
	EClass getFunctionalChainRuntimeData();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.FunctionalChainRuntimeData#isIsActive()
	 * @see #getFunctionalChainRuntimeData()
	 * @generated
	 */
	EAttribute getFunctionalChainRuntimeData_IsActive();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ExpressionRuntimeData <em>Expression Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ExpressionRuntimeData
	 * @generated
	 */
	EClass getExpressionRuntimeData();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData <em>Clock Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData
	 * @generated
	 */
	EClass getClockRuntimeData();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData#getNumberOfTicks <em>Number Of Ticks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Ticks</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ClockRuntimeData#getNumberOfTicks()
	 * @see #getClockRuntimeData()
	 * @generated
	 */
	EAttribute getClockRuntimeData_NumberOfTicks();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData <em>Event Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData
	 * @generated
	 */
	EClass getEventRuntimeData();

	/**
	 * Returns the meta object for the reference list '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData#getSollicitingTransitions <em>Solliciting Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solliciting Transitions</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.EventRuntimeData#getSollicitingTransitions()
	 * @see #getEventRuntimeData()
	 * @generated
	 */
	EReference getEventRuntimeData_SollicitingTransitions();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ActionRuntimeData <em>Action Runtime Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Runtime Data</em>'.
	 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ActionRuntimeData
	 * @generated
	 */
	EClass getActionRuntimeData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeSimulationFactory getModeSimulationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.TransitionRuntimeDataImpl <em>Transition Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.TransitionRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getTransitionRuntimeData()
		 * @generated
		 */
		EClass TRANSITION_RUNTIME_DATA = eINSTANCE.getTransitionRuntimeData();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeRuntimeDataImpl <em>Mode Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getModeRuntimeData()
		 * @generated
		 */
		EClass MODE_RUNTIME_DATA = eINSTANCE.getModeRuntimeData();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.GuardRuntimeDataImpl <em>Guard Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.GuardRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getGuardRuntimeData()
		 * @generated
		 */
		EClass GUARD_RUNTIME_DATA = eINSTANCE.getGuardRuntimeData();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.MachineRuntimeDataImpl <em>Machine Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.MachineRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getMachineRuntimeData()
		 * @generated
		 */
		EClass MACHINE_RUNTIME_DATA = eINSTANCE.getMachineRuntimeData();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE_RUNTIME_DATA__CURRENT = eINSTANCE
				.getMachineRuntimeData_Current();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ComponentRuntimeDataImpl <em>Component Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ComponentRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getComponentRuntimeData()
		 * @generated
		 */
		EClass COMPONENT_RUNTIME_DATA = eINSTANCE.getComponentRuntimeData();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionRuntimeDataImpl <em>Function Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getFunctionRuntimeData()
		 * @generated
		 */
		EClass FUNCTION_RUNTIME_DATA = eINSTANCE.getFunctionRuntimeData();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RUNTIME_DATA__IS_ACTIVE = eINSTANCE
				.getFunctionRuntimeData_IsActive();

		/**
		 * The meta object literal for the '<em><b>Is Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RUNTIME_DATA__IS_STARTED = eINSTANCE
				.getFunctionRuntimeData_IsStarted();

		/**
		 * The meta object literal for the '<em><b>Is Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_RUNTIME_DATA__IS_RUNNING = eINSTANCE
				.getFunctionRuntimeData_IsRunning();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionalChainRuntimeDataImpl <em>Functional Chain Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.FunctionalChainRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getFunctionalChainRuntimeData()
		 * @generated
		 */
		EClass FUNCTIONAL_CHAIN_RUNTIME_DATA = eINSTANCE
				.getFunctionalChainRuntimeData();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_CHAIN_RUNTIME_DATA__IS_ACTIVE = eINSTANCE
				.getFunctionalChainRuntimeData_IsActive();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ExpressionRuntimeDataImpl <em>Expression Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ExpressionRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getExpressionRuntimeData()
		 * @generated
		 */
		EClass EXPRESSION_RUNTIME_DATA = eINSTANCE.getExpressionRuntimeData();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ClockRuntimeDataImpl <em>Clock Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ClockRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getClockRuntimeData()
		 * @generated
		 */
		EClass CLOCK_RUNTIME_DATA = eINSTANCE.getClockRuntimeData();

		/**
		 * The meta object literal for the '<em><b>Number Of Ticks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_RUNTIME_DATA__NUMBER_OF_TICKS = eINSTANCE
				.getClockRuntimeData_NumberOfTicks();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.EventRuntimeDataImpl <em>Event Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.EventRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getEventRuntimeData()
		 * @generated
		 */
		EClass EVENT_RUNTIME_DATA = eINSTANCE.getEventRuntimeData();

		/**
		 * The meta object literal for the '<em><b>Solliciting Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_RUNTIME_DATA__SOLLICITING_TRANSITIONS = eINSTANCE
				.getEventRuntimeData_SollicitingTransitions();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ActionRuntimeDataImpl <em>Action Runtime Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ActionRuntimeDataImpl
		 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.impl.ModeSimulationPackageImpl#getActionRuntimeData()
		 * @generated
		 */
		EClass ACTION_RUNTIME_DATA = eINSTANCE.getActionRuntimeData();

	}

} //ModeSimulationPackage
