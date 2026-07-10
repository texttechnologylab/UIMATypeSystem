

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TopicValueBase extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopicValueBase.class);
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
  protected TopicValueBase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TopicValueBase(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TopicValueBase(JCas jcas) {
    super(jcas);
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
  //* Feature: value

  /** getter for value - gets Topic Label
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (TopicValueBase_Type.featOkTst && ((TopicValueBase_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.TopicValueBase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TopicValueBase_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets Topic Label 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (TopicValueBase_Type.featOkTst && ((TopicValueBase_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.TopicValueBase");
    jcasType.ll_cas.ll_setStringValue(addr, ((TopicValueBase_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: words

  /** getter for words - gets Set of words with probabilities
   * @generated
   * @return value of the feature 
   */
  public FSArray getWords() {
    if (TopicValueBase_Type.featOkTst && ((TopicValueBase_Type)jcasType).casFeat_words == null)
      jcasType.jcas.throwFeatMissing("words", "org.texttechnologylab.annotation.TopicValueBase");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TopicValueBase_Type)jcasType).casFeatCode_words)));}
    
  /** setter for words - sets Set of words with probabilities 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWords(FSArray v) {
    if (TopicValueBase_Type.featOkTst && ((TopicValueBase_Type)jcasType).casFeat_words == null)
      jcasType.jcas.throwFeatMissing("words", "org.texttechnologylab.annotation.TopicValueBase");
    jcasType.ll_cas.ll_setRefValue(addr, ((TopicValueBase_Type)jcasType).casFeatCode_words, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for words - gets an indexed value - Set of words with probabilities
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TopicWord getWords(int i) {
    if (TopicValueBase_Type.featOkTst && ((TopicValueBase_Type)jcasType).casFeat_words == null)
      jcasType.jcas.throwFeatMissing("words", "org.texttechnologylab.annotation.TopicValueBase");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TopicValueBase_Type)jcasType).casFeatCode_words), i);
    return (TopicWord)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TopicValueBase_Type)jcasType).casFeatCode_words), i)));}

  /** indexed setter for words - sets an indexed value - Set of words with probabilities
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setWords(int i, TopicWord v) { 
    if (TopicValueBase_Type.featOkTst && ((TopicValueBase_Type)jcasType).casFeat_words == null)
      jcasType.jcas.throwFeatMissing("words", "org.texttechnologylab.annotation.TopicValueBase");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TopicValueBase_Type)jcasType).casFeatCode_words), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TopicValueBase_Type)jcasType).casFeatCode_words), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    