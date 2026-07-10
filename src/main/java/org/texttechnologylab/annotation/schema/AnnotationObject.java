

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.schema;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AnnotationObject extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationObject.class);
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
  protected AnnotationObject() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationObject(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationObject(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnnotationObject(JCas jcas, int begin, int end) {
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
  //* Feature: annotationType

  /** getter for annotationType - gets 
   * @generated
   * @return value of the feature 
   */
  public AnnotationClass getAnnotationType() {
    if (AnnotationObject_Type.featOkTst && ((AnnotationObject_Type)jcasType).casFeat_annotationType == null)
      jcasType.jcas.throwFeatMissing("annotationType", "org.texttechnologylab.annotation.schema.AnnotationObject");
    return (AnnotationClass)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_annotationType)));}
    
  /** setter for annotationType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnnotationType(AnnotationClass v) {
    if (AnnotationObject_Type.featOkTst && ((AnnotationObject_Type)jcasType).casFeat_annotationType == null)
      jcasType.jcas.throwFeatMissing("annotationType", "org.texttechnologylab.annotation.schema.AnnotationObject");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_annotationType, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() {
    if (AnnotationObject_Type.featOkTst && ((AnnotationObject_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.schema.AnnotationObject");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_comment);}
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    if (AnnotationObject_Type.featOkTst && ((AnnotationObject_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.schema.AnnotationObject");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_comment, v);}    
   
    
  //*--------------*
  //* Feature: attributes

  /** getter for attributes - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getAttributes() {
    if (AnnotationObject_Type.featOkTst && ((AnnotationObject_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationObject");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_attributes)));}
    
  /** setter for attributes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttributes(FSArray v) {
    if (AnnotationObject_Type.featOkTst && ((AnnotationObject_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationObject");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_attributes, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for attributes - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnnotationAttribute getAttributes(int i) {
    if (AnnotationObject_Type.featOkTst && ((AnnotationObject_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationObject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_attributes), i);
    return (AnnotationAttribute)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_attributes), i)));}

  /** indexed setter for attributes - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAttributes(int i, AnnotationAttribute v) { 
    if (AnnotationObject_Type.featOkTst && ((AnnotationObject_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationObject");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_attributes), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationObject_Type)jcasType).casFeatCode_attributes), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    