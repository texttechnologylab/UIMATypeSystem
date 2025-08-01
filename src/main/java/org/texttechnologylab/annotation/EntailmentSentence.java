

   
/* Apache UIMA v3 - First created by JCasGen Fri Aug 01 12:46:51 CEST 2025 */

package org.texttechnologylab.annotation;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.AnnotationBase;
import org.apache.uima.jcas.tcas.Annotation;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Fri Aug 01 12:46:51 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EntailmentSentence extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.EntailmentSentence";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EntailmentSentence.class);
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
   
  public final static String _FeatName_premise = "premise";
  public final static String _FeatName_hypothesis = "hypothesis";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_premise = TypeSystemImpl.createCallSite(EntailmentSentence.class, "premise");
  private final static MethodHandle _FH_premise = _FC_premise.dynamicInvoker();
  private final static CallSite _FC_hypothesis = TypeSystemImpl.createCallSite(EntailmentSentence.class, "hypothesis");
  private final static MethodHandle _FH_hypothesis = _FC_hypothesis.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected EntailmentSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public EntailmentSentence(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EntailmentSentence(JCas jcas) {
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
  //* Feature: premise

  /** getter for premise - gets premise
   * @generated
   * @return value of the feature 
   */
  public Annotation getPremise() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_premise)));
  }
    
  /** setter for premise - sets premise 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPremise(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_premise), v);
  }    
    
   
    
  //*--------------*
  //* Feature: hypothesis

  /** getter for hypothesis - gets hypothesis
   * @generated
   * @return value of the feature 
   */
  public Annotation getHypothesis() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_hypothesis)));
  }
    
  /** setter for hypothesis - sets hypothesis 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHypothesis(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_hypothesis), v);
  }    
    
  }

    