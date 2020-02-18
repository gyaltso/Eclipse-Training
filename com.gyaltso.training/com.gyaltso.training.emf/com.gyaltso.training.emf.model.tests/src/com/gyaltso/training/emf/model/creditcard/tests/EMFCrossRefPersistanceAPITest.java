package com.gyaltso.training.emf.model.creditcard.tests;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gyaltso.training.emf.model.creditcard.CashBackProduct;
import com.gyaltso.training.emf.model.creditcard.CreditcardFactory;
import com.gyaltso.training.emf.model.creditcard.CreditcardPackage;
import com.gyaltso.training.emf.model.creditcard.Region;
import com.gyaltso.training.emf.model.creditcard.UsageType;

public class EMFCrossRefPersistanceAPITest {

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
	public void testCorssReferencePersistance() throws IOException {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		final Resource cbpResource = resourceSet
				.createResource(URI.createFileURI(new File("cbp.xml").getAbsolutePath()));
		cbpResource.getContents().add(cashBackProduct);

		final Resource regionResource = resourceSet
				.createResource(URI.createFileURI(new File("region.xml").getAbsolutePath()));
		regionResource.getContents().add(region);

		cbpResource.save(Collections.emptyMap());
		regionResource.save(Collections.emptyMap());
	}

	@Test
	public void testEMFProxyResolution() throws IOException {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(CreditcardPackage.eNS_URI, CreditcardPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		final Resource cbpResource = resourceSet.getResource(URI.createFileURI(new File("cbp.xml").getAbsolutePath()),
				true);
		final CashBackProduct cashBackProduct = (CashBackProduct) cbpResource.getContents().get(0);
		assertNotNull(cashBackProduct);
		
		final Region region = cashBackProduct.getRegion();
		assertNotNull(region);
	}

}
