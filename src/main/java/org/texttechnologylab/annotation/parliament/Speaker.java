

/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.parliament;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class Speaker extends Annotation {
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
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Speaker() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Speaker(int addr, TOP_Type type) {
    super(addr, type);
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
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_label);}
    
  /** setter for label - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLabel(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_label == null)
      jcasType.jcas.throwFeatMissing("label", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_label, v);}    
   
    
  //*--------------*
  //* Feature: firstname

  /** getter for firstname - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFirstname() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_firstname == null)
      jcasType.jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_firstname);}
    
  /** setter for firstname - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFirstname(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_firstname == null)
      jcasType.jcas.throwFeatMissing("firstname", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_firstname, v);}    
   
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: fullname_deducted

  /** getter for fullname_deducted - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFullname_deducted() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_fullname_deducted == null)
      jcasType.jcas.throwFeatMissing("fullname_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_fullname_deducted);}
    
  /** setter for fullname_deducted - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFullname_deducted(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_fullname_deducted == null)
      jcasType.jcas.throwFeatMissing("fullname_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_fullname_deducted, v);}    
   
    
  //*--------------*
  //* Feature: nobility

  /** getter for nobility - gets 
   * @generated
   * @return value of the feature 
   */
  public String getNobility() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_nobility == null)
      jcasType.jcas.throwFeatMissing("nobility", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_nobility);}
    
  /** setter for nobility - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNobility(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_nobility == null)
      jcasType.jcas.throwFeatMissing("nobility", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_nobility, v);}    
   
    
  //*--------------*
  //* Feature: title

  /** getter for title - gets 
   * @generated
   * @return value of the feature 
   */
  public String getTitle() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_title);}
    
  /** setter for title - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setTitle(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_title, v);}    
   
    
  //*--------------*
  //* Feature: role

  /** getter for role - gets 
   * @generated
   * @return value of the feature 
   */
  public String getRole() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_role);}
    
  /** setter for role - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRole(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_role, v);}    
   
    
  //*--------------*
  //* Feature: party

  /** getter for party - gets 
   * @generated
   * @return value of the feature 
   */
  public String getParty() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_party == null)
      jcasType.jcas.throwFeatMissing("party", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_party);}
    
  /** setter for party - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParty(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_party == null)
      jcasType.jcas.throwFeatMissing("party", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_party, v);}    
   
    
  //*--------------*
  //* Feature: party_deducted

  /** getter for party_deducted - gets 
   * @generated
   * @return value of the feature 
   */
  public String getParty_deducted() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_party_deducted == null)
      jcasType.jcas.throwFeatMissing("party_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_party_deducted);}
    
  /** setter for party_deducted - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setParty_deducted(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_party_deducted == null)
      jcasType.jcas.throwFeatMissing("party_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_party_deducted, v);}    
   
    
  //*--------------*
  //* Feature: electoral_county

  /** getter for electoral_county - gets 
   * @generated
   * @return value of the feature 
   */
  public String getElectoral_county() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_electoral_county == null)
      jcasType.jcas.throwFeatMissing("electoral_county", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_electoral_county);}
    
  /** setter for electoral_county - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElectoral_county(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_electoral_county == null)
      jcasType.jcas.throwFeatMissing("electoral_county", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_electoral_county, v);}    
   
    
  //*--------------*
  //* Feature: electoral_county_deducted

  /** getter for electoral_county_deducted - gets 
   * @generated
   * @return value of the feature 
   */
  public String getElectoral_county_deducted() {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_electoral_county_deducted == null)
      jcasType.jcas.throwFeatMissing("electoral_county_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_electoral_county_deducted);}
    
  /** setter for electoral_county_deducted - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setElectoral_county_deducted(String v) {
    if (Speaker_Type.featOkTst && ((Speaker_Type)jcasType).casFeat_electoral_county_deducted == null)
      jcasType.jcas.throwFeatMissing("electoral_county_deducted", "org.texttechnologylab.annotation.parliament.Speaker");
    jcasType.ll_cas.ll_setStringValue(addr, ((Speaker_Type)jcasType).casFeatCode_electoral_county_deducted, v);}    
  }

    