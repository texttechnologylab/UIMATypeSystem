
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.uima.type.spacy;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token_Type;

/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class SpacyToken_Type extends Token_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SpacyToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.uima.type.spacy.SpacyToken");
 
  /** @generated */
  final Feature casFeat_likeUrl;
  /** @generated */
  final int     casFeatCode_likeUrl;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getLikeUrl(int addr) {
        if (featOkTst && casFeat_likeUrl == null)
      jcas.throwFeatMissing("likeUrl", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_likeUrl);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLikeUrl(int addr, boolean v) {
        if (featOkTst && casFeat_likeUrl == null)
      jcas.throwFeatMissing("likeUrl", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_likeUrl, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hasVector;
  /** @generated */
  final int     casFeatCode_hasVector;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getHasVector(int addr) {
        if (featOkTst && casFeat_hasVector == null)
      jcas.throwFeatMissing("hasVector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_hasVector);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHasVector(int addr, boolean v) {
        if (featOkTst && casFeat_hasVector == null)
      jcas.throwFeatMissing("hasVector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_hasVector, v);}
    
  
 
  /** @generated */
  final Feature casFeat_vector;
  /** @generated */
  final int     casFeatCode_vector;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getVector(int addr) {
        if (featOkTst && casFeat_vector == null)
      jcas.throwFeatMissing("vector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getRefValue(addr, casFeatCode_vector);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVector(int addr, int v) {
        if (featOkTst && casFeat_vector == null)
      jcas.throwFeatMissing("vector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setRefValue(addr, casFeatCode_vector, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public float getVector(int addr, int i) {
        if (featOkTst && casFeat_vector == null)
      jcas.throwFeatMissing("vector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vector), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vector), i);
	return ll_cas.ll_getFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vector), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setVector(int addr, int i, float v) {
        if (featOkTst && casFeat_vector == null)
      jcas.throwFeatMissing("vector", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    if (lowLevelTypeChecks)
      ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vector), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vector), i);
    ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vector), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_likeNum;
  /** @generated */
  final int     casFeatCode_likeNum;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getLikeNum(int addr) {
        if (featOkTst && casFeat_likeNum == null)
      jcas.throwFeatMissing("likeNum", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_likeNum);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLikeNum(int addr, boolean v) {
        if (featOkTst && casFeat_likeNum == null)
      jcas.throwFeatMissing("likeNum", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_likeNum, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isStop;
  /** @generated */
  final int     casFeatCode_isStop;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsStop(int addr) {
        if (featOkTst && casFeat_isStop == null)
      jcas.throwFeatMissing("isStop", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isStop);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsStop(int addr, boolean v) {
        if (featOkTst && casFeat_isStop == null)
      jcas.throwFeatMissing("isStop", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isStop, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isOov;
  /** @generated */
  final int     casFeatCode_isOov;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsOov(int addr) {
        if (featOkTst && casFeat_isOov == null)
      jcas.throwFeatMissing("isOov", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isOov);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsOov(int addr, boolean v) {
        if (featOkTst && casFeat_isOov == null)
      jcas.throwFeatMissing("isOov", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isOov, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isCurrency;
  /** @generated */
  final int     casFeatCode_isCurrency;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsCurrency(int addr) {
        if (featOkTst && casFeat_isCurrency == null)
      jcas.throwFeatMissing("isCurrency", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isCurrency);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsCurrency(int addr, boolean v) {
        if (featOkTst && casFeat_isCurrency == null)
      jcas.throwFeatMissing("isCurrency", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isCurrency, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isQuote;
  /** @generated */
  final int     casFeatCode_isQuote;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsQuote(int addr) {
        if (featOkTst && casFeat_isQuote == null)
      jcas.throwFeatMissing("isQuote", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isQuote);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsQuote(int addr, boolean v) {
        if (featOkTst && casFeat_isQuote == null)
      jcas.throwFeatMissing("isQuote", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isQuote, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isBracket;
  /** @generated */
  final int     casFeatCode_isBracket;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsBracket(int addr) {
        if (featOkTst && casFeat_isBracket == null)
      jcas.throwFeatMissing("isBracket", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isBracket);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsBracket(int addr, boolean v) {
        if (featOkTst && casFeat_isBracket == null)
      jcas.throwFeatMissing("isBracket", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isBracket, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isSentStart;
  /** @generated */
  final int     casFeatCode_isSentStart;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsSentStart(int addr) {
        if (featOkTst && casFeat_isSentStart == null)
      jcas.throwFeatMissing("isSentStart", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isSentStart);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsSentStart(int addr, boolean v) {
        if (featOkTst && casFeat_isSentStart == null)
      jcas.throwFeatMissing("isSentStart", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isSentStart, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isSentEnd;
  /** @generated */
  final int     casFeatCode_isSentEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsSentEnd(int addr) {
        if (featOkTst && casFeat_isSentEnd == null)
      jcas.throwFeatMissing("isSentEnd", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isSentEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsSentEnd(int addr, boolean v) {
        if (featOkTst && casFeat_isSentEnd == null)
      jcas.throwFeatMissing("isSentEnd", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isSentEnd, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isLeftPunct;
  /** @generated */
  final int     casFeatCode_isLeftPunct;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsLeftPunct(int addr) {
        if (featOkTst && casFeat_isLeftPunct == null)
      jcas.throwFeatMissing("isLeftPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isLeftPunct);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsLeftPunct(int addr, boolean v) {
        if (featOkTst && casFeat_isLeftPunct == null)
      jcas.throwFeatMissing("isLeftPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isLeftPunct, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isRightPunct;
  /** @generated */
  final int     casFeatCode_isRightPunct;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsRightPunct(int addr) {
        if (featOkTst && casFeat_isRightPunct == null)
      jcas.throwFeatMissing("isRightPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isRightPunct);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsRightPunct(int addr, boolean v) {
        if (featOkTst && casFeat_isRightPunct == null)
      jcas.throwFeatMissing("isRightPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isRightPunct, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isPunct;
  /** @generated */
  final int     casFeatCode_isPunct;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsPunct(int addr) {
        if (featOkTst && casFeat_isPunct == null)
      jcas.throwFeatMissing("isPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isPunct);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsPunct(int addr, boolean v) {
        if (featOkTst && casFeat_isPunct == null)
      jcas.throwFeatMissing("isPunct", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isPunct, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isTitle;
  /** @generated */
  final int     casFeatCode_isTitle;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsTitle(int addr) {
        if (featOkTst && casFeat_isTitle == null)
      jcas.throwFeatMissing("isTitle", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isTitle);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsTitle(int addr, boolean v) {
        if (featOkTst && casFeat_isTitle == null)
      jcas.throwFeatMissing("isTitle", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isTitle, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isUpper;
  /** @generated */
  final int     casFeatCode_isUpper;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsUpper(int addr) {
        if (featOkTst && casFeat_isUpper == null)
      jcas.throwFeatMissing("isUpper", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isUpper);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsUpper(int addr, boolean v) {
        if (featOkTst && casFeat_isUpper == null)
      jcas.throwFeatMissing("isUpper", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isUpper, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isLower;
  /** @generated */
  final int     casFeatCode_isLower;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsLower(int addr) {
        if (featOkTst && casFeat_isLower == null)
      jcas.throwFeatMissing("isLower", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isLower);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsLower(int addr, boolean v) {
        if (featOkTst && casFeat_isLower == null)
      jcas.throwFeatMissing("isLower", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isLower, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isDigit;
  /** @generated */
  final int     casFeatCode_isDigit;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsDigit(int addr) {
        if (featOkTst && casFeat_isDigit == null)
      jcas.throwFeatMissing("isDigit", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isDigit);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsDigit(int addr, boolean v) {
        if (featOkTst && casFeat_isDigit == null)
      jcas.throwFeatMissing("isDigit", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isDigit, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isAscii;
  /** @generated */
  final int     casFeatCode_isAscii;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsAscii(int addr) {
        if (featOkTst && casFeat_isAscii == null)
      jcas.throwFeatMissing("isAscii", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isAscii);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsAscii(int addr, boolean v) {
        if (featOkTst && casFeat_isAscii == null)
      jcas.throwFeatMissing("isAscii", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isAscii, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isAlpha;
  /** @generated */
  final int     casFeatCode_isAlpha;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsAlpha(int addr) {
        if (featOkTst && casFeat_isAlpha == null)
      jcas.throwFeatMissing("isAlpha", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isAlpha);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsAlpha(int addr, boolean v) {
        if (featOkTst && casFeat_isAlpha == null)
      jcas.throwFeatMissing("isAlpha", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isAlpha, v);}
    
  
 
  /** @generated */
  final Feature casFeat_beneparLabels;
  /** @generated */
  final int     casFeatCode_beneparLabels;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBeneparLabels(int addr) {
        if (featOkTst && casFeat_beneparLabels == null)
      jcas.throwFeatMissing("beneparLabels", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    return ll_cas.ll_getRefValue(addr, casFeatCode_beneparLabels);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBeneparLabels(int addr, int v) {
        if (featOkTst && casFeat_beneparLabels == null)
      jcas.throwFeatMissing("beneparLabels", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    ll_cas.ll_setRefValue(addr, casFeatCode_beneparLabels, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getBeneparLabels(int addr, int i) {
        if (featOkTst && casFeat_beneparLabels == null)
      jcas.throwFeatMissing("beneparLabels", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_beneparLabels), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_beneparLabels), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_beneparLabels), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setBeneparLabels(int addr, int i, String v) {
        if (featOkTst && casFeat_beneparLabels == null)
      jcas.throwFeatMissing("beneparLabels", "org.texttechnologylab.uima.type.spacy.SpacyToken");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_beneparLabels), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_beneparLabels), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_beneparLabels), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SpacyToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_likeUrl = jcas.getRequiredFeatureDE(casType, "likeUrl", "uima.cas.Boolean", featOkTst);
    casFeatCode_likeUrl  = (null == casFeat_likeUrl) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_likeUrl).getCode();

 
    casFeat_hasVector = jcas.getRequiredFeatureDE(casType, "hasVector", "uima.cas.Boolean", featOkTst);
    casFeatCode_hasVector  = (null == casFeat_hasVector) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hasVector).getCode();

 
    casFeat_vector = jcas.getRequiredFeatureDE(casType, "vector", "uima.cas.FloatArray", featOkTst);
    casFeatCode_vector  = (null == casFeat_vector) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vector).getCode();

 
    casFeat_likeNum = jcas.getRequiredFeatureDE(casType, "likeNum", "uima.cas.Boolean", featOkTst);
    casFeatCode_likeNum  = (null == casFeat_likeNum) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_likeNum).getCode();

 
    casFeat_isStop = jcas.getRequiredFeatureDE(casType, "isStop", "uima.cas.Boolean", featOkTst);
    casFeatCode_isStop  = (null == casFeat_isStop) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isStop).getCode();

 
    casFeat_isOov = jcas.getRequiredFeatureDE(casType, "isOov", "uima.cas.Boolean", featOkTst);
    casFeatCode_isOov  = (null == casFeat_isOov) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isOov).getCode();

 
    casFeat_isCurrency = jcas.getRequiredFeatureDE(casType, "isCurrency", "uima.cas.Boolean", featOkTst);
    casFeatCode_isCurrency  = (null == casFeat_isCurrency) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isCurrency).getCode();

 
    casFeat_isQuote = jcas.getRequiredFeatureDE(casType, "isQuote", "uima.cas.Boolean", featOkTst);
    casFeatCode_isQuote  = (null == casFeat_isQuote) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isQuote).getCode();

 
    casFeat_isBracket = jcas.getRequiredFeatureDE(casType, "isBracket", "uima.cas.Boolean", featOkTst);
    casFeatCode_isBracket  = (null == casFeat_isBracket) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isBracket).getCode();

 
    casFeat_isSentStart = jcas.getRequiredFeatureDE(casType, "isSentStart", "uima.cas.Boolean", featOkTst);
    casFeatCode_isSentStart  = (null == casFeat_isSentStart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isSentStart).getCode();

 
    casFeat_isSentEnd = jcas.getRequiredFeatureDE(casType, "isSentEnd", "uima.cas.Boolean", featOkTst);
    casFeatCode_isSentEnd  = (null == casFeat_isSentEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isSentEnd).getCode();

 
    casFeat_isLeftPunct = jcas.getRequiredFeatureDE(casType, "isLeftPunct", "uima.cas.Boolean", featOkTst);
    casFeatCode_isLeftPunct  = (null == casFeat_isLeftPunct) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isLeftPunct).getCode();

 
    casFeat_isRightPunct = jcas.getRequiredFeatureDE(casType, "isRightPunct", "uima.cas.Boolean", featOkTst);
    casFeatCode_isRightPunct  = (null == casFeat_isRightPunct) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isRightPunct).getCode();

 
    casFeat_isPunct = jcas.getRequiredFeatureDE(casType, "isPunct", "uima.cas.Boolean", featOkTst);
    casFeatCode_isPunct  = (null == casFeat_isPunct) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isPunct).getCode();

 
    casFeat_isTitle = jcas.getRequiredFeatureDE(casType, "isTitle", "uima.cas.Boolean", featOkTst);
    casFeatCode_isTitle  = (null == casFeat_isTitle) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isTitle).getCode();

 
    casFeat_isUpper = jcas.getRequiredFeatureDE(casType, "isUpper", "uima.cas.Boolean", featOkTst);
    casFeatCode_isUpper  = (null == casFeat_isUpper) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isUpper).getCode();

 
    casFeat_isLower = jcas.getRequiredFeatureDE(casType, "isLower", "uima.cas.Boolean", featOkTst);
    casFeatCode_isLower  = (null == casFeat_isLower) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isLower).getCode();

 
    casFeat_isDigit = jcas.getRequiredFeatureDE(casType, "isDigit", "uima.cas.Boolean", featOkTst);
    casFeatCode_isDigit  = (null == casFeat_isDigit) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isDigit).getCode();

 
    casFeat_isAscii = jcas.getRequiredFeatureDE(casType, "isAscii", "uima.cas.Boolean", featOkTst);
    casFeatCode_isAscii  = (null == casFeat_isAscii) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isAscii).getCode();

 
    casFeat_isAlpha = jcas.getRequiredFeatureDE(casType, "isAlpha", "uima.cas.Boolean", featOkTst);
    casFeatCode_isAlpha  = (null == casFeat_isAlpha) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isAlpha).getCode();

 
    casFeat_beneparLabels = jcas.getRequiredFeatureDE(casType, "beneparLabels", "uima.cas.StringArray", featOkTst);
    casFeatCode_beneparLabels  = (null == casFeat_beneparLabels) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_beneparLabels).getCode();

  }
}



    