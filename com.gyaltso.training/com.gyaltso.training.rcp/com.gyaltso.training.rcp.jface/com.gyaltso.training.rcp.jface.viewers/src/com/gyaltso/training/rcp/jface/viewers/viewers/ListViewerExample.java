/*******************************************************************************
 * Copyright (C) 2020 Gyaltso Technologies (https://gyaltso.com)
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

/**
 * 
 */
package com.gyaltso.training.rcp.jface.viewers.viewers;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.gyaltso.training.rcp.jface.viewers.Activator;
import com.gyaltso.training.rcp.jface.viewers.model.CashBackProduct;
import com.gyaltso.training.rcp.jface.viewers.model.CashBackProducts;
import com.gyaltso.training.rcp.jface.viewers.model.ProductCreationFactory;

/**
 * @author Neeraj Bhusare
 *
 */
public class ListViewerExample extends ViewPart {

	public ListViewerExample() {
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void createPartControl(Composite parent) {
		final Composite childComposite = new Composite(parent, SWT.NONE);
		childComposite.setLayout(new FillLayout());

		final ListViewer listViewer = new ListViewer(childComposite);
		listViewer.setContentProvider(new ProductContentProvider());
		listViewer.setLabelProvider(new ProductLabelProvider());
		listViewer.setInput(ProductCreationFactory.INSTANCE.createNewCashBackProducts());
	}

	private static class ProductContentProvider implements IStructuredContentProvider {

		@Override
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof CashBackProducts) {
				final CashBackProducts cashBackProducts = (CashBackProducts) inputElement;
				return cashBackProducts.toArray();
			}
			return new Object[] {};
		}

	}

	private static class ProductLabelProvider extends LabelProvider {

		@Override
		public String getText(Object element) {
			return element instanceof CashBackProduct ? ((CashBackProduct) element).getName() : "";
		}
		
		@Override
		public Image getImage(Object element) {
			return ImageDescriptor.createFromFile(Activator.class,
					"icons/item.png").createImage();
		}
	}
}
