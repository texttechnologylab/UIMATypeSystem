

/* First created by JCasGen Thu Jan 16 10:23:52 CET 2025 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


import org.apache.uima.jcas.cas.FSList;


/** List of messages.
 * Updated by JCasGen Thu Jan 16 11:25:03 CET 2025
 * XML source: /home/staff_homes/dbaumart/dev/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyLLM.xml
 * @generated */
public class Message extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Message.class);
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
  protected Message() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Message(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Message(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Message(JCas jcas, int begin, int end) {
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
  //* Feature: role

  /** getter for role - gets Role, e.g. "system", "user", ...
   * @generated
   * @return value of the feature 
   */
  public String getRole() {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "org.texttechnologylab.type.llm.prompt.Message");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Message_Type)jcasType).casFeatCode_role);}
    
  /** setter for role - sets Role, e.g. "system", "user", ... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "org.texttechnologylab.type.llm.prompt.Message");
    jcasType.ll_cas.ll_setStringValue(addr, ((Message_Type)jcasType).casFeatCode_role, v);}    
   
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets Message content.
   * @generated
   * @return value of the feature 
   */
  public String getContent() {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "org.texttechnologylab.type.llm.prompt.Message");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Message_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets Message content. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "org.texttechnologylab.type.llm.prompt.Message");
    jcasType.ll_cas.ll_setStringValue(addr, ((Message_Type)jcasType).casFeatCode_content, v);}    
  }

    