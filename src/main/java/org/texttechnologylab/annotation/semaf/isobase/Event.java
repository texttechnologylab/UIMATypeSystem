

   
/* Apache UIMA v3 - First created by JCasGen Thu Jul 04 15:15:19 CEST 2024 */

package org.texttechnologylab.annotation.semaf.isobase;


import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;
import org.texttechnologylab.annotation.semaf.isospace.Measure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;


/**
 * Updated by JCasGen Thu Jul 04 15:15:19 CEST 2024
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Event extends Entity {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isobase.Event";
  
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
   
  public final static String _FeatName_event_class = "event_class";
  public final static String _FeatName_polarity = "polarity";
  public final static String _FeatName_mood = "mood";
  public final static String _FeatName_pos = "pos";
  public final static String _FeatName_tense = "tense";
  public final static String _FeatName_aspect = "aspect";
  public final static String _FeatName_vform = "vform";
  public final static String _FeatName_domain = "domain";
  public final static String _FeatName_lat = "lat";
  public final static String _FeatName_long = "long";
  public final static String _FeatName_elevation = "elevation";
  public final static String _FeatName_countable = "countable";
  public final static String _FeatName_gquant = "gquant";
  public final static String _FeatName_scopes = "scopes";
  public final static String _FeatName_scopes_array = "scopes_array";
  public final static String _FeatName_event_frame = "event_frame";
  public final static String _FeatName_event_type = "event_type";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_event_class = TypeSystemImpl.createCallSite(Event.class, "event_class");
  private final static MethodHandle _FH_event_class = _FC_event_class.dynamicInvoker();
  private final static CallSite _FC_polarity = TypeSystemImpl.createCallSite(Event.class, "polarity");
  private final static MethodHandle _FH_polarity = _FC_polarity.dynamicInvoker();
  private final static CallSite _FC_mood = TypeSystemImpl.createCallSite(Event.class, "mood");
  private final static MethodHandle _FH_mood = _FC_mood.dynamicInvoker();
  private final static CallSite _FC_pos = TypeSystemImpl.createCallSite(Event.class, "pos");
  private final static MethodHandle _FH_pos = _FC_pos.dynamicInvoker();
  private final static CallSite _FC_tense = TypeSystemImpl.createCallSite(Event.class, "tense");
  private final static MethodHandle _FH_tense = _FC_tense.dynamicInvoker();
  private final static CallSite _FC_aspect = TypeSystemImpl.createCallSite(Event.class, "aspect");
  private final static MethodHandle _FH_aspect = _FC_aspect.dynamicInvoker();
  private final static CallSite _FC_vform = TypeSystemImpl.createCallSite(Event.class, "vform");
  private final static MethodHandle _FH_vform = _FC_vform.dynamicInvoker();
  private final static CallSite _FC_domain = TypeSystemImpl.createCallSite(Event.class, "domain");
  private final static MethodHandle _FH_domain = _FC_domain.dynamicInvoker();
  private final static CallSite _FC_lat = TypeSystemImpl.createCallSite(Event.class, "lat");
  private final static MethodHandle _FH_lat = _FC_lat.dynamicInvoker();
  private final static CallSite _FC_long = TypeSystemImpl.createCallSite(Event.class, "long");
  private final static MethodHandle _FH_long = _FC_long.dynamicInvoker();
  private final static CallSite _FC_elevation = TypeSystemImpl.createCallSite(Event.class, "elevation");
  private final static MethodHandle _FH_elevation = _FC_elevation.dynamicInvoker();
  private final static CallSite _FC_countable = TypeSystemImpl.createCallSite(Event.class, "countable");
  private final static MethodHandle _FH_countable = _FC_countable.dynamicInvoker();
  private final static CallSite _FC_gquant = TypeSystemImpl.createCallSite(Event.class, "gquant");
  private final static MethodHandle _FH_gquant = _FC_gquant.dynamicInvoker();
  private final static CallSite _FC_scopes = TypeSystemImpl.createCallSite(Event.class, "scopes");
  private final static MethodHandle _FH_scopes = _FC_scopes.dynamicInvoker();
  private final static CallSite _FC_scopes_array = TypeSystemImpl.createCallSite(Event.class, "scopes_array");
  private final static MethodHandle _FH_scopes_array = _FC_scopes_array.dynamicInvoker();
  private final static CallSite _FC_event_frame = TypeSystemImpl.createCallSite(Event.class, "event_frame");
  private final static MethodHandle _FH_event_frame = _FC_event_frame.dynamicInvoker();
  private final static CallSite _FC_event_type = TypeSystemImpl.createCallSite(Event.class, "event_type");
  private final static MethodHandle _FH_event_type = _FC_event_type.dynamicInvoker();

   
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
  //* Feature: event_class

  /** getter for event_class - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEvent_class() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_event_class));
  }
    
  /** setter for event_class - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent_class(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_event_class), v);
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
  //* Feature: mood

  /** getter for mood - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMood() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_mood));
  }
    
  /** setter for mood - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMood(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_mood), v);
  }    
    
   
    
  //*--------------*
  //* Feature: pos

  /** getter for pos - gets 
   * @generated
   * @return value of the feature 
   */
  public String getPos() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_pos));
  }
    
  /** setter for pos - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPos(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_pos), v);
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
  //* Feature: vform

  /** getter for vform - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVform() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_vform));
  }
    
  /** setter for vform - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVform(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_vform), v);
  }    
    
   
    
  //*--------------*
  //* Feature: domain

  /** getter for domain - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDomain() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_domain));
  }
    
  /** setter for domain - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDomain(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_domain), v);
  }    
    
   
    
  //*--------------*
  //* Feature: lat

  /** getter for lat - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLat() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_lat));
  }
    
  /** setter for lat - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLat(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_lat), v);
  }    
    
   
    
  //*--------------*
  //* Feature: long

  /** getter for long - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLong() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_long));
  }
    
  /** setter for long - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLong(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_long), v);
  }    
    
   
    
  //*--------------*
  //* Feature: elevation

  /** getter for elevation - gets 
   * @generated
   * @return value of the feature 
   */
  public Measure getElevation() { 
    return (Measure)(_getFeatureValueNc(wrapGetIntCatchException(_FH_elevation)));
  }
    
  /** setter for elevation - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElevation(Measure v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_elevation), v);
  }    
    
   
    
  //*--------------*
  //* Feature: countable

  /** getter for countable - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getCountable() { 
    return _getBooleanValueNc(wrapGetIntCatchException(_FH_countable));
  }
    
  /** setter for countable - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountable(boolean v) {
    _setBooleanValueNfc(wrapGetIntCatchException(_FH_countable), v);
  }    
    
   
    
  //*--------------*
  //* Feature: gquant

  /** getter for gquant - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGquant() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_gquant));
  }
    
  /** setter for gquant - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGquant(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_gquant), v);
  }    
    
   
    
  //*--------------*
  //* Feature: scopes

  /** getter for scopes - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSList<Entity> getScopes() { 
    return (FSList<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scopes)));
  }
    
  /** setter for scopes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScopes(FSList<Entity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_scopes), v);
  }    
    
   
    
  //*--------------*
  //* Feature: scopes_array

  /** getter for scopes_array - gets 
   * @generated
   * @return value of the feature 
   */
  @SuppressWarnings("unchecked")
  public FSArray<Entity> getScopes_array() { 
    return (FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scopes_array)));
  }
    
  /** setter for scopes_array - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setScopes_array(FSArray<Entity> v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_scopes_array), v);
  }    
    
    
  /** indexed getter for scopes_array - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  @SuppressWarnings("unchecked")
  public Entity getScopes_array(int i) {
     return (Entity)(((FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scopes_array)))).get(i));
  } 

  /** indexed setter for scopes_array - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  @SuppressWarnings("unchecked")
    public void setScopes_array(int i, Entity v) {
    ((FSArray<Entity>)(_getFeatureValueNc(wrapGetIntCatchException(_FH_scopes_array)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: event_frame

  /** getter for event_frame - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEvent_frame() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_event_frame));
  }
    
  /** setter for event_frame - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent_frame(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_event_frame), v);
  }    
    
   
    
  //*--------------*
  //* Feature: event_type

  /** getter for event_type - gets 
   * @generated
   * @return value of the feature 
   */
  public String getEvent_type() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_event_type));
  }
    
  /** setter for event_type - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent_type(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_event_type), v);
  }    
    
  }

    