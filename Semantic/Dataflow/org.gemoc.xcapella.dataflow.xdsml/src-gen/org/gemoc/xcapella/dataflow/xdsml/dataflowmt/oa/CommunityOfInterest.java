/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Community Of Interest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CommunityOfInterest#getCommunityOfInterestCompositions <em>Community Of Interest Compositions</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getCommunityOfInterest()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A Community of Interest consists of collaborative groups of stakeholders who must have a shared vocabulary to exchange information in pursuit of their shared goals, interests, missions, or business processes. This group may include end users, actors, program managers, application developers, subject matter experts, Combatant Command, Service and Agency representatives, and IT Portfolio representatives.\r\n\r\nA Community of Interest is a grouping of Actors that use the same information products/elements with the same QoI (e.g. timeliness, security and availability)\r\n[source: NAF]\r\n\r\nA Community of Interest consists of collaborative groups of users who must have a shared vocabulary to exchange information in pursuit of their shared goals, interests, missions, or business processes. This group includes end users, program managers, application developers, subject matter experts, Combatant Command, Service and Agency representatives, and IT Portfolio representatives.\r\n[source: DOD]' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='not used/implemented as of Capella 1.0.3' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Actor' explanation='none' constraints='none'"
 * @generated
 */
public interface CommunityOfInterest extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Community Of Interest Compositions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CommunityOfInterestComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Community Of Interest Compositions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Community Of Interest Compositions</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getCommunityOfInterest_CommunityOfInterestCompositions()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='mediator elements implementing the relationships between this community of interest and the organizational units.\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::NamedElement::clientDependency, keyword::nearestpackage' explanation='none' constraints='Some elements on which CommunityOfInterestComposition stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<CommunityOfInterestComposition> getCommunityOfInterestCompositions();

} // CommunityOfInterest
