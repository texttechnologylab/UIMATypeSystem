
/* First created by JCasGen Thu Jan 16 13:35:57 CET 2025 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** LLM result
 * Updated by JCasGen Thu Jan 16 14:18:16 CET 2025
 * @generated */
public class Result_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Result.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.llm.prompt.Result");
 
  /** @generated */
  final Feature casFeat_content;
  /** @generated */
  final int     casFeatCode_content;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContent(int addr) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "org.texttechnologylab.type.llm.prompt.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_content);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContent(int addr, String v) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "org.texttechnologylab.type.llm.prompt.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_content, v);}
    
  
 
  /** @generated */
  final Feature casFeat_meta;
  /** @generated */
  final int     casFeatCode_meta;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMeta(int addr) {
        if (featOkTst && casFeat_meta == null)
      jcas.throwFeatMissing("meta", "org.texttechnologylab.type.llm.prompt.Result");
    return ll_cas.ll_getStringValue(addr, casFeatCode_meta);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMeta(int addr, String v) {
        if (featOkTst && casFeat_meta == null)
      jcas.throwFeatMissing("meta", "org.texttechnologylab.type.llm.prompt.Result");
    ll_cas.ll_setStringValue(addr, casFeatCode_meta, v);}
    
  
 
  /** @generated */
  final Feature casFeat_prompt;
  /** @generated */
  final int     casFeatCode_prompt;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPrompt(int addr) {
        if (featOkTst && casFeat_prompt == null)
      jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.llm.prompt.Result");
    return ll_cas.ll_getRefValue(addr, casFeatCode_prompt);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrompt(int addr, int v) {
        if (featOkTst && casFeat_prompt == null)
      jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.llm.prompt.Result");
    ll_cas.ll_setRefValue(addr, casFeatCode_prompt, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Result_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_content = jcas.getRequiredFeatureDE(casType, "content", "uima.cas.String", featOkTst);
    casFeatCode_content  = (null == casFeat_content) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_content).getCode();

 
    casFeat_meta = jcas.getRequiredFeatureDE(casType, "meta", "uima.cas.String", featOkTst);
    casFeatCode_meta  = (null == casFeat_meta) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_meta).getCode();

 
    casFeat_prompt = jcas.getRequiredFeatureDE(casType, "prompt", "org.texttechnologylab.type.llm.prompt.Prompt", featOkTst);
    casFeatCode_prompt  = (null == casFeat_prompt) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_prompt).getCode();

  }
}



    