

   
/* Apache UIMA v3 - First created by JCasGen Tue Apr 22 17:11:16 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** One Fact for different claims
 * Updated by JCasGen Tue Apr 22 17:11:16 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Fact extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Fact";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Fact.class);
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
   
  public final static String _FeatName_value = "value";
  public final static String _FeatName_Claims = "Claims";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(Fact.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_Claims = TypeSystemImpl.createCallSite(Fact.class, "Claims");
  private final static MethodHandle _FH_Claims = _FC_Claims.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Fact() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Fact(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Fact(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Fact(JCas jcas, int begin, int end) {
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
  //* Feature: value

  /** getter for value - gets Information for  the fact
   * @generated
   * @return value of the feature 
   */
  public String getValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets Information for  the fact 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Claims

  /** getter for Claims - gets Set of Claims
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Claim> getClaims() { 
    return (FSArray<Claim>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Claims)));
  }
    
  /** setter for Claims - sets Set of Claims 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClaims(FSArray<Claim> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Claims), v);
  }    
    
    
  /** indexed getter for Claims - gets an indexed value - Set of Claims
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Claim getClaims(int i) {
     return (Claim)(((FSArray<Claim>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Claims)))).get(i));
  } 

  /** indexed setter for Claims - sets an indexed value - Set of Claims
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setClaims(int i, Claim v) {
    ((FSArray<Claim>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Claims)))).set(i, v);
  }  
  }

    