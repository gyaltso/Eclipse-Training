/*******************************************************************************
 * Copyright (C) 2020 Gyaltso Technologies (https://gyaltso.com)
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package com.gyaltso.training.emf.model.creditcard.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

/**
 * This test demonstrates the Registration of a ResourceFactory in the Global
 * and Local Resource Factory Registry.
 * 
 * 
 * Resource#Factory#Registry#INSTANCE represents the Global Resource Factory
 * registry {@code ResourceSet#getResourceFactoryRegistry()} represents the
 * Local Resource Factory registry
 * 
 * @see Resource.Factory.Registry.INSTANCE
 * @see ResourceSet#getResourceFactoryRegistry()
 * 
 * @author Neeraj Bhusare
 */
public class EMFResourceFacoryTest {

	/**
	 * In this test, we register an instance of the default EMF resource factory
	 * {@code XMIResourceFactoryImpl} in the local resource factory registry
	 * {@code ResourceSet#getResourceFactoryRegistry()}.
	 */
	@Test
	public void testResourceFactoryRegistrationInLocalResourceFactory() {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		final Resource resource = resourceSet.createResource(URI.createURI("test.xml"));
		assertNotNull(resource);

		// This is required for the last test to pass
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().clear();
	}

	/**
	 * In this test, we register an instance of the default EMF resource factory
	 * {@code XMIResourceFactoryImpl} in the global resource factory registry
	 * {@code Resource.Factory.Registry.INSTANCE}.
	 */
	@Test
	public void testResourceFactoryRegistrationInGlobalResourceFactory() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());

		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource = resourceSet.createResource(URI.createURI("test.xml"));
		assertNotNull(resource);

		// This is required for the last test to pass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().clear();
	}

	/**
	 * In this test, we do not register any Resource factory. By virtue of which, a
	 * {@code null} value is returned when you call
	 * {@code ResourceSet#createResource(URI)}.
	 */
	@Test
	public void testNoResourceFactoryRegistration() {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource = resourceSet.createResource(URI.createURI("test.xml"));
		assertNull(resource);
	}

}
