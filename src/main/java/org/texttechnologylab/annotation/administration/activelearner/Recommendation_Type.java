
/* First created by JCasGen Fri Apr 01 13:43:21 CEST 2022 */
package org.texttechnologylab.annotation.administration.activelearner;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.AnnotationComment_Type;

/** 
 * Updated by JCasGen Fri Apr 01 13:43:21 CEST 2022
 * @generated */
public class Recommendation_Type extends AnnotationComment_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Recommendation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.administration.activelearner.Recommendation");
 
  /** @generated */
  final Feature casFeat_hash;
  /** @generated */
  final int     casFeatCode_hash;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHash(int addr) {
        if (featOkTst && casFeat_hash == null)
      jcas.throwFeatMissing("hash", "org.texttechnologylab.annotation.administration.activelearner.Recommendation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_hash);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHash(int addr, String v) {
        if (featOkTst && casFeat_hash == null)
      jcas.throwFeatMissing("hash", "org.texttechnologylab.annotation.administration.activelearner.Recommendation");
    ll_cas.ll_setStringValue(addr, casFeatCode_hash, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.administration.activelearner.Recommendation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.administration.activelearner.Recommendation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Recommendation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_hash = jcas.getRequiredFeatureDE(casType, "hash", "uima.cas.String", featOkTst);
    casFeatCode_hash  = (null == casFeat_hash) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hash).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

  }
}



    