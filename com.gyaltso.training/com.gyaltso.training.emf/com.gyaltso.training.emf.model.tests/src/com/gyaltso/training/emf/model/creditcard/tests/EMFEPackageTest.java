/**
 * 
 */
package com.gyaltso.training.emf.model.creditcard.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import com.gyaltso.training.emf.model.creditcard.CreditcardPackage;

/**
 * @author Gyaltso Technologies
 */
public class EMFEPackageTest {

	@Test
	public void readMetadataFromAGenericPackage() {
		final EPackage ePackage = CreditcardPackage.eINSTANCE;
		final EClass productEClassifier = (EClass) ePackage.getEClassifier("Product");
		assertEquals(CreditcardPackage.Literals.PRODUCT, productEClassifier);

		final EAttribute productCode = (EAttribute) productEClassifier
				.getEStructuralFeature(CreditcardPackage.PRODUCT__CODE);
		assertEquals(CreditcardPackage.Literals.PRODUCT__CODE, productCode);
	}

	@Test
	public void testReadMetadataFromCreditcardPackage() {
		final CreditcardPackage cCardPackage = CreditcardPackage.eINSTANCE;
		final EClass product = cCardPackage.getProduct();
		assertEquals(CreditcardPackage.Literals.PRODUCT, product);

		final EAttribute productCode = cCardPackage.getProduct_Code();
		assertEquals(CreditcardPackage.Literals.PRODUCT__CODE, productCode);
	}
	
	@Test
	public void locatingEPackageTest() {
		final CreditcardPackage cCardEPackage = CreditcardPackage.eINSTANCE; // Package is registered in the Global registry
		final EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(CreditcardPackage.eNS_URI);
		assertNotNull(ePackage);
		assertEquals(cCardEPackage, ePackage);
	}
}
