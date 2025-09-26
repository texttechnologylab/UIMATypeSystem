

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:44:15 CEST 2025 */

package org.texttechnologylab.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** Suffix Prompt for LLM. It is optional, if not set, will be placed after the user Prompt. For example adding additional information to the Prompt.
 * Updated by JCasGen Fri Sep 26 15:44:15 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LLMSuffixPrompt extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.type.LLMSuffixPrompt";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LLMSuffixPrompt.class);
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
  private final static CallSite _FC_message = TypeSystemImpl.createCallSite(LLMSuffixPrompt.class, "message");
  private final static MethodHandle _FH_message = _FC_message.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected LLMSuffixPrompt() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public LLMSuffixPrompt(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LLMSuffixPrompt(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LLMSuffixPrompt(JCas jcas, int begin, int end) {
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

  /** getter for message - gets Suffix after the Prompt for LLM
   * @generated
   * @return value of the feature 
   */
  public String getMessage() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_message));
  }
    
  /** setter for message - sets Suffix after the Prompt for LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMessage(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_message), v);
  }    
    
  }

    