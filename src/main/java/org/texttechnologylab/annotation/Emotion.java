

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Emotion Output
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Emotion extends Annotation {
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
  //* Feature: Emotions

  /** getter for Emotions - gets Set of Emotion with key and Value
   * @generated
   * @return value of the feature 
   */
  public FSArray getEmotions() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Emotions == null)
      jcasType.jcas.throwFeatMissing("Emotions", "org.texttechnologylab.annotation.Emotion");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Emotion_Type)jcasType).casFeatCode_Emotions)));}
    
  /** setter for Emotions - sets Set of Emotion with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmotions(FSArray v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Emotions == null)
      jcasType.jcas.throwFeatMissing("Emotions", "org.texttechnologylab.annotation.Emotion");
    jcasType.ll_cas.ll_setRefValue(addr, ((Emotion_Type)jcasType).casFeatCode_Emotions, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Emotions - gets an indexed value - Set of Emotion with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnnotationComment getEmotions(int i) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Emotions == null)
      jcasType.jcas.throwFeatMissing("Emotions", "org.texttechnologylab.annotation.Emotion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Emotion_Type)jcasType).casFeatCode_Emotions), i);
    return (AnnotationComment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Emotion_Type)jcasType).casFeatCode_Emotions), i)));}

  /** indexed setter for Emotions - sets an indexed value - Set of Emotion with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setEmotions(int i, AnnotationComment v) { 
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_Emotions == null)
      jcasType.jcas.throwFeatMissing("Emotions", "org.texttechnologylab.annotation.Emotion");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Emotion_Type)jcasType).casFeatCode_Emotions), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Emotion_Type)jcasType).casFeatCode_Emotions), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Emotion");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Emotion_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Emotion_Type.featOkTst && ((Emotion_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Emotion");
    jcasType.ll_cas.ll_setRefValue(addr, ((Emotion_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    