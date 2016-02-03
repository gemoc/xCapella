package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage#getActionRuntimeData()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.thalesgroup.com/trt/al/1.0.0#//Action'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/resource/com.thalesgroup.trt.mde.vp.al/models/al.ecore#//Action'"
 * @generated
 */

public interface ActionRuntimeData extends NamedElement, ElementExtension {

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	String execute();

} // ActionRuntimeData
