

/* First created by JCasGen Fri Oct 01 11:53:58 CEST 2021 */
package org.texttechnologylab.annotation.schema;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Oct 01 11:53:58 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotationSchema.xml
 * @generated */
public class Attribute extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Attribute.class);
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
  protected Attribute() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Attribute(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Attribute(JCas jcas) {
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
    if (Attribute_Type.featOkTst && ((Attribute_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.schema.Attribute");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Attribute_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (Attribute_Type.featOkTst && ((Attribute_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.schema.Attribute");
    jcasType.ll_cas.ll_setStringValue(addr, ((Attribute_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: description

  /** getter for description - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDescription() {
    if (Attribute_Type.featOkTst && ((Attribute_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.schema.Attribute");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Attribute_Type)jcasType).casFeatCode_description);}
    
  /** setter for description - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDescription(String v) {
    if (Attribute_Type.featOkTst && ((Attribute_Type)jcasType).casFeat_description == null)
      jcasType.jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.schema.Attribute");
    jcasType.ll_cas.ll_setStringValue(addr, ((Attribute_Type)jcasType).casFeatCode_description, v);}    
   
    
  //*--------------*
  //* Feature: range

  /** getter for range - gets 
   * @generated
   * @return value of the feature 
   */
  public TOP getRange() {
    if (Attribute_Type.featOkTst && ((Attribute_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "org.texttechnologylab.annotation.schema.Attribute");
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Attribute_Type)jcasType).casFeatCode_range)));}
    
  /** setter for range - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRange(TOP v) {
    if (Attribute_Type.featOkTst && ((Attribute_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "org.texttechnologylab.annotation.schema.Attribute");
    jcasType.ll_cas.ll_setRefValue(addr, ((Attribute_Type)jcasType).casFeatCode_range, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: mandatory

  /** getter for mandatory - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getMandatory() {
    if (Attribute_Type.featOkTst && ((Attribute_Type)jcasType).casFeat_mandatory == null)
      jcasType.jcas.throwFeatMissing("mandatory", "org.texttechnologylab.annotation.schema.Attribute");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Attribute_Type)jcasType).casFeatCode_mandatory);}
    
  /** setter for mandatory - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMandatory(boolean v) {
    if (Attribute_Type.featOkTst && ((Attribute_Type)jcasType).casFeat_mandatory == null)
      jcasType.jcas.throwFeatMissing("mandatory", "org.texttechnologylab.annotation.schema.Attribute");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Attribute_Type)jcasType).casFeatCode_mandatory, v);}    
  }

    