

/* First created by JCasGen Thu Oct 19 12:56:03 CEST 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Thu Oct 19 12:56:03 CEST 2023
 * XML source: /home/staff_homes/dbaumart/dev/git/UIMATypeSystem/src/main/resources/desc/type/AnomalySpellingMetaTypeSystem.xml
 * @generated */
public class AnomalySpellingMeta extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnomalySpellingMeta.class);
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
  protected AnomalySpellingMeta() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnomalySpellingMeta(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnomalySpellingMeta(JCas jcas) {
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
  //* Feature: ModelName

  /** getter for ModelName - gets The name of the Model
   * @generated
   * @return value of the feature 
   */
  public String getModelName() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_ModelName == null)
      jcasType.jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_ModelName);}
    
  /** setter for ModelName - sets The name of the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_ModelName == null)
      jcasType.jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_ModelName, v);}    
   
    
  //*--------------*
  //* Feature: GoodQuality

  /** getter for GoodQuality - gets Quality of Document without skipped and unknown Words
   * @generated
   * @return value of the feature 
   */
  public double getGoodQuality() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_GoodQuality == null)
      jcasType.jcas.throwFeatMissing("GoodQuality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_GoodQuality);}
    
  /** setter for GoodQuality - sets Quality of Document without skipped and unknown Words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGoodQuality(double v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_GoodQuality == null)
      jcasType.jcas.throwFeatMissing("GoodQuality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_GoodQuality, v);}    
   
    
  //*--------------*
  //* Feature: UnknownQuality

  /** getter for UnknownQuality - gets Quality of Document without skipped Words
   * @generated
   * @return value of the feature 
   */
  public double getUnknownQuality() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_UnknownQuality == null)
      jcasType.jcas.throwFeatMissing("UnknownQuality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_UnknownQuality);}
    
  /** setter for UnknownQuality - sets Quality of Document without skipped Words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnknownQuality(double v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_UnknownQuality == null)
      jcasType.jcas.throwFeatMissing("UnknownQuality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_UnknownQuality, v);}    
   
    
  //*--------------*
  //* Feature: Quality

  /** getter for Quality - gets Quality of Document
   * @generated
   * @return value of the feature 
   */
  public double getQuality() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_Quality == null)
      jcasType.jcas.throwFeatMissing("Quality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_Quality);}
    
  /** setter for Quality - sets Quality of Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuality(double v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_Quality == null)
      jcasType.jcas.throwFeatMissing("Quality", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_Quality, v);}    
   
    
  //*--------------*
  //* Feature: RightWords

  /** getter for RightWords - gets Number of correct words in the Document
   * @generated
   * @return value of the feature 
   */
  public int getRightWords() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_RightWords == null)
      jcasType.jcas.throwFeatMissing("RightWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_RightWords);}
    
  /** setter for RightWords - sets Number of correct words in the Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRightWords(int v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_RightWords == null)
      jcasType.jcas.throwFeatMissing("RightWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_RightWords, v);}    
   
    
  //*--------------*
  //* Feature: WrongWords

  /** getter for WrongWords - gets Number of wrong words in the Document
   * @generated
   * @return value of the feature 
   */
  public int getWrongWords() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_WrongWords == null)
      jcasType.jcas.throwFeatMissing("WrongWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_WrongWords);}
    
  /** setter for WrongWords - sets Number of wrong words in the Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWrongWords(int v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_WrongWords == null)
      jcasType.jcas.throwFeatMissing("WrongWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_WrongWords, v);}    
   
    
  //*--------------*
  //* Feature: UnknownWords

  /** getter for UnknownWords - gets Number of unknown words in the Document
   * @generated
   * @return value of the feature 
   */
  public int getUnknownWords() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_UnknownWords == null)
      jcasType.jcas.throwFeatMissing("UnknownWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_UnknownWords);}
    
  /** setter for UnknownWords - sets Number of unknown words in the Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnknownWords(int v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_UnknownWords == null)
      jcasType.jcas.throwFeatMissing("UnknownWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_UnknownWords, v);}    
   
    
  //*--------------*
  //* Feature: SkippedWords

  /** getter for SkippedWords - gets Number of Skipped words in the Document
   * @generated
   * @return value of the feature 
   */
  public int getSkippedWords() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_SkippedWords == null)
      jcasType.jcas.throwFeatMissing("SkippedWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_SkippedWords);}
    
  /** setter for SkippedWords - sets Number of Skipped words in the Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSkippedWords(int v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_SkippedWords == null)
      jcasType.jcas.throwFeatMissing("SkippedWords", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_SkippedWords, v);}    
   
    
  //*--------------*
  //* Feature: PercentRight

  /** getter for PercentRight - gets Percentage of correct words in the document without skipped words
   * @generated
   * @return value of the feature 
   */
  public double getPercentRight() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentRight == null)
      jcasType.jcas.throwFeatMissing("PercentRight", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentRight);}
    
  /** setter for PercentRight - sets Percentage of correct words in the document without skipped words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentRight(double v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentRight == null)
      jcasType.jcas.throwFeatMissing("PercentRight", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentRight, v);}    
   
    
  //*--------------*
  //* Feature: PercentWrong

  /** getter for PercentWrong - gets Percentage of wrong words in the document without skipped words
   * @generated
   * @return value of the feature 
   */
  public double getPercentWrong() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentWrong == null)
      jcasType.jcas.throwFeatMissing("PercentWrong", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentWrong);}
    
  /** setter for PercentWrong - sets Percentage of wrong words in the document without skipped words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentWrong(double v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentWrong == null)
      jcasType.jcas.throwFeatMissing("PercentWrong", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentWrong, v);}    
   
    
  //*--------------*
  //* Feature: PercentUnknown

  /** getter for PercentUnknown - gets Percentage of unknown words in the document without skipped words
   * @generated
   * @return value of the feature 
   */
  public double getPercentUnknown() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentUnknown == null)
      jcasType.jcas.throwFeatMissing("PercentUnknown", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentUnknown);}
    
  /** setter for PercentUnknown - sets Percentage of unknown words in the document without skipped words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentUnknown(double v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentUnknown == null)
      jcasType.jcas.throwFeatMissing("PercentUnknown", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentUnknown, v);}    
   
    
  //*--------------*
  //* Feature: PercentRightWithoutSkipped

  /** getter for PercentRightWithoutSkipped - gets Percentage of correct words in the document
   * @generated
   * @return value of the feature 
   */
  public double getPercentRightWithoutSkipped() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentRightWithoutSkipped == null)
      jcasType.jcas.throwFeatMissing("PercentRightWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentRightWithoutSkipped);}
    
  /** setter for PercentRightWithoutSkipped - sets Percentage of correct words in the document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentRightWithoutSkipped(double v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentRightWithoutSkipped == null)
      jcasType.jcas.throwFeatMissing("PercentRightWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentRightWithoutSkipped, v);}    
   
    
  //*--------------*
  //* Feature: PercentWrongWithoutSkipped

  /** getter for PercentWrongWithoutSkipped - gets Percentage of wrong words in the document
   * @generated
   * @return value of the feature 
   */
  public double getPercentWrongWithoutSkipped() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentWrongWithoutSkipped == null)
      jcasType.jcas.throwFeatMissing("PercentWrongWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentWrongWithoutSkipped);}
    
  /** setter for PercentWrongWithoutSkipped - sets Percentage of wrong words in the document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentWrongWithoutSkipped(double v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentWrongWithoutSkipped == null)
      jcasType.jcas.throwFeatMissing("PercentWrongWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentWrongWithoutSkipped, v);}    
   
    
  //*--------------*
  //* Feature: PercentUnknownWithoutSkipped

  /** getter for PercentUnknownWithoutSkipped - gets Percentage of unknown words in the document
   * @generated
   * @return value of the feature 
   */
  public double getPercentUnknownWithoutSkipped() {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentUnknownWithoutSkipped == null)
      jcasType.jcas.throwFeatMissing("PercentUnknownWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentUnknownWithoutSkipped);}
    
  /** setter for PercentUnknownWithoutSkipped - sets Percentage of unknown words in the document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentUnknownWithoutSkipped(double v) {
    if (AnomalySpellingMeta_Type.featOkTst && ((AnomalySpellingMeta_Type)jcasType).casFeat_PercentUnknownWithoutSkipped == null)
      jcasType.jcas.throwFeatMissing("PercentUnknownWithoutSkipped", "org.texttechnologylab.annotation.AnomalySpellingMeta");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AnomalySpellingMeta_Type)jcasType).casFeatCode_PercentUnknownWithoutSkipped, v);}    
  }

    