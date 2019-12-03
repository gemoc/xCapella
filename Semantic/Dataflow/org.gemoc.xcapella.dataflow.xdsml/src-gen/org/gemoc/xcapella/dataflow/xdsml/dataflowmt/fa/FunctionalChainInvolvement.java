/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.InvolvedElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Involvement;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Chain Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainInvolvement#getNextFunctionalChainInvolvements <em>Next Functional Chain Involvements</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainInvolvement#getPreviousFunctionalChainInvolvements <em>Previous Functional Chain Involvements</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainInvolvement#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainInvolvement#getInvolvedElement <em>Involved Element</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getFunctionalChainInvolvement()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specifies the involvement of a model element in a functional chain\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Dependency' explanation='none' constraints='none'"
 * @generated
 */
public interface FunctionalChainInvolvement extends Involvement {
	/**
	 * Returns the value of the '<em><b>Next Functional Chain Involvements</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Functional Chain Involvements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Functional Chain Involvements</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getFunctionalChainInvolvement_NextFunctionalChainInvolvements()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='' constraints='none'"
	 * @generated
	 */
	EList<FunctionalChainInvolvement> getNextFunctionalChainInvolvements();

	/**
	 * Returns the value of the '<em><b>Previous Functional Chain Involvements</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FunctionalChainInvolvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Functional Chain Involvements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Functional Chain Involvements</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getFunctionalChainInvolvement_PreviousFunctionalChainInvolvements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<FunctionalChainInvolvement> getPreviousFunctionalChainInvolvements();

	/**
	 * Returns the value of the '<em><b>Exchanged Items</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.information.ExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchanged Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchanged Items</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getFunctionalChainInvolvement_ExchangedItems()
	 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='' constraints='none'"
	 * @generated
	 */
	EList<ExchangeItem> getExchangedItems();

	/**
	 * Returns the value of the '<em><b>Involved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Element</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.fa.FaPackage#getFunctionalChainInvolvement_InvolvedElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	InvolvedElement getInvolvedElement();

} // FunctionalChainInvolvement
