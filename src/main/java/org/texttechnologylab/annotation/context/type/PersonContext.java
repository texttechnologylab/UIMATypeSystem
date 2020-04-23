

/* First created by JCasGen Thu Apr 23 09:54:52 CEST 2020 */
package org.texttechnologylab.annotation.context.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.node.type.Context;


/** 
 * Updated by JCasGen Thu Apr 23 09:54:52 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 * @generated */
public class PersonContext extends Context {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PersonContext.class);
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
  protected PersonContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PersonContext(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PersonContext(JCas jcas) {
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
  //* Feature: birthDate

  /** getter for birthDate - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBirthDate() {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_birthDate == null)
      jcasType.jcas.throwFeatMissing("birthDate", "org.texttechnologylab.annotation.context.type.PersonContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_birthDate);}
    
  /** setter for birthDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBirthDate(String v) {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_birthDate == null)
      jcasType.jcas.throwFeatMissing("birthDate", "org.texttechnologylab.annotation.context.type.PersonContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_birthDate, v);}    
   
    
  //*--------------*
  //* Feature: Name

  /** getter for Name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.context.type.PersonContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_Name);}
    
  /** setter for Name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.context.type.PersonContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_Name, v);}    
   
    
  //*--------------*
  //* Feature: contextInf

  /** getter for contextInf - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContextInf() {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_contextInf == null)
      jcasType.jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.PersonContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_contextInf);}
    
  /** setter for contextInf - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextInf(String v) {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_contextInf == null)
      jcasType.jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.PersonContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_contextInf, v);}    
   
    
  //*--------------*
  //* Feature: gender

  /** getter for gender - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGender() {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_gender == null)
      jcasType.jcas.throwFeatMissing("gender", "org.texttechnologylab.annotation.context.type.PersonContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_gender);}
    
  /** setter for gender - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGender(String v) {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_gender == null)
      jcasType.jcas.throwFeatMissing("gender", "org.texttechnologylab.annotation.context.type.PersonContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_gender, v);}    
   
    
  //*--------------*
  //* Feature: birthPlace

  /** getter for birthPlace - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBirthPlace() {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_birthPlace == null)
      jcasType.jcas.throwFeatMissing("birthPlace", "org.texttechnologylab.annotation.context.type.PersonContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_birthPlace);}
    
  /** setter for birthPlace - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBirthPlace(String v) {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_birthPlace == null)
      jcasType.jcas.throwFeatMissing("birthPlace", "org.texttechnologylab.annotation.context.type.PersonContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_birthPlace, v);}    
   
    
  //*--------------*
  //* Feature: fieldOfWork

  /** getter for fieldOfWork - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFieldOfWork() {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_fieldOfWork == null)
      jcasType.jcas.throwFeatMissing("fieldOfWork", "org.texttechnologylab.annotation.context.type.PersonContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_fieldOfWork);}
    
  /** setter for fieldOfWork - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFieldOfWork(String v) {
    if (PersonContext_Type.featOkTst && ((PersonContext_Type)jcasType).casFeat_fieldOfWork == null)
      jcasType.jcas.throwFeatMissing("fieldOfWork", "org.texttechnologylab.annotation.context.type.PersonContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((PersonContext_Type)jcasType).casFeatCode_fieldOfWork, v);}    
  }

    