

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Argument
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ArgumentExtraction extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ArgumentExtraction.class);
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
  protected ArgumentExtraction() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ArgumentExtraction(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ArgumentExtraction(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ArgumentExtraction(JCas jcas, int begin, int end) {
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
  //* Feature: reason

  /** getter for reason - gets reason for the output if its provided
   * @generated
   * @return value of the feature 
   */
  public String getReason() {
    if (ArgumentExtraction_Type.featOkTst && ((ArgumentExtraction_Type)jcasType).casFeat_reason == null)
      jcasType.jcas.throwFeatMissing("reason", "org.texttechnologylab.annotation.ArgumentExtraction");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentExtraction_Type)jcasType).casFeatCode_reason);}
    
  /** setter for reason - sets reason for the output if its provided 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(String v) {
    if (ArgumentExtraction_Type.featOkTst && ((ArgumentExtraction_Type)jcasType).casFeat_reason == null)
      jcasType.jcas.throwFeatMissing("reason", "org.texttechnologylab.annotation.ArgumentExtraction");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentExtraction_Type)jcasType).casFeatCode_reason, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets output of the model
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (ArgumentExtraction_Type.featOkTst && ((ArgumentExtraction_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.ArgumentExtraction");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ArgumentExtraction_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets output of the model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (ArgumentExtraction_Type.featOkTst && ((ArgumentExtraction_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.ArgumentExtraction");
    jcasType.ll_cas.ll_setStringValue(addr, ((ArgumentExtraction_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (ArgumentExtraction_Type.featOkTst && ((ArgumentExtraction_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.ArgumentExtraction");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgumentExtraction_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (ArgumentExtraction_Type.featOkTst && ((ArgumentExtraction_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.ArgumentExtraction");
    jcasType.ll_cas.ll_setRefValue(addr, ((ArgumentExtraction_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    