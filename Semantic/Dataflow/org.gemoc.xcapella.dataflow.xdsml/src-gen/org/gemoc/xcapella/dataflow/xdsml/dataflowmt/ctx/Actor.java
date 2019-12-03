/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractActor;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ActorCapabilityRealizationInvolvement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalActor;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Entity;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getParticipationsInMissions <em>Participations In Missions</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getParticipationsInCapabilities <em>Participations In Capabilities</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getParticipationsInCapabilityRealizations <em>Participations In Capability Realizations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getContributedMissions <em>Contributed Missions</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getContributedCapabilities <em>Contributed Capabilities</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getSystemCommunication <em>System Communication</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getOwnedOperationalActorRealizations <em>Owned Operational Actor Realizations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getOwnedOperationalEntityRealizations <em>Owned Operational Entity Realizations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getAllocatedSystemFunctions <em>Allocated System Functions</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getRealizedEntities <em>Realized Entities</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getRealizedOperationalActors <em>Realized Operational Actors</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getRealizingLogicalActors <em>Realizing Logical Actors</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Actor'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Component' stereotype='eng.Actor'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the role played by a user or any other system that interacts with the subject\r\n[source: SysML glossary for SysML v1.0]' usage\040guideline='n/a' used\040in\040levels='system' usage\040examples='../img/usage_examples/example_actors_interfaces.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='SysML::Blocks::Block' explanation='none' constraints='none'"
 * @generated
 */
public interface Actor extends AbstractActor {
	/**
	 * Returns the value of the '<em><b>Participations In Missions</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participations In Missions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participations In Missions</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_ParticipationsInMissions()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorMissionInvolvement#getActor
	 * @model opposite="actor" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping umlOppositeReference='supplier' umlOppositeReferenceOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='participationsInMissions'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the list of links between this actor and the Missions in which it is involved\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ActorMissionInvolvement> getParticipationsInMissions();

	/**
	 * Returns the value of the '<em><b>Participations In Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participations In Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participations In Capabilities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_ParticipationsInCapabilities()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement#getActor
	 * @model opposite="actor" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping umlOppositeReference='supplier' umlOppositeReferenceOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='participationsInCapabilities'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the list of links between this actor and the Capabilities in which it is involved\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ActorCapabilityInvolvement> getParticipationsInCapabilities();

	/**
	 * Returns the value of the '<em><b>Participations In Capability Realizations</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.ActorCapabilityRealizationInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participations In Capability Realizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participations In Capability Realizations</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_ParticipationsInCapabilityRealizations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping umlOppositeReference='supplier' umlOppositeReferenceOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='participationsInCapabilityRealizations'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the list of links between this actor and the CapabilityRealization in which it is involved\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ActorCapabilityRealizationInvolvement> getParticipationsInCapabilityRealizations();

	/**
	 * Returns the value of the '<em><b>Contributed Missions</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getParticipatingActors <em>Participating Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributed Missions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributed Missions</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_ContributedMissions()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getParticipatingActors
	 * @model opposite="participatingActors" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='contributedMissions'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the list of Missions in which this actor is involved\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<Mission> getContributedMissions();

	/**
	 * Returns the value of the '<em><b>Contributed Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getParticipatingActors <em>Participating Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributed Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributed Capabilities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_ContributedCapabilities()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getParticipatingActors
	 * @model opposite="participatingActors" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='contributedCapabilitySpecificationUseCases'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the list of Capabilities in which this actor is involved\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<Capability> getContributedCapabilities();

	/**
	 * Returns the value of the '<em><b>System Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Communication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Communication</em>' reference.
	 * @see #setSystemCommunication(SystemCommunicationHook)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_SystemCommunication()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='ownedAttribute' featureOwner='StructuredClassifier'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='systemCommunication'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the communication link endpoint that is attached to this Actor\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	SystemCommunicationHook getSystemCommunication();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getSystemCommunication <em>System Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Communication</em>' reference.
	 * @see #getSystemCommunication()
	 * @generated
	 */
	void setSystemCommunication(SystemCommunicationHook value);

	/**
	 * Returns the value of the '<em><b>Owned Operational Actor Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalActorRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Actor Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Actor Realizations</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_OwnedOperationalActorRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of realisation links to/from operational-level actor(s) that this system actor hosts/contains' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which OperationalActorRealizations stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<OperationalActorRealization> getOwnedOperationalActorRealizations();

	/**
	 * Returns the value of the '<em><b>Owned Operational Entity Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.OperationalEntityRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Entity Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Entity Realizations</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_OwnedOperationalEntityRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of realisation links to/from operational-level entity(ies) that this system actor hosts/contains' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which OperationalActorRealizations stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<OperationalEntityRealization> getOwnedOperationalEntityRealizations();

	/**
	 * Returns the value of the '<em><b>Allocated System Functions</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction#getAllocatorActors <em>Allocator Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated System Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated System Functions</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_AllocatedSystemFunctions()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemFunction#getAllocatorActors
	 * @model opposite="allocatorActors" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<SystemFunction> getAllocatedSystemFunctions();

	/**
	 * Returns the value of the '<em><b>Realized Entities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Entity}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Entity#getRealizingActors <em>Realizing Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Entities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_RealizedEntities()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Entity#getRealizingActors
	 * @model opposite="realizingActors" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Entity> getRealizedEntities();

	/**
	 * Returns the value of the '<em><b>Realized Operational Actors</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActor}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActor#getRealizingSystemActors <em>Realizing System Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Operational Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Operational Actors</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_RealizedOperationalActors()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalActor#getRealizingSystemActors
	 * @model opposite="realizingSystemActors" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<OperationalActor> getRealizedOperationalActors();

	/**
	 * Returns the value of the '<em><b>Realizing Logical Actors</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalActor}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalActor#getRealizedSystemActors <em>Realized System Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Logical Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Logical Actors</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getActor_RealizingLogicalActors()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.LogicalActor#getRealizedSystemActors
	 * @model opposite="realizedSystemActors" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<LogicalActor> getRealizingLogicalActors();

} // Actor
