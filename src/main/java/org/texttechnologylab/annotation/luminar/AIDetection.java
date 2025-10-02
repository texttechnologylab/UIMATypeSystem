

   
/* Apache UIMA v3 - First created by JCasGen Wed Oct 01 14:52:14 CEST 2025 */

package org.texttechnologylab.annotation.luminar;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** A typesystem for the Luminar AI detector, providing probabilities that a given document is AI-generated or not.
                Depending on the model, this is done on document-level only or on sequence- and document-level.
 * Updated by JCasGen Wed Oct 01 14:52:14 CEST 2025
 * XML source: C:/kevin/projects/duui/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AIDetection extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.luminar.AIDetection";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AIDetection.class);
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
   
  public final static String _FeatName_detectionScore = "detectionScore";
  public final static String _FeatName_level = "level";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_detectionScore = TypeSystemImpl.createCallSite(AIDetection.class, "detectionScore");
  private final static MethodHandle _FH_detectionScore = _FC_detectionScore.dynamicInvoker();
  private final static CallSite _FC_level = TypeSystemImpl.createCallSite(AIDetection.class, "level");
  private final static MethodHandle _FH_level = _FC_level.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(AIDetection.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected AIDetection() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public AIDetection(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AIDetection(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AIDetection(JCas jcas, int begin, int end) {
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
  //* Feature: detectionScore

  /** getter for detectionScore - gets Ranging from 0 to 1, where near 0 means likely human and near 1 means likely AI.
   * @generated
   * @return value of the feature 
   */
  public double getDetectionScore() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_detectionScore));
  }
    
  /** setter for detectionScore - sets Ranging from 0 to 1, where near 0 means likely human and near 1 means likely AI. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDetectionScore(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_detectionScore), v);
  }    
    
   
    
  //*--------------*
  //* Feature: level

  /** getter for level - gets The level on which this detection was applied, e.g. SEQUENCE or DOCUMENT level.
   * @generated
   * @return value of the feature 
   */
  public String getLevel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_level));
  }
    
  /** setter for level - sets The level on which this detection was applied, e.g. SEQUENCE or DOCUMENT level. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLevel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_level), v);
  }    
    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets The model version used for this detection annotation.
   * @generated
   * @return value of the feature 
   */
  public String getModel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_model));
  }
    
  /** setter for model - sets The model version used for this detection annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_model), v);
  }    
    
  }

    