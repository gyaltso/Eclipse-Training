/**
 */
package com.gyaltso.training.emf.model.creditcard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.Region#getCode <em>Code</em>}</li>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.Region#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getRegion_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.Region#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.gyaltso.training.emf.model.creditcard.Product#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getRegion_Product()
	 * @see com.gyaltso.training.emf.model.creditcard.Product#getRegion
	 * @model opposite="region"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.Region#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // Region
