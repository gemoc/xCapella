package com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.provider.sections;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.core.properties.sections.NamedElementSection;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ComponentRuntimeData;

/**
 * This is the item provider adapter for a {@link ComponentRuntimeDataSection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentRuntimeDataSection extends NamedElementSection {
	/**
	 * @generated
	 */
	@Override
	public boolean select(Object toTest) {
		EObject obj = CapellaAdapterHelper.resolveSemanticObject(toTest);

		return obj != null
				&& obj.eClass()
						.equals(com.thalesgroup.trt.mde.vp.modesimulation.ModeSimulation.ModeSimulationPackage.eINSTANCE
								.getComponentRuntimeData());
	}
}
