

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:23:28 CET 2024 */

package org.bitbucket.rkilinger.ged;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Feb 28 22:23:28 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Emotion extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.bitbucket.rkilinger.ged.Emotion";
  
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
   
  public final static String _FeatName_joy = "joy";
  public final static String _FeatName_anger = "anger";
  public final static String _FeatName_mourning = "mourning";
  public final static String _FeatName_fear = "fear";
  public final static String _FeatName_surprise = "surprise";
  public final static String _FeatName_contempt = "contempt";
  public final static String _FeatName_disgust = "disgust";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_joy = TypeSystemImpl.createCallSite(Emotion.class, "joy");
  private final static MethodHandle _FH_joy = _FC_joy.dynamicInvoker();
  private final static CallSite _FC_anger = TypeSystemImpl.createCallSite(Emotion.class, "anger");
  private final static MethodHandle _FH_anger = _FC_anger.dynamicInvoker();
  private final static CallSite _FC_mourning = TypeSystemImpl.createCallSite(Emotion.class, "mourning");
  private final static MethodHandle _FH_mourning = _FC_mourning.dynamicInvoker();
  private final static CallSite _FC_fear = TypeSystemImpl.createCallSite(Emotion.class, "fear");
  private final static MethodHandle _FH_fear = _FC_fear.dynamicInvoker();
  private final static CallSite _FC_surprise = TypeSystemImpl.createCallSite(Emotion.class, "surprise");
  private final static MethodHandle _FH_surprise = _FC_surprise.dynamicInvoker();
  private final static CallSite _FC_contempt = TypeSystemImpl.createCallSite(Emotion.class, "contempt");
  private final static MethodHandle _FH_contempt = _FC_contempt.dynamicInvoker();
  private final static CallSite _FC_disgust = TypeSystemImpl.createCallSite(Emotion.class, "disgust");
  private final static MethodHandle _FH_disgust = _FC_disgust.dynamicInvoker();

   
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
  //* Feature: joy

  /** getter for joy - gets 
   * @generated
   * @return value of the feature 
   */
  public double getJoy() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_joy));
  }
    
  /** setter for joy - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setJoy(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_joy), v);
  }    
    
   
    
  //*--------------*
  //* Feature: anger

  /** getter for anger - gets 
   * @generated
   * @return value of the feature 
   */
  public double getAnger() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_anger));
  }
    
  /** setter for anger - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnger(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_anger), v);
  }    
    
   
    
  //*--------------*
  //* Feature: mourning

  /** getter for mourning - gets 
   * @generated
   * @return value of the feature 
   */
  public double getMourning() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_mourning));
  }
    
  /** setter for mourning - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMourning(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_mourning), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fear

  /** getter for fear - gets 
   * @generated
   * @return value of the feature 
   */
  public double getFear() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_fear));
  }
    
  /** setter for fear - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFear(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_fear), v);
  }    
    
   
    
  //*--------------*
  //* Feature: surprise

  /** getter for surprise - gets 
   * @generated
   * @return value of the feature 
   */
  public double getSurprise() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_surprise));
  }
    
  /** setter for surprise - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSurprise(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_surprise), v);
  }    
    
   
    
  //*--------------*
  //* Feature: contempt

  /** getter for contempt - gets 
   * @generated
   * @return value of the feature 
   */
  public double getContempt() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_contempt));
  }
    
  /** setter for contempt - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContempt(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_contempt), v);
  }    
    
   
    
  //*--------------*
  //* Feature: disgust

  /** getter for disgust - gets 
   * @generated
   * @return value of the feature 
   */
  public double getDisgust() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_disgust));
  }
    
  /** setter for disgust - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDisgust(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_disgust), v);
  }    
    
  }

    