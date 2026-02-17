
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Word that contributes to a topic in unsupervised models
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class TopicWord_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TopicWord.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.TopicWord");
 
  /** @generated */
  final Feature casFeat_word;
  /** @generated */
  final int     casFeatCode_word;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWord(int addr) {
        if (featOkTst && casFeat_word == null)
      jcas.throwFeatMissing("word", "org.texttechnologylab.annotation.TopicWord");
    return ll_cas.ll_getStringValue(addr, casFeatCode_word);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWord(int addr, String v) {
        if (featOkTst && casFeat_word == null)
      jcas.throwFeatMissing("word", "org.texttechnologylab.annotation.TopicWord");
    ll_cas.ll_setStringValue(addr, casFeatCode_word, v);}
    
  
 
  /** @generated */
  final Feature casFeat_probability;
  /** @generated */
  final int     casFeatCode_probability;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getProbability(int addr) {
        if (featOkTst && casFeat_probability == null)
      jcas.throwFeatMissing("probability", "org.texttechnologylab.annotation.TopicWord");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_probability);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setProbability(int addr, double v) {
        if (featOkTst && casFeat_probability == null)
      jcas.throwFeatMissing("probability", "org.texttechnologylab.annotation.TopicWord");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_probability, v);}
    
  
 
  /** @generated */
  final Feature casFeat_topic;
  /** @generated */
  final int     casFeatCode_topic;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTopic(int addr) {
        if (featOkTst && casFeat_topic == null)
      jcas.throwFeatMissing("topic", "org.texttechnologylab.annotation.TopicWord");
    return ll_cas.ll_getRefValue(addr, casFeatCode_topic);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTopic(int addr, int v) {
        if (featOkTst && casFeat_topic == null)
      jcas.throwFeatMissing("topic", "org.texttechnologylab.annotation.TopicWord");
    ll_cas.ll_setRefValue(addr, casFeatCode_topic, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TopicWord_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_word = jcas.getRequiredFeatureDE(casType, "word", "uima.cas.String", featOkTst);
    casFeatCode_word  = (null == casFeat_word) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_word).getCode();

 
    casFeat_probability = jcas.getRequiredFeatureDE(casType, "probability", "uima.cas.Double", featOkTst);
    casFeatCode_probability  = (null == casFeat_probability) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_probability).getCode();

 
    casFeat_topic = jcas.getRequiredFeatureDE(casType, "topic", "org.texttechnologylab.annotation.TopicValueBase", featOkTst);
    casFeatCode_topic  = (null == casFeat_topic) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_topic).getCode();

  }
}



    