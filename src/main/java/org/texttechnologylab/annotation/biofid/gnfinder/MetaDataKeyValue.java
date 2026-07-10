

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.biofid.gnfinder;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MetaDataKeyValue extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MetaDataKeyValue.class);
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
  protected MetaDataKeyValue() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MetaDataKeyValue(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MetaDataKeyValue(JCas jcas) {
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
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKey() {
    if (MetaDataKeyValue_Type.featOkTst && ((MetaDataKeyValue_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.biofid.gnfinder.MetaDataKeyValue");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaDataKeyValue_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (MetaDataKeyValue_Type.featOkTst && ((MetaDataKeyValue_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.biofid.gnfinder.MetaDataKeyValue");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaDataKeyValue_Type)jcasType).casFeatCode_key, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (MetaDataKeyValue_Type.featOkTst && ((MetaDataKeyValue_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.biofid.gnfinder.MetaDataKeyValue");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaDataKeyValue_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (MetaDataKeyValue_Type.featOkTst && ((MetaDataKeyValue_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.biofid.gnfinder.MetaDataKeyValue");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaDataKeyValue_Type)jcasType).casFeatCode_value, v);}    
  }

    