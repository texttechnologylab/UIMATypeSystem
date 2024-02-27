

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 27 21:02:41 CET 2024 */

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
 * Updated by JCasGen Tue Feb 27 21:02:41 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ArgType extends ArgNode {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.ArgType";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ArgType.class);
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
   
  public final static String _FeatName_conclusion = "conclusion";
  public final static String _FeatName_mode = "mode";
  public final static String _FeatName_data = "data";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_conclusion = TypeSystemImpl.createCallSite(ArgType.class, "conclusion");
  private final static MethodHandle _FH_conclusion = _FC_conclusion.dynamicInvoker();
  private final static CallSite _FC_mode = TypeSystemImpl.createCallSite(ArgType.class, "mode");
  private final static MethodHandle _FH_mode = _FC_mode.dynamicInvoker();
  private final static CallSite _FC_data = TypeSystemImpl.createCallSite(ArgType.class, "data");
  private final static MethodHandle _FH_data = _FC_data.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ArgType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ArgType(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ArgType(JCas jcas) {
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
  //* Feature: conclusion

  /** getter for conclusion - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<ArgTextSegment> getConclusion() { 
    return (FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_conclusion)));
  }
    
  /** setter for conclusion - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setConclusion(FSArray<ArgTextSegment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_conclusion), v);
  }    
    
    
  /** indexed getter for conclusion - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public ArgTextSegment getConclusion(int i) {
     return (ArgTextSegment)(((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_conclusion)))).get(i));
  } 

  /** indexed setter for conclusion - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setConclusion(int i, ArgTextSegment v) {
    ((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_conclusion)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: mode

  /** getter for mode - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMode() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_mode));
  }
    
  /** setter for mode - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMode(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_mode), v);
  }    
    
   
    
  //*--------------*
  //* Feature: data

  /** getter for data - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<ArgTextSegment> getData() { 
    return (FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_data)));
  }
    
  /** setter for data - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setData(FSArray<ArgTextSegment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_data), v);
  }    
    
    
  /** indexed getter for data - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public ArgTextSegment getData(int i) {
     return (ArgTextSegment)(((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_data)))).get(i));
  } 

  /** indexed setter for data - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setData(int i, ArgTextSegment v) {
    ((FSArray<ArgTextSegment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_data)))).set(i, v);
  }  
  }

    