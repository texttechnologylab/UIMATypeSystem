

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 16:38:29 CEST 2025 */

package org.texttechnologylab.iaa;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.LongArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.DoubleArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed May 07 16:38:29 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AgreementContainer extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.iaa.AgreementContainer";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AgreementContainer.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_overallAgreementValue = "overallAgreementValue";
  public final static String _FeatName_agreementMeasure = "agreementMeasure";
  public final static String _FeatName_categoryNames = "categoryNames";
  public final static String _FeatName_categoryAgreementValues = "categoryAgreementValues";
  public final static String _FeatName_categoryCounts = "categoryCounts";
  public final static String _FeatName_categorySpecificAgreementValues = "categorySpecificAgreementValues";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_overallAgreementValue = TypeSystemImpl.createCallSite(AgreementContainer.class, "overallAgreementValue");
  private final static MethodHandle _FH_overallAgreementValue = _FC_overallAgreementValue.dynamicInvoker();
  private final static CallSite _FC_agreementMeasure = TypeSystemImpl.createCallSite(AgreementContainer.class, "agreementMeasure");
  private final static MethodHandle _FH_agreementMeasure = _FC_agreementMeasure.dynamicInvoker();
  private final static CallSite _FC_categoryNames = TypeSystemImpl.createCallSite(AgreementContainer.class, "categoryNames");
  private final static MethodHandle _FH_categoryNames = _FC_categoryNames.dynamicInvoker();
  private final static CallSite _FC_categoryAgreementValues = TypeSystemImpl.createCallSite(AgreementContainer.class, "categoryAgreementValues");
  private final static MethodHandle _FH_categoryAgreementValues = _FC_categoryAgreementValues.dynamicInvoker();
  private final static CallSite _FC_categoryCounts = TypeSystemImpl.createCallSite(AgreementContainer.class, "categoryCounts");
  private final static MethodHandle _FH_categoryCounts = _FC_categoryCounts.dynamicInvoker();
  private final static CallSite _FC_categorySpecificAgreementValues = TypeSystemImpl.createCallSite(AgreementContainer.class, "categorySpecificAgreementValues");
  private final static MethodHandle _FH_categorySpecificAgreementValues = _FC_categorySpecificAgreementValues.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AgreementContainer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AgreementContainer(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AgreementContainer(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AgreementContainer(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: overallAgreementValue

  /** getter for overallAgreementValue - gets The overall agreement for the entire document.
   * @generated
   * @return value of the feature 
   */
  public double getOverallAgreementValue() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_overallAgreementValue));
  }
    
  /** setter for overallAgreementValue - sets The overall agreement for the entire document. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOverallAgreementValue(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_overallAgreementValue), v);
  }    
    
   
    
  //*--------------*
  //* Feature: agreementMeasure

  /** getter for agreementMeasure - gets The agreement measure used to compute the values.
   * @generated
   * @return value of the feature 
   */
  public String getAgreementMeasure() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_agreementMeasure));
  }
    
  /** setter for agreementMeasure - sets The agreement measure used to compute the values. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementMeasure(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_agreementMeasure), v);
  }    
    
   
    
  //*--------------*
  //* Feature: categoryNames

  /** getter for categoryNames - gets The categories as an array of Strings.
   * @generated
   * @return value of the feature 
   */
  public StringArray getCategoryNames() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categoryNames)));
  }
    
  /** setter for categoryNames - sets The categories as an array of Strings. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategoryNames(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_categoryNames), v);
  }    
    
    
  /** indexed getter for categoryNames - gets an indexed value - The categories as an array of Strings.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getCategoryNames(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categoryNames)))).get(i);
  } 

  /** indexed setter for categoryNames - sets an indexed value - The categories as an array of Strings.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategoryNames(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categoryNames)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: categoryAgreementValues

  /** getter for categoryAgreementValues - gets An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values.
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getCategoryAgreementValues() { 
    return (DoubleArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categoryAgreementValues)));
  }
    
  /** setter for categoryAgreementValues - sets An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategoryAgreementValues(DoubleArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_categoryAgreementValues), v);
  }    
    
    
  /** indexed getter for categoryAgreementValues - gets an indexed value - An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getCategoryAgreementValues(int i) {
     return ((DoubleArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categoryAgreementValues)))).get(i);
  } 

  /** indexed setter for categoryAgreementValues - sets an indexed value - An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategoryAgreementValues(int i, double v) {
    ((DoubleArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categoryAgreementValues)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: categoryCounts

  /** getter for categoryCounts - gets The count of items of each category for all annotators as an array of Longs.
   * @generated
   * @return value of the feature 
   */
  public LongArray getCategoryCounts() { 
    return (LongArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categoryCounts)));
  }
    
  /** setter for categoryCounts - sets The count of items of each category for all annotators as an array of Longs. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategoryCounts(LongArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_categoryCounts), v);
  }    
    
    
  /** indexed getter for categoryCounts - gets an indexed value - The count of items of each category for all annotators as an array of Longs.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public long getCategoryCounts(int i) {
     return ((LongArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categoryCounts)))).get(i);
  } 

  /** indexed setter for categoryCounts - sets an indexed value - The count of items of each category for all annotators as an array of Longs.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategoryCounts(int i, long v) {
    ((LongArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categoryCounts)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: categorySpecificAgreementValues

  /** getter for categorySpecificAgreementValues - gets @deprecated
   * @generated
   * @return value of the feature 
   */
  public StringArray getCategorySpecificAgreementValues() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categorySpecificAgreementValues)));
  }
    
  /** setter for categorySpecificAgreementValues - sets @deprecated 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategorySpecificAgreementValues(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_categorySpecificAgreementValues), v);
  }    
    
    
  /** indexed getter for categorySpecificAgreementValues - gets an indexed value - @deprecated
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getCategorySpecificAgreementValues(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categorySpecificAgreementValues)))).get(i);
  } 

  /** indexed setter for categorySpecificAgreementValues - sets an indexed value - @deprecated
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategorySpecificAgreementValues(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_categorySpecificAgreementValues)))).set(i, v);
  }  
  }

    