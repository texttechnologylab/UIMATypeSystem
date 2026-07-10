

/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.uima.type.spacy;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FloatArray;
import org.apache.uima.jcas.cas.StringArray;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;


/** 
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SpacyToken extends Token {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SpacyToken.class);
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
  protected SpacyToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SpacyToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SpacyToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SpacyToken(JCas jcas, int begin, int end) {
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
  //* Feature: likeUrl

  /** getter for likeUrl - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getLikeUrl() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_likeUrl == null)
      jcasType.jcas.throwFeatMissing("likeUrl", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_likeUrl);}
    
  /** setter for likeUrl - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLikeUrl(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_likeUrl == null)
      jcasType.jcas.throwFeatMissing("likeUrl", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_likeUrl, v);}    
   
    
  //*--------------*
  //* Feature: hasVector

  /** getter for hasVector - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getHasVector() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_hasVector == null)
      jcasType.jcas.throwFeatMissing("hasVector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_hasVector);}
    
  /** setter for hasVector - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHasVector(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_hasVector == null)
      jcasType.jcas.throwFeatMissing("hasVector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_hasVector, v);}    
   
    
  //*--------------*
  //* Feature: vector

  /** getter for vector - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getVector() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return (FloatArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_vector)));}
    
  /** setter for vector - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVector(FloatArray v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_vector, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for vector - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getVector(int i) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_vector), i);
    return jcasType.ll_cas.ll_getFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_vector), i);}

  /** indexed setter for vector - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setVector(int i, float v) { 
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_vector == null)
      jcasType.jcas.throwFeatMissing("vector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_vector), i);
    jcasType.ll_cas.ll_setFloatArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_vector), i, v);}
   
    
  //*--------------*
  //* Feature: likeNum

  /** getter for likeNum - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getLikeNum() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_likeNum == null)
      jcasType.jcas.throwFeatMissing("likeNum", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_likeNum);}
    
  /** setter for likeNum - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLikeNum(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_likeNum == null)
      jcasType.jcas.throwFeatMissing("likeNum", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_likeNum, v);}    
   
    
  //*--------------*
  //* Feature: isStop

  /** getter for isStop - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsStop() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isStop == null)
      jcasType.jcas.throwFeatMissing("isStop", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isStop);}
    
  /** setter for isStop - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsStop(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isStop == null)
      jcasType.jcas.throwFeatMissing("isStop", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isStop, v);}    
   
    
  //*--------------*
  //* Feature: isOov

  /** getter for isOov - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsOov() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isOov == null)
      jcasType.jcas.throwFeatMissing("isOov", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isOov);}
    
  /** setter for isOov - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsOov(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isOov == null)
      jcasType.jcas.throwFeatMissing("isOov", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isOov, v);}    
   
    
  //*--------------*
  //* Feature: isCurrency

  /** getter for isCurrency - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsCurrency() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isCurrency == null)
      jcasType.jcas.throwFeatMissing("isCurrency", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isCurrency);}
    
  /** setter for isCurrency - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCurrency(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isCurrency == null)
      jcasType.jcas.throwFeatMissing("isCurrency", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isCurrency, v);}    
   
    
  //*--------------*
  //* Feature: isQuote

  /** getter for isQuote - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsQuote() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isQuote == null)
      jcasType.jcas.throwFeatMissing("isQuote", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isQuote);}
    
  /** setter for isQuote - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsQuote(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isQuote == null)
      jcasType.jcas.throwFeatMissing("isQuote", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isQuote, v);}    
   
    
  //*--------------*
  //* Feature: isBracket

  /** getter for isBracket - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsBracket() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isBracket == null)
      jcasType.jcas.throwFeatMissing("isBracket", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isBracket);}
    
  /** setter for isBracket - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsBracket(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isBracket == null)
      jcasType.jcas.throwFeatMissing("isBracket", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isBracket, v);}    
   
    
  //*--------------*
  //* Feature: isSentStart

  /** getter for isSentStart - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsSentStart() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isSentStart == null)
      jcasType.jcas.throwFeatMissing("isSentStart", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isSentStart);}
    
  /** setter for isSentStart - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsSentStart(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isSentStart == null)
      jcasType.jcas.throwFeatMissing("isSentStart", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isSentStart, v);}    
   
    
  //*--------------*
  //* Feature: isSentEnd

  /** getter for isSentEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsSentEnd() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isSentEnd == null)
      jcasType.jcas.throwFeatMissing("isSentEnd", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isSentEnd);}
    
  /** setter for isSentEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsSentEnd(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isSentEnd == null)
      jcasType.jcas.throwFeatMissing("isSentEnd", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isSentEnd, v);}    
   
    
  //*--------------*
  //* Feature: isLeftPunct

  /** getter for isLeftPunct - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsLeftPunct() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isLeftPunct == null)
      jcasType.jcas.throwFeatMissing("isLeftPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isLeftPunct);}
    
  /** setter for isLeftPunct - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsLeftPunct(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isLeftPunct == null)
      jcasType.jcas.throwFeatMissing("isLeftPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isLeftPunct, v);}    
   
    
  //*--------------*
  //* Feature: isRightPunct

  /** getter for isRightPunct - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsRightPunct() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isRightPunct == null)
      jcasType.jcas.throwFeatMissing("isRightPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isRightPunct);}
    
  /** setter for isRightPunct - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsRightPunct(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isRightPunct == null)
      jcasType.jcas.throwFeatMissing("isRightPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isRightPunct, v);}    
   
    
  //*--------------*
  //* Feature: isPunct

  /** getter for isPunct - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsPunct() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isPunct == null)
      jcasType.jcas.throwFeatMissing("isPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isPunct);}
    
  /** setter for isPunct - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsPunct(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isPunct == null)
      jcasType.jcas.throwFeatMissing("isPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isPunct, v);}    
   
    
  //*--------------*
  //* Feature: isTitle

  /** getter for isTitle - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsTitle() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isTitle == null)
      jcasType.jcas.throwFeatMissing("isTitle", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isTitle);}
    
  /** setter for isTitle - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsTitle(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isTitle == null)
      jcasType.jcas.throwFeatMissing("isTitle", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isTitle, v);}    
   
    
  //*--------------*
  //* Feature: isUpper

  /** getter for isUpper - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsUpper() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isUpper == null)
      jcasType.jcas.throwFeatMissing("isUpper", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isUpper);}
    
  /** setter for isUpper - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsUpper(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isUpper == null)
      jcasType.jcas.throwFeatMissing("isUpper", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isUpper, v);}    
   
    
  //*--------------*
  //* Feature: isLower

  /** getter for isLower - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsLower() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isLower == null)
      jcasType.jcas.throwFeatMissing("isLower", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isLower);}
    
  /** setter for isLower - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsLower(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isLower == null)
      jcasType.jcas.throwFeatMissing("isLower", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isLower, v);}    
   
    
  //*--------------*
  //* Feature: isDigit

  /** getter for isDigit - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsDigit() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isDigit == null)
      jcasType.jcas.throwFeatMissing("isDigit", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isDigit);}
    
  /** setter for isDigit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsDigit(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isDigit == null)
      jcasType.jcas.throwFeatMissing("isDigit", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isDigit, v);}    
   
    
  //*--------------*
  //* Feature: isAscii

  /** getter for isAscii - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsAscii() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isAscii == null)
      jcasType.jcas.throwFeatMissing("isAscii", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isAscii);}
    
  /** setter for isAscii - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsAscii(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isAscii == null)
      jcasType.jcas.throwFeatMissing("isAscii", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isAscii, v);}    
   
    
  //*--------------*
  //* Feature: isAlpha

  /** getter for isAlpha - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsAlpha() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isAlpha == null)
      jcasType.jcas.throwFeatMissing("isAlpha", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isAlpha);}
    
  /** setter for isAlpha - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsAlpha(boolean v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_isAlpha == null)
      jcasType.jcas.throwFeatMissing("isAlpha", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_isAlpha, v);}    
   
    
  //*--------------*
  //* Feature: beneparLabels

  /** getter for beneparLabels - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getBeneparLabels() {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_beneparLabels == null)
      jcasType.jcas.throwFeatMissing("beneparLabels", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_beneparLabels)));}
    
  /** setter for beneparLabels - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeneparLabels(StringArray v) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_beneparLabels == null)
      jcasType.jcas.throwFeatMissing("beneparLabels", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.ll_cas.ll_setRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_beneparLabels, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for beneparLabels - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getBeneparLabels(int i) {
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_beneparLabels == null)
      jcasType.jcas.throwFeatMissing("beneparLabels", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_beneparLabels), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_beneparLabels), i);}

  /** indexed setter for beneparLabels - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setBeneparLabels(int i, String v) { 
    if (SpacyToken_Type.featOkTst && ((SpacyToken_Type)jcasType).casFeat_beneparLabels == null)
      jcasType.jcas.throwFeatMissing("beneparLabels", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_beneparLabels), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SpacyToken_Type)jcasType).casFeatCode_beneparLabels), i, v);}
  }

    