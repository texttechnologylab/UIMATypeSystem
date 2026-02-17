

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.neglab;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;


/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ConditionSentence extends Sentence {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ConditionSentence.class);
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
  protected ConditionSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ConditionSentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ConditionSentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ConditionSentence(JCas jcas, int begin, int end) {
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
  //* Feature: condition

  /** getter for condition - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCondition() {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_condition == null)
      jcasType.jcas.throwFeatMissing("condition", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_condition);}
    
  /** setter for condition - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCondition(String v) {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_condition == null)
      jcasType.jcas.throwFeatMissing("condition", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_condition, v);}    
   
    
  //*--------------*
  //* Feature: target

  /** getter for target - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTarget() {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_target);}
    
  /** setter for target - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTarget(String v) {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_target, v);}    
   
    
  //*--------------*
  //* Feature: order

  /** getter for order - gets 
   * @generated
   * @return value of the feature 
   */
  public int getOrder() {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_order == null)
      jcasType.jcas.throwFeatMissing("order", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_order);}
    
  /** setter for order - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrder(int v) {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_order == null)
      jcasType.jcas.throwFeatMissing("order", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_order, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public float getValue() {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(float v) {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    jcasType.ll_cas.ll_setFloatValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: sequenceScore

  /** getter for sequenceScore - gets 
   * @generated
   * @return value of the feature 
   */
  public float getSequenceScore() {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_sequenceScore == null)
      jcasType.jcas.throwFeatMissing("sequenceScore", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_sequenceScore);}
    
  /** setter for sequenceScore - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSequenceScore(float v) {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_sequenceScore == null)
      jcasType.jcas.throwFeatMissing("sequenceScore", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    jcasType.ll_cas.ll_setFloatValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_sequenceScore, v);}    
   
    
  //*--------------*
  //* Feature: sequenceScoreSum

  /** getter for sequenceScoreSum - gets 
   * @generated
   * @return value of the feature 
   */
  public float getSequenceScoreSum() {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_sequenceScoreSum == null)
      jcasType.jcas.throwFeatMissing("sequenceScoreSum", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_sequenceScoreSum);}
    
  /** setter for sequenceScoreSum - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSequenceScoreSum(float v) {
    if (ConditionSentence_Type.featOkTst && ((ConditionSentence_Type)jcasType).casFeat_sequenceScoreSum == null)
      jcasType.jcas.throwFeatMissing("sequenceScoreSum", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    jcasType.ll_cas.ll_setFloatValue(addr, ((ConditionSentence_Type)jcasType).casFeatCode_sequenceScoreSum, v);}    
  }

    