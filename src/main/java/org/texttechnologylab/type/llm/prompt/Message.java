

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:45:56 CEST 2025 */

package org.texttechnologylab.type.llm.prompt;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** List of messages.
 * Updated by JCasGen Fri Sep 26 15:45:56 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Message extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.type.llm.prompt.Message";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Message.class);
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
   
  public final static String _FeatName_role = "role";
  public final static String _FeatName_content = "content";
  public final static String _FeatName_classModule = "classModule";
  public final static String _FeatName_className = "className";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_role = TypeSystemImpl.createCallSite(Message.class, "role");
  private final static MethodHandle _FH_role = _FC_role.dynamicInvoker();
  private final static CallSite _FC_content = TypeSystemImpl.createCallSite(Message.class, "content");
  private final static MethodHandle _FH_content = _FC_content.dynamicInvoker();
  private final static CallSite _FC_classModule = TypeSystemImpl.createCallSite(Message.class, "classModule");
  private final static MethodHandle _FH_classModule = _FC_classModule.dynamicInvoker();
  private final static CallSite _FC_className = TypeSystemImpl.createCallSite(Message.class, "className");
  private final static MethodHandle _FH_className = _FC_className.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Message() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Message(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Message(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Message(JCas jcas, int begin, int end) {
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
  //* Feature: role

  /** getter for role - gets Role, e.g. "system", "user", ...
   * @generated
   * @return value of the feature 
   */
  public String getRole() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_role));
  }
    
  /** setter for role - sets Role, e.g. "system", "user", ... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_role), v);
  }    
    
   
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets Message content.
   * @generated
   * @return value of the feature 
   */
  public String getContent() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_content));
  }
    
  /** setter for content - sets Message content. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_content), v);
  }    
    
   
    
  //*--------------*
  //* Feature: classModule

  /** getter for classModule - gets Name of the module of the class to use for constructing the message
   * @generated
   * @return value of the feature 
   */
  public String getClassModule() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_classModule));
  }
    
  /** setter for classModule - sets Name of the module of the class to use for constructing the message 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassModule(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_classModule), v);
  }    
    
   
    
  //*--------------*
  //* Feature: className

  /** getter for className - gets Name of the class to use for constructing the message
   * @generated
   * @return value of the feature 
   */
  public String getClassName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_className));
  }
    
  /** setter for className - sets Name of the class to use for constructing the message 
   * @generated
   * @param v value to set into the feature 
   */
  public void setClassName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_className), v);
  }    
    
  }

    