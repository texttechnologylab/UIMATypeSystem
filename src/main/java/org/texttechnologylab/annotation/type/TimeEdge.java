

   
/* Apache UIMA v3 - First created by JCasGen Fri Aug 01 12:46:51 CEST 2025 */

package org.texttechnologylab.annotation.type;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;




/**
 * Updated by JCasGen Fri Aug 01 12:46:51 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TimeEdge extends Edge {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.type.TimeEdge";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeEdge.class);
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
   
  public final static String _FeatName_mode = "mode";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_mode = TypeSystemImpl.createCallSite(TimeEdge.class, "mode");
  private final static MethodHandle _FH_mode = _FC_mode.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TimeEdge() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TimeEdge(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeEdge(JCas jcas) {
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
    
  }

    