/*******************************************************************************
 * Copyright (C) 2020 Gyaltso Technologies (https://gyaltso.com)
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package com.gyaltso.training.emf.model.creditcard.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import com.gyaltso.training.emf.model.creditcard.CreditcardPackage;

/**
 * This test demonstrates the Registration of an EPackage in the Global and
 * Local EMF Registry.
 * 
 * The EPackage#Registry#INSTANCE represents the Global EMF Registry The
 * {@code ResourceSet#getPackageRegistry()} represents the local EMF Registry
 * 
 * @see EPackage.Registry.INSTANCE
 * @see ResourceSet#getPackageRegistry()
 * 
 * @author Neeraj Bhusare
 */
public class EMFPackageRegistryTest {

	/**
	 * In the first line of this test, the {@code CreditcardPackage.eINSTANCE}
	 * programmatically builds the Creditcard model, and registers the
	 * {@code CreditcardPackage} in the Global EMF registry
	 * {@code EPackage.Registry.INSTANCE}.
	 * 
	 * In the second line, we read the {@code CreditcardPackage} using the NsUrl
	 * {@code CreditcardPackage.eNS_URI} from the Global registry.
	 */
	@Test
	public void testRegistrationInGlobalEPackageRegistry() {
		final CreditcardPackage einstance = CreditcardPackage.eINSTANCE;
		final EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(CreditcardPackage.eNS_URI);
		assertNotNull(ePackage);
		assertEquals(CreditcardPackage.eNS_URI, ePackage.getNsURI());
	}

	/**
	 * In this test, we register the {@code EPackage} in the local Package registry
	 * {@code resourceSet.getPackageRegistry()}.The second parameter
	 * {@code CreditcardPackage.eINSTANCE} returns an instance of the
	 * CreditCardPackage. As as side effect of calling
	 * {@code CreditcardPackage.eINSTANCE},the package is registered in the EMF
	 * Global registry.
	 * 
	 * When the resource is loaded in the memory
	 * {@code ResourceSet#getResource(URI, boolean)}, the registered EPackage is
	 * used for creating instances of the Credit Card models.
	 */
	@Test
	public void testRegistrationInLocalEPackageRegistry() {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(CreditcardPackage.eNS_URI, CreditcardPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());

		final Resource resource = resourceSet.getResource( //
				URI.createFileURI(new File("cbp.xml").getAbsolutePath()), //
				true);
		final EObject eObject = resource.getContents().get(0);
		assertNotNull(eObject);
	}

}
