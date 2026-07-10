

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.texttechnologylab.annotation.model.MetaData;
import org.apache.uima.jcas.cas.AnnotationBase;


/** Readability Output
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Readability extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Readability.class);
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
  protected Readability() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Readability(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Readability(JCas jcas) {
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
  //* Feature: TextReadabilities

  /** getter for TextReadabilities - gets Set of Text Readability with key and Value
   * @generated
   * @return value of the feature 
   */
  public FSArray getTextReadabilities() {
    if (Readability_Type.featOkTst && ((Readability_Type)jcasType).casFeat_TextReadabilities == null)
      jcasType.jcas.throwFeatMissing("TextReadabilities", "org.texttechnologylab.annotation.Readability");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Readability_Type)jcasType).casFeatCode_TextReadabilities)));}
    
  /** setter for TextReadabilities - sets Set of Text Readability with key and Value 
   * @generated
   * @param v value to set into the feature 
   */
  public void setTextReadabilities(FSArray v) {
    if (Readability_Type.featOkTst && ((Readability_Type)jcasType).casFeat_TextReadabilities == null)
      jcasType.jcas.throwFeatMissing("TextReadabilities", "org.texttechnologylab.annotation.Readability");
    jcasType.ll_cas.ll_setRefValue(addr, ((Readability_Type)jcasType).casFeatCode_TextReadabilities, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for TextReadabilities - gets an indexed value - Set of Text Readability with key and Value
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public AnnotationComment getTextReadabilities(int i) {
    if (Readability_Type.featOkTst && ((Readability_Type)jcasType).casFeat_TextReadabilities == null)
      jcasType.jcas.throwFeatMissing("TextReadabilities", "org.texttechnologylab.annotation.Readability");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Readability_Type)jcasType).casFeatCode_TextReadabilities), i);
    return (AnnotationComment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Readability_Type)jcasType).casFeatCode_TextReadabilities), i)));}

  /** indexed setter for TextReadabilities - sets an indexed value - Set of Text Readability with key and Value
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setTextReadabilities(int i, AnnotationComment v) { 
    if (Readability_Type.featOkTst && ((Readability_Type)jcasType).casFeat_TextReadabilities == null)
      jcasType.jcas.throwFeatMissing("TextReadabilities", "org.texttechnologylab.annotation.Readability");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Readability_Type)jcasType).casFeatCode_TextReadabilities), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Readability_Type)jcasType).casFeatCode_TextReadabilities), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: model

  /** getter for model - gets Which Model or Process was used to Compute the TextReadability
   * @generated
   * @return value of the feature 
   */
  public MetaData getModel() {
    if (Readability_Type.featOkTst && ((Readability_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Readability");
    return (MetaData)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Readability_Type)jcasType).casFeatCode_model)));}
    
  /** setter for model - sets Which Model or Process was used to Compute the TextReadability 
   * @generated
   * @param v value to set into the feature 
   */
  public void setModel(MetaData v) {
    if (Readability_Type.featOkTst && ((Readability_Type)jcasType).casFeat_model == null)
      jcasType.jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Readability");
    jcasType.ll_cas.ll_setRefValue(addr, ((Readability_Type)jcasType).casFeatCode_model, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    