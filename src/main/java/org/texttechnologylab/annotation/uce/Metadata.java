

/* First created by JCasGen Tue Feb 17 20:19:38 CET 2026 */
package org.texttechnologylab.annotation.uce;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Dynamic metadata triplets, consisting of a key, a value and the type modelling the value.
 * Updated by JCasGen Tue Feb 17 20:19:38 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Metadata extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Metadata.class);
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
  protected Metadata() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Metadata(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Metadata(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Metadata(JCas jcas, int begin, int end) {
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
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKey() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.uce.Metadata");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.uce.Metadata");
    jcasType.ll_cas.ll_setStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_key, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.uce.Metadata");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.uce.Metadata");
    jcasType.ll_cas.ll_setStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: valueType

  /** getter for valueType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValueType() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_valueType == null)
      jcasType.jcas.throwFeatMissing("valueType", "org.texttechnologylab.annotation.uce.Metadata");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_valueType);}
    
  /** setter for valueType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValueType(String v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_valueType == null)
      jcasType.jcas.throwFeatMissing("valueType", "org.texttechnologylab.annotation.uce.Metadata");
    jcasType.ll_cas.ll_setStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_valueType, v);}    
   
    
  //*--------------*
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.uce.Metadata");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_comment);}
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    if (Metadata_Type.featOkTst && ((Metadata_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.uce.Metadata");
    jcasType.ll_cas.ll_setStringValue(addr, ((Metadata_Type)jcasType).casFeatCode_comment, v);}    
  }

    