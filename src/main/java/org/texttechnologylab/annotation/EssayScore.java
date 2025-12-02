

   
/* Apache UIMA v3 - First created by JCasGen Mon Aug 11 11:31:37 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Essay Score Output
 * Updated by JCasGen Mon Aug 11 11:31:37 CEST 2025
 * XML source: /home/staff_homes/bagci/projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EssayScore extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.EssayScore";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EssayScore.class);
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
   
  public final static String _FeatName_Value = "Value";
  public final static String _FeatName_Name = "Name";
  public final static String _FeatName_Reason = "Reason";
  public final static String _FeatName_InputQuestion = "InputQuestion";
  public final static String _FeatName_InputAnswer = "InputAnswer";
  public final static String _FeatName_InputScene = "InputScene";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Value = TypeSystemImpl.createCallSite(EssayScore.class, "Value");
  private final static MethodHandle _FH_Value = _FC_Value.dynamicInvoker();
  private final static CallSite _FC_Name = TypeSystemImpl.createCallSite(EssayScore.class, "Name");
  private final static MethodHandle _FH_Name = _FC_Name.dynamicInvoker();
  private final static CallSite _FC_Reason = TypeSystemImpl.createCallSite(EssayScore.class, "Reason");
  private final static MethodHandle _FH_Reason = _FC_Reason.dynamicInvoker();
  private final static CallSite _FC_InputQuestion = TypeSystemImpl.createCallSite(EssayScore.class, "InputQuestion");
  private final static MethodHandle _FH_InputQuestion = _FC_InputQuestion.dynamicInvoker();
  private final static CallSite _FC_InputAnswer = TypeSystemImpl.createCallSite(EssayScore.class, "InputAnswer");
  private final static MethodHandle _FH_InputAnswer = _FC_InputAnswer.dynamicInvoker();
  private final static CallSite _FC_InputScene = TypeSystemImpl.createCallSite(EssayScore.class, "InputScene");
  private final static MethodHandle _FH_InputScene = _FC_InputScene.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected EssayScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public EssayScore(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EssayScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EssayScore(JCas jcas, int begin, int end) {
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
  //* Feature: Value

  /** getter for Value - gets Metric Feature Value
   * @generated
   * @return value of the feature 
   */
  public double getValue() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Value));
  }
    
  /** setter for Value - sets Metric Feature Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Name

  /** getter for Name - gets Metric Feature Name
   * @generated
   * @return value of the feature 
   */
  public String getName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Name));
  }
    
  /** setter for Name - sets Metric Feature Name 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Name), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Reason

  /** getter for Reason - gets LLM Reason for chosen Score
   * @generated
   * @return value of the feature 
   */
  public String getReason() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Reason));
  }
    
  /** setter for Reason - sets LLM Reason for chosen Score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Reason), v);
  }    
    
   
    
  //*--------------*
  //* Feature: InputQuestion

  /** getter for InputQuestion - gets Chosen Question Div ID
   * @generated
   * @return value of the feature 
   */
  public AnnotationComment getInputQuestion() { 
    return (AnnotationComment)(_getFeatureValueNc(wrapGetIntCatchException(_FH_InputQuestion)));
  }
    
  /** setter for InputQuestion - sets Chosen Question Div ID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInputQuestion(AnnotationComment v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_InputQuestion), v);
  }    
    
   
    
  //*--------------*
  //* Feature: InputAnswer

  /** getter for InputAnswer - gets Chosen Answer Div ID
   * @generated
   * @return value of the feature 
   */
  public AnnotationComment getInputAnswer() { 
    return (AnnotationComment)(_getFeatureValueNc(wrapGetIntCatchException(_FH_InputAnswer)));
  }
    
  /** setter for InputAnswer - sets Chosen Answer Div ID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInputAnswer(AnnotationComment v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_InputAnswer), v);
  }    
    
   
    
  //*--------------*
  //* Feature: InputScene

  /** getter for InputScene - gets Chosen Scene Div ID
   * @generated
   * @return value of the feature 
   */
  public AnnotationComment getInputScene() { 
    return (AnnotationComment)(_getFeatureValueNc(wrapGetIntCatchException(_FH_InputScene)));
  }
    
  /** setter for InputScene - sets Chosen Scene Div ID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInputScene(AnnotationComment v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_InputScene), v);
  }    
    
  }

    