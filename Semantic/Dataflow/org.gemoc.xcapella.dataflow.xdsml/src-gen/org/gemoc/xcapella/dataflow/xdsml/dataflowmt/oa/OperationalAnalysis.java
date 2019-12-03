/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.BlockArchitecture;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemAnalysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operational Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getOwnedOperationalContext <em>Owned Operational Context</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getOwnedRolePkg <em>Owned Role Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getOwnedEntityPkg <em>Owned Entity Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getOwnedConceptPkg <em>Owned Concept Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getContainedOperationalCapabilityPkg <em>Contained Operational Capability Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getContainedOperationalActivityPkg <em>Contained Operational Activity Pkg</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getAllocatingSystemAnalyses <em>Allocating System Analyses</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalAnalysis()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Model describing operational need - organisations, actors, operational activities &amp; related items - associated to (created during) a modelling phase' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface OperationalAnalysis extends BlockArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned Operational Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Operational Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operational Context</em>' containment reference.
	 * @see #setOwnedOperationalContext(OperationalContext)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalAnalysis_OwnedOperationalContext()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the \"context\" for this architecture, e.g. the parts that make the environnement of the entities (actors, ...) , plus the entities itself' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::PackagedElement elements on which OperationalContext stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	OperationalContext getOwnedOperationalContext();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getOwnedOperationalContext <em>Owned Operational Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Operational Context</em>' containment reference.
	 * @see #getOwnedOperationalContext()
	 * @generated
	 */
	void setOwnedOperationalContext(OperationalContext value);

	/**
	 * Returns the value of the '<em><b>Owned Role Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Role Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Role Pkg</em>' containment reference.
	 * @see #setOwnedRolePkg(RolePkg)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalAnalysis_OwnedRolePkg()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='container for Role definitions of this operational analysis\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which RolePkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [1..1]'"
	 * @generated
	 */
	RolePkg getOwnedRolePkg();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getOwnedRolePkg <em>Owned Role Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Role Pkg</em>' containment reference.
	 * @see #getOwnedRolePkg()
	 * @generated
	 */
	void setOwnedRolePkg(RolePkg value);

	/**
	 * Returns the value of the '<em><b>Owned Entity Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entity Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entity Pkg</em>' containment reference.
	 * @see #setOwnedEntityPkg(EntityPkg)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalAnalysis_OwnedEntityPkg()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='container for the Entities defined for this operational analysis\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which EntityPkgstereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [1..1]'"
	 * @generated
	 */
	EntityPkg getOwnedEntityPkg();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getOwnedEntityPkg <em>Owned Entity Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Entity Pkg</em>' containment reference.
	 * @see #getOwnedEntityPkg()
	 * @generated
	 */
	void setOwnedEntityPkg(EntityPkg value);

	/**
	 * Returns the value of the '<em><b>Owned Concept Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Concept Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Concept Pkg</em>' containment reference.
	 * @see #setOwnedConceptPkg(ConceptPkg)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalAnalysis_OwnedConceptPkg()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='container for the Concepts defined in this operational analysis\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which ConceptPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [1..1]'"
	 * @generated
	 */
	ConceptPkg getOwnedConceptPkg();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OperationalAnalysis#getOwnedConceptPkg <em>Owned Concept Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Concept Pkg</em>' containment reference.
	 * @see #getOwnedConceptPkg()
	 * @generated
	 */
	void setOwnedConceptPkg(ConceptPkg value);

	/**
	 * Returns the value of the '<em><b>Contained Operational Capability Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Operational Capability Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Operational Capability Pkg</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalAnalysis_ContainedOperationalCapabilityPkg()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedAbstractCapabilityPkg'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	OperationalCapabilityPkg getContainedOperationalCapabilityPkg();

	/**
	 * Returns the value of the '<em><b>Contained Operational Activity Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Operational Activity Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Operational Activity Pkg</em>' reference.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalAnalysis_ContainedOperationalActivityPkg()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedFunctionPkg'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	OperationalActivityPkg getContainedOperationalActivityPkg();

	/**
	 * Returns the value of the '<em><b>Allocating System Analyses</b></em>' reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemAnalysis}.
	 * It is bidirectional and its opposite is '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemAnalysis#getAllocatedOperationalAnalyses <em>Allocated Operational Analyses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating System Analyses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating System Analyses</em>' reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.oa.OaPackage#getOperationalAnalysis_AllocatingSystemAnalyses()
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.ctx.SystemAnalysis#getAllocatedOperationalAnalyses
	 * @model opposite="allocatedOperationalAnalyses" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<SystemAnalysis> getAllocatingSystemAnalyses();

} // OperationalAnalysis
