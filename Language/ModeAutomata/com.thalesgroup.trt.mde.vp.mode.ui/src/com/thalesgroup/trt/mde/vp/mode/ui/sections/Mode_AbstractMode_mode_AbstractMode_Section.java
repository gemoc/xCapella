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

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.OutgoingTransitionsAssociationFieldController;

import com.thalesgroup.trt.mde.vp.mode.ui.controllers.IncomingTransitionsAssociationFieldController;

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.AbstractMode;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Mode_AbstractMode_mode_AbstractMode_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Mode_AbstractMode_mode_AbstractMode_Section extends AbstractSection {

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField OutgoingTransitionsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	private MultipleSemanticField IncomingTransitionsAssociation;

	/**
	* <!-- begin-model-doc -->
	* <!-- end-model-doc -->
		* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
		* @generated
		*/
	private Group mode_AbstractMode_AssociationGroup;

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
		} else if (eObjectToTest instanceof AbstractMode) {
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

		mode_AbstractMode_AssociationGroup = getWidgetFactory().createGroup(rootParentComposite,
				"Abstract Mode Associations");
		mode_AbstractMode_AssociationGroup.setLayout(new GridLayout(6, false));

		GridData gdmode_AbstractMode_AssociationGroup = new GridData(GridData.FILL_HORIZONTAL);

		gdmode_AbstractMode_AssociationGroup.horizontalSpan = ((GridLayout) rootParentComposite.getLayout()).numColumns;
		mode_AbstractMode_AssociationGroup.setLayoutData(gdmode_AbstractMode_AssociationGroup);

		OutgoingTransitionsAssociation = new MultipleSemanticField(mode_AbstractMode_AssociationGroup,
				"Outgoing Transitions :", getWidgetFactory(), new OutgoingTransitionsAssociationFieldController());

		IncomingTransitionsAssociation = new MultipleSemanticField(mode_AbstractMode_AssociationGroup,
				"Incoming Transitions :", getWidgetFactory(), new IncomingTransitionsAssociationFieldController());

	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param object
	* @generated
	*/
	public void loadData(EObject object) {
		super.loadData(object);

		OutgoingTransitionsAssociation.loadData(object, ModePackage.eINSTANCE.getAbstractMode_OutgoingTransitions());

		IncomingTransitionsAssociation.loadData(object, ModePackage.eINSTANCE.getAbstractMode_IncomingTransitions());

	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(OutgoingTransitionsAssociation);

		abstractSemanticFields.add(IncomingTransitionsAssociation);

		return abstractSemanticFields;
	}
}
