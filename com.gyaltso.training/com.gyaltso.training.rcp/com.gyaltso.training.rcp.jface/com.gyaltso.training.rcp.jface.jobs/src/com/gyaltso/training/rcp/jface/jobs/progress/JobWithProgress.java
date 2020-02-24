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
public class JobWithProgress extends Job {

	// The total number of work units into which the main task is subdivided
	private int totalUnitsOfWork = 500;

	public JobWithProgress() {
		super("Job with progress...");
	}

	public JobWithProgress(String name) {
		super(name);
	}

	public JobWithProgress(String name, int totalUnitsOfWork) {
		this(name);
		this.totalUnitsOfWork = totalUnitsOfWork;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		monitor.beginTask(getName(), totalUnitsOfWork);

		try {
			for (int i = 0; i < totalUnitsOfWork; i++) {
				if (monitor.isCanceled())
					return Status.CANCEL_STATUS;

				try {
					performSomeOperation(monitor);
				} catch (InterruptedException e) {
					return Status.CANCEL_STATUS;
				}

				// The progress view will calculate and display a percent
				// completion based on the amount of work reported in the worked
				// calls.
				monitor.worked(1);
			}
		} finally {
			monitor.done();
		}

		return Status.OK_STATUS;
	}

	private void performSomeOperation(IProgressMonitor monitor) throws InterruptedException {
		Thread.sleep(10);
	}

}
