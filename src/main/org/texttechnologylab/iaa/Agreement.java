

/* First created by JCasGen Thu Nov 05 17:33:35 CET 2020 */
package org.texttechnologylab.iaa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Dec 02 17:55:39 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyInterAnnotatorAgreement.xml
 * @generated */
public class Agreement extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Agreement.class);
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
  protected Agreement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Agreement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Agreement(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Agreement(JCas jcas, int begin, int end) {
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
  //* Feature: agreementValue

  /** getter for agreementValue - gets 
   * @generated
   * @return value of the feature 
   */
  public double getAgreementValue() {
    if (Agreement_Type.featOkTst && ((Agreement_Type)jcasType).casFeat_agreementValue == null)
      jcasType.jcas.throwFeatMissing("agreementValue", "org.texttechnologylab.iaa.Agreement");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Agreement_Type)jcasType).casFeatCode_agreementValue);}
    
  /** setter for agreementValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementValue(double v) {
    if (Agreement_Type.featOkTst && ((Agreement_Type)jcasType).casFeat_agreementValue == null)
      jcasType.jcas.throwFeatMissing("agreementValue", "org.texttechnologylab.iaa.Agreement");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Agreement_Type)jcasType).casFeatCode_agreementValue, v);}    
   
    
  //*--------------*
  //* Feature: agreementMeasure

  /** getter for agreementMeasure - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAgreementMeasure() {
    if (Agreement_Type.featOkTst && ((Agreement_Type)jcasType).casFeat_agreementMeasure == null)
      jcasType.jcas.throwFeatMissing("agreementMeasure", "org.texttechnologylab.iaa.Agreement");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Agreement_Type)jcasType).casFeatCode_agreementMeasure);}
    
  /** setter for agreementMeasure - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementMeasure(String v) {
    if (Agreement_Type.featOkTst && ((Agreement_Type)jcasType).casFeat_agreementMeasure == null)
      jcasType.jcas.throwFeatMissing("agreementMeasure", "org.texttechnologylab.iaa.Agreement");
    jcasType.ll_cas.ll_setStringValue(addr, ((Agreement_Type)jcasType).casFeatCode_agreementMeasure, v);}    
  }

    