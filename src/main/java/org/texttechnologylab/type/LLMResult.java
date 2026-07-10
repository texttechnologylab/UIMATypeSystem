

/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Result of LLM with the reference to the corresponding prompt.
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMResult extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMResult.class);
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
  protected LLMResult() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LLMResult(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMResult(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMResult(JCas jcas, int begin, int end) {
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
  //* Feature: meta

  /** getter for meta - gets Additional metadata (Parameter). Additionally the duration
   * @generated
   * @return value of the feature 
   */
  public String getMeta() {
    if (LLMResult_Type.featOkTst && ((LLMResult_Type)jcasType).casFeat_meta == null)
      jcasType.jcas.throwFeatMissing("meta", "org.texttechnologylab.type.LLMResult");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LLMResult_Type)jcasType).casFeatCode_meta);}
    
  /** setter for meta - sets Additional metadata (Parameter). Additionally the duration 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeta(String v) {
    if (LLMResult_Type.featOkTst && ((LLMResult_Type)jcasType).casFeat_meta == null)
      jcasType.jcas.throwFeatMissing("meta", "org.texttechnologylab.type.LLMResult");
    jcasType.ll_cas.ll_setStringValue(addr, ((LLMResult_Type)jcasType).casFeatCode_meta, v);}    
   
    
  //*--------------*
  //* Feature: prompt

  /** getter for prompt - gets Reference to the corresponding prompt
   * @generated
   * @return value of the feature 
   */
  public LLMPrompt getPrompt() {
    if (LLMResult_Type.featOkTst && ((LLMResult_Type)jcasType).casFeat_prompt == null)
      jcasType.jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.LLMResult");
    return (LLMPrompt)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LLMResult_Type)jcasType).casFeatCode_prompt)));}
    
  /** setter for prompt - sets Reference to the corresponding prompt 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrompt(LLMPrompt v) {
    if (LLMResult_Type.featOkTst && ((LLMResult_Type)jcasType).casFeat_prompt == null)
      jcasType.jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.LLMResult");
    jcasType.ll_cas.ll_setRefValue(addr, ((LLMResult_Type)jcasType).casFeatCode_prompt, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: result

  /** getter for result - gets Result in a json-String Format of LLM
   * @generated
   * @return value of the feature 
   */
  public String getResult() {
    if (LLMResult_Type.featOkTst && ((LLMResult_Type)jcasType).casFeat_result == null)
      jcasType.jcas.throwFeatMissing("result", "org.texttechnologylab.type.LLMResult");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LLMResult_Type)jcasType).casFeatCode_result);}
    
  /** setter for result - sets Result in a json-String Format of LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setResult(String v) {
    if (LLMResult_Type.featOkTst && ((LLMResult_Type)jcasType).casFeat_result == null)
      jcasType.jcas.throwFeatMissing("result", "org.texttechnologylab.type.LLMResult");
    jcasType.ll_cas.ll_setStringValue(addr, ((LLMResult_Type)jcasType).casFeatCode_result, v);}    
   
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets Content of result as string extracted from the result.
   * @generated
   * @return value of the feature 
   */
  public String getContent() {
    if (LLMResult_Type.featOkTst && ((LLMResult_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "org.texttechnologylab.type.LLMResult");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LLMResult_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets Content of result as string extracted from the result. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    if (LLMResult_Type.featOkTst && ((LLMResult_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "org.texttechnologylab.type.LLMResult");
    jcasType.ll_cas.ll_setStringValue(addr, ((LLMResult_Type)jcasType).casFeatCode_content, v);}    
  }

    