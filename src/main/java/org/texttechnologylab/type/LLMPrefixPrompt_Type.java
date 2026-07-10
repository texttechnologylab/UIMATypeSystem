
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Prefix Prompt for LLM. It is optional, if not set, will be placed before the user Prompt. For example adding additional information to the Prompt.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class LLMPrefixPrompt_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LLMPrefixPrompt.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.LLMPrefixPrompt");
 
  /** @generated */
  final Feature casFeat_message;
  /** @generated */
  final int     casFeatCode_message;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMessage(int addr) {
        if (featOkTst && casFeat_message == null)
      jcas.throwFeatMissing("message", "org.texttechnologylab.type.LLMPrefixPrompt");
    return ll_cas.ll_getStringValue(addr, casFeatCode_message);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMessage(int addr, String v) {
        if (featOkTst && casFeat_message == null)
      jcas.throwFeatMissing("message", "org.texttechnologylab.type.LLMPrefixPrompt");
    ll_cas.ll_setStringValue(addr, casFeatCode_message, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LLMPrefixPrompt_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_message = jcas.getRequiredFeatureDE(casType, "message", "uima.cas.String", featOkTst);
    casFeatCode_message  = (null == casFeat_message) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_message).getCode();

  }
}



    