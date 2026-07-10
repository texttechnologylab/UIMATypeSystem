
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation.model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class SpacyMetaData_Type extends MetaData_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SpacyMetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.model.SpacyMetaData");
 
  /** @generated */
  final Feature casFeat_SpacyVersion;
  /** @generated */
  final int     casFeatCode_SpacyVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSpacyVersion(int addr) {
        if (featOkTst && casFeat_SpacyVersion == null)
      jcas.throwFeatMissing("SpacyVersion", "org.texttechnologylab.annotation.model.SpacyMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SpacyVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpacyVersion(int addr, String v) {
        if (featOkTst && casFeat_SpacyVersion == null)
      jcas.throwFeatMissing("SpacyVersion", "org.texttechnologylab.annotation.model.SpacyMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_SpacyVersion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ModelSpacyGitVersion;
  /** @generated */
  final int     casFeatCode_ModelSpacyGitVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelSpacyGitVersion(int addr) {
        if (featOkTst && casFeat_ModelSpacyGitVersion == null)
      jcas.throwFeatMissing("ModelSpacyGitVersion", "org.texttechnologylab.annotation.model.SpacyMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ModelSpacyGitVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelSpacyGitVersion(int addr, String v) {
        if (featOkTst && casFeat_ModelSpacyGitVersion == null)
      jcas.throwFeatMissing("ModelSpacyGitVersion", "org.texttechnologylab.annotation.model.SpacyMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_ModelSpacyGitVersion, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SpacyMetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SpacyVersion = jcas.getRequiredFeatureDE(casType, "SpacyVersion", "uima.cas.String", featOkTst);
    casFeatCode_SpacyVersion  = (null == casFeat_SpacyVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SpacyVersion).getCode();

 
    casFeat_ModelSpacyGitVersion = jcas.getRequiredFeatureDE(casType, "ModelSpacyGitVersion", "uima.cas.String", featOkTst);
    casFeatCode_ModelSpacyGitVersion  = (null == casFeat_ModelSpacyGitVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ModelSpacyGitVersion).getCode();

  }
}



    