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

import org.polarsys.capella.core.data.capellacore.CapellaElement;
import com.thalesgroup.trt.mde.vp.mode.mode.ModePackage;
import com.thalesgroup.trt.mde.vp.mode.mode.Final;

/**
 * <!-- begin-user-doc -->
 * This class is an implementation of the section '<em><b>[Mode_Final_mode_Final_Section]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class Mode_Final_mode_Final_Section extends AbstractSection {

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
	private Group mode_Final_AssociationGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eObject: current object
	 * @generated
	 */
	public boolean select(Object eObject) {
		EObject eObjectToTest = super.selection(eObject);

		if (eObjectToTest instanceof Final)
			return true;

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
			loadData((CapellaElement) newEObject);
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
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		mode_Final_AssociationGroup = getWidgetFactory().createGroup(
				_rootParentComposite, "Final Associations");
		mode_Final_AssociationGroup.setLayout(new GridLayout(6, false));
		GridData gdmode_Final_AssociationGroup = new GridData(
				GridData.FILL_HORIZONTAL);
		gdmode_Final_AssociationGroup.horizontalSpan = ((GridLayout) _rootParentComposite
				.getLayout()).numColumns;
		mode_Final_AssociationGroup
				.setLayoutData(gdmode_Final_AssociationGroup);

		EnterActionsAssociation = new MultipleSemanticField(
				mode_Final_AssociationGroup, "Enter Actions :",
				getWidgetFactory(),
				new EnterActionsAssociationFieldController());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param capellaElement_p
	 * @generated
	 */
	public void loadData(CapellaElement capellaElement_p) {
		super.loadData(capellaElement_p);

		EnterActionsAssociation.loadData(capellaElement_p,
				ModePackage.eINSTANCE.getFinal_EnterActions());

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<AbstractSemanticField> getSemanticFields() {
		List<AbstractSemanticField> abstractSemanticFields = new ArrayList<AbstractSemanticField>();

		abstractSemanticFields.add(EnterActionsAssociation);

		return abstractSemanticFields;
	}
}
