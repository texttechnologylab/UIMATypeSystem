

   
/* Apache UIMA v3 - First created by JCasGen Tue Aug 12 08:54:05 CEST 2025 */

package org.texttechnologylab.annotation.model;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;




/** Essay Score Model Meta Data LLM with Prompts and all additional information
 * Updated by JCasGen Tue Aug 12 08:54:05 CEST 2025
 * XML source: /home/bagci/projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EssayScoreLLM extends EssayScoreModel {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.model.EssayScoreLLM";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EssayScoreLLM.class);
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
   
  public final static String _FeatName_ModelName = "ModelName";
  public final static String _FeatName_Response = "Response";
  public final static String _FeatName_Contents = "Contents";
  public final static String _FeatName_AdditionalInformation = "AdditionalInformation";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_ModelName = TypeSystemImpl.createCallSite(EssayScoreLLM.class, "ModelName");
  private final static MethodHandle _FH_ModelName = _FC_ModelName.dynamicInvoker();
  private final static CallSite _FC_Response = TypeSystemImpl.createCallSite(EssayScoreLLM.class, "Response");
  private final static MethodHandle _FH_Response = _FC_Response.dynamicInvoker();
  private final static CallSite _FC_Contents = TypeSystemImpl.createCallSite(EssayScoreLLM.class, "Contents");
  private final static MethodHandle _FH_Contents = _FC_Contents.dynamicInvoker();
  private final static CallSite _FC_AdditionalInformation = TypeSystemImpl.createCallSite(EssayScoreLLM.class, "AdditionalInformation");
  private final static MethodHandle _FH_AdditionalInformation = _FC_AdditionalInformation.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected EssayScoreLLM() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public EssayScoreLLM(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EssayScoreLLM(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EssayScoreLLM(JCas jcas, int begin, int end) {
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
  //* Feature: ModelName

  /** getter for ModelName - gets ModelName of used LLM
   * @generated
   * @return value of the feature 
   */
  public String getModelName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_ModelName));
  }
    
  /** setter for ModelName - sets ModelName of used LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_ModelName), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Response

  /** getter for Response - gets Complete Response of LLM with all kind of Information as Json String
   * @generated
   * @return value of the feature 
   */
  public String getResponse() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Response));
  }
    
  /** setter for Response - sets Complete Response of LLM with all kind of Information as Json String 
   * @generated
   * @param v value to set into the feature 
   */
  public void setResponse(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Response), v);
  }    
    
   
    
  //*--------------*
  //* Feature: Contents

  /** getter for Contents - gets The extracted output of the LLM response
   * @generated
   * @return value of the feature 
   */
  public String getContents() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_Contents));
  }
    
  /** setter for Contents - sets The extracted output of the LLM response 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContents(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_Contents), v);
  }    
    
   
    
  //*--------------*
  //* Feature: AdditionalInformation

  /** getter for AdditionalInformation - gets Further Information like used port, url and more which are not included in responses
   * @generated
   * @return value of the feature 
   */
  public String getAdditionalInformation() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_AdditionalInformation));
  }
    
  /** setter for AdditionalInformation - sets Further Information like used port, url and more which are not included in responses 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdditionalInformation(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_AdditionalInformation), v);
  }    
    
  }

    