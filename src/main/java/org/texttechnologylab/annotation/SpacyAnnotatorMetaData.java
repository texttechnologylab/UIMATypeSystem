

/* First created by JCasGen Thu Apr 14 13:32:49 CEST 2022 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Jan 20 19:11:52 CET 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class SpacyAnnotatorMetaData extends AnnotatorMetaData {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpacyAnnotatorMetaData.class);
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
  protected SpacyAnnotatorMetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SpacyAnnotatorMetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SpacyAnnotatorMetaData(JCas jcas) {
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
  //* Feature: spacyVersion

  /** getter for spacyVersion - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSpacyVersion() {
    if (SpacyAnnotatorMetaData_Type.featOkTst && ((SpacyAnnotatorMetaData_Type)jcasType).casFeat_spacyVersion == null)
      jcasType.jcas.throwFeatMissing("spacyVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpacyAnnotatorMetaData_Type)jcasType).casFeatCode_spacyVersion);}
    
  /** setter for spacyVersion - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpacyVersion(String v) {
    if (SpacyAnnotatorMetaData_Type.featOkTst && ((SpacyAnnotatorMetaData_Type)jcasType).casFeat_spacyVersion == null)
      jcasType.jcas.throwFeatMissing("spacyVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpacyAnnotatorMetaData_Type)jcasType).casFeatCode_spacyVersion, v);}    
   
    
  //*--------------*
  //* Feature: modelLang

  /** getter for modelLang - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModelLang() {
    if (SpacyAnnotatorMetaData_Type.featOkTst && ((SpacyAnnotatorMetaData_Type)jcasType).casFeat_modelLang == null)
      jcasType.jcas.throwFeatMissing("modelLang", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpacyAnnotatorMetaData_Type)jcasType).casFeatCode_modelLang);}
    
  /** setter for modelLang - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelLang(String v) {
    if (SpacyAnnotatorMetaData_Type.featOkTst && ((SpacyAnnotatorMetaData_Type)jcasType).casFeat_modelLang == null)
      jcasType.jcas.throwFeatMissing("modelLang", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpacyAnnotatorMetaData_Type)jcasType).casFeatCode_modelLang, v);}    
   
    
  //*--------------*
  //* Feature: modelSpacyVersion

  /** getter for modelSpacyVersion - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModelSpacyVersion() {
    if (SpacyAnnotatorMetaData_Type.featOkTst && ((SpacyAnnotatorMetaData_Type)jcasType).casFeat_modelSpacyVersion == null)
      jcasType.jcas.throwFeatMissing("modelSpacyVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpacyAnnotatorMetaData_Type)jcasType).casFeatCode_modelSpacyVersion);}
    
  /** setter for modelSpacyVersion - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelSpacyVersion(String v) {
    if (SpacyAnnotatorMetaData_Type.featOkTst && ((SpacyAnnotatorMetaData_Type)jcasType).casFeat_modelSpacyVersion == null)
      jcasType.jcas.throwFeatMissing("modelSpacyVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpacyAnnotatorMetaData_Type)jcasType).casFeatCode_modelSpacyVersion, v);}    
   
    
  //*--------------*
  //* Feature: modelSpacyGitVersion

  /** getter for modelSpacyGitVersion - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModelSpacyGitVersion() {
    if (SpacyAnnotatorMetaData_Type.featOkTst && ((SpacyAnnotatorMetaData_Type)jcasType).casFeat_modelSpacyGitVersion == null)
      jcasType.jcas.throwFeatMissing("modelSpacyGitVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpacyAnnotatorMetaData_Type)jcasType).casFeatCode_modelSpacyGitVersion);}
    
  /** setter for modelSpacyGitVersion - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelSpacyGitVersion(String v) {
    if (SpacyAnnotatorMetaData_Type.featOkTst && ((SpacyAnnotatorMetaData_Type)jcasType).casFeat_modelSpacyGitVersion == null)
      jcasType.jcas.throwFeatMissing("modelSpacyGitVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpacyAnnotatorMetaData_Type)jcasType).casFeatCode_modelSpacyGitVersion, v);}    
  }

    