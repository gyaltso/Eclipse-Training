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
package com.gyaltso.training.rcp.swt.databinding.impl;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Neeraj Bhusare
 *
 */
public class DataConversionExample {

	private static class Product {

		private WritableValue<Integer> productId = new WritableValue<Integer>(100, Integer.class);

		public void setProductId(int productId) {
			this.productId.setValue(productId);
		}

		public int getProductId() {
			return productId.getValue();
		}

		public WritableValue<Integer> getProductIdValue() {
			return productId;
		}

	}

	private Shell createShell() {
		final Product product = new Product();

		final Shell shell = new Shell();
		shell.setLayout(new GridLayout(2, false));

		// Create fields
		new Label(shell, SWT.WRAP).setText("Product Id: ");
		final Text productIdText = new Text(shell, SWT.BORDER);

		/**
		 * A DataBindingContext performs the following operations - Creation and the
		 * management of bindings between observable values and lists, provides access
		 * to the created bindings, provides access to the validation status providers.
		 */
		final DataBindingContext dataBindingContext = new DataBindingContext();
		final IObservableValue<Integer> modelObservableValue = product.getProductIdValue();
		final IObservableValue<String> uiObservablevalue = WidgetProperties.text(SWT.Modify).observe(productIdText);
		
		/**
		 * UpdateValueStrategy from UI to Model
		 */
		final UpdateValueStrategy<String, Integer> targetToModelUVS = new UpdateValueStrategy<String, Integer>();
		targetToModelUVS.setConverter(IConverter.<String, Integer>create(String.class, //
				Integer.class, //
				(o1) -> Integer.valueOf((String) o1)));
		
		/**
		 * UpdateValueStrategy from model to UI
		 */
		final UpdateValueStrategy<Integer, String> modelToTargetUVS = new UpdateValueStrategy<Integer, String>();
		modelToTargetUVS.setConverter(IConverter.<Integer, String>create(Integer.class, //
				String.class, //
				(o1) -> String.valueOf((Integer) o1)));

		dataBindingContext.bindValue(uiObservablevalue, modelObservableValue, targetToModelUVS, modelToTargetUVS);
		
		final Button button = new Button(shell, SWT.PUSH);
		button.setText("Set model value");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Original Value: " + product.getProductId());
				product.setProductId(200);
			}
		});
		
		shell.pack();
		shell.open();
		return shell;
	}

	public static void main(String[] args) {
		final Display display = new Display();

		Realm.runWithDefault(DisplayRealm.getRealm(display), () -> {
			final Shell shell = new DataConversionExample().createShell();

			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		});

		display.dispose();
	}

}
