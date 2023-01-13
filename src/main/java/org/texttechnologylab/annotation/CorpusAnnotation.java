

/* First created by JCasGen Thu Dec 17 12:26:07 CET 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** 
 * Updated by JCasGen Fri Jan 13 15:18:14 CET 2023
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyDokumentAnnotation.xml
 * @generated */
public class CorpusAnnotation extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(CorpusAnnotation.class);
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
  protected CorpusAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public CorpusAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public CorpusAnnotation(JCas jcas) {
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
  //* Feature: license

  /** getter for license - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLicense() {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_license == null)
      jcasType.jcas.throwFeatMissing("license", "org.texttechnologylab.annotation.CorpusAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_license);}
    
  /** setter for license - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLicense(String v) {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_license == null)
      jcasType.jcas.throwFeatMissing("license", "org.texttechnologylab.annotation.CorpusAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_license, v);}    
   
    
  //*--------------*
  //* Feature: corpusUrl

  /** getter for corpusUrl - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCorpusUrl() {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_corpusUrl == null)
      jcasType.jcas.throwFeatMissing("corpusUrl", "org.texttechnologylab.annotation.CorpusAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_corpusUrl);}
    
  /** setter for corpusUrl - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCorpusUrl(String v) {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_corpusUrl == null)
      jcasType.jcas.throwFeatMissing("corpusUrl", "org.texttechnologylab.annotation.CorpusAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_corpusUrl, v);}    
   
    
  //*--------------*
  //* Feature: corpusName

  /** getter for corpusName - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCorpusName() {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_corpusName == null)
      jcasType.jcas.throwFeatMissing("corpusName", "org.texttechnologylab.annotation.CorpusAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_corpusName);}
    
  /** setter for corpusName - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCorpusName(String v) {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_corpusName == null)
      jcasType.jcas.throwFeatMissing("corpusName", "org.texttechnologylab.annotation.CorpusAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_corpusName, v);}    
   
    
  //*--------------*
  //* Feature: author

  /** getter for author - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAuthor() {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.CorpusAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_author);}
    
  /** setter for author - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthor(String v) {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.CorpusAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_author, v);}    
   
    
  //*--------------*
  //* Feature: comment

  /** getter for comment - gets 
   * @generated
   * @return value of the feature 
   */
  public String getComment() {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.CorpusAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_comment);}
    
  /** setter for comment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setComment(String v) {
    if (CorpusAnnotation_Type.featOkTst && ((CorpusAnnotation_Type)jcasType).casFeat_comment == null)
      jcasType.jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.CorpusAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((CorpusAnnotation_Type)jcasType).casFeatCode_comment, v);}    
  }

    