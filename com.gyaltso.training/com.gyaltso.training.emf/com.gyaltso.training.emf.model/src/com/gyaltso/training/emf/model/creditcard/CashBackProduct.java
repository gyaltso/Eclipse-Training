/**
 */
package com.gyaltso.training.emf.model.creditcard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cash Back Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.CashBackProduct#getCashbackPercentage <em>Cashback Percentage</em>}</li>
 * </ul>
 *
 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getCashBackProduct()
 * @model
 * @generated
 */
public interface CashBackProduct extends CreditCardProduct {
	/**
	 * Returns the value of the '<em><b>Cashback Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cashback Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cashback Percentage</em>' attribute.
	 * @see #setCashbackPercentage(int)
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getCashBackProduct_CashbackPercentage()
	 * @model
	 * @generated
	 */
	int getCashbackPercentage();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.CashBackProduct#getCashbackPercentage <em>Cashback Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cashback Percentage</em>' attribute.
	 * @see #getCashbackPercentage()
	 * @generated
	 */
	void setCashbackPercentage(int value);

} // CashBackProduct
