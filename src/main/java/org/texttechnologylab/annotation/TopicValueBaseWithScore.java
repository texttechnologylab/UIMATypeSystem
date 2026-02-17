

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TopicValueBaseWithScore extends TopicValueBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopicValueBaseWithScore.class);
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
  protected TopicValueBaseWithScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TopicValueBaseWithScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TopicValueBaseWithScore(JCas jcas) {
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
  //* Feature: score

  /** getter for score - gets Probability of the topic label
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (TopicValueBaseWithScore_Type.featOkTst && ((TopicValueBaseWithScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.TopicValueBaseWithScore");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TopicValueBaseWithScore_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets Probability of the topic label 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (TopicValueBaseWithScore_Type.featOkTst && ((TopicValueBaseWithScore_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.texttechnologylab.annotation.TopicValueBaseWithScore");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TopicValueBaseWithScore_Type)jcasType).casFeatCode_score, v);}    
  }

    