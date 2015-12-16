package com.thalesgroup.trt.mde.vp.mode.mode.provider.sections;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.core.properties.sections.NamedElementSection;
import org.polarsys.capella.core.model.handler.helpers.CapellaAdapterHelper;
import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;

/**
 * This is the item provider adapter for a {@link ModeMachineSection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeMachineSection extends NamedElementSection {
	/**
	 * @generated
	 */
	@Override
	public boolean select(Object toTest) {
		EObject obj = CapellaAdapterHelper.resolveSemanticObject(toTest);

		return obj != null
				&& obj.eClass()
						.equals(com.thalesgroup.trt.mde.vp.mode.mode.ModePackage.eINSTANCE
								.getModeMachine());
	}
}
