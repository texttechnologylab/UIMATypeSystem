

   
/* Apache UIMA v3 - First created by JCasGen Mon May 05 11:13:03 CEST 2025 */

package org.texttechnologylab.type.llm.prompt;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.tcas.Annotation;


/** Prompt for a LLM containing a list of "messages".
 * Updated by JCasGen Mon May 05 11:13:03 CEST 2025
 * XML source: /home/staff_homes/aabusale/LocalUIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Prompt extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.type.llm.prompt.Prompt";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Prompt.class);
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
   
  public final static String _FeatName_messages = "messages";
  public final static String _FeatName_args = "args";
  public final static String _FeatName_version = "version";
  public final static String _FeatName_reference = "reference";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_messages = TypeSystemImpl.createCallSite(Prompt.class, "messages");
  private final static MethodHandle _FH_messages = _FC_messages.dynamicInvoker();
  private final static CallSite _FC_args = TypeSystemImpl.createCallSite(Prompt.class, "args");
  private final static MethodHandle _FH_args = _FC_args.dynamicInvoker();
  private final static CallSite _FC_version = TypeSystemImpl.createCallSite(Prompt.class, "version");
  private final static MethodHandle _FH_version = _FC_version.dynamicInvoker();
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(Prompt.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Prompt() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Prompt(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Prompt(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Prompt(JCas jcas, int begin, int end) {
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
  //* Feature: messages

  /** getter for messages - gets The list of messages for this prompt.
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Message> getMessages() { 
    return (FSArray<Message>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_messages)));
  }
    
  /** setter for messages - sets The list of messages for this prompt. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMessages(FSArray<Message> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_messages), v);
  }    
    
    
  /** indexed getter for messages - gets an indexed value - The list of messages for this prompt.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Message getMessages(int i) {
     return (Message)(((FSArray<Message>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_messages)))).get(i));
  } 

  /** indexed setter for messages - sets an indexed value - The list of messages for this prompt.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setMessages(int i, Message v) {
    ((FSArray<Message>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_messages)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: args

  /** getter for args - gets Prompt arguments
   * @generated
   * @return value of the feature 
   */
  public String getArgs() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_args));
  }
    
  /** setter for args - sets Prompt arguments 
   * @generated
   * @param v value to set into the feature 
   */
  public void setArgs(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_args), v);
  }    
    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVersion() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_version));
  }
    
  /** setter for version - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_version), v);
  }    
    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets Reference to another annotation
   * @generated
   * @return value of the feature 
   */
  public TOP getReference() { 
    return (TOP)(_getFeatureValueNc(wrapGetIntCatchException(_FH_reference)));
  }
    
  /** setter for reference - sets Reference to another annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(TOP v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_reference), v);
  }    
    
  }

    