package com.thalesgroup.trt.mde.vp.time.time;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.capella.common.data.behavior.BehaviorPackage;

import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;

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
 * @see com.thalesgroup.trt.mde.vp.time.time.TimeFactory
 * @model kind="package"
 * @generated
 */
public interface TimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "time"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.thalesgroup.com/trt/time/1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "time"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimePackage eINSTANCE = com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.ClockImpl <em>Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.ClockImpl
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 0;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__OWNED_EXTENSIONS = CapellacorePackage.NAMED_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__ID = CapellacorePackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__SID = CapellacorePackage.NAMED_ELEMENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__OWNED_CONSTRAINTS = CapellacorePackage.NAMED_ELEMENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__NAME = CapellacorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__INCOMING_TRACES = CapellacorePackage.NAMED_ELEMENT__INCOMING_TRACES;

	/**
	 * The feature id for the '<em><b>Outgoing Traces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__OUTGOING_TRACES = CapellacorePackage.NAMED_ELEMENT__OUTGOING_TRACES;

	/**
	 * The feature id for the '<em><b>Visible In Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__VISIBLE_IN_DOC = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_DOC;

	/**
	 * The feature id for the '<em><b>Visible In LM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__VISIBLE_IN_LM = CapellacorePackage.NAMED_ELEMENT__VISIBLE_IN_LM;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__SUMMARY = CapellacorePackage.NAMED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__DESCRIPTION = CapellacorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__REVIEW = CapellacorePackage.NAMED_ELEMENT__REVIEW;

	/**
	 * The feature id for the '<em><b>Owned Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__OWNED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Enumeration Property Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__OWNED_ENUMERATION_PROPERTY_TYPES = CapellacorePackage.NAMED_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;

	/**
	 * The feature id for the '<em><b>Applied Property Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__APPLIED_PROPERTY_VALUES = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUES;

	/**
	 * The feature id for the '<em><b>Owned Property Value Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__OWNED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Applied Property Value Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__APPLIED_PROPERTY_VALUE_GROUPS = CapellacorePackage.NAMED_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__STATUS = CapellacorePackage.NAMED_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__FEATURES = CapellacorePackage.NAMED_ELEMENT__FEATURES;

	/**
	 * The feature id for the '<em><b>Applied Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__APPLIED_REQUIREMENTS = CapellacorePackage.NAMED_ELEMENT__APPLIED_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__UNIT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__RESOLUTION = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__CURRENT_TIME = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK__MAX = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = CapellacorePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.TimeValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimeValueImpl
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getTimeValue()
	 * @generated
	 */
	int TIME_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__OWNED_EXTENSIONS = ModellingcorePackage.VALUE_SPECIFICATION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__ID = ModellingcorePackage.VALUE_SPECIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__SID = ModellingcorePackage.VALUE_SPECIFICATION__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__CONSTRAINTS = ModellingcorePackage.VALUE_SPECIFICATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__OWNED_CONSTRAINTS = ModellingcorePackage.VALUE_SPECIFICATION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__NAME = ModellingcorePackage.VALUE_SPECIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__ABSTRACT_TYPE = ModellingcorePackage.VALUE_SPECIFICATION__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__CLOCK = ModellingcorePackage.VALUE_SPECIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__UNIT = ModellingcorePackage.VALUE_SPECIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_FEATURE_COUNT = ModellingcorePackage.VALUE_SPECIFICATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.DurationImpl <em>Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.DurationImpl
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__OWNED_EXTENSIONS = TIME_VALUE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__ID = TIME_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__SID = TIME_VALUE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CONSTRAINTS = TIME_VALUE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__OWNED_CONSTRAINTS = TIME_VALUE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__NAME = TIME_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__ABSTRACT_TYPE = TIME_VALUE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__CLOCK = TIME_VALUE__CLOCK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__UNIT = TIME_VALUE__UNIT;

	/**
	 * The feature id for the '<em><b>Inverval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION__INVERVAL = TIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_FEATURE_COUNT = TIME_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.DurationIntervalImpl <em>Duration Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.DurationIntervalImpl
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getDurationInterval()
	 * @generated
	 */
	int DURATION_INTERVAL = 3;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__OWNED_EXTENSIONS = DURATION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__ID = DURATION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__SID = DURATION__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__CONSTRAINTS = DURATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__OWNED_CONSTRAINTS = DURATION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__NAME = DURATION__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__ABSTRACT_TYPE = DURATION__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__CLOCK = DURATION__CLOCK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__UNIT = DURATION__UNIT;

	/**
	 * The feature id for the '<em><b>Inverval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__INVERVAL = DURATION__INVERVAL;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__MIN = DURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__MAX = DURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Lower Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__IS_LOWER_OPEN = DURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Upper Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL__IS_UPPER_OPEN = DURATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Duration Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_INTERVAL_FEATURE_COUNT = DURATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.SpanImpl <em>Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.SpanImpl
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getSpan()
	 * @generated
	 */
	int SPAN = 4;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__OWNED_EXTENSIONS = DURATION__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__ID = DURATION__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__SID = DURATION__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CONSTRAINTS = DURATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__OWNED_CONSTRAINTS = DURATION__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__NAME = DURATION__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__ABSTRACT_TYPE = DURATION__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CLOCK = DURATION__CLOCK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__UNIT = DURATION__UNIT;

	/**
	 * The feature id for the '<em><b>Inverval</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__INVERVAL = DURATION__INVERVAL;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__BEGIN = DURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__END = DURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_FEATURE_COUNT = DURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.InstantImpl <em>Instant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.InstantImpl
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getInstant()
	 * @generated
	 */
	int INSTANT = 5;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__OWNED_EXTENSIONS = TIME_VALUE__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__ID = TIME_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__SID = TIME_VALUE__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__CONSTRAINTS = TIME_VALUE__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__OWNED_CONSTRAINTS = TIME_VALUE__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__NAME = TIME_VALUE__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__ABSTRACT_TYPE = TIME_VALUE__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__CLOCK = TIME_VALUE__CLOCK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT__UNIT = TIME_VALUE__UNIT;

	/**
	 * The number of structural features of the '<em>Instant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_FEATURE_COUNT = TIME_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.InstantIntervalImpl <em>Instant Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.InstantIntervalImpl
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getInstantInterval()
	 * @generated
	 */
	int INSTANT_INTERVAL = 6;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__OWNED_EXTENSIONS = INSTANT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__ID = INSTANT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__SID = INSTANT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__CONSTRAINTS = INSTANT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__OWNED_CONSTRAINTS = INSTANT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__NAME = INSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__ABSTRACT_TYPE = INSTANT__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__CLOCK = INSTANT__CLOCK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__UNIT = INSTANT__UNIT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__MIN = INSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__MAX = INSTANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Lower Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__IS_LOWER_OPEN = INSTANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Upper Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL__IS_UPPER_OPEN = INSTANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Instant Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_INTERVAL_FEATURE_COUNT = INSTANT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TranslationImpl
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 7;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__OWNED_EXTENSIONS = INSTANT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__ID = INSTANT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__SID = INSTANT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__CONSTRAINTS = INSTANT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__OWNED_CONSTRAINTS = INSTANT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__NAME = INSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__ABSTRACT_TYPE = INSTANT__ABSTRACT_TYPE;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__CLOCK = INSTANT__CLOCK;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__UNIT = INSTANT__UNIT;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__START = INSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__OFFSET = INSTANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Backward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__IS_BACKWARD = INSTANT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = INSTANT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.TimeEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimeEventImpl
	 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getTimeEvent()
	 * @generated
	 */
	int TIME_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__OWNED_EXTENSIONS = BehaviorPackage.ABSTRACT_EVENT__OWNED_EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__ID = BehaviorPackage.ABSTRACT_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__SID = BehaviorPackage.ABSTRACT_EVENT__SID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__CONSTRAINTS = BehaviorPackage.ABSTRACT_EVENT__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__OWNED_CONSTRAINTS = BehaviorPackage.ABSTRACT_EVENT__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__NAME = BehaviorPackage.ABSTRACT_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Abstract Typed Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__ABSTRACT_TYPED_ELEMENTS = BehaviorPackage.ABSTRACT_EVENT__ABSTRACT_TYPED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__WHEN = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__EVERY = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT__REPETITION = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_EVENT_FEATURE_COUNT = BehaviorPackage.ABSTRACT_EVENT_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.time.time.Clock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Clock#getUnit()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Unit();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Clock#getResolution()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getCurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Time</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Clock#getCurrentTime()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_CurrentTime();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.Clock#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Clock#getMax()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Max();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.time.time.TimeValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimeValue
	 * @generated
	 */
	EClass getTimeValue();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.trt.mde.vp.time.time.TimeValue#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Clock</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimeValue#getClock()
	 * @see #getTimeValue()
	 * @generated
	 */
	EReference getTimeValue_Clock();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.TimeValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimeValue#getUnit()
	 * @see #getTimeValue()
	 * @generated
	 */
	EAttribute getTimeValue_Unit();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.time.time.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Duration
	 * @generated
	 */
	EClass getDuration();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.trt.mde.vp.time.time.Duration#getInverval <em>Inverval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverval</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Duration#getInverval()
	 * @see #getDuration()
	 * @generated
	 */
	EReference getDuration_Inverval();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval <em>Duration Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Duration Interval</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.DurationInterval
	 * @generated
	 */
	EClass getDurationInterval();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.DurationInterval#getMin()
	 * @see #getDurationInterval()
	 * @generated
	 */
	EReference getDurationInterval_Min();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.DurationInterval#getMax()
	 * @see #getDurationInterval()
	 * @generated
	 */
	EReference getDurationInterval_Max();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#isIsLowerOpen <em>Is Lower Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Lower Open</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.DurationInterval#isIsLowerOpen()
	 * @see #getDurationInterval()
	 * @generated
	 */
	EAttribute getDurationInterval_IsLowerOpen();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.DurationInterval#isIsUpperOpen <em>Is Upper Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Upper Open</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.DurationInterval#isIsUpperOpen()
	 * @see #getDurationInterval()
	 * @generated
	 */
	EAttribute getDurationInterval_IsUpperOpen();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.time.time.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Span
	 * @generated
	 */
	EClass getSpan();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.Span#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Span#getBegin()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_Begin();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.Span#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Span#getEnd()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_End();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.time.time.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Instant
	 * @generated
	 */
	EClass getInstant();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval <em>Instant Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant Interval</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.InstantInterval
	 * @generated
	 */
	EClass getInstantInterval();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.InstantInterval#getMin()
	 * @see #getInstantInterval()
	 * @generated
	 */
	EReference getInstantInterval_Min();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.InstantInterval#getMax()
	 * @see #getInstantInterval()
	 * @generated
	 */
	EReference getInstantInterval_Max();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#isIsLowerOpen <em>Is Lower Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Lower Open</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.InstantInterval#isIsLowerOpen()
	 * @see #getInstantInterval()
	 * @generated
	 */
	EAttribute getInstantInterval_IsLowerOpen();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.InstantInterval#isIsUpperOpen <em>Is Upper Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Upper Open</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.InstantInterval#isIsUpperOpen()
	 * @see #getInstantInterval()
	 * @generated
	 */
	EAttribute getInstantInterval_IsUpperOpen();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.time.time.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.Translation#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Translation#getStart()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_Start();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.Translation#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offset</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Translation#getOffset()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_Offset();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.Translation#isIsBackward <em>Is Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Backward</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.Translation#isIsBackward()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_IsBackward();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimeEvent
	 * @generated
	 */
	EClass getTimeEvent();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getWhen()
	 * @see #getTimeEvent()
	 * @generated
	 */
	EReference getTimeEvent_When();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getEvery <em>Every</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Every</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getEvery()
	 * @see #getTimeEvent()
	 * @generated
	 */
	EReference getTimeEvent_Every();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getRepetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition</em>'.
	 * @see com.thalesgroup.trt.mde.vp.time.time.TimeEvent#getRepetition()
	 * @see #getTimeEvent()
	 * @generated
	 */
	EAttribute getTimeEvent_Repetition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimeFactory getTimeFactory();

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
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.ClockImpl <em>Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.ClockImpl
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__UNIT = eINSTANCE.getClock_Unit();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__RESOLUTION = eINSTANCE.getClock_Resolution();

		/**
		 * The meta object literal for the '<em><b>Current Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__CURRENT_TIME = eINSTANCE.getClock_CurrentTime();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK__MAX = eINSTANCE.getClock_Max();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.TimeValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimeValueImpl
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getTimeValue()
		 * @generated
		 */
		EClass TIME_VALUE = eINSTANCE.getTimeValue();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_VALUE__CLOCK = eINSTANCE.getTimeValue_Clock();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE__UNIT = eINSTANCE.getTimeValue_Unit();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.DurationImpl <em>Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.DurationImpl
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getDuration()
		 * @generated
		 */
		EClass DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em><b>Inverval</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURATION__INVERVAL = eINSTANCE.getDuration_Inverval();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.DurationIntervalImpl <em>Duration Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.DurationIntervalImpl
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getDurationInterval()
		 * @generated
		 */
		EClass DURATION_INTERVAL = eINSTANCE.getDurationInterval();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURATION_INTERVAL__MIN = eINSTANCE.getDurationInterval_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURATION_INTERVAL__MAX = eINSTANCE.getDurationInterval_Max();

		/**
		 * The meta object literal for the '<em><b>Is Lower Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_INTERVAL__IS_LOWER_OPEN = eINSTANCE
				.getDurationInterval_IsLowerOpen();

		/**
		 * The meta object literal for the '<em><b>Is Upper Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_INTERVAL__IS_UPPER_OPEN = eINSTANCE
				.getDurationInterval_IsUpperOpen();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.SpanImpl <em>Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.SpanImpl
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getSpan()
		 * @generated
		 */
		EClass SPAN = eINSTANCE.getSpan();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__BEGIN = eINSTANCE.getSpan_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__END = eINSTANCE.getSpan_End();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.InstantImpl <em>Instant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.InstantImpl
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getInstant()
		 * @generated
		 */
		EClass INSTANT = eINSTANCE.getInstant();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.InstantIntervalImpl <em>Instant Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.InstantIntervalImpl
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getInstantInterval()
		 * @generated
		 */
		EClass INSTANT_INTERVAL = eINSTANCE.getInstantInterval();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANT_INTERVAL__MIN = eINSTANCE.getInstantInterval_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANT_INTERVAL__MAX = eINSTANCE.getInstantInterval_Max();

		/**
		 * The meta object literal for the '<em><b>Is Lower Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT_INTERVAL__IS_LOWER_OPEN = eINSTANCE
				.getInstantInterval_IsLowerOpen();

		/**
		 * The meta object literal for the '<em><b>Is Upper Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT_INTERVAL__IS_UPPER_OPEN = eINSTANCE
				.getInstantInterval_IsUpperOpen();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TranslationImpl
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__START = eINSTANCE.getTranslation_Start();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__OFFSET = eINSTANCE.getTranslation_Offset();

		/**
		 * The meta object literal for the '<em><b>Is Backward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__IS_BACKWARD = eINSTANCE
				.getTranslation_IsBackward();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.trt.mde.vp.time.time.impl.TimeEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimeEventImpl
		 * @see com.thalesgroup.trt.mde.vp.time.time.impl.TimePackageImpl#getTimeEvent()
		 * @generated
		 */
		EClass TIME_EVENT = eINSTANCE.getTimeEvent();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EVENT__WHEN = eINSTANCE.getTimeEvent_When();

		/**
		 * The meta object literal for the '<em><b>Every</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_EVENT__EVERY = eINSTANCE.getTimeEvent_Every();

		/**
		 * The meta object literal for the '<em><b>Repetition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_EVENT__REPETITION = eINSTANCE.getTimeEvent_Repetition();

	}

} //TimePackage
