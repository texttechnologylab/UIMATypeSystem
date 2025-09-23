

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:59 CEST 2025 */

package org.texttechnologylab.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** System Prompt for LLM, it is optional, if not set, already System Prompt in the LLM will be used or No System Prompt will be used
 * Updated by JCasGen Tue Sep 23 14:56:59 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMSystemPrompt extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.type.LLMSystemPrompt";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMSystemPrompt.class);
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
   
  public final static String _FeatName_message = "message";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_message = TypeSystemImpl.createCallSite(LLMSystemPrompt.class, "message");
  private final static MethodHandle _FH_message = _FC_message.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected LLMSystemPrompt() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public LLMSystemPrompt(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMSystemPrompt(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMSystemPrompt(JCas jcas, int begin, int end) {
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
  //* Feature: message

  /** getter for message - gets System Prompt for LLM
   * @generated
   * @return value of the feature 
   */
  public String getMessage() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_message));
  }
    
  /** setter for message - sets System Prompt for LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMessage(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_message), v);
  }    
    
  }

    