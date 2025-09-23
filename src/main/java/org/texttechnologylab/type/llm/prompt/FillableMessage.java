

   
/* Apache UIMA v3 - First created by JCasGen Tue Sep 23 14:56:59 CEST 2025 */

package org.texttechnologylab.type.llm.prompt;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** This message is supposed to be filled by an LLM by using the previous messages as input/history.
 * Updated by JCasGen Tue Sep 23 14:56:59 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class FillableMessage extends Message {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.type.llm.prompt.FillableMessage";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(FillableMessage.class);
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
   
  public final static String _FeatName_contextName = "contextName";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_contextName = TypeSystemImpl.createCallSite(FillableMessage.class, "contextName");
  private final static MethodHandle _FH_contextName = _FC_contextName.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected FillableMessage() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public FillableMessage(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public FillableMessage(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public FillableMessage(JCas jcas, int begin, int end) {
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
  //* Feature: contextName

  /** getter for contextName - gets If a contextName is given, the "content" of this message will be added to the model invocation to be used in a template placeholder
   * @generated
   * @return value of the feature 
   */
  public String getContextName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_contextName));
  }
    
  /** setter for contextName - sets If a contextName is given, the "content" of this message will be added to the model invocation to be used in a template placeholder 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_contextName), v);
  }    
    
  }

    