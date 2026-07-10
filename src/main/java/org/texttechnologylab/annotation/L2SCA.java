

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** L2SCA Output
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class L2SCA extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(L2SCA.class);
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
  protected L2SCA() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public L2SCA(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public L2SCA(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public L2SCA(JCas jcas, int begin, int end) {
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
  //* Feature: Value

  /** getter for Value - gets L2SCA Feature Value
   * @generated
   * @return value of the feature 
   */
  public double getValue() {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_Value == null)
      jcasType.jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.L2SCA");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((L2SCA_Type)jcasType).casFeatCode_Value);}
    
  /** setter for Value - sets L2SCA Feature Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_Value == null)
      jcasType.jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.L2SCA");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((L2SCA_Type)jcasType).casFeatCode_Value, v);}    
   
    
  //*--------------*
  //* Feature: Code

  /** getter for Code - gets L2SCA Feature Code
   * @generated
   * @return value of the feature 
   */
  public String getCode() {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_Code == null)
      jcasType.jcas.throwFeatMissing("Code", "org.texttechnologylab.annotation.L2SCA");
    return jcasType.ll_cas.ll_getStringValue(addr, ((L2SCA_Type)jcasType).casFeatCode_Code);}
    
  /** setter for Code - sets L2SCA Feature Code 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCode(String v) {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_Code == null)
      jcasType.jcas.throwFeatMissing("Code", "org.texttechnologylab.annotation.L2SCA");
    jcasType.ll_cas.ll_setStringValue(addr, ((L2SCA_Type)jcasType).casFeatCode_Code, v);}    
   
    
  //*--------------*
  //* Feature: typeName

  /** getter for typeName - gets L2SCA Feature typeName
   * @generated
   * @return value of the feature 
   */
  public String getTypeName() {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_typeName == null)
      jcasType.jcas.throwFeatMissing("typeName", "org.texttechnologylab.annotation.L2SCA");
    return jcasType.ll_cas.ll_getStringValue(addr, ((L2SCA_Type)jcasType).casFeatCode_typeName);}
    
  /** setter for typeName - sets L2SCA Feature typeName 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypeName(String v) {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_typeName == null)
      jcasType.jcas.throwFeatMissing("typeName", "org.texttechnologylab.annotation.L2SCA");
    jcasType.ll_cas.ll_setStringValue(addr, ((L2SCA_Type)jcasType).casFeatCode_typeName, v);}    
   
    
  //*--------------*
  //* Feature: typeNumber

  /** getter for typeNumber - gets L2SCA Feature type Number
   * @generated
   * @return value of the feature 
   */
  public int getTypeNumber() {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_typeNumber == null)
      jcasType.jcas.throwFeatMissing("typeNumber", "org.texttechnologylab.annotation.L2SCA");
    return jcasType.ll_cas.ll_getIntValue(addr, ((L2SCA_Type)jcasType).casFeatCode_typeNumber);}
    
  /** setter for typeNumber - sets L2SCA Feature type Number 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypeNumber(int v) {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_typeNumber == null)
      jcasType.jcas.throwFeatMissing("typeNumber", "org.texttechnologylab.annotation.L2SCA");
    jcasType.ll_cas.ll_setIntValue(addr, ((L2SCA_Type)jcasType).casFeatCode_typeNumber, v);}    
   
    
  //*--------------*
  //* Feature: Measure

  /** getter for Measure - gets L2SCA Feature Measure
   * @generated
   * @return value of the feature 
   */
  public String getMeasure() {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_Measure == null)
      jcasType.jcas.throwFeatMissing("Measure", "org.texttechnologylab.annotation.L2SCA");
    return jcasType.ll_cas.ll_getStringValue(addr, ((L2SCA_Type)jcasType).casFeatCode_Measure);}
    
  /** setter for Measure - sets L2SCA Feature Measure 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeasure(String v) {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_Measure == null)
      jcasType.jcas.throwFeatMissing("Measure", "org.texttechnologylab.annotation.L2SCA");
    jcasType.ll_cas.ll_setStringValue(addr, ((L2SCA_Type)jcasType).casFeatCode_Measure, v);}    
   
    
  //*--------------*
  //* Feature: definition

  /** getter for definition - gets L2SCA Feature definition
   * @generated
   * @return value of the feature 
   */
  public String getDefinition() {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_definition == null)
      jcasType.jcas.throwFeatMissing("definition", "org.texttechnologylab.annotation.L2SCA");
    return jcasType.ll_cas.ll_getStringValue(addr, ((L2SCA_Type)jcasType).casFeatCode_definition);}
    
  /** setter for definition - sets L2SCA Feature definition 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDefinition(String v) {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_definition == null)
      jcasType.jcas.throwFeatMissing("definition", "org.texttechnologylab.annotation.L2SCA");
    jcasType.ll_cas.ll_setStringValue(addr, ((L2SCA_Type)jcasType).casFeatCode_definition, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets Which Model or Process was used to Compute the L2SCA
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.L2SCA");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((L2SCA_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets Which Model or Process was used to Compute the L2SCA 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (L2SCA_Type.featOkTst && ((L2SCA_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.L2SCA");
    jcasType.ll_cas.ll_setRefValue(addr, ((L2SCA_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    