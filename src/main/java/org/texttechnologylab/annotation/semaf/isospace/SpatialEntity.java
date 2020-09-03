

/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.apache.uima.jcas.cas.FSList;
import org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3;
import org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4;


/** 
 * Updated by JCasGen Thu Sep 03 10:03:40 CEST 2020
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/IsoSpaceV2TypeSystem.xml
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
  //* Feature: cardinality

  /** getter for cardinality - gets 
   * @generated
   * @return value of the feature 
   */
  public double getCardinality() {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_cardinality == null)
      jcasType.jcas.throwFeatMissing("cardinality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_cardinality);}
    
  /** setter for cardinality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCardinality(double v) {
    if (SpatialEntity_Type.featOkTst && ((SpatialEntity_Type)jcasType).casFeat_cardinality == null)
      jcasType.jcas.throwFeatMissing("cardinality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((SpatialEntity_Type)jcasType).casFeatCode_cardinality, v);}    
  }

    