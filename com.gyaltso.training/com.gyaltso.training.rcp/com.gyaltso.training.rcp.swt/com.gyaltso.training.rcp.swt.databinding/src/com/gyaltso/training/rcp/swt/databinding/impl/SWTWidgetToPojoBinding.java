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
import org.eclipse.core.databinding.beans.typed.PojoProperties;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
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
public class SWTWidgetToPojoBinding {

	private static class Product {

		private String name = null;

		private String description = null;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
			System.out.println("Name: " + this.name);
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
			System.out.println("Description: " + this.description);
		}

	}

	private Shell createShell() {
		final Product product = new Product();

		final Shell shell = new Shell();
		shell.setLayout(new GridLayout(2, false));

		// Create fields
		new Label(shell, SWT.WRAP).setText("Product name: ");
		final Text productNameText = new Text(shell, SWT.BORDER);

		new Label(shell, SWT.WRAP).setText("Product description: ");
		final Text productDescText = new Text(shell, SWT.BORDER);

		/**
		 * A DataBindingContext performs the following operations - Creation and the
		 * management of bindings between observable values and lists, provides access
		 * to the created bindings, provides access to the validation status providers.
		 */
		final DataBindingContext dataBindingContext = new DataBindingContext();

		/**
		 * IObservableValue: A value whose changes can be tracked by value change
		 * listeners
		 * 
		 * PojoProperties: Factory for creating value properties for POJO's
		 */
		final IObservableValue<Object> namePropObservableValue = PojoProperties.value("name").observe(product);
		final IObservableValue<Object> descPropObservableValue = PojoProperties.value("description").observe(product);

		/**
		 * WidgetProperties: Factory for creating value properties for SWT Widgets
		 */
		final IObservableValue<String> nameTextObservablevalue = WidgetProperties.text(SWT.Modify)
				.observe(productNameText);
		final IObservableValue<String> descTextObservable = WidgetProperties.text(SWT.Modify).observe(productDescText);

		/**
		 * DataBindingContext#bindValue(): Creates a binding to synchronize the values
		 * of two observable value objects.
		 */
		dataBindingContext.bindValue(nameTextObservablevalue, namePropObservableValue);
		dataBindingContext.bindValue(descTextObservable, descPropObservableValue);

		shell.pack();
		shell.open();
		return shell;
	}

	public static void main(String[] args) {
		final Display display = new Display();

		Realm.runWithDefault(DisplayRealm.getRealm(display), () -> {
			final Shell shell = new SWTWidgetToPojoBinding().createShell();

			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		});

		display.dispose();
	}

}
