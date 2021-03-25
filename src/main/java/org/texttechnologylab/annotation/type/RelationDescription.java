

/* First created by JCasGen Wed Dec 02 18:39:03 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Mar 25 09:35:20 CET 2021
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyQuickAnno.xml
 * @generated */
public class RelationDescription extends Attribute {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RelationDescription.class);
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
  protected RelationDescription() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public RelationDescription(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RelationDescription(JCas jcas) {
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
    if (RelationDescription_Type.featOkTst && ((RelationDescription_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.type.RelationDescription");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationDescription_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (RelationDescription_Type.featOkTst && ((RelationDescription_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.type.RelationDescription");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationDescription_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: relationtype

  /** getter for relationtype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRelationtype() {
    if (RelationDescription_Type.featOkTst && ((RelationDescription_Type)jcasType).casFeat_relationtype == null)
      jcasType.jcas.throwFeatMissing("relationtype", "org.texttechnologylab.annotation.type.RelationDescription");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RelationDescription_Type)jcasType).casFeatCode_relationtype);}
    
  /** setter for relationtype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelationtype(String v) {
    if (RelationDescription_Type.featOkTst && ((RelationDescription_Type)jcasType).casFeat_relationtype == null)
      jcasType.jcas.throwFeatMissing("relationtype", "org.texttechnologylab.annotation.type.RelationDescription");
    jcasType.ll_cas.ll_setStringValue(addr, ((RelationDescription_Type)jcasType).casFeatCode_relationtype, v);}    
  }

    