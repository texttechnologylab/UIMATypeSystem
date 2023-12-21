

/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Thu Dec 21 13:46:46 CET 2023
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/src/main/resources/desc/type/TypeSystemModelMeta.xml
 * @generated */
public class HuggingfaceMetaData extends MetaData {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(HuggingfaceMetaData.class);
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
  protected HuggingfaceMetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public HuggingfaceMetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public HuggingfaceMetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public HuggingfaceMetaData(JCas jcas, int begin, int end) {
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
  //* Feature: HuggingfaceVersion

  /** getter for HuggingfaceVersion - gets Transformer Library Version
   * @generated
   * @return value of the feature 
   */
  public String getHuggingfaceVersion() {
    if (HuggingfaceMetaData_Type.featOkTst && ((HuggingfaceMetaData_Type)jcasType).casFeat_HuggingfaceVersion == null)
      jcasType.jcas.throwFeatMissing("HuggingfaceVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((HuggingfaceMetaData_Type)jcasType).casFeatCode_HuggingfaceVersion);}
    
  /** setter for HuggingfaceVersion - sets Transformer Library Version 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHuggingfaceVersion(String v) {
    if (HuggingfaceMetaData_Type.featOkTst && ((HuggingfaceMetaData_Type)jcasType).casFeat_HuggingfaceVersion == null)
      jcasType.jcas.throwFeatMissing("HuggingfaceVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((HuggingfaceMetaData_Type)jcasType).casFeatCode_HuggingfaceVersion, v);}    
   
    
  //*--------------*
  //* Feature: DependeciesVersion

  /** getter for DependeciesVersion - gets Dependency Library Version e.g. Pytorch...
   * @generated
   * @return value of the feature 
   */
  public StringArray getDependeciesVersion() {
    if (HuggingfaceMetaData_Type.featOkTst && ((HuggingfaceMetaData_Type)jcasType).casFeat_DependeciesVersion == null)
      jcasType.jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((HuggingfaceMetaData_Type)jcasType).casFeatCode_DependeciesVersion)));}
    
  /** setter for DependeciesVersion - sets Dependency Library Version e.g. Pytorch... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDependeciesVersion(StringArray v) {
    if (HuggingfaceMetaData_Type.featOkTst && ((HuggingfaceMetaData_Type)jcasType).casFeat_DependeciesVersion == null)
      jcasType.jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    jcasType.ll_cas.ll_setRefValue(addr, ((HuggingfaceMetaData_Type)jcasType).casFeatCode_DependeciesVersion, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for DependeciesVersion - gets an indexed value - Dependency Library Version e.g. Pytorch...
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getDependeciesVersion(int i) {
    if (HuggingfaceMetaData_Type.featOkTst && ((HuggingfaceMetaData_Type)jcasType).casFeat_DependeciesVersion == null)
      jcasType.jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((HuggingfaceMetaData_Type)jcasType).casFeatCode_DependeciesVersion), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((HuggingfaceMetaData_Type)jcasType).casFeatCode_DependeciesVersion), i);}

  /** indexed setter for DependeciesVersion - sets an indexed value - Dependency Library Version e.g. Pytorch...
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setDependeciesVersion(int i, String v) { 
    if (HuggingfaceMetaData_Type.featOkTst && ((HuggingfaceMetaData_Type)jcasType).casFeat_DependeciesVersion == null)
      jcasType.jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((HuggingfaceMetaData_Type)jcasType).casFeatCode_DependeciesVersion), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((HuggingfaceMetaData_Type)jcasType).casFeatCode_DependeciesVersion), i, v);}
  }

    