

/* First created by JCasGen Mon Feb 15 13:21:45 CET 2021 */
package org.texttechnologylab.annotation.score;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Mon Feb 15 13:21:45 CET 2021
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextScore.xml
 * @generated */
public class TextScore extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TextScore.class);
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
  protected TextScore() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public TextScore(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public TextScore(JCas jcas) {
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
  //* Feature: elements

  /** getter for elements - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getElements() {
    if (TextScore_Type.featOkTst && ((TextScore_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.score.TextScore");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TextScore_Type)jcasType).casFeatCode_elements)));}
    
  /** setter for elements - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElements(FSArray v) {
    if (TextScore_Type.featOkTst && ((TextScore_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.score.TextScore");
    jcasType.ll_cas.ll_setRefValue(addr, ((TextScore_Type)jcasType).casFeatCode_elements, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for elements - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TextScoreEntry getElements(int i) {
    if (TextScore_Type.featOkTst && ((TextScore_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.score.TextScore");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TextScore_Type)jcasType).casFeatCode_elements), i);
    return (TextScoreEntry)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TextScore_Type)jcasType).casFeatCode_elements), i)));}

  /** indexed setter for elements - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setElements(int i, TextScoreEntry v) { 
    if (TextScore_Type.featOkTst && ((TextScore_Type)jcasType).casFeat_elements == null)
      jcasType.jcas.throwFeatMissing("elements", "org.texttechnologylab.annotation.score.TextScore");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((TextScore_Type)jcasType).casFeatCode_elements), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((TextScore_Type)jcasType).casFeatCode_elements), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: documentURI

  /** getter for documentURI - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDocumentURI() {
    if (TextScore_Type.featOkTst && ((TextScore_Type)jcasType).casFeat_documentURI == null)
      jcasType.jcas.throwFeatMissing("documentURI", "org.texttechnologylab.annotation.score.TextScore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextScore_Type)jcasType).casFeatCode_documentURI);}
    
  /** setter for documentURI - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentURI(String v) {
    if (TextScore_Type.featOkTst && ((TextScore_Type)jcasType).casFeat_documentURI == null)
      jcasType.jcas.throwFeatMissing("documentURI", "org.texttechnologylab.annotation.score.TextScore");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextScore_Type)jcasType).casFeatCode_documentURI, v);}    
   
    
  //*--------------*
  //* Feature: documentName

  /** getter for documentName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDocumentName() {
    if (TextScore_Type.featOkTst && ((TextScore_Type)jcasType).casFeat_documentName == null)
      jcasType.jcas.throwFeatMissing("documentName", "org.texttechnologylab.annotation.score.TextScore");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TextScore_Type)jcasType).casFeatCode_documentName);}
    
  /** setter for documentName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocumentName(String v) {
    if (TextScore_Type.featOkTst && ((TextScore_Type)jcasType).casFeat_documentName == null)
      jcasType.jcas.throwFeatMissing("documentName", "org.texttechnologylab.annotation.score.TextScore");
    jcasType.ll_cas.ll_setStringValue(addr, ((TextScore_Type)jcasType).casFeatCode_documentName, v);}    
  }

    