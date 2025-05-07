

   
/* Apache UIMA v3 - First created by JCasGen Wed May 07 18:09:54 CEST 2025 */

package org.texttechnologylab.annotation.context.type;
 

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.texttechnologylab.annotation.node.type.Context;
import org.apache.uima.jcas.cas.FloatArray;


/**
 * Updated by JCasGen Wed May 07 18:09:54 CEST 2025
 * XML source: /home/staff_homes/abrami/Projects/GitProjects/UIMATypeSystem/target/jcasgen/typesystem.xml
 * @generated */
public class LocationContext extends Context {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.texttechnologylab.annotation.context.type.LocationContext";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LocationContext.class);
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
   
  public final static String _FeatName_markerPoint = "markerPoint";
  public final static String _FeatName_geoJson = "geoJson";
  public final static String _FeatName_latLngs = "latLngs";
  public final static String _FeatName_contextInf = "contextInf";
  public final static String _FeatName_country = "country";
  public final static String _FeatName_numberOfCitizen = "numberOfCitizen";
  public final static String _FeatName_geoNamesID = "geoNamesID";
  public final static String _FeatName_areaSize = "areaSize";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_markerPoint = TypeSystemImpl.createCallSite(LocationContext.class, "markerPoint");
  private final static MethodHandle _FH_markerPoint = _FC_markerPoint.dynamicInvoker();
  private final static CallSite _FC_geoJson = TypeSystemImpl.createCallSite(LocationContext.class, "geoJson");
  private final static MethodHandle _FH_geoJson = _FC_geoJson.dynamicInvoker();
  private final static CallSite _FC_latLngs = TypeSystemImpl.createCallSite(LocationContext.class, "latLngs");
  private final static MethodHandle _FH_latLngs = _FC_latLngs.dynamicInvoker();
  private final static CallSite _FC_contextInf = TypeSystemImpl.createCallSite(LocationContext.class, "contextInf");
  private final static MethodHandle _FH_contextInf = _FC_contextInf.dynamicInvoker();
  private final static CallSite _FC_country = TypeSystemImpl.createCallSite(LocationContext.class, "country");
  private final static MethodHandle _FH_country = _FC_country.dynamicInvoker();
  private final static CallSite _FC_numberOfCitizen = TypeSystemImpl.createCallSite(LocationContext.class, "numberOfCitizen");
  private final static MethodHandle _FH_numberOfCitizen = _FC_numberOfCitizen.dynamicInvoker();
  private final static CallSite _FC_geoNamesID = TypeSystemImpl.createCallSite(LocationContext.class, "geoNamesID");
  private final static MethodHandle _FH_geoNamesID = _FC_geoNamesID.dynamicInvoker();
  private final static CallSite _FC_areaSize = TypeSystemImpl.createCallSite(LocationContext.class, "areaSize");
  private final static MethodHandle _FH_areaSize = _FC_areaSize.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  @Deprecated
  @SuppressWarnings ("deprecation")
  protected LocationContext() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public LocationContext(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LocationContext(JCas jcas) {
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
  //* Feature: markerPoint

  /** getter for markerPoint - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getMarkerPoint() { 
    return (FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_markerPoint)));
  }
    
  /** setter for markerPoint - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMarkerPoint(FloatArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_markerPoint), v);
  }    
    
    
  /** indexed getter for markerPoint - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getMarkerPoint(int i) {
     return ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_markerPoint)))).get(i);
  } 

  /** indexed setter for markerPoint - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMarkerPoint(int i, float v) {
    ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_markerPoint)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: geoJson

  /** getter for geoJson - gets 
   * @generated
   * @return value of the feature 
   */
  public String getGeoJson() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_geoJson));
  }
    
  /** setter for geoJson - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeoJson(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_geoJson), v);
  }    
    
   
    
  //*--------------*
  //* Feature: latLngs

  /** getter for latLngs - gets 
   * @generated
   * @return value of the feature 
   */
  public FloatArray getLatLngs() { 
    return (FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_latLngs)));
  }
    
  /** setter for latLngs - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLatLngs(FloatArray v) {
    _setFeatureValueNcWj(wrapGetIntCatchException(_FH_latLngs), v);
  }    
    
    
  /** indexed getter for latLngs - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public float getLatLngs(int i) {
     return ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_latLngs)))).get(i);
  } 

  /** indexed setter for latLngs - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setLatLngs(int i, float v) {
    ((FloatArray)(_getFeatureValueNc(wrapGetIntCatchException(_FH_latLngs)))).set(i, v);
  }  
   
    
  //*--------------*
  //* Feature: contextInf

  /** getter for contextInf - gets 
   * @generated
   * @return value of the feature 
   */
  public String getContextInf() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_contextInf));
  }
    
  /** setter for contextInf - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContextInf(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_contextInf), v);
  }    
    
   
    
  //*--------------*
  //* Feature: country

  /** getter for country - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCountry() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_country));
  }
    
  /** setter for country - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCountry(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_country), v);
  }    
    
   
    
  //*--------------*
  //* Feature: numberOfCitizen

  /** getter for numberOfCitizen - gets 
   * @generated
   * @return value of the feature 
   */
  public double getNumberOfCitizen() { 
    return _getDoubleValueNc(wrapGetIntCatchException(_FH_numberOfCitizen));
  }
    
  /** setter for numberOfCitizen - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setNumberOfCitizen(double v) {
    _setDoubleValueNfc(wrapGetIntCatchException(_FH_numberOfCitizen), v);
  }    
    
   
    
  //*--------------*
  //* Feature: geoNamesID

  /** getter for geoNamesID - gets 
   * @generated
   * @return value of the feature 
   */
  public int getGeoNamesID() { 
    return _getIntValueNc(wrapGetIntCatchException(_FH_geoNamesID));
  }
    
  /** setter for geoNamesID - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGeoNamesID(int v) {
    _setIntValueNfc(wrapGetIntCatchException(_FH_geoNamesID), v);
  }    
    
   
    
  //*--------------*
  //* Feature: areaSize

  /** getter for areaSize - gets 
   * @generated
   * @return value of the feature 
   */
  public String getAreaSize() { 
    return _getStringValueNc(wrapGetIntCatchException(_FH_areaSize));
  }
    
  /** setter for areaSize - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setAreaSize(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_areaSize), v);
  }    
    
  }

    