

/* First created by JCasGen Thu Nov 05 17:32:23 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.texttechnologylab.annotation.semaf.isobase.Event;


/** 
 * Updated by JCasGen Thu Nov 05 17:32:40 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoSpaceTypeSystem.xml
 * @generated */
public class Motion extends Event {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Motion.class);
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
  protected Motion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Motion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Motion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Motion(JCas jcas, int begin, int end) {
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
  //* Feature: motion_type

  /** getter for motion_type - gets ( MANNER | PATH | COMPOUND )
   * @generated
   * @return value of the feature 
   */
  public String getMotion_type() {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_motion_type == null)
      jcasType.jcas.throwFeatMissing("motion_type", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Motion_Type)jcasType).casFeatCode_motion_type);}
    
  /** setter for motion_type - sets ( MANNER | PATH | COMPOUND ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_type(String v) {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_motion_type == null)
      jcasType.jcas.throwFeatMissing("motion_type", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    jcasType.ll_cas.ll_setStringValue(addr, ((Motion_Type)jcasType).casFeatCode_motion_type, v);}    
   
    
  //*--------------*
  //* Feature: motion_class

  /** getter for motion_class - gets ( MOVE | MOVE_EXTERNAL | MOVE_INTERNAL | LEAVE | REACH | CROSS | DETACH | HIT | FOLLOW | DEVIATE | STAY )
   * @generated
   * @return value of the feature 
   */
  public String getMotion_class() {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_motion_class == null)
      jcasType.jcas.throwFeatMissing("motion_class", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Motion_Type)jcasType).casFeatCode_motion_class);}
    
  /** setter for motion_class - sets ( MOVE | MOVE_EXTERNAL | MOVE_INTERNAL | LEAVE | REACH | CROSS | DETACH | HIT | FOLLOW | DEVIATE | STAY ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_class(String v) {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_motion_class == null)
      jcasType.jcas.throwFeatMissing("motion_class", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    jcasType.ll_cas.ll_setStringValue(addr, ((Motion_Type)jcasType).casFeatCode_motion_class, v);}    
   
    
  //*--------------*
  //* Feature: motion_sense

  /** getter for motion_sense - gets ( LITERAL | FICTIVE | INTRINSIC_CHANGE )
   * @generated
   * @return value of the feature 
   */
  public String getMotion_sense() {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_motion_sense == null)
      jcasType.jcas.throwFeatMissing("motion_sense", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Motion_Type)jcasType).casFeatCode_motion_sense);}
    
  /** setter for motion_sense - sets ( LITERAL | FICTIVE | INTRINSIC_CHANGE ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_sense(String v) {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_motion_sense == null)
      jcasType.jcas.throwFeatMissing("motion_sense", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    jcasType.ll_cas.ll_setStringValue(addr, ((Motion_Type)jcasType).casFeatCode_motion_sense, v);}    
   
    
  //*--------------*
  //* Feature: manner

  /** getter for manner - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getManner() {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_manner == null)
      jcasType.jcas.throwFeatMissing("manner", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    return (Entity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Motion_Type)jcasType).casFeatCode_manner)));}
    
  /** setter for manner - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setManner(Entity v) {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_manner == null)
      jcasType.jcas.throwFeatMissing("manner", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    jcasType.ll_cas.ll_setRefValue(addr, ((Motion_Type)jcasType).casFeatCode_manner, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: motion_goal

  /** getter for motion_goal - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialEntity getMotion_goal() {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_motion_goal == null)
      jcasType.jcas.throwFeatMissing("motion_goal", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    return (SpatialEntity)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Motion_Type)jcasType).casFeatCode_motion_goal)));}
    
  /** setter for motion_goal - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_goal(SpatialEntity v) {
    if (Motion_Type.featOkTst && ((Motion_Type)jcasType).casFeat_motion_goal == null)
      jcasType.jcas.throwFeatMissing("motion_goal", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    jcasType.ll_cas.ll_setRefValue(addr, ((Motion_Type)jcasType).casFeatCode_motion_goal, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    