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
package com.gyaltso.training.rcp.swt.layout;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Neeraj Bhusare
 *
 */
public class SWTStackLayout {

	private Composite getProductAInfoPage(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.VERTICAL));

		new Label(composite, SWT.WRAP).setText("Product A Information page");

		return composite;
	}

	private Composite getProductBInfoPage(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.VERTICAL));

		new Label(composite, SWT.WRAP).setText("Product B Information page");

		return composite;
	}

	private Shell createAndOpenShell(Display display) {
		Shell rootShell = new Shell(display);
		rootShell.setLayout(new FillLayout());

		// Left composite
		Composite leftComposite = new Composite(rootShell, SWT.NONE);
		leftComposite.setLayout(new FillLayout(SWT.VERTICAL));

		Button buttonProductA = new Button(leftComposite, SWT.BORDER | SWT.PUSH);
		buttonProductA.setText("Product A");

		Button buttonProductB = new Button(leftComposite, SWT.BORDER | SWT.PUSH);
		buttonProductB.setText("Product B");

		// Right composite
		Composite rightComposite = new Composite(rootShell, SWT.NONE);
		StackLayout stackLayout = new StackLayout();
		rightComposite.setLayout(stackLayout);

		buttonProductA.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				stackLayout.topControl = getProductAInfoPage(rightComposite);
				rightComposite.layout();
			}
		});

		buttonProductB.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				stackLayout.topControl = getProductBInfoPage(rightComposite);
				rightComposite.layout();
			}
		});

		rootShell.open();
		return rootShell;
	}

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new SWTStackLayout().createAndOpenShell(display);
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
