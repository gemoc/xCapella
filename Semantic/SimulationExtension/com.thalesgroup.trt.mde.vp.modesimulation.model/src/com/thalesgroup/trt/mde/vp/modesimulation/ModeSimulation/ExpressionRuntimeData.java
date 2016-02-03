package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation;

import org.polarsys.capella.core.data.capellacore.NamedElement;

import org.polarsys.kitalpha.emde.model.ElementExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Runtime Data</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage#getExpressionRuntimeData()
 * @model annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraint ExtendedElement=' http://www.thalesgroup.com/trt/expression/1.0.0#//Expression http://www.thalesgroup.com/trt/expression/1.0.0#//EventExpression'"
 *        annotation="http://www.polarsys.org/kitalpha/emde/1.0.0/constraintMapping Mapping=' platform:/resource/com.thalesgroup.trt.mde.vp.expression/models/expression.ecore#//Expression platform:/resource/com.thalesgroup.trt.mde.vp.expression/models/expression.ecore#//EventExpression'"
 * @generated
 */

public interface ExpressionRuntimeData extends NamedElement, ElementExtension {

	/**

	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */

	boolean evaluate();

} // ExpressionRuntimeData
