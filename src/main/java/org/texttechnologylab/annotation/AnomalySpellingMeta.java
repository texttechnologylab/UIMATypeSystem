

   
/* Apache UIMA v3 - First created by JCasGen Mon May 12 10:32:10 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Mon May 12 10:32:10 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AnomalySpellingMeta extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.AnomalySpellingMeta";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnomalySpellingMeta.class);
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
   
  public final static String _FeatName_ModelName = "ModelName";
  public final static String _FeatName_GoodQuality = "GoodQuality";
  public final static String _FeatName_UnknownQuality = "UnknownQuality";
  public final static String _FeatName_Quality = "Quality";
  public final static String _FeatName_RightWords = "RightWords";
  public final static String _FeatName_WrongWords = "WrongWords";
  public final static String _FeatName_UnknownWords = "UnknownWords";
  public final static String _FeatName_SkippedWords = "SkippedWords";
  public final static String _FeatName_PercentRight = "PercentRight";
  public final static String _FeatName_PercentWrong = "PercentWrong";
  public final static String _FeatName_PercentUnknown = "PercentUnknown";
  public final static String _FeatName_PercentRightWithoutSkipped = "PercentRightWithoutSkipped";
  public final static String _FeatName_PercentWrongWithoutSkipped = "PercentWrongWithoutSkipped";
  public final static String _FeatName_PercentUnknownWithoutSkipped = "PercentUnknownWithoutSkipped";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_ModelName = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "ModelName");
  private final static MethodHandle _FH_ModelName = _FC_ModelName.dynamicInvoker();
  private final static CallSite _FC_GoodQuality = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "GoodQuality");
  private final static MethodHandle _FH_GoodQuality = _FC_GoodQuality.dynamicInvoker();
  private final static CallSite _FC_UnknownQuality = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "UnknownQuality");
  private final static MethodHandle _FH_UnknownQuality = _FC_UnknownQuality.dynamicInvoker();
  private final static CallSite _FC_Quality = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "Quality");
  private final static MethodHandle _FH_Quality = _FC_Quality.dynamicInvoker();
  private final static CallSite _FC_RightWords = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "RightWords");
  private final static MethodHandle _FH_RightWords = _FC_RightWords.dynamicInvoker();
  private final static CallSite _FC_WrongWords = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "WrongWords");
  private final static MethodHandle _FH_WrongWords = _FC_WrongWords.dynamicInvoker();
  private final static CallSite _FC_UnknownWords = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "UnknownWords");
  private final static MethodHandle _FH_UnknownWords = _FC_UnknownWords.dynamicInvoker();
  private final static CallSite _FC_SkippedWords = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "SkippedWords");
  private final static MethodHandle _FH_SkippedWords = _FC_SkippedWords.dynamicInvoker();
  private final static CallSite _FC_PercentRight = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "PercentRight");
  private final static MethodHandle _FH_PercentRight = _FC_PercentRight.dynamicInvoker();
  private final static CallSite _FC_PercentWrong = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "PercentWrong");
  private final static MethodHandle _FH_PercentWrong = _FC_PercentWrong.dynamicInvoker();
  private final static CallSite _FC_PercentUnknown = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "PercentUnknown");
  private final static MethodHandle _FH_PercentUnknown = _FC_PercentUnknown.dynamicInvoker();
  private final static CallSite _FC_PercentRightWithoutSkipped = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "PercentRightWithoutSkipped");
  private final static MethodHandle _FH_PercentRightWithoutSkipped = _FC_PercentRightWithoutSkipped.dynamicInvoker();
  private final static CallSite _FC_PercentWrongWithoutSkipped = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "PercentWrongWithoutSkipped");
  private final static MethodHandle _FH_PercentWrongWithoutSkipped = _FC_PercentWrongWithoutSkipped.dynamicInvoker();
  private final static CallSite _FC_PercentUnknownWithoutSkipped = TypeSystemImpl.createCallSite(AnomalySpellingMeta.class, "PercentUnknownWithoutSkipped");
  private final static MethodHandle _FH_PercentUnknownWithoutSkipped = _FC_PercentUnknownWithoutSkipped.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AnomalySpellingMeta() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AnomalySpellingMeta(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnomalySpellingMeta(JCas jcas) {
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
  //* Feature: ModelName

  /** getter for ModelName - gets The name of the Model
   * @generated
   * @return value of the feature 
   */
  public String getModelName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_ModelName));
  }
    
  /** setter for ModelName - sets The name of the Model 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ModelName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: GoodQuality

  /** getter for GoodQuality - gets Quality of Document without skipped and unknown Words
   * @generated
   * @return value of the feature 
   */
  public double getGoodQuality() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_GoodQuality));
  }
    
  /** setter for GoodQuality - sets Quality of Document without skipped and unknown Words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGoodQuality(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_GoodQuality), v);
  }    
    
   
    
  //*--------------*
  //* Feature: UnknownQuality

  /** getter for UnknownQuality - gets Quality of Document without skipped Words
   * @generated
   * @return value of the feature 
   */
  public double getUnknownQuality() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_UnknownQuality));
  }
    
  /** setter for UnknownQuality - sets Quality of Document without skipped Words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnknownQuality(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_UnknownQuality), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Quality

  /** getter for Quality - gets Quality of Document
   * @generated
   * @return value of the feature 
   */
  public double getQuality() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Quality));
  }
    
  /** setter for Quality - sets Quality of Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuality(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Quality), v);
  }    
    
   
    
  //*--------------*
  //* Feature: RightWords

  /** getter for RightWords - gets Number of correct words in the Document
   * @generated
   * @return value of the feature 
   */
  public int getRightWords() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_RightWords));
  }
    
  /** setter for RightWords - sets Number of correct words in the Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRightWords(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_RightWords), v);
  }    
    
   
    
  //*--------------*
  //* Feature: WrongWords

  /** getter for WrongWords - gets Number of wrong words in the Document
   * @generated
   * @return value of the feature 
   */
  public int getWrongWords() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_WrongWords));
  }
    
  /** setter for WrongWords - sets Number of wrong words in the Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setWrongWords(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_WrongWords), v);
  }    
    
   
    
  //*--------------*
  //* Feature: UnknownWords

  /** getter for UnknownWords - gets Number of unknown words in the Document
   * @generated
   * @return value of the feature 
   */
  public int getUnknownWords() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_UnknownWords));
  }
    
  /** setter for UnknownWords - sets Number of unknown words in the Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnknownWords(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_UnknownWords), v);
  }    
    
   
    
  //*--------------*
  //* Feature: SkippedWords

  /** getter for SkippedWords - gets Number of Skipped words in the Document
   * @generated
   * @return value of the feature 
   */
  public int getSkippedWords() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_SkippedWords));
  }
    
  /** setter for SkippedWords - sets Number of Skipped words in the Document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSkippedWords(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_SkippedWords), v);
  }    
    
   
    
  //*--------------*
  //* Feature: PercentRight

  /** getter for PercentRight - gets Percentage of correct words in the document without skipped words
   * @generated
   * @return value of the feature 
   */
  public double getPercentRight() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_PercentRight));
  }
    
  /** setter for PercentRight - sets Percentage of correct words in the document without skipped words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentRight(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_PercentRight), v);
  }    
    
   
    
  //*--------------*
  //* Feature: PercentWrong

  /** getter for PercentWrong - gets Percentage of wrong words in the document without skipped words
   * @generated
   * @return value of the feature 
   */
  public double getPercentWrong() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_PercentWrong));
  }
    
  /** setter for PercentWrong - sets Percentage of wrong words in the document without skipped words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentWrong(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_PercentWrong), v);
  }    
    
   
    
  //*--------------*
  //* Feature: PercentUnknown

  /** getter for PercentUnknown - gets Percentage of unknown words in the document without skipped words
   * @generated
   * @return value of the feature 
   */
  public double getPercentUnknown() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_PercentUnknown));
  }
    
  /** setter for PercentUnknown - sets Percentage of unknown words in the document without skipped words 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentUnknown(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_PercentUnknown), v);
  }    
    
   
    
  //*--------------*
  //* Feature: PercentRightWithoutSkipped

  /** getter for PercentRightWithoutSkipped - gets Percentage of correct words in the document
   * @generated
   * @return value of the feature 
   */
  public double getPercentRightWithoutSkipped() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_PercentRightWithoutSkipped));
  }
    
  /** setter for PercentRightWithoutSkipped - sets Percentage of correct words in the document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentRightWithoutSkipped(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_PercentRightWithoutSkipped), v);
  }    
    
   
    
  //*--------------*
  //* Feature: PercentWrongWithoutSkipped

  /** getter for PercentWrongWithoutSkipped - gets Percentage of wrong words in the document
   * @generated
   * @return value of the feature 
   */
  public double getPercentWrongWithoutSkipped() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_PercentWrongWithoutSkipped));
  }
    
  /** setter for PercentWrongWithoutSkipped - sets Percentage of wrong words in the document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentWrongWithoutSkipped(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_PercentWrongWithoutSkipped), v);
  }    
    
   
    
  //*--------------*
  //* Feature: PercentUnknownWithoutSkipped

  /** getter for PercentUnknownWithoutSkipped - gets Percentage of unknown words in the document
   * @generated
   * @return value of the feature 
   */
  public double getPercentUnknownWithoutSkipped() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_PercentUnknownWithoutSkipped));
  }
    
  /** setter for PercentUnknownWithoutSkipped - sets Percentage of unknown words in the document 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPercentUnknownWithoutSkipped(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_PercentUnknownWithoutSkipped), v);
  }    
    
  }

    