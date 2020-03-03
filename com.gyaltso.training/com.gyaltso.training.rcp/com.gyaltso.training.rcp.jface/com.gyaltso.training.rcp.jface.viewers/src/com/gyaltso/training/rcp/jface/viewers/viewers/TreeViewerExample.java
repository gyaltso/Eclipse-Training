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

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.gyaltso.training.rcp.model.CashBackProduct;
import com.gyaltso.training.rcp.model.Product;
import com.gyaltso.training.rcp.model.Region;
import com.gyaltso.training.rcp.model.factory.ProductCreationFactory;
import com.gyaltso.training.rcp.model.util.CashBackProducts;

/**
 * @author Neeraj Bhusare
 *
 */
public class TreeViewerExample extends ViewPart {

	private final static CashBackProducts cashBackProducts = ProductCreationFactory.INSTANCE
			.createNewCashBackProducts();

	public TreeViewerExample() {
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void createPartControl(Composite parent) {
		final Composite childComposite = new Composite(parent, SWT.NONE);
		childComposite.setLayout(new FillLayout());

		final TreeViewer treeViewer = new TreeViewer(childComposite);
		treeViewer.setContentProvider(new ProductContentProvider());
		treeViewer.setLabelProvider(new ProductLabelProvider());
		treeViewer.setInput(cashBackProducts);
	}

	private static class ProductContentProvider implements ITreeContentProvider {

		@Override
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof CashBackProducts) {
				final Set<Region> regions = new HashSet<>();

				final CashBackProducts cashBackProducts = (CashBackProducts) inputElement;
				cashBackProducts.stream().forEach(product -> regions.add(product.getRegion()));

				return regions.toArray();
			}
			return new Object[] {};
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof Region) {
				final Region region = (Region) parentElement;
				final List<Product> filtered = cashBackProducts.stream()
						.filter(product -> product.getRegion().equals(region)).collect(Collectors.toList());
				return filtered.toArray();
			}
			return new Object[] {};
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			return element instanceof Region;
		}

	}

	private static class ProductLabelProvider extends LabelProvider {

		@Override
		public String getText(Object element) {
			if (element instanceof Region) {
				return ((Region) element).getCode();
			} else if (element instanceof CashBackProduct) {
				return ((CashBackProduct) element).getName();
			}
			return "";
		}
	}
}
