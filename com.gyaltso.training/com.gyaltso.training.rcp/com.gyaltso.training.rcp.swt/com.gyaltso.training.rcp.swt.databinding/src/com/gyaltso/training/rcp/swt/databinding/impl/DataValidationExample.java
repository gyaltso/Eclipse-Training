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

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.typed.PojoProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * @author Neeraj Bhusare
 *
 */
public class DataValidationExample {

	private static class Product {

		private String productId = null;

		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

	}

	private Shell createShell() {
		final Product product = new Product();

		final Shell shell = new Shell();
		shell.setLayout(new GridLayout(2, false));

		// Create fields
		new Label(shell, SWT.WRAP).setText("Product Id: ");
		final Text productIdText = new Text(shell, SWT.BORDER);

		new Label(shell, SWT.WRAP).setText("Error: ");
		final Label errorLabel = new Label(shell, SWT.BORDER);
		errorLabel.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
		GridDataFactory.swtDefaults().hint(800, SWT.DEFAULT).applyTo(errorLabel);

		/**
		 * A DataBindingContext performs the following operations - Creation and the
		 * management of bindings between observable values and lists, provides access
		 * to the created bindings, provides access to the validation status providers.
		 */
		final DataBindingContext dataBindingContext = new DataBindingContext();
		final IObservableValue<Object> modelObservableValue = PojoProperties.value("productId").observe(product);
		final IObservableValue<String> uiObservablevalue = WidgetProperties.text(SWT.Modify).observe(productIdText);

		/**
		 * UpdateValueStrategy from UI to Model
		 */
		final UpdateValueStrategy<String, Integer> targetToModelUVS = new UpdateValueStrategy<String, Integer>();
		targetToModelUVS.setAfterGetValidator(new IValidator<String>() {

			@Override
			public IStatus validate(String value) {
				try {
					Integer.parseInt(value);
					return ValidationStatus.ok();
				} catch (NumberFormatException nfe) {
					return ValidationStatus.error("Invalid input value. Only number values are allowed", nfe);
				}
			}
		});

		dataBindingContext.bindValue(uiObservablevalue, modelObservableValue, targetToModelUVS, null);
		dataBindingContext.bindValue(WidgetProperties.text().observe(errorLabel), new AggregateValidationStatus(
				dataBindingContext.getBindings(), AggregateValidationStatus.MAX_SEVERITY));

		shell.open();
		return shell;
	}

	public static void main(String[] args) {
		final Display display = new Display();

		Realm.runWithDefault(DisplayRealm.getRealm(display), () -> {
			final Shell shell = new DataValidationExample().createShell();

			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		});

		display.dispose();
	}

}
