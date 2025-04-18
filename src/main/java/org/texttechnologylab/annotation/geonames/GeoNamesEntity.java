

   
/* Apache UIMA v3 - First created by JCasGen Fri Apr 18 23:59:27 CEST 2025 */

package org.texttechnologylab.annotation.geonames;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** GeoNames annotation base type.
 * Updated by JCasGen Fri Apr 18 23:59:27 CEST 2025
 * XML source: /home/gabrami/Projects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class GeoNamesEntity extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.geonames.GeoNamesEntity";
  
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
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_id = "id";
  public final static String _FeatName_name = "name";
  public final static String _FeatName_featureClass = "featureClass";
  public final static String _FeatName_featureCode = "featureCode";
  public final static String _FeatName_countryCode = "countryCode";
  public final static String _FeatName_adm1 = "adm1";
  public final static String _FeatName_adm2 = "adm2";
  public final static String _FeatName_adm3 = "adm3";
  public final static String _FeatName_adm4 = "adm4";
  public final static String _FeatName_latitude = "latitude";
  public final static String _FeatName_longitude = "longitude";
  public final static String _FeatName_elevation = "elevation";
  public final static String _FeatName_referenceAnnotation = "referenceAnnotation";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_id = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "id");
  private final static MethodHandle _FH_id = _FC_id.dynamicInvoker();
  private final static CallSite _FC_name = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "name");
  private final static MethodHandle _FH_name = _FC_name.dynamicInvoker();
  private final static CallSite _FC_featureClass = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "featureClass");
  private final static MethodHandle _FH_featureClass = _FC_featureClass.dynamicInvoker();
  private final static CallSite _FC_featureCode = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "featureCode");
  private final static MethodHandle _FH_featureCode = _FC_featureCode.dynamicInvoker();
  private final static CallSite _FC_countryCode = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "countryCode");
  private final static MethodHandle _FH_countryCode = _FC_countryCode.dynamicInvoker();
  private final static CallSite _FC_adm1 = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "adm1");
  private final static MethodHandle _FH_adm1 = _FC_adm1.dynamicInvoker();
  private final static CallSite _FC_adm2 = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "adm2");
  private final static MethodHandle _FH_adm2 = _FC_adm2.dynamicInvoker();
  private final static CallSite _FC_adm3 = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "adm3");
  private final static MethodHandle _FH_adm3 = _FC_adm3.dynamicInvoker();
  private final static CallSite _FC_adm4 = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "adm4");
  private final static MethodHandle _FH_adm4 = _FC_adm4.dynamicInvoker();
  private final static CallSite _FC_latitude = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "latitude");
  private final static MethodHandle _FH_latitude = _FC_latitude.dynamicInvoker();
  private final static CallSite _FC_longitude = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "longitude");
  private final static MethodHandle _FH_longitude = _FC_longitude.dynamicInvoker();
  private final static CallSite _FC_elevation = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "elevation");
  private final static MethodHandle _FH_elevation = _FC_elevation.dynamicInvoker();
  private final static CallSite _FC_referenceAnnotation = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "referenceAnnotation");
  private final static MethodHandle _FH_referenceAnnotation = _FC_referenceAnnotation.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected GeoNamesEntity() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public GeoNamesEntity(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
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
    return _getIntValueNc(wrapGetIntCatchException(_FH_id));
  }
    
  /** setter for id - sets Integer ID of this record in the GeoNames database. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_id), v);
  }    
    
   
    
  //*--------------*
  //* Feature: name

  /** getter for name - gets Canonical name of this record, usually an English one.
   * @generated
   * @return value of the feature 
   */
  public String getName() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_name));
  }
    
  /** setter for name - sets Canonical name of this record, usually an English one. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_name), v);
  }    
    
   
    
  //*--------------*
  //* Feature: featureClass

  /** getter for featureClass - gets Single character feature class, see: http://www.geonames.org/export/codes.html
   * @generated
   * @return value of the feature 
   */
  public String getFeatureClass() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_featureClass));
  }
    
  /** setter for featureClass - sets Single character feature class, see: http://www.geonames.org/export/codes.html 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatureClass(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_featureClass), v);
  }    
    
   
    
  //*--------------*
  //* Feature: featureCode

  /** getter for featureCode - gets Fine-grained feature code, see:
                        http://www.geonames.org/export/codes.html
   * @generated
   * @return value of the feature 
   */
  public String getFeatureCode() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_featureCode));
  }
    
  /** setter for featureCode - sets Fine-grained feature code, see:
                        http://www.geonames.org/export/codes.html 
   * @generated
   * @param v value to set into the feature 
   */
  public void setFeatureCode(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_featureCode), v);
  }    
    
   
    
  //*--------------*
  //* Feature: countryCode

  /** getter for countryCode - gets ISO-3166 2-letter country code
   * @generated
   * @return value of the feature 
   */
  public String getCountryCode() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_countryCode));
  }
    
  /** setter for countryCode - sets ISO-3166 2-letter country code 
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountryCode(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_countryCode), v);
  }    
    
   
    
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
    return _getStringValueNc(wrapGetIntCatchException(_FH_adm1));
  }
    
  /** setter for adm1 - sets The code for top level administrative division, most of which are FIPS codes.
                        ISO codes are used for US, CH, BE and ME.
                        UK and Greece are using an additional level between country and fips code.
                        The code '00' stands for general features where no specific adm1 code is defined. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdm1(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_adm1), v);
  }    
    
   
    
  //*--------------*
  //* Feature: adm2

  /** getter for adm2 - gets The code for the second level administrative division, i.e. a county in the US.
   * @generated
   * @return value of the feature 
   */
  public String getAdm2() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_adm2));
  }
    
  /** setter for adm2 - sets The code for the second level administrative division, i.e. a county in the US. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdm2(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_adm2), v);
  }    
    
   
    
  //*--------------*
  //* Feature: adm3

  /** getter for adm3 - gets The code for third level administrative division.
   * @generated
   * @return value of the feature 
   */
  public String getAdm3() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_adm3));
  }
    
  /** setter for adm3 - sets The code for third level administrative division. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdm3(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_adm3), v);
  }    
    
   
    
  //*--------------*
  //* Feature: adm4

  /** getter for adm4 - gets The code for fourth level administrative division.
   * @generated
   * @return value of the feature 
   */
  public String getAdm4() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_adm4));
  }
    
  /** setter for adm4 - sets The code for fourth level administrative division. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdm4(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_adm4), v);
  }    
    
   
    
  //*--------------*
  //* Feature: latitude

  /** getter for latitude - gets Latitude as a 32-bit floating point number.
   * @generated
   * @return value of the feature 
   */
  public float getLatitude() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_latitude));
  }
    
  /** setter for latitude - sets Latitude as a 32-bit floating point number. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLatitude(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_latitude), v);
  }    
    
   
    
  //*--------------*
  //* Feature: longitude

  /** getter for longitude - gets Longitude as a 32-bit floating point number.
   * @generated
   * @return value of the feature 
   */
  public float getLongitude() { 
    return _getFloatValueNc(wrapGetIntCatchException(_FH_longitude));
  }
    
  /** setter for longitude - sets Longitude as a 32-bit floating point number. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLongitude(float v) {
    _setFloatValueNfc(wrapGetIntCatchException(_FH_longitude), v);
  }    
    
   
    
  //*--------------*
  //* Feature: elevation

  /** getter for elevation - gets Elevation in meters above/below normal as a 16-bit signed integer number;
                        optional, defaults to 0.
   * @generated
   * @return value of the feature 
   */
  public short getElevation() { 
    return _getShortValueNc(wrapGetIntCatchException(_FH_elevation));
  }
    
  /** setter for elevation - sets Elevation in meters above/below normal as a 16-bit signed integer number;
                        optional, defaults to 0. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setElevation(short v) {
    _setShortValueNfc(wrapGetIntCatchException(_FH_elevation), v);
  }    
    
   
    
  //*--------------*
  //* Feature: referenceAnnotation

  /** getter for referenceAnnotation - gets The annotation this GeoName annotation is in reference to. By default, this should be a
                        'de.tudarmstadt.ukp.dkpro.core.api.ner.type.Location' annotation.
   * @generated
   * @return value of the feature 
   */
  public Annotation getReferenceAnnotation() { 
    return (Annotation)(_getFeatureValueNc(wrapGetIntCatchException(_FH_referenceAnnotation)));
  }
    
  /** setter for referenceAnnotation - sets The annotation this GeoName annotation is in reference to. By default, this should be a
                        'de.tudarmstadt.ukp.dkpro.core.api.ner.type.Location' annotation. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setReferenceAnnotation(Annotation v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_referenceAnnotation), v);
  }    
    
  }

    