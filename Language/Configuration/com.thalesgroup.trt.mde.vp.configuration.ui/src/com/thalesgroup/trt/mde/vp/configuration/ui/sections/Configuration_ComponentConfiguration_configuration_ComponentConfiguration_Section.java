// Generated on 14.12.2015 at 03:01:59 GMT+01:00 by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.configuration.ui.sections;

import org.polarsys.capella.core.ui.properties.sections.AbstractSection;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import org.polarsys.capella.core.ui.properties.controllers.*;
import org.polarsys.capella.common.mdsofa.common.constant.ICommonConstants;

import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;

import org.polarsys.capella.core.ui.properties.fields.*;

import com.thalesgroup.trt.mde.vp.configuration.ui.controllers.ComponentParametersAssociationFieldController;

import com.thalesgroup.trt.mde.vp.configuration.ui.controllers.ComponentConfigurationsAssociationFieldController;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ComponentConfiguration;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Configuration_ComponentConfiguration_configuration_ComponentConfiguration_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Configuration_ComponentConfiguration_configuration_ComponentConfiguration_Section
		extends AbstractSection {

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SimpleSemanticField ComponentAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField ComponentParametersAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField ComponentConfigurationsAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Group configuration_ComponentConfiguration_AssociationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject: current object
	 * @generated
	 */
	public boolean select(Object eObject) {
		EObject eObjectToTest = super.selection(eObject);

		if (eObjectToTest instanceof ComponentConfiguration)
			return true;

		else {
			EObject children = getComponentConfigurationObject(eObjectToTest);
			if (children != null)
				return true;
		}

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param part
	 * @param selection
	 * @generated
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		EObject newEObject = super.setInputSelection(part, selection);

		if (newEObject != null
				&& !(newEObject instanceof ComponentConfiguration))
			newEObject = getComponentConfigurationObject(newEObject);

		if (newEObject != null) {
			loadData((CapellaElement) newEObject);
		} else {
			return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param parent: An EObject. It is considered as the Parent of an EMDE extension (a Viewpoint element)
	 * @return 
	 * @generated
	 */
	private EObject getComponentConfigurationObject(EObject parent) {
		if (!isViewpointActive())
			return null;

		if (parent == null || (parent != null && parent.eContents() == null))
			return null;

		EObject result = null;
		for (EObject iEObject : parent.eContents()) {
			if (iEObject instanceof ComponentConfiguration) {
				result = (result == null ? (ComponentConfiguration) iEObject
						: null);
				// This case is true when there is more then one extension of the same type. 
				if (result == null)
					break;
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return True is the AF viewpoint is active. False else. 
	 * @generated
	 */
	private boolean isViewpointActive() {
		return ViewpointManager.INSTANCE
				.isActive("com.thalesgroup.trt.mde.vp.configuration");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param parent:
	 * @param aTabbedPropertySheetPage:
	 * @generated
	 */
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		configuration_ComponentConfiguration_AssociationGroup = getWidgetFactory()
				.createGroup(_rootParentComposite,
						"Component Configuration Associations");
		configuration_ComponentConfiguration_AssociationGroup
				.setLayout(new GridLayout(6, false));
		GridData gdconfiguration_ComponentConfiguration_AssociationGroup = new GridData(
				GridData.FILL_HORIZONTAL);
		gdconfiguration_ComponentConfiguration_AssociationGroup.horizontalSpan = ((GridLayout) _rootParentComposite
				.getLayout()).numColumns;
		configuration_ComponentConfiguration_AssociationGroup
				.setLayoutData(gdconfiguration_ComponentConfiguration_AssociationGroup);

		ComponentAssociation = new SimpleSemanticField(
				configuration_ComponentConfiguration_AssociationGroup,
				"Component :", getWidgetFactory(),
				new SimpleSemanticFieldController());

		ComponentParametersAssociation = new MultipleSemanticField(
				configuration_ComponentConfiguration_AssociationGroup,
				"Component Parameters :", getWidgetFactory(),
				new ComponentParametersAssociationFieldController());

		ComponentConfigurationsAssociation = new MultipleSemanticField(
				configuration_ComponentConfiguration_AssociationGroup,
				"Component Configurations :", getWidgetFactory(),
				new ComponentConfigurationsAssociationFieldController());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param capellaElement_p
	 * @generated
	 */
	public void loadData(CapellaElement capellaElement_p) {
		super.loadData(capellaElement_p);

		ComponentAssociation.loadData(capellaElement_p,
				ConfigurationPackage.eINSTANCE
						.getComponentConfiguration_Component());

		ComponentParametersAssociation.loadData(capellaElement_p,
				ConfigurationPackage.eINSTANCE
						.getComponentConfiguration_ComponentParameters());

		ComponentConfigurationsAssociation.loadData(capellaElement_p,
				ConfigurationPackage.eINSTANCE
						.getComponentConfiguration_ComponentConfigurations());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(ComponentAssociation);

		abstractSemanticFields.add(ComponentParametersAssociation);

		abstractSemanticFields.add(ComponentConfigurationsAssociation);

		return abstractSemanticFields;
	}
}
