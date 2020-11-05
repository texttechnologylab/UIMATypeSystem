

/* First created by JCasGen Thu Nov 05 17:32:23 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Thu Nov 05 17:32:23 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoMergeTypeSystem.xml
 * @generated */
public class EventPath extends Location {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EventPath.class);
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
  protected EventPath() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EventPath(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EventPath(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EventPath(JCas jcas, int begin, int end) {
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
  //* Feature: trigger

  /** getter for trigger - gets 
   * @generated
   * @return value of the feature 
   */
  public Motion getTrigger() {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_trigger == null)
      jcasType.jcas.throwFeatMissing("trigger", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return (Motion)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_trigger)));}
    
  /** setter for trigger - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTrigger(Motion v) {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_trigger == null)
      jcasType.jcas.throwFeatMissing("trigger", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_trigger, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: startID

  /** getter for startID - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialEntity getStartID() {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_startID == null)
      jcasType.jcas.throwFeatMissing("startID", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return (SpatialEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_startID)));}
    
  /** setter for startID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartID(SpatialEntity v) {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_startID == null)
      jcasType.jcas.throwFeatMissing("startID", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_startID, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: midIDs

  /** getter for midIDs - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getMidIDs() {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_midIDs == null)
      jcasType.jcas.throwFeatMissing("midIDs", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_midIDs)));}
    
  /** setter for midIDs - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMidIDs(FSList v) {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_midIDs == null)
      jcasType.jcas.throwFeatMissing("midIDs", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_midIDs, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: midID_array

  /** getter for midID_array - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getMidID_array() {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_midID_array == null)
      jcasType.jcas.throwFeatMissing("midID_array", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_midID_array)));}
    
  /** setter for midID_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMidID_array(FSArray v) {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_midID_array == null)
      jcasType.jcas.throwFeatMissing("midID_array", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_midID_array, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for midID_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public SpatialEntity getMidID_array(int i) {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_midID_array == null)
      jcasType.jcas.throwFeatMissing("midID_array", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_midID_array), i);
    return (SpatialEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_midID_array), i)));}

  /** indexed setter for midID_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMidID_array(int i, SpatialEntity v) { 
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_midID_array == null)
      jcasType.jcas.throwFeatMissing("midID_array", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_midID_array), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_midID_array), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: endID

  /** getter for endID - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialEntity getEndID() {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_endID == null)
      jcasType.jcas.throwFeatMissing("endID", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return (SpatialEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_endID)));}
    
  /** setter for endID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndID(SpatialEntity v) {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_endID == null)
      jcasType.jcas.throwFeatMissing("endID", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_endID, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: spatial_relator

  /** getter for spatial_relator - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getSpatial_relator() {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_spatial_relator == null)
      jcasType.jcas.throwFeatMissing("spatial_relator", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_spatial_relator)));}
    
  /** setter for spatial_relator - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpatial_relator(FSList v) {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_spatial_relator == null)
      jcasType.jcas.throwFeatMissing("spatial_relator", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_spatial_relator, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: spatial_relator_array

  /** getter for spatial_relator_array - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getSpatial_relator_array() {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_spatial_relator_array == null)
      jcasType.jcas.throwFeatMissing("spatial_relator_array", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_spatial_relator_array)));}
    
  /** setter for spatial_relator_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpatial_relator_array(FSArray v) {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_spatial_relator_array == null)
      jcasType.jcas.throwFeatMissing("spatial_relator_array", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_spatial_relator_array, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for spatial_relator_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public SpatialSignal getSpatial_relator_array(int i) {
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_spatial_relator_array == null)
      jcasType.jcas.throwFeatMissing("spatial_relator_array", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_spatial_relator_array), i);
    return (SpatialSignal)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_spatial_relator_array), i)));}

  /** indexed setter for spatial_relator_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setSpatial_relator_array(int i, SpatialSignal v) { 
    if (EventPath_Type.featOkTst && ((EventPath_Type)jcasType).casFeat_spatial_relator_array == null)
      jcasType.jcas.throwFeatMissing("spatial_relator_array", "org.texttechnologylab.annotation.semaf.isospace.EventPath");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_spatial_relator_array), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventPath_Type)jcasType).casFeatCode_spatial_relator_array), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    