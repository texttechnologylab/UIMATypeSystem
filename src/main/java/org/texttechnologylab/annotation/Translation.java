

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.model.MetaData;


/** Summary of input text
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Translation extends Language {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Translation.class);
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
  protected Translation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Translation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Translation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Translation(JCas jcas, int begin, int end) {
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
  //* Feature: context

  /** getter for context - gets Translated Text
   * @generated
   * @return value of the feature 
   */
  public String getContext() {
    if (Translation_Type.featOkTst && ((Translation_Type)jcasType).casFeat_context == null)
      jcasType.jcas.throwFeatMissing("context", "org.texttechnologylab.annotation.Translation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Translation_Type)jcasType).casFeatCode_context);}
    
  /** setter for context - sets Translated Text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContext(String v) {
    if (Translation_Type.featOkTst && ((Translation_Type)jcasType).casFeat_context == null)
      jcasType.jcas.throwFeatMissing("context", "org.texttechnologylab.annotation.Translation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Translation_Type)jcasType).casFeatCode_context, v);}    
   
    
  //*--------------*
  //* Feature: Reference

  /** getter for Reference - gets Reference to given Input Language Annotation
   * @generated
   * @return value of the feature 
   */
  public Language getReference() {
    if (Translation_Type.featOkTst && ((Translation_Type)jcasType).casFeat_Reference == null)
      jcasType.jcas.throwFeatMissing("Reference", "org.texttechnologylab.annotation.Translation");
    return (Language)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Translation_Type)jcasType).casFeatCode_Reference)));}
    
  /** setter for Reference - sets Reference to given Input Language Annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(Language v) {
    if (Translation_Type.featOkTst && ((Translation_Type)jcasType).casFeat_Reference == null)
      jcasType.jcas.throwFeatMissing("Reference", "org.texttechnologylab.annotation.Translation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Translation_Type)jcasType).casFeatCode_Reference, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets 
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Translation_Type.featOkTst && ((Translation_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Translation");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Translation_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Translation_Type.featOkTst && ((Translation_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Translation");
    jcasType.ll_cas.ll_setRefValue(addr, ((Translation_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    