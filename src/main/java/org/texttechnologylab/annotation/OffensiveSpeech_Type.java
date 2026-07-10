
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Offensive speech output, not only offensive or not offensive, but also the type of offensive speech
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class OffensiveSpeech_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = OffensiveSpeech.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.OffensiveSpeech");
 
  /** @generated */
  final Feature casFeat_Offensives;
  /** @generated */
  final int     casFeatCode_Offensives;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOffensives(int addr) {
        if (featOkTst && casFeat_Offensives == null)
      jcas.throwFeatMissing("Offensives", "org.texttechnologylab.annotation.OffensiveSpeech");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Offensives);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOffensives(int addr, int v) {
        if (featOkTst && casFeat_Offensives == null)
      jcas.throwFeatMissing("Offensives", "org.texttechnologylab.annotation.OffensiveSpeech");
    ll_cas.ll_setRefValue(addr, casFeatCode_Offensives, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getOffensives(int addr, int i) {
        if (featOkTst && casFeat_Offensives == null)
      jcas.throwFeatMissing("Offensives", "org.texttechnologylab.annotation.OffensiveSpeech");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Offensives), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Offensives), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Offensives), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setOffensives(int addr, int i, int v) {
        if (featOkTst && casFeat_Offensives == null)
      jcas.throwFeatMissing("Offensives", "org.texttechnologylab.annotation.OffensiveSpeech");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Offensives), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Offensives), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Offensives), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_model;
  /** @generated */
  final int     casFeatCode_model;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getModel(int addr) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.OffensiveSpeech");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.OffensiveSpeech");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public OffensiveSpeech_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Offensives = jcas.getRequiredFeatureDE(casType, "Offensives", "uima.cas.FSArray", featOkTst);
    casFeatCode_Offensives  = (null == casFeat_Offensives) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Offensives).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    