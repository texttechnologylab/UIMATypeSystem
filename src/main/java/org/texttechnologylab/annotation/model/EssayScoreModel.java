

/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.EssayScore;
import org.apache.uima.jcas.tcas.Annotation;


/** Essay Score Model Meta Data
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class EssayScoreModel extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EssayScoreModel.class);
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
  protected EssayScoreModel() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public EssayScoreModel(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public EssayScoreModel(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public EssayScoreModel(JCas jcas, int begin, int end) {
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
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (EssayScoreModel_Type.featOkTst && ((EssayScoreModel_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.model.EssayScoreModel");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EssayScoreModel_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (EssayScoreModel_Type.featOkTst && ((EssayScoreModel_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.model.EssayScoreModel");
    jcasType.ll_cas.ll_setRefValue(addr, ((EssayScoreModel_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ScoreReference

  /** getter for ScoreReference - gets 
   * @generated
   * @return value of the feature 
   */
  public EssayScore getScoreReference() {
    if (EssayScoreModel_Type.featOkTst && ((EssayScoreModel_Type)jcasType).casFeat_ScoreReference == null)
      jcasType.jcas.throwFeatMissing("ScoreReference", "org.texttechnologylab.annotation.model.EssayScoreModel");
    return (EssayScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EssayScoreModel_Type)jcasType).casFeatCode_ScoreReference)));}
    
  /** setter for ScoreReference - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScoreReference(EssayScore v) {
    if (EssayScoreModel_Type.featOkTst && ((EssayScoreModel_Type)jcasType).casFeat_ScoreReference == null)
      jcasType.jcas.throwFeatMissing("ScoreReference", "org.texttechnologylab.annotation.model.EssayScoreModel");
    jcasType.ll_cas.ll_setRefValue(addr, ((EssayScoreModel_Type)jcasType).casFeatCode_ScoreReference, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    