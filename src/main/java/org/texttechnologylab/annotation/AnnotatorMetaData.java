

/* First created by JCasGen Wed Aug 18 10:21:17 CEST 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri May 12 16:52:40 CEST 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class AnnotatorMetaData extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotatorMetaData.class);
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
  protected AnnotatorMetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnotatorMetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnotatorMetaData(JCas jcas) {
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
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(TOP v) {
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotatorMetaData");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.AnnotatorMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVersion() {
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_version);}
    
  /** setter for version - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.AnnotatorMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_version, v);}    
   
    
  //*--------------*
  //* Feature: modelName

  /** getter for modelName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModelName() {
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_modelName == null)
      jcasType.jcas.throwFeatMissing("modelName", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_modelName);}
    
  /** setter for modelName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_modelName == null)
      jcasType.jcas.throwFeatMissing("modelName", "org.texttechnologylab.annotation.AnnotatorMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_modelName, v);}    
   
    
  //*--------------*
  //* Feature: modelVersion

  /** getter for modelVersion - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModelVersion() {
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_modelVersion == null)
      jcasType.jcas.throwFeatMissing("modelVersion", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_modelVersion);}
    
  /** setter for modelVersion - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelVersion(String v) {
    if (AnnotatorMetaData_Type.featOkTst && ((AnnotatorMetaData_Type)jcasType).casFeat_modelVersion == null)
      jcasType.jcas.throwFeatMissing("modelVersion", "org.texttechnologylab.annotation.AnnotatorMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnotatorMetaData_Type)jcasType).casFeatCode_modelVersion, v);}    
  }

    