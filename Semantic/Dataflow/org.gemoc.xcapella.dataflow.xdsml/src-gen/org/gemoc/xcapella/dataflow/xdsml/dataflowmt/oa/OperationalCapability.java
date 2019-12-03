/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Namespace;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractCapability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability#getOwnedEntityOperationalCapabilityInvolvements <em>Owned Entity Operational Capability Involvements</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability#getRealizingCapabilities <em>Realizing Capabilities</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalCapability#getInvolvedEntities <em>Involved Entities</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalCapability()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Ability of an organisation, system or process to to provide a service that supports the achievement of high-level operational goals\r\n\r\nAt the organisation level: Ability of an organisation, system or process to realise a product that will fulfill the requirements for that product.\r\n[source: ISO 9000]\r\n\r\nAt the program level: An operational outcome or effect that users of equipment need to achieve. \r\n[source: Smart Procurement - Edition 3 - June 2000]\r\n\r\nAt the system level: Set of functions that characterise an Operational service provided by a system, it is required against one or several requirements: functional and not functional (performance, constraint, ...).\r\n[source: MIST]\r\n' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='not used/implemented as of Capella 1.0.3' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::UseCase' explanation='none' constraints='none'"
 * @generated
 */
public interface OperationalCapability extends AbstractCapability, Namespace {
	/**
	 * Returns the value of the '<em><b>Compliances</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.ConceptCompliance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliances</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalCapability_Compliances()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of concepts to which this Capability complies\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::NamedElement::clientDependency' explanation='none' constraints='uml::NamedElement::clientDependency elements on which ConceptCompliance stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ConceptCompliance> getCompliances();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CapabilityConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalCapability_Configurations()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of various configurations of this Capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<CapabilityConfiguration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Owned Entity Operational Capability Involvements</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.EntityOperationalCapabilityInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entity Operational Capability Involvements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entity Operational Capability Involvements</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalCapability_OwnedEntityOperationalCapabilityInvolvements()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<EntityOperationalCapabilityInvolvement> getOwnedEntityOperationalCapabilityInvolvements();

	/**
	 * Returns the value of the '<em><b>Realizing Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getRealizedOperationalCapabilities <em>Realized Operational Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Capabilities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalCapability_RealizingCapabilities()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.Capability#getRealizedOperationalCapabilities
	 * @model opposite="realizedOperationalCapabilities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Capability> getRealizingCapabilities();

	/**
	 * Returns the value of the '<em><b>Involved Entities</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Entities</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalCapability_InvolvedEntities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Entity> getInvolvedEntities();

} // OperationalCapability
