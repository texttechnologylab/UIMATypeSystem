

/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Suffix Prompt for LLM. It is optional, if not set, will be placed after the user Prompt. For example adding additional information to the Prompt.
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMSuffixPrompt extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMSuffixPrompt.class);
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
  protected LLMSuffixPrompt() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LLMSuffixPrompt(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMSuffixPrompt(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMSuffixPrompt(JCas jcas, int begin, int end) {
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

  /** getter for message - gets Suffix after the Prompt for LLM
   * @generated
   * @return value of the feature 
   */
  public String getMessage() {
    if (LLMSuffixPrompt_Type.featOkTst && ((LLMSuffixPrompt_Type)jcasType).casFeat_message == null)
      jcasType.jcas.throwFeatMissing("message", "org.texttechnologylab.type.LLMSuffixPrompt");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LLMSuffixPrompt_Type)jcasType).casFeatCode_message);}
    
  /** setter for message - sets Suffix after the Prompt for LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMessage(String v) {
    if (LLMSuffixPrompt_Type.featOkTst && ((LLMSuffixPrompt_Type)jcasType).casFeat_message == null)
      jcasType.jcas.throwFeatMissing("message", "org.texttechnologylab.type.LLMSuffixPrompt");
    jcasType.ll_cas.ll_setStringValue(addr, ((LLMSuffixPrompt_Type)jcasType).casFeatCode_message, v);}    
  }

    