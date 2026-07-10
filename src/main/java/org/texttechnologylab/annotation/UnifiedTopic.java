

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class UnifiedTopic extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UnifiedTopic.class);
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
  protected UnifiedTopic() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public UnifiedTopic(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public UnifiedTopic(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public UnifiedTopic(JCas jcas, int begin, int end) {
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

  /** getter for Topics - gets Set of topic labels
   * @generated
   * @return value of the feature 
   */
  public FSArray getTopics() {
    if (UnifiedTopic_Type.featOkTst && ((UnifiedTopic_Type)jcasType).casFeat_Topics == null)
      jcasType.jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.UnifiedTopic");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UnifiedTopic_Type)jcasType).casFeatCode_Topics)));}
    
  /** setter for Topics - sets Set of topic labels 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopics(FSArray v) {
    if (UnifiedTopic_Type.featOkTst && ((UnifiedTopic_Type)jcasType).casFeat_Topics == null)
      jcasType.jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.UnifiedTopic");
    jcasType.ll_cas.ll_setRefValue(addr, ((UnifiedTopic_Type)jcasType).casFeatCode_Topics, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Topics - gets an indexed value - Set of topic labels
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TopicValueBase getTopics(int i) {
    if (UnifiedTopic_Type.featOkTst && ((UnifiedTopic_Type)jcasType).casFeat_Topics == null)
      jcasType.jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.UnifiedTopic");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((UnifiedTopic_Type)jcasType).casFeatCode_Topics), i);
    return (TopicValueBase)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((UnifiedTopic_Type)jcasType).casFeatCode_Topics), i)));}

  /** indexed setter for Topics - sets an indexed value - Set of topic labels
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTopics(int i, TopicValueBase v) { 
    if (UnifiedTopic_Type.featOkTst && ((UnifiedTopic_Type)jcasType).casFeat_Topics == null)
      jcasType.jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.UnifiedTopic");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((UnifiedTopic_Type)jcasType).casFeatCode_Topics), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((UnifiedTopic_Type)jcasType).casFeatCode_Topics), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: metadata

  /** getter for metadata - gets Metadata for the model and data
   * @generated
   * @return value of the feature 
   */
  public MetaData getMetadata() {
    if (UnifiedTopic_Type.featOkTst && ((UnifiedTopic_Type)jcasType).casFeat_metadata == null)
      jcasType.jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.UnifiedTopic");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UnifiedTopic_Type)jcasType).casFeatCode_metadata)));}
    
  /** setter for metadata - sets Metadata for the model and data 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMetadata(MetaData v) {
    if (UnifiedTopic_Type.featOkTst && ((UnifiedTopic_Type)jcasType).casFeat_metadata == null)
      jcasType.jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.UnifiedTopic");
    jcasType.ll_cas.ll_setRefValue(addr, ((UnifiedTopic_Type)jcasType).casFeatCode_metadata, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    