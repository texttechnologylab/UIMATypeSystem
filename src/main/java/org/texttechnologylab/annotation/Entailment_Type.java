
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class Entailment_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Entailment.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Entailment");
 
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
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.Entailment");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.Entailment");
    ll_cas.ll_setRefValue(addr, casFeatCode_reference, v);}
    
  
 
  /** @generated */
  final Feature casFeat_entailment;
  /** @generated */
  final int     casFeatCode_entailment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getEntailment(int addr) {
        if (featOkTst && casFeat_entailment == null)
      jcas.throwFeatMissing("entailment", "org.texttechnologylab.annotation.Entailment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_entailment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEntailment(int addr, double v) {
        if (featOkTst && casFeat_entailment == null)
      jcas.throwFeatMissing("entailment", "org.texttechnologylab.annotation.Entailment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_entailment, v);}
    
  
 
  /** @generated */
  final Feature casFeat_contradiction;
  /** @generated */
  final int     casFeatCode_contradiction;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getContradiction(int addr) {
        if (featOkTst && casFeat_contradiction == null)
      jcas.throwFeatMissing("contradiction", "org.texttechnologylab.annotation.Entailment");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_contradiction);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContradiction(int addr, double v) {
        if (featOkTst && casFeat_contradiction == null)
      jcas.throwFeatMissing("contradiction", "org.texttechnologylab.annotation.Entailment");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_contradiction, v);}
    
  
 
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
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Entailment");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Entailment");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Entailment_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "org.texttechnologylab.annotation.EntailmentSentence", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

 
    casFeat_entailment = jcas.getRequiredFeatureDE(casType, "entailment", "uima.cas.Double", featOkTst);
    casFeatCode_entailment  = (null == casFeat_entailment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_entailment).getCode();

 
    casFeat_contradiction = jcas.getRequiredFeatureDE(casType, "contradiction", "uima.cas.Double", featOkTst);
    casFeatCode_contradiction  = (null == casFeat_contradiction) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contradiction).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    