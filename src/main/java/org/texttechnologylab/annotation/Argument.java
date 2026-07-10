

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Argument
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Argument extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Argument.class);
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
  protected Argument() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Argument(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Argument(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Argument(JCas jcas, int begin, int end) {
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
  //* Feature: topic

  /** getter for topic - gets Topic which is related to topic
   * @generated
   * @return value of the feature 
   */
  public String getTopic() {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "org.texttechnologylab.annotation.Argument");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Argument_Type)jcasType).casFeatCode_topic);}
    
  /** setter for topic - sets Topic which is related to topic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopic(String v) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "org.texttechnologylab.annotation.Argument");
    jcasType.ll_cas.ll_setStringValue(addr, ((Argument_Type)jcasType).casFeatCode_topic, v);}    
   
    
  //*--------------*
  //* Feature: Arguments

  /** getter for Arguments - gets Set of Argument with key and Value
   * @generated
   * @return value of the feature 
   */
  public FSArray getArguments() {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_Arguments == null)
      jcasType.jcas.throwFeatMissing("Arguments", "org.texttechnologylab.annotation.Argument");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_Arguments)));}
    
  /** setter for Arguments - sets Set of Argument with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setArguments(FSArray v) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_Arguments == null)
      jcasType.jcas.throwFeatMissing("Arguments", "org.texttechnologylab.annotation.Argument");
    jcasType.ll_cas.ll_setRefValue(addr, ((Argument_Type)jcasType).casFeatCode_Arguments, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Arguments - gets an indexed value - Set of Argument with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnnotationComment getArguments(int i) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_Arguments == null)
      jcasType.jcas.throwFeatMissing("Arguments", "org.texttechnologylab.annotation.Argument");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_Arguments), i);
    return (AnnotationComment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_Arguments), i)));}

  /** indexed setter for Arguments - sets an indexed value - Set of Argument with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setArguments(int i, AnnotationComment v) { 
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_Arguments == null)
      jcasType.jcas.throwFeatMissing("Arguments", "org.texttechnologylab.annotation.Argument");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_Arguments), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_Arguments), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: reason

  /** getter for reason - gets reason for the output if its provided
   * @generated
   * @return value of the feature 
   */
  public String getReason() {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_reason == null)
      jcasType.jcas.throwFeatMissing("reason", "org.texttechnologylab.annotation.Argument");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Argument_Type)jcasType).casFeatCode_reason);}
    
  /** setter for reason - sets reason for the output if its provided 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(String v) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_reason == null)
      jcasType.jcas.throwFeatMissing("reason", "org.texttechnologylab.annotation.Argument");
    jcasType.ll_cas.ll_setStringValue(addr, ((Argument_Type)jcasType).casFeatCode_reason, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Argument");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Argument_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Argument_Type.featOkTst && ((Argument_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Argument");
    jcasType.ll_cas.ll_setRefValue(addr, ((Argument_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    