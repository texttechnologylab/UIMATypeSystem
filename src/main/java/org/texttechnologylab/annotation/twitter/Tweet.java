

   
/* Apache UIMA v3 - First created by JCasGen Tue Feb 25 12:41:26 CET 2025 */

package org.texttechnologylab.annotation.twitter;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/**
 * Updated by JCasGen Tue Feb 25 12:41:26 CET 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Tweet extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.twitter.Tweet";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_userName = "userName";
  public final static String _FeatName_create = "create";
  public final static String _FeatName_language = "language";
  public final static String _FeatName_retweet = "retweet";
  public final static String _FeatName_twitterID = "twitterID";
  public final static String _FeatName_geo = "geo";
  public final static String _FeatName_hashTags = "hashTags";
  public final static String _FeatName_urls = "urls";
  public final static String _FeatName_userId = "userId";
  public final static String _FeatName_repliedTo = "repliedTo";
  public final static String _FeatName_quoted = "quoted";
  public final static String _FeatName_originalText = "originalText";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_userName = TypeSystemImpl.createCallSite(Tweet.class, "userName");
  private final static MethodHandle _FH_userName = _FC_userName.dynamicInvoker();
  private final static CallSite _FC_create = TypeSystemImpl.createCallSite(Tweet.class, "create");
  private final static MethodHandle _FH_create = _FC_create.dynamicInvoker();
  private final static CallSite _FC_language = TypeSystemImpl.createCallSite(Tweet.class, "language");
  private final static MethodHandle _FH_language = _FC_language.dynamicInvoker();
  private final static CallSite _FC_retweet = TypeSystemImpl.createCallSite(Tweet.class, "retweet");
  private final static MethodHandle _FH_retweet = _FC_retweet.dynamicInvoker();
  private final static CallSite _FC_twitterID = TypeSystemImpl.createCallSite(Tweet.class, "twitterID");
  private final static MethodHandle _FH_twitterID = _FC_twitterID.dynamicInvoker();
  private final static CallSite _FC_geo = TypeSystemImpl.createCallSite(Tweet.class, "geo");
  private final static MethodHandle _FH_geo = _FC_geo.dynamicInvoker();
  private final static CallSite _FC_hashTags = TypeSystemImpl.createCallSite(Tweet.class, "hashTags");
  private final static MethodHandle _FH_hashTags = _FC_hashTags.dynamicInvoker();
  private final static CallSite _FC_urls = TypeSystemImpl.createCallSite(Tweet.class, "urls");
  private final static MethodHandle _FH_urls = _FC_urls.dynamicInvoker();
  private final static CallSite _FC_userId = TypeSystemImpl.createCallSite(Tweet.class, "userId");
  private final static MethodHandle _FH_userId = _FC_userId.dynamicInvoker();
  private final static CallSite _FC_repliedTo = TypeSystemImpl.createCallSite(Tweet.class, "repliedTo");
  private final static MethodHandle _FH_repliedTo = _FC_repliedTo.dynamicInvoker();
  private final static CallSite _FC_quoted = TypeSystemImpl.createCallSite(Tweet.class, "quoted");
  private final static MethodHandle _FH_quoted = _FC_quoted.dynamicInvoker();
  private final static CallSite _FC_originalText = TypeSystemImpl.createCallSite(Tweet.class, "originalText");
  private final static MethodHandle _FH_originalText = _FC_originalText.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Tweet() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Tweet(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_userName));
  }
    
  /** setter for userName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUserName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_userName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: create

  /** getter for create - gets 
   * @generated
   * @return value of the feature 
   */
  public long getCreate() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_create));
  }
    
  /** setter for create - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCreate(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_create), v);
  }    
    
   
    
  //*--------------*
  //* Feature: language

  /** getter for language - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLanguage() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_language));
  }
    
  /** setter for language - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_language), v);
  }    
    
   
    
  //*--------------*
  //* Feature: retweet

  /** getter for retweet - gets 
   * @generated
   * @return value of the feature 
   */
  public long getRetweet() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_retweet));
  }
    
  /** setter for retweet - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRetweet(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_retweet), v);
  }    
    
   
    
  //*--------------*
  //* Feature: twitterID

  /** getter for twitterID - gets 
   * @generated
   * @return value of the feature 
   */
  public long getTwitterID() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_twitterID));
  }
    
  /** setter for twitterID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTwitterID(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_twitterID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: geo

  /** getter for geo - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeo() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_geo));
  }
    
  /** setter for geo - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeo(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_geo), v);
  }    
    
   
    
  //*--------------*
  //* Feature: hashTags

  /** getter for hashTags - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getHashTags() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_hashTags)));
  }
    
  /** setter for hashTags - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHashTags(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_hashTags), v);
  }    
    
    
  /** indexed getter for hashTags - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getHashTags(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_hashTags)))).get(i);
  } 

  /** indexed setter for hashTags - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setHashTags(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_hashTags)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: urls

  /** getter for urls - gets 
   * @generated
   * @return value of the feature 
   */
  public StringArray getUrls() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_urls)));
  }
    
  /** setter for urls - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrls(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_urls), v);
  }    
    
    
  /** indexed getter for urls - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getUrls(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_urls)))).get(i);
  } 

  /** indexed setter for urls - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setUrls(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_urls)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: userId

  /** getter for userId - gets 
   * @generated
   * @return value of the feature 
   */
  public long getUserId() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_userId));
  }
    
  /** setter for userId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUserId(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_userId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: repliedTo

  /** getter for repliedTo - gets 
   * @generated
   * @return value of the feature 
   */
  public long getRepliedTo() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_repliedTo));
  }
    
  /** setter for repliedTo - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRepliedTo(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_repliedTo), v);
  }    
    
   
    
  //*--------------*
  //* Feature: quoted

  /** getter for quoted - gets 
   * @generated
   * @return value of the feature 
   */
  public long getQuoted() { 
    return _getLongValueNc(wrapGetIntCatchException(_FH_quoted));
  }
    
  /** setter for quoted - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuoted(long v) {
    _setLongValueNfc(wrapGetIntCatchException(_FH_quoted), v);
  }    
    
   
    
  //*--------------*
  //* Feature: originalText

  /** getter for originalText - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOriginalText() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_originalText));
  }
    
  /** setter for originalText - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOriginalText(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_originalText), v);
  }    
    
  }

    