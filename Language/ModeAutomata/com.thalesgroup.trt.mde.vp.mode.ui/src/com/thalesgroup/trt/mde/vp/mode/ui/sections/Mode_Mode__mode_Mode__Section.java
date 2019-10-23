// Generated on 14.12.2015 at 07:00:33 GMT+01:00 by Viewpoint DSL Generator V 0.1

package com.thalesgroup.trt.mde.vp.mode.ui.sections;

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

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.EnterActionsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.DoActionsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.ExitActionsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.AvailableFunctionalChainsAssociationFieldController;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.Mode_;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Mode_Mode__mode_Mode__Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Mode_Mode__mode_Mode__Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField EnterActionsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField DoActionsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField ExitActionsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField AvailableFunctionalChainsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField SubModeMachineAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		* @generated
		*/
	private Group mode_Mode__AssociationGroup;

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
		} else if (eObjectToTest instanceof Mode_) {
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

		mode_Mode__AssociationGroup = getWidgetFactory().createGroup(rootParentComposite, "Mode_ Associations");
		mode_Mode__AssociationGroup.setLayout(new GridLayout(6, false));

		GridData gdmode_Mode__AssociationGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdmode_Mode__AssociationGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		mode_Mode__AssociationGroup.setLayoutData(gdmode_Mode__AssociationGroup);

		EnterActionsAssociation = new MultipleSemanticField(mode_Mode__AssociationGroup, "Enter Actions :",
				getWidgetFactory(), new EnterActionsAssociationFieldController());

		DoActionsAssociation = new MultipleSemanticField(mode_Mode__AssociationGroup, "Do Actions :",
				getWidgetFactory(), new DoActionsAssociationFieldController());

		ExitActionsAssociation = new MultipleSemanticField(mode_Mode__AssociationGroup, "Exit Actions :",
				getWidgetFactory(), new ExitActionsAssociationFieldController());

		AvailableFunctionalChainsAssociation = new MultipleSemanticField(mode_Mode__AssociationGroup,
				"Available Functional Chains :", getWidgetFactory(),
				new AvailableFunctionalChainsAssociationFieldController());

		SubModeMachineAssociation = new SimpleSemanticField(mode_Mode__AssociationGroup, "Sub Mode Machine :",
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

		EnterActionsAssociation.loadData(object, ModePackage.eINSTANCE.getMode__EnterActions());

		DoActionsAssociation.loadData(object, ModePackage.eINSTANCE.getMode__DoActions());

		ExitActionsAssociation.loadData(object, ModePackage.eINSTANCE.getMode__ExitActions());

		AvailableFunctionalChainsAssociation.loadData(object,
				ModePackage.eINSTANCE.getMode__AvailableFunctionalChains());

		SubModeMachineAssociation.loadData(object, ModePackage.eINSTANCE.getMode__SubModeMachine());

	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(EnterActionsAssociation);

		abstractSemanticFields.add(DoActionsAssociation);

		abstractSemanticFields.add(ExitActionsAssociation);

		abstractSemanticFields.add(AvailableFunctionalChainsAssociation);

		abstractSemanticFields.add(SubModeMachineAssociation);

		return abstractSemanticFields;
	}
}
