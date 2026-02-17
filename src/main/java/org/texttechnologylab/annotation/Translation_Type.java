
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Summary of input text
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Translation_Type extends Language_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Translation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Translation");
 
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
      jcas.throwFeatMissing("context", "org.texttechnologylab.annotation.Translation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_context);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContext(int addr, String v) {
        if (featOkTst && casFeat_context == null)
      jcas.throwFeatMissing("context", "org.texttechnologylab.annotation.Translation");
    ll_cas.ll_setStringValue(addr, casFeatCode_context, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Reference;
  /** @generated */
  final int     casFeatCode_Reference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReference(int addr) {
        if (featOkTst && casFeat_Reference == null)
      jcas.throwFeatMissing("Reference", "org.texttechnologylab.annotation.Translation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_Reference == null)
      jcas.throwFeatMissing("Reference", "org.texttechnologylab.annotation.Translation");
    ll_cas.ll_setRefValue(addr, casFeatCode_Reference, v);}
    
  
 
  /** @generated */
  final Feature casFeat_model;
  /** @generated */
  final int     casFeatCode_model;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getModel(int addr) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Translation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Translation");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Translation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_context = jcas.getRequiredFeatureDE(casType, "context", "uima.cas.String", featOkTst);
    casFeatCode_context  = (null == casFeat_context) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_context).getCode();

 
    casFeat_Reference = jcas.getRequiredFeatureDE(casType, "Reference", "org.texttechnologylab.annotation.Language", featOkTst);
    casFeatCode_Reference  = (null == casFeat_Reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Reference).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    