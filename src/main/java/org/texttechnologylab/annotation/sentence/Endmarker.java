

/* First created by JCasGen Tue Feb 16 16:51:35 CET 2021 */
package org.texttechnologylab.annotation.sentence;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri May 12 16:52:40 CEST 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyAnnotation.xml
 * @generated */
public class Endmarker extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Endmarker.class);
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
  protected Endmarker() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Endmarker(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Endmarker(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Endmarker(JCas jcas, int begin, int end) {
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
    if (Endmarker_Type.featOkTst && ((Endmarker_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.sentence.Endmarker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Endmarker_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (Endmarker_Type.featOkTst && ((Endmarker_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.sentence.Endmarker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Endmarker_Type)jcasType).casFeatCode_value, v);}    
  }

    