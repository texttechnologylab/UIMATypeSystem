

/* First created by JCasGen Wed Dec 02 18:39:27 CET 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData;


/** 
 * Updated by JCasGen Tue Dec 08 11:00:36 CET 2020
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyDokumentAnnotation.xml
 * @generated */
public class DocumentAnnotation extends DocumentMetaData {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DocumentAnnotation.class);
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
  protected DocumentAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DocumentAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DocumentAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DocumentAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: author

  /** getter for author - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAuthor() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.DocumentAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_author);}
    
  /** setter for author - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAuthor(String v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "org.texttechnologylab.annotation.DocumentAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_author, v);}    
   
    
  //*--------------*
  //* Feature: publisher

  /** getter for publisher - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPublisher() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_publisher == null)
      jcasType.jcas.throwFeatMissing("publisher", "org.texttechnologylab.annotation.DocumentAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_publisher);}
    
  /** setter for publisher - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPublisher(String v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_publisher == null)
      jcasType.jcas.throwFeatMissing("publisher", "org.texttechnologylab.annotation.DocumentAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_publisher, v);}    
   
    
  //*--------------*
  //* Feature: dateDay

  /** getter for dateDay - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDateDay() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_dateDay == null)
      jcasType.jcas.throwFeatMissing("dateDay", "org.texttechnologylab.annotation.DocumentAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_dateDay);}
    
  /** setter for dateDay - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDateDay(int v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_dateDay == null)
      jcasType.jcas.throwFeatMissing("dateDay", "org.texttechnologylab.annotation.DocumentAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_dateDay, v);}    
   
    
  //*--------------*
  //* Feature: subtitle

  /** getter for subtitle - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSubtitle() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_subtitle == null)
      jcasType.jcas.throwFeatMissing("subtitle", "org.texttechnologylab.annotation.DocumentAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_subtitle);}
    
  /** setter for subtitle - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSubtitle(String v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_subtitle == null)
      jcasType.jcas.throwFeatMissing("subtitle", "org.texttechnologylab.annotation.DocumentAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_subtitle, v);}    
   
    
  //*--------------*
  //* Feature: dateMonth

  /** getter for dateMonth - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDateMonth() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_dateMonth == null)
      jcasType.jcas.throwFeatMissing("dateMonth", "org.texttechnologylab.annotation.DocumentAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_dateMonth);}
    
  /** setter for dateMonth - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDateMonth(int v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_dateMonth == null)
      jcasType.jcas.throwFeatMissing("dateMonth", "org.texttechnologylab.annotation.DocumentAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_dateMonth, v);}    
   
    
  //*--------------*
  //* Feature: dateYear

  /** getter for dateYear - gets 
   * @generated
   * @return value of the feature 
   */
  public int getDateYear() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_dateYear == null)
      jcasType.jcas.throwFeatMissing("dateYear", "org.texttechnologylab.annotation.DocumentAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_dateYear);}
    
  /** setter for dateYear - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDateYear(int v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_dateYear == null)
      jcasType.jcas.throwFeatMissing("dateYear", "org.texttechnologylab.annotation.DocumentAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_dateYear, v);}    
   
    
  //*--------------*
  //* Feature: timestamp

  /** getter for timestamp - gets 
   * @generated
   * @return value of the feature 
   */
  public long getTimestamp() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_timestamp == null)
      jcasType.jcas.throwFeatMissing("timestamp", "org.texttechnologylab.annotation.DocumentAnnotation");
    return jcasType.ll_cas.ll_getLongValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_timestamp);}
    
  /** setter for timestamp - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTimestamp(long v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_timestamp == null)
      jcasType.jcas.throwFeatMissing("timestamp", "org.texttechnologylab.annotation.DocumentAnnotation");
    jcasType.ll_cas.ll_setLongValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_timestamp, v);}    
   
    
  //*--------------*
  //* Feature: place

  /** getter for place - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPlace() {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "org.texttechnologylab.annotation.DocumentAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_place);}
    
  /** setter for place - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPlace(String v) {
    if (DocumentAnnotation_Type.featOkTst && ((DocumentAnnotation_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "org.texttechnologylab.annotation.DocumentAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentAnnotation_Type)jcasType).casFeatCode_place, v);}    
  }

    