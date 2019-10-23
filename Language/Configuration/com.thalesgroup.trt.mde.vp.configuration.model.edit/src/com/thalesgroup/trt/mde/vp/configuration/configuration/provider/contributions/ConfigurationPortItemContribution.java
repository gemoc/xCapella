/**
 * <copyright>
 *
 * Copyright (c) 2002-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

package com.thalesgroup.trt.mde.vp.configuration.configuration.provider.contributions;

import com.thalesgroup.trt.mde.vp.configuration.configuration.ConfigurationPackage;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the item provider adapter for a {@link ConfigurationPortItemContribution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPortItemContribution
		extends org.polarsys.capella.core.data.menu.contributions.fa.ComponentPortItemContribution {
	/**
	 * @generated
	 */
	@Override
	public EClass getMetaclass() {
		return ConfigurationPackage.Literals.CONFIGURATION_PORT;
	}
}
