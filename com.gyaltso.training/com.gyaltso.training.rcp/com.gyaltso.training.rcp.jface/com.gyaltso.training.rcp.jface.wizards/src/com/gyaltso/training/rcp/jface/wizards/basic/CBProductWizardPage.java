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
package com.gyaltso.training.rcp.jface.wizards.basic;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Neeraj Bhusare
 *
 */
public class CBProductWizardPage extends WizardPage {

	protected CBProductWizardPage() {
		super("CashBack Product creation page");
		setTitle("CashBack Product");
	}

	@Override
	public void createControl(Composite parent) {
		final Composite child = new Composite(parent, SWT.NONE);
		setControl(child);
	}

}
