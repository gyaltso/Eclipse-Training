/**
 * 
 */
package com.gyaltso.training.emf.model.creditcard.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gyaltso.training.emf.model.creditcard.CashBackProduct;
import com.gyaltso.training.emf.model.creditcard.CreditcardFactory;
import com.gyaltso.training.emf.model.creditcard.util.CreditcardAdapterFactory;

/**
 * @author Gyaltso Technologies
 *
 */
public class EMFNotificationObserverTest {

	private CashBackProduct cashBackProduct;

	private CreditcardAdapterFactory creditcardAdapterFactory;
	
	@Before
	public void setUp() {
		cashBackProduct = CreditcardFactory.eINSTANCE.createCashBackProduct();
		creditcardAdapterFactory = new CreditcardAdapterFactory();
	}
	
	@After
	public void tearDown() {
		cashBackProduct = null;
		creditcardAdapterFactory = null;
	}

	@Test
	public void testEMFNotification() {
		assertTrue(creditcardAdapterFactory.isFactoryForType(cashBackProduct));
		cashBackProduct.eAdapters().add(creditcardAdapterFactory.createAdapter(cashBackProduct));
		cashBackProduct.setCode("CBP001");
		cashBackProduct.setName("CBP001 Product");
	}

}
