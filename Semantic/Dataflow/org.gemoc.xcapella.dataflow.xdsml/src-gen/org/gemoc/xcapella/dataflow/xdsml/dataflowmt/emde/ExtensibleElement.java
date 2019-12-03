/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensible Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ExtensibleElement#getOwnedExtensions <em>Owned Extensions</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.EmdePackage#getExtensibleElement()
 * @model abstract="true"
 * @generated
 */
public interface ExtensibleElement extends Element {
	/**
	 * Returns the value of the '<em><b>Owned Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.ElementExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Extensions</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.emde.EmdePackage#getExtensibleElement_OwnedExtensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementExtension> getOwnedExtensions();

} // ExtensibleElement
