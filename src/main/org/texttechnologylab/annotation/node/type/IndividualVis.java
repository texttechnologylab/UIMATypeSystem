

/* First created by JCasGen Wed Dec 02 17:55:31 CET 2020 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FloatArray;
import org.texttechnologylab.annotation.type.Node;


/** 
 * Updated by JCasGen Wed Dec 02 17:55:31 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 * @generated */
public class IndividualVis extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(IndividualVis.class);
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
  protected IndividualVis() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public IndividualVis(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public IndividualVis(JCas jcas) {
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
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_geonamesID == null)
      jcasType.jcas.throwFeatMissing("geonamesID", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return jcasType.ll_cas.ll_getIntValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_geonamesID);}
    
  /** setter for geonamesID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeonamesID(int v) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_geonamesID == null)
      jcasType.jcas.throwFeatMissing("geonamesID", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.ll_cas.ll_setIntValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_geonamesID, v);}    
   
    
  //*--------------*
  //* Feature: markerPoint

  /** getter for markerPoint - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getMarkerPoint() {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_markerPoint == null)
      jcasType.jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return (FloatArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_markerPoint)));}
    
  /** setter for markerPoint - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMarkerPoint(FloatArray v) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_markerPoint == null)
      jcasType.jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_markerPoint, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for markerPoint - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getMarkerPoint(int i) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_markerPoint == null)
      jcasType.jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_markerPoint), i);
    return jcasType.ll_cas.ll_getFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_markerPoint), i);}

  /** indexed setter for markerPoint - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMarkerPoint(int i, float v) { 
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_markerPoint == null)
      jcasType.jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_markerPoint), i);
    jcasType.ll_cas.ll_setFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_markerPoint), i, v);}
   
    
  //*--------------*
  //* Feature: areaSize

  /** getter for areaSize - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAreaSize() {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_areaSize == null)
      jcasType.jcas.throwFeatMissing("areaSize", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_areaSize);}
    
  /** setter for areaSize - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAreaSize(String v) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_areaSize == null)
      jcasType.jcas.throwFeatMissing("areaSize", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_areaSize, v);}    
   
    
  //*--------------*
  //* Feature: geoJson

  /** getter for geoJson - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeoJson() {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_geoJson == null)
      jcasType.jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_geoJson);}
    
  /** setter for geoJson - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeoJson(String v) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_geoJson == null)
      jcasType.jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_geoJson, v);}    
   
    
  //*--------------*
  //* Feature: displayName

  /** getter for displayName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDisplayName() {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_displayName == null)
      jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_displayName);}
    
  /** setter for displayName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDisplayName(String v) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_displayName == null)
      jcasType.jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_displayName, v);}    
   
    
  //*--------------*
  //* Feature: image

  /** getter for image - gets 
   * @generated
   * @return value of the feature 
   */
  public String getImage() {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_image);}
    
  /** setter for image - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setImage(String v) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_image == null)
      jcasType.jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_image, v);}    
   
    
  //*--------------*
  //* Feature: URI

  /** getter for URI - gets 
   * @generated
   * @return value of the feature 
   */
  public String getURI() {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_URI == null)
      jcasType.jcas.throwFeatMissing("URI", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_URI);}
    
  /** setter for URI - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setURI(String v) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_URI == null)
      jcasType.jcas.throwFeatMissing("URI", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_URI, v);}    
   
    
  //*--------------*
  //* Feature: ofClass

  /** getter for ofClass - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOfClass() {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_ofClass == null)
      jcasType.jcas.throwFeatMissing("ofClass", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_ofClass);}
    
  /** setter for ofClass - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOfClass(String v) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_ofClass == null)
      jcasType.jcas.throwFeatMissing("ofClass", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_ofClass, v);}    
   
    
  //*--------------*
  //* Feature: wikiDataID

  /** getter for wikiDataID - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWikiDataID() {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_wikiDataID == null)
      jcasType.jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_wikiDataID);}
    
  /** setter for wikiDataID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWikiDataID(String v) {
    if (IndividualVis_Type.featOkTst && ((IndividualVis_Type)jcasType).casFeat_wikiDataID == null)
      jcasType.jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.IndividualVis");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualVis_Type)jcasType).casFeatCode_wikiDataID, v);}    
  }

    