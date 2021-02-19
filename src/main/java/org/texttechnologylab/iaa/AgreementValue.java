

/* First created by JCasGen Fri Feb 19 11:48:25 CET 2021 */
package org.texttechnologylab.iaa;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Feb 19 11:48:25 CET 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyInterAnnotatorAgreement.xml
 * @generated */
public class AgreementValue extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AgreementValue.class);
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
  protected AgreementValue() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AgreementValue(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AgreementValue(JCas jcas) {
    super(jcas);
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
    if (AgreementValue_Type.featOkTst && ((AgreementValue_Type)jcasType).casFeat_agreementValue == null)
      jcasType.jcas.throwFeatMissing("agreementValue", "org.texttechnologylab.iaa.AgreementValue");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AgreementValue_Type)jcasType).casFeatCode_agreementValue);}
    
  /** setter for agreementValue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementValue(double v) {
    if (AgreementValue_Type.featOkTst && ((AgreementValue_Type)jcasType).casFeat_agreementValue == null)
      jcasType.jcas.throwFeatMissing("agreementValue", "org.texttechnologylab.iaa.AgreementValue");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AgreementValue_Type)jcasType).casFeatCode_agreementValue, v);}    
   
    
  //*--------------*
  //* Feature: agreementLabel

  /** getter for agreementLabel - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAgreementLabel() {
    if (AgreementValue_Type.featOkTst && ((AgreementValue_Type)jcasType).casFeat_agreementLabel == null)
      jcasType.jcas.throwFeatMissing("agreementLabel", "org.texttechnologylab.iaa.AgreementValue");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AgreementValue_Type)jcasType).casFeatCode_agreementLabel);}
    
  /** setter for agreementLabel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementLabel(String v) {
    if (AgreementValue_Type.featOkTst && ((AgreementValue_Type)jcasType).casFeat_agreementLabel == null)
      jcasType.jcas.throwFeatMissing("agreementLabel", "org.texttechnologylab.iaa.AgreementValue");
    jcasType.ll_cas.ll_setStringValue(addr, ((AgreementValue_Type)jcasType).casFeatCode_agreementLabel, v);}    
   
    
  //*--------------*
  //* Feature: agreementUnits

  /** getter for agreementUnits - gets 
   * @generated
   * @return value of the feature 
   */
  public int getAgreementUnits() {
    if (AgreementValue_Type.featOkTst && ((AgreementValue_Type)jcasType).casFeat_agreementUnits == null)
      jcasType.jcas.throwFeatMissing("agreementUnits", "org.texttechnologylab.iaa.AgreementValue");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AgreementValue_Type)jcasType).casFeatCode_agreementUnits);}
    
  /** setter for agreementUnits - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAgreementUnits(int v) {
    if (AgreementValue_Type.featOkTst && ((AgreementValue_Type)jcasType).casFeat_agreementUnits == null)
      jcasType.jcas.throwFeatMissing("agreementUnits", "org.texttechnologylab.iaa.AgreementValue");
    jcasType.ll_cas.ll_setIntValue(addr, ((AgreementValue_Type)jcasType).casFeatCode_agreementUnits, v);}    
  }

    