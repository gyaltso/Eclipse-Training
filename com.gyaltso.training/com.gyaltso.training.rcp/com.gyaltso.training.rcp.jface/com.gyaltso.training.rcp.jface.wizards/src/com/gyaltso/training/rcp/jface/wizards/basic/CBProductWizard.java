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

import org.eclipse.jface.wizard.Wizard;

/**
 * @author Neeraj Bhusare
 *
 */
public class CBProductWizard extends Wizard {

	@Override
	public boolean performFinish() {
		return true;
	}
	
	@Override
	public void addPages() {
		addPage(new CBProductWizardPage());
	}
}
