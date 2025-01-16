

/* First created by JCasGen Thu Jan 16 10:23:52 CET 2025 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** Prompt for a LLM containing a list of "messages".
 * Updated by JCasGen Thu Jan 16 11:25:03 CET 2025
 * XML source: /home/staff_homes/dbaumart/dev/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyLLM.xml
 * @generated */
public class Prompt extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Prompt.class);
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
  protected Prompt() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Prompt(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Prompt(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Prompt(JCas jcas, int begin, int end) {
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
  //* Feature: messages

  /** getter for messages - gets The list of messages for this prompt.
   * @generated
   * @return value of the feature 
   */
  public FSArray getMessages() {
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_messages == null)
      jcasType.jcas.throwFeatMissing("messages", "org.texttechnologylab.type.llm.prompt.Prompt");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Prompt_Type)jcasType).casFeatCode_messages)));}
    
  /** setter for messages - sets The list of messages for this prompt. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMessages(FSArray v) {
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_messages == null)
      jcasType.jcas.throwFeatMissing("messages", "org.texttechnologylab.type.llm.prompt.Prompt");
    jcasType.ll_cas.ll_setRefValue(addr, ((Prompt_Type)jcasType).casFeatCode_messages, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for messages - gets an indexed value - The list of messages for this prompt.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Message getMessages(int i) {
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_messages == null)
      jcasType.jcas.throwFeatMissing("messages", "org.texttechnologylab.type.llm.prompt.Prompt");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Prompt_Type)jcasType).casFeatCode_messages), i);
    return (Message)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Prompt_Type)jcasType).casFeatCode_messages), i)));}

  /** indexed setter for messages - sets an indexed value - The list of messages for this prompt.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMessages(int i, Message v) { 
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_messages == null)
      jcasType.jcas.throwFeatMissing("messages", "org.texttechnologylab.type.llm.prompt.Prompt");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Prompt_Type)jcasType).casFeatCode_messages), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Prompt_Type)jcasType).casFeatCode_messages), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    