
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Hate Output
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class Hate_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Hate.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Hate");
 
  /** @generated */
  final Feature casFeat_Hate;
  /** @generated */
  final int     casFeatCode_Hate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getHate(int addr) {
        if (featOkTst && casFeat_Hate == null)
      jcas.throwFeatMissing("Hate", "org.texttechnologylab.annotation.Hate");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Hate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHate(int addr, double v) {
        if (featOkTst && casFeat_Hate == null)
      jcas.throwFeatMissing("Hate", "org.texttechnologylab.annotation.Hate");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Hate, v);}
    
  
 
  /** @generated */
  final Feature casFeat_NonHate;
  /** @generated */
  final int     casFeatCode_NonHate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getNonHate(int addr) {
        if (featOkTst && casFeat_NonHate == null)
      jcas.throwFeatMissing("NonHate", "org.texttechnologylab.annotation.Hate");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_NonHate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNonHate(int addr, double v) {
        if (featOkTst && casFeat_NonHate == null)
      jcas.throwFeatMissing("NonHate", "org.texttechnologylab.annotation.Hate");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_NonHate, v);}
    
  
 
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
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Hate");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Hate");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Hate_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Hate = jcas.getRequiredFeatureDE(casType, "Hate", "uima.cas.Double", featOkTst);
    casFeatCode_Hate  = (null == casFeat_Hate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Hate).getCode();

 
    casFeat_NonHate = jcas.getRequiredFeatureDE(casType, "NonHate", "uima.cas.Double", featOkTst);
    casFeatCode_NonHate  = (null == casFeat_NonHate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_NonHate).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    