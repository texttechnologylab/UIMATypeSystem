

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Attributes of a line with uniform formatting.
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Format extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Format.class);
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
  protected Format() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Format(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Format(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Format(JCas jcas, int begin, int end) {
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
  //* Feature: lang

  /** getter for lang - gets Name of the language.
   * @generated
   * @return value of the feature 
   */
  public String getLang() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_lang == null)
      jcasType.jcas.throwFeatMissing("lang", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Format_Type)jcasType).casFeatCode_lang);}
    
  /** setter for lang - sets Name of the language. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLang(String v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_lang == null)
      jcasType.jcas.throwFeatMissing("lang", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setStringValue(addr, ((Format_Type)jcasType).casFeatCode_lang, v);}    
   
    
  //*--------------*
  //* Feature: ff

  /** getter for ff - gets The name of the font.
   * @generated
   * @return value of the feature 
   */
  public String getFf() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_ff == null)
      jcasType.jcas.throwFeatMissing("ff", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Format_Type)jcasType).casFeatCode_ff);}
    
  /** setter for ff - sets The name of the font. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFf(String v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_ff == null)
      jcasType.jcas.throwFeatMissing("ff", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setStringValue(addr, ((Format_Type)jcasType).casFeatCode_ff, v);}    
   
    
  //*--------------*
  //* Feature: fs

  /** getter for fs - gets The size of the font.
   * @generated
   * @return value of the feature 
   */
  public float getFs() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_fs == null)
      jcasType.jcas.throwFeatMissing("fs", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Format_Type)jcasType).casFeatCode_fs);}
    
  /** setter for fs - sets The size of the font. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFs(float v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_fs == null)
      jcasType.jcas.throwFeatMissing("fs", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Format_Type)jcasType).casFeatCode_fs, v);}    
   
    
  //*--------------*
  //* Feature: bold

  /** getter for bold - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getBold() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_bold == null)
      jcasType.jcas.throwFeatMissing("bold", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_bold);}
    
  /** setter for bold - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBold(boolean v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_bold == null)
      jcasType.jcas.throwFeatMissing("bold", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_bold, v);}    
   
    
  //*--------------*
  //* Feature: italic

  /** getter for italic - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getItalic() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_italic == null)
      jcasType.jcas.throwFeatMissing("italic", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_italic);}
    
  /** setter for italic - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setItalic(boolean v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_italic == null)
      jcasType.jcas.throwFeatMissing("italic", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_italic, v);}    
   
    
  //*--------------*
  //* Feature: subscript

  /** getter for subscript - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getSubscript() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_subscript == null)
      jcasType.jcas.throwFeatMissing("subscript", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_subscript);}
    
  /** setter for subscript - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubscript(boolean v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_subscript == null)
      jcasType.jcas.throwFeatMissing("subscript", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_subscript, v);}    
   
    
  //*--------------*
  //* Feature: superscript

  /** getter for superscript - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getSuperscript() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_superscript == null)
      jcasType.jcas.throwFeatMissing("superscript", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_superscript);}
    
  /** setter for superscript - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuperscript(boolean v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_superscript == null)
      jcasType.jcas.throwFeatMissing("superscript", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_superscript, v);}    
   
    
  //*--------------*
  //* Feature: smallcaps

  /** getter for smallcaps - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getSmallcaps() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_smallcaps == null)
      jcasType.jcas.throwFeatMissing("smallcaps", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_smallcaps);}
    
  /** setter for smallcaps - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSmallcaps(boolean v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_smallcaps == null)
      jcasType.jcas.throwFeatMissing("smallcaps", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_smallcaps, v);}    
   
    
  //*--------------*
  //* Feature: underline

  /** getter for underline - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getUnderline() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_underline == null)
      jcasType.jcas.throwFeatMissing("underline", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_underline);}
    
  /** setter for underline - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnderline(boolean v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_underline == null)
      jcasType.jcas.throwFeatMissing("underline", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_underline, v);}    
   
    
  //*--------------*
  //* Feature: strikeout

  /** getter for strikeout - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getStrikeout() {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_strikeout == null)
      jcasType.jcas.throwFeatMissing("strikeout", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_strikeout);}
    
  /** setter for strikeout - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setStrikeout(boolean v) {
    if (Format_Type.featOkTst && ((Format_Type)jcasType).casFeat_strikeout == null)
      jcasType.jcas.throwFeatMissing("strikeout", "org.texttechnologylab.annotation.ocr.abbyy.Format");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Format_Type)jcasType).casFeatCode_strikeout, v);}    
  }

    