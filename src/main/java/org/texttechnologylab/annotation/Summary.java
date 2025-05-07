

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 16:38:29 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.AnnotationBase;


/** Summary of input text
 * Updated by JCasGen Wed May 07 16:38:29 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Summary extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Summary";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Summary.class);
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
   
  public final static String _FeatName_Summary = "Summary";
  public final static String _FeatName_Reference = "Reference";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Summary = TypeSystemImpl.createCallSite(Summary.class, "Summary");
  private final static MethodHandle _FH_Summary = _FC_Summary.dynamicInvoker();
  private final static CallSite _FC_Reference = TypeSystemImpl.createCallSite(Summary.class, "Reference");
  private final static MethodHandle _FH_Reference = _FC_Reference.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Summary.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Summary() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Summary(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Summary(JCas jcas) {
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
  //* Feature: Summary

  /** getter for Summary - gets Summary of input text
   * @generated
   * @return value of the feature 
   */
  public String getSummary() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Summary));
  }
    
  /** setter for Summary - sets Summary of input text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSummary(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Summary), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Reference

  /** getter for Reference - gets Reference to given Input text
   * @generated
   * @return value of the feature 
   */
  public Annotation getReference() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Reference)));
  }
    
  /** setter for Reference - sets Reference to given Input text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Reference), v);
  }    
    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_model)));
  }
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_model), v);
  }    
    
  }

    