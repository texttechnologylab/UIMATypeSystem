
/* First created by JCasGen Tue Feb 17 20:19:38 CET 2026 */
package org.texttechnologylab.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Prompt for LLM with the input text. The user Prompt is mandatory, if not set, the LLM will not be called.
 * Updated by JCasGen Tue Feb 17 20:19:38 CET 2026
 * @generated */
public class LLMPrompt_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LLMPrompt.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.LLMPrompt");
 
  /** @generated */
  final Feature casFeat_prompt;
  /** @generated */
  final int     casFeatCode_prompt;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPrompt(int addr) {
        if (featOkTst && casFeat_prompt == null)
      jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.LLMPrompt");
    return ll_cas.ll_getStringValue(addr, casFeatCode_prompt);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrompt(int addr, String v) {
        if (featOkTst && casFeat_prompt == null)
      jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.LLMPrompt");
    ll_cas.ll_setStringValue(addr, casFeatCode_prompt, v);}
    
  
 
  /** @generated */
  final Feature casFeat_prefix;
  /** @generated */
  final int     casFeatCode_prefix;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPrefix(int addr) {
        if (featOkTst && casFeat_prefix == null)
      jcas.throwFeatMissing("prefix", "org.texttechnologylab.type.LLMPrompt");
    return ll_cas.ll_getRefValue(addr, casFeatCode_prefix);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrefix(int addr, int v) {
        if (featOkTst && casFeat_prefix == null)
      jcas.throwFeatMissing("prefix", "org.texttechnologylab.type.LLMPrompt");
    ll_cas.ll_setRefValue(addr, casFeatCode_prefix, v);}
    
  
 
  /** @generated */
  final Feature casFeat_suffix;
  /** @generated */
  final int     casFeatCode_suffix;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSuffix(int addr) {
        if (featOkTst && casFeat_suffix == null)
      jcas.throwFeatMissing("suffix", "org.texttechnologylab.type.LLMPrompt");
    return ll_cas.ll_getRefValue(addr, casFeatCode_suffix);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSuffix(int addr, int v) {
        if (featOkTst && casFeat_suffix == null)
      jcas.throwFeatMissing("suffix", "org.texttechnologylab.type.LLMPrompt");
    ll_cas.ll_setRefValue(addr, casFeatCode_suffix, v);}
    
  
 
  /** @generated */
  final Feature casFeat_systemPrompt;
  /** @generated */
  final int     casFeatCode_systemPrompt;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSystemPrompt(int addr) {
        if (featOkTst && casFeat_systemPrompt == null)
      jcas.throwFeatMissing("systemPrompt", "org.texttechnologylab.type.LLMPrompt");
    return ll_cas.ll_getRefValue(addr, casFeatCode_systemPrompt);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSystemPrompt(int addr, int v) {
        if (featOkTst && casFeat_systemPrompt == null)
      jcas.throwFeatMissing("systemPrompt", "org.texttechnologylab.type.LLMPrompt");
    ll_cas.ll_setRefValue(addr, casFeatCode_systemPrompt, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LLMPrompt_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_prompt = jcas.getRequiredFeatureDE(casType, "prompt", "uima.cas.String", featOkTst);
    casFeatCode_prompt  = (null == casFeat_prompt) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_prompt).getCode();

 
    casFeat_prefix = jcas.getRequiredFeatureDE(casType, "prefix", "org.texttechnologylab.type.LLMPrefixPrompt", featOkTst);
    casFeatCode_prefix  = (null == casFeat_prefix) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_prefix).getCode();

 
    casFeat_suffix = jcas.getRequiredFeatureDE(casType, "suffix", "org.texttechnologylab.type.LLMSuffixPrompt", featOkTst);
    casFeatCode_suffix  = (null == casFeat_suffix) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_suffix).getCode();

 
    casFeat_systemPrompt = jcas.getRequiredFeatureDE(casType, "systemPrompt", "org.texttechnologylab.type.LLMSystemPrompt", featOkTst);
    casFeatCode_systemPrompt  = (null == casFeat_systemPrompt) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_systemPrompt).getCode();

  }
}



    