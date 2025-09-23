

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:58 CEST 2025 */

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
 * Updated by JCasGen Tue Sep 23 14:56:58 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LanguageModel extends AnnotationBase {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.LanguageModel";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LanguageModel.class);
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
   
  public final static String _FeatName_Language = "Language";
  public final static String _FeatName_Model = "Model";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_Language = TypeSystemImpl.createCallSite(LanguageModel.class, "Language");
  private final static MethodHandle _FH_Language = _FC_Language.dynamicInvoker();
  private final static CallSite _FC_Model = TypeSystemImpl.createCallSite(LanguageModel.class, "Model");
  private final static MethodHandle _FH_Model = _FC_Model.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected LanguageModel() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public LanguageModel(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LanguageModel(JCas jcas) {
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
  //* Feature: Language

  /** getter for Language - gets 
   * @generated
   * @return value of the feature 
   */
  public Language getLanguage() { 
    return (Language)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Language)));
  }
    
  /** setter for Language - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(Language v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Language), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Model

  /** getter for Model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() { 
    return (MetaData)(_getFeatureValueNc(wrapGetIntCatchException(_FH_Model)));
  }
    
  /** setter for Model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_Model), v);
  }    
    
  }

    