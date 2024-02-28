

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 21:43:09 CET 2024 */

package org.texttechnologylab.annotation.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed Feb 28 21:43:09 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ArgTypeUnless extends ArgType {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.ArgTypeUnless";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ArgTypeUnless.class);
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
   
  public final static String _FeatName_counterRebuttal = "counterRebuttal";
  public final static String _FeatName_rebuttal = "rebuttal";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_counterRebuttal = TypeSystemImpl.createCallSite(ArgTypeUnless.class, "counterRebuttal");
  private final static MethodHandle _FH_counterRebuttal = _FC_counterRebuttal.dynamicInvoker();
  private final static CallSite _FC_rebuttal = TypeSystemImpl.createCallSite(ArgTypeUnless.class, "rebuttal");
  private final static MethodHandle _FH_rebuttal = _FC_rebuttal.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ArgTypeUnless() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ArgTypeUnless(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ArgTypeUnless(JCas jcas) {
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
  //* Feature: counterRebuttal

  /** getter for counterRebuttal - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<ArgTextSegment> getCounterRebuttal() { 
    return (FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_counterRebuttal)));
  }
    
  /** setter for counterRebuttal - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCounterRebuttal(FSArray<ArgTextSegment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_counterRebuttal), v);
  }    
    
    
  /** indexed getter for counterRebuttal - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public ArgTextSegment getCounterRebuttal(int i) {
     return (ArgTextSegment)(((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_counterRebuttal)))).get(i));
  } 

  /** indexed setter for counterRebuttal - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setCounterRebuttal(int i, ArgTextSegment v) {
    ((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_counterRebuttal)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: rebuttal

  /** getter for rebuttal - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<ArgTextSegment> getRebuttal() { 
    return (FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_rebuttal)));
  }
    
  /** setter for rebuttal - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRebuttal(FSArray<ArgTextSegment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_rebuttal), v);
  }    
    
    
  /** indexed getter for rebuttal - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public ArgTextSegment getRebuttal(int i) {
     return (ArgTextSegment)(((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_rebuttal)))).get(i));
  } 

  /** indexed setter for rebuttal - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setRebuttal(int i, ArgTextSegment v) {
    ((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_rebuttal)))).set(i, v);
  }  
  }

    