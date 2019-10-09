/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CapabilityConfiguration#getConfiguredCapability <em>Configured Capability</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getCapabilityConfiguration()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='one of the possible configurations of an operational capability\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Class' explanation='none' constraints='none'"
 * @generated
 */
public interface CapabilityConfiguration extends AbstractConceptItem {
	/**
	 * Returns the value of the '<em><b>Configured Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configured Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configured Capability</em>' reference.
	 * @see #setConfiguredCapability(OperationalCapability)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getCapabilityConfiguration_ConfiguredCapability()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the Capability to which this configuration is associated\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	OperationalCapability getConfiguredCapability();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.CapabilityConfiguration#getConfiguredCapability <em>Configured Capability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configured Capability</em>' reference.
	 * @see #getConfiguredCapability()
	 * @generated
	 */
	void setConfiguredCapability(OperationalCapability value);

} // CapabilityConfiguration
