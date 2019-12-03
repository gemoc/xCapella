/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.activity.OutputPin;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionOutputPort#getOutgoingExchangeItems <em>Outgoing Exchange Items</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionOutputPort#getOutgoingFunctionalExchanges <em>Outgoing Functional Exchanges</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getFunctionOutputPort()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='an output interface of its owning function, to be the origin of functional exchanges towards other functions\r\n[source: Capella study]' usage\040guideline='It is necessary to create a function output port on a function, to be able to set this function as the origin of a functional exchange. Note however that the Capella tool automatically creates a function output port on the origin function, when a functional exchange is created.\r\n[source: Capella study]' used\040in\040levels='system,logical,physical' usage\040examples='../img/usage_examples/ports_exchanges.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::ActivityParameterNode' explanation='use ActivityParameterNodes, delegation will add uml::OutputPin on call BehaviorAction' constraints='none'"
 * @generated
 */
public interface FunctionOutputPort extends FunctionPort, OutputPin {
	/**
	 * Returns the value of the '<em><b>Outgoing Exchange Items</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Exchange Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Exchange Items</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getFunctionOutputPort_OutgoingExchangeItems()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange items that are declared as potentially flowing out of this port\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<ExchangeItem> getOutgoingExchangeItems();

	/**
	 * Returns the value of the '<em><b>Outgoing Functional Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Functional Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Functional Exchanges</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getFunctionOutputPort_OutgoingFunctionalExchanges()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<FunctionalExchange> getOutgoingFunctionalExchanges();

} // FunctionOutputPort
