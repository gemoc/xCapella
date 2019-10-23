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

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.ActionsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.GeneratedEventsAssociationFieldController;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.Transition;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Mode_Transition_mode_Transition_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Mode_Transition_mode_Transition_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private TextValueGroup PriorityField;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField SourceAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField TargetAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField TriggerAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField GuardAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField ActionsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private SimpleSemanticField TimeBudgetAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField GeneratedEventsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		* @generated
		*/
	private Group mode_Transition_AttributeGroup;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		* @generated
		*/
	private Group mode_Transition_AssociationGroup;

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
		} else if (eObjectToTest instanceof Transition) {
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

		mode_Transition_AttributeGroup = getWidgetFactory().createGroup(rootParentComposite, "Transition Attributes");
		mode_Transition_AttributeGroup.setLayout(new GridLayout(1, false));

		GridData gdmode_Transition_AttributeGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdmode_Transition_AttributeGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		mode_Transition_AttributeGroup.setLayoutData(gdmode_Transition_AttributeGroup);

		PriorityField = new TextValueGroup(mode_Transition_AttributeGroup, "Priority :", getWidgetFactory(), true);

		mode_Transition_AssociationGroup = getWidgetFactory().createGroup(rootParentComposite,
				"Transition Associations");
		mode_Transition_AssociationGroup.setLayout(new GridLayout(6, false));

		GridData gdmode_Transition_AssociationGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdmode_Transition_AssociationGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		mode_Transition_AssociationGroup.setLayoutData(gdmode_Transition_AssociationGroup);

		SourceAssociation = new SimpleSemanticField(mode_Transition_AssociationGroup, "Source :", getWidgetFactory(),
				new SimpleSemanticFieldController());

		TargetAssociation = new SimpleSemanticField(mode_Transition_AssociationGroup, "Target :", getWidgetFactory(),
				new SimpleSemanticFieldController());

		TriggerAssociation = new SimpleSemanticField(mode_Transition_AssociationGroup, "Trigger :", getWidgetFactory(),
				new SimpleSemanticFieldController());

		GuardAssociation = new SimpleSemanticField(mode_Transition_AssociationGroup, "Guard :", getWidgetFactory(),
				new SimpleSemanticFieldController());

		ActionsAssociation = new MultipleSemanticField(mode_Transition_AssociationGroup, "Actions :",
				getWidgetFactory(), new ActionsAssociationFieldController());

		TimeBudgetAssociation = new SimpleSemanticField(mode_Transition_AssociationGroup, "Time Budget :",
				getWidgetFactory(), new SimpleSemanticFieldController());

		GeneratedEventsAssociation = new MultipleSemanticField(mode_Transition_AssociationGroup, "Generated Events :",
				getWidgetFactory(), new GeneratedEventsAssociationFieldController());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		PriorityField.loadData(object, ModePackage.eINSTANCE.getTransition_Priority());

		SourceAssociation.loadData(object, ModePackage.eINSTANCE.getTransition_Source());

		TargetAssociation.loadData(object, ModePackage.eINSTANCE.getTransition_Target());

		TriggerAssociation.loadData(object, ModePackage.eINSTANCE.getTransition_Trigger());

		GuardAssociation.loadData(object, ModePackage.eINSTANCE.getTransition_Guard());

		ActionsAssociation.loadData(object, ModePackage.eINSTANCE.getTransition_Actions());

		TimeBudgetAssociation.loadData(object, ModePackage.eINSTANCE.getTransition_TimeBudget());

		GeneratedEventsAssociation.loadData(object, ModePackage.eINSTANCE.getTransition_GeneratedEvents());

	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(PriorityField);

		abstractSemanticFields.add(SourceAssociation);

		abstractSemanticFields.add(TargetAssociation);

		abstractSemanticFields.add(TriggerAssociation);

		abstractSemanticFields.add(GuardAssociation);

		abstractSemanticFields.add(ActionsAssociation);

		abstractSemanticFields.add(TimeBudgetAssociation);

		abstractSemanticFields.add(GeneratedEventsAssociation);

		return abstractSemanticFields;
	}
}
