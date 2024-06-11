

   
/* Apache UIMA v3 - First created by JCasGen Tue Jun 11 17:17:54 CEST 2024 */

package org.hucompute.textimager.uima.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Tue Jun 11 17:17:54 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OpenIERelation extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.hucompute.textimager.uima.type.OpenIERelation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OpenIERelation.class);
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
   
  public final static String _FeatName_confidence = "confidence";
  public final static String _FeatName_beginArg1 = "beginArg1";
  public final static String _FeatName_endArg1 = "endArg1";
  public final static String _FeatName_valueArg1 = "valueArg1";
  public final static String _FeatName_beginRel = "beginRel";
  public final static String _FeatName_endRel = "endRel";
  public final static String _FeatName_valueRel = "valueRel";
  public final static String _FeatName_beginArg2 = "beginArg2";
  public final static String _FeatName_endArg2 = "endArg2";
  public final static String _FeatName_valueArg2 = "valueArg2";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_confidence = TypeSystemImpl.createCallSite(OpenIERelation.class, "confidence");
  private final static MethodHandle _FH_confidence = _FC_confidence.dynamicInvoker();
  private final static CallSite _FC_beginArg1 = TypeSystemImpl.createCallSite(OpenIERelation.class, "beginArg1");
  private final static MethodHandle _FH_beginArg1 = _FC_beginArg1.dynamicInvoker();
  private final static CallSite _FC_endArg1 = TypeSystemImpl.createCallSite(OpenIERelation.class, "endArg1");
  private final static MethodHandle _FH_endArg1 = _FC_endArg1.dynamicInvoker();
  private final static CallSite _FC_valueArg1 = TypeSystemImpl.createCallSite(OpenIERelation.class, "valueArg1");
  private final static MethodHandle _FH_valueArg1 = _FC_valueArg1.dynamicInvoker();
  private final static CallSite _FC_beginRel = TypeSystemImpl.createCallSite(OpenIERelation.class, "beginRel");
  private final static MethodHandle _FH_beginRel = _FC_beginRel.dynamicInvoker();
  private final static CallSite _FC_endRel = TypeSystemImpl.createCallSite(OpenIERelation.class, "endRel");
  private final static MethodHandle _FH_endRel = _FC_endRel.dynamicInvoker();
  private final static CallSite _FC_valueRel = TypeSystemImpl.createCallSite(OpenIERelation.class, "valueRel");
  private final static MethodHandle _FH_valueRel = _FC_valueRel.dynamicInvoker();
  private final static CallSite _FC_beginArg2 = TypeSystemImpl.createCallSite(OpenIERelation.class, "beginArg2");
  private final static MethodHandle _FH_beginArg2 = _FC_beginArg2.dynamicInvoker();
  private final static CallSite _FC_endArg2 = TypeSystemImpl.createCallSite(OpenIERelation.class, "endArg2");
  private final static MethodHandle _FH_endArg2 = _FC_endArg2.dynamicInvoker();
  private final static CallSite _FC_valueArg2 = TypeSystemImpl.createCallSite(OpenIERelation.class, "valueArg2");
  private final static MethodHandle _FH_valueArg2 = _FC_valueArg2.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected OpenIERelation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public OpenIERelation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OpenIERelation(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OpenIERelation(JCas jcas, int begin, int end) {
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
  //* Feature: confidence

  /** getter for confidence - gets 
   * @generated
   * @return value of the feature 
   */
  public double getConfidence() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_confidence));
  }
    
  /** setter for confidence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_confidence), v);
  }    
    
   
    
  //*--------------*
  //* Feature: beginArg1

  /** getter for beginArg1 - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBeginArg1() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_beginArg1));
  }
    
  /** setter for beginArg1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginArg1(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_beginArg1), v);
  }    
    
   
    
  //*--------------*
  //* Feature: endArg1

  /** getter for endArg1 - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEndArg1() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_endArg1));
  }
    
  /** setter for endArg1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndArg1(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_endArg1), v);
  }    
    
   
    
  //*--------------*
  //* Feature: valueArg1

  /** getter for valueArg1 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValueArg1() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_valueArg1));
  }
    
  /** setter for valueArg1 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValueArg1(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_valueArg1), v);
  }    
    
   
    
  //*--------------*
  //* Feature: beginRel

  /** getter for beginRel - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBeginRel() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_beginRel));
  }
    
  /** setter for beginRel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginRel(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_beginRel), v);
  }    
    
   
    
  //*--------------*
  //* Feature: endRel

  /** getter for endRel - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEndRel() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_endRel));
  }
    
  /** setter for endRel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndRel(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_endRel), v);
  }    
    
   
    
  //*--------------*
  //* Feature: valueRel

  /** getter for valueRel - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValueRel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_valueRel));
  }
    
  /** setter for valueRel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValueRel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_valueRel), v);
  }    
    
   
    
  //*--------------*
  //* Feature: beginArg2

  /** getter for beginArg2 - gets 
   * @generated
   * @return value of the feature 
   */
  public int getBeginArg2() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_beginArg2));
  }
    
  /** setter for beginArg2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginArg2(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_beginArg2), v);
  }    
    
   
    
  //*--------------*
  //* Feature: endArg2

  /** getter for endArg2 - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEndArg2() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_endArg2));
  }
    
  /** setter for endArg2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndArg2(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_endArg2), v);
  }    
    
   
    
  //*--------------*
  //* Feature: valueArg2

  /** getter for valueArg2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValueArg2() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_valueArg2));
  }
    
  /** setter for valueArg2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValueArg2(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_valueArg2), v);
  }    
    
  }

    