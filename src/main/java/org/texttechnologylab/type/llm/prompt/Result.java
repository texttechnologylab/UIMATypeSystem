

/* First created by JCasGen Thu Jan 16 13:35:57 CET 2025 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** LLM result
 * Updated by JCasGen Thu Jan 16 14:18:16 CET 2025
 * XML source: /home/staff_homes/dbaumart/dev/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyLLM.xml
 * @generated */
public class Result extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Result.class);
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
  protected Result() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Result(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Result(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Result(JCas jcas, int begin, int end) {
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
  //* Feature: content

  /** getter for content - gets Message content
   * @generated
   * @return value of the feature 
   */
  public String getContent() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "org.texttechnologylab.type.llm.prompt.Result");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Result_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets Message content 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "org.texttechnologylab.type.llm.prompt.Result");
    jcasType.ll_cas.ll_setStringValue(addr, ((Result_Type)jcasType).casFeatCode_content, v);}    
   
    
  //*--------------*
  //* Feature: meta

  /** getter for meta - gets Additional metadata
   * @generated
   * @return value of the feature 
   */
  public String getMeta() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_meta == null)
      jcasType.jcas.throwFeatMissing("meta", "org.texttechnologylab.type.llm.prompt.Result");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Result_Type)jcasType).casFeatCode_meta);}
    
  /** setter for meta - sets Additional metadata 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeta(String v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_meta == null)
      jcasType.jcas.throwFeatMissing("meta", "org.texttechnologylab.type.llm.prompt.Result");
    jcasType.ll_cas.ll_setStringValue(addr, ((Result_Type)jcasType).casFeatCode_meta, v);}    
   
    
  //*--------------*
  //* Feature: prompt

  /** getter for prompt - gets 
   * @generated
   * @return value of the feature 
   */
  public Prompt getPrompt() {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_prompt == null)
      jcasType.jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.llm.prompt.Result");
    return (Prompt)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Result_Type)jcasType).casFeatCode_prompt)));}
    
  /** setter for prompt - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrompt(Prompt v) {
    if (Result_Type.featOkTst && ((Result_Type)jcasType).casFeat_prompt == null)
      jcasType.jcas.throwFeatMissing("prompt", "org.texttechnologylab.type.llm.prompt.Result");
    jcasType.ll_cas.ll_setRefValue(addr, ((Result_Type)jcasType).casFeatCode_prompt, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    