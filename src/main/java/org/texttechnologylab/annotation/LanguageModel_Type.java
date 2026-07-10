
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class LanguageModel_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LanguageModel.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.LanguageModel");
 
  /** @generated */
  final Feature casFeat_Language;
  /** @generated */
  final int     casFeatCode_Language;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLanguage(int addr) {
        if (featOkTst && casFeat_Language == null)
      jcas.throwFeatMissing("Language", "org.texttechnologylab.annotation.LanguageModel");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Language);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguage(int addr, int v) {
        if (featOkTst && casFeat_Language == null)
      jcas.throwFeatMissing("Language", "org.texttechnologylab.annotation.LanguageModel");
    ll_cas.ll_setRefValue(addr, casFeatCode_Language, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Model;
  /** @generated */
  final int     casFeatCode_Model;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getModel(int addr) {
        if (featOkTst && casFeat_Model == null)
      jcas.throwFeatMissing("Model", "org.texttechnologylab.annotation.LanguageModel");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_Model == null)
      jcas.throwFeatMissing("Model", "org.texttechnologylab.annotation.LanguageModel");
    ll_cas.ll_setRefValue(addr, casFeatCode_Model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LanguageModel_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Language = jcas.getRequiredFeatureDE(casType, "Language", "org.texttechnologylab.annotation.Language", featOkTst);
    casFeatCode_Language  = (null == casFeat_Language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Language).getCode();

 
    casFeat_Model = jcas.getRequiredFeatureDE(casType, "Model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_Model  = (null == casFeat_Model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Model).getCode();

  }
}



    