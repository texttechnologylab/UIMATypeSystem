
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** Complexity Output
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Complexity_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Complexity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Complexity");
 
  /** @generated */
  final Feature casFeat_Kind;
  /** @generated */
  final int     casFeatCode_Kind;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getKind(int addr) {
        if (featOkTst && casFeat_Kind == null)
      jcas.throwFeatMissing("Kind", "org.texttechnologylab.annotation.Complexity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Kind);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setKind(int addr, String v) {
        if (featOkTst && casFeat_Kind == null)
      jcas.throwFeatMissing("Kind", "org.texttechnologylab.annotation.Complexity");
    ll_cas.ll_setStringValue(addr, casFeatCode_Kind, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Output;
  /** @generated */
  final int     casFeatCode_Output;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getOutput(int addr) {
        if (featOkTst && casFeat_Output == null)
      jcas.throwFeatMissing("Output", "org.texttechnologylab.annotation.Complexity");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Output);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOutput(int addr, double v) {
        if (featOkTst && casFeat_Output == null)
      jcas.throwFeatMissing("Output", "org.texttechnologylab.annotation.Complexity");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Output, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SentenceI;
  /** @generated */
  final int     casFeatCode_SentenceI;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentenceI(int addr) {
        if (featOkTst && casFeat_SentenceI == null)
      jcas.throwFeatMissing("SentenceI", "org.texttechnologylab.annotation.Complexity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SentenceI);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceI(int addr, int v) {
        if (featOkTst && casFeat_SentenceI == null)
      jcas.throwFeatMissing("SentenceI", "org.texttechnologylab.annotation.Complexity");
    ll_cas.ll_setRefValue(addr, casFeatCode_SentenceI, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SentenceJ;
  /** @generated */
  final int     casFeatCode_SentenceJ;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSentenceJ(int addr) {
        if (featOkTst && casFeat_SentenceJ == null)
      jcas.throwFeatMissing("SentenceJ", "org.texttechnologylab.annotation.Complexity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SentenceJ);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentenceJ(int addr, int v) {
        if (featOkTst && casFeat_SentenceJ == null)
      jcas.throwFeatMissing("SentenceJ", "org.texttechnologylab.annotation.Complexity");
    ll_cas.ll_setRefValue(addr, casFeatCode_SentenceJ, v);}
    
  
 
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
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Complexity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Complexity");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Complexity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Kind = jcas.getRequiredFeatureDE(casType, "Kind", "uima.cas.String", featOkTst);
    casFeatCode_Kind  = (null == casFeat_Kind) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Kind).getCode();

 
    casFeat_Output = jcas.getRequiredFeatureDE(casType, "Output", "uima.cas.Double", featOkTst);
    casFeatCode_Output  = (null == casFeat_Output) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Output).getCode();

 
    casFeat_SentenceI = jcas.getRequiredFeatureDE(casType, "SentenceI", "uima.tcas.Annotation", featOkTst);
    casFeatCode_SentenceI  = (null == casFeat_SentenceI) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceI).getCode();

 
    casFeat_SentenceJ = jcas.getRequiredFeatureDE(casType, "SentenceJ", "uima.tcas.Annotation", featOkTst);
    casFeatCode_SentenceJ  = (null == casFeat_SentenceJ) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceJ).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    