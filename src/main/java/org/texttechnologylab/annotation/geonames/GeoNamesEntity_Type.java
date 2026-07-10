
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation.geonames;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** GeoNames annotation base type.
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class GeoNamesEntity_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeoNamesEntity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.geonames.GeoNamesEntity");
 
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getIntValue(addr, casFeatCode_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, int v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setIntValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_featureClass;
  /** @generated */
  final int     casFeatCode_featureClass;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFeatureClass(int addr) {
        if (featOkTst && casFeat_featureClass == null)
      jcas.throwFeatMissing("featureClass", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_featureClass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeatureClass(int addr, String v) {
        if (featOkTst && casFeat_featureClass == null)
      jcas.throwFeatMissing("featureClass", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_featureClass, v);}
    
  
 
  /** @generated */
  final Feature casFeat_featureCode;
  /** @generated */
  final int     casFeatCode_featureCode;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFeatureCode(int addr) {
        if (featOkTst && casFeat_featureCode == null)
      jcas.throwFeatMissing("featureCode", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_featureCode);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeatureCode(int addr, String v) {
        if (featOkTst && casFeat_featureCode == null)
      jcas.throwFeatMissing("featureCode", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_featureCode, v);}
    
  
 
  /** @generated */
  final Feature casFeat_countryCode;
  /** @generated */
  final int     casFeatCode_countryCode;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCountryCode(int addr) {
        if (featOkTst && casFeat_countryCode == null)
      jcas.throwFeatMissing("countryCode", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_countryCode);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCountryCode(int addr, String v) {
        if (featOkTst && casFeat_countryCode == null)
      jcas.throwFeatMissing("countryCode", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_countryCode, v);}
    
  
 
  /** @generated */
  final Feature casFeat_adm1;
  /** @generated */
  final int     casFeatCode_adm1;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAdm1(int addr) {
        if (featOkTst && casFeat_adm1 == null)
      jcas.throwFeatMissing("adm1", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_adm1);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAdm1(int addr, String v) {
        if (featOkTst && casFeat_adm1 == null)
      jcas.throwFeatMissing("adm1", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_adm1, v);}
    
  
 
  /** @generated */
  final Feature casFeat_adm2;
  /** @generated */
  final int     casFeatCode_adm2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAdm2(int addr) {
        if (featOkTst && casFeat_adm2 == null)
      jcas.throwFeatMissing("adm2", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_adm2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAdm2(int addr, String v) {
        if (featOkTst && casFeat_adm2 == null)
      jcas.throwFeatMissing("adm2", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_adm2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_adm3;
  /** @generated */
  final int     casFeatCode_adm3;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAdm3(int addr) {
        if (featOkTst && casFeat_adm3 == null)
      jcas.throwFeatMissing("adm3", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_adm3);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAdm3(int addr, String v) {
        if (featOkTst && casFeat_adm3 == null)
      jcas.throwFeatMissing("adm3", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_adm3, v);}
    
  
 
  /** @generated */
  final Feature casFeat_adm4;
  /** @generated */
  final int     casFeatCode_adm4;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getAdm4(int addr) {
        if (featOkTst && casFeat_adm4 == null)
      jcas.throwFeatMissing("adm4", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_adm4);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAdm4(int addr, String v) {
        if (featOkTst && casFeat_adm4 == null)
      jcas.throwFeatMissing("adm4", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_adm4, v);}
    
  
 
  /** @generated */
  final Feature casFeat_latitude;
  /** @generated */
  final int     casFeatCode_latitude;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getLatitude(int addr) {
        if (featOkTst && casFeat_latitude == null)
      jcas.throwFeatMissing("latitude", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_latitude);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLatitude(int addr, float v) {
        if (featOkTst && casFeat_latitude == null)
      jcas.throwFeatMissing("latitude", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setFloatValue(addr, casFeatCode_latitude, v);}
    
  
 
  /** @generated */
  final Feature casFeat_longitude;
  /** @generated */
  final int     casFeatCode_longitude;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getLongitude(int addr) {
        if (featOkTst && casFeat_longitude == null)
      jcas.throwFeatMissing("longitude", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_longitude);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLongitude(int addr, float v) {
        if (featOkTst && casFeat_longitude == null)
      jcas.throwFeatMissing("longitude", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setFloatValue(addr, casFeatCode_longitude, v);}
    
  
 
  /** @generated */
  final Feature casFeat_elevation;
  /** @generated */
  final int     casFeatCode_elevation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public short getElevation(int addr) {
        if (featOkTst && casFeat_elevation == null)
      jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getShortValue(addr, casFeatCode_elevation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElevation(int addr, short v) {
        if (featOkTst && casFeat_elevation == null)
      jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setShortValue(addr, casFeatCode_elevation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_referenceAnnotation;
  /** @generated */
  final int     casFeatCode_referenceAnnotation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReferenceAnnotation(int addr) {
        if (featOkTst && casFeat_referenceAnnotation == null)
      jcas.throwFeatMissing("referenceAnnotation", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_referenceAnnotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReferenceAnnotation(int addr, int v) {
        if (featOkTst && casFeat_referenceAnnotation == null)
      jcas.throwFeatMissing("referenceAnnotation", "org.texttechnologylab.annotation.geonames.GeoNamesEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_referenceAnnotation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GeoNamesEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.Integer", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_featureClass = jcas.getRequiredFeatureDE(casType, "featureClass", "GeoNamesFeatureClass", featOkTst);
    casFeatCode_featureClass  = (null == casFeat_featureClass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_featureClass).getCode();

 
    casFeat_featureCode = jcas.getRequiredFeatureDE(casType, "featureCode", "GeoNamesFeatureCode", featOkTst);
    casFeatCode_featureCode  = (null == casFeat_featureCode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_featureCode).getCode();

 
    casFeat_countryCode = jcas.getRequiredFeatureDE(casType, "countryCode", "uima.cas.String", featOkTst);
    casFeatCode_countryCode  = (null == casFeat_countryCode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_countryCode).getCode();

 
    casFeat_adm1 = jcas.getRequiredFeatureDE(casType, "adm1", "uima.cas.String", featOkTst);
    casFeatCode_adm1  = (null == casFeat_adm1) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_adm1).getCode();

 
    casFeat_adm2 = jcas.getRequiredFeatureDE(casType, "adm2", "uima.cas.String", featOkTst);
    casFeatCode_adm2  = (null == casFeat_adm2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_adm2).getCode();

 
    casFeat_adm3 = jcas.getRequiredFeatureDE(casType, "adm3", "uima.cas.String", featOkTst);
    casFeatCode_adm3  = (null == casFeat_adm3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_adm3).getCode();

 
    casFeat_adm4 = jcas.getRequiredFeatureDE(casType, "adm4", "uima.cas.String", featOkTst);
    casFeatCode_adm4  = (null == casFeat_adm4) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_adm4).getCode();

 
    casFeat_latitude = jcas.getRequiredFeatureDE(casType, "latitude", "uima.cas.Float", featOkTst);
    casFeatCode_latitude  = (null == casFeat_latitude) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_latitude).getCode();

 
    casFeat_longitude = jcas.getRequiredFeatureDE(casType, "longitude", "uima.cas.Float", featOkTst);
    casFeatCode_longitude  = (null == casFeat_longitude) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_longitude).getCode();

 
    casFeat_elevation = jcas.getRequiredFeatureDE(casType, "elevation", "uima.cas.Short", featOkTst);
    casFeatCode_elevation  = (null == casFeat_elevation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elevation).getCode();

 
    casFeat_referenceAnnotation = jcas.getRequiredFeatureDE(casType, "referenceAnnotation", "uima.tcas.Annotation", featOkTst);
    casFeatCode_referenceAnnotation  = (null == casFeat_referenceAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_referenceAnnotation).getCode();

  }
}



    