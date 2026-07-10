

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Entailment extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Entailment.class);
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
  protected Entailment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Entailment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Entailment(JCas jcas) {
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
  //* Feature: reference

  /** getter for reference - gets Entailment reference
   * @generated
   * @return value of the feature 
   */
  public EntailmentSentence getReference() {
    if (Entailment_Type.featOkTst && ((Entailment_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.Entailment");
    return (EntailmentSentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entailment_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets Entailment reference 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(EntailmentSentence v) {
    if (Entailment_Type.featOkTst && ((Entailment_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.Entailment");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entailment_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: entailment

  /** getter for entailment - gets entailment
   * @generated
   * @return value of the feature 
   */
  public double getEntailment() {
    if (Entailment_Type.featOkTst && ((Entailment_Type)jcasType).casFeat_entailment == null)
      jcasType.jcas.throwFeatMissing("entailment", "org.texttechnologylab.annotation.Entailment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Entailment_Type)jcasType).casFeatCode_entailment);}
    
  /** setter for entailment - sets entailment 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEntailment(double v) {
    if (Entailment_Type.featOkTst && ((Entailment_Type)jcasType).casFeat_entailment == null)
      jcasType.jcas.throwFeatMissing("entailment", "org.texttechnologylab.annotation.Entailment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Entailment_Type)jcasType).casFeatCode_entailment, v);}    
   
    
  //*--------------*
  //* Feature: contradiction

  /** getter for contradiction - gets contradiction
   * @generated
   * @return value of the feature 
   */
  public double getContradiction() {
    if (Entailment_Type.featOkTst && ((Entailment_Type)jcasType).casFeat_contradiction == null)
      jcasType.jcas.throwFeatMissing("contradiction", "org.texttechnologylab.annotation.Entailment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Entailment_Type)jcasType).casFeatCode_contradiction);}
    
  /** setter for contradiction - sets contradiction 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContradiction(double v) {
    if (Entailment_Type.featOkTst && ((Entailment_Type)jcasType).casFeat_contradiction == null)
      jcasType.jcas.throwFeatMissing("contradiction", "org.texttechnologylab.annotation.Entailment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Entailment_Type)jcasType).casFeatCode_contradiction, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Entailment_Type.featOkTst && ((Entailment_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Entailment");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Entailment_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Entailment_Type.featOkTst && ((Entailment_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Entailment");
    jcasType.ll_cas.ll_setRefValue(addr, ((Entailment_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    