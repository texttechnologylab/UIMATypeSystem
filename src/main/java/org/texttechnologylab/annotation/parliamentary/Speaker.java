

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.parliamentary;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Speaker extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Speaker.class);
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
  protected Speaker() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Speaker(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Speaker(JCas jcas) {
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
  //* Feature: id

  /** getter for id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.parliamentary.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: firstName

  /** getter for firstName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFirstName() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_firstName == null)
      jcasType.jcas.throwFeatMissing("firstName", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_firstName);}
    
  /** setter for firstName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFirstName(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_firstName == null)
      jcasType.jcas.throwFeatMissing("firstName", "org.texttechnologylab.annotation.parliamentary.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_firstName, v);}    
   
    
  //*--------------*
  //* Feature: lastName

  /** getter for lastName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLastName() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_lastName == null)
      jcasType.jcas.throwFeatMissing("lastName", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_lastName);}
    
  /** setter for lastName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLastName(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_lastName == null)
      jcasType.jcas.throwFeatMissing("lastName", "org.texttechnologylab.annotation.parliamentary.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_lastName, v);}    
   
    
  //*--------------*
  //* Feature: group

  /** getter for group - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGroup() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_group);}
    
  /** setter for group - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGroup(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.parliamentary.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_group, v);}    
   
    
  //*--------------*
  //* Feature: role

  /** getter for role - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRole() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "org.texttechnologylab.annotation.parliamentary.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_role);}
    
  /** setter for role - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "org.texttechnologylab.annotation.parliamentary.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_role, v);}    
  }

    