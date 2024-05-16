
/* First created by JCasGen Thu May 16 11:15:54 CEST 2024 */
package org.texttechnologylab.annotation.socialmedia.metadata;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.socialmedia.MetaData_Type;

/** 
 * Updated by JCasGen Thu May 16 11:15:54 CEST 2024
 * @generated */
public class YouTube_Type extends MetaData_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = YouTube.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
 
  /** @generated */
  final Feature casFeat_channelName;
  /** @generated */
  final int     casFeatCode_channelName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getChannelName(int addr) {
        if (featOkTst && casFeat_channelName == null)
      jcas.throwFeatMissing("channelName", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return ll_cas.ll_getStringValue(addr, casFeatCode_channelName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChannelName(int addr, String v) {
        if (featOkTst && casFeat_channelName == null)
      jcas.throwFeatMissing("channelName", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    ll_cas.ll_setStringValue(addr, casFeatCode_channelName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_channelURL;
  /** @generated */
  final int     casFeatCode_channelURL;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getChannelURL(int addr) {
        if (featOkTst && casFeat_channelURL == null)
      jcas.throwFeatMissing("channelURL", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return ll_cas.ll_getStringValue(addr, casFeatCode_channelURL);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setChannelURL(int addr, String v) {
        if (featOkTst && casFeat_channelURL == null)
      jcas.throwFeatMissing("channelURL", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    ll_cas.ll_setStringValue(addr, casFeatCode_channelURL, v);}
    
  
 
  /** @generated */
  final Feature casFeat_playlist;
  /** @generated */
  final int     casFeatCode_playlist;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPlaylist(int addr) {
        if (featOkTst && casFeat_playlist == null)
      jcas.throwFeatMissing("playlist", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return ll_cas.ll_getRefValue(addr, casFeatCode_playlist);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPlaylist(int addr, int v) {
        if (featOkTst && casFeat_playlist == null)
      jcas.throwFeatMissing("playlist", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    ll_cas.ll_setRefValue(addr, casFeatCode_playlist, v);}
    
  
 
  /** @generated */
  final Feature casFeat_length;
  /** @generated */
  final int     casFeatCode_length;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLength(int addr) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return ll_cas.ll_getIntValue(addr, casFeatCode_length);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLength(int addr, int v) {
        if (featOkTst && casFeat_length == null)
      jcas.throwFeatMissing("length", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    ll_cas.ll_setIntValue(addr, casFeatCode_length, v);}
    
  
 
  /** @generated */
  final Feature casFeat_views;
  /** @generated */
  final int     casFeatCode_views;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getViews(int addr) {
        if (featOkTst && casFeat_views == null)
      jcas.throwFeatMissing("views", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return ll_cas.ll_getIntValue(addr, casFeatCode_views);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setViews(int addr, int v) {
        if (featOkTst && casFeat_views == null)
      jcas.throwFeatMissing("views", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    ll_cas.ll_setIntValue(addr, casFeatCode_views, v);}
    
  
 
  /** @generated */
  final Feature casFeat_likes;
  /** @generated */
  final int     casFeatCode_likes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLikes(int addr) {
        if (featOkTst && casFeat_likes == null)
      jcas.throwFeatMissing("likes", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return ll_cas.ll_getIntValue(addr, casFeatCode_likes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLikes(int addr, int v) {
        if (featOkTst && casFeat_likes == null)
      jcas.throwFeatMissing("likes", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    ll_cas.ll_setIntValue(addr, casFeatCode_likes, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dislikes;
  /** @generated */
  final int     casFeatCode_dislikes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDislikes(int addr) {
        if (featOkTst && casFeat_dislikes == null)
      jcas.throwFeatMissing("dislikes", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return ll_cas.ll_getIntValue(addr, casFeatCode_dislikes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDislikes(int addr, int v) {
        if (featOkTst && casFeat_dislikes == null)
      jcas.throwFeatMissing("dislikes", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    ll_cas.ll_setIntValue(addr, casFeatCode_dislikes, v);}
    
  
 
  /** @generated */
  final Feature casFeat_downloadDate;
  /** @generated */
  final int     casFeatCode_downloadDate;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDownloadDate(int addr) {
        if (featOkTst && casFeat_downloadDate == null)
      jcas.throwFeatMissing("downloadDate", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    return ll_cas.ll_getIntValue(addr, casFeatCode_downloadDate);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDownloadDate(int addr, int v) {
        if (featOkTst && casFeat_downloadDate == null)
      jcas.throwFeatMissing("downloadDate", "org.texttechnologylab.annotation.socialmedia.metadata.YouTube");
    ll_cas.ll_setIntValue(addr, casFeatCode_downloadDate, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public YouTube_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_channelName = jcas.getRequiredFeatureDE(casType, "channelName", "uima.cas.String", featOkTst);
    casFeatCode_channelName  = (null == casFeat_channelName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_channelName).getCode();

 
    casFeat_channelURL = jcas.getRequiredFeatureDE(casType, "channelURL", "uima.cas.String", featOkTst);
    casFeatCode_channelURL  = (null == casFeat_channelURL) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_channelURL).getCode();

 
    casFeat_playlist = jcas.getRequiredFeatureDE(casType, "playlist", "uima.cas.FSList", featOkTst);
    casFeatCode_playlist  = (null == casFeat_playlist) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_playlist).getCode();

 
    casFeat_length = jcas.getRequiredFeatureDE(casType, "length", "uima.cas.Integer", featOkTst);
    casFeatCode_length  = (null == casFeat_length) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_length).getCode();

 
    casFeat_views = jcas.getRequiredFeatureDE(casType, "views", "uima.cas.Integer", featOkTst);
    casFeatCode_views  = (null == casFeat_views) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_views).getCode();

 
    casFeat_likes = jcas.getRequiredFeatureDE(casType, "likes", "uima.cas.Integer", featOkTst);
    casFeatCode_likes  = (null == casFeat_likes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_likes).getCode();

 
    casFeat_dislikes = jcas.getRequiredFeatureDE(casType, "dislikes", "uima.cas.Integer", featOkTst);
    casFeatCode_dislikes  = (null == casFeat_dislikes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dislikes).getCode();

 
    casFeat_downloadDate = jcas.getRequiredFeatureDE(casType, "downloadDate", "uima.cas.Integer", featOkTst);
    casFeatCode_downloadDate  = (null == casFeat_downloadDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_downloadDate).getCode();

  }
}



    