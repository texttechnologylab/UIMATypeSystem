

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
public class EntityVis extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EntityVis.class);
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
  protected EntityVis() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EntityVis(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EntityVis(JCas jcas) {
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
  //* Feature: geonamesID

  /** getter for geonamesID - gets 
   * @generated
   * @return value of the feature 
   */
  public int getGeonamesID() {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_geonamesID == null)
      jcasType.jcas.throwFeatMissing("geonamesID", "org.texttechnologylab.annotation.node.type.EntityVis");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EntityVis_Type)jcasType).casFeatCode_geonamesID);}
    
  /** setter for geonamesID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeonamesID(int v) {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_geonamesID == null)
      jcasType.jcas.throwFeatMissing("geonamesID", "org.texttechnologylab.annotation.node.type.EntityVis");
    jcasType.ll_cas.ll_setIntValue(addr, ((EntityVis_Type)jcasType).casFeatCode_geonamesID, v);}    
   
    
  //*--------------*
  //* Feature: geoJson

  /** getter for geoJson - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeoJson() {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_geoJson == null)
      jcasType.jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.node.type.EntityVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_geoJson);}
    
  /** setter for geoJson - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeoJson(String v) {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_geoJson == null)
      jcasType.jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.node.type.EntityVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_geoJson, v);}    
   
    
  //*--------------*
  //* Feature: displayName

  /** getter for displayName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDisplayName() {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_displayName == null)
      jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.EntityVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_displayName);}
    
  /** setter for displayName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDisplayName(String v) {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_displayName == null)
      jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.EntityVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_displayName, v);}    
   
    
  //*--------------*
  //* Feature: ofClass

  /** getter for ofClass - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOfClass() {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_ofClass == null)
      jcasType.jcas.throwFeatMissing("ofClass", "org.texttechnologylab.annotation.node.type.EntityVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_ofClass);}
    
  /** setter for ofClass - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOfClass(String v) {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_ofClass == null)
      jcasType.jcas.throwFeatMissing("ofClass", "org.texttechnologylab.annotation.node.type.EntityVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_ofClass, v);}    
   
    
  //*--------------*
  //* Feature: image

  /** getter for image - gets 
   * @generated
   * @return value of the feature 
   */
  public String getImage() {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.EntityVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_image);}
    
  /** setter for image - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setImage(String v) {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.EntityVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_image, v);}    
   
    
  //*--------------*
  //* Feature: wikiDataID

  /** getter for wikiDataID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWikiDataID() {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_wikiDataID == null)
      jcasType.jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.EntityVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_wikiDataID);}
    
  /** setter for wikiDataID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikiDataID(String v) {
    if (EntityVis_Type.featOkTst && ((EntityVis_Type)jcasType).casFeat_wikiDataID == null)
      jcasType.jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.EntityVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((EntityVis_Type)jcasType).casFeatCode_wikiDataID, v);}    
  }

    