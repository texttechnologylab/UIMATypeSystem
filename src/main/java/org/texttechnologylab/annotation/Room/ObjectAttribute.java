

/* First created by JCasGen Wed Dec 02 18:39:06 CET 2020 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Attribute of an object (color, texture, srl, ...)
 * Updated by JCasGen Wed Dec 02 18:39:06 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyRoom.xml
 * @generated */
public class ObjectAttribute extends Annotation {
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

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ObjectAttribute(JCas jcas, int begin, int end) {
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

  /** getter for key - gets name of the attribute
   * @generated
   * @return value of the feature 
   */
  public String getKey() {
    if (ObjectAttribute_Type.featOkTst && ((ObjectAttribute_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.Room.ObjectAttribute");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ObjectAttribute_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets name of the attribute 
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (ObjectAttribute_Type.featOkTst && ((ObjectAttribute_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.Room.ObjectAttribute");
    jcasType.ll_cas.ll_setStringValue(addr, ((ObjectAttribute_Type)jcasType).casFeatCode_key, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets value of the attribute
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (ObjectAttribute_Type.featOkTst && ((ObjectAttribute_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Room.ObjectAttribute");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ObjectAttribute_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets value of the attribute 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (ObjectAttribute_Type.featOkTst && ((ObjectAttribute_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.Room.ObjectAttribute");
    jcasType.ll_cas.ll_setStringValue(addr, ((ObjectAttribute_Type)jcasType).casFeatCode_value, v);}    
  }

    