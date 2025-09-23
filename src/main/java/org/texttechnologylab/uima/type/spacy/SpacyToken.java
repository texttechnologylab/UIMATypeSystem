

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:59 CEST 2025 */

package org.texttechnologylab.uima.type.spacy;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FloatArray;
import org.apache.uima.jcas.cas.StringArray;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;


/** 
 * Updated by JCasGen Tue Sep 23 14:56:59 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SpacyToken extends Token {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.uima.type.spacy.SpacyToken";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_likeUrl = "likeUrl";
  public final static String _FeatName_hasVector = "hasVector";
  public final static String _FeatName_vector = "vector";
  public final static String _FeatName_likeNum = "likeNum";
  public final static String _FeatName_isStop = "isStop";
  public final static String _FeatName_isOov = "isOov";
  public final static String _FeatName_isCurrency = "isCurrency";
  public final static String _FeatName_isQuote = "isQuote";
  public final static String _FeatName_isBracket = "isBracket";
  public final static String _FeatName_isSentStart = "isSentStart";
  public final static String _FeatName_isSentEnd = "isSentEnd";
  public final static String _FeatName_isLeftPunct = "isLeftPunct";
  public final static String _FeatName_isRightPunct = "isRightPunct";
  public final static String _FeatName_isPunct = "isPunct";
  public final static String _FeatName_isTitle = "isTitle";
  public final static String _FeatName_isUpper = "isUpper";
  public final static String _FeatName_isLower = "isLower";
  public final static String _FeatName_isDigit = "isDigit";
  public final static String _FeatName_isAscii = "isAscii";
  public final static String _FeatName_isAlpha = "isAlpha";
  public final static String _FeatName_beneparLabels = "beneparLabels";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_likeUrl = TypeSystemImpl.createCallSite(SpacyToken.class, "likeUrl");
  private final static MethodHandle _FH_likeUrl = _FC_likeUrl.dynamicInvoker();
  private final static CallSite _FC_hasVector = TypeSystemImpl.createCallSite(SpacyToken.class, "hasVector");
  private final static MethodHandle _FH_hasVector = _FC_hasVector.dynamicInvoker();
  private final static CallSite _FC_vector = TypeSystemImpl.createCallSite(SpacyToken.class, "vector");
  private final static MethodHandle _FH_vector = _FC_vector.dynamicInvoker();
  private final static CallSite _FC_likeNum = TypeSystemImpl.createCallSite(SpacyToken.class, "likeNum");
  private final static MethodHandle _FH_likeNum = _FC_likeNum.dynamicInvoker();
  private final static CallSite _FC_isStop = TypeSystemImpl.createCallSite(SpacyToken.class, "isStop");
  private final static MethodHandle _FH_isStop = _FC_isStop.dynamicInvoker();
  private final static CallSite _FC_isOov = TypeSystemImpl.createCallSite(SpacyToken.class, "isOov");
  private final static MethodHandle _FH_isOov = _FC_isOov.dynamicInvoker();
  private final static CallSite _FC_isCurrency = TypeSystemImpl.createCallSite(SpacyToken.class, "isCurrency");
  private final static MethodHandle _FH_isCurrency = _FC_isCurrency.dynamicInvoker();
  private final static CallSite _FC_isQuote = TypeSystemImpl.createCallSite(SpacyToken.class, "isQuote");
  private final static MethodHandle _FH_isQuote = _FC_isQuote.dynamicInvoker();
  private final static CallSite _FC_isBracket = TypeSystemImpl.createCallSite(SpacyToken.class, "isBracket");
  private final static MethodHandle _FH_isBracket = _FC_isBracket.dynamicInvoker();
  private final static CallSite _FC_isSentStart = TypeSystemImpl.createCallSite(SpacyToken.class, "isSentStart");
  private final static MethodHandle _FH_isSentStart = _FC_isSentStart.dynamicInvoker();
  private final static CallSite _FC_isSentEnd = TypeSystemImpl.createCallSite(SpacyToken.class, "isSentEnd");
  private final static MethodHandle _FH_isSentEnd = _FC_isSentEnd.dynamicInvoker();
  private final static CallSite _FC_isLeftPunct = TypeSystemImpl.createCallSite(SpacyToken.class, "isLeftPunct");
  private final static MethodHandle _FH_isLeftPunct = _FC_isLeftPunct.dynamicInvoker();
  private final static CallSite _FC_isRightPunct = TypeSystemImpl.createCallSite(SpacyToken.class, "isRightPunct");
  private final static MethodHandle _FH_isRightPunct = _FC_isRightPunct.dynamicInvoker();
  private final static CallSite _FC_isPunct = TypeSystemImpl.createCallSite(SpacyToken.class, "isPunct");
  private final static MethodHandle _FH_isPunct = _FC_isPunct.dynamicInvoker();
  private final static CallSite _FC_isTitle = TypeSystemImpl.createCallSite(SpacyToken.class, "isTitle");
  private final static MethodHandle _FH_isTitle = _FC_isTitle.dynamicInvoker();
  private final static CallSite _FC_isUpper = TypeSystemImpl.createCallSite(SpacyToken.class, "isUpper");
  private final static MethodHandle _FH_isUpper = _FC_isUpper.dynamicInvoker();
  private final static CallSite _FC_isLower = TypeSystemImpl.createCallSite(SpacyToken.class, "isLower");
  private final static MethodHandle _FH_isLower = _FC_isLower.dynamicInvoker();
  private final static CallSite _FC_isDigit = TypeSystemImpl.createCallSite(SpacyToken.class, "isDigit");
  private final static MethodHandle _FH_isDigit = _FC_isDigit.dynamicInvoker();
  private final static CallSite _FC_isAscii = TypeSystemImpl.createCallSite(SpacyToken.class, "isAscii");
  private final static MethodHandle _FH_isAscii = _FC_isAscii.dynamicInvoker();
  private final static CallSite _FC_isAlpha = TypeSystemImpl.createCallSite(SpacyToken.class, "isAlpha");
  private final static MethodHandle _FH_isAlpha = _FC_isAlpha.dynamicInvoker();
  private final static CallSite _FC_beneparLabels = TypeSystemImpl.createCallSite(SpacyToken.class, "beneparLabels");
  private final static MethodHandle _FH_beneparLabels = _FC_beneparLabels.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected SpacyToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public SpacyToken(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_likeUrl));
  }
    
  /** setter for likeUrl - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLikeUrl(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_likeUrl), v);
  }    
    
   
    
  //*--------------*
  //* Feature: hasVector

  /** getter for hasVector - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getHasVector() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_hasVector));
  }
    
  /** setter for hasVector - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHasVector(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_hasVector), v);
  }    
    
   
    
  //*--------------*
  //* Feature: vector

  /** getter for vector - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getVector() { 
    return (FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_vector)));
  }
    
  /** setter for vector - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVector(FloatArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_vector), v);
  }    
    
    
  /** indexed getter for vector - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getVector(int i) {
     return ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_vector)))).get(i);
  } 

  /** indexed setter for vector - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setVector(int i, float v) {
    ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_vector)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: likeNum

  /** getter for likeNum - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getLikeNum() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_likeNum));
  }
    
  /** setter for likeNum - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLikeNum(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_likeNum), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isStop

  /** getter for isStop - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsStop() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isStop));
  }
    
  /** setter for isStop - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsStop(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isStop), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isOov

  /** getter for isOov - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsOov() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isOov));
  }
    
  /** setter for isOov - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsOov(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isOov), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isCurrency

  /** getter for isCurrency - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsCurrency() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isCurrency));
  }
    
  /** setter for isCurrency - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCurrency(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isCurrency), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isQuote

  /** getter for isQuote - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsQuote() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isQuote));
  }
    
  /** setter for isQuote - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsQuote(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isQuote), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isBracket

  /** getter for isBracket - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsBracket() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isBracket));
  }
    
  /** setter for isBracket - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsBracket(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isBracket), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isSentStart

  /** getter for isSentStart - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsSentStart() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isSentStart));
  }
    
  /** setter for isSentStart - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsSentStart(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isSentStart), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isSentEnd

  /** getter for isSentEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsSentEnd() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isSentEnd));
  }
    
  /** setter for isSentEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsSentEnd(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isSentEnd), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isLeftPunct

  /** getter for isLeftPunct - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsLeftPunct() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isLeftPunct));
  }
    
  /** setter for isLeftPunct - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsLeftPunct(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isLeftPunct), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isRightPunct

  /** getter for isRightPunct - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsRightPunct() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isRightPunct));
  }
    
  /** setter for isRightPunct - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsRightPunct(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isRightPunct), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isPunct

  /** getter for isPunct - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsPunct() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isPunct));
  }
    
  /** setter for isPunct - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsPunct(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isPunct), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isTitle

  /** getter for isTitle - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsTitle() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isTitle));
  }
    
  /** setter for isTitle - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsTitle(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isTitle), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isUpper

  /** getter for isUpper - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsUpper() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isUpper));
  }
    
  /** setter for isUpper - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsUpper(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isUpper), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isLower

  /** getter for isLower - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsLower() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isLower));
  }
    
  /** setter for isLower - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsLower(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isLower), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isDigit

  /** getter for isDigit - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsDigit() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isDigit));
  }
    
  /** setter for isDigit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsDigit(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isDigit), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isAscii

  /** getter for isAscii - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsAscii() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isAscii));
  }
    
  /** setter for isAscii - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsAscii(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isAscii), v);
  }    
    
   
    
  //*--------------*
  //* Feature: isAlpha

  /** getter for isAlpha - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getIsAlpha() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_isAlpha));
  }
    
  /** setter for isAlpha - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsAlpha(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_isAlpha), v);
  }    
    
   
    
  //*--------------*
  //* Feature: beneparLabels

  /** getter for beneparLabels - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getBeneparLabels() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_beneparLabels)));
  }
    
  /** setter for beneparLabels - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeneparLabels(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_beneparLabels), v);
  }    
    
    
  /** indexed getter for beneparLabels - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getBeneparLabels(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_beneparLabels)))).get(i);
  } 

  /** indexed setter for beneparLabels - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setBeneparLabels(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_beneparLabels)))).set(i, v);
  }  
  }

    