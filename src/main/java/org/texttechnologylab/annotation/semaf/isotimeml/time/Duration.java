

/* First created by JCasGen Wed Dec 02 18:39:57 CET 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml.time;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.semaf.isotimeml.TimeX3;


/** 
 * Updated by JCasGen Wed Dec 02 18:39:57 CET 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoMergeTypeSystem.xml
 * @generated */
public class Duration extends TimeX3 {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Duration.class);
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
  protected Duration() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Duration(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Duration(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Duration(JCas jcas, int begin, int end) {
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
  //* Feature: beginPoint

  /** getter for beginPoint - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getBeginPoint() {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_beginPoint == null)
      jcasType.jcas.throwFeatMissing("beginPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Duration");
    return (Date)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Duration_Type)jcasType).casFeatCode_beginPoint)));}
    
  /** setter for beginPoint - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginPoint(Date v) {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_beginPoint == null)
      jcasType.jcas.throwFeatMissing("beginPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Duration");
    jcasType.ll_cas.ll_setRefValue(addr, ((Duration_Type)jcasType).casFeatCode_beginPoint, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: endPoint

  /** getter for endPoint - gets 
   * @generated
   * @return value of the feature 
   */
  public Date getEndPoint() {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_endPoint == null)
      jcasType.jcas.throwFeatMissing("endPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Duration");
    return (Date)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Duration_Type)jcasType).casFeatCode_endPoint)));}
    
  /** setter for endPoint - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndPoint(Date v) {
    if (Duration_Type.featOkTst && ((Duration_Type)jcasType).casFeat_endPoint == null)
      jcasType.jcas.throwFeatMissing("endPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Duration");
    jcasType.ll_cas.ll_setRefValue(addr, ((Duration_Type)jcasType).casFeatCode_endPoint, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    