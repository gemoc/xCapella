/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.behavior.AbstractEvent;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getAllocatingOperations <em>Allocating Operations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getAllocatedOperations <em>Allocated Operations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getOwnedOperationAllocation <em>Owned Operation Allocation</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getOwnedExchangeItemRealizations <em>Owned Exchange Item Realizations</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getRealizedExchangeItems <em>Realized Exchange Items</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperation()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Operation'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Operation'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='An operation is a behavioral feature of a classifier that specifies the name, type, parameters, and constraints for invoking\r\nan associated behavior\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a (Abstract)' used\040in\040levels='n/a' usage\040examples='../img/usage_examples/operation_parameters.png' constraints='- An operation can have at most one return parameter (i.e., an owned parameter with the direction set to \"return\").\r\nownedParameter-&gt;select(par | par.direction = #return)-&gt;size() &lt;= 1\r\n- If this operation has a return parameter, isOrdered equals the value of isOrdered for that parameter; otherwise, isOrdered\r\nis false.\r\nisOrdered = if returnResult()-&gt;notEmpty() then returnResult()-&gt;any().isOrdered else false endif\r\n- If this operation has a return parameter, isUnique equals the value of isUnique for that parameter; otherwise, isUnique is\r\ntrue.\r\nisUnique = if returnResult()-&gt;notEmpty() then returnResult()-&gt;any().isUnique else true endif\r\n- If this operation has a return parameter, lower equals the value of lower for that parameter; otherwise, lower is not\r\ndefined.\r\nlower = if returnResult()-&gt;notEmpty() then returnResult()-&gt;any().lower else Set{} endif\r\n- If this operation has a return parameter, upper equals the value of upper for that parameter; otherwise, upper is not\r\ndefined.\r\nupper = if returnResult()-&gt;notEmpty() then returnResult()-&gt;any().upper else Set{} endif\r\n- If this operation has a return parameter, type equals the value of type for that parameter; otherwise, type is not defined.\r\ntype = if returnResult()-&gt;notEmpty() then returnResult()-&gt;any().type else Set{} endif\r\n- A bodyCondition can only be specified for a query operation.\r\nbodyCondition-&gt;notEmpty() implies isQuery\r\n[source: UML superstructure v2.2]' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Operation' constraints='none'"
 * @generated
 */
public interface Operation extends Feature, AbstractEvent, AbstractEventOperation {
	/**
	 * Returns the value of the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameters</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperation_OwnedParameters()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='ownedParameter' featureOwner='BehavioralFeature'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='parameters'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the parameters associated to this operation\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Operation::ownedParameter' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<Parameter> getOwnedParameters();

	/**
	 * Returns the value of the '<em><b>Allocating Operations</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getAllocatedOperations <em>Allocated Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Operations</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperation_AllocatingOperations()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getAllocatedOperations
	 * @model opposite="allocatedOperations" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the operation allocation relationships that point to this Operation\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<Operation> getAllocatingOperations();

	/**
	 * Returns the value of the '<em><b>Allocated Operations</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getAllocatingOperations <em>Allocating Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Operations</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperation_AllocatedOperations()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.Operation#getAllocatingOperations
	 * @model opposite="allocatingOperations" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the operation allocation relationships that start from this Operation\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Operation> getAllocatedOperations();

	/**
	 * Returns the value of the '<em><b>Owned Operation Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.OperationAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operation Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operation Allocation</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperation_OwnedOperationAllocation()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of the allocations of this operation to/from other operations.\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='Some elements on which OperationAlllocation stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<OperationAllocation> getOwnedOperationAllocation();

	/**
	 * Returns the value of the '<em><b>Owned Exchange Item Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItemRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exchange Item Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exchange Item Realizations</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperation_OwnedExchangeItemRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of the exchange items that the operation is realizing\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='Some elements on which ExchangeItemRealization stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<ExchangeItemRealization> getOwnedExchangeItemRealizations();

	/**
	 * Returns the value of the '<em><b>Realized Exchange Items</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem#getRealizingOperations <em>Realizing Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Exchange Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Exchange Items</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.InformationPackage#getOperation_RealizedExchangeItems()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem#getRealizingOperations
	 * @model opposite="realizingOperations" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='class(es) realized by this class' constraints='none' comment/notes='none'"
	 * @generated
	 */
	EList<ExchangeItem> getRealizedExchangeItems();

} // Operation
