

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:09:04 CEST 2024 */

package org.texttechnologylab.annotation.Room;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.AnnotationBase;
import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.Vector;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/** Roomwall
 * Updated by JCasGen Thu Jul 04 15:09:04 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class RoomWall extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Room.RoomWall";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_vectorlist = "vectorlist";
  public final static String _FeatName_height = "height";
  public final static String _FeatName_feature = "feature";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_vectorlist = TypeSystemImpl.createCallSite(RoomWall.class, "vectorlist");
  private final static MethodHandle _FH_vectorlist = _FC_vectorlist.dynamicInvoker();
  private final static CallSite _FC_height = TypeSystemImpl.createCallSite(RoomWall.class, "height");
  private final static MethodHandle _FH_height = _FC_height.dynamicInvoker();
  private final static CallSite _FC_feature = TypeSystemImpl.createCallSite(RoomWall.class, "feature");
  private final static MethodHandle _FH_feature = _FC_feature.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected RoomWall() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public RoomWall(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
  @SuppressWarnings("unchecked")
  public FSArray<Vector> getVectorlist() { 
    return (FSArray<Vector>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_vectorlist)));
  }
    
  /** setter for vectorlist - sets List of all Wallpoints 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVectorlist(FSArray<Vector> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_vectorlist), v);
  }    
    
    
  /** indexed getter for vectorlist - gets an indexed value - List of all Wallpoints
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Vector getVectorlist(int i) {
     return (Vector)(((FSArray<Vector>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_vectorlist)))).get(i));
  } 

  /** indexed setter for vectorlist - sets an indexed value - List of all Wallpoints
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setVectorlist(int i, Vector v) {
    ((FSArray<Vector>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_vectorlist)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: height

  /** getter for height - gets Height of the wall
   * @generated
   * @return value of the feature 
   */
  public double getHeight() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_height));
  }
    
  /** setter for height - sets Height of the wall 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeight(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_height), v);
  }    
    
   
    
  //*--------------*
  //* Feature: feature

  /** getter for feature - gets Feature like color or texture.
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<ObjectAttribute> getFeature() { 
    return (FSArray<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_feature)));
  }
    
  /** setter for feature - sets Feature like color or texture. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeature(FSArray<ObjectAttribute> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_feature), v);
  }    
    
    
  /** indexed getter for feature - gets an indexed value - Feature like color or texture.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public ObjectAttribute getFeature(int i) {
     return (ObjectAttribute)(((FSArray<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_feature)))).get(i));
  } 

  /** indexed setter for feature - sets an indexed value - Feature like color or texture.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setFeature(int i, ObjectAttribute v) {
    ((FSArray<ObjectAttribute>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_feature)))).set(i, v);
  }  
  }

    