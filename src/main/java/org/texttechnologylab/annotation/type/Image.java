

/* First created by JCasGen Thu Jan 18 16:08:21 CET 2024 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jan 18 16:08:21 CET 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyMultimedia.xml
 * @generated */
public class Image extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Image.class);
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
  protected Image() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Image(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Image(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Image(JCas jcas, int begin, int end) {
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
  //* Feature: mimeType

  /** getter for mimeType - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMimeType() {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_mimeType == null)
      jcasType.jcas.throwFeatMissing("mimeType", "org.texttechnologylab.annotation.type.Image");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Image_Type)jcasType).casFeatCode_mimeType);}
    
  /** setter for mimeType - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMimeType(String v) {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_mimeType == null)
      jcasType.jcas.throwFeatMissing("mimeType", "org.texttechnologylab.annotation.type.Image");
    jcasType.ll_cas.ll_setStringValue(addr, ((Image_Type)jcasType).casFeatCode_mimeType, v);}    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.type.Image");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Image_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.type.Image");
    jcasType.ll_cas.ll_setStringValue(addr, ((Image_Type)jcasType).casFeatCode_value, v);}    
  }

    