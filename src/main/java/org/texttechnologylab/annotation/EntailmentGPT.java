

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EntailmentGPT extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EntailmentGPT.class);
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
  protected EntailmentGPT() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EntailmentGPT(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EntailmentGPT(JCas jcas) {
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
  //* Feature: reference

  /** getter for reference - gets Entailment reference
   * @generated
   * @return value of the feature 
   */
  public EntailmentSentence getReference() {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.EntailmentGPT");
    return (EntailmentSentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets Entailment reference 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(EntailmentSentence v) {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.EntailmentGPT");
    jcasType.ll_cas.ll_setRefValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Label

  /** getter for Label - gets Label entailment or contradiction
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_Label == null)
      jcasType.jcas.throwFeatMissing("Label", "org.texttechnologylab.annotation.EntailmentGPT");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_Label);}
    
  /** setter for Label - sets Label entailment or contradiction 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_Label == null)
      jcasType.jcas.throwFeatMissing("Label", "org.texttechnologylab.annotation.EntailmentGPT");
    jcasType.ll_cas.ll_setStringValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_Label, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets Confidence value
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "org.texttechnologylab.annotation.EntailmentGPT");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets Confidence value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "org.texttechnologylab.annotation.EntailmentGPT");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_Confidence, v);}    
   
    
  //*--------------*
  //* Feature: Reason

  /** getter for Reason - gets Reason for the decision
   * @generated
   * @return value of the feature 
   */
  public String getReason() {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_Reason == null)
      jcasType.jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.EntailmentGPT");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_Reason);}
    
  /** setter for Reason - sets Reason for the decision 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(String v) {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_Reason == null)
      jcasType.jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.EntailmentGPT");
    jcasType.ll_cas.ll_setStringValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_Reason, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.EntailmentGPT");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (EntailmentGPT_Type.featOkTst && ((EntailmentGPT_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.EntailmentGPT");
    jcasType.ll_cas.ll_setRefValue(addr, ((EntailmentGPT_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    