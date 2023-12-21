

/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.uima.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Dec 21 13:46:41 CET 2023
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/src/main/resources/desc/type/TypeSystemModelAnnotation.xml
 * @generated */
public class StarSentiment extends Sentiment {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(StarSentiment.class);
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
  protected StarSentiment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public StarSentiment(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public StarSentiment(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public StarSentiment(JCas jcas, int begin, int end) {
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
  //* Feature: OneStar

  /** getter for OneStar - gets 
   * @generated
   * @return value of the feature 
   */
  public double getOneStar() {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_OneStar == null)
      jcasType.jcas.throwFeatMissing("OneStar", "org.texttechnologylab.uima.type.StarSentiment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_OneStar);}
    
  /** setter for OneStar - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOneStar(double v) {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_OneStar == null)
      jcasType.jcas.throwFeatMissing("OneStar", "org.texttechnologylab.uima.type.StarSentiment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_OneStar, v);}    
   
    
  //*--------------*
  //* Feature: TwoStars

  /** getter for TwoStars - gets 
   * @generated
   * @return value of the feature 
   */
  public double getTwoStars() {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_TwoStars == null)
      jcasType.jcas.throwFeatMissing("TwoStars", "org.texttechnologylab.uima.type.StarSentiment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_TwoStars);}
    
  /** setter for TwoStars - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTwoStars(double v) {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_TwoStars == null)
      jcasType.jcas.throwFeatMissing("TwoStars", "org.texttechnologylab.uima.type.StarSentiment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_TwoStars, v);}    
   
    
  //*--------------*
  //* Feature: ThreeStars

  /** getter for ThreeStars - gets 
   * @generated
   * @return value of the feature 
   */
  public double getThreeStars() {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_ThreeStars == null)
      jcasType.jcas.throwFeatMissing("ThreeStars", "org.texttechnologylab.uima.type.StarSentiment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_ThreeStars);}
    
  /** setter for ThreeStars - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setThreeStars(double v) {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_ThreeStars == null)
      jcasType.jcas.throwFeatMissing("ThreeStars", "org.texttechnologylab.uima.type.StarSentiment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_ThreeStars, v);}    
   
    
  //*--------------*
  //* Feature: FourStars

  /** getter for FourStars - gets 
   * @generated
   * @return value of the feature 
   */
  public double getFourStars() {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_FourStars == null)
      jcasType.jcas.throwFeatMissing("FourStars", "org.texttechnologylab.uima.type.StarSentiment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_FourStars);}
    
  /** setter for FourStars - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFourStars(double v) {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_FourStars == null)
      jcasType.jcas.throwFeatMissing("FourStars", "org.texttechnologylab.uima.type.StarSentiment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_FourStars, v);}    
   
    
  //*--------------*
  //* Feature: FiveStars

  /** getter for FiveStars - gets 
   * @generated
   * @return value of the feature 
   */
  public double getFiveStars() {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_FiveStars == null)
      jcasType.jcas.throwFeatMissing("FiveStars", "org.texttechnologylab.uima.type.StarSentiment");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_FiveStars);}
    
  /** setter for FiveStars - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFiveStars(double v) {
    if (StarSentiment_Type.featOkTst && ((StarSentiment_Type)jcasType).casFeat_FiveStars == null)
      jcasType.jcas.throwFeatMissing("FiveStars", "org.texttechnologylab.uima.type.StarSentiment");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((StarSentiment_Type)jcasType).casFeatCode_FiveStars, v);}    
  }

    