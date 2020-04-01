

/* First created by JCasGen Fri Mar 20 09:14:16 CET 2020 */
package org.texttechnologylab.iaa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.LongArray;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.DoubleArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 01 09:57:01 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyInterAnnotatorAgreement.xml
 * @generated */
public class AgreementContainer extends Annotation {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AgreementContainer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AgreementContainer(int addr, TOP_Type type) {
    super(addr, type);
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
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_overallAgreementValue == null)
      jcasType.jcas.throwFeatMissing("overallAgreementValue", "org.texttechnologylab.iaa.AgreementContainer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_overallAgreementValue);}
    
  /** setter for overallAgreementValue - sets The overall agreement for the entire document. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOverallAgreementValue(double v) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_overallAgreementValue == null)
      jcasType.jcas.throwFeatMissing("overallAgreementValue", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_overallAgreementValue, v);}    
   
    
  //*--------------*
  //* Feature: agreementMeasure

  /** getter for agreementMeasure - gets The agreement measure used to compute the values.
   * @generated
   * @return value of the feature 
   */
  public String getAgreementMeasure() {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_agreementMeasure == null)
      jcasType.jcas.throwFeatMissing("agreementMeasure", "org.texttechnologylab.iaa.AgreementContainer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_agreementMeasure);}
    
  /** setter for agreementMeasure - sets The agreement measure used to compute the values. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementMeasure(String v) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_agreementMeasure == null)
      jcasType.jcas.throwFeatMissing("agreementMeasure", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.ll_cas.ll_setStringValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_agreementMeasure, v);}    
   
    
  //*--------------*
  //* Feature: categoryNames

  /** getter for categoryNames - gets The categories as an array of Strings.
   * @generated
   * @return value of the feature 
   */
  public StringArray getCategoryNames() {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryNames == null)
      jcasType.jcas.throwFeatMissing("categoryNames", "org.texttechnologylab.iaa.AgreementContainer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryNames)));}
    
  /** setter for categoryNames - sets The categories as an array of Strings. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategoryNames(StringArray v) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryNames == null)
      jcasType.jcas.throwFeatMissing("categoryNames", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.ll_cas.ll_setRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryNames, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for categoryNames - gets an indexed value - The categories as an array of Strings.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getCategoryNames(int i) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryNames == null)
      jcasType.jcas.throwFeatMissing("categoryNames", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryNames), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryNames), i);}

  /** indexed setter for categoryNames - sets an indexed value - The categories as an array of Strings.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategoryNames(int i, String v) { 
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryNames == null)
      jcasType.jcas.throwFeatMissing("categoryNames", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryNames), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryNames), i, v);}
   
    
  //*--------------*
  //* Feature: categoryAgreementValues

  /** getter for categoryAgreementValues - gets An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values.
   * @generated
   * @return value of the feature 
   */
  public DoubleArray getCategoryAgreementValues() {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categoryAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    return (DoubleArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryAgreementValues)));}
    
  /** setter for categoryAgreementValues - sets An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategoryAgreementValues(DoubleArray v) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categoryAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.ll_cas.ll_setRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryAgreementValues, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for categoryAgreementValues - gets an indexed value - An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public double getCategoryAgreementValues(int i) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categoryAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryAgreementValues), i);
    return jcasType.ll_cas.ll_getDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryAgreementValues), i);}

  /** indexed setter for categoryAgreementValues - sets an indexed value - An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategoryAgreementValues(int i, double v) { 
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categoryAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryAgreementValues), i);
    jcasType.ll_cas.ll_setDoubleArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryAgreementValues), i, v);}
   
    
  //*--------------*
  //* Feature: categoryCounts

  /** getter for categoryCounts - gets The count of items of each category for all annotators as an array of Longs.
   * @generated
   * @return value of the feature 
   */
  public LongArray getCategoryCounts() {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryCounts == null)
      jcasType.jcas.throwFeatMissing("categoryCounts", "org.texttechnologylab.iaa.AgreementContainer");
    return (LongArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryCounts)));}
    
  /** setter for categoryCounts - sets The count of items of each category for all annotators as an array of Longs. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategoryCounts(LongArray v) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryCounts == null)
      jcasType.jcas.throwFeatMissing("categoryCounts", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.ll_cas.ll_setRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryCounts, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for categoryCounts - gets an indexed value - The count of items of each category for all annotators as an array of Longs.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public long getCategoryCounts(int i) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryCounts == null)
      jcasType.jcas.throwFeatMissing("categoryCounts", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryCounts), i);
    return jcasType.ll_cas.ll_getLongArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryCounts), i);}

  /** indexed setter for categoryCounts - sets an indexed value - The count of items of each category for all annotators as an array of Longs.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategoryCounts(int i, long v) { 
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categoryCounts == null)
      jcasType.jcas.throwFeatMissing("categoryCounts", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryCounts), i);
    jcasType.ll_cas.ll_setLongArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categoryCounts), i, v);}
   
    
  //*--------------*
  //* Feature: categorySpecificAgreementValues

  /** getter for categorySpecificAgreementValues - gets @deprecated
   * @generated
   * @return value of the feature 
   */
  public StringArray getCategorySpecificAgreementValues() {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categorySpecificAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues)));}
    
  /** setter for categorySpecificAgreementValues - sets @deprecated 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategorySpecificAgreementValues(StringArray v) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categorySpecificAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.ll_cas.ll_setRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for categorySpecificAgreementValues - gets an indexed value - @deprecated
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getCategorySpecificAgreementValues(int i) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categorySpecificAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues), i);}

  /** indexed setter for categorySpecificAgreementValues - sets an indexed value - @deprecated
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategorySpecificAgreementValues(int i, String v) { 
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categorySpecificAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues), i, v);}
  }

    