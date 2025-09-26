

   
/* Apache UIMA v3 - First created by JCasGen Fri Sep 26 15:44:15 CEST 2025 */

package org.texttechnologylab.annotation.parliament;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Sep 26 15:44:15 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Speaker extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.parliament.Speaker";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Speaker.class);
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
   
  public final static String _FeatName_label = "label";
  public final static String _FeatName_firstname = "firstname";
  public final static String _FeatName_name = "name";
  public final static String _FeatName_fullname_deducted = "fullname_deducted";
  public final static String _FeatName_nobility = "nobility";
  public final static String _FeatName_title = "title";
  public final static String _FeatName_role = "role";
  public final static String _FeatName_party = "party";
  public final static String _FeatName_party_deducted = "party_deducted";
  public final static String _FeatName_electoral_county = "electoral_county";
  public final static String _FeatName_electoral_county_deducted = "electoral_county_deducted";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_label = TypeSystemImpl.createCallSite(Speaker.class, "label");
  private final static MethodHandle _FH_label = _FC_label.dynamicInvoker();
  private final static CallSite _FC_firstname = TypeSystemImpl.createCallSite(Speaker.class, "firstname");
  private final static MethodHandle _FH_firstname = _FC_firstname.dynamicInvoker();
  private final static CallSite _FC_name = TypeSystemImpl.createCallSite(Speaker.class, "name");
  private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();
  private final static CallSite _FC_fullname_deducted = TypeSystemImpl.createCallSite(Speaker.class, "fullname_deducted");
  private final static MethodHandle _FH_fullname_deducted = _FC_fullname_deducted.dynamicInvoker();
  private final static CallSite _FC_nobility = TypeSystemImpl.createCallSite(Speaker.class, "nobility");
  private final static MethodHandle _FH_nobility = _FC_nobility.dynamicInvoker();
  private final static CallSite _FC_title = TypeSystemImpl.createCallSite(Speaker.class, "title");
  private final static MethodHandle _FH_title = _FC_title.dynamicInvoker();
  private final static CallSite _FC_role = TypeSystemImpl.createCallSite(Speaker.class, "role");
  private final static MethodHandle _FH_role = _FC_role.dynamicInvoker();
  private final static CallSite _FC_party = TypeSystemImpl.createCallSite(Speaker.class, "party");
  private final static MethodHandle _FH_party = _FC_party.dynamicInvoker();
  private final static CallSite _FC_party_deducted = TypeSystemImpl.createCallSite(Speaker.class, "party_deducted");
  private final static MethodHandle _FH_party_deducted = _FC_party_deducted.dynamicInvoker();
  private final static CallSite _FC_electoral_county = TypeSystemImpl.createCallSite(Speaker.class, "electoral_county");
  private final static MethodHandle _FH_electoral_county = _FC_electoral_county.dynamicInvoker();
  private final static CallSite _FC_electoral_county_deducted = TypeSystemImpl.createCallSite(Speaker.class, "electoral_county_deducted");
  private final static MethodHandle _FH_electoral_county_deducted = _FC_electoral_county_deducted.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected Speaker() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public Speaker(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Speaker(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Speaker(JCas jcas, int begin, int end) {
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
  //* Feature: label

  /** getter for label - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLabel() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_label));
  }
    
  /** setter for label - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_label), v);
  }    
    
   
    
  //*--------------*
  //* Feature: firstname

  /** getter for firstname - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFirstname() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_firstname));
  }
    
  /** setter for firstname - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFirstname(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_firstname), v);
  }    
    
   
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_name));
  }
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_name), v);
  }    
    
   
    
  //*--------------*
  //* Feature: fullname_deducted

  /** getter for fullname_deducted - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFullname_deducted() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_fullname_deducted));
  }
    
  /** setter for fullname_deducted - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFullname_deducted(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_fullname_deducted), v);
  }    
    
   
    
  //*--------------*
  //* Feature: nobility

  /** getter for nobility - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNobility() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_nobility));
  }
    
  /** setter for nobility - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNobility(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_nobility), v);
  }    
    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_title));
  }
    
  /** setter for title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_title), v);
  }    
    
   
    
  //*--------------*
  //* Feature: role

  /** getter for role - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRole() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_role));
  }
    
  /** setter for role - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_role), v);
  }    
    
   
    
  //*--------------*
  //* Feature: party

  /** getter for party - gets 
   * @generated
   * @return value of the feature 
   */
  public String getParty() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_party));
  }
    
  /** setter for party - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParty(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_party), v);
  }    
    
   
    
  //*--------------*
  //* Feature: party_deducted

  /** getter for party_deducted - gets 
   * @generated
   * @return value of the feature 
   */
  public String getParty_deducted() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_party_deducted));
  }
    
  /** setter for party_deducted - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParty_deducted(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_party_deducted), v);
  }    
    
   
    
  //*--------------*
  //* Feature: electoral_county

  /** getter for electoral_county - gets 
   * @generated
   * @return value of the feature 
   */
  public String getElectoral_county() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_electoral_county));
  }
    
  /** setter for electoral_county - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElectoral_county(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_electoral_county), v);
  }    
    
   
    
  //*--------------*
  //* Feature: electoral_county_deducted

  /** getter for electoral_county_deducted - gets 
   * @generated
   * @return value of the feature 
   */
  public String getElectoral_county_deducted() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_electoral_county_deducted));
  }
    
  /** setter for electoral_county_deducted - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElectoral_county_deducted(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_electoral_county_deducted), v);
  }    
    
  }

    