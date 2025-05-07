

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 15:57:08 CEST 2025 */

package org.texttechnologylab.annotation.socialmedia.metadata;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.socialmedia.metadata.youtube.Playlist;
import org.apache.uima.jcas.cas.FSList;
import org.texttechnologylab.annotation.socialmedia.MetaData;


/** 
 * Updated by JCasGen Wed May 07 15:57:08 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class YouTube extends MetaData {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.socialmedia.metadata.YouTube";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_channelName = "channelName";
  public final static String _FeatName_channelURL = "channelURL";
  public final static String _FeatName_playlist = "playlist";
  public final static String _FeatName_length = "length";
  public final static String _FeatName_views = "views";
  public final static String _FeatName_likes = "likes";
  public final static String _FeatName_dislikes = "dislikes";
  public final static String _FeatName_downloadDate = "downloadDate";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_channelName = TypeSystemImpl.createCallSite(YouTube.class, "channelName");
  private final static MethodHandle _FH_channelName = _FC_channelName.dynamicInvoker();
  private final static CallSite _FC_channelURL = TypeSystemImpl.createCallSite(YouTube.class, "channelURL");
  private final static MethodHandle _FH_channelURL = _FC_channelURL.dynamicInvoker();
  private final static CallSite _FC_playlist = TypeSystemImpl.createCallSite(YouTube.class, "playlist");
  private final static MethodHandle _FH_playlist = _FC_playlist.dynamicInvoker();
  private final static CallSite _FC_length = TypeSystemImpl.createCallSite(YouTube.class, "length");
  private final static MethodHandle _FH_length = _FC_length.dynamicInvoker();
  private final static CallSite _FC_views = TypeSystemImpl.createCallSite(YouTube.class, "views");
  private final static MethodHandle _FH_views = _FC_views.dynamicInvoker();
  private final static CallSite _FC_likes = TypeSystemImpl.createCallSite(YouTube.class, "likes");
  private final static MethodHandle _FH_likes = _FC_likes.dynamicInvoker();
  private final static CallSite _FC_dislikes = TypeSystemImpl.createCallSite(YouTube.class, "dislikes");
  private final static MethodHandle _FH_dislikes = _FC_dislikes.dynamicInvoker();
  private final static CallSite _FC_downloadDate = TypeSystemImpl.createCallSite(YouTube.class, "downloadDate");
  private final static MethodHandle _FH_downloadDate = _FC_downloadDate.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected YouTube() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public YouTube(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_channelName));
  }
    
  /** setter for channelName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChannelName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_channelName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: channelURL

  /** getter for channelURL - gets 
   * @generated
   * @return value of the feature 
   */
  public String getChannelURL() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_channelURL));
  }
    
  /** setter for channelURL - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChannelURL(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_channelURL), v);
  }    
    
   
    
  //*--------------*
  //* Feature: playlist

  /** getter for playlist - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<Playlist> getPlaylist() { 
    return (FSList<Playlist>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_playlist)));
  }
    
  /** setter for playlist - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPlaylist(FSList<Playlist> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_playlist), v);
  }    
    
   
    
  //*--------------*
  //* Feature: length

  /** getter for length - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLength() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_length));
  }
    
  /** setter for length - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLength(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_length), v);
  }    
    
   
    
  //*--------------*
  //* Feature: views

  /** getter for views - gets 
   * @generated
   * @return value of the feature 
   */
  public int getViews() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_views));
  }
    
  /** setter for views - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setViews(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_views), v);
  }    
    
   
    
  //*--------------*
  //* Feature: likes

  /** getter for likes - gets 
   * @generated
   * @return value of the feature 
   */
  public int getLikes() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_likes));
  }
    
  /** setter for likes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLikes(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_likes), v);
  }    
    
   
    
  //*--------------*
  //* Feature: dislikes

  /** getter for dislikes - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDislikes() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_dislikes));
  }
    
  /** setter for dislikes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDislikes(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_dislikes), v);
  }    
    
   
    
  //*--------------*
  //* Feature: downloadDate

  /** getter for downloadDate - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDownloadDate() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_downloadDate));
  }
    
  /** setter for downloadDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDownloadDate(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_downloadDate), v);
  }    
    
  }

    