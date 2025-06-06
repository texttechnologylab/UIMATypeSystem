

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 06 21:55:41 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jun 06 21:55:41 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Entailment extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Entailment";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Entailment.class);
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
  public final static String _FeatName_entailment = "entailment";
  public final static String _FeatName_contradiction = "contradiction";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(Entailment.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();
  private final static CallSite _FC_entailment = TypeSystemImpl.createCallSite(Entailment.class, "entailment");
  private final static MethodHandle _FH_entailment = _FC_entailment.dynamicInvoker();
  private final static CallSite _FC_contradiction = TypeSystemImpl.createCallSite(Entailment.class, "contradiction");
  private final static MethodHandle _FH_contradiction = _FC_contradiction.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Entailment.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Entailment() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Entailment(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Entailment(JCas jcas) {
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

  /** getter for reference - gets Entailment reference
   * @generated
   * @return value of the feature 
   */
  public EntailmentSentence getReference() { 
    return (EntailmentSentence)(_getFeatureValueNc(wrapGetIntCatchException(_FH_reference)));
  }
    
  /** setter for reference - sets Entailment reference 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(EntailmentSentence v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_reference), v);
  }    
    
   
    
  //*--------------*
  //* Feature: entailment

  /** getter for entailment - gets entailment
   * @generated
   * @return value of the feature 
   */
  public double getEntailment() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_entailment));
  }
    
  /** setter for entailment - sets entailment 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEntailment(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_entailment), v);
  }    
    
   
    
  //*--------------*
  //* Feature: contradiction

  /** getter for contradiction - gets contradiction
   * @generated
   * @return value of the feature 
   */
  public double getContradiction() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_contradiction));
  }
    
  /** setter for contradiction - sets contradiction 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContradiction(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_contradiction), v);
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

    