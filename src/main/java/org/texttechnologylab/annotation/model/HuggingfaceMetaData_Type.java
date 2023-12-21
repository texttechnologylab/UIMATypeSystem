
/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Dec 21 13:46:46 CET 2023
 * @generated */
public class HuggingfaceMetaData_Type extends MetaData_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = HuggingfaceMetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.model.HuggingfaceMetaData");
 
  /** @generated */
  final Feature casFeat_HuggingfaceVersion;
  /** @generated */
  final int     casFeatCode_HuggingfaceVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getHuggingfaceVersion(int addr) {
        if (featOkTst && casFeat_HuggingfaceVersion == null)
      jcas.throwFeatMissing("HuggingfaceVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_HuggingfaceVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHuggingfaceVersion(int addr, String v) {
        if (featOkTst && casFeat_HuggingfaceVersion == null)
      jcas.throwFeatMissing("HuggingfaceVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_HuggingfaceVersion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_DependeciesVersion;
  /** @generated */
  final int     casFeatCode_DependeciesVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getDependeciesVersion(int addr) {
        if (featOkTst && casFeat_DependeciesVersion == null)
      jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    return ll_cas.ll_getRefValue(addr, casFeatCode_DependeciesVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDependeciesVersion(int addr, int v) {
        if (featOkTst && casFeat_DependeciesVersion == null)
      jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    ll_cas.ll_setRefValue(addr, casFeatCode_DependeciesVersion, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getDependeciesVersion(int addr, int i) {
        if (featOkTst && casFeat_DependeciesVersion == null)
      jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_DependeciesVersion), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_DependeciesVersion), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_DependeciesVersion), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setDependeciesVersion(int addr, int i, String v) {
        if (featOkTst && casFeat_DependeciesVersion == null)
      jcas.throwFeatMissing("DependeciesVersion", "org.texttechnologylab.annotation.model.HuggingfaceMetaData");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_DependeciesVersion), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_DependeciesVersion), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_DependeciesVersion), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public HuggingfaceMetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_HuggingfaceVersion = jcas.getRequiredFeatureDE(casType, "HuggingfaceVersion", "uima.cas.String", featOkTst);
    casFeatCode_HuggingfaceVersion  = (null == casFeat_HuggingfaceVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_HuggingfaceVersion).getCode();

 
    casFeat_DependeciesVersion = jcas.getRequiredFeatureDE(casType, "DependeciesVersion", "uima.cas.StringArray", featOkTst);
    casFeatCode_DependeciesVersion  = (null == casFeat_DependeciesVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_DependeciesVersion).getCode();

  }
}



    