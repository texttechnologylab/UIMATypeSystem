

/* First created by JCasGen Fri Jun 17 16:34:15 CEST 2022 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jan 20 19:10:46 CET 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class AnnotationPerspective extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationPerspective.class);
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
  protected AnnotationPerspective() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationPerspective(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationPerspective(JCas jcas) {
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
  //* Feature: name

  /** getter for name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (AnnotationPerspective_Type.featOkTst && ((AnnotationPerspective_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.AnnotationPerspective");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationPerspective_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (AnnotationPerspective_Type.featOkTst && ((AnnotationPerspective_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.AnnotationPerspective");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationPerspective_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public TOP getReference() {
    if (AnnotationPerspective_Type.featOkTst && ((AnnotationPerspective_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotationPerspective");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationPerspective_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(TOP v) {
    if (AnnotationPerspective_Type.featOkTst && ((AnnotationPerspective_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotationPerspective");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationPerspective_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    