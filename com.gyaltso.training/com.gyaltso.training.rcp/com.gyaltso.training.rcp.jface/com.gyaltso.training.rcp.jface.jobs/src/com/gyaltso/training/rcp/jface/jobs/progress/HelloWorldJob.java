/*******************************************************************************
 * Copyright (C) 2020 Gyaltso Technologies (https://gyaltso.com)
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.gyaltso.training.rcp.jface.jobs.progress;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

/**
 * @author Neeraj Bhusare
 *
 */
public class HelloWorldJob extends Job {

	public HelloWorldJob() {
		super("Hello World Job");
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		System.out.println("Executing Hello World job...");
		return Status.OK_STATUS;
	}

}
