

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Stance Detection
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class StanceGPT extends StanceBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StanceGPT.class);
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
  protected StanceGPT() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public StanceGPT(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public StanceGPT(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public StanceGPT(JCas jcas, int begin, int end) {
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
  //* Feature: Label

  /** getter for Label - gets Label support, oppose, neutral
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (StanceGPT_Type.featOkTst && ((StanceGPT_Type)jcasType).casFeat_Label == null)
      jcasType.jcas.throwFeatMissing("Label", "org.texttechnologylab.annotation.StanceGPT");
    return jcasType.ll_cas.ll_getStringValue(addr, ((StanceGPT_Type)jcasType).casFeatCode_Label);}
    
  /** setter for Label - sets Label support, oppose, neutral 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (StanceGPT_Type.featOkTst && ((StanceGPT_Type)jcasType).casFeat_Label == null)
      jcasType.jcas.throwFeatMissing("Label", "org.texttechnologylab.annotation.StanceGPT");
    jcasType.ll_cas.ll_setStringValue(addr, ((StanceGPT_Type)jcasType).casFeatCode_Label, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets Confidence value
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (StanceGPT_Type.featOkTst && ((StanceGPT_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "org.texttechnologylab.annotation.StanceGPT");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StanceGPT_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets Confidence value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (StanceGPT_Type.featOkTst && ((StanceGPT_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "org.texttechnologylab.annotation.StanceGPT");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StanceGPT_Type)jcasType).casFeatCode_Confidence, v);}    
   
    
  //*--------------*
  //* Feature: Reason

  /** getter for Reason - gets Reason for the decision
   * @generated
   * @return value of the feature 
   */
  public String getReason() {
    if (StanceGPT_Type.featOkTst && ((StanceGPT_Type)jcasType).casFeat_Reason == null)
      jcasType.jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.StanceGPT");
    return jcasType.ll_cas.ll_getStringValue(addr, ((StanceGPT_Type)jcasType).casFeatCode_Reason);}
    
  /** setter for Reason - sets Reason for the decision 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(String v) {
    if (StanceGPT_Type.featOkTst && ((StanceGPT_Type)jcasType).casFeat_Reason == null)
      jcasType.jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.StanceGPT");
    jcasType.ll_cas.ll_setStringValue(addr, ((StanceGPT_Type)jcasType).casFeatCode_Reason, v);}    
  }

    