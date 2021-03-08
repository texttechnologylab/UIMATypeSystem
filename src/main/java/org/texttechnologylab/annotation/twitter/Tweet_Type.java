
/* First created by JCasGen Mon Mar 08 18:30:18 CET 2021 */
package org.texttechnologylab.annotation.twitter;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Mar 08 18:30:18 CET 2021
 * @generated */
public class Tweet_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Tweet.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.twitter.Tweet");
 
  /** @generated */
  final Feature casFeat_userName;
  /** @generated */
  final int     casFeatCode_userName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUserName(int addr) {
        if (featOkTst && casFeat_userName == null)
      jcas.throwFeatMissing("userName", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getStringValue(addr, casFeatCode_userName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUserName(int addr, String v) {
        if (featOkTst && casFeat_userName == null)
      jcas.throwFeatMissing("userName", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setStringValue(addr, casFeatCode_userName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_create;
  /** @generated */
  final int     casFeatCode_create;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getCreate(int addr) {
        if (featOkTst && casFeat_create == null)
      jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getLongValue(addr, casFeatCode_create);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCreate(int addr, long v) {
        if (featOkTst && casFeat_create == null)
      jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setLongValue(addr, casFeatCode_create, v);}
    
  
 
  /** @generated */
  final Feature casFeat_language;
  /** @generated */
  final int     casFeatCode_language;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */
  final Feature casFeat_retweet;
  /** @generated */
  final int     casFeatCode_retweet;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getRetweet(int addr) {
        if (featOkTst && casFeat_retweet == null)
      jcas.throwFeatMissing("retweet", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getLongValue(addr, casFeatCode_retweet);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRetweet(int addr, long v) {
        if (featOkTst && casFeat_retweet == null)
      jcas.throwFeatMissing("retweet", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setLongValue(addr, casFeatCode_retweet, v);}
    
  
 
  /** @generated */
  final Feature casFeat_twitterID;
  /** @generated */
  final int     casFeatCode_twitterID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getTwitterID(int addr) {
        if (featOkTst && casFeat_twitterID == null)
      jcas.throwFeatMissing("twitterID", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getLongValue(addr, casFeatCode_twitterID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTwitterID(int addr, long v) {
        if (featOkTst && casFeat_twitterID == null)
      jcas.throwFeatMissing("twitterID", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setLongValue(addr, casFeatCode_twitterID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_geo;
  /** @generated */
  final int     casFeatCode_geo;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeo(int addr) {
        if (featOkTst && casFeat_geo == null)
      jcas.throwFeatMissing("geo", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geo);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeo(int addr, String v) {
        if (featOkTst && casFeat_geo == null)
      jcas.throwFeatMissing("geo", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setStringValue(addr, casFeatCode_geo, v);}
    
  
 
  /** @generated */
  final Feature casFeat_hashTags;
  /** @generated */
  final int     casFeatCode_hashTags;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getHashTags(int addr) {
        if (featOkTst && casFeat_hashTags == null)
      jcas.throwFeatMissing("hashTags", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_hashTags);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHashTags(int addr, int v) {
        if (featOkTst && casFeat_hashTags == null)
      jcas.throwFeatMissing("hashTags", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setRefValue(addr, casFeatCode_hashTags, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getHashTags(int addr, int i) {
        if (featOkTst && casFeat_hashTags == null)
      jcas.throwFeatMissing("hashTags", "org.texttechnologylab.annotation.twitter.Tweet");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_hashTags), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_hashTags), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_hashTags), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setHashTags(int addr, int i, String v) {
        if (featOkTst && casFeat_hashTags == null)
      jcas.throwFeatMissing("hashTags", "org.texttechnologylab.annotation.twitter.Tweet");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_hashTags), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_hashTags), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_hashTags), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_urls;
  /** @generated */
  final int     casFeatCode_urls;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getUrls(int addr) {
        if (featOkTst && casFeat_urls == null)
      jcas.throwFeatMissing("urls", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getRefValue(addr, casFeatCode_urls);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUrls(int addr, int v) {
        if (featOkTst && casFeat_urls == null)
      jcas.throwFeatMissing("urls", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setRefValue(addr, casFeatCode_urls, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getUrls(int addr, int i) {
        if (featOkTst && casFeat_urls == null)
      jcas.throwFeatMissing("urls", "org.texttechnologylab.annotation.twitter.Tweet");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_urls), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_urls), i);
	return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_urls), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setUrls(int addr, int i, String v) {
        if (featOkTst && casFeat_urls == null)
      jcas.throwFeatMissing("urls", "org.texttechnologylab.annotation.twitter.Tweet");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_urls), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_urls), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_urls), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_userId;
  /** @generated */
  final int     casFeatCode_userId;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public long getUserId(int addr) {
        if (featOkTst && casFeat_userId == null)
      jcas.throwFeatMissing("userId", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getLongValue(addr, casFeatCode_userId);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUserId(int addr, long v) {
        if (featOkTst && casFeat_userId == null)
      jcas.throwFeatMissing("userId", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setLongValue(addr, casFeatCode_userId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Tweet_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_userName = jcas.getRequiredFeatureDE(casType, "userName", "uima.cas.String", featOkTst);
    casFeatCode_userName  = (null == casFeat_userName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_userName).getCode();

 
    casFeat_create = jcas.getRequiredFeatureDE(casType, "create", "uima.cas.Long", featOkTst);
    casFeatCode_create  = (null == casFeat_create) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_create).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_retweet = jcas.getRequiredFeatureDE(casType, "retweet", "uima.cas.Long", featOkTst);
    casFeatCode_retweet  = (null == casFeat_retweet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_retweet).getCode();

 
    casFeat_twitterID = jcas.getRequiredFeatureDE(casType, "twitterID", "uima.cas.Long", featOkTst);
    casFeatCode_twitterID  = (null == casFeat_twitterID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_twitterID).getCode();

 
    casFeat_geo = jcas.getRequiredFeatureDE(casType, "geo", "uima.cas.String", featOkTst);
    casFeatCode_geo  = (null == casFeat_geo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geo).getCode();

 
    casFeat_hashTags = jcas.getRequiredFeatureDE(casType, "hashTags", "uima.cas.StringArray", featOkTst);
    casFeatCode_hashTags  = (null == casFeat_hashTags) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hashTags).getCode();

 
    casFeat_urls = jcas.getRequiredFeatureDE(casType, "urls", "uima.cas.StringArray", featOkTst);
    casFeatCode_urls  = (null == casFeat_urls) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_urls).getCode();

 
    casFeat_userId = jcas.getRequiredFeatureDE(casType, "userId", "uima.cas.Long", featOkTst);
    casFeatCode_userId  = (null == casFeat_userId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_userId).getCode();

  }
}



    