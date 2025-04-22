

   
/* Apache UIMA v3 - First created by JCasGen Tue Apr 22 17:11:16 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** Vector in a room
 * Updated by JCasGen Tue Apr 22 17:11:16 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Vector extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Vector";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Vector.class);
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
  public final static String _FeatName_w = "w";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_x = TypeSystemImpl.createCallSite(Vector.class, "x");
  private final static MethodHandle _FH_x = _FC_x.dynamicInvoker();
  private final static CallSite _FC_y = TypeSystemImpl.createCallSite(Vector.class, "y");
  private final static MethodHandle _FH_y = _FC_y.dynamicInvoker();
  private final static CallSite _FC_z = TypeSystemImpl.createCallSite(Vector.class, "z");
  private final static MethodHandle _FH_z = _FC_z.dynamicInvoker();
  private final static CallSite _FC_w = TypeSystemImpl.createCallSite(Vector.class, "w");
  private final static MethodHandle _FH_w = _FC_w.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Vector() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Vector(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Vector(JCas jcas) {
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

  /** getter for x - gets x Element
   * @generated
   * @return value of the feature 
   */
  public double getX() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_x));
  }
    
  /** setter for x - sets x Element 
   * @generated
   * @param v value to set into the feature 
   */
  public void setX(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_x), v);
  }    
    
   
    
  //*--------------*
  //* Feature: y

  /** getter for y - gets y Element
   * @generated
   * @return value of the feature 
   */
  public double getY() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_y));
  }
    
  /** setter for y - sets y Element 
   * @generated
   * @param v value to set into the feature 
   */
  public void setY(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_y), v);
  }    
    
   
    
  //*--------------*
  //* Feature: z

  /** getter for z - gets z Element
   * @generated
   * @return value of the feature 
   */
  public double getZ() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_z));
  }
    
  /** setter for z - sets z Element 
   * @generated
   * @param v value to set into the feature 
   */
  public void setZ(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_z), v);
  }    
    
   
    
  //*--------------*
  //* Feature: w

  /** getter for w - gets w Element (optimal)
   * @generated
   * @return value of the feature 
   */
  public double getW() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_w));
  }
    
  /** setter for w - sets w Element (optimal) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setW(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_w), v);
  }    
    
  }

    