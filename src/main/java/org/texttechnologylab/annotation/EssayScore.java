

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Essay Score Output
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EssayScore extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EssayScore.class);
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
  protected EssayScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EssayScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EssayScore(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EssayScore(JCas jcas, int begin, int end) {
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
  //* Feature: Value

  /** getter for Value - gets Metric Feature Value
   * @generated
   * @return value of the feature 
   */
  public double getValue() {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_Value == null)
      jcasType.jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.EssayScore");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((EssayScore_Type)jcasType).casFeatCode_Value);}
    
  /** setter for Value - sets Metric Feature Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_Value == null)
      jcasType.jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.EssayScore");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((EssayScore_Type)jcasType).casFeatCode_Value, v);}    
   
    
  //*--------------*
  //* Feature: Name

  /** getter for Name - gets Metric Feature Name
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.EssayScore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EssayScore_Type)jcasType).casFeatCode_Name);}
    
  /** setter for Name - sets Metric Feature Name 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_Name == null)
      jcasType.jcas.throwFeatMissing("Name", "org.texttechnologylab.annotation.EssayScore");
    jcasType.ll_cas.ll_setStringValue(addr, ((EssayScore_Type)jcasType).casFeatCode_Name, v);}    
   
    
  //*--------------*
  //* Feature: Reason

  /** getter for Reason - gets LLM Reason for chosen Score
   * @generated
   * @return value of the feature 
   */
  public String getReason() {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_Reason == null)
      jcasType.jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.EssayScore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EssayScore_Type)jcasType).casFeatCode_Reason);}
    
  /** setter for Reason - sets LLM Reason for chosen Score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReason(String v) {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_Reason == null)
      jcasType.jcas.throwFeatMissing("Reason", "org.texttechnologylab.annotation.EssayScore");
    jcasType.ll_cas.ll_setStringValue(addr, ((EssayScore_Type)jcasType).casFeatCode_Reason, v);}    
   
    
  //*--------------*
  //* Feature: InputQuestion

  /** getter for InputQuestion - gets Chosen Question Div ID
   * @generated
   * @return value of the feature 
   */
  public AnnotationComment getInputQuestion() {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_InputQuestion == null)
      jcasType.jcas.throwFeatMissing("InputQuestion", "org.texttechnologylab.annotation.EssayScore");
    return (AnnotationComment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EssayScore_Type)jcasType).casFeatCode_InputQuestion)));}
    
  /** setter for InputQuestion - sets Chosen Question Div ID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInputQuestion(AnnotationComment v) {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_InputQuestion == null)
      jcasType.jcas.throwFeatMissing("InputQuestion", "org.texttechnologylab.annotation.EssayScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((EssayScore_Type)jcasType).casFeatCode_InputQuestion, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: InputAnswer

  /** getter for InputAnswer - gets Chosen Answer Div ID
   * @generated
   * @return value of the feature 
   */
  public AnnotationComment getInputAnswer() {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_InputAnswer == null)
      jcasType.jcas.throwFeatMissing("InputAnswer", "org.texttechnologylab.annotation.EssayScore");
    return (AnnotationComment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EssayScore_Type)jcasType).casFeatCode_InputAnswer)));}
    
  /** setter for InputAnswer - sets Chosen Answer Div ID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInputAnswer(AnnotationComment v) {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_InputAnswer == null)
      jcasType.jcas.throwFeatMissing("InputAnswer", "org.texttechnologylab.annotation.EssayScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((EssayScore_Type)jcasType).casFeatCode_InputAnswer, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: InputScene

  /** getter for InputScene - gets Chosen Scene Div ID
   * @generated
   * @return value of the feature 
   */
  public AnnotationComment getInputScene() {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_InputScene == null)
      jcasType.jcas.throwFeatMissing("InputScene", "org.texttechnologylab.annotation.EssayScore");
    return (AnnotationComment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EssayScore_Type)jcasType).casFeatCode_InputScene)));}
    
  /** setter for InputScene - sets Chosen Scene Div ID 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInputScene(AnnotationComment v) {
    if (EssayScore_Type.featOkTst && ((EssayScore_Type)jcasType).casFeat_InputScene == null)
      jcasType.jcas.throwFeatMissing("InputScene", "org.texttechnologylab.annotation.EssayScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((EssayScore_Type)jcasType).casFeatCode_InputScene, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    