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
package com.gyaltso.training.rcp.model.util;

import java.util.ArrayList;
import java.util.List;

import com.gyaltso.training.rcp.model.Product;

/**
 * @author Neeraj Bhusare
 *
 */
public class CashBackProducts extends ArrayList<Product> {
	
	public CashBackProducts(List<Product> products) {
		products.stream().forEach(product -> add(product));
	}
	
}
