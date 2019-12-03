/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Communication Hook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunicationHook#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunicationHook#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getSystemCommunicationHook()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Property'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Property' stereotype='eng.SystemCommunicationHook'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='an endpoint of a relationship between the System and external actors\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='system' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Property' explanation='none' constraints='none'"
 * @generated
 */
public interface SystemCommunicationHook extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' reference.
	 * @see #setCommunication(SystemCommunication)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getSystemCommunicationHook_Communication()
	 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='communication'"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='association' featureOwner='Property'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the relationship link to which this endpoint is attached\r\n[source: Capella study]\r\n\r\nReferences the association of which this property is a member, if any.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Property::association' explanation='none' constraints='none'"
	 * @generated
	 */
	SystemCommunication getCommunication();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunicationHook#getCommunication <em>Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' reference.
	 * @see #getCommunication()
	 * @generated
	 */
	void setCommunication(SystemCommunication value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Component)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.CtxPackage#getSystemCommunicationHook_Type()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='type' featureOwner='TypedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='type'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the type of the entity to which this endpoint is attached\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::TypedElement::type' explanation='none' constraints='none'"
	 * @generated
	 */
	Component getType();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemCommunicationHook#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Component value);

} // SystemCommunicationHook
