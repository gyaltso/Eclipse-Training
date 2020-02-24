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
public class SystemJob extends Job {

	public SystemJob() {
		super("System Job");

		/*
		 * Initializing the job as a System job. A system job is just like any other
		 * job, except the corresponding UI support will not set up a progress view or
		 * show any other UI associated with running a job. If your job is not either
		 * directly initiated by a user, or a periodic task that can be configured by a
		 * user, then your job should be a system job.
		 */
		setSystem(true);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		int unitsOfWork = 500;

		monitor.beginTask(getName(), unitsOfWork);

		try {
			for (int i = 0; i < unitsOfWork; i++) {
				if (monitor.isCanceled())
					return Status.CANCEL_STATUS;

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					return Status.CANCEL_STATUS;
				}

				monitor.worked(1);
			}
		} finally {
			monitor.done();
		}
		return Status.OK_STATUS;
	}

}
