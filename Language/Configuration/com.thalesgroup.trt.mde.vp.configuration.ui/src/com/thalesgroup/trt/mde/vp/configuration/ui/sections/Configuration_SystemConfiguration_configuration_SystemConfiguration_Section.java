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

import com.thalesgroup.trt.mde.vp.configuration.ui.controllers.SupportedModesAssociationFieldController;

import com.thalesgroup.trt.mde.vp.configuration.ui.controllers.ComponentSystemConfigurationsAssociationFieldController;
import com.thalesgroup.trt.mde.vp.configuration.ui.controllers.ComponentConfigurationsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.configuration.ui.controllers.AvailableFunctionsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.configuration.ui.controllers.AvailableComponentsAssociationFieldController;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.SystemConfiguration;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Configuration_SystemConfiguration_configuration_SystemConfiguration_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Configuration_SystemConfiguration_configuration_SystemConfiguration_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField DeploymentAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField SupportedModesAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField ComponentSystemConfigurationsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField AvailableFunctionsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField AvailableComponentsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		* @generated
		*/
	private Group configuration_SystemConfiguration_AssociationGroup;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @param eObject: current object
	* @generated
	*/
	public boolean select(Object eObject) {
		EObject eObjectToTest = super.selection(eObject);

		if (eObjectToTest == null) {
			return false;
		} else if (eObjectToTest instanceof SystemConfiguration) {
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
		if (newEObject != null) {
			loadData(newEObject);
		} else {
			return;
		}
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @param parent:
	* @param aTabbedPropertySheetPage:
	* @generated
	*/
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		configuration_SystemConfiguration_AssociationGroup = getWidgetFactory().createGroup(rootParentComposite,
				"System Configuration Associations");
		configuration_SystemConfiguration_AssociationGroup.setLayout(new GridLayout(6, false));

		GridData gdconfiguration_SystemConfiguration_AssociationGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdconfiguration_SystemConfiguration_AssociationGroup.horizontalSpan = ((GridLayout) rootParentComposite
				.getLayout()).numColumns;
		configuration_SystemConfiguration_AssociationGroup
				.setLayoutData(gdconfiguration_SystemConfiguration_AssociationGroup);

		DeploymentAssociation = new SimpleSemanticField(configuration_SystemConfiguration_AssociationGroup,
				"Deployment :", getWidgetFactory(), new SimpleSemanticFieldController());

		SupportedModesAssociation = new MultipleSemanticField(configuration_SystemConfiguration_AssociationGroup,
				"Supported Modes :", getWidgetFactory(), new SupportedModesAssociationFieldController());

		ComponentSystemConfigurationsAssociation = new MultipleSemanticField(
				configuration_SystemConfiguration_AssociationGroup, "System-Component Configurations :",
				getWidgetFactory(), new ComponentSystemConfigurationsAssociationFieldController());

		AvailableFunctionsAssociation = new MultipleSemanticField(configuration_SystemConfiguration_AssociationGroup,
				"Available Functions :", getWidgetFactory(), new AvailableFunctionsAssociationFieldController());

		AvailableComponentsAssociation = new MultipleSemanticField(configuration_SystemConfiguration_AssociationGroup,
				"Available Components :", getWidgetFactory(), new AvailableComponentsAssociationFieldController());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		DeploymentAssociation.loadData(object, ConfigurationPackage.eINSTANCE.getSystemConfiguration_Deployment());

		SupportedModesAssociation.loadData(object,
				ConfigurationPackage.eINSTANCE.getSystemConfiguration_SupportedModes());

		ComponentSystemConfigurationsAssociation.loadData(object,
				ConfigurationPackage.eINSTANCE.getSystemConfiguration_ComponentConfigurations());

		AvailableFunctionsAssociation.loadData(object,
				ConfigurationPackage.eINSTANCE.getSystemConfiguration_AvailableFunctions());

		AvailableComponentsAssociation.loadData(object,
				ConfigurationPackage.eINSTANCE.getSystemConfiguration_AvailableComponents());

	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(DeploymentAssociation);

		abstractSemanticFields.add(SupportedModesAssociation);

		abstractSemanticFields.add(ComponentSystemConfigurationsAssociation);

		abstractSemanticFields.add(AvailableFunctionsAssociation);

		abstractSemanticFields.add(AvailableComponentsAssociation);

		return abstractSemanticFields;
	}
}
