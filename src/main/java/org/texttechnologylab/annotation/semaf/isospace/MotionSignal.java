

/* First created by JCasGen Tue Mar 24 15:23:19 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Signal;


/** 
 * Updated by JCasGen Wed Apr 01 13:38:52 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class MotionSignal extends Signal {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected MotionSignal() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MotionSignal(int addr, TOP_Type type) {
    super(addr, type);
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
    if (MotionSignal_Type.featOkTst && ((MotionSignal_Type)jcasType).casFeat_motion_signal_type == null)
      jcasType.jcas.throwFeatMissing("motion_signal_type", "org.texttechnologylab.annotation.semaf.isospace.MotionSignal");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MotionSignal_Type)jcasType).casFeatCode_motion_signal_type);}
    
  /** setter for motion_signal_type - sets ( MANNER | PATH ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMotion_signal_type(String v) {
    if (MotionSignal_Type.featOkTst && ((MotionSignal_Type)jcasType).casFeat_motion_signal_type == null)
      jcasType.jcas.throwFeatMissing("motion_signal_type", "org.texttechnologylab.annotation.semaf.isospace.MotionSignal");
    jcasType.ll_cas.ll_setStringValue(addr, ((MotionSignal_Type)jcasType).casFeatCode_motion_signal_type, v);}    
  }

    