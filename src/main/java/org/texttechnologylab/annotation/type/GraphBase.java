

/* First created by JCasGen Fri Mar 20 09:03:02 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Wed Apr 01 10:00:20 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyGraph.xml
 * @generated */
public class GraphBase extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GraphBase.class);
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
  protected GraphBase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GraphBase(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GraphBase(JCas jcas) {
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
  //* Feature: Id

  /** getter for Id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "org.texttechnologylab.annotation.type.GraphBase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GraphBase_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "org.texttechnologylab.annotation.type.GraphBase");
    jcasType.ll_cas.ll_setStringValue(addr, ((GraphBase_Type)jcasType).casFeatCode_Id, v);}    
   
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.type.GraphBase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GraphBase_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.type.GraphBase");
    jcasType.ll_cas.ll_setStringValue(addr, ((GraphBase_Type)jcasType).casFeatCode_label, v);}    
   
    
  //*--------------*
  //* Feature: create

  /** getter for create - gets 
   * @generated
   * @return value of the feature 
   */
  public long getCreate() {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_create == null)
      jcasType.jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.type.GraphBase");
    return jcasType.ll_cas.ll_getLongValue(addr, ((GraphBase_Type)jcasType).casFeatCode_create);}
    
  /** setter for create - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCreate(long v) {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_create == null)
      jcasType.jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.type.GraphBase");
    jcasType.ll_cas.ll_setLongValue(addr, ((GraphBase_Type)jcasType).casFeatCode_create, v);}    
   
    
  //*--------------*
  //* Feature: modified

  /** getter for modified - gets 
   * @generated
   * @return value of the feature 
   */
  public long getModified() {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_modified == null)
      jcasType.jcas.throwFeatMissing("modified", "org.texttechnologylab.annotation.type.GraphBase");
    return jcasType.ll_cas.ll_getLongValue(addr, ((GraphBase_Type)jcasType).casFeatCode_modified);}
    
  /** setter for modified - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModified(long v) {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_modified == null)
      jcasType.jcas.throwFeatMissing("modified", "org.texttechnologylab.annotation.type.GraphBase");
    jcasType.ll_cas.ll_setLongValue(addr, ((GraphBase_Type)jcasType).casFeatCode_modified, v);}    
   
    
  //*--------------*
  //* Feature: user

  /** getter for user - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUser() {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.type.GraphBase");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GraphBase_Type)jcasType).casFeatCode_user);}
    
  /** setter for user - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUser(String v) {
    if (GraphBase_Type.featOkTst && ((GraphBase_Type)jcasType).casFeat_user == null)
      jcasType.jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.type.GraphBase");
    jcasType.ll_cas.ll_setStringValue(addr, ((GraphBase_Type)jcasType).casFeatCode_user, v);}    
  }

    