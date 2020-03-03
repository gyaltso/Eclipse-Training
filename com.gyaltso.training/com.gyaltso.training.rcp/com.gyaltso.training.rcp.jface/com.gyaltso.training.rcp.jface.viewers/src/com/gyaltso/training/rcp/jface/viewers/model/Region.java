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

import java.util.Objects;

/**
 * @author Neeraj Bhusare
 *
 */
public class Region {

	private final String code;

	public Region(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj instanceof Region) {
			return this.code.equals(((Region) obj).getCode());
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return code.hashCode();
	}
}
