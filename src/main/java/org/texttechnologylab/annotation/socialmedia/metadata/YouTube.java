

/* First created by JCasGen Thu May 16 11:15:54 CEST 2024 */
package org.texttechnologylab.annotation.socialmedia.metadata;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.texttechnologylab.annotation.socialmedia.MetaData;


/** 
 * Updated by JCasGen Thu May 16 11:15:54 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologySocialMedia.xml
 * @generated */
public class YouTube extends MetaData {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(YouTube.class);
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
  protected YouTube() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public YouTube(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public YouTube(JCas jcas) {
    super(jcas);
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
  //* Feature: channelName

  /** getter for channelName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getChannelName() {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_channelName == null)
      jcasType.jcas.throwFeatMissing("channelName", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return jcasType.ll_cas.ll_getStringValue(addr, ((YouTube_Type)jcasType).casFeatCode_channelName);}
    
  /** setter for channelName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChannelName(String v) {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_channelName == null)
      jcasType.jcas.throwFeatMissing("channelName", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    jcasType.ll_cas.ll_setStringValue(addr, ((YouTube_Type)jcasType).casFeatCode_channelName, v);}    
   
    
  //*--------------*
  //* Feature: channelURL

  /** getter for channelURL - gets 
   * @generated
   * @return value of the feature 
   */
  public String getChannelURL() {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_channelURL == null)
      jcasType.jcas.throwFeatMissing("channelURL", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return jcasType.ll_cas.ll_getStringValue(addr, ((YouTube_Type)jcasType).casFeatCode_channelURL);}
    
  /** setter for channelURL - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChannelURL(String v) {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_channelURL == null)
      jcasType.jcas.throwFeatMissing("channelURL", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    jcasType.ll_cas.ll_setStringValue(addr, ((YouTube_Type)jcasType).casFeatCode_channelURL, v);}    
   
    
  //*--------------*
  //* Feature: playlist

  /** getter for playlist - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getPlaylist() {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_playlist == null)
      jcasType.jcas.throwFeatMissing("playlist", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((YouTube_Type)jcasType).casFeatCode_playlist)));}
    
  /** setter for playlist - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPlaylist(FSList v) {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_playlist == null)
      jcasType.jcas.throwFeatMissing("playlist", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    jcasType.ll_cas.ll_setRefValue(addr, ((YouTube_Type)jcasType).casFeatCode_playlist, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: length

  /** getter for length - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLength() {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return jcasType.ll_cas.ll_getIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_length);}
    
  /** setter for length - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLength(int v) {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    jcasType.ll_cas.ll_setIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_length, v);}    
   
    
  //*--------------*
  //* Feature: views

  /** getter for views - gets 
   * @generated
   * @return value of the feature 
   */
  public int getViews() {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_views == null)
      jcasType.jcas.throwFeatMissing("views", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return jcasType.ll_cas.ll_getIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_views);}
    
  /** setter for views - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setViews(int v) {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_views == null)
      jcasType.jcas.throwFeatMissing("views", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    jcasType.ll_cas.ll_setIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_views, v);}    
   
    
  //*--------------*
  //* Feature: likes

  /** getter for likes - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLikes() {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_likes == null)
      jcasType.jcas.throwFeatMissing("likes", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return jcasType.ll_cas.ll_getIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_likes);}
    
  /** setter for likes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLikes(int v) {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_likes == null)
      jcasType.jcas.throwFeatMissing("likes", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    jcasType.ll_cas.ll_setIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_likes, v);}    
   
    
  //*--------------*
  //* Feature: dislikes

  /** getter for dislikes - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDislikes() {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_dislikes == null)
      jcasType.jcas.throwFeatMissing("dislikes", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return jcasType.ll_cas.ll_getIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_dislikes);}
    
  /** setter for dislikes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDislikes(int v) {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_dislikes == null)
      jcasType.jcas.throwFeatMissing("dislikes", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    jcasType.ll_cas.ll_setIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_dislikes, v);}    
   
    
  //*--------------*
  //* Feature: downloadDate

  /** getter for downloadDate - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDownloadDate() {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_downloadDate == null)
      jcasType.jcas.throwFeatMissing("downloadDate", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return jcasType.ll_cas.ll_getIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_downloadDate);}
    
  /** setter for downloadDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDownloadDate(int v) {
    if (YouTube_Type.featOkTst && ((YouTube_Type)jcasType).casFeat_downloadDate == null)
      jcasType.jcas.throwFeatMissing("downloadDate", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    jcasType.ll_cas.ll_setIntValue(addr, ((YouTube_Type)jcasType).casFeatCode_downloadDate, v);}    
  }

    