

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;


/** Sentiment Output
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class SentimentModel extends SentimentBert {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentimentModel.class);
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
  protected SentimentModel() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SentimentModel(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentimentModel(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SentimentModel(JCas jcas, int begin, int end) {
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
    if (SentimentModel_Type.featOkTst && ((SentimentModel_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.SentimentModel");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SentimentModel_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (SentimentModel_Type.featOkTst && ((SentimentModel_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.SentimentModel");
    jcasType.ll_cas.ll_setRefValue(addr, ((SentimentModel_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    