
// Generated on 23.10.2019 at 02:27:36 CEST by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.mode.contextual.explorer.queries.initial;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;

import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;

import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

/**
* <!-- begin-user-doc -->
* <!-- end-user-doc -->
* <p>
* </p>
*
* @generated
*/
public class ReferencingViewpointElementQuery implements IQuery {

	/**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * Default constructor
	   * @generated
	   */
	public ReferencingViewpointElementQuery() {
		// TODO Auto-generated constructor stub
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object_p: The model element for which the Contextual Explorer extension is generated
	* @return List of object to display in the parent category
	* @generated
	*/
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		Resource resource = ((EObject) object_p).eResource();
		if (resource != null) {
			for (TreeIterator<EObject> iter = resource.getAllContents(); iter.hasNext();) {
				EObject eObject = iter.next();

				if (eObject instanceof ModeMachine) {
					ModeMachine referencingElement = (ModeMachine) eObject;
					if (referencingElement.getInitial() != null && referencingElement.getInitial().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof Transition) {
					Transition referencingElement = (Transition) eObject;
					if (referencingElement.getSource() != null && referencingElement.getSource().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof Transition) {
					Transition referencingElement = (Transition) eObject;
					if (referencingElement.getTarget() != null && referencingElement.getTarget().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof Transition) {
					Transition referencingElement = (Transition) eObject;
					if (referencingElement.getSource() != null && referencingElement.getSource().equals(object_p))
						result.add(eObject);
				}

				if (eObject instanceof Transition) {
					Transition referencingElement = (Transition) eObject;
					if (referencingElement.getTarget() != null && referencingElement.getTarget().equals(object_p))
						result.add(eObject);
				}
			}
		}
		return result;
	}

}