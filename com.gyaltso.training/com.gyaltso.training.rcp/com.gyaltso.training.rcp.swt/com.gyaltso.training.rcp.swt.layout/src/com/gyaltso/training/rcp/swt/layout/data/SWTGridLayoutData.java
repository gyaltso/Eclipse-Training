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
package com.gyaltso.training.rcp.swt.layout.data;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Neeraj Bhusare
 *
 */
public class SWTGridLayoutData {

	private Shell createAndOpenShell(Display display) {
		final Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(2, false));

		final Button button01 = new Button(shell, SWT.BORDER | SWT.PUSH);
		button01.setText("Button 01");
		
		final GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.heightHint = 200;
		gridData.verticalIndent = 200;
		
		button01.setLayoutData(gridData);

		final Button button02 = new Button(shell, SWT.BORDER | SWT.PUSH);
		button02.setText("Button 02");

		final Button button03 = new Button(shell, SWT.BORDER | SWT.PUSH);
		button03.setText("Button 03");

		shell.open();
		return shell;
	}

	public static void main(String[] args) {
		final Display display = new Display();
		final Shell shell = new SWTGridLayoutData().createAndOpenShell(display);
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}
