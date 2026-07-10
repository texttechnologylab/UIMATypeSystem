
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** Summary of input text
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class Summary_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Summary.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Summary");
 
  /** @generated */
  final Feature casFeat_Summary;
  /** @generated */
  final int     casFeatCode_Summary;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSummary(int addr) {
        if (featOkTst && casFeat_Summary == null)
      jcas.throwFeatMissing("Summary", "org.texttechnologylab.annotation.Summary");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Summary);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSummary(int addr, String v) {
        if (featOkTst && casFeat_Summary == null)
      jcas.throwFeatMissing("Summary", "org.texttechnologylab.annotation.Summary");
    ll_cas.ll_setStringValue(addr, casFeatCode_Summary, v);}
    
  
 
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
      jcas.throwFeatMissing("Reference", "org.texttechnologylab.annotation.Summary");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_Reference == null)
      jcas.throwFeatMissing("Reference", "org.texttechnologylab.annotation.Summary");
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
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Summary");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Summary");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Summary_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Summary = jcas.getRequiredFeatureDE(casType, "Summary", "uima.cas.String", featOkTst);
    casFeatCode_Summary  = (null == casFeat_Summary) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Summary).getCode();

 
    casFeat_Reference = jcas.getRequiredFeatureDE(casType, "Reference", "uima.tcas.Annotation", featOkTst);
    casFeatCode_Reference  = (null == casFeat_Reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Reference).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    