

/* First created by JCasGen Mon Mar 01 15:55:48 CET 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jun 17 16:34:14 CEST 2022
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class AnnotationComment extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationComment.class);
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
  protected AnnotationComment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationComment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationComment(JCas jcas) {
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
  public TOP getReference() {
    if (AnnotationComment_Type.featOkTst && ((AnnotationComment_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotationComment");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationComment_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(TOP v) {
    if (AnnotationComment_Type.featOkTst && ((AnnotationComment_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotationComment");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationComment_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (AnnotationComment_Type.featOkTst && ((AnnotationComment_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.AnnotationComment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationComment_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (AnnotationComment_Type.featOkTst && ((AnnotationComment_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.AnnotationComment");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationComment_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKey() {
    if (AnnotationComment_Type.featOkTst && ((AnnotationComment_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.AnnotationComment");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationComment_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (AnnotationComment_Type.featOkTst && ((AnnotationComment_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.AnnotationComment");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationComment_Type)jcasType).casFeatCode_key, v);}    
  }

    