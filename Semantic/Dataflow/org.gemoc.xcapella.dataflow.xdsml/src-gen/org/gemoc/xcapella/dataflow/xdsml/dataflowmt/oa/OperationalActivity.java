/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.AbstractFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity#getOwnedOperationalActivityPkgs <em>Owned Operational Activity Pkgs</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity#getActivityAllocations <em>Activity Allocations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity#getOwnedSwimlanes <em>Owned Swimlanes</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity#getOwnedProcess <em>Owned Process</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity#getAllocatorEntities <em>Allocator Entities</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity#getRealizingSystemFunctions <em>Realizing System Functions</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity#getAllocatingRoles <em>Allocating Roles</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity#getContainedOperationalActivities <em>Contained Operational Activities</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity#getChildrenOperationalActivities <em>Children Operational Activities</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Any process step or function performed, both mental and physical, toward achieving some objective. A task is a \"formal\" activity (see also task).\r\n[source: Sys EM, EIA/IS-731.1]' usage\040guideline='In the first steps of the operational analysis, all activities related to the targeted domain should be identified, regardless of their future allocation to the targeted system or not (e.g. even activities of actors external to the future system being design, should be identified and modelled)\r\n' arcadia_description='An operational Activity is a process step or function performed toward achieving some objective, by actors that could necessitate to use the system for this. Example: listen to radio, select a radio station...' used\040in\040levels='operational' usage\040examples='../img/usage_examples/example_operational_activities.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Activity' explanation='All functions are mapped to (empty) activities' constraints='none'"
 * @generated
 */
public interface OperationalActivity extends AbstractFunction {
	/**
	 * Returns the value of the '<em><b>Owned Operational Activity Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivityPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Activity Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Activity Pkgs</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity_OwnedOperationalActivityPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='sub-packages of operational activities, contained in this operational activity' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which OperationalActivityPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<OperationalActivityPkg> getOwnedOperationalActivityPkgs();

	/**
	 * Returns the value of the '<em><b>Activity Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.ActivityAllocation}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.ActivityAllocation#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Allocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Allocations</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity_ActivityAllocations()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.ActivityAllocation#getActivity
	 * @model opposite="activity" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='allocation of this operational activity to a given operational role\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ActivityAllocation> getActivityAllocations();

	/**
	 * Returns the value of the '<em><b>Owned Swimlanes</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Swimlane}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Swimlanes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Swimlanes</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity_OwnedSwimlanes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of swimlanes used to partition this operational activity\r\n[source: Capella study]' constraints='none' comment/notes='not used/implemented as of Capella'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Swimlane> getOwnedSwimlanes();

	/**
	 * Returns the value of the '<em><b>Owned Process</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity_OwnedProcess()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of Processes associated to this Operational Activity\r\n[source: Capella study]' constraints='none' comment/notes='not used/implemented as of Capella 1.0.3'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<OperationalProcess> getOwnedProcess();

	/**
	 * Returns the value of the '<em><b>Allocator Entities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Entity}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Entity#getAllocatedOperationalActivities <em>Allocated Operational Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocator Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocator Entities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity_AllocatorEntities()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Entity#getAllocatedOperationalActivities
	 * @model opposite="allocatedOperationalActivities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Entity> getAllocatorEntities();

	/**
	 * Returns the value of the '<em><b>Realizing System Functions</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction#getRealizedOperationalActivities <em>Realized Operational Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing System Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing System Functions</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity_RealizingSystemFunctions()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction#getRealizedOperationalActivities
	 * @model opposite="realizedOperationalActivities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<SystemFunction> getRealizingSystemFunctions();

	/**
	 * Returns the value of the '<em><b>Allocating Roles</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Roles</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity_AllocatingRoles()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Role> getAllocatingRoles();

	/**
	 * Returns the value of the '<em><b>Contained Operational Activities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Operational Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Operational Activities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity_ContainedOperationalActivities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedFunctions'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<OperationalActivity> getContainedOperationalActivities();

	/**
	 * Returns the value of the '<em><b>Children Operational Activities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Operational Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Operational Activities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalActivity_ChildrenOperationalActivities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of children operational activities\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<OperationalActivity> getChildrenOperationalActivities();

} // OperationalActivity
