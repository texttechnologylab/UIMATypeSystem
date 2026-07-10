

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.luminar;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A typesystem for the Luminar AI detector, providing probabilities that a given document is AI-generated or not.
                Depending on the model, this is done on document-level only or on sequence- and document-level.
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class AIDetection extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AIDetection.class);
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
  protected AIDetection() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AIDetection(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AIDetection(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AIDetection(JCas jcas, int begin, int end) {
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
  //* Feature: detectionScore

  /** getter for detectionScore - gets Ranging from 0 to 1, where near 0 means likely human and near 1 means likely AI.
   * @generated
   * @return value of the feature 
   */
  public double getDetectionScore() {
    if (AIDetection_Type.featOkTst && ((AIDetection_Type)jcasType).casFeat_detectionScore == null)
      jcasType.jcas.throwFeatMissing("detectionScore", "org.texttechnologylab.annotation.luminar.AIDetection");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((AIDetection_Type)jcasType).casFeatCode_detectionScore);}
    
  /** setter for detectionScore - sets Ranging from 0 to 1, where near 0 means likely human and near 1 means likely AI. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDetectionScore(double v) {
    if (AIDetection_Type.featOkTst && ((AIDetection_Type)jcasType).casFeat_detectionScore == null)
      jcasType.jcas.throwFeatMissing("detectionScore", "org.texttechnologylab.annotation.luminar.AIDetection");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((AIDetection_Type)jcasType).casFeatCode_detectionScore, v);}    
   
    
  //*--------------*
  //* Feature: level

  /** getter for level - gets The level on which this detection was applied, e.g. SEQUENCE or DOCUMENT level.
   * @generated
   * @return value of the feature 
   */
  public String getLevel() {
    if (AIDetection_Type.featOkTst && ((AIDetection_Type)jcasType).casFeat_level == null)
      jcasType.jcas.throwFeatMissing("level", "org.texttechnologylab.annotation.luminar.AIDetection");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AIDetection_Type)jcasType).casFeatCode_level);}
    
  /** setter for level - sets The level on which this detection was applied, e.g. SEQUENCE or DOCUMENT level. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLevel(String v) {
    if (AIDetection_Type.featOkTst && ((AIDetection_Type)jcasType).casFeat_level == null)
      jcasType.jcas.throwFeatMissing("level", "org.texttechnologylab.annotation.luminar.AIDetection");
    jcasType.ll_cas.ll_setStringValue(addr, ((AIDetection_Type)jcasType).casFeatCode_level, v);}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets The model version used for this detection annotation.
   * @generated
   * @return value of the feature 
   */
  public String getModel() {
    if (AIDetection_Type.featOkTst && ((AIDetection_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.luminar.AIDetection");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AIDetection_Type)jcasType).casFeatCode_model);}
    
  /** setter for model - sets The model version used for this detection annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(String v) {
    if (AIDetection_Type.featOkTst && ((AIDetection_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.luminar.AIDetection");
    jcasType.ll_cas.ll_setStringValue(addr, ((AIDetection_Type)jcasType).casFeatCode_model, v);}    
  }

    