
/* First created by JCasGen Thu Oct 19 12:56:03 CEST 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Thu Oct 19 12:56:03 CEST 2023
 * @generated */
public class AnomalySpellingMeta_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnomalySpellingMeta.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.AnomalySpellingMeta");
 
  /** @generated */
  final Feature casFeat_ModelName;
  /** @generated */
  final int     casFeatCode_ModelName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelName(int addr) {
        if (featOkTst && casFeat_ModelName == null)
      jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ModelName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelName(int addr, String v) {
        if (featOkTst && casFeat_ModelName == null)
      jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setStringValue(addr, casFeatCode_ModelName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GoodQuality;
  /** @generated */
  final int     casFeatCode_GoodQuality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getGoodQuality(int addr) {
        if (featOkTst && casFeat_GoodQuality == null)
      jcas.throwFeatMissing("GoodQuality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_GoodQuality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGoodQuality(int addr, double v) {
        if (featOkTst && casFeat_GoodQuality == null)
      jcas.throwFeatMissing("GoodQuality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_GoodQuality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_UnknownQuality;
  /** @generated */
  final int     casFeatCode_UnknownQuality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getUnknownQuality(int addr) {
        if (featOkTst && casFeat_UnknownQuality == null)
      jcas.throwFeatMissing("UnknownQuality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_UnknownQuality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUnknownQuality(int addr, double v) {
        if (featOkTst && casFeat_UnknownQuality == null)
      jcas.throwFeatMissing("UnknownQuality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_UnknownQuality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Quality;
  /** @generated */
  final int     casFeatCode_Quality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getQuality(int addr) {
        if (featOkTst && casFeat_Quality == null)
      jcas.throwFeatMissing("Quality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Quality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuality(int addr, double v) {
        if (featOkTst && casFeat_Quality == null)
      jcas.throwFeatMissing("Quality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Quality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_RightWords;
  /** @generated */
  final int     casFeatCode_RightWords;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRightWords(int addr) {
        if (featOkTst && casFeat_RightWords == null)
      jcas.throwFeatMissing("RightWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getIntValue(addr, casFeatCode_RightWords);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRightWords(int addr, int v) {
        if (featOkTst && casFeat_RightWords == null)
      jcas.throwFeatMissing("RightWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setIntValue(addr, casFeatCode_RightWords, v);}
    
  
 
  /** @generated */
  final Feature casFeat_WrongWords;
  /** @generated */
  final int     casFeatCode_WrongWords;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getWrongWords(int addr) {
        if (featOkTst && casFeat_WrongWords == null)
      jcas.throwFeatMissing("WrongWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getIntValue(addr, casFeatCode_WrongWords);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWrongWords(int addr, int v) {
        if (featOkTst && casFeat_WrongWords == null)
      jcas.throwFeatMissing("WrongWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setIntValue(addr, casFeatCode_WrongWords, v);}
    
  
 
  /** @generated */
  final Feature casFeat_UnknownWords;
  /** @generated */
  final int     casFeatCode_UnknownWords;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getUnknownWords(int addr) {
        if (featOkTst && casFeat_UnknownWords == null)
      jcas.throwFeatMissing("UnknownWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getIntValue(addr, casFeatCode_UnknownWords);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUnknownWords(int addr, int v) {
        if (featOkTst && casFeat_UnknownWords == null)
      jcas.throwFeatMissing("UnknownWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setIntValue(addr, casFeatCode_UnknownWords, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SkippedWords;
  /** @generated */
  final int     casFeatCode_SkippedWords;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSkippedWords(int addr) {
        if (featOkTst && casFeat_SkippedWords == null)
      jcas.throwFeatMissing("SkippedWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getIntValue(addr, casFeatCode_SkippedWords);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSkippedWords(int addr, int v) {
        if (featOkTst && casFeat_SkippedWords == null)
      jcas.throwFeatMissing("SkippedWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setIntValue(addr, casFeatCode_SkippedWords, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PercentRight;
  /** @generated */
  final int     casFeatCode_PercentRight;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPercentRight(int addr) {
        if (featOkTst && casFeat_PercentRight == null)
      jcas.throwFeatMissing("PercentRight", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_PercentRight);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPercentRight(int addr, double v) {
        if (featOkTst && casFeat_PercentRight == null)
      jcas.throwFeatMissing("PercentRight", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_PercentRight, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PercentWrong;
  /** @generated */
  final int     casFeatCode_PercentWrong;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPercentWrong(int addr) {
        if (featOkTst && casFeat_PercentWrong == null)
      jcas.throwFeatMissing("PercentWrong", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_PercentWrong);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPercentWrong(int addr, double v) {
        if (featOkTst && casFeat_PercentWrong == null)
      jcas.throwFeatMissing("PercentWrong", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_PercentWrong, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PercentUnknown;
  /** @generated */
  final int     casFeatCode_PercentUnknown;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPercentUnknown(int addr) {
        if (featOkTst && casFeat_PercentUnknown == null)
      jcas.throwFeatMissing("PercentUnknown", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_PercentUnknown);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPercentUnknown(int addr, double v) {
        if (featOkTst && casFeat_PercentUnknown == null)
      jcas.throwFeatMissing("PercentUnknown", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_PercentUnknown, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PercentRightWithoutSkipped;
  /** @generated */
  final int     casFeatCode_PercentRightWithoutSkipped;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPercentRightWithoutSkipped(int addr) {
        if (featOkTst && casFeat_PercentRightWithoutSkipped == null)
      jcas.throwFeatMissing("PercentRightWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_PercentRightWithoutSkipped);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPercentRightWithoutSkipped(int addr, double v) {
        if (featOkTst && casFeat_PercentRightWithoutSkipped == null)
      jcas.throwFeatMissing("PercentRightWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_PercentRightWithoutSkipped, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PercentWrongWithoutSkipped;
  /** @generated */
  final int     casFeatCode_PercentWrongWithoutSkipped;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPercentWrongWithoutSkipped(int addr) {
        if (featOkTst && casFeat_PercentWrongWithoutSkipped == null)
      jcas.throwFeatMissing("PercentWrongWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_PercentWrongWithoutSkipped);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPercentWrongWithoutSkipped(int addr, double v) {
        if (featOkTst && casFeat_PercentWrongWithoutSkipped == null)
      jcas.throwFeatMissing("PercentWrongWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_PercentWrongWithoutSkipped, v);}
    
  
 
  /** @generated */
  final Feature casFeat_PercentUnknownWithoutSkipped;
  /** @generated */
  final int     casFeatCode_PercentUnknownWithoutSkipped;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPercentUnknownWithoutSkipped(int addr) {
        if (featOkTst && casFeat_PercentUnknownWithoutSkipped == null)
      jcas.throwFeatMissing("PercentUnknownWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_PercentUnknownWithoutSkipped);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPercentUnknownWithoutSkipped(int addr, double v) {
        if (featOkTst && casFeat_PercentUnknownWithoutSkipped == null)
      jcas.throwFeatMissing("PercentUnknownWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_PercentUnknownWithoutSkipped, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnomalySpellingMeta_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ModelName = jcas.getRequiredFeatureDE(casType, "ModelName", "uima.cas.String", featOkTst);
    casFeatCode_ModelName  = (null == casFeat_ModelName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ModelName).getCode();

 
    casFeat_GoodQuality = jcas.getRequiredFeatureDE(casType, "GoodQuality", "uima.cas.Double", featOkTst);
    casFeatCode_GoodQuality  = (null == casFeat_GoodQuality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GoodQuality).getCode();

 
    casFeat_UnknownQuality = jcas.getRequiredFeatureDE(casType, "UnknownQuality", "uima.cas.Double", featOkTst);
    casFeatCode_UnknownQuality  = (null == casFeat_UnknownQuality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_UnknownQuality).getCode();

 
    casFeat_Quality = jcas.getRequiredFeatureDE(casType, "Quality", "uima.cas.Double", featOkTst);
    casFeatCode_Quality  = (null == casFeat_Quality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Quality).getCode();

 
    casFeat_RightWords = jcas.getRequiredFeatureDE(casType, "RightWords", "uima.cas.Integer", featOkTst);
    casFeatCode_RightWords  = (null == casFeat_RightWords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_RightWords).getCode();

 
    casFeat_WrongWords = jcas.getRequiredFeatureDE(casType, "WrongWords", "uima.cas.Integer", featOkTst);
    casFeatCode_WrongWords  = (null == casFeat_WrongWords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_WrongWords).getCode();

 
    casFeat_UnknownWords = jcas.getRequiredFeatureDE(casType, "UnknownWords", "uima.cas.Integer", featOkTst);
    casFeatCode_UnknownWords  = (null == casFeat_UnknownWords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_UnknownWords).getCode();

 
    casFeat_SkippedWords = jcas.getRequiredFeatureDE(casType, "SkippedWords", "uima.cas.Integer", featOkTst);
    casFeatCode_SkippedWords  = (null == casFeat_SkippedWords) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SkippedWords).getCode();

 
    casFeat_PercentRight = jcas.getRequiredFeatureDE(casType, "PercentRight", "uima.cas.Double", featOkTst);
    casFeatCode_PercentRight  = (null == casFeat_PercentRight) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PercentRight).getCode();

 
    casFeat_PercentWrong = jcas.getRequiredFeatureDE(casType, "PercentWrong", "uima.cas.Double", featOkTst);
    casFeatCode_PercentWrong  = (null == casFeat_PercentWrong) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PercentWrong).getCode();

 
    casFeat_PercentUnknown = jcas.getRequiredFeatureDE(casType, "PercentUnknown", "uima.cas.Double", featOkTst);
    casFeatCode_PercentUnknown  = (null == casFeat_PercentUnknown) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PercentUnknown).getCode();

 
    casFeat_PercentRightWithoutSkipped = jcas.getRequiredFeatureDE(casType, "PercentRightWithoutSkipped", "uima.cas.Double", featOkTst);
    casFeatCode_PercentRightWithoutSkipped  = (null == casFeat_PercentRightWithoutSkipped) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PercentRightWithoutSkipped).getCode();

 
    casFeat_PercentWrongWithoutSkipped = jcas.getRequiredFeatureDE(casType, "PercentWrongWithoutSkipped", "uima.cas.Double", featOkTst);
    casFeatCode_PercentWrongWithoutSkipped  = (null == casFeat_PercentWrongWithoutSkipped) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PercentWrongWithoutSkipped).getCode();

 
    casFeat_PercentUnknownWithoutSkipped = jcas.getRequiredFeatureDE(casType, "PercentUnknownWithoutSkipped", "uima.cas.Double", featOkTst);
    casFeatCode_PercentUnknownWithoutSkipped  = (null == casFeat_PercentUnknownWithoutSkipped) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_PercentUnknownWithoutSkipped).getCode();

  }
}



    