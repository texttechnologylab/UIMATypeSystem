

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Essay Score Model Meta Data LLM with Prompts and all additional information
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EssayScoreLLM extends EssayScoreModel {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EssayScoreLLM() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EssayScoreLLM(int addr, TOP_Type type) {
    super(addr, type);
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
    if (EssayScoreLLM_Type.featOkTst && ((EssayScoreLLM_Type)jcasType).casFeat_ModelName == null)
      jcasType.jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EssayScoreLLM_Type)jcasType).casFeatCode_ModelName);}
    
  /** setter for ModelName - sets ModelName of used LLM 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModelName(String v) {
    if (EssayScoreLLM_Type.featOkTst && ((EssayScoreLLM_Type)jcasType).casFeat_ModelName == null)
      jcasType.jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    jcasType.ll_cas.ll_setStringValue(addr, ((EssayScoreLLM_Type)jcasType).casFeatCode_ModelName, v);}    
   
    
  //*--------------*
  //* Feature: Response

  /** getter for Response - gets Complete Response of LLM with all kind of Information as Json String
   * @generated
   * @return value of the feature 
   */
  public String getResponse() {
    if (EssayScoreLLM_Type.featOkTst && ((EssayScoreLLM_Type)jcasType).casFeat_Response == null)
      jcasType.jcas.throwFeatMissing("Response", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EssayScoreLLM_Type)jcasType).casFeatCode_Response);}
    
  /** setter for Response - sets Complete Response of LLM with all kind of Information as Json String 
   * @generated
   * @param v value to set into the feature 
   */
  public void setResponse(String v) {
    if (EssayScoreLLM_Type.featOkTst && ((EssayScoreLLM_Type)jcasType).casFeat_Response == null)
      jcasType.jcas.throwFeatMissing("Response", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    jcasType.ll_cas.ll_setStringValue(addr, ((EssayScoreLLM_Type)jcasType).casFeatCode_Response, v);}    
   
    
  //*--------------*
  //* Feature: Contents

  /** getter for Contents - gets The extracted output of the LLM response
   * @generated
   * @return value of the feature 
   */
  public String getContents() {
    if (EssayScoreLLM_Type.featOkTst && ((EssayScoreLLM_Type)jcasType).casFeat_Contents == null)
      jcasType.jcas.throwFeatMissing("Contents", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EssayScoreLLM_Type)jcasType).casFeatCode_Contents);}
    
  /** setter for Contents - sets The extracted output of the LLM response 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContents(String v) {
    if (EssayScoreLLM_Type.featOkTst && ((EssayScoreLLM_Type)jcasType).casFeat_Contents == null)
      jcasType.jcas.throwFeatMissing("Contents", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    jcasType.ll_cas.ll_setStringValue(addr, ((EssayScoreLLM_Type)jcasType).casFeatCode_Contents, v);}    
   
    
  //*--------------*
  //* Feature: AdditionalInformation

  /** getter for AdditionalInformation - gets Further Information like used port, url and more which are not included in responses
   * @generated
   * @return value of the feature 
   */
  public String getAdditionalInformation() {
    if (EssayScoreLLM_Type.featOkTst && ((EssayScoreLLM_Type)jcasType).casFeat_AdditionalInformation == null)
      jcasType.jcas.throwFeatMissing("AdditionalInformation", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EssayScoreLLM_Type)jcasType).casFeatCode_AdditionalInformation);}
    
  /** setter for AdditionalInformation - sets Further Information like used port, url and more which are not included in responses 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdditionalInformation(String v) {
    if (EssayScoreLLM_Type.featOkTst && ((EssayScoreLLM_Type)jcasType).casFeat_AdditionalInformation == null)
      jcasType.jcas.throwFeatMissing("AdditionalInformation", "org.texttechnologylab.annotation.model.EssayScoreLLM");
    jcasType.ll_cas.ll_setStringValue(addr, ((EssayScoreLLM_Type)jcasType).casFeatCode_AdditionalInformation, v);}    
  }

    