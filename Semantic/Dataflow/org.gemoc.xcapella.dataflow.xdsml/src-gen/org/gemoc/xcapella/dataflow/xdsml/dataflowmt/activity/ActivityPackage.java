/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.BehaviorPackage;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ModellingcorePackage;

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
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/kitalpha/dsl/2007/dslfactory trackResourceModification='true' useUUIDs='false' useIDAttributes='true' extensibleProviderFactory='true' childCreationExtenders='true'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Activity aims at completing the implementation of the UML Activity provided by the FunctionalArchitecture in order to make it fully supportable anytime.\r\n[source: Capella study]' usage\040guideline='none' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='none' constraints='This package depends on the model Behavior.ecore' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/extension trackResourceModification='true' useUUIDs='false' useIDAttributes='true' extensibleProviderFactory='true' childCreationExtenders='true'"
 * @generated
 */
public interface ActivityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.xcapella.dataflow.xdsml.dataflowmt/activity/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.polarsys.capella.common.data.activity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityPackage eINSTANCE = org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AbstractActivityImpl <em>Abstract Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AbstractActivityImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getAbstractActivity()
	 * @generated
	 */
	int ABSTRACT_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__OWNED_EXTENSIONS = BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__ID = BehaviorPackage.ABSTRACT_BEHAVIOR__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__SID = BehaviorPackage.ABSTRACT_BEHAVIOR__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__CONSTRAINTS = BehaviorPackage.ABSTRACT_BEHAVIOR__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__OWNED_CONSTRAINTS = BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__NAME = BehaviorPackage.ABSTRACT_BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Is Control Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__IS_CONTROL_OPERATOR = BehaviorPackage.ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR;

	/**
	 * The feature id for the '<em><b>Owned Parameter Set</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__OWNED_PARAMETER_SET = BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER_SET;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__OWNED_PARAMETER = BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__INCOMING_TRACES = BehaviorPackage.ABSTRACT_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__OUTGOING_TRACES = BehaviorPackage.ABSTRACT_BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__IS_READ_ONLY = BehaviorPackage.ABSTRACT_BEHAVIOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Single Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION = BehaviorPackage.ABSTRACT_BEHAVIOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__OWNED_NODES = BehaviorPackage.ABSTRACT_BEHAVIOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__OWNED_EDGES = BehaviorPackage.ABSTRACT_BEHAVIOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__OWNED_GROUPS = BehaviorPackage.ABSTRACT_BEHAVIOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Structured Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY__OWNED_STRUCTURED_NODES = BehaviorPackage.ABSTRACT_BEHAVIOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Abstract Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY_FEATURE_COUNT = BehaviorPackage.ABSTRACT_BEHAVIOR_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ExceptionHandlerImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getExceptionHandler()
	 * @generated
	 */
	int EXCEPTION_HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__OWNED_EXTENSIONS = ModellingcorePackage.MODEL_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__ID = ModellingcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__SID = ModellingcorePackage.MODEL_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__CONSTRAINTS = ModellingcorePackage.MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__OWNED_CONSTRAINTS = ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Protected Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__PROTECTED_NODE = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__HANDLER_BODY = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exception Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__EXCEPTION_INPUT = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exception Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__EXCEPTION_TYPES = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_FEATURE_COUNT = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityGroupImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityGroup()
	 * @generated
	 */
	int ACTIVITY_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_EXTENSIONS = ModellingcorePackage.MODEL_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__ID = ModellingcorePackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__SID = ModellingcorePackage.MODEL_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__CONSTRAINTS = ModellingcorePackage.MODEL_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_CONSTRAINTS = ModellingcorePackage.MODEL_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__SUPER_GROUP = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__SUB_GROUPS = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_NODES = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OWNED_EDGES = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP_FEATURE_COUNT = ModellingcorePackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.InterruptibleActivityRegionImpl <em>Interruptible Activity Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.InterruptibleActivityRegionImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getInterruptibleActivityRegion()
	 * @generated
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__OWNED_EXTENSIONS = ACTIVITY_GROUP__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__ID = ACTIVITY_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__SID = ACTIVITY_GROUP__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__CONSTRAINTS = ACTIVITY_GROUP__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__OWNED_CONSTRAINTS = ACTIVITY_GROUP__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__SUPER_GROUP = ACTIVITY_GROUP__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__SUB_GROUPS = ACTIVITY_GROUP__SUB_GROUPS;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__OWNED_NODES = ACTIVITY_GROUP__OWNED_NODES;

	/**
	 * The feature id for the '<em><b>Owned Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__OWNED_EDGES = ACTIVITY_GROUP__OWNED_EDGES;

	/**
	 * The feature id for the '<em><b>Interrupting Edges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES = ACTIVITY_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interruptible Activity Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPTIBLE_ACTIVITY_REGION_FEATURE_COUNT = ACTIVITY_GROUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityEdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityEdgeImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__OWNED_EXTENSIONS = ModellingcorePackage.ABSTRACT_RELATIONSHIP__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__ID = ModellingcorePackage.ABSTRACT_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SID = ModellingcorePackage.ABSTRACT_RELATIONSHIP__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__CONSTRAINTS = ModellingcorePackage.ABSTRACT_RELATIONSHIP__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__OWNED_CONSTRAINTS = ModellingcorePackage.ABSTRACT_RELATIONSHIP__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Realized Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__REALIZED_FLOW = ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;

	/**
	 * The feature id for the '<em><b>Kind Of Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__KIND_OF_RATE = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__IN_ACTIVITY_PARTITION = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__IN_STRUCTURED_NODE = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__RATE = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__PROBABILITY = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__GUARD = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__WEIGHT = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Interrupts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__INTERRUPTS = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = ModellingcorePackage.ABSTRACT_RELATIONSHIP_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ControlFlowImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__OWNED_EXTENSIONS = ACTIVITY_EDGE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__ID = ACTIVITY_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SID = ACTIVITY_EDGE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__CONSTRAINTS = ACTIVITY_EDGE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__OWNED_CONSTRAINTS = ACTIVITY_EDGE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Realized Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__REALIZED_FLOW = ACTIVITY_EDGE__REALIZED_FLOW;

	/**
	 * The feature id for the '<em><b>Kind Of Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__KIND_OF_RATE = ACTIVITY_EDGE__KIND_OF_RATE;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__IN_ACTIVITY_PARTITION = ACTIVITY_EDGE__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__IN_INTERRUPTIBLE_REGION = ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__IN_STRUCTURED_NODE = ACTIVITY_EDGE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__RATE = ACTIVITY_EDGE__RATE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__PROBABILITY = ACTIVITY_EDGE__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__GUARD = ACTIVITY_EDGE__GUARD;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__WEIGHT = ACTIVITY_EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Interrupts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__INTERRUPTS = ACTIVITY_EDGE__INTERRUPTS;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ObjectFlowImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getObjectFlow()
	 * @generated
	 */
	int OBJECT_FLOW = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__OWNED_EXTENSIONS = ACTIVITY_EDGE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__ID = ACTIVITY_EDGE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__SID = ACTIVITY_EDGE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__CONSTRAINTS = ACTIVITY_EDGE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__OWNED_CONSTRAINTS = ACTIVITY_EDGE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Realized Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__REALIZED_FLOW = ACTIVITY_EDGE__REALIZED_FLOW;

	/**
	 * The feature id for the '<em><b>Kind Of Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__KIND_OF_RATE = ACTIVITY_EDGE__KIND_OF_RATE;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IN_ACTIVITY_PARTITION = ACTIVITY_EDGE__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IN_INTERRUPTIBLE_REGION = ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IN_STRUCTURED_NODE = ACTIVITY_EDGE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__RATE = ACTIVITY_EDGE__RATE;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__PROBABILITY = ACTIVITY_EDGE__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__GUARD = ACTIVITY_EDGE__GUARD;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__WEIGHT = ACTIVITY_EDGE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Interrupts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__INTERRUPTS = ACTIVITY_EDGE__INTERRUPTS;

	/**
	 * The feature id for the '<em><b>Is Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IS_MULTICAST = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Multireceive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__IS_MULTIRECEIVE = ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__TRANSFORMATION = ACTIVITY_EDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW__SELECTION = ACTIVITY_EDGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPartitionImpl <em>Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPartitionImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityPartition()
	 * @generated
	 */
	int ACTIVITY_PARTITION = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__OWNED_EXTENSIONS = ACTIVITY_GROUP__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__ID = ACTIVITY_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SID = ACTIVITY_GROUP__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__CONSTRAINTS = ACTIVITY_GROUP__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__OWNED_CONSTRAINTS = ACTIVITY_GROUP__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUPER_GROUP = ACTIVITY_GROUP__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUB_GROUPS = ACTIVITY_GROUP__SUB_GROUPS;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__OWNED_NODES = ACTIVITY_GROUP__OWNED_NODES;

	/**
	 * The feature id for the '<em><b>Owned Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__OWNED_EDGES = ACTIVITY_GROUP__OWNED_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__NAME = ACTIVITY_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__IS_DIMENSION = ACTIVITY_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__IS_EXTERNAL = ACTIVITY_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Represented Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__REPRESENTED_ELEMENT = ACTIVITY_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Super Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUPER_PARTITION = ACTIVITY_GROUP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sub Partitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION__SUB_PARTITIONS = ACTIVITY_GROUP_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PARTITION_FEATURE_COUNT = ACTIVITY_GROUP_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityExchangeImpl <em>Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityExchangeImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityExchange()
	 * @generated
	 */
	int ACTIVITY_EXCHANGE = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__OWNED_EXTENSIONS = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__ID = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__SID = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__CONSTRAINTS = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__OWNED_CONSTRAINTS = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__NAME = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Realized Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__REALIZED_FLOW = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZED_FLOW;

	/**
	 * The feature id for the '<em><b>Realizations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__REALIZATIONS = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__REALIZATIONS;

	/**
	 * The feature id for the '<em><b>Convoyed Informations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__CONVOYED_INFORMATIONS = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__CONVOYED_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__SOURCE = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__TARGET = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW__TARGET;

	/**
	 * The feature id for the '<em><b>Realizing Activity Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EXCHANGE_FEATURE_COUNT = ModellingcorePackage.ABSTRACT_INFORMATION_FLOW_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 9;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OWNED_EXTENSIONS = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ID = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__SID = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__CONSTRAINTS = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OWNED_CONSTRAINTS = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__IN_ACTIVITY_PARTITION = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__IN_STRUCTURED_NODE = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OUTGOING = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INCOMING = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = ModellingcorePackage.ABSTRACT_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ExecutableNodeImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 10;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OWNED_EXTENSIONS = ACTIVITY_NODE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__ID = ACTIVITY_NODE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__SID = ACTIVITY_NODE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__CONSTRAINTS = ACTIVITY_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OWNED_CONSTRAINTS = ACTIVITY_NODE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_ACTIVITY_PARTITION = ACTIVITY_NODE__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION = ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__IN_STRUCTURED_NODE = ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Owned Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OWNED_HANDLERS = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.StructuredActivityNodeImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getStructuredActivityNode()
	 * @generated
	 */
	int STRUCTURED_ACTIVITY_NODE = 11;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_EXTENSIONS = ACTIVITY_GROUP__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__ID = ACTIVITY_GROUP__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__SID = ACTIVITY_GROUP__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__CONSTRAINTS = ACTIVITY_GROUP__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_CONSTRAINTS = ACTIVITY_GROUP__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Super Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__SUPER_GROUP = ACTIVITY_GROUP__SUPER_GROUP;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__SUB_GROUPS = ACTIVITY_GROUP__SUB_GROUPS;

	/**
	 * The feature id for the '<em><b>Owned Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_NODES = ACTIVITY_GROUP__OWNED_NODES;

	/**
	 * The feature id for the '<em><b>Owned Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_EDGES = ACTIVITY_GROUP__OWNED_EDGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__NAME = ACTIVITY_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY_PARTITION = ACTIVITY_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION = ACTIVITY_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE = ACTIVITY_GROUP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OUTGOING = ACTIVITY_GROUP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__INCOMING = ACTIVITY_GROUP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS = ACTIVITY_GROUP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION = ACTIVITY_GROUP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION = ACTIVITY_GROUP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__CONTEXT = ACTIVITY_GROUP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__INPUTS = ACTIVITY_GROUP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE__OUTPUTS = ACTIVITY_GROUP_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Structured Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_ACTIVITY_NODE_FEATURE_COUNT = ACTIVITY_GROUP_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AbstractActionImpl <em>Abstract Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AbstractActionImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getAbstractAction()
	 * @generated
	 */
	int ABSTRACT_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__OWNED_EXTENSIONS = EXECUTABLE_NODE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__ID = EXECUTABLE_NODE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__SID = EXECUTABLE_NODE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__CONSTRAINTS = EXECUTABLE_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__OWNED_CONSTRAINTS = EXECUTABLE_NODE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__IN_ACTIVITY_PARTITION = EXECUTABLE_NODE__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__IN_INTERRUPTIBLE_REGION = EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__IN_STRUCTURED_NODE = EXECUTABLE_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__OUTGOING = EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__INCOMING = EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Owned Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__OWNED_HANDLERS = EXECUTABLE_NODE__OWNED_HANDLERS;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__LOCAL_PRECONDITION = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__LOCAL_POSTCONDITION = EXECUTABLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__CONTEXT = EXECUTABLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__INPUTS = EXECUTABLE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION__OUTPUTS = EXECUTABLE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AcceptEventActionImpl <em>Accept Event Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AcceptEventActionImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getAcceptEventAction()
	 * @generated
	 */
	int ACCEPT_EVENT_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OWNED_EXTENSIONS = ABSTRACT_ACTION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__ID = ABSTRACT_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__SID = ABSTRACT_ACTION__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__CONSTRAINTS = ABSTRACT_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OWNED_CONSTRAINTS = ABSTRACT_ACTION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__NAME = ABSTRACT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IN_ACTIVITY_PARTITION = ABSTRACT_ACTION__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IN_INTERRUPTIBLE_REGION = ABSTRACT_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IN_STRUCTURED_NODE = ABSTRACT_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OUTGOING = ABSTRACT_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__INCOMING = ABSTRACT_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Owned Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OWNED_HANDLERS = ABSTRACT_ACTION__OWNED_HANDLERS;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__LOCAL_PRECONDITION = ABSTRACT_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__LOCAL_POSTCONDITION = ABSTRACT_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__CONTEXT = ABSTRACT_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__INPUTS = ABSTRACT_ACTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__OUTPUTS = ABSTRACT_ACTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Is Unmarshall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__IS_UNMARSHALL = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION__RESULT = ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accept Event Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_EVENT_ACTION_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.InvocationActionImpl <em>Invocation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.InvocationActionImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getInvocationAction()
	 * @generated
	 */
	int INVOCATION_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OWNED_EXTENSIONS = ABSTRACT_ACTION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__ID = ABSTRACT_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__SID = ABSTRACT_ACTION__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__CONSTRAINTS = ABSTRACT_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OWNED_CONSTRAINTS = ABSTRACT_ACTION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__NAME = ABSTRACT_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__IN_ACTIVITY_PARTITION = ABSTRACT_ACTION__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION = ABSTRACT_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__IN_STRUCTURED_NODE = ABSTRACT_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OUTGOING = ABSTRACT_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__INCOMING = ABSTRACT_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Owned Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OWNED_HANDLERS = ABSTRACT_ACTION__OWNED_HANDLERS;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__LOCAL_PRECONDITION = ABSTRACT_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__LOCAL_POSTCONDITION = ABSTRACT_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__CONTEXT = ABSTRACT_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__INPUTS = ABSTRACT_ACTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__OUTPUTS = ABSTRACT_ACTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION__ARGUMENTS = ABSTRACT_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invocation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_ACTION_FEATURE_COUNT = ABSTRACT_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.SendSignalActionImpl <em>Send Signal Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.SendSignalActionImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getSendSignalAction()
	 * @generated
	 */
	int SEND_SIGNAL_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OWNED_EXTENSIONS = INVOCATION_ACTION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__ID = INVOCATION_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__SID = INVOCATION_ACTION__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__CONSTRAINTS = INVOCATION_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OWNED_CONSTRAINTS = INVOCATION_ACTION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__NAME = INVOCATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IN_ACTIVITY_PARTITION = INVOCATION_ACTION__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IN_INTERRUPTIBLE_REGION = INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__IN_STRUCTURED_NODE = INVOCATION_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OUTGOING = INVOCATION_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__INCOMING = INVOCATION_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Owned Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OWNED_HANDLERS = INVOCATION_ACTION__OWNED_HANDLERS;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__LOCAL_PRECONDITION = INVOCATION_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__LOCAL_POSTCONDITION = INVOCATION_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__CONTEXT = INVOCATION_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__INPUTS = INVOCATION_ACTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__OUTPUTS = INVOCATION_ACTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__ARGUMENTS = INVOCATION_ACTION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__TARGET = INVOCATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION__SIGNAL = INVOCATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Send Signal Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_ACTION_FEATURE_COUNT = INVOCATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.CallActionImpl <em>Call Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.CallActionImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getCallAction()
	 * @generated
	 */
	int CALL_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OWNED_EXTENSIONS = INVOCATION_ACTION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ID = INVOCATION_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__SID = INVOCATION_ACTION__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__CONSTRAINTS = INVOCATION_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OWNED_CONSTRAINTS = INVOCATION_ACTION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__NAME = INVOCATION_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IN_ACTIVITY_PARTITION = INVOCATION_ACTION__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IN_INTERRUPTIBLE_REGION = INVOCATION_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__IN_STRUCTURED_NODE = INVOCATION_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OUTGOING = INVOCATION_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INCOMING = INVOCATION_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Owned Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OWNED_HANDLERS = INVOCATION_ACTION__OWNED_HANDLERS;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__LOCAL_PRECONDITION = INVOCATION_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__LOCAL_POSTCONDITION = INVOCATION_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__CONTEXT = INVOCATION_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__INPUTS = INVOCATION_ACTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__OUTPUTS = INVOCATION_ACTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__ARGUMENTS = INVOCATION_ACTION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION__RESULTS = INVOCATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_ACTION_FEATURE_COUNT = INVOCATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.CallBehaviorActionImpl <em>Call Behavior Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.CallBehaviorActionImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getCallBehaviorAction()
	 * @generated
	 */
	int CALL_BEHAVIOR_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OWNED_EXTENSIONS = CALL_ACTION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__ID = CALL_ACTION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__SID = CALL_ACTION__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__CONSTRAINTS = CALL_ACTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OWNED_CONSTRAINTS = CALL_ACTION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__NAME = CALL_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IN_ACTIVITY_PARTITION = CALL_ACTION__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IN_INTERRUPTIBLE_REGION = CALL_ACTION__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__IN_STRUCTURED_NODE = CALL_ACTION__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OUTGOING = CALL_ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__INCOMING = CALL_ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Owned Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OWNED_HANDLERS = CALL_ACTION__OWNED_HANDLERS;

	/**
	 * The feature id for the '<em><b>Local Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__LOCAL_PRECONDITION = CALL_ACTION__LOCAL_PRECONDITION;

	/**
	 * The feature id for the '<em><b>Local Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__LOCAL_POSTCONDITION = CALL_ACTION__LOCAL_POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__CONTEXT = CALL_ACTION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__INPUTS = CALL_ACTION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__OUTPUTS = CALL_ACTION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__ARGUMENTS = CALL_ACTION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__RESULTS = CALL_ACTION__RESULTS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION__BEHAVIOR = CALL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Behavior Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_BEHAVIOR_ACTION_FEATURE_COUNT = CALL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ObjectNodeImpl <em>Object Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ObjectNodeImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getObjectNode()
	 * @generated
	 */
	int OBJECT_NODE = 18;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OWNED_EXTENSIONS = ACTIVITY_NODE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ID = ACTIVITY_NODE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__SID = ACTIVITY_NODE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__CONSTRAINTS = ACTIVITY_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OWNED_CONSTRAINTS = ACTIVITY_NODE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IN_ACTIVITY_PARTITION = ACTIVITY_NODE__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IN_INTERRUPTIBLE_REGION = ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IN_STRUCTURED_NODE = ACTIVITY_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ABSTRACT_TYPE = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IS_CONTROL_TYPE = ACTIVITY_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind Of Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__KIND_OF_NODE = ACTIVITY_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__ORDERING = ACTIVITY_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__UPPER_BOUND = ACTIVITY_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__IN_STATE = ACTIVITY_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE__SELECTION = ACTIVITY_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Object Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.Pin <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.Pin
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 19;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OWNED_EXTENSIONS = OBJECT_NODE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ID = OBJECT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__SID = OBJECT_NODE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__CONSTRAINTS = OBJECT_NODE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OWNED_CONSTRAINTS = OBJECT_NODE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = OBJECT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IN_ACTIVITY_PARTITION = OBJECT_NODE__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IN_INTERRUPTIBLE_REGION = OBJECT_NODE__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IN_STRUCTURED_NODE = OBJECT_NODE__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__OUTGOING = OBJECT_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__INCOMING = OBJECT_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ABSTRACT_TYPE = OBJECT_NODE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_CONTROL_TYPE = OBJECT_NODE__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Kind Of Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__KIND_OF_NODE = OBJECT_NODE__KIND_OF_NODE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ORDERING = OBJECT_NODE__ORDERING;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__UPPER_BOUND = OBJECT_NODE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IN_STATE = OBJECT_NODE__IN_STATE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__SELECTION = OBJECT_NODE__SELECTION;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_CONTROL = OBJECT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = OBJECT_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin <em>Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getInputPin()
	 * @generated
	 */
	int INPUT_PIN = 20;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OWNED_EXTENSIONS = PIN__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ID = PIN__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__SID = PIN__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__CONSTRAINTS = PIN__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OWNED_CONSTRAINTS = PIN__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IN_ACTIVITY_PARTITION = PIN__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IN_INTERRUPTIBLE_REGION = PIN__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IN_STRUCTURED_NODE = PIN__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__OUTGOING = PIN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__INCOMING = PIN__INCOMING;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ABSTRACT_TYPE = PIN__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IS_CONTROL_TYPE = PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Kind Of Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__KIND_OF_NODE = PIN__KIND_OF_NODE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__ORDERING = PIN__ORDERING;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__UPPER_BOUND = PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IN_STATE = PIN__IN_STATE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__SELECTION = PIN__SELECTION;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__IS_CONTROL = PIN__IS_CONTROL;

	/**
	 * The feature id for the '<em><b>Input Evaluation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__INPUT_EVALUATION_ACTION = PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ValuePin <em>Value Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ValuePin
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getValuePin()
	 * @generated
	 */
	int VALUE_PIN = 21;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__OWNED_EXTENSIONS = INPUT_PIN__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__ID = INPUT_PIN__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__SID = INPUT_PIN__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__CONSTRAINTS = INPUT_PIN__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__OWNED_CONSTRAINTS = INPUT_PIN__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__NAME = INPUT_PIN__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IN_ACTIVITY_PARTITION = INPUT_PIN__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IN_INTERRUPTIBLE_REGION = INPUT_PIN__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IN_STRUCTURED_NODE = INPUT_PIN__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__OUTGOING = INPUT_PIN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__INCOMING = INPUT_PIN__INCOMING;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__ABSTRACT_TYPE = INPUT_PIN__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IS_CONTROL_TYPE = INPUT_PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Kind Of Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__KIND_OF_NODE = INPUT_PIN__KIND_OF_NODE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__ORDERING = INPUT_PIN__ORDERING;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__UPPER_BOUND = INPUT_PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IN_STATE = INPUT_PIN__IN_STATE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__SELECTION = INPUT_PIN__SELECTION;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__IS_CONTROL = INPUT_PIN__IS_CONTROL;

	/**
	 * The feature id for the '<em><b>Input Evaluation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__INPUT_EVALUATION_ACTION = INPUT_PIN__INPUT_EVALUATION_ACTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN__VALUE = INPUT_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PIN_FEATURE_COUNT = INPUT_PIN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.OutputPin <em>Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.OutputPin
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 22;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OWNED_EXTENSIONS = PIN__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ID = PIN__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__SID = PIN__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__CONSTRAINTS = PIN__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OWNED_CONSTRAINTS = PIN__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>In Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IN_ACTIVITY_PARTITION = PIN__IN_ACTIVITY_PARTITION;

	/**
	 * The feature id for the '<em><b>In Interruptible Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IN_INTERRUPTIBLE_REGION = PIN__IN_INTERRUPTIBLE_REGION;

	/**
	 * The feature id for the '<em><b>In Structured Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IN_STRUCTURED_NODE = PIN__IN_STRUCTURED_NODE;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__OUTGOING = PIN__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__INCOMING = PIN__INCOMING;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ABSTRACT_TYPE = PIN__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Is Control Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IS_CONTROL_TYPE = PIN__IS_CONTROL_TYPE;

	/**
	 * The feature id for the '<em><b>Kind Of Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__KIND_OF_NODE = PIN__KIND_OF_NODE;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__ORDERING = PIN__ORDERING;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__UPPER_BOUND = PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IN_STATE = PIN__IN_STATE;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__SELECTION = PIN__SELECTION;

	/**
	 * The feature id for the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__IS_CONTROL = PIN__IS_CONTROL;

	/**
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeOrderingKind
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getObjectNodeOrderingKind()
	 * @generated
	 */
	int OBJECT_NODE_ORDERING_KIND = 23;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeKind <em>Object Node Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeKind
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getObjectNodeKind()
	 * @generated
	 */
	int OBJECT_NODE_KIND = 24;


	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity <em>Abstract Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Activity</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity
	 * @generated
	 */
	EClass getAbstractActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#isIsReadOnly <em>Is Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read Only</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#isIsReadOnly()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EAttribute getAbstractActivity_IsReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#isIsSingleExecution <em>Is Single Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Single Execution</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#isIsSingleExecution()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EAttribute getAbstractActivity_IsSingleExecution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#getOwnedNodes <em>Owned Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Nodes</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#getOwnedNodes()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EReference getAbstractActivity_OwnedNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#getOwnedEdges <em>Owned Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Edges</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#getOwnedEdges()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EReference getAbstractActivity_OwnedEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#getOwnedGroups <em>Owned Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Groups</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#getOwnedGroups()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EReference getAbstractActivity_OwnedGroups();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#getOwnedStructuredNodes <em>Owned Structured Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Structured Nodes</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractActivity#getOwnedStructuredNodes()
	 * @see #getAbstractActivity()
	 * @generated
	 */
	EReference getAbstractActivity_OwnedStructuredNodes();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Handler</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler
	 * @generated
	 */
	EClass getExceptionHandler();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler#getProtectedNode <em>Protected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Protected Node</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler#getProtectedNode()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_ProtectedNode();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler#getHandlerBody <em>Handler Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler Body</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler#getHandlerBody()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_HandlerBody();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler#getExceptionInput <em>Exception Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception Input</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler#getExceptionInput()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_ExceptionInput();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler#getExceptionTypes <em>Exception Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exception Types</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExceptionHandler#getExceptionTypes()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_ExceptionTypes();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup
	 * @generated
	 */
	EClass getActivityGroup();

	/**
	 * Returns the meta object for the container reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup#getSuperGroup <em>Super Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Group</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup#getSuperGroup()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_SuperGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup#getSubGroups <em>Sub Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Groups</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup#getSubGroups()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_SubGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup#getOwnedNodes <em>Owned Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Nodes</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup#getOwnedNodes()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_OwnedNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup#getOwnedEdges <em>Owned Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Edges</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityGroup#getOwnedEdges()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_OwnedEdges();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InterruptibleActivityRegion <em>Interruptible Activity Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interruptible Activity Region</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InterruptibleActivityRegion
	 * @generated
	 */
	EClass getInterruptibleActivityRegion();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InterruptibleActivityRegion#getInterruptingEdges <em>Interrupting Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interrupting Edges</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InterruptibleActivityRegion#getInterruptingEdges()
	 * @see #getInterruptibleActivityRegion()
	 * @generated
	 */
	EReference getInterruptibleActivityRegion_InterruptingEdges();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getKindOfRate <em>Kind Of Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Of Rate</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getKindOfRate()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EAttribute getActivityEdge_KindOfRate();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getInActivityPartition <em>In Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Activity Partition</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getInActivityPartition()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_InActivityPartition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getInInterruptibleRegion <em>In Interruptible Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Interruptible Region</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getInInterruptibleRegion()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_InInterruptibleRegion();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Structured Node</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getInStructuredNode()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_InStructuredNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rate</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getRate()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Rate();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Probability</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getProbability()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Probability();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getGuard()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Weight</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getWeight()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Weight();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getInterrupts <em>Interrupts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interrupts</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityEdge#getInterrupts()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Interrupts();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow <em>Object Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Flow</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow
	 * @generated
	 */
	EClass getObjectFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow#isIsMulticast <em>Is Multicast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multicast</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow#isIsMulticast()
	 * @see #getObjectFlow()
	 * @generated
	 */
	EAttribute getObjectFlow_IsMulticast();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Multireceive</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow#isIsMultireceive()
	 * @see #getObjectFlow()
	 * @generated
	 */
	EAttribute getObjectFlow_IsMultireceive();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow#getTransformation()
	 * @see #getObjectFlow()
	 * @generated
	 */
	EReference getObjectFlow_Transformation();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectFlow#getSelection()
	 * @see #getObjectFlow()
	 * @generated
	 */
	EReference getObjectFlow_Selection();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partition</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition
	 * @generated
	 */
	EClass getActivityPartition();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#isIsDimension <em>Is Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Dimension</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#isIsDimension()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EAttribute getActivityPartition_IsDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#isIsExternal <em>Is External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is External</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#isIsExternal()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EAttribute getActivityPartition_IsExternal();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#getRepresentedElement <em>Represented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Represented Element</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#getRepresentedElement()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_RepresentedElement();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#getSuperPartition <em>Super Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Partition</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#getSuperPartition()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_SuperPartition();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#getSubPartitions <em>Sub Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Partitions</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityPartition#getSubPartitions()
	 * @see #getActivityPartition()
	 * @generated
	 */
	EReference getActivityPartition_SubPartitions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityExchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityExchange
	 * @generated
	 */
	EClass getActivityExchange();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityExchange#getRealizingActivityFlows <em>Realizing Activity Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Realizing Activity Flows</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityExchange#getRealizingActivityFlows()
	 * @see #getActivityExchange()
	 * @generated
	 */
	EReference getActivityExchange_RealizingActivityFlows();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getInActivityPartition <em>In Activity Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Activity Partition</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getInActivityPartition()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_InActivityPartition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Interruptible Region</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getInInterruptibleRegion()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_InInterruptibleRegion();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getInStructuredNode <em>In Structured Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Structured Node</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getInStructuredNode()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_InStructuredNode();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getOutgoing()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode#getIncoming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incoming();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExecutableNode#getOwnedHandlers <em>Owned Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Handlers</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ExecutableNode#getOwnedHandlers()
	 * @see #getExecutableNode()
	 * @generated
	 */
	EReference getExecutableNode_OwnedHandlers();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.StructuredActivityNode <em>Structured Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Activity Node</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.StructuredActivityNode
	 * @generated
	 */
	EClass getStructuredActivityNode();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction <em>Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Action</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction
	 * @generated
	 */
	EClass getAbstractAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getLocalPrecondition <em>Local Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Precondition</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getLocalPrecondition()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_LocalPrecondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getLocalPostcondition <em>Local Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Postcondition</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getLocalPostcondition()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_LocalPostcondition();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getContext()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getInputs()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AbstractAction#getOutputs()
	 * @see #getAbstractAction()
	 * @generated
	 */
	EReference getAbstractAction_Outputs();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AcceptEventAction <em>Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Event Action</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AcceptEventAction
	 * @generated
	 */
	EClass getAcceptEventAction();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AcceptEventAction#isIsUnmarshall <em>Is Unmarshall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unmarshall</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AcceptEventAction#isIsUnmarshall()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EAttribute getAcceptEventAction_IsUnmarshall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AcceptEventAction#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.AcceptEventAction#getResult()
	 * @see #getAcceptEventAction()
	 * @generated
	 */
	EReference getAcceptEventAction_Result();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InvocationAction <em>Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation Action</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InvocationAction
	 * @generated
	 */
	EClass getInvocationAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InvocationAction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InvocationAction#getArguments()
	 * @see #getInvocationAction()
	 * @generated
	 */
	EReference getInvocationAction_Arguments();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.SendSignalAction <em>Send Signal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Signal Action</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.SendSignalAction
	 * @generated
	 */
	EClass getSendSignalAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.SendSignalAction#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.SendSignalAction#getTarget()
	 * @see #getSendSignalAction()
	 * @generated
	 */
	EReference getSendSignalAction_Target();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.SendSignalAction#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.SendSignalAction#getSignal()
	 * @see #getSendSignalAction()
	 * @generated
	 */
	EReference getSendSignalAction_Signal();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Action</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallAction
	 * @generated
	 */
	EClass getCallAction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallAction#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallAction#getResults()
	 * @see #getCallAction()
	 * @generated
	 */
	EReference getCallAction_Results();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Behavior Action</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallBehaviorAction
	 * @generated
	 */
	EClass getCallBehaviorAction();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallBehaviorAction#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.CallBehaviorAction#getBehavior()
	 * @see #getCallBehaviorAction()
	 * @generated
	 */
	EReference getCallBehaviorAction_Behavior();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode <em>Object Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Node</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode
	 * @generated
	 */
	EClass getObjectNode();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#isIsControlType <em>Is Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Control Type</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#isIsControlType()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_IsControlType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getKindOfNode <em>Kind Of Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Of Node</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getKindOfNode()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_KindOfNode();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getOrdering()
	 * @see #getObjectNode()
	 * @generated
	 */
	EAttribute getObjectNode_Ordering();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Bound</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getUpperBound()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_UpperBound();

	/**
	 * Returns the meta object for the reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getInState <em>In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In State</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getInState()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_InState();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNode#getSelection()
	 * @see #getObjectNode()
	 * @generated
	 */
	EReference getObjectNode_Selection();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.Pin#isIsControl <em>Is Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Control</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.Pin#isIsControl()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_IsControl();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pin</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin
	 * @generated
	 */
	EClass getInputPin();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin#getInputEvaluationAction <em>Input Evaluation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Evaluation Action</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin#getInputEvaluationAction()
	 * @see #getInputPin()
	 * @generated
	 */
	EReference getInputPin_InputEvaluationAction();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ValuePin <em>Value Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Pin</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ValuePin
	 * @generated
	 */
	EClass getValuePin();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ValuePin#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ValuePin#getValue()
	 * @see #getValuePin()
	 * @generated
	 */
	EReference getValuePin_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.OutputPin
	 * @generated
	 */
	EClass getOutputPin();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Node Ordering Kind</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeOrderingKind
	 * @generated
	 */
	EEnum getObjectNodeOrderingKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeKind <em>Object Node Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Node Kind</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeKind
	 * @generated
	 */
	EEnum getObjectNodeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityFactory getActivityFactory();

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
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AbstractActivityImpl <em>Abstract Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AbstractActivityImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getAbstractActivity()
		 * @generated
		 */
		EClass ABSTRACT_ACTIVITY = eINSTANCE.getAbstractActivity();

		/**
		 * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTIVITY__IS_READ_ONLY = eINSTANCE.getAbstractActivity_IsReadOnly();

		/**
		 * The meta object literal for the '<em><b>Is Single Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION = eINSTANCE.getAbstractActivity_IsSingleExecution();

		/**
		 * The meta object literal for the '<em><b>Owned Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTIVITY__OWNED_NODES = eINSTANCE.getAbstractActivity_OwnedNodes();

		/**
		 * The meta object literal for the '<em><b>Owned Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTIVITY__OWNED_EDGES = eINSTANCE.getAbstractActivity_OwnedEdges();

		/**
		 * The meta object literal for the '<em><b>Owned Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTIVITY__OWNED_GROUPS = eINSTANCE.getAbstractActivity_OwnedGroups();

		/**
		 * The meta object literal for the '<em><b>Owned Structured Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTIVITY__OWNED_STRUCTURED_NODES = eINSTANCE.getAbstractActivity_OwnedStructuredNodes();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ExceptionHandlerImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getExceptionHandler()
		 * @generated
		 */
		EClass EXCEPTION_HANDLER = eINSTANCE.getExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Protected Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__PROTECTED_NODE = eINSTANCE.getExceptionHandler_ProtectedNode();

		/**
		 * The meta object literal for the '<em><b>Handler Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__HANDLER_BODY = eINSTANCE.getExceptionHandler_HandlerBody();

		/**
		 * The meta object literal for the '<em><b>Exception Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__EXCEPTION_INPUT = eINSTANCE.getExceptionHandler_ExceptionInput();

		/**
		 * The meta object literal for the '<em><b>Exception Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__EXCEPTION_TYPES = eINSTANCE.getExceptionHandler_ExceptionTypes();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityGroupImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityGroup()
		 * @generated
		 */
		EClass ACTIVITY_GROUP = eINSTANCE.getActivityGroup();

		/**
		 * The meta object literal for the '<em><b>Super Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__SUPER_GROUP = eINSTANCE.getActivityGroup_SuperGroup();

		/**
		 * The meta object literal for the '<em><b>Sub Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__SUB_GROUPS = eINSTANCE.getActivityGroup_SubGroups();

		/**
		 * The meta object literal for the '<em><b>Owned Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__OWNED_NODES = eINSTANCE.getActivityGroup_OwnedNodes();

		/**
		 * The meta object literal for the '<em><b>Owned Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_GROUP__OWNED_EDGES = eINSTANCE.getActivityGroup_OwnedEdges();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.InterruptibleActivityRegionImpl <em>Interruptible Activity Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.InterruptibleActivityRegionImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getInterruptibleActivityRegion()
		 * @generated
		 */
		EClass INTERRUPTIBLE_ACTIVITY_REGION = eINSTANCE.getInterruptibleActivityRegion();

		/**
		 * The meta object literal for the '<em><b>Interrupting Edges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES = eINSTANCE.getInterruptibleActivityRegion_InterruptingEdges();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityEdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityEdgeImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Kind Of Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_EDGE__KIND_OF_RATE = eINSTANCE.getActivityEdge_KindOfRate();

		/**
		 * The meta object literal for the '<em><b>In Activity Partition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__IN_ACTIVITY_PARTITION = eINSTANCE.getActivityEdge_InActivityPartition();

		/**
		 * The meta object literal for the '<em><b>In Interruptible Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION = eINSTANCE.getActivityEdge_InInterruptibleRegion();

		/**
		 * The meta object literal for the '<em><b>In Structured Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__IN_STRUCTURED_NODE = eINSTANCE.getActivityEdge_InStructuredNode();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__RATE = eINSTANCE.getActivityEdge_Rate();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__PROBABILITY = eINSTANCE.getActivityEdge_Probability();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__GUARD = eINSTANCE.getActivityEdge_Guard();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__WEIGHT = eINSTANCE.getActivityEdge_Weight();

		/**
		 * The meta object literal for the '<em><b>Interrupts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__INTERRUPTS = eINSTANCE.getActivityEdge_Interrupts();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ControlFlowImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ObjectFlowImpl <em>Object Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ObjectFlowImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getObjectFlow()
		 * @generated
		 */
		EClass OBJECT_FLOW = eINSTANCE.getObjectFlow();

		/**
		 * The meta object literal for the '<em><b>Is Multicast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_FLOW__IS_MULTICAST = eINSTANCE.getObjectFlow_IsMulticast();

		/**
		 * The meta object literal for the '<em><b>Is Multireceive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_FLOW__IS_MULTIRECEIVE = eINSTANCE.getObjectFlow_IsMultireceive();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_FLOW__TRANSFORMATION = eINSTANCE.getObjectFlow_Transformation();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_FLOW__SELECTION = eINSTANCE.getObjectFlow_Selection();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPartitionImpl <em>Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPartitionImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityPartition()
		 * @generated
		 */
		EClass ACTIVITY_PARTITION = eINSTANCE.getActivityPartition();

		/**
		 * The meta object literal for the '<em><b>Is Dimension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PARTITION__IS_DIMENSION = eINSTANCE.getActivityPartition_IsDimension();

		/**
		 * The meta object literal for the '<em><b>Is External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_PARTITION__IS_EXTERNAL = eINSTANCE.getActivityPartition_IsExternal();

		/**
		 * The meta object literal for the '<em><b>Represented Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__REPRESENTED_ELEMENT = eINSTANCE.getActivityPartition_RepresentedElement();

		/**
		 * The meta object literal for the '<em><b>Super Partition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__SUPER_PARTITION = eINSTANCE.getActivityPartition_SuperPartition();

		/**
		 * The meta object literal for the '<em><b>Sub Partitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_PARTITION__SUB_PARTITIONS = eINSTANCE.getActivityPartition_SubPartitions();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityExchangeImpl <em>Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityExchangeImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityExchange()
		 * @generated
		 */
		EClass ACTIVITY_EXCHANGE = eINSTANCE.getActivityExchange();

		/**
		 * The meta object literal for the '<em><b>Realizing Activity Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS = eINSTANCE.getActivityExchange_RealizingActivityFlows();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ActivityNode
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>In Activity Partition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__IN_ACTIVITY_PARTITION = eINSTANCE.getActivityNode_InActivityPartition();

		/**
		 * The meta object literal for the '<em><b>In Interruptible Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION = eINSTANCE.getActivityNode_InInterruptibleRegion();

		/**
		 * The meta object literal for the '<em><b>In Structured Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__IN_STRUCTURED_NODE = eINSTANCE.getActivityNode_InStructuredNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ExecutableNodeImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '<em><b>Owned Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_NODE__OWNED_HANDLERS = eINSTANCE.getExecutableNode_OwnedHandlers();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.StructuredActivityNodeImpl <em>Structured Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.StructuredActivityNodeImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getStructuredActivityNode()
		 * @generated
		 */
		EClass STRUCTURED_ACTIVITY_NODE = eINSTANCE.getStructuredActivityNode();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AbstractActionImpl <em>Abstract Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AbstractActionImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getAbstractAction()
		 * @generated
		 */
		EClass ABSTRACT_ACTION = eINSTANCE.getAbstractAction();

		/**
		 * The meta object literal for the '<em><b>Local Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__LOCAL_PRECONDITION = eINSTANCE.getAbstractAction_LocalPrecondition();

		/**
		 * The meta object literal for the '<em><b>Local Postcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__LOCAL_POSTCONDITION = eINSTANCE.getAbstractAction_LocalPostcondition();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__CONTEXT = eINSTANCE.getAbstractAction_Context();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__INPUTS = eINSTANCE.getAbstractAction_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION__OUTPUTS = eINSTANCE.getAbstractAction_Outputs();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AcceptEventActionImpl <em>Accept Event Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.AcceptEventActionImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getAcceptEventAction()
		 * @generated
		 */
		EClass ACCEPT_EVENT_ACTION = eINSTANCE.getAcceptEventAction();

		/**
		 * The meta object literal for the '<em><b>Is Unmarshall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCEPT_EVENT_ACTION__IS_UNMARSHALL = eINSTANCE.getAcceptEventAction_IsUnmarshall();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_EVENT_ACTION__RESULT = eINSTANCE.getAcceptEventAction_Result();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.InvocationActionImpl <em>Invocation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.InvocationActionImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getInvocationAction()
		 * @generated
		 */
		EClass INVOCATION_ACTION = eINSTANCE.getInvocationAction();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_ACTION__ARGUMENTS = eINSTANCE.getInvocationAction_Arguments();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.SendSignalActionImpl <em>Send Signal Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.SendSignalActionImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getSendSignalAction()
		 * @generated
		 */
		EClass SEND_SIGNAL_ACTION = eINSTANCE.getSendSignalAction();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_SIGNAL_ACTION__TARGET = eINSTANCE.getSendSignalAction_Target();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_SIGNAL_ACTION__SIGNAL = eINSTANCE.getSendSignalAction_Signal();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.CallActionImpl <em>Call Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.CallActionImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getCallAction()
		 * @generated
		 */
		EClass CALL_ACTION = eINSTANCE.getCallAction();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_ACTION__RESULTS = eINSTANCE.getCallAction_Results();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.CallBehaviorActionImpl <em>Call Behavior Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.CallBehaviorActionImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getCallBehaviorAction()
		 * @generated
		 */
		EClass CALL_BEHAVIOR_ACTION = eINSTANCE.getCallBehaviorAction();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_BEHAVIOR_ACTION__BEHAVIOR = eINSTANCE.getCallBehaviorAction_Behavior();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ObjectNodeImpl <em>Object Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ObjectNodeImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getObjectNode()
		 * @generated
		 */
		EClass OBJECT_NODE = eINSTANCE.getObjectNode();

		/**
		 * The meta object literal for the '<em><b>Is Control Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__IS_CONTROL_TYPE = eINSTANCE.getObjectNode_IsControlType();

		/**
		 * The meta object literal for the '<em><b>Kind Of Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__KIND_OF_NODE = eINSTANCE.getObjectNode_KindOfNode();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_NODE__ORDERING = eINSTANCE.getObjectNode_Ordering();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__UPPER_BOUND = eINSTANCE.getObjectNode_UpperBound();

		/**
		 * The meta object literal for the '<em><b>In State</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__IN_STATE = eINSTANCE.getObjectNode_InState();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NODE__SELECTION = eINSTANCE.getObjectNode_Selection();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.Pin <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.Pin
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Is Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__IS_CONTROL = eINSTANCE.getPin_IsControl();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin <em>Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.InputPin
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getInputPin()
		 * @generated
		 */
		EClass INPUT_PIN = eINSTANCE.getInputPin();

		/**
		 * The meta object literal for the '<em><b>Input Evaluation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PIN__INPUT_EVALUATION_ACTION = eINSTANCE.getInputPin_InputEvaluationAction();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ValuePin <em>Value Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ValuePin
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getValuePin()
		 * @generated
		 */
		EClass VALUE_PIN = eINSTANCE.getValuePin();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_PIN__VALUE = eINSTANCE.getValuePin_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.OutputPin <em>Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.OutputPin
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getOutputPin()
		 * @generated
		 */
		EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeOrderingKind <em>Object Node Ordering Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeOrderingKind
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getObjectNodeOrderingKind()
		 * @generated
		 */
		EEnum OBJECT_NODE_ORDERING_KIND = eINSTANCE.getObjectNodeOrderingKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeKind <em>Object Node Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.ObjectNodeKind
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.impl.ActivityPackageImpl#getObjectNodeKind()
		 * @generated
		 */
		EEnum OBJECT_NODE_KIND = eINSTANCE.getObjectNodeKind();

	}

} //ActivityPackage
