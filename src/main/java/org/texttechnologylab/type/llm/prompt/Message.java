

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** List of messages.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
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
   
    
  //*--------------*
  //* Feature: classModule

  /** getter for classModule - gets Name of the module of the class to use for constructing the message
   * @generated
   * @return value of the feature 
   */
  public String getClassModule() {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_classModule == null)
      jcasType.jcas.throwFeatMissing("classModule", "org.texttechnologylab.type.llm.prompt.Message");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Message_Type)jcasType).casFeatCode_classModule);}
    
  /** setter for classModule - sets Name of the module of the class to use for constructing the message 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassModule(String v) {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_classModule == null)
      jcasType.jcas.throwFeatMissing("classModule", "org.texttechnologylab.type.llm.prompt.Message");
    jcasType.ll_cas.ll_setStringValue(addr, ((Message_Type)jcasType).casFeatCode_classModule, v);}    
   
    
  //*--------------*
  //* Feature: className

  /** getter for className - gets Name of the class to use for constructing the message
   * @generated
   * @return value of the feature 
   */
  public String getClassName() {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_className == null)
      jcasType.jcas.throwFeatMissing("className", "org.texttechnologylab.type.llm.prompt.Message");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Message_Type)jcasType).casFeatCode_className);}
    
  /** setter for className - sets Name of the class to use for constructing the message 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassName(String v) {
    if (Message_Type.featOkTst && ((Message_Type)jcasType).casFeat_className == null)
      jcasType.jcas.throwFeatMissing("className", "org.texttechnologylab.type.llm.prompt.Message");
    jcasType.ll_cas.ll_setStringValue(addr, ((Message_Type)jcasType).casFeatCode_className, v);}    
  }

    