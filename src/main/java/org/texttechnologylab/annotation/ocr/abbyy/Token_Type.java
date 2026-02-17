
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.ocr.abbyy;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Token type that denotes recognized words.
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Token_Type extends de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.ocr.abbyy.Token");
 
  /** @generated */
  final Feature casFeat_subTokenList;
  /** @generated */
  final int     casFeatCode_subTokenList;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSubTokenList(int addr) {
        if (featOkTst && casFeat_subTokenList == null)
      jcas.throwFeatMissing("subTokenList", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return ll_cas.ll_getRefValue(addr, casFeatCode_subTokenList);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSubTokenList(int addr, int v) {
        if (featOkTst && casFeat_subTokenList == null)
      jcas.throwFeatMissing("subTokenList", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    ll_cas.ll_setRefValue(addr, casFeatCode_subTokenList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isWordFromDictionary;
  /** @generated */
  final int     casFeatCode_isWordFromDictionary;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsWordFromDictionary(int addr) {
        if (featOkTst && casFeat_isWordFromDictionary == null)
      jcas.throwFeatMissing("isWordFromDictionary", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isWordFromDictionary);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsWordFromDictionary(int addr, boolean v) {
        if (featOkTst && casFeat_isWordFromDictionary == null)
      jcas.throwFeatMissing("isWordFromDictionary", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isWordFromDictionary, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isWordNormal;
  /** @generated */
  final int     casFeatCode_isWordNormal;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsWordNormal(int addr) {
        if (featOkTst && casFeat_isWordNormal == null)
      jcas.throwFeatMissing("isWordNormal", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isWordNormal);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsWordNormal(int addr, boolean v) {
        if (featOkTst && casFeat_isWordNormal == null)
      jcas.throwFeatMissing("isWordNormal", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isWordNormal, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isWordNumeric;
  /** @generated */
  final int     casFeatCode_isWordNumeric;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsWordNumeric(int addr) {
        if (featOkTst && casFeat_isWordNumeric == null)
      jcas.throwFeatMissing("isWordNumeric", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isWordNumeric);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsWordNumeric(int addr, boolean v) {
        if (featOkTst && casFeat_isWordNumeric == null)
      jcas.throwFeatMissing("isWordNumeric", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isWordNumeric, v);}
    
  
 
  /** @generated */
  final Feature casFeat_containsHyphen;
  /** @generated */
  final int     casFeatCode_containsHyphen;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getContainsHyphen(int addr) {
        if (featOkTst && casFeat_containsHyphen == null)
      jcas.throwFeatMissing("containsHyphen", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_containsHyphen);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContainsHyphen(int addr, boolean v) {
        if (featOkTst && casFeat_containsHyphen == null)
      jcas.throwFeatMissing("containsHyphen", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_containsHyphen, v);}
    
  
 
  /** @generated */
  final Feature casFeat_suspiciousChars;
  /** @generated */
  final int     casFeatCode_suspiciousChars;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSuspiciousChars(int addr) {
        if (featOkTst && casFeat_suspiciousChars == null)
      jcas.throwFeatMissing("suspiciousChars", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_suspiciousChars);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSuspiciousChars(int addr, int v) {
        if (featOkTst && casFeat_suspiciousChars == null)
      jcas.throwFeatMissing("suspiciousChars", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_suspiciousChars, v);}
    
  
 
  /** @generated */
  final Feature casFeat_minCharConfidence;
  /** @generated */
  final int     casFeatCode_minCharConfidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public short getMinCharConfidence(int addr) {
        if (featOkTst && casFeat_minCharConfidence == null)
      jcas.throwFeatMissing("minCharConfidence", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return ll_cas.ll_getShortValue(addr, casFeatCode_minCharConfidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMinCharConfidence(int addr, short v) {
        if (featOkTst && casFeat_minCharConfidence == null)
      jcas.throwFeatMissing("minCharConfidence", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    ll_cas.ll_setShortValue(addr, casFeatCode_minCharConfidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_meanCharConfidence;
  /** @generated */
  final int     casFeatCode_meanCharConfidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getMeanCharConfidence(int addr) {
        if (featOkTst && casFeat_meanCharConfidence == null)
      jcas.throwFeatMissing("meanCharConfidence", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_meanCharConfidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMeanCharConfidence(int addr, float v) {
        if (featOkTst && casFeat_meanCharConfidence == null)
      jcas.throwFeatMissing("meanCharConfidence", "org.texttechnologylab.annotation.ocr.abbyy.Token");
    ll_cas.ll_setFloatValue(addr, casFeatCode_meanCharConfidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_subTokenList = jcas.getRequiredFeatureDE(casType, "subTokenList", "uima.cas.StringList", featOkTst);
    casFeatCode_subTokenList  = (null == casFeat_subTokenList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_subTokenList).getCode();

 
    casFeat_isWordFromDictionary = jcas.getRequiredFeatureDE(casType, "isWordFromDictionary", "uima.cas.Boolean", featOkTst);
    casFeatCode_isWordFromDictionary  = (null == casFeat_isWordFromDictionary) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isWordFromDictionary).getCode();

 
    casFeat_isWordNormal = jcas.getRequiredFeatureDE(casType, "isWordNormal", "uima.cas.Boolean", featOkTst);
    casFeatCode_isWordNormal  = (null == casFeat_isWordNormal) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isWordNormal).getCode();

 
    casFeat_isWordNumeric = jcas.getRequiredFeatureDE(casType, "isWordNumeric", "uima.cas.Boolean", featOkTst);
    casFeatCode_isWordNumeric  = (null == casFeat_isWordNumeric) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isWordNumeric).getCode();

 
    casFeat_containsHyphen = jcas.getRequiredFeatureDE(casType, "containsHyphen", "uima.cas.Boolean", featOkTst);
    casFeatCode_containsHyphen  = (null == casFeat_containsHyphen) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_containsHyphen).getCode();

 
    casFeat_suspiciousChars = jcas.getRequiredFeatureDE(casType, "suspiciousChars", "uima.cas.Integer", featOkTst);
    casFeatCode_suspiciousChars  = (null == casFeat_suspiciousChars) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_suspiciousChars).getCode();

 
    casFeat_minCharConfidence = jcas.getRequiredFeatureDE(casType, "minCharConfidence", "uima.cas.Short", featOkTst);
    casFeatCode_minCharConfidence  = (null == casFeat_minCharConfidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_minCharConfidence).getCode();

 
    casFeat_meanCharConfidence = jcas.getRequiredFeatureDE(casType, "meanCharConfidence", "uima.cas.Float", featOkTst);
    casFeatCode_meanCharConfidence  = (null == casFeat_meanCharConfidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_meanCharConfidence).getCode();

  }
}



    