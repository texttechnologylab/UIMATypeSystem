

/* First created by JCasGen Thu Sep 10 17:49:15 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml.time;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isotimeml.TimeX3;


/** 
 * Updated by JCasGen Thu Sep 10 17:49:16 CEST 2020
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class Set extends TimeX3 {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Set.class);
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
  protected Set() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Set(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Set(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Set(JCas jcas, int begin, int end) {
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
  //* Feature: quant

  /** getter for quant - gets 
   * @generated
   * @return value of the feature 
   */
  public String getQuant() {
    if (Set_Type.featOkTst && ((Set_Type)jcasType).casFeat_quant == null)
      jcasType.jcas.throwFeatMissing("quant", "org.texttechnologylab.annotation.semaf.isotimeml.time.Set");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Set_Type)jcasType).casFeatCode_quant);}
    
  /** setter for quant - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setQuant(String v) {
    if (Set_Type.featOkTst && ((Set_Type)jcasType).casFeat_quant == null)
      jcasType.jcas.throwFeatMissing("quant", "org.texttechnologylab.annotation.semaf.isotimeml.time.Set");
    jcasType.ll_cas.ll_setStringValue(addr, ((Set_Type)jcasType).casFeatCode_quant, v);}    
   
    
  //*--------------*
  //* Feature: freq

  /** getter for freq - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFreq() {
    if (Set_Type.featOkTst && ((Set_Type)jcasType).casFeat_freq == null)
      jcasType.jcas.throwFeatMissing("freq", "org.texttechnologylab.annotation.semaf.isotimeml.time.Set");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Set_Type)jcasType).casFeatCode_freq);}
    
  /** setter for freq - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFreq(String v) {
    if (Set_Type.featOkTst && ((Set_Type)jcasType).casFeat_freq == null)
      jcasType.jcas.throwFeatMissing("freq", "org.texttechnologylab.annotation.semaf.isotimeml.time.Set");
    jcasType.ll_cas.ll_setStringValue(addr, ((Set_Type)jcasType).casFeatCode_freq, v);}    
  }

    