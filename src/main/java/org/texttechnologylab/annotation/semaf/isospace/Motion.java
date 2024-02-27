

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 27 21:02:41 CET 2024 */

package org.texttechnologylab.annotation.semaf.isospace;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isobase.Entity;
import org.texttechnologylab.annotation.semaf.isobase.Event;


/** 
 * Updated by JCasGen Tue Feb 27 21:02:41 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Motion extends Event {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.Motion";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Motion.class);
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
   
  public final static String _FeatName_motion_type = "motion_type";
  public final static String _FeatName_motion_class = "motion_class";
  public final static String _FeatName_motion_sense = "motion_sense";
  public final static String _FeatName_manner = "manner";
  public final static String _FeatName_motion_goal = "motion_goal";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_motion_type = TypeSystemImpl.createCallSite(Motion.class, "motion_type");
  private final static MethodHandle _FH_motion_type = _FC_motion_type.dynamicInvoker();
  private final static CallSite _FC_motion_class = TypeSystemImpl.createCallSite(Motion.class, "motion_class");
  private final static MethodHandle _FH_motion_class = _FC_motion_class.dynamicInvoker();
  private final static CallSite _FC_motion_sense = TypeSystemImpl.createCallSite(Motion.class, "motion_sense");
  private final static MethodHandle _FH_motion_sense = _FC_motion_sense.dynamicInvoker();
  private final static CallSite _FC_manner = TypeSystemImpl.createCallSite(Motion.class, "manner");
  private final static MethodHandle _FH_manner = _FC_manner.dynamicInvoker();
  private final static CallSite _FC_motion_goal = TypeSystemImpl.createCallSite(Motion.class, "motion_goal");
  private final static MethodHandle _FH_motion_goal = _FC_motion_goal.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Motion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Motion(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Motion(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Motion(JCas jcas, int begin, int end) {
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
  //* Feature: motion_type

  /** getter for motion_type - gets ( MANNER | PATH | COMPOUND )
   * @generated
   * @return value of the feature 
   */
  public String getMotion_type() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_motion_type));
  }
    
  /** setter for motion_type - sets ( MANNER | PATH | COMPOUND ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_type(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_motion_type), v);
  }    
    
   
    
  //*--------------*
  //* Feature: motion_class

  /** getter for motion_class - gets ( MOVE | MOVE_EXTERNAL | MOVE_INTERNAL | LEAVE | REACH | CROSS | DETACH | HIT | FOLLOW | DEVIATE | STAY )
   * @generated
   * @return value of the feature 
   */
  public String getMotion_class() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_motion_class));
  }
    
  /** setter for motion_class - sets ( MOVE | MOVE_EXTERNAL | MOVE_INTERNAL | LEAVE | REACH | CROSS | DETACH | HIT | FOLLOW | DEVIATE | STAY ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_class(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_motion_class), v);
  }    
    
   
    
  //*--------------*
  //* Feature: motion_sense

  /** getter for motion_sense - gets ( LITERAL | FICTIVE | INTRINSIC_CHANGE )
   * @generated
   * @return value of the feature 
   */
  public String getMotion_sense() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_motion_sense));
  }
    
  /** setter for motion_sense - sets ( LITERAL | FICTIVE | INTRINSIC_CHANGE ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_sense(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_motion_sense), v);
  }    
    
   
    
  //*--------------*
  //* Feature: manner

  /** getter for manner - gets 
   * @generated
   * @return value of the feature 
   */
  public Entity getManner() { 
    return (Entity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_manner)));
  }
    
  /** setter for manner - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setManner(Entity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_manner), v);
  }    
    
   
    
  //*--------------*
  //* Feature: motion_goal

  /** getter for motion_goal - gets 
   * @generated
   * @return value of the feature 
   */
  public SpatialEntity getMotion_goal() { 
    return (SpatialEntity)(_getFeatureValueNc(wrapGetIntCatchException(_FH_motion_goal)));
  }
    
  /** setter for motion_goal - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_goal(SpatialEntity v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_motion_goal), v);
  }    
    
  }

    