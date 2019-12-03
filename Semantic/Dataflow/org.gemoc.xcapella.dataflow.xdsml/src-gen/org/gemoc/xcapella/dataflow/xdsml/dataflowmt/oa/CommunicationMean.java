/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedRelationship;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.ComponentExchange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Mean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CommunicationMean#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CommunicationMean#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getCommunicationMean()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the mean by which two specific operational entities are able to exchange information\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='not explicitly mapped to uml::InformationFlow, since its parent (ComponentExchange) is concrete and already mapped to uml::InformationFlow\r\n' constraints='none'"
 * @generated
 */
public interface CommunicationMean extends NamedRelationship, ComponentExchange {
	/**
	 * Returns the value of the '<em><b>Source Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Entity</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getCommunicationMean_SourceEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Entity getSourceEntity();

	/**
	 * Returns the value of the '<em><b>Target Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Entity</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getCommunicationMean_TargetEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Entity getTargetEntity();

} // CommunicationMean
