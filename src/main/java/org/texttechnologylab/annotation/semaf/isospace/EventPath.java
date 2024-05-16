

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 11:15:15 CEST 2024 */

package org.texttechnologylab.annotation.semaf.isospace;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Thu May 16 11:15:15 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EventPath extends Location {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.EventPath";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EventPath.class);
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
   
  public final static String _FeatName_trigger = "trigger";
  public final static String _FeatName_startID = "startID";
  public final static String _FeatName_midIDs = "midIDs";
  public final static String _FeatName_midID_array = "midID_array";
  public final static String _FeatName_endID = "endID";
  public final static String _FeatName_spatial_relator = "spatial_relator";
  public final static String _FeatName_spatial_relator_array = "spatial_relator_array";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_trigger = TypeSystemImpl.createCallSite(EventPath.class, "trigger");
  private final static MethodHandle _FH_trigger = _FC_trigger.dynamicInvoker();
  private final static CallSite _FC_startID = TypeSystemImpl.createCallSite(EventPath.class, "startID");
  private final static MethodHandle _FH_startID = _FC_startID.dynamicInvoker();
  private final static CallSite _FC_midIDs = TypeSystemImpl.createCallSite(EventPath.class, "midIDs");
  private final static MethodHandle _FH_midIDs = _FC_midIDs.dynamicInvoker();
  private final static CallSite _FC_midID_array = TypeSystemImpl.createCallSite(EventPath.class, "midID_array");
  private final static MethodHandle _FH_midID_array = _FC_midID_array.dynamicInvoker();
  private final static CallSite _FC_endID = TypeSystemImpl.createCallSite(EventPath.class, "endID");
  private final static MethodHandle _FH_endID = _FC_endID.dynamicInvoker();
  private final static CallSite _FC_spatial_relator = TypeSystemImpl.createCallSite(EventPath.class, "spatial_relator");
  private final static MethodHandle _FH_spatial_relator = _FC_spatial_relator.dynamicInvoker();
  private final static CallSite _FC_spatial_relator_array = TypeSystemImpl.createCallSite(EventPath.class, "spatial_relator_array");
  private final static MethodHandle _FH_spatial_relator_array = _FC_spatial_relator_array.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected EventPath() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public EventPath(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EventPath(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EventPath(JCas jcas, int begin, int end) {
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
  //* Feature: trigger

  /** getter for trigger - gets 
   * @generated
   * @return value of the feature 
   */
  public Motion getTrigger() { 
    return (Motion)(_getFeatureValueNc(wrapGetIntCatchException(_FH_trigger)));
  }
    
  /** setter for trigger - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTrigger(Motion v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_trigger), v);
  }    
    
   
    
  //*--------------*
  //* Feature: startID

  /** getter for startID - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialEntity getStartID() { 
    return (SpatialEntity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_startID)));
  }
    
  /** setter for startID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStartID(SpatialEntity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_startID), v);
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
  //* Feature: spatial_relator

  /** getter for spatial_relator - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<SpatialSignal> getSpatial_relator() { 
    return (FSList<SpatialSignal>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_spatial_relator)));
  }
    
  /** setter for spatial_relator - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpatial_relator(FSList<SpatialSignal> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_spatial_relator), v);
  }    
    
   
    
  //*--------------*
  //* Feature: spatial_relator_array

  /** getter for spatial_relator_array - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<SpatialSignal> getSpatial_relator_array() { 
    return (FSArray<SpatialSignal>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_spatial_relator_array)));
  }
    
  /** setter for spatial_relator_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpatial_relator_array(FSArray<SpatialSignal> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_spatial_relator_array), v);
  }    
    
    
  /** indexed getter for spatial_relator_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public SpatialSignal getSpatial_relator_array(int i) {
     return (SpatialSignal)(((FSArray<SpatialSignal>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_spatial_relator_array)))).get(i));
  } 

  /** indexed setter for spatial_relator_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setSpatial_relator_array(int i, SpatialSignal v) {
    ((FSArray<SpatialSignal>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_spatial_relator_array)))).set(i, v);
  }  
  }

    