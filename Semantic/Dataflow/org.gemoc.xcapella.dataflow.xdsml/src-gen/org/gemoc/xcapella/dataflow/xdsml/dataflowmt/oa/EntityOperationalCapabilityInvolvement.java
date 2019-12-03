/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.capellacore.Involvement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Operational Capability Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.EntityOperationalCapabilityInvolvement#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.EntityOperationalCapabilityInvolvement#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getEntityOperationalCapabilityInvolvement()
 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface EntityOperationalCapabilityInvolvement extends Involvement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getEntityOperationalCapabilityInvolvement_Entity()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getEntityOperationalCapabilityInvolvement_Capability()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	OperationalCapability getCapability();

} // EntityOperationalCapabilityInvolvement
