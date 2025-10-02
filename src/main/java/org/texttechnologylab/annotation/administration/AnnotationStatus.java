

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:45:56 CEST 2025 */

package org.texttechnologylab.annotation.administration;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Fri Sep 26 15:45:56 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AnnotationStatus extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.administration.AnnotationStatus";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationStatus.class);
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
   
  public final static String _FeatName_status = "status";
  public final static String _FeatName_tool = "tool";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_status = TypeSystemImpl.createCallSite(AnnotationStatus.class, "status");
  private final static MethodHandle _FH_status = _FC_status.dynamicInvoker();
  private final static CallSite _FC_tool = TypeSystemImpl.createCallSite(AnnotationStatus.class, "tool");
  private final static MethodHandle _FH_tool = _FC_tool.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AnnotationStatus() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AnnotationStatus(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationStatus(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnnotationStatus(JCas jcas, int begin, int end) {
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
  //* Feature: status

  /** getter for status - gets 
   * @generated
   * @return value of the feature 
   */
  public String getStatus() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_status));
  }
    
  /** setter for status - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStatus(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_status), v);
  }    
    
   
    
  //*--------------*
  //* Feature: tool

  /** getter for tool - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTool() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_tool));
  }
    
  /** setter for tool - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTool(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_tool), v);
  }    
    
  }

    