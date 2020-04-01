

/* First created by JCasGen Fri Mar 20 09:14:56 CET 2020 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.Vector;
import org.apache.uima.jcas.tcas.Annotation;


/** Can be a single object or a group of objects
 * Updated by JCasGen Fri Mar 20 09:14:56 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyRoom.xml
 * @generated */
public class Object extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Object.class);
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
  protected Object() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Object(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Object(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Object(JCas jcas, int begin, int end) {
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
  //* Feature: name

  /** getter for name - gets Name of the object (group).
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.Room.Object");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Object_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets Name of the object (group). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setStringValue(addr, ((Object_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: fatherObject

  /** getter for fatherObject - gets FatherObject in the hierarchy.
   * @generated
   * @return value of the feature 
   */
  public Object getFatherObject() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_fatherObject == null)
      jcasType.jcas.throwFeatMissing("fatherObject", "org.texttechnologylab.annotation.Room.Object");
    return (Object)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_fatherObject)));}
    
  /** setter for fatherObject - sets FatherObject in the hierarchy. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFatherObject(Object v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_fatherObject == null)
      jcasType.jcas.throwFeatMissing("fatherObject", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setRefValue(addr, ((Object_Type)jcasType).casFeatCode_fatherObject, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: nextTimeObject

  /** getter for nextTimeObject - gets Reference to the same object the next time step.
   * @generated
   * @return value of the feature 
   */
  public Object getNextTimeObject() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_nextTimeObject == null)
      jcasType.jcas.throwFeatMissing("nextTimeObject", "org.texttechnologylab.annotation.Room.Object");
    return (Object)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_nextTimeObject)));}
    
  /** setter for nextTimeObject - sets Reference to the same object the next time step. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNextTimeObject(Object v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_nextTimeObject == null)
      jcasType.jcas.throwFeatMissing("nextTimeObject", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setRefValue(addr, ((Object_Type)jcasType).casFeatCode_nextTimeObject, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: prevTimeObject

  /** getter for prevTimeObject - gets Reference to the same object the previous time step.
   * @generated
   * @return value of the feature 
   */
  public Object getPrevTimeObject() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_prevTimeObject == null)
      jcasType.jcas.throwFeatMissing("prevTimeObject", "org.texttechnologylab.annotation.Room.Object");
    return (Object)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_prevTimeObject)));}
    
  /** setter for prevTimeObject - sets Reference to the same object the previous time step. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrevTimeObject(Object v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_prevTimeObject == null)
      jcasType.jcas.throwFeatMissing("prevTimeObject", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setRefValue(addr, ((Object_Type)jcasType).casFeatCode_prevTimeObject, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: timeReference

  /** getter for timeReference - gets Reference to time location.
   * @generated
   * @return value of the feature 
   */
  public TimeChain getTimeReference() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_timeReference == null)
      jcasType.jcas.throwFeatMissing("timeReference", "org.texttechnologylab.annotation.Room.Object");
    return (TimeChain)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_timeReference)));}
    
  /** setter for timeReference - sets Reference to time location. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimeReference(TimeChain v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_timeReference == null)
      jcasType.jcas.throwFeatMissing("timeReference", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setRefValue(addr, ((Object_Type)jcasType).casFeatCode_timeReference, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: shapeNetID

  /** getter for shapeNetID - gets ShapeNetID of the object.
   * @generated
   * @return value of the feature 
   */
  public String getShapeNetID() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_shapeNetID == null)
      jcasType.jcas.throwFeatMissing("shapeNetID", "org.texttechnologylab.annotation.Room.Object");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Object_Type)jcasType).casFeatCode_shapeNetID);}
    
  /** setter for shapeNetID - sets ShapeNetID of the object. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setShapeNetID(String v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_shapeNetID == null)
      jcasType.jcas.throwFeatMissing("shapeNetID", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setStringValue(addr, ((Object_Type)jcasType).casFeatCode_shapeNetID, v);}    
   
    
  //*--------------*
  //* Feature: scale

  /** getter for scale - gets Scale of the object.
   * @generated
   * @return value of the feature 
   */
  public double getScale() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.Room.Object");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Object_Type)jcasType).casFeatCode_scale);}
    
  /** setter for scale - sets Scale of the object. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScale(double v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_scale == null)
      jcasType.jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Object_Type)jcasType).casFeatCode_scale, v);}    
   
    
  //*--------------*
  //* Feature: location

  /** getter for location - gets 3D Location Vector.
   * @generated
   * @return value of the feature 
   */
  public Vector getLocation() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "org.texttechnologylab.annotation.Room.Object");
    return (Vector)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_location)));}
    
  /** setter for location - sets 3D Location Vector. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocation(Vector v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_location == null)
      jcasType.jcas.throwFeatMissing("location", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setRefValue(addr, ((Object_Type)jcasType).casFeatCode_location, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: rotation

  /** getter for rotation - gets 4D Rotation Quaternion
   * @generated
   * @return value of the feature 
   */
  public Vector getRotation() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.Room.Object");
    return (Vector)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_rotation)));}
    
  /** setter for rotation - sets 4D Rotation Quaternion 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRotation(Vector v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setRefValue(addr, ((Object_Type)jcasType).casFeatCode_rotation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: objectFeature

  /** getter for objectFeature - gets All feature of the object
   * @generated
   * @return value of the feature 
   */
  public FSArray getObjectFeature() {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_objectFeature == null)
      jcasType.jcas.throwFeatMissing("objectFeature", "org.texttechnologylab.annotation.Room.Object");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_objectFeature)));}
    
  /** setter for objectFeature - sets All feature of the object 
   * @generated
   * @param v value to set into the feature 
   */
  public void setObjectFeature(FSArray v) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_objectFeature == null)
      jcasType.jcas.throwFeatMissing("objectFeature", "org.texttechnologylab.annotation.Room.Object");
    jcasType.ll_cas.ll_setRefValue(addr, ((Object_Type)jcasType).casFeatCode_objectFeature, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for objectFeature - gets an indexed value - All feature of the object
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public ObjectAttribute getObjectFeature(int i) {
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_objectFeature == null)
      jcasType.jcas.throwFeatMissing("objectFeature", "org.texttechnologylab.annotation.Room.Object");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_objectFeature), i);
    return (ObjectAttribute)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_objectFeature), i)));}

  /** indexed setter for objectFeature - sets an indexed value - All feature of the object
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setObjectFeature(int i, ObjectAttribute v) { 
    if (Object_Type.featOkTst && ((Object_Type)jcasType).casFeat_objectFeature == null)
      jcasType.jcas.throwFeatMissing("objectFeature", "org.texttechnologylab.annotation.Room.Object");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_objectFeature), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Object_Type)jcasType).casFeatCode_objectFeature), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    