

/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.uima.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Dec 21 13:46:41 CET 2023
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/src/main/resources/desc/type/TypeSystemModelAnnotation.xml
 * @generated */
public class Topic extends Classification {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Topic.class);
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
  protected Topic() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Topic(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Topic(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Topic(JCas jcas, int begin, int end) {
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
  //* Feature: topic

  /** getter for topic - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTopic() {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "org.texttechnologylab.uima.type.Topic");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Topic_Type)jcasType).casFeatCode_topic);}
    
  /** setter for topic - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopic(String v) {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "org.texttechnologylab.uima.type.Topic");
    jcasType.ll_cas.ll_setStringValue(addr, ((Topic_Type)jcasType).casFeatCode_topic, v);}    
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets 
   * @generated
   * @return value of the feature 
   */
  public double getScore() {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.texttechnologylab.uima.type.Topic");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Topic_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(double v) {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "org.texttechnologylab.uima.type.Topic");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Topic_Type)jcasType).casFeatCode_score, v);}    
  }

    