

/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Dec 21 13:46:46 CET 2023
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/src/main/resources/desc/type/TypeSystemModelMeta.xml
 * @generated */
public class MetaData extends org.texttechnologylab.annotation.MetaData {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetaData.class);
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
  protected MetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MetaData(JCas jcas, int begin, int end) {
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
  //* Feature: ModelVersion

  /** getter for ModelVersion - gets Version of the Model
   * @generated
   * @return value of the feature 
   */
  public String getModelVersion() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_ModelVersion == null)
      jcasType.jcas.throwFeatMissing("ModelVersion", "org.texttechnologylab.annotation.model.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_ModelVersion);}
    
  /** setter for ModelVersion - sets Version of the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelVersion(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_ModelVersion == null)
      jcasType.jcas.throwFeatMissing("ModelVersion", "org.texttechnologylab.annotation.model.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_ModelVersion, v);}    
   
    
  //*--------------*
  //* Feature: ModelName

  /** getter for ModelName - gets Name of the Model
   * @generated
   * @return value of the feature 
   */
  public String getModelName() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_ModelName == null)
      jcasType.jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.model.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_ModelName);}
    
  /** setter for ModelName - sets Name of the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_ModelName == null)
      jcasType.jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.model.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_ModelName, v);}    
  }

    