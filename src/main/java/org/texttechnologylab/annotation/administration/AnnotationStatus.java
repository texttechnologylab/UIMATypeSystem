

/* First created by JCasGen Tue Feb 16 16:49:46 CET 2021 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Apr 01 18:16:00 CEST 2022
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class AnnotationStatus extends Annotation {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnnotationStatus() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationStatus(int addr, TOP_Type type) {
    super(addr, type);
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
    if (AnnotationStatus_Type.featOkTst && ((AnnotationStatus_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.texttechnologylab.annotation.administration.AnnotationStatus");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationStatus_Type)jcasType).casFeatCode_status);}
    
  /** setter for status - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStatus(String v) {
    if (AnnotationStatus_Type.featOkTst && ((AnnotationStatus_Type)jcasType).casFeat_status == null)
      jcasType.jcas.throwFeatMissing("status", "org.texttechnologylab.annotation.administration.AnnotationStatus");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationStatus_Type)jcasType).casFeatCode_status, v);}    
   
    
  //*--------------*
  //* Feature: tool

  /** getter for tool - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTool() {
    if (AnnotationStatus_Type.featOkTst && ((AnnotationStatus_Type)jcasType).casFeat_tool == null)
      jcasType.jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.AnnotationStatus");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationStatus_Type)jcasType).casFeatCode_tool);}
    
  /** setter for tool - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTool(String v) {
    if (AnnotationStatus_Type.featOkTst && ((AnnotationStatus_Type)jcasType).casFeat_tool == null)
      jcasType.jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.AnnotationStatus");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationStatus_Type)jcasType).casFeatCode_tool, v);}    
  }

    