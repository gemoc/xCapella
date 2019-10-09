/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisational Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OrganisationalUnit#getOrganisationalUnitCompositions <em>Organisational Unit Compositions</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OrganisationalUnit#getCommunityOfInterestMemberships <em>Community Of Interest Memberships</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOrganisationalUnit()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Structured set of operational entities.\r\nDescribes the high-level organizational decomposition of the system/enterprise, into organizational units.' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Actor' explanation='none' constraints='none'"
 * @generated
 */
public interface OrganisationalUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Organisational Unit Compositions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OrganisationalUnitComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisational Unit Compositions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisational Unit Compositions</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOrganisationalUnit_OrganisationalUnitCompositions()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='mediator elements implementing the relationships between this organisational unit and the entities that are part of it\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::NamedElement::clientDependency, keyword::nearestpackage' explanation='none' constraints='some elements on which OrganisationalUnitComposition stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<OrganisationalUnitComposition> getOrganisationalUnitCompositions();

	/**
	 * Returns the value of the '<em><b>Community Of Interest Memberships</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CommunityOfInterestComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Community Of Interest Memberships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Community Of Interest Memberships</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOrganisationalUnit_CommunityOfInterestMemberships()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the links between this organisational unit and the communities of interest to which it is associated\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::Dependency::supplier' constraints='Order must be computed'"
	 * @generated
	 */
	EList<CommunityOfInterestComposition> getCommunityOfInterestMemberships();

} // OrganisationalUnit
