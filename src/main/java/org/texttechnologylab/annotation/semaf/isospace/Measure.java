

/* First created by JCasGen Tue Mar 24 15:23:19 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isobase.Signal;


/** 
 * Updated by JCasGen Wed Apr 01 13:38:51 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class Measure extends Signal {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Measure.class);
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
  protected Measure() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Measure(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Measure(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Measure(JCas jcas, int begin, int end) {
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
  //* Feature: value

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (Measure_Type.featOkTst && ((Measure_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isospace.Measure");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Measure_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Measure_Type.featOkTst && ((Measure_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isospace.Measure");
    jcasType.ll_cas.ll_setStringValue(addr, ((Measure_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: unit

  /** getter for unit - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUnit() {
    if (Measure_Type.featOkTst && ((Measure_Type)jcasType).casFeat_unit == null)
      jcasType.jcas.throwFeatMissing("unit", "org.texttechnologylab.annotation.semaf.isospace.Measure");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Measure_Type)jcasType).casFeatCode_unit);}
    
  /** setter for unit - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUnit(String v) {
    if (Measure_Type.featOkTst && ((Measure_Type)jcasType).casFeat_unit == null)
      jcasType.jcas.throwFeatMissing("unit", "org.texttechnologylab.annotation.semaf.isospace.Measure");
    jcasType.ll_cas.ll_setStringValue(addr, ((Measure_Type)jcasType).casFeatCode_unit, v);}    
  }

    