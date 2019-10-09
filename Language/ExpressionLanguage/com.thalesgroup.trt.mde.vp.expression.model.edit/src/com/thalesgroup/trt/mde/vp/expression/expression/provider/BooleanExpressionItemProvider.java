package com.thalesgroup.trt.mde.vp.expression.expression.provider;

import com.thalesgroup.trt.mde.vp.expression.expression.BooleanExpression;
import com.thalesgroup.trt.mde.vp.expression.expression.ExpressionPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.BooleanExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanExpressionItemProvider extends ExpressionItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor assigneePropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpressionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void checkChildCreationExtender(Object object) {
		super.checkChildCreationExtender(object);
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			// Process ExpressionPackage.Literals.BOOLEAN_EXPRESSION__ASSIGNEE
			if (assigneePropertyDescriptor != null) {
				Object assigneeValue = eObject.eGet(ExpressionPackage.Literals.BOOLEAN_EXPRESSION__ASSIGNEE, true);
				if (assigneeValue != null && assigneeValue instanceof EObject && ModelExtensionHelper.getInstance((EObject)assigneeValue).isExtensionModelDisabled((EObject) assigneeValue)) {
					itemPropertyDescriptors.remove(assigneePropertyDescriptor);
				} else if (assigneeValue == null && ExtensionModelManager.getAnyType(eObject, ExpressionPackage.Literals.BOOLEAN_EXPRESSION__ASSIGNEE) != null) {
					itemPropertyDescriptors.remove(assigneePropertyDescriptor);				  					
				} else if (itemPropertyDescriptors.contains(assigneePropertyDescriptor) == false) {
					itemPropertyDescriptors.add(assigneePropertyDescriptor);
				}
			}
		}		
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addAssigneePropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Assignee feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssigneePropertyDescriptor(Object object) {
		// begin-extension-code
		assigneePropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BooleanExpression_assignee_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BooleanExpression_assignee_feature", "_UI_BooleanExpression_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ExpressionPackage.Literals.BOOLEAN_EXPRESSION__ASSIGNEE,
				 true,
				 false,
				 true,
				 null,
				 null,
		// begin-extension-code
				 null);
		itemPropertyDescriptors.add(assigneePropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((BooleanExpression)object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ?
			"[" + getString("_UI_BooleanExpression_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}