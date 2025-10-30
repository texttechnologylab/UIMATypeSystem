

   
/* Apache UIMA v3 - First created by JCasGen Thu Oct 30 18:05:17 CET 2025 */

package org.texttechnologylab.annotation.semaf.isotimeml;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isobase.Entity;


/** 
 * Updated by JCasGen Thu Oct 30 18:05:17 CET 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TimeX3 extends Entity {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeX3.class);
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
   
  public final static String _FeatName_function_in_document = "function_in_document";
  public final static String _FeatName_temporal_function = "temporal_function";
  public final static String _FeatName_value = "value";
  public final static String _FeatName_anchor_time_id = "anchor_time_id";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_function_in_document = TypeSystemImpl.createCallSite(TimeX3.class, "function_in_document");
  private final static MethodHandle _FH_function_in_document = _FC_function_in_document.dynamicInvoker();
  private final static CallSite _FC_temporal_function = TypeSystemImpl.createCallSite(TimeX3.class, "temporal_function");
  private final static MethodHandle _FH_temporal_function = _FC_temporal_function.dynamicInvoker();
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(TimeX3.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_anchor_time_id = TypeSystemImpl.createCallSite(TimeX3.class, "anchor_time_id");
  private final static MethodHandle _FH_anchor_time_id = _FC_anchor_time_id.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TimeX3() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TimeX3(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeX3(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TimeX3(JCas jcas, int begin, int end) {
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
  //* Feature: function_in_document

  /** getter for function_in_document - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFunction_in_document() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_function_in_document));
  }
    
  /** setter for function_in_document - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFunction_in_document(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_function_in_document), v);
  }    
    
   
    
  //*--------------*
  //* Feature: temporal_function

  /** getter for temporal_function - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getTemporal_function() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_temporal_function));
  }
    
  /** setter for temporal_function - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTemporal_function(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_temporal_function), v);
  }    
    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: anchor_time_id

  /** getter for anchor_time_id - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeX3 getAnchor_time_id() { 
    return (TimeX3)(_getFeatureValueNc(wrapGetIntCatchException(_FH_anchor_time_id)));
  }
    
  /** setter for anchor_time_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor_time_id(TimeX3 v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_anchor_time_id), v);
  }    
    
  }

    