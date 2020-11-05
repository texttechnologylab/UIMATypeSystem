
/* First created by JCasGen Thu Nov 05 17:34:04 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Nov 05 17:34:04 CET 2020
 * @generated */
public class ArgTypeUnless_Type extends ArgType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ArgTypeUnless.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.ArgTypeUnless");
 
  /** @generated */
  final Feature casFeat_counterRebuttal;
  /** @generated */
  final int     casFeatCode_counterRebuttal;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCounterRebuttal(int addr) {
        if (featOkTst && casFeat_counterRebuttal == null)
      jcas.throwFeatMissing("counterRebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    return ll_cas.ll_getRefValue(addr, casFeatCode_counterRebuttal);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCounterRebuttal(int addr, int v) {
        if (featOkTst && casFeat_counterRebuttal == null)
      jcas.throwFeatMissing("counterRebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    ll_cas.ll_setRefValue(addr, casFeatCode_counterRebuttal, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getCounterRebuttal(int addr, int i) {
        if (featOkTst && casFeat_counterRebuttal == null)
      jcas.throwFeatMissing("counterRebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_counterRebuttal), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_counterRebuttal), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_counterRebuttal), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCounterRebuttal(int addr, int i, int v) {
        if (featOkTst && casFeat_counterRebuttal == null)
      jcas.throwFeatMissing("counterRebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_counterRebuttal), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_counterRebuttal), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_counterRebuttal), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_rebuttal;
  /** @generated */
  final int     casFeatCode_rebuttal;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRebuttal(int addr) {
        if (featOkTst && casFeat_rebuttal == null)
      jcas.throwFeatMissing("rebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    return ll_cas.ll_getRefValue(addr, casFeatCode_rebuttal);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRebuttal(int addr, int v) {
        if (featOkTst && casFeat_rebuttal == null)
      jcas.throwFeatMissing("rebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    ll_cas.ll_setRefValue(addr, casFeatCode_rebuttal, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getRebuttal(int addr, int i) {
        if (featOkTst && casFeat_rebuttal == null)
      jcas.throwFeatMissing("rebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_rebuttal), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_rebuttal), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_rebuttal), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setRebuttal(int addr, int i, int v) {
        if (featOkTst && casFeat_rebuttal == null)
      jcas.throwFeatMissing("rebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_rebuttal), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_rebuttal), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_rebuttal), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ArgTypeUnless_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_counterRebuttal = jcas.getRequiredFeatureDE(casType, "counterRebuttal", "uima.cas.FSArray", featOkTst);
    casFeatCode_counterRebuttal  = (null == casFeat_counterRebuttal) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_counterRebuttal).getCode();

 
    casFeat_rebuttal = jcas.getRequiredFeatureDE(casType, "rebuttal", "uima.cas.FSArray", featOkTst);
    casFeatCode_rebuttal  = (null == casFeat_rebuttal) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rebuttal).getCode();

  }
}



    