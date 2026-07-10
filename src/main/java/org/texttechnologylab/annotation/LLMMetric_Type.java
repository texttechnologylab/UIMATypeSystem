
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** L2SCA Output
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class LLMMetric_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LLMMetric.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.LLMMetric");
 
  /** @generated */
  final Feature casFeat_Value;
  /** @generated */
  final int     casFeatCode_Value;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getValue(int addr) {
        if (featOkTst && casFeat_Value == null)
      jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.LLMMetric");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, double v) {
        if (featOkTst && casFeat_Value == null)
      jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.LLMMetric");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_KeyName;
  /** @generated */
  final int     casFeatCode_KeyName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getKeyName(int addr) {
        if (featOkTst && casFeat_KeyName == null)
      jcas.throwFeatMissing("KeyName", "org.texttechnologylab.annotation.LLMMetric");
    return ll_cas.ll_getStringValue(addr, casFeatCode_KeyName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setKeyName(int addr, String v) {
        if (featOkTst && casFeat_KeyName == null)
      jcas.throwFeatMissing("KeyName", "org.texttechnologylab.annotation.LLMMetric");
    ll_cas.ll_setStringValue(addr, casFeatCode_KeyName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_definition;
  /** @generated */
  final int     casFeatCode_definition;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDefinition(int addr) {
        if (featOkTst && casFeat_definition == null)
      jcas.throwFeatMissing("definition", "org.texttechnologylab.annotation.LLMMetric");
    return ll_cas.ll_getStringValue(addr, casFeatCode_definition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDefinition(int addr, String v) {
        if (featOkTst && casFeat_definition == null)
      jcas.throwFeatMissing("definition", "org.texttechnologylab.annotation.LLMMetric");
    ll_cas.ll_setStringValue(addr, casFeatCode_definition, v);}
    
  
 
  /** @generated */
  final Feature casFeat_model;
  /** @generated */
  final int     casFeatCode_model;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getModel(int addr) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.LLMMetric");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.LLMMetric");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LLMMetric_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Value = jcas.getRequiredFeatureDE(casType, "Value", "uima.cas.Double", featOkTst);
    casFeatCode_Value  = (null == casFeat_Value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Value).getCode();

 
    casFeat_KeyName = jcas.getRequiredFeatureDE(casType, "KeyName", "uima.cas.String", featOkTst);
    casFeatCode_KeyName  = (null == casFeat_KeyName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_KeyName).getCode();

 
    casFeat_definition = jcas.getRequiredFeatureDE(casType, "definition", "uima.cas.String", featOkTst);
    casFeatCode_definition  = (null == casFeat_definition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_definition).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    