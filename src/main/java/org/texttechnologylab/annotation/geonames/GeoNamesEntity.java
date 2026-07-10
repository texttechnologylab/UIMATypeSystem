

/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.geonames;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** GeoNames annotation base type.
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * XML source: /home/staff_homes/abrami/Projects/GitHub/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class GeoNamesEntity extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeoNamesEntity.class);
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
  protected GeoNamesEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GeoNamesEntity(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeoNamesEntity(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeoNamesEntity(JCas jcas, int begin, int end) {
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
  //* Feature: id

  /** getter for id - gets Integer ID of this record in the GeoNames database.
   * @generated
   * @return value of the feature 
   */
  public int getId() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_id);}
    
  /** setter for id - sets Integer ID of this record in the GeoNames database. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets Canonical name of this record, usually an English one.
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets Canonical name of this record, usually an English one. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: featureClass

  /** getter for featureClass - gets Single character feature class, see: http://www.geonames.org/export/codes.html
   * @generated
   * @return value of the feature 
   */
  public String getFeatureClass() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_featureClass == null)
      jcasType.jcas.throwFeatMissing("featureClass", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_featureClass);}
    
  /** setter for featureClass - sets Single character feature class, see: http://www.geonames.org/export/codes.html 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatureClass(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_featureClass == null)
      jcasType.jcas.throwFeatMissing("featureClass", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_featureClass, v);}    
   
    
  //*--------------*
  //* Feature: featureCode

  /** getter for featureCode - gets Fine-grained feature code, see:
                        http://www.geonames.org/export/codes.html
   * @generated
   * @return value of the feature 
   */
  public String getFeatureCode() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_featureCode == null)
      jcasType.jcas.throwFeatMissing("featureCode", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_featureCode);}
    
  /** setter for featureCode - sets Fine-grained feature code, see:
                        http://www.geonames.org/export/codes.html 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatureCode(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_featureCode == null)
      jcasType.jcas.throwFeatMissing("featureCode", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_featureCode, v);}    
   
    
  //*--------------*
  //* Feature: countryCode

  /** getter for countryCode - gets ISO-3166 2-letter country code
   * @generated
   * @return value of the feature 
   */
  public String getCountryCode() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_countryCode == null)
      jcasType.jcas.throwFeatMissing("countryCode", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_countryCode);}
    
  /** setter for countryCode - sets ISO-3166 2-letter country code 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountryCode(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_countryCode == null)
      jcasType.jcas.throwFeatMissing("countryCode", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_countryCode, v);}    
   
    
  //*--------------*
  //* Feature: adm1

  /** getter for adm1 - gets The code for top level administrative division, most of which are FIPS codes.
                        ISO codes are used for US, CH, BE and ME.
                        UK and Greece are using an additional level between country and fips code.
                        The code '00' stands for general features where no specific adm1 code is defined.
   * @generated
   * @return value of the feature 
   */
  public String getAdm1() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_adm1 == null)
      jcasType.jcas.throwFeatMissing("adm1", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_adm1);}
    
  /** setter for adm1 - sets The code for top level administrative division, most of which are FIPS codes.
                        ISO codes are used for US, CH, BE and ME.
                        UK and Greece are using an additional level between country and fips code.
                        The code '00' stands for general features where no specific adm1 code is defined. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdm1(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_adm1 == null)
      jcasType.jcas.throwFeatMissing("adm1", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_adm1, v);}    
   
    
  //*--------------*
  //* Feature: adm2

  /** getter for adm2 - gets The code for the second level administrative division, i.e. a county in the US.
   * @generated
   * @return value of the feature 
   */
  public String getAdm2() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_adm2 == null)
      jcasType.jcas.throwFeatMissing("adm2", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_adm2);}
    
  /** setter for adm2 - sets The code for the second level administrative division, i.e. a county in the US. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdm2(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_adm2 == null)
      jcasType.jcas.throwFeatMissing("adm2", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_adm2, v);}    
   
    
  //*--------------*
  //* Feature: adm3

  /** getter for adm3 - gets The code for third level administrative division.
   * @generated
   * @return value of the feature 
   */
  public String getAdm3() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_adm3 == null)
      jcasType.jcas.throwFeatMissing("adm3", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_adm3);}
    
  /** setter for adm3 - sets The code for third level administrative division. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdm3(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_adm3 == null)
      jcasType.jcas.throwFeatMissing("adm3", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_adm3, v);}    
   
    
  //*--------------*
  //* Feature: adm4

  /** getter for adm4 - gets The code for fourth level administrative division.
   * @generated
   * @return value of the feature 
   */
  public String getAdm4() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_adm4 == null)
      jcasType.jcas.throwFeatMissing("adm4", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_adm4);}
    
  /** setter for adm4 - sets The code for fourth level administrative division. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdm4(String v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_adm4 == null)
      jcasType.jcas.throwFeatMissing("adm4", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_adm4, v);}    
   
    
  //*--------------*
  //* Feature: latitude

  /** getter for latitude - gets Latitude as a 32-bit floating point number.
   * @generated
   * @return value of the feature 
   */
  public float getLatitude() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_latitude == null)
      jcasType.jcas.throwFeatMissing("latitude", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_latitude);}
    
  /** setter for latitude - sets Latitude as a 32-bit floating point number. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLatitude(float v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_latitude == null)
      jcasType.jcas.throwFeatMissing("latitude", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setFloatValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_latitude, v);}    
   
    
  //*--------------*
  //* Feature: longitude

  /** getter for longitude - gets Longitude as a 32-bit floating point number.
   * @generated
   * @return value of the feature 
   */
  public float getLongitude() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_longitude == null)
      jcasType.jcas.throwFeatMissing("longitude", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_longitude);}
    
  /** setter for longitude - sets Longitude as a 32-bit floating point number. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLongitude(float v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_longitude == null)
      jcasType.jcas.throwFeatMissing("longitude", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setFloatValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_longitude, v);}    
   
    
  //*--------------*
  //* Feature: elevation

  /** getter for elevation - gets Elevation in meters above/below normal as a 16-bit signed integer number;
                        optional, defaults to 0.
   * @generated
   * @return value of the feature 
   */
  public short getElevation() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_elevation == null)
      jcasType.jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return jcasType.ll_cas.ll_getShortValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_elevation);}
    
  /** setter for elevation - sets Elevation in meters above/below normal as a 16-bit signed integer number;
                        optional, defaults to 0. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setElevation(short v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_elevation == null)
      jcasType.jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setShortValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_elevation, v);}    
   
    
  //*--------------*
  //* Feature: referenceAnnotation

  /** getter for referenceAnnotation - gets The annotation this GeoName annotation is in reference to. By default, this should be a
                        'de.tudarmstadt.ukp.dkpro.core.api.ner.type.Location' annotation.
   * @generated
   * @return value of the feature 
   */
  public Annotation getReferenceAnnotation() {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_referenceAnnotation == null)
      jcasType.jcas.throwFeatMissing("referenceAnnotation", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_referenceAnnotation)));}
    
  /** setter for referenceAnnotation - sets The annotation this GeoName annotation is in reference to. By default, this should be a
                        'de.tudarmstadt.ukp.dkpro.core.api.ner.type.Location' annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferenceAnnotation(Annotation v) {
    if (GeoNamesEntity_Type.featOkTst && ((GeoNamesEntity_Type)jcasType).casFeat_referenceAnnotation == null)
      jcasType.jcas.throwFeatMissing("referenceAnnotation", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    jcasType.ll_cas.ll_setRefValue(addr, ((GeoNamesEntity_Type)jcasType).casFeatCode_referenceAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    