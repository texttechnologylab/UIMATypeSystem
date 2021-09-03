

/* First created by JCasGen Fri Sep 03 13:52:05 CEST 2021 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Sep 03 13:52:05 CEST 2021
 * XML source: /home/daniel/data/hiwi/git/myyyvothrr/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class ActiveLearnerRecommendation extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ActiveLearnerRecommendation.class);
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
  protected ActiveLearnerRecommendation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ActiveLearnerRecommendation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ActiveLearnerRecommendation(JCas jcas) {
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

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getReference() {
    if (ActiveLearnerRecommendation_Type.featOkTst && ((ActiveLearnerRecommendation_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ActiveLearnerRecommendation_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(Annotation v) {
    if (ActiveLearnerRecommendation_Type.featOkTst && ((ActiveLearnerRecommendation_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    jcasType.ll_cas.ll_setRefValue(addr, ((ActiveLearnerRecommendation_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: rejected

  /** getter for rejected - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getRejected() {
    if (ActiveLearnerRecommendation_Type.featOkTst && ((ActiveLearnerRecommendation_Type)jcasType).casFeat_rejected == null)
      jcasType.jcas.throwFeatMissing("rejected", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((ActiveLearnerRecommendation_Type)jcasType).casFeatCode_rejected);}
    
  /** setter for rejected - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRejected(boolean v) {
    if (ActiveLearnerRecommendation_Type.featOkTst && ((ActiveLearnerRecommendation_Type)jcasType).casFeat_rejected == null)
      jcasType.jcas.throwFeatMissing("rejected", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((ActiveLearnerRecommendation_Type)jcasType).casFeatCode_rejected, v);}    
   
    
  //*--------------*
  //* Feature: accepted

  /** getter for accepted - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getAccepted() {
    if (ActiveLearnerRecommendation_Type.featOkTst && ((ActiveLearnerRecommendation_Type)jcasType).casFeat_accepted == null)
      jcasType.jcas.throwFeatMissing("accepted", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((ActiveLearnerRecommendation_Type)jcasType).casFeatCode_accepted);}
    
  /** setter for accepted - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAccepted(boolean v) {
    if (ActiveLearnerRecommendation_Type.featOkTst && ((ActiveLearnerRecommendation_Type)jcasType).casFeat_accepted == null)
      jcasType.jcas.throwFeatMissing("accepted", "org.texttechnologylab.annotation.administration.ActiveLearnerRecommendation");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((ActiveLearnerRecommendation_Type)jcasType).casFeatCode_accepted, v);}    
  }

    