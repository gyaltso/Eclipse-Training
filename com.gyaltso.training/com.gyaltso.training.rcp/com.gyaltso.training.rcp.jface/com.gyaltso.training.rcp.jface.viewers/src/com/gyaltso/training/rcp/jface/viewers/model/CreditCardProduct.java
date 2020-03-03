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
package com.gyaltso.training.rcp.jface.viewers.model;

/**
 * @author Neeraj Bhusare
 *
 */
public abstract class CreditCardProduct extends Product {

	private int annualFees = 0;

	private UsageType usageType;

	public UsageType getUsageType() {
		return usageType;
	}

	public void setUsageType(UsageType usageType) {
		this.usageType = usageType;
	}

	public int getAnnualFees() {
		return annualFees;
	}

	public void setAnnualFees(int annualFees) {
		this.annualFees = annualFees;
	}

}
