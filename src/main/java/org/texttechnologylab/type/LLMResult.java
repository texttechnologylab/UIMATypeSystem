

   
/* Apache UIMA v3 - First created by JCasGen Fri Jun 06 21:55:41 CEST 2025 */

package org.texttechnologylab.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Result of LLM with the reference to the corresponding prompt.
 * Updated by JCasGen Fri Jun 06 21:55:41 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMResult extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.type.LLMResult";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMResult.class);
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
   
  public final static String _FeatName_meta = "meta";
  public final static String _FeatName_prompt = "prompt";
  public final static String _FeatName_result = "result";
  public final static String _FeatName_content = "content";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_meta = TypeSystemImpl.createCallSite(LLMResult.class, "meta");
  private final static MethodHandle _FH_meta = _FC_meta.dynamicInvoker();
  private final static CallSite _FC_prompt = TypeSystemImpl.createCallSite(LLMResult.class, "prompt");
  private final static MethodHandle _FH_prompt = _FC_prompt.dynamicInvoker();
  private final static CallSite _FC_result = TypeSystemImpl.createCallSite(LLMResult.class, "result");
  private final static MethodHandle _FH_result = _FC_result.dynamicInvoker();
  private final static CallSite _FC_content = TypeSystemImpl.createCallSite(LLMResult.class, "content");
  private final static MethodHandle _FH_content = _FC_content.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected LLMResult() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public LLMResult(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMResult(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMResult(JCas jcas, int begin, int end) {
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
  //* Feature: meta

  /** getter for meta - gets Additional metadata (Parameter). Additionally the duration
   * @generated
   * @return value of the feature 
   */
  public String getMeta() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_meta));
  }
    
  /** setter for meta - sets Additional metadata (Parameter). Additionally the duration 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeta(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_meta), v);
  }    
    
   
    
  //*--------------*
  //* Feature: prompt

  /** getter for prompt - gets Reference to the corresponding prompt
   * @generated
   * @return value of the feature 
   */
  public LLMPrompt getPrompt() { 
    return (LLMPrompt)(_getFeatureValueNc(wrapGetIntCatchException(_FH_prompt)));
  }
    
  /** setter for prompt - sets Reference to the corresponding prompt 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrompt(LLMPrompt v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_prompt), v);
  }    
    
   
    
  //*--------------*
  //* Feature: result

  /** getter for result - gets Result in a json-String Format of LLM
   * @generated
   * @return value of the feature 
   */
  public String getResult() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_result));
  }
    
  /** setter for result - sets Result in a json-String Format of LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setResult(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_result), v);
  }    
    
   
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets Content of result as string extracted from the result.
   * @generated
   * @return value of the feature 
   */
  public String getContent() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_content));
  }
    
  /** setter for content - sets Content of result as string extracted from the result. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_content), v);
  }    
    
  }

    