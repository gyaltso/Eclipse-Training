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
package com.gyaltso.training.rcp.jface.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISaveablesSource;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.Saveable;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.internal.DefaultSaveable;
import org.eclipse.ui.part.EditorPart;

/**
 * The {@code DirtyStateEditor} maintains a {@code DirtyStateEditor#dirty} flag
 * that is set to true if the input text contains the text "Dirty".
 * 
 * @author Neeraj Bhusare
 *
 */
public class DirtyStateEditor extends EditorPart implements ISaveablesSource {

	private boolean dirty = false;

	private Text text;

	@Override
	public void doSave(IProgressMonitor monitor) {
		System.out.println("Input text: " + text.getText());
	}

	@Override
	public void doSaveAs() {
		System.out.println("Input text: " + text.getText());
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(input.getName());
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	public void createPartControl(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout());

		new Label(composite, SWT.NONE).setText("Input: ");
		text = new Text(composite, SWT.BORDER);
		text.addModifyListener((modifyEvent) -> {
			final String inputText = ((Text) modifyEvent.getSource()).getText();
			if (inputText.contains("Dirty")) {
				dirty = true;
				firePropertyChange(IEditorPart.PROP_DIRTY);
			} else {
				dirty = false;
				firePropertyChange(IEditorPart.PROP_DIRTY);
			}
		});
	}

	@Override
	public void setFocus() {
		text.setFocus();
	}

	@Override
	public boolean isDirty() {
		return dirty;
	}

	@Override
	public Saveable[] getActiveSaveables() {
		return new Saveable[] { new DefaultSaveable(this) };
	}

	@Override
	public Saveable[] getSaveables() {
		return new Saveable[] { new DefaultSaveable(this) };
	}

}
