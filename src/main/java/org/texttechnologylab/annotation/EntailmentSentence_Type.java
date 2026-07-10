
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class EntailmentSentence_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EntailmentSentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.EntailmentSentence");
 
  /** @generated */
  final Feature casFeat_premise;
  /** @generated */
  final int     casFeatCode_premise;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPremise(int addr) {
        if (featOkTst && casFeat_premise == null)
      jcas.throwFeatMissing("premise", "org.texttechnologylab.annotation.EntailmentSentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_premise);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPremise(int addr, int v) {
        if (featOkTst && casFeat_premise == null)
      jcas.throwFeatMissing("premise", "org.texttechnologylab.annotation.EntailmentSentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_premise, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hypothesis;
  /** @generated */
  final int     casFeatCode_hypothesis;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getHypothesis(int addr) {
        if (featOkTst && casFeat_hypothesis == null)
      jcas.throwFeatMissing("hypothesis", "org.texttechnologylab.annotation.EntailmentSentence");
    return ll_cas.ll_getRefValue(addr, casFeatCode_hypothesis);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHypothesis(int addr, int v) {
        if (featOkTst && casFeat_hypothesis == null)
      jcas.throwFeatMissing("hypothesis", "org.texttechnologylab.annotation.EntailmentSentence");
    ll_cas.ll_setRefValue(addr, casFeatCode_hypothesis, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EntailmentSentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_premise = jcas.getRequiredFeatureDE(casType, "premise", "uima.tcas.Annotation", featOkTst);
    casFeatCode_premise  = (null == casFeat_premise) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_premise).getCode();

 
    casFeat_hypothesis = jcas.getRequiredFeatureDE(casType, "hypothesis", "uima.tcas.Annotation", featOkTst);
    casFeatCode_hypothesis  = (null == casFeat_hypothesis) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hypothesis).getCode();

  }
}



    