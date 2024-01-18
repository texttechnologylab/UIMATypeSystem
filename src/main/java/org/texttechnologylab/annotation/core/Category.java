

/* First created by JCasGen Wed Jan 10 11:59:30 CET 2024 */
package org.texttechnologylab.annotation.core;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Generic category type
 * Updated by JCasGen Thu Jan 18 16:13:36 CET 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/Core.xml
 * @generated */
public class Category extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Category.class);
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
  protected Category() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Category(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Category(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Category(JCas jcas, int begin, int end) {
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
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.core.Category");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Category_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.core.Category");
    jcasType.ll_cas.ll_setStringValue(addr, ((Category_Type)jcasType).casFeatCode_key, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.core.Category");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Category_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.core.Category");
    jcasType.ll_cas.ll_setStringValue(addr, ((Category_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDescription() {
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.core.Category");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Category_Type)jcasType).casFeatCode_description);}
    
  /** setter for description - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    if (Category_Type.featOkTst && ((Category_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.core.Category");
    jcasType.ll_cas.ll_setStringValue(addr, ((Category_Type)jcasType).casFeatCode_description, v);}    
  }

    