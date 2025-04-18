


/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 04:00:59 CEST 2025 */

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
 * Updated by JCasGen Fri Apr 18 04:00:59 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EntailmentGPT extends AnnotationBase {

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.EntailmentGPT";

  /** @generated
   * @ordered
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EntailmentGPT.class);
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
  public final static String _FeatName_Label = "Label";
  public final static String _FeatName_Confidence = "Confidence";
  public final static String _FeatName_Reason = "Reason";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(EntailmentGPT.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();
  private final static CallSite _FC_Label = TypeSystemImpl.createCallSite(EntailmentGPT.class, "Label");
  private final static MethodHandle _FH_Label = _FC_Label.dynamicInvoker();
  private final static CallSite _FC_Confidence = TypeSystemImpl.createCallSite(EntailmentGPT.class, "Confidence");
  private final static MethodHandle _FH_Confidence = _FC_Confidence.dynamicInvoker();
  private final static CallSite _FC_Reason = TypeSystemImpl.createCallSite(EntailmentGPT.class, "Reason");
  private final static MethodHandle _FH_Reason = _FC_Reason.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(EntailmentGPT.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();


  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected EntailmentGPT() {/* intentionally empty block */}

  /** Internal - constructor used by generator
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure
   */
  public EntailmentGPT(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   */
  public EntailmentGPT(JCas jcas) {
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
  //* Feature: Label

  /** getter for Label - gets Label entailment or contradiction
   * @generated
   * @return value of the feature
   */
  public String getLabel() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_Label));
  }

  /** setter for Label - sets Label entailment or contradiction
   * @generated
   * @param v value to set into the feature
   */
  public void setLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Label), v);
  }



  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets Confidence value
   * @generated
   * @return value of the feature
   */
  public double getConfidence() {
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_Confidence));
  }

  /** setter for Confidence - sets Confidence value
   * @generated
   * @param v value to set into the feature
   */
  public void setConfidence(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_Confidence), v);
  }



  //*--------------*
  //* Feature: Reason

  /** getter for Reason - gets Reason for the decision
   * @generated
   * @return value of the feature
   */
  public String getReason() {
    return _getStringValueNc(wrapGetIntCatchException(_FH_Reason));
  }

  /** setter for Reason - sets Reason for the decision
   * @generated
   * @param v value to set into the feature
   */
  public void setReason(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Reason), v);
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

