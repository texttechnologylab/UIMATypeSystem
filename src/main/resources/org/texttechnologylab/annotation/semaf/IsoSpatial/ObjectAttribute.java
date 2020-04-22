

/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.IsoSpatial;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Tue Apr 07 19:23:38 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoBaseTypeSystem.xml
 * @generated */
public class ObjectAttribute extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ObjectAttribute.class);
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
  protected ObjectAttribute() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ObjectAttribute(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ObjectAttribute(JCas jcas) {
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
    if (ObjectAttribute_Type.featOkTst && ((ObjectAttribute_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.semaf.IsoSpatial.ObjectAttribute");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ObjectAttribute_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (ObjectAttribute_Type.featOkTst && ((ObjectAttribute_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.semaf.IsoSpatial.ObjectAttribute");
    jcasType.ll_cas.ll_setStringValue(addr, ((ObjectAttribute_Type)jcasType).casFeatCode_key, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (ObjectAttribute_Type.featOkTst && ((ObjectAttribute_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.IsoSpatial.ObjectAttribute");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ObjectAttribute_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (ObjectAttribute_Type.featOkTst && ((ObjectAttribute_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.IsoSpatial.ObjectAttribute");
    jcasType.ll_cas.ll_setStringValue(addr, ((ObjectAttribute_Type)jcasType).casFeatCode_value, v);}    
  }

    