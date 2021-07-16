
/* First created by JCasGen Fri Jul 16 10:53:08 CEST 2021 */
package org.bitbucket.rkilinger.ged;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.hucompute.textimager.uima.type.Sentiment_Type;

/** 
 * Updated by JCasGen Fri Jul 16 10:53:08 CEST 2021
 * @generated */
public class Emotion_Type extends Sentiment_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Emotion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.bitbucket.rkilinger.ged.Emotion");
 
  /** @generated */
  final Feature casFeat_joy;
  /** @generated */
  final int     casFeatCode_joy;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getJoy(int addr) {
        if (featOkTst && casFeat_joy == null)
      jcas.throwFeatMissing("joy", "org.bitbucket.rkilinger.ged.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_joy);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setJoy(int addr, double v) {
        if (featOkTst && casFeat_joy == null)
      jcas.throwFeatMissing("joy", "org.bitbucket.rkilinger.ged.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_joy, v);}
    
  
 
  /** @generated */
  final Feature casFeat_anger;
  /** @generated */
  final int     casFeatCode_anger;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getAnger(int addr) {
        if (featOkTst && casFeat_anger == null)
      jcas.throwFeatMissing("anger", "org.bitbucket.rkilinger.ged.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_anger);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnger(int addr, double v) {
        if (featOkTst && casFeat_anger == null)
      jcas.throwFeatMissing("anger", "org.bitbucket.rkilinger.ged.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_anger, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mourning;
  /** @generated */
  final int     casFeatCode_mourning;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getMourning(int addr) {
        if (featOkTst && casFeat_mourning == null)
      jcas.throwFeatMissing("mourning", "org.bitbucket.rkilinger.ged.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_mourning);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMourning(int addr, double v) {
        if (featOkTst && casFeat_mourning == null)
      jcas.throwFeatMissing("mourning", "org.bitbucket.rkilinger.ged.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_mourning, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fear;
  /** @generated */
  final int     casFeatCode_fear;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getFear(int addr) {
        if (featOkTst && casFeat_fear == null)
      jcas.throwFeatMissing("fear", "org.bitbucket.rkilinger.ged.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_fear);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFear(int addr, double v) {
        if (featOkTst && casFeat_fear == null)
      jcas.throwFeatMissing("fear", "org.bitbucket.rkilinger.ged.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_fear, v);}
    
  
 
  /** @generated */
  final Feature casFeat_surprise;
  /** @generated */
  final int     casFeatCode_surprise;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSurprise(int addr) {
        if (featOkTst && casFeat_surprise == null)
      jcas.throwFeatMissing("surprise", "org.bitbucket.rkilinger.ged.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_surprise);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSurprise(int addr, double v) {
        if (featOkTst && casFeat_surprise == null)
      jcas.throwFeatMissing("surprise", "org.bitbucket.rkilinger.ged.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_surprise, v);}
    
  
 
  /** @generated */
  final Feature casFeat_contempt;
  /** @generated */
  final int     casFeatCode_contempt;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getContempt(int addr) {
        if (featOkTst && casFeat_contempt == null)
      jcas.throwFeatMissing("contempt", "org.bitbucket.rkilinger.ged.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_contempt);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContempt(int addr, double v) {
        if (featOkTst && casFeat_contempt == null)
      jcas.throwFeatMissing("contempt", "org.bitbucket.rkilinger.ged.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_contempt, v);}
    
  
 
  /** @generated */
  final Feature casFeat_disgust;
  /** @generated */
  final int     casFeatCode_disgust;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getDisgust(int addr) {
        if (featOkTst && casFeat_disgust == null)
      jcas.throwFeatMissing("disgust", "org.bitbucket.rkilinger.ged.Emotion");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_disgust);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDisgust(int addr, double v) {
        if (featOkTst && casFeat_disgust == null)
      jcas.throwFeatMissing("disgust", "org.bitbucket.rkilinger.ged.Emotion");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_disgust, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Emotion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_joy = jcas.getRequiredFeatureDE(casType, "joy", "uima.cas.Double", featOkTst);
    casFeatCode_joy  = (null == casFeat_joy) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_joy).getCode();

 
    casFeat_anger = jcas.getRequiredFeatureDE(casType, "anger", "uima.cas.Double", featOkTst);
    casFeatCode_anger  = (null == casFeat_anger) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_anger).getCode();

 
    casFeat_mourning = jcas.getRequiredFeatureDE(casType, "mourning", "uima.cas.Double", featOkTst);
    casFeatCode_mourning  = (null == casFeat_mourning) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mourning).getCode();

 
    casFeat_fear = jcas.getRequiredFeatureDE(casType, "fear", "uima.cas.Double", featOkTst);
    casFeatCode_fear  = (null == casFeat_fear) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fear).getCode();

 
    casFeat_surprise = jcas.getRequiredFeatureDE(casType, "surprise", "uima.cas.Double", featOkTst);
    casFeatCode_surprise  = (null == casFeat_surprise) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_surprise).getCode();

 
    casFeat_contempt = jcas.getRequiredFeatureDE(casType, "contempt", "uima.cas.Double", featOkTst);
    casFeatCode_contempt  = (null == casFeat_contempt) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contempt).getCode();

 
    casFeat_disgust = jcas.getRequiredFeatureDE(casType, "disgust", "uima.cas.Double", featOkTst);
    casFeatCode_disgust  = (null == casFeat_disgust) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_disgust).getCode();

  }
}



    