/*******************************************************************************
 * Copyright (C) 2020 Gyaltso Technologies (https://gyaltso.com)
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.gyaltso.training.rcp.jface.jobs.view;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

import com.gyaltso.training.rcp.jface.jobs.progress.HelloWorldJob;
import com.gyaltso.training.rcp.jface.jobs.progress.JobWithProgress;
import com.gyaltso.training.rcp.jface.jobs.progress.JobWithRescheduling;
import com.gyaltso.training.rcp.jface.jobs.progress.JobWithSubtask;
import com.gyaltso.training.rcp.jface.jobs.progress.SystemJob;
import com.gyaltso.training.rcp.jface.jobs.progress.UserJob;

/**
 * @author Neeraj Bhusare
 *
 */
public class JobSchedulerView extends ViewPart {

	public JobSchedulerView() {
	}

	private void createHelloWorldJob(final Composite parent) {
		new Label(parent, SWT.NONE).setText("Hello World Job: ");

		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final Job job = new HelloWorldJob();
				job.schedule();
			};
		});
	}

	private void createJobWithProgressFeedback(final Composite parent) {
		new Label(parent, SWT.NONE).setText("Job with progress feedback: ");
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final Job job = new JobWithProgress();
				job.schedule();
			};
		});
	}
	
	private void createJobWithSubtasks(final Composite parent) {
		new Label(parent, SWT.NONE).setText("Job with sub-tasks: ");
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final Job job = new JobWithSubtask();
				job.schedule();
			};
		});
	}
	
	private void createJobWithProgressGroup(final Composite parent) {
		new Label(parent, SWT.NONE).setText("Job with Progress Group: ");
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final IJobManager jobManager = Job.getJobManager();
				final IProgressMonitor progressGroupMonitor = jobManager.createProgressGroup();
				
				progressGroupMonitor.beginTask("Job with Progress Group...", 1500);
				
				final Job job01 = new JobWithProgress("Performing Job 01");
				job01.setProgressGroup(progressGroupMonitor, 500);

				final Job job02 = new JobWithProgress("Performing Job 02");
				job02.setProgressGroup(progressGroupMonitor, 500);
				
				final Job job03 = new JobWithProgress("Performing Job 03");
				job03.setProgressGroup(progressGroupMonitor, 500);
				
				job01.schedule();
				job02.schedule();
				job03.schedule();
			};
		});
	}
	
	private void createSystemJob(final Composite parent) {
		new Label(parent, SWT.NONE).setText("System Job");
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final Job job = new SystemJob();
				job.schedule();
			};
		});
	}
	
	private void createUserJob(final Composite parent) {
		new Label(parent, SWT.NONE).setText("User Job");
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final Job job = new UserJob();
				job.schedule();
			};
		});
	}
	
	private void createJobWithRescheduling(final Composite parent) {
		new Label(parent, SWT.NONE).setText("Job with rescheduling: ");
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final Job job = new JobWithRescheduling();
				job.schedule();
			};
		});
	}
	
	private void createJobWithSchedulingPriorities(final Composite parent) {
		new Label(parent, SWT.NONE).setText("Job with scheduling priorities: ");
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final Job interactiveJob = new JobWithProgress("Highest Priority Interactive job", 1000);
				final Job decorateJob = new JobWithProgress("Lowest piority Decorate job", 2000);
				final Job shortJob = new JobWithProgress("Short jobs having priority after the Interactive jobs", 200);
				final Job longRunningJob = new JobWithProgress("Long running background jobs", 4000);
				final Job buildJob = new JobWithProgress("Long running build jobs", 2500);
				
				interactiveJob.setPriority(Job.INTERACTIVE);
				decorateJob.setPriority(Job.DECORATE);
				shortJob.setPriority(Job.SHORT);
				longRunningJob.setPriority(Job.LONG);
				buildJob.setPriority(Job.BUILD);
				
				interactiveJob.schedule();
				decorateJob.schedule();
				shortJob.schedule();
				longRunningJob.schedule();
				buildJob.schedule();
			};
		});
	}
	
	private void createJobWithSchedulingDelay(final Composite parent) {
		new Label(parent, SWT.NONE).setText("Job with scheduling delay: ");
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final Job job01 = new JobWithProgress("Job 01");
				final Job job02 = new JobWithProgress("Job 02");
				final Job job03 = new JobWithProgress("Job 03");
				
				job01.schedule();
				job02.schedule(1000);
				job03.schedule(2000);
			};
		});
	}
	
	private void createJobWithJoinAPI(final Composite parent) {
		new Label(parent, SWT.NONE).setText("Job with Join: ");
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Schedule");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final Job job01 = new JobWithProgress("Job 01", 2500);
				job01.schedule();
				
				try {
					job01.join();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
				System.out.println("Code is executed after the Job 01 completes its execution");
			};
		});
	}
	
	@Override
	public void createPartControl(Composite parent) {
		final Composite child = new Composite(parent, SWT.NONE);
		child.setLayout(new GridLayout(2, true));

		// Hello World Job
		createHelloWorldJob(child);
		
		// Job with progress feedback
		createJobWithProgressFeedback(child);

		// Job with sub tasks
		createJobWithSubtasks(child);
		
		// Job with progress groups
		createJobWithProgressGroup(child);

		// Job with progress groups
		createSystemJob(child);

		// Job with progress groups
		createUserJob(child);

		// Job with rescheduling
		createJobWithRescheduling(child);
		
		// Job with scheduling priorities
		createJobWithSchedulingPriorities(child);
		
		// Job with scheduling delay
		createJobWithSchedulingDelay(child);
		
		// Job that makes use of the #join() API
		createJobWithJoinAPI(child);
	}

	@Override
	public void setFocus() {

	}

}
