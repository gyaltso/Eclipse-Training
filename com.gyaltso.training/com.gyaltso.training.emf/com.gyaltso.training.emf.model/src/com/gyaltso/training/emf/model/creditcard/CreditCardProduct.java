/**
 */
package com.gyaltso.training.emf.model.creditcard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Card Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.CreditCardProduct#getAnnualFees <em>Annual Fees</em>}</li>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.CreditCardProduct#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getCreditCardProduct()
 * @model abstract="true"
 * @generated
 */
public interface CreditCardProduct extends Product {
	/**
	 * Returns the value of the '<em><b>Annual Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annual Fees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annual Fees</em>' attribute.
	 * @see #setAnnualFees(int)
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getCreditCardProduct_AnnualFees()
	 * @model
	 * @generated
	 */
	int getAnnualFees();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.CreditCardProduct#getAnnualFees <em>Annual Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annual Fees</em>' attribute.
	 * @see #getAnnualFees()
	 * @generated
	 */
	void setAnnualFees(int value);

	/**
	 * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.gyaltso.training.emf.model.creditcard.UsageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Type</em>' attribute.
	 * @see com.gyaltso.training.emf.model.creditcard.UsageType
	 * @see #setUsageType(UsageType)
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getCreditCardProduct_UsageType()
	 * @model
	 * @generated
	 */
	UsageType getUsageType();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.CreditCardProduct#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Type</em>' attribute.
	 * @see com.gyaltso.training.emf.model.creditcard.UsageType
	 * @see #getUsageType()
	 * @generated
	 */
	void setUsageType(UsageType value);

} // CreditCardProduct
