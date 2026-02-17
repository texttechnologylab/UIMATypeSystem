

/* First created by JCasGen Tue Feb 17 20:19:38 CET 2026 */
package org.texttechnologylab.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Prefix Prompt for LLM. It is optional, if not set, will be placed before the user Prompt. For example adding additional information to the Prompt.
 * Updated by JCasGen Tue Feb 17 20:19:38 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMPrefixPrompt extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMPrefixPrompt.class);
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
  protected LLMPrefixPrompt() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LLMPrefixPrompt(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMPrefixPrompt(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMPrefixPrompt(JCas jcas, int begin, int end) {
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

  /** getter for message - gets Prefix before the Prompt for LLM
   * @generated
   * @return value of the feature 
   */
  public String getMessage() {
    if (LLMPrefixPrompt_Type.featOkTst && ((LLMPrefixPrompt_Type)jcasType).casFeat_message == null)
      jcasType.jcas.throwFeatMissing("message", "org.texttechnologylab.type.LLMPrefixPrompt");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LLMPrefixPrompt_Type)jcasType).casFeatCode_message);}
    
  /** setter for message - sets Prefix before the Prompt for LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMessage(String v) {
    if (LLMPrefixPrompt_Type.featOkTst && ((LLMPrefixPrompt_Type)jcasType).casFeat_message == null)
      jcasType.jcas.throwFeatMissing("message", "org.texttechnologylab.type.LLMPrefixPrompt");
    jcasType.ll_cas.ll_setStringValue(addr, ((LLMPrefixPrompt_Type)jcasType).casFeatCode_message, v);}    
  }

    