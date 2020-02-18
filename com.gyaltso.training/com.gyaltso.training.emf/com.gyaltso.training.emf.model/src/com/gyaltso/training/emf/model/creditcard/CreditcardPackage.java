/**
 */
package com.gyaltso.training.emf.model.creditcard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.gyaltso.training.emf.model.creditcard.CreditcardFactory
 * @model kind="package"
 * @generated
 */
public interface CreditcardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "creditcard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gyaltso.com/training/emf/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "creditcard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CreditcardPackage eINSTANCE = com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.gyaltso.training.emf.model.creditcard.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gyaltso.training.emf.model.creditcard.impl.ProductImpl
	 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REGION = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FEATURES = 4;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__EXPIRY_DATE = 5;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Check Product Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___CHECK_PRODUCT_CODE = 0;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 1;


	/**
	 * The meta object id for the '{@link com.gyaltso.training.emf.model.creditcard.impl.CreditCardProductImpl <em>Credit Card Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditCardProductImpl
	 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getCreditCardProduct()
	 * @generated
	 */
	int CREDIT_CARD_PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT__CODE = PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT__NAME = PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT__DESCRIPTION = PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT__REGION = PRODUCT__REGION;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT__FEATURES = PRODUCT__FEATURES;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT__EXPIRY_DATE = PRODUCT__EXPIRY_DATE;

	/**
	 * The feature id for the '<em><b>Annual Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT__ANNUAL_FEES = PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT__USAGE_TYPE = PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Credit Card Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT_FEATURE_COUNT = PRODUCT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Product Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT___CHECK_PRODUCT_CODE = PRODUCT___CHECK_PRODUCT_CODE;

	/**
	 * The number of operations of the '<em>Credit Card Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_PRODUCT_OPERATION_COUNT = PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gyaltso.training.emf.model.creditcard.impl.CashBackProductImpl <em>Cash Back Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gyaltso.training.emf.model.creditcard.impl.CashBackProductImpl
	 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getCashBackProduct()
	 * @generated
	 */
	int CASH_BACK_PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT__CODE = CREDIT_CARD_PRODUCT__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT__NAME = CREDIT_CARD_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT__DESCRIPTION = CREDIT_CARD_PRODUCT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT__REGION = CREDIT_CARD_PRODUCT__REGION;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT__FEATURES = CREDIT_CARD_PRODUCT__FEATURES;

	/**
	 * The feature id for the '<em><b>Expiry Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT__EXPIRY_DATE = CREDIT_CARD_PRODUCT__EXPIRY_DATE;

	/**
	 * The feature id for the '<em><b>Annual Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT__ANNUAL_FEES = CREDIT_CARD_PRODUCT__ANNUAL_FEES;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT__USAGE_TYPE = CREDIT_CARD_PRODUCT__USAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Cashback Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT__CASHBACK_PERCENTAGE = CREDIT_CARD_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cash Back Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT_FEATURE_COUNT = CREDIT_CARD_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Product Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT___CHECK_PRODUCT_CODE = CREDIT_CARD_PRODUCT___CHECK_PRODUCT_CODE;

	/**
	 * The number of operations of the '<em>Cash Back Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASH_BACK_PRODUCT_OPERATION_COUNT = CREDIT_CARD_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.gyaltso.training.emf.model.creditcard.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gyaltso.training.emf.model.creditcard.impl.FeatureImpl
	 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.gyaltso.training.emf.model.creditcard.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gyaltso.training.emf.model.creditcard.impl.RegionImpl
	 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CODE = 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__PRODUCT = 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.gyaltso.training.emf.model.creditcard.UsageType <em>Usage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.gyaltso.training.emf.model.creditcard.UsageType
	 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getUsageType()
	 * @generated
	 */
	int USAGE_TYPE = 5;


	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 6;


	/**
	 * Returns the meta object for class '{@link com.gyaltso.training.emf.model.creditcard.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.Product#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Product#getCode()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Description();

	/**
	 * Returns the meta object for the reference '{@link com.gyaltso.training.emf.model.creditcard.Product#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Product#getRegion()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Region();

	/**
	 * Returns the meta object for the containment reference list '{@link com.gyaltso.training.emf.model.creditcard.Product#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Product#getFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Features();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.Product#getExpiryDate <em>Expiry Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Date</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Product#getExpiryDate()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ExpiryDate();

	/**
	 * Returns the meta object for the '{@link com.gyaltso.training.emf.model.creditcard.Product#checkProductCode() <em>Check Product Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Product Code</em>' operation.
	 * @see com.gyaltso.training.emf.model.creditcard.Product#checkProductCode()
	 * @generated
	 */
	EOperation getProduct__CheckProductCode();

	/**
	 * Returns the meta object for class '{@link com.gyaltso.training.emf.model.creditcard.CreditCardProduct <em>Credit Card Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card Product</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.CreditCardProduct
	 * @generated
	 */
	EClass getCreditCardProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.CreditCardProduct#getAnnualFees <em>Annual Fees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annual Fees</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.CreditCardProduct#getAnnualFees()
	 * @see #getCreditCardProduct()
	 * @generated
	 */
	EAttribute getCreditCardProduct_AnnualFees();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.CreditCardProduct#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.CreditCardProduct#getUsageType()
	 * @see #getCreditCardProduct()
	 * @generated
	 */
	EAttribute getCreditCardProduct_UsageType();

	/**
	 * Returns the meta object for class '{@link com.gyaltso.training.emf.model.creditcard.CashBackProduct <em>Cash Back Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cash Back Product</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.CashBackProduct
	 * @generated
	 */
	EClass getCashBackProduct();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.CashBackProduct#getCashbackPercentage <em>Cashback Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cashback Percentage</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.CashBackProduct#getCashbackPercentage()
	 * @see #getCashBackProduct()
	 * @generated
	 */
	EAttribute getCashBackProduct_CashbackPercentage();

	/**
	 * Returns the meta object for class '{@link com.gyaltso.training.emf.model.creditcard.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.Feature#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Feature#getCode()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for class '{@link com.gyaltso.training.emf.model.creditcard.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the attribute '{@link com.gyaltso.training.emf.model.creditcard.Region#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Region#getCode()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Code();

	/**
	 * Returns the meta object for the reference '{@link com.gyaltso.training.emf.model.creditcard.Region#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.Region#getProduct()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Product();

	/**
	 * Returns the meta object for enum '{@link com.gyaltso.training.emf.model.creditcard.UsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Type</em>'.
	 * @see com.gyaltso.training.emf.model.creditcard.UsageType
	 * @generated
	 */
	EEnum getUsageType();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CreditcardFactory getCreditcardFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.gyaltso.training.emf.model.creditcard.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gyaltso.training.emf.model.creditcard.impl.ProductImpl
		 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CODE = eINSTANCE.getProduct_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__REGION = eINSTANCE.getProduct_Region();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__FEATURES = eINSTANCE.getProduct_Features();

		/**
		 * The meta object literal for the '<em><b>Expiry Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__EXPIRY_DATE = eINSTANCE.getProduct_ExpiryDate();

		/**
		 * The meta object literal for the '<em><b>Check Product Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT___CHECK_PRODUCT_CODE = eINSTANCE.getProduct__CheckProductCode();

		/**
		 * The meta object literal for the '{@link com.gyaltso.training.emf.model.creditcard.impl.CreditCardProductImpl <em>Credit Card Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditCardProductImpl
		 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getCreditCardProduct()
		 * @generated
		 */
		EClass CREDIT_CARD_PRODUCT = eINSTANCE.getCreditCardProduct();

		/**
		 * The meta object literal for the '<em><b>Annual Fees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_PRODUCT__ANNUAL_FEES = eINSTANCE.getCreditCardProduct_AnnualFees();

		/**
		 * The meta object literal for the '<em><b>Usage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD_PRODUCT__USAGE_TYPE = eINSTANCE.getCreditCardProduct_UsageType();

		/**
		 * The meta object literal for the '{@link com.gyaltso.training.emf.model.creditcard.impl.CashBackProductImpl <em>Cash Back Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gyaltso.training.emf.model.creditcard.impl.CashBackProductImpl
		 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getCashBackProduct()
		 * @generated
		 */
		EClass CASH_BACK_PRODUCT = eINSTANCE.getCashBackProduct();

		/**
		 * The meta object literal for the '<em><b>Cashback Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASH_BACK_PRODUCT__CASHBACK_PERCENTAGE = eINSTANCE.getCashBackProduct_CashbackPercentage();

		/**
		 * The meta object literal for the '{@link com.gyaltso.training.emf.model.creditcard.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gyaltso.training.emf.model.creditcard.impl.FeatureImpl
		 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__CODE = eINSTANCE.getFeature_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '{@link com.gyaltso.training.emf.model.creditcard.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gyaltso.training.emf.model.creditcard.impl.RegionImpl
		 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__CODE = eINSTANCE.getRegion_Code();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__PRODUCT = eINSTANCE.getRegion_Product();

		/**
		 * The meta object literal for the '{@link com.gyaltso.training.emf.model.creditcard.UsageType <em>Usage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.gyaltso.training.emf.model.creditcard.UsageType
		 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getUsageType()
		 * @generated
		 */
		EEnum USAGE_TYPE = eINSTANCE.getUsageType();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see com.gyaltso.training.emf.model.creditcard.impl.CreditcardPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //CreditcardPackage
