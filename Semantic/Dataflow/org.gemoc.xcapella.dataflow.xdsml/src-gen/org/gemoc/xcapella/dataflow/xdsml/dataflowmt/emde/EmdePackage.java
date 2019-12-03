/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.EmdeFactory
 * @model kind="package"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/extension useUUIDs='true' useIDAttributes='false'"
 * @generated
 */
public interface EmdePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emde";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.gemoc.xcapella.dataflow.xdsml.dataflowmt/emde/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmdePackage eINSTANCE = org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.EmdePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ElementImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.EmdePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ExtensibleElementImpl <em>Extensible Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ExtensibleElementImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.EmdePackageImpl#getExtensibleElement()
	 * @generated
	 */
	int EXTENSIBLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extensible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ElementExtensionImpl <em>Element Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ElementExtensionImpl
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.EmdePackageImpl#getElementExtension()
	 * @generated
	 */
	int ELEMENT_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXTENSION__OWNED_EXTENSIONS = EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS;

	/**
	 * The number of structural features of the '<em>Element Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_EXTENSION_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensible Element</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement
	 * @generated
	 */
	EClass getExtensibleElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement#getOwnedExtensions <em>Owned Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Extensions</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement#getOwnedExtensions()
	 * @see #getExtensibleElement()
	 * @generated
	 */
	EReference getExtensibleElement_OwnedExtensions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ElementExtension <em>Element Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Extension</em>'.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ElementExtension
	 * @generated
	 */
	EClass getElementExtension();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmdeFactory getEmdeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ElementImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.EmdePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ExtensibleElementImpl <em>Extensible Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ExtensibleElementImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.EmdePackageImpl#getExtensibleElement()
		 * @generated
		 */
		EClass EXTENSIBLE_ELEMENT = eINSTANCE.getExtensibleElement();

		/**
		 * The meta object literal for the '<em><b>Owned Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS = eINSTANCE.getExtensibleElement_OwnedExtensions();

		/**
		 * The meta object literal for the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ElementExtensionImpl <em>Element Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.ElementExtensionImpl
		 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.impl.EmdePackageImpl#getElementExtension()
		 * @generated
		 */
		EClass ELEMENT_EXTENSION = eINSTANCE.getElementExtension();

	}

} //EmdePackage
