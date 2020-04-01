
/* First created by JCasGen Fri Mar 20 09:13:50 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Mar 20 09:13:50 CET 2020
 * @generated */
public class ArgType_Type extends ArgNode_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ArgType.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.ArgType");
 
  /** @generated */
  final Feature casFeat_conclusion;
  /** @generated */
  final int     casFeatCode_conclusion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getConclusion(int addr) {
        if (featOkTst && casFeat_conclusion == null)
      jcas.throwFeatMissing("conclusion", "org.texttechnologylab.annotation.type.ArgType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_conclusion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConclusion(int addr, int v) {
        if (featOkTst && casFeat_conclusion == null)
      jcas.throwFeatMissing("conclusion", "org.texttechnologylab.annotation.type.ArgType");
    ll_cas.ll_setRefValue(addr, casFeatCode_conclusion, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getConclusion(int addr, int i) {
        if (featOkTst && casFeat_conclusion == null)
      jcas.throwFeatMissing("conclusion", "org.texttechnologylab.annotation.type.ArgType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_conclusion), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_conclusion), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_conclusion), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setConclusion(int addr, int i, int v) {
        if (featOkTst && casFeat_conclusion == null)
      jcas.throwFeatMissing("conclusion", "org.texttechnologylab.annotation.type.ArgType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_conclusion), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_conclusion), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_conclusion), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_mode;
  /** @generated */
  final int     casFeatCode_mode;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMode(int addr) {
        if (featOkTst && casFeat_mode == null)
      jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.ArgType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mode);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMode(int addr, String v) {
        if (featOkTst && casFeat_mode == null)
      jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.ArgType");
    ll_cas.ll_setStringValue(addr, casFeatCode_mode, v);}
    
  
 
  /** @generated */
  final Feature casFeat_data;
  /** @generated */
  final int     casFeatCode_data;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getData(int addr) {
        if (featOkTst && casFeat_data == null)
      jcas.throwFeatMissing("data", "org.texttechnologylab.annotation.type.ArgType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_data);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setData(int addr, int v) {
        if (featOkTst && casFeat_data == null)
      jcas.throwFeatMissing("data", "org.texttechnologylab.annotation.type.ArgType");
    ll_cas.ll_setRefValue(addr, casFeatCode_data, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getData(int addr, int i) {
        if (featOkTst && casFeat_data == null)
      jcas.throwFeatMissing("data", "org.texttechnologylab.annotation.type.ArgType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_data), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setData(int addr, int i, int v) {
        if (featOkTst && casFeat_data == null)
      jcas.throwFeatMissing("data", "org.texttechnologylab.annotation.type.ArgType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_data), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ArgType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_conclusion = jcas.getRequiredFeatureDE(casType, "conclusion", "uima.cas.FSArray", featOkTst);
    casFeatCode_conclusion  = (null == casFeat_conclusion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_conclusion).getCode();

 
    casFeat_mode = jcas.getRequiredFeatureDE(casType, "mode", "uima.cas.String", featOkTst);
    casFeatCode_mode  = (null == casFeat_mode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mode).getCode();

 
    casFeat_data = jcas.getRequiredFeatureDE(casType, "data", "uima.cas.FSArray", featOkTst);
    casFeatCode_data  = (null == casFeat_data) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_data).getCode();

  }
}



    