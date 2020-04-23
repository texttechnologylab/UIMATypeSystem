

/* First created by JCasGen Thu Apr 23 09:54:52 CEST 2020 */
package org.texttechnologylab.annotation.context.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.node.type.Context;
import org.apache.uima.jcas.cas.FloatArray;


/** 
 * Updated by JCasGen Thu Apr 23 09:54:52 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 * @generated */
public class LocationContext extends Context {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LocationContext.class);
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
  protected LocationContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LocationContext(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LocationContext(JCas jcas) {
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
  //* Feature: markerPoint

  /** getter for markerPoint - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getMarkerPoint() {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_markerPoint == null)
      jcasType.jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.context.type.LocationContext");
    return (FloatArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_markerPoint)));}
    
  /** setter for markerPoint - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMarkerPoint(FloatArray v) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_markerPoint == null)
      jcasType.jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.ll_cas.ll_setRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_markerPoint, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for markerPoint - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getMarkerPoint(int i) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_markerPoint == null)
      jcasType.jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_markerPoint), i);
    return jcasType.ll_cas.ll_getFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_markerPoint), i);}

  /** indexed setter for markerPoint - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMarkerPoint(int i, float v) { 
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_markerPoint == null)
      jcasType.jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_markerPoint), i);
    jcasType.ll_cas.ll_setFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_markerPoint), i, v);}
   
    
  //*--------------*
  //* Feature: geoJson

  /** getter for geoJson - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeoJson() {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_geoJson == null)
      jcasType.jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.context.type.LocationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LocationContext_Type)jcasType).casFeatCode_geoJson);}
    
  /** setter for geoJson - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeoJson(String v) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_geoJson == null)
      jcasType.jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((LocationContext_Type)jcasType).casFeatCode_geoJson, v);}    
   
    
  //*--------------*
  //* Feature: latLngs

  /** getter for latLngs - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getLatLngs() {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_latLngs == null)
      jcasType.jcas.throwFeatMissing("latLngs", "org.texttechnologylab.annotation.context.type.LocationContext");
    return (FloatArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_latLngs)));}
    
  /** setter for latLngs - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLatLngs(FloatArray v) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_latLngs == null)
      jcasType.jcas.throwFeatMissing("latLngs", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.ll_cas.ll_setRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_latLngs, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for latLngs - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getLatLngs(int i) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_latLngs == null)
      jcasType.jcas.throwFeatMissing("latLngs", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_latLngs), i);
    return jcasType.ll_cas.ll_getFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_latLngs), i);}

  /** indexed setter for latLngs - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setLatLngs(int i, float v) { 
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_latLngs == null)
      jcasType.jcas.throwFeatMissing("latLngs", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_latLngs), i);
    jcasType.ll_cas.ll_setFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LocationContext_Type)jcasType).casFeatCode_latLngs), i, v);}
   
    
  //*--------------*
  //* Feature: contextInf

  /** getter for contextInf - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContextInf() {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_contextInf == null)
      jcasType.jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.LocationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LocationContext_Type)jcasType).casFeatCode_contextInf);}
    
  /** setter for contextInf - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextInf(String v) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_contextInf == null)
      jcasType.jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((LocationContext_Type)jcasType).casFeatCode_contextInf, v);}    
   
    
  //*--------------*
  //* Feature: country

  /** getter for country - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCountry() {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_country == null)
      jcasType.jcas.throwFeatMissing("country", "org.texttechnologylab.annotation.context.type.LocationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LocationContext_Type)jcasType).casFeatCode_country);}
    
  /** setter for country - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountry(String v) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_country == null)
      jcasType.jcas.throwFeatMissing("country", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((LocationContext_Type)jcasType).casFeatCode_country, v);}    
   
    
  //*--------------*
  //* Feature: numberOfCitizen

  /** getter for numberOfCitizen - gets 
   * @generated
   * @return value of the feature 
   */
  public double getNumberOfCitizen() {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_numberOfCitizen == null)
      jcasType.jcas.throwFeatMissing("numberOfCitizen", "org.texttechnologylab.annotation.context.type.LocationContext");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((LocationContext_Type)jcasType).casFeatCode_numberOfCitizen);}
    
  /** setter for numberOfCitizen - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumberOfCitizen(double v) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_numberOfCitizen == null)
      jcasType.jcas.throwFeatMissing("numberOfCitizen", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((LocationContext_Type)jcasType).casFeatCode_numberOfCitizen, v);}    
   
    
  //*--------------*
  //* Feature: geoNamesID

  /** getter for geoNamesID - gets 
   * @generated
   * @return value of the feature 
   */
  public int getGeoNamesID() {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_geoNamesID == null)
      jcasType.jcas.throwFeatMissing("geoNamesID", "org.texttechnologylab.annotation.context.type.LocationContext");
    return jcasType.ll_cas.ll_getIntValue(addr, ((LocationContext_Type)jcasType).casFeatCode_geoNamesID);}
    
  /** setter for geoNamesID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeoNamesID(int v) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_geoNamesID == null)
      jcasType.jcas.throwFeatMissing("geoNamesID", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.ll_cas.ll_setIntValue(addr, ((LocationContext_Type)jcasType).casFeatCode_geoNamesID, v);}    
   
    
  //*--------------*
  //* Feature: areaSize

  /** getter for areaSize - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAreaSize() {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_areaSize == null)
      jcasType.jcas.throwFeatMissing("areaSize", "org.texttechnologylab.annotation.context.type.LocationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LocationContext_Type)jcasType).casFeatCode_areaSize);}
    
  /** setter for areaSize - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAreaSize(String v) {
    if (LocationContext_Type.featOkTst && ((LocationContext_Type)jcasType).casFeat_areaSize == null)
      jcasType.jcas.throwFeatMissing("areaSize", "org.texttechnologylab.annotation.context.type.LocationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((LocationContext_Type)jcasType).casFeatCode_areaSize, v);}    
  }

    