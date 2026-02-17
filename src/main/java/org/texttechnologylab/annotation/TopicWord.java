

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Word that contributes to a topic in unsupervised models
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TopicWord extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopicWord.class);
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
  protected TopicWord() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TopicWord(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TopicWord(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public TopicWord(JCas jcas, int begin, int end) {
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
  //* Feature: word

  /** getter for word - gets The word associated with a topic
   * @generated
   * @return value of the feature 
   */
  public String getWord() {
    if (TopicWord_Type.featOkTst && ((TopicWord_Type)jcasType).casFeat_word == null)
      jcasType.jcas.throwFeatMissing("word", "org.texttechnologylab.annotation.TopicWord");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TopicWord_Type)jcasType).casFeatCode_word);}
    
  /** setter for word - sets The word associated with a topic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWord(String v) {
    if (TopicWord_Type.featOkTst && ((TopicWord_Type)jcasType).casFeat_word == null)
      jcasType.jcas.throwFeatMissing("word", "org.texttechnologylab.annotation.TopicWord");
    jcasType.ll_cas.ll_setStringValue(addr, ((TopicWord_Type)jcasType).casFeatCode_word, v);}    
   
    
  //*--------------*
  //* Feature: probability

  /** getter for probability - gets Probability of the word belonging to a topic
   * @generated
   * @return value of the feature 
   */
  public double getProbability() {
    if (TopicWord_Type.featOkTst && ((TopicWord_Type)jcasType).casFeat_probability == null)
      jcasType.jcas.throwFeatMissing("probability", "org.texttechnologylab.annotation.TopicWord");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TopicWord_Type)jcasType).casFeatCode_probability);}
    
  /** setter for probability - sets Probability of the word belonging to a topic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbability(double v) {
    if (TopicWord_Type.featOkTst && ((TopicWord_Type)jcasType).casFeat_probability == null)
      jcasType.jcas.throwFeatMissing("probability", "org.texttechnologylab.annotation.TopicWord");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TopicWord_Type)jcasType).casFeatCode_probability, v);}    
   
    
  //*--------------*
  //* Feature: topic

  /** getter for topic - gets The topic associated with the word
   * @generated
   * @return value of the feature 
   */
  public TopicValueBase getTopic() {
    if (TopicWord_Type.featOkTst && ((TopicWord_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "org.texttechnologylab.annotation.TopicWord");
    return (TopicValueBase)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TopicWord_Type)jcasType).casFeatCode_topic)));}
    
  /** setter for topic - sets The topic associated with the word 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopic(TopicValueBase v) {
    if (TopicWord_Type.featOkTst && ((TopicWord_Type)jcasType).casFeat_topic == null)
      jcasType.jcas.throwFeatMissing("topic", "org.texttechnologylab.annotation.TopicWord");
    jcasType.ll_cas.ll_setRefValue(addr, ((TopicWord_Type)jcasType).casFeatCode_topic, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    