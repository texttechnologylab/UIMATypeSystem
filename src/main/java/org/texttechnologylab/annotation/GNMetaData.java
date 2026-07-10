

/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class GNMetaData extends MetaData {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GNMetaData.class);
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
  protected GNMetaData() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GNMetaData(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GNMetaData(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GNMetaData(JCas jcas, int begin, int end) {
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
  //* Feature: date

  /** getter for date - gets 
   * @generated
   * @return value of the feature 
   */
  public String getDate() {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.GNMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_date);}
    
  /** setter for date - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setDate(String v) {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.GNMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_date, v);}    
   
    
  //*--------------*
  //* Feature: version

  /** getter for version - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVersion() {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.GNMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_version);}
    
  /** setter for version - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVersion(String v) {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.GNMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_version, v);}    
   
    
  //*--------------*
  //* Feature: withAllMatches

  /** getter for withAllMatches - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWithAllMatches() {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withAllMatches == null)
      jcasType.jcas.throwFeatMissing("withAllMatches", "org.texttechnologylab.annotation.GNMetaData");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withAllMatches);}
    
  /** setter for withAllMatches - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithAllMatches(boolean v) {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withAllMatches == null)
      jcasType.jcas.throwFeatMissing("withAllMatches", "org.texttechnologylab.annotation.GNMetaData");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withAllMatches, v);}    
   
    
  //*--------------*
  //* Feature: withAmbiguousNames

  /** getter for withAmbiguousNames - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWithAmbiguousNames() {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withAmbiguousNames == null)
      jcasType.jcas.throwFeatMissing("withAmbiguousNames", "org.texttechnologylab.annotation.GNMetaData");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withAmbiguousNames);}
    
  /** setter for withAmbiguousNames - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithAmbiguousNames(boolean v) {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withAmbiguousNames == null)
      jcasType.jcas.throwFeatMissing("withAmbiguousNames", "org.texttechnologylab.annotation.GNMetaData");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withAmbiguousNames, v);}    
   
    
  //*--------------*
  //* Feature: withBayes

  /** getter for withBayes - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWithBayes() {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withBayes == null)
      jcasType.jcas.throwFeatMissing("withBayes", "org.texttechnologylab.annotation.GNMetaData");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withBayes);}
    
  /** setter for withBayes - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithBayes(boolean v) {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withBayes == null)
      jcasType.jcas.throwFeatMissing("withBayes", "org.texttechnologylab.annotation.GNMetaData");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withBayes, v);}    
   
    
  //*--------------*
  //* Feature: wihUniqueNames

  /** getter for wihUniqueNames - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWihUniqueNames() {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_wihUniqueNames == null)
      jcasType.jcas.throwFeatMissing("wihUniqueNames", "org.texttechnologylab.annotation.GNMetaData");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_wihUniqueNames);}
    
  /** setter for wihUniqueNames - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWihUniqueNames(boolean v) {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_wihUniqueNames == null)
      jcasType.jcas.throwFeatMissing("wihUniqueNames", "org.texttechnologylab.annotation.GNMetaData");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_wihUniqueNames, v);}    
   
    
  //*--------------*
  //* Feature: withOddsAdjustment

  /** getter for withOddsAdjustment - gets 
   * @generated
   * @return value of the feature 
   */
  public boolean getWithOddsAdjustment() {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withOddsAdjustment == null)
      jcasType.jcas.throwFeatMissing("withOddsAdjustment", "org.texttechnologylab.annotation.GNMetaData");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withOddsAdjustment);}
    
  /** setter for withOddsAdjustment - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithOddsAdjustment(boolean v) {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withOddsAdjustment == null)
      jcasType.jcas.throwFeatMissing("withOddsAdjustment", "org.texttechnologylab.annotation.GNMetaData");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withOddsAdjustment, v);}    
   
    
  //*--------------*
  //* Feature: withSources

  /** getter for withSources - gets 
   * @generated
   * @return value of the feature 
   */
  public String getWithSources() {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withSources == null)
      jcasType.jcas.throwFeatMissing("withSources", "org.texttechnologylab.annotation.GNMetaData");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withSources);}
    
  /** setter for withSources - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setWithSources(String v) {
    if (GNMetaData_Type.featOkTst && ((GNMetaData_Type)jcasType).casFeat_withSources == null)
      jcasType.jcas.throwFeatMissing("withSources", "org.texttechnologylab.annotation.GNMetaData");
    jcasType.ll_cas.ll_setStringValue(addr, ((GNMetaData_Type)jcasType).casFeatCode_withSources, v);}    
  }

    