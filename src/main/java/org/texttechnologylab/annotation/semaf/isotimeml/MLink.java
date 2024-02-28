

   
/* Apache UIMA v3 - First created by JCasGen Wed Feb 28 22:02:33 CET 2024 */

package org.texttechnologylab.annotation.semaf.isotimeml;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.semaf.isobase.Event;
import org.texttechnologylab.annotation.semaf.isobase.Link;


/** 
 * Updated by JCasGen Wed Feb 28 22:02:33 CET 2024
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class MLink extends Link {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.semaf.isotimeml.MLink";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MLink.class);
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
   
  public final static String _FeatName_event_id = "event_id";
  public final static String _FeatName_related_to_time = "related_to_time";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_event_id = TypeSystemImpl.createCallSite(MLink.class, "event_id");
  private final static MethodHandle _FH_event_id = _FC_event_id.dynamicInvoker();
  private final static CallSite _FC_related_to_time = TypeSystemImpl.createCallSite(MLink.class, "related_to_time");
  private final static MethodHandle _FH_related_to_time = _FC_related_to_time.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected MLink() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public MLink(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public MLink(JCas jcas) {
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
  //* Feature: event_id

  /** getter for event_id - gets 
   * @generated
   * @return value of the feature 
   */
  public Event getEvent_id() { 
    return (Event)(_getFeatureValueNc(wrapGetIntCatchException(_FH_event_id)));
  }
    
  /** setter for event_id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setEvent_id(Event v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_event_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: related_to_time

  /** getter for related_to_time - gets 
   * @generated
   * @return value of the feature 
   */
  public TimeX3 getRelated_to_time() { 
    return (TimeX3)(_getFeatureValueNc(wrapGetIntCatchException(_FH_related_to_time)));
  }
    
  /** setter for related_to_time - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRelated_to_time(TimeX3 v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_related_to_time), v);
  }    
    
  }

    