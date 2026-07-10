

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LanguageModel extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LanguageModel.class);
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
  protected LanguageModel() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LanguageModel(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LanguageModel(JCas jcas) {
    super(jcas);
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
  //* Feature: Language

  /** getter for Language - gets 
   * @generated
   * @return value of the feature 
   */
  public Language getLanguage() {
    if (LanguageModel_Type.featOkTst && ((LanguageModel_Type)jcasType).casFeat_Language == null)
      jcasType.jcas.throwFeatMissing("Language", "org.texttechnologylab.annotation.LanguageModel");
    return (Language)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LanguageModel_Type)jcasType).casFeatCode_Language)));}
    
  /** setter for Language - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLanguage(Language v) {
    if (LanguageModel_Type.featOkTst && ((LanguageModel_Type)jcasType).casFeat_Language == null)
      jcasType.jcas.throwFeatMissing("Language", "org.texttechnologylab.annotation.LanguageModel");
    jcasType.ll_cas.ll_setRefValue(addr, ((LanguageModel_Type)jcasType).casFeatCode_Language, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Model

  /** getter for Model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (LanguageModel_Type.featOkTst && ((LanguageModel_Type)jcasType).casFeat_Model == null)
      jcasType.jcas.throwFeatMissing("Model", "org.texttechnologylab.annotation.LanguageModel");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LanguageModel_Type)jcasType).casFeatCode_Model)));}
    
  /** setter for Model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (LanguageModel_Type.featOkTst && ((LanguageModel_Type)jcasType).casFeat_Model == null)
      jcasType.jcas.throwFeatMissing("Model", "org.texttechnologylab.annotation.LanguageModel");
    jcasType.ll_cas.ll_setRefValue(addr, ((LanguageModel_Type)jcasType).casFeatCode_Model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    