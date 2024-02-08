
/* First created by JCasGen Wed Dec 02 18:39:03 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Feb 08 19:39:47 CET 2024
 * @generated */
public class Hyperedge_Type extends GraphBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Hyperedge.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.Hyperedge");
 
  /** @generated */
  final Feature casFeat_endpoints;
  /** @generated */
  final int     casFeatCode_endpoints;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndpoints(int addr) {
        if (featOkTst && casFeat_endpoints == null)
      jcas.throwFeatMissing("endpoints", "org.texttechnologylab.annotation.type.Hyperedge");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endpoints);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndpoints(int addr, int v) {
        if (featOkTst && casFeat_endpoints == null)
      jcas.throwFeatMissing("endpoints", "org.texttechnologylab.annotation.type.Hyperedge");
    ll_cas.ll_setRefValue(addr, casFeatCode_endpoints, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getEndpoints(int addr, int i) {
        if (featOkTst && casFeat_endpoints == null)
      jcas.throwFeatMissing("endpoints", "org.texttechnologylab.annotation.type.Hyperedge");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_endpoints), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_endpoints), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_endpoints), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEndpoints(int addr, int i, int v) {
        if (featOkTst && casFeat_endpoints == null)
      jcas.throwFeatMissing("endpoints", "org.texttechnologylab.annotation.type.Hyperedge");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_endpoints), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_endpoints), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_endpoints), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Hyperedge_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_endpoints = jcas.getRequiredFeatureDE(casType, "endpoints", "uima.cas.FSArray", featOkTst);
    casFeatCode_endpoints  = (null == casFeat_endpoints) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endpoints).getCode();

  }
}



    