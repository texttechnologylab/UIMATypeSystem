

/* First created by JCasGen Thu Apr 29 09:48:17 CEST 2021 */
package org.texttechnologylab.annotation.twitter;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Apr 29 09:48:17 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyTwitter.xml
 * @generated */
public class Tweet extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Tweet.class);
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
  protected Tweet() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Tweet(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Tweet(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Tweet(JCas jcas, int begin, int end) {
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
  //* Feature: userName

  /** getter for userName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUserName() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_userName == null)
      jcasType.jcas.throwFeatMissing("userName", "org.texttechnologylab.annotation.twitter.Tweet");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Tweet_Type)jcasType).casFeatCode_userName);}
    
  /** setter for userName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUserName(String v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_userName == null)
      jcasType.jcas.throwFeatMissing("userName", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setStringValue(addr, ((Tweet_Type)jcasType).casFeatCode_userName, v);}    
   
    
  //*--------------*
  //* Feature: create

  /** getter for create - gets 
   * @generated
   * @return value of the feature 
   */
  public long getCreate() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_create == null)
      jcasType.jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.twitter.Tweet");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_create);}
    
  /** setter for create - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCreate(long v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_create == null)
      jcasType.jcas.throwFeatMissing("create", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_create, v);}    
   
    
  //*--------------*
  //* Feature: language

  /** getter for language - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLanguage() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "org.texttechnologylab.annotation.twitter.Tweet");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Tweet_Type)jcasType).casFeatCode_language);}
    
  /** setter for language - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(String v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setStringValue(addr, ((Tweet_Type)jcasType).casFeatCode_language, v);}    
   
    
  //*--------------*
  //* Feature: retweet

  /** getter for retweet - gets 
   * @generated
   * @return value of the feature 
   */
  public long getRetweet() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_retweet == null)
      jcasType.jcas.throwFeatMissing("retweet", "org.texttechnologylab.annotation.twitter.Tweet");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_retweet);}
    
  /** setter for retweet - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRetweet(long v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_retweet == null)
      jcasType.jcas.throwFeatMissing("retweet", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_retweet, v);}    
   
    
  //*--------------*
  //* Feature: twitterID

  /** getter for twitterID - gets 
   * @generated
   * @return value of the feature 
   */
  public long getTwitterID() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_twitterID == null)
      jcasType.jcas.throwFeatMissing("twitterID", "org.texttechnologylab.annotation.twitter.Tweet");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_twitterID);}
    
  /** setter for twitterID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTwitterID(long v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_twitterID == null)
      jcasType.jcas.throwFeatMissing("twitterID", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_twitterID, v);}    
   
    
  //*--------------*
  //* Feature: geo

  /** getter for geo - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeo() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_geo == null)
      jcasType.jcas.throwFeatMissing("geo", "org.texttechnologylab.annotation.twitter.Tweet");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Tweet_Type)jcasType).casFeatCode_geo);}
    
  /** setter for geo - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeo(String v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_geo == null)
      jcasType.jcas.throwFeatMissing("geo", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setStringValue(addr, ((Tweet_Type)jcasType).casFeatCode_geo, v);}    
   
    
  //*--------------*
  //* Feature: hashTags

  /** getter for hashTags - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getHashTags() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_hashTags == null)
      jcasType.jcas.throwFeatMissing("hashTags", "org.texttechnologylab.annotation.twitter.Tweet");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_hashTags)));}
    
  /** setter for hashTags - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHashTags(StringArray v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_hashTags == null)
      jcasType.jcas.throwFeatMissing("hashTags", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_hashTags, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for hashTags - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getHashTags(int i) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_hashTags == null)
      jcasType.jcas.throwFeatMissing("hashTags", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_hashTags), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_hashTags), i);}

  /** indexed setter for hashTags - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setHashTags(int i, String v) { 
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_hashTags == null)
      jcasType.jcas.throwFeatMissing("hashTags", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_hashTags), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_hashTags), i, v);}
   
    
  //*--------------*
  //* Feature: urls

  /** getter for urls - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getUrls() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_urls == null)
      jcasType.jcas.throwFeatMissing("urls", "org.texttechnologylab.annotation.twitter.Tweet");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_urls)));}
    
  /** setter for urls - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrls(StringArray v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_urls == null)
      jcasType.jcas.throwFeatMissing("urls", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_urls, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for urls - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getUrls(int i) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_urls == null)
      jcasType.jcas.throwFeatMissing("urls", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_urls), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_urls), i);}

  /** indexed setter for urls - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setUrls(int i, String v) { 
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_urls == null)
      jcasType.jcas.throwFeatMissing("urls", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_urls), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Tweet_Type)jcasType).casFeatCode_urls), i, v);}
   
    
  //*--------------*
  //* Feature: userId

  /** getter for userId - gets 
   * @generated
   * @return value of the feature 
   */
  public long getUserId() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_userId == null)
      jcasType.jcas.throwFeatMissing("userId", "org.texttechnologylab.annotation.twitter.Tweet");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_userId);}
    
  /** setter for userId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUserId(long v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_userId == null)
      jcasType.jcas.throwFeatMissing("userId", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_userId, v);}    
   
    
  //*--------------*
  //* Feature: repliedTo

  /** getter for repliedTo - gets 
   * @generated
   * @return value of the feature 
   */
  public long getRepliedTo() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_repliedTo == null)
      jcasType.jcas.throwFeatMissing("repliedTo", "org.texttechnologylab.annotation.twitter.Tweet");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_repliedTo);}
    
  /** setter for repliedTo - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRepliedTo(long v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_repliedTo == null)
      jcasType.jcas.throwFeatMissing("repliedTo", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_repliedTo, v);}    
   
    
  //*--------------*
  //* Feature: quoted

  /** getter for quoted - gets 
   * @generated
   * @return value of the feature 
   */
  public long getQuoted() {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_quoted == null)
      jcasType.jcas.throwFeatMissing("quoted", "org.texttechnologylab.annotation.twitter.Tweet");
    return jcasType.ll_cas.ll_getLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_quoted);}
    
  /** setter for quoted - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuoted(long v) {
    if (Tweet_Type.featOkTst && ((Tweet_Type)jcasType).casFeat_quoted == null)
      jcasType.jcas.throwFeatMissing("quoted", "org.texttechnologylab.annotation.twitter.Tweet");
    jcasType.ll_cas.ll_setLongValue(addr, ((Tweet_Type)jcasType).casFeatCode_quoted, v);}    
  }

    