

/* First created by JCasGen Fri Jul 16 10:53:08 CEST 2021 */
package org.bitbucket.rkilinger.ged;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.hucompute.textimager.uima.type.Sentiment;


/** 
 * Updated by JCasGen Fri Jul 16 10:53:08 CEST 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/GermanEmotionenTypeSystem.xml
 * @generated */
public class Emotion extends Sentiment {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Emotion.class);
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
  protected Emotion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Emotion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Emotion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Emotion(JCas jcas, int begin, int end) {
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
  //* Feature: joy

  /** getter for joy - gets 
   * @generated
   * @return value of the feature 
   */
  public double getJoy() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_joy == null)
      jcasType.jcas.throwFeatMissing("joy", "org.bitbucket.rkilinger.ged.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_joy);}
    
  /** setter for joy - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setJoy(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_joy == null)
      jcasType.jcas.throwFeatMissing("joy", "org.bitbucket.rkilinger.ged.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_joy, v);}    
   
    
  //*--------------*
  //* Feature: anger

  /** getter for anger - gets 
   * @generated
   * @return value of the feature 
   */
  public double getAnger() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_anger == null)
      jcasType.jcas.throwFeatMissing("anger", "org.bitbucket.rkilinger.ged.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_anger);}
    
  /** setter for anger - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnger(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_anger == null)
      jcasType.jcas.throwFeatMissing("anger", "org.bitbucket.rkilinger.ged.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_anger, v);}    
   
    
  //*--------------*
  //* Feature: mourning

  /** getter for mourning - gets 
   * @generated
   * @return value of the feature 
   */
  public double getMourning() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_mourning == null)
      jcasType.jcas.throwFeatMissing("mourning", "org.bitbucket.rkilinger.ged.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_mourning);}
    
  /** setter for mourning - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMourning(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_mourning == null)
      jcasType.jcas.throwFeatMissing("mourning", "org.bitbucket.rkilinger.ged.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_mourning, v);}    
   
    
  //*--------------*
  //* Feature: fear

  /** getter for fear - gets 
   * @generated
   * @return value of the feature 
   */
  public double getFear() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_fear == null)
      jcasType.jcas.throwFeatMissing("fear", "org.bitbucket.rkilinger.ged.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_fear);}
    
  /** setter for fear - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFear(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_fear == null)
      jcasType.jcas.throwFeatMissing("fear", "org.bitbucket.rkilinger.ged.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_fear, v);}    
   
    
  //*--------------*
  //* Feature: surprise

  /** getter for surprise - gets 
   * @generated
   * @return value of the feature 
   */
  public double getSurprise() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_surprise == null)
      jcasType.jcas.throwFeatMissing("surprise", "org.bitbucket.rkilinger.ged.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_surprise);}
    
  /** setter for surprise - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSurprise(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_surprise == null)
      jcasType.jcas.throwFeatMissing("surprise", "org.bitbucket.rkilinger.ged.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_surprise, v);}    
   
    
  //*--------------*
  //* Feature: contempt

  /** getter for contempt - gets 
   * @generated
   * @return value of the feature 
   */
  public double getContempt() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_contempt == null)
      jcasType.jcas.throwFeatMissing("contempt", "org.bitbucket.rkilinger.ged.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_contempt);}
    
  /** setter for contempt - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContempt(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_contempt == null)
      jcasType.jcas.throwFeatMissing("contempt", "org.bitbucket.rkilinger.ged.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_contempt, v);}    
   
    
  //*--------------*
  //* Feature: disgust

  /** getter for disgust - gets 
   * @generated
   * @return value of the feature 
   */
  public double getDisgust() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_disgust == null)
      jcasType.jcas.throwFeatMissing("disgust", "org.bitbucket.rkilinger.ged.Emotion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_disgust);}
    
  /** setter for disgust - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDisgust(double v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_disgust == null)
      jcasType.jcas.throwFeatMissing("disgust", "org.bitbucket.rkilinger.ged.Emotion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Emotion_Type)jcasType).casFeatCode_disgust, v);}    
  }

    