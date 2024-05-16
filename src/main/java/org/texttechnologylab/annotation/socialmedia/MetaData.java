

/* First created by JCasGen Thu May 16 11:15:54 CEST 2024 */
package org.texttechnologylab.annotation.socialmedia;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Thu May 16 11:15:54 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologySocialMedia.xml
 * @generated */
public class MetaData extends AnnotationBase {
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

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.socialmedia.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.socialmedia.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDescription() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.socialmedia.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_description);}
    
  /** setter for description - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.socialmedia.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_description, v);}    
   
    
  //*--------------*
  //* Feature: url

  /** getter for url - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUrl() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.socialmedia.MetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_url);}
    
  /** setter for url - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.socialmedia.MetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((MetaData_Type)jcasType).casFeatCode_url, v);}    
   
    
  //*--------------*
  //* Feature: createDate

  /** getter for createDate - gets 
   * @generated
   * @return value of the feature 
   */
  public int getCreateDate() {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_createDate == null)
      jcasType.jcas.throwFeatMissing("createDate", "org.texttechnologylab.annotation.socialmedia.MetaData");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MetaData_Type)jcasType).casFeatCode_createDate);}
    
  /** setter for createDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCreateDate(int v) {
    if (MetaData_Type.featOkTst && ((MetaData_Type)jcasType).casFeat_createDate == null)
      jcasType.jcas.throwFeatMissing("createDate", "org.texttechnologylab.annotation.socialmedia.MetaData");
    jcasType.ll_cas.ll_setIntValue(addr, ((MetaData_Type)jcasType).casFeatCode_createDate, v);}    
  }

    