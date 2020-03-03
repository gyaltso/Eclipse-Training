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
package com.gyaltso.training.rcp.jface.wizards.nnew;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author Neeraj Bhusare
 *
 */
public class CBProductCreationWizardPage extends WizardPage {

	private Text productName;

	private Text productCode;

	private Text productDesc;

	public CBProductCreationWizardPage() {
		super("CashBack Product info. page");
		setTitle("New CashBack Product ");
	}

	@Override
	public void createControl(Composite parent) {
		final Composite child = new Composite(parent, SWT.NONE);
		child.setLayout(new GridLayout(2, false));

		new Label(child, SWT.WRAP).setText("Product Name: ");
		productName = new Text(child, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).grab(true, false).applyTo(productName);

		new Label(child, SWT.WRAP).setText("Product Code: ");
		productCode = new Text(child, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).grab(true, false).applyTo(productCode);

		new Label(child, SWT.WRAP).setText("Product Desc.: ");
		productDesc = new Text(child, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).grab(true, false).applyTo(productDesc);

		setControl(child);
	}

	public String getProductName() {
		return productName.getText();
	}

	public String getProductCode() {
		return productCode.getText();
	}

	public String getProductDesc() {
		return productDesc.getText();
	}
}
