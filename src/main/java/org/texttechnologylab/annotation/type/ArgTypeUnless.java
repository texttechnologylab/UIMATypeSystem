

/* First created by JCasGen Wed Dec 02 18:39:48 CET 2020 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** 
 * Updated by JCasGen Wed Dec 02 18:39:50 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyArgAnno.xml
 * @generated */
public class ArgTypeUnless extends ArgType {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ArgTypeUnless.class);
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
  protected ArgTypeUnless() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ArgTypeUnless(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ArgTypeUnless(JCas jcas) {
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
  //* Feature: counterRebuttal

  /** getter for counterRebuttal - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getCounterRebuttal() {
    if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type)jcasType).casFeat_counterRebuttal == null)
      jcasType.jcas.throwFeatMissing("counterRebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_counterRebuttal)));}
    
  /** setter for counterRebuttal - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCounterRebuttal(FSArray v) {
    if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type)jcasType).casFeat_counterRebuttal == null)
      jcasType.jcas.throwFeatMissing("counterRebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    jcasType.ll_cas.ll_setRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_counterRebuttal, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for counterRebuttal - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public ArgTextSegment getCounterRebuttal(int i) {
    if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type)jcasType).casFeat_counterRebuttal == null)
      jcasType.jcas.throwFeatMissing("counterRebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_counterRebuttal), i);
    return (ArgTextSegment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_counterRebuttal), i)));}

  /** indexed setter for counterRebuttal - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setCounterRebuttal(int i, ArgTextSegment v) { 
    if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type)jcasType).casFeat_counterRebuttal == null)
      jcasType.jcas.throwFeatMissing("counterRebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_counterRebuttal), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_counterRebuttal), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: rebuttal

  /** getter for rebuttal - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getRebuttal() {
    if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type)jcasType).casFeat_rebuttal == null)
      jcasType.jcas.throwFeatMissing("rebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_rebuttal)));}
    
  /** setter for rebuttal - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRebuttal(FSArray v) {
    if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type)jcasType).casFeat_rebuttal == null)
      jcasType.jcas.throwFeatMissing("rebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    jcasType.ll_cas.ll_setRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_rebuttal, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for rebuttal - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public ArgTextSegment getRebuttal(int i) {
    if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type)jcasType).casFeat_rebuttal == null)
      jcasType.jcas.throwFeatMissing("rebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_rebuttal), i);
    return (ArgTextSegment)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_rebuttal), i)));}

  /** indexed setter for rebuttal - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setRebuttal(int i, ArgTextSegment v) { 
    if (ArgTypeUnless_Type.featOkTst && ((ArgTypeUnless_Type)jcasType).casFeat_rebuttal == null)
      jcasType.jcas.throwFeatMissing("rebuttal", "org.texttechnologylab.annotation.type.ArgTypeUnless");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_rebuttal), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((ArgTypeUnless_Type)jcasType).casFeatCode_rebuttal), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    