/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionOperand#getReferencedInteractionFragments <em>Referenced Interaction Fragments</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionOperand#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getInteractionOperand()
 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 * @generated
 */
public interface InteractionOperand extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Referenced Interaction Fragments</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionFragment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Interaction Fragments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Interaction Fragments</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getInteractionOperand_ReferencedInteractionFragments()
	 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 * @generated
	 */
	EList<InteractionFragment> getReferencedInteractionFragments();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' reference.
	 * @see #setGuard(Constraint)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getInteractionOperand_Guard()
	 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 * @generated
	 */
	Constraint getGuard();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionOperand#getGuard <em>Guard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Constraint value);

} // InteractionOperand
