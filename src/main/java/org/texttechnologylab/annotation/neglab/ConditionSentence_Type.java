
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.neglab;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence_Type;

/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class ConditionSentence_Type extends Sentence_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ConditionSentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.neglab.ConditionSentence");
 
  /** @generated */
  final Feature casFeat_condition;
  /** @generated */
  final int     casFeatCode_condition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCondition(int addr) {
        if (featOkTst && casFeat_condition == null)
      jcas.throwFeatMissing("condition", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_condition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCondition(int addr, String v) {
        if (featOkTst && casFeat_condition == null)
      jcas.throwFeatMissing("condition", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_condition, v);}
    
  
 
  /** @generated */
  final Feature casFeat_target;
  /** @generated */
  final int     casFeatCode_target;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTarget(int addr) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_target);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTarget(int addr, String v) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_target, v);}
    
  
 
  /** @generated */
  final Feature casFeat_order;
  /** @generated */
  final int     casFeatCode_order;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOrder(int addr) {
        if (featOkTst && casFeat_order == null)
      jcas.throwFeatMissing("order", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return ll_cas.ll_getIntValue(addr, casFeatCode_order);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOrder(int addr, int v) {
        if (featOkTst && casFeat_order == null)
      jcas.throwFeatMissing("order", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    ll_cas.ll_setIntValue(addr, casFeatCode_order, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, float v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    ll_cas.ll_setFloatValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sequenceScore;
  /** @generated */
  final int     casFeatCode_sequenceScore;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getSequenceScore(int addr) {
        if (featOkTst && casFeat_sequenceScore == null)
      jcas.throwFeatMissing("sequenceScore", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_sequenceScore);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSequenceScore(int addr, float v) {
        if (featOkTst && casFeat_sequenceScore == null)
      jcas.throwFeatMissing("sequenceScore", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    ll_cas.ll_setFloatValue(addr, casFeatCode_sequenceScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_sequenceScoreSum;
  /** @generated */
  final int     casFeatCode_sequenceScoreSum;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getSequenceScoreSum(int addr) {
        if (featOkTst && casFeat_sequenceScoreSum == null)
      jcas.throwFeatMissing("sequenceScoreSum", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_sequenceScoreSum);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSequenceScoreSum(int addr, float v) {
        if (featOkTst && casFeat_sequenceScoreSum == null)
      jcas.throwFeatMissing("sequenceScoreSum", "org.texttechnologylab.annotation.neglab.ConditionSentence");
    ll_cas.ll_setFloatValue(addr, casFeatCode_sequenceScoreSum, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ConditionSentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_condition = jcas.getRequiredFeatureDE(casType, "condition", "uima.cas.String", featOkTst);
    casFeatCode_condition  = (null == casFeat_condition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_condition).getCode();

 
    casFeat_target = jcas.getRequiredFeatureDE(casType, "target", "uima.cas.String", featOkTst);
    casFeatCode_target  = (null == casFeat_target) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_target).getCode();

 
    casFeat_order = jcas.getRequiredFeatureDE(casType, "order", "uima.cas.Integer", featOkTst);
    casFeatCode_order  = (null == casFeat_order) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_order).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.Float", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_sequenceScore = jcas.getRequiredFeatureDE(casType, "sequenceScore", "uima.cas.Float", featOkTst);
    casFeatCode_sequenceScore  = (null == casFeat_sequenceScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sequenceScore).getCode();

 
    casFeat_sequenceScoreSum = jcas.getRequiredFeatureDE(casType, "sequenceScoreSum", "uima.cas.Float", featOkTst);
    casFeatCode_sequenceScoreSum  = (null == casFeat_sequenceScoreSum) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sequenceScoreSum).getCode();

  }
}



    