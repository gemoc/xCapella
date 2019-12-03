/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolverElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getOwnedActorMissionInvolvements <em>Owned Actor Mission Involvements</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getOwnedSystemMissionInvolvement <em>Owned System Mission Involvement</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getOwnedCapabilityExploitations <em>Owned Capability Exploitations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getParticipatingSystem <em>Participating System</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getInvolvedActors <em>Involved Actors</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getInvolvedSystem <em>Involved System</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getExploitedCapabilities <em>Exploited Capabilities</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMission()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Mission'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='UseCase' stereotype='eng.Mission'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Operational goal. It must be satisfied by usage of System capabilities.\r\n\r\nA mission can be compared to a UML UseCase : A use case is the specification of a set of actions performed by a system, which yields an observable result that is,\r\ntypically, of value for one or more actors or other stakeholders of the system.\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a' used\040in\040levels='system' usage\040examples='../img/usage_examples/example_mission.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::UseCase' explanation='none' constraints='none'"
 * @generated
 */
public interface Mission extends NamedElement, InvolverElement {
	/**
	 * Returns the value of the '<em><b>Owned Actor Mission Involvements</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actor Mission Involvements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actor Mission Involvements</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMission_OwnedActorMissionInvolvements()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedActorMissionInvolvements'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the links between Actors and Missions that are owned by this Mission\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='none' constraints='Some elements on which ActorMissionInvolvement stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ActorMissionInvolvement> getOwnedActorMissionInvolvements();

	/**
	 * Returns the value of the '<em><b>Owned System Mission Involvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned System Mission Involvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned System Mission Involvement</em>' containment reference.
	 * @see #setOwnedSystemMissionInvolvement(SystemMissionInvolvement)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMission_OwnedSystemMissionInvolvement()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedMissionSupplierLinks'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the links between Missions and the System that are owned by this Mission\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='none' constraints='Some elements on which SystemMissionInvolvement stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]'"
	 * @generated
	 */
	SystemMissionInvolvement getOwnedSystemMissionInvolvement();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getOwnedSystemMissionInvolvement <em>Owned System Mission Involvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned System Mission Involvement</em>' containment reference.
	 * @see #getOwnedSystemMissionInvolvement()
	 * @generated
	 */
	void setOwnedSystemMissionInvolvement(SystemMissionInvolvement value);

	/**
	 * Returns the value of the '<em><b>Owned Capability Exploitations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityExploitation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Capability Exploitations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Capability Exploitations</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMission_OwnedCapabilityExploitations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='include' featureOwner='UseCase'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='capabilityExploitations'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the capability exploitation links that are assigned to this Mission\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::UseCase::include' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<CapabilityExploitation> getOwnedCapabilityExploitations();

	/**
	 * Returns the value of the '<em><b>Participating Actors</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getContributedMissions <em>Contributed Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participating Actors</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMission_ParticipatingActors()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getContributedMissions
	 * @model opposite="contributedMissions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='participatingActors'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(computed automatically) the Actors involved in this Mission\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Actor> getParticipatingActors();

	/**
	 * Returns the value of the '<em><b>Participating System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System#getContributedMissions <em>Contributed Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participating System</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMission_ParticipatingSystem()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System#getContributedMissions
	 * @model opposite="contributedMissions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='participatingSystems'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the System involved in this Mission\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System getParticipatingSystem();

	/**
	 * Returns the value of the '<em><b>Involved Actors</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement#getMission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Actors</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMission_InvolvedActors()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement#getMission
	 * @model opposite="mission" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='invovledActors'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the links to Actors that are involved in this Mission\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ActorMissionInvolvement> getInvolvedActors();

	/**
	 * Returns the value of the '<em><b>Involved System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemMissionInvolvement#getMission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved System</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMission_InvolvedSystem()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemMissionInvolvement#getMission
	 * @model opposite="mission" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='missionSupplierLinks'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the link to the System involved in this mission\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	SystemMissionInvolvement getInvolvedSystem();

	/**
	 * Returns the value of the '<em><b>Exploited Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getPurposeMissions <em>Purpose Missions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exploited Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploited Capabilities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getMission_ExploitedCapabilities()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getPurposeMissions
	 * @model opposite="purposeMissions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='exploitedCapabilityUseCases'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the list of Capabilities that this Mission exploits\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Capability> getExploitedCapabilities();

} // Mission
