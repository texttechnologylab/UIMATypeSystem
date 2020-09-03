
/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Sep 03 10:03:40 CEST 2020
 * @generated */
public class Place_Type extends Location_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Place.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.Place");
 
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
      jcas.throwFeatMissing("country", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return ll_cas.ll_getStringValue(addr, casFeatCode_country);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCountry(int addr, String v) {
        if (featOkTst && casFeat_country == null)
      jcas.throwFeatMissing("country", "org.texttechnologylab.annotation.semaf.isospace.Place");
    ll_cas.ll_setStringValue(addr, casFeatCode_country, v);}
    
  
 
  /** @generated */
  final Feature casFeat_state;
  /** @generated */
  final int     casFeatCode_state;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getState(int addr) {
        if (featOkTst && casFeat_state == null)
      jcas.throwFeatMissing("state", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return ll_cas.ll_getStringValue(addr, casFeatCode_state);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setState(int addr, String v) {
        if (featOkTst && casFeat_state == null)
      jcas.throwFeatMissing("state", "org.texttechnologylab.annotation.semaf.isospace.Place");
    ll_cas.ll_setStringValue(addr, casFeatCode_state, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ctv;
  /** @generated */
  final int     casFeatCode_ctv;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCtv(int addr) {
        if (featOkTst && casFeat_ctv == null)
      jcas.throwFeatMissing("ctv", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ctv);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCtv(int addr, String v) {
        if (featOkTst && casFeat_ctv == null)
      jcas.throwFeatMissing("ctv", "org.texttechnologylab.annotation.semaf.isospace.Place");
    ll_cas.ll_setStringValue(addr, casFeatCode_ctv, v);}
    
  
 
  /** @generated */
  final Feature casFeat_continent;
  /** @generated */
  final int     casFeatCode_continent;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getContinent(int addr) {
        if (featOkTst && casFeat_continent == null)
      jcas.throwFeatMissing("continent", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return ll_cas.ll_getStringValue(addr, casFeatCode_continent);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setContinent(int addr, String v) {
        if (featOkTst && casFeat_continent == null)
      jcas.throwFeatMissing("continent", "org.texttechnologylab.annotation.semaf.isospace.Place");
    ll_cas.ll_setStringValue(addr, casFeatCode_continent, v);}
    
  
 
  /** @generated */
  final Feature casFeat_county;
  /** @generated */
  final int     casFeatCode_county;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCounty(int addr) {
        if (featOkTst && casFeat_county == null)
      jcas.throwFeatMissing("county", "org.texttechnologylab.annotation.semaf.isospace.Place");
    return ll_cas.ll_getStringValue(addr, casFeatCode_county);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCounty(int addr, String v) {
        if (featOkTst && casFeat_county == null)
      jcas.throwFeatMissing("county", "org.texttechnologylab.annotation.semaf.isospace.Place");
    ll_cas.ll_setStringValue(addr, casFeatCode_county, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Place_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_country = jcas.getRequiredFeatureDE(casType, "country", "uima.cas.String", featOkTst);
    casFeatCode_country  = (null == casFeat_country) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_country).getCode();

 
    casFeat_state = jcas.getRequiredFeatureDE(casType, "state", "uima.cas.String", featOkTst);
    casFeatCode_state  = (null == casFeat_state) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_state).getCode();

 
    casFeat_ctv = jcas.getRequiredFeatureDE(casType, "ctv", "uima.cas.String", featOkTst);
    casFeatCode_ctv  = (null == casFeat_ctv) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ctv).getCode();

 
    casFeat_continent = jcas.getRequiredFeatureDE(casType, "continent", "uima.cas.String", featOkTst);
    casFeatCode_continent  = (null == casFeat_continent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_continent).getCode();

 
    casFeat_county = jcas.getRequiredFeatureDE(casType, "county", "uima.cas.String", featOkTst);
    casFeatCode_county  = (null == casFeat_county) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_county).getCode();

  }
}



    