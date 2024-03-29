

/* First created by JCasGen Mon Feb 26 14:11:21 CET 2024 */
package org.texttechnologylab.type.morphosyn;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Feb 26 14:11:21 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TexttechnologyMorphosynTag.xml
 * @generated */
public class MorphosynTag extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MorphosynTag.class);
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
  protected MorphosynTag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public MorphosynTag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MorphosynTag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public MorphosynTag(JCas jcas, int begin, int end) {
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
    if (MorphosynTag_Type.featOkTst && ((MorphosynTag_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.type.morphosyn.MorphosynTag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MorphosynTag_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (MorphosynTag_Type.featOkTst && ((MorphosynTag_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.type.morphosyn.MorphosynTag");
    jcasType.ll_cas.ll_setStringValue(addr, ((MorphosynTag_Type)jcasType).casFeatCode_value, v);}    
  }

    