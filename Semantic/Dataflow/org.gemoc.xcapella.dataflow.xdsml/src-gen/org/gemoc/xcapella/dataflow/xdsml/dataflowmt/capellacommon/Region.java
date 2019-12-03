/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.Region#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.Region#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.Region#getInvolvedStates <em>Involved States</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapellacommonPackage#getRegion()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A region is an orthogonal part of either a composite state or a state machine. It contains states and transitions.\r\n[source: UML superstructure v2.2]' usage\040guideline='in Capella, a Region is automatically created when creating a state/mode diagram' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Region' explanation='none' constraints='none'"
 * @generated
 */
public interface Region extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapellacommonPackage#getRegion_OwnedStates()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='The set of states owned by the region.\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Region::subvertex' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<AbstractState> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Owned Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.StateTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Transitions</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapellacommonPackage#getRegion_OwnedTransitions()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='The set of transitions owned by the region. Note that internal transitions are owned by a region, but applies to the\r\nsource state.\r\n[source:UML Superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Region::transition' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<StateTransition> getOwnedTransitions();

	/**
	 * Returns the value of the '<em><b>Involved States</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved States</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacommon.CapellacommonPackage#getRegion_InvolvedStates()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of elements that are involved in this region' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<AbstractState> getInvolvedStates();

} // Region
