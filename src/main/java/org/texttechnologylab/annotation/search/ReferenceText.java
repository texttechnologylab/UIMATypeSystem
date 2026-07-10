

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.search;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.type.search.TextSearch;
import org.apache.uima.jcas.tcas.Annotation;


/** Reference Text of TextSearch. Result of the search. It can be a list of text or a single text or a summary of the text or a label of the text.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ReferenceText extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(ReferenceText.class);
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
  protected ReferenceText() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public ReferenceText(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public ReferenceText(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public ReferenceText(JCas jcas, int begin, int end) {
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
  //* Feature: methods

  /** getter for methods - gets Which Method was used for the search, like Wikipedia, Google, Wikidata or something Class
   * @generated
   * @return value of the feature 
   */
  public String getMethods() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_methods == null)
      jcasType.jcas.throwFeatMissing("methods", "org.texttechnologylab.annotation.search.ReferenceText");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_methods);}
    
  /** setter for methods - sets Which Method was used for the search, like Wikipedia, Google, Wikidata or something Class 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMethods(String v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_methods == null)
      jcasType.jcas.throwFeatMissing("methods", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_methods, v);}    
   
    
  //*--------------*
  //* Feature: group

  /** getter for group - gets what is the group of Text, from which source it was extracted: web, wikipedia, wikidata,...
   * @generated
   * @return value of the feature 
   */
  public String getGroup() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.search.ReferenceText");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_group);}
    
  /** setter for group - sets what is the group of Text, from which source it was extracted: web, wikipedia, wikidata,... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGroup(String v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_group, v);}    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets Text of the Reference Text
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.search.ReferenceText");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets Text of the Reference Text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: url

  /** getter for url - gets URL of the Reference Text
   * @generated
   * @return value of the feature 
   */
  public String getUrl() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.search.ReferenceText");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_url);}
    
  /** setter for url - sets URL of the Reference Text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_url == null)
      jcasType.jcas.throwFeatMissing("url", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_url, v);}    
   
    
  //*--------------*
  //* Feature: success

  /** getter for success - gets Was the search or the extraction successful
   * @generated
   * @return value of the feature 
   */
  public boolean getSuccess() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_success == null)
      jcasType.jcas.throwFeatMissing("success", "org.texttechnologylab.annotation.search.ReferenceText");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_success);}
    
  /** setter for success - sets Was the search or the extraction successful 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuccess(boolean v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_success == null)
      jcasType.jcas.throwFeatMissing("success", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_success, v);}    
   
    
  //*--------------*
  //* Feature: priority

  /** getter for priority - gets Result number of the search
   * @generated
   * @return value of the feature 
   */
  public int getPriority() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_priority == null)
      jcasType.jcas.throwFeatMissing("priority", "org.texttechnologylab.annotation.search.ReferenceText");
    return jcasType.ll_cas.ll_getIntValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_priority);}
    
  /** setter for priority - sets Result number of the search 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPriority(int v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_priority == null)
      jcasType.jcas.throwFeatMissing("priority", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setIntValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_priority, v);}    
   
    
  //*--------------*
  //* Feature: dateTime

  /** getter for dateTime - gets dateTime of the search: dd:mm:yyyy hh:mm:ss
   * @generated
   * @return value of the feature 
   */
  public String getDateTime() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_dateTime == null)
      jcasType.jcas.throwFeatMissing("dateTime", "org.texttechnologylab.annotation.search.ReferenceText");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_dateTime);}
    
  /** setter for dateTime - sets dateTime of the search: dd:mm:yyyy hh:mm:ss 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDateTime(String v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_dateTime == null)
      jcasType.jcas.throwFeatMissing("dateTime", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_dateTime, v);}    
   
    
  //*--------------*
  //* Feature: summary

  /** getter for summary - gets summary of the text
   * @generated
   * @return value of the feature 
   */
  public String getSummary() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_summary == null)
      jcasType.jcas.throwFeatMissing("summary", "org.texttechnologylab.annotation.search.ReferenceText");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_summary);}
    
  /** setter for summary - sets summary of the text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSummary(String v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_summary == null)
      jcasType.jcas.throwFeatMissing("summary", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_summary, v);}    
   
    
  //*--------------*
  //* Feature: infos

  /** getter for infos - gets additional infos as json string
   * @generated
   * @return value of the feature 
   */
  public String getInfos() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_infos == null)
      jcasType.jcas.throwFeatMissing("infos", "org.texttechnologylab.annotation.search.ReferenceText");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_infos);}
    
  /** setter for infos - sets additional infos as json string 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInfos(String v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_infos == null)
      jcasType.jcas.throwFeatMissing("infos", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setStringValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_infos, v);}    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets reference
   * @generated
   * @return value of the feature 
   */
  public TextSearch getReference() {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.search.ReferenceText");
    return (TextSearch)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_reference)));}
    
  /** setter for reference - sets reference 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(TextSearch v) {
    if (ReferenceText_Type.featOkTst && ((ReferenceText_Type)jcasType).casFeat_reference == null)
      jcasType.jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.search.ReferenceText");
    jcasType.ll_cas.ll_setRefValue(addr, ((ReferenceText_Type)jcasType).casFeatCode_reference, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    