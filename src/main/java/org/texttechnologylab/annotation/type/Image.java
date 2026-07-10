

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
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
  //* Feature: src

  /** getter for src - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSrc() {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_src == null)
      jcasType.jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Image");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Image_Type)jcasType).casFeatCode_src);}
    
  /** setter for src - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSrc(String v) {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_src == null)
      jcasType.jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Image");
    jcasType.ll_cas.ll_setStringValue(addr, ((Image_Type)jcasType).casFeatCode_src, v);}    
   
    
  //*--------------*
  //* Feature: width

  /** getter for width - gets 
   * @generated
   * @return value of the feature 
   */
  public int getWidth() {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_width == null)
      jcasType.jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.type.Image");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Image_Type)jcasType).casFeatCode_width);}
    
  /** setter for width - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWidth(int v) {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_width == null)
      jcasType.jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.type.Image");
    jcasType.ll_cas.ll_setIntValue(addr, ((Image_Type)jcasType).casFeatCode_width, v);}    
   
    
  //*--------------*
  //* Feature: height

  /** getter for height - gets 
   * @generated
   * @return value of the feature 
   */
  public int getHeight() {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_height == null)
      jcasType.jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.type.Image");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Image_Type)jcasType).casFeatCode_height);}
    
  /** setter for height - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeight(int v) {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_height == null)
      jcasType.jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.type.Image");
    jcasType.ll_cas.ll_setIntValue(addr, ((Image_Type)jcasType).casFeatCode_height, v);}    
   
    
  //*--------------*
  //* Feature: mimetype

  /** getter for mimetype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMimetype() {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_mimetype == null)
      jcasType.jcas.throwFeatMissing("mimetype", "org.texttechnologylab.annotation.type.Image");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Image_Type)jcasType).casFeatCode_mimetype);}
    
  /** setter for mimetype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMimetype(String v) {
    if (Image_Type.featOkTst && ((Image_Type)jcasType).casFeat_mimetype == null)
      jcasType.jcas.throwFeatMissing("mimetype", "org.texttechnologylab.annotation.type.Image");
    jcasType.ll_cas.ll_setStringValue(addr, ((Image_Type)jcasType).casFeatCode_mimetype, v);}    
  }

    