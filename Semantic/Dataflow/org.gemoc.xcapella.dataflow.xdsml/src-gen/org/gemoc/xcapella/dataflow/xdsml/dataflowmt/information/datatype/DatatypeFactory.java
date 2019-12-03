/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.DatatypePackage
 * @generated
 */
public interface DatatypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypeFactory eINSTANCE = org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.datatype.impl.DatatypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type</em>'.
	 * @generated
	 */
	BooleanType createBooleanType();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Type</em>'.
	 * @generated
	 */
	StringType createStringType();

	/**
	 * Returns a new object of class '<em>Numeric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Type</em>'.
	 * @generated
	 */
	NumericType createNumericType();

	/**
	 * Returns a new object of class '<em>Physical Quantity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Quantity</em>'.
	 * @generated
	 */
	PhysicalQuantity createPhysicalQuantity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatatypePackage getDatatypePackage();

} //DatatypeFactory
