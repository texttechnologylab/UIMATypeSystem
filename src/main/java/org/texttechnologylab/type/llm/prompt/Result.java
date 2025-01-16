

/* First created by JCasGen Thu Jan 16 13:35:57 CET 2025 */
package org.texttechnologylab.type.llm.prompt;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** LLM result
 * Updated by JCasGen Thu Jan 16 14:50:33 CET 2025
 * XML source: /home/staff_homes/dbaumart/dev/git/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyLLM.xml
 * @generated */
public class Result extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.type.llm.prompt.Result";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Result.class);
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
   
  public final static String _FeatName_content = "content";
  public final static String _FeatName_meta = "meta";
  public final static String _FeatName_prompt = "prompt";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_content = TypeSystemImpl.createCallSite(Result.class, "content");
  private final static MethodHandle _FH_content = _FC_content.dynamicInvoker();
  private final static CallSite _FC_meta = TypeSystemImpl.createCallSite(Result.class, "meta");
  private final static MethodHandle _FH_meta = _FC_meta.dynamicInvoker();
  private final static CallSite _FC_prompt = TypeSystemImpl.createCallSite(Result.class, "prompt");
  private final static MethodHandle _FH_prompt = _FC_prompt.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected Result() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Result(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Result(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Result(JCas jcas, int begin, int end) {
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
  //* Feature: content

  /** getter for content - gets Message content
   * @generated
   * @return value of the feature 
   */
  public String getContent() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_content));
  }
    
  /** setter for content - sets Message content 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_content), v);
  }    
    
   
    
  //*--------------*
  //* Feature: meta

  /** getter for meta - gets Additional metadata
   * @generated
   * @return value of the feature 
   */
  public String getMeta() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_meta));
  }
    
  /** setter for meta - sets Additional metadata 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMeta(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_meta), v);
  }    
    
   
    
  //*--------------*
  //* Feature: prompt

  /** getter for prompt - gets 
   * @generated
   * @return value of the feature 
   */
  public Prompt getPrompt() { 
    return (Prompt)(_getFeatureValueNc(wrapGetIntCatchException(_FH_prompt)));
  }
    
  /** setter for prompt - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrompt(Prompt v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_prompt), v);
  }    
    
  }

    