

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:44:14 CEST 2025 */

package de.unihd.dbs.uima.types.heideltime;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Sep 26 15:44:14 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Event extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "de.unihd.dbs.uima.types.heideltime.Event";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Event.class);
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
   
  public final static String _FeatName_filename = "filename";
  public final static String _FeatName_sentId = "sentId";
  public final static String _FeatName_tokId = "tokId";
  public final static String _FeatName_eventId = "eventId";
  public final static String _FeatName_eventInstanceId = "eventInstanceId";
  public final static String _FeatName_aspect = "aspect";
  public final static String _FeatName_modality = "modality";
  public final static String _FeatName_polarity = "polarity";
  public final static String _FeatName_tense = "tense";
  public final static String _FeatName_token = "token";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_filename = TypeSystemImpl.createCallSite(Event.class, "filename");
  private final static MethodHandle _FH_filename = _FC_filename.dynamicInvoker();
  private final static CallSite _FC_sentId = TypeSystemImpl.createCallSite(Event.class, "sentId");
  private final static MethodHandle _FH_sentId = _FC_sentId.dynamicInvoker();
  private final static CallSite _FC_tokId = TypeSystemImpl.createCallSite(Event.class, "tokId");
  private final static MethodHandle _FH_tokId = _FC_tokId.dynamicInvoker();
  private final static CallSite _FC_eventId = TypeSystemImpl.createCallSite(Event.class, "eventId");
  private final static MethodHandle _FH_eventId = _FC_eventId.dynamicInvoker();
  private final static CallSite _FC_eventInstanceId = TypeSystemImpl.createCallSite(Event.class, "eventInstanceId");
  private final static MethodHandle _FH_eventInstanceId = _FC_eventInstanceId.dynamicInvoker();
  private final static CallSite _FC_aspect = TypeSystemImpl.createCallSite(Event.class, "aspect");
  private final static MethodHandle _FH_aspect = _FC_aspect.dynamicInvoker();
  private final static CallSite _FC_modality = TypeSystemImpl.createCallSite(Event.class, "modality");
  private final static MethodHandle _FH_modality = _FC_modality.dynamicInvoker();
  private final static CallSite _FC_polarity = TypeSystemImpl.createCallSite(Event.class, "polarity");
  private final static MethodHandle _FH_polarity = _FC_polarity.dynamicInvoker();
  private final static CallSite _FC_tense = TypeSystemImpl.createCallSite(Event.class, "tense");
  private final static MethodHandle _FH_tense = _FC_tense.dynamicInvoker();
  private final static CallSite _FC_token = TypeSystemImpl.createCallSite(Event.class, "token");
  private final static MethodHandle _FH_token = _FC_token.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Event() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Event(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Event(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Event(JCas jcas, int begin, int end) {
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
  //* Feature: filename

  /** getter for filename - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFilename() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_filename));
  }
    
  /** setter for filename - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFilename(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_filename), v);
  }    
    
   
    
  //*--------------*
  //* Feature: sentId

  /** getter for sentId - gets 
   * @generated
   * @return value of the feature 
   */
  public int getSentId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_sentId));
  }
    
  /** setter for sentId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_sentId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: tokId

  /** getter for tokId - gets 
   * @generated
   * @return value of the feature 
   */
  public int getTokId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_tokId));
  }
    
  /** setter for tokId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTokId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_tokId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: eventId

  /** getter for eventId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEventId() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_eventId));
  }
    
  /** setter for eventId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEventId(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_eventId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: eventInstanceId

  /** getter for eventInstanceId - gets 
   * @generated
   * @return value of the feature 
   */
  public int getEventInstanceId() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_eventInstanceId));
  }
    
  /** setter for eventInstanceId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEventInstanceId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_eventInstanceId), v);
  }    
    
   
    
  //*--------------*
  //* Feature: aspect

  /** getter for aspect - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAspect() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_aspect));
  }
    
  /** setter for aspect - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAspect(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_aspect), v);
  }    
    
   
    
  //*--------------*
  //* Feature: modality

  /** getter for modality - gets 
   * @generated
   * @return value of the feature 
   */
  public String getModality() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_modality));
  }
    
  /** setter for modality - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setModality(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_modality), v);
  }    
    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPolarity() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_polarity));
  }
    
  /** setter for polarity - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPolarity(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_polarity), v);
  }    
    
   
    
  //*--------------*
  //* Feature: tense

  /** getter for tense - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTense() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_tense));
  }
    
  /** setter for tense - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTense(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_tense), v);
  }    
    
   
    
  //*--------------*
  //* Feature: token

  /** getter for token - gets 
   * @generated
   * @return value of the feature 
   */
  public Token getToken() { 
    return (Token)(_getFeatureValueNc(wrapGetIntCatchException(_FH_token)));
  }
    
  /** setter for token - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setToken(Token v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_token), v);
  }    
    
  }

    