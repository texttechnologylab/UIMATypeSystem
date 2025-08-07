

   
/* Apache UIMA v3 - First created by JCasGen Fri Aug 01 12:46:51 CEST 2025 */

package org.texttechnologylab.type;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.tcas.Annotation;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/** Prompt for LLM with the input text. The user Prompt is mandatory, if not set, the LLM will not be called.
 * Updated by JCasGen Fri Aug 01 12:46:51 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMPrompt extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.type.LLMPrompt";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMPrompt.class);
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
   
  public final static String _FeatName_prompt = "prompt";
  public final static String _FeatName_prefix = "prefix";
  public final static String _FeatName_suffix = "suffix";
  public final static String _FeatName_systemPrompt = "systemPrompt";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_prompt = TypeSystemImpl.createCallSite(LLMPrompt.class, "prompt");
  private final static MethodHandle _FH_prompt = _FC_prompt.dynamicInvoker();
  private final static CallSite _FC_prefix = TypeSystemImpl.createCallSite(LLMPrompt.class, "prefix");
  private final static MethodHandle _FH_prefix = _FC_prefix.dynamicInvoker();
  private final static CallSite _FC_suffix = TypeSystemImpl.createCallSite(LLMPrompt.class, "suffix");
  private final static MethodHandle _FH_suffix = _FC_suffix.dynamicInvoker();
  private final static CallSite _FC_systemPrompt = TypeSystemImpl.createCallSite(LLMPrompt.class, "systemPrompt");
  private final static MethodHandle _FH_systemPrompt = _FC_systemPrompt.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected LLMPrompt() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public LLMPrompt(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMPrompt(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMPrompt(JCas jcas, int begin, int end) {
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
  //* Feature: prompt

  /** getter for prompt - gets Prompt for LLM
   * @generated
   * @return value of the feature 
   */
  public String getPrompt() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_prompt));
  }
    
  /** setter for prompt - sets Prompt for LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrompt(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_prompt), v);
  }    
    
   
    
  //*--------------*
  //* Feature: prefix

  /** getter for prefix - gets Prefix of the Prompt
   * @generated
   * @return value of the feature 
   */
  public LLMPrefixPrompt getPrefix() { 
    return (LLMPrefixPrompt)(_getFeatureValueNc(wrapGetIntCatchException(_FH_prefix)));
  }
    
  /** setter for prefix - sets Prefix of the Prompt 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrefix(LLMPrefixPrompt v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_prefix), v);
  }    
    
   
    
  //*--------------*
  //* Feature: suffix

  /** getter for suffix - gets Suffix after the Prompt for the LLM
   * @generated
   * @return value of the feature 
   */
  public LLMSuffixPrompt getSuffix() { 
    return (LLMSuffixPrompt)(_getFeatureValueNc(wrapGetIntCatchException(_FH_suffix)));
  }
    
  /** setter for suffix - sets Suffix after the Prompt for the LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuffix(LLMSuffixPrompt v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_suffix), v);
  }    
    
   
    
  //*--------------*
  //* Feature: systemPrompt

  /** getter for systemPrompt - gets System Prompt for LLM
   * @generated
   * @return value of the feature 
   */
  public LLMSystemPrompt getSystemPrompt() { 
    return (LLMSystemPrompt)(_getFeatureValueNc(wrapGetIntCatchException(_FH_systemPrompt)));
  }
    
  /** setter for systemPrompt - sets System Prompt for LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSystemPrompt(LLMSystemPrompt v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_systemPrompt), v);
  }    
    
  }

    