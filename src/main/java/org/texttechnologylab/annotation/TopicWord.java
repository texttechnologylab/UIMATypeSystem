

   
/* Apache UIMA v3 - First created by JCasGen Thu Oct 30 18:05:17 CET 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Word that contributes to a topic in unsupervised models
 * Updated by JCasGen Thu Oct 30 18:05:17 CET 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TopicWord extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.TopicWord";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_word = "word";
  public final static String _FeatName_probability = "probability";
  public final static String _FeatName_topic = "topic";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_word = TypeSystemImpl.createCallSite(TopicWord.class, "word");
  private final static MethodHandle _FH_word = _FC_word.dynamicInvoker();
  private final static CallSite _FC_probability = TypeSystemImpl.createCallSite(TopicWord.class, "probability");
  private final static MethodHandle _FH_probability = _FC_probability.dynamicInvoker();
  private final static CallSite _FC_topic = TypeSystemImpl.createCallSite(TopicWord.class, "topic");
  private final static MethodHandle _FH_topic = _FC_topic.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TopicWord() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TopicWord(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_word));
  }
    
  /** setter for word - sets The word associated with a topic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWord(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_word), v);
  }    
    
   
    
  //*--------------*
  //* Feature: probability

  /** getter for probability - gets Probability of the word belonging to a topic
   * @generated
   * @return value of the feature 
   */
  public double getProbability() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_probability));
  }
    
  /** setter for probability - sets Probability of the word belonging to a topic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbability(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_probability), v);
  }    
    
   
    
  //*--------------*
  //* Feature: topic

  /** getter for topic - gets The topic associated with the word
   * @generated
   * @return value of the feature 
   */
  public TopicValueBase getTopic() { 
    return (TopicValueBase)(_getFeatureValueNc(wrapGetIntCatchException(_FH_topic)));
  }
    
  /** setter for topic - sets The topic associated with the word 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopic(TopicValueBase v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_topic), v);
  }    
    
  }

    