// Generated on 14.12.2015 at 07:00:32 GMT+01:00 by Viewpoint DSL Generator V 0.1

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

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.OwnedModesAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.OwnedTransitionsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.InputEventsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.InputSignalsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.OutputEventsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.OutputSignalsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.LocalClocksAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.LocalVariablesAssociationFieldController;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.ModeMachine;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Mode_ModeMachine_mode_ModeMachine_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Mode_ModeMachine_mode_ModeMachine_Section extends AbstractSection {

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField OwnedModesAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField OwnedTransitionsAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField InputEventsAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField InputSignalsAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField OutputEventsAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField OutputSignalsAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField LocalClocksAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleSemanticField LocalVariablesAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SimpleSemanticField InitialAssociation;

	/**
	 * <!-- begin-model-doc -->
	 * <!-- end-model-doc -->
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Group mode_ModeMachine_AssociationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject: current object
	 * @generated
	 */
	public boolean select(Object eObject) {
		EObject eObjectToTest = super.selection(eObject);

		if (eObjectToTest instanceof ModeMachine)
			return true;

		else {
			EObject children = getModeMachineObject(eObjectToTest);
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

		if (newEObject != null && !(newEObject instanceof ModeMachine))
			newEObject = getModeMachineObject(newEObject);

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
	private EObject getModeMachineObject(EObject parent) {
		if (!isViewpointActive())
			return null;

		if (parent == null || (parent != null && parent.eContents() == null))
			return null;

		EObject result = null;
		for (EObject iEObject : parent.eContents()) {
			if (iEObject instanceof ModeMachine) {
				result = (result == null ? (ModeMachine) iEObject : null);
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
				.isActive("com.thalesgroup.trt.mde.vp.mode");
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

		mode_ModeMachine_AssociationGroup = getWidgetFactory().createGroup(
				_rootParentComposite, "Mode Machine Associations");
		mode_ModeMachine_AssociationGroup.setLayout(new GridLayout(6, false));
		GridData gdmode_ModeMachine_AssociationGroup = new GridData(
				GridData.FILL_HORIZONTAL);
		gdmode_ModeMachine_AssociationGroup.horizontalSpan = ((GridLayout) _rootParentComposite
				.getLayout()).numColumns;
		mode_ModeMachine_AssociationGroup
				.setLayoutData(gdmode_ModeMachine_AssociationGroup);

		OwnedModesAssociation = new MultipleSemanticField(
				mode_ModeMachine_AssociationGroup, "Owned Modes :",
				getWidgetFactory(), new OwnedModesAssociationFieldController());

		OwnedTransitionsAssociation = new MultipleSemanticField(
				mode_ModeMachine_AssociationGroup, "Owned Transitions :",
				getWidgetFactory(),
				new OwnedTransitionsAssociationFieldController());

		InputEventsAssociation = new MultipleSemanticField(
				mode_ModeMachine_AssociationGroup, "Input Events :",
				getWidgetFactory(), new InputEventsAssociationFieldController());

		InputSignalsAssociation = new MultipleSemanticField(
				mode_ModeMachine_AssociationGroup, "Input Signals :",
				getWidgetFactory(),
				new InputSignalsAssociationFieldController());

		OutputEventsAssociation = new MultipleSemanticField(
				mode_ModeMachine_AssociationGroup, "Output Events :",
				getWidgetFactory(),
				new OutputEventsAssociationFieldController());

		OutputSignalsAssociation = new MultipleSemanticField(
				mode_ModeMachine_AssociationGroup, "Output Signals :",
				getWidgetFactory(),
				new OutputSignalsAssociationFieldController());

		LocalClocksAssociation = new MultipleSemanticField(
				mode_ModeMachine_AssociationGroup, "Local Clocks :",
				getWidgetFactory(), new LocalClocksAssociationFieldController());

		LocalVariablesAssociation = new MultipleSemanticField(
				mode_ModeMachine_AssociationGroup, "Local Variables :",
				getWidgetFactory(),
				new LocalVariablesAssociationFieldController());

		InitialAssociation = new SimpleSemanticField(
				mode_ModeMachine_AssociationGroup, "Initial :",
				getWidgetFactory(), new SimpleSemanticFieldController());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param capellaElement_p
	 * @generated
	 */
	public void loadData(CapellaElement capellaElement_p) {
		super.loadData(capellaElement_p);

		OwnedModesAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getModeMachine_OwnedModes());

		OwnedTransitionsAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getModeMachine_OwnedTransitions());

		InputEventsAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getModeMachine_InputEvents());

		InputSignalsAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getModeMachine_InputSignals());

		OutputEventsAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getModeMachine_OutputEvents());

		OutputSignalsAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getModeMachine_OutputSignals());

		LocalClocksAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getModeMachine_LocalClocks());

		LocalVariablesAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getModeMachine_LocalVariables());

		InitialAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getModeMachine_Initial());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(OwnedModesAssociation);

		abstractSemanticFields.add(OwnedTransitionsAssociation);

		abstractSemanticFields.add(InputEventsAssociation);

		abstractSemanticFields.add(InputSignalsAssociation);

		abstractSemanticFields.add(OutputEventsAssociation);

		abstractSemanticFields.add(OutputSignalsAssociation);

		abstractSemanticFields.add(LocalClocksAssociation);

		abstractSemanticFields.add(LocalVariablesAssociation);

		abstractSemanticFields.add(InitialAssociation);

		return abstractSemanticFields;
	}
}
