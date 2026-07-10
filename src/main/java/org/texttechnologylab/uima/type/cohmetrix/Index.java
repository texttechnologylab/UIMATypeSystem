

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.uima.type.cohmetrix;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Coh-Metrix Index
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Index extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Index.class);
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
  protected Index() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Index(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Index(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Index(JCas jcas, int begin, int end) {
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
  //* Feature: index

  /** getter for index - gets 
   * @generated
   * @return value of the feature 
   */
  public int getIndex() {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Index_Type)jcasType).casFeatCode_index);}
    
  /** setter for index - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(int v) {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.uima.type.cohmetrix.Index");
    jcasType.ll_cas.ll_setIntValue(addr, ((Index_Type)jcasType).casFeatCode_index, v);}    
   
    
  //*--------------*
  //* Feature: typeName

  /** getter for typeName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTypeName() {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_typeName == null)
      jcasType.jcas.throwFeatMissing("typeName", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Index_Type)jcasType).casFeatCode_typeName);}
    
  /** setter for typeName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTypeName(String v) {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_typeName == null)
      jcasType.jcas.throwFeatMissing("typeName", "org.texttechnologylab.uima.type.cohmetrix.Index");
    jcasType.ll_cas.ll_setStringValue(addr, ((Index_Type)jcasType).casFeatCode_typeName, v);}    
   
    
  //*--------------*
  //* Feature: labelV3

  /** getter for labelV3 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabelV3() {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_labelV3 == null)
      jcasType.jcas.throwFeatMissing("labelV3", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Index_Type)jcasType).casFeatCode_labelV3);}
    
  /** setter for labelV3 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabelV3(String v) {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_labelV3 == null)
      jcasType.jcas.throwFeatMissing("labelV3", "org.texttechnologylab.uima.type.cohmetrix.Index");
    jcasType.ll_cas.ll_setStringValue(addr, ((Index_Type)jcasType).casFeatCode_labelV3, v);}    
   
    
  //*--------------*
  //* Feature: labelV2

  /** getter for labelV2 - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabelV2() {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_labelV2 == null)
      jcasType.jcas.throwFeatMissing("labelV2", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Index_Type)jcasType).casFeatCode_labelV2);}
    
  /** setter for labelV2 - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabelV2(String v) {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_labelV2 == null)
      jcasType.jcas.throwFeatMissing("labelV2", "org.texttechnologylab.uima.type.cohmetrix.Index");
    jcasType.ll_cas.ll_setStringValue(addr, ((Index_Type)jcasType).casFeatCode_labelV2, v);}    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDescription() {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Index_Type)jcasType).casFeatCode_description);}
    
  /** setter for description - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.uima.type.cohmetrix.Index");
    jcasType.ll_cas.ll_setStringValue(addr, ((Index_Type)jcasType).casFeatCode_description, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public double getValue() {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Index_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.uima.type.cohmetrix.Index");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Index_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: error

  /** getter for error - gets Optional error message
   * @generated
   * @return value of the feature 
   */
  public String getError() {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_error == null)
      jcasType.jcas.throwFeatMissing("error", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Index_Type)jcasType).casFeatCode_error);}
    
  /** setter for error - sets Optional error message 
   * @generated
   * @param v value to set into the feature 
   */
  public void setError(String v) {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_error == null)
      jcasType.jcas.throwFeatMissing("error", "org.texttechnologylab.uima.type.cohmetrix.Index");
    jcasType.ll_cas.ll_setStringValue(addr, ((Index_Type)jcasType).casFeatCode_error, v);}    
   
    
  //*--------------*
  //* Feature: labelTTLab

  /** getter for labelTTLab - gets New index added by the TTLab or significantly modified V3 index.
   * @generated
   * @return value of the feature 
   */
  public String getLabelTTLab() {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_labelTTLab == null)
      jcasType.jcas.throwFeatMissing("labelTTLab", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Index_Type)jcasType).casFeatCode_labelTTLab);}
    
  /** setter for labelTTLab - sets New index added by the TTLab or significantly modified V3 index. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabelTTLab(String v) {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_labelTTLab == null)
      jcasType.jcas.throwFeatMissing("labelTTLab", "org.texttechnologylab.uima.type.cohmetrix.Index");
    jcasType.ll_cas.ll_setStringValue(addr, ((Index_Type)jcasType).casFeatCode_labelTTLab, v);}    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVersion() {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Index_Type)jcasType).casFeatCode_version);}
    
  /** setter for version - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    if (Index_Type.featOkTst && ((Index_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.uima.type.cohmetrix.Index");
    jcasType.ll_cas.ll_setStringValue(addr, ((Index_Type)jcasType).casFeatCode_version, v);}    
  }

    