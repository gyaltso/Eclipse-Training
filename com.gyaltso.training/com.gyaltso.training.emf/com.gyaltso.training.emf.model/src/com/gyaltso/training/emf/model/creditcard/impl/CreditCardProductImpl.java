/**
 */
package com.gyaltso.training.emf.model.creditcard.impl;

import com.gyaltso.training.emf.model.creditcard.CreditCardProduct;
import com.gyaltso.training.emf.model.creditcard.CreditcardPackage;
import com.gyaltso.training.emf.model.creditcard.UsageType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.impl.CreditCardProductImpl#getAnnualFees <em>Annual Fees</em>}</li>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.impl.CreditCardProductImpl#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CreditCardProductImpl extends ProductImpl implements CreditCardProduct {
	/**
	 * The default value of the '{@link #getAnnualFees() <em>Annual Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnualFees()
	 * @generated
	 * @ordered
	 */
	protected static final int ANNUAL_FEES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnnualFees() <em>Annual Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnualFees()
	 * @generated
	 * @ordered
	 */
	protected int annualFees = ANNUAL_FEES_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected static final UsageType USAGE_TYPE_EDEFAULT = UsageType.ALL;

	/**
	 * The cached value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected UsageType usageType = USAGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CreditcardPackage.Literals.CREDIT_CARD_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAnnualFees() {
		return annualFees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnualFees(int newAnnualFees) {
		int oldAnnualFees = annualFees;
		annualFees = newAnnualFees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CreditcardPackage.CREDIT_CARD_PRODUCT__ANNUAL_FEES, oldAnnualFees, annualFees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageType getUsageType() {
		return usageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageType(UsageType newUsageType) {
		UsageType oldUsageType = usageType;
		usageType = newUsageType == null ? USAGE_TYPE_EDEFAULT : newUsageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CreditcardPackage.CREDIT_CARD_PRODUCT__USAGE_TYPE, oldUsageType, usageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CreditcardPackage.CREDIT_CARD_PRODUCT__ANNUAL_FEES:
				return getAnnualFees();
			case CreditcardPackage.CREDIT_CARD_PRODUCT__USAGE_TYPE:
				return getUsageType();
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
			case CreditcardPackage.CREDIT_CARD_PRODUCT__ANNUAL_FEES:
				setAnnualFees((Integer)newValue);
				return;
			case CreditcardPackage.CREDIT_CARD_PRODUCT__USAGE_TYPE:
				setUsageType((UsageType)newValue);
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
			case CreditcardPackage.CREDIT_CARD_PRODUCT__ANNUAL_FEES:
				setAnnualFees(ANNUAL_FEES_EDEFAULT);
				return;
			case CreditcardPackage.CREDIT_CARD_PRODUCT__USAGE_TYPE:
				setUsageType(USAGE_TYPE_EDEFAULT);
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
			case CreditcardPackage.CREDIT_CARD_PRODUCT__ANNUAL_FEES:
				return annualFees != ANNUAL_FEES_EDEFAULT;
			case CreditcardPackage.CREDIT_CARD_PRODUCT__USAGE_TYPE:
				return usageType != USAGE_TYPE_EDEFAULT;
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
		result.append(" (annualFees: ");
		result.append(annualFees);
		result.append(", usageType: ");
		result.append(usageType);
		result.append(')');
		return result.toString();
	}

} //CreditCardProductImpl
