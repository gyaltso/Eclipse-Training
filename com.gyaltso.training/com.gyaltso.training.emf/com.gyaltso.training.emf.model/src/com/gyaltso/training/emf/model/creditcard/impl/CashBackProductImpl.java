/**
 */
package com.gyaltso.training.emf.model.creditcard.impl;

import com.gyaltso.training.emf.model.creditcard.CashBackProduct;
import com.gyaltso.training.emf.model.creditcard.CreditcardPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cash Back Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.impl.CashBackProductImpl#getCashbackPercentage <em>Cashback Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashBackProductImpl extends CreditCardProductImpl implements CashBackProduct {
	/**
	 * The default value of the '{@link #getCashbackPercentage() <em>Cashback Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashbackPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final int CASHBACK_PERCENTAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCashbackPercentage() <em>Cashback Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashbackPercentage()
	 * @generated
	 * @ordered
	 */
	protected int cashbackPercentage = CASHBACK_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CashBackProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CreditcardPackage.Literals.CASH_BACK_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCashbackPercentage() {
		return cashbackPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCashbackPercentage(int newCashbackPercentage) {
		int oldCashbackPercentage = cashbackPercentage;
		cashbackPercentage = newCashbackPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CreditcardPackage.CASH_BACK_PRODUCT__CASHBACK_PERCENTAGE, oldCashbackPercentage, cashbackPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CreditcardPackage.CASH_BACK_PRODUCT__CASHBACK_PERCENTAGE:
				return getCashbackPercentage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CreditcardPackage.CASH_BACK_PRODUCT__CASHBACK_PERCENTAGE:
				setCashbackPercentage((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CreditcardPackage.CASH_BACK_PRODUCT__CASHBACK_PERCENTAGE:
				setCashbackPercentage(CASHBACK_PERCENTAGE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CreditcardPackage.CASH_BACK_PRODUCT__CASHBACK_PERCENTAGE:
				return cashbackPercentage != CASHBACK_PERCENTAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cashbackPercentage: ");
		result.append(cashbackPercentage);
		result.append(')');
		return result.toString();
	}

} //CashBackProductImpl
