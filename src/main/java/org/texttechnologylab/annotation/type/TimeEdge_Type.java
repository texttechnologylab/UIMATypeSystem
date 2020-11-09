
/* First created by JCasGen Thu Nov 05 17:32:55 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Nov 05 17:32:55 CET 2020
 * @generated */
public class TimeEdge_Type extends Edge_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TimeEdge.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.TimeEdge");
 
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
      jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.TimeEdge");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mode);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMode(int addr, String v) {
        if (featOkTst && casFeat_mode == null)
      jcas.throwFeatMissing("mode", "org.texttechnologylab.annotation.type.TimeEdge");
    ll_cas.ll_setStringValue(addr, casFeatCode_mode, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TimeEdge_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_mode = jcas.getRequiredFeatureDE(casType, "mode", "uima.cas.String", featOkTst);
    casFeatCode_mode  = (null == casFeat_mode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mode).getCode();

  }
}



    