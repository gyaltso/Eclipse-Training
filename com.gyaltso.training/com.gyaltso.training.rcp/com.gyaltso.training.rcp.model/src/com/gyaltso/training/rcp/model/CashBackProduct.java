/*******************************************************************************
 * Copyright (C) 2020 Gyaltso Technologies (https://gyaltso.com)
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.gyaltso.training.rcp.model;

public class CashBackProduct extends CreditCardProduct {

	private int cashBackPercentage;

	public int getCashBackPercentage() {
		return cashBackPercentage;
	}

	public void setCashBackPercentage(int cashBackPercentage) {
		this.cashBackPercentage = cashBackPercentage;
	}

}
