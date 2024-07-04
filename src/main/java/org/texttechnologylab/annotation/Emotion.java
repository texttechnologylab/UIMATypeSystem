

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.annotation;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;
import org.texttechnologylab.annotation.model.MetaData;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/** Emotion Output
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Emotion extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Emotion";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_Emotions = "Emotions";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Emotions = TypeSystemImpl.createCallSite(Emotion.class, "Emotions");
  private final static MethodHandle _FH_Emotions = _FC_Emotions.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Emotion.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Emotion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Emotion(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
  @SuppressWarnings("unchecked")
  public FSArray<AnnotationComment> getEmotions() { 
    return (FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Emotions)));
  }
    
  /** setter for Emotions - sets Set of Emotion with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEmotions(FSArray<AnnotationComment> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Emotions), v);
  }    
    
    
  /** indexed getter for Emotions - gets an indexed value - Set of Emotion with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public AnnotationComment getEmotions(int i) {
     return (AnnotationComment)(((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Emotions)))).get(i));
  } 

  /** indexed setter for Emotions - sets an indexed value - Set of Emotion with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setEmotions(int i, AnnotationComment v) {
    ((FSArray<AnnotationComment>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Emotions)))).set(i, v);
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

    