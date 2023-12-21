
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
public class MetaData_Type extends org.texttechnologylab.annotation.MetaData_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.model.MetaData");
 
  /** @generated */
  final Feature casFeat_ModelVersion;
  /** @generated */
  final int     casFeatCode_ModelVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelVersion(int addr) {
        if (featOkTst && casFeat_ModelVersion == null)
      jcas.throwFeatMissing("ModelVersion", "org.texttechnologylab.annotation.model.MetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ModelVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelVersion(int addr, String v) {
        if (featOkTst && casFeat_ModelVersion == null)
      jcas.throwFeatMissing("ModelVersion", "org.texttechnologylab.annotation.model.MetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_ModelVersion, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ModelName;
  /** @generated */
  final int     casFeatCode_ModelName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelName(int addr) {
        if (featOkTst && casFeat_ModelName == null)
      jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.model.MetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ModelName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelName(int addr, String v) {
        if (featOkTst && casFeat_ModelName == null)
      jcas.throwFeatMissing("ModelName", "org.texttechnologylab.annotation.model.MetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_ModelName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ModelVersion = jcas.getRequiredFeatureDE(casType, "ModelVersion", "uima.cas.String", featOkTst);
    casFeatCode_ModelVersion  = (null == casFeat_ModelVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ModelVersion).getCode();

 
    casFeat_ModelName = jcas.getRequiredFeatureDE(casType, "ModelName", "uima.cas.String", featOkTst);
    casFeatCode_ModelName  = (null == casFeat_ModelName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ModelName).getCode();

  }
}



    