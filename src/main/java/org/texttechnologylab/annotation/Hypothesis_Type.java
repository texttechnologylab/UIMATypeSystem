
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class Hypothesis_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Hypothesis.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Hypothesis");
 
  /** @generated */
  final Feature casFeat_Stances;
  /** @generated */
  final int     casFeatCode_Stances;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStances(int addr) {
        if (featOkTst && casFeat_Stances == null)
      jcas.throwFeatMissing("Stances", "org.texttechnologylab.annotation.Hypothesis");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Stances);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStances(int addr, int v) {
        if (featOkTst && casFeat_Stances == null)
      jcas.throwFeatMissing("Stances", "org.texttechnologylab.annotation.Hypothesis");
    ll_cas.ll_setRefValue(addr, casFeatCode_Stances, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getStances(int addr, int i) {
        if (featOkTst && casFeat_Stances == null)
      jcas.throwFeatMissing("Stances", "org.texttechnologylab.annotation.Hypothesis");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Stances), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Stances), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Stances), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setStances(int addr, int i, int v) {
        if (featOkTst && casFeat_Stances == null)
      jcas.throwFeatMissing("Stances", "org.texttechnologylab.annotation.Hypothesis");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Stances), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Stances), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Stances), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Hypothesis_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Stances = jcas.getRequiredFeatureDE(casType, "Stances", "uima.cas.FSArray", featOkTst);
    casFeatCode_Stances  = (null == casFeat_Stances) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Stances).getCode();

  }
}



    