
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.biofid.gnfinder;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class OddsDetails_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = OddsDetails.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails");
 
  /** @generated */
  final Feature casFeat_feature;
  /** @generated */
  final int     casFeatCode_feature;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFeature(int addr) {
        if (featOkTst && casFeat_feature == null)
      jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails");
    return ll_cas.ll_getStringValue(addr, casFeatCode_feature);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeature(int addr, String v) {
        if (featOkTst && casFeat_feature == null)
      jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails");
    ll_cas.ll_setStringValue(addr, casFeatCode_feature, v);}
    
  
 
  /** @generated */
  final Feature casFeat_odds;
  /** @generated */
  final int     casFeatCode_odds;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getOdds(int addr) {
        if (featOkTst && casFeat_odds == null)
      jcas.throwFeatMissing("odds", "org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_odds);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOdds(int addr, float v) {
        if (featOkTst && casFeat_odds == null)
      jcas.throwFeatMissing("odds", "org.texttechnologylab.annotation.biofid.gnfinder.OddsDetails");
    ll_cas.ll_setFloatValue(addr, casFeatCode_odds, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public OddsDetails_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_feature = jcas.getRequiredFeatureDE(casType, "feature", "uima.cas.String", featOkTst);
    casFeatCode_feature  = (null == casFeat_feature) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_feature).getCode();

 
    casFeat_odds = jcas.getRequiredFeatureDE(casType, "odds", "uima.cas.Float", featOkTst);
    casFeatCode_odds  = (null == casFeat_odds) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_odds).getCode();

  }
}



    