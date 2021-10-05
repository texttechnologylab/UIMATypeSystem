

/* First created by JCasGen Tue Oct 05 17:20:02 CEST 2021 */
package org.texttechnologylab.annotation.schema;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Tue Oct 05 17:20:02 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotationSchema.xml
 * @generated */
public class AnnotationClass extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationClass.class);
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
  protected AnnotationClass() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotationClass(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotationClass(JCas jcas) {
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
    if (AnnotationClass_Type.featOkTst && ((AnnotationClass_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.schema.AnnotationClass");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationClass_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (AnnotationClass_Type.featOkTst && ((AnnotationClass_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.schema.AnnotationClass");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationClass_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDescription() {
    if (AnnotationClass_Type.featOkTst && ((AnnotationClass_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.schema.AnnotationClass");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotationClass_Type)jcasType).casFeatCode_description);}
    
  /** setter for description - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    if (AnnotationClass_Type.featOkTst && ((AnnotationClass_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.schema.AnnotationClass");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotationClass_Type)jcasType).casFeatCode_description, v);}    
   
    
  //*--------------*
  //* Feature: attributes

  /** getter for attributes - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getAttributes() {
    if (AnnotationClass_Type.featOkTst && ((AnnotationClass_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationClass");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationClass_Type)jcasType).casFeatCode_attributes)));}
    
  /** setter for attributes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAttributes(FSList v) {
    if (AnnotationClass_Type.featOkTst && ((AnnotationClass_Type)jcasType).casFeat_attributes == null)
      jcasType.jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationClass");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationClass_Type)jcasType).casFeatCode_attributes, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    