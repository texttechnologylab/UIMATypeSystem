

/* First created by JCasGen Fri Mar 20 09:14:07 CET 2020 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.type.Node;


/** 
 * Updated by JCasGen Fri Mar 20 09:14:07 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 * @generated */
public class RelationGroup extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationGroup.class);
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
  protected RelationGroup() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RelationGroup(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationGroup(JCas jcas) {
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
  //* Feature: relation

  /** getter for relation - gets 
   * @generated
   * @return value of the feature 
   */
  public RelationContext getRelation() {
    if (RelationGroup_Type.featOkTst && ((RelationGroup_Type)jcasType).casFeat_relation == null)
      jcasType.jcas.throwFeatMissing("relation", "org.texttechnologylab.annotation.node.type.RelationGroup");
    return (RelationContext)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RelationGroup_Type)jcasType).casFeatCode_relation)));}
    
  /** setter for relation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelation(RelationContext v) {
    if (RelationGroup_Type.featOkTst && ((RelationGroup_Type)jcasType).casFeat_relation == null)
      jcasType.jcas.throwFeatMissing("relation", "org.texttechnologylab.annotation.node.type.RelationGroup");
    jcasType.ll_cas.ll_setRefValue(addr, ((RelationGroup_Type)jcasType).casFeatCode_relation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: locationID

  /** getter for locationID - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLocationID() {
    if (RelationGroup_Type.featOkTst && ((RelationGroup_Type)jcasType).casFeat_locationID == null)
      jcasType.jcas.throwFeatMissing("locationID", "org.texttechnologylab.annotation.node.type.RelationGroup");
    return jcasType.ll_cas.ll_getIntValue(addr, ((RelationGroup_Type)jcasType).casFeatCode_locationID);}
    
  /** setter for locationID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocationID(int v) {
    if (RelationGroup_Type.featOkTst && ((RelationGroup_Type)jcasType).casFeat_locationID == null)
      jcasType.jcas.throwFeatMissing("locationID", "org.texttechnologylab.annotation.node.type.RelationGroup");
    jcasType.ll_cas.ll_setIntValue(addr, ((RelationGroup_Type)jcasType).casFeatCode_locationID, v);}    
   
    
  //*--------------*
  //* Feature: sentence

  /** getter for sentence - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSentence() {
    if (RelationGroup_Type.featOkTst && ((RelationGroup_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "org.texttechnologylab.annotation.node.type.RelationGroup");
    return jcasType.ll_cas.ll_getIntValue(addr, ((RelationGroup_Type)jcasType).casFeatCode_sentence);}
    
  /** setter for sentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentence(int v) {
    if (RelationGroup_Type.featOkTst && ((RelationGroup_Type)jcasType).casFeat_sentence == null)
      jcasType.jcas.throwFeatMissing("sentence", "org.texttechnologylab.annotation.node.type.RelationGroup");
    jcasType.ll_cas.ll_setIntValue(addr, ((RelationGroup_Type)jcasType).casFeatCode_sentence, v);}    
  }

    