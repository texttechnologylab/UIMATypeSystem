

   
/* Apache UIMA v3 - First created by JCasGen Wed Jul 30 12:10:08 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.type.LLMResult;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Essay Score Output
 * Updated by JCasGen Wed Jul 30 12:10:08 CEST 2025
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
  public final static String _FeatName_LLMResult = "LLMResult";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Value = TypeSystemImpl.createCallSite(EssayScore.class, "Value");
  private final static MethodHandle _FH_Value = _FC_Value.dynamicInvoker();
  private final static CallSite _FC_Name = TypeSystemImpl.createCallSite(EssayScore.class, "Name");
  private final static MethodHandle _FH_Name = _FC_Name.dynamicInvoker();
  private final static CallSite _FC_LLMResult = TypeSystemImpl.createCallSite(EssayScore.class, "LLMResult");
  private final static MethodHandle _FH_LLMResult = _FC_LLMResult.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(EssayScore.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
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
  public double getName() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Name));
  }
    
  /** setter for Name - sets Metric Feature Name 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Name), v);
  }    
    
   
    
  //*--------------*
  //* Feature: LLMResult

  /** getter for LLMResult - gets LLM Results
   * @generated
   * @return value of the feature 
   */
  public LLMResult getLLMResult() { 
    return (LLMResult)(_getFeatureValueNc(wrapGetIntCatchException(_FH_LLMResult)));
  }
    
  /** setter for LLMResult - sets LLM Results 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLLMResult(LLMResult v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_LLMResult), v);
  }    
    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets Which Model or Process was used to Compute the Information
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_model)));
  }
    
  /** setter for model - sets Which Model or Process was used to Compute the Information 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_model), v);
  }    
    
  }

    