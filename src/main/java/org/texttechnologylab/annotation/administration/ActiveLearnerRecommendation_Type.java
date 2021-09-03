
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
 * Updated by JCasGen Fri Sep 03 13:52:05 CEST 2021
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

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.tcas.Annotation", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

 
    casFeat_rejected = jcas.getRequiredFeatureDE(casType, "rejected", "uima.cas.Boolean", featOkTst);
    casFeatCode_rejected  = (null == casFeat_rejected) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rejected).getCode();

 
    casFeat_accepted = jcas.getRequiredFeatureDE(casType, "accepted", "uima.cas.Boolean", featOkTst);
    casFeatCode_accepted  = (null == casFeat_accepted) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_accepted).getCode();

  }
}



    