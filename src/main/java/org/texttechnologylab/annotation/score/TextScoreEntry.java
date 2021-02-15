

/* First created by JCasGen Mon Feb 15 16:49:38 CET 2021 */
package org.texttechnologylab.annotation.score;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Mon Feb 15 16:49:38 CET 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyTextScore.xml
 * @generated */
public class TextScoreEntry extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextScoreEntry.class);
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
  protected TextScoreEntry() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TextScoreEntry(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TextScoreEntry(JCas jcas) {
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

  /** getter for value - gets 
   * @generated
   * @return value of the feature 
   */
  public double getValue() {
    if (TextScoreEntry_Type.featOkTst && ((TextScoreEntry_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.score.TextScoreEntry");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((TextScoreEntry_Type)jcasType).casFeatCode_value);}
    
  /** setter for value - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setValue(double v) {
    if (TextScoreEntry_Type.featOkTst && ((TextScoreEntry_Type)jcasType).casFeat_value == null)
      jcasType.jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.score.TextScoreEntry");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((TextScoreEntry_Type)jcasType).casFeatCode_value, v);}    
   
    
  //*--------------*
  //* Feature: key

  /** getter for key - gets 
   * @generated
   * @return value of the feature 
   */
  public String getKey() {
    if (TextScoreEntry_Type.featOkTst && ((TextScoreEntry_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.score.TextScoreEntry");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextScoreEntry_Type)jcasType).casFeatCode_key);}
    
  /** setter for key - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setKey(String v) {
    if (TextScoreEntry_Type.featOkTst && ((TextScoreEntry_Type)jcasType).casFeat_key == null)
      jcasType.jcas.throwFeatMissing("key", "org.texttechnologylab.annotation.score.TextScoreEntry");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextScoreEntry_Type)jcasType).casFeatCode_key, v);}    
   
    
  //*--------------*
  //* Feature: label

  /** getter for label - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabel() {
    if (TextScoreEntry_Type.featOkTst && ((TextScoreEntry_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.score.TextScoreEntry");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextScoreEntry_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (TextScoreEntry_Type.featOkTst && ((TextScoreEntry_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.score.TextScoreEntry");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextScoreEntry_Type)jcasType).casFeatCode_label, v);}    
  }

    