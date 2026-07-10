
/* First created by JCasGen Fri Jul 10 13:24:13 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Jul 10 13:24:13 CEST 2026
 * @generated */
public class GNMetaData_Type extends MetaData_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GNMetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.GNMetaData");
 
  /** @generated */
  final Feature casFeat_date;
  /** @generated */
  final int     casFeatCode_date;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.GNMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_date);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDate(int addr, String v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.GNMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_date, v);}
    
  
 
  /** @generated */
  final Feature casFeat_version;
  /** @generated */
  final int     casFeatCode_version;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getVersion(int addr) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.GNMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_version);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVersion(int addr, String v) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.GNMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_version, v);}
    
  
 
  /** @generated */
  final Feature casFeat_withAllMatches;
  /** @generated */
  final int     casFeatCode_withAllMatches;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getWithAllMatches(int addr) {
        if (featOkTst && casFeat_withAllMatches == null)
      jcas.throwFeatMissing("withAllMatches", "org.texttechnologylab.annotation.GNMetaData");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_withAllMatches);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWithAllMatches(int addr, boolean v) {
        if (featOkTst && casFeat_withAllMatches == null)
      jcas.throwFeatMissing("withAllMatches", "org.texttechnologylab.annotation.GNMetaData");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_withAllMatches, v);}
    
  
 
  /** @generated */
  final Feature casFeat_withAmbiguousNames;
  /** @generated */
  final int     casFeatCode_withAmbiguousNames;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getWithAmbiguousNames(int addr) {
        if (featOkTst && casFeat_withAmbiguousNames == null)
      jcas.throwFeatMissing("withAmbiguousNames", "org.texttechnologylab.annotation.GNMetaData");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_withAmbiguousNames);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWithAmbiguousNames(int addr, boolean v) {
        if (featOkTst && casFeat_withAmbiguousNames == null)
      jcas.throwFeatMissing("withAmbiguousNames", "org.texttechnologylab.annotation.GNMetaData");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_withAmbiguousNames, v);}
    
  
 
  /** @generated */
  final Feature casFeat_withBayes;
  /** @generated */
  final int     casFeatCode_withBayes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getWithBayes(int addr) {
        if (featOkTst && casFeat_withBayes == null)
      jcas.throwFeatMissing("withBayes", "org.texttechnologylab.annotation.GNMetaData");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_withBayes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWithBayes(int addr, boolean v) {
        if (featOkTst && casFeat_withBayes == null)
      jcas.throwFeatMissing("withBayes", "org.texttechnologylab.annotation.GNMetaData");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_withBayes, v);}
    
  
 
  /** @generated */
  final Feature casFeat_wihUniqueNames;
  /** @generated */
  final int     casFeatCode_wihUniqueNames;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getWihUniqueNames(int addr) {
        if (featOkTst && casFeat_wihUniqueNames == null)
      jcas.throwFeatMissing("wihUniqueNames", "org.texttechnologylab.annotation.GNMetaData");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_wihUniqueNames);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWihUniqueNames(int addr, boolean v) {
        if (featOkTst && casFeat_wihUniqueNames == null)
      jcas.throwFeatMissing("wihUniqueNames", "org.texttechnologylab.annotation.GNMetaData");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_wihUniqueNames, v);}
    
  
 
  /** @generated */
  final Feature casFeat_withOddsAdjustment;
  /** @generated */
  final int     casFeatCode_withOddsAdjustment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getWithOddsAdjustment(int addr) {
        if (featOkTst && casFeat_withOddsAdjustment == null)
      jcas.throwFeatMissing("withOddsAdjustment", "org.texttechnologylab.annotation.GNMetaData");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_withOddsAdjustment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWithOddsAdjustment(int addr, boolean v) {
        if (featOkTst && casFeat_withOddsAdjustment == null)
      jcas.throwFeatMissing("withOddsAdjustment", "org.texttechnologylab.annotation.GNMetaData");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_withOddsAdjustment, v);}
    
  
 
  /** @generated */
  final Feature casFeat_withSources;
  /** @generated */
  final int     casFeatCode_withSources;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getWithSources(int addr) {
        if (featOkTst && casFeat_withSources == null)
      jcas.throwFeatMissing("withSources", "org.texttechnologylab.annotation.GNMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_withSources);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setWithSources(int addr, String v) {
        if (featOkTst && casFeat_withSources == null)
      jcas.throwFeatMissing("withSources", "org.texttechnologylab.annotation.GNMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_withSources, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GNMetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "uima.cas.String", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

 
    casFeat_version = jcas.getRequiredFeatureDE(casType, "version", "uima.cas.String", featOkTst);
    casFeatCode_version  = (null == casFeat_version) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_version).getCode();

 
    casFeat_withAllMatches = jcas.getRequiredFeatureDE(casType, "withAllMatches", "uima.cas.Boolean", featOkTst);
    casFeatCode_withAllMatches  = (null == casFeat_withAllMatches) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_withAllMatches).getCode();

 
    casFeat_withAmbiguousNames = jcas.getRequiredFeatureDE(casType, "withAmbiguousNames", "uima.cas.Boolean", featOkTst);
    casFeatCode_withAmbiguousNames  = (null == casFeat_withAmbiguousNames) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_withAmbiguousNames).getCode();

 
    casFeat_withBayes = jcas.getRequiredFeatureDE(casType, "withBayes", "uima.cas.Boolean", featOkTst);
    casFeatCode_withBayes  = (null == casFeat_withBayes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_withBayes).getCode();

 
    casFeat_wihUniqueNames = jcas.getRequiredFeatureDE(casType, "wihUniqueNames", "uima.cas.Boolean", featOkTst);
    casFeatCode_wihUniqueNames  = (null == casFeat_wihUniqueNames) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wihUniqueNames).getCode();

 
    casFeat_withOddsAdjustment = jcas.getRequiredFeatureDE(casType, "withOddsAdjustment", "uima.cas.Boolean", featOkTst);
    casFeatCode_withOddsAdjustment  = (null == casFeat_withOddsAdjustment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_withOddsAdjustment).getCode();

 
    casFeat_withSources = jcas.getRequiredFeatureDE(casType, "withSources", "uima.cas.String", featOkTst);
    casFeatCode_withSources  = (null == casFeat_withSources) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_withSources).getCode();

  }
}



    