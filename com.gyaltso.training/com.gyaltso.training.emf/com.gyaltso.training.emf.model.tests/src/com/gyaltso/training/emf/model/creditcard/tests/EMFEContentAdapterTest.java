/**
 * 
 */
package com.gyaltso.training.emf.model.creditcard.tests;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Strings;
import com.google.common.collect.Iterables;
import com.gyaltso.training.emf.model.creditcard.CashBackProduct;
import com.gyaltso.training.emf.model.creditcard.CreditcardFactory;
import com.gyaltso.training.emf.model.creditcard.Feature;
import com.gyaltso.training.emf.model.creditcard.Region;
import com.gyaltso.training.emf.model.creditcard.UsageType;

/**
 * @author Neeraj Bhusare
 *
 */
public class EMFEContentAdapterTest {

	private static class TestEContentAdapter extends EContentAdapter {
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			final Feature feature = (Feature) notification.getNotifier();
			System.out
					.println("EClass - " + feature.eClass().getEPackage().getName() + "." + feature.eClass().getName());
			System.out.println("Structural Feature - " + ((EAttribute) notification.getFeature()).getName());
			System.out.println("Old value - " + notification.getOldStringValue());
			System.out.println("New value - " + notification.getNewStringValue());
		}
	}

	public class RegionChangeAdapter extends EContentAdapter {

		@Override
		public void notifyChanged(Notification notification) {
			final String eClassName = ((Region)notification.getNotifier()).eClass().getName();
			final String featureName = ((EAttribute) notification.getFeature()).getName();
			System.out.println(String.format("Feature `%1$s` of EClass `%2$s` changed", featureName, eClassName));
		}
	}

	private CashBackProduct cashBackProduct;

	private final CreditcardFactory FACTORY = CreditcardFactory.eINSTANCE;

	@Before
	public void setUp() {
		cashBackProduct = CreditcardFactory.eINSTANCE.createCashBackProduct();
		cashBackProduct.setName("TD CashBack Visa Infinite Card");
		cashBackProduct.setCode("TDCBVIC");
		cashBackProduct.setDescription("TD CashBack Visa Infinite Card");
		cashBackProduct.setAnnualFees(120);
		cashBackProduct.setCashbackPercentage(5);
		cashBackProduct.setUsageType(UsageType.BUSINESS);

		final Feature feature01 = FACTORY.createFeature();
		feature01.setCode("01");
		feature01.setName("Feature01");

		final Feature feature02 = FACTORY.createFeature();
		feature02.setCode("02");
		feature02.setName("Feature02");

		cashBackProduct.getFeatures().add(feature01);
		cashBackProduct.getFeatures().add(feature02);

		// Hook an adapter with the root EObject
		cashBackProduct.eAdapters().add(new TestEContentAdapter());
	}

	public void tearDown() {
		cashBackProduct.eAdapters().clear();
	}

	@Test
	public void testEContentAdapter() {
		final Feature feature01 = Iterables.get(cashBackProduct.getFeatures(), 0);
		feature01.setDescription("This is the 1'th feature");

		final Feature feature02 = Iterables.get(cashBackProduct.getFeatures(), 0);
		feature02.setDescription("This is the 2'nd feature");
	}

}
