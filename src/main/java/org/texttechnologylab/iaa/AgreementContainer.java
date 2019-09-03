

/* First created by JCasGen Tue Sep 03 15:37:01 CEST 2019 */
package org.texttechnologylab.iaa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 03 15:37:35 CEST 2019
 * XML source: /home/stud_homes/s3676959/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyInterAnnotatorAgreement.xml
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
  //* Feature: categorySpecificAgreementValues

  /** getter for categorySpecificAgreementValues - gets An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values.
   * @generated
   * @return value of the feature 
   */
  public StringArray getCategorySpecificAgreementValues() {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categorySpecificAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues)));}
    
  /** setter for categorySpecificAgreementValues - sets An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCategorySpecificAgreementValues(StringArray v) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categorySpecificAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.ll_cas.ll_setRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for categorySpecificAgreementValues - gets an indexed value - An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getCategorySpecificAgreementValues(int i) {
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categorySpecificAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues), i);}

  /** indexed setter for categorySpecificAgreementValues - sets an indexed value - An array of strings, that contains pairs of categories and their category specific agreement value. Elements with even indices are category Strings, elements with odd indices are the corresponding agreement values.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCategorySpecificAgreementValues(int i, String v) { 
    if (AgreementContainer_Type.featOkTst && ((AgreementContainer_Type)jcasType).casFeat_categorySpecificAgreementValues == null)
      jcasType.jcas.throwFeatMissing("categorySpecificAgreementValues", "org.texttechnologylab.iaa.AgreementContainer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AgreementContainer_Type)jcasType).casFeatCode_categorySpecificAgreementValues), i, v);}
   
    
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
  }

    