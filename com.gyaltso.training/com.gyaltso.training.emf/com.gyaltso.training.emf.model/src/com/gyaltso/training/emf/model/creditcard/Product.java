/**
 */
package com.gyaltso.training.emf.model.creditcard;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.Product#getCode <em>Code</em>}</li>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.Product#getName <em>Name</em>}</li>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.Product#getRegion <em>Region</em>}</li>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.Product#getFeatures <em>Features</em>}</li>
 *   <li>{@link com.gyaltso.training.emf.model.creditcard.Product#getExpiryDate <em>Expiry Date</em>}</li>
 * </ul>
 *
 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getProduct()
 * @model abstract="true"
 * @generated
 */
public interface Product extends EObject {
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
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getProduct_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.Product#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getProduct_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.Product#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.gyaltso.training.emf.model.creditcard.Region#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(Region)
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getProduct_Region()
	 * @see com.gyaltso.training.emf.model.creditcard.Region#getProduct
	 * @model opposite="product"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.Product#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.gyaltso.training.emf.model.creditcard.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getProduct_Features()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Date</em>' attribute.
	 * @see #setExpiryDate(Date)
	 * @see com.gyaltso.training.emf.model.creditcard.CreditcardPackage#getProduct_ExpiryDate()
	 * @model dataType="com.gyaltso.training.emf.model.creditcard.Date"
	 * @generated
	 */
	Date getExpiryDate();

	/**
	 * Sets the value of the '{@link com.gyaltso.training.emf.model.creditcard.Product#getExpiryDate <em>Expiry Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' attribute.
	 * @see #getExpiryDate()
	 * @generated
	 */
	void setExpiryDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkProductCode();

} // Product
