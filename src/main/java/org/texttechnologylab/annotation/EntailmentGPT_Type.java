
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class EntailmentGPT_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EntailmentGPT.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.EntailmentGPT");
 
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
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.EntailmentGPT");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.EntailmentGPT");
    ll_cas.ll_setRefValue(addr, casFeatCode_reference, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Label;
  /** @generated */
  final int     casFeatCode_Label;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabel(int addr) {
        if (featOkTst && casFeat_Label == null)
      jcas.throwFeatMissing("Label", "org.texttechnologylab.annotation.EntailmentGPT");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Label);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabel(int addr, String v) {
        if (featOkTst && casFeat_Label == null)
      jcas.throwFeatMissing("Label", "org.texttechnologylab.annotation.EntailmentGPT");
    ll_cas.ll_setStringValue(addr, casFeatCode_Label, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Confidence;
  /** @generated */
  final int     casFeatCode_Confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getConfidence(int addr) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "org.texttechnologylab.annotation.EntailmentGPT");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, double v) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "org.texttechnologylab.annotation.EntailmentGPT");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Reason;
  /** @generated */
  final int     casFeatCode_Reason;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReason(int addr) {
        if (featOkTst && casFeat_Reason == null)
      jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.EntailmentGPT");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Reason);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReason(int addr, String v) {
        if (featOkTst && casFeat_Reason == null)
      jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.EntailmentGPT");
    ll_cas.ll_setStringValue(addr, casFeatCode_Reason, v);}
    
  
 
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
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.EntailmentGPT");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.EntailmentGPT");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EntailmentGPT_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "org.texttechnologylab.annotation.EntailmentSentence", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

 
    casFeat_Label = jcas.getRequiredFeatureDE(casType, "Label", "uima.cas.String", featOkTst);
    casFeatCode_Label  = (null == casFeat_Label) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Label).getCode();

 
    casFeat_Confidence = jcas.getRequiredFeatureDE(casType, "Confidence", "uima.cas.Double", featOkTst);
    casFeatCode_Confidence  = (null == casFeat_Confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Confidence).getCode();

 
    casFeat_Reason = jcas.getRequiredFeatureDE(casType, "Reason", "uima.cas.String", featOkTst);
    casFeatCode_Reason  = (null == casFeat_Reason) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Reason).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    