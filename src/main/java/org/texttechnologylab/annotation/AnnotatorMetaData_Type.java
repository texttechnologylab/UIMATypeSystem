
/* First created by JCasGen Wed Aug 18 10:21:17 CEST 2021 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Fri Jan 20 19:10:46 CET 2023
 * @generated */
public class AnnotatorMetaData_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotatorMetaData.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.AnnotatorMetaData");
 
  /** @generated */
  final Feature casFeat_reference;
  /** @generated */
  final int     casFeatCode_reference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getReference(int addr) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return ll_cas.ll_getRefValue(addr, casFeatCode_reference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReference(int addr, int v) {
        if (featOkTst && casFeat_reference == null)
      jcas.throwFeatMissing("reference", "org.texttechnologylab.annotation.AnnotatorMetaData");
    ll_cas.ll_setRefValue(addr, casFeatCode_reference, v);}
    
  
 
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
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.AnnotatorMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
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
      jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_version);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVersion(int addr, String v) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.texttechnologylab.annotation.AnnotatorMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_version, v);}
    
  
 
  /** @generated */
  final Feature casFeat_modelName;
  /** @generated */
  final int     casFeatCode_modelName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelName(int addr) {
        if (featOkTst && casFeat_modelName == null)
      jcas.throwFeatMissing("modelName", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_modelName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelName(int addr, String v) {
        if (featOkTst && casFeat_modelName == null)
      jcas.throwFeatMissing("modelName", "org.texttechnologylab.annotation.AnnotatorMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_modelName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_modelVersion;
  /** @generated */
  final int     casFeatCode_modelVersion;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getModelVersion(int addr) {
        if (featOkTst && casFeat_modelVersion == null)
      jcas.throwFeatMissing("modelVersion", "org.texttechnologylab.annotation.AnnotatorMetaData");
    return ll_cas.ll_getStringValue(addr, casFeatCode_modelVersion);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModelVersion(int addr, String v) {
        if (featOkTst && casFeat_modelVersion == null)
      jcas.throwFeatMissing("modelVersion", "org.texttechnologylab.annotation.AnnotatorMetaData");
    ll_cas.ll_setStringValue(addr, casFeatCode_modelVersion, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnnotatorMetaData_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_reference = jcas.getRequiredFeatureDE(casType, "reference", "uima.cas.TOP", featOkTst);
    casFeatCode_reference  = (null == casFeat_reference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reference).getCode();

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_version = jcas.getRequiredFeatureDE(casType, "version", "uima.cas.String", featOkTst);
    casFeatCode_version  = (null == casFeat_version) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_version).getCode();

 
    casFeat_modelName = jcas.getRequiredFeatureDE(casType, "modelName", "uima.cas.String", featOkTst);
    casFeatCode_modelName  = (null == casFeat_modelName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_modelName).getCode();

 
    casFeat_modelVersion = jcas.getRequiredFeatureDE(casType, "modelVersion", "uima.cas.String", featOkTst);
    casFeatCode_modelVersion  = (null == casFeat_modelVersion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_modelVersion).getCode();

  }
}



    