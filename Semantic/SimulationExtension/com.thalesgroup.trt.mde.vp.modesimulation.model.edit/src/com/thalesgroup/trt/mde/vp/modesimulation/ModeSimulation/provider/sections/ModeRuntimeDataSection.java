package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.provider.sections;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.core.properties.sections.NamedElementSection;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeRuntimeData;

/**
 * This is the item provider adapter for a {@link ModeRuntimeDataSection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeRuntimeDataSection extends NamedElementSection {
	/**
	 * @generated
	 */
	@Override
	public boolean select(Object toTest) {
		EObject obj = CapellaAdapterHelper.resolveSemanticObject(toTest);

		return obj != null
				&& obj.eClass()
						.equals(com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage.eINSTANCE
								.getModeRuntimeData());
	}
}
