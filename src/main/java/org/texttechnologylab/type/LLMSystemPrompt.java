

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** System Prompt for LLM, it is optional, if not set, already System Prompt in the LLM will be used or No System Prompt will be used
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMSystemPrompt extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMSystemPrompt.class);
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
  protected LLMSystemPrompt() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LLMSystemPrompt(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMSystemPrompt(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMSystemPrompt(JCas jcas, int begin, int end) {
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
  //* Feature: message

  /** getter for message - gets System Prompt for LLM
   * @generated
   * @return value of the feature 
   */
  public String getMessage() {
    if (LLMSystemPrompt_Type.featOkTst && ((LLMSystemPrompt_Type)jcasType).casFeat_message == null)
      jcasType.jcas.throwFeatMissing("message", "org.texttechnologylab.type.LLMSystemPrompt");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LLMSystemPrompt_Type)jcasType).casFeatCode_message);}
    
  /** setter for message - sets System Prompt for LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMessage(String v) {
    if (LLMSystemPrompt_Type.featOkTst && ((LLMSystemPrompt_Type)jcasType).casFeat_message == null)
      jcasType.jcas.throwFeatMissing("message", "org.texttechnologylab.type.LLMSystemPrompt");
    jcasType.ll_cas.ll_setStringValue(addr, ((LLMSystemPrompt_Type)jcasType).casFeatCode_message, v);}    
  }

    