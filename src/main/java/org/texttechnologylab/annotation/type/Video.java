

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Video extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Video.class);
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
  protected Video() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Video(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Video(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Video(JCas jcas, int begin, int end) {
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
  //* Feature: src

  /** getter for src - gets path to the video or base64 value
   * @generated
   * @return value of the feature 
   */
  public String getSrc() {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_src == null)
      jcasType.jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Video");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Video_Type)jcasType).casFeatCode_src);}
    
  /** setter for src - sets path to the video or base64 value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSrc(String v) {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_src == null)
      jcasType.jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Video");
    jcasType.ll_cas.ll_setStringValue(addr, ((Video_Type)jcasType).casFeatCode_src, v);}    
   
    
  //*--------------*
  //* Feature: length

  /** getter for length - gets Length of the video in seconds
   * @generated
   * @return value of the feature 
   */
  public double getLength() {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "org.texttechnologylab.annotation.type.Video");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Video_Type)jcasType).casFeatCode_length);}
    
  /** setter for length - sets Length of the video in seconds 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLength(double v) {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_length == null)
      jcasType.jcas.throwFeatMissing("length", "org.texttechnologylab.annotation.type.Video");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Video_Type)jcasType).casFeatCode_length, v);}    
   
    
  //*--------------*
  //* Feature: fps

  /** getter for fps - gets Video fps
   * @generated
   * @return value of the feature 
   */
  public double getFps() {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_fps == null)
      jcasType.jcas.throwFeatMissing("fps", "org.texttechnologylab.annotation.type.Video");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Video_Type)jcasType).casFeatCode_fps);}
    
  /** setter for fps - sets Video fps 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFps(double v) {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_fps == null)
      jcasType.jcas.throwFeatMissing("fps", "org.texttechnologylab.annotation.type.Video");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Video_Type)jcasType).casFeatCode_fps, v);}    
   
    
  //*--------------*
  //* Feature: mimetype

  /** getter for mimetype - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMimetype() {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_mimetype == null)
      jcasType.jcas.throwFeatMissing("mimetype", "org.texttechnologylab.annotation.type.Video");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Video_Type)jcasType).casFeatCode_mimetype);}
    
  /** setter for mimetype - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMimetype(String v) {
    if (Video_Type.featOkTst && ((Video_Type)jcasType).casFeat_mimetype == null)
      jcasType.jcas.throwFeatMissing("mimetype", "org.texttechnologylab.annotation.type.Video");
    jcasType.ll_cas.ll_setStringValue(addr, ((Video_Type)jcasType).casFeatCode_mimetype, v);}    
  }

    