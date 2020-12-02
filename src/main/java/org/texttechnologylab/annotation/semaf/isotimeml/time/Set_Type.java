
/* First created by JCasGen Wed Dec 02 18:39:57 CET 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml.time;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isotimeml.TimeX3_Type;

/** 
 * Updated by JCasGen Wed Dec 02 18:39:57 CET 2020
 * @generated */
public class Set_Type extends TimeX3_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Set.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isotimeml.time.Set");
 
  /** @generated */
  final Feature casFeat_quant;
  /** @generated */
  final int     casFeatCode_quant;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getQuant(int addr) {
        if (featOkTst && casFeat_quant == null)
      jcas.throwFeatMissing("quant", "org.texttechnologylab.annotation.semaf.isotimeml.time.Set");
    return ll_cas.ll_getStringValue(addr, casFeatCode_quant);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setQuant(int addr, String v) {
        if (featOkTst && casFeat_quant == null)
      jcas.throwFeatMissing("quant", "org.texttechnologylab.annotation.semaf.isotimeml.time.Set");
    ll_cas.ll_setStringValue(addr, casFeatCode_quant, v);}
    
  
 
  /** @generated */
  final Feature casFeat_freq;
  /** @generated */
  final int     casFeatCode_freq;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFreq(int addr) {
        if (featOkTst && casFeat_freq == null)
      jcas.throwFeatMissing("freq", "org.texttechnologylab.annotation.semaf.isotimeml.time.Set");
    return ll_cas.ll_getStringValue(addr, casFeatCode_freq);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFreq(int addr, String v) {
        if (featOkTst && casFeat_freq == null)
      jcas.throwFeatMissing("freq", "org.texttechnologylab.annotation.semaf.isotimeml.time.Set");
    ll_cas.ll_setStringValue(addr, casFeatCode_freq, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Set_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_quant = jcas.getRequiredFeatureDE(casType, "quant", "uima.cas.String", featOkTst);
    casFeatCode_quant  = (null == casFeat_quant) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_quant).getCode();

 
    casFeat_freq = jcas.getRequiredFeatureDE(casType, "freq", "uima.cas.String", featOkTst);
    casFeatCode_freq  = (null == casFeat_freq) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_freq).getCode();

  }
}



    