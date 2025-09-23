

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:58 CEST 2025 */

package org.texttechnologylab.annotation.semaf.isotimeml.time;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isotimeml.TimeX3;


/** 
 * Updated by JCasGen Tue Sep 23 14:56:58 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Duration extends TimeX3 {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isotimeml.time.Duration";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Duration.class);
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
   
  public final static String _FeatName_beginPoint = "beginPoint";
  public final static String _FeatName_endPoint = "endPoint";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_beginPoint = TypeSystemImpl.createCallSite(Duration.class, "beginPoint");
  private final static MethodHandle _FH_beginPoint = _FC_beginPoint.dynamicInvoker();
  private final static CallSite _FC_endPoint = TypeSystemImpl.createCallSite(Duration.class, "endPoint");
  private final static MethodHandle _FH_endPoint = _FC_endPoint.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Duration() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Duration(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Duration(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Duration(JCas jcas, int begin, int end) {
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
  //* Feature: beginPoint

  /** getter for beginPoint - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getBeginPoint() { 
    return (Date)(_getFeatureValueNc(wrapGetIntCatchException(_FH_beginPoint)));
  }
    
  /** setter for beginPoint - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginPoint(Date v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_beginPoint), v);
  }    
    
   
    
  //*--------------*
  //* Feature: endPoint

  /** getter for endPoint - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getEndPoint() { 
    return (Date)(_getFeatureValueNc(wrapGetIntCatchException(_FH_endPoint)));
  }
    
  /** setter for endPoint - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndPoint(Date v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_endPoint), v);
  }    
    
  }

    