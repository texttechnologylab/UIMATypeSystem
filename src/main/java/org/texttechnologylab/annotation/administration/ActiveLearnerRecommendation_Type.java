
/* First created by JCasGen Fri Sep 03 13:52:05 CEST 2021 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Wed Sep 08 11:26:07 CEST 2021
 * @generated */
public class ActiveLearnerRecommendation_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ActiveLearnerRecommendation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
 
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
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    ll_cas.ll_setRefValue(addr, casFeatCode_reference, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rejected;
  /** @generated */
  final int     casFeatCode_rejected;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getRejected(int addr) {
        if (featOkTst && casFeat_rejected == null)
      jcas.throwFeatMissing("rejected", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_rejected);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRejected(int addr, boolean v) {
        if (featOkTst && casFeat_rejected == null)
      jcas.throwFeatMissing("rejected", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_rejected, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotationSameCount;
  /** @generated */
  final int     casFeatCode_annotationSameCount;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnnotationSameCount(int addr) {
        if (featOkTst && casFeat_annotationSameCount == null)
      jcas.throwFeatMissing("annotationSameCount", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_annotationSameCount);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotationSameCount(int addr, int v) {
        if (featOkTst && casFeat_annotationSameCount == null)
      jcas.throwFeatMissing("annotationSameCount", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    ll_cas.ll_setIntValue(addr, casFeatCode_annotationSameCount, v);}
    
  
 
  /** @generated */
  final Feature casFeat_annotationTotalCount;
  /** @generated */
  final int     casFeatCode_annotationTotalCount;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnnotationTotalCount(int addr) {
        if (featOkTst && casFeat_annotationTotalCount == null)
      jcas.throwFeatMissing("annotationTotalCount", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_annotationTotalCount);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotationTotalCount(int addr, int v) {
        if (featOkTst && casFeat_annotationTotalCount == null)
      jcas.throwFeatMissing("annotationTotalCount", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    ll_cas.ll_setIntValue(addr, casFeatCode_annotationTotalCount, v);}
    
  



  /** @generated */
  final Feature casFeat_accepted;
  /** @generated */
  final int     casFeatCode_accepted;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getAccepted(int addr) {
        if (featOkTst && casFeat_accepted == null)
      jcas.throwFeatMissing("accepted", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_accepted);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAccepted(int addr, boolean v) {
        if (featOkTst && casFeat_accepted == null)
      jcas.throwFeatMissing("accepted", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_accepted, v);}
    
  
 
  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ActiveLearnerRecommendation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.cas.TOP", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

 
    casFeat_accepted = jcas.getRequiredFeatureDE(casType, "accepted", "uima.cas.Boolean", featOkTst);
    casFeatCode_accepted  = (null == casFeat_accepted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_accepted).getCode();

 
    casFeat_rejected = jcas.getRequiredFeatureDE(casType, "rejected", "uima.cas.Boolean", featOkTst);
    casFeatCode_rejected  = (null == casFeat_rejected) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rejected).getCode();

 
    casFeat_annotationSameCount = jcas.getRequiredFeatureDE(casType, "annotationSameCount", "uima.cas.Integer", featOkTst);
    casFeatCode_annotationSameCount  = (null == casFeat_annotationSameCount) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotationSameCount).getCode();

 
    casFeat_annotationTotalCount = jcas.getRequiredFeatureDE(casType, "annotationTotalCount", "uima.cas.Integer", featOkTst);
    casFeatCode_annotationTotalCount  = (null == casFeat_annotationTotalCount) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotationTotalCount).getCode();

  }
}



    