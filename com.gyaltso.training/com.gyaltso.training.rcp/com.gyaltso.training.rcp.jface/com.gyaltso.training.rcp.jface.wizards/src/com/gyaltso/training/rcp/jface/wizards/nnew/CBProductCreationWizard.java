/*******************************************************************************
 * Copyright (C) 2020 Gyaltso Technologies (https://gyaltso.com)
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.gyaltso.training.rcp.jface.wizards.nnew;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class CBProductCreationWizard extends Wizard implements INewWizard {

	private IWorkbench workbench;
	private IStructuredSelection selection;
	private CBProductCreationWizardPage wizardPage = null;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	@Override
	public void addPages() {
		addPage(wizardPage = new CBProductCreationWizardPage());
	}

	@Override
	public boolean performFinish() {
		final IProject selectedProject = getSelectedIProject();
		if (selectedProject != null && selectedProject.isAccessible()) {
			final IFile file = selectedProject.getFile(wizardPage.getProductName() + ".txt");
			if (!file.exists()) {
				try {
					getContainer().run(false, true, (monitor) -> {
						try {
							file.create(new ByteArrayInputStream(getFileContents().getBytes()), true, monitor);
						} catch (CoreException e) {
							e.printStackTrace();
						}
					});
				} catch (InvocationTargetException | InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return true;
	}

	private IProject getSelectedIProject() {
		return (IProject) selection.getFirstElement();
	}

	private String getFileContents() {
		return new StringBuilder() //
				.append("Product Name: ") //
				.append(wizardPage.getProductName()) //
				.append("\n") //
				.append("Product Code: ") //
				.append(wizardPage.getProductCode()) //
				.toString();
	}

}
