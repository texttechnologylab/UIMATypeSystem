
/* First created by JCasGen Thu Jan 16 10:23:52 CET 2025 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Prompt for a LLM containing a list of "messages".
 * Updated by JCasGen Thu Jan 16 14:18:16 CET 2025
 * @generated */
public class Prompt_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Prompt.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.type.llm.prompt.Prompt");
 
  /** @generated */
  final Feature casFeat_messages;
  /** @generated */
  final int     casFeatCode_messages;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMessages(int addr) {
        if (featOkTst && casFeat_messages == null)
      jcas.throwFeatMissing("messages", "org.texttechnologylab.type.llm.prompt.Prompt");
    return ll_cas.ll_getRefValue(addr, casFeatCode_messages);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMessages(int addr, int v) {
        if (featOkTst && casFeat_messages == null)
      jcas.throwFeatMissing("messages", "org.texttechnologylab.type.llm.prompt.Prompt");
    ll_cas.ll_setRefValue(addr, casFeatCode_messages, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getMessages(int addr, int i) {
        if (featOkTst && casFeat_messages == null)
      jcas.throwFeatMissing("messages", "org.texttechnologylab.type.llm.prompt.Prompt");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_messages), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_messages), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_messages), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMessages(int addr, int i, int v) {
        if (featOkTst && casFeat_messages == null)
      jcas.throwFeatMissing("messages", "org.texttechnologylab.type.llm.prompt.Prompt");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_messages), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_messages), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_messages), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_args;
  /** @generated */
  final int     casFeatCode_args;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getArgs(int addr) {
        if (featOkTst && casFeat_args == null)
      jcas.throwFeatMissing("args", "org.texttechnologylab.type.llm.prompt.Prompt");
    return ll_cas.ll_getStringValue(addr, casFeatCode_args);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setArgs(int addr, String v) {
        if (featOkTst && casFeat_args == null)
      jcas.throwFeatMissing("args", "org.texttechnologylab.type.llm.prompt.Prompt");
    ll_cas.ll_setStringValue(addr, casFeatCode_args, v);}
    
  
 
  /** @generated */
  final Feature casFeat_version;
  /** @generated */
  final int     casFeatCode_version;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getVersion(int addr) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.texttechnologylab.type.llm.prompt.Prompt");
    return ll_cas.ll_getStringValue(addr, casFeatCode_version);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVersion(int addr, String v) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.texttechnologylab.type.llm.prompt.Prompt");
    ll_cas.ll_setStringValue(addr, casFeatCode_version, v);}
    
  
 
  /** @generated */
  final Feature casFeat_reference;
  /** @generated */
  final int     casFeatCode_reference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReference(int addr) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.type.llm.prompt.Prompt");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.type.llm.prompt.Prompt");
    ll_cas.ll_setRefValue(addr, casFeatCode_reference, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Prompt_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_messages = jcas.getRequiredFeatureDE(casType, "messages", "uima.cas.FSArray", featOkTst);
    casFeatCode_messages  = (null == casFeat_messages) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_messages).getCode();

 
    casFeat_args = jcas.getRequiredFeatureDE(casType, "args", "uima.cas.String", featOkTst);
    casFeatCode_args  = (null == casFeat_args) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_args).getCode();

 
    casFeat_version = jcas.getRequiredFeatureDE(casType, "version", "uima.cas.String", featOkTst);
    casFeatCode_version  = (null == casFeat_version) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_version).getCode();

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.cas.TOP", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

  }
}



    