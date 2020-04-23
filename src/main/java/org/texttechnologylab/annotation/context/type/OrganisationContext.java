

/* First created by JCasGen Thu Apr 23 09:54:52 CEST 2020 */
package org.texttechnologylab.annotation.context.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.texttechnologylab.annotation.node.type.Context;


/** 
 * Updated by JCasGen Thu Apr 23 09:54:52 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/TextTechnologyGeoVizContext.xml
 * @generated */
public class OrganisationContext extends Context {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(OrganisationContext.class);
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
  protected OrganisationContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public OrganisationContext(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public OrganisationContext(JCas jcas) {
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
  //* Feature: foundingDate

  /** getter for foundingDate - gets 
   * @generated
   * @return value of the feature 
   */
  public String getFoundingDate() {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_foundingDate == null)
      jcasType.jcas.throwFeatMissing("foundingDate", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_foundingDate);}
    
  /** setter for foundingDate - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setFoundingDate(String v) {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_foundingDate == null)
      jcasType.jcas.throwFeatMissing("foundingDate", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_foundingDate, v);}    
   
    
  //*--------------*
  //* Feature: contextInf

  /** getter for contextInf - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContextInf() {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_contextInf == null)
      jcasType.jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_contextInf);}
    
  /** setter for contextInf - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextInf(String v) {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_contextInf == null)
      jcasType.jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_contextInf, v);}    
   
    
  //*--------------*
  //* Feature: website

  /** getter for website - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWebsite() {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_website == null)
      jcasType.jcas.throwFeatMissing("website", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_website);}
    
  /** setter for website - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWebsite(String v) {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_website == null)
      jcasType.jcas.throwFeatMissing("website", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_website, v);}    
   
    
  //*--------------*
  //* Feature: headquarter

  /** getter for headquarter - gets 
   * @generated
   * @return value of the feature 
   */
  public String getHeadquarter() {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_headquarter == null)
      jcasType.jcas.throwFeatMissing("headquarter", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_headquarter);}
    
  /** setter for headquarter - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setHeadquarter(String v) {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_headquarter == null)
      jcasType.jcas.throwFeatMissing("headquarter", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_headquarter, v);}    
   
    
  //*--------------*
  //* Feature: chiefExecutiveOfficer

  /** getter for chiefExecutiveOfficer - gets 
   * @generated
   * @return value of the feature 
   */
  public String getChiefExecutiveOfficer() {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_chiefExecutiveOfficer == null)
      jcasType.jcas.throwFeatMissing("chiefExecutiveOfficer", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_chiefExecutiveOfficer);}
    
  /** setter for chiefExecutiveOfficer - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setChiefExecutiveOfficer(String v) {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_chiefExecutiveOfficer == null)
      jcasType.jcas.throwFeatMissing("chiefExecutiveOfficer", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_chiefExecutiveOfficer, v);}    
   
    
  //*--------------*
  //* Feature: setLabel

  /** getter for setLabel - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSetLabel() {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_setLabel == null)
      jcasType.jcas.throwFeatMissing("setLabel", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_setLabel);}
    
  /** setter for setLabel - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSetLabel(String v) {
    if (OrganisationContext_Type.featOkTst && ((OrganisationContext_Type)jcasType).casFeat_setLabel == null)
      jcasType.jcas.throwFeatMissing("setLabel", "org.texttechnologylab.annotation.context.type.OrganisationContext");
    jcasType.ll_cas.ll_setStringValue(addr, ((OrganisationContext_Type)jcasType).casFeatCode_setLabel, v);}    
  }

    