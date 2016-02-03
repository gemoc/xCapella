package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage#getTransitionRuntimeData()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.thalesgroup.com/trt/mode/1.0.0#//Transition'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/resource/com.thalesgroup.trt.mde.vp.mode/models/mode.ecore#//Transition'"
 * @generated
 */

public interface TransitionRuntimeData extends NamedElement, ElementExtension {

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	String fire();

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	boolean evaluate();

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	String reset();

} // TransitionRuntimeData
