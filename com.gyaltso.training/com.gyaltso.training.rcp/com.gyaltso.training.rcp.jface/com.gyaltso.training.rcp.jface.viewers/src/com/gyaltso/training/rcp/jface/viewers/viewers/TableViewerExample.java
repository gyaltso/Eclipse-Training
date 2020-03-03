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

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.gyaltso.training.rcp.model.CashBackProduct;
import com.gyaltso.training.rcp.model.factory.ProductCreationFactory;
import com.gyaltso.training.rcp.model.util.CashBackProducts;

/**
 * @author Neeraj Bhusare
 *
 */
public class TableViewerExample extends ViewPart {

	private final static CashBackProducts cashBackProducts = ProductCreationFactory.INSTANCE
			.createNewCashBackProducts();

	public TableViewerExample() {
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void createPartControl(Composite parent) {
		final Composite childComposite = new Composite(parent, SWT.NONE);
		childComposite.setLayout(new FillLayout());

		final TableViewer tableViewer = new TableViewer(childComposite);
		tableViewer.getTable().setLinesVisible(true);
		tableViewer.setContentProvider(new ProductContentProvider());
		tableViewer.setLabelProvider(new ProductLabelProvider());
		tableViewer.setInput(cashBackProducts);
	}

	private static class ProductContentProvider implements IStructuredContentProvider {

		@Override
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof CashBackProducts) {
				return ((CashBackProducts) inputElement).toArray();
			}
			return new Object[] {};
		}
	}

	private static class ProductLabelProvider extends LabelProvider {

		@Override
		public String getText(Object element) {
			if (element instanceof CashBackProduct) {
				return ((CashBackProduct) element).getName();
			}
			return "";
		}
	}
}
