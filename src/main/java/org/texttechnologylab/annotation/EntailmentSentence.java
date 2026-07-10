

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EntailmentSentence extends AnnotationBase {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EntailmentSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EntailmentSentence(int addr, TOP_Type type) {
    super(addr, type);
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
    if (EntailmentSentence_Type.featOkTst && ((EntailmentSentence_Type)jcasType).casFeat_premise == null)
      jcasType.jcas.throwFeatMissing("premise", "org.texttechnologylab.annotation.EntailmentSentence");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EntailmentSentence_Type)jcasType).casFeatCode_premise)));}
    
  /** setter for premise - sets premise 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPremise(Annotation v) {
    if (EntailmentSentence_Type.featOkTst && ((EntailmentSentence_Type)jcasType).casFeat_premise == null)
      jcasType.jcas.throwFeatMissing("premise", "org.texttechnologylab.annotation.EntailmentSentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((EntailmentSentence_Type)jcasType).casFeatCode_premise, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: hypothesis

  /** getter for hypothesis - gets hypothesis
   * @generated
   * @return value of the feature 
   */
  public Annotation getHypothesis() {
    if (EntailmentSentence_Type.featOkTst && ((EntailmentSentence_Type)jcasType).casFeat_hypothesis == null)
      jcasType.jcas.throwFeatMissing("hypothesis", "org.texttechnologylab.annotation.EntailmentSentence");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EntailmentSentence_Type)jcasType).casFeatCode_hypothesis)));}
    
  /** setter for hypothesis - sets hypothesis 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHypothesis(Annotation v) {
    if (EntailmentSentence_Type.featOkTst && ((EntailmentSentence_Type)jcasType).casFeat_hypothesis == null)
      jcasType.jcas.throwFeatMissing("hypothesis", "org.texttechnologylab.annotation.EntailmentSentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((EntailmentSentence_Type)jcasType).casFeatCode_hypothesis, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    