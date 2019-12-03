/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.requirement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.requirement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementFactoryImpl extends EFactoryImpl implements RequirementFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementFactory init() {
		try {
			RequirementFactory theRequirementFactory = (RequirementFactory)EPackage.Registry.INSTANCE.getEFactory(RequirementPackage.eNS_URI);
			if (theRequirementFactory != null) {
				return theRequirementFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RequirementPackage.REQUIREMENTS_PKG: return createRequirementsPkg();
			case RequirementPackage.REQUIREMENTS_TRACE: return createRequirementsTrace();
			case RequirementPackage.SYSTEM_FUNCTIONAL_INTERFACE_REQUIREMENT: return createSystemFunctionalInterfaceRequirement();
			case RequirementPackage.SYSTEM_FUNCTIONAL_REQUIREMENT: return createSystemFunctionalRequirement();
			case RequirementPackage.SYSTEM_NON_FUNCTIONAL_INTERFACE_REQUIREMENT: return createSystemNonFunctionalInterfaceRequirement();
			case RequirementPackage.SYSTEM_NON_FUNCTIONAL_REQUIREMENT: return createSystemNonFunctionalRequirement();
			case RequirementPackage.SYSTEM_USER_REQUIREMENT: return createSystemUserRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsPkg createRequirementsPkg() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsTrace createRequirementsTrace() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionalInterfaceRequirement createSystemFunctionalInterfaceRequirement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionalRequirement createSystemFunctionalRequirement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemNonFunctionalInterfaceRequirement createSystemNonFunctionalInterfaceRequirement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemNonFunctionalRequirement createSystemNonFunctionalRequirement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUserRequirement createSystemUserRequirement() {
		throw new UnsupportedOperationException("Cannot invoke element creation on a model type");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPackage getRequirementPackage() {
		return (RequirementPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementPackage getPackage() {
		return RequirementPackage.eINSTANCE;
	}

} //RequirementFactoryImpl
