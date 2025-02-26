

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 26 11:38:01 CET 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Feb 26 11:38:01 CET 2025
 * XML source: /home/staff_homes/verma/Documents/projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class BertTopic extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.BertTopic";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BertTopic.class);
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
   
  public final static String _FeatName_Topics = "Topics";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Topics = TypeSystemImpl.createCallSite(BertTopic.class, "Topics");
  private final static MethodHandle _FH_Topics = _FC_Topics.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(BertTopic.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected BertTopic() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public BertTopic(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public BertTopic(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public BertTopic(JCas jcas, int begin, int end) {
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
  @SuppressWarnings("unchecked")
  public FSArray<TopicValue> getTopics() { 
    return (FSArray<TopicValue>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Topics)));
  }
    
  /** setter for Topics - sets Set of Topic with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopics(FSArray<TopicValue> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Topics), v);
  }    
    
    
  /** indexed getter for Topics - gets an indexed value - Set of Topic with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TopicValue getTopics(int i) {
     return (TopicValue)(((FSArray<TopicValue>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Topics)))).get(i));
  } 

  /** indexed setter for Topics - sets an indexed value - Set of Topic with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setTopics(int i, TopicValue v) {
    ((FSArray<TopicValue>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Topics)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_model)));
  }
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_model), v);
  }    
    
  }

    