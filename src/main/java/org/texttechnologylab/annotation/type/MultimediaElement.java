

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 27 21:41:36 CET 2024 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Feb 27 21:41:36 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MultimediaElement extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.MultimediaElement";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MultimediaElement.class);
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
   
  public final static String _FeatName_timeStart = "timeStart";
  public final static String _FeatName_timeEnd = "timeEnd";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_timeStart = TypeSystemImpl.createCallSite(MultimediaElement.class, "timeStart");
  private final static MethodHandle _FH_timeStart = _FC_timeStart.dynamicInvoker();
  private final static CallSite _FC_timeEnd = TypeSystemImpl.createCallSite(MultimediaElement.class, "timeEnd");
  private final static MethodHandle _FH_timeEnd = _FC_timeEnd.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected MultimediaElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MultimediaElement(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MultimediaElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MultimediaElement(JCas jcas, int begin, int end) {
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
  //* Feature: timeStart

  /** getter for timeStart - gets 
   * @generated
   * @return value of the feature 
   */
  public float getTimeStart() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_timeStart));
  }
    
  /** setter for timeStart - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimeStart(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_timeStart), v);
  }    
    
   
    
  //*--------------*
  //* Feature: timeEnd

  /** getter for timeEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public float getTimeEnd() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_timeEnd));
  }
    
  /** setter for timeEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimeEnd(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_timeEnd), v);
  }    
    
  }

    