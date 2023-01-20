
/* First created by JCasGen Tue Feb 16 17:37:06 CET 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jan 20 19:10:46 CET 2023
 * @generated */
public class SubcatMatch_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SubcatMatch.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.SubcatMatch");
 
  /** @generated */
  final Feature casFeat_status;
  /** @generated */
  final int     casFeatCode_status;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStatus(int addr) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.texttechnologylab.annotation.SubcatMatch");
    return ll_cas.ll_getStringValue(addr, casFeatCode_status);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStatus(int addr, String v) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.texttechnologylab.annotation.SubcatMatch");
    ll_cas.ll_setStringValue(addr, casFeatCode_status, v);}
    
  
 
  /** @generated */
  final Feature casFeat_context;
  /** @generated */
  final int     casFeatCode_context;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContext(int addr) {
        if (featOkTst && casFeat_context == null)
      jcas.throwFeatMissing("context", "org.texttechnologylab.annotation.SubcatMatch");
    return ll_cas.ll_getStringValue(addr, casFeatCode_context);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContext(int addr, String v) {
        if (featOkTst && casFeat_context == null)
      jcas.throwFeatMissing("context", "org.texttechnologylab.annotation.SubcatMatch");
    ll_cas.ll_setStringValue(addr, casFeatCode_context, v);}
    
  
 
  /** @generated */
  final Feature casFeat_elements;
  /** @generated */
  final int     casFeatCode_elements;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getElements(int addr) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.SubcatMatch");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elements);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElements(int addr, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.SubcatMatch");
    ll_cas.ll_setRefValue(addr, casFeatCode_elements, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getElements(int addr, int i) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.SubcatMatch");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setElements(int addr, int i, int v) {
        if (featOkTst && casFeat_elements == null)
      jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.SubcatMatch");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_elements), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SubcatMatch_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_status = jcas.getRequiredFeatureDE(casType, "status", "uima.cas.String", featOkTst);
    casFeatCode_status  = (null == casFeat_status) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_status).getCode();

 
    casFeat_context = jcas.getRequiredFeatureDE(casType, "context", "uima.cas.String", featOkTst);
    casFeatCode_context  = (null == casFeat_context) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_context).getCode();

 
    casFeat_elements = jcas.getRequiredFeatureDE(casType, "elements", "uima.cas.FSArray", featOkTst);
    casFeatCode_elements  = (null == casFeat_elements) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elements).getCode();

  }
}



    