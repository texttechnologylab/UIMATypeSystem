

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Topic Output
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Topic extends Annotation {
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
  //* Feature: Topics

  /** getter for Topics - gets Set of Topic with key and Value
   * @generated
   * @return value of the feature 
   */
  public FSArray getTopics() {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_Topics == null)
      jcasType.jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.Topic");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Topic_Type)jcasType).casFeatCode_Topics)));}
    
  /** setter for Topics - sets Set of Topic with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopics(FSArray v) {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_Topics == null)
      jcasType.jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.Topic");
    jcasType.ll_cas.ll_setRefValue(addr, ((Topic_Type)jcasType).casFeatCode_Topics, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Topics - gets an indexed value - Set of Topic with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnnotationComment getTopics(int i) {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_Topics == null)
      jcasType.jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.Topic");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Topic_Type)jcasType).casFeatCode_Topics), i);
    return (AnnotationComment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Topic_Type)jcasType).casFeatCode_Topics), i)));}

  /** indexed setter for Topics - sets an indexed value - Set of Topic with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTopics(int i, AnnotationComment v) { 
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_Topics == null)
      jcasType.jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.Topic");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Topic_Type)jcasType).casFeatCode_Topics), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Topic_Type)jcasType).casFeatCode_Topics), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Topic");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Topic_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Topic_Type.featOkTst && ((Topic_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Topic");
    jcasType.ll_cas.ll_setRefValue(addr, ((Topic_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    