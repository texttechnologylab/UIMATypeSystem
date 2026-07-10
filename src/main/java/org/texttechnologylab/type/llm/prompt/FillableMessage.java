

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.type.llm.prompt;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** This message is supposed to be filled by an LLM by using the previous messages as input/history.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class FillableMessage extends Message {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FillableMessage.class);
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
  protected FillableMessage() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public FillableMessage(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FillableMessage(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public FillableMessage(JCas jcas, int begin, int end) {
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
  //* Feature: contextName

  /** getter for contextName - gets If a contextName is given, the "content" of this message will be added to the model invocation to be used in a template placeholder
   * @generated
   * @return value of the feature 
   */
  public String getContextName() {
    if (FillableMessage_Type.featOkTst && ((FillableMessage_Type)jcasType).casFeat_contextName == null)
      jcasType.jcas.throwFeatMissing("contextName", "org.texttechnologylab.type.llm.prompt.FillableMessage");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FillableMessage_Type)jcasType).casFeatCode_contextName);}
    
  /** setter for contextName - sets If a contextName is given, the "content" of this message will be added to the model invocation to be used in a template placeholder 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextName(String v) {
    if (FillableMessage_Type.featOkTst && ((FillableMessage_Type)jcasType).casFeat_contextName == null)
      jcasType.jcas.throwFeatMissing("contextName", "org.texttechnologylab.type.llm.prompt.FillableMessage");
    jcasType.ll_cas.ll_setStringValue(addr, ((FillableMessage_Type)jcasType).casFeatCode_contextName, v);}    
  }

    