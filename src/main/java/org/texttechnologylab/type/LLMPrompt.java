

/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Prompt for LLM with the input text. The user Prompt is mandatory, if not set, the LLM will not be called.
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMPrompt extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMPrompt.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected LLMPrompt() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LLMPrompt(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMPrompt(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMPrompt(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: prompt

  /** getter for prompt - gets Prompt for LLM
   * @generated
   * @return value of the feature 
   */
  public String getPrompt() {
    if (LLMPrompt_Type.featOkTst && ((LLMPrompt_Type)jcasType).casFeat_prompt == null)
      jcasType.jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.LLMPrompt");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LLMPrompt_Type)jcasType).casFeatCode_prompt);}
    
  /** setter for prompt - sets Prompt for LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrompt(String v) {
    if (LLMPrompt_Type.featOkTst && ((LLMPrompt_Type)jcasType).casFeat_prompt == null)
      jcasType.jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.LLMPrompt");
    jcasType.ll_cas.ll_setStringValue(addr, ((LLMPrompt_Type)jcasType).casFeatCode_prompt, v);}    
   
    
  //*--------------*
  //* Feature: prefix

  /** getter for prefix - gets Prefix of the Prompt
   * @generated
   * @return value of the feature 
   */
  public LLMPrefixPrompt getPrefix() {
    if (LLMPrompt_Type.featOkTst && ((LLMPrompt_Type)jcasType).casFeat_prefix == null)
      jcasType.jcas.throwFeatMissing("prefix", "org.texttechnologylab.type.LLMPrompt");
    return (LLMPrefixPrompt)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LLMPrompt_Type)jcasType).casFeatCode_prefix)));}
    
  /** setter for prefix - sets Prefix of the Prompt 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrefix(LLMPrefixPrompt v) {
    if (LLMPrompt_Type.featOkTst && ((LLMPrompt_Type)jcasType).casFeat_prefix == null)
      jcasType.jcas.throwFeatMissing("prefix", "org.texttechnologylab.type.LLMPrompt");
    jcasType.ll_cas.ll_setRefValue(addr, ((LLMPrompt_Type)jcasType).casFeatCode_prefix, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: suffix

  /** getter for suffix - gets Suffix after the Prompt for the LLM
   * @generated
   * @return value of the feature 
   */
  public LLMSuffixPrompt getSuffix() {
    if (LLMPrompt_Type.featOkTst && ((LLMPrompt_Type)jcasType).casFeat_suffix == null)
      jcasType.jcas.throwFeatMissing("suffix", "org.texttechnologylab.type.LLMPrompt");
    return (LLMSuffixPrompt)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LLMPrompt_Type)jcasType).casFeatCode_suffix)));}
    
  /** setter for suffix - sets Suffix after the Prompt for the LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuffix(LLMSuffixPrompt v) {
    if (LLMPrompt_Type.featOkTst && ((LLMPrompt_Type)jcasType).casFeat_suffix == null)
      jcasType.jcas.throwFeatMissing("suffix", "org.texttechnologylab.type.LLMPrompt");
    jcasType.ll_cas.ll_setRefValue(addr, ((LLMPrompt_Type)jcasType).casFeatCode_suffix, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: systemPrompt

  /** getter for systemPrompt - gets System Prompt for LLM
   * @generated
   * @return value of the feature 
   */
  public LLMSystemPrompt getSystemPrompt() {
    if (LLMPrompt_Type.featOkTst && ((LLMPrompt_Type)jcasType).casFeat_systemPrompt == null)
      jcasType.jcas.throwFeatMissing("systemPrompt", "org.texttechnologylab.type.LLMPrompt");
    return (LLMSystemPrompt)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LLMPrompt_Type)jcasType).casFeatCode_systemPrompt)));}
    
  /** setter for systemPrompt - sets System Prompt for LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSystemPrompt(LLMSystemPrompt v) {
    if (LLMPrompt_Type.featOkTst && ((LLMPrompt_Type)jcasType).casFeat_systemPrompt == null)
      jcasType.jcas.throwFeatMissing("systemPrompt", "org.texttechnologylab.type.LLMPrompt");
    jcasType.ll_cas.ll_setRefValue(addr, ((LLMPrompt_Type)jcasType).casFeatCode_systemPrompt, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    