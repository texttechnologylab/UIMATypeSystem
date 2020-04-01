
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
public class ArgTypeAnd_Type extends ArgType_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ArgTypeAnd.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.ArgTypeAnd");
 
  /** @generated */
  final Feature casFeat_data2;
  /** @generated */
  final int     casFeatCode_data2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getData2(int addr) {
        if (featOkTst && casFeat_data2 == null)
      jcas.throwFeatMissing("data2", "org.texttechnologylab.annotation.type.ArgTypeAnd");
    return ll_cas.ll_getRefValue(addr, casFeatCode_data2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setData2(int addr, int v) {
        if (featOkTst && casFeat_data2 == null)
      jcas.throwFeatMissing("data2", "org.texttechnologylab.annotation.type.ArgTypeAnd");
    ll_cas.ll_setRefValue(addr, casFeatCode_data2, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getData2(int addr, int i) {
        if (featOkTst && casFeat_data2 == null)
      jcas.throwFeatMissing("data2", "org.texttechnologylab.annotation.type.ArgTypeAnd");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setData2(int addr, int i, int v) {
        if (featOkTst && casFeat_data2 == null)
      jcas.throwFeatMissing("data2", "org.texttechnologylab.annotation.type.ArgTypeAnd");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_data2), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ArgTypeAnd_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_data2 = jcas.getRequiredFeatureDE(casType, "data2", "uima.cas.FSArray", featOkTst);
    casFeatCode_data2  = (null == casFeat_data2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_data2).getCode();

  }
}



    