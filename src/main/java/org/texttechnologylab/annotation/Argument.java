

   
/* Apache UIMA v3 - First created by JCasGen Thu May 16 17:25:22 CEST 2024 */

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


/** Argument
 * Updated by JCasGen Thu May 16 17:25:22 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Argument extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Argument";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Argument.class);
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
   
  public final static String _FeatName_topic = "topic";
  public final static String _FeatName_Arguments = "Arguments";
  public final static String _FeatName_reason = "reason";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_topic = TypeSystemImpl.createCallSite(Argument.class, "topic");
  private final static MethodHandle _FH_topic = _FC_topic.dynamicInvoker();
  private final static CallSite _FC_Arguments = TypeSystemImpl.createCallSite(Argument.class, "Arguments");
  private final static MethodHandle _FH_Arguments = _FC_Arguments.dynamicInvoker();
  private final static CallSite _FC_reason = TypeSystemImpl.createCallSite(Argument.class, "reason");
  private final static MethodHandle _FH_reason = _FC_reason.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Argument.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Argument() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Argument(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Argument(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Argument(JCas jcas, int begin, int end) {
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

  /** getter for topic - gets Topic which is related to topic
   * @generated
   * @return value of the feature 
   */
  public String getTopic() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_topic));
  }
    
  /** setter for topic - sets Topic which is related to topic 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTopic(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_topic), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Arguments

  /** getter for Arguments - gets Set of Argument with key and Value
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<AnnotationComment> getArguments() { 
    return (FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Arguments)));
  }
    
  /** setter for Arguments - sets Set of Argument with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setArguments(FSArray<AnnotationComment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Arguments), v);
  }    
    
    
  /** indexed getter for Arguments - gets an indexed value - Set of Argument with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public AnnotationComment getArguments(int i) {
     return (AnnotationComment)(((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Arguments)))).get(i));
  } 

  /** indexed setter for Arguments - sets an indexed value - Set of Argument with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setArguments(int i, AnnotationComment v) {
    ((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Arguments)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: reason

  /** getter for reason - gets reason for the output if its provided
   * @generated
   * @return value of the feature 
   */
  public String getReason() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_reason));
  }
    
  /** setter for reason - sets reason for the output if its provided 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_reason), v);
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

    