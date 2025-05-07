

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 18:09:54 CEST 2025 */

package org.texttechnologylab.annotation.semaf.isospace;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Wed May 07 18:09:54 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Path extends Location {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.Path";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Path.class);
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
   
  public final static String _FeatName_beginID = "beginID";
  public final static String _FeatName_endID = "endID";
  public final static String _FeatName_midIDs = "midIDs";
  public final static String _FeatName_midID_array = "midID_array";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_beginID = TypeSystemImpl.createCallSite(Path.class, "beginID");
  private final static MethodHandle _FH_beginID = _FC_beginID.dynamicInvoker();
  private final static CallSite _FC_endID = TypeSystemImpl.createCallSite(Path.class, "endID");
  private final static MethodHandle _FH_endID = _FC_endID.dynamicInvoker();
  private final static CallSite _FC_midIDs = TypeSystemImpl.createCallSite(Path.class, "midIDs");
  private final static MethodHandle _FH_midIDs = _FC_midIDs.dynamicInvoker();
  private final static CallSite _FC_midID_array = TypeSystemImpl.createCallSite(Path.class, "midID_array");
  private final static MethodHandle _FH_midID_array = _FC_midID_array.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Path() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Path(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Path(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Path(JCas jcas, int begin, int end) {
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
  //* Feature: beginID

  /** getter for beginID - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialEntity getBeginID() { 
    return (SpatialEntity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_beginID)));
  }
    
  /** setter for beginID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginID(SpatialEntity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_beginID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: endID

  /** getter for endID - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialEntity getEndID() { 
    return (SpatialEntity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_endID)));
  }
    
  /** setter for endID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndID(SpatialEntity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_endID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: midIDs

  /** getter for midIDs - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<SpatialEntity> getMidIDs() { 
    return (FSList<SpatialEntity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_midIDs)));
  }
    
  /** setter for midIDs - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMidIDs(FSList<SpatialEntity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_midIDs), v);
  }    
    
   
    
  //*--------------*
  //* Feature: midID_array

  /** getter for midID_array - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<SpatialEntity> getMidID_array() { 
    return (FSArray<SpatialEntity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_midID_array)));
  }
    
  /** setter for midID_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMidID_array(FSArray<SpatialEntity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_midID_array), v);
  }    
    
    
  /** indexed getter for midID_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public SpatialEntity getMidID_array(int i) {
     return (SpatialEntity)(((FSArray<SpatialEntity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_midID_array)))).get(i));
  } 

  /** indexed setter for midID_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setMidID_array(int i, SpatialEntity v) {
    ((FSArray<SpatialEntity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_midID_array)))).set(i, v);
  }  
  }

    