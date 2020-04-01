

/* First created by JCasGen Tue Mar 24 16:00:31 CET 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Event;
import org.texttechnologylab.annotation.semaf.isobase.Link;


/** 
 * Updated by JCasGen Wed Apr 01 09:53:21 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class MLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MLink.class);
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
  protected MLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MLink(JCas jcas) {
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
  //* Feature: event_id

  /** getter for event_id - gets 
   * @generated
   * @return value of the feature 
   */
  public Event getEvent_id() {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_event_id == null)
      jcasType.jcas.throwFeatMissing("event_id", "org.texttechnologylab.annotation.semaf.isotimeml.MLink");
    return (Event)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MLink_Type)jcasType).casFeatCode_event_id)));}
    
  /** setter for event_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent_id(Event v) {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_event_id == null)
      jcasType.jcas.throwFeatMissing("event_id", "org.texttechnologylab.annotation.semaf.isotimeml.MLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MLink_Type)jcasType).casFeatCode_event_id, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: related_to_time

  /** getter for related_to_time - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeX3 getRelated_to_time() {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_related_to_time == null)
      jcasType.jcas.throwFeatMissing("related_to_time", "org.texttechnologylab.annotation.semaf.isotimeml.MLink");
    return (TimeX3)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MLink_Type)jcasType).casFeatCode_related_to_time)));}
    
  /** setter for related_to_time - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelated_to_time(TimeX3 v) {
    if (MLink_Type.featOkTst && ((MLink_Type)jcasType).casFeat_related_to_time == null)
      jcasType.jcas.throwFeatMissing("related_to_time", "org.texttechnologylab.annotation.semaf.isotimeml.MLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MLink_Type)jcasType).casFeatCode_related_to_time, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    