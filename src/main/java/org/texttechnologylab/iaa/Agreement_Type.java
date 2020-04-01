
/* First created by JCasGen Fri Mar 20 09:14:16 CET 2020 */
package org.texttechnologylab.iaa;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Apr 01 09:57:01 CEST 2020
 * @generated */
public class Agreement_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Agreement.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.iaa.Agreement");
 
  /** @generated */
  final Feature casFeat_agreementValue;
  /** @generated */
  final int     casFeatCode_agreementValue;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getAgreementValue(int addr) {
        if (featOkTst && casFeat_agreementValue == null)
      jcas.throwFeatMissing("agreementValue", "org.texttechnologylab.iaa.Agreement");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_agreementValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAgreementValue(int addr, double v) {
        if (featOkTst && casFeat_agreementValue == null)
      jcas.throwFeatMissing("agreementValue", "org.texttechnologylab.iaa.Agreement");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_agreementValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_agreementMeasure;
  /** @generated */
  final int     casFeatCode_agreementMeasure;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAgreementMeasure(int addr) {
        if (featOkTst && casFeat_agreementMeasure == null)
      jcas.throwFeatMissing("agreementMeasure", "org.texttechnologylab.iaa.Agreement");
    return ll_cas.ll_getStringValue(addr, casFeatCode_agreementMeasure);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAgreementMeasure(int addr, String v) {
        if (featOkTst && casFeat_agreementMeasure == null)
      jcas.throwFeatMissing("agreementMeasure", "org.texttechnologylab.iaa.Agreement");
    ll_cas.ll_setStringValue(addr, casFeatCode_agreementMeasure, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Agreement_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_agreementValue = jcas.getRequiredFeatureDE(casType, "agreementValue", "uima.cas.Double", featOkTst);
    casFeatCode_agreementValue  = (null == casFeat_agreementValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_agreementValue).getCode();

 
    casFeat_agreementMeasure = jcas.getRequiredFeatureDE(casType, "agreementMeasure", "uima.cas.String", featOkTst);
    casFeatCode_agreementMeasure  = (null == casFeat_agreementMeasure) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_agreementMeasure).getCode();

  }
}



    