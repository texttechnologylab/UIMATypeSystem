
/* First created by JCasGen Thu Sep 10 16:27:49 CEST 2020 */
package org.texttechnologylab.annotation.twitter;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Sep 10 17:28:56 CEST 2020
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
  final Feature casFeat_user;
  /** @generated */
  final int     casFeatCode_user;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUser(int addr) {
        if (featOkTst && casFeat_user == null)
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getStringValue(addr, casFeatCode_user);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUser(int addr, String v) {
        if (featOkTst && casFeat_user == null)
      jcas.throwFeatMissing("user", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setStringValue(addr, casFeatCode_user, v);}
    
  
 
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
  public int getRetweet(int addr) {
        if (featOkTst && casFeat_retweet == null)
      jcas.throwFeatMissing("retweet", "org.texttechnologylab.annotation.twitter.Tweet");
    return ll_cas.ll_getIntValue(addr, casFeatCode_retweet);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRetweet(int addr, int v) {
        if (featOkTst && casFeat_retweet == null)
      jcas.throwFeatMissing("retweet", "org.texttechnologylab.annotation.twitter.Tweet");
    ll_cas.ll_setIntValue(addr, casFeatCode_retweet, v);}
    
  
 
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
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Tweet_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_user = jcas.getRequiredFeatureDE(casType, "user", "uima.cas.String", featOkTst);
    casFeatCode_user  = (null == casFeat_user) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_user).getCode();

 
    casFeat_create = jcas.getRequiredFeatureDE(casType, "create", "uima.cas.Long", featOkTst);
    casFeatCode_create  = (null == casFeat_create) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_create).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_retweet = jcas.getRequiredFeatureDE(casType, "retweet", "uima.cas.Integer", featOkTst);
    casFeatCode_retweet  = (null == casFeat_retweet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_retweet).getCode();

 
    casFeat_twitterID = jcas.getRequiredFeatureDE(casType, "twitterID", "uima.cas.Long", featOkTst);
    casFeatCode_twitterID  = (null == casFeat_twitterID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_twitterID).getCode();

 
    casFeat_geo = jcas.getRequiredFeatureDE(casType, "geo", "uima.cas.String", featOkTst);
    casFeatCode_geo  = (null == casFeat_geo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geo).getCode();

 
    casFeat_hashTags = jcas.getRequiredFeatureDE(casType, "hashTags", "uima.cas.StringList", featOkTst);
    casFeatCode_hashTags  = (null == casFeat_hashTags) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_hashTags).getCode();

 
    casFeat_urls = jcas.getRequiredFeatureDE(casType, "urls", "uima.cas.StringList", featOkTst);
    casFeatCode_urls  = (null == casFeat_urls) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_urls).getCode();

  }
}



    