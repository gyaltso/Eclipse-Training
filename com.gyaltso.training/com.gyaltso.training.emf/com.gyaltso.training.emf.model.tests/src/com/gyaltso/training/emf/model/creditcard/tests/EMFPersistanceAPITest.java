package com.gyaltso.training.emf.model.creditcard.tests;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gyaltso.training.emf.model.creditcard.CashBackProduct;
import com.gyaltso.training.emf.model.creditcard.CreditcardFactory;
import com.gyaltso.training.emf.model.creditcard.Region;
import com.gyaltso.training.emf.model.creditcard.UsageType;

public class EMFPersistanceAPITest {

	private CashBackProduct cashBackProduct;
	
	private Region region; 

	@Before
	public void setUp() {
		cashBackProduct = CreditcardFactory.eINSTANCE.createCashBackProduct();
		cashBackProduct.setName("TD CashBack Visa Infinite Card");
		cashBackProduct.setCode("TDCBVIC");
		cashBackProduct.setDescription("TD CashBack Visa Infinite Card");
		cashBackProduct.setAnnualFees(120);
		cashBackProduct.setCashbackPercentage(5);
		cashBackProduct.setUsageType(UsageType.BUSINESS);

		region = CreditcardFactory.eINSTANCE.createRegion();
		region.setCode("REG001");
		region.setProduct(cashBackProduct);
		cashBackProduct.setRegion(region);
	}

	@After
	public void tearDown() {
		cashBackProduct = null;
	}

	@Test
	public void testSaveResource() throws IOException {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		final Resource resource = resourceSet.createResource(URI.createFileURI(new File("cbp.xml").getAbsolutePath()));
		resource.getContents().add(cashBackProduct);
		resource.getContents().add(region);
		resource.save(Collections.emptyMap());
	}

	@Test
	public void testLoadResource() throws IOException {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		final Resource resource = resourceSet.getResource(URI.createFileURI(new File("cbp.xml").getAbsolutePath()),
				true);
		CashBackProduct cashBackProduct = (CashBackProduct) resource.getContents().get(0);
		assertNotNull(cashBackProduct);
	}

}
