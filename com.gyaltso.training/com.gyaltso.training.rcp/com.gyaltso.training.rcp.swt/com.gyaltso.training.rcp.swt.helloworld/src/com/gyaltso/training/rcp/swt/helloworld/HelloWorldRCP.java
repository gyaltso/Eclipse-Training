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
package com.gyaltso.training.rcp.swt.helloworld;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * @author Neeraj Bhusare
 *
 */
public class HelloWorldRCP {

	private Shell createAndOpenShell(final Display display) {
		final Shell shell = new Shell(display);
		// shell.pack();
		shell.open();
		return shell;
	}

	public static void main(String[] args) {
		/**
		 * The thread in which Display object is created is the UI thread. It enables -
		 * 1) Enables communication between the SWT app. and the underlying OS, 2) Makes
		 * it possible for non-ui threads to access widgets in the UI thread (A.K.A
		 * inter-thread communication), 3) Disposes OS resources allocated by the SWT
		 * app.
		 */
		final Display display = new Display();
		final Shell shell = new HelloWorldRCP().createAndOpenShell(display);

		while (!shell.isDisposed()) { // wait until the shell is closed
			if (!display.readAndDispatch()) { // check the OS event query for events
				display.sleep();
			}
		}

		display.dispose(); // Dispose the OS resources
	}

}
