/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Concept Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.AbstractConceptItem#getComposingLinks <em>Composing Links</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getAbstractConceptItem()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Constitutive element of a Concept.\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::NamedElement' constraints='none'"
 * @generated
 */
public interface AbstractConceptItem extends Component {
	/**
	 * Returns the value of the '<em><b>Composing Links</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.ItemInConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composing Links</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getAbstractConceptItem_ComposingLinks()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='relationships between this item and the concept(s) that it is involved in\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::Dependency::supplier' constraints='Order must be computed'"
	 * @generated
	 */
	EList<ItemInConcept> getComposingLinks();

} // AbstractConceptItem
