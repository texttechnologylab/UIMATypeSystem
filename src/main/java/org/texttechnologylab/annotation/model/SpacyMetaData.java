

/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Dec 21 13:46:46 CET 2023
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/src/main/resources/desc/type/TypeSystemModelMeta.xml
 * @generated */
public class SpacyMetaData extends MetaData {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpacyMetaData.class);
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
  protected SpacyMetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SpacyMetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SpacyMetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SpacyMetaData(JCas jcas, int begin, int end) {
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
  //* Feature: SpacyVersion

  /** getter for SpacyVersion - gets Spacy Libary Version
   * @generated
   * @return value of the feature 
   */
  public String getSpacyVersion() {
    if (SpacyMetaData_Type.featOkTst && ((SpacyMetaData_Type)jcasType).casFeat_SpacyVersion == null)
      jcasType.jcas.throwFeatMissing("SpacyVersion", "org.texttechnologylab.annotation.model.SpacyMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpacyMetaData_Type)jcasType).casFeatCode_SpacyVersion);}
    
  /** setter for SpacyVersion - sets Spacy Libary Version 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpacyVersion(String v) {
    if (SpacyMetaData_Type.featOkTst && ((SpacyMetaData_Type)jcasType).casFeat_SpacyVersion == null)
      jcasType.jcas.throwFeatMissing("SpacyVersion", "org.texttechnologylab.annotation.model.SpacyMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpacyMetaData_Type)jcasType).casFeatCode_SpacyVersion, v);}    
   
    
  //*--------------*
  //* Feature: ModelSpacyGitVersion

  /** getter for ModelSpacyGitVersion - gets Explicit Spacy git version
   * @generated
   * @return value of the feature 
   */
  public String getModelSpacyGitVersion() {
    if (SpacyMetaData_Type.featOkTst && ((SpacyMetaData_Type)jcasType).casFeat_ModelSpacyGitVersion == null)
      jcasType.jcas.throwFeatMissing("ModelSpacyGitVersion", "org.texttechnologylab.annotation.model.SpacyMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SpacyMetaData_Type)jcasType).casFeatCode_ModelSpacyGitVersion);}
    
  /** setter for ModelSpacyGitVersion - sets Explicit Spacy git version 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelSpacyGitVersion(String v) {
    if (SpacyMetaData_Type.featOkTst && ((SpacyMetaData_Type)jcasType).casFeat_ModelSpacyGitVersion == null)
      jcasType.jcas.throwFeatMissing("ModelSpacyGitVersion", "org.texttechnologylab.annotation.model.SpacyMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((SpacyMetaData_Type)jcasType).casFeatCode_ModelSpacyGitVersion, v);}    
  }

    