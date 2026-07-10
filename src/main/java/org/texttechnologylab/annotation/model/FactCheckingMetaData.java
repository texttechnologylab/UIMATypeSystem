

/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/** 
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class FactCheckingMetaData extends MetaData {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FactCheckingMetaData.class);
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
  protected FactCheckingMetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public FactCheckingMetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FactCheckingMetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public FactCheckingMetaData(JCas jcas, int begin, int end) {
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
  //* Feature: Source

  /** getter for Source - gets URL
   * @generated
   * @return value of the feature 
   */
  public String getSource() {
    if (FactCheckingMetaData_Type.featOkTst && ((FactCheckingMetaData_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "org.texttechnologylab.annotation.model.FactCheckingMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FactCheckingMetaData_Type)jcasType).casFeatCode_Source);}
    
  /** setter for Source - sets URL 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSource(String v) {
    if (FactCheckingMetaData_Type.featOkTst && ((FactCheckingMetaData_Type)jcasType).casFeat_Source == null)
      jcasType.jcas.throwFeatMissing("Source", "org.texttechnologylab.annotation.model.FactCheckingMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((FactCheckingMetaData_Type)jcasType).casFeatCode_Source, v);}    
   
    
  //*--------------*
  //* Feature: DependeciesVersion

  /** getter for DependeciesVersion - gets Dependency Library Version e.g. Pytorch...
   * @generated
   * @return value of the feature 
   */
  public StringArray getDependeciesVersion() {
    if (FactCheckingMetaData_Type.featOkTst && ((FactCheckingMetaData_Type)jcasType).casFeat_DependeciesVersion == null)
      jcasType.jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.FactCheckingMetaData");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FactCheckingMetaData_Type)jcasType).casFeatCode_DependeciesVersion)));}
    
  /** setter for DependeciesVersion - sets Dependency Library Version e.g. Pytorch... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDependeciesVersion(StringArray v) {
    if (FactCheckingMetaData_Type.featOkTst && ((FactCheckingMetaData_Type)jcasType).casFeat_DependeciesVersion == null)
      jcasType.jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.FactCheckingMetaData");
    jcasType.ll_cas.ll_setRefValue(addr, ((FactCheckingMetaData_Type)jcasType).casFeatCode_DependeciesVersion, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for DependeciesVersion - gets an indexed value - Dependency Library Version e.g. Pytorch...
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getDependeciesVersion(int i) {
    if (FactCheckingMetaData_Type.featOkTst && ((FactCheckingMetaData_Type)jcasType).casFeat_DependeciesVersion == null)
      jcasType.jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.FactCheckingMetaData");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FactCheckingMetaData_Type)jcasType).casFeatCode_DependeciesVersion), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FactCheckingMetaData_Type)jcasType).casFeatCode_DependeciesVersion), i);}

  /** indexed setter for DependeciesVersion - sets an indexed value - Dependency Library Version e.g. Pytorch...
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setDependeciesVersion(int i, String v) { 
    if (FactCheckingMetaData_Type.featOkTst && ((FactCheckingMetaData_Type)jcasType).casFeat_DependeciesVersion == null)
      jcasType.jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.FactCheckingMetaData");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FactCheckingMetaData_Type)jcasType).casFeatCode_DependeciesVersion), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FactCheckingMetaData_Type)jcasType).casFeatCode_DependeciesVersion), i, v);}
  }

    