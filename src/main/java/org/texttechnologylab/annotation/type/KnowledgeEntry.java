

/* First created by JCasGen Wed Dec 02 18:39:16 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Dec 02 18:39:24 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyEntity.xml
 * @generated */
public class KnowledgeEntry extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(KnowledgeEntry.class);
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
  protected KnowledgeEntry() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public KnowledgeEntry(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public KnowledgeEntry(JCas jcas) {
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
  //* Feature: identifier

  /** getter for identifier - gets 
   * @generated
   * @return value of the feature 
   */
  public String getIdentifier() {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_identifier == null)
      jcasType.jcas.throwFeatMissing("identifier", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_identifier);}
    
  /** setter for identifier - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIdentifier(String v) {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_identifier == null)
      jcasType.jcas.throwFeatMissing("identifier", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_identifier, v);}    
   
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public String getReference() {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_reference);}
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(String v) {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_reference, v);}    
   
    
  //*--------------*
  //* Feature: parentEntity

  /** getter for parentEntity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getParentEntity() {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_parentEntity == null)
      jcasType.jcas.throwFeatMissing("parentEntity", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    return jcasType.ll_cas.ll_getStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_parentEntity);}
    
  /** setter for parentEntity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParentEntity(String v) {
    if (KnowledgeEntry_Type.featOkTst && ((KnowledgeEntry_Type)jcasType).casFeat_parentEntity == null)
      jcasType.jcas.throwFeatMissing("parentEntity", "org.texttechnologylab.annotation.type.KnowledgeEntry");
    jcasType.ll_cas.ll_setStringValue(addr, ((KnowledgeEntry_Type)jcasType).casFeatCode_parentEntity, v);}    
  }

    