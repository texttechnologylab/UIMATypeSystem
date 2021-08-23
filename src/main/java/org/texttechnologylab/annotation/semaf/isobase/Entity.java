

/* First created by JCasGen Mon Aug 23 15:20:30 CEST 2021 */
package org.texttechnologylab.annotation.semaf.isobase;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3;
import org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4;
import org.texttechnologylab.annotation.semaf.IsoSpatial.ObjectAttribute;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Aug 23 15:20:30 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoMergeTypeSystem.xml
 * @generated */
public class Entity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Entity.class);
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
  protected Entity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Entity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Entity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Entity(JCas jcas, int begin, int end) {
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
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_comment);}
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_comment, v);}    
   
    
  //*--------------*
  //* Feature: mod

  /** getter for mod - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMod() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_mod == null)
      jcasType.jcas.throwFeatMissing("mod", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_mod);}
    
  /** setter for mod - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMod(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_mod == null)
      jcasType.jcas.throwFeatMissing("mod", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_mod, v);}    
   
    
  //*--------------*
  //* Feature: object_id

  /** getter for object_id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getObject_id() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_object_id == null)
      jcasType.jcas.throwFeatMissing("object_id", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Entity_Type)jcasType).casFeatCode_object_id);}
    
  /** setter for object_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObject_id(String v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_object_id == null)
      jcasType.jcas.throwFeatMissing("object_id", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setStringValue(addr, ((Entity_Type)jcasType).casFeatCode_object_id, v);}    
   
    
  //*--------------*
  //* Feature: position

  /** getter for position - gets 
   * @generated
   * @return value of the feature 
   */
  public Vec3 getPosition() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return (Vec3)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_position)));}
    
  /** setter for position - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosition(Vec3 v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_position == null)
      jcasType.jcas.throwFeatMissing("position", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_position, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: rotation

  /** getter for rotation - gets 
   * @generated
   * @return value of the feature 
   */
  public Vec4 getRotation() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return (Vec4)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_rotation)));}
    
  /** setter for rotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRotation(Vec4 v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_rotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: scale

  /** getter for scale - gets 
   * @generated
   * @return value of the feature 
   */
  public Vec3 getScale() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return (Vec3)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_scale)));}
    
  /** setter for scale - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScale(Vec3 v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_scale, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: object_feature

  /** getter for object_feature - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getObject_feature() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_object_feature == null)
      jcasType.jcas.throwFeatMissing("object_feature", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_object_feature)));}
    
  /** setter for object_feature - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObject_feature(FSList v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_object_feature == null)
      jcasType.jcas.throwFeatMissing("object_feature", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_object_feature, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: object_feature_array

  /** getter for object_feature_array - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getObject_feature_array() {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_object_feature_array == null)
      jcasType.jcas.throwFeatMissing("object_feature_array", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_object_feature_array)));}
    
  /** setter for object_feature_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObject_feature_array(FSArray v) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_object_feature_array == null)
      jcasType.jcas.throwFeatMissing("object_feature_array", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entity_Type)jcasType).casFeatCode_object_feature_array, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for object_feature_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public ObjectAttribute getObject_feature_array(int i) {
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_object_feature_array == null)
      jcasType.jcas.throwFeatMissing("object_feature_array", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_object_feature_array), i);
    return (ObjectAttribute)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_object_feature_array), i)));}

  /** indexed setter for object_feature_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setObject_feature_array(int i, ObjectAttribute v) { 
    if (Entity_Type.featOkTst && ((Entity_Type)jcasType).casFeat_object_feature_array == null)
      jcasType.jcas.throwFeatMissing("object_feature_array", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_object_feature_array), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Entity_Type)jcasType).casFeatCode_object_feature_array), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    