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

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.gyaltso.training.rcp.jface.viewers.model.CashBackProduct;
import com.gyaltso.training.rcp.jface.viewers.model.CashBackProducts;
import com.gyaltso.training.rcp.jface.viewers.model.ProductCreationFactory;

/**
 * @author Neeraj Bhusare
 *
 */
public class TableViewerWithColumns extends ViewPart {

	private final static CashBackProducts cashBackProducts = ProductCreationFactory.INSTANCE
			.createNewCashBackProducts();

	public TableViewerWithColumns() {
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
		tableViewer.getTable().setHeaderVisible(true);

		final TableViewerColumn productNameColumn = new TableViewerColumn(tableViewer, SWT.None);
		productNameColumn.getColumn().setWidth(300);
		productNameColumn.getColumn().setText("Name");
		productNameColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CashBackProduct)element).getName();
			}
		});

		final TableViewerColumn productDescColumn = new TableViewerColumn(tableViewer, SWT.None);
		productDescColumn.getColumn().setWidth(300);
		productDescColumn.getColumn().setText("Desc.");
		productDescColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((CashBackProduct)element).getDescription();
			}
		});
		
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
