/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractCapability;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.CapabilityRealization;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getOwnedActorCapabilityInvolvements <em>Owned Actor Capability Involvements</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getOwnedSystemCapabilityInvolvement <em>Owned System Capability Involvement</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getInvolvedActors <em>Involved Actors</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getInvolvedSystem <em>Involved System</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getParticipatingSystem <em>Participating System</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getPurposes <em>Purposes</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getPurposeMissions <em>Purpose Missions</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getRealizedOperationalCapabilities <em>Realized Operational Capabilities</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getRealizingCapabilityRealizations <em>Realizing Capability Realizations</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Capability'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.Capability'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Ability of an organisation, system or process to provide a service that supports the achievement of high-level operational goals' usage\040guideline='n/a' used\040in\040levels='system' usage\040examples='../img/usage_examples/example_actor_capability.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::UseCase' explanation='none' constraints='none'"
 * @generated
 */
public interface Capability extends AbstractCapability {
	/**
	 * Returns the value of the '<em><b>Owned Actor Capability Involvements</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actor Capability Involvements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actor Capability Involvements</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_OwnedActorCapabilityInvolvements()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedActorCapabilityInvolvements'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the links between Actors and Capabilities that are owned by this Capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='none' constraints='uml::Package::packagedElement elements on which ActorCapabilityInvolvement stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ActorCapabilityInvolvement> getOwnedActorCapabilityInvolvements();

	/**
	 * Returns the value of the '<em><b>Owned System Capability Involvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned System Capability Involvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned System Capability Involvement</em>' containment reference.
	 * @see #setOwnedSystemCapabilityInvolvement(SystemCapabilityInvolvement)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_OwnedSystemCapabilityInvolvement()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedCapabilitySupplierLinks'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the links between the System and Capabilities, that are owned by this Capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='none' constraints='uml::Package::packagedElement elements on which SystemCapabilityInvolvement stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]'"
	 * @generated
	 */
	SystemCapabilityInvolvement getOwnedSystemCapabilityInvolvement();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getOwnedSystemCapabilityInvolvement <em>Owned System Capability Involvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned System Capability Involvement</em>' containment reference.
	 * @see #getOwnedSystemCapabilityInvolvement()
	 * @generated
	 */
	void setOwnedSystemCapabilityInvolvement(SystemCapabilityInvolvement value);

	/**
	 * Returns the value of the '<em><b>Involved Actors</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Actors</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_InvolvedActors()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.ActorCapabilityInvolvement#getCapability
	 * @model opposite="capability" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='involvedActors'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the links between Actors and this Capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ActorCapabilityInvolvement> getInvolvedActors();

	/**
	 * Returns the value of the '<em><b>Involved System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCapabilityInvolvement#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved System</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_InvolvedSystem()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCapabilityInvolvement#getCapability
	 * @model opposite="capability" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='capabilitySupplierLinks'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the link to the System being involved in this Capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	SystemCapabilityInvolvement getInvolvedSystem();

	/**
	 * Returns the value of the '<em><b>Participating Actors</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getContributedCapabilities <em>Contributed Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participating Actors</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_ParticipatingActors()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Actor#getContributedCapabilities
	 * @model opposite="contributedCapabilities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='participatingActors'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the Actors involved with this Capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Actor> getParticipatingActors();

	/**
	 * Returns the value of the '<em><b>Participating System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System#getContributedCapabilities <em>Contributed Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participating System</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_ParticipatingSystem()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System#getContributedCapabilities
	 * @model opposite="contributedCapabilities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='participatingSystems'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the System involved in this Capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.System getParticipatingSystem();

	/**
	 * Returns the value of the '<em><b>Purposes</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CapabilityExploitation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purposes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purposes</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_Purposes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping umlOppositeReference='addition' umlOppositeReferenceOwner='Include'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='purposes'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the links to the Mission(s) that this Capability supports\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::Include::addition' constraints='uml::NamedElement::clientDependency elements on which CapabilityExploitation stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<CapabilityExploitation> getPurposes();

	/**
	 * Returns the value of the '<em><b>Purpose Missions</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getExploitedCapabilities <em>Exploited Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Missions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Missions</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_PurposeMissions()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Mission#getExploitedCapabilities
	 * @model opposite="exploitedCapabilities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='purposeMissions'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the Mission(s) that this Capability supports\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<Mission> getPurposeMissions();

	/**
	 * Returns the value of the '<em><b>Realized Operational Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability#getRealizingCapabilities <em>Realizing Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Operational Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Operational Capabilities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_RealizedOperationalCapabilities()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability#getRealizingCapabilities
	 * @model opposite="realizingCapabilities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<OperationalCapability> getRealizedOperationalCapabilities();

	/**
	 * Returns the value of the '<em><b>Realizing Capability Realizations</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.CapabilityRealization}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.CapabilityRealization#getRealizedCapabilities <em>Realized Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Capability Realizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Capability Realizations</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getCapability_RealizingCapabilityRealizations()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.la.CapabilityRealization#getRealizedCapabilities
	 * @model opposite="realizedCapabilities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<CapabilityRealization> getRealizingCapabilityRealizations();

} // Capability
