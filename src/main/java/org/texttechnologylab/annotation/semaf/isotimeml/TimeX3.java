

/* First created by JCasGen Tue Mar 24 16:00:31 CET 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Entity;


/** 
 * Updated by JCasGen Wed Apr 01 13:38:53 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class TimeX3 extends Entity {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TimeX3.class);
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
  protected TimeX3() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TimeX3(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TimeX3(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TimeX3(JCas jcas, int begin, int end) {
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
  //* Feature: function_in_document

  /** getter for function_in_document - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFunction_in_document() {
    if (TimeX3_Type.featOkTst && ((TimeX3_Type)jcasType).casFeat_function_in_document == null)
      jcasType.jcas.throwFeatMissing("function_in_document", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeX3_Type)jcasType).casFeatCode_function_in_document);}
    
  /** setter for function_in_document - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFunction_in_document(String v) {
    if (TimeX3_Type.featOkTst && ((TimeX3_Type)jcasType).casFeat_function_in_document == null)
      jcasType.jcas.throwFeatMissing("function_in_document", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeX3_Type)jcasType).casFeatCode_function_in_document, v);}    
   
    
  //*--------------*
  //* Feature: temporal_function

  /** getter for temporal_function - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getTemporal_function() {
    if (TimeX3_Type.featOkTst && ((TimeX3_Type)jcasType).casFeat_temporal_function == null)
      jcasType.jcas.throwFeatMissing("temporal_function", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((TimeX3_Type)jcasType).casFeatCode_temporal_function);}
    
  /** setter for temporal_function - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTemporal_function(boolean v) {
    if (TimeX3_Type.featOkTst && ((TimeX3_Type)jcasType).casFeat_temporal_function == null)
      jcasType.jcas.throwFeatMissing("temporal_function", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((TimeX3_Type)jcasType).casFeatCode_temporal_function, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (TimeX3_Type.featOkTst && ((TimeX3_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TimeX3_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (TimeX3_Type.featOkTst && ((TimeX3_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    jcasType.ll_cas.ll_setStringValue(addr, ((TimeX3_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: anchor_time_id

  /** getter for anchor_time_id - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeX3 getAnchor_time_id() {
    if (TimeX3_Type.featOkTst && ((TimeX3_Type)jcasType).casFeat_anchor_time_id == null)
      jcasType.jcas.throwFeatMissing("anchor_time_id", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    return (TimeX3)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TimeX3_Type)jcasType).casFeatCode_anchor_time_id)));}
    
  /** setter for anchor_time_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnchor_time_id(TimeX3 v) {
    if (TimeX3_Type.featOkTst && ((TimeX3_Type)jcasType).casFeat_anchor_time_id == null)
      jcasType.jcas.throwFeatMissing("anchor_time_id", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    jcasType.ll_cas.ll_setRefValue(addr, ((TimeX3_Type)jcasType).casFeatCode_anchor_time_id, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    