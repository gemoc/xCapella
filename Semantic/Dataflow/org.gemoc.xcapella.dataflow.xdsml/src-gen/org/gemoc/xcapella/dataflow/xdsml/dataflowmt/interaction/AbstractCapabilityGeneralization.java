/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Capability Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractCapabilityGeneralization#getSuper <em>Super</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractCapabilityGeneralization#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getAbstractCapabilityGeneralization()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='AbstractCapabilityGeneralization'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Generalization' stereotype='eng.AbstractCapabilityGeneralization'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A specific kind of generalization link between Capabilities.\r\n[source: Capella study]\r\n\r\nThe generalization is useful for Capability reuse (override or extension of Capability).' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Generalization' explanation='none' constraints='none'"
 * @generated
 */
public interface AbstractCapabilityGeneralization extends Relationship {
	/**
	 * Returns the value of the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' reference.
	 * @see #setSuper(AbstractCapability)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getAbstractCapabilityGeneralization_Super()
	 * @model required="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='general' featureOwner='Generalization'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='super'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the parent Capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Generalization::general' explanation='none' constraints='none'"
	 * @generated
	 */
	AbstractCapability getSuper();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.AbstractCapabilityGeneralization#getSuper <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' reference.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(AbstractCapability value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.interaction.InteractionPackage#getAbstractCapabilityGeneralization_Sub()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='general' featureOwner='Generalization'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='super'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the child Capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Generalization::specific' explanation='none' constraints='none'"
	 * @generated
	 */
	AbstractCapability getSub();

} // AbstractCapabilityGeneralization
