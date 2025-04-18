

   
/* Apache UIMA v3 - First created by JCasGen Sat Apr 19 00:21:17 CEST 2025 */

package org.texttechnologylab.annotation.semaf.isospace;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isobase.Signal;


/** 
 * Updated by JCasGen Sat Apr 19 00:21:17 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MotionSignal extends Signal {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isospace.MotionSignal";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MotionSignal.class);
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
   
  public final static String _FeatName_motion_signal_type = "motion_signal_type";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_motion_signal_type = TypeSystemImpl.createCallSite(MotionSignal.class, "motion_signal_type");
  private final static MethodHandle _FH_motion_signal_type = _FC_motion_signal_type.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected MotionSignal() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MotionSignal(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MotionSignal(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MotionSignal(JCas jcas, int begin, int end) {
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
  //* Feature: motion_signal_type

  /** getter for motion_signal_type - gets ( MANNER | PATH )
   * @generated
   * @return value of the feature 
   */
  public String getMotion_signal_type() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_motion_signal_type));
  }
    
  /** setter for motion_signal_type - sets ( MANNER | PATH ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_signal_type(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_motion_signal_type), v);
  }    
    
  }

    