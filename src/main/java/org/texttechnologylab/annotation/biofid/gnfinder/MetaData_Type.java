
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation.biofid.gnfinder;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** 
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class MetaData_Type extends TOP_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
 
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
      jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_date);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDate(int addr, String v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
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
      jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_version);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVersion(int addr, String v) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_version, v);}
    
  
 
  /** @generated */
  final Feature casFeat_language;
  /** @generated */
  final int     casFeatCode_language;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */
  final Feature casFeat_other;
  /** @generated */
  final int     casFeatCode_other;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getOther(int addr) {
        if (featOkTst && casFeat_other == null)
      jcas.throwFeatMissing("other", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return ll_cas.ll_getRefValue(addr, casFeatCode_other);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setOther(int addr, int v) {
        if (featOkTst && casFeat_other == null)
      jcas.throwFeatMissing("other", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    ll_cas.ll_setRefValue(addr, casFeatCode_other, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getOther(int addr, int i) {
        if (featOkTst && casFeat_other == null)
      jcas.throwFeatMissing("other", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_other), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_other), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_other), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setOther(int addr, int i, int v) {
        if (featOkTst && casFeat_other == null)
      jcas.throwFeatMissing("other", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_other), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_other), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_other), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_references;
  /** @generated */
  final int     casFeatCode_references;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReferences(int addr) {
        if (featOkTst && casFeat_references == null)
      jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    return ll_cas.ll_getRefValue(addr, casFeatCode_references);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReferences(int addr, int v) {
        if (featOkTst && casFeat_references == null)
      jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    ll_cas.ll_setRefValue(addr, casFeatCode_references, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getReferences(int addr, int i) {
        if (featOkTst && casFeat_references == null)
      jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_references), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_references), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_references), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setReferences(int addr, int i, int v) {
        if (featOkTst && casFeat_references == null)
      jcas.throwFeatMissing("references", "org.texttechnologylab.annotation.biofid.gnfinder.MetaData");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_references), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_references), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_references), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "uima.cas.String", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

 
    casFeat_version = jcas.getRequiredFeatureDE(casType, "version", "uima.cas.String", featOkTst);
    casFeatCode_version  = (null == casFeat_version) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_version).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_other = jcas.getRequiredFeatureDE(casType, "other", "uima.cas.FSArray", featOkTst);
    casFeatCode_other  = (null == casFeat_other) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_other).getCode();

 
    casFeat_references = jcas.getRequiredFeatureDE(casType, "references", "uima.cas.FSArray", featOkTst);
    casFeatCode_references  = (null == casFeat_references) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_references).getCode();

  }
}



    