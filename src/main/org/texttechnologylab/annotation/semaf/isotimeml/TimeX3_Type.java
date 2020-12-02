
/* First created by JCasGen Wed Dec 02 17:54:51 CET 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Entity_Type;

/** 
 * Updated by JCasGen Wed Dec 02 17:54:53 CET 2020
 * @generated */
public class TimeX3_Type extends Entity_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TimeX3.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
 
  /** @generated */
  final Feature casFeat_function_in_document;
  /** @generated */
  final int     casFeatCode_function_in_document;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getFunction_in_document(int addr) {
        if (featOkTst && casFeat_function_in_document == null)
      jcas.throwFeatMissing("function_in_document", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    return ll_cas.ll_getStringValue(addr, casFeatCode_function_in_document);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFunction_in_document(int addr, String v) {
        if (featOkTst && casFeat_function_in_document == null)
      jcas.throwFeatMissing("function_in_document", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    ll_cas.ll_setStringValue(addr, casFeatCode_function_in_document, v);}
    
  
 
  /** @generated */
  final Feature casFeat_temporal_function;
  /** @generated */
  final int     casFeatCode_temporal_function;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getTemporal_function(int addr) {
        if (featOkTst && casFeat_temporal_function == null)
      jcas.throwFeatMissing("temporal_function", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_temporal_function);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTemporal_function(int addr, boolean v) {
        if (featOkTst && casFeat_temporal_function == null)
      jcas.throwFeatMissing("temporal_function", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_temporal_function, v);}
    
  
 
  /** @generated */
  final Feature casFeat_value;
  /** @generated */
  final int     casFeatCode_value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getValue(int addr) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    return ll_cas.ll_getStringValue(addr, casFeatCode_value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, String v) {
        if (featOkTst && casFeat_value == null)
      jcas.throwFeatMissing("value", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    ll_cas.ll_setStringValue(addr, casFeatCode_value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_anchor_time_id;
  /** @generated */
  final int     casFeatCode_anchor_time_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnchor_time_id(int addr) {
        if (featOkTst && casFeat_anchor_time_id == null)
      jcas.throwFeatMissing("anchor_time_id", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    return ll_cas.ll_getRefValue(addr, casFeatCode_anchor_time_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnchor_time_id(int addr, int v) {
        if (featOkTst && casFeat_anchor_time_id == null)
      jcas.throwFeatMissing("anchor_time_id", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3");
    ll_cas.ll_setRefValue(addr, casFeatCode_anchor_time_id, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public TimeX3_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_function_in_document = jcas.getRequiredFeatureDE(casType, "function_in_document", "uima.cas.String", featOkTst);
    casFeatCode_function_in_document  = (null == casFeat_function_in_document) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_function_in_document).getCode();

 
    casFeat_temporal_function = jcas.getRequiredFeatureDE(casType, "temporal_function", "uima.cas.Boolean", featOkTst);
    casFeatCode_temporal_function  = (null == casFeat_temporal_function) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_temporal_function).getCode();

 
    casFeat_value = jcas.getRequiredFeatureDE(casType, "value", "uima.cas.String", featOkTst);
    casFeatCode_value  = (null == casFeat_value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_value).getCode();

 
    casFeat_anchor_time_id = jcas.getRequiredFeatureDE(casType, "anchor_time_id", "org.texttechnologylab.annotation.semaf.isotimeml.TimeX3", featOkTst);
    casFeatCode_anchor_time_id  = (null == casFeat_anchor_time_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_anchor_time_id).getCode();

  }
}



    