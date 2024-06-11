

   
/* Apache UIMA v3 - First created by JCasGen Tue Jun 11 17:17:54 CEST 2024 */

package org.texttechnologylab.annotation.semaf.isospace;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;
import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.texttechnologylab.annotation.semaf.isobase.Link;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Tue Jun 11 17:17:54 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MLink extends Link {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.MLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MLink.class);
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
   
  public final static String _FeatName_val = "val";
  public final static String _FeatName_end_point1 = "end_point1";
  public final static String _FeatName_end_point2 = "end_point2";
  public final static String _FeatName_bounds = "bounds";
  public final static String _FeatName_bounds_array = "bounds_array";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_val = TypeSystemImpl.createCallSite(MLink.class, "val");
  private final static MethodHandle _FH_val = _FC_val.dynamicInvoker();
  private final static CallSite _FC_end_point1 = TypeSystemImpl.createCallSite(MLink.class, "end_point1");
  private final static MethodHandle _FH_end_point1 = _FC_end_point1.dynamicInvoker();
  private final static CallSite _FC_end_point2 = TypeSystemImpl.createCallSite(MLink.class, "end_point2");
  private final static MethodHandle _FH_end_point2 = _FC_end_point2.dynamicInvoker();
  private final static CallSite _FC_bounds = TypeSystemImpl.createCallSite(MLink.class, "bounds");
  private final static MethodHandle _FH_bounds = _FC_bounds.dynamicInvoker();
  private final static CallSite _FC_bounds_array = TypeSystemImpl.createCallSite(MLink.class, "bounds_array");
  private final static MethodHandle _FH_bounds_array = _FC_bounds_array.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected MLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MLink(JCas jcas) {
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
  //* Feature: val

  /** getter for val - gets 
   * @generated
   * @return value of the feature 
   */
  public Measure getVal() { 
    return (Measure)(_getFeatureValueNc(wrapGetIntCatchException(_FH_val)));
  }
    
  /** setter for val - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVal(Measure v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_val), v);
  }    
    
   
    
  //*--------------*
  //* Feature: end_point1

  /** getter for end_point1 - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getEnd_point1() { 
    return (Entity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_end_point1)));
  }
    
  /** setter for end_point1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd_point1(Entity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_end_point1), v);
  }    
    
   
    
  //*--------------*
  //* Feature: end_point2

  /** getter for end_point2 - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getEnd_point2() { 
    return (Entity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_end_point2)));
  }
    
  /** setter for end_point2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd_point2(Entity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_end_point2), v);
  }    
    
   
    
  //*--------------*
  //* Feature: bounds

  /** getter for bounds - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<Entity> getBounds() { 
    return (FSList<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_bounds)));
  }
    
  /** setter for bounds - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBounds(FSList<Entity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_bounds), v);
  }    
    
   
    
  //*--------------*
  //* Feature: bounds_array

  /** getter for bounds_array - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Entity> getBounds_array() { 
    return (FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_bounds_array)));
  }
    
  /** setter for bounds_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBounds_array(FSArray<Entity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_bounds_array), v);
  }    
    
    
  /** indexed getter for bounds_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Entity getBounds_array(int i) {
     return (Entity)(((FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_bounds_array)))).get(i));
  } 

  /** indexed setter for bounds_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setBounds_array(int i, Entity v) {
    ((FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_bounds_array)))).set(i, v);
  }  
  }

    