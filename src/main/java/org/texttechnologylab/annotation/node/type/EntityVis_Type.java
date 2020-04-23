
/* First created by JCasGen Thu Apr 23 09:54:52 CEST 2020 */
package org.texttechnologylab.annotation.node.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.type.Node_Type;

/** 
 * Updated by JCasGen Thu Apr 23 09:54:52 CEST 2020
 * @generated */
public class EntityVis_Type extends Node_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EntityVis.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.node.type.EntityVis");
 
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
      jcas.throwFeatMissing("geonamesID", "org.texttechnologylab.annotation.node.type.EntityVis");
    return ll_cas.ll_getIntValue(addr, casFeatCode_geonamesID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeonamesID(int addr, int v) {
        if (featOkTst && casFeat_geonamesID == null)
      jcas.throwFeatMissing("geonamesID", "org.texttechnologylab.annotation.node.type.EntityVis");
    ll_cas.ll_setIntValue(addr, casFeatCode_geonamesID, v);}
    
  
 
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
      jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.node.type.EntityVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_geoJson);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setGeoJson(int addr, String v) {
        if (featOkTst && casFeat_geoJson == null)
      jcas.throwFeatMissing("geoJson", "org.texttechnologylab.annotation.node.type.EntityVis");
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
      jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.EntityVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_displayName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDisplayName(int addr, String v) {
        if (featOkTst && casFeat_displayName == null)
      jcas.throwFeatMissing("displayName", "org.texttechnologylab.annotation.node.type.EntityVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_displayName, v);}
    
  
 
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
      jcas.throwFeatMissing("ofClass", "org.texttechnologylab.annotation.node.type.EntityVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ofClass);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOfClass(int addr, String v) {
        if (featOkTst && casFeat_ofClass == null)
      jcas.throwFeatMissing("ofClass", "org.texttechnologylab.annotation.node.type.EntityVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_ofClass, v);}
    
  
 
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
      jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.EntityVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_image);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setImage(int addr, String v) {
        if (featOkTst && casFeat_image == null)
      jcas.throwFeatMissing("image", "org.texttechnologylab.annotation.node.type.EntityVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_image, v);}
    
  
 
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
      jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.EntityVis");
    return ll_cas.ll_getStringValue(addr, casFeatCode_wikiDataID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWikiDataID(int addr, String v) {
        if (featOkTst && casFeat_wikiDataID == null)
      jcas.throwFeatMissing("wikiDataID", "org.texttechnologylab.annotation.node.type.EntityVis");
    ll_cas.ll_setStringValue(addr, casFeatCode_wikiDataID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public EntityVis_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_geonamesID = jcas.getRequiredFeatureDE(casType, "geonamesID", "uima.cas.Integer", featOkTst);
    casFeatCode_geonamesID  = (null == casFeat_geonamesID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geonamesID).getCode();

 
    casFeat_geoJson = jcas.getRequiredFeatureDE(casType, "geoJson", "uima.cas.String", featOkTst);
    casFeatCode_geoJson  = (null == casFeat_geoJson) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_geoJson).getCode();

 
    casFeat_displayName = jcas.getRequiredFeatureDE(casType, "displayName", "uima.cas.String", featOkTst);
    casFeatCode_displayName  = (null == casFeat_displayName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_displayName).getCode();

 
    casFeat_ofClass = jcas.getRequiredFeatureDE(casType, "ofClass", "uima.cas.String", featOkTst);
    casFeatCode_ofClass  = (null == casFeat_ofClass) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ofClass).getCode();

 
    casFeat_image = jcas.getRequiredFeatureDE(casType, "image", "uima.cas.String", featOkTst);
    casFeatCode_image  = (null == casFeat_image) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_image).getCode();

 
    casFeat_wikiDataID = jcas.getRequiredFeatureDE(casType, "wikiDataID", "uima.cas.String", featOkTst);
    casFeatCode_wikiDataID  = (null == casFeat_wikiDataID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wikiDataID).getCode();

  }
}



    