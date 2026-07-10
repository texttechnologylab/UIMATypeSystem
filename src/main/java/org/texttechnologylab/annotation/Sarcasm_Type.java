
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Sarcasm Output
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class Sarcasm_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sarcasm.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Sarcasm");
 
  /** @generated */
  final Feature casFeat_Sarcasm;
  /** @generated */
  final int     casFeatCode_Sarcasm;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getSarcasm(int addr) {
        if (featOkTst && casFeat_Sarcasm == null)
      jcas.throwFeatMissing("Sarcasm", "org.texttechnologylab.annotation.Sarcasm");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Sarcasm);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSarcasm(int addr, double v) {
        if (featOkTst && casFeat_Sarcasm == null)
      jcas.throwFeatMissing("Sarcasm", "org.texttechnologylab.annotation.Sarcasm");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Sarcasm, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NonSarcasm;
  /** @generated */
  final int     casFeatCode_NonSarcasm;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getNonSarcasm(int addr) {
        if (featOkTst && casFeat_NonSarcasm == null)
      jcas.throwFeatMissing("NonSarcasm", "org.texttechnologylab.annotation.Sarcasm");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_NonSarcasm);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNonSarcasm(int addr, double v) {
        if (featOkTst && casFeat_NonSarcasm == null)
      jcas.throwFeatMissing("NonSarcasm", "org.texttechnologylab.annotation.Sarcasm");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_NonSarcasm, v);}
    
  
 
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
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Sarcasm");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Sarcasm");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Sarcasm_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Sarcasm = jcas.getRequiredFeatureDE(casType, "Sarcasm", "uima.cas.Double", featOkTst);
    casFeatCode_Sarcasm  = (null == casFeat_Sarcasm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sarcasm).getCode();

 
    casFeat_NonSarcasm = jcas.getRequiredFeatureDE(casType, "NonSarcasm", "uima.cas.Double", featOkTst);
    casFeatCode_NonSarcasm  = (null == casFeat_NonSarcasm) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NonSarcasm).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    