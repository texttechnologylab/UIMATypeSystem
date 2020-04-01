
/* First created by JCasGen Fri Mar 20 09:14:07 CET 2020 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.type.Node_Type;

/** 
 * Updated by JCasGen Fri Mar 20 09:14:07 CET 2020
 * @generated */
public class IndividualVis_Type extends Node_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = IndividualVis.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.node.type.IndividualVis");
 
  /** @generated */
  final Feature casFeat_geonamesID;
  /** @generated */
  final int     casFeatCode_geonamesID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getGeonamesID(int addr) {
        if (featOkTst && casFeat_geonamesID == null)
      jcas.throwFeatMissing("geonamesID", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return ll_cas.ll_getIntValue(addr, casFeatCode_geonamesID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeonamesID(int addr, int v) {
        if (featOkTst && casFeat_geonamesID == null)
      jcas.throwFeatMissing("geonamesID", "org.texttechnologylab.annotation.node.type.IndividualVis");
    ll_cas.ll_setIntValue(addr, casFeatCode_geonamesID, v);}
    
  
 
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
      jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMarkerPoint(int addr, int v) {
        if (featOkTst && casFeat_markerPoint == null)
      jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.node.type.IndividualVis");
    ll_cas.ll_setRefValue(addr, casFeatCode_markerPoint, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public float getMarkerPoint(int addr, int i) {
        if (featOkTst && casFeat_markerPoint == null)
      jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.node.type.IndividualVis");
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
      jcas.throwFeatMissing("markerPoint", "org.texttechnologylab.annotation.node.type.IndividualVis");
    if (lowLevelTypeChecks)
      ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint), i);
    ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_markerPoint), i, v);
  }
 
 
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
      jcas.throwFeatMissing("areaSize", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_areaSize);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAreaSize(int addr, String v) {
        if (featOkTst && casFeat_areaSize == null)
      jcas.throwFeatMissing("areaSize", "org.texttechnologylab.annotation.node.type.IndividualVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_areaSize, v);}
    
  
 
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
      jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geoJson);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeoJson(int addr, String v) {
        if (featOkTst && casFeat_geoJson == null)
      jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.node.type.IndividualVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_geoJson, v);}
    
  
 
  /** @generated */
  final Feature casFeat_displayName;
  /** @generated */
  final int     casFeatCode_displayName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDisplayName(int addr) {
        if (featOkTst && casFeat_displayName == null)
      jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_displayName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDisplayName(int addr, String v) {
        if (featOkTst && casFeat_displayName == null)
      jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.IndividualVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_displayName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_image;
  /** @generated */
  final int     casFeatCode_image;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getImage(int addr) {
        if (featOkTst && casFeat_image == null)
      jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_image);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setImage(int addr, String v) {
        if (featOkTst && casFeat_image == null)
      jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.IndividualVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_image, v);}
    
  
 
  /** @generated */
  final Feature casFeat_URI;
  /** @generated */
  final int     casFeatCode_URI;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getURI(int addr) {
        if (featOkTst && casFeat_URI == null)
      jcas.throwFeatMissing("URI", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_URI);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setURI(int addr, String v) {
        if (featOkTst && casFeat_URI == null)
      jcas.throwFeatMissing("URI", "org.texttechnologylab.annotation.node.type.IndividualVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_URI, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ofClass;
  /** @generated */
  final int     casFeatCode_ofClass;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getOfClass(int addr) {
        if (featOkTst && casFeat_ofClass == null)
      jcas.throwFeatMissing("ofClass", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ofClass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOfClass(int addr, String v) {
        if (featOkTst && casFeat_ofClass == null)
      jcas.throwFeatMissing("ofClass", "org.texttechnologylab.annotation.node.type.IndividualVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_ofClass, v);}
    
  
 
  /** @generated */
  final Feature casFeat_wikiDataID;
  /** @generated */
  final int     casFeatCode_wikiDataID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWikiDataID(int addr) {
        if (featOkTst && casFeat_wikiDataID == null)
      jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.IndividualVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_wikiDataID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWikiDataID(int addr, String v) {
        if (featOkTst && casFeat_wikiDataID == null)
      jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.IndividualVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_wikiDataID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public IndividualVis_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_geonamesID = jcas.getRequiredFeatureDE(casType, "geonamesID", "uima.cas.Integer", featOkTst);
    casFeatCode_geonamesID  = (null == casFeat_geonamesID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geonamesID).getCode();

 
    casFeat_markerPoint = jcas.getRequiredFeatureDE(casType, "markerPoint", "uima.cas.FloatArray", featOkTst);
    casFeatCode_markerPoint  = (null == casFeat_markerPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_markerPoint).getCode();

 
    casFeat_areaSize = jcas.getRequiredFeatureDE(casType, "areaSize", "uima.cas.String", featOkTst);
    casFeatCode_areaSize  = (null == casFeat_areaSize) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_areaSize).getCode();

 
    casFeat_geoJson = jcas.getRequiredFeatureDE(casType, "geoJson", "uima.cas.String", featOkTst);
    casFeatCode_geoJson  = (null == casFeat_geoJson) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geoJson).getCode();

 
    casFeat_displayName = jcas.getRequiredFeatureDE(casType, "displayName", "uima.cas.String", featOkTst);
    casFeatCode_displayName  = (null == casFeat_displayName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_displayName).getCode();

 
    casFeat_image = jcas.getRequiredFeatureDE(casType, "image", "uima.cas.String", featOkTst);
    casFeatCode_image  = (null == casFeat_image) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_image).getCode();

 
    casFeat_URI = jcas.getRequiredFeatureDE(casType, "URI", "uima.cas.String", featOkTst);
    casFeatCode_URI  = (null == casFeat_URI) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_URI).getCode();

 
    casFeat_ofClass = jcas.getRequiredFeatureDE(casType, "ofClass", "uima.cas.String", featOkTst);
    casFeatCode_ofClass  = (null == casFeat_ofClass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ofClass).getCode();

 
    casFeat_wikiDataID = jcas.getRequiredFeatureDE(casType, "wikiDataID", "uima.cas.String", featOkTst);
    casFeatCode_wikiDataID  = (null == casFeat_wikiDataID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wikiDataID).getCode();

  }
}



    