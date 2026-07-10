
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.uima.type.cohmetrix;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Coh-Metrix Index
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class Index_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Index.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.uima.type.cohmetrix.Index");
 
  /** @generated */
  final Feature casFeat_index;
  /** @generated */
  final int     casFeatCode_index;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getIndex(int addr) {
        if (featOkTst && casFeat_index == null)
      jcas.throwFeatMissing("index", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return ll_cas.ll_getIntValue(addr, casFeatCode_index);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIndex(int addr, int v) {
        if (featOkTst && casFeat_index == null)
      jcas.throwFeatMissing("index", "org.texttechnologylab.uima.type.cohmetrix.Index");
    ll_cas.ll_setIntValue(addr, casFeatCode_index, v);}
    
  
 
  /** @generated */
  final Feature casFeat_typeName;
  /** @generated */
  final int     casFeatCode_typeName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTypeName(int addr) {
        if (featOkTst && casFeat_typeName == null)
      jcas.throwFeatMissing("typeName", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return ll_cas.ll_getStringValue(addr, casFeatCode_typeName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTypeName(int addr, String v) {
        if (featOkTst && casFeat_typeName == null)
      jcas.throwFeatMissing("typeName", "org.texttechnologylab.uima.type.cohmetrix.Index");
    ll_cas.ll_setStringValue(addr, casFeatCode_typeName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_labelV3;
  /** @generated */
  final int     casFeatCode_labelV3;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabelV3(int addr) {
        if (featOkTst && casFeat_labelV3 == null)
      jcas.throwFeatMissing("labelV3", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return ll_cas.ll_getStringValue(addr, casFeatCode_labelV3);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabelV3(int addr, String v) {
        if (featOkTst && casFeat_labelV3 == null)
      jcas.throwFeatMissing("labelV3", "org.texttechnologylab.uima.type.cohmetrix.Index");
    ll_cas.ll_setStringValue(addr, casFeatCode_labelV3, v);}
    
  
 
  /** @generated */
  final Feature casFeat_labelV2;
  /** @generated */
  final int     casFeatCode_labelV2;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabelV2(int addr) {
        if (featOkTst && casFeat_labelV2 == null)
      jcas.throwFeatMissing("labelV2", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return ll_cas.ll_getStringValue(addr, casFeatCode_labelV2);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabelV2(int addr, String v) {
        if (featOkTst && casFeat_labelV2 == null)
      jcas.throwFeatMissing("labelV2", "org.texttechnologylab.uima.type.cohmetrix.Index");
    ll_cas.ll_setStringValue(addr, casFeatCode_labelV2, v);}
    
  
 
  /** @generated */
  final Feature casFeat_description;
  /** @generated */
  final int     casFeatCode_description;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDescription(int addr) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return ll_cas.ll_getStringValue(addr, casFeatCode_description);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDescription(int addr, String v) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "org.texttechnologylab.uima.type.cohmetrix.Index");
    ll_cas.ll_setStringValue(addr, casFeatCode_description, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, double v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.uima.type.cohmetrix.Index");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_error;
  /** @generated */
  final int     casFeatCode_error;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getError(int addr) {
        if (featOkTst && casFeat_error == null)
      jcas.throwFeatMissing("error", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return ll_cas.ll_getStringValue(addr, casFeatCode_error);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setError(int addr, String v) {
        if (featOkTst && casFeat_error == null)
      jcas.throwFeatMissing("error", "org.texttechnologylab.uima.type.cohmetrix.Index");
    ll_cas.ll_setStringValue(addr, casFeatCode_error, v);}
    
  
 
  /** @generated */
  final Feature casFeat_labelTTLab;
  /** @generated */
  final int     casFeatCode_labelTTLab;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLabelTTLab(int addr) {
        if (featOkTst && casFeat_labelTTLab == null)
      jcas.throwFeatMissing("labelTTLab", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return ll_cas.ll_getStringValue(addr, casFeatCode_labelTTLab);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLabelTTLab(int addr, String v) {
        if (featOkTst && casFeat_labelTTLab == null)
      jcas.throwFeatMissing("labelTTLab", "org.texttechnologylab.uima.type.cohmetrix.Index");
    ll_cas.ll_setStringValue(addr, casFeatCode_labelTTLab, v);}
    
  
 
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
      jcas.throwFeatMissing("version", "org.texttechnologylab.uima.type.cohmetrix.Index");
    return ll_cas.ll_getStringValue(addr, casFeatCode_version);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVersion(int addr, String v) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "org.texttechnologylab.uima.type.cohmetrix.Index");
    ll_cas.ll_setStringValue(addr, casFeatCode_version, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Index_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_index = jcas.getRequiredFeatureDE(casType, "index", "uima.cas.Integer", featOkTst);
    casFeatCode_index  = (null == casFeat_index) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_index).getCode();

 
    casFeat_typeName = jcas.getRequiredFeatureDE(casType, "typeName", "uima.cas.String", featOkTst);
    casFeatCode_typeName  = (null == casFeat_typeName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_typeName).getCode();

 
    casFeat_labelV3 = jcas.getRequiredFeatureDE(casType, "labelV3", "uima.cas.String", featOkTst);
    casFeatCode_labelV3  = (null == casFeat_labelV3) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labelV3).getCode();

 
    casFeat_labelV2 = jcas.getRequiredFeatureDE(casType, "labelV2", "uima.cas.String", featOkTst);
    casFeatCode_labelV2  = (null == casFeat_labelV2) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labelV2).getCode();

 
    casFeat_description = jcas.getRequiredFeatureDE(casType, "description", "uima.cas.String", featOkTst);
    casFeatCode_description  = (null == casFeat_description) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_description).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.Double", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_error = jcas.getRequiredFeatureDE(casType, "error", "uima.cas.String", featOkTst);
    casFeatCode_error  = (null == casFeat_error) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_error).getCode();

 
    casFeat_labelTTLab = jcas.getRequiredFeatureDE(casType, "labelTTLab", "uima.cas.String", featOkTst);
    casFeatCode_labelTTLab  = (null == casFeat_labelTTLab) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_labelTTLab).getCode();

 
    casFeat_version = jcas.getRequiredFeatureDE(casType, "version", "uima.cas.String", featOkTst);
    casFeatCode_version  = (null == casFeat_version) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_version).getCode();

  }
}



    