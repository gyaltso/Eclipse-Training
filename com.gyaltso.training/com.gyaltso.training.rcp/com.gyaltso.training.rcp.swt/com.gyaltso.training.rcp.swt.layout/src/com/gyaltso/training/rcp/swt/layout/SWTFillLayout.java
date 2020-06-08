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
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Neeraj Bhusare
 *
 */
public class SWTFillLayout {
	
	private Shell createAndOpenShell(Display display) {
		final Shell shell = new Shell(display);
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		
		final Button button01 = new Button(shell, SWT.BORDER | SWT.PUSH);
		button01.setText("Button 01");

		final Button button02 = new Button(shell, SWT.BORDER | SWT.PUSH);
		button02.setText("Button 02");
		
		shell.open();
		return shell;
	}
	
	public static void main(String[] args) {
		final Display display = new Display();
		final Shell shell = new SWTFillLayout().createAndOpenShell(display);
		while(!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}
