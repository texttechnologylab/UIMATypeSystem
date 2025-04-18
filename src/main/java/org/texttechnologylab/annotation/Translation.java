

   
/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.annotation;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.model.MetaData;


/** Summary of input text
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Translation extends Language {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.Translation";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Translation.class);
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
   
  public final static String _FeatName_context = "context";
  public final static String _FeatName_Reference = "Reference";
  public final static String _FeatName_model = "model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_context = TypeSystemImpl.createCallSite(Translation.class, "context");
  private final static MethodHandle _FH_context = _FC_context.dynamicInvoker();
  private final static CallSite _FC_Reference = TypeSystemImpl.createCallSite(Translation.class, "Reference");
  private final static MethodHandle _FH_Reference = _FC_Reference.dynamicInvoker();
  private final static CallSite _FC_model = TypeSystemImpl.createCallSite(Translation.class, "model");
  private final static MethodHandle _FH_model = _FC_model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Translation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Translation(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Translation(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Translation(JCas jcas, int begin, int end) {
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
  //* Feature: context

  /** getter for context - gets Translated Text
   * @generated
   * @return value of the feature 
   */
  public String getContext() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_context));
  }
    
  /** setter for context - sets Translated Text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContext(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_context), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Reference

  /** getter for Reference - gets Reference to given Input Language Annotation
   * @generated
   * @return value of the feature 
   */
  public Language getReference() { 
    return (Language)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Reference)));
  }
    
  /** setter for Reference - sets Reference to given Input Language Annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(Language v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Reference), v);
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

    