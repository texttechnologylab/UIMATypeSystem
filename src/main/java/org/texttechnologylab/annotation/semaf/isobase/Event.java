

/* First created by JCasGen Thu Sep 10 17:48:48 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isobase;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.texttechnologylab.annotation.semaf.isospace.Measure;


/** 
 * Updated by JCasGen Thu Sep 10 17:49:24 CEST 2020
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/IsoMetaTypeSystem.xml
 * @generated */
public class Event extends Entity {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Event.class);
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
  protected Event() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Event(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Event(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Event(JCas jcas, int begin, int end) {
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
  //* Feature: event_class

  /** getter for event_class - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEvent_class() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_event_class == null)
      jcasType.jcas.throwFeatMissing("event_class", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_event_class);}
    
  /** setter for event_class - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent_class(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_event_class == null)
      jcasType.jcas.throwFeatMissing("event_class", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_event_class, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPolarity() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_polarity, v);}    
   
    
  //*--------------*
  //* Feature: mood

  /** getter for mood - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMood() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_mood == null)
      jcasType.jcas.throwFeatMissing("mood", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_mood);}
    
  /** setter for mood - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMood(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_mood == null)
      jcasType.jcas.throwFeatMissing("mood", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_mood, v);}    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPos() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_pos);}
    
  /** setter for pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_pos == null)
      jcasType.jcas.throwFeatMissing("pos", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_pos, v);}    
   
    
  //*--------------*
  //* Feature: tense

  /** getter for tense - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTense() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_tense == null)
      jcasType.jcas.throwFeatMissing("tense", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_tense);}
    
  /** setter for tense - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTense(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_tense == null)
      jcasType.jcas.throwFeatMissing("tense", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_tense, v);}    
   
    
  //*--------------*
  //* Feature: aspect

  /** getter for aspect - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAspect() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_aspect == null)
      jcasType.jcas.throwFeatMissing("aspect", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_aspect);}
    
  /** setter for aspect - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAspect(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_aspect == null)
      jcasType.jcas.throwFeatMissing("aspect", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_aspect, v);}    
   
    
  //*--------------*
  //* Feature: vform

  /** getter for vform - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVform() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_vform == null)
      jcasType.jcas.throwFeatMissing("vform", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_vform);}
    
  /** setter for vform - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVform(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_vform == null)
      jcasType.jcas.throwFeatMissing("vform", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_vform, v);}    
   
    
  //*--------------*
  //* Feature: domain

  /** getter for domain - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDomain() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_domain == null)
      jcasType.jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_domain);}
    
  /** setter for domain - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDomain(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_domain == null)
      jcasType.jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_domain, v);}    
   
    
  //*--------------*
  //* Feature: lat

  /** getter for lat - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLat() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_lat == null)
      jcasType.jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_lat);}
    
  /** setter for lat - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLat(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_lat == null)
      jcasType.jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_lat, v);}    
   
    
  //*--------------*
  //* Feature: long

  /** getter for long - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLong() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_long == null)
      jcasType.jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_long);}
    
  /** setter for long - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLong(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_long == null)
      jcasType.jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_long, v);}    
   
    
  //*--------------*
  //* Feature: elevation

  /** getter for elevation - gets 
   * @generated
   * @return value of the feature 
   */
  public Measure getElevation() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_elevation == null)
      jcasType.jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return (Measure)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_elevation)));}
    
  /** setter for elevation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElevation(Measure v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_elevation == null)
      jcasType.jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setRefValue(addr, ((Event_Type)jcasType).casFeatCode_elevation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: countable

  /** getter for countable - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getCountable() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_countable == null)
      jcasType.jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Event_Type)jcasType).casFeatCode_countable);}
    
  /** setter for countable - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountable(boolean v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_countable == null)
      jcasType.jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Event_Type)jcasType).casFeatCode_countable, v);}    
   
    
  //*--------------*
  //* Feature: gquant

  /** getter for gquant - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGquant() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_gquant == null)
      jcasType.jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_gquant);}
    
  /** setter for gquant - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGquant(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_gquant == null)
      jcasType.jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_gquant, v);}    
   
    
  //*--------------*
  //* Feature: scopes

  /** getter for scopes - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getScopes() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_scopes == null)
      jcasType.jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Event_Type)jcasType).casFeatCode_scopes)));}
    
  /** setter for scopes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScopes(FSList v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_scopes == null)
      jcasType.jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setRefValue(addr, ((Event_Type)jcasType).casFeatCode_scopes, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: event_frame

  /** getter for event_frame - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEvent_frame() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_event_frame == null)
      jcasType.jcas.throwFeatMissing("event_frame", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_event_frame);}
    
  /** setter for event_frame - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent_frame(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_event_frame == null)
      jcasType.jcas.throwFeatMissing("event_frame", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_event_frame, v);}    
   
    
  //*--------------*
  //* Feature: event_type

  /** getter for event_type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEvent_type() {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_event_type == null)
      jcasType.jcas.throwFeatMissing("event_type", "org.texttechnologylab.annotation.semaf.isobase.Event");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Event_Type)jcasType).casFeatCode_event_type);}
    
  /** setter for event_type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent_type(String v) {
    if (Event_Type.featOkTst && ((Event_Type)jcasType).casFeat_event_type == null)
      jcasType.jcas.throwFeatMissing("event_type", "org.texttechnologylab.annotation.semaf.isobase.Event");
    jcasType.ll_cas.ll_setStringValue(addr, ((Event_Type)jcasType).casFeatCode_event_type, v);}    
  }

    