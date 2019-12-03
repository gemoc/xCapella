/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.sharedmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.sharedmodel.SharedmodelPackage
 * @generated
 */
public interface SharedmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SharedmodelFactory eINSTANCE = org.gemoc.xcapella.dataflow.xdsml.dataflowmt.sharedmodel.impl.SharedmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shared Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shared Pkg</em>'.
	 * @generated
	 */
	SharedPkg createSharedPkg();

	/**
	 * Returns a new object of class '<em>Generic Pkg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Pkg</em>'.
	 * @generated
	 */
	GenericPkg createGenericPkg();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SharedmodelPackage getSharedmodelPackage();

} //SharedmodelFactory
