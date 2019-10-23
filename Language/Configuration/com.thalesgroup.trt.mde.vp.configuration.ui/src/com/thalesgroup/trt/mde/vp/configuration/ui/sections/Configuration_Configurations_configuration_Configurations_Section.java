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

import com.thalesgroup.trt.mde.vp.configuration.ui.controllers.SystemConfigurationsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.configuration.ui.controllers.ComponentConfigurationsAssociationFieldController;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.Configurations;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Configuration_Configurations_configuration_Configurations_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Configuration_Configurations_configuration_Configurations_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField SystemConfigurationsAssociation;

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
	private Group configuration_Configurations_AssociationGroup;

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
		} else if (eObjectToTest instanceof Configurations) {
			return true;
		} else {
			EObject children = getConfigurationsObject(eObjectToTest);
			if (children != null) {
				return true;
			}
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

		if (newEObject != null && !(newEObject instanceof Configurations))
			newEObject = getConfigurationsObject(newEObject);

		if (newEObject != null) {
			loadData(newEObject);
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
	private EObject getConfigurationsObject(EObject parent) {
		if (parent == null)
			return null;

		if (!isViewpointActive(parent))
			return null;

		if (parent.eContents() == null)
			return null;

		EObject result = null;
		for (EObject iEObject : parent.eContents()) {
			if (iEObject instanceof Configurations) {
				result = (result == null ? (Configurations) iEObject : null);
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
	private boolean isViewpointActive(EObject modelElement) {
		return ViewpointManager.getInstance(modelElement).isUsed("com.thalesgroup.trt.mde.vp.configuration")
				&& !ViewpointManager.getInstance(modelElement).isFiltered("com.thalesgroup.trt.mde.vp.configuration");
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

		configuration_Configurations_AssociationGroup = getWidgetFactory().createGroup(rootParentComposite,
				"Configurations Associations");
		configuration_Configurations_AssociationGroup.setLayout(new GridLayout(6, false));

		GridData gdconfiguration_Configurations_AssociationGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdconfiguration_Configurations_AssociationGroup.horizontalSpan = ((GridLayout) rootParentComposite
				.getLayout()).numColumns;
		configuration_Configurations_AssociationGroup.setLayoutData(gdconfiguration_Configurations_AssociationGroup);

		SystemConfigurationsAssociation = new MultipleSemanticField(configuration_Configurations_AssociationGroup,
				"System Configurations :", getWidgetFactory(), new SystemConfigurationsAssociationFieldController());

		ComponentConfigurationsAssociation = new MultipleSemanticField(configuration_Configurations_AssociationGroup,
				"Component Configurations :", getWidgetFactory(),
				new ComponentConfigurationsAssociationFieldController());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		SystemConfigurationsAssociation.loadData(object,
				ConfigurationPackage.eINSTANCE.getConfigurations_SystemConfigurations());

		ComponentConfigurationsAssociation.loadData(object,
				ConfigurationPackage.eINSTANCE.getConfigurations_ComponentConfigurations());

	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(SystemConfigurationsAssociation);

		abstractSemanticFields.add(ComponentConfigurationsAssociation);

		return abstractSemanticFields;
	}
}
