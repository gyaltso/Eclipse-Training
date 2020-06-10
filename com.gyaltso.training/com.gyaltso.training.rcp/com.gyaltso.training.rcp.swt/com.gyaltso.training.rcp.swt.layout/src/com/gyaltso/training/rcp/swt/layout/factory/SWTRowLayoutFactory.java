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
package com.gyaltso.training.rcp.swt.layout.factory;

import org.eclipse.jface.layout.RowDataFactory;
import org.eclipse.jface.layout.RowLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Neeraj Bhusare
 *
 */
public class SWTRowLayoutFactory {

	private void createAndOpenShell(Shell shell) {
		RowLayoutFactory.fillDefaults().type(SWT.VERTICAL).applyTo(shell);

		Button button01 = new Button(shell, SWT.BORDER | SWT.PUSH);
		button01.setText("Button 01");

		RowDataFactory.swtDefaults().hint(200, 200).applyTo(button01);

		Button button02 = new Button(shell, SWT.BORDER | SWT.PUSH);
		button02.setText("Button 02");

		RowDataFactory.swtDefaults().hint(100, 400).applyTo(button02);
	}

	public static void main(String[] args) {
		Display display = new Display();

		Shell shell = new Shell(display);
		new SWTRowLayoutFactory().createAndOpenShell(shell);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}
