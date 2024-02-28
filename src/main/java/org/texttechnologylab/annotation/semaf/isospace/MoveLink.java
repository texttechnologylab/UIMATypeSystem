

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:02:33 CET 2024 */

package org.texttechnologylab.annotation.semaf.isospace;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.semaf.isobase.Link;


/** 
 * Updated by JCasGen Wed Feb 28 22:02:33 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MoveLink extends Link {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.MoveLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MoveLink.class);
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
   
  public final static String _FeatName_source = "source";
  public final static String _FeatName_goal = "goal";
  public final static String _FeatName_mid_point = "mid_point";
  public final static String _FeatName_mid_point_array = "mid_point_array";
  public final static String _FeatName_path_id = "path_id";
  public final static String _FeatName_adjunct_id = "adjunct_id";
  public final static String _FeatName_motionsignal_id = "motionsignal_id";
  public final static String _FeatName_goal_reached = "goal_reached";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_source = TypeSystemImpl.createCallSite(MoveLink.class, "source");
  private final static MethodHandle _FH_source = _FC_source.dynamicInvoker();
  private final static CallSite _FC_goal = TypeSystemImpl.createCallSite(MoveLink.class, "goal");
  private final static MethodHandle _FH_goal = _FC_goal.dynamicInvoker();
  private final static CallSite _FC_mid_point = TypeSystemImpl.createCallSite(MoveLink.class, "mid_point");
  private final static MethodHandle _FH_mid_point = _FC_mid_point.dynamicInvoker();
  private final static CallSite _FC_mid_point_array = TypeSystemImpl.createCallSite(MoveLink.class, "mid_point_array");
  private final static MethodHandle _FH_mid_point_array = _FC_mid_point_array.dynamicInvoker();
  private final static CallSite _FC_path_id = TypeSystemImpl.createCallSite(MoveLink.class, "path_id");
  private final static MethodHandle _FH_path_id = _FC_path_id.dynamicInvoker();
  private final static CallSite _FC_adjunct_id = TypeSystemImpl.createCallSite(MoveLink.class, "adjunct_id");
  private final static MethodHandle _FH_adjunct_id = _FC_adjunct_id.dynamicInvoker();
  private final static CallSite _FC_motionsignal_id = TypeSystemImpl.createCallSite(MoveLink.class, "motionsignal_id");
  private final static MethodHandle _FH_motionsignal_id = _FC_motionsignal_id.dynamicInvoker();
  private final static CallSite _FC_goal_reached = TypeSystemImpl.createCallSite(MoveLink.class, "goal_reached");
  private final static MethodHandle _FH_goal_reached = _FC_goal_reached.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected MoveLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MoveLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MoveLink(JCas jcas) {
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
  //* Feature: source

  /** getter for source - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getSource() { 
    return (Entity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_source)));
  }
    
  /** setter for source - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(Entity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_source), v);
  }    
    
   
    
  //*--------------*
  //* Feature: goal

  /** getter for goal - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getGoal() { 
    return (Entity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_goal)));
  }
    
  /** setter for goal - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGoal(Entity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_goal), v);
  }    
    
   
    
  //*--------------*
  //* Feature: mid_point

  /** getter for mid_point - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<Entity> getMid_point() { 
    return (FSList<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_mid_point)));
  }
    
  /** setter for mid_point - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMid_point(FSList<Entity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_mid_point), v);
  }    
    
   
    
  //*--------------*
  //* Feature: mid_point_array

  /** getter for mid_point_array - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Entity> getMid_point_array() { 
    return (FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_mid_point_array)));
  }
    
  /** setter for mid_point_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMid_point_array(FSArray<Entity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_mid_point_array), v);
  }    
    
    
  /** indexed getter for mid_point_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Entity getMid_point_array(int i) {
     return (Entity)(((FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_mid_point_array)))).get(i));
  } 

  /** indexed setter for mid_point_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setMid_point_array(int i, Entity v) {
    ((FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_mid_point_array)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: path_id

  /** getter for path_id - gets 
   * @generated
   * @return value of the feature 
   */
  public Path getPath_id() { 
    return (Path)(_getFeatureValueNc(wrapGetIntCatchException(_FH_path_id)));
  }
    
  /** setter for path_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPath_id(Path v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_path_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: adjunct_id

  /** getter for adjunct_id - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialSignal getAdjunct_id() { 
    return (SpatialSignal)(_getFeatureValueNc(wrapGetIntCatchException(_FH_adjunct_id)));
  }
    
  /** setter for adjunct_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdjunct_id(SpatialSignal v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_adjunct_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: motionsignal_id

  /** getter for motionsignal_id - gets 
   * @generated
   * @return value of the feature 
   */
  public MotionSignal getMotionsignal_id() { 
    return (MotionSignal)(_getFeatureValueNc(wrapGetIntCatchException(_FH_motionsignal_id)));
  }
    
  /** setter for motionsignal_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotionsignal_id(MotionSignal v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_motionsignal_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: goal_reached

  /** getter for goal_reached - gets ( YES | NO | UNCERTAIN )
   * @generated
   * @return value of the feature 
   */
  public String getGoal_reached() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_goal_reached));
  }
    
  /** setter for goal_reached - sets ( YES | NO | UNCERTAIN ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGoal_reached(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_goal_reached), v);
  }    
    
  }

    