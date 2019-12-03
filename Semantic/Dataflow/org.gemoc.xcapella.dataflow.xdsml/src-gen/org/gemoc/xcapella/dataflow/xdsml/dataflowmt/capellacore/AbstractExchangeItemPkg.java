/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Exchange Item Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.AbstractExchangeItemPkg#getOwnedExchangeItems <em>Owned Exchange Items</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellacorePackage#getAbstractExchangeItemPkg()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a container for exchange items\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface AbstractExchangeItemPkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Exchange Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exchange Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exchange Items</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.CapellacorePackage#getAbstractExchangeItemPkg_OwnedExchangeItems()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange items contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which AbstractExchangeItem stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ExchangeItem> getOwnedExchangeItems();

} // AbstractExchangeItemPkg
