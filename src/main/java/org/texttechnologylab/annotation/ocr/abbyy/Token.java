

   
/* Apache UIMA v3 - First created by JCasGen Fri Aug 01 12:46:51 CEST 2025 */

package org.texttechnologylab.annotation.ocr.abbyy;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.StringList;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/** Token type that denotes recognized words.
 * Updated by JCasGen Fri Aug 01 12:46:51 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Token extends de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.ocr.abbyy.Token";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_subTokenList = "subTokenList";
  public final static String _FeatName_isWordFromDictionary = "isWordFromDictionary";
  public final static String _FeatName_isWordNormal = "isWordNormal";
  public final static String _FeatName_isWordNumeric = "isWordNumeric";
  public final static String _FeatName_containsHyphen = "containsHyphen";
  public final static String _FeatName_suspiciousChars = "suspiciousChars";
  public final static String _FeatName_minCharConfidence = "minCharConfidence";
  public final static String _FeatName_meanCharConfidence = "meanCharConfidence";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_subTokenList = TypeSystemImpl.createCallSite(Token.class, "subTokenList");
  private final static MethodHandle _FH_subTokenList = _FC_subTokenList.dynamicInvoker();
  private final static CallSite _FC_isWordFromDictionary = TypeSystemImpl.createCallSite(Token.class, "isWordFromDictionary");
  private final static MethodHandle _FH_isWordFromDictionary = _FC_isWordFromDictionary.dynamicInvoker();
  private final static CallSite _FC_isWordNormal = TypeSystemImpl.createCallSite(Token.class, "isWordNormal");
  private final static MethodHandle _FH_isWordNormal = _FC_isWordNormal.dynamicInvoker();
  private final static CallSite _FC_isWordNumeric = TypeSystemImpl.createCallSite(Token.class, "isWordNumeric");
  private final static MethodHandle _FH_isWordNumeric = _FC_isWordNumeric.dynamicInvoker();
  private final static CallSite _FC_containsHyphen = TypeSystemImpl.createCallSite(Token.class, "containsHyphen");
  private final static MethodHandle _FH_containsHyphen = _FC_containsHyphen.dynamicInvoker();
  private final static CallSite _FC_suspiciousChars = TypeSystemImpl.createCallSite(Token.class, "suspiciousChars");
  private final static MethodHandle _FH_suspiciousChars = _FC_suspiciousChars.dynamicInvoker();
  private final static CallSite _FC_minCharConfidence = TypeSystemImpl.createCallSite(Token.class, "minCharConfidence");
  private final static MethodHandle _FH_minCharConfidence = _FC_minCharConfidence.dynamicInvoker();
  private final static CallSite _FC_meanCharConfidence = TypeSystemImpl.createCallSite(Token.class, "meanCharConfidence");
  private final static MethodHandle _FH_meanCharConfidence = _FC_meanCharConfidence.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Token(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return (StringList)(_getFeatureValueNc(wrapGetIntCatchException(_FH_subTokenList)));
  }
    
  /** setter for subTokenList - sets Present if a linebreak hyphen was recognized, contains the individual words. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubTokenList(StringList v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_subTokenList), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isWordFromDictionary

  /** getter for isWordFromDictionary - gets Specifies whether the word was found in the ABBYY FineReader dictionary.
   * @generated
   * @return value of the feature 
   */
  public boolean getIsWordFromDictionary() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isWordFromDictionary));
  }
    
  /** setter for isWordFromDictionary - sets Specifies whether the word was found in the ABBYY FineReader dictionary. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsWordFromDictionary(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isWordFromDictionary), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isWordNormal

  /** getter for isWordNormal - gets Specifies whether the word was recognized with either a standard or user-defined language,
                        and that it is not a number or an identifier.
   * @generated
   * @return value of the feature 
   */
  public boolean getIsWordNormal() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isWordNormal));
  }
    
  /** setter for isWordNormal - sets Specifies whether the word was recognized with either a standard or user-defined language,
                        and that it is not a number or an identifier. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsWordNormal(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isWordNormal), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isWordNumeric

  /** getter for isWordNumeric - gets Specifies whether the word is a number
   * @generated
   * @return value of the feature 
   */
  public boolean getIsWordNumeric() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isWordNumeric));
  }
    
  /** setter for isWordNumeric - sets Specifies whether the word is a number 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsWordNumeric(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isWordNumeric), v);
  }    
    
   
    
  //*--------------*
  //* Feature: containsHyphen

  /** getter for containsHyphen - gets Specifies if the word contains a recognized linebreak hyphen.
   * @generated
   * @return value of the feature 
   */
  public boolean getContainsHyphen() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_containsHyphen));
  }
    
  /** setter for containsHyphen - sets Specifies if the word contains a recognized linebreak hyphen. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContainsHyphen(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_containsHyphen), v);
  }    
    
   
    
  //*--------------*
  //* Feature: suspiciousChars

  /** getter for suspiciousChars - gets The number of characters that were recognized uncertainly.
   * @generated
   * @return value of the feature 
   */
  public int getSuspiciousChars() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_suspiciousChars));
  }
    
  /** setter for suspiciousChars - sets The number of characters that were recognized uncertainly. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuspiciousChars(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_suspiciousChars), v);
  }    
    
   
    
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
    return _getShortValueNc(wrapGetIntCatchException(_FH_minCharConfidence));
  }
    
  /** setter for minCharConfidence - sets The minimum character recognition confidence of all characters in this word.
                        Use with caution, as these numbers are not guaranteed to be positive and, according to the
                        ABBYY FineReader documentation, the only meaningful use of confidence is to compare different
                        recognition variants of the same character. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMinCharConfidence(short v) {
    _setShortValueNfc(wrapGetIntCatchException(_FH_minCharConfidence), v);
  }    
    
   
    
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
    return _getFloatValueNc(wrapGetIntCatchException(_FH_meanCharConfidence));
  }
    
  /** setter for meanCharConfidence - sets The average character recognition confidence of all characters in this word.
                        Use with caution, as these numbers are not guaranteed to be positive and, according to the
                        ABBYY FineReader documentation, the only meaningful use of confidence is to compare different
                        recognition variants of the same character. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeanCharConfidence(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_meanCharConfidence), v);
  }    
    
  }

    