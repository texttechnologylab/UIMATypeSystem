
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** One Fact for different claims
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Fact_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Fact.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Fact");
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Fact");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Fact");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Claims;
  /** @generated */
  final int     casFeatCode_Claims;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getClaims(int addr) {
        if (featOkTst && casFeat_Claims == null)
      jcas.throwFeatMissing("Claims", "org.texttechnologylab.annotation.Fact");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Claims);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setClaims(int addr, int v) {
        if (featOkTst && casFeat_Claims == null)
      jcas.throwFeatMissing("Claims", "org.texttechnologylab.annotation.Fact");
    ll_cas.ll_setRefValue(addr, casFeatCode_Claims, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getClaims(int addr, int i) {
        if (featOkTst && casFeat_Claims == null)
      jcas.throwFeatMissing("Claims", "org.texttechnologylab.annotation.Fact");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Claims), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Claims), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Claims), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setClaims(int addr, int i, int v) {
        if (featOkTst && casFeat_Claims == null)
      jcas.throwFeatMissing("Claims", "org.texttechnologylab.annotation.Fact");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Claims), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Claims), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Claims), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Fact_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_Claims = jcas.getRequiredFeatureDE(casType, "Claims", "uima.cas.FSArray", featOkTst);
    casFeatCode_Claims  = (null == casFeat_Claims) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Claims).getCode();

  }
}



    