

/* First created by JCasGen Wed Dec 02 17:55:28 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed Dec 02 17:55:28 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyEntity.xml
 * @generated */
public class TextTechnologyEntity extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextTechnologyEntity.class);
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
  protected TextTechnologyEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TextTechnologyEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TextTechnologyEntity(JCas jcas) {
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

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: subvalue

  /** getter for subvalue - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubvalue() {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_subvalue == null)
      jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_subvalue);}
    
  /** setter for subvalue - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubvalue(String v) {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_subvalue == null)
      jcasType.jcas.throwFeatMissing("subvalue", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_subvalue, v);}    
   
    
  //*--------------*
  //* Feature: knowledgeEntries

  /** getter for knowledgeEntries - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getKnowledgeEntries() {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_knowledgeEntries == null)
      jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_knowledgeEntries)));}
    
  /** setter for knowledgeEntries - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKnowledgeEntries(FSArray v) {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_knowledgeEntries == null)
      jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    jcasType.ll_cas.ll_setRefValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_knowledgeEntries, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for knowledgeEntries - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public KnowledgeEntry getKnowledgeEntries(int i) {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_knowledgeEntries == null)
      jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_knowledgeEntries), i);
    return (KnowledgeEntry)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_knowledgeEntries), i)));}

  /** indexed setter for knowledgeEntries - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setKnowledgeEntries(int i, KnowledgeEntry v) { 
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_knowledgeEntries == null)
      jcasType.jcas.throwFeatMissing("knowledgeEntries", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_knowledgeEntries), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_knowledgeEntries), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: begin

  /** getter for begin - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBegin() {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_begin);}
    
  /** setter for begin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(String v) {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_begin == null)
      jcasType.jcas.throwFeatMissing("begin", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_begin, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEnd() {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(String v) {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPos() {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_pos);}
    
  /** setter for pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(String v) {
    if (TextTechnologyEntity_Type.featOkTst && ((TextTechnologyEntity_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.type.TextTechnologyEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextTechnologyEntity_Type)jcasType).casFeatCode_pos, v);}    
  }

    