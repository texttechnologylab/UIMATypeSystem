

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** L2SCA Output
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMMetric extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMMetric.class);
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
  protected LLMMetric() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LLMMetric(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMMetric(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMMetric(JCas jcas, int begin, int end) {
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

  /** getter for Value - gets Metric Feature Value
   * @generated
   * @return value of the feature 
   */
  public double getValue() {
    if (LLMMetric_Type.featOkTst && ((LLMMetric_Type)jcasType).casFeat_Value == null)
      jcasType.jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.LLMMetric");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((LLMMetric_Type)jcasType).casFeatCode_Value);}
    
  /** setter for Value - sets Metric Feature Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    if (LLMMetric_Type.featOkTst && ((LLMMetric_Type)jcasType).casFeat_Value == null)
      jcasType.jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.LLMMetric");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((LLMMetric_Type)jcasType).casFeatCode_Value, v);}    
   
    
  //*--------------*
  //* Feature: KeyName

  /** getter for KeyName - gets Metric Feature KeyName
   * @generated
   * @return value of the feature 
   */
  public String getKeyName() {
    if (LLMMetric_Type.featOkTst && ((LLMMetric_Type)jcasType).casFeat_KeyName == null)
      jcasType.jcas.throwFeatMissing("KeyName", "org.texttechnologylab.annotation.LLMMetric");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LLMMetric_Type)jcasType).casFeatCode_KeyName);}
    
  /** setter for KeyName - sets Metric Feature KeyName 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKeyName(String v) {
    if (LLMMetric_Type.featOkTst && ((LLMMetric_Type)jcasType).casFeat_KeyName == null)
      jcasType.jcas.throwFeatMissing("KeyName", "org.texttechnologylab.annotation.LLMMetric");
    jcasType.ll_cas.ll_setStringValue(addr, ((LLMMetric_Type)jcasType).casFeatCode_KeyName, v);}    
   
    
  //*--------------*
  //* Feature: definition

  /** getter for definition - gets LLM Metric Feature definition
   * @generated
   * @return value of the feature 
   */
  public String getDefinition() {
    if (LLMMetric_Type.featOkTst && ((LLMMetric_Type)jcasType).casFeat_definition == null)
      jcasType.jcas.throwFeatMissing("definition", "org.texttechnologylab.annotation.LLMMetric");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LLMMetric_Type)jcasType).casFeatCode_definition);}
    
  /** setter for definition - sets LLM Metric Feature definition 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDefinition(String v) {
    if (LLMMetric_Type.featOkTst && ((LLMMetric_Type)jcasType).casFeat_definition == null)
      jcasType.jcas.throwFeatMissing("definition", "org.texttechnologylab.annotation.LLMMetric");
    jcasType.ll_cas.ll_setStringValue(addr, ((LLMMetric_Type)jcasType).casFeatCode_definition, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets Which Model or Process was used to Compute the LLM Metric
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (LLMMetric_Type.featOkTst && ((LLMMetric_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.LLMMetric");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LLMMetric_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets Which Model or Process was used to Compute the LLM Metric 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (LLMMetric_Type.featOkTst && ((LLMMetric_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.LLMMetric");
    jcasType.ll_cas.ll_setRefValue(addr, ((LLMMetric_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    