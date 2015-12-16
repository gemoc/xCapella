// Generated on 09.10.2015 at 11:54:09 CEST by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.mode.design.service.tools;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;
import com.thalesgroup.trt.mde.vp.mode.mode.ModeFactory;
import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;
import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the DoReMi JavaExtension '<em><b>[com.thalesgroup.trt.mde.vp.mode.design.service.tools.CreateToolService]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class CreateToolService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param source : the semantic source element
	 * @param sourceView : the semantic source view
	 * @param target : the semantic target element
	 * @param targetView : the semantic target view
	 * @generated NOT
	 */
	public boolean createTransitionInstance(EObject source, EObject sourceView,
			EObject target, EObject targetView) {
		Transition trans = ModeFactory.eINSTANCE.createTransition();
		AbstractMode src = (AbstractMode) source;
		AbstractMode tgt = (AbstractMode) target;

		ModeMachine machine = (ModeMachine) src.eContainer();

		trans.setSource(src);
		trans.setTarget(tgt);
		tgt.getIncomingTransitions().add(trans);
		src.getOutgoingTransitions().add(trans);

		machine.getOwnedTransitions().add(trans);

		return true;
	}
}