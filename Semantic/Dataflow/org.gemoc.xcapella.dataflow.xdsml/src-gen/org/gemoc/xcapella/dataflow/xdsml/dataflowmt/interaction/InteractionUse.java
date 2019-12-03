/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionUse#getReferencedScenario <em>Referenced Scenario</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionUse#getActualGates <em>Actual Gates</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getInteractionUse()
 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 * @generated
 */
public interface InteractionUse extends AbstractFragment {
	/**
	 * Returns the value of the '<em><b>Referenced Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Scenario</em>' reference.
	 * @see #setReferencedScenario(Scenario)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getInteractionUse_ReferencedScenario()
	 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 * @generated
	 */
	Scenario getReferencedScenario();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionUse#getReferencedScenario <em>Referenced Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Scenario</em>' reference.
	 * @see #getReferencedScenario()
	 * @generated
	 */
	void setReferencedScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Actual Gates</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Gates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Gates</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getInteractionUse_ActualGates()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 * @generated
	 */
	EList<Gate> getActualGates();

} // InteractionUse
