

/* First created by JCasGen Wed Dec 02 17:55:07 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** 
 * Updated by JCasGen Wed Dec 02 18:28:43 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyTimeAnno.xml
 * @generated */
public class Fingerprint extends Node {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Fingerprint.class);
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
  protected Fingerprint() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Fingerprint(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Fingerprint(JCas jcas) {
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
  //* Feature: user

  /** getter for user - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUser() {
    if (Fingerprint_Type.featOkTst && ((Fingerprint_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.type.Fingerprint");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Fingerprint_Type)jcasType).casFeatCode_user);}
    
  /** setter for user - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUser(String v) {
    if (Fingerprint_Type.featOkTst && ((Fingerprint_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.type.Fingerprint");
    jcasType.ll_cas.ll_setStringValue(addr, ((Fingerprint_Type)jcasType).casFeatCode_user, v);}    
   
    
  //*--------------*
  //* Feature: create

  /** getter for create - gets 
   * @generated
   * @return value of the feature 
   */
  public long getCreate() {
    if (Fingerprint_Type.featOkTst && ((Fingerprint_Type)jcasType).casFeat_create == null)
      jcasType.jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.type.Fingerprint");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Fingerprint_Type)jcasType).casFeatCode_create);}
    
  /** setter for create - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCreate(long v) {
    if (Fingerprint_Type.featOkTst && ((Fingerprint_Type)jcasType).casFeat_create == null)
      jcasType.jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.type.Fingerprint");
    jcasType.ll_cas.ll_setLongValue(addr, ((Fingerprint_Type)jcasType).casFeatCode_create, v);}    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public TOP getReference() {
    if (Fingerprint_Type.featOkTst && ((Fingerprint_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.Fingerprint");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Fingerprint_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(TOP v) {
    if (Fingerprint_Type.featOkTst && ((Fingerprint_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.type.Fingerprint");
    jcasType.ll_cas.ll_setRefValue(addr, ((Fingerprint_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    