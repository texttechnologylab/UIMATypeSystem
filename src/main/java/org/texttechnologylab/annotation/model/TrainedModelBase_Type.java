
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Base feature structure for storing a trained model artifact without text span offsets.
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class TrainedModelBase_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TrainedModelBase.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.model.TrainedModelBase");
 
  /** @generated */
  final Feature casFeat_modelBase64;
  /** @generated */
  final int     casFeatCode_modelBase64;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelBase64(int addr) {
        if (featOkTst && casFeat_modelBase64 == null)
      jcas.throwFeatMissing("modelBase64", "org.texttechnologylab.annotation.model.TrainedModelBase");
    return ll_cas.ll_getStringValue(addr, casFeatCode_modelBase64);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelBase64(int addr, String v) {
        if (featOkTst && casFeat_modelBase64 == null)
      jcas.throwFeatMissing("modelBase64", "org.texttechnologylab.annotation.model.TrainedModelBase");
    ll_cas.ll_setStringValue(addr, casFeatCode_modelBase64, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TrainedModelBase_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_modelBase64 = jcas.getRequiredFeatureDE(casType, "modelBase64", "uima.cas.String", featOkTst);
    casFeatCode_modelBase64  = (null == casFeat_modelBase64) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_modelBase64).getCode();

  }
}



    