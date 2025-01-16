

/* First created by JCasGen Thu Jan 16 10:23:52 CET 2025 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** Prompt for a LLM containing a list of "messages".
 * Updated by JCasGen Thu Jan 16 14:18:16 CET 2025
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
   
    
  //*--------------*
  //* Feature: args

  /** getter for args - gets Prompt arguments
   * @generated
   * @return value of the feature 
   */
  public String getArgs() {
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_args == null)
      jcasType.jcas.throwFeatMissing("args", "org.texttechnologylab.type.llm.prompt.Prompt");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Prompt_Type)jcasType).casFeatCode_args);}
    
  /** setter for args - sets Prompt arguments 
   * @generated
   * @param v value to set into the feature 
   */
  public void setArgs(String v) {
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_args == null)
      jcasType.jcas.throwFeatMissing("args", "org.texttechnologylab.type.llm.prompt.Prompt");
    jcasType.ll_cas.ll_setStringValue(addr, ((Prompt_Type)jcasType).casFeatCode_args, v);}    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVersion() {
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.type.llm.prompt.Prompt");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Prompt_Type)jcasType).casFeatCode_version);}
    
  /** setter for version - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.type.llm.prompt.Prompt");
    jcasType.ll_cas.ll_setStringValue(addr, ((Prompt_Type)jcasType).casFeatCode_version, v);}    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets Reference to another annotation
   * @generated
   * @return value of the feature 
   */
  public TOP getReference() {
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.type.llm.prompt.Prompt");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Prompt_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets Reference to another annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(TOP v) {
    if (Prompt_Type.featOkTst && ((Prompt_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.type.llm.prompt.Prompt");
    jcasType.ll_cas.ll_setRefValue(addr, ((Prompt_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    