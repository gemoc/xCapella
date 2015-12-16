package com.thalesgroup.trt.mde.vp.expression.expression.provider;

import com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryExpression;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

/**
 * This is the item provider adapter for a {@link com.thalesgroup.trt.mde.vp.expression.expression.BooleanBinaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BooleanBinaryExpressionItemProvider extends
		BooleanExpressionItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider,
		IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor operand1PropertyDescriptor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor operand2PropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpressionItemProvider(AdapterFactory adapterFactory) {
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
			// Process ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND1
			if (operand1PropertyDescriptor != null) {
				Object operand1Value = eObject.eGet(ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND1, true);
				if (operand1Value != null && operand1Value instanceof EObject && ModelExtensionHelper.getInstance().isExtensionModelDisabled((EObject) operand1Value)) {
					itemPropertyDescriptors.remove(operand1PropertyDescriptor);
				} else if (operand1Value == null && ExtensionModelManager.getAnyType(eObject, ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND1) != null) {
					itemPropertyDescriptors.remove(operand1PropertyDescriptor);				  					
				} else if (itemPropertyDescriptors.contains(operand1PropertyDescriptor) == false) {
					itemPropertyDescriptors.add(operand1PropertyDescriptor);
				}
			}
			// Process ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND2
			if (operand2PropertyDescriptor != null) {
				Object operand2Value = eObject.eGet(ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND2, true);
				if (operand2Value != null && operand2Value instanceof EObject && ModelExtensionHelper.getInstance().isExtensionModelDisabled((EObject) operand2Value)) {
					itemPropertyDescriptors.remove(operand2PropertyDescriptor);
				} else if (operand2Value == null && ExtensionModelManager.getAnyType(eObject, ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND2) != null) {
					itemPropertyDescriptors.remove(operand2PropertyDescriptor);				  					
				} else if (itemPropertyDescriptors.contains(operand2PropertyDescriptor) == false) {
					itemPropertyDescriptors.add(operand2PropertyDescriptor);
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

			addOperand1PropertyDescriptor(object);
			addOperand2PropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operand1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperand1PropertyDescriptor(Object object) {
		// begin-extension-code
		operand1PropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BooleanBinaryExpression_operand1_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BooleanBinaryExpression_operand1_feature", "_UI_BooleanBinaryExpression_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND1,
				 true,
				 false,
				 true,
				 null,
				 null,
		// begin-extension-code
				 null);
		itemPropertyDescriptors.add(operand1PropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Operand2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperand2PropertyDescriptor(Object object) {
		// begin-extension-code
		operand2PropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BooleanBinaryExpression_operand2_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BooleanBinaryExpression_operand2_feature", "_UI_BooleanBinaryExpression_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERAND2,
				 true,
				 false,
				 true,
				 null,
				 null,
		// begin-extension-code
				 null);
		itemPropertyDescriptors.add(operand2PropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
		// end-extension-code
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BooleanBinaryExpression_operator_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_BooleanBinaryExpression_operator_feature", "_UI_BooleanBinaryExpression_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 ExpressionPackage.Literals.BOOLEAN_BINARY_EXPRESSION__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
		// begin-extension-code
				 null));
		// end-extension-code
	}

	/**
	 * This returns BooleanBinaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BooleanBinaryExpression")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((BooleanBinaryExpression)object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ?
			"[" + getString("_UI_BooleanBinaryExpression_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

		switch (notification.getFeatureID(BooleanBinaryExpression.class))
		{
			case ExpressionPackage.BOOLEAN_BINARY_EXPRESSION__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
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