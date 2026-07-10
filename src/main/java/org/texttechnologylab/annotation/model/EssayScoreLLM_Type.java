
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Essay Score Model Meta Data LLM with Prompts and all additional information
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class EssayScoreLLM_Type extends EssayScoreModel_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EssayScoreLLM.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.model.EssayScoreLLM");
 
  /** @generated */
  final Feature casFeat_ModelName;
  /** @generated */
  final int     casFeatCode_ModelName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelName(int addr) {
        if (featOkTst && casFeat_ModelName == null)
      jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ModelName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelName(int addr, String v) {
        if (featOkTst && casFeat_ModelName == null)
      jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    ll_cas.ll_setStringValue(addr, casFeatCode_ModelName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Response;
  /** @generated */
  final int     casFeatCode_Response;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getResponse(int addr) {
        if (featOkTst && casFeat_Response == null)
      jcas.throwFeatMissing("Response", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Response);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setResponse(int addr, String v) {
        if (featOkTst && casFeat_Response == null)
      jcas.throwFeatMissing("Response", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    ll_cas.ll_setStringValue(addr, casFeatCode_Response, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Contents;
  /** @generated */
  final int     casFeatCode_Contents;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContents(int addr) {
        if (featOkTst && casFeat_Contents == null)
      jcas.throwFeatMissing("Contents", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Contents);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContents(int addr, String v) {
        if (featOkTst && casFeat_Contents == null)
      jcas.throwFeatMissing("Contents", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    ll_cas.ll_setStringValue(addr, casFeatCode_Contents, v);}
    
  
 
  /** @generated */
  final Feature casFeat_AdditionalInformation;
  /** @generated */
  final int     casFeatCode_AdditionalInformation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAdditionalInformation(int addr) {
        if (featOkTst && casFeat_AdditionalInformation == null)
      jcas.throwFeatMissing("AdditionalInformation", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    return ll_cas.ll_getStringValue(addr, casFeatCode_AdditionalInformation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAdditionalInformation(int addr, String v) {
        if (featOkTst && casFeat_AdditionalInformation == null)
      jcas.throwFeatMissing("AdditionalInformation", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    ll_cas.ll_setStringValue(addr, casFeatCode_AdditionalInformation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EssayScoreLLM_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ModelName = jcas.getRequiredFeatureDE(casType, "ModelName", "uima.cas.String", featOkTst);
    casFeatCode_ModelName  = (null == casFeat_ModelName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ModelName).getCode();

 
    casFeat_Response = jcas.getRequiredFeatureDE(casType, "Response", "uima.cas.String", featOkTst);
    casFeatCode_Response  = (null == casFeat_Response) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Response).getCode();

 
    casFeat_Contents = jcas.getRequiredFeatureDE(casType, "Contents", "uima.cas.String", featOkTst);
    casFeatCode_Contents  = (null == casFeat_Contents) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Contents).getCode();

 
    casFeat_AdditionalInformation = jcas.getRequiredFeatureDE(casType, "AdditionalInformation", "uima.cas.String", featOkTst);
    casFeatCode_AdditionalInformation  = (null == casFeat_AdditionalInformation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AdditionalInformation).getCode();

  }
}



    