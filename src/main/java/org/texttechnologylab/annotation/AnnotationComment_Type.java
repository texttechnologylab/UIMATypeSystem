
/* First created by JCasGen Mon Mar 01 15:55:48 CET 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri May 12 16:52:40 CEST 2023
 * @generated */
public class AnnotationComment_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotationComment.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.AnnotationComment");
 
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
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotationComment");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotationComment");
    ll_cas.ll_setRefValue(addr, casFeatCode_reference, v);}
    
  
 
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
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.AnnotationComment");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.AnnotationComment");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_key;
  /** @generated */
  final int     casFeatCode_key;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getKey(int addr) {
        if (featOkTst && casFeat_key == null)
      jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.AnnotationComment");
    return ll_cas.ll_getStringValue(addr, casFeatCode_key);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setKey(int addr, String v) {
        if (featOkTst && casFeat_key == null)
      jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.AnnotationComment");
    ll_cas.ll_setStringValue(addr, casFeatCode_key, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnnotationComment_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.cas.TOP", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_key = jcas.getRequiredFeatureDE(casType, "key", "uima.cas.String", featOkTst);
    casFeatCode_key  = (null == casFeat_key) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_key).getCode();

  }
}



    