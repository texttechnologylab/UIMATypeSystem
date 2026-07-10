

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.Caption;


/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ImageWithCaptions extends Image {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ImageWithCaptions.class);
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
  protected ImageWithCaptions() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ImageWithCaptions(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ImageWithCaptions(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ImageWithCaptions(JCas jcas, int begin, int end) {
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
  //* Feature: captions

  /** getter for captions - gets Set of image captions
   * @generated
   * @return value of the feature 
   */
  public FSArray getCaptions() {
    if (ImageWithCaptions_Type.featOkTst && ((ImageWithCaptions_Type)jcasType).casFeat_captions == null)
      jcasType.jcas.throwFeatMissing("captions", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ImageWithCaptions_Type)jcasType).casFeatCode_captions)));}
    
  /** setter for captions - sets Set of image captions 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCaptions(FSArray v) {
    if (ImageWithCaptions_Type.featOkTst && ((ImageWithCaptions_Type)jcasType).casFeat_captions == null)
      jcasType.jcas.throwFeatMissing("captions", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    jcasType.ll_cas.ll_setRefValue(addr, ((ImageWithCaptions_Type)jcasType).casFeatCode_captions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for captions - gets an indexed value - Set of image captions
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public Caption getCaptions(int i) {
    if (ImageWithCaptions_Type.featOkTst && ((ImageWithCaptions_Type)jcasType).casFeat_captions == null)
      jcasType.jcas.throwFeatMissing("captions", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ImageWithCaptions_Type)jcasType).casFeatCode_captions), i);
    return (Caption)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ImageWithCaptions_Type)jcasType).casFeatCode_captions), i)));}

  /** indexed setter for captions - sets an indexed value - Set of image captions
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCaptions(int i, Caption v) { 
    if (ImageWithCaptions_Type.featOkTst && ((ImageWithCaptions_Type)jcasType).casFeat_captions == null)
      jcasType.jcas.throwFeatMissing("captions", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ImageWithCaptions_Type)jcasType).casFeatCode_captions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ImageWithCaptions_Type)jcasType).casFeatCode_captions), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: captionLanguage

  /** getter for captionLanguage - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCaptionLanguage() {
    if (ImageWithCaptions_Type.featOkTst && ((ImageWithCaptions_Type)jcasType).casFeat_captionLanguage == null)
      jcasType.jcas.throwFeatMissing("captionLanguage", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ImageWithCaptions_Type)jcasType).casFeatCode_captionLanguage);}
    
  /** setter for captionLanguage - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCaptionLanguage(String v) {
    if (ImageWithCaptions_Type.featOkTst && ((ImageWithCaptions_Type)jcasType).casFeat_captionLanguage == null)
      jcasType.jcas.throwFeatMissing("captionLanguage", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    jcasType.ll_cas.ll_setStringValue(addr, ((ImageWithCaptions_Type)jcasType).casFeatCode_captionLanguage, v);}    
  }

    