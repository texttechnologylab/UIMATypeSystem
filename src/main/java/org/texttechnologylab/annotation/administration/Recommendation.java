

/* First created by JCasGen Tue Feb 16 16:49:46 CET 2021 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jan 20 19:10:46 CET 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class Recommendation extends AnnotationBase {
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
  //* Feature: reference

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getReference() {
    if (Recommendation_Type.featOkTst && ((Recommendation_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.administration.Recommendation");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Recommendation_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(Annotation v) {
    if (Recommendation_Type.featOkTst && ((Recommendation_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.administration.Recommendation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Recommendation_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    