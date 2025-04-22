

   
/* Apache UIMA v3 - First created by JCasGen Tue Apr 22 17:11:16 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Tue Apr 22 17:11:16 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TopicValueBase extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.TopicValueBase";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopicValueBase.class);
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
   
  public final static String _FeatName_value = "value";
  public final static String _FeatName_words = "words";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(TopicValueBase.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_words = TypeSystemImpl.createCallSite(TopicValueBase.class, "words");
  private final static MethodHandle _FH_words = _FC_words.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected TopicValueBase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public TopicValueBase(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TopicValueBase(JCas jcas) {
    super(jcas);
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
  //* Feature: value

  /** getter for value - gets Topic Label
   * @generated
   * @return value of the feature 
   */
  public String getValue() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets Topic Label 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: words

  /** getter for words - gets Set of words with probabilities
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<TopicWord> getWords() { 
    return (FSArray<TopicWord>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_words)));
  }
    
  /** setter for words - sets Set of words with probabilities 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWords(FSArray<TopicWord> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_words), v);
  }    
    
    
  /** indexed getter for words - gets an indexed value - Set of words with probabilities
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public TopicWord getWords(int i) {
     return (TopicWord)(((FSArray<TopicWord>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_words)))).get(i));
  } 

  /** indexed setter for words - sets an indexed value - Set of words with probabilities
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setWords(int i, TopicWord v) {
    ((FSArray<TopicWord>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_words)))).set(i, v);
  }  
  }

    