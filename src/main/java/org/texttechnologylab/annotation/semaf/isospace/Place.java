

/* First created by JCasGen Tue Mar 24 15:23:19 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Apr 01 09:53:21 CEST 2020
 * XML source: /home/gabrami/Projects/UIMATypeSystem/src/main/resources/desc/type/IsoTimeMLTypeSystem.xml
 * @generated */
public class Place extends Location {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Place.class);
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
  protected Place() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Place(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Place(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Place(JCas jcas, int begin, int end) {
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
  //* Feature: country

  /** getter for country - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCountry() {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_country == null)
      jcasType.jcas.throwFeatMissing("country", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Place_Type)jcasType).casFeatCode_country);}
    
  /** setter for country - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountry(String v) {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_country == null)
      jcasType.jcas.throwFeatMissing("country", "org.texttechnologylab.annotation.semaf.isospace.Place");
    jcasType.ll_cas.ll_setStringValue(addr, ((Place_Type)jcasType).casFeatCode_country, v);}    
   
    
  //*--------------*
  //* Feature: state

  /** getter for state - gets 
   * @generated
   * @return value of the feature 
   */
  public String getState() {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_state == null)
      jcasType.jcas.throwFeatMissing("state", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Place_Type)jcasType).casFeatCode_state);}
    
  /** setter for state - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setState(String v) {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_state == null)
      jcasType.jcas.throwFeatMissing("state", "org.texttechnologylab.annotation.semaf.isospace.Place");
    jcasType.ll_cas.ll_setStringValue(addr, ((Place_Type)jcasType).casFeatCode_state, v);}    
   
    
  //*--------------*
  //* Feature: ctv

  /** getter for ctv - gets ( CITY | TOWN | VILLAGE )
   * @generated
   * @return value of the feature 
   */
  public String getCtv() {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_ctv == null)
      jcasType.jcas.throwFeatMissing("ctv", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Place_Type)jcasType).casFeatCode_ctv);}
    
  /** setter for ctv - sets ( CITY | TOWN | VILLAGE ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCtv(String v) {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_ctv == null)
      jcasType.jcas.throwFeatMissing("ctv", "org.texttechnologylab.annotation.semaf.isospace.Place");
    jcasType.ll_cas.ll_setStringValue(addr, ((Place_Type)jcasType).casFeatCode_ctv, v);}    
   
    
  //*--------------*
  //* Feature: continent

  /** getter for continent - gets ( AF | AN | AI | AU | GO | LA | NA | PA | SA )
   * @generated
   * @return value of the feature 
   */
  public String getContinent() {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_continent == null)
      jcasType.jcas.throwFeatMissing("continent", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Place_Type)jcasType).casFeatCode_continent);}
    
  /** setter for continent - sets ( AF | AN | AI | AU | GO | LA | NA | PA | SA ) 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContinent(String v) {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_continent == null)
      jcasType.jcas.throwFeatMissing("continent", "org.texttechnologylab.annotation.semaf.isospace.Place");
    jcasType.ll_cas.ll_setStringValue(addr, ((Place_Type)jcasType).casFeatCode_continent, v);}    
   
    
  //*--------------*
  //* Feature: county

  /** getter for county - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCounty() {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_county == null)
      jcasType.jcas.throwFeatMissing("county", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Place_Type)jcasType).casFeatCode_county);}
    
  /** setter for county - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCounty(String v) {
    if (Place_Type.featOkTst && ((Place_Type)jcasType).casFeat_county == null)
      jcasType.jcas.throwFeatMissing("county", "org.texttechnologylab.annotation.semaf.isospace.Place");
    jcasType.ll_cas.ll_setStringValue(addr, ((Place_Type)jcasType).casFeatCode_county, v);}    
  }

    