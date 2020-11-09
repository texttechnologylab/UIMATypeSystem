
/* First created by JCasGen Thu Nov 05 17:32:23 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Entity_Type;

/** 
 * Updated by JCasGen Thu Nov 05 17:32:40 CET 2020
 * @generated */
public class SpatialEntity_Type extends Entity_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SpatialEntity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
 
  /** @generated */
  final Feature casFeat_spatial_entitiy_type;
  /** @generated */
  final int     casFeatCode_spatial_entitiy_type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSpatial_entitiy_type(int addr) {
        if (featOkTst && casFeat_spatial_entitiy_type == null)
      jcas.throwFeatMissing("spatial_entitiy_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_spatial_entitiy_type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpatial_entitiy_type(int addr, String v) {
        if (featOkTst && casFeat_spatial_entitiy_type == null)
      jcas.throwFeatMissing("spatial_entitiy_type", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_spatial_entitiy_type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dimensionality;
  /** @generated */
  final int     casFeatCode_dimensionality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDimensionality(int addr) {
        if (featOkTst && casFeat_dimensionality == null)
      jcas.throwFeatMissing("dimensionality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_dimensionality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDimensionality(int addr, String v) {
        if (featOkTst && casFeat_dimensionality == null)
      jcas.throwFeatMissing("dimensionality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_dimensionality, v);}
    
  
 
  /** @generated */
  final Feature casFeat_form;
  /** @generated */
  final int     casFeatCode_form;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getForm(int addr) {
        if (featOkTst && casFeat_form == null)
      jcas.throwFeatMissing("form", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_form);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setForm(int addr, String v) {
        if (featOkTst && casFeat_form == null)
      jcas.throwFeatMissing("form", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_form, v);}
    
  
 
  /** @generated */
  final Feature casFeat_dcl;
  /** @generated */
  final int     casFeatCode_dcl;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getDcl(int addr) {
        if (featOkTst && casFeat_dcl == null)
      jcas.throwFeatMissing("dcl", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_dcl);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDcl(int addr, boolean v) {
        if (featOkTst && casFeat_dcl == null)
      jcas.throwFeatMissing("dcl", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_dcl, v);}
    
  
 
  /** @generated */
  final Feature casFeat_domain;
  /** @generated */
  final int     casFeatCode_domain;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDomain(int addr) {
        if (featOkTst && casFeat_domain == null)
      jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_domain);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDomain(int addr, String v) {
        if (featOkTst && casFeat_domain == null)
      jcas.throwFeatMissing("domain", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_domain, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lat;
  /** @generated */
  final int     casFeatCode_lat;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLat(int addr) {
        if (featOkTst && casFeat_lat == null)
      jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lat);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLat(int addr, String v) {
        if (featOkTst && casFeat_lat == null)
      jcas.throwFeatMissing("lat", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_lat, v);}
    
  
 
  /** @generated */
  final Feature casFeat_long;
  /** @generated */
  final int     casFeatCode_long;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLong(int addr) {
        if (featOkTst && casFeat_long == null)
      jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_long);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLong(int addr, String v) {
        if (featOkTst && casFeat_long == null)
      jcas.throwFeatMissing("long", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_long, v);}
    
  
 
  /** @generated */
  final Feature casFeat_elevation;
  /** @generated */
  final int     casFeatCode_elevation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getElevation(int addr) {
        if (featOkTst && casFeat_elevation == null)
      jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_elevation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setElevation(int addr, int v) {
        if (featOkTst && casFeat_elevation == null)
      jcas.throwFeatMissing("elevation", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_elevation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_countable;
  /** @generated */
  final int     casFeatCode_countable;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getCountable(int addr) {
        if (featOkTst && casFeat_countable == null)
      jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_countable);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCountable(int addr, boolean v) {
        if (featOkTst && casFeat_countable == null)
      jcas.throwFeatMissing("countable", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_countable, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gquant;
  /** @generated */
  final int     casFeatCode_gquant;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getGquant(int addr) {
        if (featOkTst && casFeat_gquant == null)
      jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gquant);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGquant(int addr, String v) {
        if (featOkTst && casFeat_gquant == null)
      jcas.throwFeatMissing("gquant", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setStringValue(addr, casFeatCode_gquant, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scopes;
  /** @generated */
  final int     casFeatCode_scopes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScopes(int addr) {
        if (featOkTst && casFeat_scopes == null)
      jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scopes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScopes(int addr, int v) {
        if (featOkTst && casFeat_scopes == null)
      jcas.throwFeatMissing("scopes", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_scopes, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scopes_array;
  /** @generated */
  final int     casFeatCode_scopes_array;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScopes_array(int addr) {
        if (featOkTst && casFeat_scopes_array == null)
      jcas.throwFeatMissing("scopes_array", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scopes_array);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScopes_array(int addr, int v) {
        if (featOkTst && casFeat_scopes_array == null)
      jcas.throwFeatMissing("scopes_array", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setRefValue(addr, casFeatCode_scopes_array, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getScopes_array(int addr, int i) {
        if (featOkTst && casFeat_scopes_array == null)
      jcas.throwFeatMissing("scopes_array", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scopes_array), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_scopes_array), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scopes_array), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setScopes_array(int addr, int i, int v) {
        if (featOkTst && casFeat_scopes_array == null)
      jcas.throwFeatMissing("scopes_array", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scopes_array), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_scopes_array), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_scopes_array), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_cardinality;
  /** @generated */
  final int     casFeatCode_cardinality;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getCardinality(int addr) {
        if (featOkTst && casFeat_cardinality == null)
      jcas.throwFeatMissing("cardinality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_cardinality);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCardinality(int addr, double v) {
        if (featOkTst && casFeat_cardinality == null)
      jcas.throwFeatMissing("cardinality", "org.texttechnologylab.annotation.semaf.isospace.SpatialEntity");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_cardinality, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SpatialEntity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_spatial_entitiy_type = jcas.getRequiredFeatureDE(casType, "spatial_entitiy_type", "uima.cas.String", featOkTst);
    casFeatCode_spatial_entitiy_type  = (null == casFeat_spatial_entitiy_type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_spatial_entitiy_type).getCode();

 
    casFeat_dimensionality = jcas.getRequiredFeatureDE(casType, "dimensionality", "uima.cas.String", featOkTst);
    casFeatCode_dimensionality  = (null == casFeat_dimensionality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dimensionality).getCode();

 
    casFeat_form = jcas.getRequiredFeatureDE(casType, "form", "uima.cas.String", featOkTst);
    casFeatCode_form  = (null == casFeat_form) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_form).getCode();

 
    casFeat_dcl = jcas.getRequiredFeatureDE(casType, "dcl", "uima.cas.Boolean", featOkTst);
    casFeatCode_dcl  = (null == casFeat_dcl) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dcl).getCode();

 
    casFeat_domain = jcas.getRequiredFeatureDE(casType, "domain", "uima.cas.String", featOkTst);
    casFeatCode_domain  = (null == casFeat_domain) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_domain).getCode();

 
    casFeat_lat = jcas.getRequiredFeatureDE(casType, "lat", "uima.cas.String", featOkTst);
    casFeatCode_lat  = (null == casFeat_lat) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lat).getCode();

 
    casFeat_long = jcas.getRequiredFeatureDE(casType, "long", "uima.cas.String", featOkTst);
    casFeatCode_long  = (null == casFeat_long) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_long).getCode();

 
    casFeat_elevation = jcas.getRequiredFeatureDE(casType, "elevation", "org.texttechnologylab.annotation.semaf.isospace.Measure", featOkTst);
    casFeatCode_elevation  = (null == casFeat_elevation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_elevation).getCode();

 
    casFeat_countable = jcas.getRequiredFeatureDE(casType, "countable", "uima.cas.Boolean", featOkTst);
    casFeatCode_countable  = (null == casFeat_countable) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_countable).getCode();

 
    casFeat_gquant = jcas.getRequiredFeatureDE(casType, "gquant", "uima.cas.String", featOkTst);
    casFeatCode_gquant  = (null == casFeat_gquant) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gquant).getCode();

 
    casFeat_scopes = jcas.getRequiredFeatureDE(casType, "scopes", "uima.cas.FSList", featOkTst);
    casFeatCode_scopes  = (null == casFeat_scopes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scopes).getCode();

 
    casFeat_scopes_array = jcas.getRequiredFeatureDE(casType, "scopes_array", "uima.cas.FSArray", featOkTst);
    casFeatCode_scopes_array  = (null == casFeat_scopes_array) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scopes_array).getCode();

 
    casFeat_cardinality = jcas.getRequiredFeatureDE(casType, "cardinality", "uima.cas.Double", featOkTst);
    casFeatCode_cardinality  = (null == casFeat_cardinality) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_cardinality).getCode();

  }
}



    