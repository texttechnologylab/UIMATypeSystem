
/* First created by JCasGen Thu Apr 14 13:32:49 CEST 2022 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Apr 14 13:32:49 CEST 2022
 * @generated */
public class SpacyAnnotatorMetaData_Type extends AnnotatorMetaData_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SpacyAnnotatorMetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
 
  /** @generated */
  final Feature casFeat_spacyVersion;
  /** @generated */
  final int     casFeatCode_spacyVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSpacyVersion(int addr) {
        if (featOkTst && casFeat_spacyVersion == null)
      jcas.throwFeatMissing("spacyVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_spacyVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpacyVersion(int addr, String v) {
        if (featOkTst && casFeat_spacyVersion == null)
      jcas.throwFeatMissing("spacyVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_spacyVersion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_modelLang;
  /** @generated */
  final int     casFeatCode_modelLang;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelLang(int addr) {
        if (featOkTst && casFeat_modelLang == null)
      jcas.throwFeatMissing("modelLang", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_modelLang);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelLang(int addr, String v) {
        if (featOkTst && casFeat_modelLang == null)
      jcas.throwFeatMissing("modelLang", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_modelLang, v);}
    
  
 
  /** @generated */
  final Feature casFeat_modelSpacyVersion;
  /** @generated */
  final int     casFeatCode_modelSpacyVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelSpacyVersion(int addr) {
        if (featOkTst && casFeat_modelSpacyVersion == null)
      jcas.throwFeatMissing("modelSpacyVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_modelSpacyVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelSpacyVersion(int addr, String v) {
        if (featOkTst && casFeat_modelSpacyVersion == null)
      jcas.throwFeatMissing("modelSpacyVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_modelSpacyVersion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_modelSpacyGitVersion;
  /** @generated */
  final int     casFeatCode_modelSpacyGitVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelSpacyGitVersion(int addr) {
        if (featOkTst && casFeat_modelSpacyGitVersion == null)
      jcas.throwFeatMissing("modelSpacyGitVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_modelSpacyGitVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelSpacyGitVersion(int addr, String v) {
        if (featOkTst && casFeat_modelSpacyGitVersion == null)
      jcas.throwFeatMissing("modelSpacyGitVersion", "org.texttechnologylab.annotation.SpacyAnnotatorMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_modelSpacyGitVersion, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SpacyAnnotatorMetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_spacyVersion = jcas.getRequiredFeatureDE(casType, "spacyVersion", "uima.cas.String", featOkTst);
    casFeatCode_spacyVersion  = (null == casFeat_spacyVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_spacyVersion).getCode();

 
    casFeat_modelLang = jcas.getRequiredFeatureDE(casType, "modelLang", "uima.cas.String", featOkTst);
    casFeatCode_modelLang  = (null == casFeat_modelLang) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_modelLang).getCode();

 
    casFeat_modelSpacyVersion = jcas.getRequiredFeatureDE(casType, "modelSpacyVersion", "uima.cas.String", featOkTst);
    casFeatCode_modelSpacyVersion  = (null == casFeat_modelSpacyVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_modelSpacyVersion).getCode();

 
    casFeat_modelSpacyGitVersion = jcas.getRequiredFeatureDE(casType, "modelSpacyGitVersion", "uima.cas.String", featOkTst);
    casFeatCode_modelSpacyGitVersion  = (null == casFeat_modelSpacyGitVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_modelSpacyGitVersion).getCode();

  }
}



    