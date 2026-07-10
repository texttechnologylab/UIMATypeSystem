

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.tcas.Annotation;


/** Offensive speech output, not only offensive or not offensive, but also the type of offensive speech
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class OffensiveSpeech extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OffensiveSpeech.class);
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
  protected OffensiveSpeech() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OffensiveSpeech(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OffensiveSpeech(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public OffensiveSpeech(JCas jcas, int begin, int end) {
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
  //* Feature: Offensives

  /** getter for Offensives - gets Set of offensive types with key and Value
   * @generated
   * @return value of the feature 
   */
  public FSArray getOffensives() {
    if (OffensiveSpeech_Type.featOkTst && ((OffensiveSpeech_Type)jcasType).casFeat_Offensives == null)
      jcasType.jcas.throwFeatMissing("Offensives", "org.texttechnologylab.annotation.OffensiveSpeech");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((OffensiveSpeech_Type)jcasType).casFeatCode_Offensives)));}
    
  /** setter for Offensives - sets Set of offensive types with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOffensives(FSArray v) {
    if (OffensiveSpeech_Type.featOkTst && ((OffensiveSpeech_Type)jcasType).casFeat_Offensives == null)
      jcasType.jcas.throwFeatMissing("Offensives", "org.texttechnologylab.annotation.OffensiveSpeech");
    jcasType.ll_cas.ll_setRefValue(addr, ((OffensiveSpeech_Type)jcasType).casFeatCode_Offensives, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Offensives - gets an indexed value - Set of offensive types with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnnotationComment getOffensives(int i) {
    if (OffensiveSpeech_Type.featOkTst && ((OffensiveSpeech_Type)jcasType).casFeat_Offensives == null)
      jcasType.jcas.throwFeatMissing("Offensives", "org.texttechnologylab.annotation.OffensiveSpeech");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((OffensiveSpeech_Type)jcasType).casFeatCode_Offensives), i);
    return (AnnotationComment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((OffensiveSpeech_Type)jcasType).casFeatCode_Offensives), i)));}

  /** indexed setter for Offensives - sets an indexed value - Set of offensive types with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setOffensives(int i, AnnotationComment v) { 
    if (OffensiveSpeech_Type.featOkTst && ((OffensiveSpeech_Type)jcasType).casFeat_Offensives == null)
      jcasType.jcas.throwFeatMissing("Offensives", "org.texttechnologylab.annotation.OffensiveSpeech");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((OffensiveSpeech_Type)jcasType).casFeatCode_Offensives), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((OffensiveSpeech_Type)jcasType).casFeatCode_Offensives), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets The model which, was used for the classification
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (OffensiveSpeech_Type.featOkTst && ((OffensiveSpeech_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.OffensiveSpeech");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((OffensiveSpeech_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets The model which, was used for the classification 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (OffensiveSpeech_Type.featOkTst && ((OffensiveSpeech_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.OffensiveSpeech");
    jcasType.ll_cas.ll_setRefValue(addr, ((OffensiveSpeech_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    