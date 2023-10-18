

/* First created by JCasGen Tue Jun 13 14:28:41 CEST 2023 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Jun 13 14:28:42 CEST 2023
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologySentimentBert.xml
 * @generated */
public class SentimentBert extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentimentBert.class);
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
  protected SentimentBert() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SentimentBert(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentimentBert(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SentimentBert(JCas jcas, int begin, int end) {
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
  //* Feature: sentiment

  /** getter for sentiment - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSentiment() {
    if (SentimentBert_Type.featOkTst && ((SentimentBert_Type)jcasType).casFeat_sentiment == null)
      jcasType.jcas.throwFeatMissing("sentiment", "org.texttechnologylab.annotation.SentimentBert");
    return jcasType.ll_cas.ll_getIntValue(addr, ((SentimentBert_Type)jcasType).casFeatCode_sentiment);}
    
  /** setter for sentiment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentiment(int v) {
    if (SentimentBert_Type.featOkTst && ((SentimentBert_Type)jcasType).casFeat_sentiment == null)
      jcasType.jcas.throwFeatMissing("sentiment", "org.texttechnologylab.annotation.SentimentBert");
    jcasType.ll_cas.ll_setIntValue(addr, ((SentimentBert_Type)jcasType).casFeatCode_sentiment, v);}    
   
    
  //*--------------*
  //* Feature: probabilityPositive

  /** getter for probabilityPositive - gets 
   * @generated
   * @return value of the feature 
   */
  public double getProbabilityPositive() {
    if (SentimentBert_Type.featOkTst && ((SentimentBert_Type)jcasType).casFeat_probabilityPositive == null)
      jcasType.jcas.throwFeatMissing("probabilityPositive", "org.texttechnologylab.annotation.SentimentBert");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((SentimentBert_Type)jcasType).casFeatCode_probabilityPositive);}
    
  /** setter for probabilityPositive - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbabilityPositive(double v) {
    if (SentimentBert_Type.featOkTst && ((SentimentBert_Type)jcasType).casFeat_probabilityPositive == null)
      jcasType.jcas.throwFeatMissing("probabilityPositive", "org.texttechnologylab.annotation.SentimentBert");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((SentimentBert_Type)jcasType).casFeatCode_probabilityPositive, v);}    
   
    
  //*--------------*
  //* Feature: probabilityNeutral

  /** getter for probabilityNeutral - gets 
   * @generated
   * @return value of the feature 
   */
  public double getProbabilityNeutral() {
    if (SentimentBert_Type.featOkTst && ((SentimentBert_Type)jcasType).casFeat_probabilityNeutral == null)
      jcasType.jcas.throwFeatMissing("probabilityNeutral", "org.texttechnologylab.annotation.SentimentBert");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((SentimentBert_Type)jcasType).casFeatCode_probabilityNeutral);}
    
  /** setter for probabilityNeutral - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbabilityNeutral(double v) {
    if (SentimentBert_Type.featOkTst && ((SentimentBert_Type)jcasType).casFeat_probabilityNeutral == null)
      jcasType.jcas.throwFeatMissing("probabilityNeutral", "org.texttechnologylab.annotation.SentimentBert");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((SentimentBert_Type)jcasType).casFeatCode_probabilityNeutral, v);}    
   
    
  //*--------------*
  //* Feature: probabilityNegative

  /** getter for probabilityNegative - gets 
   * @generated
   * @return value of the feature 
   */
  public double getProbabilityNegative() {
    if (SentimentBert_Type.featOkTst && ((SentimentBert_Type)jcasType).casFeat_probabilityNegative == null)
      jcasType.jcas.throwFeatMissing("probabilityNegative", "org.texttechnologylab.annotation.SentimentBert");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((SentimentBert_Type)jcasType).casFeatCode_probabilityNegative);}
    
  /** setter for probabilityNegative - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbabilityNegative(double v) {
    if (SentimentBert_Type.featOkTst && ((SentimentBert_Type)jcasType).casFeat_probabilityNegative == null)
      jcasType.jcas.throwFeatMissing("probabilityNegative", "org.texttechnologylab.annotation.SentimentBert");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((SentimentBert_Type)jcasType).casFeatCode_probabilityNegative, v);}    
  }

    