

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 17:29:53 CEST 2024 */

package org.texttechnologylab.annotation.semaf.IsoSpatial;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/**
 * Updated by JCasGen Thu May 16 17:29:53 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Vec3 extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Vec3.class);
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
   
  public final static String _FeatName_x = "x";
  public final static String _FeatName_y = "y";
  public final static String _FeatName_z = "z";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_x = TypeSystemImpl.createCallSite(Vec3.class, "x");
  private final static MethodHandle _FH_x = _FC_x.dynamicInvoker();
  private final static CallSite _FC_y = TypeSystemImpl.createCallSite(Vec3.class, "y");
  private final static MethodHandle _FH_y = _FC_y.dynamicInvoker();
  private final static CallSite _FC_z = TypeSystemImpl.createCallSite(Vec3.class, "z");
  private final static MethodHandle _FH_z = _FC_z.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Vec3() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Vec3(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Vec3(JCas jcas) {
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
  //* Feature: x

  /** getter for x - gets 
   * @generated
   * @return value of the feature 
   */
  public double getX() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_x));
  }
    
  /** setter for x - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setX(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_x), v);
  }    
    
   
    
  //*--------------*
  //* Feature: y

  /** getter for y - gets 
   * @generated
   * @return value of the feature 
   */
  public double getY() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_y));
  }
    
  /** setter for y - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setY(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_y), v);
  }    
    
   
    
  //*--------------*
  //* Feature: z

  /** getter for z - gets 
   * @generated
   * @return value of the feature 
   */
  public double getZ() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_z));
  }
    
  /** setter for z - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setZ(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_z), v);
  }    
    
  }

    