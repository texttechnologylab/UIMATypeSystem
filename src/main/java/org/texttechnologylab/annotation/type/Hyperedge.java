

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:02:33 CET 2024 */

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
 * Updated by JCasGen Wed Feb 28 22:02:33 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Hyperedge extends GraphBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.Hyperedge";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Hyperedge.class);
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
   
  public final static String _FeatName_endpoints = "endpoints";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_endpoints = TypeSystemImpl.createCallSite(Hyperedge.class, "endpoints");
  private final static MethodHandle _FH_endpoints = _FC_endpoints.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Hyperedge() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Hyperedge(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Hyperedge(JCas jcas) {
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
  //* Feature: endpoints

  /** getter for endpoints - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Endpoint> getEndpoints() { 
    return (FSArray<Endpoint>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_endpoints)));
  }
    
  /** setter for endpoints - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndpoints(FSArray<Endpoint> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_endpoints), v);
  }    
    
    
  /** indexed getter for endpoints - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Endpoint getEndpoints(int i) {
     return (Endpoint)(((FSArray<Endpoint>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_endpoints)))).get(i));
  } 

  /** indexed setter for endpoints - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setEndpoints(int i, Endpoint v) {
    ((FSArray<Endpoint>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_endpoints)))).set(i, v);
  }  
  }

    