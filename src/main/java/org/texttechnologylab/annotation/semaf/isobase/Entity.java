

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 17:25:22 CEST 2024 */

package org.texttechnologylab.annotation.semaf.isobase;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3;
import org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4;
import org.texttechnologylab.annotation.semaf.IsoSpatial.ObjectAttribute;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu May 16 17:25:22 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Entity extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isobase.Entity";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_comment = "comment";
  public final static String _FeatName_mod = "mod";
  public final static String _FeatName_object_id = "object_id";
  public final static String _FeatName_position = "position";
  public final static String _FeatName_rotation = "rotation";
  public final static String _FeatName_scale = "scale";
  public final static String _FeatName_object_feature = "object_feature";
  public final static String _FeatName_object_feature_array = "object_feature_array";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_comment = TypeSystemImpl.createCallSite(Entity.class, "comment");
  private final static MethodHandle _FH_comment = _FC_comment.dynamicInvoker();
  private final static CallSite _FC_mod = TypeSystemImpl.createCallSite(Entity.class, "mod");
  private final static MethodHandle _FH_mod = _FC_mod.dynamicInvoker();
  private final static CallSite _FC_object_id = TypeSystemImpl.createCallSite(Entity.class, "object_id");
  private final static MethodHandle _FH_object_id = _FC_object_id.dynamicInvoker();
  private final static CallSite _FC_position = TypeSystemImpl.createCallSite(Entity.class, "position");
  private final static MethodHandle _FH_position = _FC_position.dynamicInvoker();
  private final static CallSite _FC_rotation = TypeSystemImpl.createCallSite(Entity.class, "rotation");
  private final static MethodHandle _FH_rotation = _FC_rotation.dynamicInvoker();
  private final static CallSite _FC_scale = TypeSystemImpl.createCallSite(Entity.class, "scale");
  private final static MethodHandle _FH_scale = _FC_scale.dynamicInvoker();
  private final static CallSite _FC_object_feature = TypeSystemImpl.createCallSite(Entity.class, "object_feature");
  private final static MethodHandle _FH_object_feature = _FC_object_feature.dynamicInvoker();
  private final static CallSite _FC_object_feature_array = TypeSystemImpl.createCallSite(Entity.class, "object_feature_array");
  private final static MethodHandle _FH_object_feature_array = _FC_object_feature_array.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Entity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Entity(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_comment));
  }
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_comment), v);
  }    
    
   
    
  //*--------------*
  //* Feature: mod

  /** getter for mod - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMod() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_mod));
  }
    
  /** setter for mod - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMod(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_mod), v);
  }    
    
   
    
  //*--------------*
  //* Feature: object_id

  /** getter for object_id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getObject_id() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_object_id));
  }
    
  /** setter for object_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObject_id(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_object_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: position

  /** getter for position - gets 
   * @generated
   * @return value of the feature 
   */
  public Vec3 getPosition() { 
    return (Vec3)(_getFeatureValueNc(wrapGetIntCatchException(_FH_position)));
  }
    
  /** setter for position - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosition(Vec3 v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_position), v);
  }    
    
   
    
  //*--------------*
  //* Feature: rotation

  /** getter for rotation - gets 
   * @generated
   * @return value of the feature 
   */
  public Vec4 getRotation() { 
    return (Vec4)(_getFeatureValueNc(wrapGetIntCatchException(_FH_rotation)));
  }
    
  /** setter for rotation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRotation(Vec4 v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_rotation), v);
  }    
    
   
    
  //*--------------*
  //* Feature: scale

  /** getter for scale - gets 
   * @generated
   * @return value of the feature 
   */
  public Vec3 getScale() { 
    return (Vec3)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scale)));
  }
    
  /** setter for scale - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScale(Vec3 v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_scale), v);
  }    
    
   
    
  //*--------------*
  //* Feature: object_feature

  /** getter for object_feature - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<ObjectAttribute> getObject_feature() { 
    return (FSList<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_object_feature)));
  }
    
  /** setter for object_feature - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObject_feature(FSList<ObjectAttribute> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_object_feature), v);
  }    
    
   
    
  //*--------------*
  //* Feature: object_feature_array

  /** getter for object_feature_array - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<ObjectAttribute> getObject_feature_array() { 
    return (FSArray<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_object_feature_array)));
  }
    
  /** setter for object_feature_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObject_feature_array(FSArray<ObjectAttribute> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_object_feature_array), v);
  }    
    
    
  /** indexed getter for object_feature_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public ObjectAttribute getObject_feature_array(int i) {
     return (ObjectAttribute)(((FSArray<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_object_feature_array)))).get(i));
  } 

  /** indexed setter for object_feature_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setObject_feature_array(int i, ObjectAttribute v) {
    ((FSArray<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_object_feature_array)))).set(i, v);
  }  
  }

    