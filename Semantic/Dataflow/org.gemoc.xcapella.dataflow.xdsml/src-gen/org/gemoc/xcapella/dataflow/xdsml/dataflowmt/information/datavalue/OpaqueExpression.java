/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellaElement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.OpaqueExpression#getBodies <em>Bodies</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.OpaqueExpression#getLanguages <em>Languages</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage#getOpaqueExpression()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='An opaque expression contains language-specific text strings used to describe a value or values, and an optional specification of\r\nthe languages.\r\nOne predefined language for specifying expressions is OCL. Natural language or programming languages may also be\r\nused.' constraints='If the language attribute is not empty, then the size of the body and language arrays must be the same.'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping base\040metaclass\040in\040UML/SysML\040profile\040='uml::OpaqueExpression'"
 * @generated
 */
public interface OpaqueExpression extends CapellaElement, ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Bodies</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bodies</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bodies</em>' attribute list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage#getOpaqueExpression_Bodies()
	 * @model unique="false"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='The text of the expression, possibly in multiple languages.'"
	 * @generated
	 */
	EList<String> getBodies();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' attribute list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage#getOpaqueExpression_Languages()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the languages in which the expression is stated. The interpretation of the expression body depends on the\r\nlanguages. If the languages are unspecified, they might be implicit from the expression body or the context.\r\nLanguages are matched to body strings by order.'"
	 * @generated
	 */
	EList<String> getLanguages();

} // OpaqueExpression
