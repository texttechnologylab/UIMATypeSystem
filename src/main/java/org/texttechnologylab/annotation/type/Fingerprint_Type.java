
/* First created by JCasGen Fri Mar 20 09:03:02 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Wed Apr 01 10:00:20 CEST 2020
 * @generated */
public class Fingerprint_Type extends Node_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Fingerprint.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.Fingerprint");
 
  /** @generated */
  final Feature casFeat_user;
  /** @generated */
  final int     casFeatCode_user;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUser(int addr) {
        if (featOkTst && casFeat_user == null)
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.type.Fingerprint");
    return ll_cas.ll_getStringValue(addr, casFeatCode_user);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUser(int addr, String v) {
        if (featOkTst && casFeat_user == null)
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.type.Fingerprint");
    ll_cas.ll_setStringValue(addr, casFeatCode_user, v);}
    
  
 
  /** @generated */
  final Feature casFeat_create;
  /** @generated */
  final int     casFeatCode_create;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getCreate(int addr) {
        if (featOkTst && casFeat_create == null)
      jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.type.Fingerprint");
    return ll_cas.ll_getLongValue(addr, casFeatCode_create);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCreate(int addr, long v) {
        if (featOkTst && casFeat_create == null)
      jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.type.Fingerprint");
    ll_cas.ll_setLongValue(addr, casFeatCode_create, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reference;
  /** @generated */
  final int     casFeatCode_reference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReference(int addr) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.Fingerprint");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.Fingerprint");
    ll_cas.ll_setRefValue(addr, casFeatCode_reference, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Fingerprint_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_user = jcas.getRequiredFeatureDE(casType, "user", "uima.cas.String", featOkTst);
    casFeatCode_user  = (null == casFeat_user) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_user).getCode();

 
    casFeat_create = jcas.getRequiredFeatureDE(casType, "create", "uima.cas.Long", featOkTst);
    casFeatCode_create  = (null == casFeat_create) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_create).getCode();

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.cas.TOP", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

  }
}



    