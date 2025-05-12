

   
/* Apache UIMA v3 - First created by JCasGen Mon May 12 10:32:10 CEST 2025 */

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
 * Updated by JCasGen Mon May 12 10:32:10 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class UnifiedTopic extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.UnifiedTopic";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_Topics = "Topics";
  public final static String _FeatName_metadata = "metadata";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Topics = TypeSystemImpl.createCallSite(UnifiedTopic.class, "Topics");
  private final static MethodHandle _FH_Topics = _FC_Topics.dynamicInvoker();
  private final static CallSite _FC_metadata = TypeSystemImpl.createCallSite(UnifiedTopic.class, "metadata");
  private final static MethodHandle _FH_metadata = _FC_metadata.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected UnifiedTopic() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public UnifiedTopic(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
  @SuppressWarnings("unchecked")
  public FSArray<TopicValueBase> getTopics() { 
    return (FSArray<TopicValueBase>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Topics)));
  }
    
  /** setter for Topics - sets Set of topic labels 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopics(FSArray<TopicValueBase> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Topics), v);
  }    
    
    
  /** indexed getter for Topics - gets an indexed value - Set of topic labels
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TopicValueBase getTopics(int i) {
     return (TopicValueBase)(((FSArray<TopicValueBase>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Topics)))).get(i));
  } 

  /** indexed setter for Topics - sets an indexed value - Set of topic labels
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setTopics(int i, TopicValueBase v) {
    ((FSArray<TopicValueBase>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Topics)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: metadata

  /** getter for metadata - gets Metadata for the model and data
   * @generated
   * @return value of the feature 
   */
  public MetaData getMetadata() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_metadata)));
  }
    
  /** setter for metadata - sets Metadata for the model and data 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMetadata(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_metadata), v);
  }    
    
  }

    