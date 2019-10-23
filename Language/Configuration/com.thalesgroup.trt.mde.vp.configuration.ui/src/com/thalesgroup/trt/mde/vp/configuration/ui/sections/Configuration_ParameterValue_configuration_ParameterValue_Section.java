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

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;
import com.thalesgroup.trt.mde.vp.configuration.configuration.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Configuration_ParameterValue_configuration_ParameterValue_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Configuration_ParameterValue_configuration_ParameterValue_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField PortAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField ValueAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		* @generated
		*/
	private Group configuration_ParameterValue_AssociationGroup;

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
		} else if (eObjectToTest instanceof ParameterValue) {
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

		configuration_ParameterValue_AssociationGroup = getWidgetFactory().createGroup(rootParentComposite,
				"Parameter Value Associations");
		configuration_ParameterValue_AssociationGroup.setLayout(new GridLayout(6, false));

		GridData gdconfiguration_ParameterValue_AssociationGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdconfiguration_ParameterValue_AssociationGroup.horizontalSpan = ((GridLayout) rootParentComposite
				.getLayout()).numColumns;
		configuration_ParameterValue_AssociationGroup.setLayoutData(gdconfiguration_ParameterValue_AssociationGroup);

		PortAssociation = new SimpleSemanticField(configuration_ParameterValue_AssociationGroup, "Port :",
				getWidgetFactory(), new SimpleSemanticFieldController());

		ValueAssociation = new SimpleSemanticField(configuration_ParameterValue_AssociationGroup, "Value :",
				getWidgetFactory(), new SimpleSemanticFieldController());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		PortAssociation.loadData(object, ConfigurationPackage.eINSTANCE.getParameterValue_Port());

		ValueAssociation.loadData(object, ConfigurationPackage.eINSTANCE.getParameterValue_Value());

	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(PortAssociation);

		abstractSemanticFields.add(ValueAssociation);

		return abstractSemanticFields;
	}
}
