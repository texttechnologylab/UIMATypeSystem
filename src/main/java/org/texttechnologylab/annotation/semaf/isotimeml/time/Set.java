

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:23:28 CET 2024 */

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
 * Updated by JCasGen Wed Feb 28 22:23:28 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Set extends TimeX3 {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isotimeml.time.Set";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Set.class);
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
   
  public final static String _FeatName_quant = "quant";
  public final static String _FeatName_freq = "freq";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_quant = TypeSystemImpl.createCallSite(Set.class, "quant");
  private final static MethodHandle _FH_quant = _FC_quant.dynamicInvoker();
  private final static CallSite _FC_freq = TypeSystemImpl.createCallSite(Set.class, "freq");
  private final static MethodHandle _FH_freq = _FC_freq.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Set() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Set(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Set(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Set(JCas jcas, int begin, int end) {
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
  //* Feature: quant

  /** getter for quant - gets 
   * @generated
   * @return value of the feature 
   */
  public String getQuant() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_quant));
  }
    
  /** setter for quant - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuant(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_quant), v);
  }    
    
   
    
  //*--------------*
  //* Feature: freq

  /** getter for freq - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFreq() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_freq));
  }
    
  /** setter for freq - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFreq(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_freq), v);
  }    
    
  }

    