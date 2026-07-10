

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;


/** Token type that denotes recognized words.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Token extends de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: subTokenList

  /** getter for subTokenList - gets Present if a linebreak hyphen was recognized, contains the individual words.
   * @generated
   * @return value of the feature 
   */
  public StringList getSubTokenList() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_subTokenList == null)
      jcasType.jcas.throwFeatMissing("subTokenList", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_subTokenList)));}
    
  /** setter for subTokenList - sets Present if a linebreak hyphen was recognized, contains the individual words. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubTokenList(StringList v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_subTokenList == null)
      jcasType.jcas.throwFeatMissing("subTokenList", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_subTokenList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: isWordFromDictionary

  /** getter for isWordFromDictionary - gets Specifies whether the word was found in the ABBYY FineReader dictionary.
   * @generated
   * @return value of the feature 
   */
  public boolean getIsWordFromDictionary() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_isWordFromDictionary == null)
      jcasType.jcas.throwFeatMissing("isWordFromDictionary", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_isWordFromDictionary);}
    
  /** setter for isWordFromDictionary - sets Specifies whether the word was found in the ABBYY FineReader dictionary. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsWordFromDictionary(boolean v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_isWordFromDictionary == null)
      jcasType.jcas.throwFeatMissing("isWordFromDictionary", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_isWordFromDictionary, v);}    
   
    
  //*--------------*
  //* Feature: isWordNormal

  /** getter for isWordNormal - gets Specifies whether the word was recognized with either a standard or user-defined language,
                        and that it is not a number or an identifier.
   * @generated
   * @return value of the feature 
   */
  public boolean getIsWordNormal() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_isWordNormal == null)
      jcasType.jcas.throwFeatMissing("isWordNormal", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_isWordNormal);}
    
  /** setter for isWordNormal - sets Specifies whether the word was recognized with either a standard or user-defined language,
                        and that it is not a number or an identifier. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsWordNormal(boolean v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_isWordNormal == null)
      jcasType.jcas.throwFeatMissing("isWordNormal", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_isWordNormal, v);}    
   
    
  //*--------------*
  //* Feature: isWordNumeric

  /** getter for isWordNumeric - gets Specifies whether the word is a number
   * @generated
   * @return value of the feature 
   */
  public boolean getIsWordNumeric() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_isWordNumeric == null)
      jcasType.jcas.throwFeatMissing("isWordNumeric", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_isWordNumeric);}
    
  /** setter for isWordNumeric - sets Specifies whether the word is a number 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsWordNumeric(boolean v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_isWordNumeric == null)
      jcasType.jcas.throwFeatMissing("isWordNumeric", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_isWordNumeric, v);}    
   
    
  //*--------------*
  //* Feature: containsHyphen

  /** getter for containsHyphen - gets Specifies if the word contains a recognized linebreak hyphen.
   * @generated
   * @return value of the feature 
   */
  public boolean getContainsHyphen() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_containsHyphen == null)
      jcasType.jcas.throwFeatMissing("containsHyphen", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_containsHyphen);}
    
  /** setter for containsHyphen - sets Specifies if the word contains a recognized linebreak hyphen. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContainsHyphen(boolean v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_containsHyphen == null)
      jcasType.jcas.throwFeatMissing("containsHyphen", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Token_Type)jcasType).casFeatCode_containsHyphen, v);}    
   
    
  //*--------------*
  //* Feature: suspiciousChars

  /** getter for suspiciousChars - gets The number of characters that were recognized uncertainly.
   * @generated
   * @return value of the feature 
   */
  public int getSuspiciousChars() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_suspiciousChars == null)
      jcasType.jcas.throwFeatMissing("suspiciousChars", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_suspiciousChars);}
    
  /** setter for suspiciousChars - sets The number of characters that were recognized uncertainly. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuspiciousChars(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_suspiciousChars == null)
      jcasType.jcas.throwFeatMissing("suspiciousChars", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_suspiciousChars, v);}    
   
    
  //*--------------*
  //* Feature: minCharConfidence

  /** getter for minCharConfidence - gets The minimum character recognition confidence of all characters in this word.
                        Use with caution, as these numbers are not guaranteed to be positive and, according to the
                        ABBYY FineReader documentation, the only meaningful use of confidence is to compare different
                        recognition variants of the same character.
   * @generated
   * @return value of the feature 
   */
  public short getMinCharConfidence() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_minCharConfidence == null)
      jcasType.jcas.throwFeatMissing("minCharConfidence", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return jcasType.ll_cas.ll_getShortValue(addr, ((Token_Type)jcasType).casFeatCode_minCharConfidence);}
    
  /** setter for minCharConfidence - sets The minimum character recognition confidence of all characters in this word.
                        Use with caution, as these numbers are not guaranteed to be positive and, according to the
                        ABBYY FineReader documentation, the only meaningful use of confidence is to compare different
                        recognition variants of the same character. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMinCharConfidence(short v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_minCharConfidence == null)
      jcasType.jcas.throwFeatMissing("minCharConfidence", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    jcasType.ll_cas.ll_setShortValue(addr, ((Token_Type)jcasType).casFeatCode_minCharConfidence, v);}    
   
    
  //*--------------*
  //* Feature: meanCharConfidence

  /** getter for meanCharConfidence - gets The average character recognition confidence of all characters in this word.
                        Use with caution, as these numbers are not guaranteed to be positive and, according to the
                        ABBYY FineReader documentation, the only meaningful use of confidence is to compare different
                        recognition variants of the same character.
   * @generated
   * @return value of the feature 
   */
  public float getMeanCharConfidence() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_meanCharConfidence == null)
      jcasType.jcas.throwFeatMissing("meanCharConfidence", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Token_Type)jcasType).casFeatCode_meanCharConfidence);}
    
  /** setter for meanCharConfidence - sets The average character recognition confidence of all characters in this word.
                        Use with caution, as these numbers are not guaranteed to be positive and, according to the
                        ABBYY FineReader documentation, the only meaningful use of confidence is to compare different
                        recognition variants of the same character. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeanCharConfidence(float v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_meanCharConfidence == null)
      jcasType.jcas.throwFeatMissing("meanCharConfidence", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Token_Type)jcasType).casFeatCode_meanCharConfidence, v);}    
  }

    