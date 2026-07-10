

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Hypothesis extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Hypothesis.class);
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
  protected Hypothesis() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Hypothesis(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Hypothesis(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Hypothesis(JCas jcas, int begin, int end) {
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
  //* Feature: Stances

  /** getter for Stances - gets Stances
   * @generated
   * @return value of the feature 
   */
  public FSArray getStances() {
    if (Hypothesis_Type.featOkTst && ((Hypothesis_Type)jcasType).casFeat_Stances == null)
      jcasType.jcas.throwFeatMissing("Stances", "org.texttechnologylab.annotation.Hypothesis");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Hypothesis_Type)jcasType).casFeatCode_Stances)));}
    
  /** setter for Stances - sets Stances 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStances(FSArray v) {
    if (Hypothesis_Type.featOkTst && ((Hypothesis_Type)jcasType).casFeat_Stances == null)
      jcasType.jcas.throwFeatMissing("Stances", "org.texttechnologylab.annotation.Hypothesis");
    jcasType.ll_cas.ll_setRefValue(addr, ((Hypothesis_Type)jcasType).casFeatCode_Stances, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for Stances - gets an indexed value - Stances
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public StanceSentence getStances(int i) {
    if (Hypothesis_Type.featOkTst && ((Hypothesis_Type)jcasType).casFeat_Stances == null)
      jcasType.jcas.throwFeatMissing("Stances", "org.texttechnologylab.annotation.Hypothesis");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Hypothesis_Type)jcasType).casFeatCode_Stances), i);
    return (StanceSentence)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Hypothesis_Type)jcasType).casFeatCode_Stances), i)));}

  /** indexed setter for Stances - sets an indexed value - Stances
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setStances(int i, StanceSentence v) { 
    if (Hypothesis_Type.featOkTst && ((Hypothesis_Type)jcasType).casFeat_Stances == null)
      jcasType.jcas.throwFeatMissing("Stances", "org.texttechnologylab.annotation.Hypothesis");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Hypothesis_Type)jcasType).casFeatCode_Stances), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Hypothesis_Type)jcasType).casFeatCode_Stances), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    