
/* First created by JCasGen Tue Jun 13 14:28:41 CEST 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Jun 13 14:28:42 CEST 2023
 * @generated */
public class SentimentBert_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SentimentBert.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.SentimentBert");
 
  /** @generated */
  final Feature casFeat_sentiment;
  /** @generated */
  final int     casFeatCode_sentiment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentiment(int addr) {
        if (featOkTst && casFeat_sentiment == null)
      jcas.throwFeatMissing("sentiment", "org.texttechnologylab.annotation.SentimentBert");
    return ll_cas.ll_getIntValue(addr, casFeatCode_sentiment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentiment(int addr, int v) {
        if (featOkTst && casFeat_sentiment == null)
      jcas.throwFeatMissing("sentiment", "org.texttechnologylab.annotation.SentimentBert");
    ll_cas.ll_setIntValue(addr, casFeatCode_sentiment, v);}
    
  
 
  /** @generated */
  final Feature casFeat_probabilityPositive;
  /** @generated */
  final int     casFeatCode_probabilityPositive;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getProbabilityPositive(int addr) {
        if (featOkTst && casFeat_probabilityPositive == null)
      jcas.throwFeatMissing("probabilityPositive", "org.texttechnologylab.annotation.SentimentBert");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_probabilityPositive);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProbabilityPositive(int addr, double v) {
        if (featOkTst && casFeat_probabilityPositive == null)
      jcas.throwFeatMissing("probabilityPositive", "org.texttechnologylab.annotation.SentimentBert");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_probabilityPositive, v);}
    
  
 
  /** @generated */
  final Feature casFeat_probabilityNeutral;
  /** @generated */
  final int     casFeatCode_probabilityNeutral;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getProbabilityNeutral(int addr) {
        if (featOkTst && casFeat_probabilityNeutral == null)
      jcas.throwFeatMissing("probabilityNeutral", "org.texttechnologylab.annotation.SentimentBert");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_probabilityNeutral);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProbabilityNeutral(int addr, double v) {
        if (featOkTst && casFeat_probabilityNeutral == null)
      jcas.throwFeatMissing("probabilityNeutral", "org.texttechnologylab.annotation.SentimentBert");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_probabilityNeutral, v);}
    
  
 
  /** @generated */
  final Feature casFeat_probabilityNegative;
  /** @generated */
  final int     casFeatCode_probabilityNegative;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getProbabilityNegative(int addr) {
        if (featOkTst && casFeat_probabilityNegative == null)
      jcas.throwFeatMissing("probabilityNegative", "org.texttechnologylab.annotation.SentimentBert");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_probabilityNegative);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProbabilityNegative(int addr, double v) {
        if (featOkTst && casFeat_probabilityNegative == null)
      jcas.throwFeatMissing("probabilityNegative", "org.texttechnologylab.annotation.SentimentBert");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_probabilityNegative, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SentimentBert_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentiment = jcas.getRequiredFeatureDE(casType, "sentiment", "uima.cas.Integer", featOkTst);
    casFeatCode_sentiment  = (null == casFeat_sentiment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentiment).getCode();

 
    casFeat_probabilityPositive = jcas.getRequiredFeatureDE(casType, "probabilityPositive", "uima.cas.Double", featOkTst);
    casFeatCode_probabilityPositive  = (null == casFeat_probabilityPositive) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_probabilityPositive).getCode();

 
    casFeat_probabilityNeutral = jcas.getRequiredFeatureDE(casType, "probabilityNeutral", "uima.cas.Double", featOkTst);
    casFeatCode_probabilityNeutral  = (null == casFeat_probabilityNeutral) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_probabilityNeutral).getCode();

 
    casFeat_probabilityNegative = jcas.getRequiredFeatureDE(casType, "probabilityNegative", "uima.cas.Double", featOkTst);
    casFeatCode_probabilityNegative  = (null == casFeat_probabilityNegative) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_probabilityNegative).getCode();

  }
}



    