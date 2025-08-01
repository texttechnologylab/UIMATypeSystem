

   
/* Apache UIMA v3 - First created by JCasGen Fri Aug 01 12:46:51 CEST 2025 */

package org.texttechnologylab.annotation.search;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.type.search.TextSearch;
import org.apache.uima.jcas.tcas.Annotation;


/** Reference Text of TextSearch. Result of the search. It can be a list of text or a single text or a summary of the text or a label of the text.
 * Updated by JCasGen Fri Aug 01 12:46:51 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class ReferenceText extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.search.ReferenceText";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_methods = "methods";
  public final static String _FeatName_group = "group";
  public final static String _FeatName_text = "text";
  public final static String _FeatName_url = "url";
  public final static String _FeatName_success = "success";
  public final static String _FeatName_priority = "priority";
  public final static String _FeatName_dateTime = "dateTime";
  public final static String _FeatName_summary = "summary";
  public final static String _FeatName_infos = "infos";
  public final static String _FeatName_reference = "reference";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_methods = TypeSystemImpl.createCallSite(ReferenceText.class, "methods");
  private final static MethodHandle _FH_methods = _FC_methods.dynamicInvoker();
  private final static CallSite _FC_group = TypeSystemImpl.createCallSite(ReferenceText.class, "group");
  private final static MethodHandle _FH_group = _FC_group.dynamicInvoker();
  private final static CallSite _FC_text = TypeSystemImpl.createCallSite(ReferenceText.class, "text");
  private final static MethodHandle _FH_text = _FC_text.dynamicInvoker();
  private final static CallSite _FC_url = TypeSystemImpl.createCallSite(ReferenceText.class, "url");
  private final static MethodHandle _FH_url = _FC_url.dynamicInvoker();
  private final static CallSite _FC_success = TypeSystemImpl.createCallSite(ReferenceText.class, "success");
  private final static MethodHandle _FH_success = _FC_success.dynamicInvoker();
  private final static CallSite _FC_priority = TypeSystemImpl.createCallSite(ReferenceText.class, "priority");
  private final static MethodHandle _FH_priority = _FC_priority.dynamicInvoker();
  private final static CallSite _FC_dateTime = TypeSystemImpl.createCallSite(ReferenceText.class, "dateTime");
  private final static MethodHandle _FH_dateTime = _FC_dateTime.dynamicInvoker();
  private final static CallSite _FC_summary = TypeSystemImpl.createCallSite(ReferenceText.class, "summary");
  private final static MethodHandle _FH_summary = _FC_summary.dynamicInvoker();
  private final static CallSite _FC_infos = TypeSystemImpl.createCallSite(ReferenceText.class, "infos");
  private final static MethodHandle _FH_infos = _FC_infos.dynamicInvoker();
  private final static CallSite _FC_reference = TypeSystemImpl.createCallSite(ReferenceText.class, "reference");
  private final static MethodHandle _FH_reference = _FC_reference.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected ReferenceText() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public ReferenceText(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_methods));
  }
    
  /** setter for methods - sets Which Method was used for the search, like Wikipedia, Google, Wikidata or something Class 
   * @generated
   * @param v value to set into the feature 
   */
  public void setMethods(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_methods), v);
  }    
    
   
    
  //*--------------*
  //* Feature: group

  /** getter for group - gets what is the group of Text, from which source it was extracted: web, wikipedia, wikidata,...
   * @generated
   * @return value of the feature 
   */
  public String getGroup() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_group));
  }
    
  /** setter for group - sets what is the group of Text, from which source it was extracted: web, wikipedia, wikidata,... 
   * @generated
   * @param v value to set into the feature 
   */
  public void setGroup(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_group), v);
  }    
    
   
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets Text of the Reference Text
   * @generated
   * @return value of the feature 
   */
  public String getText() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_text));
  }
    
  /** setter for text - sets Text of the Reference Text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_text), v);
  }    
    
   
    
  //*--------------*
  //* Feature: url

  /** getter for url - gets URL of the Reference Text
   * @generated
   * @return value of the feature 
   */
  public String getUrl() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_url));
  }
    
  /** setter for url - sets URL of the Reference Text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setUrl(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_url), v);
  }    
    
   
    
  //*--------------*
  //* Feature: success

  /** getter for success - gets Was the search or the extraction successful
   * @generated
   * @return value of the feature 
   */
  public boolean getSuccess() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_success));
  }
    
  /** setter for success - sets Was the search or the extraction successful 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSuccess(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_success), v);
  }    
    
   
    
  //*--------------*
  //* Feature: priority

  /** getter for priority - gets Result number of the search
   * @generated
   * @return value of the feature 
   */
  public int getPriority() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_priority));
  }
    
  /** setter for priority - sets Result number of the search 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPriority(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_priority), v);
  }    
    
   
    
  //*--------------*
  //* Feature: dateTime

  /** getter for dateTime - gets dateTime of the search: dd:mm:yyyy hh:mm:ss
   * @generated
   * @return value of the feature 
   */
  public String getDateTime() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_dateTime));
  }
    
  /** setter for dateTime - sets dateTime of the search: dd:mm:yyyy hh:mm:ss 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDateTime(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_dateTime), v);
  }    
    
   
    
  //*--------------*
  //* Feature: summary

  /** getter for summary - gets summary of the text
   * @generated
   * @return value of the feature 
   */
  public String getSummary() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_summary));
  }
    
  /** setter for summary - sets summary of the text 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSummary(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_summary), v);
  }    
    
   
    
  //*--------------*
  //* Feature: infos

  /** getter for infos - gets additional infos as json string
   * @generated
   * @return value of the feature 
   */
  public String getInfos() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_infos));
  }
    
  /** setter for infos - sets additional infos as json string 
   * @generated
   * @param v value to set into the feature 
   */
  public void setInfos(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_infos), v);
  }    
    
   
    
  //*--------------*
  //* Feature: reference

  /** getter for reference - gets reference
   * @generated
   * @return value of the feature 
   */
  public TextSearch getReference() { 
    return (TextSearch)(_getFeatureValueNc(wrapGetIntCatchException(_FH_reference)));
  }
    
  /** setter for reference - sets reference 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReference(TextSearch v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_reference), v);
  }    
    
  }

    