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
public class UserJob extends Job {

	public UserJob() {
		super("User Job");

		/*
		 * Initializing the job as a User job. A user job will appear in a modal
		 * progress dialog that provides a button for moving the dialog into the
		 * background. The workbench defines a user preference that controls whether
		 * these dialogs are ever modal. By defining your job as a user job, your
		 * progress feedback will automatically conform with the user preference for
		 * progress viewing.
		 */
		setUser(true);
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
