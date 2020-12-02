

/* First created by JCasGen Wed Dec 02 17:54:44 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.semaf.isobase.Link;


/** 
 * Updated by JCasGen Wed Dec 02 17:54:53 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoMergeTypeSystem.xml
 * @generated */
public class MoveLink extends Link {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MoveLink.class);
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
  protected MoveLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MoveLink(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MoveLink(JCas jcas) {
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
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getSource() {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_source)));}
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(Entity v) {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_source, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: goal

  /** getter for goal - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getGoal() {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_goal == null)
      jcasType.jcas.throwFeatMissing("goal", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_goal)));}
    
  /** setter for goal - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGoal(Entity v) {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_goal == null)
      jcasType.jcas.throwFeatMissing("goal", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_goal, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: mid_point

  /** getter for mid_point - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getMid_point() {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_mid_point == null)
      jcasType.jcas.throwFeatMissing("mid_point", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_mid_point)));}
    
  /** setter for mid_point - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMid_point(FSList v) {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_mid_point == null)
      jcasType.jcas.throwFeatMissing("mid_point", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_mid_point, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: mid_point_array

  /** getter for mid_point_array - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getMid_point_array() {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_mid_point_array == null)
      jcasType.jcas.throwFeatMissing("mid_point_array", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_mid_point_array)));}
    
  /** setter for mid_point_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMid_point_array(FSArray v) {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_mid_point_array == null)
      jcasType.jcas.throwFeatMissing("mid_point_array", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_mid_point_array, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for mid_point_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Entity getMid_point_array(int i) {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_mid_point_array == null)
      jcasType.jcas.throwFeatMissing("mid_point_array", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_mid_point_array), i);
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_mid_point_array), i)));}

  /** indexed setter for mid_point_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMid_point_array(int i, Entity v) { 
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_mid_point_array == null)
      jcasType.jcas.throwFeatMissing("mid_point_array", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_mid_point_array), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_mid_point_array), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: path_id

  /** getter for path_id - gets 
   * @generated
   * @return value of the feature 
   */
  public Path getPath_id() {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_path_id == null)
      jcasType.jcas.throwFeatMissing("path_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return (Path)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_path_id)));}
    
  /** setter for path_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPath_id(Path v) {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_path_id == null)
      jcasType.jcas.throwFeatMissing("path_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_path_id, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: adjunct_id

  /** getter for adjunct_id - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialSignal getAdjunct_id() {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_adjunct_id == null)
      jcasType.jcas.throwFeatMissing("adjunct_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return (SpatialSignal)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_adjunct_id)));}
    
  /** setter for adjunct_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdjunct_id(SpatialSignal v) {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_adjunct_id == null)
      jcasType.jcas.throwFeatMissing("adjunct_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_adjunct_id, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: motionsignal_id

  /** getter for motionsignal_id - gets 
   * @generated
   * @return value of the feature 
   */
  public MotionSignal getMotionsignal_id() {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_motionsignal_id == null)
      jcasType.jcas.throwFeatMissing("motionsignal_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return (MotionSignal)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_motionsignal_id)));}
    
  /** setter for motionsignal_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotionsignal_id(MotionSignal v) {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_motionsignal_id == null)
      jcasType.jcas.throwFeatMissing("motionsignal_id", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.ll_cas.ll_setRefValue(addr, ((MoveLink_Type)jcasType).casFeatCode_motionsignal_id, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: goal_reached

  /** getter for goal_reached - gets ( YES | NO | UNCERTAIN )
   * @generated
   * @return value of the feature 
   */
  public String getGoal_reached() {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_goal_reached == null)
      jcasType.jcas.throwFeatMissing("goal_reached", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MoveLink_Type)jcasType).casFeatCode_goal_reached);}
    
  /** setter for goal_reached - sets ( YES | NO | UNCERTAIN ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGoal_reached(String v) {
    if (MoveLink_Type.featOkTst && ((MoveLink_Type)jcasType).casFeat_goal_reached == null)
      jcasType.jcas.throwFeatMissing("goal_reached", "org.texttechnologylab.annotation.semaf.isospace.MoveLink");
    jcasType.ll_cas.ll_setStringValue(addr, ((MoveLink_Type)jcasType).casFeatCode_goal_reached, v);}    
  }

    