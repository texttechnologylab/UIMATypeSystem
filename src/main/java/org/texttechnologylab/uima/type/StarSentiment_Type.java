
/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.uima.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Dec 21 13:46:41 CET 2023
 * @generated */
public class StarSentiment_Type extends Sentiment_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = StarSentiment.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.uima.type.StarSentiment");
 
  /** @generated */
  final Feature casFeat_OneStar;
  /** @generated */
  final int     casFeatCode_OneStar;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getOneStar(int addr) {
        if (featOkTst && casFeat_OneStar == null)
      jcas.throwFeatMissing("OneStar", "org.texttechnologylab.uima.type.StarSentiment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_OneStar);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOneStar(int addr, double v) {
        if (featOkTst && casFeat_OneStar == null)
      jcas.throwFeatMissing("OneStar", "org.texttechnologylab.uima.type.StarSentiment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_OneStar, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TwoStars;
  /** @generated */
  final int     casFeatCode_TwoStars;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getTwoStars(int addr) {
        if (featOkTst && casFeat_TwoStars == null)
      jcas.throwFeatMissing("TwoStars", "org.texttechnologylab.uima.type.StarSentiment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_TwoStars);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTwoStars(int addr, double v) {
        if (featOkTst && casFeat_TwoStars == null)
      jcas.throwFeatMissing("TwoStars", "org.texttechnologylab.uima.type.StarSentiment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_TwoStars, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ThreeStars;
  /** @generated */
  final int     casFeatCode_ThreeStars;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getThreeStars(int addr) {
        if (featOkTst && casFeat_ThreeStars == null)
      jcas.throwFeatMissing("ThreeStars", "org.texttechnologylab.uima.type.StarSentiment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_ThreeStars);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setThreeStars(int addr, double v) {
        if (featOkTst && casFeat_ThreeStars == null)
      jcas.throwFeatMissing("ThreeStars", "org.texttechnologylab.uima.type.StarSentiment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_ThreeStars, v);}
    
  
 
  /** @generated */
  final Feature casFeat_FourStars;
  /** @generated */
  final int     casFeatCode_FourStars;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getFourStars(int addr) {
        if (featOkTst && casFeat_FourStars == null)
      jcas.throwFeatMissing("FourStars", "org.texttechnologylab.uima.type.StarSentiment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_FourStars);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFourStars(int addr, double v) {
        if (featOkTst && casFeat_FourStars == null)
      jcas.throwFeatMissing("FourStars", "org.texttechnologylab.uima.type.StarSentiment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_FourStars, v);}
    
  
 
  /** @generated */
  final Feature casFeat_FiveStars;
  /** @generated */
  final int     casFeatCode_FiveStars;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getFiveStars(int addr) {
        if (featOkTst && casFeat_FiveStars == null)
      jcas.throwFeatMissing("FiveStars", "org.texttechnologylab.uima.type.StarSentiment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_FiveStars);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFiveStars(int addr, double v) {
        if (featOkTst && casFeat_FiveStars == null)
      jcas.throwFeatMissing("FiveStars", "org.texttechnologylab.uima.type.StarSentiment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_FiveStars, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public StarSentiment_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_OneStar = jcas.getRequiredFeatureDE(casType, "OneStar", "uima.cas.Double", featOkTst);
    casFeatCode_OneStar  = (null == casFeat_OneStar) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_OneStar).getCode();

 
    casFeat_TwoStars = jcas.getRequiredFeatureDE(casType, "TwoStars", "uima.cas.Double", featOkTst);
    casFeatCode_TwoStars  = (null == casFeat_TwoStars) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TwoStars).getCode();

 
    casFeat_ThreeStars = jcas.getRequiredFeatureDE(casType, "ThreeStars", "uima.cas.Double", featOkTst);
    casFeatCode_ThreeStars  = (null == casFeat_ThreeStars) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ThreeStars).getCode();

 
    casFeat_FourStars = jcas.getRequiredFeatureDE(casType, "FourStars", "uima.cas.Double", featOkTst);
    casFeatCode_FourStars  = (null == casFeat_FourStars) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_FourStars).getCode();

 
    casFeat_FiveStars = jcas.getRequiredFeatureDE(casType, "FiveStars", "uima.cas.Double", featOkTst);
    casFeatCode_FiveStars  = (null == casFeat_FiveStars) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_FiveStars).getCode();

  }
}



    