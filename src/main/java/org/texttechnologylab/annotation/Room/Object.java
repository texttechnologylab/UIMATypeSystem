

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 17:29:53 CEST 2024 */

package org.texttechnologylab.annotation.Room;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;
import org.texttechnologylab.annotation.Vector;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/** Can be a single object or a group of objects
 * Updated by JCasGen Thu May 16 17:29:53 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Object extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Room.Object";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_name = "name";
  public final static String _FeatName_fatherObject = "fatherObject";
  public final static String _FeatName_nextTimeObject = "nextTimeObject";
  public final static String _FeatName_prevTimeObject = "prevTimeObject";
  public final static String _FeatName_timeReference = "timeReference";
  public final static String _FeatName_shapeNetID = "shapeNetID";
  public final static String _FeatName_scale = "scale";
  public final static String _FeatName_location = "location";
  public final static String _FeatName_rotation = "rotation";
  public final static String _FeatName_objectFeature = "objectFeature";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_name = TypeSystemImpl.createCallSite(Object.class, "name");
  private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();
  private final static CallSite _FC_fatherObject = TypeSystemImpl.createCallSite(Object.class, "fatherObject");
  private final static MethodHandle _FH_fatherObject = _FC_fatherObject.dynamicInvoker();
  private final static CallSite _FC_nextTimeObject = TypeSystemImpl.createCallSite(Object.class, "nextTimeObject");
  private final static MethodHandle _FH_nextTimeObject = _FC_nextTimeObject.dynamicInvoker();
  private final static CallSite _FC_prevTimeObject = TypeSystemImpl.createCallSite(Object.class, "prevTimeObject");
  private final static MethodHandle _FH_prevTimeObject = _FC_prevTimeObject.dynamicInvoker();
  private final static CallSite _FC_timeReference = TypeSystemImpl.createCallSite(Object.class, "timeReference");
  private final static MethodHandle _FH_timeReference = _FC_timeReference.dynamicInvoker();
  private final static CallSite _FC_shapeNetID = TypeSystemImpl.createCallSite(Object.class, "shapeNetID");
  private final static MethodHandle _FH_shapeNetID = _FC_shapeNetID.dynamicInvoker();
  private final static CallSite _FC_scale = TypeSystemImpl.createCallSite(Object.class, "scale");
  private final static MethodHandle _FH_scale = _FC_scale.dynamicInvoker();
  private final static CallSite _FC_location = TypeSystemImpl.createCallSite(Object.class, "location");
  private final static MethodHandle _FH_location = _FC_location.dynamicInvoker();
  private final static CallSite _FC_rotation = TypeSystemImpl.createCallSite(Object.class, "rotation");
  private final static MethodHandle _FH_rotation = _FC_rotation.dynamicInvoker();
  private final static CallSite _FC_objectFeature = TypeSystemImpl.createCallSite(Object.class, "objectFeature");
  private final static MethodHandle _FH_objectFeature = _FC_objectFeature.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Object() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Object(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_name));
  }
    
  /** setter for name - sets Name of the object (group). 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_name), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fatherObject

  /** getter for fatherObject - gets FatherObject in the hierarchy.
   * @generated
   * @return value of the feature 
   */
  public Object getFatherObject() { 
    return (Object)(_getFeatureValueNc(wrapGetIntCatchException(_FH_fatherObject)));
  }
    
  /** setter for fatherObject - sets FatherObject in the hierarchy. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFatherObject(Object v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_fatherObject), v);
  }    
    
   
    
  //*--------------*
  //* Feature: nextTimeObject

  /** getter for nextTimeObject - gets Reference to the same object the next time step.
   * @generated
   * @return value of the feature 
   */
  public Object getNextTimeObject() { 
    return (Object)(_getFeatureValueNc(wrapGetIntCatchException(_FH_nextTimeObject)));
  }
    
  /** setter for nextTimeObject - sets Reference to the same object the next time step. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNextTimeObject(Object v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_nextTimeObject), v);
  }    
    
   
    
  //*--------------*
  //* Feature: prevTimeObject

  /** getter for prevTimeObject - gets Reference to the same object the previous time step.
   * @generated
   * @return value of the feature 
   */
  public Object getPrevTimeObject() { 
    return (Object)(_getFeatureValueNc(wrapGetIntCatchException(_FH_prevTimeObject)));
  }
    
  /** setter for prevTimeObject - sets Reference to the same object the previous time step. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrevTimeObject(Object v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_prevTimeObject), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timeReference

  /** getter for timeReference - gets Reference to time location.
   * @generated
   * @return value of the feature 
   */
  public TimeChain getTimeReference() { 
    return (TimeChain)(_getFeatureValueNc(wrapGetIntCatchException(_FH_timeReference)));
  }
    
  /** setter for timeReference - sets Reference to time location. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimeReference(TimeChain v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_timeReference), v);
  }    
    
   
    
  //*--------------*
  //* Feature: shapeNetID

  /** getter for shapeNetID - gets ShapeNetID of the object.
   * @generated
   * @return value of the feature 
   */
  public String getShapeNetID() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_shapeNetID));
  }
    
  /** setter for shapeNetID - sets ShapeNetID of the object. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setShapeNetID(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_shapeNetID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: scale

  /** getter for scale - gets Scale of the object.
   * @generated
   * @return value of the feature 
   */
  public double getScale() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_scale));
  }
    
  /** setter for scale - sets Scale of the object. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScale(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_scale), v);
  }    
    
   
    
  //*--------------*
  //* Feature: location

  /** getter for location - gets 3D Location Vector.
   * @generated
   * @return value of the feature 
   */
  public Vector getLocation() { 
    return (Vector)(_getFeatureValueNc(wrapGetIntCatchException(_FH_location)));
  }
    
  /** setter for location - sets 3D Location Vector. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLocation(Vector v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_location), v);
  }    
    
   
    
  //*--------------*
  //* Feature: rotation

  /** getter for rotation - gets 4D Rotation Quaternion
   * @generated
   * @return value of the feature 
   */
  public Vector getRotation() { 
    return (Vector)(_getFeatureValueNc(wrapGetIntCatchException(_FH_rotation)));
  }
    
  /** setter for rotation - sets 4D Rotation Quaternion 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRotation(Vector v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_rotation), v);
  }    
    
   
    
  //*--------------*
  //* Feature: objectFeature

  /** getter for objectFeature - gets All feature of the object
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<ObjectAttribute> getObjectFeature() { 
    return (FSArray<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_objectFeature)));
  }
    
  /** setter for objectFeature - sets All feature of the object 
   * @generated
   * @param v value to set into the feature 
   */
  public void setObjectFeature(FSArray<ObjectAttribute> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_objectFeature), v);
  }    
    
    
  /** indexed getter for objectFeature - gets an indexed value - All feature of the object
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public ObjectAttribute getObjectFeature(int i) {
     return (ObjectAttribute)(((FSArray<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_objectFeature)))).get(i));
  } 

  /** indexed setter for objectFeature - sets an indexed value - All feature of the object
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setObjectFeature(int i, ObjectAttribute v) {
    ((FSArray<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_objectFeature)))).set(i, v);
  }  
  }

    