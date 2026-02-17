

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.AnnotationBase;


/** Summary of input text
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Summary extends AnnotationBase {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Summary() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Summary(int addr, TOP_Type type) {
    super(addr, type);
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
    if (Summary_Type.featOkTst && ((Summary_Type)jcasType).casFeat_Summary == null)
      jcasType.jcas.throwFeatMissing("Summary", "org.texttechnologylab.annotation.Summary");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Summary_Type)jcasType).casFeatCode_Summary);}
    
  /** setter for Summary - sets Summary of input text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSummary(String v) {
    if (Summary_Type.featOkTst && ((Summary_Type)jcasType).casFeat_Summary == null)
      jcasType.jcas.throwFeatMissing("Summary", "org.texttechnologylab.annotation.Summary");
    jcasType.ll_cas.ll_setStringValue(addr, ((Summary_Type)jcasType).casFeatCode_Summary, v);}    
   
    
  //*--------------*
  //* Feature: Reference

  /** getter for Reference - gets Reference to given Input text
   * @generated
   * @return value of the feature 
   */
  public Annotation getReference() {
    if (Summary_Type.featOkTst && ((Summary_Type)jcasType).casFeat_Reference == null)
      jcasType.jcas.throwFeatMissing("Reference", "org.texttechnologylab.annotation.Summary");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Summary_Type)jcasType).casFeatCode_Reference)));}
    
  /** setter for Reference - sets Reference to given Input text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(Annotation v) {
    if (Summary_Type.featOkTst && ((Summary_Type)jcasType).casFeat_Reference == null)
      jcasType.jcas.throwFeatMissing("Reference", "org.texttechnologylab.annotation.Summary");
    jcasType.ll_cas.ll_setRefValue(addr, ((Summary_Type)jcasType).casFeatCode_Reference, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Summary_Type.featOkTst && ((Summary_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Summary");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Summary_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Summary_Type.featOkTst && ((Summary_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Summary");
    jcasType.ll_cas.ll_setRefValue(addr, ((Summary_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    