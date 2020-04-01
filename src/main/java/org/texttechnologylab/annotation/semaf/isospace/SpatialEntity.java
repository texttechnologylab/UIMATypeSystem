

/* First created by JCasGen Tue Mar 24 15:23:19 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.apache.uima.jcas.cas.FSList;


import org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3;
import org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4;


/** 
 * Updated by JCasGen Wed Apr 01 09:53:21 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class SpatialEntity extends Entity {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpatialEntity.class);
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
  protected SpatialEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SpatialEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SpatialEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SpatialEntity(JCas jcas, int begin, int end) {
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
  //* Feature: spatial_entitiy_type

  /** getter for spatial_entitiy_type - gets Spatial Entitiy Type ( FAC | VEHICLE | PERSON | DYNAMIC_EVENT | ARTIFACT )
   * @generated
   * @return value of the feature 
   */
  public String getSpatial_entitiy_type() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_spatial_entitiy_type == null)
      jcasType.jcas.throwFeatMissing("spatial_entitiy_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_spatial_entitiy_type);}
    
  /** setter for spatial_entitiy_type - sets Spatial Entitiy Type ( FAC | VEHICLE | PERSON | DYNAMIC_EVENT | ARTIFACT ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpatial_entitiy_type(String v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_spatial_entitiy_type == null)
      jcasType.jcas.throwFeatMissing("spatial_entitiy_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_spatial_entitiy_type, v);}    
   
    
  //*--------------*
  //* Feature: dimensionality

  /** getter for dimensionality - gets ( POINT | LINE | AREA | VOLUME )
   * @generated
   * @return value of the feature 
   */
  public String getDimensionality() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_dimensionality == null)
      jcasType.jcas.throwFeatMissing("dimensionality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_dimensionality);}
    
  /** setter for dimensionality - sets ( POINT | LINE | AREA | VOLUME ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDimensionality(String v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_dimensionality == null)
      jcasType.jcas.throwFeatMissing("dimensionality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_dimensionality, v);}    
   
    
  //*--------------*
  //* Feature: form

  /** getter for form - gets ( NAM | NOM )
   * @generated
   * @return value of the feature 
   */
  public String getForm() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_form == null)
      jcasType.jcas.throwFeatMissing("form", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_form);}
    
  /** setter for form - sets ( NAM | NOM ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setForm(String v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_form == null)
      jcasType.jcas.throwFeatMissing("form", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_form, v);}    
   
    
  //*--------------*
  //* Feature: dcl

  /** getter for dcl - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getDcl() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_dcl == null)
      jcasType.jcas.throwFeatMissing("dcl", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_dcl);}
    
  /** setter for dcl - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDcl(boolean v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_dcl == null)
      jcasType.jcas.throwFeatMissing("dcl", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_dcl, v);}    
   
    
  //*--------------*
  //* Feature: domain

  /** getter for domain - gets ( CONTENT | STRUCTURE )
   * @generated
   * @return value of the feature 
   */
  public String getDomain() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_domain == null)
      jcasType.jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_domain);}
    
  /** setter for domain - sets ( CONTENT | STRUCTURE ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDomain(String v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_domain == null)
      jcasType.jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_domain, v);}    
   
    
  //*--------------*
  //* Feature: lat

  /** getter for lat - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLat() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_lat == null)
      jcasType.jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_lat);}
    
  /** setter for lat - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLat(String v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_lat == null)
      jcasType.jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_lat, v);}    
   
    
  //*--------------*
  //* Feature: long

  /** getter for long - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLong() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_long == null)
      jcasType.jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_long);}
    
  /** setter for long - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLong(String v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_long == null)
      jcasType.jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_long, v);}    
   
    
  //*--------------*
  //* Feature: elevation

  /** getter for elevation - gets 
   * @generated
   * @return value of the feature 
   */
  public Measure getElevation() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_elevation == null)
      jcasType.jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return (Measure)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_elevation)));}
    
  /** setter for elevation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElevation(Measure v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_elevation == null)
      jcasType.jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_elevation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: countable

  /** getter for countable - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getCountable() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_countable == null)
      jcasType.jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_countable);}
    
  /** setter for countable - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountable(boolean v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_countable == null)
      jcasType.jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_countable, v);}    
   
    
  //*--------------*
  //* Feature: gquant

  /** getter for gquant - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGquant() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_gquant == null)
      jcasType.jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_gquant);}
    
  /** setter for gquant - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGquant(String v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_gquant == null)
      jcasType.jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_gquant, v);}    
   
    
  //*--------------*
  //* Feature: scopes

  /** getter for scopes - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getScopes() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_scopes == null)
      jcasType.jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_scopes)));}
    
  /** setter for scopes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScopes(FSList v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_scopes == null)
      jcasType.jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_scopes, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: object_id

  /** getter for object_id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getObject_id() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_object_id == null)
      jcasType.jcas.throwFeatMissing("object_id", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_object_id);}
    
  /** setter for object_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObject_id(String v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_object_id == null)
      jcasType.jcas.throwFeatMissing("object_id", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_object_id, v);}    
   
    
  //*--------------*
  //* Feature: position

  /** getter for position - gets 
   * @generated
   * @return value of the feature 
   */
  public Vec3 getPosition() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return (Vec3)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_position)));}
    
  /** setter for position - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosition(Vec3 v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_position, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: rotation

  /** getter for rotation - gets 
   * @generated
   * @return value of the feature 
   */
  public Vec4 getRotation() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return (Vec4)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_rotation)));}
    
  /** setter for rotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRotation(Vec4 v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_rotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: scale

  /** getter for scale - gets 
   * @generated
   * @return value of the feature 
   */
  public Vec3 getScale() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return (Vec3)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_scale)));}
    
  /** setter for scale - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScale(Vec3 v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_scale, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: object_feature

  /** getter for object_feature - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getObject_feature() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_object_feature == null)
      jcasType.jcas.throwFeatMissing("object_feature", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_object_feature)));}
    
  /** setter for object_feature - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObject_feature(FSList v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_object_feature == null)
      jcasType.jcas.throwFeatMissing("object_feature", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setRefValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_object_feature, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    