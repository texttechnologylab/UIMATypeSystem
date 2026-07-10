

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Div;


/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Page extends Div {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Page.class);
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
  protected Page() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Page(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Page(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Page(JCas jcas, int begin, int end) {
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
  //* Feature: index

  /** getter for index - gets The page index, i.e. a running number assigned during the processing.
                        Usually denoted in the file name as the first part, e.g. "1" for "01_123456789.xml"
   * @generated
   * @return value of the feature 
   */
  public int getIndex() {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Page_Type)jcasType).casFeatCode_index);}
    
  /** setter for index - sets The page index, i.e. a running number assigned during the processing.
                        Usually denoted in the file name as the first part, e.g. "1" for "01_123456789.xml" 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIndex(int v) {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_index == null)
      jcasType.jcas.throwFeatMissing("index", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    jcasType.ll_cas.ll_setIntValue(addr, ((Page_Type)jcasType).casFeatCode_index, v);}    
   
    
  //*--------------*
  //* Feature: pageNumber

  /** getter for pageNumber - gets The page number *as a String* as cover pages etc. are commonly numbered using roman numbers.
   * @generated
   * @return value of the feature 
   */
  public String getPageNumber() {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_pageNumber == null)
      jcasType.jcas.throwFeatMissing("pageNumber", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Page_Type)jcasType).casFeatCode_pageNumber);}
    
  /** setter for pageNumber - sets The page number *as a String* as cover pages etc. are commonly numbered using roman numbers. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPageNumber(String v) {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_pageNumber == null)
      jcasType.jcas.throwFeatMissing("pageNumber", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    jcasType.ll_cas.ll_setStringValue(addr, ((Page_Type)jcasType).casFeatCode_pageNumber, v);}    
   
    
  //*--------------*
  //* Feature: uri

  /** getter for uri - gets URI of this page, i.e. a Visual Library link.
   * @generated
   * @return value of the feature 
   */
  public String getUri() {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Page_Type)jcasType).casFeatCode_uri);}
    
  /** setter for uri - sets URI of this page, i.e. a Visual Library link. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUri(String v) {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_uri == null)
      jcasType.jcas.throwFeatMissing("uri", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    jcasType.ll_cas.ll_setStringValue(addr, ((Page_Type)jcasType).casFeatCode_uri, v);}    
   
    
  //*--------------*
  //* Feature: width

  /** getter for width - gets The image width in pixels.
   * @generated
   * @return value of the feature 
   */
  public int getWidth() {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_width == null)
      jcasType.jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Page_Type)jcasType).casFeatCode_width);}
    
  /** setter for width - sets The image width in pixels. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWidth(int v) {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_width == null)
      jcasType.jcas.throwFeatMissing("width", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    jcasType.ll_cas.ll_setIntValue(addr, ((Page_Type)jcasType).casFeatCode_width, v);}    
   
    
  //*--------------*
  //* Feature: height

  /** getter for height - gets The image height in pixels.
   * @generated
   * @return value of the feature 
   */
  public int getHeight() {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_height == null)
      jcasType.jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Page_Type)jcasType).casFeatCode_height);}
    
  /** setter for height - sets The image height in pixels. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeight(int v) {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_height == null)
      jcasType.jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    jcasType.ll_cas.ll_setIntValue(addr, ((Page_Type)jcasType).casFeatCode_height, v);}    
   
    
  //*--------------*
  //* Feature: resolution

  /** getter for resolution - gets The image resolution in pixels per inch.
   * @generated
   * @return value of the feature 
   */
  public int getResolution() {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_resolution == null)
      jcasType.jcas.throwFeatMissing("resolution", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Page_Type)jcasType).casFeatCode_resolution);}
    
  /** setter for resolution - sets The image resolution in pixels per inch. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setResolution(int v) {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_resolution == null)
      jcasType.jcas.throwFeatMissing("resolution", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    jcasType.ll_cas.ll_setIntValue(addr, ((Page_Type)jcasType).casFeatCode_resolution, v);}    
   
    
  //*--------------*
  //* Feature: rotation

  /** getter for rotation - gets The type of rotation applied to original page image before processing (optional).
                        It can be one of the following values: Normal, RotatedClockwise, RotatedUpsideDown, RotatedCounterclockwise
   * @generated
   * @return value of the feature 
   */
  public String getRotation() {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Page_Type)jcasType).casFeatCode_rotation);}
    
  /** setter for rotation - sets The type of rotation applied to original page image before processing (optional).
                        It can be one of the following values: Normal, RotatedClockwise, RotatedUpsideDown, RotatedCounterclockwise 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRotation(String v) {
    if (Page_Type.featOkTst && ((Page_Type)jcasType).casFeat_rotation == null)
      jcasType.jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.ocr.abbyy.Page");
    jcasType.ll_cas.ll_setStringValue(addr, ((Page_Type)jcasType).casFeatCode_rotation, v);}    
  }

    