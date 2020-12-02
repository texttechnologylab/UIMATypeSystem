

/* First created by JCasGen Wed Dec 02 18:39:22 CET 2020 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.type.Node;


/** 
 * Updated by JCasGen Wed Dec 02 18:39:22 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 * @generated */
public class Context extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Context.class);
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
  protected Context() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Context(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Context(JCas jcas) {
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
  //* Feature: ReferencedID

  /** getter for ReferencedID - gets 
   * @generated
   * @return value of the feature 
   */
  public int getReferencedID() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_ReferencedID == null)
      jcasType.jcas.throwFeatMissing("ReferencedID", "org.texttechnologylab.annotation.node.type.Context");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Context_Type)jcasType).casFeatCode_ReferencedID);}
    
  /** setter for ReferencedID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferencedID(int v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_ReferencedID == null)
      jcasType.jcas.throwFeatMissing("ReferencedID", "org.texttechnologylab.annotation.node.type.Context");
    jcasType.ll_cas.ll_setIntValue(addr, ((Context_Type)jcasType).casFeatCode_ReferencedID, v);}    
   
    
  //*--------------*
  //* Feature: displayName

  /** getter for displayName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDisplayName() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_displayName == null)
      jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.Context");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Context_Type)jcasType).casFeatCode_displayName);}
    
  /** setter for displayName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDisplayName(String v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_displayName == null)
      jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.Context");
    jcasType.ll_cas.ll_setStringValue(addr, ((Context_Type)jcasType).casFeatCode_displayName, v);}    
   
    
  //*--------------*
  //* Feature: wikiDataID

  /** getter for wikiDataID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWikiDataID() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_wikiDataID == null)
      jcasType.jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.Context");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Context_Type)jcasType).casFeatCode_wikiDataID);}
    
  /** setter for wikiDataID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikiDataID(String v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_wikiDataID == null)
      jcasType.jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.Context");
    jcasType.ll_cas.ll_setStringValue(addr, ((Context_Type)jcasType).casFeatCode_wikiDataID, v);}    
   
    
  //*--------------*
  //* Feature: image

  /** getter for image - gets 
   * @generated
   * @return value of the feature 
   */
  public String getImage() {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.Context");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Context_Type)jcasType).casFeatCode_image);}
    
  /** setter for image - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setImage(String v) {
    if (Context_Type.featOkTst && ((Context_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.Context");
    jcasType.ll_cas.ll_setStringValue(addr, ((Context_Type)jcasType).casFeatCode_image, v);}    
  }

    