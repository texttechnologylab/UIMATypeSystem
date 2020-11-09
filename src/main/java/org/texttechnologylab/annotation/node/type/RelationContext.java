

/* First created by JCasGen Thu Nov 05 17:33:42 CET 2020 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.type.Node;


/** 
 * Updated by JCasGen Thu Nov 05 17:33:42 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 * @generated */
public class RelationContext extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationContext.class);
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
  protected RelationContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RelationContext(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationContext(JCas jcas) {
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
  //* Feature: relatesTo

  /** getter for relatesTo - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRelatesTo() {
    if (RelationContext_Type.featOkTst && ((RelationContext_Type)jcasType).casFeat_relatesTo == null)
      jcasType.jcas.throwFeatMissing("relatesTo", "org.texttechnologylab.annotation.node.type.RelationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationContext_Type)jcasType).casFeatCode_relatesTo);}
    
  /** setter for relatesTo - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelatesTo(String v) {
    if (RelationContext_Type.featOkTst && ((RelationContext_Type)jcasType).casFeat_relatesTo == null)
      jcasType.jcas.throwFeatMissing("relatesTo", "org.texttechnologylab.annotation.node.type.RelationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationContext_Type)jcasType).casFeatCode_relatesTo, v);}    
   
    
  //*--------------*
  //* Feature: ReferencedID

  /** getter for ReferencedID - gets 
   * @generated
   * @return value of the feature 
   */
  public int getReferencedID() {
    if (RelationContext_Type.featOkTst && ((RelationContext_Type)jcasType).casFeat_ReferencedID == null)
      jcasType.jcas.throwFeatMissing("ReferencedID", "org.texttechnologylab.annotation.node.type.RelationContext");
    return jcasType.ll_cas.ll_getIntValue(addr, ((RelationContext_Type)jcasType).casFeatCode_ReferencedID);}
    
  /** setter for ReferencedID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferencedID(int v) {
    if (RelationContext_Type.featOkTst && ((RelationContext_Type)jcasType).casFeat_ReferencedID == null)
      jcasType.jcas.throwFeatMissing("ReferencedID", "org.texttechnologylab.annotation.node.type.RelationContext");
    jcasType.ll_cas.ll_setIntValue(addr, ((RelationContext_Type)jcasType).casFeatCode_ReferencedID, v);}    
   
    
  //*--------------*
  //* Feature: displayName

  /** getter for displayName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDisplayName() {
    if (RelationContext_Type.featOkTst && ((RelationContext_Type)jcasType).casFeat_displayName == null)
      jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.RelationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationContext_Type)jcasType).casFeatCode_displayName);}
    
  /** setter for displayName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDisplayName(String v) {
    if (RelationContext_Type.featOkTst && ((RelationContext_Type)jcasType).casFeat_displayName == null)
      jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.RelationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationContext_Type)jcasType).casFeatCode_displayName, v);}    
   
    
  //*--------------*
  //* Feature: wikiDataID

  /** getter for wikiDataID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWikiDataID() {
    if (RelationContext_Type.featOkTst && ((RelationContext_Type)jcasType).casFeat_wikiDataID == null)
      jcasType.jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.RelationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationContext_Type)jcasType).casFeatCode_wikiDataID);}
    
  /** setter for wikiDataID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikiDataID(String v) {
    if (RelationContext_Type.featOkTst && ((RelationContext_Type)jcasType).casFeat_wikiDataID == null)
      jcasType.jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.RelationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationContext_Type)jcasType).casFeatCode_wikiDataID, v);}    
  }

    