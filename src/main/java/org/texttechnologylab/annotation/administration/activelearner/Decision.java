

/* First created by JCasGen Fri Apr 01 18:16:00 CEST 2022 */
package org.texttechnologylab.annotation.administration.activelearner;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.type.Fingerprint;


/** 
 * Updated by JCasGen Fri Jan 20 19:10:46 CET 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class Decision extends Fingerprint {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Decision.class);
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
  protected Decision() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Decision(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Decision(JCas jcas) {
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
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() {
    if (Decision_Type.featOkTst && ((Decision_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.administration.activelearner.Decision");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Decision_Type)jcasType).casFeatCode_comment);}
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    if (Decision_Type.featOkTst && ((Decision_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.administration.activelearner.Decision");
    jcasType.ll_cas.ll_setStringValue(addr, ((Decision_Type)jcasType).casFeatCode_comment, v);}    
  }

    