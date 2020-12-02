
/* First created by JCasGen Wed Dec 02 18:39:22 CET 2020 */
package org.texttechnologylab.annotation.context.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.node.type.Context_Type;

/** 
 * Updated by JCasGen Wed Dec 02 18:39:22 CET 2020
 * @generated */
public class LocationContext_Type extends Context_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LocationContext.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.context.type.LocationContext");
 
  /** @generated */
  final Feature casFeat_markerPoint;
  /** @generated */
  final int     casFeatCode_markerPoint;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMarkerPoint(int addr) {
        if (featOkTst && casFeat_markerPoint == null)
      jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.context.type.LocationContext");
    return ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMarkerPoint(int addr, int v) {
        if (featOkTst && casFeat_markerPoint == null)
      jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.context.type.LocationContext");
    ll_cas.ll_setRefValue(addr, casFeatCode_markerPoint, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public float getMarkerPoint(int addr, int i) {
        if (featOkTst && casFeat_markerPoint == null)
      jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.context.type.LocationContext");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint), i);
	return ll_cas.ll_getFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setMarkerPoint(int addr, int i, float v) {
        if (featOkTst && casFeat_markerPoint == null)
      jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.context.type.LocationContext");
    if (lowLevelTypeChecks)
      ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint), i);
    ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_geoJson;
  /** @generated */
  final int     casFeatCode_geoJson;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGeoJson(int addr) {
        if (featOkTst && casFeat_geoJson == null)
      jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.context.type.LocationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geoJson);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeoJson(int addr, String v) {
        if (featOkTst && casFeat_geoJson == null)
      jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.context.type.LocationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_geoJson, v);}
    
  
 
  /** @generated */
  final Feature casFeat_latLngs;
  /** @generated */
  final int     casFeatCode_latLngs;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLatLngs(int addr) {
        if (featOkTst && casFeat_latLngs == null)
      jcas.throwFeatMissing("latLngs", "org.texttechnologylab.annotation.context.type.LocationContext");
    return ll_cas.ll_getRefValue(addr, casFeatCode_latLngs);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLatLngs(int addr, int v) {
        if (featOkTst && casFeat_latLngs == null)
      jcas.throwFeatMissing("latLngs", "org.texttechnologylab.annotation.context.type.LocationContext");
    ll_cas.ll_setRefValue(addr, casFeatCode_latLngs, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public float getLatLngs(int addr, int i) {
        if (featOkTst && casFeat_latLngs == null)
      jcas.throwFeatMissing("latLngs", "org.texttechnologylab.annotation.context.type.LocationContext");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_latLngs), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_latLngs), i);
	return ll_cas.ll_getFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_latLngs), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setLatLngs(int addr, int i, float v) {
        if (featOkTst && casFeat_latLngs == null)
      jcas.throwFeatMissing("latLngs", "org.texttechnologylab.annotation.context.type.LocationContext");
    if (lowLevelTypeChecks)
      ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_latLngs), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_latLngs), i);
    ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_latLngs), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_contextInf;
  /** @generated */
  final int     casFeatCode_contextInf;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContextInf(int addr) {
        if (featOkTst && casFeat_contextInf == null)
      jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.LocationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_contextInf);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContextInf(int addr, String v) {
        if (featOkTst && casFeat_contextInf == null)
      jcas.throwFeatMissing("contextInf", "org.texttechnologylab.annotation.context.type.LocationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_contextInf, v);}
    
  
 
  /** @generated */
  final Feature casFeat_country;
  /** @generated */
  final int     casFeatCode_country;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCountry(int addr) {
        if (featOkTst && casFeat_country == null)
      jcas.throwFeatMissing("country", "org.texttechnologylab.annotation.context.type.LocationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_country);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCountry(int addr, String v) {
        if (featOkTst && casFeat_country == null)
      jcas.throwFeatMissing("country", "org.texttechnologylab.annotation.context.type.LocationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_country, v);}
    
  
 
  /** @generated */
  final Feature casFeat_numberOfCitizen;
  /** @generated */
  final int     casFeatCode_numberOfCitizen;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getNumberOfCitizen(int addr) {
        if (featOkTst && casFeat_numberOfCitizen == null)
      jcas.throwFeatMissing("numberOfCitizen", "org.texttechnologylab.annotation.context.type.LocationContext");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_numberOfCitizen);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNumberOfCitizen(int addr, double v) {
        if (featOkTst && casFeat_numberOfCitizen == null)
      jcas.throwFeatMissing("numberOfCitizen", "org.texttechnologylab.annotation.context.type.LocationContext");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_numberOfCitizen, v);}
    
  
 
  /** @generated */
  final Feature casFeat_geoNamesID;
  /** @generated */
  final int     casFeatCode_geoNamesID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getGeoNamesID(int addr) {
        if (featOkTst && casFeat_geoNamesID == null)
      jcas.throwFeatMissing("geoNamesID", "org.texttechnologylab.annotation.context.type.LocationContext");
    return ll_cas.ll_getIntValue(addr, casFeatCode_geoNamesID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeoNamesID(int addr, int v) {
        if (featOkTst && casFeat_geoNamesID == null)
      jcas.throwFeatMissing("geoNamesID", "org.texttechnologylab.annotation.context.type.LocationContext");
    ll_cas.ll_setIntValue(addr, casFeatCode_geoNamesID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_areaSize;
  /** @generated */
  final int     casFeatCode_areaSize;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAreaSize(int addr) {
        if (featOkTst && casFeat_areaSize == null)
      jcas.throwFeatMissing("areaSize", "org.texttechnologylab.annotation.context.type.LocationContext");
    return ll_cas.ll_getStringValue(addr, casFeatCode_areaSize);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAreaSize(int addr, String v) {
        if (featOkTst && casFeat_areaSize == null)
      jcas.throwFeatMissing("areaSize", "org.texttechnologylab.annotation.context.type.LocationContext");
    ll_cas.ll_setStringValue(addr, casFeatCode_areaSize, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LocationContext_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_markerPoint = jcas.getRequiredFeatureDE(casType, "markerPoint", "uima.cas.FloatArray", featOkTst);
    casFeatCode_markerPoint  = (null == casFeat_markerPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_markerPoint).getCode();

 
    casFeat_geoJson = jcas.getRequiredFeatureDE(casType, "geoJson", "uima.cas.String", featOkTst);
    casFeatCode_geoJson  = (null == casFeat_geoJson) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geoJson).getCode();

 
    casFeat_latLngs = jcas.getRequiredFeatureDE(casType, "latLngs", "uima.cas.FloatArray", featOkTst);
    casFeatCode_latLngs  = (null == casFeat_latLngs) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_latLngs).getCode();

 
    casFeat_contextInf = jcas.getRequiredFeatureDE(casType, "contextInf", "uima.cas.String", featOkTst);
    casFeatCode_contextInf  = (null == casFeat_contextInf) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contextInf).getCode();

 
    casFeat_country = jcas.getRequiredFeatureDE(casType, "country", "uima.cas.String", featOkTst);
    casFeatCode_country  = (null == casFeat_country) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_country).getCode();

 
    casFeat_numberOfCitizen = jcas.getRequiredFeatureDE(casType, "numberOfCitizen", "uima.cas.Double", featOkTst);
    casFeatCode_numberOfCitizen  = (null == casFeat_numberOfCitizen) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numberOfCitizen).getCode();

 
    casFeat_geoNamesID = jcas.getRequiredFeatureDE(casType, "geoNamesID", "uima.cas.Integer", featOkTst);
    casFeatCode_geoNamesID  = (null == casFeat_geoNamesID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geoNamesID).getCode();

 
    casFeat_areaSize = jcas.getRequiredFeatureDE(casType, "areaSize", "uima.cas.String", featOkTst);
    casFeatCode_areaSize  = (null == casFeat_areaSize) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_areaSize).getCode();

  }
}



    