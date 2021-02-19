
/* First created by JCasGen Fri Feb 19 11:48:25 CET 2021 */
package org.texttechnologylab.iaa;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Feb 19 11:48:25 CET 2021
 * @generated */
public class AgreementValue_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AgreementValue.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.iaa.AgreementValue");
 
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
      jcas.throwFeatMissing("agreementValue", "org.texttechnologylab.iaa.AgreementValue");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_agreementValue);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAgreementValue(int addr, double v) {
        if (featOkTst && casFeat_agreementValue == null)
      jcas.throwFeatMissing("agreementValue", "org.texttechnologylab.iaa.AgreementValue");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_agreementValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_agreementLabel;
  /** @generated */
  final int     casFeatCode_agreementLabel;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAgreementLabel(int addr) {
        if (featOkTst && casFeat_agreementLabel == null)
      jcas.throwFeatMissing("agreementLabel", "org.texttechnologylab.iaa.AgreementValue");
    return ll_cas.ll_getStringValue(addr, casFeatCode_agreementLabel);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAgreementLabel(int addr, String v) {
        if (featOkTst && casFeat_agreementLabel == null)
      jcas.throwFeatMissing("agreementLabel", "org.texttechnologylab.iaa.AgreementValue");
    ll_cas.ll_setStringValue(addr, casFeatCode_agreementLabel, v);}
    
  
 
  /** @generated */
  final Feature casFeat_agreementUnits;
  /** @generated */
  final int     casFeatCode_agreementUnits;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAgreementUnits(int addr) {
        if (featOkTst && casFeat_agreementUnits == null)
      jcas.throwFeatMissing("agreementUnits", "org.texttechnologylab.iaa.AgreementValue");
    return ll_cas.ll_getIntValue(addr, casFeatCode_agreementUnits);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAgreementUnits(int addr, int v) {
        if (featOkTst && casFeat_agreementUnits == null)
      jcas.throwFeatMissing("agreementUnits", "org.texttechnologylab.iaa.AgreementValue");
    ll_cas.ll_setIntValue(addr, casFeatCode_agreementUnits, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AgreementValue_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_agreementValue = jcas.getRequiredFeatureDE(casType, "agreementValue", "uima.cas.Double", featOkTst);
    casFeatCode_agreementValue  = (null == casFeat_agreementValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_agreementValue).getCode();

 
    casFeat_agreementLabel = jcas.getRequiredFeatureDE(casType, "agreementLabel", "uima.cas.String", featOkTst);
    casFeatCode_agreementLabel  = (null == casFeat_agreementLabel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_agreementLabel).getCode();

 
    casFeat_agreementUnits = jcas.getRequiredFeatureDE(casType, "agreementUnits", "uima.cas.Integer", featOkTst);
    casFeatCode_agreementUnits  = (null == casFeat_agreementUnits) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_agreementUnits).getCode();

  }
}



    