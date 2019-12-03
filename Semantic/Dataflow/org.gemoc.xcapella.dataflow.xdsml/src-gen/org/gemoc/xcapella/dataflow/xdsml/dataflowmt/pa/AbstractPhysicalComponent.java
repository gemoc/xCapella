/**
 */
package org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa;

import org.eclipse.emf.common.util.EList;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.DeployableElement;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.DeploymentTarget;
import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.SystemComponent;

import org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.deployment.DeploymentAspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Physical Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.AbstractPhysicalComponent#getKind <em>Kind</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.AbstractPhysicalComponent#getNature <em>Nature</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.AbstractPhysicalComponent#getOwnedDeploymentLinks <em>Owned Deployment Links</em>}</li>
 *   <li>{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.AbstractPhysicalComponent#getOwnedDeploymentAspect <em>Owned Deployment Aspect</em>}</li>
 * </ul>
 *
 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getAbstractPhysicalComponent()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='AbstractPhysicalComponent'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Component' Stereotype='eng.AbstractPhysicalComponent'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Base abstract class for the implementation of actual physical components\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface AbstractPhysicalComponent extends SystemComponent, DeployableElement, DeploymentTarget {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentKind
	 * @see #setKind(PhysicalComponentKind)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getAbstractPhysicalComponent_Kind()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='type' fromStereotype='true' featureOwner='eng.AbstractPhysicalComponent'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specifies the type of physical component (refer to PhysicalComponentKind for detailed description)\r\n[source: Capella study]' constraints='none' type='refer to PhysicalComponentKind definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	PhysicalComponentKind getKind();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.AbstractPhysicalComponent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PhysicalComponentKind value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentNature
	 * @see #setNature(PhysicalComponentNature)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getAbstractPhysicalComponent_Nature()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specifies the nature of this physical component, typically whether it is an actual execution node, or a behavioral component like a SW part\r\n[source: Capella study]' constraints='none' type='refer to PhysicalComponentNature definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	PhysicalComponentNature getNature();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.AbstractPhysicalComponent#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PhysicalComponentNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(PhysicalComponentNature value);

	/**
	 * Returns the value of the '<em><b>Owned Deployment Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.cs.AbstractDeploymentLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Deployment Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Deployment Links</em>' containment reference list.
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getAbstractPhysicalComponent_OwnedDeploymentLinks()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the various deployments of this physical component\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='SysML::Blocks::Block cannot contain AbstractDeployment\'s equivalent, hence we find the nearest available package to store them.' constraints='none'"
	 * @generated
	 */
	EList<AbstractDeploymentLink> getOwnedDeploymentLinks();

	/**
	 * Returns the value of the '<em><b>Owned Deployment Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Deployment Aspect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Deployment Aspect</em>' containment reference.
	 * @see #setOwnedDeploymentAspect(DeploymentAspect)
	 * @see org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.PaPackage#getAbstractPhysicalComponent_OwnedDeploymentAspect()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	DeploymentAspect getOwnedDeploymentAspect();

	/**
	 * Sets the value of the '{@link org.gemoc.xcapella.dataflow.xdsml.dataflowmt.pa.AbstractPhysicalComponent#getOwnedDeploymentAspect <em>Owned Deployment Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Deployment Aspect</em>' containment reference.
	 * @see #getOwnedDeploymentAspect()
	 * @generated
	 */
	void setOwnedDeploymentAspect(DeploymentAspect value);

} // AbstractPhysicalComponent
