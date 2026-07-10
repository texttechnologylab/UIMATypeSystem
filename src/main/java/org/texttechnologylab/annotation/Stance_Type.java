
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Stance Detection
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class Stance_Type extends StanceBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Stance.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Stance");
 
  /** @generated */
  final Feature casFeat_Support;
  /** @generated */
  final int     casFeatCode_Support;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSupport(int addr) {
        if (featOkTst && casFeat_Support == null)
      jcas.throwFeatMissing("Support", "org.texttechnologylab.annotation.Stance");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Support);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSupport(int addr, double v) {
        if (featOkTst && casFeat_Support == null)
      jcas.throwFeatMissing("Support", "org.texttechnologylab.annotation.Stance");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Support, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Oppose;
  /** @generated */
  final int     casFeatCode_Oppose;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getOppose(int addr) {
        if (featOkTst && casFeat_Oppose == null)
      jcas.throwFeatMissing("Oppose", "org.texttechnologylab.annotation.Stance");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Oppose);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOppose(int addr, double v) {
        if (featOkTst && casFeat_Oppose == null)
      jcas.throwFeatMissing("Oppose", "org.texttechnologylab.annotation.Stance");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Oppose, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Neutral;
  /** @generated */
  final int     casFeatCode_Neutral;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getNeutral(int addr) {
        if (featOkTst && casFeat_Neutral == null)
      jcas.throwFeatMissing("Neutral", "org.texttechnologylab.annotation.Stance");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Neutral);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNeutral(int addr, double v) {
        if (featOkTst && casFeat_Neutral == null)
      jcas.throwFeatMissing("Neutral", "org.texttechnologylab.annotation.Stance");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Neutral, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Stance_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Support = jcas.getRequiredFeatureDE(casType, "Support", "uima.cas.Double", featOkTst);
    casFeatCode_Support  = (null == casFeat_Support) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Support).getCode();

 
    casFeat_Oppose = jcas.getRequiredFeatureDE(casType, "Oppose", "uima.cas.Double", featOkTst);
    casFeatCode_Oppose  = (null == casFeat_Oppose) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Oppose).getCode();

 
    casFeat_Neutral = jcas.getRequiredFeatureDE(casType, "Neutral", "uima.cas.Double", featOkTst);
    casFeatCode_Neutral  = (null == casFeat_Neutral) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Neutral).getCode();

  }
}



    