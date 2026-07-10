

/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** Represents a topic instance with a value/label and associated probability
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class TopicValue extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TopicValue.class);
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
  protected TopicValue() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TopicValue(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TopicValue(JCas jcas) {
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
  //* Feature: value

  /** getter for value - gets Topic label for the topic instance
   * @generated
   * @return value of the feature 
   */
  public String getValue() {
    if (TopicValue_Type.featOkTst && ((TopicValue_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.TopicValue");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TopicValue_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets Topic label for the topic instance 
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(String v) {
    if (TopicValue_Type.featOkTst && ((TopicValue_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.TopicValue");
    jcasType.ll_cas.ll_setStringValue(addr, ((TopicValue_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: probability

  /** getter for probability - gets The probability associated with the topic instance
   * @generated
   * @return value of the feature 
   */
  public double getProbability() {
    if (TopicValue_Type.featOkTst && ((TopicValue_Type)jcasType).casFeat_probability == null)
      jcasType.jcas.throwFeatMissing("probability", "org.texttechnologylab.annotation.TopicValue");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TopicValue_Type)jcasType).casFeatCode_probability);}
    
  /** setter for probability - sets The probability associated with the topic instance 
   * @generated
   * @param v value to set into the feature 
   */
  public void setProbability(double v) {
    if (TopicValue_Type.featOkTst && ((TopicValue_Type)jcasType).casFeat_probability == null)
      jcasType.jcas.throwFeatMissing("probability", "org.texttechnologylab.annotation.TopicValue");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TopicValue_Type)jcasType).casFeatCode_probability, v);}    
  }

    