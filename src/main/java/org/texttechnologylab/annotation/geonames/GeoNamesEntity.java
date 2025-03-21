

   
/* Apache UIMA v3 - First created by JCasGen Fri Mar 21 14:51:22 CET 2025 */

package org.texttechnologylab.annotation.geonames;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.tcas.Annotation;


/** GeoNames annotation base type.
 * Updated by JCasGen Fri Mar 21 14:51:22 CET 2025
 * XML source: /nvme/projects/TTLab/UIMATypeSystem/target/jcasgen/typesystem.xml
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
  public final static String _FeatName_adm = "adm";
  public final static String _FeatName_latitude = "latitude";
  public final static String _FeatName_longitude = "longitude";
  public final static String _FeatName_elevation = "elevation";


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
  private final static CallSite _FC_adm = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "adm");
  private final static MethodHandle _FH_adm = _FC_adm.dynamicInvoker();
  private final static CallSite _FC_latitude = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "latitude");
  private final static MethodHandle _FH_latitude = _FC_latitude.dynamicInvoker();
  private final static CallSite _FC_longitude = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "longitude");
  private final static MethodHandle _FH_longitude = _FC_longitude.dynamicInvoker();
  private final static CallSite _FC_elevation = TypeSystemImpl.createCallSite(GeoNamesEntity.class, "elevation");
  private final static MethodHandle _FH_elevation = _FC_elevation.dynamicInvoker();

   
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
  //* Feature: adm

  /** getter for adm - gets Up to four administrative divisions in a StringList.
                        Most adm1 are FIPS codes. ISO codes are used for US, CH, BE and ME. UK and Greece are using an
                        additional level between country and fips code. The code '00' stands for general features where
                        no specific adm1 code is defined.
                        adm2 is the code for the second administrative division, i.e. a county in the US.
                        adm3 is the code for third level administrative division.
                        adm4 is the code for fourth level administrative division.
   * @generated
   * @return value of the feature 
   */
  public StringArray getAdm() { 
    return (StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_adm)));
  }
    
  /** setter for adm - sets Up to four administrative divisions in a StringList.
                        Most adm1 are FIPS codes. ISO codes are used for US, CH, BE and ME. UK and Greece are using an
                        additional level between country and fips code. The code '00' stands for general features where
                        no specific adm1 code is defined.
                        adm2 is the code for the second administrative division, i.e. a county in the US.
                        adm3 is the code for third level administrative division.
                        adm4 is the code for fourth level administrative division. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAdm(StringArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_adm), v);
  }    
    
    
  /** indexed getter for adm - gets an indexed value - Up to four administrative divisions in a StringList.
                        Most adm1 are FIPS codes. ISO codes are used for US, CH, BE and ME. UK and Greece are using an
                        additional level between country and fips code. The code '00' stands for general features where
                        no specific adm1 code is defined.
                        adm2 is the code for the second administrative division, i.e. a county in the US.
                        adm3 is the code for third level administrative division.
                        adm4 is the code for fourth level administrative division.
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getAdm(int i) {
     return ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_adm)))).get(i);
  } 

  /** indexed setter for adm - sets an indexed value - Up to four administrative divisions in a StringList.
                        Most adm1 are FIPS codes. ISO codes are used for US, CH, BE and ME. UK and Greece are using an
                        additional level between country and fips code. The code '00' stands for general features where
                        no specific adm1 code is defined.
                        adm2 is the code for the second administrative division, i.e. a county in the US.
                        adm3 is the code for third level administrative division.
                        adm4 is the code for fourth level administrative division.
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setAdm(int i, String v) {
    ((StringArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_adm)))).set(i, v);
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
    
  }

    