/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.StateMachine;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Classifier;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.VisibilityKind;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DataValueContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationItem#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationItem#getOwnedStateMachines <em>Owned State Machines</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationItem#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage#getCommunicationItem()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='CommunicationItem'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Classifier'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Generic class serving as a common parent for dedicated communication artifacts\r\n[source: Capella study]' usage\040guideline='n/a (Abstract)' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface CommunicationItem extends Classifier, DataValueContainer {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage#getCommunicationItem_Visibility()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='refer to VisibilityKind description\r\n[source: Capella study]' constraints='none' type='refer to VisibilityKind definition\r\n[source: Capella study]' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::NamedElement::visibility' explanation='none' constraints='none'"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationItem#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Machines</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage#getCommunicationItem_OwnedStateMachines()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='state machines associated to this communication item, as a mean to specify communication protocols\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='Elements are contained in the nearest possible parent container.' constraints='Elements on which StateMachine stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<StateMachine> getOwnedStateMachines();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.communication.CommunicationPackage#getCommunicationItem_Properties()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='ownedAttribute' featureOwner='StructuredClassifier'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='properties'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='attributes of the communication item\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='no found equivalent since the three children (Exception, Signal, Message) have different hierarchies. The specific rule should  create a package, stored the Properties in this package, and finally create a packageImport under the NamedElement reference for the element' constraints='elements inside the imported package on which a Property stereotype or any stereotype that inherits from it  is applied'"
	 * @generated
	 */
	EList<Property> getProperties();

} // CommunicationItem
