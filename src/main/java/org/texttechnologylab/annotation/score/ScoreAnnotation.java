

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 06 21:55:41 CEST 2025 */

package org.texttechnologylab.annotation.score;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jun 06 21:55:41 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ScoreAnnotation extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.score.ScoreAnnotation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ScoreAnnotation.class);
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
   
  public final static String _FeatName_reference = "reference";
  public final static String _FeatName_value = "value";
  public final static String _FeatName_origin = "origin";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(ScoreAnnotation.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();
  private final static CallSite _FC_value = TypeSystemImpl.createCallSite(ScoreAnnotation.class, "value");
  private final static MethodHandle _FH_value = _FC_value.dynamicInvoker();
  private final static CallSite _FC_origin = TypeSystemImpl.createCallSite(ScoreAnnotation.class, "origin");
  private final static MethodHandle _FH_origin = _FC_origin.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ScoreAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ScoreAnnotation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ScoreAnnotation(JCas jcas) {
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
  //* Feature: reference

  /** getter for reference - gets 
   * @generated
   * @return value of the feature 
   */
  public TOP getReference() { 
    return (TOP)(_getFeatureValueNc(wrapGetIntCatchException(_FH_reference)));
  }
    
  /** setter for reference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(TOP v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_reference), v);
  }    
    
   
    
  //*--------------*
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public double getValue() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_value));
  }
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_value), v);
  }    
    
   
    
  //*--------------*
  //* Feature: origin

  /** getter for origin - gets 
   * @generated
   * @return value of the feature 
   */
  public String getOrigin() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_origin));
  }
    
  /** setter for origin - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setOrigin(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_origin), v);
  }    
    
  }

    