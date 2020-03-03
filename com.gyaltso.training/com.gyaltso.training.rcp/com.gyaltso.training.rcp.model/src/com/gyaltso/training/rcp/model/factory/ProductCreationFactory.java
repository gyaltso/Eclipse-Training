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
package com.gyaltso.training.rcp.model.factory;

import com.google.common.collect.Lists;
import com.gyaltso.training.rcp.model.CashBackProduct;
import com.gyaltso.training.rcp.model.Region;
import com.gyaltso.training.rcp.model.UsageType;
import com.gyaltso.training.rcp.model.util.CashBackProducts;

/**
 * @author Neeraj Bhusare
 *
 */
public class ProductCreationFactory {
	
	public static final ProductCreationFactory INSTANCE = new ProductCreationFactory();
	
	private ProductCreationFactory() {
	}
	
	public CashBackProducts createNewCashBackProducts() {
		final CashBackProduct personalCard = new CashBackProduct();
		personalCard.setCashBackPercentage(1);
		personalCard.setAnnualFees(3);
		personalCard.setUsageType(UsageType.PERSONAL);
		personalCard.setName("TD Cash Back Card");
		personalCard.setCode("TDCBC");
		personalCard.setDescription("TD Cash Back Card");
		personalCard.setRegion(new Region("REG1"));

		final CashBackProduct businessCard = new CashBackProduct();
		businessCard.setCashBackPercentage(8);
		businessCard.setAnnualFees(120);
		businessCard.setUsageType(UsageType.BUSINESS);
		businessCard.setName("TD Infinite Cash Back Card");
		businessCard.setCode("TDICBC");
		businessCard.setDescription("TD Infinite Cash Back Card");
		businessCard.setRegion(new Region("REG1"));

		final CashBackProduct studentCard = new CashBackProduct();
		studentCard.setCashBackPercentage(1);
		studentCard.setAnnualFees(0);
		studentCard.setUsageType(UsageType.STUDENT);
		studentCard.setName("TD Student Cash Back Card");
		studentCard.setCode("TDSCBC");
		studentCard.setDescription("TD Student Cash Back Card");
		studentCard.setRegion(new Region("REG2"));

		return new CashBackProducts(Lists.newArrayList(studentCard, personalCard, businessCard));
	}
}
