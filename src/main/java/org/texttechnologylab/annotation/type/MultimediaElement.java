

/* First created by JCasGen Tue Jan 09 18:13:21 CET 2024 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Jan 18 16:13:28 CET 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyMultimedia.xml
 * @generated */
public class MultimediaElement extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MultimediaElement.class);
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
  protected MultimediaElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MultimediaElement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MultimediaElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MultimediaElement(JCas jcas, int begin, int end) {
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
  //* Feature: timeStart

  /** getter for timeStart - gets 
   * @generated
   * @return value of the feature 
   */
  public float getTimeStart() {
    if (MultimediaElement_Type.featOkTst && ((MultimediaElement_Type)jcasType).casFeat_timeStart == null)
      jcasType.jcas.throwFeatMissing("timeStart", "org.texttechnologylab.annotation.type.MultimediaElement");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((MultimediaElement_Type)jcasType).casFeatCode_timeStart);}
    
  /** setter for timeStart - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimeStart(float v) {
    if (MultimediaElement_Type.featOkTst && ((MultimediaElement_Type)jcasType).casFeat_timeStart == null)
      jcasType.jcas.throwFeatMissing("timeStart", "org.texttechnologylab.annotation.type.MultimediaElement");
    jcasType.ll_cas.ll_setFloatValue(addr, ((MultimediaElement_Type)jcasType).casFeatCode_timeStart, v);}    
   
    
  //*--------------*
  //* Feature: timeEnd

  /** getter for timeEnd - gets 
   * @generated
   * @return value of the feature 
   */
  public float getTimeEnd() {
    if (MultimediaElement_Type.featOkTst && ((MultimediaElement_Type)jcasType).casFeat_timeEnd == null)
      jcasType.jcas.throwFeatMissing("timeEnd", "org.texttechnologylab.annotation.type.MultimediaElement");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((MultimediaElement_Type)jcasType).casFeatCode_timeEnd);}
    
  /** setter for timeEnd - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimeEnd(float v) {
    if (MultimediaElement_Type.featOkTst && ((MultimediaElement_Type)jcasType).casFeat_timeEnd == null)
      jcasType.jcas.throwFeatMissing("timeEnd", "org.texttechnologylab.annotation.type.MultimediaElement");
    jcasType.ll_cas.ll_setFloatValue(addr, ((MultimediaElement_Type)jcasType).casFeatCode_timeEnd, v);}    
  }

    