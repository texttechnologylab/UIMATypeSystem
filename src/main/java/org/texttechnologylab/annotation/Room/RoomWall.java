

/* First created by JCasGen Thu Nov 05 17:33:03 CET 2020 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.Vector;
import org.apache.uima.jcas.cas.AnnotationBase;


/** Roomwall
 * Updated by JCasGen Thu Nov 05 17:33:03 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyRoom.xml
 * @generated */
public class RoomWall extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RoomWall.class);
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
  protected RoomWall() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RoomWall(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RoomWall(JCas jcas) {
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
  //* Feature: vectorlist

  /** getter for vectorlist - gets List of all Wallpoints
   * @generated
   * @return value of the feature 
   */
  public FSArray getVectorlist() {
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_vectorlist == null)
      jcasType.jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_vectorlist)));}
    
  /** setter for vectorlist - sets List of all Wallpoints 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVectorlist(FSArray v) {
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_vectorlist == null)
      jcasType.jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
    jcasType.ll_cas.ll_setRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_vectorlist, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for vectorlist - gets an indexed value - List of all Wallpoints
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Vector getVectorlist(int i) {
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_vectorlist == null)
      jcasType.jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_vectorlist), i);
    return (Vector)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_vectorlist), i)));}

  /** indexed setter for vectorlist - sets an indexed value - List of all Wallpoints
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setVectorlist(int i, Vector v) { 
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_vectorlist == null)
      jcasType.jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_vectorlist), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_vectorlist), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: height

  /** getter for height - gets Height of the wall
   * @generated
   * @return value of the feature 
   */
  public double getHeight() {
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_height == null)
      jcasType.jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.Room.RoomWall");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((RoomWall_Type)jcasType).casFeatCode_height);}
    
  /** setter for height - sets Height of the wall 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeight(double v) {
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_height == null)
      jcasType.jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.Room.RoomWall");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((RoomWall_Type)jcasType).casFeatCode_height, v);}    
   
    
  //*--------------*
  //* Feature: feature

  /** getter for feature - gets Feature like color or texture.
   * @generated
   * @return value of the feature 
   */
  public FSArray getFeature() {
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_feature)));}
    
  /** setter for feature - sets Feature like color or texture. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeature(FSArray v) {
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
    jcasType.ll_cas.ll_setRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_feature, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for feature - gets an indexed value - Feature like color or texture.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public ObjectAttribute getFeature(int i) {
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_feature), i);
    return (ObjectAttribute)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_feature), i)));}

  /** indexed setter for feature - sets an indexed value - Feature like color or texture.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setFeature(int i, ObjectAttribute v) { 
    if (RoomWall_Type.featOkTst && ((RoomWall_Type)jcasType).casFeat_feature == null)
      jcasType.jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_feature), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RoomWall_Type)jcasType).casFeatCode_feature), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    