/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.DatavaluePackage
 * @generated
 */
public interface DatavalueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatavalueFactory eINSTANCE = org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datavalue.impl.DatavalueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Literal Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Boolean Value</em>'.
	 * @generated
	 */
	LiteralBooleanValue createLiteralBooleanValue();

	/**
	 * Returns a new object of class '<em>Boolean Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Reference</em>'.
	 * @generated
	 */
	BooleanReference createBooleanReference();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Enumeration Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Reference</em>'.
	 * @generated
	 */
	EnumerationReference createEnumerationReference();

	/**
	 * Returns a new object of class '<em>Literal String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal String Value</em>'.
	 * @generated
	 */
	LiteralStringValue createLiteralStringValue();

	/**
	 * Returns a new object of class '<em>String Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Reference</em>'.
	 * @generated
	 */
	StringReference createStringReference();

	/**
	 * Returns a new object of class '<em>Literal Numeric Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Numeric Value</em>'.
	 * @generated
	 */
	LiteralNumericValue createLiteralNumericValue();

	/**
	 * Returns a new object of class '<em>Numeric Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Reference</em>'.
	 * @generated
	 */
	NumericReference createNumericReference();

	/**
	 * Returns a new object of class '<em>Complex Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Value</em>'.
	 * @generated
	 */
	ComplexValue createComplexValue();

	/**
	 * Returns a new object of class '<em>Complex Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complex Value Reference</em>'.
	 * @generated
	 */
	ComplexValueReference createComplexValueReference();

	/**
	 * Returns a new object of class '<em>Value Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Part</em>'.
	 * @generated
	 */
	ValuePart createValuePart();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Expression</em>'.
	 * @generated
	 */
	OpaqueExpression createOpaqueExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatavaluePackage getDatavaluePackage();

} //DatavalueFactory
