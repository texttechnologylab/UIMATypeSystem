

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:23:28 CET 2024 */

package org.texttechnologylab.annotation.Room;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** A link in the time chain
 * Updated by JCasGen Wed Feb 28 22:23:28 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TimeChain extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Room.TimeChain";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeChain.class);
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
   
  public final static String _FeatName_next = "next";
  public final static String _FeatName_prev = "prev";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_next = TypeSystemImpl.createCallSite(TimeChain.class, "next");
  private final static MethodHandle _FH_next = _FC_next.dynamicInvoker();
  private final static CallSite _FC_prev = TypeSystemImpl.createCallSite(TimeChain.class, "prev");
  private final static MethodHandle _FH_prev = _FC_prev.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TimeChain() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TimeChain(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeChain(JCas jcas) {
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
  //* Feature: next

  /** getter for next - gets Next chain element
   * @generated
   * @return value of the feature 
   */
  public TimeChain getNext() { 
    return (TimeChain)(_getFeatureValueNc(wrapGetIntCatchException(_FH_next)));
  }
    
  /** setter for next - sets Next chain element 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNext(TimeChain v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_next), v);
  }    
    
   
    
  //*--------------*
  //* Feature: prev

  /** getter for prev - gets Previous chain element
   * @generated
   * @return value of the feature 
   */
  public TimeChain getPrev() { 
    return (TimeChain)(_getFeatureValueNc(wrapGetIntCatchException(_FH_prev)));
  }
    
  /** setter for prev - sets Previous chain element 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrev(TimeChain v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_prev), v);
  }    
    
  }

    