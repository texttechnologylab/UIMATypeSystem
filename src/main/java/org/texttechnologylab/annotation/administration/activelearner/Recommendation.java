

/* First created by JCasGen Fri Apr 01 13:43:21 CEST 2022 */
package org.texttechnologylab.annotation.administration.activelearner;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.AnnotationComment;


/** 
 * Updated by JCasGen Fri Apr 01 13:43:21 CEST 2022
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class Recommendation extends AnnotationComment {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Recommendation.class);
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
  protected Recommendation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Recommendation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Recommendation(JCas jcas) {
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
  //* Feature: hash

  /** getter for hash - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHash() {
    if (Recommendation_Type.featOkTst && ((Recommendation_Type)jcasType).casFeat_hash == null)
      jcasType.jcas.throwFeatMissing("hash", "org.texttechnologylab.annotation.administration.activelearner.Recommendation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Recommendation_Type)jcasType).casFeatCode_hash);}
    
  /** setter for hash - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHash(String v) {
    if (Recommendation_Type.featOkTst && ((Recommendation_Type)jcasType).casFeat_hash == null)
      jcasType.jcas.throwFeatMissing("hash", "org.texttechnologylab.annotation.administration.activelearner.Recommendation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Recommendation_Type)jcasType).casFeatCode_hash, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets 
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Recommendation_Type.featOkTst && ((Recommendation_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.administration.activelearner.Recommendation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Recommendation_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Recommendation_Type.featOkTst && ((Recommendation_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.administration.activelearner.Recommendation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Recommendation_Type)jcasType).casFeatCode_score, v);}    
  }

    