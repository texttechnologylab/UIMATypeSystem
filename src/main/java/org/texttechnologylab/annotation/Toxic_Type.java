
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Toxic Output
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class Toxic_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Toxic.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Toxic");
 
  /** @generated */
  final Feature casFeat_Toxic;
  /** @generated */
  final int     casFeatCode_Toxic;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getToxic(int addr) {
        if (featOkTst && casFeat_Toxic == null)
      jcas.throwFeatMissing("Toxic", "org.texttechnologylab.annotation.Toxic");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Toxic);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setToxic(int addr, double v) {
        if (featOkTst && casFeat_Toxic == null)
      jcas.throwFeatMissing("Toxic", "org.texttechnologylab.annotation.Toxic");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Toxic, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NonToxic;
  /** @generated */
  final int     casFeatCode_NonToxic;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getNonToxic(int addr) {
        if (featOkTst && casFeat_NonToxic == null)
      jcas.throwFeatMissing("NonToxic", "org.texttechnologylab.annotation.Toxic");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_NonToxic);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNonToxic(int addr, double v) {
        if (featOkTst && casFeat_NonToxic == null)
      jcas.throwFeatMissing("NonToxic", "org.texttechnologylab.annotation.Toxic");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_NonToxic, v);}
    
  
 
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
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Toxic");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Toxic");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Toxic_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Toxic = jcas.getRequiredFeatureDE(casType, "Toxic", "uima.cas.Double", featOkTst);
    casFeatCode_Toxic  = (null == casFeat_Toxic) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Toxic).getCode();

 
    casFeat_NonToxic = jcas.getRequiredFeatureDE(casType, "NonToxic", "uima.cas.Double", featOkTst);
    casFeatCode_NonToxic  = (null == casFeat_NonToxic) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NonToxic).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    